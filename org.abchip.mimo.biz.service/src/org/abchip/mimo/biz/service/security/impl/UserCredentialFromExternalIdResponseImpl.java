/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security.impl;

import org.abchip.mimo.biz.service.security.SecurityPackage;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse;

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Credential From External Id Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdResponseImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdResponseImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserCredentialFromExternalIdResponseImpl extends ServiceResponseImpl implements UserCredentialFromExternalIdResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserCredentialFromExternalIdResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 2;

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
	public String getUser() {
		return (String)eGet(SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		eSet(SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return (String)eGet(SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		eSet(SecurityPackage.Literals.USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__PASSWORD, newPassword);
	}

} //UserCredentialFromExternalIdResponseImpl
