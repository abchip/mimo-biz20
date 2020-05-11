/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting;

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
 * @see org.abchip.mimo.biz.service.accounting.AccountingFactory
 * @model kind="package"
 * @generated
 */
public interface AccountingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accounting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/accounting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-accounting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingPackage eINSTANCE = org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusImpl <em>Set Payment Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetPaymentStatus()
	 * @generated
	 */
	int SET_PAYMENT_STATUS = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusResponseImpl <em>Set Payment Status Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusResponseImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetPaymentStatusResponse()
	 * @generated
	 */
	int SET_PAYMENT_STATUS_RESPONSE = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusImpl <em>Set Invoice Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetInvoiceStatus()
	 * @generated
	 */
	int SET_INVOICE_STATUS = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusResponseImpl <em>Set Invoice Status Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusResponseImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetInvoiceStatusResponse()
	 * @generated
	 */
	int SET_INVOICE_STATUS_RESPONSE = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefImpl <em>Update Payment Application Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getUpdatePaymentApplicationDef()
	 * @generated
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefResponseImpl <em>Update Payment Application Def Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefResponseImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getUpdatePaymentApplicationDefResponse()
	 * @generated
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE = 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.accounting.impl.Invoice_GetTotalImpl <em>Invoice Get Total</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.accounting.impl.Invoice_GetTotalImpl
	 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getInvoice_GetTotal()
	 * @generated
	 */
	int INVOICE_GET_TOTAL = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_GET_TOTAL__LOCALE = ServicePackage.SERVICE_METHOD_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_GET_TOTAL__TENANT = ServicePackage.SERVICE_METHOD_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_GET_TOTAL__CONTEXT = ServicePackage.SERVICE_METHOD_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_GET_TOTAL__USER_PROFILE = ServicePackage.SERVICE_METHOD_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_GET_TOTAL__ENTITY = ServicePackage.SERVICE_METHOD_REQUEST__ENTITY;

	/**
	 * The number of structural features of the '<em>Invoice Get Total</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_GET_TOTAL_FEATURE_COUNT = ServicePackage.SERVICE_METHOD_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__INVOICE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__PAID_DATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__STATUS_DATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS__STATUS_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set Invoice Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Invoice Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INVOICE_STATUS_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS__PAYMENT_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS__STATUS_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Payment Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The number of structural features of the '<em>Set Payment Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PAYMENT_STATUS_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF__INVOICE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF__PAYMENT_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Payment Application Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The number of structural features of the '<em>Update Payment Application Def Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.SetPaymentStatus <em>Set Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Payment Status</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetPaymentStatus
	 * @generated
	 */
	EClass getSetPaymentStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetPaymentStatus#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetPaymentStatus#getPaymentId()
	 * @see #getSetPaymentStatus()
	 * @generated
	 */
	EAttribute getSetPaymentStatus_PaymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetPaymentStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetPaymentStatus#getStatusId()
	 * @see #getSetPaymentStatus()
	 * @generated
	 */
	EAttribute getSetPaymentStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.SetPaymentStatusResponse <em>Set Payment Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Payment Status Response</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetPaymentStatusResponse
	 * @generated
	 */
	EClass getSetPaymentStatusResponse();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef <em>Update Payment Application Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Payment Application Def</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef
	 * @generated
	 */
	EClass getUpdatePaymentApplicationDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef#getInvoiceId()
	 * @see #getUpdatePaymentApplicationDef()
	 * @generated
	 */
	EAttribute getUpdatePaymentApplicationDef_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef#getPaymentId()
	 * @see #getUpdatePaymentApplicationDef()
	 * @generated
	 */
	EAttribute getUpdatePaymentApplicationDef_PaymentId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse <em>Update Payment Application Def Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Payment Application Def Response</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse
	 * @generated
	 */
	EClass getUpdatePaymentApplicationDefResponse();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.Invoice_GetTotal <em>Invoice Get Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Get Total</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.Invoice_GetTotal
	 * @generated
	 */
	EClass getInvoice_GetTotal();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus <em>Set Invoice Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Invoice Status</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatus
	 * @generated
	 */
	EClass getSetInvoiceStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getInvoiceId()
	 * @see #getSetInvoiceStatus()
	 * @generated
	 */
	EAttribute getSetInvoiceStatus_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getPaidDate <em>Paid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Date</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getPaidDate()
	 * @see #getSetInvoiceStatus()
	 * @generated
	 */
	EAttribute getSetInvoiceStatus_PaidDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusDate()
	 * @see #getSetInvoiceStatus()
	 * @generated
	 */
	EAttribute getSetInvoiceStatus_StatusDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusId()
	 * @see #getSetInvoiceStatus()
	 * @generated
	 */
	EAttribute getSetInvoiceStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse <em>Set Invoice Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Invoice Status Response</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse
	 * @generated
	 */
	EClass getSetInvoiceStatusResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getInvoiceTypeId()
	 * @see #getSetInvoiceStatusResponse()
	 * @generated
	 */
	EAttribute getSetInvoiceStatusResponse_InvoiceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getOldStatusId <em>Old Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getOldStatusId()
	 * @see #getSetInvoiceStatusResponse()
	 * @generated
	 */
	EAttribute getSetInvoiceStatusResponse_OldStatusId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountingFactory getAccountingFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusImpl <em>Set Payment Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetPaymentStatus()
		 * @generated
		 */
		EClass SET_PAYMENT_STATUS = eINSTANCE.getSetPaymentStatus();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PAYMENT_STATUS__PAYMENT_ID = eINSTANCE.getSetPaymentStatus_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PAYMENT_STATUS__STATUS_ID = eINSTANCE.getSetPaymentStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusResponseImpl <em>Set Payment Status Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusResponseImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetPaymentStatusResponse()
		 * @generated
		 */
		EClass SET_PAYMENT_STATUS_RESPONSE = eINSTANCE.getSetPaymentStatusResponse();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefImpl <em>Update Payment Application Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getUpdatePaymentApplicationDef()
		 * @generated
		 */
		EClass UPDATE_PAYMENT_APPLICATION_DEF = eINSTANCE.getUpdatePaymentApplicationDef();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_PAYMENT_APPLICATION_DEF__INVOICE_ID = eINSTANCE.getUpdatePaymentApplicationDef_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_PAYMENT_APPLICATION_DEF__PAYMENT_ID = eINSTANCE.getUpdatePaymentApplicationDef_PaymentId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefResponseImpl <em>Update Payment Application Def Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefResponseImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getUpdatePaymentApplicationDefResponse()
		 * @generated
		 */
		EClass UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE = eINSTANCE.getUpdatePaymentApplicationDefResponse();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.Invoice_GetTotalImpl <em>Invoice Get Total</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.Invoice_GetTotalImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getInvoice_GetTotal()
		 * @generated
		 */
		EClass INVOICE_GET_TOTAL = eINSTANCE.getInvoice_GetTotal();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusImpl <em>Set Invoice Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetInvoiceStatus()
		 * @generated
		 */
		EClass SET_INVOICE_STATUS = eINSTANCE.getSetInvoiceStatus();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INVOICE_STATUS__INVOICE_ID = eINSTANCE.getSetInvoiceStatus_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Paid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INVOICE_STATUS__PAID_DATE = eINSTANCE.getSetInvoiceStatus_PaidDate();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INVOICE_STATUS__STATUS_DATE = eINSTANCE.getSetInvoiceStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INVOICE_STATUS__STATUS_ID = eINSTANCE.getSetInvoiceStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusResponseImpl <em>Set Invoice Status Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusResponseImpl
		 * @see org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl#getSetInvoiceStatusResponse()
		 * @generated
		 */
		EClass SET_INVOICE_STATUS_RESPONSE = eINSTANCE.getSetInvoiceStatusResponse();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID = eINSTANCE.getSetInvoiceStatusResponse_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Old Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID = eINSTANCE.getSetInvoiceStatusResponse_OldStatusId();

	}

} //AccountingPackage
