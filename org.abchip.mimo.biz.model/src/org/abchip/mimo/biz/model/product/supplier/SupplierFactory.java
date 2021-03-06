/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.supplier;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage
 * @generated
 */
public interface SupplierFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupplierFactory eINSTANCE = org.abchip.mimo.biz.model.product.supplier.impl.SupplierFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Market Interest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Market Interest</em>'.
	 * @generated
	 */
	MarketInterest createMarketInterest();

	/**
	 * Returns a new object of class '<em>Reorder Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reorder Guideline</em>'.
	 * @generated
	 */
	ReorderGuideline createReorderGuideline();

	/**
	 * Returns a new object of class '<em>Pref Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pref Order</em>'.
	 * @generated
	 */
	SupplierPrefOrder createSupplierPrefOrder();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	SupplierProduct createSupplierProduct();

	/**
	 * Returns a new object of class '<em>Product Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature</em>'.
	 * @generated
	 */
	SupplierProductFeature createSupplierProductFeature();

	/**
	 * Returns a new object of class '<em>Rating Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating Type</em>'.
	 * @generated
	 */
	SupplierRatingType createSupplierRatingType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SupplierPackage getSupplierPackage();

} //SupplierFactory
