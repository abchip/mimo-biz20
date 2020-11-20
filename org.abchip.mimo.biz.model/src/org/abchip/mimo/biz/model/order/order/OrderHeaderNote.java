/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import org.abchip.mimo.biz.BizEntityNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Header Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getInternalNote <em>Internal Note</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeaderNote()
 * @model
 * @generated
 */
public interface OrderHeaderNote extends BizEntityNote {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeaderNote_Order()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Internal Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Note</em>' attribute.
	 * @see #setInternalNote(Boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeaderNote_InternalNote()
	 * @model
	 * @generated
	 */
	Boolean getInternalNote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote#getInternalNote <em>Internal Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Note</em>' attribute.
	 * @see #getInternalNote()
	 * @generated
	 */
	void setInternalNote(Boolean value);

} // OrderHeaderNote
