/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.order.order.OrderAdjustment;
import org.abchip.mimo.biz.model.order.return_.ReturnAdjustment;
import org.abchip.mimo.biz.model.order.return_.ReturnAdjustmentType;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnPackage;
import org.abchip.mimo.biz.model.order.return_.ReturnType;
import org.abchip.mimo.biz.model.product.promo.ProductPromo;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getReturnAdjustmentId <em>Return Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getOrderAdjustment <em>Order Adjustment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getPrimaryGeo <em>Primary Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getReturnAdjustmentType <em>Return Adjustment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getSecondaryGeo <em>Secondary Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthorityRateSeq <em>Tax Authority Rate Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnAdjustmentImpl extends EntityTypedImpl<ReturnAdjustmentType> implements ReturnAdjustment {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ADJUSTMENT;
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
		return (BigDecimal)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrespondingProductId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondingProductId(String newCorrespondingProductId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID, newCorrespondingProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerReferenceId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerReferenceId(String newCustomerReferenceId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID, newCustomerReferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExemptAmount() {
		return (BigDecimal)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__EXEMPT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExemptAmount(BigDecimal newExemptAmount) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__EXEMPT_AMOUNT, newExemptAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeInShipping() {
		return (Boolean)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInShipping(Boolean newIncludeInShipping) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING, newIncludeInShipping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeInTax() {
		return (Boolean)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__INCLUDE_IN_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInTax(Boolean newIncludeInTax) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__INCLUDE_IN_TAX, newIncludeInTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustment getOrderAdjustment() {
		return (OrderAdjustment)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderAdjustment(OrderAdjustment newOrderAdjustment) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT, newOrderAdjustment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getOverrideGlAccount() {
		return (GlAccount)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccount(GlAccount newOverrideGlAccount) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT, newOverrideGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getPrimaryGeo() {
		return (Geo)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRIMARY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryGeo(Geo newPrimaryGeo) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRIMARY_GEO, newPrimaryGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID, newProductFeatureId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromo getProductPromo() {
		return (ProductPromo)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_PROMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromo(ProductPromo newProductPromo) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_PROMO, newProductPromo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoActionSeqId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionSeqId(String newProductPromoActionSeqId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID, newProductPromoActionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID, newProductPromoRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getReturn() {
		return (ReturnHeader)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturn(ReturnHeader newReturn) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN, newReturn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnAdjustmentType getReturnAdjustmentType() {
		return (ReturnAdjustmentType)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnAdjustmentType(ReturnAdjustmentType newReturnAdjustmentType) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE, newReturnAdjustmentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnAdjustmentId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnAdjustmentId(String newReturnAdjustmentId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID, newReturnAdjustmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID, newReturnItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturnType() {
		return (ReturnType)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(ReturnType newReturnType) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getSecondaryGeo() {
		return (Geo)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SECONDARY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryGeo(Geo newSecondaryGeo) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SECONDARY_GEO, newSecondaryGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSourcePercentage() {
		return (BigDecimal)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePercentage(BigDecimal newSourcePercentage) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE, newSourcePercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceReferenceId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReferenceId(String newSourceReferenceId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID, newSourceReferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID, newTaxAuthGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID, newTaxAuthPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityRateProduct getTaxAuthorityRateSeq() {
		return (TaxAuthorityRateProduct)eGet(ReturnPackage.Literals.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeq(TaxAuthorityRateProduct newTaxAuthorityRateSeq) {
		eSet(ReturnPackage.Literals.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ, newTaxAuthorityRateSeq);
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
				case ReturnPackage.RETURN_ADJUSTMENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case ReturnPackage.RETURN_ADJUSTMENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case ReturnPackage.RETURN_ADJUSTMENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case ReturnPackage.RETURN_ADJUSTMENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return ReturnPackage.RETURN_ADJUSTMENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return ReturnPackage.RETURN_ADJUSTMENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return ReturnPackage.RETURN_ADJUSTMENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return ReturnPackage.RETURN_ADJUSTMENT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReturnAdjustmentImpl
