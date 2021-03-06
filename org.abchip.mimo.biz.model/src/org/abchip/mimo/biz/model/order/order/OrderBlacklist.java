/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Blacklist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist#getOrderBlacklistType <em>Order Blacklist Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist#getBlacklistString <em>Blacklist String</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderBlacklist()
 * @model
 * @generated
 */
public interface OrderBlacklist extends EntityTyped<OrderBlacklistType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Order Blacklist Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Blacklist Type</em>' reference.
	 * @see #setOrderBlacklistType(OrderBlacklistType)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderBlacklist_OrderBlacklistType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderBlacklistType getOrderBlacklistType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist#getOrderBlacklistType <em>Order Blacklist Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Blacklist Type</em>' reference.
	 * @see #getOrderBlacklistType()
	 * @generated
	 */
	void setOrderBlacklistType(OrderBlacklistType value);

	/**
	 * Returns the value of the '<em><b>Blacklist String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blacklist String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blacklist String</em>' attribute.
	 * @see #setBlacklistString(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderBlacklist_BlacklistString()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getBlacklistString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderBlacklist#getBlacklistString <em>Blacklist String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blacklist String</em>' attribute.
	 * @see #getBlacklistString()
	 * @generated
	 */
	void setBlacklistString(String value);

} // OrderBlacklist
