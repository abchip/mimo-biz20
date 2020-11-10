/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Group Rollup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getProductStoreGroup <em>Product Store Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroupRollup()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStoreGroupRollup extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Store Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group</em>' reference.
	 * @see #setProductStoreGroup(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroupRollup_ProductStoreGroup()
	 * @model keys="productStoreGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStoreGroup getProductStoreGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getProductStoreGroup <em>Product Store Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group</em>' reference.
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	void setProductStoreGroup(ProductStoreGroup value);

	/**
	 * Returns the value of the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group</em>' reference.
	 * @see #setParentGroup(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroupRollup_ParentGroup()
	 * @model keys="productStoreGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStoreGroup getParentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getParentGroup <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group</em>' reference.
	 * @see #getParentGroup()
	 * @generated
	 */
	void setParentGroup(ProductStoreGroup value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroupRollup_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroupRollup_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreGroupRollup_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreGroupRollup#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProductStoreGroupRollup
