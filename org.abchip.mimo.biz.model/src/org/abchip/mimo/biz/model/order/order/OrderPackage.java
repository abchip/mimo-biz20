/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.EntityPackage;
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
 * @see org.abchip.mimo.biz.model.order.order.OrderFactory
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
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/order/order";

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
	OrderPackage eINSTANCE = org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.CommunicationEventOrderImpl <em>Communication Event Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.CommunicationEventOrderImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getCommunicationEventOrder()
	 * @generated
	 */
	int COMMUNICATION_EVENT_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER__COMMUNICATION_EVENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Communication Event Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ORDER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentImpl <em>Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustment()
	 * @generated
	 */
	int ORDER_ADJUSTMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount Already Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__EXEMPT_AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__INCLUDE_IN_TAX = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__IS_MANUAL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Old Amount Per Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Old Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__OLD_PERCENTAGE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Order Adjustment Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Order Adjustment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Original Adjustment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Primary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__PRIMARY_GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__PRODUCT_PROMO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Recurring Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__RECURRING_AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Secondary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__SECONDARY_GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__SOURCE_PERCENTAGE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 40;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentAttributeImpl <em>Adjustment Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentAttribute()
	 * @generated
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Adjustment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__ORDER_ADJUSTMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Adjustment Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentBillingImpl <em>Adjustment Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentBillingImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentBilling()
	 * @generated
	 */
	int ORDER_ADJUSTMENT_BILLING = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Adjustment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__ORDER_ADJUSTMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Adjustment Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_BILLING_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeImpl <em>Adjustment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentType()
	 * @generated
	 */
	int ORDER_ADJUSTMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Adjustment Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeAttrImpl <em>Adjustment Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentTypeAttr()
	 * @generated
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Adjustment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__ORDER_ADJUSTMENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Adjustment Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ADJUSTMENT_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAttribute()
	 * @generated
	 */
	int ORDER_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistImpl <em>Blacklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderBlacklist()
	 * @generated
	 */
	int ORDER_BLACKLIST = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Blacklist Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blacklist String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST__BLACKLIST_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Blacklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistTypeImpl <em>Blacklist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistTypeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderBlacklistType()
	 * @generated
	 */
	int ORDER_BLACKLIST_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Blacklist Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__ORDER_BLACKLIST_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Blacklist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BLACKLIST_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderContactMechImpl <em>Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderContactMechImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderContactMech()
	 * @generated
	 */
	int ORDER_CONTACT_MECH = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTACT_MECH_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderContentImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderContent()
	 * @generated
	 */
	int ORDER_CONTENT = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__ORDER_CONTENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderContentTypeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderContentType()
	 * @generated
	 */
	int ORDER_CONTENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__ORDER_CONTENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONTENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl <em>Delivery Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderDeliverySchedule()
	 * @generated
	 */
	int ORDER_DELIVERY_SCHEDULE = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cartons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__CARTONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estimated Ready Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Skids Pallets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Total Cubic Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Total Cubic Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Total Weight Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Units Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE__UNITS_PIECES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Delivery Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_SCHEDULE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderHeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderHeaderImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderHeader()
	 * @generated
	 */
	int ORDER_HEADER = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__AGREEMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Order Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__BILLING_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Communication Event Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__COMMUNICATION_EVENT_ORDERS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__CREATED_BY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ENTRY_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__EXTERNAL_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>First Attempt Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__GRAND_TOTAL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Internal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__INTERNAL_CODE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Invoice Per Shipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__INVOICE_PER_SHIPMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Rush Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__IS_RUSH_ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Is Viewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__IS_VIEWED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Needs Inventory Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Order Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Order Delivery Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_DELIVERY_SCHEDULES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Order Header Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_HEADER_NOTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Order Header Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Order Item Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_ITEM_GROUPS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Order Item Ship Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Order Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_ITEMS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Order Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Order Product Promo Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORDER_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Origin Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__ORIGIN_FACILITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Pick Sheet Printed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__PICK_SHEET_PRINTED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__PRIORITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Product Promo Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__PRODUCT_PROMO_USES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__PRODUCT_STORE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Remaining Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__REMAINING_SUB_TOTAL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Sales Channel Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__SALES_CHANNEL_ENUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Sync Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__SYNC_STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Terminal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__TERMINAL_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Tracking Code Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__TRACKING_CODE_ORDERS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__TRANSACTION_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__VISIT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER__WEB_SITE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 44;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 45;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderHeaderNoteImpl <em>Header Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderHeaderNoteImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderHeaderNote()
	 * @generated
	 */
	int ORDER_HEADER_NOTE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__ORDER = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE__INTERNAL_NOTE = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderHeaderWorkEffortImpl <em>Header Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderHeaderWorkEffortImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderHeaderWorkEffort()
	 * @generated
	 */
	int ORDER_HEADER_WORK_EFFORT = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Header Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HEADER_WORK_EFFORT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItem()
	 * @generated
	 */
	int ORDER_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Cancel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__AUTO_CANCEL_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__BUDGET_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__BUDGET_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cancel Back Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__CANCEL_BACK_ORDER_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__CANCEL_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Corresponding Po Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__CORRESPONDING_PO_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Deployment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__DEPLOYMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Dont Cancel Set Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__DONT_CANCEL_SET_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Dont Cancel Set User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ESTIMATED_DELIVERY_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ESTIMATED_SHIP_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__EXTERNAL_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>From Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__FROM_INVENTORY_ITEM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Is Item Group Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__IS_ITEM_GROUP_PRIMARY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Is Modified Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__IS_MODIFIED_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Is Promo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__IS_PROMO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ITEM_DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Order Item Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Order Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__ORDER_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__OVERRIDE_GL_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Prod Catalog Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__PROD_CATALOG_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__PRODUCT_CATEGORY_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__PRODUCT_FEATURE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__QUOTE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__QUOTE_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Recurring Freq Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__RECURRING_FREQ_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Reserve After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__RESERVE_AFTER_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SALES_OPPORTUNITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SELECTED_AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Ship After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SHIP_AFTER_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Ship Before Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SHIP_BEFORE_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SHOPPING_LIST_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SUBSCRIPTION_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Supplier Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SUPPLIER_PRODUCT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Sync Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__SYNC_STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Unit Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__UNIT_AVERAGE_COST = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Unit List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__UNIT_LIST_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__UNIT_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Unit Recurring Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM__UNIT_RECURRING_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 50;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 51;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocImpl <em>Item Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemAssoc()
	 * @generated
	 */
	int ORDER_ITEM_ASSOC = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Item Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>To Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__TO_ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>To Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>To Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC__QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Item Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocTypeImpl <em>Item Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocTypeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemAssocType()
	 * @generated
	 */
	int ORDER_ITEM_ASSOC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Item Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__ORDER_ITEM_ASSOC_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ASSOC_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemAttributeImpl <em>Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemAttribute()
	 * @generated
	 */
	int ORDER_ITEM_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__ORDER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemBillingImpl <em>Item Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemBillingImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemBilling()
	 * @generated
	 */
	int ORDER_ITEM_BILLING = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Item Issuance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__ITEM_ISSUANCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Shipment Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING__SHIPMENT_RECEIPT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Item Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_BILLING_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl <em>Item Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemChange()
	 * @generated
	 */
	int ORDER_ITEM_CHANGE = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Item Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CANCEL_QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Change Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CHANGE_COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CHANGE_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Change Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Change User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__ITEM_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__REASON_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE__UNIT_PRICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Item Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CHANGE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemContactMechImpl <em>Item Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemContactMechImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemContactMech()
	 * @generated
	 */
	int ORDER_ITEM_CONTACT_MECH = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH__CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_CONTACT_MECH_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupImpl <em>Item Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemGroup()
	 * @generated
	 */
	int ORDER_ITEM_GROUP = 23;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Item Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__GROUP_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupOrderImpl <em>Item Group Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupOrderImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemGroupOrder()
	 * @generated
	 */
	int ORDER_ITEM_GROUP_ORDER = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__GROUP_ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__ORDER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Group Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_GROUP_ORDER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl <em>Item Price Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemPriceInfo()
	 * @generated
	 */
	int ORDER_ITEM_PRICE_INFO = 25;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Item Price Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modify Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Price Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Price Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO__RATE_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Item Price Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_PRICE_INFO_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemRoleImpl <em>Item Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemRoleImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemRole()
	 * @generated
	 */
	int ORDER_ITEM_ROLE = 26;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupImpl <em>Item Ship Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemShipGroup()
	 * @generated
	 */
	int ORDER_ITEM_SHIP_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Carrier Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__FACILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gift Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Gift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__IS_GIFT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>May Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__MAY_SPLIT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Ship After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ship By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Shipment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Shipping Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Supplier Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Supplier Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Telecom Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Tracking Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Vendor Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Item Ship Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupAssocImpl <em>Item Ship Group Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupAssocImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemShipGroupAssoc()
	 * @generated
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC = 28;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__CANCEL_QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Ship Group Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GROUP_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl <em>Item Ship Grp Inv Res</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemShipGrpInvRes()
	 * @generated
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES = 29;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Current Promised Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Old Pick Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Promised Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Quantity Not Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reserve Order Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reserved Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Item Ship Grp Inv Res</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_SHIP_GRP_INV_RES_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemType()
	 * @generated
	 */
	int ORDER_ITEM_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeAttrImpl <em>Item Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemTypeAttr()
	 * @generated
	 */
	int ORDER_ITEM_TYPE_ATTR = 31;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__ORDER_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEM_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderNotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderNotificationImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderNotification()
	 * @generated
	 */
	int ORDER_NOTIFICATION = 32;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Notification Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Email Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__EMAIL_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Notification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__NOTIFICATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_NOTIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl <em>Payment Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderPaymentPreference()
	 * @generated
	 */
	int ORDER_PAYMENT_PREFERENCE = 33;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Payment Preference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Billing Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__CREATED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Manual Auth Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Manual Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Needs Nsf Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Overflow Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Payment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Present Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Process Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Product Price Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Security Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__SECURITY_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Swiped Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Track2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE__TRACK2 = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Payment Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PAYMENT_PREFERENCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 28;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderProductPromoCodeImpl <em>Product Promo Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderProductPromoCodeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderProductPromoCode()
	 * @generated
	 */
	int ORDER_PRODUCT_PROMO_CODE = 34;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Promo Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_PROMO_CODE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderRoleImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderRole()
	 * @generated
	 */
	int ORDER_ROLE = 35;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderShipmentImpl <em>Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderShipmentImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderShipment()
	 * @generated
	 */
	int ORDER_SHIPMENT = 36;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__SHIPMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__SHIPMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SHIPMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderStatusImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 37;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ORDER_STATUS_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Change Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__CHANGE_REASON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order Payment Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__ORDER_PAYMENT_PREFERENCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__STATUS_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Status User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS__STATUS_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderSummaryEntryImpl <em>Summary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderSummaryEntryImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderSummaryEntry()
	 * @generated
	 */
	int ORDER_SUMMARY_ENTRY = 38;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__FACILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__ENTRY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gross Sales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__GROSS_SALES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__PRODUCT_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Total Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Summary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SUMMARY_ENTRY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTermImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderTerm()
	 * @generated
	 */
	int ORDER_TERM = 39;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__TERM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__TERM_DAYS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__TERM_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__TEXT_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM__UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTermAttributeImpl <em>Term Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTermAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderTermAttribute()
	 * @generated
	 */
	int ORDER_TERM_ATTRIBUTE = 40;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__ORDER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__TERM_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Term Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TERM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTypeImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__ORDER_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__ORDER_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderTypeAttr()
	 * @generated
	 */
	int ORDER_TYPE_ATTR = 42;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__ORDER_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.ProductOrderItemImpl <em>Product Order Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.ProductOrderItemImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getProductOrderItem()
	 * @generated
	 */
	int PRODUCT_ORDER_ITEM = 43;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Engagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__ENGAGEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Engagement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product Order Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.order.impl.WorkOrderItemFulfillmentImpl <em>Work Order Item Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.order.impl.WorkOrderItemFulfillmentImpl
	 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getWorkOrderItemFulfillment()
	 * @generated
	 */
	int WORK_ORDER_ITEM_FULFILLMENT = 44;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Work Order Item Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_ORDER_ITEM_FULFILLMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.CommunicationEventOrder <em>Communication Event Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Event Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.CommunicationEventOrder
	 * @generated
	 */
	EClass getCommunicationEventOrder();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.CommunicationEventOrder#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.CommunicationEventOrder#getOrder()
	 * @see #getCommunicationEventOrder()
	 * @generated
	 */
	EReference getCommunicationEventOrder_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.CommunicationEventOrder#getCommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.CommunicationEventOrder#getCommunicationEvent()
	 * @see #getCommunicationEventOrder()
	 * @generated
	 */
	EReference getCommunicationEventOrder_CommunicationEvent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment
	 * @generated
	 */
	EClass getOrderAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderAdjustmentId <em>Order Adjustment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Adjustment Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderAdjustmentId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_OrderAdjustmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getAmount()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getAmountAlreadyIncluded <em>Amount Already Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Already Included</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getAmountAlreadyIncluded()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_AmountAlreadyIncluded();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getComments()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCorrespondingProductId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_CorrespondingProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCreatedByUserLogin()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCreatedDate()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getCustomerReferenceId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_CustomerReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getDescription()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getExemptAmount <em>Exempt Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getExemptAmount()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_ExemptAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getIncludeInShipping <em>Include In Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Shipping</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getIncludeInShipping()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_IncludeInShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getIncludeInTax <em>Include In Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Tax</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getIncludeInTax()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_IncludeInTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getIsManual <em>Is Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Manual</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getIsManual()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_IsManual();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getLastModifiedByUserLogin()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getLastModifiedDate()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOldAmountPerQuantity <em>Old Amount Per Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Amount Per Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOldAmountPerQuantity()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_OldAmountPerQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOldPercentage <em>Old Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOldPercentage()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_OldPercentage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrder()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_Order();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderAdjustmentAttributes <em>Order Adjustment Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Adjustment Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderAdjustmentAttributes()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_OrderAdjustmentAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderAdjustmentType <em>Order Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderAdjustmentType()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_OrderAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOrderItemSeqId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOriginalAdjustment <em>Original Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOriginalAdjustment()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_OriginalAdjustment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOverrideGlAccount <em>Override Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getOverrideGlAccount()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_OverrideGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getPrimaryGeo <em>Primary Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Geo</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getPrimaryGeo()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_PrimaryGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductFeatureId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductPromo()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductPromoActionSeqId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getProductPromoRuleId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_ProductPromoRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getRecurringAmount <em>Recurring Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurring Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getRecurringAmount()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_RecurringAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getSecondaryGeo <em>Secondary Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Geo</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getSecondaryGeo()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_SecondaryGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getShipGroupSeqId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getSourcePercentage <em>Source Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getSourcePercentage()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_SourcePercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getSourceReferenceId <em>Source Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getSourceReferenceId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_SourceReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getTaxAuthGeoId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getTaxAuthPartyId()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EAttribute getOrderAdjustment_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustment#getTaxAuthorityRateSeq <em>Tax Authority Rate Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Rate Seq</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustment#getTaxAuthorityRateSeq()
	 * @see #getOrderAdjustment()
	 * @generated
	 */
	EReference getOrderAdjustment_TaxAuthorityRateSeq();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute <em>Adjustment Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute
	 * @generated
	 */
	EClass getOrderAdjustmentAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getOrderAdjustment <em>Order Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getOrderAdjustment()
	 * @see #getOrderAdjustmentAttribute()
	 * @generated
	 */
	EReference getOrderAdjustmentAttribute_OrderAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getAttrName()
	 * @see #getOrderAdjustmentAttribute()
	 * @generated
	 */
	EAttribute getOrderAdjustmentAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getAttrDescription()
	 * @see #getOrderAdjustmentAttribute()
	 * @generated
	 */
	EAttribute getOrderAdjustmentAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute#getAttrValue()
	 * @see #getOrderAdjustmentAttribute()
	 * @generated
	 */
	EAttribute getOrderAdjustmentAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling <em>Adjustment Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Billing</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling
	 * @generated
	 */
	EClass getOrderAdjustmentBilling();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getOrderAdjustment <em>Order Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getOrderAdjustment()
	 * @see #getOrderAdjustmentBilling()
	 * @generated
	 */
	EReference getOrderAdjustmentBilling_OrderAdjustment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getInvoice()
	 * @see #getOrderAdjustmentBilling()
	 * @generated
	 */
	EReference getOrderAdjustmentBilling_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getInvoiceItemSeqId()
	 * @see #getOrderAdjustmentBilling()
	 * @generated
	 */
	EAttribute getOrderAdjustmentBilling_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling#getAmount()
	 * @see #getOrderAdjustmentBilling()
	 * @generated
	 */
	EAttribute getOrderAdjustmentBilling_Amount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentType
	 * @generated
	 */
	EClass getOrderAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Adjustment Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeId()
	 * @see #getOrderAdjustmentType()
	 * @generated
	 */
	EAttribute getOrderAdjustmentType_OrderAdjustmentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getDescription()
	 * @see #getOrderAdjustmentType()
	 * @generated
	 */
	EAttribute getOrderAdjustmentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getHasTable()
	 * @see #getOrderAdjustmentType()
	 * @generated
	 */
	EAttribute getOrderAdjustmentType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeAttrs <em>Order Adjustment Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Adjustment Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeAttrs()
	 * @see #getOrderAdjustmentType()
	 * @generated
	 */
	EReference getOrderAdjustmentType_OrderAdjustmentTypeAttrs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getParentType()
	 * @see #getOrderAdjustmentType()
	 * @generated
	 */
	EReference getOrderAdjustmentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr <em>Adjustment Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr
	 * @generated
	 */
	EClass getOrderAdjustmentTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr#getOrderAdjustmentType <em>Order Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr#getOrderAdjustmentType()
	 * @see #getOrderAdjustmentTypeAttr()
	 * @generated
	 */
	EReference getOrderAdjustmentTypeAttr_OrderAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr#getAttrName()
	 * @see #getOrderAdjustmentTypeAttr()
	 * @generated
	 */
	EAttribute getOrderAdjustmentTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr#getDescription()
	 * @see #getOrderAdjustmentTypeAttr()
	 * @generated
	 */
	EAttribute getOrderAdjustmentTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAttribute
	 * @generated
	 */
	EClass getOrderAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderAttribute#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAttribute#getOrder()
	 * @see #getOrderAttribute()
	 * @generated
	 */
	EReference getOrderAttribute_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAttribute#getAttrName()
	 * @see #getOrderAttribute()
	 * @generated
	 */
	EAttribute getOrderAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAttribute#getAttrDescription()
	 * @see #getOrderAttribute()
	 * @generated
	 */
	EAttribute getOrderAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderAttribute#getAttrValue()
	 * @see #getOrderAttribute()
	 * @generated
	 */
	EAttribute getOrderAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist <em>Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blacklist</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderBlacklist
	 * @generated
	 */
	EClass getOrderBlacklist();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist#getOrderBlacklistType <em>Order Blacklist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Blacklist Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderBlacklist#getOrderBlacklistType()
	 * @see #getOrderBlacklist()
	 * @generated
	 */
	EReference getOrderBlacklist_OrderBlacklistType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist#getBlacklistString <em>Blacklist String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blacklist String</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderBlacklist#getBlacklistString()
	 * @see #getOrderBlacklist()
	 * @generated
	 */
	EAttribute getOrderBlacklist_BlacklistString();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklistType <em>Blacklist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blacklist Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderBlacklistType
	 * @generated
	 */
	EClass getOrderBlacklistType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklistType#getOrderBlacklistTypeId <em>Order Blacklist Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Blacklist Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderBlacklistType#getOrderBlacklistTypeId()
	 * @see #getOrderBlacklistType()
	 * @generated
	 */
	EAttribute getOrderBlacklistType_OrderBlacklistTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklistType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderBlacklistType#getDescription()
	 * @see #getOrderBlacklistType()
	 * @generated
	 */
	EAttribute getOrderBlacklistType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContactMech
	 * @generated
	 */
	EClass getOrderContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContactMech#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContactMech#getOrder()
	 * @see #getOrderContactMech()
	 * @generated
	 */
	EReference getOrderContactMech_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContactMech#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContactMech#getContactMech()
	 * @see #getOrderContactMech()
	 * @generated
	 */
	EReference getOrderContactMech_ContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContactMech#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContactMech#getContactMechPurposeType()
	 * @see #getOrderContactMech()
	 * @generated
	 */
	EReference getOrderContactMech_ContactMechPurposeType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent
	 * @generated
	 */
	EClass getOrderContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContent#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent#getOrder()
	 * @see #getOrderContent()
	 * @generated
	 */
	EReference getOrderContent_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent#getContent()
	 * @see #getOrderContent()
	 * @generated
	 */
	EReference getOrderContent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContent#getOrderContentType <em>Order Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent#getOrderContentType()
	 * @see #getOrderContent()
	 * @generated
	 */
	EReference getOrderContent_OrderContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderContent#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent#getOrderItemSeqId()
	 * @see #getOrderContent()
	 * @generated
	 */
	EAttribute getOrderContent_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent#getFromDate()
	 * @see #getOrderContent()
	 * @generated
	 */
	EAttribute getOrderContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContent#getThruDate()
	 * @see #getOrderContent()
	 * @generated
	 */
	EAttribute getOrderContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContentType
	 * @generated
	 */
	EClass getOrderContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderContentType#getOrderContentTypeId <em>Order Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContentType#getOrderContentTypeId()
	 * @see #getOrderContentType()
	 * @generated
	 */
	EAttribute getOrderContentType_OrderContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContentType#getDescription()
	 * @see #getOrderContentType()
	 * @generated
	 */
	EAttribute getOrderContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderContentType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContentType#getHasTable()
	 * @see #getOrderContentType()
	 * @generated
	 */
	EAttribute getOrderContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderContentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderContentType#getParentType()
	 * @see #getOrderContentType()
	 * @generated
	 */
	EReference getOrderContentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule <em>Delivery Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Schedule</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule
	 * @generated
	 */
	EClass getOrderDeliverySchedule();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrder()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EReference getOrderDeliverySchedule_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrderItemSeqId()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getCartons <em>Cartons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cartons</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getCartons()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_Cartons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getEstimatedReadyDate <em>Estimated Ready Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Ready Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getEstimatedReadyDate()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_EstimatedReadyDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getSkidsPallets <em>Skids Pallets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skids Pallets</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getSkidsPallets()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_SkidsPallets();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getStatus()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EReference getOrderDeliverySchedule_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicSize <em>Total Cubic Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cubic Size</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicSize()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_TotalCubicSize();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicUom <em>Total Cubic Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Total Cubic Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicUom()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EReference getOrderDeliverySchedule_TotalCubicUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeight <em>Total Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Weight</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeight()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_TotalWeight();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeightUom <em>Total Weight Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Total Weight Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeightUom()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EReference getOrderDeliverySchedule_TotalWeightUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getUnitsPieces <em>Units Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units Pieces</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getUnitsPieces()
	 * @see #getOrderDeliverySchedule()
	 * @generated
	 */
	EAttribute getOrderDeliverySchedule_UnitsPieces();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader
	 * @generated
	 */
	EClass getOrderHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getAgreementId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_AgreementId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getAutoOrderShoppingList <em>Auto Order Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Order Shopping List</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getAutoOrderShoppingList()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_AutoOrderShoppingList();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getBillingAccount <em>Billing Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getBillingAccount()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_BillingAccount();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCommunicationEventOrders <em>Communication Event Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Orders</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getCommunicationEventOrders()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_CommunicationEventOrders();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getCreatedBy()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_CreatedBy();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getCurrencyUom()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getEntryDate()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_EntryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getExternalId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_ExternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getFirstAttemptOrderId <em>First Attempt Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Attempt Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getFirstAttemptOrderId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_FirstAttemptOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getGrandTotal()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_GrandTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getInternalCode <em>Internal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getInternalCode()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_InternalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isInvoicePerShipment <em>Invoice Per Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Per Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#isInvoicePerShipment()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_InvoicePerShipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isIsRushOrder <em>Is Rush Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Rush Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#isIsRushOrder()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_IsRushOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isIsViewed <em>Is Viewed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Viewed</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#isIsViewed()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_IsViewed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Inventory Issuance</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#isNeedsInventoryIssuance()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_NeedsInventoryIssuance();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderAttributes <em>Order Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderAttributes()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDate()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_OrderDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDeliverySchedules <em>Order Delivery Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Delivery Schedules</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDeliverySchedules()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderDeliverySchedules();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderHeaderNotes <em>Order Header Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Header Notes</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderHeaderNotes()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderHeaderNotes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderHeaderWorkEfforts <em>Order Header Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Header Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderHeaderWorkEfforts()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderHeaderWorkEfforts();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItemGroups <em>Order Item Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Item Groups</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItemGroups()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderItemGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItemShipGroups <em>Order Item Ship Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Item Ship Groups</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItemShipGroups()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderItemShipGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItems <em>Order Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Items</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItems()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderName <em>Order Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderName()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_OrderName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderProductPromoCodes <em>Order Product Promo Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Product Promo Codes</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderProductPromoCodes()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderProductPromoCodes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderType()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OrderType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOriginFacility <em>Origin Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Facility</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getOriginFacility()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_OriginFacility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getPickSheetPrintedDate <em>Pick Sheet Printed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pick Sheet Printed Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getPickSheetPrintedDate()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_PickSheetPrintedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getPriority()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_Priority();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getProductPromoUses <em>Product Promo Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Promo Uses</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getProductPromoUses()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_ProductPromoUses();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getProductStore()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getRemainingSubTotal <em>Remaining Sub Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Sub Total</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getRemainingSubTotal()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_RemainingSubTotal();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getSalesChannelEnum <em>Sales Channel Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Channel Enum</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getSalesChannelEnum()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_SalesChannelEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getStatus()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getSyncStatus <em>Sync Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sync Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getSyncStatus()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_SyncStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTerminalId <em>Terminal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getTerminalId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_TerminalId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTrackingCodeOrders <em>Tracking Code Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracking Code Orders</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getTrackingCodeOrders()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_TrackingCodeOrders();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getTransactionId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_TransactionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getVisitId()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EAttribute getOrderHeader_VisitId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getWebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeader#getWebSite()
	 * @see #getOrderHeader()
	 * @generated
	 */
	EReference getOrderHeader_WebSite();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote <em>Header Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Note</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeaderNote
	 * @generated
	 */
	EClass getOrderHeaderNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getOrder()
	 * @see #getOrderHeaderNote()
	 * @generated
	 */
	EReference getOrderHeaderNote_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getInternalNote <em>Internal Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Note</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getInternalNote()
	 * @see #getOrderHeaderNote()
	 * @generated
	 */
	EAttribute getOrderHeaderNote_InternalNote();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort <em>Header Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort
	 * @generated
	 */
	EClass getOrderHeaderWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort#getOrder()
	 * @see #getOrderHeaderWorkEffort()
	 * @generated
	 */
	EReference getOrderHeaderWorkEffort_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort#getWorkEffort()
	 * @see #getOrderHeaderWorkEffort()
	 * @generated
	 */
	EReference getOrderHeaderWorkEffort_WorkEffort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem
	 * @generated
	 */
	EClass getOrderItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getOrder()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getOrderItemSeqId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getAutoCancelDate <em>Auto Cancel Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Cancel Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getAutoCancelDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_AutoCancelDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getBudgetId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getBudgetItemSeqId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_BudgetItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getCancelBackOrderDate <em>Cancel Back Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Back Order Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getCancelBackOrderDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_CancelBackOrderDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getCancelQuantity <em>Cancel Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getCancelQuantity()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_CancelQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getChangeByUserLogin()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_ChangeByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getComments()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getCorrespondingPoId <em>Corresponding Po Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Po Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getCorrespondingPoId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_CorrespondingPoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getDeploymentId <em>Deployment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getDeploymentId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_DeploymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getDontCancelSetDate <em>Dont Cancel Set Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dont Cancel Set Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getDontCancelSetDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_DontCancelSetDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getDontCancelSetUserLogin <em>Dont Cancel Set User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dont Cancel Set User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getDontCancelSetUserLogin()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_DontCancelSetUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Delivery Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getEstimatedDeliveryDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_EstimatedDeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getEstimatedShipDate <em>Estimated Ship Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Ship Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getEstimatedShipDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_EstimatedShipDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getExternalId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ExternalId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getFromInventoryItem <em>From Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getFromInventoryItem()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_FromInventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getIsItemGroupPrimary <em>Is Item Group Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Item Group Primary</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getIsItemGroupPrimary()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_IsItemGroupPrimary();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getIsModifiedPrice <em>Is Modified Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modified Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getIsModifiedPrice()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_IsModifiedPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getIsPromo <em>Is Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Promo</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getIsPromo()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_IsPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getItemDescription <em>Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getItemDescription()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ItemDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getOrderItemGroupSeqId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_OrderItemGroupSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getOrderItemType <em>Order Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getOrderItemType()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_OrderItemType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getOverrideGlAccount <em>Override Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getOverrideGlAccount()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_OverrideGlAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getProdCatalogId <em>Prod Catalog Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Catalog Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getProdCatalogId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ProdCatalogId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getProduct()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getProductCategoryId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ProductCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getProductFeatureId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getQuantity()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getQuoteId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getQuoteItemSeqId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_QuoteItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getRecurringFreqUom <em>Recurring Freq Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurring Freq Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getRecurringFreqUom()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_RecurringFreqUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getReserveAfterDate <em>Reserve After Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve After Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getReserveAfterDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ReserveAfterDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getSalesOpportunity()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_SalesOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getSelectedAmount <em>Selected Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getSelectedAmount()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_SelectedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getShipAfterDate <em>Ship After Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship After Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getShipAfterDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ShipAfterDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getShipBeforeDate <em>Ship Before Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Before Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getShipBeforeDate()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ShipBeforeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getShoppingListId <em>Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getShoppingListId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ShoppingListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getShoppingListItemSeqId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_ShoppingListItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getStatus()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getSubscriptionId <em>Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getSubscriptionId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_SubscriptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getSupplierProductId <em>Supplier Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getSupplierProductId()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_SupplierProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getSyncStatus <em>Sync Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sync Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getSyncStatus()
	 * @see #getOrderItem()
	 * @generated
	 */
	EReference getOrderItem_SyncStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getUnitAverageCost <em>Unit Average Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Average Cost</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getUnitAverageCost()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_UnitAverageCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getUnitListPrice <em>Unit List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit List Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getUnitListPrice()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_UnitListPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getUnitPrice()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItem#getUnitRecurringPrice <em>Unit Recurring Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Recurring Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItem#getUnitRecurringPrice()
	 * @see #getOrderItem()
	 * @generated
	 */
	EAttribute getOrderItem_UnitRecurringPrice();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc <em>Item Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc
	 * @generated
	 */
	EClass getOrderItemAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemAssocType <em>Order Item Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Item Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemAssocType()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EReference getOrderItemAssoc_OrderItemAssocType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrder()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EReference getOrderItemAssoc_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrder <em>To Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrder()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EReference getOrderItemAssoc_ToOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemSeqId()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EAttribute getOrderItemAssoc_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getShipGroupSeqId()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EAttribute getOrderItemAssoc_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrderItemSeqId <em>To Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrderItemSeqId()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EAttribute getOrderItemAssoc_ToOrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToShipGroupSeqId <em>To Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToShipGroupSeqId()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EAttribute getOrderItemAssoc_ToShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getQuantity()
	 * @see #getOrderItemAssoc()
	 * @generated
	 */
	EAttribute getOrderItemAssoc_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssocType <em>Item Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssocType
	 * @generated
	 */
	EClass getOrderItemAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getOrderItemAssocTypeId <em>Order Item Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getOrderItemAssocTypeId()
	 * @see #getOrderItemAssocType()
	 * @generated
	 */
	EAttribute getOrderItemAssocType_OrderItemAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getDescription()
	 * @see #getOrderItemAssocType()
	 * @generated
	 */
	EAttribute getOrderItemAssocType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getHasTable()
	 * @see #getOrderItemAssocType()
	 * @generated
	 */
	EAttribute getOrderItemAssocType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAssocType#getParentType()
	 * @see #getOrderItemAssocType()
	 * @generated
	 */
	EReference getOrderItemAssocType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemAttribute <em>Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAttribute
	 * @generated
	 */
	EClass getOrderItemAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getOrderId()
	 * @see #getOrderItemAttribute()
	 * @generated
	 */
	EAttribute getOrderItemAttribute_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getOrderItemSeqId()
	 * @see #getOrderItemAttribute()
	 * @generated
	 */
	EAttribute getOrderItemAttribute_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getAttrName()
	 * @see #getOrderItemAttribute()
	 * @generated
	 */
	EAttribute getOrderItemAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getAttrDescription()
	 * @see #getOrderItemAttribute()
	 * @generated
	 */
	EAttribute getOrderItemAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemAttribute#getAttrValue()
	 * @see #getOrderItemAttribute()
	 * @generated
	 */
	EAttribute getOrderItemAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling <em>Item Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Billing</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling
	 * @generated
	 */
	EClass getOrderItemBilling();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getOrder()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EReference getOrderItemBilling_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getInvoice()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EReference getOrderItemBilling_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getOrderItemSeqId()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EAttribute getOrderItemBilling_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getInvoiceItemSeqId()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EAttribute getOrderItemBilling_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getAmount()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EAttribute getOrderItemBilling_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getItemIssuance <em>Item Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Issuance</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getItemIssuance()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EReference getOrderItemBilling_ItemIssuance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getQuantity()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EAttribute getOrderItemBilling_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemBilling#getShipmentReceipt <em>Shipment Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Receipt</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemBilling#getShipmentReceipt()
	 * @see #getOrderItemBilling()
	 * @generated
	 */
	EReference getOrderItemBilling_ShipmentReceipt();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange <em>Item Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Change</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange
	 * @generated
	 */
	EClass getOrderItemChange();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getOrderItemChangeId <em>Order Item Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Change Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getOrderItemChangeId()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_OrderItemChangeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getCancelQuantity <em>Cancel Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getCancelQuantity()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_CancelQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeComments <em>Change Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeComments()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_ChangeComments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeDatetime <em>Change Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeDatetime()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_ChangeDatetime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeTypeEnum <em>Change Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Type Enum</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeTypeEnum()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EReference getOrderItemChange_ChangeTypeEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeUserLogin <em>Change User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getChangeUserLogin()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EReference getOrderItemChange_ChangeUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getItemDescription <em>Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getItemDescription()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_ItemDescription();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getOrder()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EReference getOrderItemChange_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getOrderItemSeqId()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getQuantity()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getReasonEnum <em>Reason Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getReasonEnum()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EReference getOrderItemChange_ReasonEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemChange#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemChange#getUnitPrice()
	 * @see #getOrderItemChange()
	 * @generated
	 */
	EAttribute getOrderItemChange_UnitPrice();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemContactMech <em>Item Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemContactMech
	 * @generated
	 */
	EClass getOrderItemContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getOrder()
	 * @see #getOrderItemContactMech()
	 * @generated
	 */
	EReference getOrderItemContactMech_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getContactMechPurposeType()
	 * @see #getOrderItemContactMech()
	 * @generated
	 */
	EReference getOrderItemContactMech_ContactMechPurposeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getOrderItemSeqId()
	 * @see #getOrderItemContactMech()
	 * @generated
	 */
	EAttribute getOrderItemContactMech_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemContactMech#getContactMech()
	 * @see #getOrderItemContactMech()
	 * @generated
	 */
	EReference getOrderItemContactMech_ContactMech();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Group</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroup
	 * @generated
	 */
	EClass getOrderItemGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrder()
	 * @see #getOrderItemGroup()
	 * @generated
	 */
	EReference getOrderItemGroup_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrderItemGroupSeqId()
	 * @see #getOrderItemGroup()
	 * @generated
	 */
	EAttribute getOrderItemGroup_OrderItemGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroup#getGroupName()
	 * @see #getOrderItemGroup()
	 * @generated
	 */
	EAttribute getOrderItemGroup_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getParentGroupSeqId <em>Parent Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroup#getParentGroupSeqId()
	 * @see #getOrderItemGroup()
	 * @generated
	 */
	EAttribute getOrderItemGroup_ParentGroupSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder <em>Item Group Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Group Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder
	 * @generated
	 */
	EClass getOrderItemGroupOrder();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder#getGroupOrder <em>Group Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder#getGroupOrder()
	 * @see #getOrderItemGroupOrder()
	 * @generated
	 */
	EReference getOrderItemGroupOrder_GroupOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder#getOrderId()
	 * @see #getOrderItemGroupOrder()
	 * @generated
	 */
	EAttribute getOrderItemGroupOrder_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder#getOrderItemSeqId()
	 * @see #getOrderItemGroupOrder()
	 * @generated
	 */
	EAttribute getOrderItemGroupOrder_OrderItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo <em>Item Price Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Price Info</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo
	 * @generated
	 */
	EClass getOrderItemPriceInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Price Info Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemPriceInfoId()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EAttribute getOrderItemPriceInfo_OrderItemPriceInfoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getDescription()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EAttribute getOrderItemPriceInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getModifyAmount <em>Modify Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getModifyAmount()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EAttribute getOrderItemPriceInfo_ModifyAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrder()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EReference getOrderItemPriceInfo_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemSeqId()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EAttribute getOrderItemPriceInfo_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceActionSeqId()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EAttribute getOrderItemPriceInfo_ProductPriceActionSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceRule <em>Product Price Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Rule</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceRule()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EReference getOrderItemPriceInfo_ProductPriceRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getRateCode <em>Rate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getRateCode()
	 * @see #getOrderItemPriceInfo()
	 * @generated
	 */
	EAttribute getOrderItemPriceInfo_RateCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemRole <em>Item Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Role</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemRole
	 * @generated
	 */
	EClass getOrderItemRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemRole#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemRole#getOrder()
	 * @see #getOrderItemRole()
	 * @generated
	 */
	EReference getOrderItemRole_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemRole#getParty()
	 * @see #getOrderItemRole()
	 * @generated
	 */
	EReference getOrderItemRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemRole#getRoleType()
	 * @see #getOrderItemRole()
	 * @generated
	 */
	EReference getOrderItemRole_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemRole#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemRole#getOrderItemSeqId()
	 * @see #getOrderItemRole()
	 * @generated
	 */
	EAttribute getOrderItemRole_OrderItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup <em>Item Ship Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Ship Group</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup
	 * @generated
	 */
	EClass getOrderItemShipGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getOrder()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipGroupSeqId()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_ShipGroupSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierParty <em>Carrier Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierParty()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_CarrierParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierRoleTypeId()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_CarrierRoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getContactMech()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_ContactMech();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Delivery Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedDeliveryDate()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_EstimatedDeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedShipDate <em>Estimated Ship Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Ship Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedShipDate()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_EstimatedShipDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getFacility()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getGiftMessage <em>Gift Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gift Message</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getGiftMessage()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_GiftMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getIsGift <em>Is Gift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Gift</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getIsGift()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_IsGift();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getMaySplit <em>May Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Split</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getMaySplit()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_MaySplit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipAfterDate <em>Ship After Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship After Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipAfterDate()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_ShipAfterDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipByDate <em>Ship By Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship By Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipByDate()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_ShipByDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipmentMethodType <em>Shipment Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipmentMethodType()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_ShipmentMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShippingInstructions <em>Shipping Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Instructions</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShippingInstructions()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_ShippingInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierAgreement <em>Supplier Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierAgreement()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_SupplierAgreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierParty <em>Supplier Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierParty()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_SupplierParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTelecomContactMech <em>Telecom Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Telecom Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTelecomContactMech()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_TelecomContactMech();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTrackingNumber <em>Tracking Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Number</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTrackingNumber()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EAttribute getOrderItemShipGroup_TrackingNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getVendorParty <em>Vendor Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getVendorParty()
	 * @see #getOrderItemShipGroup()
	 * @generated
	 */
	EReference getOrderItemShipGroup_VendorParty();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc <em>Item Ship Group Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Ship Group Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc
	 * @generated
	 */
	EClass getOrderItemShipGroupAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getOrder()
	 * @see #getOrderItemShipGroupAssoc()
	 * @generated
	 */
	EReference getOrderItemShipGroupAssoc_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getOrderItemSeqId()
	 * @see #getOrderItemShipGroupAssoc()
	 * @generated
	 */
	EAttribute getOrderItemShipGroupAssoc_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getShipGroupSeqId()
	 * @see #getOrderItemShipGroupAssoc()
	 * @generated
	 */
	EAttribute getOrderItemShipGroupAssoc_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getCancelQuantity <em>Cancel Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getCancelQuantity()
	 * @see #getOrderItemShipGroupAssoc()
	 * @generated
	 */
	EAttribute getOrderItemShipGroupAssoc_CancelQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc#getQuantity()
	 * @see #getOrderItemShipGroupAssoc()
	 * @generated
	 */
	EAttribute getOrderItemShipGroupAssoc_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes <em>Item Ship Grp Inv Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Ship Grp Inv Res</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes
	 * @generated
	 */
	EClass getOrderItemShipGrpInvRes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getOrder()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EReference getOrderItemShipGrpInvRes_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getInventoryItem()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EReference getOrderItemShipGrpInvRes_InventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getShipGroupSeqId()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getOrderItemSeqId()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getCreatedDatetime <em>Created Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getCreatedDatetime()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_CreatedDatetime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getCurrentPromisedDate <em>Current Promised Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Promised Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getCurrentPromisedDate()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_CurrentPromisedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getOldPickStartDate <em>Old Pick Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Pick Start Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getOldPickStartDate()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_OldPickStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getPriority()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getPromisedDatetime <em>Promised Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promised Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getPromisedDatetime()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_PromisedDatetime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getQuantity()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getQuantityNotAvailable <em>Quantity Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Not Available</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getQuantityNotAvailable()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_QuantityNotAvailable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve Order Enum Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getReserveOrderEnumId()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_ReserveOrderEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getReservedDatetime <em>Reserved Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getReservedDatetime()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_ReservedDatetime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes#getSequenceId()
	 * @see #getOrderItemShipGrpInvRes()
	 * @generated
	 */
	EAttribute getOrderItemShipGrpInvRes_SequenceId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemType
	 * @generated
	 */
	EClass getOrderItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemType#getOrderItemTypeId <em>Order Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemType#getOrderItemTypeId()
	 * @see #getOrderItemType()
	 * @generated
	 */
	EAttribute getOrderItemType_OrderItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemType#getDescription()
	 * @see #getOrderItemType()
	 * @generated
	 */
	EAttribute getOrderItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemType#getHasTable()
	 * @see #getOrderItemType()
	 * @generated
	 */
	EAttribute getOrderItemType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderItemType#getOrderItemTypeAttrs <em>Order Item Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Item Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemType#getOrderItemTypeAttrs()
	 * @see #getOrderItemType()
	 * @generated
	 */
	EReference getOrderItemType_OrderItemTypeAttrs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemType#getParentType()
	 * @see #getOrderItemType()
	 * @generated
	 */
	EReference getOrderItemType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr <em>Item Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr
	 * @generated
	 */
	EClass getOrderItemTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr#getOrderItemType <em>Order Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr#getOrderItemType()
	 * @see #getOrderItemTypeAttr()
	 * @generated
	 */
	EReference getOrderItemTypeAttr_OrderItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr#getAttrName()
	 * @see #getOrderItemTypeAttr()
	 * @generated
	 */
	EAttribute getOrderItemTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr#getDescription()
	 * @see #getOrderItemTypeAttr()
	 * @generated
	 */
	EAttribute getOrderItemTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderNotification
	 * @generated
	 */
	EClass getOrderNotification();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderNotification#getOrderNotificationId <em>Order Notification Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Notification Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderNotification#getOrderNotificationId()
	 * @see #getOrderNotification()
	 * @generated
	 */
	EAttribute getOrderNotification_OrderNotificationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderNotification#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderNotification#getComments()
	 * @see #getOrderNotification()
	 * @generated
	 */
	EAttribute getOrderNotification_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderNotification#getEmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderNotification#getEmailType()
	 * @see #getOrderNotification()
	 * @generated
	 */
	EReference getOrderNotification_EmailType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderNotification#getNotificationDate <em>Notification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderNotification#getNotificationDate()
	 * @see #getOrderNotification()
	 * @generated
	 */
	EAttribute getOrderNotification_NotificationDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderNotification#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderNotification#getOrder()
	 * @see #getOrderNotification()
	 * @generated
	 */
	EReference getOrderNotification_Order();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference <em>Payment Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Preference</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference
	 * @generated
	 */
	EClass getOrderPaymentPreference();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Payment Preference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOrderPaymentPreferenceId()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_OrderPaymentPreferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getBillingPostalCode <em>Billing Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Postal Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getBillingPostalCode()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_BillingPostalCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getCreatedByUserLogin()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getCreatedDate()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getFinAccount()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_FinAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getLastModifiedByUserLogin()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getLastModifiedDate()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getManualAuthCode <em>Manual Auth Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Auth Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getManualAuthCode()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_ManualAuthCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getManualRefNum <em>Manual Ref Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Ref Num</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getManualRefNum()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_ManualRefNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getMaxAmount <em>Max Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getMaxAmount()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_MaxAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getNeedsNsfRetry <em>Needs Nsf Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Nsf Retry</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getNeedsNsfRetry()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_NeedsNsfRetry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOrder()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOrderItemSeqId()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOverflowFlag <em>Overflow Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow Flag</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getOverflowFlag()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_OverflowFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getPaymentMethod()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_PaymentMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getPaymentMethodType <em>Payment Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getPaymentMethodType()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_PaymentMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getPresentFlag <em>Present Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Present Flag</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getPresentFlag()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_PresentFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getProcessAttempt <em>Process Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Attempt</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getProcessAttempt()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_ProcessAttempt();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getProductPricePurpose <em>Product Price Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Purpose</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getProductPricePurpose()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_ProductPricePurpose();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getSecurityCode <em>Security Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getSecurityCode()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_SecurityCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getShipGroupSeqId()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_ShipGroupSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getStatus()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EReference getOrderPaymentPreference_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getSwipedFlag <em>Swiped Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swiped Flag</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getSwipedFlag()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_SwipedFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getTrack2 <em>Track2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track2</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPaymentPreference#getTrack2()
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	EAttribute getOrderPaymentPreference_Track2();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderProductPromoCode
	 * @generated
	 */
	EClass getOrderProductPromoCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderProductPromoCode#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderProductPromoCode#getOrder()
	 * @see #getOrderProductPromoCode()
	 * @generated
	 */
	EReference getOrderProductPromoCode_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderProductPromoCode#getProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderProductPromoCode#getProductPromoCode()
	 * @see #getOrderProductPromoCode()
	 * @generated
	 */
	EReference getOrderProductPromoCode_ProductPromoCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderRole
	 * @generated
	 */
	EClass getOrderRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderRole#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderRole#getOrder()
	 * @see #getOrderRole()
	 * @generated
	 */
	EReference getOrderRole_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderRole#getParty()
	 * @see #getOrderRole()
	 * @generated
	 */
	EReference getOrderRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderRole#getRoleType()
	 * @see #getOrderRole()
	 * @generated
	 */
	EReference getOrderRole_RoleType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment
	 * @generated
	 */
	EClass getOrderShipment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderShipment#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment#getOrder()
	 * @see #getOrderShipment()
	 * @generated
	 */
	EReference getOrderShipment_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderShipment#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment#getShipment()
	 * @see #getOrderShipment()
	 * @generated
	 */
	EReference getOrderShipment_Shipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderShipment#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment#getOrderItemSeqId()
	 * @see #getOrderShipment()
	 * @generated
	 */
	EAttribute getOrderShipment_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderShipment#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment#getShipGroupSeqId()
	 * @see #getOrderShipment()
	 * @generated
	 */
	EAttribute getOrderShipment_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderShipment#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment#getShipmentItemSeqId()
	 * @see #getOrderShipment()
	 * @generated
	 */
	EAttribute getOrderShipment_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderShipment#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderShipment#getQuantity()
	 * @see #getOrderShipment()
	 * @generated
	 */
	EAttribute getOrderShipment_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus
	 * @generated
	 */
	EClass getOrderStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderStatusId <em>Order Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Status Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderStatusId()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_OrderStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getChangeReason <em>Change Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Reason</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getChangeReason()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_ChangeReason();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getOrder()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EReference getOrderStatus_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderItemSeqId()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderPaymentPreference <em>Order Payment Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Payment Preference</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderPaymentPreference()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EReference getOrderStatus_OrderPaymentPreference();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getStatus()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EReference getOrderStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusDatetime <em>Status Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusDatetime()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EAttribute getOrderStatus_StatusDatetime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusUserLogin <em>Status User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusUserLogin()
	 * @see #getOrderStatus()
	 * @generated
	 */
	EReference getOrderStatus_StatusUserLogin();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry <em>Summary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary Entry</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry
	 * @generated
	 */
	EClass getOrderSummaryEntry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getProduct()
	 * @see #getOrderSummaryEntry()
	 * @generated
	 */
	EReference getOrderSummaryEntry_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getFacility()
	 * @see #getOrderSummaryEntry()
	 * @generated
	 */
	EReference getOrderSummaryEntry_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getEntryDate()
	 * @see #getOrderSummaryEntry()
	 * @generated
	 */
	EAttribute getOrderSummaryEntry_EntryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getGrossSales <em>Gross Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Sales</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getGrossSales()
	 * @see #getOrderSummaryEntry()
	 * @generated
	 */
	EAttribute getOrderSummaryEntry_GrossSales();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getProductCost <em>Product Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Cost</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getProductCost()
	 * @see #getOrderSummaryEntry()
	 * @generated
	 */
	EAttribute getOrderSummaryEntry_ProductCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getTotalQuantity <em>Total Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderSummaryEntry#getTotalQuantity()
	 * @see #getOrderSummaryEntry()
	 * @generated
	 */
	EAttribute getOrderSummaryEntry_TotalQuantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm
	 * @generated
	 */
	EClass getOrderTerm();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getOrder()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EReference getOrderTerm_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getTermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getTermType()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EReference getOrderTerm_TermType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getOrderItemSeqId()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EAttribute getOrderTerm_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getDescription()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EAttribute getOrderTerm_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getTermDays()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EAttribute getOrderTerm_TermDays();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getTermValue()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EAttribute getOrderTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getTextValue()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EAttribute getOrderTerm_TextValue();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderTerm#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTerm#getUom()
	 * @see #getOrderTerm()
	 * @generated
	 */
	EReference getOrderTerm_Uom();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute <em>Term Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute
	 * @generated
	 */
	EClass getOrderTermAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getTermTypeId()
	 * @see #getOrderTermAttribute()
	 * @generated
	 */
	EAttribute getOrderTermAttribute_TermTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getOrderId()
	 * @see #getOrderTermAttribute()
	 * @generated
	 */
	EAttribute getOrderTermAttribute_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getOrderItemSeqId()
	 * @see #getOrderTermAttribute()
	 * @generated
	 */
	EAttribute getOrderTermAttribute_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getAttrName()
	 * @see #getOrderTermAttribute()
	 * @generated
	 */
	EAttribute getOrderTermAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getAttrDescription()
	 * @see #getOrderTermAttribute()
	 * @generated
	 */
	EAttribute getOrderTermAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTermAttribute#getAttrValue()
	 * @see #getOrderTermAttribute()
	 * @generated
	 */
	EAttribute getOrderTermAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderType
	 * @generated
	 */
	EClass getOrderType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderType#getOrderTypeId <em>Order Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderType#getOrderTypeId()
	 * @see #getOrderType()
	 * @generated
	 */
	EAttribute getOrderType_OrderTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderType#getDescription()
	 * @see #getOrderType()
	 * @generated
	 */
	EAttribute getOrderType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderType#getHasTable()
	 * @see #getOrderType()
	 * @generated
	 */
	EAttribute getOrderType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.order.OrderType#getOrderTypeAttrs <em>Order Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderType#getOrderTypeAttrs()
	 * @see #getOrderType()
	 * @generated
	 */
	EReference getOrderType_OrderTypeAttrs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderType#getParentType()
	 * @see #getOrderType()
	 * @generated
	 */
	EReference getOrderType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.OrderTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTypeAttr
	 * @generated
	 */
	EClass getOrderTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.OrderTypeAttr#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTypeAttr#getOrderType()
	 * @see #getOrderTypeAttr()
	 * @generated
	 */
	EReference getOrderTypeAttr_OrderType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTypeAttr#getAttrName()
	 * @see #getOrderTypeAttr()
	 * @generated
	 */
	EAttribute getOrderTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.OrderTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.OrderTypeAttr#getDescription()
	 * @see #getOrderTypeAttr()
	 * @generated
	 */
	EAttribute getOrderTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.ProductOrderItem <em>Product Order Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Order Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.ProductOrderItem
	 * @generated
	 */
	EClass getProductOrderItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.ProductOrderItem#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.ProductOrderItem#getOrder()
	 * @see #getProductOrderItem()
	 * @generated
	 */
	EReference getProductOrderItem_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.ProductOrderItem#getEngagement <em>Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engagement</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.ProductOrderItem#getEngagement()
	 * @see #getProductOrderItem()
	 * @generated
	 */
	EReference getProductOrderItem_Engagement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.ProductOrderItem#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.ProductOrderItem#getOrderItemSeqId()
	 * @see #getProductOrderItem()
	 * @generated
	 */
	EAttribute getProductOrderItem_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.ProductOrderItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.ProductOrderItem#getProduct()
	 * @see #getProductOrderItem()
	 * @generated
	 */
	EReference getProductOrderItem_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.ProductOrderItem#getEngagementItemSeqId <em>Engagement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engagement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.ProductOrderItem#getEngagementItemSeqId()
	 * @see #getProductOrderItem()
	 * @generated
	 */
	EAttribute getProductOrderItem_EngagementItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment <em>Work Order Item Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Order Item Fulfillment</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment
	 * @generated
	 */
	EClass getWorkOrderItemFulfillment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getOrder()
	 * @see #getWorkOrderItemFulfillment()
	 * @generated
	 */
	EReference getWorkOrderItemFulfillment_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getWorkEffort()
	 * @see #getWorkOrderItemFulfillment()
	 * @generated
	 */
	EReference getWorkOrderItemFulfillment_WorkEffort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getOrderItemSeqId()
	 * @see #getWorkOrderItemFulfillment()
	 * @generated
	 */
	EAttribute getWorkOrderItemFulfillment_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment#getShipGroupSeqId()
	 * @see #getWorkOrderItemFulfillment()
	 * @generated
	 */
	EAttribute getWorkOrderItemFulfillment_ShipGroupSeqId();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.CommunicationEventOrderImpl <em>Communication Event Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.CommunicationEventOrderImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getCommunicationEventOrder()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_ORDER = eINSTANCE.getCommunicationEventOrder();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ORDER__ORDER = eINSTANCE.getCommunicationEventOrder_Order();

		/**
		 * The meta object literal for the '<em><b>Communication Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ORDER__COMMUNICATION_EVENT = eINSTANCE.getCommunicationEventOrder_CommunicationEvent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentImpl <em>Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustment()
		 * @generated
		 */
		EClass ORDER_ADJUSTMENT = eINSTANCE.getOrderAdjustment();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID = eINSTANCE.getOrderAdjustment_OrderAdjustmentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__AMOUNT = eINSTANCE.getOrderAdjustment_Amount();

		/**
		 * The meta object literal for the '<em><b>Amount Already Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED = eINSTANCE.getOrderAdjustment_AmountAlreadyIncluded();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__COMMENTS = eINSTANCE.getOrderAdjustment_Comments();

		/**
		 * The meta object literal for the '<em><b>Corresponding Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = eINSTANCE.getOrderAdjustment_CorrespondingProductId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getOrderAdjustment_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__CREATED_DATE = eINSTANCE.getOrderAdjustment_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Customer Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID = eINSTANCE.getOrderAdjustment_CustomerReferenceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__DESCRIPTION = eINSTANCE.getOrderAdjustment_Description();

		/**
		 * The meta object literal for the '<em><b>Exempt Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__EXEMPT_AMOUNT = eINSTANCE.getOrderAdjustment_ExemptAmount();

		/**
		 * The meta object literal for the '<em><b>Include In Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING = eINSTANCE.getOrderAdjustment_IncludeInShipping();

		/**
		 * The meta object literal for the '<em><b>Include In Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__INCLUDE_IN_TAX = eINSTANCE.getOrderAdjustment_IncludeInTax();

		/**
		 * The meta object literal for the '<em><b>Is Manual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__IS_MANUAL = eINSTANCE.getOrderAdjustment_IsManual();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getOrderAdjustment_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__LAST_MODIFIED_DATE = eINSTANCE.getOrderAdjustment_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Old Amount Per Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY = eINSTANCE.getOrderAdjustment_OldAmountPerQuantity();

		/**
		 * The meta object literal for the '<em><b>Old Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__OLD_PERCENTAGE = eINSTANCE.getOrderAdjustment_OldPercentage();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__ORDER = eINSTANCE.getOrderAdjustment_Order();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES = eINSTANCE.getOrderAdjustment_OrderAdjustmentAttributes();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE = eINSTANCE.getOrderAdjustment_OrderAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderAdjustment_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Original Adjustment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT = eINSTANCE.getOrderAdjustment_OriginalAdjustment();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT = eINSTANCE.getOrderAdjustment_OverrideGlAccount();

		/**
		 * The meta object literal for the '<em><b>Primary Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__PRIMARY_GEO = eINSTANCE.getOrderAdjustment_PrimaryGeo();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID = eINSTANCE.getOrderAdjustment_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__PRODUCT_PROMO = eINSTANCE.getOrderAdjustment_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getOrderAdjustment_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = eINSTANCE.getOrderAdjustment_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Recurring Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__RECURRING_AMOUNT = eINSTANCE.getOrderAdjustment_RecurringAmount();

		/**
		 * The meta object literal for the '<em><b>Secondary Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__SECONDARY_GEO = eINSTANCE.getOrderAdjustment_SecondaryGeo();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderAdjustment_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Source Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__SOURCE_PERCENTAGE = eINSTANCE.getOrderAdjustment_SourcePercentage();

		/**
		 * The meta object literal for the '<em><b>Source Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID = eINSTANCE.getOrderAdjustment_SourceReferenceId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID = eINSTANCE.getOrderAdjustment_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID = eINSTANCE.getOrderAdjustment_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Seq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ = eINSTANCE.getOrderAdjustment_TaxAuthorityRateSeq();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentAttributeImpl <em>Adjustment Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentAttribute()
		 * @generated
		 */
		EClass ORDER_ADJUSTMENT_ATTRIBUTE = eINSTANCE.getOrderAdjustmentAttribute();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT_ATTRIBUTE__ORDER_ADJUSTMENT = eINSTANCE.getOrderAdjustmentAttribute_OrderAdjustment();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getOrderAdjustmentAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getOrderAdjustmentAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getOrderAdjustmentAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentBillingImpl <em>Adjustment Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentBillingImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentBilling()
		 * @generated
		 */
		EClass ORDER_ADJUSTMENT_BILLING = eINSTANCE.getOrderAdjustmentBilling();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT_BILLING__ORDER_ADJUSTMENT = eINSTANCE.getOrderAdjustmentBilling_OrderAdjustment();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT_BILLING__INVOICE = eINSTANCE.getOrderAdjustmentBilling_Invoice();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_BILLING__INVOICE_ITEM_SEQ_ID = eINSTANCE.getOrderAdjustmentBilling_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_BILLING__AMOUNT = eINSTANCE.getOrderAdjustmentBilling_Amount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeImpl <em>Adjustment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentType()
		 * @generated
		 */
		EClass ORDER_ADJUSTMENT_TYPE = eINSTANCE.getOrderAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ID = eINSTANCE.getOrderAdjustmentType_OrderAdjustmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_TYPE__DESCRIPTION = eINSTANCE.getOrderAdjustmentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_TYPE__HAS_TABLE = eINSTANCE.getOrderAdjustmentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ATTRS = eINSTANCE.getOrderAdjustmentType_OrderAdjustmentTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT_TYPE__PARENT_TYPE = eINSTANCE.getOrderAdjustmentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeAttrImpl <em>Adjustment Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAdjustmentTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAdjustmentTypeAttr()
		 * @generated
		 */
		EClass ORDER_ADJUSTMENT_TYPE_ATTR = eINSTANCE.getOrderAdjustmentTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ADJUSTMENT_TYPE_ATTR__ORDER_ADJUSTMENT_TYPE = eINSTANCE.getOrderAdjustmentTypeAttr_OrderAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getOrderAdjustmentTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ADJUSTMENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getOrderAdjustmentTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderAttribute()
		 * @generated
		 */
		EClass ORDER_ATTRIBUTE = eINSTANCE.getOrderAttribute();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ATTRIBUTE__ORDER = eINSTANCE.getOrderAttribute_Order();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ATTRIBUTE__ATTR_NAME = eINSTANCE.getOrderAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getOrderAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getOrderAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistImpl <em>Blacklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderBlacklist()
		 * @generated
		 */
		EClass ORDER_BLACKLIST = eINSTANCE.getOrderBlacklist();

		/**
		 * The meta object literal for the '<em><b>Order Blacklist Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE = eINSTANCE.getOrderBlacklist_OrderBlacklistType();

		/**
		 * The meta object literal for the '<em><b>Blacklist String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BLACKLIST__BLACKLIST_STRING = eINSTANCE.getOrderBlacklist_BlacklistString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistTypeImpl <em>Blacklist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderBlacklistTypeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderBlacklistType()
		 * @generated
		 */
		EClass ORDER_BLACKLIST_TYPE = eINSTANCE.getOrderBlacklistType();

		/**
		 * The meta object literal for the '<em><b>Order Blacklist Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BLACKLIST_TYPE__ORDER_BLACKLIST_TYPE_ID = eINSTANCE.getOrderBlacklistType_OrderBlacklistTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BLACKLIST_TYPE__DESCRIPTION = eINSTANCE.getOrderBlacklistType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderContactMechImpl <em>Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderContactMechImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderContactMech()
		 * @generated
		 */
		EClass ORDER_CONTACT_MECH = eINSTANCE.getOrderContactMech();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTACT_MECH__ORDER = eINSTANCE.getOrderContactMech_Order();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTACT_MECH__CONTACT_MECH = eINSTANCE.getOrderContactMech_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = eINSTANCE.getOrderContactMech_ContactMechPurposeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderContentImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderContent()
		 * @generated
		 */
		EClass ORDER_CONTENT = eINSTANCE.getOrderContent();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTENT__ORDER = eINSTANCE.getOrderContent_Order();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTENT__CONTENT = eINSTANCE.getOrderContent_Content();

		/**
		 * The meta object literal for the '<em><b>Order Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTENT__ORDER_CONTENT_TYPE = eINSTANCE.getOrderContent_OrderContentType();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONTENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderContent_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONTENT__FROM_DATE = eINSTANCE.getOrderContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONTENT__THRU_DATE = eINSTANCE.getOrderContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderContentTypeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderContentType()
		 * @generated
		 */
		EClass ORDER_CONTENT_TYPE = eINSTANCE.getOrderContentType();

		/**
		 * The meta object literal for the '<em><b>Order Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONTENT_TYPE__ORDER_CONTENT_TYPE_ID = eINSTANCE.getOrderContentType_OrderContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getOrderContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getOrderContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONTENT_TYPE__PARENT_TYPE = eINSTANCE.getOrderContentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl <em>Delivery Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderDeliverySchedule()
		 * @generated
		 */
		EClass ORDER_DELIVERY_SCHEDULE = eINSTANCE.getOrderDeliverySchedule();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DELIVERY_SCHEDULE__ORDER = eINSTANCE.getOrderDeliverySchedule_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderDeliverySchedule_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Cartons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__CARTONS = eINSTANCE.getOrderDeliverySchedule_Cartons();

		/**
		 * The meta object literal for the '<em><b>Estimated Ready Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE = eINSTANCE.getOrderDeliverySchedule_EstimatedReadyDate();

		/**
		 * The meta object literal for the '<em><b>Skids Pallets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS = eINSTANCE.getOrderDeliverySchedule_SkidsPallets();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DELIVERY_SCHEDULE__STATUS = eINSTANCE.getOrderDeliverySchedule_Status();

		/**
		 * The meta object literal for the '<em><b>Total Cubic Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE = eINSTANCE.getOrderDeliverySchedule_TotalCubicSize();

		/**
		 * The meta object literal for the '<em><b>Total Cubic Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM = eINSTANCE.getOrderDeliverySchedule_TotalCubicUom();

		/**
		 * The meta object literal for the '<em><b>Total Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT = eINSTANCE.getOrderDeliverySchedule_TotalWeight();

		/**
		 * The meta object literal for the '<em><b>Total Weight Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM = eINSTANCE.getOrderDeliverySchedule_TotalWeightUom();

		/**
		 * The meta object literal for the '<em><b>Units Pieces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_SCHEDULE__UNITS_PIECES = eINSTANCE.getOrderDeliverySchedule_UnitsPieces();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderHeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderHeaderImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderHeader()
		 * @generated
		 */
		EClass ORDER_HEADER = eINSTANCE.getOrderHeader();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__ORDER_ID = eINSTANCE.getOrderHeader_OrderId();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__AGREEMENT_ID = eINSTANCE.getOrderHeader_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Auto Order Shopping List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST = eINSTANCE.getOrderHeader_AutoOrderShoppingList();

		/**
		 * The meta object literal for the '<em><b>Billing Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__BILLING_ACCOUNT = eINSTANCE.getOrderHeader_BillingAccount();

		/**
		 * The meta object literal for the '<em><b>Communication Event Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__COMMUNICATION_EVENT_ORDERS = eINSTANCE.getOrderHeader_CommunicationEventOrders();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__CREATED_BY = eINSTANCE.getOrderHeader_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__CURRENCY_UOM = eINSTANCE.getOrderHeader_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__ENTRY_DATE = eINSTANCE.getOrderHeader_EntryDate();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__EXTERNAL_ID = eINSTANCE.getOrderHeader_ExternalId();

		/**
		 * The meta object literal for the '<em><b>First Attempt Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID = eINSTANCE.getOrderHeader_FirstAttemptOrderId();

		/**
		 * The meta object literal for the '<em><b>Grand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__GRAND_TOTAL = eINSTANCE.getOrderHeader_GrandTotal();

		/**
		 * The meta object literal for the '<em><b>Internal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__INTERNAL_CODE = eINSTANCE.getOrderHeader_InternalCode();

		/**
		 * The meta object literal for the '<em><b>Invoice Per Shipment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__INVOICE_PER_SHIPMENT = eINSTANCE.getOrderHeader_InvoicePerShipment();

		/**
		 * The meta object literal for the '<em><b>Is Rush Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__IS_RUSH_ORDER = eINSTANCE.getOrderHeader_IsRushOrder();

		/**
		 * The meta object literal for the '<em><b>Is Viewed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__IS_VIEWED = eINSTANCE.getOrderHeader_IsViewed();

		/**
		 * The meta object literal for the '<em><b>Needs Inventory Issuance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE = eINSTANCE.getOrderHeader_NeedsInventoryIssuance();

		/**
		 * The meta object literal for the '<em><b>Order Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_ATTRIBUTES = eINSTANCE.getOrderHeader_OrderAttributes();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__ORDER_DATE = eINSTANCE.getOrderHeader_OrderDate();

		/**
		 * The meta object literal for the '<em><b>Order Delivery Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_DELIVERY_SCHEDULES = eINSTANCE.getOrderHeader_OrderDeliverySchedules();

		/**
		 * The meta object literal for the '<em><b>Order Header Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_HEADER_NOTES = eINSTANCE.getOrderHeader_OrderHeaderNotes();

		/**
		 * The meta object literal for the '<em><b>Order Header Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS = eINSTANCE.getOrderHeader_OrderHeaderWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Order Item Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_ITEM_GROUPS = eINSTANCE.getOrderHeader_OrderItemGroups();

		/**
		 * The meta object literal for the '<em><b>Order Item Ship Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS = eINSTANCE.getOrderHeader_OrderItemShipGroups();

		/**
		 * The meta object literal for the '<em><b>Order Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_ITEMS = eINSTANCE.getOrderHeader_OrderItems();

		/**
		 * The meta object literal for the '<em><b>Order Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__ORDER_NAME = eINSTANCE.getOrderHeader_OrderName();

		/**
		 * The meta object literal for the '<em><b>Order Product Promo Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES = eINSTANCE.getOrderHeader_OrderProductPromoCodes();

		/**
		 * The meta object literal for the '<em><b>Order Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORDER_TYPE = eINSTANCE.getOrderHeader_OrderType();

		/**
		 * The meta object literal for the '<em><b>Origin Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__ORIGIN_FACILITY = eINSTANCE.getOrderHeader_OriginFacility();

		/**
		 * The meta object literal for the '<em><b>Pick Sheet Printed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__PICK_SHEET_PRINTED_DATE = eINSTANCE.getOrderHeader_PickSheetPrintedDate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__PRIORITY = eINSTANCE.getOrderHeader_Priority();

		/**
		 * The meta object literal for the '<em><b>Product Promo Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__PRODUCT_PROMO_USES = eINSTANCE.getOrderHeader_ProductPromoUses();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__PRODUCT_STORE = eINSTANCE.getOrderHeader_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Remaining Sub Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__REMAINING_SUB_TOTAL = eINSTANCE.getOrderHeader_RemainingSubTotal();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__SALES_CHANNEL_ENUM = eINSTANCE.getOrderHeader_SalesChannelEnum();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__STATUS = eINSTANCE.getOrderHeader_Status();

		/**
		 * The meta object literal for the '<em><b>Sync Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__SYNC_STATUS = eINSTANCE.getOrderHeader_SyncStatus();

		/**
		 * The meta object literal for the '<em><b>Terminal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__TERMINAL_ID = eINSTANCE.getOrderHeader_TerminalId();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__TRACKING_CODE_ORDERS = eINSTANCE.getOrderHeader_TrackingCodeOrders();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__TRANSACTION_ID = eINSTANCE.getOrderHeader_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER__VISIT_ID = eINSTANCE.getOrderHeader_VisitId();

		/**
		 * The meta object literal for the '<em><b>Web Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER__WEB_SITE = eINSTANCE.getOrderHeader_WebSite();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderHeaderNoteImpl <em>Header Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderHeaderNoteImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderHeaderNote()
		 * @generated
		 */
		EClass ORDER_HEADER_NOTE = eINSTANCE.getOrderHeaderNote();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER_NOTE__ORDER = eINSTANCE.getOrderHeaderNote_Order();

		/**
		 * The meta object literal for the '<em><b>Internal Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HEADER_NOTE__INTERNAL_NOTE = eINSTANCE.getOrderHeaderNote_InternalNote();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderHeaderWorkEffortImpl <em>Header Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderHeaderWorkEffortImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderHeaderWorkEffort()
		 * @generated
		 */
		EClass ORDER_HEADER_WORK_EFFORT = eINSTANCE.getOrderHeaderWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER_WORK_EFFORT__ORDER = eINSTANCE.getOrderHeaderWorkEffort_Order();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HEADER_WORK_EFFORT__WORK_EFFORT = eINSTANCE.getOrderHeaderWorkEffort_WorkEffort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItem()
		 * @generated
		 */
		EClass ORDER_ITEM = eINSTANCE.getOrderItem();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__ORDER = eINSTANCE.getOrderItem_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItem_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Auto Cancel Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__AUTO_CANCEL_DATE = eINSTANCE.getOrderItem_AutoCancelDate();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__BUDGET_ID = eINSTANCE.getOrderItem_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__BUDGET_ITEM_SEQ_ID = eINSTANCE.getOrderItem_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Cancel Back Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__CANCEL_BACK_ORDER_DATE = eINSTANCE.getOrderItem_CancelBackOrderDate();

		/**
		 * The meta object literal for the '<em><b>Cancel Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__CANCEL_QUANTITY = eINSTANCE.getOrderItem_CancelQuantity();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__CHANGE_BY_USER_LOGIN = eINSTANCE.getOrderItem_ChangeByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__COMMENTS = eINSTANCE.getOrderItem_Comments();

		/**
		 * The meta object literal for the '<em><b>Corresponding Po Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__CORRESPONDING_PO_ID = eINSTANCE.getOrderItem_CorrespondingPoId();

		/**
		 * The meta object literal for the '<em><b>Deployment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__DEPLOYMENT_ID = eINSTANCE.getOrderItem_DeploymentId();

		/**
		 * The meta object literal for the '<em><b>Dont Cancel Set Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__DONT_CANCEL_SET_DATE = eINSTANCE.getOrderItem_DontCancelSetDate();

		/**
		 * The meta object literal for the '<em><b>Dont Cancel Set User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN = eINSTANCE.getOrderItem_DontCancelSetUserLogin();

		/**
		 * The meta object literal for the '<em><b>Estimated Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__ESTIMATED_DELIVERY_DATE = eINSTANCE.getOrderItem_EstimatedDeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Ship Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__ESTIMATED_SHIP_DATE = eINSTANCE.getOrderItem_EstimatedShipDate();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__EXTERNAL_ID = eINSTANCE.getOrderItem_ExternalId();

		/**
		 * The meta object literal for the '<em><b>From Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__FROM_INVENTORY_ITEM = eINSTANCE.getOrderItem_FromInventoryItem();

		/**
		 * The meta object literal for the '<em><b>Is Item Group Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__IS_ITEM_GROUP_PRIMARY = eINSTANCE.getOrderItem_IsItemGroupPrimary();

		/**
		 * The meta object literal for the '<em><b>Is Modified Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__IS_MODIFIED_PRICE = eINSTANCE.getOrderItem_IsModifiedPrice();

		/**
		 * The meta object literal for the '<em><b>Is Promo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__IS_PROMO = eINSTANCE.getOrderItem_IsPromo();

		/**
		 * The meta object literal for the '<em><b>Item Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__ITEM_DESCRIPTION = eINSTANCE.getOrderItem_ItemDescription();

		/**
		 * The meta object literal for the '<em><b>Order Item Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID = eINSTANCE.getOrderItem_OrderItemGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Order Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__ORDER_ITEM_TYPE = eINSTANCE.getOrderItem_OrderItemType();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__OVERRIDE_GL_ACCOUNT = eINSTANCE.getOrderItem_OverrideGlAccount();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__PROD_CATALOG_ID = eINSTANCE.getOrderItem_ProdCatalogId();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__PRODUCT = eINSTANCE.getOrderItem_Product();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__PRODUCT_CATEGORY_ID = eINSTANCE.getOrderItem_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__PRODUCT_FEATURE_ID = eINSTANCE.getOrderItem_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__QUANTITY = eINSTANCE.getOrderItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__QUOTE_ID = eINSTANCE.getOrderItem_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__QUOTE_ITEM_SEQ_ID = eINSTANCE.getOrderItem_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Recurring Freq Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__RECURRING_FREQ_UOM = eINSTANCE.getOrderItem_RecurringFreqUom();

		/**
		 * The meta object literal for the '<em><b>Reserve After Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__RESERVE_AFTER_DATE = eINSTANCE.getOrderItem_ReserveAfterDate();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__SALES_OPPORTUNITY = eINSTANCE.getOrderItem_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Selected Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SELECTED_AMOUNT = eINSTANCE.getOrderItem_SelectedAmount();

		/**
		 * The meta object literal for the '<em><b>Ship After Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SHIP_AFTER_DATE = eINSTANCE.getOrderItem_ShipAfterDate();

		/**
		 * The meta object literal for the '<em><b>Ship Before Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SHIP_BEFORE_DATE = eINSTANCE.getOrderItem_ShipBeforeDate();

		/**
		 * The meta object literal for the '<em><b>Shopping List Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SHOPPING_LIST_ID = eINSTANCE.getOrderItem_ShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Shopping List Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID = eINSTANCE.getOrderItem_ShoppingListItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__STATUS = eINSTANCE.getOrderItem_Status();

		/**
		 * The meta object literal for the '<em><b>Subscription Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SUBSCRIPTION_ID = eINSTANCE.getOrderItem_SubscriptionId();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__SUPPLIER_PRODUCT_ID = eINSTANCE.getOrderItem_SupplierProductId();

		/**
		 * The meta object literal for the '<em><b>Sync Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM__SYNC_STATUS = eINSTANCE.getOrderItem_SyncStatus();

		/**
		 * The meta object literal for the '<em><b>Unit Average Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__UNIT_AVERAGE_COST = eINSTANCE.getOrderItem_UnitAverageCost();

		/**
		 * The meta object literal for the '<em><b>Unit List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__UNIT_LIST_PRICE = eINSTANCE.getOrderItem_UnitListPrice();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__UNIT_PRICE = eINSTANCE.getOrderItem_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Unit Recurring Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM__UNIT_RECURRING_PRICE = eINSTANCE.getOrderItem_UnitRecurringPrice();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocImpl <em>Item Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemAssoc()
		 * @generated
		 */
		EClass ORDER_ITEM_ASSOC = eINSTANCE.getOrderItemAssoc();

		/**
		 * The meta object literal for the '<em><b>Order Item Assoc Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE = eINSTANCE.getOrderItemAssoc_OrderItemAssocType();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ASSOC__ORDER = eINSTANCE.getOrderItemAssoc_Order();

		/**
		 * The meta object literal for the '<em><b>To Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ASSOC__TO_ORDER = eINSTANCE.getOrderItemAssoc_ToOrder();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemAssoc_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderItemAssoc_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>To Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemAssoc_ToOrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>To Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderItemAssoc_ToShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC__QUANTITY = eINSTANCE.getOrderItemAssoc_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocTypeImpl <em>Item Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemAssocTypeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemAssocType()
		 * @generated
		 */
		EClass ORDER_ITEM_ASSOC_TYPE = eINSTANCE.getOrderItemAssocType();

		/**
		 * The meta object literal for the '<em><b>Order Item Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC_TYPE__ORDER_ITEM_ASSOC_TYPE_ID = eINSTANCE.getOrderItemAssocType_OrderItemAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getOrderItemAssocType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ASSOC_TYPE__HAS_TABLE = eINSTANCE.getOrderItemAssocType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ASSOC_TYPE__PARENT_TYPE = eINSTANCE.getOrderItemAssocType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemAttributeImpl <em>Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemAttribute()
		 * @generated
		 */
		EClass ORDER_ITEM_ATTRIBUTE = eINSTANCE.getOrderItemAttribute();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ATTRIBUTE__ORDER_ID = eINSTANCE.getOrderItemAttribute_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ATTRIBUTE__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemAttribute_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getOrderItemAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getOrderItemAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getOrderItemAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemBillingImpl <em>Item Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemBillingImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemBilling()
		 * @generated
		 */
		EClass ORDER_ITEM_BILLING = eINSTANCE.getOrderItemBilling();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_BILLING__ORDER = eINSTANCE.getOrderItemBilling_Order();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_BILLING__INVOICE = eINSTANCE.getOrderItemBilling_Invoice();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemBilling_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = eINSTANCE.getOrderItemBilling_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_BILLING__AMOUNT = eINSTANCE.getOrderItemBilling_Amount();

		/**
		 * The meta object literal for the '<em><b>Item Issuance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_BILLING__ITEM_ISSUANCE = eINSTANCE.getOrderItemBilling_ItemIssuance();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_BILLING__QUANTITY = eINSTANCE.getOrderItemBilling_Quantity();

		/**
		 * The meta object literal for the '<em><b>Shipment Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_BILLING__SHIPMENT_RECEIPT = eINSTANCE.getOrderItemBilling_ShipmentReceipt();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl <em>Item Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemChange()
		 * @generated
		 */
		EClass ORDER_ITEM_CHANGE = eINSTANCE.getOrderItemChange();

		/**
		 * The meta object literal for the '<em><b>Order Item Change Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID = eINSTANCE.getOrderItemChange_OrderItemChangeId();

		/**
		 * The meta object literal for the '<em><b>Cancel Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__CANCEL_QUANTITY = eINSTANCE.getOrderItemChange_CancelQuantity();

		/**
		 * The meta object literal for the '<em><b>Change Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__CHANGE_COMMENTS = eINSTANCE.getOrderItemChange_ChangeComments();

		/**
		 * The meta object literal for the '<em><b>Change Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__CHANGE_DATETIME = eINSTANCE.getOrderItemChange_ChangeDatetime();

		/**
		 * The meta object literal for the '<em><b>Change Type Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM = eINSTANCE.getOrderItemChange_ChangeTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Change User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN = eINSTANCE.getOrderItemChange_ChangeUserLogin();

		/**
		 * The meta object literal for the '<em><b>Item Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__ITEM_DESCRIPTION = eINSTANCE.getOrderItemChange_ItemDescription();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CHANGE__ORDER = eINSTANCE.getOrderItemChange_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemChange_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__QUANTITY = eINSTANCE.getOrderItemChange_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reason Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CHANGE__REASON_ENUM = eINSTANCE.getOrderItemChange_ReasonEnum();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CHANGE__UNIT_PRICE = eINSTANCE.getOrderItemChange_UnitPrice();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemContactMechImpl <em>Item Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemContactMechImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemContactMech()
		 * @generated
		 */
		EClass ORDER_ITEM_CONTACT_MECH = eINSTANCE.getOrderItemContactMech();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CONTACT_MECH__ORDER = eINSTANCE.getOrderItemContactMech_Order();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = eINSTANCE.getOrderItemContactMech_ContactMechPurposeType();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_CONTACT_MECH__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemContactMech_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_CONTACT_MECH__CONTACT_MECH = eINSTANCE.getOrderItemContactMech_ContactMech();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupImpl <em>Item Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemGroup()
		 * @generated
		 */
		EClass ORDER_ITEM_GROUP = eINSTANCE.getOrderItemGroup();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_GROUP__ORDER = eINSTANCE.getOrderItemGroup_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID = eINSTANCE.getOrderItemGroup_OrderItemGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_GROUP__GROUP_NAME = eINSTANCE.getOrderItemGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>Parent Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID = eINSTANCE.getOrderItemGroup_ParentGroupSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupOrderImpl <em>Item Group Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemGroupOrderImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemGroupOrder()
		 * @generated
		 */
		EClass ORDER_ITEM_GROUP_ORDER = eINSTANCE.getOrderItemGroupOrder();

		/**
		 * The meta object literal for the '<em><b>Group Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_GROUP_ORDER__GROUP_ORDER = eINSTANCE.getOrderItemGroupOrder_GroupOrder();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_GROUP_ORDER__ORDER_ID = eINSTANCE.getOrderItemGroupOrder_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_GROUP_ORDER__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemGroupOrder_OrderItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl <em>Item Price Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemPriceInfo()
		 * @generated
		 */
		EClass ORDER_ITEM_PRICE_INFO = eINSTANCE.getOrderItemPriceInfo();

		/**
		 * The meta object literal for the '<em><b>Order Item Price Info Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID = eINSTANCE.getOrderItemPriceInfo_OrderItemPriceInfoId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_PRICE_INFO__DESCRIPTION = eINSTANCE.getOrderItemPriceInfo_Description();

		/**
		 * The meta object literal for the '<em><b>Modify Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT = eINSTANCE.getOrderItemPriceInfo_ModifyAmount();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_PRICE_INFO__ORDER = eINSTANCE.getOrderItemPriceInfo_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemPriceInfo_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Price Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID = eINSTANCE.getOrderItemPriceInfo_ProductPriceActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Price Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE = eINSTANCE.getOrderItemPriceInfo_ProductPriceRule();

		/**
		 * The meta object literal for the '<em><b>Rate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_PRICE_INFO__RATE_CODE = eINSTANCE.getOrderItemPriceInfo_RateCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemRoleImpl <em>Item Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemRoleImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemRole()
		 * @generated
		 */
		EClass ORDER_ITEM_ROLE = eINSTANCE.getOrderItemRole();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ROLE__ORDER = eINSTANCE.getOrderItemRole_Order();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ROLE__PARTY = eINSTANCE.getOrderItemRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_ROLE__ROLE_TYPE = eINSTANCE.getOrderItemRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_ROLE__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemRole_OrderItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupImpl <em>Item Ship Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemShipGroup()
		 * @generated
		 */
		EClass ORDER_ITEM_SHIP_GROUP = eINSTANCE.getOrderItemShipGroup();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__ORDER = eINSTANCE.getOrderItemShipGroup_Order();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderItemShipGroup_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Carrier Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY = eINSTANCE.getOrderItemShipGroup_CarrierParty();

		/**
		 * The meta object literal for the '<em><b>Carrier Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID = eINSTANCE.getOrderItemShipGroup_CarrierRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__CONTACT_MECH = eINSTANCE.getOrderItemShipGroup_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Estimated Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE = eINSTANCE.getOrderItemShipGroup_EstimatedDeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Ship Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE = eINSTANCE.getOrderItemShipGroup_EstimatedShipDate();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__FACILITY = eINSTANCE.getOrderItemShipGroup_Facility();

		/**
		 * The meta object literal for the '<em><b>Gift Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE = eINSTANCE.getOrderItemShipGroup_GiftMessage();

		/**
		 * The meta object literal for the '<em><b>Is Gift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__IS_GIFT = eINSTANCE.getOrderItemShipGroup_IsGift();

		/**
		 * The meta object literal for the '<em><b>May Split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__MAY_SPLIT = eINSTANCE.getOrderItemShipGroup_MaySplit();

		/**
		 * The meta object literal for the '<em><b>Ship After Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE = eINSTANCE.getOrderItemShipGroup_ShipAfterDate();

		/**
		 * The meta object literal for the '<em><b>Ship By Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE = eINSTANCE.getOrderItemShipGroup_ShipByDate();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE = eINSTANCE.getOrderItemShipGroup_ShipmentMethodType();

		/**
		 * The meta object literal for the '<em><b>Shipping Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS = eINSTANCE.getOrderItemShipGroup_ShippingInstructions();

		/**
		 * The meta object literal for the '<em><b>Supplier Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT = eINSTANCE.getOrderItemShipGroup_SupplierAgreement();

		/**
		 * The meta object literal for the '<em><b>Supplier Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY = eINSTANCE.getOrderItemShipGroup_SupplierParty();

		/**
		 * The meta object literal for the '<em><b>Telecom Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH = eINSTANCE.getOrderItemShipGroup_TelecomContactMech();

		/**
		 * The meta object literal for the '<em><b>Tracking Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER = eINSTANCE.getOrderItemShipGroup_TrackingNumber();

		/**
		 * The meta object literal for the '<em><b>Vendor Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY = eINSTANCE.getOrderItemShipGroup_VendorParty();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupAssocImpl <em>Item Ship Group Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGroupAssocImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemShipGroupAssoc()
		 * @generated
		 */
		EClass ORDER_ITEM_SHIP_GROUP_ASSOC = eINSTANCE.getOrderItemShipGroupAssoc();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER = eINSTANCE.getOrderItemShipGroupAssoc_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemShipGroupAssoc_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP_ASSOC__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderItemShipGroupAssoc_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Cancel Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP_ASSOC__CANCEL_QUANTITY = eINSTANCE.getOrderItemShipGroupAssoc_CancelQuantity();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GROUP_ASSOC__QUANTITY = eINSTANCE.getOrderItemShipGroupAssoc_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl <em>Item Ship Grp Inv Res</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemShipGrpInvRes()
		 * @generated
		 */
		EClass ORDER_ITEM_SHIP_GRP_INV_RES = eINSTANCE.getOrderItemShipGrpInvRes();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GRP_INV_RES__ORDER = eINSTANCE.getOrderItemShipGrpInvRes_Order();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM = eINSTANCE.getOrderItemShipGrpInvRes_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderItemShipGrpInvRes_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderItemShipGrpInvRes_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Created Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME = eINSTANCE.getOrderItemShipGrpInvRes_CreatedDatetime();

		/**
		 * The meta object literal for the '<em><b>Current Promised Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE = eINSTANCE.getOrderItemShipGrpInvRes_CurrentPromisedDate();

		/**
		 * The meta object literal for the '<em><b>Old Pick Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE = eINSTANCE.getOrderItemShipGrpInvRes_OldPickStartDate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY = eINSTANCE.getOrderItemShipGrpInvRes_Priority();

		/**
		 * The meta object literal for the '<em><b>Promised Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME = eINSTANCE.getOrderItemShipGrpInvRes_PromisedDatetime();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY = eINSTANCE.getOrderItemShipGrpInvRes_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Not Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE = eINSTANCE.getOrderItemShipGrpInvRes_QuantityNotAvailable();

		/**
		 * The meta object literal for the '<em><b>Reserve Order Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID = eINSTANCE.getOrderItemShipGrpInvRes_ReserveOrderEnumId();

		/**
		 * The meta object literal for the '<em><b>Reserved Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME = eINSTANCE.getOrderItemShipGrpInvRes_ReservedDatetime();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID = eINSTANCE.getOrderItemShipGrpInvRes_SequenceId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemType()
		 * @generated
		 */
		EClass ORDER_ITEM_TYPE = eINSTANCE.getOrderItemType();

		/**
		 * The meta object literal for the '<em><b>Order Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID = eINSTANCE.getOrderItemType_OrderItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_TYPE__DESCRIPTION = eINSTANCE.getOrderItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_TYPE__HAS_TABLE = eINSTANCE.getOrderItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Order Item Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS = eINSTANCE.getOrderItemType_OrderItemTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_TYPE__PARENT_TYPE = eINSTANCE.getOrderItemType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeAttrImpl <em>Item Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderItemTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderItemTypeAttr()
		 * @generated
		 */
		EClass ORDER_ITEM_TYPE_ATTR = eINSTANCE.getOrderItemTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Order Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ITEM_TYPE_ATTR__ORDER_ITEM_TYPE = eINSTANCE.getOrderItemTypeAttr_OrderItemType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getOrderItemTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getOrderItemTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderNotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderNotificationImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderNotification()
		 * @generated
		 */
		EClass ORDER_NOTIFICATION = eINSTANCE.getOrderNotification();

		/**
		 * The meta object literal for the '<em><b>Order Notification Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID = eINSTANCE.getOrderNotification_OrderNotificationId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_NOTIFICATION__COMMENTS = eINSTANCE.getOrderNotification_Comments();

		/**
		 * The meta object literal for the '<em><b>Email Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_NOTIFICATION__EMAIL_TYPE = eINSTANCE.getOrderNotification_EmailType();

		/**
		 * The meta object literal for the '<em><b>Notification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_NOTIFICATION__NOTIFICATION_DATE = eINSTANCE.getOrderNotification_NotificationDate();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_NOTIFICATION__ORDER = eINSTANCE.getOrderNotification_Order();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl <em>Payment Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderPaymentPreference()
		 * @generated
		 */
		EClass ORDER_PAYMENT_PREFERENCE = eINSTANCE.getOrderPaymentPreference();

		/**
		 * The meta object literal for the '<em><b>Order Payment Preference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID = eINSTANCE.getOrderPaymentPreference_OrderPaymentPreferenceId();

		/**
		 * The meta object literal for the '<em><b>Billing Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE = eINSTANCE.getOrderPaymentPreference_BillingPostalCode();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN = eINSTANCE.getOrderPaymentPreference_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__CREATED_DATE = eINSTANCE.getOrderPaymentPreference_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT = eINSTANCE.getOrderPaymentPreference_FinAccount();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getOrderPaymentPreference_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE = eINSTANCE.getOrderPaymentPreference_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Manual Auth Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE = eINSTANCE.getOrderPaymentPreference_ManualAuthCode();

		/**
		 * The meta object literal for the '<em><b>Manual Ref Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM = eINSTANCE.getOrderPaymentPreference_ManualRefNum();

		/**
		 * The meta object literal for the '<em><b>Max Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT = eINSTANCE.getOrderPaymentPreference_MaxAmount();

		/**
		 * The meta object literal for the '<em><b>Needs Nsf Retry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY = eINSTANCE.getOrderPaymentPreference_NeedsNsfRetry();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__ORDER = eINSTANCE.getOrderPaymentPreference_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderPaymentPreference_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Overflow Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG = eINSTANCE.getOrderPaymentPreference_OverflowFlag();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD = eINSTANCE.getOrderPaymentPreference_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE = eINSTANCE.getOrderPaymentPreference_PaymentMethodType();

		/**
		 * The meta object literal for the '<em><b>Present Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG = eINSTANCE.getOrderPaymentPreference_PresentFlag();

		/**
		 * The meta object literal for the '<em><b>Process Attempt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT = eINSTANCE.getOrderPaymentPreference_ProcessAttempt();

		/**
		 * The meta object literal for the '<em><b>Product Price Purpose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE = eINSTANCE.getOrderPaymentPreference_ProductPricePurpose();

		/**
		 * The meta object literal for the '<em><b>Security Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__SECURITY_CODE = eINSTANCE.getOrderPaymentPreference_SecurityCode();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderPaymentPreference_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PAYMENT_PREFERENCE__STATUS = eINSTANCE.getOrderPaymentPreference_Status();

		/**
		 * The meta object literal for the '<em><b>Swiped Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG = eINSTANCE.getOrderPaymentPreference_SwipedFlag();

		/**
		 * The meta object literal for the '<em><b>Track2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PAYMENT_PREFERENCE__TRACK2 = eINSTANCE.getOrderPaymentPreference_Track2();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderProductPromoCodeImpl <em>Product Promo Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderProductPromoCodeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderProductPromoCode()
		 * @generated
		 */
		EClass ORDER_PRODUCT_PROMO_CODE = eINSTANCE.getOrderProductPromoCode();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PRODUCT_PROMO_CODE__ORDER = eINSTANCE.getOrderProductPromoCode_Order();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE = eINSTANCE.getOrderProductPromoCode_ProductPromoCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderRoleImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderRole()
		 * @generated
		 */
		EClass ORDER_ROLE = eINSTANCE.getOrderRole();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ROLE__ORDER = eINSTANCE.getOrderRole_Order();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ROLE__PARTY = eINSTANCE.getOrderRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ROLE__ROLE_TYPE = eINSTANCE.getOrderRole_RoleType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderShipmentImpl <em>Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderShipmentImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderShipment()
		 * @generated
		 */
		EClass ORDER_SHIPMENT = eINSTANCE.getOrderShipment();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SHIPMENT__ORDER = eINSTANCE.getOrderShipment_Order();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SHIPMENT__SHIPMENT = eINSTANCE.getOrderShipment_Shipment();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SHIPMENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderShipment_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SHIPMENT__SHIP_GROUP_SEQ_ID = eINSTANCE.getOrderShipment_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SHIPMENT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getOrderShipment_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SHIPMENT__QUANTITY = eINSTANCE.getOrderShipment_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderStatusImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderStatus()
		 * @generated
		 */
		EClass ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '<em><b>Order Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__ORDER_STATUS_ID = eINSTANCE.getOrderStatus_OrderStatusId();

		/**
		 * The meta object literal for the '<em><b>Change Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__CHANGE_REASON = eINSTANCE.getOrderStatus_ChangeReason();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_STATUS__ORDER = eINSTANCE.getOrderStatus_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderStatus_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Order Payment Preference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_STATUS__ORDER_PAYMENT_PREFERENCE = eINSTANCE.getOrderStatus_OrderPaymentPreference();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_STATUS__STATUS = eINSTANCE.getOrderStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Status Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_STATUS__STATUS_DATETIME = eINSTANCE.getOrderStatus_StatusDatetime();

		/**
		 * The meta object literal for the '<em><b>Status User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_STATUS__STATUS_USER_LOGIN = eINSTANCE.getOrderStatus_StatusUserLogin();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderSummaryEntryImpl <em>Summary Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderSummaryEntryImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderSummaryEntry()
		 * @generated
		 */
		EClass ORDER_SUMMARY_ENTRY = eINSTANCE.getOrderSummaryEntry();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SUMMARY_ENTRY__PRODUCT = eINSTANCE.getOrderSummaryEntry_Product();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SUMMARY_ENTRY__FACILITY = eINSTANCE.getOrderSummaryEntry_Facility();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SUMMARY_ENTRY__ENTRY_DATE = eINSTANCE.getOrderSummaryEntry_EntryDate();

		/**
		 * The meta object literal for the '<em><b>Gross Sales</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SUMMARY_ENTRY__GROSS_SALES = eINSTANCE.getOrderSummaryEntry_GrossSales();

		/**
		 * The meta object literal for the '<em><b>Product Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SUMMARY_ENTRY__PRODUCT_COST = eINSTANCE.getOrderSummaryEntry_ProductCost();

		/**
		 * The meta object literal for the '<em><b>Total Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY = eINSTANCE.getOrderSummaryEntry_TotalQuantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTermImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderTerm()
		 * @generated
		 */
		EClass ORDER_TERM = eINSTANCE.getOrderTerm();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TERM__ORDER = eINSTANCE.getOrderTerm_Order();

		/**
		 * The meta object literal for the '<em><b>Term Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TERM__TERM_TYPE = eINSTANCE.getOrderTerm_TermType();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderTerm_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM__DESCRIPTION = eINSTANCE.getOrderTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM__TERM_DAYS = eINSTANCE.getOrderTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM__TERM_VALUE = eINSTANCE.getOrderTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM__TEXT_VALUE = eINSTANCE.getOrderTerm_TextValue();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TERM__UOM = eINSTANCE.getOrderTerm_Uom();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTermAttributeImpl <em>Term Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTermAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderTermAttribute()
		 * @generated
		 */
		EClass ORDER_TERM_ATTRIBUTE = eINSTANCE.getOrderTermAttribute();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM_ATTRIBUTE__TERM_TYPE_ID = eINSTANCE.getOrderTermAttribute_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM_ATTRIBUTE__ORDER_ID = eINSTANCE.getOrderTermAttribute_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM_ATTRIBUTE__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderTermAttribute_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getOrderTermAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getOrderTermAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TERM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getOrderTermAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTypeImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderType()
		 * @generated
		 */
		EClass ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '<em><b>Order Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE__ORDER_TYPE_ID = eINSTANCE.getOrderType_OrderTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE__DESCRIPTION = eINSTANCE.getOrderType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE__HAS_TABLE = eINSTANCE.getOrderType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Order Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TYPE__ORDER_TYPE_ATTRS = eINSTANCE.getOrderType_OrderTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TYPE__PARENT_TYPE = eINSTANCE.getOrderType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getOrderTypeAttr()
		 * @generated
		 */
		EClass ORDER_TYPE_ATTR = eINSTANCE.getOrderTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Order Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TYPE_ATTR__ORDER_TYPE = eINSTANCE.getOrderTypeAttr_OrderType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE_ATTR__ATTR_NAME = eINSTANCE.getOrderTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE_ATTR__DESCRIPTION = eINSTANCE.getOrderTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.ProductOrderItemImpl <em>Product Order Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.ProductOrderItemImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getProductOrderItem()
		 * @generated
		 */
		EClass PRODUCT_ORDER_ITEM = eINSTANCE.getProductOrderItem();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER_ITEM__ORDER = eINSTANCE.getProductOrderItem_Order();

		/**
		 * The meta object literal for the '<em><b>Engagement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER_ITEM__ENGAGEMENT = eINSTANCE.getProductOrderItem_Engagement();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID = eINSTANCE.getProductOrderItem_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER_ITEM__PRODUCT = eINSTANCE.getProductOrderItem_Product();

		/**
		 * The meta object literal for the '<em><b>Engagement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID = eINSTANCE.getProductOrderItem_EngagementItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.order.impl.WorkOrderItemFulfillmentImpl <em>Work Order Item Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.order.impl.WorkOrderItemFulfillmentImpl
		 * @see org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl#getWorkOrderItemFulfillment()
		 * @generated
		 */
		EClass WORK_ORDER_ITEM_FULFILLMENT = eINSTANCE.getWorkOrderItemFulfillment();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_ORDER_ITEM_FULFILLMENT__ORDER = eINSTANCE.getWorkOrderItemFulfillment_Order();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_ORDER_ITEM_FULFILLMENT__WORK_EFFORT = eINSTANCE.getWorkOrderItemFulfillment_WorkEffort();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_ORDER_ITEM_FULFILLMENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getWorkOrderItemFulfillment_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_ORDER_ITEM_FULFILLMENT__SHIP_GROUP_SEQ_ID = eINSTANCE.getWorkOrderItemFulfillment_ShipGroupSeqId();

	}

} //OrderPackage
