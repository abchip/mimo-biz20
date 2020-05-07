/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import org.abchip.mimo.biz.service.product.*;
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
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory(ProductPackage.eNS_URI);
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
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
			case ProductPackage.CALC_TAX_FOR_DISPLAY: return (EObject)createCalcTaxForDisplay();
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE: return (EObject)createCalcTaxForDisplayResponse();
			case ProductPackage.CALCULATE_PRODUCT_PRICE: return (EObject)createCalculateProductPrice();
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE: return (EObject)createCalculateProductPriceResponse();
			case ProductPackage.GET_PRODUCT_DEFAULT: return (EObject)createGetProductDefault();
			case ProductPackage.GET_PRODUCT_DEFAULT_RESPONSE: return (EObject)createGetProductDefaultResponse();
			case ProductPackage.CALC_TAX: return (EObject)createCalcTax();
			case ProductPackage.CALC_TAX_RESPONSE: return (EObject)createCalcTaxResponse();
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
	public CalculateProductPrice createCalculateProductPrice() {
		CalculateProductPriceImpl calculateProductPrice = new CalculateProductPriceImpl();
		return calculateProductPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculateProductPriceResponse createCalculateProductPriceResponse() {
		CalculateProductPriceResponseImpl calculateProductPriceResponse = new CalculateProductPriceResponseImpl();
		return calculateProductPriceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetProductDefault createGetProductDefault() {
		GetProductDefaultImpl getProductDefault = new GetProductDefaultImpl();
		return getProductDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetProductDefaultResponse createGetProductDefaultResponse() {
		GetProductDefaultResponseImpl getProductDefaultResponse = new GetProductDefaultResponseImpl();
		return getProductDefaultResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalcTax createCalcTax() {
		CalcTaxImpl calcTax = new CalcTaxImpl();
		return calcTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalcTaxResponse createCalcTaxResponse() {
		CalcTaxResponseImpl calcTaxResponse = new CalcTaxResponseImpl();
		return calcTaxResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalcTaxForDisplay createCalcTaxForDisplay() {
		CalcTaxForDisplayImpl calcTaxForDisplay = new CalcTaxForDisplayImpl();
		return calcTaxForDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalcTaxForDisplayResponse createCalcTaxForDisplayResponse() {
		CalcTaxForDisplayResponseImpl calcTaxForDisplayResponse = new CalcTaxForDisplayResponseImpl();
		return calcTaxForDisplayResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
