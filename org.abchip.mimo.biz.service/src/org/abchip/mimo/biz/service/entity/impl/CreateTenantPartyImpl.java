/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.biz.service.entity.CreateTenantParty;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.resource.LoadSeed;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceResponse;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Tenant Party</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateTenantPartyImpl extends CreateTenantImpl implements CreateTenantParty {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTenantPartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT_PARTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return (String)eGet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(String newTenantId) {
		eSet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_ID, newTenantId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantName() {
		return (String)eGet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantName(String newTenantName) {
		eSet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_NAME, newTenantName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(EntityPackage.Literals.CREATE_TENANT_PARTY__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(EntityPackage.Literals.CREATE_TENANT_PARTY__PARTY_ID, newPartyId);
	}

	@Override
	public ServiceResponse call() throws ResourceException, ServiceException {

		ServiceResponse response = super.call();

		// Party
		if (this.getPartyId() == null) {
			ResourceWriter<Person> personWriter = context.getResourceManager().getResourceWriter(Person.class, this.getTenantId());
			Person tenantPerson = personWriter.make();
			tenantPerson.setPartyId(this.getTenantId());
			tenantPerson.setStatus(context.createProxy(StatusItem.class, "PARTY_ENABLED", this.getTenant()));
			tenantPerson.setPartyType(context.createProxy(PartyType.class, "PERSON", this.getTenant()));
			tenantPerson.setFirstName("Tenant " + this.getTenantId());
			tenantPerson.setLastName(this.getTenantName());
			personWriter.create(tenantPerson, this.isUpdate());
		}

		return response;
	}

	@Override
	public void loadSeeds() throws ServiceException {
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setTenant(this.getTenantId());
			loadSeed.setSeedId("mimo");
			loadSeed.setUpdate(this.isUpdate());
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setTenant(this.getTenantId());
			loadSeed.setSeedId("party");
			loadSeed.setUpdate(this.isUpdate());
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setTenant(this.getTenantId());
			loadSeed.setSeedId("abchip-biz");
			loadSeed.setUpdate(this.isUpdate());
			context.getServiceManager().execute(loadSeed);
		}
	}

} // CreateTenantPartyImpl
