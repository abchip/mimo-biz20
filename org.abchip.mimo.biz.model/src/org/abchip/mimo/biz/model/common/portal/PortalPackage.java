/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.portal;

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
 * @see org.abchip.mimo.biz.model.common.portal.PortalFactory
 * @model kind="package"
 * @generated
 */
public interface PortalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "portal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/common/portal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-portal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortalPackage eINSTANCE = org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPageImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPage()
	 * @generated
	 */
	int PORTAL_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portal Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__PORTAL_PAGE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Help Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__HELP_CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Original Portal Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owner User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__OWNER_USER_LOGIN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Portal Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__PARENT_PORTAL_PAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Portal Page Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__PORTAL_PAGE_COLUMNS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Portal Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__PORTAL_PAGE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__SECURITY_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPageColumnImpl <em>Page Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPageColumnImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPageColumn()
	 * @generated
	 */
	int PORTAL_PAGE_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portal Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__PORTAL_PAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Column Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Column Width Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Column Width Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Page Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_COLUMN_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPagePortletImpl <em>Page Portlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPagePortletImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPagePortlet()
	 * @generated
	 */
	int PORTAL_PAGE_PORTLET = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portal Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__PORTAL_PAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Portal Portlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__PORTAL_PORTLET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Portlet Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Column Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Page Portlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PAGE_PORTLET_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPortletImpl <em>Portlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPortletImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPortlet()
	 * @generated
	 */
	int PORTAL_PORTLET = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portal Portlet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__PORTAL_PORTLET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Edit Form Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__EDIT_FORM_LOCATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Edit Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__EDIT_FORM_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Portlet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__PORTLET_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Portlet Portlet Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__SCREEN_LOCATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__SCREEN_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Screenshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__SCREENSHOT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Security Main Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__SECURITY_MAIN_ACTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Security Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET__SECURITY_SERVICE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Portlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PORTLET_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortletAttributeImpl <em>Portlet Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortletAttributeImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortletAttribute()
	 * @generated
	 */
	int PORTLET_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portal Portlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__PORTAL_PORTLET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Portal Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__PORTAL_PAGE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Portlet Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__PORTLET_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attr Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__ATTR_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Portlet Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortletCategoryImpl <em>Portlet Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortletCategoryImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortletCategory()
	 * @generated
	 */
	int PORTLET_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portlet Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY__PORTLET_CATEGORY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Portlet Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortletPortletCategoryImpl <em>Portlet Portlet Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortletPortletCategoryImpl
	 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortletPortletCategory()
	 * @generated
	 */
	int PORTLET_PORTLET_CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portal Portlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Portlet Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Portlet Portlet Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTLET_PORTLET_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortalPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage
	 * @generated
	 */
	EClass getPortalPage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getPortalPageId <em>Portal Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portal Page Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getPortalPageId()
	 * @see #getPortalPage()
	 * @generated
	 */
	EAttribute getPortalPage_PortalPageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getDescription()
	 * @see #getPortalPage()
	 * @generated
	 */
	EAttribute getPortalPage_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getHelpContent <em>Help Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Help Content</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getHelpContent()
	 * @see #getPortalPage()
	 * @generated
	 */
	EReference getPortalPage_HelpContent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getOriginalPortalPageId <em>Original Portal Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Portal Page Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getOriginalPortalPageId()
	 * @see #getPortalPage()
	 * @generated
	 */
	EAttribute getPortalPage_OriginalPortalPageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getOwnerUserLoginId <em>Owner User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner User Login Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getOwnerUserLoginId()
	 * @see #getPortalPage()
	 * @generated
	 */
	EAttribute getPortalPage_OwnerUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getParentPortalPage <em>Parent Portal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Portal Page</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getParentPortalPage()
	 * @see #getPortalPage()
	 * @generated
	 */
	EReference getPortalPage_ParentPortalPage();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getPortalPageColumns <em>Portal Page Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Portal Page Columns</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getPortalPageColumns()
	 * @see #getPortalPage()
	 * @generated
	 */
	EReference getPortalPage_PortalPageColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getPortalPageName <em>Portal Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portal Page Name</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getPortalPageName()
	 * @see #getPortalPage()
	 * @generated
	 */
	EAttribute getPortalPage_PortalPageName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Group</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getSecurityGroup()
	 * @see #getPortalPage()
	 * @generated
	 */
	EReference getPortalPage_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPage#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPage#getSequenceNum()
	 * @see #getPortalPage()
	 * @generated
	 */
	EAttribute getPortalPage_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortalPageColumn <em>Page Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Column</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPageColumn
	 * @generated
	 */
	EClass getPortalPageColumn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getPortalPage <em>Portal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portal Page</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getPortalPage()
	 * @see #getPortalPageColumn()
	 * @generated
	 */
	EReference getPortalPageColumn_PortalPage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getColumnSeqId <em>Column Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getColumnSeqId()
	 * @see #getPortalPageColumn()
	 * @generated
	 */
	EAttribute getPortalPageColumn_ColumnSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getColumnWidthPercentage <em>Column Width Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Width Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getColumnWidthPercentage()
	 * @see #getPortalPageColumn()
	 * @generated
	 */
	EAttribute getPortalPageColumn_ColumnWidthPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getColumnWidthPixels <em>Column Width Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Width Pixels</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPageColumn#getColumnWidthPixels()
	 * @see #getPortalPageColumn()
	 * @generated
	 */
	EAttribute getPortalPageColumn_ColumnWidthPixels();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortalPagePortlet <em>Page Portlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Portlet</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPagePortlet
	 * @generated
	 */
	EClass getPortalPagePortlet();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getPortalPage <em>Portal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portal Page</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getPortalPage()
	 * @see #getPortalPagePortlet()
	 * @generated
	 */
	EReference getPortalPagePortlet_PortalPage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getPortalPortlet <em>Portal Portlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portal Portlet</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getPortalPortlet()
	 * @see #getPortalPagePortlet()
	 * @generated
	 */
	EReference getPortalPagePortlet_PortalPortlet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getPortletSeqId <em>Portlet Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portlet Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getPortletSeqId()
	 * @see #getPortalPagePortlet()
	 * @generated
	 */
	EAttribute getPortalPagePortlet_PortletSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getColumnSeqId <em>Column Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getColumnSeqId()
	 * @see #getPortalPagePortlet()
	 * @generated
	 */
	EAttribute getPortalPagePortlet_ColumnSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPagePortlet#getSequenceNum()
	 * @see #getPortalPagePortlet()
	 * @generated
	 */
	EAttribute getPortalPagePortlet_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet <em>Portlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portlet</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet
	 * @generated
	 */
	EClass getPortalPortlet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getPortalPortletId <em>Portal Portlet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portal Portlet Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getPortalPortletId()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_PortalPortletId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getDescription()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getEditFormLocation <em>Edit Form Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Form Location</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getEditFormLocation()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_EditFormLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getEditFormName <em>Edit Form Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Form Name</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getEditFormName()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_EditFormName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getPortletName <em>Portlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portlet Name</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getPortletName()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_PortletName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getPortletPortletCategories <em>Portlet Portlet Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Portlet Portlet Categories</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getPortletPortletCategories()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EReference getPortalPortlet_PortletPortletCategories();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getScreenLocation <em>Screen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Location</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getScreenLocation()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_ScreenLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getScreenName <em>Screen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Name</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getScreenName()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_ScreenName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getScreenshot <em>Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screenshot</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getScreenshot()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_Screenshot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getSecurityMainAction <em>Security Main Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Main Action</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getSecurityMainAction()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_SecurityMainAction();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortalPortlet#getSecurityServiceName <em>Security Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Service Name</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPortlet#getSecurityServiceName()
	 * @see #getPortalPortlet()
	 * @generated
	 */
	EAttribute getPortalPortlet_SecurityServiceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute <em>Portlet Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portlet Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute
	 * @generated
	 */
	EClass getPortletAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getPortalPortlet <em>Portal Portlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portal Portlet</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getPortalPortlet()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EReference getPortletAttribute_PortalPortlet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getPortalPageId <em>Portal Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portal Page Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getPortalPageId()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EAttribute getPortletAttribute_PortalPageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getPortletSeqId <em>Portlet Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portlet Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getPortletSeqId()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EAttribute getPortletAttribute_PortletSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrName()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EAttribute getPortletAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrDescription()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EAttribute getPortletAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrType <em>Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Type</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrType()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EAttribute getPortletAttribute_AttrType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletAttribute#getAttrValue()
	 * @see #getPortletAttribute()
	 * @generated
	 */
	EAttribute getPortletAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortletCategory <em>Portlet Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portlet Category</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletCategory
	 * @generated
	 */
	EClass getPortletCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletCategory#getPortletCategoryId <em>Portlet Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portlet Category Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletCategory#getPortletCategoryId()
	 * @see #getPortletCategory()
	 * @generated
	 */
	EAttribute getPortletCategory_PortletCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.portal.PortletCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletCategory#getDescription()
	 * @see #getPortletCategory()
	 * @generated
	 */
	EAttribute getPortletCategory_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory <em>Portlet Portlet Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portlet Portlet Category</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletPortletCategory
	 * @generated
	 */
	EClass getPortletPortletCategory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortalPortlet <em>Portal Portlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portal Portlet</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortalPortlet()
	 * @see #getPortletPortletCategory()
	 * @generated
	 */
	EReference getPortletPortletCategory_PortalPortlet();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortletCategory <em>Portlet Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portlet Category</em>'.
	 * @see org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortletCategory()
	 * @see #getPortletPortletCategory()
	 * @generated
	 */
	EReference getPortletPortletCategory_PortletCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PortalFactory getPortalFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPageImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPage()
		 * @generated
		 */
		EClass PORTAL_PAGE = eINSTANCE.getPortalPage();

		/**
		 * The meta object literal for the '<em><b>Portal Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE__PORTAL_PAGE_ID = eINSTANCE.getPortalPage_PortalPageId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE__DESCRIPTION = eINSTANCE.getPortalPage_Description();

		/**
		 * The meta object literal for the '<em><b>Help Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE__HELP_CONTENT = eINSTANCE.getPortalPage_HelpContent();

		/**
		 * The meta object literal for the '<em><b>Original Portal Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID = eINSTANCE.getPortalPage_OriginalPortalPageId();

		/**
		 * The meta object literal for the '<em><b>Owner User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE__OWNER_USER_LOGIN_ID = eINSTANCE.getPortalPage_OwnerUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Parent Portal Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE__PARENT_PORTAL_PAGE = eINSTANCE.getPortalPage_ParentPortalPage();

		/**
		 * The meta object literal for the '<em><b>Portal Page Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE__PORTAL_PAGE_COLUMNS = eINSTANCE.getPortalPage_PortalPageColumns();

		/**
		 * The meta object literal for the '<em><b>Portal Page Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE__PORTAL_PAGE_NAME = eINSTANCE.getPortalPage_PortalPageName();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE__SECURITY_GROUP = eINSTANCE.getPortalPage_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE__SEQUENCE_NUM = eINSTANCE.getPortalPage_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPageColumnImpl <em>Page Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPageColumnImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPageColumn()
		 * @generated
		 */
		EClass PORTAL_PAGE_COLUMN = eINSTANCE.getPortalPageColumn();

		/**
		 * The meta object literal for the '<em><b>Portal Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE_COLUMN__PORTAL_PAGE = eINSTANCE.getPortalPageColumn_PortalPage();

		/**
		 * The meta object literal for the '<em><b>Column Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID = eINSTANCE.getPortalPageColumn_ColumnSeqId();

		/**
		 * The meta object literal for the '<em><b>Column Width Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE = eINSTANCE.getPortalPageColumn_ColumnWidthPercentage();

		/**
		 * The meta object literal for the '<em><b>Column Width Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS = eINSTANCE.getPortalPageColumn_ColumnWidthPixels();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPagePortletImpl <em>Page Portlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPagePortletImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPagePortlet()
		 * @generated
		 */
		EClass PORTAL_PAGE_PORTLET = eINSTANCE.getPortalPagePortlet();

		/**
		 * The meta object literal for the '<em><b>Portal Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE_PORTLET__PORTAL_PAGE = eINSTANCE.getPortalPagePortlet_PortalPage();

		/**
		 * The meta object literal for the '<em><b>Portal Portlet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PAGE_PORTLET__PORTAL_PORTLET = eINSTANCE.getPortalPagePortlet_PortalPortlet();

		/**
		 * The meta object literal for the '<em><b>Portlet Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID = eINSTANCE.getPortalPagePortlet_PortletSeqId();

		/**
		 * The meta object literal for the '<em><b>Column Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID = eINSTANCE.getPortalPagePortlet_ColumnSeqId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PAGE_PORTLET__SEQUENCE_NUM = eINSTANCE.getPortalPagePortlet_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortalPortletImpl <em>Portlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPortletImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortalPortlet()
		 * @generated
		 */
		EClass PORTAL_PORTLET = eINSTANCE.getPortalPortlet();

		/**
		 * The meta object literal for the '<em><b>Portal Portlet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__PORTAL_PORTLET_ID = eINSTANCE.getPortalPortlet_PortalPortletId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__DESCRIPTION = eINSTANCE.getPortalPortlet_Description();

		/**
		 * The meta object literal for the '<em><b>Edit Form Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__EDIT_FORM_LOCATION = eINSTANCE.getPortalPortlet_EditFormLocation();

		/**
		 * The meta object literal for the '<em><b>Edit Form Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__EDIT_FORM_NAME = eINSTANCE.getPortalPortlet_EditFormName();

		/**
		 * The meta object literal for the '<em><b>Portlet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__PORTLET_NAME = eINSTANCE.getPortalPortlet_PortletName();

		/**
		 * The meta object literal for the '<em><b>Portlet Portlet Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES = eINSTANCE.getPortalPortlet_PortletPortletCategories();

		/**
		 * The meta object literal for the '<em><b>Screen Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__SCREEN_LOCATION = eINSTANCE.getPortalPortlet_ScreenLocation();

		/**
		 * The meta object literal for the '<em><b>Screen Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__SCREEN_NAME = eINSTANCE.getPortalPortlet_ScreenName();

		/**
		 * The meta object literal for the '<em><b>Screenshot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__SCREENSHOT = eINSTANCE.getPortalPortlet_Screenshot();

		/**
		 * The meta object literal for the '<em><b>Security Main Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__SECURITY_MAIN_ACTION = eINSTANCE.getPortalPortlet_SecurityMainAction();

		/**
		 * The meta object literal for the '<em><b>Security Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PORTLET__SECURITY_SERVICE_NAME = eINSTANCE.getPortalPortlet_SecurityServiceName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortletAttributeImpl <em>Portlet Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortletAttributeImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortletAttribute()
		 * @generated
		 */
		EClass PORTLET_ATTRIBUTE = eINSTANCE.getPortletAttribute();

		/**
		 * The meta object literal for the '<em><b>Portal Portlet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTLET_ATTRIBUTE__PORTAL_PORTLET = eINSTANCE.getPortletAttribute_PortalPortlet();

		/**
		 * The meta object literal for the '<em><b>Portal Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_ATTRIBUTE__PORTAL_PAGE_ID = eINSTANCE.getPortletAttribute_PortalPageId();

		/**
		 * The meta object literal for the '<em><b>Portlet Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_ATTRIBUTE__PORTLET_SEQ_ID = eINSTANCE.getPortletAttribute_PortletSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_ATTRIBUTE__ATTR_NAME = eINSTANCE.getPortletAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getPortletAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_ATTRIBUTE__ATTR_TYPE = eINSTANCE.getPortletAttribute_AttrType();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getPortletAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortletCategoryImpl <em>Portlet Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortletCategoryImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortletCategory()
		 * @generated
		 */
		EClass PORTLET_CATEGORY = eINSTANCE.getPortletCategory();

		/**
		 * The meta object literal for the '<em><b>Portlet Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_CATEGORY__PORTLET_CATEGORY_ID = eINSTANCE.getPortletCategory_PortletCategoryId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTLET_CATEGORY__DESCRIPTION = eINSTANCE.getPortletCategory_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.portal.impl.PortletPortletCategoryImpl <em>Portlet Portlet Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortletPortletCategoryImpl
		 * @see org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl#getPortletPortletCategory()
		 * @generated
		 */
		EClass PORTLET_PORTLET_CATEGORY = eINSTANCE.getPortletPortletCategory();

		/**
		 * The meta object literal for the '<em><b>Portal Portlet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET = eINSTANCE.getPortletPortletCategory_PortalPortlet();

		/**
		 * The meta object literal for the '<em><b>Portlet Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY = eINSTANCE.getPortletPortletCategory_PortletCategory();

	}

} //PortalPackage
