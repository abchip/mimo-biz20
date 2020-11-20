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
 * A representation of the model object '<em><b>Party Invitation Group Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyInvitation <em>Party Invitation</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyInvitationGroupAssoc()
 * @model
 * @generated
 */
public interface PartyInvitationGroupAssoc extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(PartyGroup)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyInvitationGroupAssoc_PartyIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyGroup getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(PartyGroup value);

	/**
	 * Returns the value of the '<em><b>Party Invitation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Invitation</em>' reference.
	 * @see #setPartyInvitation(PartyInvitation)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyInvitationGroupAssoc_PartyInvitation()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyInvitation getPartyInvitation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyInvitation <em>Party Invitation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Invitation</em>' reference.
	 * @see #getPartyInvitation()
	 * @generated
	 */
	void setPartyInvitation(PartyInvitation value);

} // PartyInvitationGroupAssoc
