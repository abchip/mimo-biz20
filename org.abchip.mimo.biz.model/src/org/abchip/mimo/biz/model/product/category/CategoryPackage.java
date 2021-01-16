/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.category;

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
 * @see org.abchip.mimo.biz.model.product.category.CategoryFactory
 * @model kind="package"
 * @generated
 */
public interface CategoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "category";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/product/category";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-category";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CategoryPackage eINSTANCE = org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl <em>Product Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategory()
	 * @generated
	 */
	int PRODUCT_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__CATEGORY_IMAGE_URL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__CATEGORY_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Current Product Category Rollups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__CURRENT_PRODUCT_CATEGORY_ROLLUPS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Detail Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__DETAIL_SCREEN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Link One Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Link Two Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__LONG_DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Market Interests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__MARKET_INTERESTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Primary Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Category Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Product Category Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_CATEGORY_LINKS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Product Category Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_CATEGORY_MEMBERS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Product Category Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Product Feature Cat Grp Appls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_FEATURE_CAT_GRP_APPLS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Product Feature Category Appls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCT_FEATURE_CATEGORY_APPLS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Show In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__SHOW_IN_SELECT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Product Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryAttributeImpl <em>Product Category Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryAttributeImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryAttribute()
	 * @generated
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Category Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentImpl <em>Product Category Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryContent()
	 * @generated
	 */
	int PRODUCT_CATEGORY_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Prod Cat Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Use Days Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Product Category Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentTypeImpl <em>Product Category Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentTypeImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryContentType()
	 * @generated
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prod Cat Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__PROD_CAT_CONTENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Category Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_CONTENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryGlAccountImpl <em>Product Category Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryGlAccountImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryGlAccount()
	 * @generated
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Category Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_GL_ACCOUNT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryLinkImpl <em>Product Category Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryLinkImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryLink()
	 * @generated
	 */
	int PRODUCT_CATEGORY_LINK = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Link Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__LINK_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Detail Sub Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Detail Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__DETAIL_TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Image Two Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__IMAGE_URL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Link Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__LINK_INFO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Link Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Title Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK__TITLE_TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Product Category Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_LINK_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryMemberImpl <em>Product Category Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryMemberImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryMember()
	 * @generated
	 */
	int PRODUCT_CATEGORY_MEMBER = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Product Category Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_MEMBER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRoleImpl <em>Product Category Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRoleImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryRole()
	 * @generated
	 */
	int PRODUCT_CATEGORY_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Product Category Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRollupImpl <em>Product Category Rollup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRollupImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryRollup()
	 * @generated
	 */
	int PRODUCT_CATEGORY_ROLLUP = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product Category Rollup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_ROLLUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeImpl <em>Product Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryType()
	 * @generated
	 */
	int PRODUCT_CATEGORY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Category Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeAttrImpl <em>Product Category Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryTypeAttr()
	 * @generated
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Category Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__PRODUCT_CATEGORY_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Category Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory
	 * @generated
	 */
	EClass getProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryId()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_ProductCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryImageUrl <em>Category Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Image Url</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryImageUrl()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_CategoryImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryName()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_CategoryName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCurrentProductCategoryRollups <em>Current Product Category Rollups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Product Category Rollups</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getCurrentProductCategoryRollups()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_CurrentProductCategoryRollups();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getDescription()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getDetailScreen <em>Detail Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Screen</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getDetailScreen()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_DetailScreen();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkOneImageUrl <em>Link One Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link One Image Url</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkOneImageUrl()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_LinkOneImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkTwoImageUrl <em>Link Two Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Two Image Url</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkTwoImageUrl()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_LinkTwoImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getLongDescription()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_LongDescription();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getMarketInterests <em>Market Interests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Interests</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getMarketInterests()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_MarketInterests();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getPrimaryParentCategory <em>Primary Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Parent Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getPrimaryParentCategory()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_PrimaryParentCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryAttributes <em>Product Category Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Category Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryAttributes()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_ProductCategoryAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryLinks <em>Product Category Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Category Links</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryLinks()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_ProductCategoryLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryMembers <em>Product Category Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Category Members</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryMembers()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_ProductCategoryMembers();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryType <em>Product Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryType()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_ProductCategoryType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductFeatureCatGrpAppls <em>Product Feature Cat Grp Appls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Feature Cat Grp Appls</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductFeatureCatGrpAppls()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_ProductFeatureCatGrpAppls();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductFeatureCategoryAppls <em>Product Feature Category Appls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Feature Category Appls</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getProductFeatureCategoryAppls()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_ProductFeatureCategoryAppls();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getShowInSelect <em>Show In Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show In Select</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategory#getShowInSelect()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_ShowInSelect();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute <em>Product Category Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute
	 * @generated
	 */
	EClass getProductCategoryAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getProductCategory()
	 * @see #getProductCategoryAttribute()
	 * @generated
	 */
	EReference getProductCategoryAttribute_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getAttrName()
	 * @see #getProductCategoryAttribute()
	 * @generated
	 */
	EAttribute getProductCategoryAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getAttrDescription()
	 * @see #getProductCategoryAttribute()
	 * @generated
	 */
	EAttribute getProductCategoryAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute#getAttrValue()
	 * @see #getProductCategoryAttribute()
	 * @generated
	 */
	EAttribute getProductCategoryAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent <em>Product Category Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Content</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent
	 * @generated
	 */
	EClass getProductCategoryContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProductCategory()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EReference getProductCategoryContent_ProductCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getContent()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EReference getProductCategoryContent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProdCatContentType <em>Prod Cat Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Cat Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProdCatContentType()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EReference getProductCategoryContent_ProdCatContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getFromDate()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EAttribute getProductCategoryContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseFromDate <em>Purchase From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseFromDate()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EAttribute getProductCategoryContent_PurchaseFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseThruDate <em>Purchase Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseThruDate()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EAttribute getProductCategoryContent_PurchaseThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getThruDate()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EAttribute getProductCategoryContent_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseCountLimit <em>Use Count Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Count Limit</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseCountLimit()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EAttribute getProductCategoryContent_UseCountLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseDaysLimit <em>Use Days Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Days Limit</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseDaysLimit()
	 * @see #getProductCategoryContent()
	 * @generated
	 */
	EAttribute getProductCategoryContent_UseDaysLimit();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContentType <em>Product Category Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContentType
	 * @generated
	 */
	EClass getProductCategoryContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getProdCatContentTypeId <em>Prod Cat Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Cat Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getProdCatContentTypeId()
	 * @see #getProductCategoryContentType()
	 * @generated
	 */
	EAttribute getProductCategoryContentType_ProdCatContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getDescription()
	 * @see #getProductCategoryContentType()
	 * @generated
	 */
	EAttribute getProductCategoryContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getHasTable()
	 * @see #getProductCategoryContentType()
	 * @generated
	 */
	EAttribute getProductCategoryContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryContentType#getParentType()
	 * @see #getProductCategoryContentType()
	 * @generated
	 */
	EReference getProductCategoryContentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount <em>Product Category Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount
	 * @generated
	 */
	EClass getProductCategoryGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getProductCategory()
	 * @see #getProductCategoryGlAccount()
	 * @generated
	 */
	EReference getProductCategoryGlAccount_ProductCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getOrganizationParty <em>Organization Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getOrganizationParty()
	 * @see #getProductCategoryGlAccount()
	 * @generated
	 */
	EReference getProductCategoryGlAccount_OrganizationParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getGlAccountType <em>Gl Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getGlAccountType()
	 * @see #getProductCategoryGlAccount()
	 * @generated
	 */
	EReference getProductCategoryGlAccount_GlAccountType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getGlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryGlAccount#getGlAccount()
	 * @see #getProductCategoryGlAccount()
	 * @generated
	 */
	EReference getProductCategoryGlAccount_GlAccount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink <em>Product Category Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Link</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink
	 * @generated
	 */
	EClass getProductCategoryLink();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getProductCategory()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EReference getProductCategoryLink_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getLinkSeqId <em>Link Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getLinkSeqId()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_LinkSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getFromDate()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getComments()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getDetailSubScreen <em>Detail Sub Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Sub Screen</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getDetailSubScreen()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_DetailSubScreen();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getDetailText <em>Detail Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Text</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getDetailText()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_DetailText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getImageTwoUrl <em>Image Two Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Two Url</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getImageTwoUrl()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_ImageTwoUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getImageUrl()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_ImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getLinkInfo <em>Link Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Info</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getLinkInfo()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_LinkInfo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getLinkTypeEnum <em>Link Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Type Enum</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getLinkTypeEnum()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EReference getProductCategoryLink_LinkTypeEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getSequenceNum()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getThruDate()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getTitleText <em>Title Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Text</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryLink#getTitleText()
	 * @see #getProductCategoryLink()
	 * @generated
	 */
	EAttribute getProductCategoryLink_TitleText();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember <em>Product Category Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Member</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember
	 * @generated
	 */
	EClass getProductCategoryMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getProduct()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EReference getProductCategoryMember_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getProductCategory()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EReference getProductCategoryMember_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getFromDate()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EAttribute getProductCategoryMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getComments()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EAttribute getProductCategoryMember_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getQuantity()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EAttribute getProductCategoryMember_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getSequenceNum()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EAttribute getProductCategoryMember_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryMember#getThruDate()
	 * @see #getProductCategoryMember()
	 * @generated
	 */
	EAttribute getProductCategoryMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole <em>Product Category Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Role</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole
	 * @generated
	 */
	EClass getProductCategoryRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getParty()
	 * @see #getProductCategoryRole()
	 * @generated
	 */
	EReference getProductCategoryRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getRoleType()
	 * @see #getProductCategoryRole()
	 * @generated
	 */
	EReference getProductCategoryRole_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getProductCategory()
	 * @see #getProductCategoryRole()
	 * @generated
	 */
	EReference getProductCategoryRole_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getFromDate()
	 * @see #getProductCategoryRole()
	 * @generated
	 */
	EAttribute getProductCategoryRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getComments()
	 * @see #getProductCategoryRole()
	 * @generated
	 */
	EAttribute getProductCategoryRole_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRole#getThruDate()
	 * @see #getProductCategoryRole()
	 * @generated
	 */
	EAttribute getProductCategoryRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup <em>Product Category Rollup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Rollup</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRollup
	 * @generated
	 */
	EClass getProductCategoryRollup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getProductCategory()
	 * @see #getProductCategoryRollup()
	 * @generated
	 */
	EReference getProductCategoryRollup_ProductCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getParentProductCategory <em>Parent Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getParentProductCategory()
	 * @see #getProductCategoryRollup()
	 * @generated
	 */
	EReference getProductCategoryRollup_ParentProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getFromDate()
	 * @see #getProductCategoryRollup()
	 * @generated
	 */
	EAttribute getProductCategoryRollup_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getSequenceNum()
	 * @see #getProductCategoryRollup()
	 * @generated
	 */
	EAttribute getProductCategoryRollup_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryRollup#getThruDate()
	 * @see #getProductCategoryRollup()
	 * @generated
	 */
	EAttribute getProductCategoryRollup_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryType <em>Product Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryType
	 * @generated
	 */
	EClass getProductCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryType#getProductCategoryTypeId <em>Product Category Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Category Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryType#getProductCategoryTypeId()
	 * @see #getProductCategoryType()
	 * @generated
	 */
	EAttribute getProductCategoryType_ProductCategoryTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryType#getDescription()
	 * @see #getProductCategoryType()
	 * @generated
	 */
	EAttribute getProductCategoryType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryType#getHasTable()
	 * @see #getProductCategoryType()
	 * @generated
	 */
	EAttribute getProductCategoryType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryType#getParentType()
	 * @see #getProductCategoryType()
	 * @generated
	 */
	EReference getProductCategoryType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryType#getProductCategoryTypeAttrs <em>Product Category Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Category Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryType#getProductCategoryTypeAttrs()
	 * @see #getProductCategoryType()
	 * @generated
	 */
	EReference getProductCategoryType_ProductCategoryTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr <em>Product Category Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr
	 * @generated
	 */
	EClass getProductCategoryTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getProductCategoryType <em>Product Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getProductCategoryType()
	 * @see #getProductCategoryTypeAttr()
	 * @generated
	 */
	EReference getProductCategoryTypeAttr_ProductCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getAttrName()
	 * @see #getProductCategoryTypeAttr()
	 * @generated
	 */
	EAttribute getProductCategoryTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.category.ProductCategoryTypeAttr#getDescription()
	 * @see #getProductCategoryTypeAttr()
	 * @generated
	 */
	EAttribute getProductCategoryTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CategoryFactory getCategoryFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl <em>Product Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategory()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY = eINSTANCE.getProductCategory();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID = eINSTANCE.getProductCategory_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Category Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__CATEGORY_IMAGE_URL = eINSTANCE.getProductCategory_CategoryImageUrl();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__CATEGORY_NAME = eINSTANCE.getProductCategory_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Current Product Category Rollups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__CURRENT_PRODUCT_CATEGORY_ROLLUPS = eINSTANCE.getProductCategory_CurrentProductCategoryRollups();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__DESCRIPTION = eINSTANCE.getProductCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Detail Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__DETAIL_SCREEN = eINSTANCE.getProductCategory_DetailScreen();

		/**
		 * The meta object literal for the '<em><b>Link One Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL = eINSTANCE.getProductCategory_LinkOneImageUrl();

		/**
		 * The meta object literal for the '<em><b>Link Two Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL = eINSTANCE.getProductCategory_LinkTwoImageUrl();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__LONG_DESCRIPTION = eINSTANCE.getProductCategory_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Market Interests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__MARKET_INTERESTS = eINSTANCE.getProductCategory_MarketInterests();

		/**
		 * The meta object literal for the '<em><b>Primary Parent Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY = eINSTANCE.getProductCategory_PrimaryParentCategory();

		/**
		 * The meta object literal for the '<em><b>Product Category Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES = eINSTANCE.getProductCategory_ProductCategoryAttributes();

		/**
		 * The meta object literal for the '<em><b>Product Category Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCT_CATEGORY_LINKS = eINSTANCE.getProductCategory_ProductCategoryLinks();

		/**
		 * The meta object literal for the '<em><b>Product Category Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCT_CATEGORY_MEMBERS = eINSTANCE.getProductCategory_ProductCategoryMembers();

		/**
		 * The meta object literal for the '<em><b>Product Category Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE = eINSTANCE.getProductCategory_ProductCategoryType();

		/**
		 * The meta object literal for the '<em><b>Product Feature Cat Grp Appls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCT_FEATURE_CAT_GRP_APPLS = eINSTANCE.getProductCategory_ProductFeatureCatGrpAppls();

		/**
		 * The meta object literal for the '<em><b>Product Feature Category Appls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCT_FEATURE_CATEGORY_APPLS = eINSTANCE.getProductCategory_ProductFeatureCategoryAppls();

		/**
		 * The meta object literal for the '<em><b>Show In Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__SHOW_IN_SELECT = eINSTANCE.getProductCategory_ShowInSelect();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryAttributeImpl <em>Product Category Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryAttributeImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryAttribute()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_ATTRIBUTE = eINSTANCE.getProductCategoryAttribute();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_ATTRIBUTE__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryAttribute_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ATTRIBUTE__ATTR_NAME = eINSTANCE.getProductCategoryAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getProductCategoryAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getProductCategoryAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentImpl <em>Product Category Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryContent()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_CONTENT = eINSTANCE.getProductCategoryContent();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryContent_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_CONTENT__CONTENT = eINSTANCE.getProductCategoryContent_Content();

		/**
		 * The meta object literal for the '<em><b>Prod Cat Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE = eINSTANCE.getProductCategoryContent_ProdCatContentType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT__FROM_DATE = eINSTANCE.getProductCategoryContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Purchase From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE = eINSTANCE.getProductCategoryContent_PurchaseFromDate();

		/**
		 * The meta object literal for the '<em><b>Purchase Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE = eINSTANCE.getProductCategoryContent_PurchaseThruDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT__THRU_DATE = eINSTANCE.getProductCategoryContent_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Use Count Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT = eINSTANCE.getProductCategoryContent_UseCountLimit();

		/**
		 * The meta object literal for the '<em><b>Use Days Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT = eINSTANCE.getProductCategoryContent_UseDaysLimit();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentTypeImpl <em>Product Category Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryContentTypeImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryContentType()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_CONTENT_TYPE = eINSTANCE.getProductCategoryContentType();

		/**
		 * The meta object literal for the '<em><b>Prod Cat Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT_TYPE__PROD_CAT_CONTENT_TYPE_ID = eINSTANCE.getProductCategoryContentType_ProdCatContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getProductCategoryContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getProductCategoryContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_CONTENT_TYPE__PARENT_TYPE = eINSTANCE.getProductCategoryContentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryGlAccountImpl <em>Product Category Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryGlAccountImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryGlAccount()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_GL_ACCOUNT = eINSTANCE.getProductCategoryGlAccount();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryGlAccount_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Organization Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY = eINSTANCE.getProductCategoryGlAccount_OrganizationParty();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE = eINSTANCE.getProductCategoryGlAccount_GlAccountType();

		/**
		 * The meta object literal for the '<em><b>Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT = eINSTANCE.getProductCategoryGlAccount_GlAccount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryLinkImpl <em>Product Category Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryLinkImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryLink()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_LINK = eINSTANCE.getProductCategoryLink();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryLink_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Link Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__LINK_SEQ_ID = eINSTANCE.getProductCategoryLink_LinkSeqId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__FROM_DATE = eINSTANCE.getProductCategoryLink_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__COMMENTS = eINSTANCE.getProductCategoryLink_Comments();

		/**
		 * The meta object literal for the '<em><b>Detail Sub Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN = eINSTANCE.getProductCategoryLink_DetailSubScreen();

		/**
		 * The meta object literal for the '<em><b>Detail Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__DETAIL_TEXT = eINSTANCE.getProductCategoryLink_DetailText();

		/**
		 * The meta object literal for the '<em><b>Image Two Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL = eINSTANCE.getProductCategoryLink_ImageTwoUrl();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__IMAGE_URL = eINSTANCE.getProductCategoryLink_ImageUrl();

		/**
		 * The meta object literal for the '<em><b>Link Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__LINK_INFO = eINSTANCE.getProductCategoryLink_LinkInfo();

		/**
		 * The meta object literal for the '<em><b>Link Type Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM = eINSTANCE.getProductCategoryLink_LinkTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__SEQUENCE_NUM = eINSTANCE.getProductCategoryLink_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__THRU_DATE = eINSTANCE.getProductCategoryLink_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Title Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_LINK__TITLE_TEXT = eINSTANCE.getProductCategoryLink_TitleText();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryMemberImpl <em>Product Category Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryMemberImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryMember()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_MEMBER = eINSTANCE.getProductCategoryMember();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_MEMBER__PRODUCT = eINSTANCE.getProductCategoryMember_Product();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_MEMBER__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryMember_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_MEMBER__FROM_DATE = eINSTANCE.getProductCategoryMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_MEMBER__COMMENTS = eINSTANCE.getProductCategoryMember_Comments();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_MEMBER__QUANTITY = eINSTANCE.getProductCategoryMember_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_MEMBER__SEQUENCE_NUM = eINSTANCE.getProductCategoryMember_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_MEMBER__THRU_DATE = eINSTANCE.getProductCategoryMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRoleImpl <em>Product Category Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRoleImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryRole()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_ROLE = eINSTANCE.getProductCategoryRole();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_ROLE__PARTY = eINSTANCE.getProductCategoryRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_ROLE__ROLE_TYPE = eINSTANCE.getProductCategoryRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_ROLE__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryRole_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ROLE__FROM_DATE = eINSTANCE.getProductCategoryRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ROLE__COMMENTS = eINSTANCE.getProductCategoryRole_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ROLE__THRU_DATE = eINSTANCE.getProductCategoryRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRollupImpl <em>Product Category Rollup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryRollupImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryRollup()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_ROLLUP = eINSTANCE.getProductCategoryRollup();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY = eINSTANCE.getProductCategoryRollup_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Parent Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY = eINSTANCE.getProductCategoryRollup_ParentProductCategory();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ROLLUP__FROM_DATE = eINSTANCE.getProductCategoryRollup_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM = eINSTANCE.getProductCategoryRollup_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_ROLLUP__THRU_DATE = eINSTANCE.getProductCategoryRollup_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeImpl <em>Product Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryType()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_TYPE = eINSTANCE.getProductCategoryType();

		/**
		 * The meta object literal for the '<em><b>Product Category Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ID = eINSTANCE.getProductCategoryType_ProductCategoryTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_TYPE__DESCRIPTION = eINSTANCE.getProductCategoryType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_TYPE__HAS_TABLE = eINSTANCE.getProductCategoryType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_TYPE__PARENT_TYPE = eINSTANCE.getProductCategoryType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Product Category Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ATTRS = eINSTANCE.getProductCategoryType_ProductCategoryTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeAttrImpl <em>Product Category Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.category.impl.ProductCategoryTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl#getProductCategoryTypeAttr()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY_TYPE_ATTR = eINSTANCE.getProductCategoryTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Product Category Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY_TYPE_ATTR__PRODUCT_CATEGORY_TYPE = eINSTANCE.getProductCategoryTypeAttr_ProductCategoryType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_TYPE_ATTR__ATTR_NAME = eINSTANCE.getProductCategoryTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY_TYPE_ATTR__DESCRIPTION = eINSTANCE.getProductCategoryTypeAttr_Description();

	}

} //CategoryPackage
