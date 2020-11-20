/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.DebitCreditFlag;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acctg Trans Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAcctgTrans <em>Acctg Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAcctgTransEntryType <em>Acctg Trans Entry Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getDebitCreditFlag <em>Debit Credit Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getGlAccountType <em>Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getOrigAmount <em>Orig Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getOrigCurrencyUom <em>Orig Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getReconcileStatus <em>Reconcile Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getSettlementTerm <em>Settlement Term</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getTheirPartyId <em>Their Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getTheirProductId <em>Their Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getVoucherRef <em>Voucher Ref</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry()
 * @model annotation="mimo-ent-frame title='Transaction Entry' formula='description'"
 * @generated
 */
public interface AcctgTransEntry extends EntityTyped<AcctgTransEntryType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Acctg Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans</em>' reference.
	 * @see #setAcctgTrans(AcctgTrans)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_AcctgTrans()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	AcctgTrans getAcctgTrans();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAcctgTrans <em>Acctg Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans</em>' reference.
	 * @see #getAcctgTrans()
	 * @generated
	 */
	void setAcctgTrans(AcctgTrans value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Entry Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Entry Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Entry Seq Id</em>' attribute.
	 * @see #setAcctgTransEntrySeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_AcctgTransEntrySeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAcctgTransEntrySeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Entry Seq Id</em>' attribute.
	 * @see #getAcctgTransEntrySeqId()
	 * @generated
	 */
	void setAcctgTransEntrySeqId(String value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Entry Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Entry Type</em>' reference.
	 * @see #setAcctgTransEntryType(AcctgTransEntryType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_AcctgTransEntryType()
	 * @model
	 * @generated
	 */
	AcctgTransEntryType getAcctgTransEntryType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAcctgTransEntryType <em>Acctg Trans Entry Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Entry Type</em>' reference.
	 * @see #getAcctgTransEntryType()
	 * @generated
	 */
	void setAcctgTransEntryType(AcctgTransEntryType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_CurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Debit Credit Flag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.model.accounting.DebitCreditFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Credit Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Credit Flag</em>' attribute.
	 * @see org.abchip.mimo.biz.model.accounting.DebitCreditFlag
	 * @see #setDebitCreditFlag(DebitCreditFlag)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_DebitCreditFlag()
	 * @model required="true"
	 * @generated
	 */
	DebitCreditFlag getDebitCreditFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getDebitCreditFlag <em>Debit Credit Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Credit Flag</em>' attribute.
	 * @see org.abchip.mimo.biz.model.accounting.DebitCreditFlag
	 * @see #getDebitCreditFlag()
	 * @generated
	 */
	void setDebitCreditFlag(DebitCreditFlag value);

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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' reference.
	 * @see #setGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_GlAccount()
	 * @model
	 * @generated
	 */
	GlAccount getGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getGlAccount <em>Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' reference.
	 * @see #getGlAccount()
	 * @generated
	 */
	void setGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Type</em>' reference.
	 * @see #setGlAccountType(GlAccountType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_GlAccountType()
	 * @model
	 * @generated
	 */
	GlAccountType getGlAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getGlAccountType <em>Gl Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Type</em>' reference.
	 * @see #getGlAccountType()
	 * @generated
	 */
	void setGlAccountType(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_GroupId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_InventoryItem()
	 * @model
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Is Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Summary</em>' attribute.
	 * @see #setIsSummary(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_IsSummary()
	 * @model
	 * @generated
	 */
	Boolean getIsSummary();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getIsSummary <em>Is Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Summary</em>' attribute.
	 * @see #getIsSummary()
	 * @generated
	 */
	void setIsSummary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' attribute.
	 * @see #setOrganizationPartyId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_OrganizationPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getOrganizationPartyId <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' attribute.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Orig Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orig Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orig Amount</em>' attribute.
	 * @see #setOrigAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_OrigAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getOrigAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getOrigAmount <em>Orig Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orig Amount</em>' attribute.
	 * @see #getOrigAmount()
	 * @generated
	 */
	void setOrigAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Orig Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orig Currency Uom</em>' reference.
	 * @see #setOrigCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_OrigCurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getOrigCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getOrigCurrencyUom <em>Orig Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orig Currency Uom</em>' reference.
	 * @see #getOrigCurrencyUom()
	 * @generated
	 */
	void setOrigCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_ProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Reconcile Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconcile Status</em>' reference.
	 * @see #setReconcileStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_ReconcileStatus()
	 * @model
	 * @generated
	 */
	StatusItem getReconcileStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getReconcileStatus <em>Reconcile Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconcile Status</em>' reference.
	 * @see #getReconcileStatus()
	 * @generated
	 */
	void setReconcileStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_RoleType()
	 * @model
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Settlement Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Term</em>' reference.
	 * @see #setSettlementTerm(SettlementTerm)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_SettlementTerm()
	 * @model
	 * @generated
	 */
	SettlementTerm getSettlementTerm();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getSettlementTerm <em>Settlement Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Term</em>' reference.
	 * @see #getSettlementTerm()
	 * @generated
	 */
	void setSettlementTerm(SettlementTerm value);

	/**
	 * Returns the value of the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Id</em>' attribute.
	 * @see #setTaxId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_TaxId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getTaxId <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Id</em>' attribute.
	 * @see #getTaxId()
	 * @generated
	 */
	void setTaxId(String value);

	/**
	 * Returns the value of the '<em><b>Their Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Their Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Their Party Id</em>' attribute.
	 * @see #setTheirPartyId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_TheirPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTheirPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getTheirPartyId <em>Their Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Their Party Id</em>' attribute.
	 * @see #getTheirPartyId()
	 * @generated
	 */
	void setTheirPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Their Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Their Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Their Product Id</em>' attribute.
	 * @see #setTheirProductId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_TheirProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTheirProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getTheirProductId <em>Their Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Their Product Id</em>' attribute.
	 * @see #getTheirProductId()
	 * @generated
	 */
	void setTheirProductId(String value);

	/**
	 * Returns the value of the '<em><b>Voucher Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voucher Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voucher Ref</em>' attribute.
	 * @see #setVoucherRef(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransEntry_VoucherRef()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getVoucherRef();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry#getVoucherRef <em>Voucher Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voucher Ref</em>' attribute.
	 * @see #getVoucherRef()
	 * @generated
	 */
	void setVoucherRef(String value);

} // AcctgTransEntry
