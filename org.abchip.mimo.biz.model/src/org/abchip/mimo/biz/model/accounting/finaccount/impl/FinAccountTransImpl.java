/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.finaccount.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType;
import org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getFinAccount <em>Fin Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransAttributes <em>Fin Account Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransType <em>Fin Account Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getGlReconciliation <em>Gl Reconciliation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getPerformedByParty <em>Performed By Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl#getTransactionDate <em>Transaction Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTransImpl extends EntityTypedImpl<FinAccountTransType> implements FinAccountTrans {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TRANS;
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
		return (BigDecimal)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return (Date)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__ENTRY_DATE, newEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccount() {
		return (FinAccount)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccount(FinAccount newFinAccount) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT, newFinAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FinAccountTransAttribute> getFinAccountTransAttributes() {
		return (List<FinAccountTransAttribute>)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPayment() {
		return (Payment)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__PAYMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment(Payment newPayment) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__PAYMENT, newPayment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPerformedByParty() {
		return (Party)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedByParty(Party newPerformedByParty) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY, newPerformedByParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnum() {
		return (Enumeration)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__REASON_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnum(Enumeration newReasonEnum) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__REASON_ENUM, newReasonEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTransactionDate() {
		return (Date)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__TRANSACTION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionDate(Date newTransactionDate) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__TRANSACTION_DATE, newTransactionDate);
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
				case FinaccountPackage.FIN_ACCOUNT_TRANS__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case FinaccountPackage.FIN_ACCOUNT_TRANS__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case FinaccountPackage.FIN_ACCOUNT_TRANS__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case FinaccountPackage.FIN_ACCOUNT_TRANS__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return FinaccountPackage.FIN_ACCOUNT_TRANS__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return FinaccountPackage.FIN_ACCOUNT_TRANS__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return FinaccountPackage.FIN_ACCOUNT_TRANS__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return FinaccountPackage.FIN_ACCOUNT_TRANS__LAST_UPDATED_TX_STAMP;
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
	public FinAccountTransType getFinAccountTransType() {
		return (FinAccountTransType)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransType(FinAccountTransType newFinAccountTransType) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE, newFinAccountTransType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlReconciliation getGlReconciliation() {
		return (GlReconciliation)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__GL_RECONCILIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliation(GlReconciliation newGlReconciliation) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__GL_RECONCILIATION, newGlReconciliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountTransId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransId(String newFinAccountTransId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID, newFinAccountTransId);
	}

} //FinAccountTransImpl
