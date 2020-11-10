/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.finaccount;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getFinAccount <em>Fin Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getChangeByUserLogin <em>Change By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusEndDate <em>Status End Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountStatus()
 * @model annotation="mimo-ent-frame title='Financial Account Status'"
 * @generated
 */
public interface FinAccountStatus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account</em>' reference.
	 * @see #setFinAccount(FinAccount)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountStatus_FinAccount()
	 * @model keys="finAccountId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FinAccount getFinAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getFinAccount <em>Fin Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account</em>' reference.
	 * @see #getFinAccount()
	 * @generated
	 */
	void setFinAccount(FinAccount value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountStatus_Status()
	 * @model keys="statusId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountStatus_StatusDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login</em>' reference.
	 * @see #setChangeByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountStatus_ChangeByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getChangeByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getChangeByUserLogin <em>Change By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login</em>' reference.
	 * @see #getChangeByUserLogin()
	 * @generated
	 */
	void setChangeByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Status End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status End Date</em>' attribute.
	 * @see #setStatusEndDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountStatus_StatusEndDate()
	 * @model
	 * @generated
	 */
	Date getStatusEndDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusEndDate <em>Status End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status End Date</em>' attribute.
	 * @see #getStatusEndDate()
	 * @generated
	 */
	void setStatusEndDate(Date value);

} // FinAccountStatus
