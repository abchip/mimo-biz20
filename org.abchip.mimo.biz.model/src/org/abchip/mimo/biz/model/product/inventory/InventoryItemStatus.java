/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getChangeByUserLogin <em>Change By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusEndDatetime <em>Status End Datetime</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus()
 * @model annotation="mimo-ent-frame title='Inventory Item Status History' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface InventoryItemStatus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_InventoryItem()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_Status()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Owner Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party Id</em>' attribute.
	 * @see #setOwnerPartyId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_OwnerPartyId()
	 * @model annotation="mimo-ent-slot help='Used to track a changed (new) ownerPartyId as a status changes.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getOwnerPartyId <em>Owner Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' attribute.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_ProductId()
	 * @model annotation="mimo-ent-slot help='Used to track a changed (new) productId as a status changes. In other words over time the item may be represented by a different Product (like new versus refurbished).'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Datetime</em>' attribute.
	 * @see #setStatusDatetime(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_StatusDatetime()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getStatusDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusDatetime <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Datetime</em>' attribute.
	 * @see #getStatusDatetime()
	 * @generated
	 */
	void setStatusDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login</em>' reference.
	 * @see #setChangeByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_ChangeByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getChangeByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getChangeByUserLogin <em>Change By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login</em>' reference.
	 * @see #getChangeByUserLogin()
	 * @generated
	 */
	void setChangeByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Status End Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status End Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status End Datetime</em>' attribute.
	 * @see #setStatusEndDatetime(Date)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemStatus_StatusEndDatetime()
	 * @model
	 * @generated
	 */
	Date getStatusEndDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus#getStatusEndDatetime <em>Status End Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status End Datetime</em>' attribute.
	 * @see #getStatusEndDatetime()
	 * @generated
	 */
	void setStatusEndDatetime(Date value);

} // InventoryItemStatus
