/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.login;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Login History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getUserLogin <em>User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getOriginUserLogin <em>Origin User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getPasswordUsed <em>Password Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getSuccessfulLogin <em>Successful Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory()
 * @model
 * @generated
 */
public interface UserLoginHistory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login</em>' reference.
	 * @see #setUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_UserLogin()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getUserLogin <em>User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login</em>' reference.
	 * @see #getUserLogin()
	 * @generated
	 */
	void setUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Origin User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin User Login</em>' reference.
	 * @see #setOriginUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_OriginUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getOriginUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getOriginUserLogin <em>Origin User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin User Login</em>' reference.
	 * @see #getOriginUserLogin()
	 * @generated
	 */
	void setOriginUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Password Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Used</em>' attribute.
	 * @see #setPasswordUsed(String)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_PasswordUsed()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPasswordUsed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getPasswordUsed <em>Password Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Used</em>' attribute.
	 * @see #getPasswordUsed()
	 * @generated
	 */
	void setPasswordUsed(String value);

	/**
	 * Returns the value of the '<em><b>Successful Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful Login</em>' attribute.
	 * @see #setSuccessfulLogin(Boolean)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_SuccessfulLogin()
	 * @model
	 * @generated
	 */
	Boolean getSuccessfulLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getSuccessfulLogin <em>Successful Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful Login</em>' attribute.
	 * @see #getSuccessfulLogin()
	 * @generated
	 */
	void setSuccessfulLogin(Boolean value);

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
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginHistory_VisitId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginHistory#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

} // UserLoginHistory
