/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.common;

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
 * @see org.abchip.mimo.biz.service.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.abchip.mimo.biz.service.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.common.impl.GetCommonDefaultImpl <em>Get Common Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.common.impl.GetCommonDefaultImpl
	 * @see org.abchip.mimo.biz.service.common.impl.CommonPackageImpl#getGetCommonDefault()
	 * @generated
	 */
	int GET_COMMON_DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The number of structural features of the '<em>Get Common Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.common.impl.GetCommonDefaultResponseImpl <em>Get Common Default Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.common.impl.GetCommonDefaultResponseImpl
	 * @see org.abchip.mimo.biz.service.common.impl.CommonPackageImpl#getGetCommonDefaultResponse()
	 * @generated
	 */
	int GET_COMMON_DEFAULT_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT_RESPONSE__CURRENCY_UOM = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT_RESPONSE__COUNTRY_GEO = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Common Default Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMMON_DEFAULT_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.common.GetCommonDefault <em>Get Common Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Common Default</em>'.
	 * @see org.abchip.mimo.biz.service.common.GetCommonDefault
	 * @generated
	 */
	EClass getGetCommonDefault();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse <em>Get Common Default Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Common Default Response</em>'.
	 * @see org.abchip.mimo.biz.service.common.GetCommonDefaultResponse
	 * @generated
	 */
	EClass getGetCommonDefaultResponse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCurrencyUom()
	 * @see #getGetCommonDefaultResponse()
	 * @generated
	 */
	EReference getGetCommonDefaultResponse_CurrencyUom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCountryGeo <em>Country Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country Geo</em>'.
	 * @see org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCountryGeo()
	 * @see #getGetCommonDefaultResponse()
	 * @generated
	 */
	EReference getGetCommonDefaultResponse_CountryGeo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.common.impl.GetCommonDefaultImpl <em>Get Common Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.common.impl.GetCommonDefaultImpl
		 * @see org.abchip.mimo.biz.service.common.impl.CommonPackageImpl#getGetCommonDefault()
		 * @generated
		 */
		EClass GET_COMMON_DEFAULT = eINSTANCE.getGetCommonDefault();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.common.impl.GetCommonDefaultResponseImpl <em>Get Common Default Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.common.impl.GetCommonDefaultResponseImpl
		 * @see org.abchip.mimo.biz.service.common.impl.CommonPackageImpl#getGetCommonDefaultResponse()
		 * @generated
		 */
		EClass GET_COMMON_DEFAULT_RESPONSE = eINSTANCE.getGetCommonDefaultResponse();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COMMON_DEFAULT_RESPONSE__CURRENCY_UOM = eINSTANCE.getGetCommonDefaultResponse_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Country Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COMMON_DEFAULT_RESPONSE__COUNTRY_GEO = eINSTANCE.getGetCommonDefaultResponse_CountryGeo();

	}

} //CommonPackage
