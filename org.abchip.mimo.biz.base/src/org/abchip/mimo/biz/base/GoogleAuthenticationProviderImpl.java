/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.UUID;

import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.biz.model.passport.OAuth2Google;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.Strings;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GoogleAuthenticationProviderImpl implements AuthenticationProvider {

	public static final String AUTHORIZE_URI = "https://accounts.google.com/o/oauth2/auth";
	public static final String DEFAULT_SCOPE = "openid email profile";

	public static final String TokenServiceUri = "https://oauth2.googleapis.com/token";

	public static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();

	@Override
	public String getRedirectLocation(Context context, String contextId) throws AuthenticationException {

		try {
			ResourceReader<OAuth2Google> oauth2Reader = context.getResourceManager().getResourceReader(OAuth2Google.class);
			OAuth2Google oauth2Google = oauth2Reader.first();

			if (oauth2Google == null)
				throw new AuthenticationException("Google provider not found");

			URIBuilder uri = new URIBuilder(AUTHORIZE_URI);
			uri.addParameter("client_id", oauth2Google.getClientId());
			uri.addParameter("redirect_uri", oauth2Google.getReturnUrl());
			uri.addParameter("response_type", "code");
			uri.addParameter("scope", DEFAULT_SCOPE);
			uri.addParameter("nonce", UUID.randomUUID().toString());
			uri.addParameter("state", contextId);

			return uri.build().toString();
		} catch (Exception e) {
			throw new AuthenticationException(e);
		}
	}

	@Override
	public AuthenticationUserToken checkAccessToken(Context context, String authorizationCode) throws AuthenticationException {

		if (Strings.isEmpty(authorizationCode))
			throw new AuthenticationException("Google failed to get authorization code");

		String accessToken = null;
		String idToken = null;

		try (CloseableHttpClient client = HttpClients.custom().build()) {

			ResourceReader<OAuth2Google> oauth2Reader = context.getResourceManager().getResourceReader(OAuth2Google.class);
			OAuth2Google oauth2Google = oauth2Reader.first();

			if (oauth2Google == null)
				throw new AuthenticationException("Google provider not found");

			URI uri = new URIBuilder(TokenServiceUri).setParameter("client_id", oauth2Google.getClientId()).setParameter("client_secret", oauth2Google.getClientSecret())
					.setParameter("grant_type", "authorization_code").setParameter("code", authorizationCode).setParameter("redirect_uri", oauth2Google.getReturnUrl()).build();

			HttpPost postMethod = new HttpPost(uri);
			postMethod.setConfig(StandardRequestConfig);
			postMethod.setHeader("Accept", "application/json");
			try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
				String responseString = new BasicResponseHandler().handleResponse(postResponse);
				if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
					HashMap<?, ?> userMap = new ObjectMapper().readValue(responseString, HashMap.class);
					accessToken = (String) userMap.get("access_token");
					idToken = (String) userMap.get("id_token");
					// Debug.logInfo("Generated Access Token : " + accessToken, module);
				} else {
					throw new AuthenticationException("Google get OAuth2 access token error");
				}
			}
		} catch (ResourceException | URISyntaxException | IOException e) {
			throw new AuthenticationException(e);
		}

		// checkLogin
		AuthenticationUserToken authenticationUserToken = AuthenticationFactory.eINSTANCE.createAuthenticationUserToken();
		authenticationUserToken.setIdToken(idToken);
		authenticationUserToken.setAccessToken(accessToken);
		authenticationUserToken.setProvider("Google");

		return authenticationUserToken;
	}
}