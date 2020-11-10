/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity;

import java.math.BigDecimal;
import java.util.List;
import org.abchip.mimo.biz.model.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Forecast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastId <em>Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getBestCaseAmount <em>Best Case Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getClosedAmount <em>Closed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCustomTimePeriod <em>Custom Time Period</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getInternalParty <em>Internal Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getModifiedByUserLogin <em>Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getParentSalesForecast <em>Parent Sales Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPipelineAmount <em>Pipeline Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastDetails <em>Sales Forecast Details</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast()
 * @model annotation="mimo-ent-frame title='Stores sales forecast data for sales opportunities.'"
 * @generated
 */
public interface SalesForecast extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_BestCaseAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getBestCaseAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getBestCaseAmount <em>Best Case Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Case Amount</em>' attribute.
	 * @see #getBestCaseAmount()
	 * @generated
	 */
	void setBestCaseAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_ClosedAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getClosedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getClosedAmount <em>Closed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Amount</em>' attribute.
	 * @see #getClosedAmount()
	 * @generated
	 */
	void setClosedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCurrencyUom <em>Currency Uom</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_CustomTimePeriod()
	 * @model keys="customTimePeriodId"
	 * @generated
	 */
	CustomTimePeriod getCustomTimePeriod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCustomTimePeriod <em>Custom Time Period</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_ForecastAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getForecastAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getForecastAmount <em>Forecast Amount</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_InternalParty()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getInternalParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getInternalParty <em>Internal Party</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_ModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getModifiedByUserLogin <em>Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By User Login</em>' reference.
	 * @see #getModifiedByUserLogin()
	 * @generated
	 */
	void setModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_OrganizationParty()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Parent Sales Forecast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sales Forecast</em>' reference.
	 * @see #setParentSalesForecast(SalesForecast)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_ParentSalesForecast()
	 * @model keys="salesForecastId"
	 * @generated
	 */
	SalesForecast getParentSalesForecast();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getParentSalesForecast <em>Parent Sales Forecast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sales Forecast</em>' reference.
	 * @see #getParentSalesForecast()
	 * @generated
	 */
	void setParentSalesForecast(SalesForecast value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_PercentOfQuotaClosed()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getPercentOfQuotaClosed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_PercentOfQuotaForecast()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getPercentOfQuotaForecast();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Quota Forecast</em>' attribute.
	 * @see #getPercentOfQuotaForecast()
	 * @generated
	 */
	void setPercentOfQuotaForecast(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pipeline Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline Amount</em>' attribute.
	 * @see #setPipelineAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_PipelineAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getPipelineAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPipelineAmount <em>Pipeline Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline Amount</em>' attribute.
	 * @see #getPipelineAmount()
	 * @generated
	 */
	void setPipelineAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_QuotaAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getQuotaAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getQuotaAmount <em>Quota Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Amount</em>' attribute.
	 * @see #getQuotaAmount()
	 * @generated
	 */
	void setQuotaAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast Details</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Details</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_SalesForecastDetails()
	 * @model derived="true"
	 * @generated
	 */
	List<SalesForecastDetail> getSalesForecastDetails();

	/**
	 * Returns the value of the '<em><b>Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Id</em>' attribute.
	 * @see #setSalesForecastId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecast_SalesForecastId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSalesForecastId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastId <em>Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast Id</em>' attribute.
	 * @see #getSalesForecastId()
	 * @generated
	 */
	void setSalesForecastId(String value);

} // SalesForecast
