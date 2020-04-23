/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service;

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
 * @see org.abchip.mimo.biz.service.BizServiceFactory
 * @model kind="package"
 * @generated
 */
public interface BizServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BizServicePackage eINSTANCE = org.abchip.mimo.biz.service.impl.BizServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.impl.BizServiceRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.impl.BizServiceRequestImpl
	 * @see org.abchip.mimo.biz.service.impl.BizServicePackageImpl#getBizServiceRequest()
	 * @generated
	 */
	int BIZ_SERVICE_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_REQUEST__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_REQUEST__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_REQUEST__LOCALE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_REQUEST__USER_LOGIN = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_REQUEST_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.impl.BizServiceResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.impl.BizServiceResponseImpl
	 * @see org.abchip.mimo.biz.service.impl.BizServicePackageImpl#getBizServiceResponse()
	 * @generated
	 */
	int BIZ_SERVICE_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_RESPONSE__CONTEXT = ServicePackage.SERVICE_RESPONSE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_RESPONSE__LOCALE = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_RESPONSE__USER_LOGIN = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_SERVICE_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.BizServiceRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.abchip.mimo.biz.service.BizServiceRequest
	 * @generated
	 */
	EClass getBizServiceRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.BizServiceRequest#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see org.abchip.mimo.biz.service.BizServiceRequest#getLocale()
	 * @see #getBizServiceRequest()
	 * @generated
	 */
	EAttribute getBizServiceRequest_Locale();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.biz.service.BizServiceRequest#getUserLogin <em>User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Login</em>'.
	 * @see org.abchip.mimo.biz.service.BizServiceRequest#getUserLogin()
	 * @see #getBizServiceRequest()
	 * @generated
	 */
	EReference getBizServiceRequest_UserLogin();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.BizServiceResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.abchip.mimo.biz.service.BizServiceResponse
	 * @generated
	 */
	EClass getBizServiceResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.BizServiceResponse#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see org.abchip.mimo.biz.service.BizServiceResponse#getLocale()
	 * @see #getBizServiceResponse()
	 * @generated
	 */
	EAttribute getBizServiceResponse_Locale();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.biz.service.BizServiceResponse#getUserLogin <em>User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Login</em>'.
	 * @see org.abchip.mimo.biz.service.BizServiceResponse#getUserLogin()
	 * @see #getBizServiceResponse()
	 * @generated
	 */
	EReference getBizServiceResponse_UserLogin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BizServiceFactory getBizServiceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.impl.BizServiceRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.impl.BizServiceRequestImpl
		 * @see org.abchip.mimo.biz.service.impl.BizServicePackageImpl#getBizServiceRequest()
		 * @generated
		 */
		EClass BIZ_SERVICE_REQUEST = eINSTANCE.getBizServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_SERVICE_REQUEST__LOCALE = eINSTANCE.getBizServiceRequest_Locale();

		/**
		 * The meta object literal for the '<em><b>User Login</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIZ_SERVICE_REQUEST__USER_LOGIN = eINSTANCE.getBizServiceRequest_UserLogin();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.impl.BizServiceResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.impl.BizServiceResponseImpl
		 * @see org.abchip.mimo.biz.service.impl.BizServicePackageImpl#getBizServiceResponse()
		 * @generated
		 */
		EClass BIZ_SERVICE_RESPONSE = eINSTANCE.getBizServiceResponse();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_SERVICE_RESPONSE__LOCALE = eINSTANCE.getBizServiceResponse_Locale();

		/**
		 * The meta object literal for the '<em><b>User Login</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIZ_SERVICE_RESPONSE__USER_LOGIN = eINSTANCE.getBizServiceResponse_UserLogin();

	}

} //BizServicePackage
