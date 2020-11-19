/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceAttributes <em>Invoice Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceItems <em>Invoice Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceNotes <em>Invoice Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRecurrenceInfo <em>Recurrence Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Invoice extends EntityTyped<InvoiceType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<InvoiceAttribute> getInvoiceAttributes();

	/**
	 * Returns the value of the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Date</em>' attribute.
	 * @see #setInvoiceDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceDate()
	 * @model
	 * @generated
	 */
	Date getInvoiceDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceItems()
	 * @model derived="true"
	 * @generated
	 */
	List<InvoiceItem> getInvoiceItems();

	/**
	 * Returns the value of the '<em><b>Invoice Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Message</em>' attribute.
	 * @see #setInvoiceMessage(String)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInvoiceMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Message</em>' attribute.
	 * @see #getInvoiceMessage()
	 * @generated
	 */
	void setInvoiceMessage(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<InvoiceNote> getInvoiceNotes();

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type</em>' reference.
	 * @see #setInvoiceType(InvoiceType)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceType()
	 * @model keys="invoiceTypeId"
	 * @generated
	 */
	InvoiceType getInvoiceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceType <em>Invoice Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' reference.
	 * @see #getInvoiceType()
	 * @generated
	 */
	void setInvoiceType(InvoiceType value);

	/**
	 * Returns the value of the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Date</em>' attribute.
	 * @see #setPaidDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_PaidDate()
	 * @model
	 * @generated
	 */
	Date getPaidDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Date</em>' attribute.
	 * @see #getPaidDate()
	 * @generated
	 */
	void setPaidDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info</em>' reference.
	 * @see #setRecurrenceInfo(RecurrenceInfo)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_RecurrenceInfo()
	 * @model keys="recurrenceInfoId"
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRecurrenceInfo <em>Recurrence Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info</em>' reference.
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	void setRecurrenceInfo(RecurrenceInfo value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_ReferenceNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_RoleType()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="org.abchip.mimo.core.base.invocation"
	 * @generated
	 */
	BigDecimal getTotal();

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_InvoiceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account</em>' reference.
	 * @see #setBillingAccount(BillingAccount)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_BillingAccount()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getBillingAccount <em>Billing Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account</em>' reference.
	 * @see #getBillingAccount()
	 * @generated
	 */
	void setBillingAccount(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_ContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoice_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

} // Invoice
