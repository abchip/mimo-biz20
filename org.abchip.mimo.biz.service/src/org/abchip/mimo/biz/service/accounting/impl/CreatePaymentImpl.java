/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import org.abchip.mimo.biz.service.accounting.AccountingPackage;
import org.abchip.mimo.biz.service.accounting.CreatePayment;
import org.abchip.mimo.biz.service.accounting.CreatePaymentResponse;

import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CreatePaymentImpl extends BizServiceRequestImpl<CreatePaymentResponse> implements CreatePayment {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatePaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.CREATE_PAYMENT;
	}

} //CreatePaymentImpl
