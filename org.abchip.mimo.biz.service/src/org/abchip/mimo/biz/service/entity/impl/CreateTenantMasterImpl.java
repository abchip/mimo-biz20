/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import org.abchip.mimo.biz.service.entity.CreateTenantMaster;
import org.abchip.mimo.biz.service.entity.DatabaseType;
import org.abchip.mimo.biz.service.entity.EntityPackage;

import org.abchip.mimo.service.ServiceResponse;

import org.abchip.mimo.service.impl.ServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Tenant Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateTenantMasterImpl extends ServiceRequestImpl<ServiceResponse> implements CreateTenantMaster {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTenantMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CREATE_TENANT_MASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(EntityPackage.Literals.CREATE_TENANT_MASTER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(EntityPackage.Literals.CREATE_TENANT_MASTER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDbType() {
		return (DatabaseType)eGet(EntityPackage.Literals.CREATE_TENANT_MASTER__DB_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbType(DatabaseType newDbType) {
		eSet(EntityPackage.Literals.CREATE_TENANT_MASTER__DB_TYPE, newDbType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(EntityPackage.Literals.CREATE_TENANT_MASTER__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(EntityPackage.Literals.CREATE_TENANT_MASTER__PARTY_ID, newPartyId);
	}

	@Override
	public ServiceResponse call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

} //CreateTenantMasterImpl
