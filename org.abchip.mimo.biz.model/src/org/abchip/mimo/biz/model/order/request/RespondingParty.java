/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request;

import java.util.Date;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responding Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getCustRequest <em>Cust Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getRespondingPartySeqId <em>Responding Party Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getDateSent <em>Date Sent</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getRespondingParty()
 * @model
 * @generated
 */
public interface RespondingParty extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request</em>' reference.
	 * @see #setCustRequest(CustRequest)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getRespondingParty_CustRequest()
	 * @model keys="custRequestId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CustRequest getCustRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getCustRequest <em>Cust Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request</em>' reference.
	 * @see #getCustRequest()
	 * @generated
	 */
	void setCustRequest(CustRequest value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getRespondingParty_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Sent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Sent</em>' attribute.
	 * @see #setDateSent(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getRespondingParty_DateSent()
	 * @model
	 * @generated
	 */
	Date getDateSent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getDateSent <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sent</em>' attribute.
	 * @see #getDateSent()
	 * @generated
	 */
	void setDateSent(Date value);

	/**
	 * Returns the value of the '<em><b>Responding Party Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Party Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Party Seq Id</em>' attribute.
	 * @see #setRespondingPartySeqId(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getRespondingParty_RespondingPartySeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRespondingPartySeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getRespondingPartySeqId <em>Responding Party Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Party Seq Id</em>' attribute.
	 * @see #getRespondingPartySeqId()
	 * @generated
	 */
	void setRespondingPartySeqId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getRespondingParty_ContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.RespondingParty#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

} // RespondingParty
