/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipName <em>Party Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidFrom <em>Role Type Id Valid From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidTo <em>Role Type Id Valid To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType()
 * @model annotation="mimo-ent-frame dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface PartyRelationshipType extends EntityType<PartyRelationship>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(PartyRelationshipType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_ParentType()
	 * @model
	 * @generated
	 */
	PartyRelationshipType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(PartyRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Party Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Relationship Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Relationship Name</em>' attribute.
	 * @see #setPartyRelationshipName(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_PartyRelationshipName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getPartyRelationshipName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipName <em>Party Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Relationship Name</em>' attribute.
	 * @see #getPartyRelationshipName()
	 * @generated
	 */
	void setPartyRelationshipName(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id Valid From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id Valid From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id Valid From</em>' reference.
	 * @see #setRoleTypeIdValidFrom(RoleType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_RoleTypeIdValidFrom()
	 * @model
	 * @generated
	 */
	RoleType getRoleTypeIdValidFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidFrom <em>Role Type Id Valid From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id Valid From</em>' reference.
	 * @see #getRoleTypeIdValidFrom()
	 * @generated
	 */
	void setRoleTypeIdValidFrom(RoleType value);

	/**
	 * Returns the value of the '<em><b>Role Type Id Valid To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id Valid To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id Valid To</em>' reference.
	 * @see #setRoleTypeIdValidTo(RoleType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_RoleTypeIdValidTo()
	 * @model
	 * @generated
	 */
	RoleType getRoleTypeIdValidTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidTo <em>Role Type Id Valid To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id Valid To</em>' reference.
	 * @see #getRoleTypeIdValidTo()
	 * @generated
	 */
	void setRoleTypeIdValidTo(RoleType value);

	/**
	 * Returns the value of the '<em><b>Party Relationship Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Relationship Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Relationship Type Id</em>' attribute.
	 * @see #setPartyRelationshipTypeId(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyRelationshipType_PartyRelationshipTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyRelationshipTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Relationship Type Id</em>' attribute.
	 * @see #getPartyRelationshipTypeId()
	 * @generated
	 */
	void setPartyRelationshipTypeId(String value);

} // PartyRelationshipType
