/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.contact;

import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact List Comm Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getContactList <em>Contact List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getCommunicationEvent <em>Communication Event</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getChangeByUserLogin <em>Change By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus()
 * @model annotation="mimo-ent-frame title='Contact List'"
 * @generated
 */
public interface ContactListCommStatus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Contact List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List</em>' reference.
	 * @see #setContactList(ContactList)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_ContactList()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactList getContactList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getContactList <em>Contact List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List</em>' reference.
	 * @see #getContactList()
	 * @generated
	 */
	void setContactList(ContactList value);

	/**
	 * Returns the value of the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event</em>' reference.
	 * @see #setCommunicationEvent(CommunicationEvent)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_CommunicationEvent()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CommunicationEvent getCommunicationEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getCommunicationEvent <em>Communication Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event</em>' reference.
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	void setCommunicationEvent(CommunicationEvent value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_ContactMech()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login</em>' reference.
	 * @see #setChangeByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_ChangeByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getChangeByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getChangeByUserLogin <em>Change By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login</em>' reference.
	 * @see #getChangeByUserLogin()
	 * @generated
	 */
	void setChangeByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_MessageId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListCommStatus_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListCommStatus#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

} // ContactListCommStatus
