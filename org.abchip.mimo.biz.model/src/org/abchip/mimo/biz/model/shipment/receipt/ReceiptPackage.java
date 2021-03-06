/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.receipt;

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
 * @see org.abchip.mimo.biz.model.shipment.receipt.ReceiptFactory
 * @model kind="package"
 * @generated
 */
public interface ReceiptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "receipt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/shipment/receipt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-receipt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReceiptPackage eINSTANCE = org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.shipment.receipt.impl.RejectionReasonImpl <em>Rejection Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.RejectionReasonImpl
	 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl#getRejectionReason()
	 * @generated
	 */
	int REJECTION_REASON = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rejection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__REJECTION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rejection Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptImpl <em>Shipment Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptImpl
	 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceipt()
	 * @generated
	 */
	int SHIPMENT_RECEIPT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receipt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RECEIPT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datetime Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__DATETIME_RECEIVED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__ITEM_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Quantity Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__QUANTITY_ACCEPTED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quantity Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__QUANTITY_REJECTED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Received By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rejection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__REJECTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RETURN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__SHIPMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Shipment Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptRoleImpl <em>Shipment Receipt Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptRoleImpl
	 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceiptRole()
	 * @generated
	 */
	int SHIPMENT_RECEIPT_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__RECEIPT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Shipment Receipt Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.shipment.receipt.RejectionReason <em>Rejection Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rejection Reason</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.RejectionReason
	 * @generated
	 */
	EClass getRejectionReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.RejectionReason#getRejectionId <em>Rejection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejection Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.RejectionReason#getRejectionId()
	 * @see #getRejectionReason()
	 * @generated
	 */
	EAttribute getRejectionReason_RejectionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.RejectionReason#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.RejectionReason#getDescription()
	 * @see #getRejectionReason()
	 * @generated
	 */
	EAttribute getRejectionReason_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt <em>Shipment Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Receipt</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt
	 * @generated
	 */
	EClass getShipmentReceipt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReceiptId <em>Receipt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipt Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReceiptId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ReceiptId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getDatetimeReceived <em>Datetime Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Received</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getDatetimeReceived()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_DatetimeReceived();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getInventoryItem()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_InventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getItemDescription <em>Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Description</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getItemDescription()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ItemDescription();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getOrder()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getOrderItemSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getProduct()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getQuantityAccepted <em>Quantity Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Accepted</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getQuantityAccepted()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_QuantityAccepted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getQuantityRejected <em>Quantity Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Rejected</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getQuantityRejected()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_QuantityRejected();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReceivedByUserLogin <em>Received By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Received By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReceivedByUserLogin()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_ReceivedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getRejection <em>Rejection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rejection</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getRejection()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_Rejection();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReturnId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getReturnItemSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getShipment()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_Shipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getShipmentItemSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Package Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt#getShipmentPackageSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ShipmentPackageSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole <em>Shipment Receipt Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Receipt Role</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole
	 * @generated
	 */
	EClass getShipmentReceiptRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getReceipt()
	 * @see #getShipmentReceiptRole()
	 * @generated
	 */
	EReference getShipmentReceiptRole_Receipt();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getParty()
	 * @see #getShipmentReceiptRole()
	 * @generated
	 */
	EReference getShipmentReceiptRole_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getRoleTypeId()
	 * @see #getShipmentReceiptRole()
	 * @generated
	 */
	EAttribute getShipmentReceiptRole_RoleTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReceiptFactory getReceiptFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.shipment.receipt.impl.RejectionReasonImpl <em>Rejection Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.RejectionReasonImpl
		 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl#getRejectionReason()
		 * @generated
		 */
		EClass REJECTION_REASON = eINSTANCE.getRejectionReason();

		/**
		 * The meta object literal for the '<em><b>Rejection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REJECTION_REASON__REJECTION_ID = eINSTANCE.getRejectionReason_RejectionId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REJECTION_REASON__DESCRIPTION = eINSTANCE.getRejectionReason_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptImpl <em>Shipment Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptImpl
		 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceipt()
		 * @generated
		 */
		EClass SHIPMENT_RECEIPT = eINSTANCE.getShipmentReceipt();

		/**
		 * The meta object literal for the '<em><b>Receipt Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__RECEIPT_ID = eINSTANCE.getShipmentReceipt_ReceiptId();

		/**
		 * The meta object literal for the '<em><b>Datetime Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__DATETIME_RECEIVED = eINSTANCE.getShipmentReceipt_DatetimeReceived();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__INVENTORY_ITEM = eINSTANCE.getShipmentReceipt_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Item Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__ITEM_DESCRIPTION = eINSTANCE.getShipmentReceipt_ItemDescription();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__ORDER = eINSTANCE.getShipmentReceipt_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID = eINSTANCE.getShipmentReceipt_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__PRODUCT = eINSTANCE.getShipmentReceipt_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__QUANTITY_ACCEPTED = eINSTANCE.getShipmentReceipt_QuantityAccepted();

		/**
		 * The meta object literal for the '<em><b>Quantity Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__QUANTITY_REJECTED = eINSTANCE.getShipmentReceipt_QuantityRejected();

		/**
		 * The meta object literal for the '<em><b>Received By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN = eINSTANCE.getShipmentReceipt_ReceivedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Rejection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__REJECTION = eINSTANCE.getShipmentReceipt_Rejection();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__RETURN_ID = eINSTANCE.getShipmentReceipt_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID = eINSTANCE.getShipmentReceipt_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__SHIPMENT = eINSTANCE.getShipmentReceipt_Shipment();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShipmentReceipt_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Package Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID = eINSTANCE.getShipmentReceipt_ShipmentPackageSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptRoleImpl <em>Shipment Receipt Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ShipmentReceiptRoleImpl
		 * @see org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceiptRole()
		 * @generated
		 */
		EClass SHIPMENT_RECEIPT_ROLE = eINSTANCE.getShipmentReceiptRole();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT_ROLE__RECEIPT = eINSTANCE.getShipmentReceiptRole_Receipt();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT_ROLE__PARTY = eINSTANCE.getShipmentReceiptRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID = eINSTANCE.getShipmentReceiptRole_RoleTypeId();

	}

} //ReceiptPackage
