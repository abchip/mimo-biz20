/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Acctg Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getBaseCurrencyUom <em>Base Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getCogsMethod <em>Cogs Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getEnableAccounting <em>Enable Accounting</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getErrorGlJournal <em>Error Gl Journal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getInvoiceSeqCustMeth <em>Invoice Seq Cust Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastInvoiceNumber <em>Last Invoice Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastOrderNumber <em>Last Order Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastQuoteNumber <em>Last Quote Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOldInvoiceSequenceEnum <em>Old Invoice Sequence Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOldOrderSequenceEnum <em>Old Order Sequence Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOldQuoteSequenceEnum <em>Old Quote Sequence Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOrderIdPrefix <em>Order Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOrderSeqCustMeth <em>Order Seq Cust Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getQuoteIdPrefix <em>Quote Id Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getQuoteSeqCustMeth <em>Quote Seq Cust Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getRefundPaymentMethod <em>Refund Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getTaxForm <em>Tax Form</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference()
 * @model annotation="mimo-ent-frame title='Party (organization) accounting preferences'"
 * @generated
 */
public interface PartyAcctgPreference extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Enable Accounting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Accounting</em>' attribute.
	 * @see #setEnableAccounting(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_EnableAccounting()
	 * @model
	 * @generated
	 */
	Boolean getEnableAccounting();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getEnableAccounting <em>Enable Accounting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Accounting</em>' attribute.
	 * @see #getEnableAccounting()
	 * @generated
	 */
	void setEnableAccounting(Boolean value);

	/**
	 * Returns the value of the '<em><b>Error Gl Journal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Gl Journal</em>' reference.
	 * @see #setErrorGlJournal(GlJournal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_ErrorGlJournal()
	 * @model keys="glJournalId"
	 *        annotation="mimo-ent-slot help='Journal to which all the failed automatic transaction are assigned.\n                If the error journal is set, if the GL posting fails for some reason the triggering operation (finalizing an invoice or payment or whatever) would NOT roll back, instead the partial GL post would be placed into the error journal.'"
	 * @generated
	 */
	GlJournal getErrorGlJournal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getErrorGlJournal <em>Error Gl Journal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Gl Journal</em>' reference.
	 * @see #getErrorGlJournal()
	 * @generated
	 */
	void setErrorGlJournal(GlJournal value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiscal Year Start Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year Start Day</em>' attribute.
	 * @see #setFiscalYearStartDay(long)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_FiscalYearStartDay()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getFiscalYearStartDay();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year Start Day</em>' attribute.
	 * @see #getFiscalYearStartDay()
	 * @generated
	 */
	void setFiscalYearStartDay(long value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiscal Year Start Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year Start Month</em>' attribute.
	 * @see #setFiscalYearStartMonth(long)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_FiscalYearStartMonth()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getFiscalYearStartMonth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year Start Month</em>' attribute.
	 * @see #getFiscalYearStartMonth()
	 * @generated
	 */
	void setFiscalYearStartMonth(long value);

	/**
	 * Returns the value of the '<em><b>Invoice Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id Prefix</em>' attribute.
	 * @see #setInvoiceIdPrefix(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_InvoiceIdPrefix()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getInvoiceIdPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id Prefix</em>' attribute.
	 * @see #getInvoiceIdPrefix()
	 * @generated
	 */
	void setInvoiceIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Seq Cust Meth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Seq Cust Meth</em>' reference.
	 * @see #setInvoiceSeqCustMeth(CustomMethod)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_InvoiceSeqCustMeth()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getInvoiceSeqCustMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getInvoiceSeqCustMeth <em>Invoice Seq Cust Meth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Seq Cust Meth</em>' reference.
	 * @see #getInvoiceSeqCustMeth()
	 * @generated
	 */
	void setInvoiceSeqCustMeth(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Last Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Invoice Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Invoice Number</em>' attribute.
	 * @see #setLastInvoiceNumber(long)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastInvoiceNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastInvoiceNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastInvoiceNumber <em>Last Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Invoice Number</em>' attribute.
	 * @see #getLastInvoiceNumber()
	 * @generated
	 */
	void setLastInvoiceNumber(long value);

	/**
	 * Returns the value of the '<em><b>Last Invoice Restart Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Invoice Restart Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Invoice Restart Date</em>' attribute.
	 * @see #setLastInvoiceRestartDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastInvoiceRestartDate()
	 * @model
	 * @generated
	 */
	Date getLastInvoiceRestartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Invoice Restart Date</em>' attribute.
	 * @see #getLastInvoiceRestartDate()
	 * @generated
	 */
	void setLastInvoiceRestartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Order Number</em>' attribute.
	 * @see #setLastOrderNumber(long)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastOrderNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastOrderNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastOrderNumber <em>Last Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Order Number</em>' attribute.
	 * @see #getLastOrderNumber()
	 * @generated
	 */
	void setLastOrderNumber(long value);

	/**
	 * Returns the value of the '<em><b>Last Quote Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Quote Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Quote Number</em>' attribute.
	 * @see #setLastQuoteNumber(long)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_LastQuoteNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastQuoteNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getLastQuoteNumber <em>Last Quote Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Quote Number</em>' attribute.
	 * @see #getLastQuoteNumber()
	 * @generated
	 */
	void setLastQuoteNumber(long value);

	/**
	 * Returns the value of the '<em><b>Old Invoice Sequence Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Invoice Sequence Enum</em>' reference.
	 * @see #setOldInvoiceSequenceEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OldInvoiceSequenceEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOldInvoiceSequenceEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOldInvoiceSequenceEnum <em>Old Invoice Sequence Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Invoice Sequence Enum</em>' reference.
	 * @see #getOldInvoiceSequenceEnum()
	 * @generated
	 */
	void setOldInvoiceSequenceEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Old Order Sequence Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Order Sequence Enum</em>' reference.
	 * @see #setOldOrderSequenceEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OldOrderSequenceEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOldOrderSequenceEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOldOrderSequenceEnum <em>Old Order Sequence Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Order Sequence Enum</em>' reference.
	 * @see #getOldOrderSequenceEnum()
	 * @generated
	 */
	void setOldOrderSequenceEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Old Quote Sequence Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Quote Sequence Enum</em>' reference.
	 * @see #setOldQuoteSequenceEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OldQuoteSequenceEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOldQuoteSequenceEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOldQuoteSequenceEnum <em>Old Quote Sequence Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Quote Sequence Enum</em>' reference.
	 * @see #getOldQuoteSequenceEnum()
	 * @generated
	 */
	void setOldQuoteSequenceEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Order Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id Prefix</em>' attribute.
	 * @see #setOrderIdPrefix(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OrderIdPrefix()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getOrderIdPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOrderIdPrefix <em>Order Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id Prefix</em>' attribute.
	 * @see #getOrderIdPrefix()
	 * @generated
	 */
	void setOrderIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Order Seq Cust Meth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Seq Cust Meth</em>' reference.
	 * @see #setOrderSeqCustMeth(CustomMethod)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_OrderSeqCustMeth()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getOrderSeqCustMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getOrderSeqCustMeth <em>Order Seq Cust Meth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Seq Cust Meth</em>' reference.
	 * @see #getOrderSeqCustMeth()
	 * @generated
	 */
	void setOrderSeqCustMeth(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_PartyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Base Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Currency Uom</em>' reference.
	 * @see #setBaseCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_BaseCurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getBaseCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getBaseCurrencyUom <em>Base Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Currency Uom</em>' reference.
	 * @see #getBaseCurrencyUom()
	 * @generated
	 */
	void setBaseCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Cogs Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogs Method</em>' reference.
	 * @see #setCogsMethod(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_CogsMethod()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getCogsMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getCogsMethod <em>Cogs Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogs Method</em>' reference.
	 * @see #getCogsMethod()
	 * @generated
	 */
	void setCogsMethod(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Quote Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id Prefix</em>' attribute.
	 * @see #setQuoteIdPrefix(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_QuoteIdPrefix()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getQuoteIdPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getQuoteIdPrefix <em>Quote Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id Prefix</em>' attribute.
	 * @see #getQuoteIdPrefix()
	 * @generated
	 */
	void setQuoteIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Quote Seq Cust Meth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Seq Cust Meth</em>' reference.
	 * @see #setQuoteSeqCustMeth(CustomMethod)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_QuoteSeqCustMeth()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getQuoteSeqCustMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getQuoteSeqCustMeth <em>Quote Seq Cust Meth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Seq Cust Meth</em>' reference.
	 * @see #getQuoteSeqCustMeth()
	 * @generated
	 */
	void setQuoteSeqCustMeth(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Refund Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refund Payment Method</em>' reference.
	 * @see #setRefundPaymentMethod(PaymentMethod)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_RefundPaymentMethod()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getRefundPaymentMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getRefundPaymentMethod <em>Refund Payment Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refund Payment Method</em>' reference.
	 * @see #getRefundPaymentMethod()
	 * @generated
	 */
	void setRefundPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Tax Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Form</em>' reference.
	 * @see #setTaxForm(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_TaxForm()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getTaxForm();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getTaxForm <em>Tax Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Form</em>' reference.
	 * @see #getTaxForm()
	 * @generated
	 */
	void setTaxForm(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Use Invoice Id For Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Invoice Id For Returns</em>' attribute.
	 * @see #setUseInvoiceIdForReturns(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyAcctgPreference_UseInvoiceIdForReturns()
	 * @model
	 * @generated
	 */
	Boolean getUseInvoiceIdForReturns();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference#getUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Invoice Id For Returns</em>' attribute.
	 * @see #getUseInvoiceIdForReturns()
	 * @generated
	 */
	void setUseInvoiceIdForReturns(Boolean value);

} // PartyAcctgPreference
