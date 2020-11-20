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
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance;
import org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItemDetailSeqId <em>Inventory Item Detail Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAccountingQuantityDiff <em>Accounting Quantity Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAvailableToPromiseDiff <em>Available To Promise Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getItemIssuance <em>Item Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getPhysicalInventory <em>Physical Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getQuantityOnHandDiff <em>Quantity On Hand Diff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface InventoryItemDetail extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_InventoryItem()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Accounting Quantity Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounting Quantity Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Quantity Diff</em>' attribute.
	 * @see #setAccountingQuantityDiff(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_AccountingQuantityDiff()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAccountingQuantityDiff();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAccountingQuantityDiff <em>Accounting Quantity Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Quantity Diff</em>' attribute.
	 * @see #getAccountingQuantityDiff()
	 * @generated
	 */
	void setAccountingQuantityDiff(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Available To Promise Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available To Promise Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available To Promise Diff</em>' attribute.
	 * @see #setAvailableToPromiseDiff(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_AvailableToPromiseDiff()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAvailableToPromiseDiff();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getAvailableToPromiseDiff <em>Available To Promise Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To Promise Diff</em>' attribute.
	 * @see #getAvailableToPromiseDiff()
	 * @generated
	 */
	void setAvailableToPromiseDiff(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_EffectiveDate()
	 * @model
	 * @generated
	 */
	Date getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_FixedAssetId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Item Issuance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Issuance</em>' reference.
	 * @see #setItemIssuance(ItemIssuance)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ItemIssuance()
	 * @model
	 * @generated
	 */
	ItemIssuance getItemIssuance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getItemIssuance <em>Item Issuance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Issuance</em>' reference.
	 * @see #getItemIssuance()
	 * @generated
	 */
	void setItemIssuance(ItemIssuance value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Detail Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Detail Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Detail Seq Id</em>' attribute.
	 * @see #setInventoryItemDetailSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_InventoryItemDetailSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInventoryItemDetailSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getInventoryItemDetailSeqId <em>Inventory Item Detail Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Detail Seq Id</em>' attribute.
	 * @see #getInventoryItemDetailSeqId()
	 * @generated
	 */
	void setInventoryItemDetailSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Hist Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #setMaintHistSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_MaintHistSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getMaintHistSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getMaintHistSeqId <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #getMaintHistSeqId()
	 * @generated
	 */
	void setMaintHistSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_OrderId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory</em>' reference.
	 * @see #setPhysicalInventory(PhysicalInventory)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_PhysicalInventory()
	 * @model
	 * @generated
	 */
	PhysicalInventory getPhysicalInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getPhysicalInventory <em>Physical Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory</em>' reference.
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	void setPhysicalInventory(PhysicalInventory value);

	/**
	 * Returns the value of the '<em><b>Quantity On Hand Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity On Hand Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity On Hand Diff</em>' attribute.
	 * @see #setQuantityOnHandDiff(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_QuantityOnHandDiff()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityOnHandDiff();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getQuantityOnHandDiff <em>Quantity On Hand Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand Diff</em>' attribute.
	 * @see #getQuantityOnHandDiff()
	 * @generated
	 */
	void setQuantityOnHandDiff(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Enum</em>' reference.
	 * @see #setReasonEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ReasonEnum()
	 * @model
	 * @generated
	 */
	Enumeration getReasonEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReasonEnum <em>Reason Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Enum</em>' reference.
	 * @see #getReasonEnum()
	 * @generated
	 */
	void setReasonEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(ShipmentReceipt)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_Receipt()
	 * @model
	 * @generated
	 */
	ShipmentReceipt getReceipt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(ShipmentReceipt value);

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ReturnId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ReturnItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ShipGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ShipmentId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Item Seq Id</em>' attribute.
	 * @see #setShipmentItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_ShipmentItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Item Seq Id</em>' attribute.
	 * @see #getShipmentItemSeqId()
	 * @generated
	 */
	void setShipmentItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_UnitCost()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getUnitCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getUnitCost <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Cost</em>' attribute.
	 * @see #getUnitCost()
	 * @generated
	 */
	void setUnitCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemDetail_WorkEffort()
	 * @model
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

} // InventoryItemDetail
