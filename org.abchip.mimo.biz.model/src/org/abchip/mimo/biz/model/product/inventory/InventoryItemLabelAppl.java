/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Label Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelType <em>Inventory Item Label Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabel <em>Inventory Item Label</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemLabelAppl()
 * @model annotation="mimo-ent-frame title='Inventory Item Label Applicability' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface InventoryItemLabelAppl extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemLabelAppl_InventoryItem()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Label Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Label Type</em>' reference.
	 * @see #setInventoryItemLabelType(InventoryItemLabelType)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemLabelAppl_InventoryItemLabelType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItemLabelType getInventoryItemLabelType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelType <em>Inventory Item Label Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Label Type</em>' reference.
	 * @see #getInventoryItemLabelType()
	 * @generated
	 */
	void setInventoryItemLabelType(InventoryItemLabelType value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Label</em>' reference.
	 * @see #setInventoryItemLabel(InventoryItemLabel)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemLabelAppl_InventoryItemLabel()
	 * @model
	 * @generated
	 */
	InventoryItemLabel getInventoryItemLabel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getInventoryItemLabel <em>Inventory Item Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Label</em>' reference.
	 * @see #getInventoryItemLabel()
	 * @generated
	 */
	void setInventoryItemLabel(InventoryItemLabel value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#getInventoryItemLabelAppl_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

} // InventoryItemLabelAppl
