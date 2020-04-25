/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting;

import java.util.Date;
import org.abchip.mimo.biz.service.BizServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Invoice Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getPaidDate <em>Paid Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatus()
 * @model
 * @generated
 */
public interface SetInvoiceStatus extends BizServiceRequest<SetInvoiceStatusResponse> {

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatus_InvoiceId()
	 * @model required="true"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Date</em>' attribute.
	 * @see #setPaidDate(Date)
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatus_PaidDate()
	 * @model
	 * @generated
	 */
	Date getPaidDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getPaidDate <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Date</em>' attribute.
	 * @see #getPaidDate()
	 * @generated
	 */
	void setPaidDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(Date)
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatus_StatusDate()
	 * @model
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getSetInvoiceStatus_StatusId()
	 * @model required="true"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.accounting.SetInvoiceStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);
} // SetInvoiceStatus
