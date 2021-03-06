/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getPartyIdentificationType <em>Party Identification Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyIdentification()
 * @model
 * @generated
 */
public interface PartyIdentification extends EntityTyped<PartyIdentificationType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party Identification Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Identification Type</em>' reference.
	 * @see #setPartyIdentificationType(PartyIdentificationType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyIdentification_PartyIdentificationType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyIdentificationType getPartyIdentificationType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getPartyIdentificationType <em>Party Identification Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Identification Type</em>' reference.
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	void setPartyIdentificationType(PartyIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyIdentification_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Value</em>' attribute.
	 * @see #setIdValue(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyIdentification_IdValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getIdValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getIdValue <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Value</em>' attribute.
	 * @see #getIdValue()
	 * @generated
	 */
	void setIdValue(String value);

} // PartyIdentification
