/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.login.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.security.login.LoginPackage;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.security.login.UserLoginSecurityQuestion;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login Security Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getQuestionEnumId <em>Question Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginSecurityQuestionImpl#getSecurityAnswer <em>Security Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginSecurityQuestionImpl extends EntityIdentifiableImpl implements UserLoginSecurityQuestion {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginSecurityQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getQuestionEnumId() {
		return (Enumeration)eGet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionEnumId(Enumeration newQuestionEnumId) {
		eSet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID, newQuestionEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityAnswer() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityAnswer(String newSecurityAnswer) {
		eSet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER, newSecurityAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case LoginPackage.USER_LOGIN_SECURITY_QUESTION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case LoginPackage.USER_LOGIN_SECURITY_QUESTION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case LoginPackage.USER_LOGIN_SECURITY_QUESTION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case LoginPackage.USER_LOGIN_SECURITY_QUESTION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return LoginPackage.USER_LOGIN_SECURITY_QUESTION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return LoginPackage.USER_LOGIN_SECURITY_QUESTION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return LoginPackage.USER_LOGIN_SECURITY_QUESTION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return LoginPackage.USER_LOGIN_SECURITY_QUESTION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		return (UserLogin)eGet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		eSet(LoginPackage.Literals.USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID, newUserLoginId);
	}

} //UserLoginSecurityQuestionImpl
