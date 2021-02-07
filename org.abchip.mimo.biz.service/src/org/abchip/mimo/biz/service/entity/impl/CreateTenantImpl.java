/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import java.util.Date;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.entity.tenant.Tenant;
import org.abchip.mimo.biz.model.entity.tenant.TenantDataSource;
import org.abchip.mimo.biz.model.entity.tenant.TenantDomainName;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup;
import org.abchip.mimo.biz.service.entity.CreateTenant;
import org.abchip.mimo.biz.service.entity.DatabaseType;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.resource.LoadSeeds;
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
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl#getDbHost
 * <em>Db Host</em>}</li>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl#getDbType
 * <em>Db Type</em>}</li>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl#getPartyId
 * <em>Party Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl#isUpdate
 * <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CreateTenantImpl extends ServiceRequestImpl<ServiceResponse> implements CreateTenant {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CreateTenantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDbHost() {
		return (String) eGet(EntityPackage.Literals.CREATE_TENANT__DB_HOST, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDbHost(String newDbHost) {
		eSet(EntityPackage.Literals.CREATE_TENANT__DB_HOST, newDbHost);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DatabaseType getDbType() {
		return (DatabaseType) eGet(EntityPackage.Literals.CREATE_TENANT__DB_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDbType(DatabaseType newDbType) {
		eSet(EntityPackage.Literals.CREATE_TENANT__DB_TYPE, newDbType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String) eGet(EntityPackage.Literals.CREATE_TENANT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(EntityPackage.Literals.CREATE_TENANT__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isUpdate() {
		return (Boolean) eGet(EntityPackage.Literals.CREATE_TENANT__UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	public abstract void loadSeeds(Context cotextTarget) throws ServiceException;

	@Override
	public ServiceResponse call() throws ResourceException, ServiceException, AuthenticationException {

		Context context = this.getContext();

		if (context.getTenant() != null)
			throw new ServiceException("The tenant is not master");

		ServiceResponse response = this.buildResponse();

		// Tenant
		ResourceWriter<Tenant> tenantWriter = context.getResourceManager().getResourceWriter(Tenant.class);
		Tenant tenant = tenantWriter.make();
		tenant.setTenantId(this.getTenantId());
		tenant.setTenantName(this.getTenantName());
		tenantWriter.create(tenant, this.isUpdate());

		// TenantDomainName
		ResourceWriter<TenantDomainName> tenantDomainNameWriter = context.getResourceManager().getResourceWriter(TenantDomainName.class);
		TenantDomainName tenantDomainName = tenantDomainNameWriter.make();
		tenantDomainName.setTenant(tenant);
		tenantDomainName.setDomainName(this.getTenantId() + ".abchip.net");
		tenantDomainNameWriter.create(tenantDomainName, this.isUpdate());

		// TenantDataSource
		ResourceWriter<TenantDataSource> tenantDataSourceWriter = context.getResourceManager().getResourceWriter(TenantDataSource.class);
		TenantDataSource tenantDataSource = tenantDataSourceWriter.make();
		tenantDataSource.setTenant(tenant);
		tenantDataSource.setEntityGroupName("org.apache.ofbiz");

		switch (this.getDbType()) {
		case DERBY:
			tenantDataSource.setJdbcUsername("ofbizuser");
			tenantDataSource.setJdbcPassword("ofbizuser");
			tenantDataSource.setJdbcUri("jdbc:derby:ofbiz_" + this.getTenantId() + ";create=true");
			break;
		case POSTGRE_SQL:
			tenantDataSource.setJdbcUsername("ofbizuser");
			tenantDataSource.setJdbcPassword("ofbizuser");
			tenantDataSource.setJdbcUri("jdbc:postgresql://" + this.getDbHost() + "/ofbiz_" + this.getTenantId());
			break;
		}

		tenantDataSourceWriter.create(tenantDataSource, this.isUpdate());

		/*
		 * create default entities on tenant destination
		 */
		Application application = context.get(Application.class);
		AuthenticationAdminKey authentication = AuthenticationFactory.eINSTANCE.createAuthenticationAdminKey();
		authentication.setTenant(this.getTenantId());
		authentication.setAdminKey(application.getAdminKey());

		try (ContextHandler contextHandler = context.get(AuthenticationManager.class).login(null, authentication);) {

			Context contextTenant = contextHandler.getContext();

			// default seeds
			{
				LoadSeeds loadSeeds = contextTenant.getServiceManager().prepare(LoadSeeds.class);
				loadSeeds.setPattern("seed");
				loadSeeds.setUpdate(this.isUpdate());
				contextTenant.getServiceManager().execute(loadSeeds);
			}

			// command seeds
			this.loadSeeds(contextTenant);
			

			// Party
			if (this.getPartyId() == null) {
				try {
					ResourceWriter<PartyGroup> partyGroupWriter = contextTenant.getResourceManager().getResourceWriter(PartyGroup.class);
					PartyGroup partyGroup = partyGroupWriter.make();
					partyGroup.setPartyId(this.getTenantId());
					partyGroup.setStatus(contextTenant.createProxy(StatusItem.class, "PARTY_ENABLED"));
					partyGroup.setPartyType(contextTenant.createProxy(PartyType.class, "PARTY_GROUP"));
					partyGroup.setGroupName(this.getTenantName());
					partyGroupWriter.create(partyGroup, this.isUpdate());
				} catch (ResourceException e) {
					throw new ServiceException(e);
				}
			}

			// UserLogin
			ResourceWriter<UserLogin> userLogintWriter = contextTenant.getResourceManager().getResourceWriter(UserLogin.class);
			UserLogin userLogin = userLogintWriter.make();
			userLogin.setUserLoginId(this.getTenantId());
			userLogin.setCurrentPassword("{SHA}47ca69ebb4bdc9ae0adec130880165d2cc05db1a");
			userLogin.setIsSystem(true);
			userLogin.setEnabled(true);
			userLogin.setHasLoggedOut(false);
			userLogin.setRequirePasswordChange(false);
			if (this.getPartyId() == null)
				userLogin.setParty(contextTenant.createProxy(Party.class, this.getTenantId()));
			else
				userLogin.setParty(contextTenant.createProxy(Party.class, this.getPartyId()));
			userLogintWriter.create(userLogin, this.isUpdate(), this.isUpdate());

			// UserLoginSecurityGroup
			ResourceWriter<UserLoginSecurityGroup> userLoginSecurityGroupWriter = contextTenant.getResourceManager().getResourceWriter(UserLoginSecurityGroup.class);
			UserLoginSecurityGroup userLoginSecurityGroup = userLoginSecurityGroupWriter.make();
			userLoginSecurityGroup.setUserLogin(userLogin);
			userLoginSecurityGroup.setGroup(contextTenant.createProxy(SecurityGroup.class, "SUPER"));
			userLoginSecurityGroup.setFromDate(new Date());
			userLoginSecurityGroupWriter.create(userLoginSecurityGroup, this.isUpdate());
		}

		return response;
	}

} // CreateTenantImpl
