/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.entity.EntityPackage
 * @generated
 */
public interface EntityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityFactory eINSTANCE = org.abchip.mimo.biz.service.entity.impl.EntityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Export Entities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Entities</em>'.
	 * @generated
	 */
	ExportEntities createExportEntities();

	/**
	 * Returns a new object of class '<em>Convert Seeds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert Seeds</em>'.
	 * @generated
	 */
	ConvertSeeds createConvertSeeds();

	/**
	 * Returns a new object of class '<em>Create Tenant Demo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Tenant Demo</em>'.
	 * @generated
	 */
	CreateTenantDemo createCreateTenantDemo();

	/**
	 * Returns a new object of class '<em>Create Tenant Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Tenant Master</em>'.
	 * @generated
	 */
	CreateTenantMaster createCreateTenantMaster();

	/**
	 * Returns a new object of class '<em>Create Tenant Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Tenant Party</em>'.
	 * @generated
	 */
	CreateTenantParty createCreateTenantParty();

	/**
	 * Returns a new object of class '<em>Create Tenant Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Tenant Test</em>'.
	 * @generated
	 */
	CreateTenantTest createCreateTenantTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EntityPackage getEntityPackage();

} //EntityFactory
