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
			case AccountingPackage.INVOICE_GET_TOTAL: return (EObject)createInvoice_GetTotal();
			case AccountingPackage.SET_INVOICE_STATUS: return (EObject)createSetInvoiceStatus();
			case AccountingPackage.SET_INVOICE_STATUS_RESPONSE: return (EObject)createSetInvoiceStatusResponse();
			case AccountingPackage.SET_PAYMENT_STATUS: return (EObject)createSetPaymentStatus();
			case AccountingPackage.SET_PAYMENT_STATUS_RESPONSE: return (EObject)createSetPaymentStatusResponse();
			case AccountingPackage.UPDATE_PAYMENT_APPLICATION_DEF: return (EObject)createUpdatePaymentApplicationDef();
			case AccountingPackage.UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE: return (EObject)createUpdatePaymentApplicationDefResponse();
			case AccountingPackage.ADDTAX: return (EObject)createAddtax();
			case AccountingPackage.ADDTAX_RESPONSE: return (EObject)createAddtaxResponse();
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
	public UpdatePaymentApplicationDef createUpdatePaymentApplicationDef() {
		UpdatePaymentApplicationDefImpl updatePaymentApplicationDef = new UpdatePaymentApplicationDefImpl();
		return updatePaymentApplicationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdatePaymentApplicationDefResponse createUpdatePaymentApplicationDefResponse() {
		UpdatePaymentApplicationDefResponseImpl updatePaymentApplicationDefResponse = new UpdatePaymentApplicationDefResponseImpl();
		return updatePaymentApplicationDefResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Addtax createAddtax() {
		AddtaxImpl addtax = new AddtaxImpl();
		return addtax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddtaxResponse createAddtaxResponse() {
		AddtaxResponseImpl addtaxResponse = new AddtaxResponseImpl();
		return addtaxResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice_GetTotal createInvoice_GetTotal() {
		Invoice_GetTotalImpl invoice_GetTotal = new Invoice_GetTotalImpl();
		return invoice_GetTotal;
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
