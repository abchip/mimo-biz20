/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.accounting.payment.PaymentAttribute;
import org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.model.accounting.payment.PaymentType;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getActualCurrencyAmount <em>Actual Currency Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getActualCurrencyUom <em>Actual Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getFinAccountTrans <em>Fin Account Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentAttributes <em>Payment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentGatewayResponse <em>Payment Gateway Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentPreference <em>Payment Preference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentRefNum <em>Payment Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends EntityTypedImpl<PaymentType> implements Payment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT;
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
	public BigDecimal getActualCurrencyAmount() {
		return (BigDecimal)eGet(PaymentPackage.Literals.PAYMENT__ACTUAL_CURRENCY_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCurrencyAmount(BigDecimal newActualCurrencyAmount) {
		eSet(PaymentPackage.Literals.PAYMENT__ACTUAL_CURRENCY_AMOUNT, newActualCurrencyAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getActualCurrencyUom() {
		return (Uom)eGet(PaymentPackage.Literals.PAYMENT__ACTUAL_CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCurrencyUom(Uom newActualCurrencyUom) {
		eSet(PaymentPackage.Literals.PAYMENT__ACTUAL_CURRENCY_UOM, newActualCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(PaymentPackage.Literals.PAYMENT__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(PaymentPackage.Literals.PAYMENT__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(PaymentPackage.Literals.PAYMENT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(PaymentPackage.Literals.PAYMENT__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(PaymentPackage.Literals.PAYMENT__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEffectiveDate() {
		return (Date)eGet(PaymentPackage.Literals.PAYMENT__EFFECTIVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveDate(Date newEffectiveDate) {
		eSet(PaymentPackage.Literals.PAYMENT__EFFECTIVE_DATE, newEffectiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTrans getFinAccountTrans() {
		return (FinAccountTrans)eGet(PaymentPackage.Literals.PAYMENT__FIN_ACCOUNT_TRANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTrans(FinAccountTrans newFinAccountTrans) {
		eSet(PaymentPackage.Literals.PAYMENT__FIN_ACCOUNT_TRANS, newFinAccountTrans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getOverrideGlAccount() {
		return (GlAccount)eGet(PaymentPackage.Literals.PAYMENT__OVERRIDE_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccount(GlAccount newOverrideGlAccount) {
		eSet(PaymentPackage.Literals.PAYMENT__OVERRIDE_GL_ACCOUNT, newOverrideGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		return (Party)eGet(PaymentPackage.Literals.PAYMENT__PARTY_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		eSet(PaymentPackage.Literals.PAYMENT__PARTY_ID_FROM, newPartyIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		return (Party)eGet(PaymentPackage.Literals.PAYMENT__PARTY_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		eSet(PaymentPackage.Literals.PAYMENT__PARTY_ID_TO, newPartyIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PaymentAttribute> getPaymentAttributes() {
		return (List<PaymentAttribute>)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayResponse getPaymentGatewayResponse() {
		return (PaymentGatewayResponse)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_GATEWAY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayResponse(PaymentGatewayResponse newPaymentGatewayResponse) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_GATEWAY_RESPONSE, newPaymentGatewayResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethod() {
		return (PaymentMethod)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_METHOD, newPaymentMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodType() {
		return (PaymentMethodType)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_METHOD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodType(PaymentMethodType newPaymentMethodType) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_METHOD_TYPE, newPaymentMethodType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPaymentPreference getPaymentPreference() {
		return (OrderPaymentPreference)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_PREFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentPreference(OrderPaymentPreference newPaymentPreference) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_PREFERENCE, newPaymentPreference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentRefNum() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_REF_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentRefNum(String newPaymentRefNum) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_REF_NUM, newPaymentRefNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentType getPaymentType() {
		return (PaymentType)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentType(PaymentType newPaymentType) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_TYPE, newPaymentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdTo() {
		return (RoleType)eGet(PaymentPackage.Literals.PAYMENT__ROLE_TYPE_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		eSet(PaymentPackage.Literals.PAYMENT__ROLE_TYPE_ID_TO, newRoleTypeIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(PaymentPackage.Literals.PAYMENT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(PaymentPackage.Literals.PAYMENT__STATUS, newStatus);
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
				case PaymentPackage.PAYMENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PaymentPackage.PAYMENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PaymentPackage.PAYMENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PaymentPackage.PAYMENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PaymentPackage.PAYMENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PaymentPackage.PAYMENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PaymentPackage.PAYMENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PaymentPackage.PAYMENT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT__PAYMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		eSet(PaymentPackage.Literals.PAYMENT__PAYMENT_ID, newPaymentId);
	}

} //PaymentImpl
