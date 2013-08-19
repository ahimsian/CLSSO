package com.cl.sso;

import de.hybris.platform.util.Config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.cl.sso.tokens.CLSSOAuthenticationToken;


public class CLSSOAuthenticationFilter extends AbstractAuthenticationProcessingFilter
{

	private static final Logger LOG = Logger.getLogger(CLSSOAuthenticationFilter.class.getName());

	private static final String CLSSOURL = Config.getString("CLSSO_URL", "");

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
		final CLSSOAuthenticationToken authRequest = new CLSSOAuthenticationToken(username, success);

		return this.getAuthenticationManager().authenticate(authRequest);
	}

	// Hack to always require authentication
	@Override
	protected boolean requiresAuthentication(final javax.servlet.http.HttpServletRequest request,
			final javax.servlet.http.HttpServletResponse response)
	{
		return true;
	}

}
