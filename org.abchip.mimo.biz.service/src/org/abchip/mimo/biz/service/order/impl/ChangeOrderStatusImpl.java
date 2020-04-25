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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getChangeReason() <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeReason()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeReason() <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeReason()
	 * @generated
	 * @ordered
	 */
	protected String changeReason = CHANGE_REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSetItemStatus() <em>Set Item Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SET_ITEM_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSetItemStatus() <em>Set Item Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean setItemStatus = SET_ITEM_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

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
		return changeReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeReason(String newChangeReason) {
		String oldChangeReason = changeReason;
		changeReason = newChangeReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS__CHANGE_REASON, oldChangeReason, changeReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetItemStatus() {
		return setItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetItemStatus(boolean newSetItemStatus) {
		boolean oldSetItemStatus = setItemStatus;
		setItemStatus = newSetItemStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS__SET_ITEM_STATUS, oldSetItemStatus, setItemStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.CHANGE_ORDER_STATUS__CHANGE_REASON:
				return getChangeReason();
			case OrderPackage.CHANGE_ORDER_STATUS__ORDER_ID:
				return getOrderId();
			case OrderPackage.CHANGE_ORDER_STATUS__SET_ITEM_STATUS:
				return isSetItemStatus();
			case OrderPackage.CHANGE_ORDER_STATUS__STATUS_ID:
				return getStatusId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrderPackage.CHANGE_ORDER_STATUS__CHANGE_REASON:
				setChangeReason((String)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS__SET_ITEM_STATUS:
				setSetItemStatus((Boolean)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS__STATUS_ID:
				setStatusId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrderPackage.CHANGE_ORDER_STATUS__CHANGE_REASON:
				setChangeReason(CHANGE_REASON_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS__SET_ITEM_STATUS:
				setSetItemStatus(SET_ITEM_STATUS_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrderPackage.CHANGE_ORDER_STATUS__CHANGE_REASON:
				return CHANGE_REASON_EDEFAULT == null ? changeReason != null : !CHANGE_REASON_EDEFAULT.equals(changeReason);
			case OrderPackage.CHANGE_ORDER_STATUS__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.CHANGE_ORDER_STATUS__SET_ITEM_STATUS:
				return setItemStatus != SET_ITEM_STATUS_EDEFAULT;
			case OrderPackage.CHANGE_ORDER_STATUS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (changeReason: ");
		result.append(changeReason);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", setItemStatus: ");
		result.append(setItemStatus);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //ChangeOrderStatusImpl
