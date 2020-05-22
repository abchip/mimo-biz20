/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party;

import org.abchip.mimo.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
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
	int GET_PARTY_DEFAULT = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl <em>Get Party Default Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getGetPartyDefaultResponse()
	 * @generated
	 */
	int GET_PARTY_DEFAULT_RESPONSE = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl <em>Create Party Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMech()
	 * @generated
	 */
	int CREATE_PARTY_CONTACT_MECH = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Allow Solicitation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__ALLOW_SOLICITATION = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__COMMENTS = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_TYPE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__EXTENSION = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__FROM_DATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__INFO_STRING = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Months With Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__ROLE_TYPE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__THRU_DATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__VERIFIED = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Years With Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Create Party Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechResponseImpl <em>Create Party Contact Mech Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechResponseImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMechResponse()
	 * @generated
	 */
	int CREATE_PARTY_CONTACT_MECH_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_RESPONSE__CONTACT_MECH_ID = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Party Contact Mech Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeImpl <em>Create Party Contact Mech Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMechPurpose()
	 * @generated
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__FROM_DATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE__PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Party Contact Mech Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeResponseImpl <em>Create Party Contact Mech Purpose Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeResponseImpl
	 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMechPurposeResponse()
	 * @generated
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE__FROM_DATE = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Party Contact Mech Purpose Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARTY_DEFAULT_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

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
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech <em>Create Party Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Party Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech
	 * @generated
	 */
	EClass getCreatePartyContactMech();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getAllowSolicitation <em>Allow Solicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Solicitation</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getAllowSolicitation()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_AllowSolicitation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getComments()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getContactMechId()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getContactMechPurposeTypeId()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getContactMechTypeId()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_ContactMechTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getExtension()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getFromDate()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getInfoString <em>Info String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info String</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getInfoString()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_InfoString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getMonthsWithContactMech <em>Months With Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months With Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getMonthsWithContactMech()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_MonthsWithContactMech();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getPartyId()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getRoleTypeId()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getThruDate()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getVerified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getVerified()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_Verified();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMech#getYearsWithContactMech <em>Years With Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years With Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMech#getYearsWithContactMech()
	 * @see #getCreatePartyContactMech()
	 * @generated
	 */
	EAttribute getCreatePartyContactMech_YearsWithContactMech();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse <em>Create Party Contact Mech Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Party Contact Mech Response</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse
	 * @generated
	 */
	EClass getCreatePartyContactMechResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse#getContactMechId()
	 * @see #getCreatePartyContactMechResponse()
	 * @generated
	 */
	EAttribute getCreatePartyContactMechResponse_ContactMechId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose <em>Create Party Contact Mech Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Party Contact Mech Purpose</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose
	 * @generated
	 */
	EClass getCreatePartyContactMechPurpose();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getContactMechId()
	 * @see #getCreatePartyContactMechPurpose()
	 * @generated
	 */
	EAttribute getCreatePartyContactMechPurpose_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getContactMechPurposeTypeId()
	 * @see #getCreatePartyContactMechPurpose()
	 * @generated
	 */
	EAttribute getCreatePartyContactMechPurpose_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getFromDate()
	 * @see #getCreatePartyContactMechPurpose()
	 * @generated
	 */
	EAttribute getCreatePartyContactMechPurpose_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose#getPartyId()
	 * @see #getCreatePartyContactMechPurpose()
	 * @generated
	 */
	EAttribute getCreatePartyContactMechPurpose_PartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurposeResponse <em>Create Party Contact Mech Purpose Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Party Contact Mech Purpose Response</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurposeResponse
	 * @generated
	 */
	EClass getCreatePartyContactMechPurposeResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.party.CreatePartyContactMechPurposeResponse#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.service.party.CreatePartyContactMechPurposeResponse#getFromDate()
	 * @see #getCreatePartyContactMechPurposeResponse()
	 * @generated
	 */
	EAttribute getCreatePartyContactMechPurposeResponse_FromDate();

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

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl <em>Create Party Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl
		 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMech()
		 * @generated
		 */
		EClass CREATE_PARTY_CONTACT_MECH = eINSTANCE.getCreatePartyContactMech();

		/**
		 * The meta object literal for the '<em><b>Allow Solicitation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__ALLOW_SOLICITATION = eINSTANCE.getCreatePartyContactMech_AllowSolicitation();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__COMMENTS = eINSTANCE.getCreatePartyContactMech_Comments();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getCreatePartyContactMech_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getCreatePartyContactMech_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_TYPE_ID = eINSTANCE.getCreatePartyContactMech_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__EXTENSION = eINSTANCE.getCreatePartyContactMech_Extension();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__FROM_DATE = eINSTANCE.getCreatePartyContactMech_FromDate();

		/**
		 * The meta object literal for the '<em><b>Info String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__INFO_STRING = eINSTANCE.getCreatePartyContactMech_InfoString();

		/**
		 * The meta object literal for the '<em><b>Months With Contact Mech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH = eINSTANCE.getCreatePartyContactMech_MonthsWithContactMech();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__PARTY_ID = eINSTANCE.getCreatePartyContactMech_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__ROLE_TYPE_ID = eINSTANCE.getCreatePartyContactMech_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__THRU_DATE = eINSTANCE.getCreatePartyContactMech_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__VERIFIED = eINSTANCE.getCreatePartyContactMech_Verified();

		/**
		 * The meta object literal for the '<em><b>Years With Contact Mech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH = eINSTANCE.getCreatePartyContactMech_YearsWithContactMech();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechResponseImpl <em>Create Party Contact Mech Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechResponseImpl
		 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMechResponse()
		 * @generated
		 */
		EClass CREATE_PARTY_CONTACT_MECH_RESPONSE = eINSTANCE.getCreatePartyContactMechResponse();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH_RESPONSE__CONTACT_MECH_ID = eINSTANCE.getCreatePartyContactMechResponse_ContactMechId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeImpl <em>Create Party Contact Mech Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeImpl
		 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMechPurpose()
		 * @generated
		 */
		EClass CREATE_PARTY_CONTACT_MECH_PURPOSE = eINSTANCE.getCreatePartyContactMechPurpose();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID = eINSTANCE.getCreatePartyContactMechPurpose_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getCreatePartyContactMechPurpose_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH_PURPOSE__FROM_DATE = eINSTANCE.getCreatePartyContactMechPurpose_FromDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH_PURPOSE__PARTY_ID = eINSTANCE.getCreatePartyContactMechPurpose_PartyId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeResponseImpl <em>Create Party Contact Mech Purpose Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechPurposeResponseImpl
		 * @see org.abchip.mimo.biz.service.party.impl.PartyPackageImpl#getCreatePartyContactMechPurposeResponse()
		 * @generated
		 */
		EClass CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE = eINSTANCE.getCreatePartyContactMechPurposeResponse();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE__FROM_DATE = eINSTANCE.getCreatePartyContactMechPurposeResponse_FromDate();

	}

} //PartyPackage
