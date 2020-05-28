/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base;

import java.util.UUID;

import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.biz.model.passport.OAuth2Google;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceReader;
import org.apache.http.client.utils.URIBuilder;

public class GoogleAuthenticationProviderImpl implements AuthenticationProvider {

	public static final String AUTHORIZE_URI = "https://accounts.google.com/o/oauth2/auth";
	public static final String DEFAULT_SCOPE = "openid email profile";

	@Override
	public String getRedirectLocation(Context context) throws AuthenticationException {

		try {
			ResourceReader<OAuth2Google> oauth2Reader = context.getResourceManager().getResourceReader(OAuth2Google.class);
			OAuth2Google oauth2Google = oauth2Reader.first();

			if (oauth2Google == null) {
				throw new AuthenticationException("Google provider not found");
			}

			URIBuilder uri = new URIBuilder(AUTHORIZE_URI);
			uri.addParameter("client_id", oauth2Google.getClientId());
			uri.addParameter("redirect_uri", oauth2Google.getReturnUrl());
			uri.addParameter("response_type", "code");
			uri.addParameter("scope", DEFAULT_SCOPE);
			uri.addParameter("nonce", UUID.randomUUID().toString());
			uri.addParameter("state", context.getContextDescription().getId());

			return uri.build().toString();
		} catch (Exception e) {
			throw new AuthenticationException(e);
		}
	}
}