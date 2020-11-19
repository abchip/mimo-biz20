/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.segment;

import java.util.List;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupClassifications <em>Segment Group Classifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupGeos <em>Segment Group Geos</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupType <em>Segment Group Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SegmentGroup extends EntityTyped<SegmentGroupType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup_ProductStore()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Segment Group Classifications</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Classifications</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupClassifications()
	 * @model derived="true"
	 * @generated
	 */
	List<SegmentGroupClassification> getSegmentGroupClassifications();

	/**
	 * Returns the value of the '<em><b>Segment Group Geos</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Geos</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupGeos()
	 * @model derived="true"
	 * @generated
	 */
	List<SegmentGroupGeo> getSegmentGroupGeos();

	/**
	 * Returns the value of the '<em><b>Segment Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Type</em>' reference.
	 * @see #setSegmentGroupType(SegmentGroupType)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupType()
	 * @model keys="segmentGroupTypeId"
	 * @generated
	 */
	SegmentGroupType getSegmentGroupType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupType <em>Segment Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Type</em>' reference.
	 * @see #getSegmentGroupType()
	 * @generated
	 */
	void setSegmentGroupType(SegmentGroupType value);

	/**
	 * Returns the value of the '<em><b>Segment Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Id</em>' attribute.
	 * @see #setSegmentGroupId(String)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSegmentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupId <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Id</em>' attribute.
	 * @see #getSegmentGroupId()
	 * @generated
	 */
	void setSegmentGroupId(String value);

} // SegmentGroup
