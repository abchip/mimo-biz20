/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getMarketingCampaign <em>Marketing Campaign</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getNextStepDate <em>Next Step Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getOpportunityName <em>Opportunity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getOpportunityStage <em>Opportunity Stage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityCompetitors <em>Sales Opportunity Competitors</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityQuotes <em>Sales Opportunity Quotes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityTrckCodes <em>Sales Opportunity Trck Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityWorkEfforts <em>Sales Opportunity Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl#getTypeEnum <em>Type Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityImpl extends EntityIdentifiableImpl implements SalesOpportunity {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataSourceId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__DATA_SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(String newDataSourceId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__DATA_SOURCE_ID, newDataSourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedAmount() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__ESTIMATED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedAmount(BigDecimal newEstimatedAmount) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__ESTIMATED_AMOUNT, newEstimatedAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedCloseDate() {
		return (Date)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCloseDate(Date newEstimatedCloseDate) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE, newEstimatedCloseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedProbability() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedProbability(BigDecimal newEstimatedProbability) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY, newEstimatedProbability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaign getMarketingCampaign() {
		return (MarketingCampaign)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__MARKETING_CAMPAIGN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketingCampaign(MarketingCampaign newMarketingCampaign) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__MARKETING_CAMPAIGN, newMarketingCampaign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextStep() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__NEXT_STEP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextStep(String newNextStep) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__NEXT_STEP, newNextStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNextStepDate() {
		return (Date)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__NEXT_STEP_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextStepDate(Date newNextStepDate) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__NEXT_STEP_DATE, newNextStepDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpportunityName() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__OPPORTUNITY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpportunityName(String newOpportunityName) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__OPPORTUNITY_NAME, newOpportunityName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityStage getOpportunityStage() {
		return (SalesOpportunityStage)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__OPPORTUNITY_STAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpportunityStage(SalesOpportunityStage newOpportunityStage) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__OPPORTUNITY_STAGE, newOpportunityStage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SalesOpportunityCompetitor> getSalesOpportunityCompetitors() {
		return (List<SalesOpportunityCompetitor>)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SalesOpportunityQuote> getSalesOpportunityQuotes() {
		return (List<SalesOpportunityQuote>)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SalesOpportunityTrckCode> getSalesOpportunityTrckCodes() {
		return (List<SalesOpportunityTrckCode>)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SalesOpportunityWorkEffort> getSalesOpportunityWorkEfforts() {
		return (List<SalesOpportunityWorkEffort>)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTypeEnum() {
		return (Enumeration)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__TYPE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeEnum(Enumeration newTypeEnum) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__TYPE_ENUM, newTypeEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesOpportunityId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(String newSalesOpportunityId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID, newSalesOpportunityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case OpportunityPackage.SALES_OPPORTUNITY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OpportunityPackage.SALES_OPPORTUNITY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OpportunityPackage.SALES_OPPORTUNITY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OpportunityPackage.SALES_OPPORTUNITY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OpportunityPackage.SALES_OPPORTUNITY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OpportunityPackage.SALES_OPPORTUNITY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OpportunityPackage.SALES_OPPORTUNITY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OpportunityPackage.SALES_OPPORTUNITY__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SalesOpportunityImpl
