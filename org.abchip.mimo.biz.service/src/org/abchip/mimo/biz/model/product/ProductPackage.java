/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product;

import org.abchip.mimo.service.ServicePackage;

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
 * @see org.abchip.mimo.biz.model.product.ProductFactory
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
	ProductPackage eINSTANCE = org.abchip.mimo.biz.model.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceImpl <em>Calculate Product Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.impl.CalculateProductPriceImpl
	 * @see org.abchip.mimo.biz.model.product.impl.ProductPackageImpl#getCalculateProductPrice()
	 * @generated
	 */
	int CALCULATE_PRODUCT_PRICE = 0;

	/**
	 * The number of structural features of the '<em>Calculate Product Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl <em>Calculate Product Price Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl
	 * @see org.abchip.mimo.biz.model.product.impl.ProductPackageImpl#getCalculateProductPriceResponse()
	 * @generated
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Calculate Product Price Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_PRODUCT_PRICE_RESPONSE_FEATURE_COUNT = ServicePackage.SERVICE_RESPONSE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.CalculateProductPrice <em>Calculate Product Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculate Product Price</em>'.
	 * @see org.abchip.mimo.biz.model.product.CalculateProductPrice
	 * @generated
	 */
	EClass getCalculateProductPrice();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse <em>Calculate Product Price Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculate Product Price Response</em>'.
	 * @see org.abchip.mimo.biz.model.product.CalculateProductPriceResponse
	 * @generated
	 */
	EClass getCalculateProductPriceResponse();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceImpl <em>Calculate Product Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.impl.CalculateProductPriceImpl
		 * @see org.abchip.mimo.biz.model.product.impl.ProductPackageImpl#getCalculateProductPrice()
		 * @generated
		 */
		EClass CALCULATE_PRODUCT_PRICE = eINSTANCE.getCalculateProductPrice();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl <em>Calculate Product Price Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl
		 * @see org.abchip.mimo.biz.model.product.impl.ProductPackageImpl#getCalculateProductPriceResponse()
		 * @generated
		 */
		EClass CALCULATE_PRODUCT_PRICE_RESPONSE = eINSTANCE.getCalculateProductPriceResponse();

	}

} //ProductPackage
