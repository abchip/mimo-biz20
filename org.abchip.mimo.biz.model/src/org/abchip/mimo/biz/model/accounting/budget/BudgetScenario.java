/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenario#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenario#getBudgetScenarioRules <em>Budget Scenario Rules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenario#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenario()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface BudgetScenario extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenario_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenario#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Budget Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Scenario Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario Id</em>' attribute.
	 * @see #setBudgetScenarioId(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenario_BudgetScenarioId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetScenarioId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenario#getBudgetScenarioId <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario Id</em>' attribute.
	 * @see #getBudgetScenarioId()
	 * @generated
	 */
	void setBudgetScenarioId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Scenario Rules</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.budget.BudgetScenarioRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario Rules</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetScenario_BudgetScenarioRules()
	 * @model derived="true"
	 * @generated
	 */
	List<BudgetScenarioRule> getBudgetScenarioRules();

} // BudgetScenario
