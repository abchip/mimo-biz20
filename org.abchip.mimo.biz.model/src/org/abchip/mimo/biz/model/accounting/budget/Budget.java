/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget;

import java.util.List;
import org.abchip.mimo.biz.model.common.period.CustomTimePeriod;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetAttributes <em>Budget Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetItems <em>Budget Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetRevisions <em>Budget Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetStatuses <em>Budget Statuses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetType <em>Budget Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getCustomTimePeriod <em>Custom Time Period</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget()
 * @model
 * @generated
 */
public interface Budget extends EntityTyped<BudgetType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Custom Time Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Time Period</em>' reference.
	 * @see #setCustomTimePeriod(CustomTimePeriod)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_CustomTimePeriod()
	 * @model
	 * @generated
	 */
	CustomTimePeriod getCustomTimePeriod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getCustomTimePeriod <em>Custom Time Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Time Period</em>' reference.
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	void setCustomTimePeriod(CustomTimePeriod value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' attribute.
	 * @see #setBudgetId(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_BudgetId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.budget.BudgetAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_BudgetAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<BudgetAttribute> getBudgetAttributes();

	/**
	 * Returns the value of the '<em><b>Budget Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.budget.BudgetItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_BudgetItems()
	 * @model derived="true"
	 * @generated
	 */
	List<BudgetItem> getBudgetItems();

	/**
	 * Returns the value of the '<em><b>Budget Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Revisions</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_BudgetRevisions()
	 * @model derived="true"
	 * @generated
	 */
	List<BudgetRevision> getBudgetRevisions();

	/**
	 * Returns the value of the '<em><b>Budget Statuses</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.budget.BudgetStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Statuses</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_BudgetStatuses()
	 * @model derived="true"
	 * @generated
	 */
	List<BudgetStatus> getBudgetStatuses();

	/**
	 * Returns the value of the '<em><b>Budget Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Type</em>' reference.
	 * @see #setBudgetType(BudgetType)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudget_BudgetType()
	 * @model
	 * @generated
	 */
	BudgetType getBudgetType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.Budget#getBudgetType <em>Budget Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Type</em>' reference.
	 * @see #getBudgetType()
	 * @generated
	 */
	void setBudgetType(BudgetType value);

} // Budget
