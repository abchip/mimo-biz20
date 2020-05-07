/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.util.List;

import org.abchip.mimo.biz.model.order.order.OrderAdjustment;

import org.abchip.mimo.biz.service.product.CalcTaxResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Tax Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxResponseImpl#getOrderAdjustments <em>Order Adjustments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaxResponseImpl extends ServiceResponseImpl implements CalcTaxResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaxResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALC_TAX_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 4;

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
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderAdjustment> getOrderAdjustments() {
		return (List<OrderAdjustment>)eGet(ProductPackage.Literals.CALC_TAX_RESPONSE__ORDER_ADJUSTMENTS, true);
	}

} //CalcTaxResponseImpl
