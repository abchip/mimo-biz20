/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getBudget <em>Budget</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getChangeByUserLogin <em>Change By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getStatusDate <em>Status Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetStatus()
 * @model
 * @generated
 */
public interface BudgetStatus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' reference.
	 * @see #setBudget(Budget)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetStatus_Budget()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Budget getBudget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getBudget <em>Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' reference.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(Budget value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetStatus_Status()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login</em>' reference.
	 * @see #setChangeByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetStatus_ChangeByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getChangeByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getChangeByUserLogin <em>Change By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login</em>' reference.
	 * @see #getChangeByUserLogin()
	 * @generated
	 */
	void setChangeByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetStatus_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

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
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetStatus_StatusDate()
	 * @model
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

} // BudgetStatus
