/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import org.abchip.mimo.biz.service.accounting.AccountingPackage;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Payment Application Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.impl.UpdatePaymentApplicationDefImpl#getPaymentId <em>Payment Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdatePaymentApplicationDefImpl extends ServiceRequestImpl<UpdatePaymentApplicationDefResponse> implements UpdatePaymentApplicationDef {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatePaymentApplicationDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.UPDATE_PAYMENT_APPLICATION_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return (String)eGet(AccountingPackage.Literals.UPDATE_PAYMENT_APPLICATION_DEF__INVOICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		eSet(AccountingPackage.Literals.UPDATE_PAYMENT_APPLICATION_DEF__INVOICE_ID, newInvoiceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return (String)eGet(AccountingPackage.Literals.UPDATE_PAYMENT_APPLICATION_DEF__PAYMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		eSet(AccountingPackage.Literals.UPDATE_PAYMENT_APPLICATION_DEF__PAYMENT_ID, newPaymentId);
	}

} //UpdatePaymentApplicationDefImpl
