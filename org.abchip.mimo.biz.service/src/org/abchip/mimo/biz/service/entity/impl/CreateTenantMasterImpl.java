/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import org.abchip.mimo.biz.service.entity.CreateTenantMaster;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.LoadSeed;
import org.abchip.mimo.resource.LoadSeeds;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Create
 * Tenant Master</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CreateTenantMasterImpl extends ServiceRequestImpl<ServiceResponse> implements CreateTenantMaster {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTenantMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT_MASTER;
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

	@Override
	public ServiceResponse call() throws ServiceException {

		Context context = this.getContext();
		ServiceResponse response = this.buildResponse();

		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(LoadSeeds.class);
			loadSeeds.setSeedPattern("seed");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("mimo");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("party");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("abchip-net");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("abchip-net-accounting");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("passport");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(LoadSeed.class);
			loadSeed.setSeedId("edi");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}

		return response;
	}

} // CreateTenantMasterImpl
