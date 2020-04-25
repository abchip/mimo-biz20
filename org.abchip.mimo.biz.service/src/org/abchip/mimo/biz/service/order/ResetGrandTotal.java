/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order;

import org.abchip.mimo.biz.service.BizServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Grand Total</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.ResetGrandTotal#getOrderId <em>Order Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.order.OrderPackage#getResetGrandTotal()
 * @model
 * @generated
 */
public interface ResetGrandTotal extends BizServiceRequest<ResetGrandTotalResponse> {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getResetGrandTotal_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ResetGrandTotal#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

} // ResetGrandTotal
