/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

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
 * @see org.abchip.mimo.biz.model.order.return_.ReturnFactory
 * @model kind="package"
 * @generated
 */
public interface ReturnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "return";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/order/return";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-return";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReturnPackage eINSTANCE = org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.CommunicationEventReturnImpl <em>Communication Event Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.CommunicationEventReturnImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getCommunicationEventReturn()
	 * @generated
	 */
	int COMMUNICATION_EVENT_RETURN = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__RETURN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__COMMUNICATION_EVENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Communication Event Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl <em>Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnAdjustment()
	 * @generated
	 */
	int RETURN_ADJUSTMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__EXEMPT_AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__INCLUDE_IN_TAX = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Order Adjustment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__ORDER_ADJUSTMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Primary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRIMARY_GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_PROMO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Return Adjustment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Secondary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SECONDARY_GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SOURCE_PERCENTAGE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentTypeImpl <em>Adjustment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentTypeImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnAdjustmentType()
	 * @generated
	 */
	int RETURN_ADJUSTMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__RETURN_ADJUSTMENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnContactMechImpl <em>Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnContactMechImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnContactMech()
	 * @generated
	 */
	int RETURN_CONTACT_MECH = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__RETURN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnHeader()
	 * @generated
	 */
	int RETURN_HEADER = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__RETURN_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__BILLING_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Communication Event Returns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__COMMUNICATION_EVENT_RETURNS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CREATED_BY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Destination Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__DESTINATION_FACILITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__ENTRY_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__FIN_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>From Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__FROM_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Needs Inventory Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__NEEDS_INVENTORY_RECEIVE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Origin Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__ORIGIN_CONTACT_MECH = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__PAYMENT_METHOD = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Return Header Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__RETURN_HEADER_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Return Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__RETURN_ITEMS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Supplier Rma Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__SUPPLIER_RMA_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>To Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__TO_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderTypeImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnHeaderType()
	 * @generated
	 */
	int RETURN_HEADER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Header Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItem()
	 * @generated
	 */
	int RETURN_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Expected Item Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__EXPECTED_ITEM_STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Received Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RECEIVED_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Item Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ITEM_RESPONSE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Return Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Return Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Return Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_REASON = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemBillingImpl <em>Item Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemBillingImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemBilling()
	 * @generated
	 */
	int RETURN_ITEM_BILLING = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__RETURN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Shipment Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__SHIPMENT_RECEIPT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Item Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemResponseImpl <em>Item Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemResponseImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemResponse()
	 * @generated
	 */
	int RETURN_ITEM_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Item Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__BILLING_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fin Account Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Payment Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__PAYMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Replacement Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Response Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__RESPONSE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Item Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemShipmentImpl <em>Item Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemShipmentImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemShipment()
	 * @generated
	 */
	int RETURN_ITEM_SHIPMENT = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__RETURN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__SHIPMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemType()
	 * @generated
	 */
	int RETURN_ITEM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__RETURN_ITEM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeMapImpl <em>Item Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeMapImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemTypeMap()
	 * @generated
	 */
	int RETURN_ITEM_TYPE_MAP = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Header Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnReasonImpl <em>Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnReasonImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnReason()
	 * @generated
	 */
	int RETURN_REASON = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__RETURN_REASON_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__SEQUENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnStatusImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnStatus()
	 * @generated
	 */
	int RETURN_STATUS = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__RETURN_STATUS_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__RETURN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__STATUS_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnTypeImpl
	 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__RETURN_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__SEQUENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn <em>Communication Event Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Event Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn
	 * @generated
	 */
	EClass getCommunicationEventReturn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getReturn()
	 * @see #getCommunicationEventReturn()
	 * @generated
	 */
	EReference getCommunicationEventReturn_Return();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getCommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getCommunicationEvent()
	 * @see #getCommunicationEventReturn()
	 * @generated
	 */
	EReference getCommunicationEventReturn_CommunicationEvent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment
	 * @generated
	 */
	EClass getReturnAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnAdjustmentId <em>Return Adjustment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Adjustment Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnAdjustmentId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ReturnAdjustmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getAmount()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getComments()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCorrespondingProductId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_CorrespondingProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCreatedByUserLogin()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCreatedDate()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getCustomerReferenceId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_CustomerReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getDescription()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getExemptAmount <em>Exempt Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getExemptAmount()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ExemptAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getIncludeInShipping <em>Include In Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Shipping</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getIncludeInShipping()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_IncludeInShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getIncludeInTax <em>Include In Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Tax</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getIncludeInTax()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_IncludeInTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getLastModifiedByUserLogin()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getLastModifiedDate()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getOrderAdjustment <em>Order Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getOrderAdjustment()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_OrderAdjustment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getOverrideGlAccount <em>Override Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getOverrideGlAccount()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_OverrideGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getPrimaryGeo <em>Primary Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Geo</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getPrimaryGeo()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_PrimaryGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductFeatureId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductPromo()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductPromoActionSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getProductPromoRuleId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ProductPromoRuleId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturn()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_Return();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnAdjustmentType <em>Return Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnAdjustmentType()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ReturnAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnItemSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getReturnType()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getSecondaryGeo <em>Secondary Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Geo</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getSecondaryGeo()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_SecondaryGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getShipGroupSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getSourcePercentage <em>Source Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getSourcePercentage()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_SourcePercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getSourceReferenceId <em>Source Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getSourceReferenceId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_SourceReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getTaxAuthGeoId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getTaxAuthPartyId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getTaxAuthorityRateSeq <em>Tax Authority Rate Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Rate Seq</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustment#getTaxAuthorityRateSeq()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_TaxAuthorityRateSeq();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType
	 * @generated
	 */
	EClass getReturnAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Adjustment Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#getReturnAdjustmentTypeId()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EAttribute getReturnAdjustmentType_ReturnAdjustmentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#getDescription()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EAttribute getReturnAdjustmentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#isHasTable()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EAttribute getReturnAdjustmentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType#getParentType()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EReference getReturnAdjustmentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnContactMech
	 * @generated
	 */
	EClass getReturnContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getReturn()
	 * @see #getReturnContactMech()
	 * @generated
	 */
	EReference getReturnContactMech_Return();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMech()
	 * @see #getReturnContactMech()
	 * @generated
	 */
	EReference getReturnContactMech_ContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMechPurposeType()
	 * @see #getReturnContactMech()
	 * @generated
	 */
	EReference getReturnContactMech_ContactMechPurposeType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader
	 * @generated
	 */
	EClass getReturnHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_ReturnId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getBillingAccount <em>Billing Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getBillingAccount()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_BillingAccount();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCommunicationEventReturns <em>Communication Event Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Returns</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCommunicationEventReturns()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_CommunicationEventReturns();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCreatedBy()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_CreatedBy();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCurrencyUom()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_CurrencyUom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getDestinationFacility <em>Destination Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Facility</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getDestinationFacility()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_DestinationFacility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getEntryDate()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_EntryDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFinAccount()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_FinAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFromParty <em>From Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFromParty()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_FromParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getNeedsInventoryReceive <em>Needs Inventory Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Inventory Receive</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getNeedsInventoryReceive()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_NeedsInventoryReceive();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getOriginContactMech <em>Origin Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getOriginContactMech()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_OriginContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getPaymentMethod()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_PaymentMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnHeaderType <em>Return Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Header Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnHeaderType()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_ReturnHeaderType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnItems <em>Return Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Items</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnItems()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_ReturnItems();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getStatus()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Rma Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getSupplierRmaId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_SupplierRmaId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getToParty <em>To Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeader#getToParty()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_ToParty();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeaderType
	 * @generated
	 */
	EClass getReturnHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeaderType#getReturnHeaderTypeId <em>Return Header Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Header Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeaderType#getReturnHeaderTypeId()
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	EAttribute getReturnHeaderType_ReturnHeaderTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeaderType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeaderType#getDescription()
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	EAttribute getReturnHeaderType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeaderType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnHeaderType#getParentType()
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	EReference getReturnHeaderType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem
	 * @generated
	 */
	EClass getReturnItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturn()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_Return();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemSeqId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReturnItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getDescription()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Item Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getExpectedItemStatus()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ExpectedItemStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrder()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrderItemSeqId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getProduct()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReceivedQuantity <em>Received Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReceivedQuantity()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReceivedQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemResponse <em>Return Item Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Item Response</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemResponse()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnItemResponse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemType <em>Return Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemType()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnPrice <em>Return Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnPrice()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReturnPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnQuantity <em>Return Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnQuantity()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReturnQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnReason <em>Return Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Reason</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnReason()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnReason();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnType()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItem#getStatus()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling <em>Item Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Billing</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling
	 * @generated
	 */
	EClass getReturnItemBilling();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturn()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EReference getReturnItemBilling_Return();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoice()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EReference getReturnItemBilling_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturnItemSeqId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_ReturnItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoiceItemSeqId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getAmount()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getQuantity()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getShipmentReceipt <em>Shipment Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Receipt</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getShipmentReceipt()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EReference getReturnItemBilling_ShipmentReceipt();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse <em>Item Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Response</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse
	 * @generated
	 */
	EClass getReturnItemResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReturnItemResponseId <em>Return Item Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Response Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReturnItemResponseId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EAttribute getReturnItemResponse_ReturnItemResponseId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getBillingAccount <em>Billing Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getBillingAccount()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_BillingAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getFinAccountTrans <em>Fin Account Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getFinAccountTrans()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_FinAccountTrans();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getOrderPaymentPreference <em>Order Payment Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Payment Preference</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getOrderPaymentPreference()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_OrderPaymentPreference();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getPayment()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_Payment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReplacementOrder <em>Replacement Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replacement Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReplacementOrder()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_ReplacementOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseAmount <em>Response Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseAmount()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EAttribute getReturnItemResponse_ResponseAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseDate <em>Response Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseDate()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EAttribute getReturnItemResponse_ResponseDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemShipment <em>Item Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemShipment
	 * @generated
	 */
	EClass getReturnItemShipment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getReturn()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EReference getReturnItemShipment_Return();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getShipment()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EReference getReturnItemShipment_Shipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getReturnItemSeqId()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EAttribute getReturnItemShipment_ReturnItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getShipmentItemSeqId()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EAttribute getReturnItemShipment_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemShipment#getQuantity()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EAttribute getReturnItemShipment_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemType
	 * @generated
	 */
	EClass getReturnItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemType#getReturnItemTypeId <em>Return Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemType#getReturnItemTypeId()
	 * @see #getReturnItemType()
	 * @generated
	 */
	EAttribute getReturnItemType_ReturnItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemType#getDescription()
	 * @see #getReturnItemType()
	 * @generated
	 */
	EAttribute getReturnItemType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemType#getParentType()
	 * @see #getReturnItemType()
	 * @generated
	 */
	EReference getReturnItemType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap <em>Item Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Map</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap
	 * @generated
	 */
	EClass getReturnItemTypeMap();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnHeaderType <em>Return Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Header Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnHeaderType()
	 * @see #getReturnItemTypeMap()
	 * @generated
	 */
	EReference getReturnItemTypeMap_ReturnHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemMapKey <em>Return Item Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Map Key</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemMapKey()
	 * @see #getReturnItemTypeMap()
	 * @generated
	 */
	EAttribute getReturnItemTypeMap_ReturnItemMapKey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemType <em>Return Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemType()
	 * @see #getReturnItemTypeMap()
	 * @generated
	 */
	EReference getReturnItemTypeMap_ReturnItemType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnReason
	 * @generated
	 */
	EClass getReturnReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnReason#getReturnReasonId <em>Return Reason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Reason Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnReason#getReturnReasonId()
	 * @see #getReturnReason()
	 * @generated
	 */
	EAttribute getReturnReason_ReturnReasonId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnReason#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnReason#getDescription()
	 * @see #getReturnReason()
	 * @generated
	 */
	EAttribute getReturnReason_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnReason#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnReason#getSequenceId()
	 * @see #getReturnReason()
	 * @generated
	 */
	EAttribute getReturnReason_SequenceId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus
	 * @generated
	 */
	EClass getReturnStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnStatusId <em>Return Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Status Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnStatusId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EAttribute getReturnStatus_ReturnStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus#getChangeByUserLogin()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EReference getReturnStatus_ChangeByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturn()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EReference getReturnStatus_Return();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnItemSeqId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EAttribute getReturnStatus_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatus()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EReference getReturnStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatusDatetime <em>Status Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatusDatetime()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EAttribute getReturnStatus_StatusDatetime();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.return_.ReturnType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnType#getReturnTypeId <em>Return Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnType#getReturnTypeId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_ReturnTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnType#getDescription()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.return_.ReturnType#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnType#getSequenceId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_SequenceId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReturnFactory getReturnFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.CommunicationEventReturnImpl <em>Communication Event Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.CommunicationEventReturnImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getCommunicationEventReturn()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_RETURN = eINSTANCE.getCommunicationEventReturn();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_RETURN__RETURN = eINSTANCE.getCommunicationEventReturn_Return();

		/**
		 * The meta object literal for the '<em><b>Communication Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_RETURN__COMMUNICATION_EVENT = eINSTANCE.getCommunicationEventReturn_CommunicationEvent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl <em>Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnAdjustment()
		 * @generated
		 */
		EClass RETURN_ADJUSTMENT = eINSTANCE.getReturnAdjustment();

		/**
		 * The meta object literal for the '<em><b>Return Adjustment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID = eINSTANCE.getReturnAdjustment_ReturnAdjustmentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__AMOUNT = eINSTANCE.getReturnAdjustment_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__COMMENTS = eINSTANCE.getReturnAdjustment_Comments();

		/**
		 * The meta object literal for the '<em><b>Corresponding Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = eINSTANCE.getReturnAdjustment_CorrespondingProductId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getReturnAdjustment_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__CREATED_DATE = eINSTANCE.getReturnAdjustment_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Customer Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID = eINSTANCE.getReturnAdjustment_CustomerReferenceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__DESCRIPTION = eINSTANCE.getReturnAdjustment_Description();

		/**
		 * The meta object literal for the '<em><b>Exempt Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__EXEMPT_AMOUNT = eINSTANCE.getReturnAdjustment_ExemptAmount();

		/**
		 * The meta object literal for the '<em><b>Include In Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING = eINSTANCE.getReturnAdjustment_IncludeInShipping();

		/**
		 * The meta object literal for the '<em><b>Include In Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__INCLUDE_IN_TAX = eINSTANCE.getReturnAdjustment_IncludeInTax();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getReturnAdjustment_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__LAST_MODIFIED_DATE = eINSTANCE.getReturnAdjustment_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__ORDER_ADJUSTMENT = eINSTANCE.getReturnAdjustment_OrderAdjustment();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT = eINSTANCE.getReturnAdjustment_OverrideGlAccount();

		/**
		 * The meta object literal for the '<em><b>Primary Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__PRIMARY_GEO = eINSTANCE.getReturnAdjustment_PrimaryGeo();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID = eINSTANCE.getReturnAdjustment_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__PRODUCT_PROMO = eINSTANCE.getReturnAdjustment_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getReturnAdjustment_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = eINSTANCE.getReturnAdjustment_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__RETURN = eINSTANCE.getReturnAdjustment_Return();

		/**
		 * The meta object literal for the '<em><b>Return Adjustment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE = eINSTANCE.getReturnAdjustment_ReturnAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnAdjustment_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__RETURN_TYPE = eINSTANCE.getReturnAdjustment_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Secondary Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__SECONDARY_GEO = eINSTANCE.getReturnAdjustment_SecondaryGeo();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID = eINSTANCE.getReturnAdjustment_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Source Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__SOURCE_PERCENTAGE = eINSTANCE.getReturnAdjustment_SourcePercentage();

		/**
		 * The meta object literal for the '<em><b>Source Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID = eINSTANCE.getReturnAdjustment_SourceReferenceId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID = eINSTANCE.getReturnAdjustment_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID = eINSTANCE.getReturnAdjustment_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Seq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ = eINSTANCE.getReturnAdjustment_TaxAuthorityRateSeq();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentTypeImpl <em>Adjustment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentTypeImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnAdjustmentType()
		 * @generated
		 */
		EClass RETURN_ADJUSTMENT_TYPE = eINSTANCE.getReturnAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Return Adjustment Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT_TYPE__RETURN_ADJUSTMENT_TYPE_ID = eINSTANCE.getReturnAdjustmentType_ReturnAdjustmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT_TYPE__DESCRIPTION = eINSTANCE.getReturnAdjustmentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT_TYPE__HAS_TABLE = eINSTANCE.getReturnAdjustmentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT_TYPE__PARENT_TYPE = eINSTANCE.getReturnAdjustmentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnContactMechImpl <em>Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnContactMechImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnContactMech()
		 * @generated
		 */
		EClass RETURN_CONTACT_MECH = eINSTANCE.getReturnContactMech();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_CONTACT_MECH__RETURN = eINSTANCE.getReturnContactMech_Return();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_CONTACT_MECH__CONTACT_MECH = eINSTANCE.getReturnContactMech_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = eINSTANCE.getReturnContactMech_ContactMechPurposeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnHeader()
		 * @generated
		 */
		EClass RETURN_HEADER = eINSTANCE.getReturnHeader();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__RETURN_ID = eINSTANCE.getReturnHeader_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Billing Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__BILLING_ACCOUNT = eINSTANCE.getReturnHeader_BillingAccount();

		/**
		 * The meta object literal for the '<em><b>Communication Event Returns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__COMMUNICATION_EVENT_RETURNS = eINSTANCE.getReturnHeader_CommunicationEventReturns();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__CREATED_BY = eINSTANCE.getReturnHeader_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__CURRENCY_UOM = eINSTANCE.getReturnHeader_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Destination Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__DESTINATION_FACILITY = eINSTANCE.getReturnHeader_DestinationFacility();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__ENTRY_DATE = eINSTANCE.getReturnHeader_EntryDate();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__FIN_ACCOUNT = eINSTANCE.getReturnHeader_FinAccount();

		/**
		 * The meta object literal for the '<em><b>From Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__FROM_PARTY = eINSTANCE.getReturnHeader_FromParty();

		/**
		 * The meta object literal for the '<em><b>Needs Inventory Receive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__NEEDS_INVENTORY_RECEIVE = eINSTANCE.getReturnHeader_NeedsInventoryReceive();

		/**
		 * The meta object literal for the '<em><b>Origin Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__ORIGIN_CONTACT_MECH = eINSTANCE.getReturnHeader_OriginContactMech();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__PAYMENT_METHOD = eINSTANCE.getReturnHeader_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Return Header Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__RETURN_HEADER_TYPE = eINSTANCE.getReturnHeader_ReturnHeaderType();

		/**
		 * The meta object literal for the '<em><b>Return Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__RETURN_ITEMS = eINSTANCE.getReturnHeader_ReturnItems();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__STATUS = eINSTANCE.getReturnHeader_Status();

		/**
		 * The meta object literal for the '<em><b>Supplier Rma Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__SUPPLIER_RMA_ID = eINSTANCE.getReturnHeader_SupplierRmaId();

		/**
		 * The meta object literal for the '<em><b>To Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__TO_PARTY = eINSTANCE.getReturnHeader_ToParty();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderTypeImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnHeaderType()
		 * @generated
		 */
		EClass RETURN_HEADER_TYPE = eINSTANCE.getReturnHeaderType();

		/**
		 * The meta object literal for the '<em><b>Return Header Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID = eINSTANCE.getReturnHeaderType_ReturnHeaderTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER_TYPE__DESCRIPTION = eINSTANCE.getReturnHeaderType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER_TYPE__PARENT_TYPE = eINSTANCE.getReturnHeaderType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItem()
		 * @generated
		 */
		EClass RETURN_ITEM = eINSTANCE.getReturnItem();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN = eINSTANCE.getReturnItem_Return();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnItem_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__DESCRIPTION = eINSTANCE.getReturnItem_Description();

		/**
		 * The meta object literal for the '<em><b>Expected Item Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__EXPECTED_ITEM_STATUS = eINSTANCE.getReturnItem_ExpectedItemStatus();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__ORDER = eINSTANCE.getReturnItem_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__ORDER_ITEM_SEQ_ID = eINSTANCE.getReturnItem_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__PRODUCT = eINSTANCE.getReturnItem_Product();

		/**
		 * The meta object literal for the '<em><b>Received Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RECEIVED_QUANTITY = eINSTANCE.getReturnItem_ReceivedQuantity();

		/**
		 * The meta object literal for the '<em><b>Return Item Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_ITEM_RESPONSE = eINSTANCE.getReturnItem_ReturnItemResponse();

		/**
		 * The meta object literal for the '<em><b>Return Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_ITEM_TYPE = eINSTANCE.getReturnItem_ReturnItemType();

		/**
		 * The meta object literal for the '<em><b>Return Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RETURN_PRICE = eINSTANCE.getReturnItem_ReturnPrice();

		/**
		 * The meta object literal for the '<em><b>Return Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RETURN_QUANTITY = eINSTANCE.getReturnItem_ReturnQuantity();

		/**
		 * The meta object literal for the '<em><b>Return Reason</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_REASON = eINSTANCE.getReturnItem_ReturnReason();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_TYPE = eINSTANCE.getReturnItem_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__STATUS = eINSTANCE.getReturnItem_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemBillingImpl <em>Item Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemBillingImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemBilling()
		 * @generated
		 */
		EClass RETURN_ITEM_BILLING = eINSTANCE.getReturnItemBilling();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_BILLING__RETURN = eINSTANCE.getReturnItemBilling_Return();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_BILLING__INVOICE = eINSTANCE.getReturnItemBilling_Invoice();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnItemBilling_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = eINSTANCE.getReturnItemBilling_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__AMOUNT = eINSTANCE.getReturnItemBilling_Amount();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__QUANTITY = eINSTANCE.getReturnItemBilling_Quantity();

		/**
		 * The meta object literal for the '<em><b>Shipment Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_BILLING__SHIPMENT_RECEIPT = eINSTANCE.getReturnItemBilling_ShipmentReceipt();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemResponseImpl <em>Item Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemResponseImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemResponse()
		 * @generated
		 */
		EClass RETURN_ITEM_RESPONSE = eINSTANCE.getReturnItemResponse();

		/**
		 * The meta object literal for the '<em><b>Return Item Response Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID = eINSTANCE.getReturnItemResponse_ReturnItemResponseId();

		/**
		 * The meta object literal for the '<em><b>Billing Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__BILLING_ACCOUNT = eINSTANCE.getReturnItemResponse_BillingAccount();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS = eINSTANCE.getReturnItemResponse_FinAccountTrans();

		/**
		 * The meta object literal for the '<em><b>Order Payment Preference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE = eINSTANCE.getReturnItemResponse_OrderPaymentPreference();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__PAYMENT = eINSTANCE.getReturnItemResponse_Payment();

		/**
		 * The meta object literal for the '<em><b>Replacement Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER = eINSTANCE.getReturnItemResponse_ReplacementOrder();

		/**
		 * The meta object literal for the '<em><b>Response Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT = eINSTANCE.getReturnItemResponse_ResponseAmount();

		/**
		 * The meta object literal for the '<em><b>Response Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_RESPONSE__RESPONSE_DATE = eINSTANCE.getReturnItemResponse_ResponseDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemShipmentImpl <em>Item Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemShipmentImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemShipment()
		 * @generated
		 */
		EClass RETURN_ITEM_SHIPMENT = eINSTANCE.getReturnItemShipment();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_SHIPMENT__RETURN = eINSTANCE.getReturnItemShipment_Return();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_SHIPMENT__SHIPMENT = eINSTANCE.getReturnItemShipment_Shipment();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnItemShipment_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getReturnItemShipment_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_SHIPMENT__QUANTITY = eINSTANCE.getReturnItemShipment_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemType()
		 * @generated
		 */
		EClass RETURN_ITEM_TYPE = eINSTANCE.getReturnItemType();

		/**
		 * The meta object literal for the '<em><b>Return Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_TYPE__RETURN_ITEM_TYPE_ID = eINSTANCE.getReturnItemType_ReturnItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_TYPE__DESCRIPTION = eINSTANCE.getReturnItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_TYPE__PARENT_TYPE = eINSTANCE.getReturnItemType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeMapImpl <em>Item Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnItemTypeMapImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnItemTypeMap()
		 * @generated
		 */
		EClass RETURN_ITEM_TYPE_MAP = eINSTANCE.getReturnItemTypeMap();

		/**
		 * The meta object literal for the '<em><b>Return Header Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE = eINSTANCE.getReturnItemTypeMap_ReturnHeaderType();

		/**
		 * The meta object literal for the '<em><b>Return Item Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY = eINSTANCE.getReturnItemTypeMap_ReturnItemMapKey();

		/**
		 * The meta object literal for the '<em><b>Return Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE = eINSTANCE.getReturnItemTypeMap_ReturnItemType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnReasonImpl <em>Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnReasonImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnReason()
		 * @generated
		 */
		EClass RETURN_REASON = eINSTANCE.getReturnReason();

		/**
		 * The meta object literal for the '<em><b>Return Reason Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_REASON__RETURN_REASON_ID = eINSTANCE.getReturnReason_ReturnReasonId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_REASON__DESCRIPTION = eINSTANCE.getReturnReason_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_REASON__SEQUENCE_ID = eINSTANCE.getReturnReason_SequenceId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnStatusImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnStatus()
		 * @generated
		 */
		EClass RETURN_STATUS = eINSTANCE.getReturnStatus();

		/**
		 * The meta object literal for the '<em><b>Return Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_STATUS__RETURN_STATUS_ID = eINSTANCE.getReturnStatus_ReturnStatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATUS__CHANGE_BY_USER_LOGIN = eINSTANCE.getReturnStatus_ChangeByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATUS__RETURN = eINSTANCE.getReturnStatus_Return();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_STATUS__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnStatus_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATUS__STATUS = eINSTANCE.getReturnStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Status Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_STATUS__STATUS_DATETIME = eINSTANCE.getReturnStatus_StatusDatetime();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnTypeImpl
		 * @see org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__RETURN_TYPE_ID = eINSTANCE.getReturnType_ReturnTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__DESCRIPTION = eINSTANCE.getReturnType_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__SEQUENCE_ID = eINSTANCE.getReturnType_SequenceId();

	}

} //ReturnPackage
