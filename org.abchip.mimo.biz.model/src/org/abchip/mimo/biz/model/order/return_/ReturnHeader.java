/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.model.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCommunicationEventReturns <em>Communication Event Returns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getDestinationFacility <em>Destination Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFinAccount <em>Fin Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFromParty <em>From Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getNeedsInventoryReceive <em>Needs Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getOriginContactMech <em>Origin Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnHeaderType <em>Return Header Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnItems <em>Return Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getToParty <em>To Party</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader()
 * @model annotation="mimo-ent-frame title='Return'"
 * @generated
 */
public interface ReturnHeader extends EntityTyped<ReturnHeaderType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(UserLogin)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_CreatedBy()
	 * @model
	 * @generated
	 */
	UserLogin getCreatedBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_CurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Destination Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Facility</em>' reference.
	 * @see #setDestinationFacility(Facility)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_DestinationFacility()
	 * @model
	 * @generated
	 */
	Facility getDestinationFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getDestinationFacility <em>Destination Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Facility</em>' reference.
	 * @see #getDestinationFacility()
	 * @generated
	 */
	void setDestinationFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Date</em>' attribute.
	 * @see #setEntryDate(Date)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getEntryDate <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Date</em>' attribute.
	 * @see #getEntryDate()
	 * @generated
	 */
	void setEntryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account</em>' reference.
	 * @see #setFinAccount(FinAccount)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_FinAccount()
	 * @model
	 * @generated
	 */
	FinAccount getFinAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFinAccount <em>Fin Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account</em>' reference.
	 * @see #getFinAccount()
	 * @generated
	 */
	void setFinAccount(FinAccount value);

	/**
	 * Returns the value of the '<em><b>From Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Party</em>' reference.
	 * @see #setFromParty(Party)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_FromParty()
	 * @model
	 * @generated
	 */
	Party getFromParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getFromParty <em>From Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Party</em>' reference.
	 * @see #getFromParty()
	 * @generated
	 */
	void setFromParty(Party value);

	/**
	 * Returns the value of the '<em><b>Needs Inventory Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inventory Receive</em>' attribute.
	 * @see #setNeedsInventoryReceive(Boolean)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_NeedsInventoryReceive()
	 * @model
	 * @generated
	 */
	Boolean getNeedsInventoryReceive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getNeedsInventoryReceive <em>Needs Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inventory Receive</em>' attribute.
	 * @see #getNeedsInventoryReceive()
	 * @generated
	 */
	void setNeedsInventoryReceive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Origin Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech</em>' reference.
	 * @see #setOriginContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_OriginContactMech()
	 * @model
	 * @generated
	 */
	ContactMech getOriginContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getOriginContactMech <em>Origin Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Contact Mech</em>' reference.
	 * @see #getOriginContactMech()
	 * @generated
	 */
	void setOriginContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' reference.
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_PaymentMethod()
	 * @model
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getPaymentMethod <em>Payment Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' reference.
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Return Header Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Header Type</em>' reference.
	 * @see #setReturnHeaderType(ReturnHeaderType)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_ReturnHeaderType()
	 * @model
	 * @generated
	 */
	ReturnHeaderType getReturnHeaderType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnHeaderType <em>Return Header Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Header Type</em>' reference.
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	void setReturnHeaderType(ReturnHeaderType value);

	/**
	 * Returns the value of the '<em><b>Return Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.return_.ReturnItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_ReturnItems()
	 * @model derived="true"
	 * @generated
	 */
	List<ReturnItem> getReturnItems();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_ReturnId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account</em>' reference.
	 * @see #setBillingAccount(BillingAccount)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_BillingAccount()
	 * @model
	 * @generated
	 */
	BillingAccount getBillingAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getBillingAccount <em>Billing Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account</em>' reference.
	 * @see #getBillingAccount()
	 * @generated
	 */
	void setBillingAccount(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Communication Event Returns</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Returns</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_CommunicationEventReturns()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventReturn> getCommunicationEventReturns();

	/**
	 * Returns the value of the '<em><b>Supplier Rma Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Rma Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Rma Id</em>' attribute.
	 * @see #setSupplierRmaId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_SupplierRmaId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSupplierRmaId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Rma Id</em>' attribute.
	 * @see #getSupplierRmaId()
	 * @generated
	 */
	void setSupplierRmaId(String value);

	/**
	 * Returns the value of the '<em><b>To Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Party</em>' reference.
	 * @see #setToParty(Party)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnHeader_ToParty()
	 * @model
	 * @generated
	 */
	Party getToParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnHeader#getToParty <em>To Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Party</em>' reference.
	 * @see #getToParty()
	 * @generated
	 */
	void setToParty(Party value);

} // ReturnHeader
