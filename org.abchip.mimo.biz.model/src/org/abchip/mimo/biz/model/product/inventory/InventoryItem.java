/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Container;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationNumber <em>Activation Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationValidThru <em>Activation Valid Thru</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAvailableToPromiseTotal <em>Available To Promise Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getBinNumber <em>Bin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getContainer <em>Container</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeManufactured <em>Datetime Manufactured</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemAttributes <em>Inventory Item Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemDetails <em>Inventory Item Details</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemLabelAppls <em>Inventory Item Label Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemStatuses <em>Inventory Item Statuses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemType <em>Inventory Item Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemVariances <em>Inventory Item Variances</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLot <em>Lot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldAvailableToPromise <em>Old Available To Promise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldQuantityOnHand <em>Old Quantity On Hand</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOwnerParty <em>Owner Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSoftIdentifier <em>Soft Identifier</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface InventoryItem extends EntityTyped<InventoryItemType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Accounting Quantity Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounting Quantity Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Quantity Total</em>' attribute.
	 * @see #setAccountingQuantityTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_AccountingQuantityTotal()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAccountingQuantityTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Quantity Total</em>' attribute.
	 * @see #getAccountingQuantityTotal()
	 * @generated
	 */
	void setAccountingQuantityTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Activation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Number</em>' attribute.
	 * @see #setActivationNumber(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_ActivationNumber()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getActivationNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationNumber <em>Activation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Number</em>' attribute.
	 * @see #getActivationNumber()
	 * @generated
	 */
	void setActivationNumber(String value);

	/**
	 * Returns the value of the '<em><b>Activation Valid Thru</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Valid Thru</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Valid Thru</em>' attribute.
	 * @see #setActivationValidThru(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_ActivationValidThru()
	 * @model
	 * @generated
	 */
	Date getActivationValidThru();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getActivationValidThru <em>Activation Valid Thru</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Valid Thru</em>' attribute.
	 * @see #getActivationValidThru()
	 * @generated
	 */
	void setActivationValidThru(Date value);

	/**
	 * Returns the value of the '<em><b>Available To Promise Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available To Promise Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available To Promise Total</em>' attribute.
	 * @see #setAvailableToPromiseTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_AvailableToPromiseTotal()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAvailableToPromiseTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getAvailableToPromiseTotal <em>Available To Promise Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To Promise Total</em>' attribute.
	 * @see #getAvailableToPromiseTotal()
	 * @generated
	 */
	void setAvailableToPromiseTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Bin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Number</em>' attribute.
	 * @see #setBinNumber(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_BinNumber()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBinNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getBinNumber <em>Bin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Number</em>' attribute.
	 * @see #getBinNumber()
	 * @generated
	 */
	void setBinNumber(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Container()
	 * @model keys="containerId"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_CurrencyUom()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='The currency Uom of the unit cost.'"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Datetime Manufactured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Manufactured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Manufactured</em>' attribute.
	 * @see #setDatetimeManufactured(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_DatetimeManufactured()
	 * @model
	 * @generated
	 */
	Date getDatetimeManufactured();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeManufactured <em>Datetime Manufactured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Manufactured</em>' attribute.
	 * @see #getDatetimeManufactured()
	 * @generated
	 */
	void setDatetimeManufactured(Date value);

	/**
	 * Returns the value of the '<em><b>Datetime Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Received</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Received</em>' attribute.
	 * @see #setDatetimeReceived(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_DatetimeReceived()
	 * @model
	 * @generated
	 */
	Date getDatetimeReceived();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getDatetimeReceived <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Received</em>' attribute.
	 * @see #getDatetimeReceived()
	 * @generated
	 */
	void setDatetimeReceived(Date value);

	/**
	 * Returns the value of the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Date</em>' attribute.
	 * @see #setExpireDate(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_ExpireDate()
	 * @model
	 * @generated
	 */
	Date getExpireDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getExpireDate <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Date</em>' attribute.
	 * @see #getExpireDate()
	 * @generated
	 */
	void setExpireDate(Date value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Facility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_FixedAsset()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<InventoryItemAttribute> getInventoryItemAttributes();

	/**
	 * Returns the value of the '<em><b>Inventory Item Details</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Details</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemDetails()
	 * @model derived="true"
	 * @generated
	 */
	List<InventoryItemDetail> getInventoryItemDetails();

	/**
	 * Returns the value of the '<em><b>Inventory Item Label Appls</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Label Appls</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemLabelAppls()
	 * @model derived="true"
	 * @generated
	 */
	List<InventoryItemLabelAppl> getInventoryItemLabelAppls();

	/**
	 * Returns the value of the '<em><b>Inventory Item Statuses</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Statuses</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemStatuses()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraint statusDatetime='*NOW'"
	 * @generated
	 */
	List<InventoryItemStatus> getInventoryItemStatuses();

	/**
	 * Returns the value of the '<em><b>Inventory Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Type</em>' reference.
	 * @see #setInventoryItemType(InventoryItemType)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemType()
	 * @model keys="inventoryItemTypeId"
	 * @generated
	 */
	InventoryItemType getInventoryItemType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemType <em>Inventory Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Type</em>' reference.
	 * @see #getInventoryItemType()
	 * @generated
	 */
	void setInventoryItemType(InventoryItemType value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Variances</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Variances</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemVariances()
	 * @model derived="true"
	 * @generated
	 */
	List<InventoryItemVariance> getInventoryItemVariances();

	/**
	 * Returns the value of the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Seq Id</em>' attribute.
	 * @see #setLocationSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_LocationSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLocationSeqId <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id</em>' attribute.
	 * @see #getLocationSeqId()
	 * @generated
	 */
	void setLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Lot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot</em>' reference.
	 * @see #setLot(Lot)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Lot()
	 * @model keys="lotId"
	 * @generated
	 */
	Lot getLot();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getLot <em>Lot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot</em>' reference.
	 * @see #getLot()
	 * @generated
	 */
	void setLot(Lot value);

	/**
	 * Returns the value of the '<em><b>Old Available To Promise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Available To Promise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Available To Promise</em>' attribute.
	 * @see #setOldAvailableToPromise(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_OldAvailableToPromise()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getOldAvailableToPromise();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldAvailableToPromise <em>Old Available To Promise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Available To Promise</em>' attribute.
	 * @see #getOldAvailableToPromise()
	 * @generated
	 */
	void setOldAvailableToPromise(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Old Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Quantity On Hand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Quantity On Hand</em>' attribute.
	 * @see #setOldQuantityOnHand(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_OldQuantityOnHand()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getOldQuantityOnHand();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOldQuantityOnHand <em>Old Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Quantity On Hand</em>' attribute.
	 * @see #getOldQuantityOnHand()
	 * @generated
	 */
	void setOldQuantityOnHand(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Owner Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party</em>' reference.
	 * @see #setOwnerParty(Party)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_OwnerParty()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot help='The owner of the inventory item.'"
	 * @generated
	 */
	Party getOwnerParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getOwnerParty <em>Owner Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party</em>' reference.
	 * @see #getOwnerParty()
	 * @generated
	 */
	void setOwnerParty(Party value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Product()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity On Hand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity On Hand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity On Hand Total</em>' attribute.
	 * @see #setQuantityOnHandTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_QuantityOnHandTotal()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityOnHandTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand Total</em>' attribute.
	 * @see #getQuantityOnHandTotal()
	 * @generated
	 */
	void setQuantityOnHandTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_SerialNumber()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Soft Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Identifier</em>' attribute.
	 * @see #setSoftIdentifier(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_SoftIdentifier()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSoftIdentifier();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getSoftIdentifier <em>Soft Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Identifier</em>' attribute.
	 * @see #getSoftIdentifier()
	 * @generated
	 */
	void setSoftIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Cost</em>' attribute.
	 * @see #setUnitCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_UnitCost()
	 * @model annotation="mimo-ent-slot help='Higher precision in case it is a calculated number'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getUnitCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUnitCost <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Cost</em>' attribute.
	 * @see #getUnitCost()
	 * @generated
	 */
	void setUnitCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' reference.
	 * @see #setUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_Uom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getUom <em>Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' reference.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItem_InventoryItemId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItem#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

} // InventoryItem
