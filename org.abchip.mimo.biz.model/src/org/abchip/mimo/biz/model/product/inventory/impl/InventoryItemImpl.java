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
import java.util.List;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance;
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.inventory.Lot;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getActivationNumber <em>Activation Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getActivationValidThru <em>Activation Valid Thru</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getAvailableToPromiseTotal <em>Available To Promise Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getBinNumber <em>Bin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getDatetimeManufactured <em>Datetime Manufactured</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getInventoryItemAttributes <em>Inventory Item Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getInventoryItemDetails <em>Inventory Item Details</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getInventoryItemLabelAppls <em>Inventory Item Label Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getInventoryItemType <em>Inventory Item Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getInventoryItemVariances <em>Inventory Item Variances</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getLot <em>Lot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getOldAvailableToPromise <em>Old Available To Promise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getOldQuantityOnHand <em>Old Quantity On Hand</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getOwnerParty <em>Owner Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getSoftIdentifier <em>Soft Identifier</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.impl.InventoryItemImpl#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemImpl extends EntityTypedImpl<InventoryItemType> implements InventoryItem {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM;
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
	public BigDecimal getAccountingQuantityTotal() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountingQuantityTotal(BigDecimal newAccountingQuantityTotal) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL, newAccountingQuantityTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivationNumber() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationNumber(String newActivationNumber) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_NUMBER, newActivationNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActivationValidThru() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_VALID_THRU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationValidThru(Date newActivationValidThru) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_VALID_THRU, newActivationValidThru);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableToPromiseTotal() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseTotal(BigDecimal newAvailableToPromiseTotal) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL, newAvailableToPromiseTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBinNumber() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__BIN_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinNumber(String newBinNumber) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__BIN_NUMBER, newBinNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.model.product.facility.Container getContainer() {
		return (org.abchip.mimo.biz.model.product.facility.Container)eGet(InventoryPackage.Literals.INVENTORY_ITEM__CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(org.abchip.mimo.biz.model.product.facility.Container newContainer) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(InventoryPackage.Literals.INVENTORY_ITEM__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeManufactured() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_MANUFACTURED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeManufactured(Date newDatetimeManufactured) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_MANUFACTURED, newDatetimeManufactured);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeReceived() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_RECEIVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeReceived(Date newDatetimeReceived) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_RECEIVED, newDatetimeReceived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpireDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__EXPIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(Date newExpireDate) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__EXPIRE_DATE, newExpireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacility() {
		return (Facility)eGet(InventoryPackage.Literals.INVENTORY_ITEM__FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacility(Facility newFacility) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__FACILITY, newFacility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAsset() {
		return (FixedAsset)eGet(InventoryPackage.Literals.INVENTORY_ITEM__FIXED_ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAsset(FixedAsset newFixedAsset) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__FIXED_ASSET, newFixedAsset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemAttribute> getInventoryItemAttributes() {
		return (List<InventoryItemAttribute>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemDetail> getInventoryItemDetails() {
		return (List<InventoryItemDetail>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemLabelAppl> getInventoryItemLabelAppls() {
		return (List<InventoryItemLabelAppl>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getInventoryItemType() {
		return (InventoryItemType)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemType(InventoryItemType newInventoryItemType) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_TYPE, newInventoryItemType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__LOCATION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__LOCATION_SEQ_ID, newLocationSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lot getLot() {
		return (Lot)eGet(InventoryPackage.Literals.INVENTORY_ITEM__LOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLot(Lot newLot) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__LOT, newLot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldAvailableToPromise() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldAvailableToPromise(BigDecimal newOldAvailableToPromise) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE, newOldAvailableToPromise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldQuantityOnHand() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuantityOnHand(BigDecimal newOldQuantityOnHand) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND, newOldQuantityOnHand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerParty() {
		return (Party)eGet(InventoryPackage.Literals.INVENTORY_ITEM__OWNER_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerParty(Party newOwnerParty) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__OWNER_PARTY, newOwnerParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(InventoryPackage.Literals.INVENTORY_ITEM__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(InventoryPackage.Literals.INVENTORY_ITEM__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandTotal() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandTotal(BigDecimal newQuantityOnHandTotal) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL, newQuantityOnHandTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__SERIAL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__SERIAL_NUMBER, newSerialNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftIdentifier() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__SOFT_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftIdentifier(String newSoftIdentifier) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__SOFT_IDENTIFIER, newSoftIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(InventoryPackage.Literals.INVENTORY_ITEM__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitCost() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__UNIT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitCost(BigDecimal newUnitCost) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__UNIT_COST, newUnitCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUom() {
		return (Uom)eGet(InventoryPackage.Literals.INVENTORY_ITEM__UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUom(Uom newUom) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__UOM, newUom);
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
				case InventoryPackage.INVENTORY_ITEM__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case InventoryPackage.INVENTORY_ITEM__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case InventoryPackage.INVENTORY_ITEM__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case InventoryPackage.INVENTORY_ITEM__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return InventoryPackage.INVENTORY_ITEM__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return InventoryPackage.INVENTORY_ITEM__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return InventoryPackage.INVENTORY_ITEM__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return InventoryPackage.INVENTORY_ITEM__LAST_UPDATED_TX_STAMP;
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
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemVariance> getInventoryItemVariances() {
		return (List<InventoryItemVariance>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(String newInventoryItemId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_ID, newInventoryItemId);
	}

} //InventoryItemImpl
