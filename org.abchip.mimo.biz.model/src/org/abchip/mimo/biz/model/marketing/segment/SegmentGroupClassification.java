/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.segment;

import org.abchip.mimo.biz.model.party.party.PartyClassificationGroup;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getSegmentGroup <em>Segment Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getPartyClassificationGroup <em>Party Classification Group</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupClassification()
 * @model
 * @generated
 */
public interface SegmentGroupClassification extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Segment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group</em>' reference.
	 * @see #setSegmentGroup(SegmentGroup)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupClassification_SegmentGroup()
	 * @model keys="segmentGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SegmentGroup getSegmentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getSegmentGroup <em>Segment Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group</em>' reference.
	 * @see #getSegmentGroup()
	 * @generated
	 */
	void setSegmentGroup(SegmentGroup value);

	/**
	 * Returns the value of the '<em><b>Party Classification Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Group</em>' reference.
	 * @see #setPartyClassificationGroup(PartyClassificationGroup)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupClassification_PartyClassificationGroup()
	 * @model keys="partyClassificationGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyClassificationGroup getPartyClassificationGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getPartyClassificationGroup <em>Party Classification Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Group</em>' reference.
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	void setPartyClassificationGroup(PartyClassificationGroup value);

} // SegmentGroupClassification
