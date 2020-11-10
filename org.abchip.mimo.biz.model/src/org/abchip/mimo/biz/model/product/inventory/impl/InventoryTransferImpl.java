/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.inventory.InventoryTransfer;
import org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getInventoryTransferId <em>Inventory Transfer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getContainerIdTo <em>Container Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getItemIssuance <em>Item Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getLocationSeqIdTo <em>Location Seq Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getReceiveDate <em>Receive Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getSendDate <em>Send Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryTransferImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryTransferImpl extends EntityIdentifiableImpl implements InventoryTransfer {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryTransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_TRANSFER;
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
	public String getComments() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.model.product.facility.Container getContainer() {
		return (org.abchip.mimo.biz.model.product.facility.Container)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(org.abchip.mimo.biz.model.product.facility.Container newContainer) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryTransferId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryTransferId(String newInventoryTransferId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID, newInventoryTransferId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID, newLocationSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqIdTo() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqIdTo(String newLocationSeqIdTo) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO, newLocationSeqIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReceiveDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__RECEIVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveDate(Date newReceiveDate) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__RECEIVE_DATE, newReceiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSendDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__SEND_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendDate(Date newSendDate) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__SEND_DATE, newSendDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__STATUS, newStatus);
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
				case InventoryPackage.INVENTORY_TRANSFER__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case InventoryPackage.INVENTORY_TRANSFER__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case InventoryPackage.INVENTORY_TRANSFER__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case InventoryPackage.INVENTORY_TRANSFER__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return InventoryPackage.INVENTORY_TRANSFER__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return InventoryPackage.INVENTORY_TRANSFER__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return InventoryPackage.INVENTORY_TRANSFER__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return InventoryPackage.INVENTORY_TRANSFER__LAST_UPDATED_TX_STAMP;
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
	public Facility getFacilityIdTo() {
		return (Facility)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityIdTo(Facility newFacilityIdTo) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY_ID_TO, newFacilityIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuance getItemIssuance() {
		return (ItemIssuance)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__ITEM_ISSUANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuance(ItemIssuance newItemIssuance) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__ITEM_ISSUANCE, newItemIssuance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.model.product.facility.Container getContainerIdTo() {
		return (org.abchip.mimo.biz.model.product.facility.Container)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerIdTo(org.abchip.mimo.biz.model.product.facility.Container newContainerIdTo) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER_ID_TO, newContainerIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacility() {
		return (Facility)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacility(Facility newFacility) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY, newFacility);
	}

} //InventoryTransferImpl
