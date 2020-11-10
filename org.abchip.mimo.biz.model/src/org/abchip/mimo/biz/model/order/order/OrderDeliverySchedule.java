/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Delivery Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getCartons <em>Cartons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getSkidsPallets <em>Skids Pallets</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicSize <em>Total Cubic Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicUom <em>Total Cubic Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeightUom <em>Total Weight Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getUnitsPieces <em>Units Pieces</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule()
 * @model annotation="mimo-ent-frame title='The Order Delivery Schedule'"
 * @generated
 */
public interface OrderDeliverySchedule extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_Order()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Cartons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartons</em>' attribute.
	 * @see #setCartons(long)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_Cartons()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getCartons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getCartons <em>Cartons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartons</em>' attribute.
	 * @see #getCartons()
	 * @generated
	 */
	void setCartons(long value);

	/**
	 * Returns the value of the '<em><b>Estimated Ready Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ready Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ready Date</em>' attribute.
	 * @see #setEstimatedReadyDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_EstimatedReadyDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedReadyDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getEstimatedReadyDate <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ready Date</em>' attribute.
	 * @see #getEstimatedReadyDate()
	 * @generated
	 */
	void setEstimatedReadyDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_OrderItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Skids Pallets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skids Pallets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skids Pallets</em>' attribute.
	 * @see #setSkidsPallets(long)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_SkidsPallets()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSkidsPallets();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getSkidsPallets <em>Skids Pallets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skids Pallets</em>' attribute.
	 * @see #getSkidsPallets()
	 * @generated
	 */
	void setSkidsPallets(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Total Cubic Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cubic Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cubic Size</em>' attribute.
	 * @see #setTotalCubicSize(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_TotalCubicSize()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getTotalCubicSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicSize <em>Total Cubic Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cubic Size</em>' attribute.
	 * @see #getTotalCubicSize()
	 * @generated
	 */
	void setTotalCubicSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Cubic Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cubic Uom</em>' reference.
	 * @see #setTotalCubicUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_TotalCubicUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getTotalCubicUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalCubicUom <em>Total Cubic Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cubic Uom</em>' reference.
	 * @see #getTotalCubicUom()
	 * @generated
	 */
	void setTotalCubicUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Weight</em>' attribute.
	 * @see #setTotalWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_TotalWeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getTotalWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeight <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Weight</em>' attribute.
	 * @see #getTotalWeight()
	 * @generated
	 */
	void setTotalWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Weight Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Weight Uom</em>' reference.
	 * @see #setTotalWeightUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_TotalWeightUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getTotalWeightUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getTotalWeightUom <em>Total Weight Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Weight Uom</em>' reference.
	 * @see #getTotalWeightUom()
	 * @generated
	 */
	void setTotalWeightUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Units Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units Pieces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units Pieces</em>' attribute.
	 * @see #setUnitsPieces(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderDeliverySchedule_UnitsPieces()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getUnitsPieces();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule#getUnitsPieces <em>Units Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Pieces</em>' attribute.
	 * @see #getUnitsPieces()
	 * @generated
	 */
	void setUnitsPieces(BigDecimal value);

} // OrderDeliverySchedule
