/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillType <em>Skill Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getRating <em>Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getStartedUsingDate <em>Started Using Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getYearsExperience <em>Years Experience</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill()
 * @model
 * @generated
 */
public interface PartySkill extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Skill Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Type</em>' reference.
	 * @see #setSkillType(SkillType)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill_SkillType()
	 * @model keys="skillTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SkillType getSkillType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillType <em>Skill Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Type</em>' reference.
	 * @see #getSkillType()
	 * @generated
	 */
	void setSkillType(SkillType value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(long)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill_Rating()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRating();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(long value);

	/**
	 * Returns the value of the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Level</em>' attribute.
	 * @see #setSkillLevel(long)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill_SkillLevel()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSkillLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillLevel <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Level</em>' attribute.
	 * @see #getSkillLevel()
	 * @generated
	 */
	void setSkillLevel(long value);

	/**
	 * Returns the value of the '<em><b>Started Using Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Using Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Using Date</em>' attribute.
	 * @see #setStartedUsingDate(Date)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill_StartedUsingDate()
	 * @model
	 * @generated
	 */
	Date getStartedUsingDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getStartedUsingDate <em>Started Using Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started Using Date</em>' attribute.
	 * @see #getStartedUsingDate()
	 * @generated
	 */
	void setStartedUsingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Years Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years Experience</em>' attribute.
	 * @see #setYearsExperience(long)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPartySkill_YearsExperience()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getYearsExperience();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getYearsExperience <em>Years Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years Experience</em>' attribute.
	 * @see #getYearsExperience()
	 * @generated
	 */
	void setYearsExperience(long value);

} // PartySkill
