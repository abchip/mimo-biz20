/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget;

import java.math.BigDecimal;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Scenario Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudgetScenario <em>Budget Scenario</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getAmountChange <em>Amount Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudget <em>Budget</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getPercentageChange <em>Percentage Change</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication()
 * @model
 * @generated
 */
public interface BudgetScenarioApplication extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Budget Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario</em>' reference.
	 * @see #setBudgetScenario(BudgetScenario)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetScenario()
	 * @model keys="budgetScenarioId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	BudgetScenario getBudgetScenario();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudgetScenario <em>Budget Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario</em>' reference.
	 * @see #getBudgetScenario()
	 * @generated
	 */
	void setBudgetScenario(BudgetScenario value);

	/**
	 * Returns the value of the '<em><b>Amount Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Change</em>' attribute.
	 * @see #setAmountChange(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication_AmountChange()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmountChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getAmountChange <em>Amount Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Change</em>' attribute.
	 * @see #getAmountChange()
	 * @generated
	 */
	void setAmountChange(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' reference.
	 * @see #setBudget(Budget)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication_Budget()
	 * @model keys="budgetId"
	 * @generated
	 */
	Budget getBudget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudget <em>Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' reference.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(Budget value);

	/**
	 * Returns the value of the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #setBudgetItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudgetItemSeqId <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #getBudgetItemSeqId()
	 * @generated
	 */
	void setBudgetItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Scenario Applic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Scenario Applic Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario Applic Id</em>' attribute.
	 * @see #setBudgetScenarioApplicId(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetScenarioApplicId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetScenarioApplicId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario Applic Id</em>' attribute.
	 * @see #getBudgetScenarioApplicId()
	 * @generated
	 */
	void setBudgetScenarioApplicId(String value);

	/**
	 * Returns the value of the '<em><b>Percentage Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Change</em>' attribute.
	 * @see #setPercentageChange(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenarioApplication_PercentageChange()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getPercentageChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioApplication#getPercentageChange <em>Percentage Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Change</em>' attribute.
	 * @see #getPercentageChange()
	 * @generated
	 */
	void setPercentageChange(BigDecimal value);

} // BudgetScenarioApplication
