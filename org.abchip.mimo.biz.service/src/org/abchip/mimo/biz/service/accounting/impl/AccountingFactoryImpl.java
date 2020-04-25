/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import org.abchip.mimo.biz.service.accounting.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingFactoryImpl extends EFactoryImpl implements AccountingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountingFactory init() {
		try {
			AccountingFactory theAccountingFactory = (AccountingFactory)EPackage.Registry.INSTANCE.getEFactory(AccountingPackage.eNS_URI);
			if (theAccountingFactory != null) {
				return theAccountingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AccountingPackage.CREATE_PAYMENT: return (EObject)createCreatePayment();
			case AccountingPackage.CREATE_PAYMENT_RESPONSE: return (EObject)createCreatePaymentResponse();
			case AccountingPackage.SET_PAYMENT_STATUS: return (EObject)createSetPaymentStatus();
			case AccountingPackage.SET_PAYMENT_STATUS_RESPONSE: return (EObject)createSetPaymentStatusResponse();
			case AccountingPackage.SET_INVOICE_STATUS: return (EObject)createSetInvoiceStatus();
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE: return (EObject)createSetInvoiceStatusResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatePayment createCreatePayment() {
		CreatePaymentImpl createPayment = new CreatePaymentImpl();
		return createPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatePaymentResponse createCreatePaymentResponse() {
		CreatePaymentResponseImpl createPaymentResponse = new CreatePaymentResponseImpl();
		return createPaymentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetPaymentStatus createSetPaymentStatus() {
		SetPaymentStatusImpl setPaymentStatus = new SetPaymentStatusImpl();
		return setPaymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetPaymentStatusResponse createSetPaymentStatusResponse() {
		SetPaymentStatusResponseImpl setPaymentStatusResponse = new SetPaymentStatusResponseImpl();
		return setPaymentStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetInvoiceStatus createSetInvoiceStatus() {
		SetInvoiceStatusImpl setInvoiceStatus = new SetInvoiceStatusImpl();
		return setInvoiceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetInvoiceStatusResponse createSetInvoiceStatusResponse() {
		SetInvoiceStatusResponseImpl setInvoiceStatusResponse = new SetInvoiceStatusResponseImpl();
		return setInvoiceStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountingPackage getAccountingPackage() {
		return (AccountingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccountingPackage getPackage() {
		return AccountingPackage.eINSTANCE;
	}

} //AccountingFactoryImpl
