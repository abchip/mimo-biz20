/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Meter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeterType#getProductMeterTypeId <em>Product Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeterType#getDefaultUom <em>Default Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeterType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeterType()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductMeterType extends EntityType<ProductMeter>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeterType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeterType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Meter Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Meter Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Meter Type Id</em>' attribute.
	 * @see #setProductMeterTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeterType_ProductMeterTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeterType#getProductMeterTypeId <em>Product Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Meter Type Id</em>' attribute.
	 * @see #getProductMeterTypeId()
	 * @generated
	 */
	void setProductMeterTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Default Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Uom</em>' reference.
	 * @see #setDefaultUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeterType_DefaultUom()
	 * @model annotation="mimo-ent-slot help='This is optional and if applicable can describe the meter better'"
	 * @generated
	 */
	Uom getDefaultUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeterType#getDefaultUom <em>Default Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Uom</em>' reference.
	 * @see #getDefaultUom()
	 * @generated
	 */
	void setDefaultUom(Uom value);

} // ProductMeterType
