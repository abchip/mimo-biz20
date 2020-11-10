/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import java.util.Date;
import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeId <em>Resume Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeDate <em>Resume Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeText <em>Resume Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyResume()
 * @model annotation="mimo-ent-frame title='Resume'"
 * @generated
 */
public interface PartyResume extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Resume Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Date</em>' attribute.
	 * @see #setResumeDate(Date)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyResume_ResumeDate()
	 * @model
	 * @generated
	 */
	Date getResumeDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeDate <em>Resume Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Date</em>' attribute.
	 * @see #getResumeDate()
	 * @generated
	 */
	void setResumeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Resume Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Id</em>' attribute.
	 * @see #setResumeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyResume_ResumeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getResumeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeId <em>Resume Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Id</em>' attribute.
	 * @see #getResumeId()
	 * @generated
	 */
	void setResumeId(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyResume_Content()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyResume_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Resume Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Text</em>' attribute.
	 * @see #setResumeText(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartyResume_ResumeText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getResumeText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeText <em>Resume Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Text</em>' attribute.
	 * @see #getResumeText()
	 * @generated
	 */
	void setResumeText(String value);

} // PartyResume
