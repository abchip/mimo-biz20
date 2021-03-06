/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.tracking;

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
 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingFactory
 * @model kind="package"
 * @generated
 */
public interface TrackingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/marketing/tracking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-tracking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrackingPackage eINSTANCE = org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeImpl
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCode()
	 * @generated
	 */
	int TRACKING_CODE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tracking Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__TRACKING_CODE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Billable Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__BILLABLE_LIFETIME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__GROUP_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__MARKETING_CAMPAIGN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Override Css</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__OVERRIDE_CSS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Override Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__OVERRIDE_LOGO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Prod Catalog Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__PROD_CATALOG_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__REDIRECT_URL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Subgroup Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__SUBGROUP_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Trackable Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__TRACKABLE_LIFETIME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Tracking Code Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__TRACKING_CODE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Tracking Code Visits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE__TRACKING_CODE_VISITS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl <em>Code Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeOrder()
	 * @generated
	 */
	int TRACKING_CODE_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tracking Code Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__TRACKING_CODE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Affiliate Referred Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__HAS_EXPORTED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Billable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__IS_BILLABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__SITE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tracking Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER__TRACKING_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Code Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl <em>Code Order Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeOrderReturn()
	 * @generated
	 */
	int TRACKING_CODE_ORDER_RETURN = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__RETURN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tracking Code Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Affiliate Referred Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__AFFILIATE_REFERRED_TIME_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__HAS_EXPORTED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Billable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__IS_BILLABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__SITE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tracking Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN__TRACKING_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Code Order Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_ORDER_RETURN_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeTypeImpl <em>Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeTypeImpl
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeType()
	 * @generated
	 */
	int TRACKING_CODE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tracking Code Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__TRACKING_CODE_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeVisitImpl <em>Code Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeVisitImpl
	 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeVisit()
	 * @generated
	 */
	int TRACKING_CODE_VISIT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tracking Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__TRACKING_CODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__VISIT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT__SOURCE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Code Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_CODE_VISIT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode
	 * @generated
	 */
	EClass getTrackingCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackingCodeId <em>Tracking Code Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Code Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackingCodeId()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_TrackingCodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getBillableLifetime <em>Billable Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billable Lifetime</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getBillableLifetime()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_BillableLifetime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getComments()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getCreatedByUserLogin()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getCreatedDate()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getDescription()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getFromDate()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getGroupId()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getLastModifiedByUserLogin()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getLastModifiedDate()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getMarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getMarketingCampaign()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EReference getTrackingCode_MarketingCampaign();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getOverrideCss <em>Override Css</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Css</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getOverrideCss()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_OverrideCss();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getOverrideLogo <em>Override Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Logo</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getOverrideLogo()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_OverrideLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getProdCatalogId <em>Prod Catalog Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Catalog Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getProdCatalogId()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_ProdCatalogId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getRedirectUrl <em>Redirect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirect Url</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getRedirectUrl()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_RedirectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getSubgroupId <em>Subgroup Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subgroup Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getSubgroupId()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_SubgroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getThruDate()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackableLifetime <em>Trackable Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trackable Lifetime</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackableLifetime()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EAttribute getTrackingCode_TrackableLifetime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackingCodeType <em>Tracking Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking Code Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackingCodeType()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EReference getTrackingCode_TrackingCodeType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackingCodeVisits <em>Tracking Code Visits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracking Code Visits</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCode#getTrackingCodeVisits()
	 * @see #getTrackingCode()
	 * @generated
	 */
	EReference getTrackingCode_TrackingCodeVisits();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder <em>Code Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Order</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder
	 * @generated
	 */
	EClass getTrackingCodeOrder();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getOrder()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EReference getTrackingCodeOrder_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getTrackingCodeType <em>Tracking Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking Code Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getTrackingCodeType()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EReference getTrackingCodeOrder_TrackingCodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliate Referred Time Stamp</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getAffiliateReferredTimeStamp()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EAttribute getTrackingCodeOrder_AffiliateReferredTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getHasExported <em>Has Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Exported</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getHasExported()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EAttribute getTrackingCodeOrder_HasExported();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getIsBillable <em>Is Billable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Billable</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getIsBillable()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EAttribute getTrackingCodeOrder_IsBillable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getSiteId <em>Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getSiteId()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EAttribute getTrackingCodeOrder_SiteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getTrackingCode <em>Tracking Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking Code</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder#getTrackingCode()
	 * @see #getTrackingCodeOrder()
	 * @generated
	 */
	EReference getTrackingCodeOrder_TrackingCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn <em>Code Order Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Order Return</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn
	 * @generated
	 */
	EClass getTrackingCodeOrderReturn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getReturn()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EReference getTrackingCodeOrderReturn_Return();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrder()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EReference getTrackingCodeOrderReturn_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCodeType <em>Tracking Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking Code Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCodeType()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EReference getTrackingCodeOrderReturn_TrackingCodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliate Referred Time Stamp</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getAffiliateReferredTimeStamp()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EAttribute getTrackingCodeOrderReturn_AffiliateReferredTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getHasExported <em>Has Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Exported</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getHasExported()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EAttribute getTrackingCodeOrderReturn_HasExported();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getIsBillable <em>Is Billable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Billable</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getIsBillable()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EAttribute getTrackingCodeOrderReturn_IsBillable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrderItemSeqId()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EAttribute getTrackingCodeOrderReturn_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getSiteId <em>Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getSiteId()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EAttribute getTrackingCodeOrderReturn_SiteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCode <em>Tracking Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking Code</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCode()
	 * @see #getTrackingCodeOrderReturn()
	 * @generated
	 */
	EReference getTrackingCodeOrderReturn_TrackingCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType
	 * @generated
	 */
	EClass getTrackingCodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Code Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getTrackingCodeTypeId()
	 * @see #getTrackingCodeType()
	 * @generated
	 */
	EAttribute getTrackingCodeType_TrackingCodeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getDescription()
	 * @see #getTrackingCodeType()
	 * @generated
	 */
	EAttribute getTrackingCodeType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit <em>Code Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Visit</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit
	 * @generated
	 */
	EClass getTrackingCodeVisit();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getTrackingCode <em>Tracking Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracking Code</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getTrackingCode()
	 * @see #getTrackingCodeVisit()
	 * @generated
	 */
	EReference getTrackingCodeVisit_TrackingCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getVisitId()
	 * @see #getTrackingCodeVisit()
	 * @generated
	 */
	EAttribute getTrackingCodeVisit_VisitId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getSourceEnum <em>Source Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Enum</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getSourceEnum()
	 * @see #getTrackingCodeVisit()
	 * @generated
	 */
	EReference getTrackingCodeVisit_SourceEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getFromDate()
	 * @see #getTrackingCodeVisit()
	 * @generated
	 */
	EAttribute getTrackingCodeVisit_FromDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrackingFactory getTrackingFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeImpl
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCode()
		 * @generated
		 */
		EClass TRACKING_CODE = eINSTANCE.getTrackingCode();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__TRACKING_CODE_ID = eINSTANCE.getTrackingCode_TrackingCodeId();

		/**
		 * The meta object literal for the '<em><b>Billable Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__BILLABLE_LIFETIME = eINSTANCE.getTrackingCode_BillableLifetime();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__COMMENTS = eINSTANCE.getTrackingCode_Comments();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__CREATED_BY_USER_LOGIN = eINSTANCE.getTrackingCode_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__CREATED_DATE = eINSTANCE.getTrackingCode_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__DESCRIPTION = eINSTANCE.getTrackingCode_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__FROM_DATE = eINSTANCE.getTrackingCode_FromDate();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__GROUP_ID = eINSTANCE.getTrackingCode_GroupId();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getTrackingCode_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__LAST_MODIFIED_DATE = eINSTANCE.getTrackingCode_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE__MARKETING_CAMPAIGN = eINSTANCE.getTrackingCode_MarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Override Css</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__OVERRIDE_CSS = eINSTANCE.getTrackingCode_OverrideCss();

		/**
		 * The meta object literal for the '<em><b>Override Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__OVERRIDE_LOGO = eINSTANCE.getTrackingCode_OverrideLogo();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__PROD_CATALOG_ID = eINSTANCE.getTrackingCode_ProdCatalogId();

		/**
		 * The meta object literal for the '<em><b>Redirect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__REDIRECT_URL = eINSTANCE.getTrackingCode_RedirectUrl();

		/**
		 * The meta object literal for the '<em><b>Subgroup Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__SUBGROUP_ID = eINSTANCE.getTrackingCode_SubgroupId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__THRU_DATE = eINSTANCE.getTrackingCode_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Trackable Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE__TRACKABLE_LIFETIME = eINSTANCE.getTrackingCode_TrackableLifetime();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE__TRACKING_CODE_TYPE = eINSTANCE.getTrackingCode_TrackingCodeType();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Visits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE__TRACKING_CODE_VISITS = eINSTANCE.getTrackingCode_TrackingCodeVisits();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl <em>Code Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeOrder()
		 * @generated
		 */
		EClass TRACKING_CODE_ORDER = eINSTANCE.getTrackingCodeOrder();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER__ORDER = eINSTANCE.getTrackingCodeOrder_Order();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER__TRACKING_CODE_TYPE = eINSTANCE.getTrackingCodeOrder_TrackingCodeType();

		/**
		 * The meta object literal for the '<em><b>Affiliate Referred Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP = eINSTANCE.getTrackingCodeOrder_AffiliateReferredTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Has Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER__HAS_EXPORTED = eINSTANCE.getTrackingCodeOrder_HasExported();

		/**
		 * The meta object literal for the '<em><b>Is Billable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER__IS_BILLABLE = eINSTANCE.getTrackingCodeOrder_IsBillable();

		/**
		 * The meta object literal for the '<em><b>Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER__SITE_ID = eINSTANCE.getTrackingCodeOrder_SiteId();

		/**
		 * The meta object literal for the '<em><b>Tracking Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER__TRACKING_CODE = eINSTANCE.getTrackingCodeOrder_TrackingCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl <em>Code Order Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeOrderReturn()
		 * @generated
		 */
		EClass TRACKING_CODE_ORDER_RETURN = eINSTANCE.getTrackingCodeOrderReturn();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER_RETURN__RETURN = eINSTANCE.getTrackingCodeOrderReturn_Return();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER_RETURN__ORDER = eINSTANCE.getTrackingCodeOrderReturn_Order();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_TYPE = eINSTANCE.getTrackingCodeOrderReturn_TrackingCodeType();

		/**
		 * The meta object literal for the '<em><b>Affiliate Referred Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER_RETURN__AFFILIATE_REFERRED_TIME_STAMP = eINSTANCE.getTrackingCodeOrderReturn_AffiliateReferredTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Has Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER_RETURN__HAS_EXPORTED = eINSTANCE.getTrackingCodeOrderReturn_HasExported();

		/**
		 * The meta object literal for the '<em><b>Is Billable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER_RETURN__IS_BILLABLE = eINSTANCE.getTrackingCodeOrderReturn_IsBillable();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER_RETURN__ORDER_ITEM_SEQ_ID = eINSTANCE.getTrackingCodeOrderReturn_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_ORDER_RETURN__SITE_ID = eINSTANCE.getTrackingCodeOrderReturn_SiteId();

		/**
		 * The meta object literal for the '<em><b>Tracking Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_ORDER_RETURN__TRACKING_CODE = eINSTANCE.getTrackingCodeOrderReturn_TrackingCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeTypeImpl <em>Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeTypeImpl
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeType()
		 * @generated
		 */
		EClass TRACKING_CODE_TYPE = eINSTANCE.getTrackingCodeType();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_TYPE__TRACKING_CODE_TYPE_ID = eINSTANCE.getTrackingCodeType_TrackingCodeTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_TYPE__DESCRIPTION = eINSTANCE.getTrackingCodeType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeVisitImpl <em>Code Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeVisitImpl
		 * @see org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl#getTrackingCodeVisit()
		 * @generated
		 */
		EClass TRACKING_CODE_VISIT = eINSTANCE.getTrackingCodeVisit();

		/**
		 * The meta object literal for the '<em><b>Tracking Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_VISIT__TRACKING_CODE = eINSTANCE.getTrackingCodeVisit_TrackingCode();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_VISIT__VISIT_ID = eINSTANCE.getTrackingCodeVisit_VisitId();

		/**
		 * The meta object literal for the '<em><b>Source Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKING_CODE_VISIT__SOURCE_ENUM = eINSTANCE.getTrackingCodeVisit_SourceEnum();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKING_CODE_VISIT__FROM_DATE = eINSTANCE.getTrackingCodeVisit_FromDate();

	}

} //TrackingPackage
