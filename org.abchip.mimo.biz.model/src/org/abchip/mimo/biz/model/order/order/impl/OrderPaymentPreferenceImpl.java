/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.model.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Payment Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getBillingPostalCode <em>Billing Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getFinAccount <em>Fin Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getManualAuthCode <em>Manual Auth Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getManualRefNum <em>Manual Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getMaxAmount <em>Max Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getNeedsNsfRetry <em>Needs Nsf Retry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getOverflowFlag <em>Overflow Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getPresentFlag <em>Present Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getProcessAttempt <em>Process Attempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getProductPricePurpose <em>Product Price Purpose</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getSecurityCode <em>Security Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getSwipedFlag <em>Swiped Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderPaymentPreferenceImpl#getTrack2 <em>Track2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderPaymentPreferenceImpl extends EntityIdentifiableImpl implements OrderPaymentPreference {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderPaymentPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE;
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
	public String getBillingPostalCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingPostalCode(String newBillingPostalCode) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE, newBillingPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccount() {
		return (FinAccount)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccount(FinAccount newFinAccount) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT, newFinAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualAuthCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualAuthCode(String newManualAuthCode) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE, newManualAuthCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualRefNum() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualRefNum(String newManualRefNum) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM, newManualRefNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxAmount() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAmount(BigDecimal newMaxAmount) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT, newMaxAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNeedsNsfRetry() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsNsfRetry(Boolean newNeedsNsfRetry) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY, newNeedsNsfRetry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrder() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderHeader newOrder) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOverflowFlag() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverflowFlag(Boolean newOverflowFlag) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG, newOverflowFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethod() {
		return (PaymentMethod)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD, newPaymentMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodType() {
		return (PaymentMethodType)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodType(PaymentMethodType newPaymentMethodType) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE, newPaymentMethodType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderPaymentPreferenceId() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPaymentPreferenceId(String newOrderPaymentPreferenceId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID, newOrderPaymentPreferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPresentFlag() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentFlag(Boolean newPresentFlag) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG, newPresentFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProcessAttempt() {
		return (Long)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessAttempt(long newProcessAttempt) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT, newProcessAttempt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPricePurpose getProductPricePurpose() {
		return (ProductPricePurpose)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPricePurpose(ProductPricePurpose newProductPricePurpose) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE, newProductPricePurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityCode(String newSecurityCode) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE, newSecurityCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSwipedFlag() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwipedFlag(Boolean newSwipedFlag) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG, newSwipedFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrack2() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__TRACK2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrack2(String newTrack2) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__TRACK2, newTrack2);
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
				case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OrderPaymentPreferenceImpl
