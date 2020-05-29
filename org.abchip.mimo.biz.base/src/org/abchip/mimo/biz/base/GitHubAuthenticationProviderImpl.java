/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.biz.model.passport.OAuth2GitHub;
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

public class GitHubAuthenticationProviderImpl implements AuthenticationProvider {

	public static final String AUTHORIZE_URI = "https://github.com/login/oauth/authorize";
	public static final String DEFAULT_SCOPE = "user,gist,user:email";

	public static final String TokenServiceUri = "https://github.com/login/oauth/access_token";

	public static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();

	@Override
	public String getRedirectLocation(Context context, String contextId) throws AuthenticationException {

		try {
			ResourceReader<OAuth2GitHub> oauth2Reader = context.getResourceManager().getResourceReader(OAuth2GitHub.class);
			OAuth2GitHub oauth2GitHub = oauth2Reader.first();

			if (oauth2GitHub == null)
				throw new AuthenticationException("GitHub provider not found");

			URIBuilder uri = new URIBuilder(AUTHORIZE_URI);
			uri.addParameter("client_id", oauth2GitHub.getClientId());
			uri.addParameter("redirect_uri", oauth2GitHub.getReturnUrl());
			// uri.addParameter("response_type", "code");
			uri.addParameter("scope", DEFAULT_SCOPE);
			uri.addParameter("state", contextId);

			return uri.build().toString();
		} catch (Exception e) {
			throw new AuthenticationException(e);
		}
	}

	@Override
	public AuthenticationUserToken checkAccessToken(Context context, String authorizationCode) throws AuthenticationException {

		if (Strings.isEmpty(authorizationCode))
			throw new AuthenticationException("GitHub failed to get authorization code");

		String accessToken = null;
		String idToken = null;

		try (CloseableHttpClient client = HttpClients.custom().build()) {

			ResourceReader<OAuth2GitHub> oauth2Reader = context.getResourceManager().getResourceReader(OAuth2GitHub.class);
			OAuth2GitHub oauth2GitHub = oauth2Reader.first();

			if (oauth2GitHub == null)
				throw new AuthenticationException("GitHub provider not found");

			URI uri = new URIBuilder(TokenServiceUri).setParameter("client_id", oauth2GitHub.getClientId()).setParameter("client_secret", oauth2GitHub.getClientSecret())
					.setParameter("grant_type", "authorization_code").setParameter("code", authorizationCode).setParameter("redirect_uri", oauth2GitHub.getReturnUrl()).build();

			HttpPost postMethod = new HttpPost(uri);
			postMethod.setConfig(StandardRequestConfig);
			postMethod.setHeader("Accept", "application/json");
			try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
				String responseString = new BasicResponseHandler().handleResponse(postResponse);
				if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
					HashMap<?, ?> userMap = new ObjectMapper().readValue(responseString, HashMap.class);
					accessToken = (String) userMap.get("access_token");
					idToken = (String) userMap.get("token_type");
					// Debug.logInfo("Generated Access Token : " + accessToken, module);
				} else {
					throw new AuthenticationException("GitHub get OAuth2 access token error");
				}
			}
		} catch (ResourceException | URISyntaxException | IOException e) {
			throw new AuthenticationException(e);
		}

		// checkLogin
		AuthenticationUserToken authenticationUserToken = AuthenticationFactory.eINSTANCE.createAuthenticationUserToken();
		authenticationUserToken.setIdToken(idToken);
		authenticationUserToken.setAccessToken(accessToken);
		authenticationUserToken.setProvider("GitHub");

		return authenticationUserToken;
		
	}
}