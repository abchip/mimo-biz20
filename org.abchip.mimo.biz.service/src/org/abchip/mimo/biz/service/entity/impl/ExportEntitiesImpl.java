/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.biz.service.entity.ExportEntities;

import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;
import org.abchip.mimo.service.ServiceResponse;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Entities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.ExportEntitiesImpl#getPathTo <em>Path To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportEntitiesImpl extends BizServiceRequestImpl<ServiceResponse> implements ExportEntities {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportEntitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.EXPORT_ENTITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathTo() {
		return (String)eGet(EntityPackage.Literals.EXPORT_ENTITIES__PATH_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathTo(String newPathTo) {
		eSet(EntityPackage.Literals.EXPORT_ENTITIES__PATH_TO, newPathTo);
	}

} //ExportEntitiesImpl
