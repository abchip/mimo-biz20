/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.category;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category Type Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getProductCategoryType <em>Product Category Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryTypeAttr()
 * @model annotation="mimo-ent-frame title='Product Category Type Attribute' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductCategoryTypeAttr extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Category Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Type</em>' reference.
	 * @see #setProductCategoryType(ProductCategoryType)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryTypeAttr_ProductCategoryType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductCategoryType getProductCategoryType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getProductCategoryType <em>Product Category Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Type</em>' reference.
	 * @see #getProductCategoryType()
	 * @generated
	 */
	void setProductCategoryType(ProductCategoryType value);

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
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryTypeAttr_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryTypeAttr_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

} // ProductCategoryTypeAttr
