/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail;
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance;
import org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getInventoryItemDetailSeqId <em>Inventory Item Detail Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getAccountingQuantityDiff <em>Accounting Quantity Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getAvailableToPromiseDiff <em>Available To Promise Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getItemIssuance <em>Item Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getPhysicalInventory <em>Physical Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getQuantityOnHandDiff <em>Quantity On Hand Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemDetailImpl#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemDetailImpl extends EntityIdentifiableImpl implements InventoryItemDetail {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_DETAIL;
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
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAccountingQuantityDiff() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountingQuantityDiff(BigDecimal newAccountingQuantityDiff) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF, newAccountingQuantityDiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableToPromiseDiff() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseDiff(BigDecimal newAvailableToPromiseDiff) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF, newAvailableToPromiseDiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEffectiveDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveDate(Date newEffectiveDate) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE, newEffectiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID, newFixedAssetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuance getItemIssuance() {
		return (ItemIssuance)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuance(ItemIssuance newItemIssuance) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE, newItemIssuance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemDetailSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemDetailSeqId(String newInventoryItemDetailSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID, newInventoryItemDetailSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaintHistSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintHistSeqId(String newMaintHistSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID, newMaintHistSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalInventory getPhysicalInventory() {
		return (PhysicalInventory)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventory(PhysicalInventory newPhysicalInventory) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY, newPhysicalInventory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandDiff() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandDiff(BigDecimal newQuantityOnHandDiff) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF, newQuantityOnHandDiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnum() {
		return (Enumeration)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__REASON_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnum(Enumeration newReasonEnum) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__REASON_ENUM, newReasonEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentReceipt getReceipt() {
		return (ShipmentReceipt)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__RECEIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceipt(ShipmentReceipt newReceipt) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__RECEIPT, newReceipt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__RETURN_ID, newReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID, newReturnItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__SHIPMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__SHIPMENT_ID, newShipmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentItemSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentItemSeqId(String newShipmentItemSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID, newShipmentItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitCost() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__UNIT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitCost(BigDecimal newUnitCost) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__UNIT_COST, newUnitCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffort() {
		return (WorkEffort)eGet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__WORK_EFFORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffort(WorkEffort newWorkEffort) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM_DETAIL__WORK_EFFORT, newWorkEffort);
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
				case InventoryPackage.INVENTORY_ITEM_DETAIL__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case InventoryPackage.INVENTORY_ITEM_DETAIL__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case InventoryPackage.INVENTORY_ITEM_DETAIL__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case InventoryPackage.INVENTORY_ITEM_DETAIL__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return InventoryPackage.INVENTORY_ITEM_DETAIL__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return InventoryPackage.INVENTORY_ITEM_DETAIL__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return InventoryPackage.INVENTORY_ITEM_DETAIL__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return InventoryPackage.INVENTORY_ITEM_DETAIL__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InventoryItemDetailImpl
