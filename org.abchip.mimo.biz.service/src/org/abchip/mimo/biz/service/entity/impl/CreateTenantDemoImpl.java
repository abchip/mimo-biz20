/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import org.abchip.mimo.biz.service.entity.CreateTenantDemo;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.LoadSeeds;
import org.abchip.mimo.service.ServiceException;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Tenant Demo</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CreateTenantDemoImpl extends CreateTenantImpl implements CreateTenantDemo {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTenantDemoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT_DEMO;
	}

	@Override
	public String getTenantId() {
		return "demo";
	}

	@Override
	public String getTenantName() {
		return "Demo tenant";
	}

	@Override
	public void loadSeeds(Context contextTarget) throws ServiceException {
		{
			LoadSeeds loadSeeds = contextTarget.getServiceManager().prepare(LoadSeeds.class);
			loadSeeds.setPattern("demo");
			loadSeeds.setUpdate(this.isUpdate());
			contextTarget.getServiceManager().execute(loadSeeds);
		}
	}
} // CreateTenantDemoImpl
