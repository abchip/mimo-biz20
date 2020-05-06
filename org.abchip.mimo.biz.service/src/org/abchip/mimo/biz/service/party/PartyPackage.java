/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party;

import org.abchip.mimo.service.ServicePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.biz.service.party.PartyFactory
 * @model kind="package"
 * @generated
 */
public interface PartyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "party";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/party";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-party";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartyPackage eINSTANCE = org.abchip.mimo.biz.service.party.impl.PartyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultImpl <em>Get Party Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.GetPartyDefaultImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getGetPartyDefault()
	 * @generated
	 */
	int GET_PARTY_DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The number of structural features of the '<em>Get Party Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl <em>Get Party Default Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getGetPartyDefaultResponse()
	 * @generated
	 */
	int GET_PARTY_DEFAULT_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__ERROR = ServicePackage.SERVICE_RESPONSE__ERROR;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__ORGANIZATION = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accounting Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__ACCOUNTING_PREFERENCE = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Party Default Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.party.GetPartyDefault <em>Get Party Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Party Default</em>'.
	 * @see org.abchip.mimo.biz.service.party.GetPartyDefault
	 * @generated
	 */
	EClass getGetPartyDefault();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse <em>Get Party Default Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Party Default Response</em>'.
	 * @see org.abchip.mimo.biz.service.party.GetPartyDefaultResponse
	 * @generated
	 */
	EClass getGetPartyDefaultResponse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getOrganization()
	 * @see #getGetPartyDefaultResponse()
	 * @generated
	 */
	EReference getGetPartyDefaultResponse_Organization();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getAccountingPreference <em>Accounting Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accounting Preference</em>'.
	 * @see org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getAccountingPreference()
	 * @see #getGetPartyDefaultResponse()
	 * @generated
	 */
	EReference getGetPartyDefaultResponse_AccountingPreference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartyFactory getPartyFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultImpl <em>Get Party Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.party.impl.GetPartyDefaultImpl
		 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getGetPartyDefault()
		 * @generated
		 */
		EClass GET_PARTY_DEFAULT = eINSTANCE.getGetPartyDefault();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl <em>Get Party Default Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl
		 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getGetPartyDefaultResponse()
		 * @generated
		 */
		EClass GET_PARTY_DEFAULT_RESPONSE = eINSTANCE.getGetPartyDefaultResponse();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_PARTY_DEFAULT_RESPONSE__ORGANIZATION = eINSTANCE.getGetPartyDefaultResponse_Organization();

		/**
		 * The meta object literal for the '<em><b>Accounting Preference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_PARTY_DEFAULT_RESPONSE__ACCOUNTING_PREFERENCE = eINSTANCE.getGetPartyDefaultResponse_AccountingPreference();

	}

} //PartyPackage
