/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.feature;

import org.abchip.mimo.biz.model.content.data.DataResource;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureDataResource#getDataResource <em>Data Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureDataResource#getProductFeature <em>Product Feature</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureDataResource()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductFeatureDataResource extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource</em>' reference.
	 * @see #setDataResource(DataResource)
	 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureDataResource_DataResource()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	DataResource getDataResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureDataResource#getDataResource <em>Data Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource</em>' reference.
	 * @see #getDataResource()
	 * @generated
	 */
	void setDataResource(DataResource value);

	/**
	 * Returns the value of the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature</em>' reference.
	 * @see #setProductFeature(ProductFeature)
	 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureDataResource_ProductFeature()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductFeature getProductFeature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureDataResource#getProductFeature <em>Product Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature</em>' reference.
	 * @see #getProductFeature()
	 * @generated
	 */
	void setProductFeature(ProductFeature value);

} // ProductFeatureDataResource
