/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeAttrs <em>Inventory Item Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemType()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface InventoryItemType extends EntityType<InventoryItem>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemType_InventoryItemTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<InventoryItemTypeAttr> getInventoryItemTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(InventoryItemType)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemType_ParentType()
	 * @model
	 * @generated
	 */
	InventoryItemType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(InventoryItemType value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Type Id</em>' attribute.
	 * @see #setInventoryItemTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemType_InventoryItemTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInventoryItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemType#getInventoryItemTypeId <em>Inventory Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Type Id</em>' attribute.
	 * @see #getInventoryItemTypeId()
	 * @generated
	 */
	void setInventoryItemTypeId(String value);

} // InventoryItemType
