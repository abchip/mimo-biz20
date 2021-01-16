/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

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
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityFactory
 * @model kind="package"
 * @generated
 */
public interface AbilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/humanres/ability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-ability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbilityPackage eINSTANCE = org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualImpl <em>Party Qual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartyQual()
	 * @generated
	 */
	int PARTY_QUAL = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Qual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__PARTY_QUAL_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Qualification Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__QUALIFICATION_DESC = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__TITLE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Verif Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL__VERIF_STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Party Qual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualTypeImpl <em>Party Qual Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartyQualType()
	 * @generated
	 */
	int PARTY_QUAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Qual Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__PARTY_QUAL_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Party Qual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_QUAL_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartyResumeImpl <em>Party Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartyResumeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartyResume()
	 * @generated
	 */
	int PARTY_RESUME = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resume Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__RESUME_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resume Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__RESUME_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resume Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME__RESUME_TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Party Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RESUME_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartySkillImpl <em>Party Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartySkillImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartySkill()
	 * @generated
	 */
	int PARTY_SKILL = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Skill Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__SKILL_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__RATING = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__SKILL_LEVEL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Started Using Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__STARTED_USING_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Years Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL__YEARS_EXPERIENCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Party Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_SKILL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfRatingTypeImpl <em>Perf Rating Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfRatingTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfRatingType()
	 * @generated
	 */
	int PERF_RATING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Perf Rating Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__PERF_RATING_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Perf Rating Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_RATING_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewImpl <em>Perf Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfReview()
	 * @generated
	 */
	int PERF_REVIEW = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Employee Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__EMPLOYEE_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Employee Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Perf Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__PERF_REVIEW_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__EMPL_POSITION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Manager Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__MANAGER_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Manager Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__MANAGER_ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__PAYMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Perf Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemImpl <em>Perf Review Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfReviewItem()
	 * @generated
	 */
	int PERF_REVIEW_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Employee Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__EMPLOYEE_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Employee Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Perf Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__PERF_REVIEW_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Perf Review Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Perf Rating Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__PERF_RATING_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Perf Review Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Perf Review Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemTypeImpl <em>Perf Review Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfReviewItemType()
	 * @generated
	 */
	int PERF_REVIEW_ITEM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Perf Review Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__PERF_REVIEW_ITEM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Perf Review Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_REVIEW_ITEM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerformanceNoteImpl <em>Performance Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerformanceNoteImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerformanceNote()
	 * @generated
	 */
	int PERFORMANCE_NOTE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Communication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__COMMUNICATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Performance Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_NOTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PersonTrainingImpl <em>Person Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PersonTrainingImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPersonTraining()
	 * @generated
	 */
	int PERSON_TRAINING = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Training Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__TRAINING_CLASS_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Approval Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__APPROVAL_STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Approver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__APPROVER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__REASON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Training Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__TRAINING_REQUEST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Person Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TRAINING_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.ResponsibilityTypeImpl <em>Responsibility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.ResponsibilityTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getResponsibilityType()
	 * @generated
	 */
	int RESPONSIBILITY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Responsibility Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__RESPONSIBILITY_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Responsibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.SkillTypeImpl <em>Skill Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.SkillTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getSkillType()
	 * @generated
	 */
	int SKILL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skill Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__SKILL_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Skill Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.TrainingClassTypeImpl <em>Training Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.TrainingClassTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getTrainingClassType()
	 * @generated
	 */
	int TRAINING_CLASS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Training Class Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__TRAINING_CLASS_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Training Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual <em>Party Qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Qual</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual
	 * @generated
	 */
	EClass getPartyQual();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getParty()
	 * @see #getPartyQual()
	 * @generated
	 */
	EReference getPartyQual_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getPartyQualType <em>Party Qual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Qual Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getPartyQualType()
	 * @see #getPartyQual()
	 * @generated
	 */
	EReference getPartyQual_PartyQualType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getFromDate()
	 * @see #getPartyQual()
	 * @generated
	 */
	EAttribute getPartyQual_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getQualificationDesc <em>Qualification Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification Desc</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getQualificationDesc()
	 * @see #getPartyQual()
	 * @generated
	 */
	EAttribute getPartyQual_QualificationDesc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getStatus()
	 * @see #getPartyQual()
	 * @generated
	 */
	EReference getPartyQual_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getThruDate()
	 * @see #getPartyQual()
	 * @generated
	 */
	EAttribute getPartyQual_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getTitle()
	 * @see #getPartyQual()
	 * @generated
	 */
	EAttribute getPartyQual_Title();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQual#getVerifStatus <em>Verif Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verif Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQual#getVerifStatus()
	 * @see #getPartyQual()
	 * @generated
	 */
	EReference getPartyQual_VerifStatus();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQualType <em>Party Qual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Qual Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQualType
	 * @generated
	 */
	EClass getPartyQualType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getPartyQualTypeId <em>Party Qual Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Qual Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getPartyQualTypeId()
	 * @see #getPartyQualType()
	 * @generated
	 */
	EAttribute getPartyQualType_PartyQualTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getDescription()
	 * @see #getPartyQualType()
	 * @generated
	 */
	EAttribute getPartyQualType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getHasTable()
	 * @see #getPartyQualType()
	 * @generated
	 */
	EAttribute getPartyQualType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyQualType#getParentType()
	 * @see #getPartyQualType()
	 * @generated
	 */
	EReference getPartyQualType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume <em>Party Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Resume</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyResume
	 * @generated
	 */
	EClass getPartyResume();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeId <em>Resume Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeId()
	 * @see #getPartyResume()
	 * @generated
	 */
	EAttribute getPartyResume_ResumeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyResume#getContent()
	 * @see #getPartyResume()
	 * @generated
	 */
	EReference getPartyResume_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyResume#getParty()
	 * @see #getPartyResume()
	 * @generated
	 */
	EReference getPartyResume_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeDate <em>Resume Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeDate()
	 * @see #getPartyResume()
	 * @generated
	 */
	EAttribute getPartyResume_ResumeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeText <em>Resume Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Text</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartyResume#getResumeText()
	 * @see #getPartyResume()
	 * @generated
	 */
	EAttribute getPartyResume_ResumeText();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill <em>Party Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Skill</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill
	 * @generated
	 */
	EClass getPartySkill();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill#getParty()
	 * @see #getPartySkill()
	 * @generated
	 */
	EReference getPartySkill_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillType <em>Skill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillType()
	 * @see #getPartySkill()
	 * @generated
	 */
	EReference getPartySkill_SkillType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill#getRating()
	 * @see #getPartySkill()
	 * @generated
	 */
	EAttribute getPartySkill_Rating();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillLevel <em>Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Level</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill#getSkillLevel()
	 * @see #getPartySkill()
	 * @generated
	 */
	EAttribute getPartySkill_SkillLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getStartedUsingDate <em>Started Using Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started Using Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill#getStartedUsingDate()
	 * @see #getPartySkill()
	 * @generated
	 */
	EAttribute getPartySkill_StartedUsingDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PartySkill#getYearsExperience <em>Years Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years Experience</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PartySkill#getYearsExperience()
	 * @see #getPartySkill()
	 * @generated
	 */
	EAttribute getPartySkill_YearsExperience();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PerfRatingType <em>Perf Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Rating Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfRatingType
	 * @generated
	 */
	EClass getPerfRatingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getPerfRatingTypeId <em>Perf Rating Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perf Rating Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getPerfRatingTypeId()
	 * @see #getPerfRatingType()
	 * @generated
	 */
	EAttribute getPerfRatingType_PerfRatingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getDescription()
	 * @see #getPerfRatingType()
	 * @generated
	 */
	EAttribute getPerfRatingType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getHasTable()
	 * @see #getPerfRatingType()
	 * @generated
	 */
	EAttribute getPerfRatingType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfRatingType#getParentType()
	 * @see #getPerfRatingType()
	 * @generated
	 */
	EReference getPerfRatingType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview <em>Perf Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Review</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview
	 * @generated
	 */
	EClass getPerfReview();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeParty <em>Employee Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeParty()
	 * @see #getPerfReview()
	 * @generated
	 */
	EReference getPerfReview_EmployeeParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeRoleTypeId()
	 * @see #getPerfReview()
	 * @generated
	 */
	EAttribute getPerfReview_EmployeeRoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPerfReviewId <em>Perf Review Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perf Review Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPerfReviewId()
	 * @see #getPerfReview()
	 * @generated
	 */
	EAttribute getPerfReview_PerfReviewId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getComments()
	 * @see #getPerfReview()
	 * @generated
	 */
	EAttribute getPerfReview_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmplPosition <em>Empl Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmplPosition()
	 * @see #getPerfReview()
	 * @generated
	 */
	EReference getPerfReview_EmplPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getFromDate()
	 * @see #getPerfReview()
	 * @generated
	 */
	EAttribute getPerfReview_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerParty <em>Manager Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerParty()
	 * @see #getPerfReview()
	 * @generated
	 */
	EReference getPerfReview_ManagerParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerRoleTypeId <em>Manager Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerRoleTypeId()
	 * @see #getPerfReview()
	 * @generated
	 */
	EAttribute getPerfReview_ManagerRoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPayment()
	 * @see #getPerfReview()
	 * @generated
	 */
	EReference getPerfReview_Payment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReview#getThruDate()
	 * @see #getPerfReview()
	 * @generated
	 */
	EAttribute getPerfReview_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem <em>Perf Review Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Review Item</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem
	 * @generated
	 */
	EClass getPerfReviewItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeParty <em>Employee Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeParty()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EReference getPerfReviewItem_EmployeeParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeRoleTypeId()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EAttribute getPerfReviewItem_EmployeeRoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewId <em>Perf Review Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perf Review Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewId()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EAttribute getPerfReviewItem_PerfReviewId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perf Review Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemSeqId()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EAttribute getPerfReviewItem_PerfReviewItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getComments()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EAttribute getPerfReviewItem_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfRatingType <em>Perf Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perf Rating Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfRatingType()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EReference getPerfReviewItem_PerfRatingType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemType <em>Perf Review Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perf Review Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemType()
	 * @see #getPerfReviewItem()
	 * @generated
	 */
	EReference getPerfReviewItem_PerfReviewItemType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType <em>Perf Review Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Review Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType
	 * @generated
	 */
	EClass getPerfReviewItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getPerfReviewItemTypeId <em>Perf Review Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perf Review Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getPerfReviewItemTypeId()
	 * @see #getPerfReviewItemType()
	 * @generated
	 */
	EAttribute getPerfReviewItemType_PerfReviewItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getDescription()
	 * @see #getPerfReviewItemType()
	 * @generated
	 */
	EAttribute getPerfReviewItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getHasTable()
	 * @see #getPerfReviewItemType()
	 * @generated
	 */
	EAttribute getPerfReviewItemType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerfReviewItemType#getParentType()
	 * @see #getPerfReviewItemType()
	 * @generated
	 */
	EReference getPerfReviewItemType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote <em>Performance Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Note</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote
	 * @generated
	 */
	EClass getPerformanceNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getParty()
	 * @see #getPerformanceNote()
	 * @generated
	 */
	EReference getPerformanceNote_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getRoleTypeId()
	 * @see #getPerformanceNote()
	 * @generated
	 */
	EAttribute getPerformanceNote_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getFromDate()
	 * @see #getPerformanceNote()
	 * @generated
	 */
	EAttribute getPerformanceNote_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getComments()
	 * @see #getPerformanceNote()
	 * @generated
	 */
	EAttribute getPerformanceNote_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getCommunicationDate <em>Communication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getCommunicationDate()
	 * @see #getPerformanceNote()
	 * @generated
	 */
	EAttribute getPerformanceNote_CommunicationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PerformanceNote#getThruDate()
	 * @see #getPerformanceNote()
	 * @generated
	 */
	EAttribute getPerformanceNote_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining <em>Person Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Training</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining
	 * @generated
	 */
	EClass getPersonTraining();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getParty()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EReference getPersonTraining_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingClassType <em>Training Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Training Class Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingClassType()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EReference getPersonTraining_TrainingClassType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getFromDate()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EAttribute getPersonTraining_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprovalStatus <em>Approval Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Status</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprovalStatus()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EAttribute getPersonTraining_ApprovalStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprover <em>Approver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approver</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprover()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EReference getPersonTraining_Approver();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getReason()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EAttribute getPersonTraining_Reason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getThruDate()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EAttribute getPersonTraining_ThruDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingRequest <em>Training Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Training Request</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingRequest()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EReference getPersonTraining_TrainingRequest();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getWorkEffort()
	 * @see #getPersonTraining()
	 * @generated
	 */
	EReference getPersonTraining_WorkEffort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType <em>Responsibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsibility Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType
	 * @generated
	 */
	EClass getResponsibilityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getResponsibilityTypeId <em>Responsibility Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getResponsibilityTypeId()
	 * @see #getResponsibilityType()
	 * @generated
	 */
	EAttribute getResponsibilityType_ResponsibilityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getDescription()
	 * @see #getResponsibilityType()
	 * @generated
	 */
	EAttribute getResponsibilityType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getHasTable()
	 * @see #getResponsibilityType()
	 * @generated
	 */
	EAttribute getResponsibilityType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType#getParentType()
	 * @see #getResponsibilityType()
	 * @generated
	 */
	EReference getResponsibilityType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.SkillType <em>Skill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.SkillType
	 * @generated
	 */
	EClass getSkillType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.SkillType#getSkillTypeId <em>Skill Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.SkillType#getSkillTypeId()
	 * @see #getSkillType()
	 * @generated
	 */
	EAttribute getSkillType_SkillTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.SkillType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.SkillType#getDescription()
	 * @see #getSkillType()
	 * @generated
	 */
	EAttribute getSkillType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.SkillType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.SkillType#getHasTable()
	 * @see #getSkillType()
	 * @generated
	 */
	EAttribute getSkillType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.SkillType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.SkillType#getParentType()
	 * @see #getSkillType()
	 * @generated
	 */
	EReference getSkillType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType <em>Training Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Class Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.TrainingClassType
	 * @generated
	 */
	EClass getTrainingClassType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getTrainingClassTypeId <em>Training Class Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Class Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getTrainingClassTypeId()
	 * @see #getTrainingClassType()
	 * @generated
	 */
	EAttribute getTrainingClassType_TrainingClassTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getDescription()
	 * @see #getTrainingClassType()
	 * @generated
	 */
	EAttribute getTrainingClassType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getHasTable()
	 * @see #getTrainingClassType()
	 * @generated
	 */
	EAttribute getTrainingClassType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getParentType()
	 * @see #getTrainingClassType()
	 * @generated
	 */
	EReference getTrainingClassType_ParentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbilityFactory getAbilityFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualImpl <em>Party Qual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartyQual()
		 * @generated
		 */
		EClass PARTY_QUAL = eINSTANCE.getPartyQual();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_QUAL__PARTY = eINSTANCE.getPartyQual_Party();

		/**
		 * The meta object literal for the '<em><b>Party Qual Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_QUAL__PARTY_QUAL_TYPE = eINSTANCE.getPartyQual_PartyQualType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL__FROM_DATE = eINSTANCE.getPartyQual_FromDate();

		/**
		 * The meta object literal for the '<em><b>Qualification Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL__QUALIFICATION_DESC = eINSTANCE.getPartyQual_QualificationDesc();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_QUAL__STATUS = eINSTANCE.getPartyQual_Status();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL__THRU_DATE = eINSTANCE.getPartyQual_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL__TITLE = eINSTANCE.getPartyQual_Title();

		/**
		 * The meta object literal for the '<em><b>Verif Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_QUAL__VERIF_STATUS = eINSTANCE.getPartyQual_VerifStatus();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualTypeImpl <em>Party Qual Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartyQualTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartyQualType()
		 * @generated
		 */
		EClass PARTY_QUAL_TYPE = eINSTANCE.getPartyQualType();

		/**
		 * The meta object literal for the '<em><b>Party Qual Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL_TYPE__PARTY_QUAL_TYPE_ID = eINSTANCE.getPartyQualType_PartyQualTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL_TYPE__DESCRIPTION = eINSTANCE.getPartyQualType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_QUAL_TYPE__HAS_TABLE = eINSTANCE.getPartyQualType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_QUAL_TYPE__PARENT_TYPE = eINSTANCE.getPartyQualType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartyResumeImpl <em>Party Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartyResumeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartyResume()
		 * @generated
		 */
		EClass PARTY_RESUME = eINSTANCE.getPartyResume();

		/**
		 * The meta object literal for the '<em><b>Resume Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RESUME__RESUME_ID = eINSTANCE.getPartyResume_ResumeId();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RESUME__CONTENT = eINSTANCE.getPartyResume_Content();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RESUME__PARTY = eINSTANCE.getPartyResume_Party();

		/**
		 * The meta object literal for the '<em><b>Resume Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RESUME__RESUME_DATE = eINSTANCE.getPartyResume_ResumeDate();

		/**
		 * The meta object literal for the '<em><b>Resume Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RESUME__RESUME_TEXT = eINSTANCE.getPartyResume_ResumeText();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PartySkillImpl <em>Party Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PartySkillImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPartySkill()
		 * @generated
		 */
		EClass PARTY_SKILL = eINSTANCE.getPartySkill();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_SKILL__PARTY = eINSTANCE.getPartySkill_Party();

		/**
		 * The meta object literal for the '<em><b>Skill Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_SKILL__SKILL_TYPE = eINSTANCE.getPartySkill_SkillType();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_SKILL__RATING = eINSTANCE.getPartySkill_Rating();

		/**
		 * The meta object literal for the '<em><b>Skill Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_SKILL__SKILL_LEVEL = eINSTANCE.getPartySkill_SkillLevel();

		/**
		 * The meta object literal for the '<em><b>Started Using Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_SKILL__STARTED_USING_DATE = eINSTANCE.getPartySkill_StartedUsingDate();

		/**
		 * The meta object literal for the '<em><b>Years Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_SKILL__YEARS_EXPERIENCE = eINSTANCE.getPartySkill_YearsExperience();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfRatingTypeImpl <em>Perf Rating Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfRatingTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfRatingType()
		 * @generated
		 */
		EClass PERF_RATING_TYPE = eINSTANCE.getPerfRatingType();

		/**
		 * The meta object literal for the '<em><b>Perf Rating Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_RATING_TYPE__PERF_RATING_TYPE_ID = eINSTANCE.getPerfRatingType_PerfRatingTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_RATING_TYPE__DESCRIPTION = eINSTANCE.getPerfRatingType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_RATING_TYPE__HAS_TABLE = eINSTANCE.getPerfRatingType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_RATING_TYPE__PARENT_TYPE = eINSTANCE.getPerfRatingType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewImpl <em>Perf Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfReview()
		 * @generated
		 */
		EClass PERF_REVIEW = eINSTANCE.getPerfReview();

		/**
		 * The meta object literal for the '<em><b>Employee Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW__EMPLOYEE_PARTY = eINSTANCE.getPerfReview_EmployeeParty();

		/**
		 * The meta object literal for the '<em><b>Employee Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID = eINSTANCE.getPerfReview_EmployeeRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Perf Review Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW__PERF_REVIEW_ID = eINSTANCE.getPerfReview_PerfReviewId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW__COMMENTS = eINSTANCE.getPerfReview_Comments();

		/**
		 * The meta object literal for the '<em><b>Empl Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW__EMPL_POSITION = eINSTANCE.getPerfReview_EmplPosition();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW__FROM_DATE = eINSTANCE.getPerfReview_FromDate();

		/**
		 * The meta object literal for the '<em><b>Manager Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW__MANAGER_PARTY = eINSTANCE.getPerfReview_ManagerParty();

		/**
		 * The meta object literal for the '<em><b>Manager Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW__MANAGER_ROLE_TYPE_ID = eINSTANCE.getPerfReview_ManagerRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW__PAYMENT = eINSTANCE.getPerfReview_Payment();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW__THRU_DATE = eINSTANCE.getPerfReview_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemImpl <em>Perf Review Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfReviewItem()
		 * @generated
		 */
		EClass PERF_REVIEW_ITEM = eINSTANCE.getPerfReviewItem();

		/**
		 * The meta object literal for the '<em><b>Employee Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW_ITEM__EMPLOYEE_PARTY = eINSTANCE.getPerfReviewItem_EmployeeParty();

		/**
		 * The meta object literal for the '<em><b>Employee Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID = eINSTANCE.getPerfReviewItem_EmployeeRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Perf Review Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM__PERF_REVIEW_ID = eINSTANCE.getPerfReviewItem_PerfReviewId();

		/**
		 * The meta object literal for the '<em><b>Perf Review Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID = eINSTANCE.getPerfReviewItem_PerfReviewItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM__COMMENTS = eINSTANCE.getPerfReviewItem_Comments();

		/**
		 * The meta object literal for the '<em><b>Perf Rating Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW_ITEM__PERF_RATING_TYPE = eINSTANCE.getPerfReviewItem_PerfRatingType();

		/**
		 * The meta object literal for the '<em><b>Perf Review Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE = eINSTANCE.getPerfReviewItem_PerfReviewItemType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemTypeImpl <em>Perf Review Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerfReviewItemTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerfReviewItemType()
		 * @generated
		 */
		EClass PERF_REVIEW_ITEM_TYPE = eINSTANCE.getPerfReviewItemType();

		/**
		 * The meta object literal for the '<em><b>Perf Review Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM_TYPE__PERF_REVIEW_ITEM_TYPE_ID = eINSTANCE.getPerfReviewItemType_PerfReviewItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM_TYPE__DESCRIPTION = eINSTANCE.getPerfReviewItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_REVIEW_ITEM_TYPE__HAS_TABLE = eINSTANCE.getPerfReviewItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_REVIEW_ITEM_TYPE__PARENT_TYPE = eINSTANCE.getPerfReviewItemType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PerformanceNoteImpl <em>Performance Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PerformanceNoteImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPerformanceNote()
		 * @generated
		 */
		EClass PERFORMANCE_NOTE = eINSTANCE.getPerformanceNote();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_NOTE__PARTY = eINSTANCE.getPerformanceNote_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_NOTE__ROLE_TYPE_ID = eINSTANCE.getPerformanceNote_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_NOTE__FROM_DATE = eINSTANCE.getPerformanceNote_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_NOTE__COMMENTS = eINSTANCE.getPerformanceNote_Comments();

		/**
		 * The meta object literal for the '<em><b>Communication Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_NOTE__COMMUNICATION_DATE = eINSTANCE.getPerformanceNote_CommunicationDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_NOTE__THRU_DATE = eINSTANCE.getPerformanceNote_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.PersonTrainingImpl <em>Person Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.PersonTrainingImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getPersonTraining()
		 * @generated
		 */
		EClass PERSON_TRAINING = eINSTANCE.getPersonTraining();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TRAINING__PARTY = eINSTANCE.getPersonTraining_Party();

		/**
		 * The meta object literal for the '<em><b>Training Class Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TRAINING__TRAINING_CLASS_TYPE = eINSTANCE.getPersonTraining_TrainingClassType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TRAINING__FROM_DATE = eINSTANCE.getPersonTraining_FromDate();

		/**
		 * The meta object literal for the '<em><b>Approval Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TRAINING__APPROVAL_STATUS = eINSTANCE.getPersonTraining_ApprovalStatus();

		/**
		 * The meta object literal for the '<em><b>Approver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TRAINING__APPROVER = eINSTANCE.getPersonTraining_Approver();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TRAINING__REASON = eINSTANCE.getPersonTraining_Reason();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TRAINING__THRU_DATE = eINSTANCE.getPersonTraining_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Training Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TRAINING__TRAINING_REQUEST = eINSTANCE.getPersonTraining_TrainingRequest();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TRAINING__WORK_EFFORT = eINSTANCE.getPersonTraining_WorkEffort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.ResponsibilityTypeImpl <em>Responsibility Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.ResponsibilityTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getResponsibilityType()
		 * @generated
		 */
		EClass RESPONSIBILITY_TYPE = eINSTANCE.getResponsibilityType();

		/**
		 * The meta object literal for the '<em><b>Responsibility Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBILITY_TYPE__RESPONSIBILITY_TYPE_ID = eINSTANCE.getResponsibilityType_ResponsibilityTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBILITY_TYPE__DESCRIPTION = eINSTANCE.getResponsibilityType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBILITY_TYPE__HAS_TABLE = eINSTANCE.getResponsibilityType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY_TYPE__PARENT_TYPE = eINSTANCE.getResponsibilityType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.SkillTypeImpl <em>Skill Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.SkillTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getSkillType()
		 * @generated
		 */
		EClass SKILL_TYPE = eINSTANCE.getSkillType();

		/**
		 * The meta object literal for the '<em><b>Skill Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_TYPE__SKILL_TYPE_ID = eINSTANCE.getSkillType_SkillTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_TYPE__DESCRIPTION = eINSTANCE.getSkillType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_TYPE__HAS_TABLE = eINSTANCE.getSkillType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_TYPE__PARENT_TYPE = eINSTANCE.getSkillType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.ability.impl.TrainingClassTypeImpl <em>Training Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.TrainingClassTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl#getTrainingClassType()
		 * @generated
		 */
		EClass TRAINING_CLASS_TYPE = eINSTANCE.getTrainingClassType();

		/**
		 * The meta object literal for the '<em><b>Training Class Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_CLASS_TYPE__TRAINING_CLASS_TYPE_ID = eINSTANCE.getTrainingClassType_TrainingClassTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_CLASS_TYPE__DESCRIPTION = eINSTANCE.getTrainingClassType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_CLASS_TYPE__HAS_TABLE = eINSTANCE.getTrainingClassType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_CLASS_TYPE__PARENT_TYPE = eINSTANCE.getTrainingClassType_ParentType();

	}

} //AbilityPackage
