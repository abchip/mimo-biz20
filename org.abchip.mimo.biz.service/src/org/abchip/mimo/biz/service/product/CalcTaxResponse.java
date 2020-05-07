/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.util.List;

import org.abchip.mimo.biz.model.order.order.OrderAdjustment;

import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Tax Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxResponse#getOrderAdjustments <em>Order Adjustments</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxResponse()
 * @model
 * @generated
 */
public interface CalcTaxResponse extends ServiceResponse {
	/**
	 * Returns the value of the '<em><b>Order Adjustments</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderAdjustment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustments</em>' containment reference list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxResponse_OrderAdjustments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<OrderAdjustment> getOrderAdjustments();

} // CalcTaxResponse
