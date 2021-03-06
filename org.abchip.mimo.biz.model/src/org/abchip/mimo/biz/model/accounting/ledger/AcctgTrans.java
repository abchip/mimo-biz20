/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
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
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acctg Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getAcctgTransId <em>Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getAcctgTransAttributes <em>Acctg Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getAcctgTransEntries <em>Acctg Trans Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getAcctgTransType <em>Acctg Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getFinAccountTrans <em>Fin Account Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getGlFiscalType <em>Gl Fiscal Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getGlJournal <em>Gl Journal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getGroupStatus <em>Group Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getPhysicalInventory <em>Physical Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getScheduledPostingDate <em>Scheduled Posting Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getVoucherDate <em>Voucher Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getVoucherRef <em>Voucher Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans()
 * @model annotation="mimo-ent-frame title='Accounting Transaction' formula='description'"
 * @generated
 */
public interface AcctgTrans extends EntityTyped<AcctgTransType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans</em>' reference.
	 * @see #setFinAccountTrans(FinAccountTrans)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_FinAccountTrans()
	 * @model
	 * @generated
	 */
	FinAccountTrans getFinAccountTrans();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getFinAccountTrans <em>Fin Account Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans</em>' reference.
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	void setFinAccountTrans(FinAccountTrans value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_FixedAsset()
	 * @model
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Gl Fiscal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Fiscal Type</em>' reference.
	 * @see #setGlFiscalType(GlFiscalType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_GlFiscalType()
	 * @model
	 * @generated
	 */
	GlFiscalType getGlFiscalType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getGlFiscalType <em>Gl Fiscal Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Fiscal Type</em>' reference.
	 * @see #getGlFiscalType()
	 * @generated
	 */
	void setGlFiscalType(GlFiscalType value);

	/**
	 * Returns the value of the '<em><b>Gl Journal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal</em>' reference.
	 * @see #setGlJournal(GlJournal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_GlJournal()
	 * @model
	 * @generated
	 */
	GlJournal getGlJournal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getGlJournal <em>Gl Journal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal</em>' reference.
	 * @see #getGlJournal()
	 * @generated
	 */
	void setGlJournal(GlJournal value);

	/**
	 * Returns the value of the '<em><b>Group Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Status</em>' reference.
	 * @see #setGroupStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_GroupStatus()
	 * @model
	 * @generated
	 */
	StatusItem getGroupStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getGroupStatus <em>Group Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Status</em>' reference.
	 * @see #getGroupStatus()
	 * @generated
	 */
	void setGroupStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_InventoryItem()
	 * @model
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference.
	 * @see #setInvoice(Invoice)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_Invoice()
	 * @model
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getInvoice <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Is Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Posted</em>' attribute.
	 * @see #setIsPosted(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_IsPosted()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPosted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#isIsPosted <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Posted</em>' attribute.
	 * @see #isIsPosted()
	 * @generated
	 */
	void setIsPosted(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_Payment()
	 * @model
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory</em>' reference.
	 * @see #setPhysicalInventory(PhysicalInventory)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_PhysicalInventory()
	 * @model
	 * @generated
	 */
	PhysicalInventory getPhysicalInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getPhysicalInventory <em>Physical Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory</em>' reference.
	 * @see #getPhysicalInventory()
	 * @generated
	 */
	void setPhysicalInventory(PhysicalInventory value);

	/**
	 * Returns the value of the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date</em>' attribute.
	 * @see #setPostedDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_PostedDate()
	 * @model
	 * @generated
	 */
	Date getPostedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getPostedDate <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date</em>' attribute.
	 * @see #getPostedDate()
	 * @generated
	 */
	void setPostedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(ShipmentReceipt)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_Receipt()
	 * @model
	 * @generated
	 */
	ShipmentReceipt getReceipt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(ShipmentReceipt value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_RoleType()
	 * @model
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Scheduled Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Posting Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Posting Date</em>' attribute.
	 * @see #setScheduledPostingDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_ScheduledPostingDate()
	 * @model
	 * @generated
	 */
	Date getScheduledPostingDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getScheduledPostingDate <em>Scheduled Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Posting Date</em>' attribute.
	 * @see #getScheduledPostingDate()
	 * @generated
	 */
	void setScheduledPostingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see #setShipment(Shipment)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_Shipment()
	 * @model
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getShipment <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(Shipment value);

	/**
	 * Returns the value of the '<em><b>Their Acctg Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Their Acctg Trans Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Their Acctg Trans Id</em>' attribute.
	 * @see #setTheirAcctgTransId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_TheirAcctgTransId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTheirAcctgTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Their Acctg Trans Id</em>' attribute.
	 * @see #getTheirAcctgTransId()
	 * @generated
	 */
	void setTheirAcctgTransId(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_TransactionDate()
	 * @model
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Voucher Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voucher Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voucher Date</em>' attribute.
	 * @see #setVoucherDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_VoucherDate()
	 * @model
	 * @generated
	 */
	Date getVoucherDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getVoucherDate <em>Voucher Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voucher Date</em>' attribute.
	 * @see #getVoucherDate()
	 * @generated
	 */
	void setVoucherDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_VoucherRef()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getVoucherRef();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getVoucherRef <em>Voucher Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voucher Ref</em>' attribute.
	 * @see #getVoucherRef()
	 * @generated
	 */
	void setVoucherRef(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_WorkEffort()
	 * @model
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Id</em>' attribute.
	 * @see #setAcctgTransId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAcctgTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getAcctgTransId <em>Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Id</em>' attribute.
	 * @see #getAcctgTransId()
	 * @generated
	 */
	void setAcctgTransId(String value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<AcctgTransAttribute> getAcctgTransAttributes();

	/**
	 * Returns the value of the '<em><b>Acctg Trans Entries</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Entries</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransEntries()
	 * @model derived="true"
	 * @generated
	 */
	List<AcctgTransEntry> getAcctgTransEntries();

	/**
	 * Returns the value of the '<em><b>Acctg Trans Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Type</em>' reference.
	 * @see #setAcctgTransType(AcctgTransType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransType()
	 * @model
	 * @generated
	 */
	AcctgTransType getAcctgTransType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans#getAcctgTransType <em>Acctg Trans Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Type</em>' reference.
	 * @see #getAcctgTransType()
	 * @generated
	 */
	void setAcctgTransType(AcctgTransType value);

} // AcctgTrans
