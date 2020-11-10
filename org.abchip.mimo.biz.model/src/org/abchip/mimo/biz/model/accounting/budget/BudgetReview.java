/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getBudget <em>Budget</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getBudgetReviewResultType <em>Budget Review Result Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getBudgetReviewId <em>Budget Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getReviewDate <em>Review Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetReview()
 * @model
 * @generated
 */
public interface BudgetReview extends EntityTyped<BudgetReviewResultType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' reference.
	 * @see #setBudget(Budget)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetReview_Budget()
	 * @model keys="budgetId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Budget getBudget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getBudget <em>Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' reference.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(Budget value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetReview_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Budget Review Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Review Result Type</em>' reference.
	 * @see #setBudgetReviewResultType(BudgetReviewResultType)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetReview_BudgetReviewResultType()
	 * @model keys="budgetReviewResultTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	BudgetReviewResultType getBudgetReviewResultType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getBudgetReviewResultType <em>Budget Review Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Review Result Type</em>' reference.
	 * @see #getBudgetReviewResultType()
	 * @generated
	 */
	void setBudgetReviewResultType(BudgetReviewResultType value);

	/**
	 * Returns the value of the '<em><b>Budget Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Review Id</em>' attribute.
	 * @see #setBudgetReviewId(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetReview_BudgetReviewId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getBudgetReviewId <em>Budget Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Review Id</em>' attribute.
	 * @see #getBudgetReviewId()
	 * @generated
	 */
	void setBudgetReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Date</em>' attribute.
	 * @see #setReviewDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetReview_ReviewDate()
	 * @model
	 * @generated
	 */
	Date getReviewDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetReview#getReviewDate <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' attribute.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(Date value);

} // BudgetReview
