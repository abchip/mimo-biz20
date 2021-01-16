/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Acctg Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getBaseCurrencyUom <em>Base Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getCogsMethod <em>Cogs Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getEnableAccounting <em>Enable Accounting</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getErrorGlJournal <em>Error Gl Journal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getInvoiceSeqCustMeth <em>Invoice Seq Cust Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastInvoiceNumber <em>Last Invoice Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastOrderNumber <em>Last Order Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getLastQuoteNumber <em>Last Quote Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldInvoiceSequenceEnum <em>Old Invoice Sequence Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldOrderSequenceEnum <em>Old Order Sequence Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOldQuoteSequenceEnum <em>Old Quote Sequence Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOrderIdPrefix <em>Order Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getOrderSeqCustMeth <em>Order Seq Cust Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getQuoteIdPrefix <em>Quote Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getQuoteSeqCustMeth <em>Quote Seq Cust Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getRefundPaymentMethod <em>Refund Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getTaxForm <em>Tax Form</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.PartyAcctgPreferenceImpl#getUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyAcctgPreferenceImpl extends EntityIdentifiableImpl implements PartyAcctgPreference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyAcctgPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE;
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
	public Boolean getEnableAccounting() {
		return (Boolean)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAccounting(Boolean newEnableAccounting) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING, newEnableAccounting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlJournal getErrorGlJournal() {
		return (GlJournal)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorGlJournal(GlJournal newErrorGlJournal) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL, newErrorGlJournal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFiscalYearStartDay() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalYearStartDay(long newFiscalYearStartDay) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY, newFiscalYearStartDay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFiscalYearStartMonth() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalYearStartMonth(long newFiscalYearStartMonth) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH, newFiscalYearStartMonth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceIdPrefix() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceIdPrefix(String newInvoiceIdPrefix) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX, newInvoiceIdPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getInvoiceSeqCustMeth() {
		return (CustomMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceSeqCustMeth(CustomMethod newInvoiceSeqCustMeth) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH, newInvoiceSeqCustMeth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastInvoiceNumber() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInvoiceNumber(long newLastInvoiceNumber) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER, newLastInvoiceNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastInvoiceRestartDate() {
		return (Date)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInvoiceRestartDate(Date newLastInvoiceRestartDate) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE, newLastInvoiceRestartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastOrderNumber() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOrderNumber(long newLastOrderNumber) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER, newLastOrderNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastQuoteNumber() {
		return (Long)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastQuoteNumber(long newLastQuoteNumber) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER, newLastQuoteNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOldInvoiceSequenceEnum() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldInvoiceSequenceEnum(Enumeration newOldInvoiceSequenceEnum) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM, newOldInvoiceSequenceEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOldOrderSequenceEnum() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldOrderSequenceEnum(Enumeration newOldOrderSequenceEnum) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM, newOldOrderSequenceEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOldQuoteSequenceEnum() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuoteSequenceEnum(Enumeration newOldQuoteSequenceEnum) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM, newOldQuoteSequenceEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderIdPrefix() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderIdPrefix(String newOrderIdPrefix) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX, newOrderIdPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getOrderSeqCustMeth() {
		return (CustomMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderSeqCustMeth(CustomMethod newOrderSeqCustMeth) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH, newOrderSeqCustMeth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getBaseCurrencyUom() {
		return (Uom)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCurrencyUom(Uom newBaseCurrencyUom) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM, newBaseCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getCogsMethod() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__COGS_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCogsMethod(Enumeration newCogsMethod) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__COGS_METHOD, newCogsMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteIdPrefix() {
		return (String)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteIdPrefix(String newQuoteIdPrefix) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX, newQuoteIdPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getQuoteSeqCustMeth() {
		return (CustomMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteSeqCustMeth(CustomMethod newQuoteSeqCustMeth) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH, newQuoteSeqCustMeth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getRefundPaymentMethod() {
		return (PaymentMethod)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundPaymentMethod(PaymentMethod newRefundPaymentMethod) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD, newRefundPaymentMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTaxForm() {
		return (Enumeration)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__TAX_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxForm(Enumeration newTaxForm) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__TAX_FORM, newTaxForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseInvoiceIdForReturns() {
		return (Boolean)eGet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseInvoiceIdForReturns(Boolean newUseInvoiceIdForReturns) {
		eSet(LedgerPackage.Literals.PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS, newUseInvoiceIdForReturns);
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
				case LedgerPackage.PARTY_ACCTG_PREFERENCE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case LedgerPackage.PARTY_ACCTG_PREFERENCE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return LedgerPackage.PARTY_ACCTG_PREFERENCE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return LedgerPackage.PARTY_ACCTG_PREFERENCE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return LedgerPackage.PARTY_ACCTG_PREFERENCE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PartyAcctgPreferenceImpl
