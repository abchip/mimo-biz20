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
package org.apache.ofbiz.passport.user;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.transaction.Transaction;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.ofbiz.base.conversion.ConversionException;
import org.apache.ofbiz.base.conversion.JSONConverters.JSONToMap;
import org.apache.ofbiz.base.lang.JSON;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilDateTime;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.base.util.UtilProperties;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.common.authentication.api.Authenticator;
import org.apache.ofbiz.common.authentication.api.AuthenticatorException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.transaction.GenericTransactionException;
import org.apache.ofbiz.entity.transaction.TransactionUtil;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.passport.event.LinkedInEvents;
import org.apache.ofbiz.passport.util.PassportUtil;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/**
 * LinkedIn OFBiz Authenticator
 */
public class LinkedInAuthenticator implements Authenticator {

    private static final String module = LinkedInAuthenticator.class.getName();

    public static final String props = "linkedInAuth.properties";

    public static final String resource = "PassportUiLabels";    

    protected LocalDispatcher dispatcher;

    protected Delegator delegator;

    /**
     * Method called when authenticator is first initialized (the delegator
     * object can be obtained from the LocalDispatcher)
     *
     * @param dispatcher The ServiceDispatcher to use for this Authenticator
     */
    public void initialize(LocalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
        this.delegator = dispatcher.getDelegator();
    }

