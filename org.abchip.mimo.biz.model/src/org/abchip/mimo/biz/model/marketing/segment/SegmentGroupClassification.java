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
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupClassification()
 * @model
 * @generated
 */
public interface SegmentGroupClassification extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party Classification Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Classification Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Group Id</em>' reference.
	 * @see #setPartyClassificationGroupId(PartyClassificationGroup)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupClassification_PartyClassificationGroupId()
	 * @model keys="partyClassificationGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyClassificationGroup getPartyClassificationGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getPartyClassificationGroupId <em>Party Classification Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Group Id</em>' reference.
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 */
	void setPartyClassificationGroupId(PartyClassificationGroup value);

	/**
	 * Returns the value of the '<em><b>Segment Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Id</em>' reference.
	 * @see #setSegmentGroupId(SegmentGroup)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupClassification_SegmentGroupId()
	 * @model keys="segmentGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SegmentGroup getSegmentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getSegmentGroupId <em>Segment Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Id</em>' reference.
	 * @see #getSegmentGroupId()
	 * @generated
	 */
	void setSegmentGroupId(SegmentGroup value);

} // SegmentGroupClassification
