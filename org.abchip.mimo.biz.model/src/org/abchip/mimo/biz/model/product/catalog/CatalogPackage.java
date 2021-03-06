/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.catalog;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.biz.model.product.catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/product/catalog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl <em>Prod Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalog()
	 * @generated
	 */
	int PROD_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prod Catalog Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__PROD_CATALOG_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__CATALOG_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__CONTENT_PATH_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Header Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__HEADER_LOGO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prod Catalog Inv Facilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__PROD_CATALOG_INV_FACILITIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Purchase Allow Perm Reqd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__STYLE_SHEET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Template Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__TEMPLATE_PATH_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Use Quick Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__USE_QUICK_ADD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>View Allow Perm Reqd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG__VIEW_ALLOW_PERM_REQD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Prod Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryImpl <em>Prod Catalog Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryImpl
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogCategory()
	 * @generated
	 */
	int PROD_CATALOG_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prod Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__PROD_CATALOG = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__PRODUCT_CATEGORY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Prod Catalog Category Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__PROD_CATALOG_CATEGORY_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__SEQUENCE_NUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Prod Catalog Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryTypeImpl <em>Prod Catalog Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryTypeImpl
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogCategoryType()
	 * @generated
	 */
	int PROD_CATALOG_CATEGORY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prod Catalog Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Prod Catalog Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_CATEGORY_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogInvFacilityImpl <em>Prod Catalog Inv Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogInvFacilityImpl
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogInvFacility()
	 * @generated
	 */
	int PROD_CATALOG_INV_FACILITY = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prod Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__PROD_CATALOG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__FACILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Prod Catalog Inv Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_INV_FACILITY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogRoleImpl <em>Prod Catalog Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogRoleImpl
	 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogRole()
	 * @generated
	 */
	int PROD_CATALOG_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Prod Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__PROD_CATALOG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Prod Catalog Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CATALOG_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog <em>Prod Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Catalog</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog
	 * @generated
	 */
	EClass getProdCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogId <em>Prod Catalog Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Catalog Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogId()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_ProdCatalogId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getCatalogName()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getContentPathPrefix <em>Content Path Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Path Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getContentPathPrefix()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_ContentPathPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getHeaderLogo <em>Header Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Logo</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getHeaderLogo()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_HeaderLogo();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogInvFacilities <em>Prod Catalog Inv Facilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prod Catalog Inv Facilities</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogInvFacilities()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EReference getProdCatalog_ProdCatalogInvFacilities();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isPurchaseAllowPermReqd <em>Purchase Allow Perm Reqd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Allow Perm Reqd</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isPurchaseAllowPermReqd()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_PurchaseAllowPermReqd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getStyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Sheet</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getStyleSheet()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_StyleSheet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getTemplatePathPrefix <em>Template Path Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Path Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getTemplatePathPrefix()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_TemplatePathPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isUseQuickAdd <em>Use Quick Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Quick Add</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isUseQuickAdd()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_UseQuickAdd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isViewAllowPermReqd <em>View Allow Perm Reqd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Allow Perm Reqd</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isViewAllowPermReqd()
	 * @see #getProdCatalog()
	 * @generated
	 */
	EAttribute getProdCatalog_ViewAllowPermReqd();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory <em>Prod Catalog Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Catalog Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory
	 * @generated
	 */
	EClass getProdCatalogCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getProdCatalog <em>Prod Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Catalog</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getProdCatalog()
	 * @see #getProdCatalogCategory()
	 * @generated
	 */
	EReference getProdCatalogCategory_ProdCatalog();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getProductCategory()
	 * @see #getProdCatalogCategory()
	 * @generated
	 */
	EReference getProdCatalogCategory_ProductCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getProdCatalogCategoryType <em>Prod Catalog Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Catalog Category Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getProdCatalogCategoryType()
	 * @see #getProdCatalogCategory()
	 * @generated
	 */
	EReference getProdCatalogCategory_ProdCatalogCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getFromDate()
	 * @see #getProdCatalogCategory()
	 * @generated
	 */
	EAttribute getProdCatalogCategory_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getSequenceNum()
	 * @see #getProdCatalogCategory()
	 * @generated
	 */
	EAttribute getProdCatalogCategory_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategory#getThruDate()
	 * @see #getProdCatalogCategory()
	 * @generated
	 */
	EAttribute getProdCatalogCategory_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType <em>Prod Catalog Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Catalog Category Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType
	 * @generated
	 */
	EClass getProdCatalogCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Catalog Category Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getProdCatalogCategoryTypeId()
	 * @see #getProdCatalogCategoryType()
	 * @generated
	 */
	EAttribute getProdCatalogCategoryType_ProdCatalogCategoryTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getDescription()
	 * @see #getProdCatalogCategoryType()
	 * @generated
	 */
	EAttribute getProdCatalogCategoryType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogCategoryType#getParentType()
	 * @see #getProdCatalogCategoryType()
	 * @generated
	 */
	EReference getProdCatalogCategoryType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility <em>Prod Catalog Inv Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Catalog Inv Facility</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility
	 * @generated
	 */
	EClass getProdCatalogInvFacility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getProdCatalog <em>Prod Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Catalog</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getProdCatalog()
	 * @see #getProdCatalogInvFacility()
	 * @generated
	 */
	EReference getProdCatalogInvFacility_ProdCatalog();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFacility()
	 * @see #getProdCatalogInvFacility()
	 * @generated
	 */
	EReference getProdCatalogInvFacility_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFromDate()
	 * @see #getProdCatalogInvFacility()
	 * @generated
	 */
	EAttribute getProdCatalogInvFacility_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getSequenceNum()
	 * @see #getProdCatalogInvFacility()
	 * @generated
	 */
	EAttribute getProdCatalogInvFacility_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getThruDate()
	 * @see #getProdCatalogInvFacility()
	 * @generated
	 */
	EAttribute getProdCatalogInvFacility_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole <em>Prod Catalog Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Catalog Role</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole
	 * @generated
	 */
	EClass getProdCatalogRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getParty()
	 * @see #getProdCatalogRole()
	 * @generated
	 */
	EReference getProdCatalogRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getRoleType()
	 * @see #getProdCatalogRole()
	 * @generated
	 */
	EReference getProdCatalogRole_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getProdCatalog <em>Prod Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Catalog</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getProdCatalog()
	 * @see #getProdCatalogRole()
	 * @generated
	 */
	EReference getProdCatalogRole_ProdCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getFromDate()
	 * @see #getProdCatalogRole()
	 * @generated
	 */
	EAttribute getProdCatalogRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getSequenceNum()
	 * @see #getProdCatalogRole()
	 * @generated
	 */
	EAttribute getProdCatalogRole_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.catalog.ProdCatalogRole#getThruDate()
	 * @see #getProdCatalogRole()
	 * @generated
	 */
	EAttribute getProdCatalogRole_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl <em>Prod Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalog()
		 * @generated
		 */
		EClass PROD_CATALOG = eINSTANCE.getProdCatalog();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__PROD_CATALOG_ID = eINSTANCE.getProdCatalog_ProdCatalogId();

		/**
		 * The meta object literal for the '<em><b>Catalog Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__CATALOG_NAME = eINSTANCE.getProdCatalog_CatalogName();

		/**
		 * The meta object literal for the '<em><b>Content Path Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__CONTENT_PATH_PREFIX = eINSTANCE.getProdCatalog_ContentPathPrefix();

		/**
		 * The meta object literal for the '<em><b>Header Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__HEADER_LOGO = eINSTANCE.getProdCatalog_HeaderLogo();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Inv Facilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG__PROD_CATALOG_INV_FACILITIES = eINSTANCE.getProdCatalog_ProdCatalogInvFacilities();

		/**
		 * The meta object literal for the '<em><b>Purchase Allow Perm Reqd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD = eINSTANCE.getProdCatalog_PurchaseAllowPermReqd();

		/**
		 * The meta object literal for the '<em><b>Style Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__STYLE_SHEET = eINSTANCE.getProdCatalog_StyleSheet();

		/**
		 * The meta object literal for the '<em><b>Template Path Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__TEMPLATE_PATH_PREFIX = eINSTANCE.getProdCatalog_TemplatePathPrefix();

		/**
		 * The meta object literal for the '<em><b>Use Quick Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__USE_QUICK_ADD = eINSTANCE.getProdCatalog_UseQuickAdd();

		/**
		 * The meta object literal for the '<em><b>View Allow Perm Reqd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG__VIEW_ALLOW_PERM_REQD = eINSTANCE.getProdCatalog_ViewAllowPermReqd();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryImpl <em>Prod Catalog Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryImpl
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogCategory()
		 * @generated
		 */
		EClass PROD_CATALOG_CATEGORY = eINSTANCE.getProdCatalogCategory();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_CATEGORY__PROD_CATALOG = eINSTANCE.getProdCatalogCategory_ProdCatalog();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_CATEGORY__PRODUCT_CATEGORY = eINSTANCE.getProdCatalogCategory_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Category Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_CATEGORY__PROD_CATALOG_CATEGORY_TYPE = eINSTANCE.getProdCatalogCategory_ProdCatalogCategoryType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_CATEGORY__FROM_DATE = eINSTANCE.getProdCatalogCategory_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_CATEGORY__SEQUENCE_NUM = eINSTANCE.getProdCatalogCategory_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_CATEGORY__THRU_DATE = eINSTANCE.getProdCatalogCategory_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryTypeImpl <em>Prod Catalog Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogCategoryTypeImpl
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogCategoryType()
		 * @generated
		 */
		EClass PROD_CATALOG_CATEGORY_TYPE = eINSTANCE.getProdCatalogCategoryType();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Category Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID = eINSTANCE.getProdCatalogCategoryType_ProdCatalogCategoryTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION = eINSTANCE.getProdCatalogCategoryType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE = eINSTANCE.getProdCatalogCategoryType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogInvFacilityImpl <em>Prod Catalog Inv Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogInvFacilityImpl
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogInvFacility()
		 * @generated
		 */
		EClass PROD_CATALOG_INV_FACILITY = eINSTANCE.getProdCatalogInvFacility();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_INV_FACILITY__PROD_CATALOG = eINSTANCE.getProdCatalogInvFacility_ProdCatalog();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_INV_FACILITY__FACILITY = eINSTANCE.getProdCatalogInvFacility_Facility();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_INV_FACILITY__FROM_DATE = eINSTANCE.getProdCatalogInvFacility_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_INV_FACILITY__SEQUENCE_NUM = eINSTANCE.getProdCatalogInvFacility_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_INV_FACILITY__THRU_DATE = eINSTANCE.getProdCatalogInvFacility_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogRoleImpl <em>Prod Catalog Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogRoleImpl
		 * @see org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl#getProdCatalogRole()
		 * @generated
		 */
		EClass PROD_CATALOG_ROLE = eINSTANCE.getProdCatalogRole();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_ROLE__PARTY = eINSTANCE.getProdCatalogRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_ROLE__ROLE_TYPE = eINSTANCE.getProdCatalogRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CATALOG_ROLE__PROD_CATALOG = eINSTANCE.getProdCatalogRole_ProdCatalog();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_ROLE__FROM_DATE = eINSTANCE.getProdCatalogRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_ROLE__SEQUENCE_NUM = eINSTANCE.getProdCatalogRole_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CATALOG_ROLE__THRU_DATE = eINSTANCE.getProdCatalogRole_ThruDate();

	}

} //CatalogPackage
