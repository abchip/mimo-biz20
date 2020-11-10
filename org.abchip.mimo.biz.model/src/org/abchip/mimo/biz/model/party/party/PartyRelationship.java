/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyRelationshipType <em>Party Relationship Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPermissionsEnumId <em>Permissions Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPositionTitle <em>Position Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPriorityType <em>Priority Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship()
 * @model
 * @generated
 */
public interface PartyRelationship extends EntityTyped<PartyRelationshipType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Party Relationship Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Relationship Type</em>' reference.
	 * @see #setPartyRelationshipType(PartyRelationshipType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_PartyRelationshipType()
	 * @model keys="partyRelationshipTypeId"
	 * @generated
	 */
	PartyRelationshipType getPartyRelationshipType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyRelationshipType <em>Party Relationship Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Relationship Type</em>' reference.
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	void setPartyRelationshipType(PartyRelationshipType value);

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Permissions Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions Enum Id</em>' attribute.
	 * @see #setPermissionsEnumId(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_PermissionsEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPermissionsEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPermissionsEnumId <em>Permissions Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions Enum Id</em>' attribute.
	 * @see #getPermissionsEnumId()
	 * @generated
	 */
	void setPermissionsEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Position Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Title</em>' attribute.
	 * @see #setPositionTitle(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_PositionTitle()
	 * @model annotation="mimo-ent-slot help='The exact word used within the company'"
	 *        annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getPositionTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPositionTitle <em>Position Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Title</em>' attribute.
	 * @see #getPositionTitle()
	 * @generated
	 */
	void setPositionTitle(String value);

	/**
	 * Returns the value of the '<em><b>Priority Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Type</em>' reference.
	 * @see #setPriorityType(PriorityType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_PriorityType()
	 * @model keys="priorityTypeId"
	 * @generated
	 */
	PriorityType getPriorityType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPriorityType <em>Priority Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Type</em>' reference.
	 * @see #getPriorityType()
	 * @generated
	 */
	void setPriorityType(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_RelationshipName()
	 * @model annotation="mimo-ent-slot help='Official name of relationship, such as title in a company'"
	 *        annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' reference.
	 * @see #setSecurityGroup(SecurityGroup)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_SecurityGroup()
	 * @model keys="groupId"
	 * @generated
	 */
	SecurityGroup getSecurityGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getSecurityGroup <em>Security Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' reference.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_PartyIdFrom()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_PartyIdTo()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id From</em>' reference.
	 * @see #setRoleTypeIdFrom(RoleType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_RoleTypeIdFrom()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleTypeIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdFrom <em>Role Type Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id From</em>' reference.
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 */
	void setRoleTypeIdFrom(RoleType value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' reference.
	 * @see #setRoleTypeIdTo(RoleType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationship_RoleTypeIdTo()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdTo <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' reference.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(RoleType value);

} // PartyRelationship
