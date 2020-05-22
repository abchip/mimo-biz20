/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security.impl;

import org.abchip.mimo.biz.service.security.CheckExternalLoginUser;
import org.abchip.mimo.biz.service.security.CheckExternalLoginUserResponse;
import org.abchip.mimo.biz.service.security.SecurityPackage;

import org.abchip.mimo.service.impl.ServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check External Login User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckExternalLoginUserImpl extends ServiceRequestImpl<CheckExternalLoginUserResponse> implements CheckExternalLoginUser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckExternalLoginUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 4;

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
	public String getAccessToken() {
		return (String)eGet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__ACCESS_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessToken(String newAccessToken) {
		eSet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__ACCESS_TOKEN, newAccessToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return (String)eGet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		eSet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return (String)eGet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__FIRST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		eSet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__FIRST_NAME, newFirstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return (String)eGet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__LAST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		eSet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__LAST_NAME, newLastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return (String)eGet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		eSet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserId() {
		return (String)eGet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		eSet(SecurityPackage.Literals.CHECK_EXTERNAL_LOGIN_USER__USER_ID, newUserId);
	}

} //CheckExternalLoginUserImpl
