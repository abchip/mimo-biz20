/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security.impl;

import org.abchip.mimo.biz.service.security.SecurityPackage;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalId;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse;

import org.abchip.mimo.service.impl.ServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Credential From External Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdImpl#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserCredentialFromExternalIdImpl extends ServiceRequestImpl<UserCredentialFromExternalIdResponse> implements UserCredentialFromExternalId {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserCredentialFromExternalIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 1;

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
	public String getUserId() {
		return (String)eGet(SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID__USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		eSet(SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID__USER_ID, newUserId);
	}

} //UserCredentialFromExternalIdImpl
