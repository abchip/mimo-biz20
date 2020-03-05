/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.context;

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
import org.apache.ofbiz.passport.user.GoogleUserGroupMapper;
import org.apache.ofbiz.passport.user.LinkedInUserGroupMapper;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;

public class UserLoginServices {
	
	private static final String module = UserLoginServices.class.getName();
    public static final String google_envPrefix = UtilProperties.getPropertyValue("googleAuth.properties", "google.env.prefix", "test");
    public static final String github_envPrefix = UtilProperties.getPropertyValue("gitHubAuth.properties", "github.env.prefix", "test");
    public static final String linkedin_envPrefix = UtilProperties.getPropertyValue("linkedInAuth.properties", "linkedin.env.prefix", "test");

    
    public static Map<String, Object> checkLoginGoogleUser(DispatchContext ctx, Map<String, ? extends Object> context) {
    	
    	Delegator delegator = ctx.getDelegator();
        String productStoreId = getProductStore(delegator);
        if(productStoreId == null) 
        	return ServiceUtil.returnError("Error looking up website with id WebStore");
        
        String googleUserId = (String) context.get("userId");
        String accessToken = (String) context.get("accessToken");
        
        GenericValue googleUser = null;
        try {
            googleUser = EntityQuery.use(delegator).from("GoogleUser").where("googleUserId", googleUserId).queryOne();
        } catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
        if (googleUser != null) {
            boolean dataChanged = false;
            if (!accessToken.equals(googleUser.getString("accessToken"))) {
                googleUser.set("accessToken", accessToken);
                dataChanged = true;
            }
            if (!google_envPrefix.equals(googleUser.getString("envPrefix"))) {
                googleUser.set("envPrefix", google_envPrefix);
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
                	return ServiceUtil.returnError(e.getMessage());
                }
            }
        } else {
            googleUser = delegator.makeValue("GoogleUser", UtilMisc.toMap("accessToken", accessToken, 
                                                                          "productStoreId", productStoreId, 
                                                                          "envPrefix", google_envPrefix, 
                                                                          "googleUserId", googleUserId));
            try {
                googleUser.create();
            } catch (GenericEntityException e) {
                Debug.logError(e.getMessage(), module);
            	return ServiceUtil.returnError(e.getMessage());
            }
        }
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", googleUserId).queryFirst();
            if (UtilValidate.isEmpty(userLogin)) {
                String userLoginId = createGoogleUser(ctx, context);
                userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            }
        } catch (GenericEntityException | AuthenticatorException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
    
        Map<String, Object> results = ServiceUtil.returnSuccess();
        return results;
    }
    
    public static Map<String, Object> checkLoginGitHubUser(DispatchContext ctx, Map<String, ? extends Object> context) {
    	Delegator delegator = ctx.getDelegator();
        String productStoreId = getProductStore(delegator);
        if(productStoreId == null) 
        	return ServiceUtil.returnError("Error looking up website with id WebStore");

        
        String gitHubUserId = (String) context.get("userId");
        String accessToken = (String) context.get("accessToken");

        GenericValue gitHubUser = null;
        try {
            gitHubUser = EntityQuery.use(delegator).from("GitHubUser").where("gitHubUserId", gitHubUserId).queryOne();
        } catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
        if (UtilValidate.isNotEmpty(gitHubUser)) {
            boolean dataChanged = false;
            if (!accessToken.equals(gitHubUser.getString("accessToken"))) {
                gitHubUser.set("accessToken", accessToken);
                dataChanged = true;
            }
            if (!github_envPrefix.equals(gitHubUser.getString("envPrefix"))) {
                gitHubUser.set("envPrefix", github_envPrefix);
                dataChanged = true;
            }
            if (!productStoreId.equals(gitHubUser.getString("productStoreId"))) {
                gitHubUser.set("productStoreId", productStoreId);
                dataChanged = true;
            }
            if (dataChanged) {
                try {
                    gitHubUser.store();
                } catch (GenericEntityException e) {
                    Debug.logError(e.getMessage(), module);
                	return ServiceUtil.returnError(e.getMessage());
                }
            }
        } else {
            gitHubUser = delegator.makeValue("GitHubUser", UtilMisc.toMap("accessToken", accessToken, 
                                                                          "productStoreId", productStoreId, 
                                                                          "envPrefix", github_envPrefix, 
                                                                          "gitHubUserId", gitHubUserId));
            try {
                gitHubUser.create();
            } catch (GenericEntityException e) {
                Debug.logError(e.getMessage(), module);
            }
        }
        
        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", gitHubUserId).queryFirst();
            if (UtilValidate.isEmpty(userLogin)) {
                String userLoginId = createGitHubUser(ctx, context);
                userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            }
        } catch (GenericEntityException | AuthenticatorException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
    	
        Map<String, Object> results = ServiceUtil.returnSuccess();
        return results;
    }

    public static Map<String, Object> checkLoginLinkedInUser(DispatchContext ctx, Map<String, ? extends Object> context) {

    	Delegator delegator = ctx.getDelegator();
        String productStoreId = getProductStore(delegator);
        if(productStoreId == null) 
        	return ServiceUtil.returnError("Error looking up website with id WebStore");
        
        String linkedInUserId = (String) context.get("userId");
        String accessToken = (String) context.get("accessToken");

        GenericValue linkedInUser = null;
        try {
            linkedInUser = EntityQuery.use(delegator).from("LinkedInUser").where("linkedInUserId", linkedInUserId).queryOne();
        } catch (GenericEntityException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
        if (linkedInUser != null) {
            boolean dataChanged = false;
            if (!accessToken.equals(linkedInUser.getString("accessToken"))) {
                linkedInUser.set("accessToken", accessToken);
                dataChanged = true;
            }
            if (!linkedin_envPrefix.equals(linkedInUser.getString("envPrefix"))) {
                linkedInUser.set("envPrefix", linkedin_envPrefix);
                dataChanged = true;
            }
            if (!productStoreId.equals(linkedInUser.getString("productStoreId"))) {
                linkedInUser.set("productStoreId", productStoreId);
                dataChanged = true;
            }
            if (dataChanged) {
                try {
                    linkedInUser.store();
                } catch (GenericEntityException e) {
                    Debug.logError(e.getMessage(), module);
                	return ServiceUtil.returnError(e.getMessage());
                }
            }
        } else {
            linkedInUser = delegator.makeValue("LinkedInUser", UtilMisc.toMap("accessToken", accessToken, 
                                                                          "productStoreId", productStoreId, 
                                                                          "envPrefix", linkedin_envPrefix, 
                                                                          "linkedInUserId", linkedInUserId));
            try {
                linkedInUser.create();
            } catch (GenericEntityException e) {
                Debug.logError(e.getMessage(), module);
            	return ServiceUtil.returnError(e.getMessage());
            }
        }

        try {
            GenericValue userLogin = EntityQuery.use(delegator).from("UserLogin").where("externalAuthId", linkedInUserId).queryFirst();
            if (UtilValidate.isEmpty(userLogin)) {
                String userLoginId = createLinkedInUser(ctx, context);
                userLogin = EntityQuery.use(delegator).from("UserLogin").where("userLoginId", userLoginId).queryOne();
            }
        } catch (GenericEntityException | AuthenticatorException e) {
            Debug.logError(e.getMessage(), module);
        	return ServiceUtil.returnError(e.getMessage());
        }
    	
    	Map<String, Object> results = ServiceUtil.returnSuccess();
        return results;
    }

    public static Map<String, Object> getUserCredentialFromExternalId(DispatchContext ctx, Map<String, ? extends Object> context) {
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
    private static String createGitHubUser(DispatchContext ctx, Map<String, ? extends Object> userMap) throws AuthenticatorException {
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
    
    private static String createGoogleUser(DispatchContext ctx, Map<String, ? extends Object> userMap) throws AuthenticatorException {

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
        for (String securityGroup : (new GoogleUserGroupMapper(new String[] {"person"}).getSecurityGroups())) {
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
 
    private static String createLinkedInUser(DispatchContext ctx, Map<String, ? extends Object> userMap) throws AuthenticatorException {
    	
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
            createEmailMap.put("emailAddress", (String)userMap.get("email"));
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