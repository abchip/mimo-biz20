/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import org.abchip.mimo.biz.service.entity.CreateTenantTest;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.LoadSeed;
import org.abchip.mimo.service.ServiceException;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Tenant Test</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CreateTenantTestImpl extends CreateTenantImpl implements CreateTenantTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CreateTenantTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT_TEST;
	}

	@Override
	public String getTenantId() {
		return "test";
	}

	@Override
	public String getTenantName() {
		return "Test tenant";
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
			loadSeed.setSeedId("abchip-tenantTest");
			loadSeed.setUpdate(this.isUpdate());
			contextTarget.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = contextTarget.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("abchip-tenantTest-accounting");
			loadSeed.setUpdate(true);
			contextTarget.getServiceManager().execute(loadSeed);
		}
	}
} // CreateTenantTestImpl
