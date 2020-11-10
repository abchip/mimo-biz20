/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request;

import org.abchip.mimo.biz.BizEntityNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestNote#getCustRequest <em>Cust Request</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestNote()
 * @model annotation="mimo-ent-frame title='Customer Request Note'"
 * @generated
 */
public interface CustRequestNote extends BizEntityNote {
	/**
	 * Returns the value of the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request</em>' reference.
	 * @see #setCustRequest(CustRequest)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestNote_CustRequest()
	 * @model keys="custRequestId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CustRequest getCustRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestNote#getCustRequest <em>Cust Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request</em>' reference.
	 * @see #getCustRequest()
	 * @generated
	 */
	void setCustRequest(CustRequest value);

} // CustRequestNote
