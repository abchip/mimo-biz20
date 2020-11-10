/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request.impl;

import org.abchip.mimo.biz.impl.BizEntityNoteImpl;
import org.abchip.mimo.biz.model.order.request.CustRequest;
import org.abchip.mimo.biz.model.order.request.CustRequestNote;
import org.abchip.mimo.biz.model.order.request.RequestPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.impl.CustRequestNoteImpl#getCustRequest <em>Cust Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestNoteImpl extends BizEntityNoteImpl implements CustRequestNote {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustRequestNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequest getCustRequest() {
		return (CustRequest)eGet(RequestPackage.Literals.CUST_REQUEST_NOTE__CUST_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequest(CustRequest newCustRequest) {
		eSet(RequestPackage.Literals.CUST_REQUEST_NOTE__CUST_REQUEST, newCustRequest);
	}

} //CustRequestNoteImpl
