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
import org.abchip.mimo.biz.model.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Forecast History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getSalesForecastHistoryId <em>Sales Forecast History Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getBestCaseAmount <em>Best Case Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getChangeNote <em>Change Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getClosedAmount <em>Closed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getCustomTimePeriod <em>Custom Time Period</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getInternalParty <em>Internal Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getModifiedByUserLogin <em>Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl#getSalesForecast <em>Sales Forecast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesForecastHistoryImpl extends EntityIdentifiableImpl implements SalesForecastHistory {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesForecastHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_FORECAST_HISTORY;
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
	public BigDecimal getBestCaseAmount() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestCaseAmount(BigDecimal newBestCaseAmount) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT, newBestCaseAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeNote() {
		return (String)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CHANGE_NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeNote(String newChangeNote) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CHANGE_NOTE, newChangeNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getClosedAmount() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CLOSED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedAmount(BigDecimal newClosedAmount) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CLOSED_AMOUNT, newClosedAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTimePeriod getCustomTimePeriod() {
		return (CustomTimePeriod)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriod(CustomTimePeriod newCustomTimePeriod) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD, newCustomTimePeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getForecastAmount() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__FORECAST_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecastAmount(BigDecimal newForecastAmount) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__FORECAST_AMOUNT, newForecastAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getInternalParty() {
		return (Party)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__INTERNAL_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalParty(Party newInternalParty) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__INTERNAL_PARTY, newInternalParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getModifiedByUserLogin() {
		return (UserLogin)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedByUserLogin(UserLogin newModifiedByUserLogin) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN, newModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getModifiedTimestamp() {
		return (Date)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedTimestamp(Date newModifiedTimestamp) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP, newModifiedTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationParty() {
		return (Party)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationParty(Party newOrganizationParty) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY, newOrganizationParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentSalesForecastId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSalesForecastId(String newParentSalesForecastId) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID, newParentSalesForecastId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentOfQuotaClosed() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentOfQuotaClosed(BigDecimal newPercentOfQuotaClosed) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED, newPercentOfQuotaClosed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentOfQuotaForecast() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentOfQuotaForecast(BigDecimal newPercentOfQuotaForecast) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST, newPercentOfQuotaForecast);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuotaAmount() {
		return (BigDecimal)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__QUOTA_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaAmount(BigDecimal newQuotaAmount) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__QUOTA_AMOUNT, newQuotaAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecast getSalesForecast() {
		return (SalesForecast)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__SALES_FORECAST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecast(SalesForecast newSalesForecast) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__SALES_FORECAST, newSalesForecast);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesForecastHistoryId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecastHistoryId(String newSalesForecastHistoryId) {
		eSet(OpportunityPackage.Literals.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID, newSalesForecastHistoryId);
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
				case OpportunityPackage.SALES_FORECAST_HISTORY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OpportunityPackage.SALES_FORECAST_HISTORY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OpportunityPackage.SALES_FORECAST_HISTORY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OpportunityPackage.SALES_FORECAST_HISTORY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OpportunityPackage.SALES_FORECAST_HISTORY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OpportunityPackage.SALES_FORECAST_HISTORY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OpportunityPackage.SALES_FORECAST_HISTORY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OpportunityPackage.SALES_FORECAST_HISTORY__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SalesForecastHistoryImpl
