/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getIsDigital <em>Is Digital</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getIsPhysical <em>Is Physical</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductType#getProductTypeAttrs <em>Product Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductType extends EntityType<Product>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Digital</em>' attribute.
	 * @see #setIsDigital(Boolean)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_IsDigital()
	 * @model
	 * @generated
	 */
	Boolean getIsDigital();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductType#getIsDigital <em>Is Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Digital</em>' attribute.
	 * @see #getIsDigital()
	 * @generated
	 */
	void setIsDigital(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Physical</em>' attribute.
	 * @see #setIsPhysical(Boolean)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_IsPhysical()
	 * @model
	 * @generated
	 */
	Boolean getIsPhysical();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductType#getIsPhysical <em>Is Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Physical</em>' attribute.
	 * @see #getIsPhysical()
	 * @generated
	 */
	void setIsPhysical(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(ProductType)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_ParentType()
	 * @model keys="productTypeId"
	 * @generated
	 */
	ProductType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(ProductType value);

	/**
	 * Returns the value of the '<em><b>Product Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.product.ProductTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Type Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_ProductTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductTypeAttr> getProductTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Product Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type Id</em>' attribute.
	 * @see #setProductTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductType_ProductTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductType#getProductTypeId <em>Product Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type Id</em>' attribute.
	 * @see #getProductTypeId()
	 * @generated
	 */
	void setProductTypeId(String value);

} // ProductType
