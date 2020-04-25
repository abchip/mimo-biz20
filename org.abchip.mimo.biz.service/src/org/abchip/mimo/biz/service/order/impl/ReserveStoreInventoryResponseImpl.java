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
import org.abchip.mimo.biz.service.order.OrderPackage;
import org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve Store Inventory Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryResponseImpl#getQuantityNotReserved <em>Quantity Not Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveStoreInventoryResponseImpl extends BizServiceResponseImpl implements ReserveStoreInventoryResponse {
	/**
	 * The default value of the '{@link #getQuantityNotReserved() <em>Quantity Not Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNotReserved()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_NOT_RESERVED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuantityNotReserved() <em>Quantity Not Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNotReserved()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityNotReserved = QUANTITY_NOT_RESERVED_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveStoreInventoryResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.RESERVE_STORE_INVENTORY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityNotReserved() {
		return quantityNotReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityNotReserved(BigDecimal newQuantityNotReserved) {
		BigDecimal oldQuantityNotReserved = quantityNotReserved;
		quantityNotReserved = newQuantityNotReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED, oldQuantityNotReserved, quantityNotReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED:
				return getQuantityNotReserved();
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
			case OrderPackage.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED:
				setQuantityNotReserved((BigDecimal)newValue);
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
			case OrderPackage.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED:
				setQuantityNotReserved(QUANTITY_NOT_RESERVED_EDEFAULT);
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
			case OrderPackage.RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED:
				return QUANTITY_NOT_RESERVED_EDEFAULT == null ? quantityNotReserved != null : !QUANTITY_NOT_RESERVED_EDEFAULT.equals(quantityNotReserved);
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
		result.append(" (quantityNotReserved: ");
		result.append(quantityNotReserved);
		result.append(')');
		return result.toString();
	}

} //ReserveStoreInventoryResponseImpl
