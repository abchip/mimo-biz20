/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;

import org.abchip.mimo.biz.service.order.ChangeOrderStatus;
import org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse;
import org.abchip.mimo.biz.service.order.OrderPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Order Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl#getChangeReason <em>Change Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl#isSetItemStatus <em>Set Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ChangeOrderStatusImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeOrderStatusImpl extends BizServiceRequestImpl<ChangeOrderStatusResponse> implements ChangeOrderStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOrderStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.CHANGE_ORDER_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeReason() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS__CHANGE_REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeReason(String newChangeReason) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS__CHANGE_REASON, newChangeReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetItemStatus() {
		return (Boolean)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS__SET_ITEM_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetItemStatus(boolean newSetItemStatus) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS__SET_ITEM_STATUS, newSetItemStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return (String)eGet(OrderPackage.Literals.CHANGE_ORDER_STATUS__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		eSet(OrderPackage.Literals.CHANGE_ORDER_STATUS__STATUS_ID, newStatusId);
	}

} //ChangeOrderStatusImpl
