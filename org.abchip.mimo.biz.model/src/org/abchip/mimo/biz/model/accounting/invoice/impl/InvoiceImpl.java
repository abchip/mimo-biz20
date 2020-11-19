/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceNote;
import org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Invoice</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceAttributes <em>Invoice Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceItems <em>Invoice Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceMessage <em>Invoice Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceNotes <em>Invoice Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getRecurrenceInfo <em>Recurrence Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends EntityTypedImpl<InvoiceType> implements Invoice {


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(InvoicePackage.Literals.INVOICE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(InvoicePackage.Literals.INVOICE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eGet(InvoicePackage.Literals.INVOICE__DUE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eSet(InvoicePackage.Literals.INVOICE__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InvoiceAttribute> getInvoiceAttributes() {
		return (List<InvoiceAttribute>)eGet(InvoicePackage.Literals.INVOICE__INVOICE_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getInvoiceDate() {
		return (Date)eGet(InvoicePackage.Literals.INVOICE__INVOICE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceDate(Date newInvoiceDate) {
		eSet(InvoicePackage.Literals.INVOICE__INVOICE_DATE, newInvoiceDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InvoiceItem> getInvoiceItems() {
		return (List<InvoiceItem>)eGet(InvoicePackage.Literals.INVOICE__INVOICE_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceMessage() {
		return (String)eGet(InvoicePackage.Literals.INVOICE__INVOICE_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceMessage(String newInvoiceMessage) {
		eSet(InvoicePackage.Literals.INVOICE__INVOICE_MESSAGE, newInvoiceMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InvoiceNote> getInvoiceNotes() {
		return (List<InvoiceNote>)eGet(InvoicePackage.Literals.INVOICE__INVOICE_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceType getInvoiceType() {
		return (InvoiceType)eGet(InvoicePackage.Literals.INVOICE__INVOICE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceType(InvoiceType newInvoiceType) {
		eSet(InvoicePackage.Literals.INVOICE__INVOICE_TYPE, newInvoiceType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPaidDate() {
		return (Date)eGet(InvoicePackage.Literals.INVOICE__PAID_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaidDate(Date newPaidDate) {
		eSet(InvoicePackage.Literals.INVOICE__PAID_DATE, newPaidDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(InvoicePackage.Literals.INVOICE__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(InvoicePackage.Literals.INVOICE__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		return (Party)eGet(InvoicePackage.Literals.INVOICE__PARTY_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		eSet(InvoicePackage.Literals.INVOICE__PARTY_ID_FROM, newPartyIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfo() {
		return (RecurrenceInfo)eGet(InvoicePackage.Literals.INVOICE__RECURRENCE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfo(RecurrenceInfo newRecurrenceInfo) {
		eSet(InvoicePackage.Literals.INVOICE__RECURRENCE_INFO, newRecurrenceInfo);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceNumber() {
		return (String)eGet(InvoicePackage.Literals.INVOICE__REFERENCE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceNumber(String newReferenceNumber) {
		eSet(InvoicePackage.Literals.INVOICE__REFERENCE_NUMBER, newReferenceNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleType() {
		return (RoleType)eGet(InvoicePackage.Literals.INVOICE__ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleType(RoleType newRoleType) {
		eSet(InvoicePackage.Literals.INVOICE__ROLE_TYPE, newRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(InvoicePackage.Literals.INVOICE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(InvoicePackage.Literals.INVOICE__STATUS, newStatus);
	}

	/**
	 * The cached invocation delegate for the '{@link #getTotal() <em>Get Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TOTAL__EINVOCATION_DELEGATE = ((EOperation.Internal)InvoicePackage.Literals.INVOICE.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotal() {
		try {
			return (BigDecimal)GET_TOTAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
				case InvoicePackage.INVOICE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case InvoicePackage.INVOICE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case InvoicePackage.INVOICE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case InvoicePackage.INVOICE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return InvoicePackage.INVOICE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return InvoicePackage.INVOICE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return InvoicePackage.INVOICE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return InvoicePackage.INVOICE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return (String)eGet(InvoicePackage.Literals.INVOICE__INVOICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		eSet(InvoicePackage.Literals.INVOICE__INVOICE_ID, newInvoiceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccount getBillingAccount() {
		return (BillingAccount)eGet(InvoicePackage.Literals.INVOICE__BILLING_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccount(BillingAccount newBillingAccount) {
		eSet(InvoicePackage.Literals.INVOICE__BILLING_ACCOUNT, newBillingAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMech() {
		return (ContactMech)eGet(InvoicePackage.Literals.INVOICE__CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMech(ContactMech newContactMech) {
		eSet(InvoicePackage.Literals.INVOICE__CONTACT_MECH, newContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(InvoicePackage.Literals.INVOICE__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(InvoicePackage.Literals.INVOICE__CURRENCY_UOM, newCurrencyUom);
	}
} // InvoiceImpl
