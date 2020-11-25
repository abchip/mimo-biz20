/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
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
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;

public class BizAuthenticationManagerImpl implements AuthenticationManager {

	@Inject
	private Application application;

	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationAnonymous authentication) throws AuthenticationException {
		return null;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException {

		UserLogin userLogin = null;
		try {
			ResourceReader<UserLogin> userLoginReader = application.getContext().getResourceManager().getResourceReader(UserLogin.class, authentication.getTenant());
			userLogin = userLoginReader.lookup(authentication.getUser());
		} catch (ResourceException e) {
			throw new AuthenticationException(e);
		}
		if (userLogin == null)
			throw new AuthenticationException("Invalid user");

		// TODO compare password and SHA
		// userLogin.getCurrentPassword().equals(SHA)

		ContextHandler contextHandler = application.getContext().createChildContext(contextId);
		Context contextUser = contextHandler.getContext();
		contextUser.getContextDescription().setUser(authentication.getUser());
		contextUser.getContextDescription().setTenant(authentication.getTenant());
		contextUser.getContextDescription().setCurrencyUom(userLogin.getLastCurrencyUom());
		if (userLogin.getLastLocale() != null)
			contextUser.getContextDescription().setLocale(userLogin.getLastLocale().replace("_", "-"));
		contextUser.getContextDescription().setTimeZone(userLogin.getLastTimeZone());

		return contextHandler;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationAdminKey authentication) throws AuthenticationException {

		if (application.getAdminKey() != null && !authentication.getAdminKey().equals(application.getAdminKey()))
			throw new AuthenticationException("Invalid adminKey");

		ContextHandler contextHandler = application.getContext().createChildContext(contextId);
		Context contextUser = contextHandler.getContext();
		contextUser.getContextDescription().setUser(application.getContextDescription().getUser());
		contextUser.getContextDescription().setTenant(authentication.getTenant());

		return contextHandler;
	}
}