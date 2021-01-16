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
 * A representation of the model object '<em><b>Party Classification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getPartyClassificationTypeId <em>Party Classification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getHasContactMech <em>Has Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationType()
 * @model annotation="mimo-ent-frame dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface PartyClassificationType extends EntityType<PartyClassificationGroup>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Contact Mech</em>' attribute.
	 * @see #setHasContactMech(Boolean)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationType_HasContactMech()
	 * @model
	 * @generated
	 */
	Boolean getHasContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getHasContactMech <em>Has Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Contact Mech</em>' attribute.
	 * @see #getHasContactMech()
	 * @generated
	 */
	void setHasContactMech(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(PartyClassificationType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationType_ParentType()
	 * @model
	 * @generated
	 */
	PartyClassificationType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(PartyClassificationType value);

	/**
	 * Returns the value of the '<em><b>Party Classification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Classification Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Type Id</em>' attribute.
	 * @see #setPartyClassificationTypeId(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyClassificationType_PartyClassificationTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyClassificationTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getPartyClassificationTypeId <em>Party Classification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Type Id</em>' attribute.
	 * @see #getPartyClassificationTypeId()
	 * @generated
	 */
	void setPartyClassificationTypeId(String value);

} // PartyClassificationType
