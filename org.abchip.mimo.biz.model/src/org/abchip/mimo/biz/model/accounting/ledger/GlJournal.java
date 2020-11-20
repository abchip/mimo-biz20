/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Journal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getGlJournalId <em>Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getGlJournalName <em>Gl Journal Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getPostedDate <em>Posted Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlJournal()
 * @model annotation="mimo-ent-frame title='General Ledger Journal'"
 * @generated
 */
public interface GlJournal extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Gl Journal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Journal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal Name</em>' attribute.
	 * @see #setGlJournalName(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlJournal_GlJournalName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getGlJournalName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getGlJournalName <em>Gl Journal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal Name</em>' attribute.
	 * @see #getGlJournalName()
	 * @generated
	 */
	void setGlJournalName(String value);

	/**
	 * Returns the value of the '<em><b>Is Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Posted</em>' attribute.
	 * @see #setIsPosted(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlJournal_IsPosted()
	 * @model
	 * @generated
	 */
	Boolean getIsPosted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getIsPosted <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Posted</em>' attribute.
	 * @see #getIsPosted()
	 * @generated
	 */
	void setIsPosted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlJournal_OrganizationParty()
	 * @model
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date</em>' attribute.
	 * @see #setPostedDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlJournal_PostedDate()
	 * @model
	 * @generated
	 */
	Date getPostedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getPostedDate <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date</em>' attribute.
	 * @see #getPostedDate()
	 * @generated
	 */
	void setPostedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Gl Journal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Journal Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal Id</em>' attribute.
	 * @see #setGlJournalId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlJournal_GlJournalId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGlJournalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlJournal#getGlJournalId <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal Id</em>' attribute.
	 * @see #getGlJournalId()
	 * @generated
	 */
	void setGlJournalId(String value);

} // GlJournal
