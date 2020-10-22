/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.common.authentication.api.Authenticator;
import org.apache.ofbiz.common.authentication.api.AuthenticatorException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.service.LocalDispatcher;
import org.osgi.service.log.Logger;

public class OFBizAuthenticator implements Authenticator {

	private static final Logger LOGGER = Logs.getLogger(OFBizAuthenticator.class);

	private Delegator delegator;

	private Resource<UserLogin> userLoginResource;

	@Override
	public void initialize(LocalDispatcher dispatcher) {
		this.delegator = dispatcher.getDelegator();

		try {
			Context context = ContextUtils.getOrCreateContext(delegator.getDelegatorTenantId());
			this.userLoginResource = new OFBizResourceImpl<UserLogin>(context, delegator.getDelegatorTenantId(), context.getFrame(UserLogin.class));

		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
		}
	}

	@Override
	public boolean authenticate(String username, String password, boolean isServiceAuth) throws AuthenticatorException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void logout(String username) throws AuthenticatorException {
		// TODO Auto-generated method stub
		username.toString();
	}

	@Override
	public void syncUser(String username) throws AuthenticatorException {

		try {
			UserLogin userLogin = userLoginResource.lookup(username, null, false);
			if (userLogin == null) {
				userLogin = userLoginResource.make();
				userLogin.setEnabled(true);
				userLogin.setUserLoginId(username);
				userLoginResource.create(userLogin, false, true);
			}
		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
		}
	}

	@Override
	public void updatePassword(String username, String password, String newPassword) throws AuthenticatorException {
		// TODO Auto-generated method stub
		username.toString();
	}

	@Override
	public float getWeight() {
		return 0;
	}

	@Override
	public boolean isUserSynchronized() {
		return true;
	}

	@Override
	public boolean isSingleAuthenticator() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
}
