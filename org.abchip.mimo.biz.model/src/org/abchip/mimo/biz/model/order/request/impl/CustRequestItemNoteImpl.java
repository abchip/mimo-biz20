/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request.impl;

import org.abchip.mimo.biz.impl.BizEntityNoteImpl;
import org.abchip.mimo.biz.model.order.request.CustRequestItemNote;
import org.abchip.mimo.biz.model.order.request.RequestPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request Item Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.impl.CustRequestItemNoteImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.impl.CustRequestItemNoteImpl#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestItemNoteImpl extends BizEntityNoteImpl implements CustRequestItemNote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustRequestItemNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST_ITEM_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestId() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(String newCustRequestId) {
		eSet(RequestPackage.Literals.CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ID, newCustRequestId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestItemSeqId() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestItemSeqId(String newCustRequestItemSeqId) {
		eSet(RequestPackage.Literals.CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ITEM_SEQ_ID, newCustRequestItemSeqId);
	}

} //CustRequestItemNoteImpl
