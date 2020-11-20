/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item Type Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnHeaderType <em>Return Header Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemMapKey <em>Return Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemType <em>Return Item Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemTypeMap()
 * @model annotation="mimo-ent-frame help='Mapping between productTypeId and returnItemTypeId for product order items, orderItemTypeId and returnItemTypeId for other\n          order items, or orderAdjustmentTypeId and returnAdjustmentTypeId.  Separate mappings for different types of returns (customer vs. vendor)'"
 * @generated
 */
public interface ReturnItemTypeMap extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return Header Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Header Type</em>' reference.
	 * @see #setReturnHeaderType(ReturnHeaderType)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemTypeMap_ReturnHeaderType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeaderType getReturnHeaderType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnHeaderType <em>Return Header Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Header Type</em>' reference.
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	void setReturnHeaderType(ReturnHeaderType value);

	/**
	 * Returns the value of the '<em><b>Return Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Map Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Map Key</em>' attribute.
	 * @see #setReturnItemMapKey(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemTypeMap_ReturnItemMapKey()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemMapKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemMapKey <em>Return Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Map Key</em>' attribute.
	 * @see #getReturnItemMapKey()
	 * @generated
	 */
	void setReturnItemMapKey(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Type</em>' reference.
	 * @see #setReturnItemType(ReturnItemType)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemTypeMap_ReturnItemType()
	 * @model
	 * @generated
	 */
	ReturnItemType getReturnItemType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemTypeMap#getReturnItemType <em>Return Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Type</em>' reference.
	 * @see #getReturnItemType()
	 * @generated
	 */
	void setReturnItemType(ReturnItemType value);

} // ReturnItemTypeMap
