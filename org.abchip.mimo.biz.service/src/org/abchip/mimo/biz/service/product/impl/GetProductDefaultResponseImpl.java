/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.service.product.GetProductDefaultResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Party Default Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.GetProductDefaultResponseImpl#getFacilityPostalAddress <em>Facility Postal Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetProductDefaultResponseImpl extends ServiceResponseImpl implements GetProductDefaultResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetProductDefaultResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.GET_PRODUCT_DEFAULT_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress getFacilityPostalAddress() {
		return (PostalAddress)eGet(ProductPackage.Literals.GET_PRODUCT_DEFAULT_RESPONSE__FACILITY_POSTAL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityPostalAddress(PostalAddress newFacilityPostalAddress) {
		eSet(ProductPackage.Literals.GET_PRODUCT_DEFAULT_RESPONSE__FACILITY_POSTAL_ADDRESS, newFacilityPostalAddress);
	}

} //GetProductDefaultResponseImpl
