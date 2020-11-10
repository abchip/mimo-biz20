/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityHistoryId <em>Sales Opportunity History Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getChangeNote <em>Change Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedByUserLogin <em>Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getOpportunityStage <em>Opportunity Stage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunity <em>Sales Opportunity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory()
 * @model annotation="mimo-ent-frame title='Tracks a history of sales opportunity information' formula='description'"
 * @generated
 */
public interface SalesOpportunityHistory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Change Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Note</em>' attribute.
	 * @see #setChangeNote(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_ChangeNote()
	 * @model annotation="mimo-ent-slot help='Used to track a reason for this change'"
	 * @generated
	 */
	String getChangeNote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getChangeNote <em>Change Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Note</em>' attribute.
	 * @see #getChangeNote()
	 * @generated
	 */
	void setChangeNote(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Amount</em>' attribute.
	 * @see #setEstimatedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_EstimatedAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getEstimatedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedAmount <em>Estimated Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Amount</em>' attribute.
	 * @see #getEstimatedAmount()
	 * @generated
	 */
	void setEstimatedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Estimated Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Close Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Close Date</em>' attribute.
	 * @see #setEstimatedCloseDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_EstimatedCloseDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedCloseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedCloseDate <em>Estimated Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Close Date</em>' attribute.
	 * @see #getEstimatedCloseDate()
	 * @generated
	 */
	void setEstimatedCloseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Probability</em>' attribute.
	 * @see #setEstimatedProbability(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_EstimatedProbability()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getEstimatedProbability();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedProbability <em>Estimated Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Probability</em>' attribute.
	 * @see #getEstimatedProbability()
	 * @generated
	 */
	void setEstimatedProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By User Login</em>' reference.
	 * @see #setModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_ModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedByUserLogin <em>Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By User Login</em>' reference.
	 * @see #getModifiedByUserLogin()
	 * @generated
	 */
	void setModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Modified Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Timestamp</em>' attribute.
	 * @see #setModifiedTimestamp(Date)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_ModifiedTimestamp()
	 * @model
	 * @generated
	 */
	Date getModifiedTimestamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedTimestamp <em>Modified Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Timestamp</em>' attribute.
	 * @see #getModifiedTimestamp()
	 * @generated
	 */
	void setModifiedTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' attribute.
	 * @see #setNextStep(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_NextStep()
	 * @model
	 * @generated
	 */
	String getNextStep();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getNextStep <em>Next Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' attribute.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(String value);

	/**
	 * Returns the value of the '<em><b>Opportunity Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity Stage</em>' reference.
	 * @see #setOpportunityStage(SalesOpportunityStage)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_OpportunityStage()
	 * @model keys="opportunityStageId"
	 * @generated
	 */
	SalesOpportunityStage getOpportunityStage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getOpportunityStage <em>Opportunity Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity Stage</em>' reference.
	 * @see #getOpportunityStage()
	 * @generated
	 */
	void setOpportunityStage(SalesOpportunityStage value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity</em>' reference.
	 * @see #setSalesOpportunity(SalesOpportunity)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_SalesOpportunity()
	 * @model keys="salesOpportunityId"
	 * @generated
	 */
	SalesOpportunity getSalesOpportunity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunity <em>Sales Opportunity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity</em>' reference.
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	void setSalesOpportunity(SalesOpportunity value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity History Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity History Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity History Id</em>' attribute.
	 * @see #setSalesOpportunityHistoryId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunityHistory_SalesOpportunityHistoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSalesOpportunityHistoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityHistoryId <em>Sales Opportunity History Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity History Id</em>' attribute.
	 * @see #getSalesOpportunityHistoryId()
	 * @generated
	 */
	void setSalesOpportunityHistoryId(String value);

} // SalesOpportunityHistory
