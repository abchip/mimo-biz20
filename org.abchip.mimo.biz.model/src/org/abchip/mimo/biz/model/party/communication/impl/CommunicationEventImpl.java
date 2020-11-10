/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.communication.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.content.data.MimeType;
import org.abchip.mimo.biz.model.marketing.contact.ContactList;
import org.abchip.mimo.biz.model.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.model.party.communication.CommunicationEventType;
import org.abchip.mimo.biz.model.party.communication.CommunicationPackage;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getBccString <em>Bcc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getCcString <em>Cc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getCommunicationEventType <em>Communication Event Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getContactList <em>Contact List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getContactMechType <em>Contact Mech Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getContentMimeType <em>Content Mime Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getDatetimeEnded <em>Datetime Ended</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getDatetimeStarted <em>Datetime Started</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getFromString <em>From String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getHeaderString <em>Header String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getOrigCommEventId <em>Orig Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getParentCommEventId <em>Parent Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl#getToString <em>To String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventImpl extends EntityTypedImpl<CommunicationEventType> implements CommunicationEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBccString() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__BCC_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBccString(String newBccString) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__BCC_STRING, newBccString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcString() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CC_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcString(String newCcString) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CC_STRING, newCcString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventType getCommunicationEventType() {
		return (CommunicationEventType)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventType(CommunicationEventType newCommunicationEventType) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE, newCommunicationEventType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactList getContactList() {
		return (ContactList)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactList(ContactList newContactList) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_LIST, newContactList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechIdFrom() {
		return (ContactMech)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdFrom(ContactMech newContactMechIdFrom) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM, newContactMechIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechIdTo() {
		return (ContactMech)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdTo(ContactMech newContactMechIdTo) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO, newContactMechIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechType() {
		return (ContactMechType)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_MECH_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechType(ContactMechType newContactMechType) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTACT_MECH_TYPE, newContactMechType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeType getContentMimeType() {
		return (MimeType)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTENT_MIME_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentMimeType(MimeType newContentMimeType) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__CONTENT_MIME_TYPE, newContentMimeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeEnded() {
		return (Date)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__DATETIME_ENDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeEnded(Date newDatetimeEnded) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__DATETIME_ENDED, newDatetimeEnded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeStarted() {
		return (Date)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__DATETIME_STARTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeStarted(Date newDatetimeStarted) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__DATETIME_STARTED, newDatetimeStarted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return (Date)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ENTRY_DATE, newEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromString() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__FROM_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromString(String newFromString) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__FROM_STRING, newFromString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderString() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__HEADER_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderString(String newHeaderString) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__HEADER_STRING, newHeaderString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageId() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__MESSAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageId(String newMessageId) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__MESSAGE_ID, newMessageId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNote() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(String newNote) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigCommEventId() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigCommEventId(String newOrigCommEventId) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID, newOrigCommEventId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentCommEventId() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCommEventId(String newParentCommEventId) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID, newParentCommEventId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		return (Party)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__PARTY_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__PARTY_ID_FROM, newPartyIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		return (Party)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__PARTY_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__PARTY_ID_TO, newPartyIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnum() {
		return (Enumeration)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__REASON_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnum(Enumeration newReasonEnum) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__REASON_ENUM, newReasonEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdFrom() {
		return (RoleType)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(RoleType newRoleTypeIdFrom) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM, newRoleTypeIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdTo() {
		return (RoleType)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO, newRoleTypeIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToString() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__TO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToString(String newToString) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__TO_STRING, newToString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case CommunicationPackage.COMMUNICATION_EVENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case CommunicationPackage.COMMUNICATION_EVENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case CommunicationPackage.COMMUNICATION_EVENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case CommunicationPackage.COMMUNICATION_EVENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return CommunicationPackage.COMMUNICATION_EVENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return CommunicationPackage.COMMUNICATION_EVENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return CommunicationPackage.COMMUNICATION_EVENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return CommunicationPackage.COMMUNICATION_EVENT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID, newCommunicationEventId);
	}

} //CommunicationEventImpl
