/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.command;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import org.abchip.mimo.biz.asf.OFBizConstants;
import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.biz.entity.tenant.TenantDataSource;
import org.abchip.mimo.biz.entity.tenant.TenantDomainName;
import org.abchip.mimo.biz.entity.tenant.TenantFactory;
import org.abchip.mimo.biz.security.login.LoginFactory;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupFactory;
import org.abchip.mimo.biz.security.securitygroup.UserLoginSecurityGroup;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class OFBizCommandUtils {

	public static void createTenant(Context context, String tenantId, String tenantName, boolean clean) {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Tenant
		ResourceWriter<Tenant> tenantWriter = resourceManager.getResourceWriter(context, Tenant.class);
		Tenant tenant = TenantFactory.eINSTANCE.createTenant();
		tenant.setTenantId(tenantId);
		tenant.setTenantName(tenantName);
		tenantWriter.create(tenant, clean);
		// TenantDomainName
		ResourceWriter<TenantDomainName> tenantDomainNameWriter = resourceManager.getResourceWriter(context, TenantDomainName.class);
		TenantDomainName tenantDomainName = TenantFactory.eINSTANCE.createTenantDomainName();
		tenantDomainName.setTenantId(tenant);
		tenantDomainName.setDomainName(tenantId + ".abchip.net");
		tenantDomainNameWriter.create(tenantDomainName, clean);
		// TenantDataSource
		ResourceWriter<TenantDataSource> tenantDataSourceWriter = resourceManager.getResourceWriter(context, TenantDataSource.class);
		TenantDataSource tenantDataSource = TenantFactory.eINSTANCE.createTenantDataSource();
		tenantDataSource.setTenantId(tenant);
		tenantDataSource.setEntityGroupName("org.apache.ofbiz");
		tenantDataSource.setJdbcUsername("ofbiz");
		tenantDataSource.setJdbcPassword("ofbiz");
		tenantDataSource.setJdbcUri("jdbc:derby:ofbiz_" + tenantId + ";create=true");
		tenantDataSourceWriter.create(tenantDataSource, clean);

		// Tenant creation

		// copy file
		String source = OFBizConstants.DERBY_SEED + "/ofbiz";
		File srcDir = new File(source);

		String destination = OFBizConstants.DERBY_PATH + "/ofbiz_" + tenantId;
		File destDir = new File(destination);

		try {
			if (clean)
				FileUtils.deleteDirectory(destDir);

			FileUtils.copyDirectory(srcDir, destDir);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// UserLogin
		ResourceWriter<UserLogin> userLogintWriter = resourceManager.getResourceWriter(context, UserLogin.class, tenantId);
		UserLogin userLogin = LoginFactory.eINSTANCE.createUserLogin();
		userLogin.setUserLoginId(tenantId);
		userLogin.setCurrentPassword("{SHA}47ca69ebb4bdc9ae0adec130880165d2cc05db1a");
		userLogin.setIsSystem(true);
		userLogin.setEnabled(true);
		userLogin.setHasLoggedOut(false);
		userLogin.setRequirePasswordChange(false);
		userLogintWriter.create(userLogin, clean);

		// UserLoginSecurityGroup
		ResourceWriter<UserLoginSecurityGroup> userLoginSecurityGroupWriter = resourceManager.getResourceWriter(context, UserLoginSecurityGroup.class, tenantId);
		UserLoginSecurityGroup userLoginSecurityGroup = SecuritygroupFactory.eINSTANCE.createUserLoginSecurityGroup();
		userLoginSecurityGroup.setUserLoginId(userLogin);
		userLoginSecurityGroup.setGroupId(resourceManager.getFrame(context, SecurityGroup.class).createProxy("SUPER"));
		userLoginSecurityGroup.setFromDate(new Date());
		userLoginSecurityGroupWriter.create(userLoginSecurityGroup, clean);
	}

	public static void loadSeeds(Context context, String seedName, String tenantId, boolean update) {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		for (File file : new File(OFBizConstants.SEEDS_PATH).listFiles()) {

			if (!file.getName().equals(seedName + ".xmi"))
				continue;

			try (InputStream inputStream = Files.newInputStream(Paths.get(file.getAbsolutePath()))) {

				XMIResource resource = new XMIResourceImpl();
				resource.load(inputStream, null);
				EObject eObject = resource.getContents().get(0);
				EntityContainer entityContainer = (EntityContainer) eObject;
				if (entityContainer == null)
					continue;

				for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
					try {
						ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa(), tenantId);
						entityWriter.create(entityIdentifiable, update);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		}

		System.out.println(seedName);
	}
}
