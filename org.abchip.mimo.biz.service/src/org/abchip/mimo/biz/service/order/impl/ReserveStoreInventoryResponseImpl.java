/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.service.impl.BizServiceResponseImpl;
import org.abchip.mimo.biz.service.order.OrderPackage;
import org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve Store Inventory Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryResponseImpl#getQuantityNotReserved <em>Quantity Not Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveStoreInventoryResponseImpl extends BizServiceResponseImpl implements ReserveStoreInventoryResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveStoreInventoryResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.RESERVE_STORE_INVENTORY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityNotReserved() {
		return (BigDecimal)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityNotReserved(BigDecimal newQuantityNotReserved) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED, newQuantityNotReserved);
	}

} //ReserveStoreInventoryResponseImpl
