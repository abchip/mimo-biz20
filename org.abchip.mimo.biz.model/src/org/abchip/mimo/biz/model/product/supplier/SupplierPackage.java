/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.supplier;

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
 * @see org.abchip.mimo.biz.model.product.supplier.SupplierFactory
 * @model kind="package"
 * @generated
 */
public interface SupplierPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "supplier";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/product/supplier";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-supplier";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupplierPackage eINSTANCE = org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.MarketInterestImpl <em>Market Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.MarketInterestImpl
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getMarketInterest()
	 * @generated
	 */
	int MARKET_INTEREST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Classification Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__PARTY_CLASSIFICATION_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Market Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.ReorderGuidelineImpl <em>Reorder Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.ReorderGuidelineImpl
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getReorderGuideline()
	 * @generated
	 */
	int REORDER_GUIDELINE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reorder Guideline Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__REORDER_GUIDELINE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__FACILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__GEO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reorder Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__REORDER_LEVEL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reorder Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__REORDER_QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Reorder Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierPrefOrderImpl <em>Pref Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPrefOrderImpl
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierPrefOrder()
	 * @generated
	 */
	int SUPPLIER_PREF_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supplier Pref Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pref Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierProduct()
	 * @generated
	 */
	int SUPPLIER_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Available From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Minimum Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AGREEMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Available Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Can Drop Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CAN_DROP_SHIP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Last Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__LAST_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Order Qty Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Quantity Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__QUANTITY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SHIPPING_PRICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Standard Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Supplier Pref Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Supplier Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Supplier Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Supplier Rating Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Units Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__UNITS_INCLUDED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductFeatureImpl <em>Product Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductFeatureImpl
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierProductFeature()
	 * @generated
	 */
	int SUPPLIER_PRODUCT_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__PRODUCT_FEATURE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__ID_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierRatingTypeImpl <em>Rating Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierRatingTypeImpl
	 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierRatingType()
	 * @generated
	 */
	int SUPPLIER_RATING_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supplier Rating Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rating Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.supplier.MarketInterest <em>Market Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Interest</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.MarketInterest
	 * @generated
	 */
	EClass getMarketInterest();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.MarketInterest#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.MarketInterest#getProductCategory()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EReference getMarketInterest_ProductCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.MarketInterest#getPartyClassificationGroup <em>Party Classification Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Group</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.MarketInterest#getPartyClassificationGroup()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EReference getMarketInterest_PartyClassificationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.MarketInterest#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.MarketInterest#getFromDate()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EAttribute getMarketInterest_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.MarketInterest#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.MarketInterest#getThruDate()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EAttribute getMarketInterest_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline <em>Reorder Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reorder Guideline</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline
	 * @generated
	 */
	EClass getReorderGuideline();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderGuidelineId <em>Reorder Guideline Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Guideline Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderGuidelineId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ReorderGuidelineId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFacility()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFromDate()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getGeo()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_Geo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getParty()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getProduct()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderLevel <em>Reorder Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Level</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderLevel()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ReorderLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderQuantity <em>Reorder Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderQuantity()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ReorderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getRoleTypeId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getThruDate()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder <em>Pref Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pref Order</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder
	 * @generated
	 */
	EClass getSupplierPrefOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Pref Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder#getSupplierPrefOrderId()
	 * @see #getSupplierPrefOrder()
	 * @generated
	 */
	EAttribute getSupplierPrefOrder_SupplierPrefOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder#getDescription()
	 * @see #getSupplierPrefOrder()
	 * @generated
	 */
	EAttribute getSupplierPrefOrder_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct
	 * @generated
	 */
	EClass getSupplierProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getProduct()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getParty()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getCurrencyUom()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Order Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getMinimumOrderQuantity()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_MinimumOrderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAvailableFromDate <em>Available From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAvailableFromDate()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AvailableFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAgreementId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AgreementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAgreementItemSeqId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAvailableThruDate <em>Available Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getAvailableThruDate()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AvailableThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#isCanDropShip <em>Can Drop Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Drop Ship</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#isCanDropShip()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_CanDropShip();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getComments()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getLastPrice <em>Last Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Price</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getLastPrice()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_LastPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getOrderQtyIncrements <em>Order Qty Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Qty Increments</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getOrderQtyIncrements()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_OrderQtyIncrements();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getQuantityUom <em>Quantity Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getQuantityUom()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_QuantityUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getShippingPrice <em>Shipping Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Price</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getShippingPrice()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_ShippingPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Lead Time Days</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getStandardLeadTimeDays()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_StandardLeadTimeDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierPrefOrder <em>Supplier Pref Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Pref Order</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierPrefOrder()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_SupplierPrefOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierProductId <em>Supplier Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierProductId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_SupplierProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierProductName <em>Supplier Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Product Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierProductName()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_SupplierProductName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierRatingType <em>Supplier Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Rating Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getSupplierRatingType()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_SupplierRatingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getUnitsIncluded <em>Units Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units Included</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProduct#getUnitsIncluded()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_UnitsIncluded();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature
	 * @generated
	 */
	EClass getSupplierProductFeature();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getParty()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EReference getSupplierProductFeature_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getProductFeature()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EReference getSupplierProductFeature_ProductFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getDescription()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EAttribute getSupplierProductFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getIdCode <em>Id Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getIdCode()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EAttribute getSupplierProductFeature_IdCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getUom()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EReference getSupplierProductFeature_Uom();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.supplier.SupplierRatingType <em>Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierRatingType
	 * @generated
	 */
	EClass getSupplierRatingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierRatingType#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Rating Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierRatingType#getSupplierRatingTypeId()
	 * @see #getSupplierRatingType()
	 * @generated
	 */
	EAttribute getSupplierRatingType_SupplierRatingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.supplier.SupplierRatingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierRatingType#getDescription()
	 * @see #getSupplierRatingType()
	 * @generated
	 */
	EAttribute getSupplierRatingType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SupplierFactory getSupplierFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.MarketInterestImpl <em>Market Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.MarketInterestImpl
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getMarketInterest()
		 * @generated
		 */
		EClass MARKET_INTEREST = eINSTANCE.getMarketInterest();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_INTEREST__PRODUCT_CATEGORY = eINSTANCE.getMarketInterest_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_INTEREST__PARTY_CLASSIFICATION_GROUP = eINSTANCE.getMarketInterest_PartyClassificationGroup();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_INTEREST__FROM_DATE = eINSTANCE.getMarketInterest_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_INTEREST__THRU_DATE = eINSTANCE.getMarketInterest_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.ReorderGuidelineImpl <em>Reorder Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.ReorderGuidelineImpl
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getReorderGuideline()
		 * @generated
		 */
		EClass REORDER_GUIDELINE = eINSTANCE.getReorderGuideline();

		/**
		 * The meta object literal for the '<em><b>Reorder Guideline Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__REORDER_GUIDELINE_ID = eINSTANCE.getReorderGuideline_ReorderGuidelineId();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__FACILITY = eINSTANCE.getReorderGuideline_Facility();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__FROM_DATE = eINSTANCE.getReorderGuideline_FromDate();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__GEO = eINSTANCE.getReorderGuideline_Geo();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__PARTY = eINSTANCE.getReorderGuideline_Party();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__PRODUCT = eINSTANCE.getReorderGuideline_Product();

		/**
		 * The meta object literal for the '<em><b>Reorder Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__REORDER_LEVEL = eINSTANCE.getReorderGuideline_ReorderLevel();

		/**
		 * The meta object literal for the '<em><b>Reorder Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__REORDER_QUANTITY = eINSTANCE.getReorderGuideline_ReorderQuantity();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__ROLE_TYPE_ID = eINSTANCE.getReorderGuideline_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__THRU_DATE = eINSTANCE.getReorderGuideline_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierPrefOrderImpl <em>Pref Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPrefOrderImpl
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierPrefOrder()
		 * @generated
		 */
		EClass SUPPLIER_PREF_ORDER = eINSTANCE.getSupplierPrefOrder();

		/**
		 * The meta object literal for the '<em><b>Supplier Pref Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID = eINSTANCE.getSupplierPrefOrder_SupplierPrefOrderId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PREF_ORDER__DESCRIPTION = eINSTANCE.getSupplierPrefOrder_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierProduct()
		 * @generated
		 */
		EClass SUPPLIER_PRODUCT = eINSTANCE.getSupplierProduct();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__PRODUCT = eINSTANCE.getSupplierProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__PARTY = eINSTANCE.getSupplierProduct_Party();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__CURRENCY_UOM = eINSTANCE.getSupplierProduct_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Minimum Order Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY = eINSTANCE.getSupplierProduct_MinimumOrderQuantity();

		/**
		 * The meta object literal for the '<em><b>Available From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE = eINSTANCE.getSupplierProduct_AvailableFromDate();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AGREEMENT_ID = eINSTANCE.getSupplierProduct_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getSupplierProduct_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Available Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE = eINSTANCE.getSupplierProduct_AvailableThruDate();

		/**
		 * The meta object literal for the '<em><b>Can Drop Ship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__CAN_DROP_SHIP = eINSTANCE.getSupplierProduct_CanDropShip();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__COMMENTS = eINSTANCE.getSupplierProduct_Comments();

		/**
		 * The meta object literal for the '<em><b>Last Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__LAST_PRICE = eINSTANCE.getSupplierProduct_LastPrice();

		/**
		 * The meta object literal for the '<em><b>Order Qty Increments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS = eINSTANCE.getSupplierProduct_OrderQtyIncrements();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__QUANTITY_UOM = eINSTANCE.getSupplierProduct_QuantityUom();

		/**
		 * The meta object literal for the '<em><b>Shipping Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__SHIPPING_PRICE = eINSTANCE.getSupplierProduct_ShippingPrice();

		/**
		 * The meta object literal for the '<em><b>Standard Lead Time Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS = eINSTANCE.getSupplierProduct_StandardLeadTimeDays();

		/**
		 * The meta object literal for the '<em><b>Supplier Pref Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER = eINSTANCE.getSupplierProduct_SupplierPrefOrder();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID = eINSTANCE.getSupplierProduct_SupplierProductId();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME = eINSTANCE.getSupplierProduct_SupplierProductName();

		/**
		 * The meta object literal for the '<em><b>Supplier Rating Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE = eINSTANCE.getSupplierProduct_SupplierRatingType();

		/**
		 * The meta object literal for the '<em><b>Units Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__UNITS_INCLUDED = eINSTANCE.getSupplierProduct_UnitsIncluded();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductFeatureImpl <em>Product Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductFeatureImpl
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierProductFeature()
		 * @generated
		 */
		EClass SUPPLIER_PRODUCT_FEATURE = eINSTANCE.getSupplierProductFeature();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT_FEATURE__PARTY = eINSTANCE.getSupplierProductFeature_Party();

		/**
		 * The meta object literal for the '<em><b>Product Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT_FEATURE__PRODUCT_FEATURE = eINSTANCE.getSupplierProductFeature_ProductFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT_FEATURE__DESCRIPTION = eINSTANCE.getSupplierProductFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Id Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT_FEATURE__ID_CODE = eINSTANCE.getSupplierProductFeature_IdCode();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT_FEATURE__UOM = eINSTANCE.getSupplierProductFeature_Uom();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierRatingTypeImpl <em>Rating Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierRatingTypeImpl
		 * @see org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl#getSupplierRatingType()
		 * @generated
		 */
		EClass SUPPLIER_RATING_TYPE = eINSTANCE.getSupplierRatingType();

		/**
		 * The meta object literal for the '<em><b>Supplier Rating Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID = eINSTANCE.getSupplierRatingType_SupplierRatingTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_RATING_TYPE__DESCRIPTION = eINSTANCE.getSupplierRatingType_Description();

	}

} //SupplierPackage
