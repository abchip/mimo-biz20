/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.employment;

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
 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentFactory
 * @model kind="package"
 * @generated
 */
public interface EmploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "employment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/humanres/employment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-employment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmploymentPackage eINSTANCE = org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.BenefitTypeImpl <em>Benefit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.BenefitTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getBenefitType()
	 * @generated
	 */
	int BENEFIT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Benefit Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__BENEFIT_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Benefit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__BENEFIT_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Employer Paid Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Benefit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl <em>Empl Leave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmplLeave()
	 * @generated
	 */
	int EMPL_LEAVE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leave Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__LEAVE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Approver Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__APPROVER_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Empl Leave Reason Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Leave Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__LEAVE_STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Empl Leave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveReasonTypeImpl <em>Empl Leave Reason Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveReasonTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmplLeaveReasonType()
	 * @generated
	 */
	int EMPL_LEAVE_REASON_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Leave Reason Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Empl Leave Reason Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_REASON_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveTypeImpl <em>Empl Leave Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmplLeaveType()
	 * @generated
	 */
	int EMPL_LEAVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Leave Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__LEAVE_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Empl Leave Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPL_LEAVE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentImpl <em>Employment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmployment()
	 * @generated
	 */
	int EMPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__PARTY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__PARTY_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Termination Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__TERMINATION_REASON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Termination Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__TERMINATION_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Employment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmploymentApp()
	 * @generated
	 */
	int EMPLOYMENT_APP = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__APPLICATION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Application Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__APPLICATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applying Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__APPLYING_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Approver Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__APPROVER_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__EMPL_POSITION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Employment App Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Job Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__JOB_REQUISITION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Referred By Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__REFERRED_BY_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppSourceTypeImpl <em>App Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppSourceTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmploymentAppSourceType()
	 * @generated
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Employment App Source Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>App Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_APP_SOURCE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PartyBenefitImpl <em>Party Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PartyBenefitImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPartyBenefit()
	 * @generated
	 */
	int PARTY_BENEFIT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__PARTY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__PARTY_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Benefit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__BENEFIT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Actual Employer Paid Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Available Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__AVAILABLE_TIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Period Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__PERIOD_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Party Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_BENEFIT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PayGradeImpl <em>Pay Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PayGradeImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPayGrade()
	 * @generated
	 */
	int PAY_GRADE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pay Grade Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__PAY_GRADE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pay Grade Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE__PAY_GRADE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pay Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_GRADE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PayHistoryImpl <em>Pay History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PayHistoryImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPayHistory()
	 * @generated
	 */
	int PAY_HISTORY = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__EMPL_FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__PARTY_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__PARTY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pay Grade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__PAY_GRADE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Period Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__PERIOD_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Salary Step Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__SALARY_STEP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Pay History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_HISTORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PayrollPreferenceImpl <em>Payroll Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PayrollPreferenceImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPayrollPreference()
	 * @generated
	 */
	int PAYROLL_PREFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Payroll Preference Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__PAYROLL_PREFERENCE_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__ACCOUNT_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__BANK_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deduction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__DEDUCTION_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Flat Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__FLAT_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Payment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__PAYMENT_METHOD_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__PERCENTAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Period Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__PERIOD_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Routing Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__ROUTING_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Payroll Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_PREFERENCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.SalaryStepImpl <em>Salary Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.SalaryStepImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getSalaryStep()
	 * @generated
	 */
	int SALARY_STEP = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pay Grade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__PAY_GRADE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Salary Step Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__SALARY_STEP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__DATE_MODIFIED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Salary Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_STEP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.TerminationReasonImpl <em>Termination Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.TerminationReasonImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getTerminationReason()
	 * @generated
	 */
	int TERMINATION_REASON = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Termination Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON__TERMINATION_REASON_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Termination Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_REASON_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.TerminationTypeImpl <em>Termination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.TerminationTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getTerminationType()
	 * @generated
	 */
	int TERMINATION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Termination Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__TERMINATION_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Termination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.UnemploymentClaimImpl <em>Unemployment Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.UnemploymentClaimImpl
	 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getUnemploymentClaim()
	 * @generated
	 */
	int UNEMPLOYMENT_CLAIM = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unemployment Claim Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__UNEMPLOYMENT_CLAIM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__PARTY_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__PARTY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Unemployment Claim Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM__UNEMPLOYMENT_CLAIM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Unemployment Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEMPLOYMENT_CLAIM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType <em>Benefit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benefit Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType
	 * @generated
	 */
	EClass getBenefitType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitTypeId <em>Benefit Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Benefit Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitTypeId()
	 * @see #getBenefitType()
	 * @generated
	 */
	EAttribute getBenefitType_BenefitTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitName <em>Benefit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Benefit Name</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitName()
	 * @see #getBenefitType()
	 * @generated
	 */
	EAttribute getBenefitType_BenefitName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType#getDescription()
	 * @see #getBenefitType()
	 * @generated
	 */
	EAttribute getBenefitType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getEmployerPaidPercentage <em>Employer Paid Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employer Paid Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType#getEmployerPaidPercentage()
	 * @see #getBenefitType()
	 * @generated
	 */
	EAttribute getBenefitType_EmployerPaidPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType#getHasTable()
	 * @see #getBenefitType()
	 * @generated
	 */
	EAttribute getBenefitType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.BenefitType#getParentType()
	 * @see #getBenefitType()
	 * @generated
	 */
	EReference getBenefitType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave <em>Empl Leave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Leave</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave
	 * @generated
	 */
	EClass getEmplLeave();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getParty()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EReference getEmplLeave_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveType <em>Leave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leave Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveType()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EReference getEmplLeave_LeaveType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getFromDate()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EAttribute getEmplLeave_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getApproverParty <em>Approver Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approver Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getApproverParty()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EReference getEmplLeave_ApproverParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getDescription()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EAttribute getEmplLeave_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getEmplLeaveReasonType <em>Empl Leave Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Leave Reason Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getEmplLeaveReasonType()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EReference getEmplLeave_EmplLeaveReasonType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveStatus <em>Leave Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leave Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveStatus()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EReference getEmplLeave_LeaveStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getThruDate()
	 * @see #getEmplLeave()
	 * @generated
	 */
	EAttribute getEmplLeave_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType <em>Empl Leave Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Leave Reason Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType
	 * @generated
	 */
	EClass getEmplLeaveReasonType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getEmplLeaveReasonTypeId <em>Empl Leave Reason Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl Leave Reason Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getEmplLeaveReasonTypeId()
	 * @see #getEmplLeaveReasonType()
	 * @generated
	 */
	EAttribute getEmplLeaveReasonType_EmplLeaveReasonTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getDescription()
	 * @see #getEmplLeaveReasonType()
	 * @generated
	 */
	EAttribute getEmplLeaveReasonType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getHasTable()
	 * @see #getEmplLeaveReasonType()
	 * @generated
	 */
	EAttribute getEmplLeaveReasonType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType#getParentType()
	 * @see #getEmplLeaveReasonType()
	 * @generated
	 */
	EReference getEmplLeaveReasonType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType <em>Empl Leave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empl Leave Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType
	 * @generated
	 */
	EClass getEmplLeaveType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getLeaveTypeId <em>Leave Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leave Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getLeaveTypeId()
	 * @see #getEmplLeaveType()
	 * @generated
	 */
	EAttribute getEmplLeaveType_LeaveTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getDescription()
	 * @see #getEmplLeaveType()
	 * @generated
	 */
	EAttribute getEmplLeaveType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getHasTable()
	 * @see #getEmplLeaveType()
	 * @generated
	 */
	EAttribute getEmplLeaveType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getParentType()
	 * @see #getEmplLeaveType()
	 * @generated
	 */
	EReference getEmplLeaveType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.Employment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employment</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment
	 * @generated
	 */
	EClass getEmployment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getRoleTypeIdFrom()
	 * @see #getEmployment()
	 * @generated
	 */
	EAttribute getEmployment_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getRoleTypeIdTo()
	 * @see #getEmployment()
	 * @generated
	 */
	EAttribute getEmployment_RoleTypeIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getTerminationReason <em>Termination Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Termination Reason</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getTerminationReason()
	 * @see #getEmployment()
	 * @generated
	 */
	EReference getEmployment_TerminationReason();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getTerminationType <em>Termination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Termination Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getTerminationType()
	 * @see #getEmployment()
	 * @generated
	 */
	EReference getEmployment_TerminationType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getPartyIdFrom()
	 * @see #getEmployment()
	 * @generated
	 */
	EReference getEmployment_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getPartyIdTo()
	 * @see #getEmployment()
	 * @generated
	 */
	EReference getEmployment_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getFromDate()
	 * @see #getEmployment()
	 * @generated
	 */
	EAttribute getEmployment_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.Employment#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.Employment#getThruDate()
	 * @see #getEmployment()
	 * @generated
	 */
	EAttribute getEmployment_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp
	 * @generated
	 */
	EClass getEmploymentApp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationId()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EAttribute getEmploymentApp_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationDate <em>Application Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationDate()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EAttribute getEmploymentApp_ApplicationDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplyingParty <em>Applying Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applying Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplyingParty()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_ApplyingParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApproverParty <em>Approver Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approver Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApproverParty()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_ApproverParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmplPosition <em>Empl Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmplPosition()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_EmplPosition();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmploymentAppSourceType <em>Employment App Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employment App Source Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmploymentAppSourceType()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_EmploymentAppSourceType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getJobRequisition <em>Job Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Requisition</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getJobRequisition()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_JobRequisition();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getReferredByParty <em>Referred By Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred By Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getReferredByParty()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_ReferredByParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getStatus()
	 * @see #getEmploymentApp()
	 * @generated
	 */
	EReference getEmploymentApp_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType <em>App Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Source Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType
	 * @generated
	 */
	EClass getEmploymentAppSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employment App Source Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getEmploymentAppSourceTypeId()
	 * @see #getEmploymentAppSourceType()
	 * @generated
	 */
	EAttribute getEmploymentAppSourceType_EmploymentAppSourceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getDescription()
	 * @see #getEmploymentAppSourceType()
	 * @generated
	 */
	EAttribute getEmploymentAppSourceType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getHasTable()
	 * @see #getEmploymentAppSourceType()
	 * @generated
	 */
	EAttribute getEmploymentAppSourceType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType#getParentType()
	 * @see #getEmploymentAppSourceType()
	 * @generated
	 */
	EReference getEmploymentAppSourceType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit <em>Party Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Benefit</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit
	 * @generated
	 */
	EClass getPartyBenefit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getRoleTypeIdFrom()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getRoleTypeIdTo()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_RoleTypeIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getPartyIdFrom()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EReference getPartyBenefit_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getBenefitType <em>Benefit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Benefit Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getBenefitType()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EReference getPartyBenefit_BenefitType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getPartyIdTo()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EReference getPartyBenefit_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getFromDate()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getActualEmployerPaidPercent <em>Actual Employer Paid Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Employer Paid Percent</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getActualEmployerPaidPercent()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_ActualEmployerPaidPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getAvailableTime <em>Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Time</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getAvailableTime()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_AvailableTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getCost()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_Cost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getPeriodType <em>Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getPeriodType()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EReference getPartyBenefit_PeriodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PartyBenefit#getThruDate()
	 * @see #getPartyBenefit()
	 * @generated
	 */
	EAttribute getPartyBenefit_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.PayGrade <em>Pay Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pay Grade</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayGrade
	 * @generated
	 */
	EClass getPayGrade();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayGrade#getPayGradeId <em>Pay Grade Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Grade Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayGrade#getPayGradeId()
	 * @see #getPayGrade()
	 * @generated
	 */
	EAttribute getPayGrade_PayGradeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayGrade#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayGrade#getComments()
	 * @see #getPayGrade()
	 * @generated
	 */
	EAttribute getPayGrade_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayGrade#getPayGradeName <em>Pay Grade Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Grade Name</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayGrade#getPayGradeName()
	 * @see #getPayGrade()
	 * @generated
	 */
	EAttribute getPayGrade_PayGradeName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory <em>Pay History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pay History</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory
	 * @generated
	 */
	EClass getPayHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getEmplFromDate <em>Empl From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empl From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getEmplFromDate()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_EmplFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getRoleTypeIdFrom()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getRoleTypeIdTo()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_RoleTypeIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPartyIdFrom()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_PartyIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPartyIdTo()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getFromDate()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getAmount()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getComments()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPayGrade <em>Pay Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pay Grade</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPayGrade()
	 * @see #getPayHistory()
	 * @generated
	 */
	EReference getPayHistory_PayGrade();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPeriodType <em>Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getPeriodType()
	 * @see #getPayHistory()
	 * @generated
	 */
	EReference getPayHistory_PeriodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getSalaryStepSeqId <em>Salary Step Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Step Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getSalaryStepSeqId()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_SalaryStepSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayHistory#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayHistory#getThruDate()
	 * @see #getPayHistory()
	 * @generated
	 */
	EAttribute getPayHistory_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference <em>Payroll Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payroll Preference</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference
	 * @generated
	 */
	EClass getPayrollPreference();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getParty()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EReference getPayrollPreference_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoleTypeId()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPayrollPreferenceSeqId <em>Payroll Preference Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payroll Preference Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPayrollPreferenceSeqId()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_PayrollPreferenceSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getAccountNumber()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getBankName()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_BankName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getDeductionType <em>Deduction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deduction Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getDeductionType()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EReference getPayrollPreference_DeductionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFlatAmount <em>Flat Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flat Amount</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFlatAmount()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_FlatAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFromDate()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPaymentMethodType <em>Payment Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPaymentMethodType()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EReference getPayrollPreference_PaymentMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPercentage()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_Percentage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPeriodType <em>Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPeriodType()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EReference getPayrollPreference_PeriodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoutingNumber <em>Routing Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Number</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoutingNumber()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_RoutingNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getThruDate()
	 * @see #getPayrollPreference()
	 * @generated
	 */
	EAttribute getPayrollPreference_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep <em>Salary Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salary Step</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep
	 * @generated
	 */
	EClass getSalaryStep();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getPayGrade <em>Pay Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pay Grade</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getPayGrade()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EReference getSalaryStep_PayGrade();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getSalaryStepSeqId <em>Salary Step Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Step Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getSalaryStepSeqId()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_SalaryStepSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getFromDate()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getAmount()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getCreatedByUserLogin()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getDateModified <em>Date Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Modified</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getDateModified()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_DateModified();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getLastModifiedByUserLogin()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.SalaryStep#getThruDate()
	 * @see #getSalaryStep()
	 * @generated
	 */
	EAttribute getSalaryStep_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationReason <em>Termination Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Reason</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationReason
	 * @generated
	 */
	EClass getTerminationReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationReason#getTerminationReasonId <em>Termination Reason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Reason Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationReason#getTerminationReasonId()
	 * @see #getTerminationReason()
	 * @generated
	 */
	EAttribute getTerminationReason_TerminationReasonId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationReason#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationReason#getDescription()
	 * @see #getTerminationReason()
	 * @generated
	 */
	EAttribute getTerminationReason_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationType <em>Termination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationType
	 * @generated
	 */
	EClass getTerminationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationType#getTerminationTypeId <em>Termination Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationType#getTerminationTypeId()
	 * @see #getTerminationType()
	 * @generated
	 */
	EAttribute getTerminationType_TerminationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationType#getDescription()
	 * @see #getTerminationType()
	 * @generated
	 */
	EAttribute getTerminationType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationType#getHasTable()
	 * @see #getTerminationType()
	 * @generated
	 */
	EAttribute getTerminationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.TerminationType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.TerminationType#getParentType()
	 * @see #getTerminationType()
	 * @generated
	 */
	EReference getTerminationType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim <em>Unemployment Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unemployment Claim</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim
	 * @generated
	 */
	EClass getUnemploymentClaim();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getUnemploymentClaimId <em>Unemployment Claim Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unemployment Claim Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getUnemploymentClaimId()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_UnemploymentClaimId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getDescription()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getFromDate()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getPartyIdFrom()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_PartyIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getPartyIdTo()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getRoleTypeIdFrom()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getRoleTypeIdTo()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_RoleTypeIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getStatus()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EReference getUnemploymentClaim_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getThruDate()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getUnemploymentClaimDate <em>Unemployment Claim Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unemployment Claim Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.employment.UnemploymentClaim#getUnemploymentClaimDate()
	 * @see #getUnemploymentClaim()
	 * @generated
	 */
	EAttribute getUnemploymentClaim_UnemploymentClaimDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmploymentFactory getEmploymentFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.BenefitTypeImpl <em>Benefit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.BenefitTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getBenefitType()
		 * @generated
		 */
		EClass BENEFIT_TYPE = eINSTANCE.getBenefitType();

		/**
		 * The meta object literal for the '<em><b>Benefit Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENEFIT_TYPE__BENEFIT_TYPE_ID = eINSTANCE.getBenefitType_BenefitTypeId();

		/**
		 * The meta object literal for the '<em><b>Benefit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENEFIT_TYPE__BENEFIT_NAME = eINSTANCE.getBenefitType_BenefitName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENEFIT_TYPE__DESCRIPTION = eINSTANCE.getBenefitType_Description();

		/**
		 * The meta object literal for the '<em><b>Employer Paid Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE = eINSTANCE.getBenefitType_EmployerPaidPercentage();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENEFIT_TYPE__HAS_TABLE = eINSTANCE.getBenefitType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENEFIT_TYPE__PARENT_TYPE = eINSTANCE.getBenefitType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl <em>Empl Leave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmplLeave()
		 * @generated
		 */
		EClass EMPL_LEAVE = eINSTANCE.getEmplLeave();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE__PARTY = eINSTANCE.getEmplLeave_Party();

		/**
		 * The meta object literal for the '<em><b>Leave Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE__LEAVE_TYPE = eINSTANCE.getEmplLeave_LeaveType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE__FROM_DATE = eINSTANCE.getEmplLeave_FromDate();

		/**
		 * The meta object literal for the '<em><b>Approver Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE__APPROVER_PARTY = eINSTANCE.getEmplLeave_ApproverParty();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE__DESCRIPTION = eINSTANCE.getEmplLeave_Description();

		/**
		 * The meta object literal for the '<em><b>Empl Leave Reason Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE = eINSTANCE.getEmplLeave_EmplLeaveReasonType();

		/**
		 * The meta object literal for the '<em><b>Leave Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE__LEAVE_STATUS = eINSTANCE.getEmplLeave_LeaveStatus();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE__THRU_DATE = eINSTANCE.getEmplLeave_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveReasonTypeImpl <em>Empl Leave Reason Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveReasonTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmplLeaveReasonType()
		 * @generated
		 */
		EClass EMPL_LEAVE_REASON_TYPE = eINSTANCE.getEmplLeaveReasonType();

		/**
		 * The meta object literal for the '<em><b>Empl Leave Reason Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID = eINSTANCE.getEmplLeaveReasonType_EmplLeaveReasonTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE_REASON_TYPE__DESCRIPTION = eINSTANCE.getEmplLeaveReasonType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE_REASON_TYPE__HAS_TABLE = eINSTANCE.getEmplLeaveReasonType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE_REASON_TYPE__PARENT_TYPE = eINSTANCE.getEmplLeaveReasonType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveTypeImpl <em>Empl Leave Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmplLeaveType()
		 * @generated
		 */
		EClass EMPL_LEAVE_TYPE = eINSTANCE.getEmplLeaveType();

		/**
		 * The meta object literal for the '<em><b>Leave Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE_TYPE__LEAVE_TYPE_ID = eINSTANCE.getEmplLeaveType_LeaveTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE_TYPE__DESCRIPTION = eINSTANCE.getEmplLeaveType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPL_LEAVE_TYPE__HAS_TABLE = eINSTANCE.getEmplLeaveType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPL_LEAVE_TYPE__PARENT_TYPE = eINSTANCE.getEmplLeaveType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentImpl <em>Employment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmployment()
		 * @generated
		 */
		EClass EMPLOYMENT = eINSTANCE.getEmployment();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT__ROLE_TYPE_ID_FROM = eINSTANCE.getEmployment_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT__ROLE_TYPE_ID_TO = eINSTANCE.getEmployment_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Termination Reason</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT__TERMINATION_REASON = eINSTANCE.getEmployment_TerminationReason();

		/**
		 * The meta object literal for the '<em><b>Termination Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT__TERMINATION_TYPE = eINSTANCE.getEmployment_TerminationType();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT__PARTY_ID_FROM = eINSTANCE.getEmployment_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT__PARTY_ID_TO = eINSTANCE.getEmployment_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT__FROM_DATE = eINSTANCE.getEmployment_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT__THRU_DATE = eINSTANCE.getEmployment_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmploymentApp()
		 * @generated
		 */
		EClass EMPLOYMENT_APP = eINSTANCE.getEmploymentApp();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_APP__APPLICATION_ID = eINSTANCE.getEmploymentApp_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Application Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_APP__APPLICATION_DATE = eINSTANCE.getEmploymentApp_ApplicationDate();

		/**
		 * The meta object literal for the '<em><b>Applying Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__APPLYING_PARTY = eINSTANCE.getEmploymentApp_ApplyingParty();

		/**
		 * The meta object literal for the '<em><b>Approver Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__APPROVER_PARTY = eINSTANCE.getEmploymentApp_ApproverParty();

		/**
		 * The meta object literal for the '<em><b>Empl Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__EMPL_POSITION = eINSTANCE.getEmploymentApp_EmplPosition();

		/**
		 * The meta object literal for the '<em><b>Employment App Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE = eINSTANCE.getEmploymentApp_EmploymentAppSourceType();

		/**
		 * The meta object literal for the '<em><b>Job Requisition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__JOB_REQUISITION = eINSTANCE.getEmploymentApp_JobRequisition();

		/**
		 * The meta object literal for the '<em><b>Referred By Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__REFERRED_BY_PARTY = eINSTANCE.getEmploymentApp_ReferredByParty();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP__STATUS = eINSTANCE.getEmploymentApp_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppSourceTypeImpl <em>App Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppSourceTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getEmploymentAppSourceType()
		 * @generated
		 */
		EClass EMPLOYMENT_APP_SOURCE_TYPE = eINSTANCE.getEmploymentAppSourceType();

		/**
		 * The meta object literal for the '<em><b>Employment App Source Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID = eINSTANCE.getEmploymentAppSourceType_EmploymentAppSourceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION = eINSTANCE.getEmploymentAppSourceType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE = eINSTANCE.getEmploymentAppSourceType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE = eINSTANCE.getEmploymentAppSourceType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PartyBenefitImpl <em>Party Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PartyBenefitImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPartyBenefit()
		 * @generated
		 */
		EClass PARTY_BENEFIT = eINSTANCE.getPartyBenefit();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__ROLE_TYPE_ID_FROM = eINSTANCE.getPartyBenefit_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__ROLE_TYPE_ID_TO = eINSTANCE.getPartyBenefit_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_BENEFIT__PARTY_ID_FROM = eINSTANCE.getPartyBenefit_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Benefit Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_BENEFIT__BENEFIT_TYPE = eINSTANCE.getPartyBenefit_BenefitType();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_BENEFIT__PARTY_ID_TO = eINSTANCE.getPartyBenefit_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__FROM_DATE = eINSTANCE.getPartyBenefit_FromDate();

		/**
		 * The meta object literal for the '<em><b>Actual Employer Paid Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT = eINSTANCE.getPartyBenefit_ActualEmployerPaidPercent();

		/**
		 * The meta object literal for the '<em><b>Available Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__AVAILABLE_TIME = eINSTANCE.getPartyBenefit_AvailableTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__COST = eINSTANCE.getPartyBenefit_Cost();

		/**
		 * The meta object literal for the '<em><b>Period Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_BENEFIT__PERIOD_TYPE = eINSTANCE.getPartyBenefit_PeriodType();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_BENEFIT__THRU_DATE = eINSTANCE.getPartyBenefit_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PayGradeImpl <em>Pay Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PayGradeImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPayGrade()
		 * @generated
		 */
		EClass PAY_GRADE = eINSTANCE.getPayGrade();

		/**
		 * The meta object literal for the '<em><b>Pay Grade Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_GRADE__PAY_GRADE_ID = eINSTANCE.getPayGrade_PayGradeId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_GRADE__COMMENTS = eINSTANCE.getPayGrade_Comments();

		/**
		 * The meta object literal for the '<em><b>Pay Grade Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_GRADE__PAY_GRADE_NAME = eINSTANCE.getPayGrade_PayGradeName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PayHistoryImpl <em>Pay History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PayHistoryImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPayHistory()
		 * @generated
		 */
		EClass PAY_HISTORY = eINSTANCE.getPayHistory();

		/**
		 * The meta object literal for the '<em><b>Empl From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__EMPL_FROM_DATE = eINSTANCE.getPayHistory_EmplFromDate();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__ROLE_TYPE_ID_FROM = eINSTANCE.getPayHistory_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__ROLE_TYPE_ID_TO = eINSTANCE.getPayHistory_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__PARTY_ID_FROM = eINSTANCE.getPayHistory_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__PARTY_ID_TO = eINSTANCE.getPayHistory_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__FROM_DATE = eINSTANCE.getPayHistory_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__AMOUNT = eINSTANCE.getPayHistory_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__COMMENTS = eINSTANCE.getPayHistory_Comments();

		/**
		 * The meta object literal for the '<em><b>Pay Grade</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_HISTORY__PAY_GRADE = eINSTANCE.getPayHistory_PayGrade();

		/**
		 * The meta object literal for the '<em><b>Period Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_HISTORY__PERIOD_TYPE = eINSTANCE.getPayHistory_PeriodType();

		/**
		 * The meta object literal for the '<em><b>Salary Step Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__SALARY_STEP_SEQ_ID = eINSTANCE.getPayHistory_SalaryStepSeqId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_HISTORY__THRU_DATE = eINSTANCE.getPayHistory_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.PayrollPreferenceImpl <em>Payroll Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.PayrollPreferenceImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getPayrollPreference()
		 * @generated
		 */
		EClass PAYROLL_PREFERENCE = eINSTANCE.getPayrollPreference();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYROLL_PREFERENCE__PARTY = eINSTANCE.getPayrollPreference_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__ROLE_TYPE_ID = eINSTANCE.getPayrollPreference_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Payroll Preference Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__PAYROLL_PREFERENCE_SEQ_ID = eINSTANCE.getPayrollPreference_PayrollPreferenceSeqId();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__ACCOUNT_NUMBER = eINSTANCE.getPayrollPreference_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__BANK_NAME = eINSTANCE.getPayrollPreference_BankName();

		/**
		 * The meta object literal for the '<em><b>Deduction Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYROLL_PREFERENCE__DEDUCTION_TYPE = eINSTANCE.getPayrollPreference_DeductionType();

		/**
		 * The meta object literal for the '<em><b>Flat Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__FLAT_AMOUNT = eINSTANCE.getPayrollPreference_FlatAmount();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__FROM_DATE = eINSTANCE.getPayrollPreference_FromDate();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYROLL_PREFERENCE__PAYMENT_METHOD_TYPE = eINSTANCE.getPayrollPreference_PaymentMethodType();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__PERCENTAGE = eINSTANCE.getPayrollPreference_Percentage();

		/**
		 * The meta object literal for the '<em><b>Period Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYROLL_PREFERENCE__PERIOD_TYPE = eINSTANCE.getPayrollPreference_PeriodType();

		/**
		 * The meta object literal for the '<em><b>Routing Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__ROUTING_NUMBER = eINSTANCE.getPayrollPreference_RoutingNumber();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYROLL_PREFERENCE__THRU_DATE = eINSTANCE.getPayrollPreference_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.SalaryStepImpl <em>Salary Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.SalaryStepImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getSalaryStep()
		 * @generated
		 */
		EClass SALARY_STEP = eINSTANCE.getSalaryStep();

		/**
		 * The meta object literal for the '<em><b>Pay Grade</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALARY_STEP__PAY_GRADE = eINSTANCE.getSalaryStep_PayGrade();

		/**
		 * The meta object literal for the '<em><b>Salary Step Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__SALARY_STEP_SEQ_ID = eINSTANCE.getSalaryStep_SalaryStepSeqId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__FROM_DATE = eINSTANCE.getSalaryStep_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__AMOUNT = eINSTANCE.getSalaryStep_Amount();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__CREATED_BY_USER_LOGIN = eINSTANCE.getSalaryStep_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Date Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__DATE_MODIFIED = eINSTANCE.getSalaryStep_DateModified();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getSalaryStep_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY_STEP__THRU_DATE = eINSTANCE.getSalaryStep_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.TerminationReasonImpl <em>Termination Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.TerminationReasonImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getTerminationReason()
		 * @generated
		 */
		EClass TERMINATION_REASON = eINSTANCE.getTerminationReason();

		/**
		 * The meta object literal for the '<em><b>Termination Reason Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINATION_REASON__TERMINATION_REASON_ID = eINSTANCE.getTerminationReason_TerminationReasonId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINATION_REASON__DESCRIPTION = eINSTANCE.getTerminationReason_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.TerminationTypeImpl <em>Termination Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.TerminationTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getTerminationType()
		 * @generated
		 */
		EClass TERMINATION_TYPE = eINSTANCE.getTerminationType();

		/**
		 * The meta object literal for the '<em><b>Termination Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINATION_TYPE__TERMINATION_TYPE_ID = eINSTANCE.getTerminationType_TerminationTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINATION_TYPE__DESCRIPTION = eINSTANCE.getTerminationType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINATION_TYPE__HAS_TABLE = eINSTANCE.getTerminationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATION_TYPE__PARENT_TYPE = eINSTANCE.getTerminationType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.employment.impl.UnemploymentClaimImpl <em>Unemployment Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.UnemploymentClaimImpl
		 * @see org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl#getUnemploymentClaim()
		 * @generated
		 */
		EClass UNEMPLOYMENT_CLAIM = eINSTANCE.getUnemploymentClaim();

		/**
		 * The meta object literal for the '<em><b>Unemployment Claim Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__UNEMPLOYMENT_CLAIM_ID = eINSTANCE.getUnemploymentClaim_UnemploymentClaimId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__DESCRIPTION = eINSTANCE.getUnemploymentClaim_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__FROM_DATE = eINSTANCE.getUnemploymentClaim_FromDate();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__PARTY_ID_FROM = eINSTANCE.getUnemploymentClaim_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__PARTY_ID_TO = eINSTANCE.getUnemploymentClaim_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__ROLE_TYPE_ID_FROM = eINSTANCE.getUnemploymentClaim_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__ROLE_TYPE_ID_TO = eINSTANCE.getUnemploymentClaim_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNEMPLOYMENT_CLAIM__STATUS = eINSTANCE.getUnemploymentClaim_Status();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__THRU_DATE = eINSTANCE.getUnemploymentClaim_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Unemployment Claim Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNEMPLOYMENT_CLAIM__UNEMPLOYMENT_CLAIM_DATE = eINSTANCE.getUnemploymentClaim_UnemploymentClaimDate();

	}

} //EmploymentPackage
