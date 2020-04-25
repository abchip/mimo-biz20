/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order;

import java.math.BigDecimal;
import org.abchip.mimo.biz.service.BizServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve Store Inventory Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse#getQuantityNotReserved <em>Quantity Not Reserved</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.order.OrderPackage#getReserveStoreInventoryResponse()
 * @model
 * @generated
 */
public interface ReserveStoreInventoryResponse extends BizServiceResponse {

	/**
	 * Returns the value of the '<em><b>Quantity Not Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Not Reserved</em>' attribute.
	 * @see #setQuantityNotReserved(BigDecimal)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getReserveStoreInventoryResponse_QuantityNotReserved()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getQuantityNotReserved();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse#getQuantityNotReserved <em>Quantity Not Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Not Reserved</em>' attribute.
	 * @see #getQuantityNotReserved()
	 * @generated
	 */
	void setQuantityNotReserved(BigDecimal value);
} // ReserveStoreInventoryResponse
