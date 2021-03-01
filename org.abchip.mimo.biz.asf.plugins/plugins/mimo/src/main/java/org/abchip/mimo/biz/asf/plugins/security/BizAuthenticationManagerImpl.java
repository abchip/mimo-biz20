/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.WeakHashMap;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.authentication.impl.AuthenticationManagerImpl;
import org.abchip.mimo.biz.model.entity.tenant.Tenant;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.service.security.CheckExternalLoginUser;
import org.abchip.mimo.biz.service.security.CheckExternalLoginUserResponse;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalId;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.core.http.HttpUtils;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.common.login.LoginServices;
import org.osgi.service.log.Logger;

public class BizAuthenticationManagerImpl extends AuthenticationManagerImpl {

	@Inject
	private Application application;

	private Map<String, Context> contextTenants = new WeakHashMap<String, Context>();

	private static final Logger LOGGER = Logs.getLogger(BizAuthenticationManagerImpl.class);

	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {
		try {
			ServiceManager serviceManager = application.getContext().getServiceManager();
			CheckExternalLoginUser checkExternalLoginUser = application.getContext().getServiceManager().prepare(CheckExternalLoginUser.class);
			checkExternalLoginUser.setProvider(authentication.getProvider());
			checkExternalLoginUser.setAccessToken(authentication.getAccessToken());

			Map<String, Object> userInfo = null;
			switch (authentication.getProvider()) {
			case "GitHub": {
				userInfo = HttpUtils.checkLoginGitHub(authentication);
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("avatar_url"));

				checkExternalLoginUser.setUserId((String) userInfo.get("email"));
				checkExternalLoginUser.setEmail((String) userInfo.get("email"));
				checkExternalLoginUser.setFirstName((String) userInfo.get("name"));
				checkExternalLoginUser.setLastName((String) userInfo.get("lastName"));
				break;
			}
			case "Google": {
				userInfo = HttpUtils.checkLoginGoogle(authentication);
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("picture"));

				checkExternalLoginUser.setUserId((String) userInfo.get("email"));
				checkExternalLoginUser.setEmail((String) userInfo.get("email"));
				checkExternalLoginUser.setFirstName((String) userInfo.get("given_name"));
				checkExternalLoginUser.setLastName((String) userInfo.get("family_name"));
				break;
			}
			case "LinkedIn": {
				userInfo = HttpUtils.checkLoginLinkedIn(authentication);
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("picture"));

				checkExternalLoginUser.setUserId((String) userInfo.get("email"));
				checkExternalLoginUser.setEmail((String) userInfo.get("email"));
				checkExternalLoginUser.setFirstName((String) userInfo.get("localizedFirstName"));
				checkExternalLoginUser.setLastName((String) userInfo.get("localizedLastName"));
				break;
			}
			default:
				LOGGER.audit("Unknown provider {} for user {}", authentication.getProvider(), authentication.getUser());
				return false;
			}

			CheckExternalLoginUserResponse response = serviceManager.execute(checkExternalLoginUser);
			if (response.onError())
				LOGGER.error(response.getErrorMessage());

			LOGGER.audit("CheckLogin success id {} user {} provider {}", authentication.getIdToken(), authentication.getUser(), authentication.getProvider());
		} catch (Exception e) {
			LOGGER.audit("Invalid check login provider {} for user {} message {}", authentication.getProvider(), authentication.getUser(), e.getMessage());
			return false;
		}

		return true;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException {

		AuthenticationUserPassword authenticationUserPassword = getExternalCredentials(authentication.getUser());

		ContextHandler context = this.login(contextId, authenticationUserPassword);

		context.getContext().getContextDescription().setPicture(authentication.getPicture());

		return context;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException {

		Context contextTenant = getContextTenant(authentication.getTenant());
		if (contextTenant == null)
			throw new AuthenticationException("Invalid context: " + authentication.getTenant());

		UserLogin userLogin = null;
		try {
			ResourceReader<UserLogin> userLoginReader = contextTenant.getResourceManager().getResourceReader(UserLogin.class);
			userLogin = userLoginReader.lookup(authentication.getUser());
		} catch (ResourceException e) {
			throw new AuthenticationException(e);
		}
		if (userLogin == null)
			throw new AuthenticationException("Invalid user: " + authentication.getUser());

		if (!LoginServices.checkPassword(userLogin.getCurrentPassword(), true, authentication.getPassword()))
			throw new AuthenticationException("Invalid password: " + authentication.getUser());

		// {SHA}47ca69ebb4bdc9ae0adec130880165d2cc05db1a
		// {SHA}47b56994cbc2b6d10aa1be30f70165adb305a41a

		// userLogin.getCurrentPassword().equals(SHA)

		ContextHandler contextHandler = application.getContext().createChildContext(contextId);
		Context contextUser = contextHandler.getContext();
		contextUser.getContextDescription().setUser(authentication.getUser());
		contextUser.getContextDescription().setTenant(authentication.getTenant());
		contextUser.getContextDescription().setCurrencyUom(userLogin.getLastCurrencyUom());
		if (userLogin.getLastLocale() != null)
			contextUser.getContextDescription().setLocale(userLogin.getLastLocale().replace("_", "-"));
		contextUser.getContextDescription().setTimeZone(userLogin.getLastTimeZone());

		contextUser.set(UserLogin.class, userLogin);

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

		// TODO
		try {
			contextUser.getResourceSet().getResource(Frame.class);
		} catch (ResourceException e) {
			throw new AuthenticationException(e);
		}

		return contextHandler;
	}

	@SuppressWarnings("resource")
	private Context getContextTenant(String tenantId) throws AuthenticationException {

		if (tenantId == null)
			return this.application.getContext();

		Context contextTenant = contextTenants.get(tenantId);
		if (contextTenant == null) {
			synchronized (contextTenants) {
				contextTenant = contextTenants.get(tenantId);
				if (contextTenant == null) {

					try {
						ResourceReader<Tenant> tenantReader = this.application.getContext().getResourceManager().getResourceReader(Tenant.class);
						Tenant tenant = tenantReader.lookup(tenantId);
						if (tenant == null)
							throw new AuthenticationException("Invalid tenant: " + tenantId);
					} catch (ResourceException e) {
						throw new AuthenticationException(e);
					}

					contextTenant = application.getContext().createChildContext(tenantId).getContext();
					contextTenant.getContextDescription().setTenant(tenantId);
					contextTenants.put(tenantId, contextTenant);
				}
			}
		}

		return contextTenant;
	}

	private AuthenticationUserPassword getExternalCredentials(String user) throws AuthenticationException {

		LOGGER.warn("Unsecure access to external credential for user {}", user);

		AuthenticationUserPassword authentication = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		try {
			ServiceManager serviceManager = application.getContext().getServiceManager();
			UserCredentialFromExternalId userCredentialFromExternalId = application.getContext().getServiceManager().prepare(UserCredentialFromExternalId.class);
			userCredentialFromExternalId.setUserId(user);
			UserCredentialFromExternalIdResponse response = serviceManager.execute(userCredentialFromExternalId);
			if (response.onError())
				LOGGER.error(response.getErrorMessage());

			authentication.setUser(response.getUser());
			authentication.setPassword(response.getPassword());

			LOGGER.audit("External credential success user {}", user);
		} catch (Exception e) {
			LOGGER.audit("Invalid get external credentials for user {} message", user, e.getMessage());
			throw new AuthenticationException(e);
		}

		return authentication;
	}

	public static MessageDigest getMessageDigest(String type) {
		try {
			return MessageDigest.getInstance(type);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Could not load digestor(" + type + ")", e);
		}
	}
}