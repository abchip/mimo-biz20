/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import org.abchip.mimo.biz.service.BizServicePackage;

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
	int EXPORT_ENTITIES = 2;

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
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_SEEDS__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_SEEDS__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

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
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl <em>Create Tenant Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantMaster()
	 * @generated
	 */
	int CREATE_TENANT_MASTER = 1;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__NAME = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__DB_TYPE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER__PARTY_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create Tenant Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TENANT_MASTER_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedImpl <em>Load Seed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.LoadSeedImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getLoadSeed()
	 * @generated
	 */
	int LOAD_SEED = 3;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Seed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__SEED_ID = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED__UPDATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEED_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedsImpl <em>Load Seeds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.impl.LoadSeedsImpl
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getLoadSeeds()
	 * @generated
	 */
	int LOAD_SEEDS = 4;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__LOCALE = ServicePackage.SERVICE_REQUEST__LOCALE;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__TENANT = ServicePackage.SERVICE_REQUEST__TENANT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__CONTEXT = ServicePackage.SERVICE_REQUEST__CONTEXT;

	/**
	 * The feature id for the '<em><b>Seed Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__SEED_PATTERN = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS__UPDATE = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Seeds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SEEDS_FEATURE_COUNT = ServicePackage.SERVICE_REQUEST_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.entity.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.entity.DatabaseType
	 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 5;


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
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.CreateTenantMaster <em>Create Tenant Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Tenant Master</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantMaster
	 * @generated
	 */
	EClass getCreateTenantMaster();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenantMaster#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantMaster#getName()
	 * @see #getCreateTenantMaster()
	 * @generated
	 */
	EAttribute getCreateTenantMaster_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenantMaster#getDbType <em>Db Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Type</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantMaster#getDbType()
	 * @see #getCreateTenantMaster()
	 * @generated
	 */
	EAttribute getCreateTenantMaster_DbType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.CreateTenantMaster#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.service.entity.CreateTenantMaster#getPartyId()
	 * @see #getCreateTenantMaster()
	 * @generated
	 */
	EAttribute getCreateTenantMaster_PartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.LoadSeed <em>Load Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Seed</em>'.
	 * @see org.abchip.mimo.biz.service.entity.LoadSeed
	 * @generated
	 */
	EClass getLoadSeed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.LoadSeed#getSeedId <em>Seed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Id</em>'.
	 * @see org.abchip.mimo.biz.service.entity.LoadSeed#getSeedId()
	 * @see #getLoadSeed()
	 * @generated
	 */
	EAttribute getLoadSeed_SeedId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.LoadSeed#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.abchip.mimo.biz.service.entity.LoadSeed#isUpdate()
	 * @see #getLoadSeed()
	 * @generated
	 */
	EAttribute getLoadSeed_Update();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.entity.LoadSeeds <em>Load Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Seeds</em>'.
	 * @see org.abchip.mimo.biz.service.entity.LoadSeeds
	 * @generated
	 */
	EClass getLoadSeeds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.LoadSeeds#getSeedPattern <em>Seed Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Pattern</em>'.
	 * @see org.abchip.mimo.biz.service.entity.LoadSeeds#getSeedPattern()
	 * @see #getLoadSeeds()
	 * @generated
	 */
	EAttribute getLoadSeeds_SeedPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.entity.LoadSeeds#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.abchip.mimo.biz.service.entity.LoadSeeds#isUpdate()
	 * @see #getLoadSeeds()
	 * @generated
	 */
	EAttribute getLoadSeeds_Update();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl <em>Create Tenant Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.CreateTenantMasterImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getCreateTenantMaster()
		 * @generated
		 */
		EClass CREATE_TENANT_MASTER = eINSTANCE.getCreateTenantMaster();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT_MASTER__NAME = eINSTANCE.getCreateTenantMaster_Name();
		/**
		 * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT_MASTER__DB_TYPE = eINSTANCE.getCreateTenantMaster_DbType();
		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TENANT_MASTER__PARTY_ID = eINSTANCE.getCreateTenantMaster_PartyId();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedImpl <em>Load Seed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.LoadSeedImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getLoadSeed()
		 * @generated
		 */
		EClass LOAD_SEED = eINSTANCE.getLoadSeed();
		/**
		 * The meta object literal for the '<em><b>Seed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEED__SEED_ID = eINSTANCE.getLoadSeed_SeedId();
		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEED__UPDATE = eINSTANCE.getLoadSeed_Update();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedsImpl <em>Load Seeds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.entity.impl.LoadSeedsImpl
		 * @see org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl#getLoadSeeds()
		 * @generated
		 */
		EClass LOAD_SEEDS = eINSTANCE.getLoadSeeds();
		/**
		 * The meta object literal for the '<em><b>Seed Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEEDS__SEED_PATTERN = eINSTANCE.getLoadSeeds_SeedPattern();
		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SEEDS__UPDATE = eINSTANCE.getLoadSeeds_Update();
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
