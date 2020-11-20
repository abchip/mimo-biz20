/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity;

import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunity <em>Sales Opportunity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityWorkEffort()
 * @model annotation="mimo-ent-frame title='Relates sales opportunities to their work efforts.'"
 * @generated
 */
public interface SalesOpportunityWorkEffort extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity</em>' reference.
	 * @see #setSalesOpportunity(SalesOpportunity)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityWorkEffort_SalesOpportunity()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SalesOpportunity getSalesOpportunity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunity <em>Sales Opportunity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity</em>' reference.
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	void setSalesOpportunity(SalesOpportunity value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityWorkEffort_WorkEffort()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

} // SalesOpportunityWorkEffort
