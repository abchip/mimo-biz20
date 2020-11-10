/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.quote;

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
 * @see org.abchip.mimo.biz.model.order.quote.QuoteFactory
 * @model kind="package"
 * @generated
 */
public interface QuotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quote";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/order/quote";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-quote";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuotePackage eINSTANCE = org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteImpl <em>Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuote()
	 * @generated
	 */
	int QUOTE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__ISSUE_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__PRODUCT_STORE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quote Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Quote Coefficients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_COEFFICIENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quote Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_ITEMS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quote Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Quote Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_NOTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Quote Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Quote Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_WORK_EFFORTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sales Channel Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__SALES_CHANNEL_ENUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__VALID_FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Valid Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__VALID_THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl <em>Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteAdjustment()
	 * @generated
	 */
	int QUOTE_ADJUSTMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CUSTOMER_REFERENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__EXEMPT_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__INCLUDE_IN_SHIPPING = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__INCLUDE_IN_TAX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_MODIFIED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__OVERRIDE_GL_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Primary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRIMARY_GEO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_FEATURE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Quote Adjustment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Secondary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__SECONDARY_GEO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__SOURCE_PERCENTAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__SOURCE_REFERENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__TAX_AUTH_GEO_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__TAX_AUTH_PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 31;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteAttribute()
	 * @generated
	 */
	int QUOTE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteCoefficientImpl <em>Coefficient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteCoefficientImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteCoefficient()
	 * @generated
	 */
	int QUOTE_COEFFICIENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Coeff Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__COEFF_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Coeff Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__COEFF_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Coefficient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteItemImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteItem()
	 * @generated
	 */
	int QUOTE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUOTE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CONFIG_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CUST_REQUEST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Deliverable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__DELIVERABLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__ESTIMATED_DELIVERY_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Promo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__IS_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__LEAD_TIME_DAYS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__PRODUCT_FEATURE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Quote Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUOTE_UNIT_PRICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__RESERV_LENGTH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__RESERV_PERSONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__RESERV_START = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__SELECTED_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Skill Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__SKILL_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteNoteImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteNote()
	 * @generated
	 */
	int QUOTE_NOTE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__QUOTE = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteRoleImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteRole()
	 * @generated
	 */
	int QUOTE_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTermImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteTerm()
	 * @generated
	 */
	int QUOTE_TERM = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TERM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__QUOTE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TERM_DAYS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TERM_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TEXT_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTermAttributeImpl <em>Term Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTermAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteTermAttribute()
	 * @generated
	 */
	int QUOTE_TERM_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__QUOTE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__QUOTE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__TERM_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Term Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteType()
	 * @generated
	 */
	int QUOTE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__QUOTE_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quote Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__QUOTE_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteTypeAttr()
	 * @generated
	 */
	int QUOTE_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__QUOTE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteWorkEffortImpl <em>Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteWorkEffortImpl
	 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteWorkEffort()
	 * @generated
	 */
	int QUOTE_WORK_EFFORT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.Quote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote
	 * @generated
	 */
	EClass getQuote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteId()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_QuoteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.Quote#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getCurrencyUom()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.Quote#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getDescription()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.Quote#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getIssueDate()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_IssueDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.Quote#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getParty()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.Quote#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getProductStore()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_ProductStore();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteAttributes <em>Quote Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteAttributes()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteCoefficients <em>Quote Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Coefficients</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteCoefficients()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteCoefficients();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteItems <em>Quote Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Items</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteItems()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteName <em>Quote Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteName()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_QuoteName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteNotes <em>Quote Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Notes</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteNotes()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteType <em>Quote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteType()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteWorkEfforts <em>Quote Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getQuoteWorkEfforts()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteWorkEfforts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.Quote#getSalesChannelEnum <em>Sales Channel Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Channel Enum</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getSalesChannelEnum()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_SalesChannelEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.Quote#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getStatus()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.Quote#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getValidFromDate()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.Quote#getValidThruDate <em>Valid Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.Quote#getValidThruDate()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_ValidThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment
	 * @generated
	 */
	EClass getQuoteAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentId <em>Quote Adjustment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Adjustment Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_QuoteAdjustmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getAmount()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getComments()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Product Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCorrespondingProductId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_CorrespondingProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedByUserLogin()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedDate()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCustomerReferenceId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_CustomerReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getDescription()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getExemptAmount <em>Exempt Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getExemptAmount()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ExemptAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInShipping <em>Include In Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Shipping</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInShipping()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_IncludeInShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInTax <em>Include In Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Tax</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInTax()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_IncludeInTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedByUserLogin()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedDate()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getOverrideGlAccount <em>Override Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getOverrideGlAccount()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_OverrideGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getPrimaryGeo <em>Primary Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Geo</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getPrimaryGeo()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_PrimaryGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductFeatureId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromo()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoActionSeqId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoRuleId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ProductPromoRuleId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuote()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_Quote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentType <em>Quote Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentType()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_QuoteAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteItemSeqId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_QuoteItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSecondaryGeo <em>Secondary Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Geo</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSecondaryGeo()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_SecondaryGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourcePercentage <em>Source Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourcePercentage()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_SourcePercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourceReferenceId <em>Source Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourceReferenceId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_SourceReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthGeoId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthPartyId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_TaxAuthPartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAttribute
	 * @generated
	 */
	EClass getQuoteAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getQuote()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EReference getQuoteAttribute_Quote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getAttrName()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EAttribute getQuoteAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getAttrDescription()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EAttribute getQuoteAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteAttribute#getAttrValue()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EAttribute getQuoteAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteCoefficient <em>Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coefficient</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteCoefficient
	 * @generated
	 */
	EClass getQuoteCoefficient();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteCoefficient#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteCoefficient#getQuote()
	 * @see #getQuoteCoefficient()
	 * @generated
	 */
	EReference getQuoteCoefficient_Quote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteCoefficient#getCoeffName <em>Coeff Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteCoefficient#getCoeffName()
	 * @see #getQuoteCoefficient()
	 * @generated
	 */
	EAttribute getQuoteCoefficient_CoeffName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteCoefficient#getCoeffValue <em>Coeff Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteCoefficient#getCoeffValue()
	 * @see #getQuoteCoefficient()
	 * @generated
	 */
	EAttribute getQuoteCoefficient_CoeffValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem
	 * @generated
	 */
	EClass getQuoteItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuote()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_Quote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteItemSeqId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_QuoteItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getComments()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getConfigId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequest <em>Cust Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequest()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_CustRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequestItemSeqId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_CustRequestItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getDeliverableType <em>Deliverable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverable Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getDeliverableType()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_DeliverableType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Delivery Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getEstimatedDeliveryDate()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_EstimatedDeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getIsPromo <em>Is Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Promo</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getIsPromo()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_IsPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getLeadTimeDays <em>Lead Time Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lead Time Days</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getLeadTimeDays()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_LeadTimeDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getProduct()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getProductFeature()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_ProductFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuantity()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteUnitPrice <em>Quote Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Unit Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteUnitPrice()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_QuoteUnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservLength <em>Reserv Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Length</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservLength()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ReservLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservPersons()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservStart <em>Reserv Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Start</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservStart()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ReservStart();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getSelectedAmount <em>Selected Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getSelectedAmount()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_SelectedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getSkillType <em>Skill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getSkillType()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_SkillType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getUom()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_Uom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteItem#getWorkEffort()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_WorkEffort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteNote
	 * @generated
	 */
	EClass getQuoteNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteNote#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteNote#getQuote()
	 * @see #getQuoteNote()
	 * @generated
	 */
	EReference getQuoteNote_Quote();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteRole
	 * @generated
	 */
	EClass getQuoteRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteRole#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteRole#getQuote()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EReference getQuoteRole_Quote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteRole#getParty()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EReference getQuoteRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteRole#getRoleType()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EReference getQuoteRole_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteRole#getFromDate()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EAttribute getQuoteRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteRole#getThruDate()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EAttribute getQuoteRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm
	 * @generated
	 */
	EClass getQuoteTerm();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuote()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EReference getQuoteTerm_Quote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermType()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EReference getQuoteTerm_TermType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuoteItemSeqId()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_QuoteItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getDescription()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermDays()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_TermDays();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermValue()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTextValue()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_TextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTerm#getUomId()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute <em>Term Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute
	 * @generated
	 */
	EClass getQuoteTermAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getTermTypeId()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_TermTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getQuoteId()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getQuoteItemSeqId()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_QuoteItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getAttrName()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getAttrDescription()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTermAttribute#getAttrValue()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteType
	 * @generated
	 */
	EClass getQuoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteType#getQuoteTypeId <em>Quote Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteType#getQuoteTypeId()
	 * @see #getQuoteType()
	 * @generated
	 */
	EAttribute getQuoteType_QuoteTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteType#getDescription()
	 * @see #getQuoteType()
	 * @generated
	 */
	EAttribute getQuoteType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteType#isHasTable()
	 * @see #getQuoteType()
	 * @generated
	 */
	EAttribute getQuoteType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteType#getParentType()
	 * @see #getQuoteType()
	 * @generated
	 */
	EReference getQuoteType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.quote.QuoteType#getQuoteTypeAttrs <em>Quote Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteType#getQuoteTypeAttrs()
	 * @see #getQuoteType()
	 * @generated
	 */
	EReference getQuoteType_QuoteTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr
	 * @generated
	 */
	EClass getQuoteTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr#getQuoteType <em>Quote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr#getQuoteType()
	 * @see #getQuoteTypeAttr()
	 * @generated
	 */
	EReference getQuoteTypeAttr_QuoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr#getAttrName()
	 * @see #getQuoteTypeAttr()
	 * @generated
	 */
	EAttribute getQuoteTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteTypeAttr#getDescription()
	 * @see #getQuoteTypeAttr()
	 * @generated
	 */
	EAttribute getQuoteTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort
	 * @generated
	 */
	EClass getQuoteWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort#getQuote()
	 * @see #getQuoteWorkEffort()
	 * @generated
	 */
	EReference getQuoteWorkEffort_Quote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort#getWorkEffort()
	 * @see #getQuoteWorkEffort()
	 * @generated
	 */
	EReference getQuoteWorkEffort_WorkEffort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuoteFactory getQuoteFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteImpl <em>Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuote()
		 * @generated
		 */
		EClass QUOTE = eINSTANCE.getQuote();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__QUOTE_ID = eINSTANCE.getQuote_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__CURRENCY_UOM = eINSTANCE.getQuote_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__DESCRIPTION = eINSTANCE.getQuote_Description();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__ISSUE_DATE = eINSTANCE.getQuote_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__PARTY = eINSTANCE.getQuote_Party();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__PRODUCT_STORE = eINSTANCE.getQuote_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Quote Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_ATTRIBUTES = eINSTANCE.getQuote_QuoteAttributes();

		/**
		 * The meta object literal for the '<em><b>Quote Coefficients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_COEFFICIENTS = eINSTANCE.getQuote_QuoteCoefficients();

		/**
		 * The meta object literal for the '<em><b>Quote Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_ITEMS = eINSTANCE.getQuote_QuoteItems();

		/**
		 * The meta object literal for the '<em><b>Quote Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__QUOTE_NAME = eINSTANCE.getQuote_QuoteName();

		/**
		 * The meta object literal for the '<em><b>Quote Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_NOTES = eINSTANCE.getQuote_QuoteNotes();

		/**
		 * The meta object literal for the '<em><b>Quote Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_TYPE = eINSTANCE.getQuote_QuoteType();

		/**
		 * The meta object literal for the '<em><b>Quote Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_WORK_EFFORTS = eINSTANCE.getQuote_QuoteWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__SALES_CHANNEL_ENUM = eINSTANCE.getQuote_SalesChannelEnum();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__STATUS = eINSTANCE.getQuote_Status();

		/**
		 * The meta object literal for the '<em><b>Valid From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__VALID_FROM_DATE = eINSTANCE.getQuote_ValidFromDate();

		/**
		 * The meta object literal for the '<em><b>Valid Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__VALID_THRU_DATE = eINSTANCE.getQuote_ValidThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl <em>Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteAdjustment()
		 * @generated
		 */
		EClass QUOTE_ADJUSTMENT = eINSTANCE.getQuoteAdjustment();

		/**
		 * The meta object literal for the '<em><b>Quote Adjustment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_ID = eINSTANCE.getQuoteAdjustment_QuoteAdjustmentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__AMOUNT = eINSTANCE.getQuoteAdjustment_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__COMMENTS = eINSTANCE.getQuoteAdjustment_Comments();

		/**
		 * The meta object literal for the '<em><b>Corresponding Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = eINSTANCE.getQuoteAdjustment_CorrespondingProductId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getQuoteAdjustment_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__CREATED_DATE = eINSTANCE.getQuoteAdjustment_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Customer Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__CUSTOMER_REFERENCE_ID = eINSTANCE.getQuoteAdjustment_CustomerReferenceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__DESCRIPTION = eINSTANCE.getQuoteAdjustment_Description();

		/**
		 * The meta object literal for the '<em><b>Exempt Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__EXEMPT_AMOUNT = eINSTANCE.getQuoteAdjustment_ExemptAmount();

		/**
		 * The meta object literal for the '<em><b>Include In Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__INCLUDE_IN_SHIPPING = eINSTANCE.getQuoteAdjustment_IncludeInShipping();

		/**
		 * The meta object literal for the '<em><b>Include In Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__INCLUDE_IN_TAX = eINSTANCE.getQuoteAdjustment_IncludeInTax();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getQuoteAdjustment_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__LAST_MODIFIED_DATE = eINSTANCE.getQuoteAdjustment_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__OVERRIDE_GL_ACCOUNT = eINSTANCE.getQuoteAdjustment_OverrideGlAccount();

		/**
		 * The meta object literal for the '<em><b>Primary Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__PRIMARY_GEO = eINSTANCE.getQuoteAdjustment_PrimaryGeo();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__PRODUCT_FEATURE_ID = eINSTANCE.getQuoteAdjustment_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__PRODUCT_PROMO = eINSTANCE.getQuoteAdjustment_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getQuoteAdjustment_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = eINSTANCE.getQuoteAdjustment_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__QUOTE = eINSTANCE.getQuoteAdjustment_Quote();

		/**
		 * The meta object literal for the '<em><b>Quote Adjustment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_TYPE = eINSTANCE.getQuoteAdjustment_QuoteAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteAdjustment_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Secondary Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__SECONDARY_GEO = eINSTANCE.getQuoteAdjustment_SecondaryGeo();

		/**
		 * The meta object literal for the '<em><b>Source Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__SOURCE_PERCENTAGE = eINSTANCE.getQuoteAdjustment_SourcePercentage();

		/**
		 * The meta object literal for the '<em><b>Source Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__SOURCE_REFERENCE_ID = eINSTANCE.getQuoteAdjustment_SourceReferenceId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__TAX_AUTH_GEO_ID = eINSTANCE.getQuoteAdjustment_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__TAX_AUTH_PARTY_ID = eINSTANCE.getQuoteAdjustment_TaxAuthPartyId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteAttribute()
		 * @generated
		 */
		EClass QUOTE_ATTRIBUTE = eINSTANCE.getQuoteAttribute();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ATTRIBUTE__QUOTE = eINSTANCE.getQuoteAttribute_Quote();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ATTRIBUTE__ATTR_NAME = eINSTANCE.getQuoteAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getQuoteAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getQuoteAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteCoefficientImpl <em>Coefficient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteCoefficientImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteCoefficient()
		 * @generated
		 */
		EClass QUOTE_COEFFICIENT = eINSTANCE.getQuoteCoefficient();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_COEFFICIENT__QUOTE = eINSTANCE.getQuoteCoefficient_Quote();

		/**
		 * The meta object literal for the '<em><b>Coeff Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_COEFFICIENT__COEFF_NAME = eINSTANCE.getQuoteCoefficient_CoeffName();

		/**
		 * The meta object literal for the '<em><b>Coeff Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_COEFFICIENT__COEFF_VALUE = eINSTANCE.getQuoteCoefficient_CoeffValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteItemImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteItem()
		 * @generated
		 */
		EClass QUOTE_ITEM = eINSTANCE.getQuoteItem();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__QUOTE = eINSTANCE.getQuoteItem_Quote();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteItem_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__COMMENTS = eINSTANCE.getQuoteItem_Comments();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__CONFIG_ID = eINSTANCE.getQuoteItem_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Cust Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__CUST_REQUEST = eINSTANCE.getQuoteItem_CustRequest();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getQuoteItem_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Deliverable Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__DELIVERABLE_TYPE = eINSTANCE.getQuoteItem_DeliverableType();

		/**
		 * The meta object literal for the '<em><b>Estimated Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__ESTIMATED_DELIVERY_DATE = eINSTANCE.getQuoteItem_EstimatedDeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Is Promo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__IS_PROMO = eINSTANCE.getQuoteItem_IsPromo();

		/**
		 * The meta object literal for the '<em><b>Lead Time Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__LEAD_TIME_DAYS = eINSTANCE.getQuoteItem_LeadTimeDays();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__PRODUCT = eINSTANCE.getQuoteItem_Product();

		/**
		 * The meta object literal for the '<em><b>Product Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__PRODUCT_FEATURE = eINSTANCE.getQuoteItem_ProductFeature();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__QUANTITY = eINSTANCE.getQuoteItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quote Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__QUOTE_UNIT_PRICE = eINSTANCE.getQuoteItem_QuoteUnitPrice();

		/**
		 * The meta object literal for the '<em><b>Reserv Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__RESERV_LENGTH = eINSTANCE.getQuoteItem_ReservLength();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__RESERV_PERSONS = eINSTANCE.getQuoteItem_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__RESERV_START = eINSTANCE.getQuoteItem_ReservStart();

		/**
		 * The meta object literal for the '<em><b>Selected Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__SELECTED_AMOUNT = eINSTANCE.getQuoteItem_SelectedAmount();

		/**
		 * The meta object literal for the '<em><b>Skill Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__SKILL_TYPE = eINSTANCE.getQuoteItem_SkillType();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__UOM = eINSTANCE.getQuoteItem_Uom();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__WORK_EFFORT = eINSTANCE.getQuoteItem_WorkEffort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteNoteImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteNote()
		 * @generated
		 */
		EClass QUOTE_NOTE = eINSTANCE.getQuoteNote();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_NOTE__QUOTE = eINSTANCE.getQuoteNote_Quote();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteRoleImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteRole()
		 * @generated
		 */
		EClass QUOTE_ROLE = eINSTANCE.getQuoteRole();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ROLE__QUOTE = eINSTANCE.getQuoteRole_Quote();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ROLE__PARTY = eINSTANCE.getQuoteRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ROLE__ROLE_TYPE = eINSTANCE.getQuoteRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ROLE__FROM_DATE = eINSTANCE.getQuoteRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ROLE__THRU_DATE = eINSTANCE.getQuoteRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTermImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteTerm()
		 * @generated
		 */
		EClass QUOTE_TERM = eINSTANCE.getQuoteTerm();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TERM__QUOTE = eINSTANCE.getQuoteTerm_Quote();

		/**
		 * The meta object literal for the '<em><b>Term Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TERM__TERM_TYPE = eINSTANCE.getQuoteTerm_TermType();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteTerm_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__DESCRIPTION = eINSTANCE.getQuoteTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__TERM_DAYS = eINSTANCE.getQuoteTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__TERM_VALUE = eINSTANCE.getQuoteTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__TEXT_VALUE = eINSTANCE.getQuoteTerm_TextValue();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__UOM_ID = eINSTANCE.getQuoteTerm_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTermAttributeImpl <em>Term Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTermAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteTermAttribute()
		 * @generated
		 */
		EClass QUOTE_TERM_ATTRIBUTE = eINSTANCE.getQuoteTermAttribute();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__TERM_TYPE_ID = eINSTANCE.getQuoteTermAttribute_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__QUOTE_ID = eINSTANCE.getQuoteTermAttribute_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteTermAttribute_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getQuoteTermAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getQuoteTermAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getQuoteTermAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteType()
		 * @generated
		 */
		EClass QUOTE_TYPE = eINSTANCE.getQuoteType();

		/**
		 * The meta object literal for the '<em><b>Quote Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE__QUOTE_TYPE_ID = eINSTANCE.getQuoteType_QuoteTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE__DESCRIPTION = eINSTANCE.getQuoteType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE__HAS_TABLE = eINSTANCE.getQuoteType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TYPE__PARENT_TYPE = eINSTANCE.getQuoteType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Quote Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TYPE__QUOTE_TYPE_ATTRS = eINSTANCE.getQuoteType_QuoteTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteTypeAttr()
		 * @generated
		 */
		EClass QUOTE_TYPE_ATTR = eINSTANCE.getQuoteTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Quote Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TYPE_ATTR__QUOTE_TYPE = eINSTANCE.getQuoteTypeAttr_QuoteType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getQuoteTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getQuoteTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteWorkEffortImpl <em>Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuoteWorkEffortImpl
		 * @see org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl#getQuoteWorkEffort()
		 * @generated
		 */
		EClass QUOTE_WORK_EFFORT = eINSTANCE.getQuoteWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_WORK_EFFORT__QUOTE = eINSTANCE.getQuoteWorkEffort_Quote();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_WORK_EFFORT__WORK_EFFORT = eINSTANCE.getQuoteWorkEffort_WorkEffort();

	}

} //QuotePackage
