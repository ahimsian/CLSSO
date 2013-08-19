package com.cl.sso;

import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.servicelayer.model.ModelService;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;


/**
 * @author Aditi_Gupta07
 */
public class StorefrontAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler
{
	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws IOException, ServletException
	{
		/**
		 * Securities Last login Implementation.
		 * 
		 * **/
		final String username = authentication.getName();
		try
		{
			final User user = UserManager.getInstance().getUserByLogin(username);
			final UserModel userModel = getModelService().get(user);
			userModel.setLastLogin(new Date());
			getModelService().save(userModel);

			// response.sendRedirect(request.getContextPath() + "/index.zul");
			response.sendRedirect(request.getContextPath());
		}
		catch (final Exception e)
		{
			System.out.println(e.getMessage());
			response.sendRedirect(request.getContextPath());
		}

	}

	private ModelService getModelService()
	{
		return (ModelService) Registry.getApplicationContext().getBean("modelService");
	}

}
