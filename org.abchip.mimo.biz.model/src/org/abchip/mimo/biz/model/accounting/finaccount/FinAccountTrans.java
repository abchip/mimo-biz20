/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.finaccount;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccount <em>Fin Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransAttributes <em>Fin Account Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransType <em>Fin Account Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getGlReconciliation <em>Gl Reconciliation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPerformedByParty <em>Performed By Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getTransactionDate <em>Transaction Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans()
 * @model annotation="mimo-ent-frame title='Financial Account Transaction'"
 * @generated
 */
public interface FinAccountTrans extends EntityTyped<FinAccountTransType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getAmount <em>Amount</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

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
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getEntryDate <em>Entry Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_FinAccount()
	 * @model
	 * @generated
	 */
	FinAccount getFinAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccount <em>Fin Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account</em>' reference.
	 * @see #getFinAccount()
	 * @generated
	 */
	void setFinAccount(FinAccount value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_FinAccountTransAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<FinAccountTransAttribute> getFinAccountTransAttributes();

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_OrderId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_OrderItemSeqId()
	 * @model annotation="mimo-ent-slot help='To be used along with orderId to point to an OrderItem that represents the purchase of a product to add money to the account.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_Payment()
	 * @model
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Performed By Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By Party</em>' reference.
	 * @see #setPerformedByParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_PerformedByParty()
	 * @model
	 * @generated
	 */
	Party getPerformedByParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPerformedByParty <em>Performed By Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed By Party</em>' reference.
	 * @see #getPerformedByParty()
	 * @generated
	 */
	void setPerformedByParty(Party value);

	/**
	 * Returns the value of the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Enum</em>' reference.
	 * @see #setReasonEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_ReasonEnum()
	 * @model
	 * @generated
	 */
	Enumeration getReasonEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getReasonEnum <em>Reason Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Enum</em>' reference.
	 * @see #getReasonEnum()
	 * @generated
	 */
	void setReasonEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_TransactionDate()
	 * @model
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Type</em>' reference.
	 * @see #setFinAccountTransType(FinAccountTransType)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_FinAccountTransType()
	 * @model
	 * @generated
	 */
	FinAccountTransType getFinAccountTransType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransType <em>Fin Account Trans Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Type</em>' reference.
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	void setFinAccountTransType(FinAccountTransType value);

	/**
	 * Returns the value of the '<em><b>Gl Reconciliation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Reconciliation</em>' reference.
	 * @see #setGlReconciliation(GlReconciliation)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_GlReconciliation()
	 * @model
	 * @generated
	 */
	GlReconciliation getGlReconciliation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getGlReconciliation <em>Gl Reconciliation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Reconciliation</em>' reference.
	 * @see #getGlReconciliation()
	 * @generated
	 */
	void setGlReconciliation(GlReconciliation value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #setFinAccountTransId(String)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTrans_FinAccountTransId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFinAccountTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #getFinAccountTransId()
	 * @generated
	 */
	void setFinAccountTransId(String value);

} // FinAccountTrans
