/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.product.price.ProductPriceRule;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Price Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getModifyAmount <em>Modify Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceRule <em>Product Price Rule</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getRateCode <em>Rate Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface OrderItemPriceInfo extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Modify Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Amount</em>' attribute.
	 * @see #setModifyAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_ModifyAmount()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getModifyAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getModifyAmount <em>Modify Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Amount</em>' attribute.
	 * @see #getModifyAmount()
	 * @generated
	 */
	void setModifyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_Order()
	 * @model
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Price Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Price Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Price Info Id</em>' attribute.
	 * @see #setOrderItemPriceInfoId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_OrderItemPriceInfoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemPriceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Price Info Id</em>' attribute.
	 * @see #getOrderItemPriceInfoId()
	 * @generated
	 */
	void setOrderItemPriceInfoId(String value);

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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Action Seq Id</em>' attribute.
	 * @see #setProductPriceActionSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_ProductPriceActionSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Action Seq Id</em>' attribute.
	 * @see #getProductPriceActionSeqId()
	 * @generated
	 */
	void setProductPriceActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Rule</em>' reference.
	 * @see #setProductPriceRule(ProductPriceRule)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_ProductPriceRule()
	 * @model
	 * @generated
	 */
	ProductPriceRule getProductPriceRule();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getProductPriceRule <em>Product Price Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule</em>' reference.
	 * @see #getProductPriceRule()
	 * @generated
	 */
	void setProductPriceRule(ProductPriceRule value);

	/**
	 * Returns the value of the '<em><b>Rate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Code</em>' attribute.
	 * @see #setRateCode(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemPriceInfo_RateCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getRateCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo#getRateCode <em>Rate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Code</em>' attribute.
	 * @see #getRateCode()
	 * @generated
	 */
	void setRateCode(String value);

} // OrderItemPriceInfo
