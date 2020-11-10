/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.quote.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.order.order.OrderAdjustmentType;
import org.abchip.mimo.biz.model.order.quote.Quote;
import org.abchip.mimo.biz.model.order.quote.QuoteAdjustment;
import org.abchip.mimo.biz.model.order.quote.QuotePackage;
import org.abchip.mimo.biz.model.product.promo.ProductPromo;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getQuoteAdjustmentId <em>Quote Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getPrimaryGeo <em>Primary Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getQuoteAdjustmentType <em>Quote Adjustment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getSecondaryGeo <em>Secondary Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.impl.QuoteAdjustmentImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteAdjustmentImpl extends EntityIdentifiableImpl implements QuoteAdjustment {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuotePackage.Literals.QUOTE_ADJUSTMENT;
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
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrespondingProductId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CORRESPONDING_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondingProductId(String newCorrespondingProductId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CORRESPONDING_PRODUCT_ID, newCorrespondingProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerReferenceId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CUSTOMER_REFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerReferenceId(String newCustomerReferenceId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__CUSTOMER_REFERENCE_ID, newCustomerReferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExemptAmount() {
		return (BigDecimal)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__EXEMPT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExemptAmount(BigDecimal newExemptAmount) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__EXEMPT_AMOUNT, newExemptAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInShipping() {
		return (Boolean)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__INCLUDE_IN_SHIPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInShipping(boolean newIncludeInShipping) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__INCLUDE_IN_SHIPPING, newIncludeInShipping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInTax() {
		return (Boolean)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__INCLUDE_IN_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInTax(boolean newIncludeInTax) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__INCLUDE_IN_TAX, newIncludeInTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getOverrideGlAccount() {
		return (GlAccount)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__OVERRIDE_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccount(GlAccount newOverrideGlAccount) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__OVERRIDE_GL_ACCOUNT, newOverrideGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getPrimaryGeo() {
		return (Geo)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRIMARY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryGeo(Geo newPrimaryGeo) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRIMARY_GEO, newPrimaryGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_FEATURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_FEATURE_ID, newProductFeatureId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromo getProductPromo() {
		return (ProductPromo)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_PROMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromo(ProductPromo newProductPromo) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_PROMO, newProductPromo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoActionSeqId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionSeqId(String newProductPromoActionSeqId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID, newProductPromoActionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_PROMO_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__PRODUCT_PROMO_RULE_ID, newProductPromoRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quote getQuote() {
		return (Quote)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuote(Quote newQuote) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE, newQuote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustmentType getQuoteAdjustmentType() {
		return (OrderAdjustmentType)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteAdjustmentType(OrderAdjustmentType newQuoteAdjustmentType) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_TYPE, newQuoteAdjustmentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteAdjustmentId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteAdjustmentId(String newQuoteAdjustmentId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_ID, newQuoteAdjustmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteItemSeqId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteItemSeqId(String newQuoteItemSeqId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__QUOTE_ITEM_SEQ_ID, newQuoteItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getSecondaryGeo() {
		return (Geo)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__SECONDARY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryGeo(Geo newSecondaryGeo) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__SECONDARY_GEO, newSecondaryGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSourcePercentage() {
		return (BigDecimal)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__SOURCE_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePercentage(BigDecimal newSourcePercentage) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__SOURCE_PERCENTAGE, newSourcePercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceReferenceId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__SOURCE_REFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReferenceId(String newSourceReferenceId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__SOURCE_REFERENCE_ID, newSourceReferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__TAX_AUTH_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__TAX_AUTH_GEO_ID, newTaxAuthGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return (String)eGet(QuotePackage.Literals.QUOTE_ADJUSTMENT__TAX_AUTH_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		eSet(QuotePackage.Literals.QUOTE_ADJUSTMENT__TAX_AUTH_PARTY_ID, newTaxAuthPartyId);
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
				case QuotePackage.QUOTE_ADJUSTMENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case QuotePackage.QUOTE_ADJUSTMENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case QuotePackage.QUOTE_ADJUSTMENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case QuotePackage.QUOTE_ADJUSTMENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return QuotePackage.QUOTE_ADJUSTMENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return QuotePackage.QUOTE_ADJUSTMENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return QuotePackage.QUOTE_ADJUSTMENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return QuotePackage.QUOTE_ADJUSTMENT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //QuoteAdjustmentImpl
