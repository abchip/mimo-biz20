/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.login;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Login Security Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion#getQuestionEnum <em>Question Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion#getUserLogin <em>User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion#getSecurityAnswer <em>Security Answer</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginSecurityQuestion()
 * @model
 * @generated
 */
public interface UserLoginSecurityQuestion extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Question Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Enum</em>' reference.
	 * @see #setQuestionEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginSecurityQuestion_QuestionEnum()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getQuestionEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion#getQuestionEnum <em>Question Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Enum</em>' reference.
	 * @see #getQuestionEnum()
	 * @generated
	 */
	void setQuestionEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login</em>' reference.
	 * @see #setUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginSecurityQuestion_UserLogin()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion#getUserLogin <em>User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login</em>' reference.
	 * @see #getUserLogin()
	 * @generated
	 */
	void setUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Security Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Answer</em>' attribute.
	 * @see #setSecurityAnswer(String)
	 * @see org.abchip.mimo.biz.model.security.login.LoginPackage#getUserLoginSecurityQuestion_SecurityAnswer()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getSecurityAnswer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion#getSecurityAnswer <em>Security Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Answer</em>' attribute.
	 * @see #getSecurityAnswer()
	 * @generated
	 */
	void setSecurityAnswer(String value);

} // UserLoginSecurityQuestion
