/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import org.abchip.mimo.biz.service.BizServicePackage;
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
	int CALCULATE_PRODUCT_PRICE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__CONTEXT = BizServicePackage.BIZ_SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__LOCALE = BizServicePackage.BIZ_SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__TENANT = BizServicePackage.BIZ_SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__USER_LOGIN = BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__PRODUCT = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE__CURRENCY_UOM_ID = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calculate Product Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_FEATURE_COUNT = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.product.impl.CalculateProductPriceResponseImpl <em>Calculate Product Price Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.product.impl.CalculateProductPriceResponseImpl
	 * @see org.abchip.mimo.biz.service.product.impl.ProductPackageImpl#getCalculateProductPriceResponse()
	 * @generated
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__CONTEXT = BizServicePackage.BIZ_SERVICE_RESPONSE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__LOCALE = BizServicePackage.BIZ_SERVICE_RESPONSE__LOCALE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__ERROR = BizServicePackage.BIZ_SERVICE_RESPONSE__ERROR;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__ERROR_MESSAGE = BizServicePackage.BIZ_SERVICE_RESPONSE__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__RESPONSE_MESSAGE = BizServicePackage.BIZ_SERVICE_RESPONSE__RESPONSE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__SUCCESS_MESSAGE = BizServicePackage.BIZ_SERVICE_RESPONSE__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__USER_LOGIN = BizServicePackage.BIZ_SERVICE_RESPONSE__USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Valid Price Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Item Price Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE__ORDER_ITEM_PRICE_INFOS = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Calculate Product Price Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE_FEATURE_COUNT = BizServicePackage.BIZ_SERVICE_RESPONSE_FEATURE_COUNT + 4;


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

	}

} //ProductPackage
