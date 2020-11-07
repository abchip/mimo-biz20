/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.feature;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureGroup#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureGroup#getProductFeatureGroupAppls <em>Product Feature Group Appls</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureGroup()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductFeatureGroup extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureGroup_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Group Appls</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.feature.ProductFeatureGroupAppl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Group Appls</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureGroup_ProductFeatureGroupAppls()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductFeatureGroupAppl> getProductFeatureGroupAppls();

	/**
	 * Returns the value of the '<em><b>Product Feature Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Group Id</em>' attribute.
	 * @see #setProductFeatureGroupId(String)
	 * @see org.abchip.mimo.biz.model.product.feature.FeaturePackage#getProductFeatureGroup_ProductFeatureGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductFeatureGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.feature.ProductFeatureGroup#getProductFeatureGroupId <em>Product Feature Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Group Id</em>' attribute.
	 * @see #getProductFeatureGroupId()
	 * @generated
	 */
	void setProductFeatureGroupId(String value);

} // ProductFeatureGroup
