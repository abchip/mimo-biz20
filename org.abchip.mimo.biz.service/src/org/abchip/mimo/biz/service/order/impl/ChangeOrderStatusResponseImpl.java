/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse;
import org.abchip.mimo.biz.service.order.OrderPackage;
import org.abchip.mimo.service.impl.ServiceResponseImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Order Status Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl#getNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl#getOldStatusId <em>Old Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl#getOrderStatusId <em>Order Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusResponseImpl#getOrderTypeId <em>Order Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeOrderStatusResponseImpl extends ServiceResponseImpl implements ChangeOrderStatusResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOrderStatusResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE;
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
	@Override
	public BigDecimal getGrandTotal() {
		return (BigDecimal)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrandTotal(BigDecimal newGrandTotal) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL, newGrandTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNeedsInventoryIssuance() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsInventoryIssuance(String newNeedsInventoryIssuance) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE, newNeedsInventoryIssuance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldStatusId() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldStatusId(String newOldStatusId) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID, newOldStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderStatusId() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderStatusId(String newOrderStatusId) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID, newOrderStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderTypeId() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(String newOrderTypeId) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID, newOrderTypeId);
	}

} //ChangeOrderStatusResponseImpl
