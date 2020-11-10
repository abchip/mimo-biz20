/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.quote;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.order.order.OrderAdjustmentType;
import org.abchip.mimo.biz.model.product.promo.ProductPromo;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentId <em>Quote Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getPrimaryGeo <em>Primary Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentType <em>Quote Adjustment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSecondaryGeo <em>Secondary Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment()
 * @model annotation="mimo-ent-frame help='Note that both includeInTax and includeInShipping should default to true, except in the case where this adjustment is a tax or shipping adjustment then should be ignored.' formula='description'"
 * @generated
 */
public interface QuoteAdjustment extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Product Id</em>' attribute.
	 * @see #setCorrespondingProductId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_CorrespondingProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCorrespondingProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Product Id</em>' attribute.
	 * @see #getCorrespondingProductId()
	 * @generated
	 */
	void setCorrespondingProductId(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Reference Id</em>' attribute.
	 * @see #setCustomerReferenceId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_CustomerReferenceId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCustomerReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Reference Id</em>' attribute.
	 * @see #getCustomerReferenceId()
	 * @generated
	 */
	void setCustomerReferenceId(String value);

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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exempt Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exempt Amount</em>' attribute.
	 * @see #setExemptAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_ExemptAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getExemptAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getExemptAmount <em>Exempt Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exempt Amount</em>' attribute.
	 * @see #getExemptAmount()
	 * @generated
	 */
	void setExemptAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include In Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Shipping</em>' attribute.
	 * @see #setIncludeInShipping(boolean)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_IncludeInShipping()
	 * @model required="true"
	 * @generated
	 */
	boolean isIncludeInShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInShipping <em>Include In Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Shipping</em>' attribute.
	 * @see #isIncludeInShipping()
	 * @generated
	 */
	void setIncludeInShipping(boolean value);

	/**
	 * Returns the value of the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include In Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Tax</em>' attribute.
	 * @see #setIncludeInTax(boolean)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_IncludeInTax()
	 * @model required="true"
	 * @generated
	 */
	boolean isIncludeInTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#isIncludeInTax <em>Include In Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Tax</em>' attribute.
	 * @see #isIncludeInTax()
	 * @generated
	 */
	void setIncludeInTax(boolean value);

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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account</em>' reference.
	 * @see #setOverrideGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_OverrideGlAccount()
	 * @model keys="glAccountId"
	 * @generated
	 */
	GlAccount getOverrideGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getOverrideGlAccount <em>Override Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account</em>' reference.
	 * @see #getOverrideGlAccount()
	 * @generated
	 */
	void setOverrideGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Primary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Geo</em>' reference.
	 * @see #setPrimaryGeo(Geo)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_PrimaryGeo()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getPrimaryGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getPrimaryGeo <em>Primary Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Geo</em>' reference.
	 * @see #getPrimaryGeo()
	 * @generated
	 */
	void setPrimaryGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' attribute.
	 * @see #setProductFeatureId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_ProductFeatureId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo</em>' reference.
	 * @see #setProductPromo(ProductPromo)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_ProductPromo()
	 * @model keys="productPromoId"
	 * @generated
	 */
	ProductPromo getProductPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromo <em>Product Promo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo</em>' reference.
	 * @see #getProductPromo()
	 * @generated
	 */
	void setProductPromo(ProductPromo value);

	/**
	 * Returns the value of the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #setProductPromoActionSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_ProductPromoActionSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 */
	void setProductPromoActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #setProductPromoRuleId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_ProductPromoRuleId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #getProductPromoRuleId()
	 * @generated
	 */
	void setProductPromoRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote</em>' reference.
	 * @see #setQuote(Quote)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_Quote()
	 * @model keys="quoteId"
	 * @generated
	 */
	Quote getQuote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuote <em>Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' reference.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(Quote value);

	/**
	 * Returns the value of the '<em><b>Quote Adjustment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Adjustment Type</em>' reference.
	 * @see #setQuoteAdjustmentType(OrderAdjustmentType)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_QuoteAdjustmentType()
	 * @model keys="orderAdjustmentTypeId"
	 * @generated
	 */
	OrderAdjustmentType getQuoteAdjustmentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentType <em>Quote Adjustment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Adjustment Type</em>' reference.
	 * @see #getQuoteAdjustmentType()
	 * @generated
	 */
	void setQuoteAdjustmentType(OrderAdjustmentType value);

	/**
	 * Returns the value of the '<em><b>Quote Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Adjustment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Adjustment Id</em>' attribute.
	 * @see #setQuoteAdjustmentId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_QuoteAdjustmentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteAdjustmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteAdjustmentId <em>Quote Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Adjustment Id</em>' attribute.
	 * @see #getQuoteAdjustmentId()
	 * @generated
	 */
	void setQuoteAdjustmentId(String value);

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
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_QuoteItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getQuoteItemSeqId <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #getQuoteItemSeqId()
	 * @generated
	 */
	void setQuoteItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Secondary Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Geo</em>' reference.
	 * @see #setSecondaryGeo(Geo)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_SecondaryGeo()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getSecondaryGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSecondaryGeo <em>Secondary Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Geo</em>' reference.
	 * @see #getSecondaryGeo()
	 * @generated
	 */
	void setSecondaryGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Percentage</em>' attribute.
	 * @see #setSourcePercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_SourcePercentage()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getSourcePercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourcePercentage <em>Source Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Percentage</em>' attribute.
	 * @see #getSourcePercentage()
	 * @generated
	 */
	void setSourcePercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference Id</em>' attribute.
	 * @see #setSourceReferenceId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_SourceReferenceId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSourceReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getSourceReferenceId <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference Id</em>' attribute.
	 * @see #getSourceReferenceId()
	 * @generated
	 */
	void setSourceReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_TaxAuthGeoId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteAdjustment_TaxAuthPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

} // QuoteAdjustment
