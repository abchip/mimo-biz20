/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.product.ProductPackage
 * @generated
 */
public interface ProductFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductFactory eINSTANCE = org.abchip.mimo.biz.service.product.impl.ProductFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calculate Product Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculate Product Price</em>'.
	 * @generated
	 */
	CalculateProductPrice createCalculateProductPrice();

	/**
	 * Returns a new object of class '<em>Calculate Product Price Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculate Product Price Response</em>'.
	 * @generated
	 */
	CalculateProductPriceResponse createCalculateProductPriceResponse();

	/**
	 * Returns a new object of class '<em>Calculate Purchase Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculate Purchase Price</em>'.
	 * @generated
	 */
	CalculatePurchasePrice createCalculatePurchasePrice();

	/**
	 * Returns a new object of class '<em>Calculate Purchase Price Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculate Purchase Price Response</em>'.
	 * @generated
	 */
	CalculatePurchasePriceResponse createCalculatePurchasePriceResponse();

	/**
	 * Returns a new object of class '<em>Get Product Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Product Default</em>'.
	 * @generated
	 */
	GetProductDefault createGetProductDefault();

	/**
	 * Returns a new object of class '<em>Get Product Default Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Product Default Response</em>'.
	 * @generated
	 */
	GetProductDefaultResponse createGetProductDefaultResponse();

	/**
	 * Returns a new object of class '<em>Calc Tax For Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Tax For Display</em>'.
	 * @generated
	 */
	CalcTaxForDisplay createCalcTaxForDisplay();

	/**
	 * Returns a new object of class '<em>Calc Tax For Display Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Tax For Display Response</em>'.
	 * @generated
	 */
	CalcTaxForDisplayResponse createCalcTaxForDisplayResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductPackage getProductPackage();

} //ProductFactory
