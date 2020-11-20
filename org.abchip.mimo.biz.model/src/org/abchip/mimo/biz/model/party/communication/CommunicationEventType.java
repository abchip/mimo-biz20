/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.communication;

import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getCommunicationEventTypeId <em>Communication Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getContactMechType <em>Contact Mech Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventType()
 * @model annotation="mimo-ent-frame dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface CommunicationEventType extends EntityType<CommunicationEvent>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(CommunicationEventType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventType_ParentType()
	 * @model
	 * @generated
	 */
	CommunicationEventType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(CommunicationEventType value);

	/**
	 * Returns the value of the '<em><b>Communication Event Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Type Id</em>' attribute.
	 * @see #setCommunicationEventTypeId(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventType_CommunicationEventTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCommunicationEventTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getCommunicationEventTypeId <em>Communication Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Type Id</em>' attribute.
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 */
	void setCommunicationEventTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type</em>' reference.
	 * @see #setContactMechType(ContactMechType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventType_ContactMechType()
	 * @model
	 * @generated
	 */
	ContactMechType getContactMechType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getContactMechType <em>Contact Mech Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type</em>' reference.
	 * @see #getContactMechType()
	 * @generated
	 */
	void setContactMechType(ContactMechType value);

} // CommunicationEventType
