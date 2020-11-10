/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getParentGroupSeqId <em>Parent Group Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemGroup()
 * @model
 * @generated
 */
public interface OrderItemGroup extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemGroup_Order()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemGroup_GroupName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Group Seq Id</em>' attribute.
	 * @see #setOrderItemGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemGroup_OrderItemGroupSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Group Seq Id</em>' attribute.
	 * @see #getOrderItemGroupSeqId()
	 * @generated
	 */
	void setOrderItemGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group Seq Id</em>' attribute.
	 * @see #setParentGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemGroup_ParentGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getParentGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemGroup#getParentGroupSeqId <em>Parent Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group Seq Id</em>' attribute.
	 * @see #getParentGroupSeqId()
	 * @generated
	 */
	void setParentGroupSeqId(String value);

} // OrderItemGroup
