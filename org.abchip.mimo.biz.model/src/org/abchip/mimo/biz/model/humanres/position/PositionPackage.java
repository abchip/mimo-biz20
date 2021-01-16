/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.position;

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
 * @see org.abchip.mimo.biz.model.humanres.position.PositionFactory
 * @model kind="package"
 * @generated
 */
public interface PositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "position";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/humanres/position";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-position";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PositionPackage eINSTANCE = org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl <em>Empl Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPosition()
	 * @generated
	 */
	int EMPL_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EMPL_POSITION_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ACTUAL_FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actual Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ACTUAL_THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__BUDGET_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__BUDGET_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Empl Position Fulfillments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EMPL_POSITION_FULFILLMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Empl Position Responsibilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EMPL_POSITION_RESPONSIBILITIES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Empl Position Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EMPL_POSITION_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Estimated From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ESTIMATED_FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Estimated Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__ESTIMATED_THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Exempt Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__EXEMPT_FLAG = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fulltime Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__FULLTIME_FLAG = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reporting To Empl Position Reporting Structs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__REPORTING_TO_EMPL_POSITION_REPORTING_STRUCTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Salary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__SALARY_FLAG = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Temporary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION__TEMPORARY_FLAG = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Empl Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionClassTypeImpl <em>Empl Position Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionClassTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionClassType()
	 * @generated
	 */
	int EMPL_POSITION_CLASS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Class Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__EMPL_POSITION_CLASS_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Empl Position Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_CLASS_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionFulfillmentImpl <em>Empl Position Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionFulfillmentImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionFulfillment()
	 * @generated
	 */
	int EMPL_POSITION_FULFILLMENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__EMPL_POSITION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Empl Position Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_FULFILLMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionReportingStructImpl <em>Empl Position Reporting Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionReportingStructImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionReportingStruct()
	 * @generated
	 */
	int EMPL_POSITION_REPORTING_STRUCT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Id Reporting To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empl Position Id Managed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Primary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Empl Position Reporting Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_REPORTING_STRUCT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionResponsibilityImpl <em>Empl Position Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionResponsibilityImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionResponsibility()
	 * @generated
	 */
	int EMPL_POSITION_RESPONSIBILITY = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Responsibility Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Empl Position Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_RESPONSIBILITY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl <em>Empl Position Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionType()
	 * @generated
	 */
	int EMPL_POSITION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Empl Position Type Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_CLASSES = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Empl Position Type Rates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_RATES = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Valid Responsibilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE__VALID_RESPONSIBILITIES = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Empl Position Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeClassImpl <em>Empl Position Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeClassImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeClass()
	 * @generated
	 */
	int EMPL_POSITION_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Empl Position Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Standard Hours Per Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Empl Position Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_CLASS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeRateImpl <em>Empl Position Type Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeRateImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeRate()
	 * @generated
	 */
	int EMPL_POSITION_TYPE_RATE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rate Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__RATE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pay Grade Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Salary Step Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Empl Position Type Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_POSITION_TYPE_RATE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.ValidResponsibilityImpl <em>Valid Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.ValidResponsibilityImpl
	 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getValidResponsibility()
	 * @generated
	 */
	int VALID_RESPONSIBILITY = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__EMPL_POSITION_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Responsibility Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Valid Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RESPONSIBILITY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition <em>Empl Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition
	 * @generated
	 */
	EClass getEmplPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionId <em>Empl Position Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Position Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_EmplPositionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getActualFromDate <em>Actual From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getActualFromDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_ActualFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getActualThruDate <em>Actual Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getActualThruDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_ActualThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getBudgetId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getBudgetItemSeqId()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_BudgetItemSeqId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionFulfillments <em>Empl Position Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empl Position Fulfillments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionFulfillments()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_EmplPositionFulfillments();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionResponsibilities <em>Empl Position Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empl Position Responsibilities</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionResponsibilities()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_EmplPositionResponsibilities();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionType <em>Empl Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEmplPositionType()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_EmplPositionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEstimatedFromDate <em>Estimated From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEstimatedFromDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_EstimatedFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEstimatedThruDate <em>Estimated Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getEstimatedThruDate()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_EstimatedThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#isExemptFlag <em>Exempt Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Flag</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#isExemptFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_ExemptFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#isFulltimeFlag <em>Fulltime Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulltime Flag</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#isFulltimeFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_FulltimeFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getParty()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_Party();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getReportingToEmplPositionReportingStructs <em>Reporting To Empl Position Reporting Structs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reporting To Empl Position Reporting Structs</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getReportingToEmplPositionReportingStructs()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_ReportingToEmplPositionReportingStructs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#isSalaryFlag <em>Salary Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Flag</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#isSalaryFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_SalaryFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#getStatus()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EReference getEmplPosition_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPosition#isTemporaryFlag <em>Temporary Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporary Flag</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPosition#isTemporaryFlag()
	 * @see #getEmplPosition()
	 * @generated
	 */
	EAttribute getEmplPosition_TemporaryFlag();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType <em>Empl Position Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Class Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType
	 * @generated
	 */
	EClass getEmplPositionClassType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getEmplPositionClassTypeId <em>Empl Position Class Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Position Class Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getEmplPositionClassTypeId()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EAttribute getEmplPositionClassType_EmplPositionClassTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getDescription()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EAttribute getEmplPositionClassType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getHasTable()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EAttribute getEmplPositionClassType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionClassType#getParentType()
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	EReference getEmplPositionClassType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment <em>Empl Position Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Fulfillment</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment
	 * @generated
	 */
	EClass getEmplPositionFulfillment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getEmplPosition <em>Empl Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getEmplPosition()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EReference getEmplPositionFulfillment_EmplPosition();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getParty()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EReference getEmplPositionFulfillment_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getFromDate()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EAttribute getEmplPositionFulfillment_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getComments()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EAttribute getEmplPositionFulfillment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment#getThruDate()
	 * @see #getEmplPositionFulfillment()
	 * @generated
	 */
	EAttribute getEmplPositionFulfillment_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct <em>Empl Position Reporting Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Reporting Struct</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct
	 * @generated
	 */
	EClass getEmplPositionReportingStruct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getEmplPositionIdReportingTo <em>Empl Position Id Reporting To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Id Reporting To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getEmplPositionIdReportingTo()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EReference getEmplPositionReportingStruct_EmplPositionIdReportingTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getEmplPositionIdManagedBy <em>Empl Position Id Managed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Id Managed By</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getEmplPositionIdManagedBy()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EReference getEmplPositionReportingStruct_EmplPositionIdManagedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getFromDate()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getComments()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getPrimaryFlag <em>Primary Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Flag</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getPrimaryFlag()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_PrimaryFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct#getThruDate()
	 * @see #getEmplPositionReportingStruct()
	 * @generated
	 */
	EAttribute getEmplPositionReportingStruct_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility <em>Empl Position Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Responsibility</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility
	 * @generated
	 */
	EClass getEmplPositionResponsibility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getEmplPosition <em>Empl Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getEmplPosition()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EReference getEmplPositionResponsibility_EmplPosition();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getResponsibilityType <em>Responsibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getResponsibilityType()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EReference getEmplPositionResponsibility_ResponsibilityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getFromDate()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EAttribute getEmplPositionResponsibility_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getComments()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EAttribute getEmplPositionResponsibility_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getThruDate()
	 * @see #getEmplPositionResponsibility()
	 * @generated
	 */
	EAttribute getEmplPositionResponsibility_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType <em>Empl Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType
	 * @generated
	 */
	EClass getEmplPositionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeId()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EAttribute getEmplPositionType_EmplPositionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getDescription()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EAttribute getEmplPositionType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeClasses <em>Empl Position Type Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empl Position Type Classes</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeClasses()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EReference getEmplPositionType_EmplPositionTypeClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeRates <em>Empl Position Type Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empl Position Type Rates</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeRates()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EReference getEmplPositionType_EmplPositionTypeRates();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#isHasTable()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EAttribute getEmplPositionType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getParentType()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EReference getEmplPositionType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getValidResponsibilities <em>Valid Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Responsibilities</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getValidResponsibilities()
	 * @see #getEmplPositionType()
	 * @generated
	 */
	EReference getEmplPositionType_ValidResponsibilities();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass <em>Empl Position Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Type Class</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass
	 * @generated
	 */
	EClass getEmplPositionTypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionType <em>Empl Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionType()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EReference getEmplPositionTypeClass_EmplPositionType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionClassType <em>Empl Position Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Class Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionClassType()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EReference getEmplPositionTypeClass_EmplPositionClassType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getFromDate()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EAttribute getEmplPositionTypeClass_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getStandardHoursPerWeek <em>Standard Hours Per Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Hours Per Week</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getStandardHoursPerWeek()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EAttribute getEmplPositionTypeClass_StandardHoursPerWeek();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getThruDate()
	 * @see #getEmplPositionTypeClass()
	 * @generated
	 */
	EAttribute getEmplPositionTypeClass_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate <em>Empl Position Type Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Position Type Rate</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate
	 * @generated
	 */
	EClass getEmplPositionTypeRate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getEmplPositionType <em>Empl Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getEmplPositionType()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EReference getEmplPositionTypeRate_EmplPositionType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getRateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getRateType()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EReference getEmplPositionTypeRate_RateType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getFromDate()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getPayGradeId <em>Pay Grade Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Grade Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getPayGradeId()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_PayGradeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getSalaryStepSeqId <em>Salary Step Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Step Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getSalaryStepSeqId()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_SalaryStepSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate#getThruDate()
	 * @see #getEmplPositionTypeRate()
	 * @generated
	 */
	EAttribute getEmplPositionTypeRate_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility <em>Valid Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Responsibility</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.ValidResponsibility
	 * @generated
	 */
	EClass getValidResponsibility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getEmplPositionType <em>Empl Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getEmplPositionType()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EReference getValidResponsibility_EmplPositionType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getResponsibilityType <em>Responsibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getResponsibilityType()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EReference getValidResponsibility_ResponsibilityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getFromDate()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EAttribute getValidResponsibility_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getComments()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EAttribute getValidResponsibility_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.position.ValidResponsibility#getThruDate()
	 * @see #getValidResponsibility()
	 * @generated
	 */
	EAttribute getValidResponsibility_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PositionFactory getPositionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl <em>Empl Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPosition()
		 * @generated
		 */
		EClass EMPL_POSITION = eINSTANCE.getEmplPosition();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__EMPL_POSITION_ID = eINSTANCE.getEmplPosition_EmplPositionId();

		/**
		 * The meta object literal for the '<em><b>Actual From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ACTUAL_FROM_DATE = eINSTANCE.getEmplPosition_ActualFromDate();

		/**
		 * The meta object literal for the '<em><b>Actual Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ACTUAL_THRU_DATE = eINSTANCE.getEmplPosition_ActualThruDate();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__BUDGET_ID = eINSTANCE.getEmplPosition_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__BUDGET_ITEM_SEQ_ID = eINSTANCE.getEmplPosition_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Empl Position Fulfillments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__EMPL_POSITION_FULFILLMENTS = eINSTANCE.getEmplPosition_EmplPositionFulfillments();

		/**
		 * The meta object literal for the '<em><b>Empl Position Responsibilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__EMPL_POSITION_RESPONSIBILITIES = eINSTANCE.getEmplPosition_EmplPositionResponsibilities();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__EMPL_POSITION_TYPE = eINSTANCE.getEmplPosition_EmplPositionType();

		/**
		 * The meta object literal for the '<em><b>Estimated From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ESTIMATED_FROM_DATE = eINSTANCE.getEmplPosition_EstimatedFromDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__ESTIMATED_THRU_DATE = eINSTANCE.getEmplPosition_EstimatedThruDate();

		/**
		 * The meta object literal for the '<em><b>Exempt Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__EXEMPT_FLAG = eINSTANCE.getEmplPosition_ExemptFlag();

		/**
		 * The meta object literal for the '<em><b>Fulltime Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__FULLTIME_FLAG = eINSTANCE.getEmplPosition_FulltimeFlag();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__PARTY = eINSTANCE.getEmplPosition_Party();

		/**
		 * The meta object literal for the '<em><b>Reporting To Empl Position Reporting Structs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__REPORTING_TO_EMPL_POSITION_REPORTING_STRUCTS = eINSTANCE.getEmplPosition_ReportingToEmplPositionReportingStructs();

		/**
		 * The meta object literal for the '<em><b>Salary Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__SALARY_FLAG = eINSTANCE.getEmplPosition_SalaryFlag();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION__STATUS = eINSTANCE.getEmplPosition_Status();

		/**
		 * The meta object literal for the '<em><b>Temporary Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION__TEMPORARY_FLAG = eINSTANCE.getEmplPosition_TemporaryFlag();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionClassTypeImpl <em>Empl Position Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionClassTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionClassType()
		 * @generated
		 */
		EClass EMPL_POSITION_CLASS_TYPE = eINSTANCE.getEmplPositionClassType();

		/**
		 * The meta object literal for the '<em><b>Empl Position Class Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_CLASS_TYPE__EMPL_POSITION_CLASS_TYPE_ID = eINSTANCE.getEmplPositionClassType_EmplPositionClassTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_CLASS_TYPE__DESCRIPTION = eINSTANCE.getEmplPositionClassType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_CLASS_TYPE__HAS_TABLE = eINSTANCE.getEmplPositionClassType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_CLASS_TYPE__PARENT_TYPE = eINSTANCE.getEmplPositionClassType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionFulfillmentImpl <em>Empl Position Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionFulfillmentImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionFulfillment()
		 * @generated
		 */
		EClass EMPL_POSITION_FULFILLMENT = eINSTANCE.getEmplPositionFulfillment();

		/**
		 * The meta object literal for the '<em><b>Empl Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_FULFILLMENT__EMPL_POSITION = eINSTANCE.getEmplPositionFulfillment_EmplPosition();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_FULFILLMENT__PARTY = eINSTANCE.getEmplPositionFulfillment_Party();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_FULFILLMENT__FROM_DATE = eINSTANCE.getEmplPositionFulfillment_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_FULFILLMENT__COMMENTS = eINSTANCE.getEmplPositionFulfillment_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_FULFILLMENT__THRU_DATE = eINSTANCE.getEmplPositionFulfillment_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionReportingStructImpl <em>Empl Position Reporting Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionReportingStructImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionReportingStruct()
		 * @generated
		 */
		EClass EMPL_POSITION_REPORTING_STRUCT = eINSTANCE.getEmplPositionReportingStruct();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id Reporting To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO = eINSTANCE.getEmplPositionReportingStruct_EmplPositionIdReportingTo();

		/**
		 * The meta object literal for the '<em><b>Empl Position Id Managed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY = eINSTANCE.getEmplPositionReportingStruct_EmplPositionIdManagedBy();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__FROM_DATE = eINSTANCE.getEmplPositionReportingStruct_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__COMMENTS = eINSTANCE.getEmplPositionReportingStruct_Comments();

		/**
		 * The meta object literal for the '<em><b>Primary Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG = eINSTANCE.getEmplPositionReportingStruct_PrimaryFlag();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_REPORTING_STRUCT__THRU_DATE = eINSTANCE.getEmplPositionReportingStruct_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionResponsibilityImpl <em>Empl Position Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionResponsibilityImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionResponsibility()
		 * @generated
		 */
		EClass EMPL_POSITION_RESPONSIBILITY = eINSTANCE.getEmplPositionResponsibility();

		/**
		 * The meta object literal for the '<em><b>Empl Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION = eINSTANCE.getEmplPositionResponsibility_EmplPosition();

		/**
		 * The meta object literal for the '<em><b>Responsibility Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE = eINSTANCE.getEmplPositionResponsibility_ResponsibilityType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_RESPONSIBILITY__FROM_DATE = eINSTANCE.getEmplPositionResponsibility_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_RESPONSIBILITY__COMMENTS = eINSTANCE.getEmplPositionResponsibility_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_RESPONSIBILITY__THRU_DATE = eINSTANCE.getEmplPositionResponsibility_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl <em>Empl Position Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionType()
		 * @generated
		 */
		EClass EMPL_POSITION_TYPE = eINSTANCE.getEmplPositionType();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_ID = eINSTANCE.getEmplPositionType_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE__DESCRIPTION = eINSTANCE.getEmplPositionType_Description();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_CLASSES = eINSTANCE.getEmplPositionType_EmplPositionTypeClasses();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Rates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_RATES = eINSTANCE.getEmplPositionType_EmplPositionTypeRates();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE__HAS_TABLE = eINSTANCE.getEmplPositionType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE__PARENT_TYPE = eINSTANCE.getEmplPositionType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Valid Responsibilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE__VALID_RESPONSIBILITIES = eINSTANCE.getEmplPositionType_ValidResponsibilities();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeClassImpl <em>Empl Position Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeClassImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeClass()
		 * @generated
		 */
		EClass EMPL_POSITION_TYPE_CLASS = eINSTANCE.getEmplPositionTypeClass();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE = eINSTANCE.getEmplPositionTypeClass_EmplPositionType();

		/**
		 * The meta object literal for the '<em><b>Empl Position Class Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE = eINSTANCE.getEmplPositionTypeClass_EmplPositionClassType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_CLASS__FROM_DATE = eINSTANCE.getEmplPositionTypeClass_FromDate();

		/**
		 * The meta object literal for the '<em><b>Standard Hours Per Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK = eINSTANCE.getEmplPositionTypeClass_StandardHoursPerWeek();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_CLASS__THRU_DATE = eINSTANCE.getEmplPositionTypeClass_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeRateImpl <em>Empl Position Type Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeRateImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getEmplPositionTypeRate()
		 * @generated
		 */
		EClass EMPL_POSITION_TYPE_RATE = eINSTANCE.getEmplPositionTypeRate();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE = eINSTANCE.getEmplPositionTypeRate_EmplPositionType();

		/**
		 * The meta object literal for the '<em><b>Rate Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_POSITION_TYPE_RATE__RATE_TYPE = eINSTANCE.getEmplPositionTypeRate_RateType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__FROM_DATE = eINSTANCE.getEmplPositionTypeRate_FromDate();

		/**
		 * The meta object literal for the '<em><b>Pay Grade Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID = eINSTANCE.getEmplPositionTypeRate_PayGradeId();

		/**
		 * The meta object literal for the '<em><b>Salary Step Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID = eINSTANCE.getEmplPositionTypeRate_SalaryStepSeqId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_POSITION_TYPE_RATE__THRU_DATE = eINSTANCE.getEmplPositionTypeRate_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.position.impl.ValidResponsibilityImpl <em>Valid Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.ValidResponsibilityImpl
		 * @see org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl#getValidResponsibility()
		 * @generated
		 */
		EClass VALID_RESPONSIBILITY = eINSTANCE.getValidResponsibility();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_RESPONSIBILITY__EMPL_POSITION_TYPE = eINSTANCE.getValidResponsibility_EmplPositionType();

		/**
		 * The meta object literal for the '<em><b>Responsibility Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE = eINSTANCE.getValidResponsibility_ResponsibilityType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_RESPONSIBILITY__FROM_DATE = eINSTANCE.getValidResponsibility_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_RESPONSIBILITY__COMMENTS = eINSTANCE.getValidResponsibility_Comments();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_RESPONSIBILITY__THRU_DATE = eINSTANCE.getValidResponsibility_ThruDate();

	}

} //PositionPackage
