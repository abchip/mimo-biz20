package org.abchip.mimo.biz.base;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class AuthenticationManagerImpl implements AuthenticationManager {

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
	public ContextProvider login(String contextId, AuthenticationAnonymous authentication) throws AuthenticationException {
		return null;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException {

		UserLogin userLogin = null;
		try {
			ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(application.getContext(), UserLogin.class, authentication.getTenant());
			userLogin = userLoginReader.lookup(authentication.getUser());
		} catch (ResourceException e) {
			throw new AuthenticationException(e);
		}
		if (userLogin == null)
			throw new AuthenticationException("Invalid user");

		// TODO compare password and SHA
		// userLogin.getCurrentPassword().equals(SHA)

		ContextProvider contextProvider = application.getContext().createChildContext(contextId);
		Context contextUser = contextProvider.get();
		contextUser.getContextDescription().setUser(authentication.getUser());
		contextUser.getContextDescription().setTenant(authentication.getTenant());
		contextUser.getContextDescription().setCurrencyUom(userLogin.getLastCurrencyUom());
		if (userLogin.getLastLocale() != null)
			contextUser.getContextDescription().setLocale(userLogin.getLastLocale().replace("_", "-"));
		contextUser.getContextDescription().setTimeZone(userLogin.getLastTimeZone());

		return contextProvider;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationAdminKey authentication) throws AuthenticationException {

		if (application.getAdminKey() != null && !authentication.getAdminKey().equals(application.getAdminKey()))
			throw new AuthenticationException("Invalid adminKey");

		ContextRoot contextRoot = application.getContext();
		if (contextRoot == null)
			return null;

		ContextProvider contextUser = contextRoot.createChildContext(contextId);
		contextUser.get().getContextDescription().setTenant(authentication.getTenant());
		return contextUser;
	}
}