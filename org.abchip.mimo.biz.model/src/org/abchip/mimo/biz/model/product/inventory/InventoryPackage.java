/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory;

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
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryFactory
 * @model kind="package"
 * @generated
 */
public interface InventoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inventory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/product/inventory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-inventory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryPackage eINSTANCE = org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItem()
	 * @generated
	 */
	int INVENTORY_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accounting Quantity Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__ACTIVATION_NUMBER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activation Valid Thru</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__ACTIVATION_VALID_THRU = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Available To Promise Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__BIN_NUMBER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__CONTAINER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Datetime Manufactured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__DATETIME_MANUFACTURED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Datetime Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__DATETIME_RECEIVED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__EXPIRE_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__FACILITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__FIXED_ASSET = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Inventory Item Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Inventory Item Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_DETAILS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Inventory Item Label Appls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Inventory Item Statuses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_STATUSES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Inventory Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Inventory Item Variances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__LOCATION_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Lot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__LOT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Old Available To Promise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Old Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__OLD_QUANTITY_ON_HAND = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Owner Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__OWNER_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Quantity On Hand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__SERIAL_NUMBER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Soft Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__SOFT_IDENTIFIER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__UNIT_COST = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemAttributeImpl <em>Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemAttributeImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemAttribute()
	 * @generated
	 */
	int INVENTORY_ITEM_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl <em>Item Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemDetail()
	 * @generated
	 */
	int INVENTORY_ITEM_DETAIL = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inventory Item Detail Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Accounting Quantity Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Available To Promise Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Item Issuance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__ORDER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Physical Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Quantity On Hand Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__REASON_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__RECEIPT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__RETURN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__SHIPMENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__UNIT_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Item Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_DETAIL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelImpl <em>Item Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemLabel()
	 * @generated
	 */
	int INVENTORY_ITEM_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item Label Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inventory Item Label Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelApplImpl <em>Item Label Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelApplImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemLabelAppl()
	 * @generated
	 */
	int INVENTORY_ITEM_LABEL_APPL = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inventory Item Label Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inventory Item Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Label Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_APPL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelTypeImpl <em>Item Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelTypeImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemLabelType()
	 * @generated
	 */
	int INVENTORY_ITEM_LABEL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item Label Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__INVENTORY_ITEM_LABEL_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_LABEL_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemStatusImpl <em>Item Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemStatusImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemStatus()
	 * @generated
	 */
	int INVENTORY_ITEM_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__STATUS_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owner Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__OWNER_PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__PRODUCT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status End Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS__STATUS_END_DATETIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Item Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTempResImpl <em>Item Temp Res</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTempResImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemTempRes()
	 * @generated
	 */
	int INVENTORY_ITEM_TEMP_RES = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__VISIT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reserved Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES__RESERVED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Temp Res</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TEMP_RES_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemType()
	 * @generated
	 */
	int INVENTORY_ITEM_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inventory Item Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeAttrImpl <em>Item Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemTypeAttr()
	 * @generated
	 */
	int INVENTORY_ITEM_TYPE_ATTR = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__INVENTORY_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemVarianceImpl <em>Item Variance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemVarianceImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemVariance()
	 * @generated
	 */
	int INVENTORY_ITEM_VARIANCE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Available To Promise Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity On Hand Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variance Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE__VARIANCE_REASON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Item Variance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_VARIANCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl <em>Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryTransfer()
	 * @generated
	 */
	int INVENTORY_TRANSFER = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Transfer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__CONTAINER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Container Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__CONTAINER_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__FACILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Facility Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__FACILITY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Item Issuance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__ITEM_ISSUANCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__LOCATION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Location Seq Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Receive Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__RECEIVE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Send Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__SEND_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_TRANSFER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.LotImpl <em>Lot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.LotImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getLot()
	 * @generated
	 */
	int LOT = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__LOT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__CREATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__EXPIRATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Lot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.PhysicalInventoryImpl <em>Physical Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.PhysicalInventoryImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getPhysicalInventory()
	 * @generated
	 */
	int PHYSICAL_INVENTORY = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical Inventory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>General Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__GENERAL_COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Physical Inventory Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Physical Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_INVENTORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.VarianceReasonImpl <em>Variance Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.VarianceReasonImpl
	 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getVarianceReason()
	 * @generated
	 */
	int VARIANCE_REASON = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variance Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__VARIANCE_REASON_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variance Reason Gl Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Variance Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem
	 * @generated
	 */
	EClass getInventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemId()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_InventoryItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accounting Quantity Total</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAccountingQuantityTotal()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_AccountingQuantityTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationNumber <em>Activation Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Number</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationNumber()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_ActivationNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationValidThru <em>Activation Valid Thru</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Valid Thru</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationValidThru()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_ActivationValidThru();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAvailableToPromiseTotal <em>Available To Promise Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available To Promise Total</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAvailableToPromiseTotal()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_AvailableToPromiseTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getBinNumber <em>Bin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin Number</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getBinNumber()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_BinNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getComments()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getContainer()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Container();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getCurrencyUom()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeManufactured <em>Datetime Manufactured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Manufactured</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeManufactured()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_DatetimeManufactured();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeReceived <em>Datetime Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Received</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeReceived()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_DatetimeReceived();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getExpireDate <em>Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getExpireDate()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_ExpireDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFacility()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Facility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFixedAsset()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_FixedAsset();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemAttributes <em>Inventory Item Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory Item Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemAttributes()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_InventoryItemAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemDetails <em>Inventory Item Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory Item Details</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemDetails()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_InventoryItemDetails();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemLabelAppls <em>Inventory Item Label Appls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory Item Label Appls</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemLabelAppls()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_InventoryItemLabelAppls();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemStatuses <em>Inventory Item Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory Item Statuses</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemStatuses()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_InventoryItemStatuses();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemType <em>Inventory Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemType()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_InventoryItemType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemVariances <em>Inventory Item Variances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory Item Variances</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemVariances()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_InventoryItemVariances();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLocationSeqId <em>Location Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLocationSeqId()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_LocationSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLot <em>Lot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lot</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLot()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Lot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldAvailableToPromise <em>Old Available To Promise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Available To Promise</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldAvailableToPromise()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_OldAvailableToPromise();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldQuantityOnHand <em>Old Quantity On Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Quantity On Hand</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldQuantityOnHand()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_OldQuantityOnHand();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOwnerParty <em>Owner Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOwnerParty()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_OwnerParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getParty()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getProduct()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity On Hand Total</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getQuantityOnHandTotal()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_QuantityOnHandTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSerialNumber()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSoftIdentifier <em>Soft Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft Identifier</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSoftIdentifier()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_SoftIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getStatus()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUnitCost <em>Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Cost</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUnitCost()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_UnitCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUom()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Uom();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute <em>Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute
	 * @generated
	 */
	EClass getInventoryItemAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getInventoryItem()
	 * @see #getInventoryItemAttribute()
	 * @generated
	 */
	EReference getInventoryItemAttribute_InventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getAttrName()
	 * @see #getInventoryItemAttribute()
	 * @generated
	 */
	EAttribute getInventoryItemAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getAttrDescription()
	 * @see #getInventoryItemAttribute()
	 * @generated
	 */
	EAttribute getInventoryItemAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute#getAttrValue()
	 * @see #getInventoryItemAttribute()
	 * @generated
	 */
	EAttribute getInventoryItemAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail <em>Item Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Detail</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail
	 * @generated
	 */
	EClass getInventoryItemDetail();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItem()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EReference getInventoryItemDetail_InventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItemDetailSeqId <em>Inventory Item Detail Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Item Detail Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItemDetailSeqId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_InventoryItemDetailSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAccountingQuantityDiff <em>Accounting Quantity Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accounting Quantity Diff</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAccountingQuantityDiff()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_AccountingQuantityDiff();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAvailableToPromiseDiff <em>Available To Promise Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available To Promise Diff</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAvailableToPromiseDiff()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_AvailableToPromiseDiff();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getDescription()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getEffectiveDate()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_EffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getFixedAssetId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getItemIssuance <em>Item Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Issuance</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getItemIssuance()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EReference getInventoryItemDetail_ItemIssuance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getMaintHistSeqId <em>Maint Hist Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Hist Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getMaintHistSeqId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_MaintHistSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderItemSeqId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getPhysicalInventory <em>Physical Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Inventory</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getPhysicalInventory()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EReference getInventoryItemDetail_PhysicalInventory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getQuantityOnHandDiff <em>Quantity On Hand Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity On Hand Diff</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getQuantityOnHandDiff()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_QuantityOnHandDiff();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReasonEnum <em>Reason Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReasonEnum()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EReference getInventoryItemDetail_ReasonEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReceipt()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EReference getInventoryItemDetail_Receipt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnItemSeqId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_ReturnItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipGroupSeqId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentItemSeqId()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getUnitCost <em>Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Cost</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getUnitCost()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EAttribute getInventoryItemDetail_UnitCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getWorkEffort()
	 * @see #getInventoryItemDetail()
	 * @generated
	 */
	EReference getInventoryItemDetail_WorkEffort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel <em>Item Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Label</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel
	 * @generated
	 */
	EClass getInventoryItemLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel#getInventoryItemLabelId <em>Inventory Item Label Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Item Label Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel#getInventoryItemLabelId()
	 * @see #getInventoryItemLabel()
	 * @generated
	 */
	EAttribute getInventoryItemLabel_InventoryItemLabelId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel#getDescription()
	 * @see #getInventoryItemLabel()
	 * @generated
	 */
	EAttribute getInventoryItemLabel_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel#getInventoryItemLabelType <em>Inventory Item Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Label Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel#getInventoryItemLabelType()
	 * @see #getInventoryItemLabel()
	 * @generated
	 */
	EReference getInventoryItemLabel_InventoryItemLabelType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl <em>Item Label Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Label Appl</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl
	 * @generated
	 */
	EClass getInventoryItemLabelAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItem()
	 * @see #getInventoryItemLabelAppl()
	 * @generated
	 */
	EReference getInventoryItemLabelAppl_InventoryItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelType <em>Inventory Item Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Label Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelType()
	 * @see #getInventoryItemLabelAppl()
	 * @generated
	 */
	EReference getInventoryItemLabelAppl_InventoryItemLabelType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabel <em>Inventory Item Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Label</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabel()
	 * @see #getInventoryItemLabelAppl()
	 * @generated
	 */
	EReference getInventoryItemLabelAppl_InventoryItemLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getSequenceNum()
	 * @see #getInventoryItemLabelAppl()
	 * @generated
	 */
	EAttribute getInventoryItemLabelAppl_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType <em>Item Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Label Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType
	 * @generated
	 */
	EClass getInventoryItemLabelType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Item Label Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#getInventoryItemLabelTypeId()
	 * @see #getInventoryItemLabelType()
	 * @generated
	 */
	EAttribute getInventoryItemLabelType_InventoryItemLabelTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#getDescription()
	 * @see #getInventoryItemLabelType()
	 * @generated
	 */
	EAttribute getInventoryItemLabelType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#isHasTable()
	 * @see #getInventoryItemLabelType()
	 * @generated
	 */
	EAttribute getInventoryItemLabelType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType#getParentType()
	 * @see #getInventoryItemLabelType()
	 * @generated
	 */
	EReference getInventoryItemLabelType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus <em>Item Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Status</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus
	 * @generated
	 */
	EClass getInventoryItemStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getInventoryItem()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EReference getInventoryItemStatus_InventoryItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatus()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EReference getInventoryItemStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusDatetime <em>Status Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusDatetime()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EAttribute getInventoryItemStatus_StatusDatetime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getChangeByUserLogin()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EReference getInventoryItemStatus_ChangeByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getOwnerPartyId <em>Owner Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getOwnerPartyId()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EAttribute getInventoryItemStatus_OwnerPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getProductId()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EAttribute getInventoryItemStatus_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusEndDatetime <em>Status End Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status End Datetime</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusEndDatetime()
	 * @see #getInventoryItemStatus()
	 * @generated
	 */
	EAttribute getInventoryItemStatus_StatusEndDatetime();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes <em>Item Temp Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Temp Res</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes
	 * @generated
	 */
	EClass getInventoryItemTempRes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getProduct()
	 * @see #getInventoryItemTempRes()
	 * @generated
	 */
	EReference getInventoryItemTempRes_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getProductStore()
	 * @see #getInventoryItemTempRes()
	 * @generated
	 */
	EReference getInventoryItemTempRes_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getVisitId()
	 * @see #getInventoryItemTempRes()
	 * @generated
	 */
	EAttribute getInventoryItemTempRes_VisitId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getQuantity()
	 * @see #getInventoryItemTempRes()
	 * @generated
	 */
	EAttribute getInventoryItemTempRes_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getReservedDate <em>Reserved Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes#getReservedDate()
	 * @see #getInventoryItemTempRes()
	 * @generated
	 */
	EAttribute getInventoryItemTempRes_ReservedDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemType
	 * @generated
	 */
	EClass getInventoryItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeId <em>Inventory Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeId()
	 * @see #getInventoryItemType()
	 * @generated
	 */
	EAttribute getInventoryItemType_InventoryItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getDescription()
	 * @see #getInventoryItemType()
	 * @generated
	 */
	EAttribute getInventoryItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getHasTable()
	 * @see #getInventoryItemType()
	 * @generated
	 */
	EAttribute getInventoryItemType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeAttrs <em>Inventory Item Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory Item Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeAttrs()
	 * @see #getInventoryItemType()
	 * @generated
	 */
	EReference getInventoryItemType_InventoryItemTypeAttrs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getParentType()
	 * @see #getInventoryItemType()
	 * @generated
	 */
	EReference getInventoryItemType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr <em>Item Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr
	 * @generated
	 */
	EClass getInventoryItemTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr#getInventoryItemType <em>Inventory Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr#getInventoryItemType()
	 * @see #getInventoryItemTypeAttr()
	 * @generated
	 */
	EReference getInventoryItemTypeAttr_InventoryItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr#getAttrName()
	 * @see #getInventoryItemTypeAttr()
	 * @generated
	 */
	EAttribute getInventoryItemTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr#getDescription()
	 * @see #getInventoryItemTypeAttr()
	 * @generated
	 */
	EAttribute getInventoryItemTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance <em>Item Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Variance</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance
	 * @generated
	 */
	EClass getInventoryItemVariance();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getPhysicalInventory <em>Physical Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Inventory</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getPhysicalInventory()
	 * @see #getInventoryItemVariance()
	 * @generated
	 */
	EReference getInventoryItemVariance_PhysicalInventory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getInventoryItem()
	 * @see #getInventoryItemVariance()
	 * @generated
	 */
	EReference getInventoryItemVariance_InventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getAvailableToPromiseVar <em>Available To Promise Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available To Promise Var</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getAvailableToPromiseVar()
	 * @see #getInventoryItemVariance()
	 * @generated
	 */
	EAttribute getInventoryItemVariance_AvailableToPromiseVar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getComments()
	 * @see #getInventoryItemVariance()
	 * @generated
	 */
	EAttribute getInventoryItemVariance_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getQuantityOnHandVar <em>Quantity On Hand Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity On Hand Var</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getQuantityOnHandVar()
	 * @see #getInventoryItemVariance()
	 * @generated
	 */
	EAttribute getInventoryItemVariance_QuantityOnHandVar();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getVarianceReason <em>Variance Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variance Reason</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getVarianceReason()
	 * @see #getInventoryItemVariance()
	 * @generated
	 */
	EReference getInventoryItemVariance_VarianceReason();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer
	 * @generated
	 */
	EClass getInventoryTransfer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getInventoryTransferId <em>Inventory Transfer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Transfer Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getInventoryTransferId()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EAttribute getInventoryTransfer_InventoryTransferId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getComments()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EAttribute getInventoryTransfer_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getContainer()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_Container();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getContainerIdTo <em>Container Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Id To</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getContainerIdTo()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_ContainerIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getFacility()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_Facility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getFacilityIdTo <em>Facility Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id To</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getFacilityIdTo()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_FacilityIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getInventoryItem()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_InventoryItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getItemIssuance <em>Item Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Issuance</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getItemIssuance()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_ItemIssuance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getLocationSeqId <em>Location Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getLocationSeqId()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EAttribute getInventoryTransfer_LocationSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getLocationSeqIdTo <em>Location Seq Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Seq Id To</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getLocationSeqIdTo()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EAttribute getInventoryTransfer_LocationSeqIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getReceiveDate <em>Receive Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receive Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getReceiveDate()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EAttribute getInventoryTransfer_ReceiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getSendDate <em>Send Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getSendDate()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EAttribute getInventoryTransfer_SendDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryTransfer#getStatus()
	 * @see #getInventoryTransfer()
	 * @generated
	 */
	EReference getInventoryTransfer_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.Lot <em>Lot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lot</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.Lot
	 * @generated
	 */
	EClass getLot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.Lot#getLotId <em>Lot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.Lot#getLotId()
	 * @see #getLot()
	 * @generated
	 */
	EAttribute getLot_LotId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.Lot#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.Lot#getCreationDate()
	 * @see #getLot()
	 * @generated
	 */
	EAttribute getLot_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.Lot#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.Lot#getExpirationDate()
	 * @see #getLot()
	 * @generated
	 */
	EAttribute getLot_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.Lot#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.Lot#getQuantity()
	 * @see #getLot()
	 * @generated
	 */
	EAttribute getLot_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.PhysicalInventory <em>Physical Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Inventory</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.PhysicalInventory
	 * @generated
	 */
	EClass getPhysicalInventory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getPhysicalInventoryId <em>Physical Inventory Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Inventory Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getPhysicalInventoryId()
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	EAttribute getPhysicalInventory_PhysicalInventoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getGeneralComments <em>General Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getGeneralComments()
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	EAttribute getPhysicalInventory_GeneralComments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getPartyId()
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	EAttribute getPhysicalInventory_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getPhysicalInventoryDate <em>Physical Inventory Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Inventory Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.PhysicalInventory#getPhysicalInventoryDate()
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	EAttribute getPhysicalInventory_PhysicalInventoryDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.inventory.VarianceReason <em>Variance Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variance Reason</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.VarianceReason
	 * @generated
	 */
	EClass getVarianceReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.VarianceReason#getVarianceReasonId <em>Variance Reason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variance Reason Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.VarianceReason#getVarianceReasonId()
	 * @see #getVarianceReason()
	 * @generated
	 */
	EAttribute getVarianceReason_VarianceReasonId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.inventory.VarianceReason#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.VarianceReason#getDescription()
	 * @see #getVarianceReason()
	 * @generated
	 */
	EAttribute getVarianceReason_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.inventory.VarianceReason#getVarianceReasonGlAccounts <em>Variance Reason Gl Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variance Reason Gl Accounts</em>'.
	 * @see org.abchip.mimo.biz.model.product.inventory.VarianceReason#getVarianceReasonGlAccounts()
	 * @see #getVarianceReason()
	 * @generated
	 */
	EReference getVarianceReason_VarianceReasonGlAccounts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InventoryFactory getInventoryFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItem()
		 * @generated
		 */
		EClass INVENTORY_ITEM = eINSTANCE.getInventoryItem();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__INVENTORY_ITEM_ID = eINSTANCE.getInventoryItem_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Accounting Quantity Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL = eINSTANCE.getInventoryItem_AccountingQuantityTotal();

		/**
		 * The meta object literal for the '<em><b>Activation Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__ACTIVATION_NUMBER = eINSTANCE.getInventoryItem_ActivationNumber();

		/**
		 * The meta object literal for the '<em><b>Activation Valid Thru</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__ACTIVATION_VALID_THRU = eINSTANCE.getInventoryItem_ActivationValidThru();

		/**
		 * The meta object literal for the '<em><b>Available To Promise Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL = eINSTANCE.getInventoryItem_AvailableToPromiseTotal();

		/**
		 * The meta object literal for the '<em><b>Bin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__BIN_NUMBER = eINSTANCE.getInventoryItem_BinNumber();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__COMMENTS = eINSTANCE.getInventoryItem_Comments();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__CONTAINER = eINSTANCE.getInventoryItem_Container();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__CURRENCY_UOM = eINSTANCE.getInventoryItem_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Datetime Manufactured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__DATETIME_MANUFACTURED = eINSTANCE.getInventoryItem_DatetimeManufactured();

		/**
		 * The meta object literal for the '<em><b>Datetime Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__DATETIME_RECEIVED = eINSTANCE.getInventoryItem_DatetimeReceived();

		/**
		 * The meta object literal for the '<em><b>Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__EXPIRE_DATE = eINSTANCE.getInventoryItem_ExpireDate();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__FACILITY = eINSTANCE.getInventoryItem_Facility();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__FIXED_ASSET = eINSTANCE.getInventoryItem_FixedAsset();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES = eINSTANCE.getInventoryItem_InventoryItemAttributes();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__INVENTORY_ITEM_DETAILS = eINSTANCE.getInventoryItem_InventoryItemDetails();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Label Appls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS = eINSTANCE.getInventoryItem_InventoryItemLabelAppls();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Statuses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__INVENTORY_ITEM_STATUSES = eINSTANCE.getInventoryItem_InventoryItemStatuses();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__INVENTORY_ITEM_TYPE = eINSTANCE.getInventoryItem_InventoryItemType();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Variances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES = eINSTANCE.getInventoryItem_InventoryItemVariances();

		/**
		 * The meta object literal for the '<em><b>Location Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__LOCATION_SEQ_ID = eINSTANCE.getInventoryItem_LocationSeqId();

		/**
		 * The meta object literal for the '<em><b>Lot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__LOT = eINSTANCE.getInventoryItem_Lot();

		/**
		 * The meta object literal for the '<em><b>Old Available To Promise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE = eINSTANCE.getInventoryItem_OldAvailableToPromise();

		/**
		 * The meta object literal for the '<em><b>Old Quantity On Hand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__OLD_QUANTITY_ON_HAND = eINSTANCE.getInventoryItem_OldQuantityOnHand();

		/**
		 * The meta object literal for the '<em><b>Owner Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__OWNER_PARTY = eINSTANCE.getInventoryItem_OwnerParty();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__PARTY = eINSTANCE.getInventoryItem_Party();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__PRODUCT = eINSTANCE.getInventoryItem_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity On Hand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL = eINSTANCE.getInventoryItem_QuantityOnHandTotal();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__SERIAL_NUMBER = eINSTANCE.getInventoryItem_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Soft Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__SOFT_IDENTIFIER = eINSTANCE.getInventoryItem_SoftIdentifier();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__STATUS = eINSTANCE.getInventoryItem_Status();

		/**
		 * The meta object literal for the '<em><b>Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__UNIT_COST = eINSTANCE.getInventoryItem_UnitCost();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM__UOM = eINSTANCE.getInventoryItem_Uom();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemAttributeImpl <em>Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemAttributeImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemAttribute()
		 * @generated
		 */
		EClass INVENTORY_ITEM_ATTRIBUTE = eINSTANCE.getInventoryItemAttribute();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_ATTRIBUTE__INVENTORY_ITEM = eINSTANCE.getInventoryItemAttribute_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInventoryItemAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInventoryItemAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInventoryItemAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl <em>Item Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemDetail()
		 * @generated
		 */
		EClass INVENTORY_ITEM_DETAIL = eINSTANCE.getInventoryItemDetail();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_DETAIL__INVENTORY_ITEM = eINSTANCE.getInventoryItemDetail_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Detail Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID = eINSTANCE.getInventoryItemDetail_InventoryItemDetailSeqId();

		/**
		 * The meta object literal for the '<em><b>Accounting Quantity Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF = eINSTANCE.getInventoryItemDetail_AccountingQuantityDiff();

		/**
		 * The meta object literal for the '<em><b>Available To Promise Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF = eINSTANCE.getInventoryItemDetail_AvailableToPromiseDiff();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__DESCRIPTION = eINSTANCE.getInventoryItemDetail_Description();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE = eINSTANCE.getInventoryItemDetail_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID = eINSTANCE.getInventoryItemDetail_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Item Issuance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE = eINSTANCE.getInventoryItemDetail_ItemIssuance();

		/**
		 * The meta object literal for the '<em><b>Maint Hist Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID = eINSTANCE.getInventoryItemDetail_MaintHistSeqId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__ORDER_ID = eINSTANCE.getInventoryItemDetail_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID = eINSTANCE.getInventoryItemDetail_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Physical Inventory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY = eINSTANCE.getInventoryItemDetail_PhysicalInventory();

		/**
		 * The meta object literal for the '<em><b>Quantity On Hand Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF = eINSTANCE.getInventoryItemDetail_QuantityOnHandDiff();

		/**
		 * The meta object literal for the '<em><b>Reason Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_DETAIL__REASON_ENUM = eINSTANCE.getInventoryItemDetail_ReasonEnum();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_DETAIL__RECEIPT = eINSTANCE.getInventoryItemDetail_Receipt();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__RETURN_ID = eINSTANCE.getInventoryItemDetail_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID = eINSTANCE.getInventoryItemDetail_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID = eINSTANCE.getInventoryItemDetail_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__SHIPMENT_ID = eINSTANCE.getInventoryItemDetail_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getInventoryItemDetail_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_DETAIL__UNIT_COST = eINSTANCE.getInventoryItemDetail_UnitCost();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_DETAIL__WORK_EFFORT = eINSTANCE.getInventoryItemDetail_WorkEffort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelImpl <em>Item Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemLabel()
		 * @generated
		 */
		EClass INVENTORY_ITEM_LABEL = eINSTANCE.getInventoryItemLabel();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Label Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID = eINSTANCE.getInventoryItemLabel_InventoryItemLabelId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_LABEL__DESCRIPTION = eINSTANCE.getInventoryItemLabel_Description();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Label Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE = eINSTANCE.getInventoryItemLabel_InventoryItemLabelType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelApplImpl <em>Item Label Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelApplImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemLabelAppl()
		 * @generated
		 */
		EClass INVENTORY_ITEM_LABEL_APPL = eINSTANCE.getInventoryItemLabelAppl();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM = eINSTANCE.getInventoryItemLabelAppl_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Label Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE = eINSTANCE.getInventoryItemLabelAppl_InventoryItemLabelType();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL = eINSTANCE.getInventoryItemLabelAppl_InventoryItemLabel();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM = eINSTANCE.getInventoryItemLabelAppl_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelTypeImpl <em>Item Label Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemLabelTypeImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemLabelType()
		 * @generated
		 */
		EClass INVENTORY_ITEM_LABEL_TYPE = eINSTANCE.getInventoryItemLabelType();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Label Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_LABEL_TYPE__INVENTORY_ITEM_LABEL_TYPE_ID = eINSTANCE.getInventoryItemLabelType_InventoryItemLabelTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_LABEL_TYPE__DESCRIPTION = eINSTANCE.getInventoryItemLabelType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_LABEL_TYPE__HAS_TABLE = eINSTANCE.getInventoryItemLabelType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_LABEL_TYPE__PARENT_TYPE = eINSTANCE.getInventoryItemLabelType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemStatusImpl <em>Item Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemStatusImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemStatus()
		 * @generated
		 */
		EClass INVENTORY_ITEM_STATUS = eINSTANCE.getInventoryItemStatus();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_STATUS__INVENTORY_ITEM = eINSTANCE.getInventoryItemStatus_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_STATUS__STATUS = eINSTANCE.getInventoryItemStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Status Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_STATUS__STATUS_DATETIME = eINSTANCE.getInventoryItemStatus_StatusDatetime();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN = eINSTANCE.getInventoryItemStatus_ChangeByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Owner Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_STATUS__OWNER_PARTY_ID = eINSTANCE.getInventoryItemStatus_OwnerPartyId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_STATUS__PRODUCT_ID = eINSTANCE.getInventoryItemStatus_ProductId();

		/**
		 * The meta object literal for the '<em><b>Status End Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_STATUS__STATUS_END_DATETIME = eINSTANCE.getInventoryItemStatus_StatusEndDatetime();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTempResImpl <em>Item Temp Res</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTempResImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemTempRes()
		 * @generated
		 */
		EClass INVENTORY_ITEM_TEMP_RES = eINSTANCE.getInventoryItemTempRes();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_TEMP_RES__PRODUCT = eINSTANCE.getInventoryItemTempRes_Product();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE = eINSTANCE.getInventoryItemTempRes_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TEMP_RES__VISIT_ID = eINSTANCE.getInventoryItemTempRes_VisitId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TEMP_RES__QUANTITY = eINSTANCE.getInventoryItemTempRes_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reserved Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TEMP_RES__RESERVED_DATE = eINSTANCE.getInventoryItemTempRes_ReservedDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemType()
		 * @generated
		 */
		EClass INVENTORY_ITEM_TYPE = eINSTANCE.getInventoryItemType();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID = eINSTANCE.getInventoryItemType_InventoryItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TYPE__DESCRIPTION = eINSTANCE.getInventoryItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TYPE__HAS_TABLE = eINSTANCE.getInventoryItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS = eINSTANCE.getInventoryItemType_InventoryItemTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_TYPE__PARENT_TYPE = eINSTANCE.getInventoryItemType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeAttrImpl <em>Item Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemTypeAttr()
		 * @generated
		 */
		EClass INVENTORY_ITEM_TYPE_ATTR = eINSTANCE.getInventoryItemTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_TYPE_ATTR__INVENTORY_ITEM_TYPE = eINSTANCE.getInventoryItemTypeAttr_InventoryItemType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getInventoryItemTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getInventoryItemTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemVarianceImpl <em>Item Variance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemVarianceImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryItemVariance()
		 * @generated
		 */
		EClass INVENTORY_ITEM_VARIANCE = eINSTANCE.getInventoryItemVariance();

		/**
		 * The meta object literal for the '<em><b>Physical Inventory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY = eINSTANCE.getInventoryItemVariance_PhysicalInventory();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM = eINSTANCE.getInventoryItemVariance_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Available To Promise Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR = eINSTANCE.getInventoryItemVariance_AvailableToPromiseVar();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_VARIANCE__COMMENTS = eINSTANCE.getInventoryItemVariance_Comments();

		/**
		 * The meta object literal for the '<em><b>Quantity On Hand Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR = eINSTANCE.getInventoryItemVariance_QuantityOnHandVar();

		/**
		 * The meta object literal for the '<em><b>Variance Reason</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_ITEM_VARIANCE__VARIANCE_REASON = eINSTANCE.getInventoryItemVariance_VarianceReason();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl <em>Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getInventoryTransfer()
		 * @generated
		 */
		EClass INVENTORY_TRANSFER = eINSTANCE.getInventoryTransfer();

		/**
		 * The meta object literal for the '<em><b>Inventory Transfer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID = eINSTANCE.getInventoryTransfer_InventoryTransferId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_TRANSFER__COMMENTS = eINSTANCE.getInventoryTransfer_Comments();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__CONTAINER = eINSTANCE.getInventoryTransfer_Container();

		/**
		 * The meta object literal for the '<em><b>Container Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__CONTAINER_ID_TO = eINSTANCE.getInventoryTransfer_ContainerIdTo();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__FACILITY = eINSTANCE.getInventoryTransfer_Facility();

		/**
		 * The meta object literal for the '<em><b>Facility Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__FACILITY_ID_TO = eINSTANCE.getInventoryTransfer_FacilityIdTo();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__INVENTORY_ITEM = eINSTANCE.getInventoryTransfer_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Item Issuance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__ITEM_ISSUANCE = eINSTANCE.getInventoryTransfer_ItemIssuance();

		/**
		 * The meta object literal for the '<em><b>Location Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_TRANSFER__LOCATION_SEQ_ID = eINSTANCE.getInventoryTransfer_LocationSeqId();

		/**
		 * The meta object literal for the '<em><b>Location Seq Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO = eINSTANCE.getInventoryTransfer_LocationSeqIdTo();

		/**
		 * The meta object literal for the '<em><b>Receive Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_TRANSFER__RECEIVE_DATE = eINSTANCE.getInventoryTransfer_ReceiveDate();

		/**
		 * The meta object literal for the '<em><b>Send Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_TRANSFER__SEND_DATE = eINSTANCE.getInventoryTransfer_SendDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_TRANSFER__STATUS = eINSTANCE.getInventoryTransfer_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.LotImpl <em>Lot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.LotImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getLot()
		 * @generated
		 */
		EClass LOT = eINSTANCE.getLot();

		/**
		 * The meta object literal for the '<em><b>Lot Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOT__LOT_ID = eINSTANCE.getLot_LotId();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOT__CREATION_DATE = eINSTANCE.getLot_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOT__EXPIRATION_DATE = eINSTANCE.getLot_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOT__QUANTITY = eINSTANCE.getLot_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.PhysicalInventoryImpl <em>Physical Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.PhysicalInventoryImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getPhysicalInventory()
		 * @generated
		 */
		EClass PHYSICAL_INVENTORY = eINSTANCE.getPhysicalInventory();

		/**
		 * The meta object literal for the '<em><b>Physical Inventory Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID = eINSTANCE.getPhysicalInventory_PhysicalInventoryId();

		/**
		 * The meta object literal for the '<em><b>General Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_INVENTORY__GENERAL_COMMENTS = eINSTANCE.getPhysicalInventory_GeneralComments();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_INVENTORY__PARTY_ID = eINSTANCE.getPhysicalInventory_PartyId();

		/**
		 * The meta object literal for the '<em><b>Physical Inventory Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE = eINSTANCE.getPhysicalInventory_PhysicalInventoryDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.inventory.impl.VarianceReasonImpl <em>Variance Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.VarianceReasonImpl
		 * @see org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl#getVarianceReason()
		 * @generated
		 */
		EClass VARIANCE_REASON = eINSTANCE.getVarianceReason();

		/**
		 * The meta object literal for the '<em><b>Variance Reason Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANCE_REASON__VARIANCE_REASON_ID = eINSTANCE.getVarianceReason_VarianceReasonId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANCE_REASON__DESCRIPTION = eINSTANCE.getVarianceReason_Description();

		/**
		 * The meta object literal for the '<em><b>Variance Reason Gl Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS = eINSTANCE.getVarianceReason_VarianceReasonGlAccounts();

	}

} //InventoryPackage
