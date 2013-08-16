/**
 * 
 */
package com.cl.sso.ws;

import com.cl.sso.ws.impl.CLPerson;
import com.tl.ssows.ws.SSOwsResult;


/**
 * @author ahimsianshanmugalingam
 * 
 */
public interface CLWebService
{

	/**
	 * Attempts to bind to the OID LDAP instance with the userId and password parameters. If the bind is successful, a
	 * valid token is added to the result object to be returned to the client
	 * 
	 * @param uid
	 * @param password
	 * 
	 * @return
	 */
	public SSOwsResult getToken(String uid, String password);

	/**
	 * If the token is valid and has not expired, the user is looked up by guid. If a user is found, a token is generated
	 * for the user and returned in the result. The branch designator will also be populated accordingly.
	 * 
	 * @param token
	 * @param guid
	 * 
	 * @return
	 */
	public SSOwsResult getTokenFromGuid(String token, String guid);

	/**
	 * If the token is valid and has not expired, a request to create a new person object is executed. The request will
	 * fail if another person object already exists with a uid attribute populated with the same value as the uid
	 * attribute of the person object passed in.
	 * 
	 * @param token
	 * @param person
	 * 
	 * @return
	 */
	public SSOwsResult addUser(String token, CLPerson person);

	/**
	 * If the token is valid and has not expired and either uid or guid are passed, a search is executed for a person
	 * object with the given userId or guid. If a uid is passed, the search will be limited to the CL people branch of
	 * the directory. If only token was passed, search is executed for the user corresponding to the token. Only one
	 * person object will ever be returned in the userArray due to the uniqueness constraint on userId within OID.
	 * 
	 * @param token
	 * @param guid
	 * @param uid
	 * @param returnGroups
	 * 
	 * @return
	 */
	public SSOwsResult getUser(String token, String guid, String uid, String returnGroups);
}
