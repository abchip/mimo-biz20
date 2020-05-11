/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

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
 * @see org.abchip.mimo.biz.service.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/product";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = org.abchip.mimo.biz.service.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalculateProductPriceImpl <em>Calculate Product Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalculateProductPriceImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalculateProductPrice()
	 * @generated
	 */
	int CALCULATE_PRODUCT_PRICE = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalculateProductPriceResponseImpl <em>Calculate Product Price Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalculateProductPriceResponseImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalculateProductPriceResponse()
	 * @generated
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl <em>Calc Tax For Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTaxForDisplay()
	 * @generated
	 */
	int CALC_TAX_FOR_DISPLAY = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__BASE_PRICE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bill To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__PRODUCT_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__QUANTITY = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Calc Tax For Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl <em>Calc Tax For Display Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTaxForDisplayResponse()
	 * @generated
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Price With Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tax Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Calc Tax For Display Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FOR_DISPLAY_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__PRODUCT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__CURRENCY_UOM_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calculate Product Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Valid Price Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Item Price Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__ORDER_ITEM_PRICE_INFOS = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Calculate Product Price Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.GetProductDefaultImpl <em>Get Product Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.GetProductDefaultImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getGetProductDefault()
	 * @generated
	 */
	int GET_PRODUCT_DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The number of structural features of the '<em>Get Product Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.GetProductDefaultResponseImpl <em>Get Product Default Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.GetProductDefaultResponseImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getGetProductDefaultResponse()
	 * @generated
	 */
	int GET_PRODUCT_DEFAULT_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Facility Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT_RESPONSE__FACILITY_POSTAL_ADDRESS = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Product Default Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PRODUCT_DEFAULT_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl <em>Calc Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTax()
	 * @generated
	 */
	int CALC_TAX = 6;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__USER_PROFILE = ServicePackage.SERVICE_REQUEST__USER_PROFILE;

	/**
	 * The feature id for the '<em><b>Bill To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__BILL_TO_PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__FACILITY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Amount List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ITEM_AMOUNT_LIST = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Price List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ITEM_PRICE_LIST = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Product List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ITEM_PRODUCT_LIST = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Item Quantity List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ITEM_QUANTITY_LIST = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Item Shipping List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ITEM_SHIPPING_LIST = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Shipping Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ORDER_SHIPPING_AMOUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pay To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__PAY_TO_PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__PRODUCT_STORE_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Shipping Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__SHIPPING_ADDRESS = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Order Promotions Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX__ORDER_PROMOTIONS_AMOUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Calc Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxResponseImpl <em>Calc Tax Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxResponseImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTaxResponse()
	 * @generated
	 */
	int CALC_TAX_RESPONSE = 7;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_RESPONSE__ERROR_MESSAGE = ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_RESPONSE__RESPONSE_MESSAGE = ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_RESPONSE__SUCCESS_MESSAGE = ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Order Adjustments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_RESPONSE__ORDER_ADJUSTMENTS = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Adjustments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_RESPONSE__ITEM_ADJUSTMENTS = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calc Tax Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAX_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.CalculateProductPrice <em>Calculate Product Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculate Product Price</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPrice
	 * @generated
	 */
	EClass getCalculateProductPrice();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.biz.service.product.CalculateProductPrice#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPrice#getProduct()
	 * @see #getCalculateProductPrice()
	 * @generated
	 */
	EReference getCalculateProductPrice_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalculateProductPrice#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPrice#getCurrencyUomId()
	 * @see #getCalculateProductPrice()
	 * @generated
	 */
	EAttribute getCalculateProductPrice_CurrencyUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.CalculateProductPriceResponse <em>Calculate Product Price Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculate Product Price Response</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPriceResponse
	 * @generated
	 */
	EClass getCalculateProductPriceResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#isValidPriceFound <em>Valid Price Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Price Found</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#isValidPriceFound()
	 * @see #getCalculateProductPriceResponse()
	 * @generated
	 */
	EAttribute getCalculateProductPriceResponse_ValidPriceFound();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#getBasePrice <em>Base Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Price</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#getBasePrice()
	 * @see #getCalculateProductPriceResponse()
	 * @generated
	 */
	EAttribute getCalculateProductPriceResponse_BasePrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#getListPrice <em>List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Price</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#getListPrice()
	 * @see #getCalculateProductPriceResponse()
	 * @generated
	 */
	EAttribute getCalculateProductPriceResponse_ListPrice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#getOrderItemPriceInfos <em>Order Item Price Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Item Price Infos</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalculateProductPriceResponse#getOrderItemPriceInfos()
	 * @see #getCalculateProductPriceResponse()
	 * @generated
	 */
	EReference getCalculateProductPriceResponse_OrderItemPriceInfos();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.GetProductDefault <em>Get Product Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Product Default</em>'.
	 * @see org.abchip.mimo.biz.service.product.GetProductDefault
	 * @generated
	 */
	EClass getGetProductDefault();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.GetProductDefaultResponse <em>Get Product Default Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Product Default Response</em>'.
	 * @see org.abchip.mimo.biz.service.product.GetProductDefaultResponse
	 * @generated
	 */
	EClass getGetProductDefaultResponse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.service.product.GetProductDefaultResponse#getFacilityPostalAddress <em>Facility Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Postal Address</em>'.
	 * @see org.abchip.mimo.biz.service.product.GetProductDefaultResponse#getFacilityPostalAddress()
	 * @see #getGetProductDefaultResponse()
	 * @generated
	 */
	EReference getGetProductDefaultResponse_FacilityPostalAddress();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.CalcTax <em>Calc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Tax</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax
	 * @generated
	 */
	EClass getCalcTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTax#getBillToPartyId <em>Bill To Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill To Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getBillToPartyId()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_BillToPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTax#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getFacilityId()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_FacilityId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.service.product.CalcTax#getItemAmountList <em>Item Amount List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Amount List</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getItemAmountList()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_ItemAmountList();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.service.product.CalcTax#getItemPriceList <em>Item Price List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Price List</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getItemPriceList()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_ItemPriceList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.biz.service.product.CalcTax#getItemProductList <em>Item Product List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Product List</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getItemProductList()
	 * @see #getCalcTax()
	 * @generated
	 */
	EReference getCalcTax_ItemProductList();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.service.product.CalcTax#getItemQuantityList <em>Item Quantity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Quantity List</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getItemQuantityList()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_ItemQuantityList();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.service.product.CalcTax#getItemShippingList <em>Item Shipping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Shipping List</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getItemShippingList()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_ItemShippingList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTax#getOrderShippingAmount <em>Order Shipping Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Shipping Amount</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getOrderShippingAmount()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_OrderShippingAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTax#getPayToPartyId <em>Pay To Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay To Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getPayToPartyId()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_PayToPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTax#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getProductStoreId()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_ProductStoreId();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.biz.service.product.CalcTax#getShippingAddress <em>Shipping Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shipping Address</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getShippingAddress()
	 * @see #getCalcTax()
	 * @generated
	 */
	EReference getCalcTax_ShippingAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTax#getOrderPromotionsAmount <em>Order Promotions Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Promotions Amount</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTax#getOrderPromotionsAmount()
	 * @see #getCalcTax()
	 * @generated
	 */
	EAttribute getCalcTax_OrderPromotionsAmount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.CalcTaxResponse <em>Calc Tax Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Tax Response</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxResponse
	 * @generated
	 */
	EClass getCalcTaxResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.biz.service.product.CalcTaxResponse#getOrderAdjustments <em>Order Adjustments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Adjustments</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxResponse#getOrderAdjustments()
	 * @see #getCalcTaxResponse()
	 * @generated
	 */
	EReference getCalcTaxResponse_OrderAdjustments();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.service.product.CalcTaxResponse#getItemAdjustments <em>Item Adjustments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Adjustments</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxResponse#getItemAdjustments()
	 * @see #getCalcTaxResponse()
	 * @generated
	 */
	EReference getCalcTaxResponse_ItemAdjustments();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay <em>Calc Tax For Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Tax For Display</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay
	 * @generated
	 */
	EClass getCalcTaxForDisplay();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBasePrice <em>Base Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Price</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBasePrice()
	 * @see #getCalcTaxForDisplay()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplay_BasePrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBillToPartyId <em>Bill To Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill To Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBillToPartyId()
	 * @see #getCalcTaxForDisplay()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplay_BillToPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductId()
	 * @see #getCalcTaxForDisplay()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplay_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductStoreId()
	 * @see #getCalcTaxForDisplay()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplay_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getQuantity()
	 * @see #getCalcTaxForDisplay()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplay_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getShippingPrice <em>Shipping Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Price</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getShippingPrice()
	 * @see #getCalcTaxForDisplay()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplay_ShippingPrice();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse <em>Calc Tax For Display Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Tax For Display Response</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse
	 * @generated
	 */
	EClass getCalcTaxForDisplayResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getPriceWithTax <em>Price With Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price With Tax</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getPriceWithTax()
	 * @see #getCalcTaxForDisplayResponse()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplayResponse_PriceWithTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxPercentage()
	 * @see #getCalcTaxForDisplayResponse()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplayResponse_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxTotal <em>Tax Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Total</em>'.
	 * @see org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxTotal()
	 * @see #getCalcTaxForDisplayResponse()
	 * @generated
	 */
	EAttribute getCalcTaxForDisplayResponse_TaxTotal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.CalculateProductPriceImpl <em>Calculate Product Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.CalculateProductPriceImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalculateProductPrice()
		 * @generated
		 */
		EClass CALCULATE_PRODUCT_PRICE = eINSTANCE.getCalculateProductPrice();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATE_PRODUCT_PRICE__PRODUCT = eINSTANCE.getCalculateProductPrice_Product();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATE_PRODUCT_PRICE__CURRENCY_UOM_ID = eINSTANCE.getCalculateProductPrice_CurrencyUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.CalculateProductPriceResponseImpl <em>Calculate Product Price Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.CalculateProductPriceResponseImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalculateProductPriceResponse()
		 * @generated
		 */
		EClass CALCULATE_PRODUCT_PRICE_RESPONSE = eINSTANCE.getCalculateProductPriceResponse();

		/**
		 * The meta object literal for the '<em><b>Valid Price Found</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND = eINSTANCE.getCalculateProductPriceResponse_ValidPriceFound();

		/**
		 * The meta object literal for the '<em><b>Base Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE = eINSTANCE.getCalculateProductPriceResponse_BasePrice();

		/**
		 * The meta object literal for the '<em><b>List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE = eINSTANCE.getCalculateProductPriceResponse_ListPrice();

		/**
		 * The meta object literal for the '<em><b>Order Item Price Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATE_PRODUCT_PRICE_RESPONSE__ORDER_ITEM_PRICE_INFOS = eINSTANCE.getCalculateProductPriceResponse_OrderItemPriceInfos();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.GetProductDefaultImpl <em>Get Product Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.GetProductDefaultImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getGetProductDefault()
		 * @generated
		 */
		EClass GET_PRODUCT_DEFAULT = eINSTANCE.getGetProductDefault();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.GetProductDefaultResponseImpl <em>Get Product Default Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.GetProductDefaultResponseImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getGetProductDefaultResponse()
		 * @generated
		 */
		EClass GET_PRODUCT_DEFAULT_RESPONSE = eINSTANCE.getGetProductDefaultResponse();

		/**
		 * The meta object literal for the '<em><b>Facility Postal Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_PRODUCT_DEFAULT_RESPONSE__FACILITY_POSTAL_ADDRESS = eINSTANCE.getGetProductDefaultResponse_FacilityPostalAddress();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl <em>Calc Tax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTax()
		 * @generated
		 */
		EClass CALC_TAX = eINSTANCE.getCalcTax();

		/**
		 * The meta object literal for the '<em><b>Bill To Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__BILL_TO_PARTY_ID = eINSTANCE.getCalcTax_BillToPartyId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__FACILITY_ID = eINSTANCE.getCalcTax_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Item Amount List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__ITEM_AMOUNT_LIST = eINSTANCE.getCalcTax_ItemAmountList();

		/**
		 * The meta object literal for the '<em><b>Item Price List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__ITEM_PRICE_LIST = eINSTANCE.getCalcTax_ItemPriceList();

		/**
		 * The meta object literal for the '<em><b>Item Product List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TAX__ITEM_PRODUCT_LIST = eINSTANCE.getCalcTax_ItemProductList();

		/**
		 * The meta object literal for the '<em><b>Item Quantity List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__ITEM_QUANTITY_LIST = eINSTANCE.getCalcTax_ItemQuantityList();

		/**
		 * The meta object literal for the '<em><b>Item Shipping List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__ITEM_SHIPPING_LIST = eINSTANCE.getCalcTax_ItemShippingList();

		/**
		 * The meta object literal for the '<em><b>Order Shipping Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__ORDER_SHIPPING_AMOUNT = eINSTANCE.getCalcTax_OrderShippingAmount();

		/**
		 * The meta object literal for the '<em><b>Pay To Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__PAY_TO_PARTY_ID = eINSTANCE.getCalcTax_PayToPartyId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__PRODUCT_STORE_ID = eINSTANCE.getCalcTax_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Shipping Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TAX__SHIPPING_ADDRESS = eINSTANCE.getCalcTax_ShippingAddress();

		/**
		 * The meta object literal for the '<em><b>Order Promotions Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX__ORDER_PROMOTIONS_AMOUNT = eINSTANCE.getCalcTax_OrderPromotionsAmount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxResponseImpl <em>Calc Tax Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxResponseImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTaxResponse()
		 * @generated
		 */
		EClass CALC_TAX_RESPONSE = eINSTANCE.getCalcTaxResponse();

		/**
		 * The meta object literal for the '<em><b>Order Adjustments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TAX_RESPONSE__ORDER_ADJUSTMENTS = eINSTANCE.getCalcTaxResponse_OrderAdjustments();

		/**
		 * The meta object literal for the '<em><b>Item Adjustments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TAX_RESPONSE__ITEM_ADJUSTMENTS = eINSTANCE.getCalcTaxResponse_ItemAdjustments();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl <em>Calc Tax For Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTaxForDisplay()
		 * @generated
		 */
		EClass CALC_TAX_FOR_DISPLAY = eINSTANCE.getCalcTaxForDisplay();

		/**
		 * The meta object literal for the '<em><b>Base Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY__BASE_PRICE = eINSTANCE.getCalcTaxForDisplay_BasePrice();

		/**
		 * The meta object literal for the '<em><b>Bill To Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID = eINSTANCE.getCalcTaxForDisplay_BillToPartyId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY__PRODUCT_ID = eINSTANCE.getCalcTaxForDisplay_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID = eINSTANCE.getCalcTaxForDisplay_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY__QUANTITY = eINSTANCE.getCalcTaxForDisplay_Quantity();

		/**
		 * The meta object literal for the '<em><b>Shipping Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE = eINSTANCE.getCalcTaxForDisplay_ShippingPrice();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl <em>Calc Tax For Display Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl
		 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalcTaxForDisplayResponse()
		 * @generated
		 */
		EClass CALC_TAX_FOR_DISPLAY_RESPONSE = eINSTANCE.getCalcTaxForDisplayResponse();

		/**
		 * The meta object literal for the '<em><b>Price With Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX = eINSTANCE.getCalcTaxForDisplayResponse_PriceWithTax();

		/**
		 * The meta object literal for the '<em><b>Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE = eINSTANCE.getCalcTaxForDisplayResponse_TaxPercentage();

		/**
		 * The meta object literal for the '<em><b>Tax Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL = eINSTANCE.getCalcTaxForDisplayResponse_TaxTotal();

	}

} //ProductPackage
