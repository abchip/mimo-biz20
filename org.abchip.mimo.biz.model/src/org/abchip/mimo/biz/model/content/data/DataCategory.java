/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataCategory#getDataCategoryId <em>Data Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataCategory#getParentCategory <em>Parent Category</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataCategory()
 * @model annotation="mimo-ent-frame dictionary='ContentEntityLabels'"
 * @generated
 */
public interface DataCategory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataCategory_CategoryName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataCategory#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference.
	 * @see #setParentCategory(DataCategory)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataCategory_ParentCategory()
	 * @model
	 * @generated
	 */
	DataCategory getParentCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataCategory#getParentCategory <em>Parent Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category</em>' reference.
	 * @see #getParentCategory()
	 * @generated
	 */
	void setParentCategory(DataCategory value);

	/**
	 * Returns the value of the '<em><b>Data Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Category Id</em>' attribute.
	 * @see #setDataCategoryId(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataCategory_DataCategoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataCategory#getDataCategoryId <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Category Id</em>' attribute.
	 * @see #getDataCategoryId()
	 * @generated
	 */
	void setDataCategoryId(String value);

} // DataCategory
