/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.service.impl.BizServiceResponseImpl;

import org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse;
import org.abchip.mimo.biz.service.order.OrderPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class ChangeOrderStatusResponseImpl extends BizServiceResponseImpl implements ChangeOrderStatusResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GRAND_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal grandTotal = GRAND_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedsInventoryIssuance() <em>Needs Inventory Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsInventoryIssuance()
	 * @generated
	 * @ordered
	 */
	protected static final String NEEDS_INVENTORY_ISSUANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedsInventoryIssuance() <em>Needs Inventory Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsInventoryIssuance()
	 * @generated
	 * @ordered
	 */
	protected String needsInventoryIssuance = NEEDS_INVENTORY_ISSUANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldStatusId() <em>Old Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldStatusId() <em>Old Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldStatusId()
	 * @generated
	 * @ordered
	 */
	protected String oldStatusId = OLD_STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderStatusId() <em>Order Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderStatusId() <em>Order Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatusId()
	 * @generated
	 * @ordered
	 */
	protected String orderStatusId = ORDER_STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected String orderTypeId = ORDER_TYPE_ID_EDEFAULT;

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
	@Override
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrandTotal(BigDecimal newGrandTotal) {
		BigDecimal oldGrandTotal = grandTotal;
		grandTotal = newGrandTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL, oldGrandTotal, grandTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNeedsInventoryIssuance() {
		return needsInventoryIssuance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsInventoryIssuance(String newNeedsInventoryIssuance) {
		String oldNeedsInventoryIssuance = needsInventoryIssuance;
		needsInventoryIssuance = newNeedsInventoryIssuance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE, oldNeedsInventoryIssuance, needsInventoryIssuance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldStatusId() {
		return oldStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldStatusId(String newOldStatusId) {
		String oldOldStatusId = oldStatusId;
		oldStatusId = newOldStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID, oldOldStatusId, oldStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderStatusId() {
		return orderStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderStatusId(String newOrderStatusId) {
		String oldOrderStatusId = orderStatusId;
		orderStatusId = newOrderStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID, oldOrderStatusId, orderStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderTypeId() {
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(String newOrderTypeId) {
		String oldOrderTypeId = orderTypeId;
		orderTypeId = newOrderTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID, oldOrderTypeId, orderTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL:
				return getGrandTotal();
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE:
				return getNeedsInventoryIssuance();
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID:
				return getOldStatusId();
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID:
				return getOrderStatusId();
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID:
				return getOrderTypeId();
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
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL:
				setGrandTotal((BigDecimal)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE:
				setNeedsInventoryIssuance((String)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID:
				setOldStatusId((String)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID:
				setOrderStatusId((String)newValue);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID:
				setOrderTypeId((String)newValue);
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
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL:
				setGrandTotal(GRAND_TOTAL_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE:
				setNeedsInventoryIssuance(NEEDS_INVENTORY_ISSUANCE_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID:
				setOldStatusId(OLD_STATUS_ID_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID:
				setOrderStatusId(ORDER_STATUS_ID_EDEFAULT);
				return;
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID:
				setOrderTypeId(ORDER_TYPE_ID_EDEFAULT);
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
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL:
				return GRAND_TOTAL_EDEFAULT == null ? grandTotal != null : !GRAND_TOTAL_EDEFAULT.equals(grandTotal);
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE:
				return NEEDS_INVENTORY_ISSUANCE_EDEFAULT == null ? needsInventoryIssuance != null : !NEEDS_INVENTORY_ISSUANCE_EDEFAULT.equals(needsInventoryIssuance);
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID:
				return OLD_STATUS_ID_EDEFAULT == null ? oldStatusId != null : !OLD_STATUS_ID_EDEFAULT.equals(oldStatusId);
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID:
				return ORDER_STATUS_ID_EDEFAULT == null ? orderStatusId != null : !ORDER_STATUS_ID_EDEFAULT.equals(orderStatusId);
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID:
				return ORDER_TYPE_ID_EDEFAULT == null ? orderTypeId != null : !ORDER_TYPE_ID_EDEFAULT.equals(orderTypeId);
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
		result.append(" (grandTotal: ");
		result.append(grandTotal);
		result.append(", needsInventoryIssuance: ");
		result.append(needsInventoryIssuance);
		result.append(", oldStatusId: ");
		result.append(oldStatusId);
		result.append(", orderStatusId: ");
		result.append(orderStatusId);
		result.append(", orderTypeId: ");
		result.append(orderTypeId);
		result.append(')');
		return result.toString();
	}

} //ChangeOrderStatusResponseImpl
