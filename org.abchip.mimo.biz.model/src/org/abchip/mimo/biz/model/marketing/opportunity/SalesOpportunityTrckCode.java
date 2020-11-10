/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Trck Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getSalesOpportunity <em>Sales Opportunity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getReceivedDate <em>Received Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityTrckCode()
 * @model annotation="mimo-ent-frame title='Sales opportunity traking code'"
 * @generated
 */
public interface SalesOpportunityTrckCode extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity</em>' reference.
	 * @see #setSalesOpportunity(SalesOpportunity)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityTrckCode_SalesOpportunity()
	 * @model keys="salesOpportunityId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SalesOpportunity getSalesOpportunity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getSalesOpportunity <em>Sales Opportunity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity</em>' reference.
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	void setSalesOpportunity(SalesOpportunity value);

	/**
	 * Returns the value of the '<em><b>Received Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Date</em>' attribute.
	 * @see #setReceivedDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityTrckCode_ReceivedDate()
	 * @model
	 * @generated
	 */
	Date getReceivedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getReceivedDate <em>Received Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date</em>' attribute.
	 * @see #getReceivedDate()
	 * @generated
	 */
	void setReceivedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Id</em>' attribute.
	 * @see #setTrackingCodeId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityTrckCode_TrackingCodeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTrackingCodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getTrackingCodeId <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code Id</em>' attribute.
	 * @see #getTrackingCodeId()
	 * @generated
	 */
	void setTrackingCodeId(String value);

} // SalesOpportunityTrckCode
