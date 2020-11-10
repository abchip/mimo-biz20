/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision#getBudget <em>Budget</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision#getRevisionSeqId <em>Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision#getDateRevised <em>Date Revised</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetRevision()
 * @model
 * @generated
 */
public interface BudgetRevision extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' reference.
	 * @see #setBudget(Budget)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetRevision_Budget()
	 * @model keys="budgetId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Budget getBudget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision#getBudget <em>Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' reference.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(Budget value);

	/**
	 * Returns the value of the '<em><b>Date Revised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Revised</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Revised</em>' attribute.
	 * @see #setDateRevised(Date)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetRevision_DateRevised()
	 * @model
	 * @generated
	 */
	Date getDateRevised();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision#getDateRevised <em>Date Revised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Revised</em>' attribute.
	 * @see #getDateRevised()
	 * @generated
	 */
	void setDateRevised(Date value);

	/**
	 * Returns the value of the '<em><b>Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Seq Id</em>' attribute.
	 * @see #setRevisionSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.budget.BudgetPackage#getBudgetRevision_RevisionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRevisionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.budget.BudgetRevision#getRevisionSeqId <em>Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Seq Id</em>' attribute.
	 * @see #getRevisionSeqId()
	 * @generated
	 */
	void setRevisionSeqId(String value);

} // BudgetRevision
