/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.command;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.biz.entity.tenant.TenantDataSource;
import org.abchip.mimo.biz.entity.tenant.TenantDomainName;
import org.abchip.mimo.biz.entity.tenant.TenantFactory;
import org.abchip.mimo.biz.plugins.OFBizConstants;
import org.abchip.mimo.biz.plugins.entity.EntityUtils;
import org.abchip.mimo.biz.security.login.LoginFactory;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupFactory;
import org.abchip.mimo.biz.security.securitygroup.UserLoginSecurityGroup;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.commons.io.FileUtils;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityDataLoader;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class BizCommandUtils {

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
		try {

			List<URL> seedUrls = context.getResources(BizCommandUtils.class, OFBizConstants.SEEDS_PATH + "/" + seedName);
			for (URL seedUrl : seedUrls) {
				try (InputStream inputStream = seedUrl.openStream()) {

					XMIResource resource = new XMIResourceImpl();
					resource.load(inputStream, null);
					if (!resource.getContents().isEmpty()) {
						EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

						for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
							try {
								ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa(), tenantId);
								entityWriter.create(entityIdentifiable, update);
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
						}
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {

		}

	}

	public static void loadSeed(Context context, String seedName, String tenantId, boolean update) {
		ResourceManager resourceManager = context.get(ResourceManager.class);
		try {

			URL seedUrl = context.getResource(BizCommandUtils.class, OFBizConstants.SEEDS_PATH + "/" + seedName + ".xmi");
			if (seedUrl == null)
				return;

			try (InputStream inputStream = seedUrl.openStream()) {

				XMIResource resource = new XMIResourceImpl();
				resource.load(inputStream, null);
				if (!resource.getContents().isEmpty()) {
					EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

					for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
						try {
							ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa(), tenantId);
							entityWriter.create(entityIdentifiable, update);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(seedName);
	}

	public static void exportReaderFiltered(Context context, Delegator delegator, String filter) {

		LinkedList<String> readerNames = new LinkedList<String>();
		readerNames.add(filter);
		String helperName = delegator.getGroupHelperName("org.apache.ofbiz");
		List<URL> urlList = EntityDataLoader.getUrlList(helperName, readerNames);

		Iterator<URL> urlListIt = urlList.iterator();
		URL url = null;
		while (urlListIt.hasNext()) {
			url = urlListIt.next();

			if (url.toString().endsWith("RainbowStoneThemeData.xml"))
				continue;

			try {
				List<GenericValue> listEntity = delegator.readXmlDocument(url);
				createContainer(context, url, listEntity, filter);
			} catch (Exception e) {
				System.err.println("Problem with xml " + url + " " + e.getMessage());
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	private static void createContainer(Context context, URL url, List<GenericValue> listEntity, String prefix) {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		Iterator<GenericValue> listEntityIt = listEntity.iterator();
		EntityContainer container = EntityFactory.eINSTANCE.createEntityContainer();
		String[] segments = url.getPath().split("/");
		String containerName = segments[segments.length - 1];
		containerName = prefix + "_" + containerName.substring(0, containerName.lastIndexOf('.'));

		container.setName(containerName);
		while (listEntityIt.hasNext()) {
			GenericValue genericValue = listEntityIt.next();
			EntityIdentifiable entityIdentifiable = null;
			try {
				entityIdentifiable = EntityUtils.toEntity((Frame<EntityIdentifiable>) resourceManager.getFrame(context, genericValue.getEntityName()), genericValue);
			} catch (Exception e) {
				System.err.println("Error in ecore model not find entity " + genericValue.getEntityName());
				continue;
			}
			container.getContents().add(entityIdentifiable);
		}
		ResourceWriter<EntityContainer> entityWriter = resourceManager.getResourceWriter(context, EntityContainer.class);
		entityWriter.create(container, true);
	}
}