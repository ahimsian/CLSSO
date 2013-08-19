package com.cl.sso;

import de.hybris.platform.util.Config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.RememberMeServices;

import com.cl.sso.tokens.CLSSOAuthenticationToken;


public class CLSSOAuthenticationFilter extends AbstractAuthenticationProcessingFilter
{

	private static final Logger LOG = Logger.getLogger(CLSSOAuthenticationFilter.class.getName());

	private static final String CLSSOURL = Config.getString("CLSSO_URL", "");

	public static final String SECURE_GUID_SESSION_KEY = "acceleratorSecureGUID";

	private AuthenticationManager authenticationManager;
	//private GUIDCookieStrategy guidCookieStrategy;
	private RememberMeServices rememberMeServices;

	protected CLSSOAuthenticationFilter()
	{
		super(CLSSOURL);
	}

	@Override
	public Authentication attemptAuthentication(final HttpServletRequest request, final HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException
	{
		// j_username is html attribute
		final String username = request.getParameter("j_username");
		LOG.info("CLSSOAuthenticaionFilter j_username = " + username);

		final boolean success = true;
		//final boolean success = Boolean.parseBoolean(successStr);
		final CLSSOAuthenticationToken token = new CLSSOAuthenticationToken(username, success);

		final Authentication authentication = getAuthenticationManager().authenticate(token);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		getRememberMeServices().loginSuccess(request, response, token);

		return authentication;

		/*
		 * final Authentication authentication = getAuthenticationManager().authenticate(authRequest);
		 * SecurityContextHolder.getContext().setAuthentication(authentication); getCustomerFacade().loginSuccess();
		 * getGuidCookieStrategy().setCookie(request, response); getRememberMeServices().loginSuccess(request, response,
		 * token);
		 * 
		 * return authentication;
		 */
	}

	// Hack to always require authentication
	@Override
	protected boolean requiresAuthentication(final javax.servlet.http.HttpServletRequest request,
			final javax.servlet.http.HttpServletResponse response)
	{
		return true;
	}

}
