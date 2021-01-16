/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.campaign.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.marketing.campaign.CampaignPackage;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketing Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getBudgetedCost <em>Budgeted Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getCampaignName <em>Campaign Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getCampaignSummary <em>Campaign Summary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getConvertedLeads <em>Converted Leads</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getExpectedResponsePercent <em>Expected Response Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getExpectedRevenue <em>Expected Revenue</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getMarketingCampaignNotes <em>Marketing Campaign Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getMarketingCampaignPrices <em>Marketing Campaign Prices</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getMarketingCampaignPromos <em>Marketing Campaign Promos</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getNumSent <em>Num Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getParentCampaign <em>Parent Campaign</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketingCampaignImpl extends EntityIdentifiableImpl implements MarketingCampaign {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketingCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CampaignPackage.Literals.MARKETING_CAMPAIGN;
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
	public BigDecimal getActualCost() {
		return (BigDecimal)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__ACTUAL_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCost(BigDecimal newActualCost) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__ACTUAL_COST, newActualCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBudgetedCost() {
		return (BigDecimal)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__BUDGETED_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetedCost(BigDecimal newBudgetedCost) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__BUDGETED_COST, newBudgetedCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCampaignName() {
		return (String)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CAMPAIGN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCampaignName(String newCampaignName) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CAMPAIGN_NAME, newCampaignName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCampaignSummary() {
		return (String)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCampaignSummary(String newCampaignSummary) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY, newCampaignSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConvertedLeads() {
		return (String)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CONVERTED_LEADS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertedLeads(String newConvertedLeads) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CONVERTED_LEADS, newConvertedLeads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return (String)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedCost() {
		return (BigDecimal)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__ESTIMATED_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCost(BigDecimal newEstimatedCost) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__ESTIMATED_COST, newEstimatedCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExpectedResponsePercent() {
		return (Double)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedResponsePercent(double newExpectedResponsePercent) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT, newExpectedResponsePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExpectedRevenue() {
		return (BigDecimal)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__EXPECTED_REVENUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedRevenue(BigDecimal newExpectedRevenue) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__EXPECTED_REVENUE, newExpectedRevenue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return (Boolean)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__IS_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__IS_ACTIVE, newIsActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MarketingCampaignNote> getMarketingCampaignNotes() {
		return (List<MarketingCampaignNote>)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MarketingCampaignPrice> getMarketingCampaignPrices() {
		return (List<MarketingCampaignPrice>)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_PRICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MarketingCampaignPromo> getMarketingCampaignPromos() {
		return (List<MarketingCampaignPromo>)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_PROMOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarketingCampaignId() {
		return (String)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketingCampaignId(String newMarketingCampaignId) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID, newMarketingCampaignId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumSent() {
		return (Long)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__NUM_SENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumSent(long newNumSent) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__NUM_SENT, newNumSent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaign getParentCampaign() {
		return (MarketingCampaign)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__PARENT_CAMPAIGN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCampaign(MarketingCampaign newParentCampaign) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__PARENT_CAMPAIGN, newParentCampaign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(CampaignPackage.Literals.MARKETING_CAMPAIGN__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(CampaignPackage.Literals.MARKETING_CAMPAIGN__THRU_DATE, newThruDate);
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
				case CampaignPackage.MARKETING_CAMPAIGN__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case CampaignPackage.MARKETING_CAMPAIGN__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case CampaignPackage.MARKETING_CAMPAIGN__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case CampaignPackage.MARKETING_CAMPAIGN__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return CampaignPackage.MARKETING_CAMPAIGN__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return CampaignPackage.MARKETING_CAMPAIGN__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return CampaignPackage.MARKETING_CAMPAIGN__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return CampaignPackage.MARKETING_CAMPAIGN__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MarketingCampaignImpl
