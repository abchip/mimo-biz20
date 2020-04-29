/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import org.abchip.mimo.biz.service.accounting.AccountingPackage;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatus;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatusResponse;

import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Payment Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.impl.SetPaymentStatusImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetPaymentStatusImpl extends BizServiceRequestImpl<SetPaymentStatusResponse> implements SetPaymentStatus {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPaymentStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.SET_PAYMENT_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return (String)eGet(AccountingPackage.Literals.SET_PAYMENT_STATUS__PAYMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		eSet(AccountingPackage.Literals.SET_PAYMENT_STATUS__PAYMENT_ID, newPaymentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return (String)eGet(AccountingPackage.Literals.SET_PAYMENT_STATUS__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		eSet(AccountingPackage.Literals.SET_PAYMENT_STATUS__STATUS_ID, newStatusId);
	}

} //SetPaymentStatusImpl
