/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;

import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculate Purchase Price Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse#isValidPriceFound <em>Valid Price Found</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse#getOrderItemPriceInfos <em>Order Item Price Infos</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePriceResponse()
 * @model
 * @generated
 */
public interface CalculatePurchasePriceResponse extends ServiceResponse {
	/**
	 * Returns the value of the '<em><b>Valid Price Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Price Found</em>' attribute.
	 * @see #setValidPriceFound(boolean)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePriceResponse_ValidPriceFound()
	 * @model required="true"
	 * @generated
	 */
	boolean isValidPriceFound();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse#isValidPriceFound <em>Valid Price Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Price Found</em>' attribute.
	 * @see #isValidPriceFound()
	 * @generated
	 */
	void setValidPriceFound(boolean value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePriceResponse_Price()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Item Price Infos</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Price Infos</em>' containment reference list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePriceResponse_OrderItemPriceInfos()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<OrderItemPriceInfo> getOrderItemPriceInfos();

} // CalculatePurchasePriceResponse
