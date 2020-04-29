/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;

import org.abchip.mimo.biz.model.product.facility.FacilityAssocType;
import org.abchip.mimo.biz.model.product.facility.FacilityPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.impl.FacilityAssocTypeImpl#getFacilityAssocTypeId <em>Facility Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.impl.FacilityAssocTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityAssocTypeImpl extends BizEntityImpl implements FacilityAssocType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityAssocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.FACILITY_ASSOC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityAssocTypeId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_ASSOC_TYPE__FACILITY_ASSOC_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityAssocTypeId(String newFacilityAssocTypeId) {
		eSet(FacilityPackage.Literals.FACILITY_ASSOC_TYPE__FACILITY_ASSOC_TYPE_ID, newFacilityAssocTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_ASSOC_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FacilityPackage.Literals.FACILITY_ASSOC_TYPE__DESCRIPTION, newDescription);
	}

} //FacilityAssocTypeImpl
