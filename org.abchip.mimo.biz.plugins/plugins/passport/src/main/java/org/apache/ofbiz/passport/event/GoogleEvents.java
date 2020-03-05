/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.apache.ofbiz.passport.event;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.ofbiz.base.conversion.ConversionException;
import org.apache.ofbiz.base.conversion.JSONConverters.JSONToMap;
import org.apache.ofbiz.base.crypto.HashCrypt;
import org.apache.ofbiz.base.lang.JSON;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilHttp;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.base.util.UtilProperties;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.common.authentication.api.AuthenticatorException;
import org.apache.ofbiz.common.login.LoginServices;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.entity.util.EntityUtilProperties;
import org.apache.ofbiz.passport.user.GoogleAuthenticator;
import org.apache.ofbiz.passport.util.PassportUtil;
import org.apache.ofbiz.product.store.ProductStoreWorker;
import org.apache.ofbiz.service.LocalDispatcher;
import org.xml.sax.SAXException;

/**
 * GoogleEvents - Events for Google login.
 * 
 * Refs: https://developers.google.com/sheets/api/guides/authorizing
 * 
 */
public class GoogleEvents {

    public static final String module = GoogleEvents.class.getName();

    public static final String resource = "PassportUiLabels";

    public static final String AuthorizeUri = "https://accounts.google.com/o/oauth2/auth";
    
    public static final String TokenServiceUri = "https://oauth2.googleapis.com/token";

    public static final String DEFAULT_SCOPE = "openid%20email%20profile";
    
    public static final String SESSION_GOOGLE_STATE = "_GOOGLE_STATE_";

    public static final String envPrefix = UtilProperties.getPropertyValue(GoogleAuthenticator.props, "google.env.prefix", "test");

    /**
     * Redirect to Google login page.
     * 
     * @return 
     */
    public static String googleRedirect(HttpServletRequest request, HttpServletResponse response) {
        GenericValue oauth2Google = getOAuth2GoogleConfig(request);
        if (UtilValidate.isEmpty(oauth2Google)) {
            return "error";
        }
        
        String clientId = oauth2Google.getString(PassportUtil.COMMON_CLIENT_ID);
        String returnURI = oauth2Google.getString("returnUrl");
        
        // Get user authorization code
        try {
            String state = System.currentTimeMillis() + String.valueOf((new Random(10)).nextLong());
            request.getSession().setAttribute(SESSION_GOOGLE_STATE, state);
            String redirectUrl = AuthorizeUri
                    + "?client_id=" + clientId
                    + "&response_type=code"
                    + "&scope=" + DEFAULT_SCOPE
                    + "&redirect_uri=" + URLEncoder.encode(returnURI, "UTF-8");
            response.sendRedirect(redirectUrl);
        } catch (NullPointerException e) {
            String errMsg = UtilProperties.getMessage(resource, "GoogleRedirectToOAuth2NullException", UtilHttp.getLocale(request));
            request.setAttribute("_ERROR_MESSAGE_", errMsg);
            return "error";
        } catch (IOException e) {
            Map<String, String> messageMap = UtilMisc.toMap("errorMessage", e.toString());
            String errMsg = UtilProperties.getMessage(resource, "GoogleRedirectToOAuth2Error", messageMap, UtilHttp.getLocale(request));
            request.setAttribute("_ERROR_MESSAGE_", errMsg);
            return "error";
        }
        
        return "success";
    }

