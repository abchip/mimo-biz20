/**
 * Copyright (c) 2017, 2021 ABChip and others.
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
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.LoadSeed;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Tenant Party</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl#getTenantId
 * <em>Tenant Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl#getTenantName
 * <em>Tenant Name</em>}</li>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl#getPartyId
 * <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateTenantPartyImpl extends CreateTenantImpl implements CreateTenantParty {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CreateTenantPartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT_PARTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return (String) eGet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTenantId(String newTenantId) {
		eSet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_ID, newTenantId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTenantName() {
		return (String) eGet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTenantName(String newTenantName) {
		eSet(EntityPackage.Literals.CREATE_TENANT_PARTY__TENANT_NAME, newTenantName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String) eGet(EntityPackage.Literals.CREATE_TENANT_PARTY__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(EntityPackage.Literals.CREATE_TENANT_PARTY__PARTY_ID, newPartyId);
	}

	@Override
	public void loadSeeds(Context contextTarget) throws ServiceException {
		{
			LoadSeed loadSeed = contextTarget.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("mimo");
			loadSeed.setUpdate(this.isUpdate());
			contextTarget.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = contextTarget.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("party");
			loadSeed.setUpdate(this.isUpdate());
			contextTarget.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = contextTarget.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("abchip-biz");
			loadSeed.setUpdate(this.isUpdate());
			contextTarget.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = contextTarget.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("abchip-biz-" + this.getTenantId());
			loadSeed.setUpdate(this.isUpdate());
			contextTarget.getServiceManager().execute(loadSeed);
		}

		// Party
		if (this.getPartyId() == null) {
			try {
				ResourceWriter<Person> personWriter = contextTarget.getResourceManager().getResourceWriter(Person.class);
				Person tenantPerson = personWriter.make();
				tenantPerson.setPartyId(this.getTenantId());
				tenantPerson.setStatus(contextTarget.createProxy(StatusItem.class, "PARTY_ENABLED"));
				tenantPerson.setPartyType(contextTarget.createProxy(PartyType.class, "PERSON"));
				tenantPerson.setFirstName("Tenant " + this.getTenantId());
				tenantPerson.setLastName(this.getTenantName());
				personWriter.create(tenantPerson, this.isUpdate());
			} catch (ResourceException e) {
				throw new ServiceException(e);
			}
		}
	}

} // CreateTenantPartyImpl
