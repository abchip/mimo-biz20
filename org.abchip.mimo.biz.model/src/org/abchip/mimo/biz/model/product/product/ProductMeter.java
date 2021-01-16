/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getProductMeterType <em>Product Meter Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getMeterName <em>Meter Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getMeterUom <em>Meter Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeter()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductMeter extends EntityTyped<ProductMeterType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeter_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Meter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Meter Type</em>' reference.
	 * @see #setProductMeterType(ProductMeterType)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeter_ProductMeterType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='Part of the primary key as different meters on a machine should have distinct types'"
	 * @generated
	 */
	ProductMeterType getProductMeterType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getProductMeterType <em>Product Meter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Meter Type</em>' reference.
	 * @see #getProductMeterType()
	 * @generated
	 */
	void setProductMeterType(ProductMeterType value);

	/**
	 * Returns the value of the '<em><b>Meter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Name</em>' attribute.
	 * @see #setMeterName(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeter_MeterName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getMeterName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getMeterName <em>Meter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Name</em>' attribute.
	 * @see #getMeterName()
	 * @generated
	 */
	void setMeterName(String value);

	/**
	 * Returns the value of the '<em><b>Meter Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Uom</em>' reference.
	 * @see #setMeterUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMeter_MeterUom()
	 * @model annotation="mimo-ent-slot help='Is on this entity instead of the ProductMeterType entity for more flexibility; for example being able to find all speedometers regardless of their primary unit'"
	 * @generated
	 */
	Uom getMeterUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMeter#getMeterUom <em>Meter Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Uom</em>' reference.
	 * @see #getMeterUom()
	 * @generated
	 */
	void setMeterUom(Uom value);

} // ProductMeter
