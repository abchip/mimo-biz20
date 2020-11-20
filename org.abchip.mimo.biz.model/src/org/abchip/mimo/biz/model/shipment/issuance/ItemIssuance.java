/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.issuance;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Issuance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedByUserLogin <em>Issued By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedDateTime <em>Issued Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance()
 * @model
 * @generated
 */
public interface ItemIssuance extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #setCancelQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_CancelQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getCancelQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getCancelQuantity <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #getCancelQuantity()
	 * @generated
	 */
	void setCancelQuantity(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_FixedAssetId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_InventoryItem()
	 * @model
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Issued By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued By User Login</em>' reference.
	 * @see #setIssuedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_IssuedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getIssuedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedByUserLogin <em>Issued By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued By User Login</em>' reference.
	 * @see #getIssuedByUserLogin()
	 * @generated
	 */
	void setIssuedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Issued Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Date Time</em>' attribute.
	 * @see #setIssuedDateTime(Date)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_IssuedDateTime()
	 * @model
	 * @generated
	 */
	Date getIssuedDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedDateTime <em>Issued Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Date Time</em>' attribute.
	 * @see #getIssuedDateTime()
	 * @generated
	 */
	void setIssuedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Item Issuance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Issuance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #setItemIssuanceId(String)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_ItemIssuanceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getItemIssuanceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getItemIssuanceId <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #getItemIssuanceId()
	 * @generated
	 */
	void setItemIssuanceId(String value);

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
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_MaintHistSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getMaintHistSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getMaintHistSeqId <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #getMaintHistSeqId()
	 * @generated
	 */
	void setMaintHistSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_Order()
	 * @model
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrder <em>Order</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_ShipGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see #setShipment(Shipment)
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_Shipment()
	 * @model
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipment <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(Shipment value);

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
	 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage#getItemIssuance_ShipmentItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Item Seq Id</em>' attribute.
	 * @see #getShipmentItemSeqId()
	 * @generated
	 */
	void setShipmentItemSeqId(String value);

} // ItemIssuance
