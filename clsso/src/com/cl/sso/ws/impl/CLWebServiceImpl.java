/**
 * 
 */
package com.cl.sso.ws.impl;

import com.cl.sso.ws.CLWebService;
import com.thomsonlearning.ws._80.ssows.SSOws;
import com.thomsonlearning.ws._80.ssows.SSOwsPort;
import com.tl.ssows.ws.AddUserParameters;
import com.tl.ssows.ws.GetTokenParameters;
import com.tl.ssows.ws.GetUserParameters;
import com.tl.ssows.ws.ModifyUserParameters;
import com.tl.ssows.ws.SSOwsResult;
import com.tl.ssows.ws.TLPerson;


/**
 * @author ahimsianshanmugalingam
 */

// TODO: use clssoWebService instead of service.getSSOwsPort() in methods
// TODO: incorporate Spring Security
public class CLWebServiceImpl implements CLWebService
{
	/*** Spring injection ***/
	private SSOwsPort clssoWebService;

	public void setClssoWebService(final SSOwsPort clssoWebService)
	{
		this.clssoWebService = clssoWebService;
	}

	/*** END ***/


	/*** use Spring injected variable and DELETE? ***/
	private final SSOws service;

	public CLWebServiceImpl()
	{
		this.service = new SSOws();
	}

	/*** END ***/


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cl.sso.ws.CLWebService#getToken(java.lang.String, java.lang.String)
	 */
	@Override
	public SSOwsResult getToken(final String uid, final String password)
	{
		final GetTokenParameters param = new GetTokenParameters();
		param.setPassword(password);
		param.setUid(uid);

		return service.getSSOwsPort().getToken(param);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cl.sso.ws.CLWebService#getTokenFromGuid(java.lang.String, java.lang.String)
	 */
	@Override
	public SSOwsResult getTokenFromGuid(final String token, final String guid)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cl.sso.ws.CLWebService#addUser(java.lang.String, com.cl.sso.ws.impl.CLPerson)
	 */
	@Override
	public SSOwsResult addUser(final String token, final CLPerson person)
	{
		final AddUserParameters param = new AddUserParameters();
		param.setToken(token);
		param.setPerson(person);

		return service.getSSOwsPort().addUser(param);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cl.sso.ws.CLWebService#getUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public SSOwsResult getUser(final String token, final String guid, final String uid, final String returnGroups)
	{
		final GetUserParameters param = new GetUserParameters();
		param.setToken(token);
		param.setGuid(guid);
		param.setUid(uid);
		param.setReturnGroups(returnGroups);

		return service.getSSOwsPort().getUser(param);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cl.sso.ws.CLWebService#modifyEmail(java.lang.String, com.cl.sso.ws.impl.CLPerson, java.lang.String)
	 */
	@Override
	public SSOwsResult modifyName(final String token, final String personUid, final String fName, final String lName)
	{
		final TLPerson person = getUser(token, null, personUid, null).getUsers().getTLPerson().get(0);

		final ModifyUserParameters param = new ModifyUserParameters();
		param.setGuid(person.getGuid());
		param.setUid(person.getUid());
		param.setToken(token);

		// modify user email before adding
		person.setGivenName(fName);
		person.setSn(lName);

		param.setPerson(person);

		return service.getSSOwsPort().modifyUser(param);
	}
}
