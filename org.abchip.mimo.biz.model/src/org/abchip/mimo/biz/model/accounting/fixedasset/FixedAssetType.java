/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getFixedAssetTypeAttrs <em>Fixed Asset Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetType()
 * @model annotation="mimo-ent-frame dictionary='AccountingEntityLabels' formula='description'"
 * @generated
 */
public interface FixedAssetType extends EntityType<FixedAsset>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetType_FixedAssetTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetTypeAttr> getFixedAssetTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(FixedAssetType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetType_ParentType()
	 * @model
	 * @generated
	 */
	FixedAssetType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Id</em>' attribute.
	 * @see #setFixedAssetTypeId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetType_FixedAssetTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFixedAssetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type Id</em>' attribute.
	 * @see #getFixedAssetTypeId()
	 * @generated
	 */
	void setFixedAssetTypeId(String value);

} // FixedAssetType
