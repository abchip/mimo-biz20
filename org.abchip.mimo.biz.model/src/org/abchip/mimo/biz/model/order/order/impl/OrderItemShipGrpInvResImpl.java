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
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Ship Grp Inv Res</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getCreatedDatetime <em>Created Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getCurrentPromisedDate <em>Current Promised Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getOldPickStartDate <em>Old Pick Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getPromisedDatetime <em>Promised Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getQuantityNotAvailable <em>Quantity Not Available</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getReservedDatetime <em>Reserved Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemShipGrpInvResImpl#getSequenceId <em>Sequence Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemShipGrpInvResImpl extends EntityIdentifiableImpl implements OrderItemShipGrpInvRes {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemShipGrpInvResImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES;
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
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderHeader newOrder) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDatetime() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDatetime(Date newCreatedDatetime) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME, newCreatedDatetime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCurrentPromisedDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPromisedDate(Date newCurrentPromisedDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE, newCurrentPromisedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOldPickStartDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPickStartDate(Date newOldPickStartDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE, newOldPickStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(String newPriority) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPromisedDatetime() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromisedDatetime(Date newPromisedDatetime) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME, newPromisedDatetime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityNotAvailable() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityNotAvailable(BigDecimal newQuantityNotAvailable) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE, newQuantityNotAvailable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserveOrderEnumId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveOrderEnumId(String newReserveOrderEnumId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID, newReserveOrderEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservedDatetime() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedDatetime(Date newReservedDatetime) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME, newReservedDatetime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceId() {
		return (Long)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(long newSequenceId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID, newSequenceId);
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
				case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

} //OrderItemShipGrpInvResImpl