    /**
     * Method to authenticate a user.
     * 
     * For LinkedIn users, we only check if the username(userLoginId) exists an 
     * externalAuthId, and the externalAuthId has a valid accessToken in 
     * LinkedInUser entity.
     *
     * @param userLoginId   User's login id
     * @param password      User's password
     * @param isServiceAuth true if authentication is for a service call
     * @return true if the user is authenticated
     * @throws org.apache.ofbiz.common.authentication.api.AuthenticatorException
     *          when a fatal error occurs during authentication
     */
    public boolean authenticate(String userLoginId, String password, boolean isServiceAuth) throws AuthenticatorException {
    	Map<String, Object> user = null;
        HttpGet getMethod = null;
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            String externalAuthId = userLogin.getString("externalAuthId");
            GenericValue linkedInUser = EntityQuery.use(delegator).from("LinkedInUser").where("linkedInUserId", externalAuthId).queryOne();
            if (linkedInUser != null) {
                String accessToken = linkedInUser.getString("accessToken");
                if (UtilValidate.isNotEmpty(accessToken)) {
                    getMethod = new HttpGet(LinkedInEvents.TokenEndpoint + LinkedInEvents.UserApiUri  + "?oauth2_access_token=" + accessToken);
                    user = LinkedInAuthenticator.getUserInfo(getMethod, Locale.getDefault());
                }
            }
        } catch (GenericEntityException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (IOException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (AuthenticatorException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (SAXException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (ParserConfigurationException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } finally {
            if (getMethod != null) {
                getMethod.releaseConnection();
            }
        }

        Debug.logInfo("LinkedIn auth called; returned user info: " + user, module);
        return user != null;
    }

    /**
     * Logs a user out
     *
     * @param username User's username
     * @throws org.apache.ofbiz.common.authentication.api.AuthenticatorException
     *          when logout fails
     */
    public void logout(String username) throws AuthenticatorException {
    }

    /**
     * Reads user information and syncs it to OFBiz (i.e. UserLogin, Person, etc)
     *
     * @param userLoginId
     * @throws org.apache.ofbiz.common.authentication.api.AuthenticatorException
     *          user synchronization fails
     */
    public void syncUser(String userLoginId) throws AuthenticatorException {
    	Map<String, Object> user = getLinkedInUserinfo(userLoginId);

        GenericValue system;
        try {
            system = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", "system").cache().queryOne();
        } catch (GenericEntityException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        }

        GenericValue userLogin;
        try {
            userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", getLinkedInUserId(user)).queryFirst();
        } catch (GenericEntityException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        }

        // suspend the current transaction and load the user
        Transaction parentTx = null;
        boolean beganTransaction = false;

        try {
            try {
                parentTx = TransactionUtil.suspend();
            } catch (GenericTransactionException e) {
                Debug.logError(e, "Could not suspend transaction: " + e.getMessage(), module);
            }

            try {
                beganTransaction = TransactionUtil.begin();

                if (userLogin == null) {
                    // create the user
                    createUser(user, system);
                } else {
                    // update the user information
                    updateUser(user, system, userLogin);
                }

            } catch (GenericTransactionException e) {
                Debug.logError(e, "Could not suspend transaction: " + e.getMessage(), module);
            } finally {
                try {
                    TransactionUtil.commit(beganTransaction);
                } catch (GenericTransactionException e) {
                    Debug.logError(e, "Could not commit nested transaction: " + e.getMessage(), module);
                }
            }
        } finally {
            // resume/restore parent transaction
            if (parentTx != null) {
                try {
                    TransactionUtil.resume(parentTx);
                    if (Debug.verboseOn()) Debug.logVerbose("Resumed the parent transaction.", module);
                } catch (GenericTransactionException e) {
                    Debug.logError(e, "Could not resume parent nested transaction: " + e.getMessage(), module);
                }
            }
        }
    }

    private Map<String, Object> getLinkedInUserinfo(String userLoginId) throws AuthenticatorException {
    	Map<String, Object> user = null;
        HttpGet getMethod = null;
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            String externalAuthId = userLogin.getString("externalAuthId");
            GenericValue linkedInUser = EntityQuery.use(delegator).from("LinkedInUser").where("linkedInUserId", externalAuthId).queryOne();
            if (linkedInUser != null) {
                String accessToken = linkedInUser.getString("accessToken");
                if (UtilValidate.isNotEmpty(accessToken)) {
                    getMethod = new HttpGet(LinkedInEvents.TokenEndpoint + LinkedInEvents.UserApiUri + "?oauth2_access_token=" + accessToken);
                    user = getUserInfo(getMethod, Locale.getDefault());
                }
            }
        } catch (GenericEntityException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (IOException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (AuthenticatorException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (SAXException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } catch (ParserConfigurationException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        } finally {
            if (getMethod != null) {
                getMethod.releaseConnection();
            }
        }
        return user;
    }

    public String createUser(Map<String, Object> user) throws AuthenticatorException {
        GenericValue system;
        try {
            system = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", "system").cache().queryOne();
        } catch (GenericEntityException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        }
        return createUser(user, system);
    }
    
    private String createUser(Map<String, Object> userInfo, GenericValue system) throws AuthenticatorException {

        // create person + userLogin
        Map<String, Serializable> createPersonUlMap = new HashMap<String, Serializable>();
        String userLoginId = delegator.getNextSeqId("UserLogin");
        if (userInfo.containsKey("localizedFirstName")) {
            createPersonUlMap.put("firstName", (Serializable) userInfo.get("localizedFirstName"));
        }
        if (userInfo.containsKey("localizedLastName")) {
            createPersonUlMap.put("lastName", (Serializable) userInfo.get("localizedLastName"));
        }
        if (userInfo.containsKey("emailAddress")) {
            createPersonUlMap.put("externalAuthId", (Serializable) userInfo.get("emailAddress"));
        }
        // createPersonUlMap.put("externalId", user.getUserId());
        createPersonUlMap.put("userLoginId", userLoginId);
        createPersonUlMap.put("currentPassword", "[EXTERNAL]");
        createPersonUlMap.put("currentPasswordVerify", "[EXTERNAL]");
        createPersonUlMap.put("userLogin", system);
        Map<String, Object> createPersonResult;
        try {
            createPersonResult = dispatcher.runSync("createPersonAndUserLogin", createPersonUlMap);
        } catch (GenericServiceException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        }
        if (ServiceUtil.isError(createPersonResult)) {
            throw new AuthenticatorException(ServiceUtil.getErrorMessage(createPersonResult));
        }
        String partyId = (String) createPersonResult.get("partyId");

        // give this person a role of CUSTOMER
        GenericValue partyRole = delegator.makeValue("PartyRole", UtilMisc.toMap("partyId", partyId, "roleTypeId", "CUSTOMER"));
        try {
            delegator.create(partyRole);
        } catch (GenericEntityException e) {
            Debug.logError(e, module);
            throw new AuthenticatorException(e.getMessage(), e);
        }

        // create email
        if (userInfo.containsKey("emailAddress")) {
            Map<String, Serializable> createEmailMap = new HashMap<String, Serializable>();
            createEmailMap.put("emailAddress", (Serializable) userInfo.get("emailAddress"));
            createEmailMap.put("contactMechPurposeTypeId", "PRIMARY_EMAIL");
            createEmailMap.put("partyId", partyId);
            createEmailMap.put("userLogin", system);
            Map<String, Object> createEmailResult;
            try {
                createEmailResult = dispatcher.runSync("createPartyEmailAddress", createEmailMap);
            } catch (GenericServiceException e) {
                throw new AuthenticatorException(e.getMessage(), e);
            }
            if (ServiceUtil.isError(createEmailResult)) {
                throw new AuthenticatorException(ServiceUtil.getErrorMessage(createEmailResult));
            }
        }

        // create security group(s)
        Timestamp now = UtilDateTime.nowTimestamp();
        for (String securityGroup : (new LinkedInUserGroupMapper(new String[] {"person"}).getSecurityGroups())) {
            // check and make sure the security group exists
            GenericValue secGroup = null;
            try {
                secGroup = EntityQuery.use(delegator).from("SecurityGroup").where("groupId", securityGroup).cache().queryOne();
            } catch (GenericEntityException e) {
                Debug.logError(e, e.getMessage(), module);
            }

            // add it to the user if it exists
            if (secGroup != null) {
                Map<String, Serializable> createSecGrpMap = new HashMap<String, Serializable>();
                createSecGrpMap.put("userLoginId", userLoginId);
                createSecGrpMap.put("groupId", securityGroup);
                createSecGrpMap.put("fromDate", now);
                createSecGrpMap.put("userLogin", system);

                Map<String, Object> createSecGrpResult;
                try {
                    createSecGrpResult = dispatcher.runSync("addUserLoginToSecurityGroup", createSecGrpMap);
                } catch (GenericServiceException e) {
                    throw new AuthenticatorException(e.getMessage(), e);
                }
                if (ServiceUtil.isError(createSecGrpResult)) {
                    throw new AuthenticatorException(ServiceUtil.getErrorMessage(createSecGrpResult));
                }
            }
        }
        return userLoginId;
    }

    private void updateUser(Map<String, Object> user, GenericValue system, GenericValue userLogin) throws AuthenticatorException {
        // TODO implement me
    }

    /**
     * Updates a user's password.
     *
     * @param username    User's username
     * @param password    User's current password
     * @param newPassword User's new password
     * @throws org.apache.ofbiz.common.authentication.api.AuthenticatorException
     *          when update password fails
     */
    public void updatePassword(String username, String password, String newPassword) throws AuthenticatorException {
        Debug.logInfo("Calling LinkedIn:updatePassword() - ignored!!!", module);
    }

    /**
     * Weight of this authenticator (lower weights are run first)
     *
     * @return the weight of this Authenicator
     */
    public float getWeight() {
        return 1;
    }

    /**
     * Is the user synchronzied back to OFBiz
     *
     * @return true if the user record is copied to the OFB database
     */
    public boolean isUserSynchronized() {
        return true;
    }

    /**
     * Is this expected to be the only authenticator, if so errors will be thrown when users cannot be found
     *
     * @return true if this is expected to be the only Authenticator
     */
    public boolean isSingleAuthenticator() {
        return false;
    }

    /**
     * Flag to test if this Authenticator is enabled
     *
     * @return true if the Authenticator is enabled
     */
    public boolean isEnabled() {
        return "true".equalsIgnoreCase(UtilProperties.getPropertyValue(props, "linked.authenticator.enabled", "true"));
    }

    public static Map<String, Object> getUserInfo(HttpGet httpGet, Locale locale) throws IOException, AuthenticatorException, SAXException, ParserConfigurationException {
    	JSON userInfo = null;
        httpGet.setConfig(PassportUtil.StandardRequestConfig);
        CloseableHttpClient jsonClient = HttpClients.custom().build();
        httpGet.setHeader(PassportUtil.ACCEPT_HEADER, "application/json");
        CloseableHttpResponse getResponse = null;
		try {
			getResponse = jsonClient.execute(httpGet);
	        if (getResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
	            // Debug.logInfo("Json Response from LinkedIn: " + responseString, module);
	            String responseString = new BasicResponseHandler().handleResponse(getResponse);
	            userInfo = JSON.from(responseString);
	        } else {
	            String errMsg = UtilProperties.getMessage(resource, "GetOAuth2AccessTokenError", UtilMisc.toMap("error", ""), locale);
	            throw new AuthenticatorException(errMsg);
	        }
		} catch (ClientProtocolException e) {
            throw new AuthenticatorException(e.getMessage());
		} catch (IOException e) {
            throw new AuthenticatorException(e.getMessage());
		} finally {
			if (getResponse != null) {
	            try {
					getResponse.close();
				} catch (IOException e) {
					// do nothing
				}
			}
		}
        JSONToMap jsonMap = new JSONToMap();
        Map<String, Object> userMap;
        try {
            userMap = jsonMap.convert(userInfo);
        } catch (ConversionException e) {
            throw new AuthenticatorException(e.getMessage());
        }
        return userMap;
    }

    public static String getUserEmailInfo(HttpGet httpGet, Locale locale) throws IOException, AuthenticatorException, SAXException, ParserConfigurationException {
    	String userEmail = "";
        httpGet.setConfig(PassportUtil.StandardRequestConfig);
        CloseableHttpClient jsonClient = HttpClients.custom().build();
        httpGet.setHeader(PassportUtil.ACCEPT_HEADER, "application/json");
        CloseableHttpResponse getResponse = null;
		try {
			getResponse = jsonClient.execute(httpGet);
	        if (getResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
	            // Debug.logInfo("Json Response from LinkedIn: " + responseString, module);
	            String responseString = new BasicResponseHandler().handleResponse(getResponse);
	            JSONObject obj = new JSONObject(responseString);
	            org.json.JSONArray jsonArray = obj.getJSONArray("elements");
	            JSONObject element = jsonArray.getJSONObject(0);
	            userEmail = element.getJSONObject("handle~").getString("emailAddress");	            
	        } else {
	            String errMsg = UtilProperties.getMessage(resource, "GetOAuth2AccessTokenError", UtilMisc.toMap("error", ""), locale);
	            throw new AuthenticatorException(errMsg);
	        }
		} catch (ClientProtocolException e) {
            throw new AuthenticatorException(e.getMessage());
		} catch (IOException e) {
            throw new AuthenticatorException(e.getMessage());
		} finally {
			if (getResponse != null) {
	            try {
					getResponse.close();
				} catch (IOException e) {
					// do nothing
				}
			}
		}

		return userEmail;
    }
    
    public static String getLinkedInUserId(Map<String, Object> userInfo) {
    	String id = (String) userInfo.get("emailAddress");
        return id;
    }
}
