/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.order.OrderPackage
 * @generated
 */
public interface OrderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrderFactory eINSTANCE = org.abchip.mimo.biz.service.order.impl.OrderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Change Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Order Status</em>'.
	 * @generated
	 */
	ChangeOrderStatus createChangeOrderStatus();

	/**
	 * Returns a new object of class '<em>Change Order Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Order Status Response</em>'.
	 * @generated
	 */
	ChangeOrderStatusResponse createChangeOrderStatusResponse();

	/**
	 * Returns a new object of class '<em>Reserve Store Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserve Store Inventory</em>'.
	 * @generated
	 */
	ReserveStoreInventory createReserveStoreInventory();

	/**
	 * Returns a new object of class '<em>Reserve Store Inventory Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserve Store Inventory Response</em>'.
	 * @generated
	 */
	ReserveStoreInventoryResponse createReserveStoreInventoryResponse();

	/**
	 * Returns a new object of class '<em>Reset Grand Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Grand Total</em>'.
	 * @generated
	 */
	ResetGrandTotal createResetGrandTotal();

	/**
	 * Returns a new object of class '<em>Reset Grand Total Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Grand Total Response</em>'.
	 * @generated
	 */
	ResetGrandTotalResponse createResetGrandTotalResponse();

	/**
	 * Returns a new object of class '<em>Recalc Tax Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recalc Tax Total</em>'.
	 * @generated
	 */
	RecalcTaxTotal createRecalcTaxTotal();

	/**
	 * Returns a new object of class '<em>Recalc Tax Total Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recalc Tax Total Response</em>'.
	 * @generated
	 */
	RecalcTaxTotalResponse createRecalcTaxTotalResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrderPackage getOrderPackage();

} //OrderFactory
