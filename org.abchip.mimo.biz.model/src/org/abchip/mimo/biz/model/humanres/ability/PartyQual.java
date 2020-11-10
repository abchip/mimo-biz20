/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Qual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getPartyQualType <em>Party Qual Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getQualificationDesc <em>Qualification Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getTitle <em>Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getVerifStatus <em>Verif Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual()
 * @model annotation="mimo-ent-frame title='Party Qualification'"
 * @generated
 */
public interface PartyQual extends EntityTyped<PartyQualType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Party Qual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Qual Type</em>' reference.
	 * @see #setPartyQualType(PartyQualType)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_PartyQualType()
	 * @model keys="partyQualTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyQualType getPartyQualType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getPartyQualType <em>Party Qual Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Qual Type</em>' reference.
	 * @see #getPartyQualType()
	 * @generated
	 */
	void setPartyQualType(PartyQualType value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Qualification Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Desc</em>' attribute.
	 * @see #setQualificationDesc(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_QualificationDesc()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getQualificationDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getQualificationDesc <em>Qualification Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification Desc</em>' attribute.
	 * @see #getQualificationDesc()
	 * @generated
	 */
	void setQualificationDesc(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_Status()
	 * @model keys="statusId"
	 *        annotation="mimo-ent-slot help='Status e.g. completed, part-time etc.'"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getStatus <em>Status</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_Title()
	 * @model annotation="mimo-ent-slot help='Title of degree or job'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Verif Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verif Status</em>' reference.
	 * @see #setVerifStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyQual_VerifStatus()
	 * @model keys="statusId"
	 *        annotation="mimo-ent-slot help='Verification done for this entry if any'"
	 * @generated
	 */
	StatusItem getVerifStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getVerifStatus <em>Verif Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verif Status</em>' reference.
	 * @see #getVerifStatus()
	 * @generated
	 */
	void setVerifStatus(StatusItem value);

} // PartyQual
