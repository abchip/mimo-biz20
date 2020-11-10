/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getCurrentProductStoreGroupRollups <em>Current Product Store Group Rollups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getPrimaryParentGroup <em>Primary Parent Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getProductStoreGroupName <em>Product Store Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getProductStoreGroupType <em>Product Store Group Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductStoreGroup extends EntityTyped<ProductStoreGroupType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Group</em>' reference.
	 * @see #setPrimaryParentGroup(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup_PrimaryParentGroup()
	 * @model keys="productStoreGroupId"
	 * @generated
	 */
	ProductStoreGroup getPrimaryParentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getPrimaryParentGroup <em>Primary Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Group</em>' reference.
	 * @see #getPrimaryParentGroup()
	 * @generated
	 */
	void setPrimaryParentGroup(ProductStoreGroup value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Name</em>' attribute.
	 * @see #setProductStoreGroupName(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getProductStoreGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getProductStoreGroupName <em>Product Store Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Name</em>' attribute.
	 * @see #getProductStoreGroupName()
	 * @generated
	 */
	void setProductStoreGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Type</em>' reference.
	 * @see #setProductStoreGroupType(ProductStoreGroupType)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupType()
	 * @model keys="productStoreGroupTypeId"
	 * @generated
	 */
	ProductStoreGroupType getProductStoreGroupType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getProductStoreGroupType <em>Product Store Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Type</em>' reference.
	 * @see #getProductStoreGroupType()
	 * @generated
	 */
	void setProductStoreGroupType(ProductStoreGroupType value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #setProductStoreGroupId(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroup#getProductStoreGroupId <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #getProductStoreGroupId()
	 * @generated
	 */
	void setProductStoreGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Current Product Store Group Rollups</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Product Store Group Rollups</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroup_CurrentProductStoreGroupRollups()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductStoreGroupRollup> getCurrentProductStoreGroupRollups();

} // ProductStoreGroup
