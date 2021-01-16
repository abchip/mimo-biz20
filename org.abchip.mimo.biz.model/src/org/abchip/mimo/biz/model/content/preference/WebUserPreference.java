/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.preference;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web User Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getWebPreferenceType <em>Web Preference Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getUserLogin <em>User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getWebPreferenceValue <em>Web Preference Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.preference.PreferencePackage#getWebUserPreference()
 * @model
 * @generated
 */
public interface WebUserPreference extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Web Preference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Preference Type</em>' reference.
	 * @see #setWebPreferenceType(WebPreferenceType)
	 * @see org.abchip.mimo.biz.model.content.preference.PreferencePackage#getWebUserPreference_WebPreferenceType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebPreferenceType getWebPreferenceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getWebPreferenceType <em>Web Preference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Preference Type</em>' reference.
	 * @see #getWebPreferenceType()
	 * @generated
	 */
	void setWebPreferenceType(WebPreferenceType value);

	/**
	 * Returns the value of the '<em><b>User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login</em>' reference.
	 * @see #setUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.content.preference.PreferencePackage#getWebUserPreference_UserLogin()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getUserLogin <em>User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login</em>' reference.
	 * @see #getUserLogin()
	 * @generated
	 */
	void setUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.content.preference.PreferencePackage#getWebUserPreference_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.model.content.preference.PreferencePackage#getWebUserPreference_VisitId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='To be able to keep preferences for a non loggin in user for the current session'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Web Preference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Preference Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Preference Value</em>' attribute.
	 * @see #setWebPreferenceValue(String)
	 * @see org.abchip.mimo.biz.model.content.preference.PreferencePackage#getWebUserPreference_WebPreferenceValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getWebPreferenceValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.preference.WebUserPreference#getWebPreferenceValue <em>Web Preference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Preference Value</em>' attribute.
	 * @see #getWebPreferenceValue()
	 * @generated
	 */
	void setWebPreferenceValue(String value);

} // WebUserPreference
