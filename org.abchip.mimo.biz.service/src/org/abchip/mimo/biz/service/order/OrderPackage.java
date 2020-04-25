/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order;

import org.abchip.mimo.biz.service.BizServicePackage;

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
 * @see org.abchip.mimo.biz.service.order.OrderFactory
 * @model kind="package"
 * @generated
 */
public interface OrderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "order";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/order";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-order";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrderPackage eINSTANCE = org.abchip.mimo.biz.service.order.impl.OrderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl <em>Change Order Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl
	 * @see org.abchip.mimo.biz.service.order.impl.OrderPackageImpl#getChangeOrderStatus()
	 * @generated
	 */
	int CHANGE_ORDER_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__LOCALE = BizServicePackage.BIZ_SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__TENANT = BizServicePackage.BIZ_SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__CONTEXT = BizServicePackage.BIZ_SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__USER_LOGIN = BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Change Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__CHANGE_REASON = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__ORDER_ID = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set Item Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__SET_ITEM_STATUS = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS__STATUS_ID = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Change Order Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_FEATURE_COUNT = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl <em>Change Order Status Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl
	 * @see org.abchip.mimo.biz.service.order.impl.OrderPackageImpl#getChangeOrderStatusResponse()
	 * @generated
	 */
	int CHANGE_ORDER_STATUS_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__ERROR = BizServicePackage.BIZ_SERVICE_RESPONSE__ERROR;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__ERROR_MESSAGE = BizServicePackage.BIZ_SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__RESPONSE_MESSAGE = BizServicePackage.BIZ_SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__SUCCESS_MESSAGE = BizServicePackage.BIZ_SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needs Inventory Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Old Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Change Order Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_STATUS_RESPONSE_FEATURE_COUNT = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus <em>Change Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Order Status</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatus
	 * @generated
	 */
	EClass getChangeOrderStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getChangeReason <em>Change Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Reason</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatus#getChangeReason()
	 * @see #getChangeOrderStatus()
	 * @generated
	 */
	EAttribute getChangeOrderStatus_ChangeReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatus#getOrderId()
	 * @see #getChangeOrderStatus()
	 * @generated
	 */
	EAttribute getChangeOrderStatus_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#isSetItemStatus <em>Set Item Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Item Status</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatus#isSetItemStatus()
	 * @see #getChangeOrderStatus()
	 * @generated
	 */
	EAttribute getChangeOrderStatus_SetItemStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatus#getStatusId()
	 * @see #getChangeOrderStatus()
	 * @generated
	 */
	EAttribute getChangeOrderStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse <em>Change Order Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Order Status Response</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse
	 * @generated
	 */
	EClass getChangeOrderStatusResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getGrandTotal()
	 * @see #getChangeOrderStatusResponse()
	 * @generated
	 */
	EAttribute getChangeOrderStatusResponse_GrandTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Inventory Issuance</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getNeedsInventoryIssuance()
	 * @see #getChangeOrderStatusResponse()
	 * @generated
	 */
	EAttribute getChangeOrderStatusResponse_NeedsInventoryIssuance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOldStatusId <em>Old Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOldStatusId()
	 * @see #getChangeOrderStatusResponse()
	 * @generated
	 */
	EAttribute getChangeOrderStatusResponse_OldStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderStatusId <em>Order Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Status Id</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderStatusId()
	 * @see #getChangeOrderStatusResponse()
	 * @generated
	 */
	EAttribute getChangeOrderStatusResponse_OrderStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderTypeId <em>Order Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type Id</em>'.
	 * @see org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderTypeId()
	 * @see #getChangeOrderStatusResponse()
	 * @generated
	 */
	EAttribute getChangeOrderStatusResponse_OrderTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrderFactory getOrderFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl <em>Change Order Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl
		 * @see org.abchip.mimo.biz.service.order.impl.OrderPackageImpl#getChangeOrderStatus()
		 * @generated
		 */
		EClass CHANGE_ORDER_STATUS = eINSTANCE.getChangeOrderStatus();

		/**
		 * The meta object literal for the '<em><b>Change Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS__CHANGE_REASON = eINSTANCE.getChangeOrderStatus_ChangeReason();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS__ORDER_ID = eINSTANCE.getChangeOrderStatus_OrderId();

		/**
		 * The meta object literal for the '<em><b>Set Item Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS__SET_ITEM_STATUS = eINSTANCE.getChangeOrderStatus_SetItemStatus();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS__STATUS_ID = eINSTANCE.getChangeOrderStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl <em>Change Order Status Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl
		 * @see org.abchip.mimo.biz.service.order.impl.OrderPackageImpl#getChangeOrderStatusResponse()
		 * @generated
		 */
		EClass CHANGE_ORDER_STATUS_RESPONSE = eINSTANCE.getChangeOrderStatusResponse();

		/**
		 * The meta object literal for the '<em><b>Grand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL = eINSTANCE.getChangeOrderStatusResponse_GrandTotal();

		/**
		 * The meta object literal for the '<em><b>Needs Inventory Issuance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE = eINSTANCE.getChangeOrderStatusResponse_NeedsInventoryIssuance();

		/**
		 * The meta object literal for the '<em><b>Old Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID = eINSTANCE.getChangeOrderStatusResponse_OldStatusId();

		/**
		 * The meta object literal for the '<em><b>Order Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID = eINSTANCE.getChangeOrderStatusResponse_OrderStatusId();

		/**
		 * The meta object literal for the '<em><b>Order Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID = eINSTANCE.getChangeOrderStatusResponse_OrderTypeId();

	}

} //OrderPackage
