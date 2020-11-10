/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransAttribute;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType;
import org.abchip.mimo.biz.model.accounting.ledger.GlFiscalType;
import org.abchip.mimo.biz.model.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acctg Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getAcctgTransId <em>Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getAcctgTransAttributes <em>Acctg Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getAcctgTransEntries <em>Acctg Trans Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getAcctgTransType <em>Acctg Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getFinAccountTrans <em>Fin Account Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getGlFiscalType <em>Gl Fiscal Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getGlJournal <em>Gl Journal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getGroupStatus <em>Group Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getPhysicalInventory <em>Physical Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getScheduledPostingDate <em>Scheduled Posting Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getVoucherDate <em>Voucher Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getVoucherRef <em>Voucher Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.AcctgTransImpl#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcctgTransImpl extends EntityTypedImpl<AcctgTransType> implements AcctgTrans {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcctgTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ACCTG_TRANS;
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
	public String getCreatedByUserLogin() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTrans getFinAccountTrans() {
		return (FinAccountTrans)eGet(LedgerPackage.Literals.ACCTG_TRANS__FIN_ACCOUNT_TRANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTrans(FinAccountTrans newFinAccountTrans) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__FIN_ACCOUNT_TRANS, newFinAccountTrans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAsset() {
		return (FixedAsset)eGet(LedgerPackage.Literals.ACCTG_TRANS__FIXED_ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAsset(FixedAsset newFixedAsset) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__FIXED_ASSET, newFixedAsset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlFiscalType getGlFiscalType() {
		return (GlFiscalType)eGet(LedgerPackage.Literals.ACCTG_TRANS__GL_FISCAL_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlFiscalType(GlFiscalType newGlFiscalType) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__GL_FISCAL_TYPE, newGlFiscalType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlJournal getGlJournal() {
		return (GlJournal)eGet(LedgerPackage.Literals.ACCTG_TRANS__GL_JOURNAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlJournal(GlJournal newGlJournal) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__GL_JOURNAL, newGlJournal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getGroupStatus() {
		return (StatusItem)eGet(LedgerPackage.Literals.ACCTG_TRANS__GROUP_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupStatus(StatusItem newGroupStatus) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__GROUP_STATUS, newGroupStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(LedgerPackage.Literals.ACCTG_TRANS__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoice() {
		return (Invoice)eGet(LedgerPackage.Literals.ACCTG_TRANS__INVOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoice(Invoice newInvoice) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__INVOICE, newInvoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPosted() {
		return (Boolean)eGet(LedgerPackage.Literals.ACCTG_TRANS__IS_POSTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPosted(boolean newIsPosted) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__IS_POSTED, newIsPosted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(LedgerPackage.Literals.ACCTG_TRANS__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPayment() {
		return (Payment)eGet(LedgerPackage.Literals.ACCTG_TRANS__PAYMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment(Payment newPayment) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__PAYMENT, newPayment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalInventory getPhysicalInventory() {
		return (PhysicalInventory)eGet(LedgerPackage.Literals.ACCTG_TRANS__PHYSICAL_INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventory(PhysicalInventory newPhysicalInventory) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__PHYSICAL_INVENTORY, newPhysicalInventory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPostedDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS__POSTED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDate(Date newPostedDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__POSTED_DATE, newPostedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentReceipt getReceipt() {
		return (ShipmentReceipt)eGet(LedgerPackage.Literals.ACCTG_TRANS__RECEIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceipt(ShipmentReceipt newReceipt) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__RECEIPT, newReceipt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleType() {
		return (RoleType)eGet(LedgerPackage.Literals.ACCTG_TRANS__ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleType(RoleType newRoleType) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__ROLE_TYPE, newRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getScheduledPostingDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS__SCHEDULED_POSTING_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduledPostingDate(Date newScheduledPostingDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__SCHEDULED_POSTING_DATE, newScheduledPostingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipment() {
		return (Shipment)eGet(LedgerPackage.Literals.ACCTG_TRANS__SHIPMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipment(Shipment newShipment) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__SHIPMENT, newShipment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheirAcctgTransId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheirAcctgTransId(String newTheirAcctgTransId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID, newTheirAcctgTransId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTransactionDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS__TRANSACTION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionDate(Date newTransactionDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__TRANSACTION_DATE, newTransactionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getVoucherDate() {
		return (Date)eGet(LedgerPackage.Literals.ACCTG_TRANS__VOUCHER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoucherDate(Date newVoucherDate) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__VOUCHER_DATE, newVoucherDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVoucherRef() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS__VOUCHER_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoucherRef(String newVoucherRef) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__VOUCHER_REF, newVoucherRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffort() {
		return (WorkEffort)eGet(LedgerPackage.Literals.ACCTG_TRANS__WORK_EFFORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffort(WorkEffort newWorkEffort) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__WORK_EFFORT, newWorkEffort);
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
				case LedgerPackage.ACCTG_TRANS__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case LedgerPackage.ACCTG_TRANS__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case LedgerPackage.ACCTG_TRANS__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case LedgerPackage.ACCTG_TRANS__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return LedgerPackage.ACCTG_TRANS__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return LedgerPackage.ACCTG_TRANS__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return LedgerPackage.ACCTG_TRANS__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return LedgerPackage.ACCTG_TRANS__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcctgTransId() {
		return (String)eGet(LedgerPackage.Literals.ACCTG_TRANS__ACCTG_TRANS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransId(String newAcctgTransId) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__ACCTG_TRANS_ID, newAcctgTransId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<AcctgTransAttribute> getAcctgTransAttributes() {
		return (List<AcctgTransAttribute>)eGet(LedgerPackage.Literals.ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<AcctgTransEntry> getAcctgTransEntries() {
		return (List<AcctgTransEntry>)eGet(LedgerPackage.Literals.ACCTG_TRANS__ACCTG_TRANS_ENTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransType getAcctgTransType() {
		return (AcctgTransType)eGet(LedgerPackage.Literals.ACCTG_TRANS__ACCTG_TRANS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransType(AcctgTransType newAcctgTransType) {
		eSet(LedgerPackage.Literals.ACCTG_TRANS__ACCTG_TRANS_TYPE, newAcctgTransType);
	}

} //AcctgTransImpl
