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
import org.abchip.mimo.biz.model.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Forecast History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecastHistoryId <em>Sales Forecast History Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getBestCaseAmount <em>Best Case Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getChangeNote <em>Change Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getClosedAmount <em>Closed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCustomTimePeriod <em>Custom Time Period</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getInternalParty <em>Internal Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedByUserLogin <em>Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecast <em>Sales Forecast</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory()
 * @model annotation="mimo-ent-frame title='Keeps a record of changes to a sales forecast.'"
 * @generated
 */
public interface SalesForecastHistory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Best Case Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Case Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Case Amount</em>' attribute.
	 * @see #setBestCaseAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_BestCaseAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getBestCaseAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getBestCaseAmount <em>Best Case Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Case Amount</em>' attribute.
	 * @see #getBestCaseAmount()
	 * @generated
	 */
	void setBestCaseAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_ChangeNote()
	 * @model annotation="mimo-ent-slot help='Used to track a reason for this change'"
	 * @generated
	 */
	String getChangeNote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getChangeNote <em>Change Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Note</em>' attribute.
	 * @see #getChangeNote()
	 * @generated
	 */
	void setChangeNote(String value);

	/**
	 * Returns the value of the '<em><b>Closed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Amount</em>' attribute.
	 * @see #setClosedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_ClosedAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getClosedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getClosedAmount <em>Closed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Amount</em>' attribute.
	 * @see #getClosedAmount()
	 * @generated
	 */
	void setClosedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Custom Time Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Time Period</em>' reference.
	 * @see #setCustomTimePeriod(CustomTimePeriod)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_CustomTimePeriod()
	 * @model keys="customTimePeriodId"
	 * @generated
	 */
	CustomTimePeriod getCustomTimePeriod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCustomTimePeriod <em>Custom Time Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Time Period</em>' reference.
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	void setCustomTimePeriod(CustomTimePeriod value);

	/**
	 * Returns the value of the '<em><b>Forecast Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Amount</em>' attribute.
	 * @see #setForecastAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_ForecastAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getForecastAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getForecastAmount <em>Forecast Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Amount</em>' attribute.
	 * @see #getForecastAmount()
	 * @generated
	 */
	void setForecastAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Internal Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Party</em>' reference.
	 * @see #setInternalParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_InternalParty()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getInternalParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getInternalParty <em>Internal Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Party</em>' reference.
	 * @see #getInternalParty()
	 * @generated
	 */
	void setInternalParty(Party value);

	/**
	 * Returns the value of the '<em><b>Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By User Login</em>' reference.
	 * @see #setModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_ModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedByUserLogin <em>Modified By User Login</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_ModifiedTimestamp()
	 * @model
	 * @generated
	 */
	Date getModifiedTimestamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedTimestamp <em>Modified Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Timestamp</em>' attribute.
	 * @see #getModifiedTimestamp()
	 * @generated
	 */
	void setModifiedTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_OrganizationParty()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Parent Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Sales Forecast Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sales Forecast Id</em>' attribute.
	 * @see #setParentSalesForecastId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_ParentSalesForecastId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getParentSalesForecastId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sales Forecast Id</em>' attribute.
	 * @see #getParentSalesForecastId()
	 * @generated
	 */
	void setParentSalesForecastId(String value);

	/**
	 * Returns the value of the '<em><b>Percent Of Quota Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Of Quota Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Of Quota Closed</em>' attribute.
	 * @see #setPercentOfQuotaClosed(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_PercentOfQuotaClosed()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getPercentOfQuotaClosed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Quota Closed</em>' attribute.
	 * @see #getPercentOfQuotaClosed()
	 * @generated
	 */
	void setPercentOfQuotaClosed(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Percent Of Quota Forecast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Of Quota Forecast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Of Quota Forecast</em>' attribute.
	 * @see #setPercentOfQuotaForecast(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_PercentOfQuotaForecast()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getPercentOfQuotaForecast();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Quota Forecast</em>' attribute.
	 * @see #getPercentOfQuotaForecast()
	 * @generated
	 */
	void setPercentOfQuotaForecast(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quota Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quota Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quota Amount</em>' attribute.
	 * @see #setQuotaAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_QuotaAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getQuotaAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getQuotaAmount <em>Quota Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Amount</em>' attribute.
	 * @see #getQuotaAmount()
	 * @generated
	 */
	void setQuotaAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast</em>' reference.
	 * @see #setSalesForecast(SalesForecast)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_SalesForecast()
	 * @model keys="salesForecastId"
	 * @generated
	 */
	SalesForecast getSalesForecast();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecast <em>Sales Forecast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast</em>' reference.
	 * @see #getSalesForecast()
	 * @generated
	 */
	void setSalesForecast(SalesForecast value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast History Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast History Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast History Id</em>' attribute.
	 * @see #setSalesForecastHistoryId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastHistory_SalesForecastHistoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSalesForecastHistoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecastHistoryId <em>Sales Forecast History Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast History Id</em>' attribute.
	 * @see #getSalesForecastHistoryId()
	 * @generated
	 */
	void setSalesForecastHistoryId(String value);

} // SalesForecastHistory
