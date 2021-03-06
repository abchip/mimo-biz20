/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.segment;

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
 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentFactory
 * @model kind="package"
 * @generated
 */
public interface SegmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "segment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/marketing/segment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-segment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SegmentPackage eINSTANCE = org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupImpl
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroup()
	 * @generated
	 */
	int SEGMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Segment Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__SEGMENT_GROUP_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__PRODUCT_STORE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Segment Group Classifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Segment Group Geos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__SEGMENT_GROUP_GEOS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Segment Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP__SEGMENT_GROUP_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupClassificationImpl <em>Group Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupClassificationImpl
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupClassification()
	 * @generated
	 */
	int SEGMENT_GROUP_CLASSIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Segment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Classification Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_CLASSIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupGeoImpl <em>Group Geo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupGeoImpl
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupGeo()
	 * @generated
	 */
	int SEGMENT_GROUP_GEO = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Segment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO__SEGMENT_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO__GEO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group Geo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_GEO_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupRoleImpl <em>Group Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupRoleImpl
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupRole()
	 * @generated
	 */
	int SEGMENT_GROUP_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Segment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__SEGMENT_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Group Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupTypeImpl
	 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupType()
	 * @generated
	 */
	int SEGMENT_GROUP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Segment Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__SEGMENT_GROUP_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_GROUP_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup
	 * @generated
	 */
	EClass getSegmentGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupId <em>Segment Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupId()
	 * @see #getSegmentGroup()
	 * @generated
	 */
	EAttribute getSegmentGroup_SegmentGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getDescription()
	 * @see #getSegmentGroup()
	 * @generated
	 */
	EAttribute getSegmentGroup_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getProductStore()
	 * @see #getSegmentGroup()
	 * @generated
	 */
	EReference getSegmentGroup_ProductStore();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupClassifications <em>Segment Group Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segment Group Classifications</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupClassifications()
	 * @see #getSegmentGroup()
	 * @generated
	 */
	EReference getSegmentGroup_SegmentGroupClassifications();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupGeos <em>Segment Group Geos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segment Group Geos</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupGeos()
	 * @see #getSegmentGroup()
	 * @generated
	 */
	EReference getSegmentGroup_SegmentGroupGeos();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupType <em>Segment Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segment Group Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroup#getSegmentGroupType()
	 * @see #getSegmentGroup()
	 * @generated
	 */
	EReference getSegmentGroup_SegmentGroupType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification <em>Group Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Classification</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification
	 * @generated
	 */
	EClass getSegmentGroupClassification();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getSegmentGroup <em>Segment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segment Group</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getSegmentGroup()
	 * @see #getSegmentGroupClassification()
	 * @generated
	 */
	EReference getSegmentGroupClassification_SegmentGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getPartyClassificationGroup <em>Party Classification Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Group</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupClassification#getPartyClassificationGroup()
	 * @see #getSegmentGroupClassification()
	 * @generated
	 */
	EReference getSegmentGroupClassification_PartyClassificationGroup();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo <em>Group Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Geo</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo
	 * @generated
	 */
	EClass getSegmentGroupGeo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getSegmentGroup <em>Segment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segment Group</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getSegmentGroup()
	 * @see #getSegmentGroupGeo()
	 * @generated
	 */
	EReference getSegmentGroupGeo_SegmentGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupGeo#getGeo()
	 * @see #getSegmentGroupGeo()
	 * @generated
	 */
	EReference getSegmentGroupGeo_Geo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole <em>Group Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Role</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole
	 * @generated
	 */
	EClass getSegmentGroupRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getSegmentGroup <em>Segment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segment Group</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getSegmentGroup()
	 * @see #getSegmentGroupRole()
	 * @generated
	 */
	EReference getSegmentGroupRole_SegmentGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getParty()
	 * @see #getSegmentGroupRole()
	 * @generated
	 */
	EReference getSegmentGroupRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupRole#getRoleType()
	 * @see #getSegmentGroupRole()
	 * @generated
	 */
	EReference getSegmentGroupRole_RoleType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupType
	 * @generated
	 */
	EClass getSegmentGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupType#getSegmentGroupTypeId <em>Segment Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupType#getSegmentGroupTypeId()
	 * @see #getSegmentGroupType()
	 * @generated
	 */
	EAttribute getSegmentGroupType_SegmentGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.segment.SegmentGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.segment.SegmentGroupType#getDescription()
	 * @see #getSegmentGroupType()
	 * @generated
	 */
	EAttribute getSegmentGroupType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SegmentFactory getSegmentFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupImpl
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroup()
		 * @generated
		 */
		EClass SEGMENT_GROUP = eINSTANCE.getSegmentGroup();

		/**
		 * The meta object literal for the '<em><b>Segment Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_GROUP__SEGMENT_GROUP_ID = eINSTANCE.getSegmentGroup_SegmentGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_GROUP__DESCRIPTION = eINSTANCE.getSegmentGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP__PRODUCT_STORE = eINSTANCE.getSegmentGroup_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Segment Group Classifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS = eINSTANCE.getSegmentGroup_SegmentGroupClassifications();

		/**
		 * The meta object literal for the '<em><b>Segment Group Geos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP__SEGMENT_GROUP_GEOS = eINSTANCE.getSegmentGroup_SegmentGroupGeos();

		/**
		 * The meta object literal for the '<em><b>Segment Group Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP__SEGMENT_GROUP_TYPE = eINSTANCE.getSegmentGroup_SegmentGroupType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupClassificationImpl <em>Group Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupClassificationImpl
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupClassification()
		 * @generated
		 */
		EClass SEGMENT_GROUP_CLASSIFICATION = eINSTANCE.getSegmentGroupClassification();

		/**
		 * The meta object literal for the '<em><b>Segment Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP = eINSTANCE.getSegmentGroupClassification_SegmentGroup();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP = eINSTANCE.getSegmentGroupClassification_PartyClassificationGroup();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupGeoImpl <em>Group Geo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupGeoImpl
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupGeo()
		 * @generated
		 */
		EClass SEGMENT_GROUP_GEO = eINSTANCE.getSegmentGroupGeo();

		/**
		 * The meta object literal for the '<em><b>Segment Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_GEO__SEGMENT_GROUP = eINSTANCE.getSegmentGroupGeo_SegmentGroup();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_GEO__GEO = eINSTANCE.getSegmentGroupGeo_Geo();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupRoleImpl <em>Group Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupRoleImpl
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupRole()
		 * @generated
		 */
		EClass SEGMENT_GROUP_ROLE = eINSTANCE.getSegmentGroupRole();

		/**
		 * The meta object literal for the '<em><b>Segment Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_ROLE__SEGMENT_GROUP = eINSTANCE.getSegmentGroupRole_SegmentGroup();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_ROLE__PARTY = eINSTANCE.getSegmentGroupRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_GROUP_ROLE__ROLE_TYPE = eINSTANCE.getSegmentGroupRole_RoleType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentGroupTypeImpl
		 * @see org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl#getSegmentGroupType()
		 * @generated
		 */
		EClass SEGMENT_GROUP_TYPE = eINSTANCE.getSegmentGroupType();

		/**
		 * The meta object literal for the '<em><b>Segment Group Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_GROUP_TYPE__SEGMENT_GROUP_TYPE_ID = eINSTANCE.getSegmentGroupType_SegmentGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_GROUP_TYPE__DESCRIPTION = eINSTANCE.getSegmentGroupType_Description();

	}

} //SegmentPackage
