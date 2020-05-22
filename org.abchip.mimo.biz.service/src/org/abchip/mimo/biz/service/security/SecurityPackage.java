/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security;

import org.abchip.mimo.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl <em>Check External Login User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl
	 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getCheckExternalLoginUser()
	 * @generated
	 */
	int CHECK_EXTERNAL_LOGIN_USER = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__ACCESS_TOKEN = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__EMAIL = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__FIRST_NAME = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__LAST_NAME = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__PROVIDER = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER__USER_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Check External Login User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserResponseImpl <em>Check External Login User Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserResponseImpl
	 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getCheckExternalLoginUserResponse()
	 * @generated
	 */
	int CHECK_EXTERNAL_LOGIN_USER_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The number of structural features of the '<em>Check External Login User Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EXTERNAL_LOGIN_USER_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdImpl <em>User Credential From External Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdImpl
	 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getUserCredentialFromExternalId()
	 * @generated
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID = 2;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID__USER_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Credential From External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdResponseImpl <em>User Credential From External Id Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdResponseImpl
	 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getUserCredentialFromExternalIdResponse()
	 * @generated
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__USER = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__PASSWORD = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Credential From External Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser <em>Check External Login User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check External Login User</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser
	 * @generated
	 */
	EClass getCheckExternalLoginUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getAccessToken()
	 * @see #getCheckExternalLoginUser()
	 * @generated
	 */
	EAttribute getCheckExternalLoginUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getEmail()
	 * @see #getCheckExternalLoginUser()
	 * @generated
	 */
	EAttribute getCheckExternalLoginUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getFirstName()
	 * @see #getCheckExternalLoginUser()
	 * @generated
	 */
	EAttribute getCheckExternalLoginUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getLastName()
	 * @see #getCheckExternalLoginUser()
	 * @generated
	 */
	EAttribute getCheckExternalLoginUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getProvider()
	 * @see #getCheckExternalLoginUser()
	 * @generated
	 */
	EAttribute getCheckExternalLoginUser_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getUserId()
	 * @see #getCheckExternalLoginUser()
	 * @generated
	 */
	EAttribute getCheckExternalLoginUser_UserId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUserResponse <em>Check External Login User Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check External Login User Response</em>'.
	 * @see org.abchip.mimo.biz.service.security.CheckExternalLoginUserResponse
	 * @generated
	 */
	EClass getCheckExternalLoginUserResponse();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalId <em>User Credential From External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Credential From External Id</em>'.
	 * @see org.abchip.mimo.biz.service.security.UserCredentialFromExternalId
	 * @generated
	 */
	EClass getUserCredentialFromExternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalId#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.abchip.mimo.biz.service.security.UserCredentialFromExternalId#getUserId()
	 * @see #getUserCredentialFromExternalId()
	 * @generated
	 */
	EAttribute getUserCredentialFromExternalId_UserId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse <em>User Credential From External Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Credential From External Id Response</em>'.
	 * @see org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse
	 * @generated
	 */
	EClass getUserCredentialFromExternalIdResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getUser()
	 * @see #getUserCredentialFromExternalIdResponse()
	 * @generated
	 */
	EAttribute getUserCredentialFromExternalIdResponse_User();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getPassword()
	 * @see #getUserCredentialFromExternalIdResponse()
	 * @generated
	 */
	EAttribute getUserCredentialFromExternalIdResponse_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl <em>Check External Login User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserImpl
		 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getCheckExternalLoginUser()
		 * @generated
		 */
		EClass CHECK_EXTERNAL_LOGIN_USER = eINSTANCE.getCheckExternalLoginUser();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXTERNAL_LOGIN_USER__ACCESS_TOKEN = eINSTANCE.getCheckExternalLoginUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXTERNAL_LOGIN_USER__EMAIL = eINSTANCE.getCheckExternalLoginUser_Email();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXTERNAL_LOGIN_USER__FIRST_NAME = eINSTANCE.getCheckExternalLoginUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXTERNAL_LOGIN_USER__LAST_NAME = eINSTANCE.getCheckExternalLoginUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXTERNAL_LOGIN_USER__PROVIDER = eINSTANCE.getCheckExternalLoginUser_Provider();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_EXTERNAL_LOGIN_USER__USER_ID = eINSTANCE.getCheckExternalLoginUser_UserId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserResponseImpl <em>Check External Login User Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.security.impl.CheckExternalLoginUserResponseImpl
		 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getCheckExternalLoginUserResponse()
		 * @generated
		 */
		EClass CHECK_EXTERNAL_LOGIN_USER_RESPONSE = eINSTANCE.getCheckExternalLoginUserResponse();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdImpl <em>User Credential From External Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdImpl
		 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getUserCredentialFromExternalId()
		 * @generated
		 */
		EClass USER_CREDENTIAL_FROM_EXTERNAL_ID = eINSTANCE.getUserCredentialFromExternalId();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_CREDENTIAL_FROM_EXTERNAL_ID__USER_ID = eINSTANCE.getUserCredentialFromExternalId_UserId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdResponseImpl <em>User Credential From External Id Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.security.impl.UserCredentialFromExternalIdResponseImpl
		 * @see org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl#getUserCredentialFromExternalIdResponse()
		 * @generated
		 */
		EClass USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE = eINSTANCE.getUserCredentialFromExternalIdResponse();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__USER = eINSTANCE.getUserCredentialFromExternalIdResponse_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__PASSWORD = eINSTANCE.getUserCredentialFromExternalIdResponse_Password();

	}

} //SecurityPackage
