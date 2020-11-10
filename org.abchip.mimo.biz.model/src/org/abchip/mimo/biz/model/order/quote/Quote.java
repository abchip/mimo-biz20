/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.quote;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteAttributes <em>Quote Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteCoefficients <em>Quote Coefficients</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteItems <em>Quote Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteName <em>Quote Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteNotes <em>Quote Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteType <em>Quote Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteWorkEfforts <em>Quote Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getSalesChannelEnum <em>Sales Channel Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.Quote#getValidThruDate <em>Valid Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Quote extends EntityTyped<QuoteType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(Date)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_IssueDate()
	 * @model
	 * @generated
	 */
	Date getIssueDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_ProductStore()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Quote Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.quote.QuoteAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<QuoteAttribute> getQuoteAttributes();

	/**
	 * Returns the value of the '<em><b>Quote Coefficients</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.quote.QuoteCoefficient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Coefficients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Coefficients</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteCoefficients()
	 * @model derived="true"
	 * @generated
	 */
	List<QuoteCoefficient> getQuoteCoefficients();

	/**
	 * Returns the value of the '<em><b>Quote Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.quote.QuoteItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteItems()
	 * @model derived="true"
	 * @generated
	 */
	List<QuoteItem> getQuoteItems();

	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' attribute.
	 * @see #setQuoteId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteId <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' attribute.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Quote Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Name</em>' attribute.
	 * @see #setQuoteName(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getQuoteName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteName <em>Quote Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Name</em>' attribute.
	 * @see #getQuoteName()
	 * @generated
	 */
	void setQuoteName(String value);

	/**
	 * Returns the value of the '<em><b>Quote Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.quote.QuoteNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<QuoteNote> getQuoteNotes();

	/**
	 * Returns the value of the '<em><b>Quote Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Type</em>' reference.
	 * @see #setQuoteType(QuoteType)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteType()
	 * @model keys="quoteTypeId"
	 * @generated
	 */
	QuoteType getQuoteType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getQuoteType <em>Quote Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Type</em>' reference.
	 * @see #getQuoteType()
	 * @generated
	 */
	void setQuoteType(QuoteType value);

	/**
	 * Returns the value of the '<em><b>Quote Work Efforts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.quote.QuoteWorkEffort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Work Efforts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Work Efforts</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_QuoteWorkEfforts()
	 * @model derived="true"
	 * @generated
	 */
	List<QuoteWorkEffort> getQuoteWorkEfforts();

	/**
	 * Returns the value of the '<em><b>Sales Channel Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum</em>' reference.
	 * @see #setSalesChannelEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_SalesChannelEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getSalesChannelEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getSalesChannelEnum <em>Sales Channel Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum</em>' reference.
	 * @see #getSalesChannelEnum()
	 * @generated
	 */
	void setSalesChannelEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see #setValidFromDate(Date)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_ValidFromDate()
	 * @model
	 * @generated
	 */
	Date getValidFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getValidFromDate <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Date</em>' attribute.
	 * @see #getValidFromDate()
	 * @generated
	 */
	void setValidFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Valid Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Thru Date</em>' attribute.
	 * @see #setValidThruDate(Date)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuote_ValidThruDate()
	 * @model
	 * @generated
	 */
	Date getValidThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.Quote#getValidThruDate <em>Valid Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Thru Date</em>' attribute.
	 * @see #getValidThruDate()
	 * @generated
	 */
	void setValidThruDate(Date value);

} // Quote
