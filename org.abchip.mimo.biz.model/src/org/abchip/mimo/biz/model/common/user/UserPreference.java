/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.user;

import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserLogin <em>User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefTypeId <em>User Pref Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefDataType <em>User Pref Data Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefGroupType <em>User Pref Group Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefValue <em>User Pref Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.user.UserPackage#getUserPreference()
 * @model annotation="mimo-ent-frame help='The UserPreference entity contains one entry per preference per\n          userLogin. User preferences are stored as key/value pairs (userPrefTypeId/userPrefValue).\n          All values are stored as strings. Value strings can be converted to\n          other data types by specifying a java data type in the userPrefDataType field.' title='Application preferences for a given userLogin.'"
 * @generated
 */
public interface UserPreference extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login</em>' reference.
	 * @see #setUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.common.user.UserPackage#getUserPreference_UserLogin()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserLogin <em>User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login</em>' reference.
	 * @see #getUserLogin()
	 * @generated
	 */
	void setUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>User Pref Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Data Type</em>' attribute.
	 * @see #setUserPrefDataType(String)
	 * @see org.abchip.mimo.biz.model.common.user.UserPackage#getUserPreference_UserPrefDataType()
	 * @model annotation="mimo-ent-slot help='The java data type of this preference (empty = java.lang.String)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getUserPrefDataType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefDataType <em>User Pref Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Data Type</em>' attribute.
	 * @see #getUserPrefDataType()
	 * @generated
	 */
	void setUserPrefDataType(String value);

	/**
	 * Returns the value of the '<em><b>User Pref Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Group Type</em>' reference.
	 * @see #setUserPrefGroupType(UserPrefGroupType)
	 * @see org.abchip.mimo.biz.model.common.user.UserPackage#getUserPreference_UserPrefGroupType()
	 * @model annotation="mimo-ent-slot help='Used to assemble groups of preferences'"
	 * @generated
	 */
	UserPrefGroupType getUserPrefGroupType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefGroupType <em>User Pref Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Group Type</em>' reference.
	 * @see #getUserPrefGroupType()
	 * @generated
	 */
	void setUserPrefGroupType(UserPrefGroupType value);

	/**
	 * Returns the value of the '<em><b>User Pref Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Type Id</em>' attribute.
	 * @see #setUserPrefTypeId(String)
	 * @see org.abchip.mimo.biz.model.common.user.UserPackage#getUserPreference_UserPrefTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='A unique identifier for this preference'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getUserPrefTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefTypeId <em>User Pref Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Type Id</em>' attribute.
	 * @see #getUserPrefTypeId()
	 * @generated
	 */
	void setUserPrefTypeId(String value);

	/**
	 * Returns the value of the '<em><b>User Pref Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Value</em>' attribute.
	 * @see #setUserPrefValue(String)
	 * @see org.abchip.mimo.biz.model.common.user.UserPackage#getUserPreference_UserPrefValue()
	 * @model annotation="mimo-ent-slot help='Contains the value of this preference'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUserPrefValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.user.UserPreference#getUserPrefValue <em>User Pref Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Value</em>' attribute.
	 * @see #getUserPrefValue()
	 * @generated
	 */
	void setUserPrefValue(String value);

} // UserPreference
