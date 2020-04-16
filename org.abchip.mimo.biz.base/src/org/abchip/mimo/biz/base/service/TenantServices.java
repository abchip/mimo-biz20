/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.service;

import java.util.Date;

import org.abchip.mimo.biz.model.entity.tenant.Tenant;
import org.abchip.mimo.biz.model.entity.tenant.TenantDataSource;
import org.abchip.mimo.biz.model.entity.tenant.TenantDomainName;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class TenantServices {

	public enum DBType {
		D, P
	}

	public static void createTenant(Context context, String tenantId, String tenantName, DBType dbType, boolean update) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Tenant
		ResourceWriter<Tenant> tenantWriter = resourceManager.getResourceWriter(context, Tenant.class);
		Tenant tenant = tenantWriter.make();
		tenant.setTenantId(tenantId);
		tenant.setTenantName(tenantName);
		tenantWriter.create(tenant, update);

		// TenantDomainName
		ResourceWriter<TenantDomainName> tenantDomainNameWriter = resourceManager.getResourceWriter(context, TenantDomainName.class);
		TenantDomainName tenantDomainName = tenantDomainNameWriter.make();
		tenantDomainName.setTenantId(tenant);
		tenantDomainName.setDomainName(tenantId + ".abchip.net");
		tenantDomainNameWriter.create(tenantDomainName, update);

		// TenantDataSource
		ResourceWriter<TenantDataSource> tenantDataSourceWriter = resourceManager.getResourceWriter(context, TenantDataSource.class);
		TenantDataSource tenantDataSource = tenantDataSourceWriter.make();
		tenantDataSource.setTenantId(tenant);
		tenantDataSource.setEntityGroupName("org.apache.ofbiz");

		switch (dbType) {
		case D:
			tenantDataSource.setJdbcUsername("ofbiz");
			tenantDataSource.setJdbcPassword("ofbiz");
			tenantDataSource.setJdbcUri("jdbc:derby:ofbiz_" + tenantId + ";create=true");
			break;
		case P:
			tenantDataSource.setJdbcUsername("ofbizuser_tenant");
			tenantDataSource.setJdbcPassword("ofbiz@user");
			tenantDataSource.setJdbcUri("jdbc:postgresql://127.0.0.1/ofbiz_" + tenantId);
			break;
		}

		tenantDataSourceWriter.create(tenantDataSource, update);
	}

	public static void createUserTenant(Context context, String tenantId, boolean clean) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// UserLogin
		ResourceWriter<UserLogin> userLogintWriter = resourceManager.getResourceWriter(context, UserLogin.class, tenantId);
		UserLogin userLogin = userLogintWriter.make();
		userLogin.setUserLoginId(tenantId);
		userLogin.setCurrentPassword("{SHA}47ca69ebb4bdc9ae0adec130880165d2cc05db1a");
		userLogin.setIsSystem(true);
		userLogin.setEnabled(true);
		userLogin.setHasLoggedOut(false);
		userLogin.setRequirePasswordChange(false);
		userLogintWriter.create(userLogin, clean);

		// UserLoginSecurityGroup
		ResourceWriter<UserLoginSecurityGroup> userLoginSecurityGroupWriter = resourceManager.getResourceWriter(context, UserLoginSecurityGroup.class, tenantId);
		UserLoginSecurityGroup userLoginSecurityGroup = userLoginSecurityGroupWriter.make();
		userLoginSecurityGroup.setUserLoginId(userLogin);
		userLoginSecurityGroup.setGroupId(resourceManager.getFrame(context, SecurityGroup.class).createProxy("SUPER"));
		userLoginSecurityGroup.setFromDate(new Date());
		userLoginSecurityGroupWriter.create(userLoginSecurityGroup, clean);
	}
}