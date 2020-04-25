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
 * A representation of the model object '<em><b>Change Order Status Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOldStatusId <em>Old Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderStatusId <em>Order Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderTypeId <em>Order Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatusResponse()
 * @model
 * @generated
 */
public interface ChangeOrderStatusResponse extends BizServiceResponse {
	/**
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grand Total</em>' attribute.
	 * @see #setGrandTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatusResponse_GrandTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getGrandTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grand Total</em>' attribute.
	 * @see #getGrandTotal()
	 * @generated
	 */
	void setGrandTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Needs Inventory Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inventory Issuance</em>' attribute.
	 * @see #setNeedsInventoryIssuance(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatusResponse_NeedsInventoryIssuance()
	 * @model
	 * @generated
	 */
	String getNeedsInventoryIssuance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inventory Issuance</em>' attribute.
	 * @see #getNeedsInventoryIssuance()
	 * @generated
	 */
	void setNeedsInventoryIssuance(String value);

	/**
	 * Returns the value of the '<em><b>Old Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Status Id</em>' attribute.
	 * @see #setOldStatusId(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatusResponse_OldStatusId()
	 * @model required="true"
	 * @generated
	 */
	String getOldStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOldStatusId <em>Old Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Status Id</em>' attribute.
	 * @see #getOldStatusId()
	 * @generated
	 */
	void setOldStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Order Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Status Id</em>' attribute.
	 * @see #setOrderStatusId(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatusResponse_OrderStatusId()
	 * @model
	 * @generated
	 */
	String getOrderStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderStatusId <em>Order Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Status Id</em>' attribute.
	 * @see #getOrderStatusId()
	 * @generated
	 */
	void setOrderStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Order Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type Id</em>' attribute.
	 * @see #setOrderTypeId(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatusResponse_OrderTypeId()
	 * @model
	 * @generated
	 */
	String getOrderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse#getOrderTypeId <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type Id</em>' attribute.
	 * @see #getOrderTypeId()
	 * @generated
	 */
	void setOrderTypeId(String value);

} // ChangeOrderStatusResponse
