/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.segment;

import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group Geo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getSegmentGroup <em>Segment Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getGeo <em>Geo</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupGeo()
 * @model
 * @generated
 */
public interface SegmentGroupGeo extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Segment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group</em>' reference.
	 * @see #setSegmentGroup(SegmentGroup)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupGeo_SegmentGroup()
	 * @model keys="segmentGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SegmentGroup getSegmentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getSegmentGroup <em>Segment Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group</em>' reference.
	 * @see #getSegmentGroup()
	 * @generated
	 */
	void setSegmentGroup(SegmentGroup value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geo)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupGeo_Geo()
	 * @model keys="geoId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Geo getGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geo value);

} // SegmentGroupGeo
