/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import org.abchip.mimo.biz.service.BizServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public interface EntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/entity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-entity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityPackage eINSTANCE = org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.ExportEntitiesImpl <em>Export Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.ExportEntitiesImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getExportEntities()
	 * @generated
	 */
	int EXPORT_ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__LOCALE = BizServicePackage.BIZ_SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__TENANT = BizServicePackage.BIZ_SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__CONTEXT = BizServicePackage.BIZ_SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__USER_LOGIN = BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Path To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__PATH_TO = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES_FEATURE_COUNT = BizServicePackage.BIZ_SERVICE_REQUEST_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.ExportEntities <em>Export Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Entities</em>'.
	 * @see org.abchip.mimo.biz.service.entity.ExportEntities
	 * @generated
	 */
	EClass getExportEntities();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.ExportEntities#getPathTo <em>Path To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To</em>'.
	 * @see org.abchip.mimo.biz.service.entity.ExportEntities#getPathTo()
	 * @see #getExportEntities()
	 * @generated
	 */
	EAttribute getExportEntities_PathTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityFactory getEntityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.ExportEntitiesImpl <em>Export Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.ExportEntitiesImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getExportEntities()
		 * @generated
		 */
		EClass EXPORT_ENTITIES = eINSTANCE.getExportEntities();
		/**
		 * The meta object literal for the '<em><b>Path To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_ENTITIES__PATH_TO = eINSTANCE.getExportEntities_PathTo();

	}

} //EntityPackage
