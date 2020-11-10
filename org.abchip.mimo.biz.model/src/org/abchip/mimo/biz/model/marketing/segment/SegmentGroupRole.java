/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.segment;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getSegmentGroup <em>Segment Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getRoleType <em>Role Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupRole()
 * @model
 * @generated
 */
public interface SegmentGroupRole extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Segment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group</em>' reference.
	 * @see #setSegmentGroup(SegmentGroup)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupRole_SegmentGroup()
	 * @model keys="segmentGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SegmentGroup getSegmentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getSegmentGroup <em>Segment Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group</em>' reference.
	 * @see #getSegmentGroup()
	 * @generated
	 */
	void setSegmentGroup(SegmentGroup value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupRole_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentPackage#getSegmentGroupRole_RoleType()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

} // SegmentGroupRole
