package org.abchip.mimo.biz.base;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.context.AuthenticationAdminKey;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class BizAuthenticationManagerImpl implements AuthenticationManager {

	@Inject
	private Application application;
	@Inject
	private ResourceManager resourceManager;

	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Context login(String contextId, AuthenticationAnonymous authentication) {
		return null;
	}

	@Override
	public Context login(String contextId, AuthenticationUserPassword authentication) {

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(application.getContext(), UserLogin.class, authentication.getTenant());
		UserLogin userLogin = userLoginReader.lookup(authentication.getUser());
		if (userLogin == null)
			return null;

		// TODO compare password and SHA
		// userLogin.getCurrentPassword().equals(SHA)

		Context contextUser = application.getContext().createChildContext(contextId);
		contextUser.getContextDescription().setUser(authentication.getUser());
		contextUser.getContextDescription().setTenant(authentication.getTenant());
		contextUser.getContextDescription().setCurrencyUom(userLogin.getLastCurrencyUom());
		if (userLogin.getLastLocale() != null)
			contextUser.getContextDescription().setLocale(userLogin.getLastLocale().replace("_", "-"));
		contextUser.getContextDescription().setTimeZone(userLogin.getLastTimeZone());

		return contextUser;
	}

	@Override
	public Context login(String contextId, AuthenticationUserToken authentication) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("resource")
	@Override
	public Context login(String contextId, AuthenticationAdminKey authentication) {

		if (application.getAdminKey() != null && !authentication.getAdminKey().equals(application.getAdminKey()))
			return null;

		ContextRoot contextRoot = application.getContext();
		if (contextRoot == null)
			return null;

		Context contextUser = contextRoot.createChildContext(contextId);
		return contextUser;
	}
}