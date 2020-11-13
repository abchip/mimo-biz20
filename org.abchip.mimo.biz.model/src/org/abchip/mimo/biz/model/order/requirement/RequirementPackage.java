/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.requirement;

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
 * @see org.abchip.mimo.biz.model.order.requirement.RequirementFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/order/requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-requirement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementPackage eINSTANCE = org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.DesiredFeatureImpl <em>Desired Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.DesiredFeatureImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getDesiredFeature()
	 * @generated
	 */
	int DESIRED_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Desired Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__DESIRED_FEATURE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Optional Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__OPTIONAL_IND = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE__PRODUCT_FEATURE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Desired Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_FEATURE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.OrderRequirementCommitmentImpl <em>Order Requirement Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.OrderRequirementCommitmentImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getOrderRequirementCommitment()
	 * @generated
	 */
	int ORDER_REQUIREMENT_COMMITMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Order Requirement Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REQUIREMENT_COMMITMENT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Deliverable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DELIVERABLE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Estimated Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ESTIMATED_BUDGET = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FACILITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Facility Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FACILITY_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FIXED_ASSET = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REASON = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Required By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIRED_BY_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Requirement Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Requirement Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_START_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Requirement Statuss</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_STATUSS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__USE_CASE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Work Requirement Fulfillments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementAttributeImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementAttribute()
	 * @generated
	 */
	int REQUIREMENT_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementBudgetAllocationImpl <em>Budget Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementBudgetAllocationImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementBudgetAllocation()
	 * @generated
	 */
	int REQUIREMENT_BUDGET_ALLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__BUDGET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Budget Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_BUDGET_ALLOCATION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementCustRequestImpl <em>Cust Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementCustRequestImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementCustRequest()
	 * @generated
	 */
	int REQUIREMENT_CUST_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CUST_REQUEST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST__CUST_REQUEST_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cust Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CUST_REQUEST_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementRoleImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementRole()
	 * @generated
	 */
	int REQUIREMENT_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementStatusImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementStatus()
	 * @generated
	 */
	int REQUIREMENT_STATUS = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__REQUIREMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS__STATUS_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Requirement Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENT_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementTypeAttr()
	 * @generated
	 */
	int REQUIREMENT_TYPE_ATTR = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.WorkReqFulfTypeImpl <em>Work Req Fulf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.WorkReqFulfTypeImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getWorkReqFulfType()
	 * @generated
	 */
	int WORK_REQ_FULF_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Req Fulf Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__WORK_REQ_FULF_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Work Req Fulf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQ_FULF_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.WorkRequirementFulfillmentImpl <em>Work Requirement Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.WorkRequirementFulfillmentImpl
	 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getWorkRequirementFulfillment()
	 * @generated
	 */
	int WORK_REQUIREMENT_FULFILLMENT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Req Fulf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Work Requirement Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_REQUIREMENT_FULFILLMENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature <em>Desired Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desired Feature</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.DesiredFeature
	 * @generated
	 */
	EClass getDesiredFeature();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getRequirement()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EReference getDesiredFeature_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getDesiredFeatureId <em>Desired Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired Feature Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getDesiredFeatureId()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EAttribute getDesiredFeature_DesiredFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getOptionalInd <em>Optional Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Ind</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getOptionalInd()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EAttribute getDesiredFeature_OptionalInd();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getProductFeature()
	 * @see #getDesiredFeature()
	 * @generated
	 */
	EReference getDesiredFeature_ProductFeature();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment <em>Order Requirement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Requirement Commitment</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment
	 * @generated
	 */
	EClass getOrderRequirementCommitment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getOrder()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EReference getOrderRequirementCommitment_Order();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getRequirement()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EReference getOrderRequirementCommitment_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getOrderItemSeqId()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EAttribute getOrderRequirementCommitment_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.OrderRequirementCommitment#getQuantity()
	 * @see #getOrderRequirementCommitment()
	 * @generated
	 */
	EAttribute getOrderRequirementCommitment_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedByUserLogin()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getDeliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverable</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getDeliverable()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Deliverable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getEstimatedBudget <em>Estimated Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Budget</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getEstimatedBudget()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_EstimatedBudget();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getFacility()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFacilityIdTo <em>Facility Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Id To</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getFacilityIdTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_FacilityIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getFixedAsset()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_FixedAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedByUserLogin()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getProduct()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getQuantity()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getReason()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Reason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequiredByDate <em>Required By Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getRequiredByDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequiredByDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementAttributes <em>Requirement Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementAttributes()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStartDate <em>Requirement Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Start Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStartDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequirementStartDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStatuss <em>Requirement Statuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Statuss</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStatuss()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementStatuss();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementType()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Case</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getUseCase()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_UseCase();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getWorkRequirementFulfillments <em>Work Requirement Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Requirement Fulfillments</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.Requirement#getWorkRequirementFulfillments()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_WorkRequirementFulfillments();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementAttribute
	 * @generated
	 */
	EClass getRequirementAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getRequirement()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EReference getRequirementAttribute_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getAttrName()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EAttribute getRequirementAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getAttrDescription()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EAttribute getRequirementAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementAttribute#getAttrValue()
	 * @see #getRequirementAttribute()
	 * @generated
	 */
	EAttribute getRequirementAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation <em>Budget Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget Allocation</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation
	 * @generated
	 */
	EClass getRequirementBudgetAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getBudget()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EReference getRequirementBudgetAllocation_Budget();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getRequirement()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EReference getRequirementBudgetAllocation_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getBudgetItemSeqId()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EAttribute getRequirementBudgetAllocation_BudgetItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementBudgetAllocation#getAmount()
	 * @see #getRequirementBudgetAllocation()
	 * @generated
	 */
	EAttribute getRequirementBudgetAllocation_Amount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest <em>Cust Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest
	 * @generated
	 */
	EClass getRequirementCustRequest();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest#getCustRequest <em>Cust Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest#getCustRequest()
	 * @see #getRequirementCustRequest()
	 * @generated
	 */
	EReference getRequirementCustRequest_CustRequest();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest#getRequirement()
	 * @see #getRequirementCustRequest()
	 * @generated
	 */
	EReference getRequirementCustRequest_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementCustRequest#getCustRequestItemSeqId()
	 * @see #getRequirementCustRequest()
	 * @generated
	 */
	EAttribute getRequirementCustRequest_CustRequestItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementRole
	 * @generated
	 */
	EClass getRequirementRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementRole#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementRole#getRequirement()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EReference getRequirementRole_Requirement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementRole#getParty()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EReference getRequirementRole_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementRole#getRoleTypeId()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EAttribute getRequirementRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementRole#getFromDate()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EAttribute getRequirementRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementRole#getThruDate()
	 * @see #getRequirementRole()
	 * @generated
	 */
	EAttribute getRequirementRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementStatus
	 * @generated
	 */
	EClass getRequirementStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getRequirement()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EReference getRequirementStatus_Requirement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getStatus()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EReference getRequirementStatus_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getChangeByUserLogin()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EReference getRequirementStatus_ChangeByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementStatus#getStatusDate()
	 * @see #getRequirementStatus()
	 * @generated
	 */
	EAttribute getRequirementStatus_StatusDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementType
	 * @generated
	 */
	EClass getRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementType#getRequirementTypeId <em>Requirement Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementType#getRequirementTypeId()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_RequirementTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementType#getDescription()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementType#getHasTable()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementType#getParentType()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.requirement.RequirementType#getRequirementTypeAttrs <em>Requirement Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementType#getRequirementTypeAttrs()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_RequirementTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr
	 * @generated
	 */
	EClass getRequirementTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr#getRequirementType()
	 * @see #getRequirementTypeAttr()
	 * @generated
	 */
	EReference getRequirementTypeAttr_RequirementType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr#getAttrName()
	 * @see #getRequirementTypeAttr()
	 * @generated
	 */
	EAttribute getRequirementTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementTypeAttr#getDescription()
	 * @see #getRequirementTypeAttr()
	 * @generated
	 */
	EAttribute getRequirementTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.WorkReqFulfType <em>Work Req Fulf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Req Fulf Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkReqFulfType
	 * @generated
	 */
	EClass getWorkReqFulfType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.WorkReqFulfType#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Req Fulf Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkReqFulfType#getWorkReqFulfTypeId()
	 * @see #getWorkReqFulfType()
	 * @generated
	 */
	EAttribute getWorkReqFulfType_WorkReqFulfTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.requirement.WorkReqFulfType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkReqFulfType#getDescription()
	 * @see #getWorkReqFulfType()
	 * @generated
	 */
	EAttribute getWorkReqFulfType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment <em>Work Requirement Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Requirement Fulfillment</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment
	 * @generated
	 */
	EClass getWorkRequirementFulfillment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getRequirement()
	 * @see #getWorkRequirementFulfillment()
	 * @generated
	 */
	EReference getWorkRequirementFulfillment_Requirement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkEffort()
	 * @see #getWorkRequirementFulfillment()
	 * @generated
	 */
	EReference getWorkRequirementFulfillment_WorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkReqFulfType <em>Work Req Fulf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Req Fulf Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkReqFulfType()
	 * @see #getWorkRequirementFulfillment()
	 * @generated
	 */
	EReference getWorkRequirementFulfillment_WorkReqFulfType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementFactory getRequirementFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.DesiredFeatureImpl <em>Desired Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.DesiredFeatureImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getDesiredFeature()
		 * @generated
		 */
		EClass DESIRED_FEATURE = eINSTANCE.getDesiredFeature();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIRED_FEATURE__REQUIREMENT = eINSTANCE.getDesiredFeature_Requirement();

		/**
		 * The meta object literal for the '<em><b>Desired Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIRED_FEATURE__DESIRED_FEATURE_ID = eINSTANCE.getDesiredFeature_DesiredFeatureId();

		/**
		 * The meta object literal for the '<em><b>Optional Ind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIRED_FEATURE__OPTIONAL_IND = eINSTANCE.getDesiredFeature_OptionalInd();

		/**
		 * The meta object literal for the '<em><b>Product Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIRED_FEATURE__PRODUCT_FEATURE = eINSTANCE.getDesiredFeature_ProductFeature();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.OrderRequirementCommitmentImpl <em>Order Requirement Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.OrderRequirementCommitmentImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getOrderRequirementCommitment()
		 * @generated
		 */
		EClass ORDER_REQUIREMENT_COMMITMENT = eINSTANCE.getOrderRequirementCommitment();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_REQUIREMENT_COMMITMENT__ORDER = eINSTANCE.getOrderRequirementCommitment_Order();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_REQUIREMENT_COMMITMENT__REQUIREMENT = eINSTANCE.getOrderRequirementCommitment_Requirement();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_REQUIREMENT_COMMITMENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getOrderRequirementCommitment_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_REQUIREMENT_COMMITMENT__QUANTITY = eINSTANCE.getOrderRequirementCommitment_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIREMENT_ID = eINSTANCE.getRequirement_RequirementId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getRequirement_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED_DATE = eINSTANCE.getRequirement_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Deliverable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DELIVERABLE = eINSTANCE.getRequirement_Deliverable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Estimated Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ESTIMATED_BUDGET = eINSTANCE.getRequirement_EstimatedBudget();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__FACILITY = eINSTANCE.getRequirement_Facility();

		/**
		 * The meta object literal for the '<em><b>Facility Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__FACILITY_ID_TO = eINSTANCE.getRequirement_FacilityIdTo();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__FIXED_ASSET = eINSTANCE.getRequirement_FixedAsset();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getRequirement_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LAST_MODIFIED_DATE = eINSTANCE.getRequirement_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PRODUCT = eINSTANCE.getRequirement_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__QUANTITY = eINSTANCE.getRequirement_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REASON = eINSTANCE.getRequirement_Reason();

		/**
		 * The meta object literal for the '<em><b>Required By Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIRED_BY_DATE = eINSTANCE.getRequirement_RequiredByDate();

		/**
		 * The meta object literal for the '<em><b>Requirement Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_ATTRIBUTES = eINSTANCE.getRequirement_RequirementAttributes();

		/**
		 * The meta object literal for the '<em><b>Requirement Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIREMENT_START_DATE = eINSTANCE.getRequirement_RequirementStartDate();

		/**
		 * The meta object literal for the '<em><b>Requirement Statuss</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_STATUSS = eINSTANCE.getRequirement_RequirementStatuss();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_TYPE = eINSTANCE.getRequirement_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__STATUS = eINSTANCE.getRequirement_Status();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__USE_CASE = eINSTANCE.getRequirement_UseCase();

		/**
		 * The meta object literal for the '<em><b>Work Requirement Fulfillments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS = eINSTANCE.getRequirement_WorkRequirementFulfillments();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementAttributeImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementAttribute()
		 * @generated
		 */
		EClass REQUIREMENT_ATTRIBUTE = eINSTANCE.getRequirementAttribute();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ATTRIBUTE__REQUIREMENT = eINSTANCE.getRequirementAttribute_Requirement();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getRequirementAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getRequirementAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getRequirementAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementBudgetAllocationImpl <em>Budget Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementBudgetAllocationImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementBudgetAllocation()
		 * @generated
		 */
		EClass REQUIREMENT_BUDGET_ALLOCATION = eINSTANCE.getRequirementBudgetAllocation();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_BUDGET_ALLOCATION__BUDGET = eINSTANCE.getRequirementBudgetAllocation_Budget();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_BUDGET_ALLOCATION__REQUIREMENT = eINSTANCE.getRequirementBudgetAllocation_Requirement();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID = eINSTANCE.getRequirementBudgetAllocation_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_BUDGET_ALLOCATION__AMOUNT = eINSTANCE.getRequirementBudgetAllocation_Amount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementCustRequestImpl <em>Cust Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementCustRequestImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementCustRequest()
		 * @generated
		 */
		EClass REQUIREMENT_CUST_REQUEST = eINSTANCE.getRequirementCustRequest();

		/**
		 * The meta object literal for the '<em><b>Cust Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CUST_REQUEST__CUST_REQUEST = eINSTANCE.getRequirementCustRequest_CustRequest();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CUST_REQUEST__REQUIREMENT = eINSTANCE.getRequirementCustRequest_Requirement();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_CUST_REQUEST__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getRequirementCustRequest_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementRoleImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementRole()
		 * @generated
		 */
		EClass REQUIREMENT_ROLE = eINSTANCE.getRequirementRole();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROLE__REQUIREMENT = eINSTANCE.getRequirementRole_Requirement();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROLE__PARTY = eINSTANCE.getRequirementRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ROLE__ROLE_TYPE_ID = eINSTANCE.getRequirementRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ROLE__FROM_DATE = eINSTANCE.getRequirementRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ROLE__THRU_DATE = eINSTANCE.getRequirementRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementStatusImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementStatus()
		 * @generated
		 */
		EClass REQUIREMENT_STATUS = eINSTANCE.getRequirementStatus();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_STATUS__REQUIREMENT = eINSTANCE.getRequirementStatus_Requirement();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_STATUS__STATUS = eINSTANCE.getRequirementStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_STATUS__CHANGE_BY_USER_LOGIN = eINSTANCE.getRequirementStatus_ChangeByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_STATUS__STATUS_DATE = eINSTANCE.getRequirementStatus_StatusDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementType()
		 * @generated
		 */
		EClass REQUIREMENT_TYPE = eINSTANCE.getRequirementType();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__REQUIREMENT_TYPE_ID = eINSTANCE.getRequirementType_RequirementTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__DESCRIPTION = eINSTANCE.getRequirementType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__HAS_TABLE = eINSTANCE.getRequirementType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__PARENT_TYPE = eINSTANCE.getRequirementType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__REQUIREMENT_TYPE_ATTRS = eINSTANCE.getRequirementType_RequirementTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getRequirementTypeAttr()
		 * @generated
		 */
		EClass REQUIREMENT_TYPE_ATTR = eINSTANCE.getRequirementTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE = eINSTANCE.getRequirementTypeAttr_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getRequirementTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getRequirementTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.WorkReqFulfTypeImpl <em>Work Req Fulf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.WorkReqFulfTypeImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getWorkReqFulfType()
		 * @generated
		 */
		EClass WORK_REQ_FULF_TYPE = eINSTANCE.getWorkReqFulfType();

		/**
		 * The meta object literal for the '<em><b>Work Req Fulf Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_REQ_FULF_TYPE__WORK_REQ_FULF_TYPE_ID = eINSTANCE.getWorkReqFulfType_WorkReqFulfTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_REQ_FULF_TYPE__DESCRIPTION = eINSTANCE.getWorkReqFulfType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.requirement.impl.WorkRequirementFulfillmentImpl <em>Work Requirement Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.WorkRequirementFulfillmentImpl
		 * @see org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl#getWorkRequirementFulfillment()
		 * @generated
		 */
		EClass WORK_REQUIREMENT_FULFILLMENT = eINSTANCE.getWorkRequirementFulfillment();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_REQUIREMENT_FULFILLMENT__REQUIREMENT = eINSTANCE.getWorkRequirementFulfillment_Requirement();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_REQUIREMENT_FULFILLMENT__WORK_EFFORT = eINSTANCE.getWorkRequirementFulfillment_WorkEffort();

		/**
		 * The meta object literal for the '<em><b>Work Req Fulf Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_REQUIREMENT_FULFILLMENT__WORK_REQ_FULF_TYPE = eINSTANCE.getWorkRequirementFulfillment_WorkReqFulfType();

	}

} //RequirementPackage
