package com.cl.sso.providers;

import de.hybris.platform.core.Registry;
import de.hybris.platform.jalo.JaloConnection;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.user.UserManager;

import java.util.Arrays;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataAccessException;
import org.springframework.jms.connection.SessionProxy;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

import com.cl.sso.constants.ClssoConstants;
import com.cl.sso.tokens.CLSSOAuthenticationToken;
import com.cl.sso.ws.CLWebService;
import com.cl.sso.ws.impl.CLPerson;
import com.enterprisedt.util.debug.Logger;
import com.tl.ssows.ws.SSOwsResult;
import com.tl.ssows.ws.TLPerson;


public class CLSSOAuthenticationProvider implements AuthenticationProvider, InitializingBean, MessageSourceAware
{
	private UserDetailsService userDetailsService;
	private CLWebService ssoWebService;
	private SessionProxy sessionProxy;
	protected final UserDetailsChecker preAuthenticationCheks = new DefaultPreAuthenticationChecks();

	protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();

	private static final Logger LOG = Logger.getLogger(CLSSOAuthenticationProvider.class.getName());

	@Override
	public Authentication authenticate(final Authentication authentication) throws AuthenticationException
	{
		// TODO: login logic
		LOG.info("Entered CLSSOAuthenticationProvider");

		JaloSession.getCurrentSession().setAttribute("CLSSO_flag", "true");
		final CLSSOAuthenticationToken clssoAuthentication = (CLSSOAuthenticationToken) authentication;
		final String uid = clssoAuthentication.getUid();
		final boolean success = clssoAuthentication.isSuccess();
		LOG.info("Uid=" + uid + "; success=" + success);
		if (!success)
		{
			throw new BadCredentialsException(this.messages.getMessage("CoreAuthenticationProvider.badCredentials",
					"Bad credentials"));
		}
		if (Registry.hasCurrentTenant() && JaloConnection.getInstance().isSystemInitialized())
		{
			UserDetails userDetails = null;
			try
			{
				userDetails = getUserDetails(uid);
			}
			catch (final BadCredentialsException badCredentials)
			{
				LOG.error("Bad Credentials " + badCredentials.getMessage());

				throw badCredentials;
			}
			catch (final UsernameNotFoundException userNotFound)
			{
				LOG.error("User account does not exist " + userNotFound.getMessage());
				throw userNotFound;
			}

			// TODO:
			preAuthenticationCheks.check(userDetails);

			final de.hybris.platform.jalo.user.User user = UserManager.getInstance().getUserByLogin(uid);
			JaloSession.getCurrentSession().setUser(user);
			return createSuccessAuthentication(authentication, userDetails);
		}

		return createFailureAuthentication(authentication);
	}

	public class DefaultPreAuthenticationChecks implements UserDetailsChecker
	{
		public void check(final UserDetails user)
		{
			if (!(user.isEnabled()))
			{
				//sessionProxy.getSession().setUser(null);
				LOG.error("User account is disabled");
				throw new DisabledException(messages.getMessage("CoreAuthenticationProvider.disabled", "User is disabled"), user);
			}
		}
	}

	protected Authentication createSuccessAuthentication(final Authentication authentication, final UserDetails user)
	{
		final CLSSOAuthenticationToken result = new CLSSOAuthenticationToken(user.getUsername(), true, user.getAuthorities());
		result.setDetails(authentication.getDetails());

		return result;
	}

	protected Authentication createFailureAuthentication(final Authentication authentication)
	{
		final CLSSOAuthenticationToken result = new CLSSOAuthenticationToken(null, false, Arrays.asList(new GrantedAuthority[0]));
		result.setDetails(authentication.getDetails());

		return result;
	}

	protected final UserDetails getUserDetails(final String username) throws AuthenticationException
	{
		final CLPerson userDetails = new CLPerson();
		try
		{
			//userDetails = getUserDetailsService().loadUserByUsername(username);
			// TODO: change. quick hack.
			final String token = getSsoWebService().getToken(ClssoConstants.PROXY_USER, ClssoConstants.PROXY_PASS).getToken();
			final SSOwsResult result = getSsoWebService().getUser(token, null, username, null);

			if (result.getToken() != null)
			{
				//TODO: created to catch breakpoint. remove after.
			}

			final TLPerson person = result.getUsers().getTLPerson().get(0);
			userDetails.setUserType(person.getUid());
			userDetails.setUserPassword(person.getUid());

		}
		catch (final UsernameNotFoundException userNotFound)
		{
			throw userNotFound;
		}
		catch (final DataAccessException dataAccessException)
		{
			throw new BadCredentialsException(this.messages.getMessage("CoreAuthenticationProvider.badCredentials",
					"Bad credentials"));
		}
		return userDetails;
	}

	public UserDetailsService getUserDetailsService()
	{
		return this.userDetailsService;
	}

	public CLWebService getSsoWebService()
	{
		return this.ssoWebService;
	}

	@Override
	public void setMessageSource(final MessageSource messageSource)
	{
		this.messages = new MessageSourceAccessor(messageSource);
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		Assert.notNull(this.userDetailsService, "A UserDetailsService must be set");
	}

	@Override
	public boolean supports(final Class authentication)
	{
		return (RememberMeAuthenticationToken.class.isAssignableFrom(authentication))
				|| (CLSSOAuthenticationToken.class.isAssignableFrom(authentication));
	}

	public void setSessionProxy(final SessionProxy sessionProxy)
	{
		this.sessionProxy = sessionProxy;
	}

	@Required
	public void setUserDetailsService(final UserDetailsService userDetailsService)
	{
		this.userDetailsService = userDetailsService;
	}

	@Required
	public void setSsoWebService(final CLWebService ssoWebService)
	{
		this.ssoWebService = ssoWebService;
	}
}
