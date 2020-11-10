/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReceivedQuantity <em>Received Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemResponse <em>Return Item Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemType <em>Return Item Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnPrice <em>Return Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnQuantity <em>Return Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnReason <em>Return Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ReturnItem extends EntityTyped<ReturnItemType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_Return()
	 * @model keys="returnId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeader getReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expected Item Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Item Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Item Status</em>' reference.
	 * @see #setExpectedItemStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ExpectedItemStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getExpectedItemStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Item Status</em>' reference.
	 * @see #getExpectedItemStatus()
	 * @generated
	 */
	void setExpectedItemStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_Order()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrder <em>Order</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_Product()
	 * @model keys="productId"
	 *        annotation="mimo-ent-slot help='we need this field to be able to figure out net sales of a product'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Received Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Quantity</em>' attribute.
	 * @see #setReceivedQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReceivedQuantity()
	 * @model annotation="mimo-ent-slot audit='true' help='actually received from the customer'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReceivedQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReceivedQuantity <em>Received Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Quantity</em>' attribute.
	 * @see #getReceivedQuantity()
	 * @generated
	 */
	void setReceivedQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Return Item Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Response</em>' reference.
	 * @see #setReturnItemResponse(ReturnItemResponse)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnItemResponse()
	 * @model keys="returnItemResponseId"
	 * @generated
	 */
	ReturnItemResponse getReturnItemResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemResponse <em>Return Item Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Response</em>' reference.
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	void setReturnItemResponse(ReturnItemResponse value);

	/**
	 * Returns the value of the '<em><b>Return Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Type</em>' reference.
	 * @see #setReturnItemType(ReturnItemType)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnItemType()
	 * @model keys="returnItemTypeId"
	 *        annotation="mimo-ent-slot help='what is returned: a product, a service, etc'"
	 * @generated
	 */
	ReturnItemType getReturnItemType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemType <em>Return Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Type</em>' reference.
	 * @see #getReturnItemType()
	 * @generated
	 */
	void setReturnItemType(ReturnItemType value);

	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Return Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Price</em>' attribute.
	 * @see #setReturnPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnPrice()
	 * @model annotation="mimo-ent-slot audit='true'"
	 *        annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReturnPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnPrice <em>Return Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Price</em>' attribute.
	 * @see #getReturnPrice()
	 * @generated
	 */
	void setReturnPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Quantity</em>' attribute.
	 * @see #setReturnQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnQuantity()
	 * @model annotation="mimo-ent-slot audit='true' help='promised by the customer'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReturnQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnQuantity <em>Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Quantity</em>' attribute.
	 * @see #getReturnQuantity()
	 * @generated
	 */
	void setReturnQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Return Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Reason</em>' reference.
	 * @see #setReturnReason(ReturnReason)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnReason()
	 * @model keys="returnReasonId"
	 *        annotation="mimo-ent-slot audit='true' help='why item is returned: did not like, wrong item, damaged, etc. etc.'"
	 * @generated
	 */
	ReturnReason getReturnReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnReason <em>Return Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Reason</em>' reference.
	 * @see #getReturnReason()
	 * @generated
	 */
	void setReturnReason(ReturnReason value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(ReturnType)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_ReturnType()
	 * @model keys="returnTypeId"
	 *        annotation="mimo-ent-slot audit='true' help='actually used for disbursement type: store credit, cash refund, exchange'"
	 * @generated
	 */
	ReturnType getReturnType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItem_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

} // ReturnItem
