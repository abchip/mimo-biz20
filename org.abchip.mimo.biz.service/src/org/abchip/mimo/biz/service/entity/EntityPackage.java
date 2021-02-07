/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import org.abchip.mimo.service.ServicePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	int EXPORT_ENTITIES = 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.ConvertSeedsImpl <em>Convert Seeds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.ConvertSeedsImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getConvertSeeds()
	 * @generated
	 */
	int CONVERT_SEEDS = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_SEEDS__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_SEEDS__READERS = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Convert Seeds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_SEEDS_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl <em>Create Tenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenant()
	 * @generated
	 */
	int CREATE_TENANT = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Db Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT__DB_HOST = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT__DB_TYPE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT__PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT__UPDATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Tenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantDemoImpl <em>Create Tenant Demo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantDemoImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantDemo()
	 * @generated
	 */
	int CREATE_TENANT_DEMO = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_DEMO__CONTEXT = CREATE_TENANT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Db Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_DEMO__DB_HOST = CREATE_TENANT__DB_HOST;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_DEMO__DB_TYPE = CREATE_TENANT__DB_TYPE;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_DEMO__PARTY_ID = CREATE_TENANT__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_DEMO__UPDATE = CREATE_TENANT__UPDATE;

	/**
	 * The number of structural features of the '<em>Create Tenant Demo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_DEMO_FEATURE_COUNT = CREATE_TENANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl <em>Create Tenant Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantMaster()
	 * @generated
	 */
	int CREATE_TENANT_MASTER = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The number of structural features of the '<em>Create Tenant Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl <em>Create Tenant Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantParty()
	 * @generated
	 */
	int CREATE_TENANT_PARTY = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__CONTEXT = CREATE_TENANT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Db Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__DB_HOST = CREATE_TENANT__DB_HOST;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__DB_TYPE = CREATE_TENANT__DB_TYPE;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__PARTY_ID = CREATE_TENANT__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__UPDATE = CREATE_TENANT__UPDATE;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__TENANT_ID = CREATE_TENANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY__TENANT_NAME = CREATE_TENANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Tenant Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_PARTY_FEATURE_COUNT = CREATE_TENANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantTestImpl <em>Create Tenant Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantTestImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantTest()
	 * @generated
	 */
	int CREATE_TENANT_TEST = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_TEST__CONTEXT = CREATE_TENANT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Db Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_TEST__DB_HOST = CREATE_TENANT__DB_HOST;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_TEST__DB_TYPE = CREATE_TENANT__DB_TYPE;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_TEST__PARTY_ID = CREATE_TENANT__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_TEST__UPDATE = CREATE_TENANT__UPDATE;

	/**
	 * The number of structural features of the '<em>Create Tenant Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_TEST_FEATURE_COUNT = CREATE_TENANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Path To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES__PATH_TO = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_ENTITIES_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.DatabaseType
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 7;


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
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.ConvertSeeds <em>Convert Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert Seeds</em>'.
	 * @see org.abchip.mimo.biz.service.entity.ConvertSeeds
	 * @generated
	 */
	EClass getConvertSeeds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.ConvertSeeds#getReaders <em>Readers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readers</em>'.
	 * @see org.abchip.mimo.biz.service.entity.ConvertSeeds#getReaders()
	 * @see #getConvertSeeds()
	 * @generated
	 */
	EAttribute getConvertSeeds_Readers();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.CreateTenant <em>Create Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Tenant</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenant
	 * @generated
	 */
	EClass getCreateTenant();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenant#getDbHost <em>Db Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Host</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenant#getDbHost()
	 * @see #getCreateTenant()
	 * @generated
	 */
	EAttribute getCreateTenant_DbHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenant#getDbType <em>Db Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Type</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenant#getDbType()
	 * @see #getCreateTenant()
	 * @generated
	 */
	EAttribute getCreateTenant_DbType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenant#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenant#getPartyId()
	 * @see #getCreateTenant()
	 * @generated
	 */
	EAttribute getCreateTenant_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenant#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenant#isUpdate()
	 * @see #getCreateTenant()
	 * @generated
	 */
	EAttribute getCreateTenant_Update();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.CreateTenantDemo <em>Create Tenant Demo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Tenant Demo</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantDemo
	 * @generated
	 */
	EClass getCreateTenantDemo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.CreateTenantMaster <em>Create Tenant Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Tenant Master</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantMaster
	 * @generated
	 */
	EClass getCreateTenantMaster();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.CreateTenantParty <em>Create Tenant Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Tenant Party</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantParty
	 * @generated
	 */
	EClass getCreateTenantParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenantParty#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantParty#getTenantId()
	 * @see #getCreateTenantParty()
	 * @generated
	 */
	EAttribute getCreateTenantParty_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenantParty#getTenantName <em>Tenant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Name</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantParty#getTenantName()
	 * @see #getCreateTenantParty()
	 * @generated
	 */
	EAttribute getCreateTenantParty_TenantName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.CreateTenantTest <em>Create Tenant Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Tenant Test</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantTest
	 * @generated
	 */
	EClass getCreateTenantTest();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.biz.service.entity.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see org.abchip.mimo.biz.service.entity.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

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
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.ConvertSeedsImpl <em>Convert Seeds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.ConvertSeedsImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getConvertSeeds()
		 * @generated
		 */
		EClass CONVERT_SEEDS = eINSTANCE.getConvertSeeds();
		/**
		 * The meta object literal for the '<em><b>Readers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERT_SEEDS__READERS = eINSTANCE.getConvertSeeds_Readers();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl <em>Create Tenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenant()
		 * @generated
		 */
		EClass CREATE_TENANT = eINSTANCE.getCreateTenant();
		/**
		 * The meta object literal for the '<em><b>Db Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT__DB_HOST = eINSTANCE.getCreateTenant_DbHost();
		/**
		 * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT__DB_TYPE = eINSTANCE.getCreateTenant_DbType();
		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT__PARTY_ID = eINSTANCE.getCreateTenant_PartyId();
		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT__UPDATE = eINSTANCE.getCreateTenant_Update();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantDemoImpl <em>Create Tenant Demo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantDemoImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantDemo()
		 * @generated
		 */
		EClass CREATE_TENANT_DEMO = eINSTANCE.getCreateTenantDemo();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl <em>Create Tenant Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantMaster()
		 * @generated
		 */
		EClass CREATE_TENANT_MASTER = eINSTANCE.getCreateTenantMaster();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl <em>Create Tenant Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantPartyImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantParty()
		 * @generated
		 */
		EClass CREATE_TENANT_PARTY = eINSTANCE.getCreateTenantParty();
		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT_PARTY__TENANT_ID = eINSTANCE.getCreateTenantParty_TenantId();
		/**
		 * The meta object literal for the '<em><b>Tenant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT_PARTY__TENANT_NAME = eINSTANCE.getCreateTenantParty_TenantName();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantTestImpl <em>Create Tenant Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantTestImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantTest()
		 * @generated
		 */
		EClass CREATE_TENANT_TEST = eINSTANCE.getCreateTenantTest();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.DatabaseType
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

	}

} //EntityPackage
