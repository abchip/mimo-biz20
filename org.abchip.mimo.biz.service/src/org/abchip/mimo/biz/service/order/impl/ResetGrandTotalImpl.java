/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;

import org.abchip.mimo.biz.service.order.OrderPackage;
import org.abchip.mimo.biz.service.order.ResetGrandTotal;

import org.abchip.mimo.biz.service.order.ResetGrandTotalResponse;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset Grand Total</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ResetGrandTotalImpl#getOrderId <em>Order Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResetGrandTotalImpl extends BizServiceRequestImpl<ResetGrandTotalResponse> implements ResetGrandTotal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetGrandTotalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.RESET_GRAND_TOTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return (String)eGet(OrderPackage.Literals.RESET_GRAND_TOTAL__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		eSet(OrderPackage.Literals.RESET_GRAND_TOTAL__ORDER_ID, newOrderId);
	}

} //ResetGrandTotalImpl
