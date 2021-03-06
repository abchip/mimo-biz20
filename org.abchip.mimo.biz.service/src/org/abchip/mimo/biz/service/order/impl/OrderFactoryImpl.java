/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import org.abchip.mimo.biz.service.order.*;

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
public class OrderFactoryImpl extends EFactoryImpl implements OrderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderFactory init() {
		try {
			OrderFactory theOrderFactory = (OrderFactory)EPackage.Registry.INSTANCE.getEFactory(OrderPackage.eNS_URI);
			if (theOrderFactory != null) {
				return theOrderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderFactoryImpl() {
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
			case OrderPackage.CHANGE_ORDER_STATUS: return (EObject)createChangeOrderStatus();
			case OrderPackage.CHANGE_ORDER_STATUS_RESPONSE: return (EObject)createChangeOrderStatusResponse();
			case OrderPackage.RESERVE_STORE_INVENTORY: return (EObject)createReserveStoreInventory();
			case OrderPackage.RESERVE_STORE_INVENTORY_RESPONSE: return (EObject)createReserveStoreInventoryResponse();
			case OrderPackage.RESET_GRAND_TOTAL: return (EObject)createResetGrandTotal();
			case OrderPackage.RESET_GRAND_TOTAL_RESPONSE: return (EObject)createResetGrandTotalResponse();
			case OrderPackage.RECALC_TAX_TOTAL: return (EObject)createRecalcTaxTotal();
			case OrderPackage.RECALC_TAX_TOTAL_RESPONSE: return (EObject)createRecalcTaxTotalResponse();
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
	public ChangeOrderStatus createChangeOrderStatus() {
		ChangeOrderStatusImpl changeOrderStatus = new ChangeOrderStatusImpl();
		return changeOrderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeOrderStatusResponse createChangeOrderStatusResponse() {
		ChangeOrderStatusResponseImpl changeOrderStatusResponse = new ChangeOrderStatusResponseImpl();
		return changeOrderStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReserveStoreInventory createReserveStoreInventory() {
		ReserveStoreInventoryImpl reserveStoreInventory = new ReserveStoreInventoryImpl();
		return reserveStoreInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReserveStoreInventoryResponse createReserveStoreInventoryResponse() {
		ReserveStoreInventoryResponseImpl reserveStoreInventoryResponse = new ReserveStoreInventoryResponseImpl();
		return reserveStoreInventoryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetGrandTotal createResetGrandTotal() {
		ResetGrandTotalImpl resetGrandTotal = new ResetGrandTotalImpl();
		return resetGrandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetGrandTotalResponse createResetGrandTotalResponse() {
		ResetGrandTotalResponseImpl resetGrandTotalResponse = new ResetGrandTotalResponseImpl();
		return resetGrandTotalResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecalcTaxTotal createRecalcTaxTotal() {
		RecalcTaxTotalImpl recalcTaxTotal = new RecalcTaxTotalImpl();
		return recalcTaxTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecalcTaxTotalResponse createRecalcTaxTotalResponse() {
		RecalcTaxTotalResponseImpl recalcTaxTotalResponse = new RecalcTaxTotalResponseImpl();
		return recalcTaxTotalResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPackage getOrderPackage() {
		return (OrderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrderPackage getPackage() {
		return OrderPackage.eINSTANCE;
	}

} //OrderFactoryImpl
