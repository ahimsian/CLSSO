package com.cl.sso.tokens;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;


/**
 * @author Aditi_Gupta07
 * 
 */
public class CLSSOAuthenticationToken extends AbstractAuthenticationToken
{


	private static final long serialVersionUID = 1L;
	private final String uid;
	private final boolean success;

	public CLSSOAuthenticationToken(final String uid, final boolean success)
	{
		super(null);
		this.uid = uid;
		this.success = success;
	}

	public CLSSOAuthenticationToken(final String uid, final boolean success,
			final Collection<? extends GrantedAuthority> collection)
	{
		super(collection);
		this.uid = uid;
		this.success = success;
		super.setAuthenticated(success);
	}


	public String getUid()
	{
		return uid;
	}

	public boolean isSuccess()
	{
		return success;
	}


	public Object getCredentials()
	{
		return this.uid;
	}

	public Object getPrincipal()
	{
		return this.uid;
	}


}
