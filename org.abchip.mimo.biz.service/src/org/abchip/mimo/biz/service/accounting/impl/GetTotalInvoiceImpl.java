/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.service.accounting.AccountingPackage;
import org.abchip.mimo.biz.service.accounting.GetTotalInvoice;
import org.abchip.mimo.service.impl.ServiceMethodRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Invoice
 * Get Total</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetTotalInvoiceImpl extends ServiceMethodRequestImpl<Invoice, BigDecimal> implements GetTotalInvoice {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GetTotalInvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.GET_TOTAL_INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 5;

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
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setEntity(Invoice newEntity) {
		super.setEntity(newEntity);
	}

} // GetTotalInvoiceImpl
