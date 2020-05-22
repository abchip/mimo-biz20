/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security.impl;

import org.abchip.mimo.biz.service.security.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityFactory init() {
		try {
			SecurityFactory theSecurityFactory = (SecurityFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPackage.eNS_URI);
			if (theSecurityFactory != null) {
				return theSecurityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecurityPackage.CHECK_EXTERNAL_LOGIN_USER: return (EObject)createCheckExternalLoginUser();
			case SecurityPackage.CHECK_EXTERNAL_LOGIN_USER_RESPONSE: return (EObject)createCheckExternalLoginUserResponse();
			case SecurityPackage.USER_CREDENTIAL_FROM_EXTERNAL_ID: return (EObject)createUserCredentialFromExternalId();
			case SecurityPackage.USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE: return (EObject)createUserCredentialFromExternalIdResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckExternalLoginUser createCheckExternalLoginUser() {
		CheckExternalLoginUserImpl checkExternalLoginUser = new CheckExternalLoginUserImpl();
		return checkExternalLoginUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckExternalLoginUserResponse createCheckExternalLoginUserResponse() {
		CheckExternalLoginUserResponseImpl checkExternalLoginUserResponse = new CheckExternalLoginUserResponseImpl();
		return checkExternalLoginUserResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserCredentialFromExternalId createUserCredentialFromExternalId() {
		UserCredentialFromExternalIdImpl userCredentialFromExternalId = new UserCredentialFromExternalIdImpl();
		return userCredentialFromExternalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserCredentialFromExternalIdResponse createUserCredentialFromExternalIdResponse() {
		UserCredentialFromExternalIdResponseImpl userCredentialFromExternalIdResponse = new UserCredentialFromExternalIdResponseImpl();
		return userCredentialFromExternalIdResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPackage getSecurityPackage() {
		return (SecurityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPackage getPackage() {
		return SecurityPackage.eINSTANCE;
	}

} //SecurityFactoryImpl
