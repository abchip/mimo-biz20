/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Classification Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationType <em>Party Classification Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PartyClassificationGroup extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationGroup_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group</em>' reference.
	 * @see #setParentGroup(PartyClassificationGroup)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationGroup_ParentGroup()
	 * @model
	 * @generated
	 */
	PartyClassificationGroup getParentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getParentGroup <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group</em>' reference.
	 * @see #getParentGroup()
	 * @generated
	 */
	void setParentGroup(PartyClassificationGroup value);

	/**
	 * Returns the value of the '<em><b>Party Classification Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Type</em>' reference.
	 * @see #setPartyClassificationType(PartyClassificationType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationGroup_PartyClassificationType()
	 * @model
	 * @generated
	 */
	PartyClassificationType getPartyClassificationType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationType <em>Party Classification Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Type</em>' reference.
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	void setPartyClassificationType(PartyClassificationType value);

	/**
	 * Returns the value of the '<em><b>Party Classification Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Classification Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Group Id</em>' attribute.
	 * @see #setPartyClassificationGroupId(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationGroup_PartyClassificationGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyClassificationGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationGroupId <em>Party Classification Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Group Id</em>' attribute.
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 */
	void setPartyClassificationGroupId(String value);

} // PartyClassificationGroup
