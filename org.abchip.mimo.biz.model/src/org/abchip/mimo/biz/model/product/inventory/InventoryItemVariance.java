/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory;

import java.math.BigDecimal;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Variance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getPhysicalInventory <em>Physical Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getAvailableToPromiseVar <em>Available To Promise Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getQuantityOnHandVar <em>Quantity On Hand Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getVarianceReason <em>Variance Reason</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface InventoryItemVariance extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Physical Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory</em>' reference.
	 * @see #setPhysicalInventory(PhysicalInventory)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance_PhysicalInventory()
	 * @model keys="physicalInventoryId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PhysicalInventory getPhysicalInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getPhysicalInventory <em>Physical Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory</em>' reference.
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	void setPhysicalInventory(PhysicalInventory value);

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance_InventoryItem()
	 * @model keys="inventoryItemId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Available To Promise Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available To Promise Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available To Promise Var</em>' attribute.
	 * @see #setAvailableToPromiseVar(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance_AvailableToPromiseVar()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAvailableToPromiseVar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getAvailableToPromiseVar <em>Available To Promise Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To Promise Var</em>' attribute.
	 * @see #getAvailableToPromiseVar()
	 * @generated
	 */
	void setAvailableToPromiseVar(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Quantity On Hand Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity On Hand Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity On Hand Var</em>' attribute.
	 * @see #setQuantityOnHandVar(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance_QuantityOnHandVar()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityOnHandVar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getQuantityOnHandVar <em>Quantity On Hand Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand Var</em>' attribute.
	 * @see #getQuantityOnHandVar()
	 * @generated
	 */
	void setQuantityOnHandVar(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Variance Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance Reason</em>' reference.
	 * @see #setVarianceReason(VarianceReason)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemVariance_VarianceReason()
	 * @model keys="varianceReasonId"
	 * @generated
	 */
	VarianceReason getVarianceReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance#getVarianceReason <em>Variance Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variance Reason</em>' reference.
	 * @see #getVarianceReason()
	 * @generated
	 */
	void setVarianceReason(VarianceReason value);

} // InventoryItemVariance
