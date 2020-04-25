/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import org.abchip.mimo.biz.service.accounting.AccountingPackage;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse;

import org.abchip.mimo.biz.service.impl.BizServiceResponseImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Invoice Status Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusResponseImpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.impl.SetInvoiceStatusResponseImpl#getOldStatusId <em>Old Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetInvoiceStatusResponseImpl extends BizServiceResponseImpl implements SetInvoiceStatusResponse {
	/**
	 * The default value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceTypeId = INVOICE_TYPE_ID_EDEFAULT;
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
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetInvoiceStatusResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.SET_INVOICE_STATUS_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceTypeId() {
		return invoiceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceTypeId(String newInvoiceTypeId) {
		String oldInvoiceTypeId = invoiceTypeId;
		invoiceTypeId = newInvoiceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID, oldOldStatusId, oldStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID:
				return getInvoiceTypeId();
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID:
				return getOldStatusId();
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
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID:
				setInvoiceTypeId((String)newValue);
				return;
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID:
				setOldStatusId((String)newValue);
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
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID:
				setInvoiceTypeId(INVOICE_TYPE_ID_EDEFAULT);
				return;
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID:
				setOldStatusId(OLD_STATUS_ID_EDEFAULT);
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
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID:
				return INVOICE_TYPE_ID_EDEFAULT == null ? invoiceTypeId != null : !INVOICE_TYPE_ID_EDEFAULT.equals(invoiceTypeId);
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID:
				return OLD_STATUS_ID_EDEFAULT == null ? oldStatusId != null : !OLD_STATUS_ID_EDEFAULT.equals(oldStatusId);
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
		result.append(" (invoiceTypeId: ");
		result.append(invoiceTypeId);
		result.append(", oldStatusId: ");
		result.append(oldStatusId);
		result.append(')');
		return result.toString();
	}

} //SetInvoiceStatusResponseImpl