    /**
     * Parse Google login response and login the user if possible.
     * 
     * @return 
     */
    public static String parseGoogleResponse(HttpServletRequest request, HttpServletResponse response) {
        String authorizationCode = request.getParameter(PassportUtil.COMMON_CODE);
/*
        String state = request.getParameter(PassportUtil.COMMON_STATE);
        if (!state.equals(request.getSession().getAttribute(SESSION_GOOGLE_STATE))) {
            String errMsg = UtilProperties.getMessage(resource, "GoogleFailedToMatchState", UtilHttp.getLocale(request));
            request.setAttribute("_ERROR_MESSAGE_", errMsg);
            return "error";
        }
*/
        if (UtilValidate.isEmpty(authorizationCode)) {
            String error = request.getParameter(PassportUtil.COMMON_ERROR);
            String errorDescpriton = request.getParameter(PassportUtil.COMMON_ERROR_DESCRIPTION);
            String errMsg = null;
            try {
                errMsg = UtilProperties.getMessage(resource, "GoogleFailedToGetAuthorizationCode", UtilMisc.toMap(PassportUtil.COMMON_ERROR, error, PassportUtil.COMMON_ERROR_DESCRIPTION, URLDecoder.decode(errorDescpriton, "UTF-8")), UtilHttp.getLocale(request));
            } catch (UnsupportedEncodingException e) {
                errMsg = UtilProperties.getMessage(resource, "GoogleGetAuthorizationCodeError", UtilHttp.getLocale(request));
            }
            request.setAttribute("_ERROR_MESSAGE_", errMsg);
            return "error";
        }
        // Debug.logInfo("Google authorization code: " + authorizationCode, module);
        
        GenericValue oauth2Google = getOAuth2GoogleConfig(request);
        if (UtilValidate.isEmpty(oauth2Google)) {
            String errMsg = UtilProperties.getMessage(resource, "GoogleGetOAuth2ConfigError", UtilHttp.getLocale(request));
            request.setAttribute("_ERROR_MESSAGE_", errMsg);
            return "error";
        }
        
        String clientId = oauth2Google.getString(PassportUtil.COMMON_CLIENT_ID);
        String returnURI = oauth2Google.getString("returnUrl");
        
        String secret = oauth2Google.getString(PassportUtil.COMMON_CLIENT_SECRET);
        
        // Grant token from authorization code and oauth2 token
        // Use the authorization code to obtain an access token
        String accessToken = null;
        String idToken = null;
        
        try {
            URI uri = new URIBuilder()
//                    .setScheme(TokenServiceUri.substring(0, TokenServiceUri.indexOf(":")))
//                    .setHost(TokenServiceUri.substring(TokenServiceUri.indexOf(":") + 3))
                    .setPath(TokenServiceUri)
                    .setParameter("client_id", clientId)
                    .setParameter("client_secret", secret)
                    .setParameter("grant_type", "authorization_code")
                    .setParameter("code", authorizationCode)
                    .setParameter("redirect_uri", returnURI)
                    .build();

            HttpPost postMethod = new HttpPost(uri);
            CloseableHttpClient jsonClient = HttpClients.custom().build();
            // Debug.logInfo("Google get access token query string: " + postMethod.getURI(), module);
            postMethod.setConfig(PassportUtil.StandardRequestConfig);
            CloseableHttpResponse postResponse = jsonClient.execute(postMethod);
            String responseString = new BasicResponseHandler().handleResponse(postResponse);
            // Debug.logInfo("Google get access token response code: " + postResponse.getStatusLine().getStatusCode(), module);
            // Debug.logInfo("Google get access token response content: " + responseString, module);
            if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // Debug.logInfo("Json Response from Google: " + responseString, module);
                JSON jsonObject = JSON.from(responseString);
                JSONToMap jsonMap = new JSONToMap();
                Map<String, Object> userMap = jsonMap.convert(jsonObject);
                accessToken = (String) userMap.get("access_token");
                idToken = (String) userMap.get("id_token");
                // Debug.logInfo("Generated Access Token : " + accessToken, module);
            } else {
                String errMsg = UtilProperties.getMessage(resource, "GoogleGetOAuth2AccessTokenError", UtilMisc.toMap("error", responseString), UtilHttp.getLocale(request));
                request.setAttribute("_ERROR_MESSAGE_", errMsg);
                return "error";
            }
        } catch (UnsupportedEncodingException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (IOException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (ConversionException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (URISyntaxException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
		}
        
        
        // Get User Profile
        Map<String, Object> userInfo = null;
//        HttpGet getMethod = new HttpGet("https://www.googleapis.com/oauth2/v3/userinfo?id_token=" + accessToken);
//        HttpGet getMethod = new HttpGet("https://www.googleapis.com/oauth2/v3/tokeninfo?id_token=" + accessToken);
//        HttpGet getMethod = new HttpGet("https://www.googleapis.com/oauth2/v3/userinfo?access_token=" + accessToken);
//        HttpGet getMethod = new HttpGet("https://www.googleapis.com/auth/userinfo.email?access_token=" + accessToken);
        HttpGet getMethod = new HttpGet("https://oauth2.googleapis.com/tokeninfo?id_token=" + idToken);

        try {
            userInfo = GoogleAuthenticator.getUserInfo(getMethod, UtilHttp.getLocale(request));
        } catch (IOException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (AuthenticatorException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (SAXException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (ParserConfigurationException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } finally {
            getMethod.releaseConnection();
        }
        // Debug.logInfo("Google User Info:" + userInfo, module);
        
        // Store the user info and check login the user
        return checkLoginGoogleUser(request, userInfo, accessToken);
    }

    private static String checkLoginGoogleUser(HttpServletRequest request, Map<String, Object> userInfo, String accessToken) {
        Delegator delegator = (Delegator) request.getAttribute("delegator");
        LocalDispatcher dispatcher = (LocalDispatcher) request.getAttribute("dispatcher");
        String productStoreId = ProductStoreWorker.getProductStoreId(request);
        String googleUserId = GoogleAuthenticator.getGoogleUserId(userInfo);
        GenericValue googleUser = null;
        try {
            googleUser = EntityQuery.use(delegator).from("GoogleUser").where("googleUserId", googleUserId).queryOne();
        } catch (GenericEntityException e) {
            request.setAttribute("_ERROR_MESSAGE_", e.getMessage());
            return "error";
        }
        if (googleUser != null) {
            boolean dataChanged = false;
            if (!accessToken.equals(googleUser.getString("accessToken"))) {
                googleUser.set("accessToken", accessToken);
                dataChanged = true;
            }
            if (!envPrefix.equals(googleUser.getString("envPrefix"))) {
                googleUser.set("envPrefix", envPrefix);
                dataChanged = true;
            }
            if (!productStoreId.equals(googleUser.getString("productStoreId"))) {
                googleUser.set("productStoreId", productStoreId);
                dataChanged = true;
            }
            if (dataChanged) {
                try {
                    googleUser.store();
                } catch (GenericEntityException e) {
                    Debug.logError(e.getMessage(), module);
                }
            }
        } else {
            googleUser = delegator.makeValue("GoogleUser", UtilMisc.toMap("accessToken", accessToken, 
                                                                          "productStoreId", productStoreId, 
                                                                          "envPrefix", envPrefix, 
                                                                          "googleUserId", googleUserId));
            try {
                googleUser.create();
            } catch (GenericEntityException e) {
                Debug.logError(e.getMessage(), module);
            }
        }
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", googleUserId).queryFirst();
            GoogleAuthenticator authn = new GoogleAuthenticator();
            authn.initialize(dispatcher);
            if (UtilValidate.isEmpty(userLogin)) {
                String userLoginId = authn.createUser(userInfo);
                userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            }
            String autoPassword = RandomStringUtils.randomAlphanumeric(EntityUtilProperties.getPropertyAsInteger("security", "password.length.min", 5));
            boolean useEncryption = "true".equals(UtilProperties.getPropertyValue("security", "password.encrypt"));
            userLogin.set("currentPassword", useEncryption ? HashCrypt.digestHash(LoginServices.getHashType(), null, autoPassword) : autoPassword);
            userLogin.store();
            request.setAttribute("USERNAME", userLogin.getString("userLoginId"));
            request.setAttribute("PASSWORD", autoPassword);
        } catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        } catch (AuthenticatorException e) {
            Debug.logError(e.getMessage(), module);
            request.setAttribute("_ERROR_MESSAGE_", e.toString());
            return "error";
        }
        return "success";
    }

    public static GenericValue getOAuth2GoogleConfig(HttpServletRequest request) {
        Delegator delegator = (Delegator) request.getAttribute("delegator");
        String productStoreId = ProductStoreWorker.getProductStoreId(request);
        try {
            return getOAuth2GoogleConfig(delegator, productStoreId);
        } catch (GenericEntityException e) {
            Map<String, String> messageMap = UtilMisc.toMap("errorMessage", e.toString());
            String errMsg = UtilProperties.getMessage(resource, "GoogleGetOAuth2Error", messageMap, UtilHttp.getLocale(request));
            request.setAttribute("_ERROR_MESSAGE_", errMsg);
        }
        return null;
    }
    
    public static GenericValue getOAuth2GoogleConfig(Delegator delegator, String productStoreId) throws GenericEntityException {
        return EntityQuery.use(delegator).from("OAuth2Google").where("productStoreId", productStoreId).filterByDate().queryFirst();
    }
}
