/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo;

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
 * @see org.abchip.mimo.biz.model.product.promo.PromoFactory
 * @model kind="package"
 * @generated
 */
public interface PromoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "promo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/product/promo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-promo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PromoPackage eINSTANCE = org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoImpl <em>Product Promo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromo()
	 * @generated
	 */
	int PRODUCT_PROMO = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__PRODUCT_PROMO_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Billback Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__BILLBACK_FACTOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__CREATED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__LAST_MODIFIED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Override Org Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__OVERRIDE_ORG_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Promo Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__PRODUCT_PROMO_RULES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Promo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__PROMO_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Promo Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__PROMO_TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Require Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__REQUIRE_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Show To Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__SHOW_TO_CUSTOMER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Use Limit Per Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Use Limit Per Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__USE_LIMIT_PER_ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Use Limit Per Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>User Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO__USER_ENTERED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Product Promo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoActionImpl <em>Product Promo Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoActionImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoAction()
	 * @generated
	 */
	int PRODUCT_PROMO_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__CUSTOM_METHOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Order Adjustment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__PRODUCT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Product Promo Action Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__SERVICE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use Cart Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION__USE_CART_QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Product Promo Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_ACTION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCategoryImpl <em>Product Promo Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCategoryImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCategory()
	 * @generated
	 */
	int PRODUCT_PROMO_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>And Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__AND_GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ACTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Promo Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_COND_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__INCLUDE_SUB_CATEGORIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Promo Appl Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_APPL_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Product Promo Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeImpl <em>Product Promo Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCode()
	 * @generated
	 */
	int PRODUCT_PROMO_CODE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__CREATED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__LAST_MODIFIED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Promo Code Emails</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_EMAILS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Product Promo Code Parties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_PARTIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Require Email Or Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__REQUIRE_EMAIL_OR_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use Limit Per Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__USE_LIMIT_PER_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Use Limit Per Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__USE_LIMIT_PER_CUSTOMER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>User Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE__USER_ENTERED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Product Promo Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeEmailImpl <em>Product Promo Code Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeEmailImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCodeEmail()
	 * @generated
	 */
	int PRODUCT_PROMO_CODE_EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL__PRODUCT_PROMO_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL__EMAIL_ADDRESS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Promo Code Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_EMAIL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodePartyImpl <em>Product Promo Code Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodePartyImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCodeParty()
	 * @generated
	 */
	int PRODUCT_PROMO_CODE_PARTY = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Promo Code Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CODE_PARTY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl <em>Product Promo Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCond()
	 * @generated
	 */
	int PRODUCT_PROMO_COND = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Promo Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cond Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__COND_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__CUSTOM_METHOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Param Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__INPUT_PARAM_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Operator Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__OPERATOR_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Other Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND__OTHER_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Product Promo Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_COND_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoContentImpl <em>Product Promo Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoContentImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoContent()
	 * @generated
	 */
	int PRODUCT_PROMO_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Promo Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__PRODUCT_PROMO_CONTENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product Promo Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl <em>Product Promo Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoProduct()
	 * @generated
	 */
	int PRODUCT_PROMO_PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_ACTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Promo Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_COND_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Promo Appl Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_APPL_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Product Promo Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_PRODUCT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoRuleImpl <em>Product Promo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoRuleImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoRule()
	 * @generated
	 */
	int PRODUCT_PROMO_RULE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE__RULE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Promo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_RULE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoUseImpl <em>Product Promo Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoUseImpl
	 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoUse()
	 * @generated
	 */
	int PRODUCT_PROMO_USE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Promo Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity Left In Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Total Discount Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Product Promo Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PROMO_USE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo
	 * @generated
	 */
	EClass getProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getProductPromoId <em>Product Promo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getProductPromoId()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_ProductPromoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getBillbackFactor <em>Billback Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billback Factor</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getBillbackFactor()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_BillbackFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getCreatedByUserLogin()
	 * @see #getProductPromo()
	 * @generated
	 */
	EReference getProductPromo_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getCreatedDate()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getLastModifiedByUserLogin()
	 * @see #getProductPromo()
	 * @generated
	 */
	EReference getProductPromo_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getLastModifiedDate()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getOverrideOrgParty <em>Override Org Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Org Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getOverrideOrgParty()
	 * @see #getProductPromo()
	 * @generated
	 */
	EReference getProductPromo_OverrideOrgParty();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getProductPromoRules <em>Product Promo Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Promo Rules</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getProductPromoRules()
	 * @see #getProductPromo()
	 * @generated
	 */
	EReference getProductPromo_ProductPromoRules();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getPromoName <em>Promo Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promo Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getPromoName()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_PromoName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getPromoText <em>Promo Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promo Text</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getPromoText()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_PromoText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#isRequireCode <em>Require Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#isRequireCode()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_RequireCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#isShowToCustomer <em>Show To Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show To Customer</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#isShowToCustomer()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_ShowToCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Limit Per Customer</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getUseLimitPerCustomer()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_UseLimitPerCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getUseLimitPerOrder <em>Use Limit Per Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Limit Per Order</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getUseLimitPerOrder()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_UseLimitPerOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#getUseLimitPerPromotion <em>Use Limit Per Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Limit Per Promotion</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#getUseLimitPerPromotion()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_UseLimitPerPromotion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromo#isUserEntered <em>User Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Entered</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromo#isUserEntered()
	 * @see #getProductPromo()
	 * @generated
	 */
	EAttribute getProductPromo_UserEntered();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction <em>Product Promo Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Action</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction
	 * @generated
	 */
	EClass getProductPromoAction();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromo()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EReference getProductPromoAction_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromoRuleId()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_ProductPromoRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromoActionSeqId()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getAmount()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getCustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getCustomMethod()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EReference getProductPromoAction_CustomMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getOrderAdjustmentType <em>Order Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getOrderAdjustmentType()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EReference getProductPromoAction_OrderAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getPartyId()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductId()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromoActionEnum <em>Product Promo Action Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Action Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getProductPromoActionEnum()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EReference getProductPromoAction_ProductPromoActionEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getQuantity()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getServiceName()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getUseCartQuantity <em>Use Cart Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Cart Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoAction#getUseCartQuantity()
	 * @see #getProductPromoAction()
	 * @generated
	 */
	EAttribute getProductPromoAction_UseCartQuantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory <em>Product Promo Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory
	 * @generated
	 */
	EClass getProductPromoCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromo()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EReference getProductPromoCategory_ProductPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductCategory()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EReference getProductPromoCategory_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoRuleId()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EAttribute getProductPromoCategory_ProductPromoRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoActionSeqId()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EAttribute getProductPromoCategory_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Cond Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoCondSeqId()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EAttribute getProductPromoCategory_ProductPromoCondSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getAndGroupId <em>And Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>And Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getAndGroupId()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EAttribute getProductPromoCategory_AndGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getIncludeSubCategories <em>Include Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Sub Categories</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getIncludeSubCategories()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EAttribute getProductPromoCategory_IncludeSubCategories();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoApplEnum <em>Product Promo Appl Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Appl Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoApplEnum()
	 * @see #getProductPromoCategory()
	 * @generated
	 */
	EReference getProductPromoCategory_ProductPromoApplEnum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode
	 * @generated
	 */
	EClass getProductPromoCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromoCodeId <em>Product Promo Code Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Code Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromoCodeId()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_ProductPromoCodeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getCreatedByUserLogin()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EReference getProductPromoCode_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getCreatedDate()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getFromDate()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getLastModifiedByUserLogin()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EReference getProductPromoCode_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getLastModifiedDate()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromo()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EReference getProductPromoCode_ProductPromo();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromoCodeEmails <em>Product Promo Code Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Promo Code Emails</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromoCodeEmails()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EReference getProductPromoCode_ProductPromoCodeEmails();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromoCodeParties <em>Product Promo Code Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Promo Code Parties</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getProductPromoCodeParties()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EReference getProductPromoCode_ProductPromoCodeParties();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#isRequireEmailOrParty <em>Require Email Or Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Email Or Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#isRequireEmailOrParty()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_RequireEmailOrParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getThruDate()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getUseLimitPerCode <em>Use Limit Per Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Limit Per Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getUseLimitPerCode()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_UseLimitPerCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getUseLimitPerCustomer <em>Use Limit Per Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Limit Per Customer</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#getUseLimitPerCustomer()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_UseLimitPerCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCode#isUserEntered <em>User Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Entered</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCode#isUserEntered()
	 * @see #getProductPromoCode()
	 * @generated
	 */
	EAttribute getProductPromoCode_UserEntered();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail <em>Product Promo Code Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Code Email</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail
	 * @generated
	 */
	EClass getProductPromoCodeEmail();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getProductPromoCode()
	 * @see #getProductPromoCodeEmail()
	 * @generated
	 */
	EReference getProductPromoCodeEmail_ProductPromoCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getEmailAddress()
	 * @see #getProductPromoCodeEmail()
	 * @generated
	 */
	EAttribute getProductPromoCodeEmail_EmailAddress();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty <em>Product Promo Code Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Code Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty
	 * @generated
	 */
	EClass getProductPromoCodeParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getProductPromoCode()
	 * @see #getProductPromoCodeParty()
	 * @generated
	 */
	EReference getProductPromoCodeParty_ProductPromoCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getParty()
	 * @see #getProductPromoCodeParty()
	 * @generated
	 */
	EReference getProductPromoCodeParty_Party();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond <em>Product Promo Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Cond</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond
	 * @generated
	 */
	EClass getProductPromoCond();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getProductPromo()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EReference getProductPromoCond_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getProductPromoRuleId()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EAttribute getProductPromoCond_ProductPromoRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Cond Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getProductPromoCondSeqId()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EAttribute getProductPromoCond_ProductPromoCondSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getCondValue <em>Cond Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond Value</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getCondValue()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EAttribute getProductPromoCond_CondValue();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getCustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getCustomMethod()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EReference getProductPromoCond_CustomMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getInputParamEnum <em>Input Param Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Param Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getInputParamEnum()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EReference getProductPromoCond_InputParamEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getOperatorEnum <em>Operator Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getOperatorEnum()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EReference getProductPromoCond_OperatorEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getOtherValue <em>Other Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Value</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoCond#getOtherValue()
	 * @see #getProductPromoCond()
	 * @generated
	 */
	EAttribute getProductPromoCond_OtherValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoContent <em>Product Promo Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Content</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoContent
	 * @generated
	 */
	EClass getProductPromoContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getProductPromo()
	 * @see #getProductPromoContent()
	 * @generated
	 */
	EReference getProductPromoContent_ProductPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getContent()
	 * @see #getProductPromoContent()
	 * @generated
	 */
	EReference getProductPromoContent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getProductPromoContentType <em>Product Promo Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getProductPromoContentType()
	 * @see #getProductPromoContent()
	 * @generated
	 */
	EReference getProductPromoContent_ProductPromoContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getFromDate()
	 * @see #getProductPromoContent()
	 * @generated
	 */
	EAttribute getProductPromoContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoContent#getThruDate()
	 * @see #getProductPromoContent()
	 * @generated
	 */
	EAttribute getProductPromoContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct <em>Product Promo Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct
	 * @generated
	 */
	EClass getProductPromoProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromo()
	 * @see #getProductPromoProduct()
	 * @generated
	 */
	EReference getProductPromoProduct_ProductPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProduct()
	 * @see #getProductPromoProduct()
	 * @generated
	 */
	EReference getProductPromoProduct_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoRuleId()
	 * @see #getProductPromoProduct()
	 * @generated
	 */
	EAttribute getProductPromoProduct_ProductPromoRuleId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoApplEnum <em>Product Promo Appl Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Appl Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoApplEnum()
	 * @see #getProductPromoProduct()
	 * @generated
	 */
	EReference getProductPromoProduct_ProductPromoApplEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoActionSeqId()
	 * @see #getProductPromoProduct()
	 * @generated
	 */
	EAttribute getProductPromoProduct_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Cond Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoProduct#getProductPromoCondSeqId()
	 * @see #getProductPromoProduct()
	 * @generated
	 */
	EAttribute getProductPromoProduct_ProductPromoCondSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule <em>Product Promo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Rule</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoRule
	 * @generated
	 */
	EClass getProductPromoRule();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromo()
	 * @see #getProductPromoRule()
	 * @generated
	 */
	EReference getProductPromoRule_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromoRuleId()
	 * @see #getProductPromoRule()
	 * @generated
	 */
	EAttribute getProductPromoRule_ProductPromoRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getRuleName()
	 * @see #getProductPromoRule()
	 * @generated
	 */
	EAttribute getProductPromoRule_RuleName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse <em>Product Promo Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Promo Use</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse
	 * @generated
	 */
	EClass getProductPromoUse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getOrder()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EReference getProductPromoUse_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getPromoSequenceId <em>Promo Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promo Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getPromoSequenceId()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EAttribute getProductPromoUse_PromoSequenceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getParty()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EReference getProductPromoUse_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromo()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EReference getProductPromoUse_ProductPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromoCode()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EReference getProductPromoUse_ProductPromoCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getQuantityLeftInActions <em>Quantity Left In Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Left In Actions</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getQuantityLeftInActions()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EAttribute getProductPromoUse_QuantityLeftInActions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getTotalDiscountAmount <em>Total Discount Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Discount Amount</em>'.
	 * @see org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getTotalDiscountAmount()
	 * @see #getProductPromoUse()
	 * @generated
	 */
	EAttribute getProductPromoUse_TotalDiscountAmount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PromoFactory getPromoFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoImpl <em>Product Promo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromo()
		 * @generated
		 */
		EClass PRODUCT_PROMO = eINSTANCE.getProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__PRODUCT_PROMO_ID = eINSTANCE.getProductPromo_ProductPromoId();

		/**
		 * The meta object literal for the '<em><b>Billback Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__BILLBACK_FACTOR = eINSTANCE.getProductPromo_BillbackFactor();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO__CREATED_BY_USER_LOGIN = eINSTANCE.getProductPromo_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__CREATED_DATE = eINSTANCE.getProductPromo_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getProductPromo_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__LAST_MODIFIED_DATE = eINSTANCE.getProductPromo_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Override Org Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO__OVERRIDE_ORG_PARTY = eINSTANCE.getProductPromo_OverrideOrgParty();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO__PRODUCT_PROMO_RULES = eINSTANCE.getProductPromo_ProductPromoRules();

		/**
		 * The meta object literal for the '<em><b>Promo Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__PROMO_NAME = eINSTANCE.getProductPromo_PromoName();

		/**
		 * The meta object literal for the '<em><b>Promo Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__PROMO_TEXT = eINSTANCE.getProductPromo_PromoText();

		/**
		 * The meta object literal for the '<em><b>Require Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__REQUIRE_CODE = eINSTANCE.getProductPromo_RequireCode();

		/**
		 * The meta object literal for the '<em><b>Show To Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__SHOW_TO_CUSTOMER = eINSTANCE.getProductPromo_ShowToCustomer();

		/**
		 * The meta object literal for the '<em><b>Use Limit Per Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__USE_LIMIT_PER_CUSTOMER = eINSTANCE.getProductPromo_UseLimitPerCustomer();

		/**
		 * The meta object literal for the '<em><b>Use Limit Per Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__USE_LIMIT_PER_ORDER = eINSTANCE.getProductPromo_UseLimitPerOrder();

		/**
		 * The meta object literal for the '<em><b>Use Limit Per Promotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__USE_LIMIT_PER_PROMOTION = eINSTANCE.getProductPromo_UseLimitPerPromotion();

		/**
		 * The meta object literal for the '<em><b>User Entered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO__USER_ENTERED = eINSTANCE.getProductPromo_UserEntered();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoActionImpl <em>Product Promo Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoActionImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoAction()
		 * @generated
		 */
		EClass PRODUCT_PROMO_ACTION = eINSTANCE.getProductPromoAction();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_ACTION__PRODUCT_PROMO = eINSTANCE.getProductPromoAction_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID = eINSTANCE.getProductPromoAction_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getProductPromoAction_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__AMOUNT = eINSTANCE.getProductPromoAction_Amount();

		/**
		 * The meta object literal for the '<em><b>Custom Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_ACTION__CUSTOM_METHOD = eINSTANCE.getProductPromoAction_CustomMethod();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE = eINSTANCE.getProductPromoAction_OrderAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__PARTY_ID = eINSTANCE.getProductPromoAction_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__PRODUCT_ID = eINSTANCE.getProductPromoAction_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM = eINSTANCE.getProductPromoAction_ProductPromoActionEnum();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__QUANTITY = eINSTANCE.getProductPromoAction_Quantity();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__SERVICE_NAME = eINSTANCE.getProductPromoAction_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Use Cart Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_ACTION__USE_CART_QUANTITY = eINSTANCE.getProductPromoAction_UseCartQuantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCategoryImpl <em>Product Promo Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCategoryImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCategory()
		 * @generated
		 */
		EClass PRODUCT_PROMO_CATEGORY = eINSTANCE.getProductPromoCategory();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO = eINSTANCE.getProductPromoCategory_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CATEGORY__PRODUCT_CATEGORY = eINSTANCE.getProductPromoCategory_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_RULE_ID = eINSTANCE.getProductPromoCategory_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getProductPromoCategory_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Cond Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_COND_SEQ_ID = eINSTANCE.getProductPromoCategory_ProductPromoCondSeqId();

		/**
		 * The meta object literal for the '<em><b>And Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CATEGORY__AND_GROUP_ID = eINSTANCE.getProductPromoCategory_AndGroupId();

		/**
		 * The meta object literal for the '<em><b>Include Sub Categories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CATEGORY__INCLUDE_SUB_CATEGORIES = eINSTANCE.getProductPromoCategory_IncludeSubCategories();

		/**
		 * The meta object literal for the '<em><b>Product Promo Appl Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_APPL_ENUM = eINSTANCE.getProductPromoCategory_ProductPromoApplEnum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeImpl <em>Product Promo Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCode()
		 * @generated
		 */
		EClass PRODUCT_PROMO_CODE = eINSTANCE.getProductPromoCode();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID = eINSTANCE.getProductPromoCode_ProductPromoCodeId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE__CREATED_BY_USER_LOGIN = eINSTANCE.getProductPromoCode_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__CREATED_DATE = eINSTANCE.getProductPromoCode_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__FROM_DATE = eINSTANCE.getProductPromoCode_FromDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getProductPromoCode_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__LAST_MODIFIED_DATE = eINSTANCE.getProductPromoCode_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE__PRODUCT_PROMO = eINSTANCE.getProductPromoCode_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code Emails</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_EMAILS = eINSTANCE.getProductPromoCode_ProductPromoCodeEmails();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code Parties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_PARTIES = eINSTANCE.getProductPromoCode_ProductPromoCodeParties();

		/**
		 * The meta object literal for the '<em><b>Require Email Or Party</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__REQUIRE_EMAIL_OR_PARTY = eINSTANCE.getProductPromoCode_RequireEmailOrParty();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__THRU_DATE = eINSTANCE.getProductPromoCode_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Use Limit Per Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__USE_LIMIT_PER_CODE = eINSTANCE.getProductPromoCode_UseLimitPerCode();

		/**
		 * The meta object literal for the '<em><b>Use Limit Per Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__USE_LIMIT_PER_CUSTOMER = eINSTANCE.getProductPromoCode_UseLimitPerCustomer();

		/**
		 * The meta object literal for the '<em><b>User Entered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE__USER_ENTERED = eINSTANCE.getProductPromoCode_UserEntered();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeEmailImpl <em>Product Promo Code Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodeEmailImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCodeEmail()
		 * @generated
		 */
		EClass PRODUCT_PROMO_CODE_EMAIL = eINSTANCE.getProductPromoCodeEmail();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE_EMAIL__PRODUCT_PROMO_CODE = eINSTANCE.getProductPromoCodeEmail_ProductPromoCode();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CODE_EMAIL__EMAIL_ADDRESS = eINSTANCE.getProductPromoCodeEmail_EmailAddress();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodePartyImpl <em>Product Promo Code Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCodePartyImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCodeParty()
		 * @generated
		 */
		EClass PRODUCT_PROMO_CODE_PARTY = eINSTANCE.getProductPromoCodeParty();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE = eINSTANCE.getProductPromoCodeParty_ProductPromoCode();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CODE_PARTY__PARTY = eINSTANCE.getProductPromoCodeParty_Party();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl <em>Product Promo Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoCond()
		 * @generated
		 */
		EClass PRODUCT_PROMO_COND = eINSTANCE.getProductPromoCond();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_COND__PRODUCT_PROMO = eINSTANCE.getProductPromoCond_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID = eINSTANCE.getProductPromoCond_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Cond Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID = eINSTANCE.getProductPromoCond_ProductPromoCondSeqId();

		/**
		 * The meta object literal for the '<em><b>Cond Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_COND__COND_VALUE = eINSTANCE.getProductPromoCond_CondValue();

		/**
		 * The meta object literal for the '<em><b>Custom Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_COND__CUSTOM_METHOD = eINSTANCE.getProductPromoCond_CustomMethod();

		/**
		 * The meta object literal for the '<em><b>Input Param Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_COND__INPUT_PARAM_ENUM = eINSTANCE.getProductPromoCond_InputParamEnum();

		/**
		 * The meta object literal for the '<em><b>Operator Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_COND__OPERATOR_ENUM = eINSTANCE.getProductPromoCond_OperatorEnum();

		/**
		 * The meta object literal for the '<em><b>Other Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_COND__OTHER_VALUE = eINSTANCE.getProductPromoCond_OtherValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoContentImpl <em>Product Promo Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoContentImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoContent()
		 * @generated
		 */
		EClass PRODUCT_PROMO_CONTENT = eINSTANCE.getProductPromoContent();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CONTENT__PRODUCT_PROMO = eINSTANCE.getProductPromoContent_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CONTENT__CONTENT = eINSTANCE.getProductPromoContent_Content();

		/**
		 * The meta object literal for the '<em><b>Product Promo Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_CONTENT__PRODUCT_PROMO_CONTENT_TYPE = eINSTANCE.getProductPromoContent_ProductPromoContentType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CONTENT__FROM_DATE = eINSTANCE.getProductPromoContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_CONTENT__THRU_DATE = eINSTANCE.getProductPromoContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl <em>Product Promo Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoProduct()
		 * @generated
		 */
		EClass PRODUCT_PROMO_PRODUCT = eINSTANCE.getProductPromoProduct();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO = eINSTANCE.getProductPromoProduct_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_PRODUCT__PRODUCT = eINSTANCE.getProductPromoProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_RULE_ID = eINSTANCE.getProductPromoProduct_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Appl Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_APPL_ENUM = eINSTANCE.getProductPromoProduct_ProductPromoApplEnum();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getProductPromoProduct_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Cond Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_COND_SEQ_ID = eINSTANCE.getProductPromoProduct_ProductPromoCondSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoRuleImpl <em>Product Promo Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoRuleImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoRule()
		 * @generated
		 */
		EClass PRODUCT_PROMO_RULE = eINSTANCE.getProductPromoRule();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_RULE__PRODUCT_PROMO = eINSTANCE.getProductPromoRule_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_RULE__PRODUCT_PROMO_RULE_ID = eINSTANCE.getProductPromoRule_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_RULE__RULE_NAME = eINSTANCE.getProductPromoRule_RuleName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoUseImpl <em>Product Promo Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.promo.impl.ProductPromoUseImpl
		 * @see org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl#getProductPromoUse()
		 * @generated
		 */
		EClass PRODUCT_PROMO_USE = eINSTANCE.getProductPromoUse();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_USE__ORDER = eINSTANCE.getProductPromoUse_Order();

		/**
		 * The meta object literal for the '<em><b>Promo Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_USE__PROMO_SEQUENCE_ID = eINSTANCE.getProductPromoUse_PromoSequenceId();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_USE__PARTY = eINSTANCE.getProductPromoUse_Party();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_USE__PRODUCT_PROMO = eINSTANCE.getProductPromoUse_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PROMO_USE__PRODUCT_PROMO_CODE = eINSTANCE.getProductPromoUse_ProductPromoCode();

		/**
		 * The meta object literal for the '<em><b>Quantity Left In Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_USE__QUANTITY_LEFT_IN_ACTIONS = eINSTANCE.getProductPromoUse_QuantityLeftInActions();

		/**
		 * The meta object literal for the '<em><b>Total Discount Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PROMO_USE__TOTAL_DISCOUNT_AMOUNT = eINSTANCE.getProductPromoUse_TotalDiscountAmount();

	}

} //PromoPackage
