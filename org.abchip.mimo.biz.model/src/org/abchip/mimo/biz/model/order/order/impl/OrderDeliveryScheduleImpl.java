/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Delivery Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getCartons <em>Cartons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getSkidsPallets <em>Skids Pallets</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getTotalCubicSize <em>Total Cubic Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getTotalCubicUom <em>Total Cubic Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getTotalWeightUom <em>Total Weight Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderDeliveryScheduleImpl#getUnitsPieces <em>Units Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderDeliveryScheduleImpl extends EntityIdentifiableImpl implements OrderDeliverySchedule {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderDeliveryScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrder() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderHeader newOrder) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCartons() {
		return (Long)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__CARTONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartons(long newCartons) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__CARTONS, newCartons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedReadyDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedReadyDate(Date newEstimatedReadyDate) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE, newEstimatedReadyDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSkidsPallets() {
		return (Long)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkidsPallets(long newSkidsPallets) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS, newSkidsPallets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalCubicSize() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCubicSize(BigDecimal newTotalCubicSize) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE, newTotalCubicSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getTotalCubicUom() {
		return (Uom)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCubicUom(Uom newTotalCubicUom) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM, newTotalCubicUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalWeight() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWeight(BigDecimal newTotalWeight) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT, newTotalWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getTotalWeightUom() {
		return (Uom)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWeightUom(Uom newTotalWeightUom) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM, newTotalWeightUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitsPieces() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsPieces(BigDecimal newUnitsPieces) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES, newUnitsPieces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case OrderPackage.ORDER_DELIVERY_SCHEDULE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OrderPackage.ORDER_DELIVERY_SCHEDULE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OrderPackage.ORDER_DELIVERY_SCHEDULE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OrderPackage.ORDER_DELIVERY_SCHEDULE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OrderPackage.ORDER_DELIVERY_SCHEDULE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OrderPackage.ORDER_DELIVERY_SCHEDULE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OrderPackage.ORDER_DELIVERY_SCHEDULE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OrderPackage.ORDER_DELIVERY_SCHEDULE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OrderDeliveryScheduleImpl
