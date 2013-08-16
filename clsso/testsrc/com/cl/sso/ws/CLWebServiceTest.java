/**
 * 
 */
package com.cl.sso.ws;

import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cl.sso.constants.ClssoConstants;
import com.cl.sso.ws.impl.CLWebServiceImpl;
import com.tl.ssows.ws.SSOwsResult;


/**
 * @author ahimsianshanmugalingam
 * 
 */
public class CLWebServiceTest extends HybrisJUnit4TransactionalTest
{
	/** Edit the local|project.properties to change logging behaviour (properties log4j.*). */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(CLWebServiceTest.class.getName());

	@Before
	public void setUp()
	{
		// implement here code executed before each test
	}

	@After
	public void tearDown()
	{
		// implement here code executed after each test
	}

	/**
	 * Test Cengage SSO Proxy Account
	 */
	@Test
	public void testProxyAccount()
	{
		final CLWebService webService = new CLWebServiceImpl();
		final SSOwsResult result = webService.getToken(ClssoConstants.PROXY_USER, ClssoConstants.PROXY_PASS);
		//final SSOwsResult result = webService.getToken("App_eComm_Hybris", "K6Ywkc3FTp");

		Assert.assertNotNull(result.getToken());
		System.out.println("====================");
		System.out.println("TOKEN: " + result.getToken());
		System.out.println("====================");
		Assert.assertEquals(0, result.getResultCode());
	}

	@Test
	public void testAddUser()
	{
		//TODO:
	}

	@Test
	public void testGetUser()
	{
		//TODO:
		final CLWebService webService = new CLWebServiceImpl();
		final String token = webService.getToken(ClssoConstants.PROXY_USER, ClssoConstants.PROXY_PASS).getToken();
		final SSOwsResult result = webService.getUser(token, null, "arvato_test", null);

		Assert.assertNotNull(result.getToken());
		System.out.println("====================");
		System.out.println("TOKEN: " + result.getToken());
		System.out.println("====================");
	}
}
