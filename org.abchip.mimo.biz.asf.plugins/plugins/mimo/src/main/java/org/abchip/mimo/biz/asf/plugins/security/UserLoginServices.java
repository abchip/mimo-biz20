/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.security;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.ofbiz.base.crypto.HashCrypt;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilDateTime;
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
import org.apache.ofbiz.passport.user.GitHubUserGroupMapper;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;

public class UserLoginServices {
	
	private static final String module = UserLoginServices.class.getName();
	private static final String google_envPrefix = UtilProperties.getPropertyValue("googleAuth.properties", "google.env.prefix", "test");
	private static final String github_envPrefix = UtilProperties.getPropertyValue("gitHubAuth.properties", "github.env.prefix", "test");
	private static final String linkedin_envPrefix = UtilProperties.getPropertyValue("linkedInAuth.properties", "linkedin.env.prefix", "test");

    public static Map<String, Object> checkExternalLoginUser(DispatchContext ctx, Map<String, ? extends Object> context) {

    	Delegator delegator = ctx.getDelegator();
        String productStoreId = getProductStore(delegator);
        if(productStoreId == null) 
        	return ServiceUtil.returnError("Error looking up website with id WebStore");
        
        String userId = (String) context.get("userId");
        String accessToken = (String) context.get("accessToken");
        String entityName = ""; 
        String fieldName = ""; 
        String envPrefix = ""; 

        switch ((String) context.get("provider")) {
		case "GitHub":
	        entityName = "GitHubUser"; 
	        fieldName = "gitHubUserId"; 
	        envPrefix = github_envPrefix;
			break;
		case "Google":
	        entityName = "GoogleUser"; 
	        fieldName = "googleUserId";
	        envPrefix = google_envPrefix;
			break;
		case "Linkedin":
	        entityName = "LinkedInUser"; 
	        fieldName = "linkedInUserId";
	        envPrefix = linkedin_envPrefix;
			break;
		}
        
        GenericValue externalUser = null;
        try {
        	externalUser = EntityQuery.use(delegator).from(entityName).where(fieldName, userId).queryOne();
        } catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
        if (externalUser != null) {
            boolean dataChanged = false;
            if (!accessToken.equals(externalUser.getString("accessToken"))) {
            	externalUser.set("accessToken", accessToken);
                dataChanged = true;
            }
            if (!envPrefix.equals(externalUser.getString("envPrefix"))) {
            	externalUser.set("envPrefix", envPrefix);
                dataChanged = true;
            }
            if (!productStoreId.equals(externalUser.getString("productStoreId"))) {
            	externalUser.set("productStoreId", productStoreId);
                dataChanged = true;
            }
            if (dataChanged) {
                try {
                	externalUser.store();
                } catch (GenericEntityException e) {
                    Debug.logError(e.getMessage(), module);
                	return ServiceUtil.returnError(e.getMessage());
                }
            }
        } else {
        	externalUser = delegator.makeValue(entityName, UtilMisc.toMap("accessToken", accessToken, 
                                                                          "productStoreId", productStoreId, 
                                                                          "envPrefix", envPrefix, 
                                                                          fieldName, userId));
            try {
            	externalUser.create();
            } catch (GenericEntityException e) {
                Debug.logError(e.getMessage(), module);
            	return ServiceUtil.returnError(e.getMessage());
            }
        }
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", userId).queryFirst();
            if (UtilValidate.isEmpty(userLogin)) {
                String userLoginId = createExternalUserAndParty(ctx, context);
                userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            }
        } catch (GenericEntityException | AuthenticatorException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
    
        Map<String, Object> results = ServiceUtil.returnSuccess();
        return results;
    }

    public static Map<String, Object> userCredentialFromExternalId(DispatchContext ctx, Map<String, ? extends Object> context) {
    	Delegator delegator = ctx.getDelegator();

        String userId = (String) context.get("userId");
        String user = "";
        String password = "";
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", userId).queryFirst();
            if (UtilValidate.isEmpty(userLogin)) {
            	return ServiceUtil.returnError("Error in retrieve userLogin");
            }

            String autoPassword = RandomStringUtils.randomAlphanumeric(EntityUtilProperties.getPropertyAsInteger("security", "password.length.min", 5));
            boolean useEncryption = "true".equals(UtilProperties.getPropertyValue("security", "password.encrypt"));
            userLogin.set("currentPassword", useEncryption ? HashCrypt.digestHash(LoginServices.getHashType(), null, autoPassword) : autoPassword);
            userLogin.store();
            user =  userLogin.getString("userLoginId");
            password = autoPassword;
        } catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
    
        Map<String, Object> results = ServiceUtil.returnSuccess();
        results.put("user", user);
        results.put("password", password);
        return results;
    }
    
    private static String createExternalUserAndParty(DispatchContext ctx, Map<String, ? extends Object> userMap) throws AuthenticatorException {

    	Delegator delegator = ctx.getDelegator();
        LocalDispatcher dispatcher = ctx.getDispatcher();
    	
    	GenericValue system;
        try {
            system = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", "system").cache().queryOne();
        } catch (GenericEntityException e) {
            throw new AuthenticatorException(e.getMessage(), e);
        }
        // create person + userLogin
        Map<String, Serializable> createPersonUlMap = new HashMap<String, Serializable>();
        String userLoginId = delegator.getNextSeqId("UserLogin");
        if (userMap.containsKey("firstName")) {
            createPersonUlMap.put("firstName", (String) userMap.get("firstName"));
        }
        if (userMap.containsKey("lastName")) {
            createPersonUlMap.put("lastName", (String) userMap.get("lastName"));
        }
        if (userMap.containsKey("email")) {
            createPersonUlMap.put("externalAuthId", (String) userMap.get("email"));
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
        if (userMap.containsKey("email")) {
            Map<String, Serializable> createEmailMap = new HashMap<String, Serializable>();
            createEmailMap.put("emailAddress", (String) userMap.get("email"));
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
        for (String securityGroup : (new GitHubUserGroupMapper(new String[] {(String) userMap.get("type")}).getSecurityGroups())) {
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
        
    private static String getProductStore(Delegator delegator) {
    	String productStore = "";
    	GenericValue webSite = null;
        try {
            webSite = EntityQuery.use(delegator).from("WebSite").where("webSiteId", "ABChipWebStore").cache(true).queryOne();
            if(webSite == null) {
                Debug.logError("Error looking up WebSite with id WebStore", module);
                return null;
            }
            productStore = webSite.getString("productStoreId");
        }
        catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
            return null;
        }

        return productStore;
    }
	
}