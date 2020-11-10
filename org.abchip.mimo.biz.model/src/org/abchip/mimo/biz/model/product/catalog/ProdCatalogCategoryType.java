/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.catalog;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Catalog Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogCategoryType()
 * @model annotation="mimo-ent-frame title='Catalog Category Association Type' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProdCatalogCategoryType extends EntityType<ProdCatalogCategory>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogCategoryType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(ProdCatalogCategoryType)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogCategoryType_ParentType()
	 * @model keys="prodCatalogCategoryTypeId"
	 * @generated
	 */
	ProdCatalogCategoryType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(ProdCatalogCategoryType value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Category Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Category Type Id</em>' attribute.
	 * @see #setProdCatalogCategoryTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogCategoryType_ProdCatalogCategoryTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProdCatalogCategoryTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Category Type Id</em>' attribute.
	 * @see #getProdCatalogCategoryTypeId()
	 * @generated
	 */
	void setProdCatalogCategoryTypeId(String value);

} // ProdCatalogCategoryType
