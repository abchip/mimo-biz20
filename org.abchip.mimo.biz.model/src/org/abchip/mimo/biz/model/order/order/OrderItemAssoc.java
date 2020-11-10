/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.math.BigDecimal;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemAssocType <em>Order Item Assoc Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrder <em>To Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrderItemSeqId <em>To Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToShipGroupSeqId <em>To Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc()
 * @model
 * @generated
 */
public interface OrderItemAssoc extends EntityTyped<OrderItemAssocType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Order Item Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Assoc Type</em>' reference.
	 * @see #setOrderItemAssocType(OrderItemAssocType)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_OrderItemAssocType()
	 * @model keys="orderItemAssocTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderItemAssocType getOrderItemAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemAssocType <em>Order Item Assoc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Assoc Type</em>' reference.
	 * @see #getOrderItemAssocType()
	 * @generated
	 */
	void setOrderItemAssocType(OrderItemAssocType value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_Order()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>To Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Order</em>' reference.
	 * @see #setToOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_ToOrder()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getToOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrder <em>To Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Order</em>' reference.
	 * @see #getToOrder()
	 * @generated
	 */
	void setToOrder(OrderHeader value);

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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_OrderItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #setShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_ShipGroupSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>To Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Order Item Seq Id</em>' attribute.
	 * @see #setToOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_ToOrderItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getToOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToOrderItemSeqId <em>To Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Order Item Seq Id</em>' attribute.
	 * @see #getToOrderItemSeqId()
	 * @generated
	 */
	void setToOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>To Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Ship Group Seq Id</em>' attribute.
	 * @see #setToShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemAssoc_ToShipGroupSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getToShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemAssoc#getToShipGroupSeqId <em>To Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Ship Group Seq Id</em>' attribute.
	 * @see #getToShipGroupSeqId()
	 * @generated
	 */
	void setToShipGroupSeqId(String value);

} // OrderItemAssoc
