/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.order.order.OrderType;
import org.abchip.mimo.biz.model.order.quote.QuoteType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Pref Doc Type Tpl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getPartyPrefDocTypeTplId <em>Party Pref Doc Type Tpl Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getCustomScreenId <em>Custom Screen Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getQuoteType <em>Quote Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl()
 * @model annotation="mimo-ent-frame title='Party (organization) preferences for document type template'"
 * @generated
 */
public interface PartyPrefDocTypeTpl extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Custom Screen Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Screen Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Screen Id</em>' attribute.
	 * @see #setCustomScreenId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_CustomScreenId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustomScreenId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getCustomScreenId <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Screen Id</em>' attribute.
	 * @see #getCustomScreenId()
	 * @generated
	 */
	void setCustomScreenId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type</em>' reference.
	 * @see #setInvoiceType(InvoiceType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_InvoiceType()
	 * @model
	 * @generated
	 */
	InvoiceType getInvoiceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getInvoiceType <em>Invoice Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' reference.
	 * @see #getInvoiceType()
	 * @generated
	 */
	void setInvoiceType(InvoiceType value);

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' reference.
	 * @see #setOrderType(OrderType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_OrderType()
	 * @model
	 * @generated
	 */
	OrderType getOrderType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getOrderType <em>Order Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' reference.
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Quote Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Type</em>' reference.
	 * @see #setQuoteType(QuoteType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_QuoteType()
	 * @model
	 * @generated
	 */
	QuoteType getQuoteType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getQuoteType <em>Quote Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Type</em>' reference.
	 * @see #getQuoteType()
	 * @generated
	 */
	void setQuoteType(QuoteType value);

	/**
	 * Returns the value of the '<em><b>Party Pref Doc Type Tpl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Pref Doc Type Tpl Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Pref Doc Type Tpl Id</em>' attribute.
	 * @see #setPartyPrefDocTypeTplId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyPrefDocTypeTplId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getPartyPrefDocTypeTplId <em>Party Pref Doc Type Tpl Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Pref Doc Type Tpl Id</em>' attribute.
	 * @see #getPartyPrefDocTypeTplId()
	 * @generated
	 */
	void setPartyPrefDocTypeTplId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyPrefDocTypeTpl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PartyPrefDocTypeTpl
