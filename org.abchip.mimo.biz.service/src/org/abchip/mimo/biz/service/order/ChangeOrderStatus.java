/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Order Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getChangeReason <em>Change Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#isSetItemStatus <em>Set Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatus()
 * @model
 * @generated
 */
public interface ChangeOrderStatus extends ServiceRequest<ChangeOrderStatusResponse> {
	/**
	 * Returns the value of the '<em><b>Change Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Reason</em>' attribute.
	 * @see #setChangeReason(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatus_ChangeReason()
	 * @model
	 * @generated
	 */
	String getChangeReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getChangeReason <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Reason</em>' attribute.
	 * @see #getChangeReason()
	 * @generated
	 */
	void setChangeReason(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatus_OrderId()
	 * @model required="true"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Set Item Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Item Status</em>' attribute.
	 * @see #setSetItemStatus(boolean)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatus_SetItemStatus()
	 * @model
	 * @generated
	 */
	boolean isSetItemStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#isSetItemStatus <em>Set Item Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Item Status</em>' attribute.
	 * @see #isSetItemStatus()
	 * @generated
	 */
	void setSetItemStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#getChangeOrderStatus_StatusId()
	 * @model required="true"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.order.ChangeOrderStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // ChangeOrderStatus
