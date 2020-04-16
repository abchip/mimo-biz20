/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment.impl;

import java.util.Date;

import org.abchip.mimo.biz.model.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.model.impl.BizEntityImpl;
import org.abchip.mimo.biz.model.party.party.Party;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentMethodImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentMethodImpl extends BizEntityImpl implements PaymentMethod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_METHOD__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(PaymentPackage.Literals.PAYMENT_METHOD__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(PaymentPackage.Literals.PAYMENT_METHOD__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PaymentPackage.Literals.PAYMENT_METHOD__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		return (PaymentMethodType)eGet(PaymentPackage.Literals.PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID, newPaymentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccountId() {
		return (GlAccount)eGet(PaymentPackage.Literals.PAYMENT_METHOD__GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__GL_ACCOUNT_ID, newGlAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		return (FinAccount)eGet(PaymentPackage.Literals.PAYMENT_METHOD__FIN_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__FIN_ACCOUNT_ID, newFinAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_METHOD__PAYMENT_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(String newPaymentMethodId) {
		eSet(PaymentPackage.Literals.PAYMENT_METHOD__PAYMENT_METHOD_ID, newPaymentMethodId);
	}

} //PaymentMethodImpl
