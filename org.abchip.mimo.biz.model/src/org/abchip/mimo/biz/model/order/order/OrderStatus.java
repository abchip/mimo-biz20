/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderStatusId <em>Order Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getChangeReason <em>Change Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderPaymentPreference <em>Order Payment Preference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusUserLogin <em>Status User Login</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus()
 * @model
 * @generated
 */
public interface OrderStatus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Change Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Reason</em>' attribute.
	 * @see #setChangeReason(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_ChangeReason()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getChangeReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getChangeReason <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Reason</em>' attribute.
	 * @see #getChangeReason()
	 * @generated
	 */
	void setChangeReason(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_Order()
	 * @model
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference</em>' reference.
	 * @see #setOrderPaymentPreference(OrderPaymentPreference)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_OrderPaymentPreference()
	 * @model
	 * @generated
	 */
	OrderPaymentPreference getOrderPaymentPreference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderPaymentPreference <em>Order Payment Preference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference</em>' reference.
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	void setOrderPaymentPreference(OrderPaymentPreference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Order Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Status Id</em>' attribute.
	 * @see #setOrderStatusId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_OrderStatusId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getOrderStatusId <em>Order Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Status Id</em>' attribute.
	 * @see #getOrderStatusId()
	 * @generated
	 */
	void setOrderStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Datetime</em>' attribute.
	 * @see #setStatusDatetime(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_StatusDatetime()
	 * @model
	 * @generated
	 */
	Date getStatusDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusDatetime <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Datetime</em>' attribute.
	 * @see #getStatusDatetime()
	 * @generated
	 */
	void setStatusDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Status User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status User Login</em>' reference.
	 * @see #setStatusUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderStatus_StatusUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getStatusUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderStatus#getStatusUserLogin <em>Status User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status User Login</em>' reference.
	 * @see #getStatusUserLogin()
	 * @generated
	 */
	void setStatusUserLogin(UserLogin value);

} // OrderStatus
