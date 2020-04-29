/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import java.util.Date;

import org.abchip.mimo.biz.model.entity.tenant.Tenant;
import org.abchip.mimo.biz.model.entity.tenant.TenantDataSource;
import org.abchip.mimo.biz.model.entity.tenant.TenantDomainName;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup;
import org.abchip.mimo.biz.service.entity.CreateTenant;
import org.abchip.mimo.biz.service.entity.DatabaseType;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.biz.service.entity.LoadSeeds;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Tenant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CreateTenantImpl extends ServiceRequestImpl<ServiceResponse> implements CreateTenant {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTenantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDbType() {
		return (DatabaseType)eGet(EntityPackage.Literals.CREATE_TENANT__DB_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbType(DatabaseType newDbType) {
		eSet(EntityPackage.Literals.CREATE_TENANT__DB_TYPE, newDbType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUpdate() {
		return (Boolean)eGet(EntityPackage.Literals.CREATE_TENANT__UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(boolean newUpdate) {
		eSet(EntityPackage.Literals.CREATE_TENANT__UPDATE, newUpdate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract String getTenantId();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract String getTenantName();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public abstract void loadSeeds() throws ServiceException;

	@Override
	public ServiceResponse call() throws ResourceException, ServiceException {

		Context context = this.getContext();
		ServiceResponse response = this.buildResponse();

		// Tenant
		ResourceWriter<Tenant> tenantWriter = context.getResourceManager().getResourceWriter(context, Tenant.class);
		Tenant tenant = tenantWriter.make();
		tenant.setTenantId(this.getTenantId());
		tenant.setTenantName(this.getTenantName());
		tenantWriter.create(tenant, this.isUpdate());

		// TenantDomainName
		ResourceWriter<TenantDomainName> tenantDomainNameWriter = context.getResourceManager().getResourceWriter(context, TenantDomainName.class);
		TenantDomainName tenantDomainName = tenantDomainNameWriter.make();
		tenantDomainName.setTenantId(tenant);
		tenantDomainName.setDomainName(this.getTenantId() + ".abchip.net");
		tenantDomainNameWriter.create(tenantDomainName, this.isUpdate());

		// TenantDataSource
		ResourceWriter<TenantDataSource> tenantDataSourceWriter = context.getResourceManager().getResourceWriter(context, TenantDataSource.class);
		TenantDataSource tenantDataSource = tenantDataSourceWriter.make();
		tenantDataSource.setTenantId(tenant);
		tenantDataSource.setEntityGroupName("org.apache.ofbiz");

		switch (this.getDbType()) {
		case DERBY:
			tenantDataSource.setJdbcUsername("ofbiz");
			tenantDataSource.setJdbcPassword("ofbiz");
			tenantDataSource.setJdbcUri("jdbc:derby:ofbiz_" + this.getTenantId() + ";create=true");
			break;
		case POSTGRE_SQL:
			tenantDataSource.setJdbcUsername("ofbizuser_tenant");
			tenantDataSource.setJdbcPassword("ofbiz@user");
			tenantDataSource.setJdbcUri("jdbc:postgresql://127.0.0.1/ofbiz_" + this.getTenantId());
			break;
		}

		tenantDataSourceWriter.create(tenantDataSource, this.isUpdate());

		/*
		 * create default entities on tenant destination
		 */

		// UserLogin
		ResourceWriter<UserLogin> userLogintWriter = context.getResourceManager().getResourceWriter(context, UserLogin.class, this.getTenantId());
		UserLogin userLogin = userLogintWriter.make();
		userLogin.setUserLoginId(this.getTenantId());
		userLogin.setCurrentPassword("{SHA}47ca69ebb4bdc9ae0adec130880165d2cc05db1a");
		userLogin.setIsSystem(true);
		userLogin.setEnabled(true);
		userLogin.setHasLoggedOut(false);
		userLogin.setRequirePasswordChange(false);
		userLogintWriter.create(userLogin, this.isUpdate());

		// default seeds
		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(context, LoadSeeds.class);
			loadSeeds.setTenant(this.getTenantId());
			loadSeeds.setSeedPattern("seed");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}

		// command seeds
		this.loadSeeds();

		// UserLoginSecurityGroup
		ResourceWriter<UserLoginSecurityGroup> userLoginSecurityGroupWriter = context.getResourceManager().getResourceWriter(context, UserLoginSecurityGroup.class, this.getTenantId());
		UserLoginSecurityGroup userLoginSecurityGroup = userLoginSecurityGroupWriter.make();
		userLoginSecurityGroup.setUserLoginId(userLogin);
		userLoginSecurityGroup.setGroupId(context.createProxy(SecurityGroup.class, "SUPER"));
		userLoginSecurityGroup.setFromDate(new Date());
		userLoginSecurityGroupWriter.create(userLoginSecurityGroup, this.isUpdate());

		return response;
	}

} // CreateTenantImpl
