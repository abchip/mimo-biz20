/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.DebitCreditFlag;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntryType;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.model.accounting.ledger.SettlementTerm;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acctg Trans Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getAcctgTrans <em>Acctg Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getAcctgTransEntryType <em>Acctg Trans Entry Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getDebitCreditFlag <em>Debit Credit Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getGlAccountType <em>Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getOrigAmount <em>Orig Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getOrigCurrencyUom <em>Orig Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getReconcileStatus <em>Reconcile Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getSettlementTerm <em>Settlement Term</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getTheirPartyId <em>Their Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getTheirProductId <em>Their Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransEntryImpl#getVoucherRef <em>Voucher Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcctgTransEntryImpl extends EntityTypedImpl<AcctgTransEntryType> implements AcctgTransEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcctgTransEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ACCTG_TRANS_ENTRY;
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
	public AcctgTrans getAcctgTrans() {
		return (AcctgTrans)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ACCTG_TRANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTrans(AcctgTrans newAcctgTrans) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ACCTG_TRANS, newAcctgTrans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcctgTransEntrySeqId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransEntrySeqId(String newAcctgTransEntrySeqId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID, newAcctgTransEntrySeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransEntryType getAcctgTransEntryType() {
		return (AcctgTransEntryType)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransEntryType(AcctgTransEntryType newAcctgTransEntryType) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE, newAcctgTransEntryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DebitCreditFlag getDebitCreditFlag() {
		return (DebitCreditFlag)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebitCreditFlag(DebitCreditFlag newDebitCreditFlag) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG, newDebitCreditFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__DUE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccount() {
		return (GlAccount)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccount(GlAccount newGlAccount) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__GL_ACCOUNT, newGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountType() {
		return (GlAccountType)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountType(GlAccountType newGlAccountType) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE, newGlAccountType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSummary() {
		return (Boolean)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__IS_SUMMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSummary(Boolean newIsSummary) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__IS_SUMMARY, newIsSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID, newOrganizationPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrigAmount() {
		return (BigDecimal)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ORIG_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigAmount(BigDecimal newOrigAmount) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ORIG_AMOUNT, newOrigAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getOrigCurrencyUom() {
		return (Uom)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigCurrencyUom(Uom newOrigCurrencyUom) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM, newOrigCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getReconcileStatus() {
		return (StatusItem)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__RECONCILE_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconcileStatus(StatusItem newReconcileStatus) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__RECONCILE_STATUS, newReconcileStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleType() {
		return (RoleType)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleType(RoleType newRoleType) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__ROLE_TYPE, newRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SettlementTerm getSettlementTerm() {
		return (SettlementTerm)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettlementTerm(SettlementTerm newSettlementTerm) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM, newSettlementTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__TAX_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxId(String newTaxId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__TAX_ID, newTaxId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheirPartyId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheirPartyId(String newTheirPartyId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID, newTheirPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheirProductId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheirProductId(String newTheirProductId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID, newTheirProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVoucherRef() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__VOUCHER_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoucherRef(String newVoucherRef) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS_ENTRY__VOUCHER_REF, newVoucherRef);
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
				case LedgerPackage.ACCTG_TRANS_ENTRY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case LedgerPackage.ACCTG_TRANS_ENTRY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case LedgerPackage.ACCTG_TRANS_ENTRY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case LedgerPackage.ACCTG_TRANS_ENTRY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return LedgerPackage.ACCTG_TRANS_ENTRY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return LedgerPackage.ACCTG_TRANS_ENTRY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return LedgerPackage.ACCTG_TRANS_ENTRY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return LedgerPackage.ACCTG_TRANS_ENTRY__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AcctgTransEntryImpl
