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
import java.util.List;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getMarketingCampaign <em>Marketing Campaign</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStepDate <em>Next Step Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityName <em>Opportunity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityStage <em>Opportunity Stage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityCompetitors <em>Sales Opportunity Competitors</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityQuotes <em>Sales Opportunity Quotes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityTrckCodes <em>Sales Opportunity Trck Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityWorkEfforts <em>Sales Opportunity Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getTypeEnum <em>Type Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity()
 * @model annotation="mimo-ent-frame title='Main entity of information about sales opportunities' formula='description'"
 * @generated
 */
public interface SalesOpportunity extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_DataSourceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_EstimatedAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getEstimatedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedAmount <em>Estimated Amount</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_EstimatedCloseDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedCloseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate <em>Estimated Close Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_EstimatedProbability()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getEstimatedProbability();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedProbability <em>Estimated Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Probability</em>' attribute.
	 * @see #getEstimatedProbability()
	 * @generated
	 */
	void setEstimatedProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign</em>' reference.
	 * @see #setMarketingCampaign(MarketingCampaign)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_MarketingCampaign()
	 * @model keys="marketingCampaignId"
	 * @generated
	 */
	MarketingCampaign getMarketingCampaign();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getMarketingCampaign <em>Marketing Campaign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign</em>' reference.
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	void setMarketingCampaign(MarketingCampaign value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_NextStep()
	 * @model
	 * @generated
	 */
	String getNextStep();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStep <em>Next Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' attribute.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(String value);

	/**
	 * Returns the value of the '<em><b>Next Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step Date</em>' attribute.
	 * @see #setNextStepDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_NextStepDate()
	 * @model
	 * @generated
	 */
	Date getNextStepDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStepDate <em>Next Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step Date</em>' attribute.
	 * @see #getNextStepDate()
	 * @generated
	 */
	void setNextStepDate(Date value);

	/**
	 * Returns the value of the '<em><b>Opportunity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opportunity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity Name</em>' attribute.
	 * @see #setOpportunityName(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_OpportunityName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getOpportunityName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityName <em>Opportunity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity Name</em>' attribute.
	 * @see #getOpportunityName()
	 * @generated
	 */
	void setOpportunityName(String value);

	/**
	 * Returns the value of the '<em><b>Opportunity Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity Stage</em>' reference.
	 * @see #setOpportunityStage(SalesOpportunityStage)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_OpportunityStage()
	 * @model keys="opportunityStageId"
	 * @generated
	 */
	SalesOpportunityStage getOpportunityStage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityStage <em>Opportunity Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity Stage</em>' reference.
	 * @see #getOpportunityStage()
	 * @generated
	 */
	void setOpportunityStage(SalesOpportunityStage value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Competitors</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Competitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Competitors</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityCompetitors()
	 * @model derived="true"
	 * @generated
	 */
	List<SalesOpportunityCompetitor> getSalesOpportunityCompetitors();

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Quotes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Quotes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Quotes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityQuotes()
	 * @model derived="true"
	 * @generated
	 */
	List<SalesOpportunityQuote> getSalesOpportunityQuotes();

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Trck Codes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Trck Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Trck Codes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityTrckCodes()
	 * @model derived="true"
	 * @generated
	 */
	List<SalesOpportunityTrckCode> getSalesOpportunityTrckCodes();

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Work Efforts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Work Efforts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Work Efforts</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityWorkEfforts()
	 * @model derived="true"
	 * @generated
	 */
	List<SalesOpportunityWorkEffort> getSalesOpportunityWorkEfforts();

	/**
	 * Returns the value of the '<em><b>Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Enum</em>' reference.
	 * @see #setTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_TypeEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getTypeEnum <em>Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Enum</em>' reference.
	 * @see #getTypeEnum()
	 * @generated
	 */
	void setTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #setSalesOpportunityId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityId <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(String value);

} // SalesOpportunity
