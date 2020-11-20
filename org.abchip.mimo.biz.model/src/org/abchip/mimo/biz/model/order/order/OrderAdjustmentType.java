/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Adjustment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeAttrs <em>Order Adjustment Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderAdjustmentType()
 * @model annotation="mimo-ent-frame dictionary='OrderEntityLabels' formula='description'"
 * @generated
 */
public interface OrderAdjustmentType extends EntityType<OrderAdjustment>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderAdjustmentType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderAdjustmentType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderAdjustmentType_OrderAdjustmentTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderAdjustmentTypeAttr> getOrderAdjustmentTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(OrderAdjustmentType)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderAdjustmentType_ParentType()
	 * @model
	 * @generated
	 */
	OrderAdjustmentType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(OrderAdjustmentType value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Type Id</em>' attribute.
	 * @see #setOrderAdjustmentTypeId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderAdjustmentType_OrderAdjustmentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderAdjustmentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderAdjustmentType#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Adjustment Type Id</em>' attribute.
	 * @see #getOrderAdjustmentTypeId()
	 * @generated
	 */
	void setOrderAdjustmentTypeId(String value);

} // OrderAdjustmentType
