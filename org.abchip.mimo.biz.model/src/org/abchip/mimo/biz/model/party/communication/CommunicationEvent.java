/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.communication;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.content.data.MimeType;
import org.abchip.mimo.biz.model.marketing.contact.ContactList;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getBccString <em>Bcc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCcString <em>Cc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventType <em>Communication Event Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactList <em>Contact List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechType <em>Contact Mech Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContentMimeType <em>Content Mime Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeEnded <em>Datetime Ended</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeStarted <em>Datetime Started</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getFromString <em>From String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getHeaderString <em>Header String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getOrigCommEventId <em>Orig Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getParentCommEventId <em>Parent Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getToString <em>To String</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent()
 * @model
 * @generated
 */
public interface CommunicationEvent extends EntityTyped<CommunicationEventType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Bcc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcc String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcc String</em>' attribute.
	 * @see #setBccString(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_BccString()
	 * @model
	 * @generated
	 */
	String getBccString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getBccString <em>Bcc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bcc String</em>' attribute.
	 * @see #getBccString()
	 * @generated
	 */
	void setBccString(String value);

	/**
	 * Returns the value of the '<em><b>Cc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc String</em>' attribute.
	 * @see #setCcString(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_CcString()
	 * @model
	 * @generated
	 */
	String getCcString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCcString <em>Cc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc String</em>' attribute.
	 * @see #getCcString()
	 * @generated
	 */
	void setCcString(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Type</em>' reference.
	 * @see #setCommunicationEventType(CommunicationEventType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_CommunicationEventType()
	 * @model keys="communicationEventTypeId"
	 * @generated
	 */
	CommunicationEventType getCommunicationEventType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventType <em>Communication Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Type</em>' reference.
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	void setCommunicationEventType(CommunicationEventType value);

	/**
	 * Returns the value of the '<em><b>Contact List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List</em>' reference.
	 * @see #setContactList(ContactList)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ContactList()
	 * @model keys="contactListId"
	 * @generated
	 */
	ContactList getContactList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactList <em>Contact List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List</em>' reference.
	 * @see #getContactList()
	 * @generated
	 */
	void setContactList(ContactList value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id From</em>' reference.
	 * @see #setContactMechIdFrom(ContactMech)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ContactMechIdFrom()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdFrom <em>Contact Mech Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id From</em>' reference.
	 * @see #getContactMechIdFrom()
	 * @generated
	 */
	void setContactMechIdFrom(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id To</em>' reference.
	 * @see #setContactMechIdTo(ContactMech)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ContactMechIdTo()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdTo <em>Contact Mech Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id To</em>' reference.
	 * @see #getContactMechIdTo()
	 * @generated
	 */
	void setContactMechIdTo(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type</em>' reference.
	 * @see #setContactMechType(ContactMechType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ContactMechType()
	 * @model keys="contactMechTypeId"
	 * @generated
	 */
	ContactMechType getContactMechType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechType <em>Contact Mech Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type</em>' reference.
	 * @see #getContactMechType()
	 * @generated
	 */
	void setContactMechType(ContactMechType value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Content Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Mime Type</em>' reference.
	 * @see #setContentMimeType(MimeType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ContentMimeType()
	 * @model keys="mimeTypeId"
	 * @generated
	 */
	MimeType getContentMimeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContentMimeType <em>Content Mime Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Mime Type</em>' reference.
	 * @see #getContentMimeType()
	 * @generated
	 */
	void setContentMimeType(MimeType value);

	/**
	 * Returns the value of the '<em><b>Datetime Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Ended</em>' attribute.
	 * @see #setDatetimeEnded(Date)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_DatetimeEnded()
	 * @model
	 * @generated
	 */
	Date getDatetimeEnded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeEnded <em>Datetime Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Ended</em>' attribute.
	 * @see #getDatetimeEnded()
	 * @generated
	 */
	void setDatetimeEnded(Date value);

	/**
	 * Returns the value of the '<em><b>Datetime Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Started</em>' attribute.
	 * @see #setDatetimeStarted(Date)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_DatetimeStarted()
	 * @model
	 * @generated
	 */
	Date getDatetimeStarted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeStarted <em>Datetime Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Started</em>' attribute.
	 * @see #getDatetimeStarted()
	 * @generated
	 */
	void setDatetimeStarted(Date value);

	/**
	 * Returns the value of the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Date</em>' attribute.
	 * @see #setEntryDate(Date)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getEntryDate <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Date</em>' attribute.
	 * @see #getEntryDate()
	 * @generated
	 */
	void setEntryDate(Date value);

	/**
	 * Returns the value of the '<em><b>From String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From String</em>' attribute.
	 * @see #setFromString(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_FromString()
	 * @model
	 * @generated
	 */
	String getFromString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getFromString <em>From String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From String</em>' attribute.
	 * @see #getFromString()
	 * @generated
	 */
	void setFromString(String value);

	/**
	 * Returns the value of the '<em><b>Header String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header String</em>' attribute.
	 * @see #setHeaderString(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_HeaderString()
	 * @model
	 * @generated
	 */
	String getHeaderString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getHeaderString <em>Header String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header String</em>' attribute.
	 * @see #getHeaderString()
	 * @generated
	 */
	void setHeaderString(String value);

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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_MessageId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_Note()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Orig Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orig Comm Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orig Comm Event Id</em>' attribute.
	 * @see #setOrigCommEventId(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_OrigCommEventId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrigCommEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getOrigCommEventId <em>Orig Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orig Comm Event Id</em>' attribute.
	 * @see #getOrigCommEventId()
	 * @generated
	 */
	void setOrigCommEventId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Comm Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Comm Event Id</em>' attribute.
	 * @see #setParentCommEventId(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ParentCommEventId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getParentCommEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getParentCommEventId <em>Parent Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Comm Event Id</em>' attribute.
	 * @see #getParentCommEventId()
	 * @generated
	 */
	void setParentCommEventId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdFrom <em>Party Id From</em>}' reference.
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
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_PartyIdTo()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Enum</em>' reference.
	 * @see #setReasonEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ReasonEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getReasonEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getReasonEnum <em>Reason Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Enum</em>' reference.
	 * @see #getReasonEnum()
	 * @generated
	 */
	void setReasonEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id From</em>' reference.
	 * @see #setRoleTypeIdFrom(RoleType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_RoleTypeIdFrom()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdFrom <em>Role Type Id From</em>}' reference.
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
	 * If the meaning of the '<em>Role Type Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' reference.
	 * @see #setRoleTypeIdTo(RoleType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_RoleTypeIdTo()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdTo <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' reference.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(RoleType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_Subject()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To String</em>' attribute.
	 * @see #setToString(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_ToString()
	 * @model
	 * @generated
	 */
	String getToString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getToString <em>To String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To String</em>' attribute.
	 * @see #getToString()
	 * @generated
	 */
	void setToString(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEvent_CommunicationEventId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

} // CommunicationEvent
