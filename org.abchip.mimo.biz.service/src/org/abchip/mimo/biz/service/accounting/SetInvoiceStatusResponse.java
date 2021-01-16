/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting;

import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Invoice Status Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getOldStatusId <em>Old Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatusResponse()
 * @model
 * @generated
 */
public interface SetInvoiceStatusResponse extends ServiceResponse {

	/**
	 * Returns the value of the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #setInvoiceTypeId(String)
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatusResponse_InvoiceTypeId()
	 * @model
	 * @generated
	 */
	String getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getInvoiceTypeId <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Old Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Status Id</em>' attribute.
	 * @see #setOldStatusId(String)
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatusResponse_OldStatusId()
	 * @model
	 * @generated
	 */
	String getOldStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse#getOldStatusId <em>Old Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Status Id</em>' attribute.
	 * @see #getOldStatusId()
	 * @generated
	 */
	void setOldStatusId(String value);
} // SetInvoiceStatusResponse
