/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.quote;

import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermType <em>Term Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermDays <em>Term Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTextValue <em>Text Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface QuoteTerm extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote</em>' reference.
	 * @see #setQuote(Quote)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_Quote()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Quote getQuote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuote <em>Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' reference.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(Quote value);

	/**
	 * Returns the value of the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Type</em>' reference.
	 * @see #setTermType(TermType)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_TermType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TermType getTermType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermType <em>Term Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Type</em>' reference.
	 * @see #getTermType()
	 * @generated
	 */
	void setTermType(TermType value);

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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #setQuoteItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_QuoteItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getQuoteItemSeqId <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #getQuoteItemSeqId()
	 * @generated
	 */
	void setQuoteItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Days</em>' attribute.
	 * @see #setTermDays(long)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_TermDays()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTermDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermDays <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Days</em>' attribute.
	 * @see #getTermDays()
	 * @generated
	 */
	void setTermDays(long value);

	/**
	 * Returns the value of the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Value</em>' attribute.
	 * @see #setTermValue(long)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_TermValue()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTermValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTermValue <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Value</em>' attribute.
	 * @see #getTermValue()
	 * @generated
	 */
	void setTermValue(long value);

	/**
	 * Returns the value of the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Value</em>' attribute.
	 * @see #setTextValue(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_TextValue()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getTextValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getTextValue <em>Text Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Value</em>' attribute.
	 * @see #getTextValue()
	 * @generated
	 */
	void setTextValue(String value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteTerm_UomId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteTerm#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

} // QuoteTerm
