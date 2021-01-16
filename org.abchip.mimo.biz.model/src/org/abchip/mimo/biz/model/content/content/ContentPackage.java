/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

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
 * @see org.abchip.mimo.biz.model.content.content.ContentFactory
 * @model kind="package"
 * @generated
 */
public interface ContentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "content";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/content/content";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-content";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentPackage eINSTANCE = org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CHARACTER_SET = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Child Branch Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CHILD_BRANCH_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Child Leaf Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CHILD_LEAF_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Keywords</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_KEYWORDS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Content Meta Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_META_DATAS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Content Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Content Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_PURPOSES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Content Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_REVISIONS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CUSTOM_METHOD = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DATA_RESOURCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DATA_SOURCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Decorator Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DECORATOR_CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>From Comm Event Content Assocs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__FROM_COMM_EVENT_CONTENT_ASSOCS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Instance Of Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__INSTANCE_OF_CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LOCALE_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__MIME_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Owner Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__OWNER_CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Privilege Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__PRIVILEGE_ENUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__SERVICE_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Template Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TEMPLATE_DATA_RESOURCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentApprovalImpl <em>Approval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentApprovalImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentApproval()
	 * @generated
	 */
	int CONTENT_APPROVAL = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Approval Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__CONTENT_APPROVAL_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__APPROVAL_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Approval Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__APPROVAL_STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Approval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_APPROVAL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAssocImpl <em>Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAssocImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAssoc()
	 * @generated
	 */
	int CONTENT_ASSOC = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CONTENT_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CONTENT_ASSOC_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content Assoc Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__DATA_SOURCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Left Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__LEFT_COORDINATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__MAP_KEY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__SEQUENCE_NUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Upper Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC__UPPER_COORDINATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAssocPredicateImpl <em>Assoc Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAssocPredicateImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAssocPredicate()
	 * @generated
	 */
	int CONTENT_ASSOC_PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Assoc Predicate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE__CONTENT_ASSOC_PREDICATE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Assoc Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_PREDICATE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAssocTypeImpl <em>Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAssocTypeImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAssocType()
	 * @generated
	 */
	int CONTENT_ASSOC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__CONTENT_ASSOC_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ASSOC_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAttributeImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAttribute()
	 * @generated
	 */
	int CONTENT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentKeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentKeywordImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentKeyword()
	 * @generated
	 */
	int CONTENT_KEYWORD = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__KEYWORD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relevancy Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD__RELEVANCY_WEIGHT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_KEYWORD_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentMetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentMetaDataImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentMetaData()
	 * @generated
	 */
	int CONTENT_META_DATA = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Meta Data Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__META_DATA_PREDICATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__DATA_SOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Meta Data Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA__META_DATA_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_META_DATA_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentOperationImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentOperation()
	 * @generated
	 */
	int CONTENT_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION__CONTENT_OPERATION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentPurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPurposeImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentPurpose()
	 * @generated
	 */
	int CONTENT_PURPOSE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE__SEQUENCE_NUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentPurposeOperationImpl <em>Purpose Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPurposeOperationImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentPurposeOperation()
	 * @generated
	 */
	int CONTENT_PURPOSE_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Privilege Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Purpose Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_OPERATION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentPurposeTypeImpl <em>Purpose Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPurposeTypeImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentPurposeType()
	 * @generated
	 */
	int CONTENT_PURPOSE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Purpose Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__CONTENT_PURPOSE_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Purpose Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PURPOSE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentRevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentRevisionImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentRevision()
	 * @generated
	 */
	int CONTENT_REVISION = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__CONTENT_REVISION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Committed By Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION__COMMITTED_BY_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentRevisionItemImpl <em>Revision Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentRevisionItemImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentRevisionItem()
	 * @generated
	 */
	int CONTENT_REVISION_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__CONTENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Item Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__ITEM_CONTENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Old Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Revision Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REVISION_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentRoleImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentRole()
	 * @generated
	 */
	int CONTENT_ROLE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchConstraintImpl <em>Search Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentSearchConstraintImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentSearchConstraint()
	 * @generated
	 */
	int CONTENT_SEARCH_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Search Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Any Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Any Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__INFO_STRING = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is And</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__IS_AND = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__LOW_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Remove Stems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Search Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_CONSTRAINT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl <em>Search Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentSearchResult()
	 * @generated
	 */
	int CONTENT_SEARCH_RESULT = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Search Result Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Search Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__IS_ASCENDING = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Num Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__NUM_RESULTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__ORDER_BY_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Search Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__SEARCH_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Seconds Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__SECONDS_TOTAL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT__VISIT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Search Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SEARCH_RESULT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentTypeImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CONTENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CONTENT_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentTypeAttr()
	 * @generated
	 */
	int CONTENT_TYPE_ATTR = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__CONTENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentId()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getCharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Character Set</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getCharacterSet()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_CharacterSet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getChildBranchCount <em>Child Branch Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Branch Count</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getChildBranchCount()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ChildBranchCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getChildLeafCount <em>Child Leaf Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Leaf Count</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getChildLeafCount()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ChildLeafCount();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.Content#getContentAttributes <em>Content Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentAttributes()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ContentAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.Content#getContentKeywords <em>Content Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Keywords</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentKeywords()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ContentKeywords();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.Content#getContentMetaDatas <em>Content Meta Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Meta Datas</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentMetaDatas()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ContentMetaDatas();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getContentName <em>Content Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentName()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.Content#getContentPurposes <em>Content Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Purposes</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentPurposes()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ContentPurposes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.Content#getContentRevisions <em>Content Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Revisions</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentRevisions()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ContentRevisions();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getContentType()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ContentType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getCreatedByUserLogin()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getCreatedDate()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getCustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getCustomMethod()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_CustomMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getDataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getDataResource()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_DataResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getDataSource()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_DataSource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getDecoratorContent <em>Decorator Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decorator Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getDecoratorContent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_DecoratorContent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getDescription()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.Content#getFromCommEventContentAssocs <em>From Comm Event Content Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Comm Event Content Assocs</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getFromCommEventContentAssocs()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_FromCommEventContentAssocs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getInstanceOfContent <em>Instance Of Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getInstanceOfContent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_InstanceOfContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getLastModifiedByUserLogin()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getLastModifiedDate()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getLocaleString <em>Locale String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale String</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getLocaleString()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_LocaleString();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mime Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getMimeType()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_MimeType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getOwnerContent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_OwnerContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getPrivilegeEnum <em>Privilege Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Privilege Enum</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getPrivilegeEnum()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_PrivilegeEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.Content#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getServiceName()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getStatus()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.Content#getTemplateDataResource <em>Template Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.Content#getTemplateDataResource()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_TemplateDataResource();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentApproval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval
	 * @generated
	 */
	EClass getContentApproval();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContentApprovalId <em>Content Approval Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Approval Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getContentApprovalId()
	 * @see #getContentApproval()
	 * @generated
	 */
	EAttribute getContentApproval_ContentApprovalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalDate <em>Approval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalDate()
	 * @see #getContentApproval()
	 * @generated
	 */
	EAttribute getContentApproval_ApprovalDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalStatus <em>Approval Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approval Status</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalStatus()
	 * @see #getContentApproval()
	 * @generated
	 */
	EReference getContentApproval_ApprovalStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getComments()
	 * @see #getContentApproval()
	 * @generated
	 */
	EAttribute getContentApproval_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getContent()
	 * @see #getContentApproval()
	 * @generated
	 */
	EReference getContentApproval_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContentRevisionSeqId <em>Content Revision Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Revision Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getContentRevisionSeqId()
	 * @see #getContentApproval()
	 * @generated
	 */
	EAttribute getContentApproval_ContentRevisionSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getParty()
	 * @see #getContentApproval()
	 * @generated
	 */
	EReference getContentApproval_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getRoleType()
	 * @see #getContentApproval()
	 * @generated
	 */
	EReference getContentApproval_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentApproval#getSequenceNum()
	 * @see #getContentApproval()
	 * @generated
	 */
	EAttribute getContentApproval_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc
	 * @generated
	 */
	EClass getContentAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getContent()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getContentIdTo <em>Content Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id To</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getContentIdTo()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_ContentIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getContentAssocType <em>Content Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getContentAssocType()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_ContentAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getFromDate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getContentAssocPredicate <em>Content Assoc Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Assoc Predicate</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getContentAssocPredicate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_ContentAssocPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getCreatedByUserLogin()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getCreatedDate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getDataSource()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_DataSource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getLastModifiedByUserLogin()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EReference getContentAssoc_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getLastModifiedDate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getLeftCoordinate <em>Left Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Coordinate</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getLeftCoordinate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_LeftCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getMapKey()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_MapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getSequenceNum()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getThruDate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssoc#getUpperCoordinate <em>Upper Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Coordinate</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssoc#getUpperCoordinate()
	 * @see #getContentAssoc()
	 * @generated
	 */
	EAttribute getContentAssoc_UpperCoordinate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentAssocPredicate <em>Assoc Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc Predicate</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssocPredicate
	 * @generated
	 */
	EClass getContentAssocPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssocPredicate#getContentAssocPredicateId <em>Content Assoc Predicate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Assoc Predicate Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssocPredicate#getContentAssocPredicateId()
	 * @see #getContentAssocPredicate()
	 * @generated
	 */
	EAttribute getContentAssocPredicate_ContentAssocPredicateId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssocPredicate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssocPredicate#getDescription()
	 * @see #getContentAssocPredicate()
	 * @generated
	 */
	EAttribute getContentAssocPredicate_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentAssocType <em>Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssocType
	 * @generated
	 */
	EClass getContentAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssocType#getContentAssocTypeId <em>Content Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssocType#getContentAssocTypeId()
	 * @see #getContentAssocType()
	 * @generated
	 */
	EAttribute getContentAssocType_ContentAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAssocType#getDescription()
	 * @see #getContentAssocType()
	 * @generated
	 */
	EAttribute getContentAssocType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAttribute
	 * @generated
	 */
	EClass getContentAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentAttribute#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAttribute#getContent()
	 * @see #getContentAttribute()
	 * @generated
	 */
	EReference getContentAttribute_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAttribute#getAttrName()
	 * @see #getContentAttribute()
	 * @generated
	 */
	EAttribute getContentAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAttribute#getAttrDescription()
	 * @see #getContentAttribute()
	 * @generated
	 */
	EAttribute getContentAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentAttribute#getAttrValue()
	 * @see #getContentAttribute()
	 * @generated
	 */
	EAttribute getContentAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentKeyword
	 * @generated
	 */
	EClass getContentKeyword();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentKeyword#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentKeyword#getContent()
	 * @see #getContentKeyword()
	 * @generated
	 */
	EReference getContentKeyword_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentKeyword#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentKeyword#getKeyword()
	 * @see #getContentKeyword()
	 * @generated
	 */
	EAttribute getContentKeyword_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentKeyword#getRelevancyWeight <em>Relevancy Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevancy Weight</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentKeyword#getRelevancyWeight()
	 * @see #getContentKeyword()
	 * @generated
	 */
	EAttribute getContentKeyword_RelevancyWeight();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentMetaData
	 * @generated
	 */
	EClass getContentMetaData();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentMetaData#getContent()
	 * @see #getContentMetaData()
	 * @generated
	 */
	EReference getContentMetaData_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataPredicate <em>Meta Data Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Data Predicate</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataPredicate()
	 * @see #getContentMetaData()
	 * @generated
	 */
	EReference getContentMetaData_MetaDataPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentMetaData#getDataSource()
	 * @see #getContentMetaData()
	 * @generated
	 */
	EReference getContentMetaData_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataValue <em>Meta Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data Value</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataValue()
	 * @see #getContentMetaData()
	 * @generated
	 */
	EAttribute getContentMetaData_MetaDataValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentOperation
	 * @generated
	 */
	EClass getContentOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentOperation#getContentOperationId <em>Content Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Operation Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentOperation#getContentOperationId()
	 * @see #getContentOperation()
	 * @generated
	 */
	EAttribute getContentOperation_ContentOperationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentOperation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentOperation#getDescription()
	 * @see #getContentOperation()
	 * @generated
	 */
	EAttribute getContentOperation_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurpose
	 * @generated
	 */
	EClass getContentPurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurpose#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurpose#getContent()
	 * @see #getContentPurpose()
	 * @generated
	 */
	EReference getContentPurpose_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurpose#getContentPurposeType <em>Content Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurpose#getContentPurposeType()
	 * @see #getContentPurpose()
	 * @generated
	 */
	EReference getContentPurpose_ContentPurposeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentPurpose#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurpose#getSequenceNum()
	 * @see #getContentPurpose()
	 * @generated
	 */
	EAttribute getContentPurpose_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation <em>Purpose Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Operation</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeOperation
	 * @generated
	 */
	EClass getContentPurposeOperation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentPurposeType <em>Content Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentPurposeType()
	 * @see #getContentPurposeOperation()
	 * @generated
	 */
	EReference getContentPurposeOperation_ContentPurposeType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentOperation <em>Content Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Operation</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentOperation()
	 * @see #getContentPurposeOperation()
	 * @generated
	 */
	EReference getContentPurposeOperation_ContentOperation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getRoleType()
	 * @see #getContentPurposeOperation()
	 * @generated
	 */
	EReference getContentPurposeOperation_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getStatus()
	 * @see #getContentPurposeOperation()
	 * @generated
	 */
	EReference getContentPurposeOperation_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getPrivilegeEnum <em>Privilege Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Privilege Enum</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getPrivilegeEnum()
	 * @see #getContentPurposeOperation()
	 * @generated
	 */
	EReference getContentPurposeOperation_PrivilegeEnum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeType <em>Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeType
	 * @generated
	 */
	EClass getContentPurposeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeType#getContentPurposeTypeId <em>Content Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeType#getContentPurposeTypeId()
	 * @see #getContentPurposeType()
	 * @generated
	 */
	EAttribute getContentPurposeType_ContentPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPurposeType#getDescription()
	 * @see #getContentPurposeType()
	 * @generated
	 */
	EAttribute getContentPurposeType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevision
	 * @generated
	 */
	EClass getContentRevision();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevision#getContent()
	 * @see #getContentRevision()
	 * @generated
	 */
	EReference getContentRevision_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getContentRevisionSeqId <em>Content Revision Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Revision Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevision#getContentRevisionSeqId()
	 * @see #getContentRevision()
	 * @generated
	 */
	EAttribute getContentRevision_ContentRevisionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevision#getComments()
	 * @see #getContentRevision()
	 * @generated
	 */
	EAttribute getContentRevision_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getCommittedByParty <em>Committed By Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Committed By Party</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevision#getCommittedByParty()
	 * @see #getContentRevision()
	 * @generated
	 */
	EReference getContentRevision_CommittedByParty();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentRevisionItem <em>Revision Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision Item</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevisionItem
	 * @generated
	 */
	EClass getContentRevisionItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getContentId()
	 * @see #getContentRevisionItem()
	 * @generated
	 */
	EAttribute getContentRevisionItem_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getContentRevisionSeqId <em>Content Revision Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Revision Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getContentRevisionSeqId()
	 * @see #getContentRevisionItem()
	 * @generated
	 */
	EAttribute getContentRevisionItem_ContentRevisionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getItemContentId <em>Item Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Content Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getItemContentId()
	 * @see #getContentRevisionItem()
	 * @generated
	 */
	EAttribute getContentRevisionItem_ItemContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getNewDataResource <em>New Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getNewDataResource()
	 * @see #getContentRevisionItem()
	 * @generated
	 */
	EReference getContentRevisionItem_NewDataResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getOldDataResource <em>Old Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRevisionItem#getOldDataResource()
	 * @see #getContentRevisionItem()
	 * @generated
	 */
	EReference getContentRevisionItem_OldDataResource();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRole
	 * @generated
	 */
	EClass getContentRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentRole#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRole#getContent()
	 * @see #getContentRole()
	 * @generated
	 */
	EReference getContentRole_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRole#getParty()
	 * @see #getContentRole()
	 * @generated
	 */
	EReference getContentRole_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRole#getRoleTypeId()
	 * @see #getContentRole()
	 * @generated
	 */
	EAttribute getContentRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRole#getFromDate()
	 * @see #getContentRole()
	 * @generated
	 */
	EAttribute getContentRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentRole#getThruDate()
	 * @see #getContentRole()
	 * @generated
	 */
	EAttribute getContentRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint <em>Search Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Constraint</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint
	 * @generated
	 */
	EClass getContentSearchConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getContentSearchResult <em>Content Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Search Result</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getContentSearchResult()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EReference getContentSearchConstraint_ContentSearchResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintSeqId()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_ConstraintSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnyPrefix <em>Any Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnyPrefix()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_AnyPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnySuffix <em>Any Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Suffix</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnySuffix()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_AnySuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintName()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getHighValue <em>High Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Value</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getHighValue()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_HighValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIncludeSubCategories <em>Include Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Sub Categories</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIncludeSubCategories()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_IncludeSubCategories();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getInfoString <em>Info String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info String</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getInfoString()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_InfoString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIsAnd <em>Is And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is And</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIsAnd()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_IsAnd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getLowValue <em>Low Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Value</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getLowValue()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_LowValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getRemoveStems <em>Remove Stems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Stems</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getRemoveStems()
	 * @see #getContentSearchConstraint()
	 * @generated
	 */
	EAttribute getContentSearchConstraint_RemoveStems();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult <em>Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Result</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult
	 * @generated
	 */
	EClass getContentSearchResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getContentSearchResultId <em>Content Search Result Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Search Result Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getContentSearchResultId()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_ContentSearchResultId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getContentSearchConstraints <em>Content Search Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Search Constraints</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getContentSearchConstraints()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EReference getContentSearchResult_ContentSearchConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getIsAscending <em>Is Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ascending</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getIsAscending()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_IsAscending();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getNumResults <em>Num Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Results</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getNumResults()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_NumResults();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getOrderByName <em>Order By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getOrderByName()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_OrderByName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getSearchDate <em>Search Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getSearchDate()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_SearchDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getSecondsTotal <em>Seconds Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Total</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getSecondsTotal()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_SecondsTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentSearchResult#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentSearchResult#getVisitId()
	 * @see #getContentSearchResult()
	 * @generated
	 */
	EAttribute getContentSearchResult_VisitId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentType#getContentTypeId <em>Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentType#getContentTypeId()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_ContentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.content.ContentType#getContentTypeAttrs <em>Content Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentType#getContentTypeAttrs()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_ContentTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentType#getDescription()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentType#isHasTable()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentType#getParentType()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.content.ContentTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentTypeAttr
	 * @generated
	 */
	EClass getContentTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.content.ContentTypeAttr#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentTypeAttr#getContentType()
	 * @see #getContentTypeAttr()
	 * @generated
	 */
	EReference getContentTypeAttr_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentTypeAttr#getAttrName()
	 * @see #getContentTypeAttr()
	 * @generated
	 */
	EAttribute getContentTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.content.ContentTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.content.ContentTypeAttr#getDescription()
	 * @see #getContentTypeAttr()
	 * @generated
	 */
	EAttribute getContentTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentFactory getContentFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_ID = eINSTANCE.getContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Character Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CHARACTER_SET = eINSTANCE.getContent_CharacterSet();

		/**
		 * The meta object literal for the '<em><b>Child Branch Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CHILD_BRANCH_COUNT = eINSTANCE.getContent_ChildBranchCount();

		/**
		 * The meta object literal for the '<em><b>Child Leaf Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CHILD_LEAF_COUNT = eINSTANCE.getContent_ChildLeafCount();

		/**
		 * The meta object literal for the '<em><b>Content Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT_ATTRIBUTES = eINSTANCE.getContent_ContentAttributes();

		/**
		 * The meta object literal for the '<em><b>Content Keywords</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT_KEYWORDS = eINSTANCE.getContent_ContentKeywords();

		/**
		 * The meta object literal for the '<em><b>Content Meta Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT_META_DATAS = eINSTANCE.getContent_ContentMetaDatas();

		/**
		 * The meta object literal for the '<em><b>Content Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_NAME = eINSTANCE.getContent_ContentName();

		/**
		 * The meta object literal for the '<em><b>Content Purposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT_PURPOSES = eINSTANCE.getContent_ContentPurposes();

		/**
		 * The meta object literal for the '<em><b>Content Revisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT_REVISIONS = eINSTANCE.getContent_ContentRevisions();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT_TYPE = eINSTANCE.getContent_ContentType();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CREATED_BY_USER_LOGIN = eINSTANCE.getContent_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CREATED_DATE = eINSTANCE.getContent_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Custom Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CUSTOM_METHOD = eINSTANCE.getContent_CustomMethod();

		/**
		 * The meta object literal for the '<em><b>Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DATA_RESOURCE = eINSTANCE.getContent_DataResource();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DATA_SOURCE = eINSTANCE.getContent_DataSource();

		/**
		 * The meta object literal for the '<em><b>Decorator Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DECORATOR_CONTENT = eINSTANCE.getContent_DecoratorContent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__DESCRIPTION = eINSTANCE.getContent_Description();

		/**
		 * The meta object literal for the '<em><b>From Comm Event Content Assocs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__FROM_COMM_EVENT_CONTENT_ASSOCS = eINSTANCE.getContent_FromCommEventContentAssocs();

		/**
		 * The meta object literal for the '<em><b>Instance Of Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__INSTANCE_OF_CONTENT = eINSTANCE.getContent_InstanceOfContent();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getContent_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__LAST_MODIFIED_DATE = eINSTANCE.getContent_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Locale String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__LOCALE_STRING = eINSTANCE.getContent_LocaleString();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__MIME_TYPE = eINSTANCE.getContent_MimeType();

		/**
		 * The meta object literal for the '<em><b>Owner Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__OWNER_CONTENT = eINSTANCE.getContent_OwnerContent();

		/**
		 * The meta object literal for the '<em><b>Privilege Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__PRIVILEGE_ENUM = eINSTANCE.getContent_PrivilegeEnum();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__SERVICE_NAME = eINSTANCE.getContent_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__STATUS = eINSTANCE.getContent_Status();

		/**
		 * The meta object literal for the '<em><b>Template Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__TEMPLATE_DATA_RESOURCE = eINSTANCE.getContent_TemplateDataResource();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentApprovalImpl <em>Approval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentApprovalImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentApproval()
		 * @generated
		 */
		EClass CONTENT_APPROVAL = eINSTANCE.getContentApproval();

		/**
		 * The meta object literal for the '<em><b>Content Approval Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_APPROVAL__CONTENT_APPROVAL_ID = eINSTANCE.getContentApproval_ContentApprovalId();

		/**
		 * The meta object literal for the '<em><b>Approval Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_APPROVAL__APPROVAL_DATE = eINSTANCE.getContentApproval_ApprovalDate();

		/**
		 * The meta object literal for the '<em><b>Approval Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_APPROVAL__APPROVAL_STATUS = eINSTANCE.getContentApproval_ApprovalStatus();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_APPROVAL__COMMENTS = eINSTANCE.getContentApproval_Comments();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_APPROVAL__CONTENT = eINSTANCE.getContentApproval_Content();

		/**
		 * The meta object literal for the '<em><b>Content Revision Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID = eINSTANCE.getContentApproval_ContentRevisionSeqId();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_APPROVAL__PARTY = eINSTANCE.getContentApproval_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_APPROVAL__ROLE_TYPE = eINSTANCE.getContentApproval_RoleType();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_APPROVAL__SEQUENCE_NUM = eINSTANCE.getContentApproval_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAssocImpl <em>Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAssocImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAssoc()
		 * @generated
		 */
		EClass CONTENT_ASSOC = eINSTANCE.getContentAssoc();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__CONTENT = eINSTANCE.getContentAssoc_Content();

		/**
		 * The meta object literal for the '<em><b>Content Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__CONTENT_ID_TO = eINSTANCE.getContentAssoc_ContentIdTo();

		/**
		 * The meta object literal for the '<em><b>Content Assoc Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__CONTENT_ASSOC_TYPE = eINSTANCE.getContentAssoc_ContentAssocType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__FROM_DATE = eINSTANCE.getContentAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Content Assoc Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE = eINSTANCE.getContentAssoc_ContentAssocPredicate();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__CREATED_BY_USER_LOGIN = eINSTANCE.getContentAssoc_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__CREATED_DATE = eINSTANCE.getContentAssoc_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__DATA_SOURCE = eINSTANCE.getContentAssoc_DataSource();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getContentAssoc_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__LAST_MODIFIED_DATE = eINSTANCE.getContentAssoc_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Left Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__LEFT_COORDINATE = eINSTANCE.getContentAssoc_LeftCoordinate();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__MAP_KEY = eINSTANCE.getContentAssoc_MapKey();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__SEQUENCE_NUM = eINSTANCE.getContentAssoc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__THRU_DATE = eINSTANCE.getContentAssoc_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Upper Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC__UPPER_COORDINATE = eINSTANCE.getContentAssoc_UpperCoordinate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAssocPredicateImpl <em>Assoc Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAssocPredicateImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAssocPredicate()
		 * @generated
		 */
		EClass CONTENT_ASSOC_PREDICATE = eINSTANCE.getContentAssocPredicate();

		/**
		 * The meta object literal for the '<em><b>Content Assoc Predicate Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC_PREDICATE__CONTENT_ASSOC_PREDICATE_ID = eINSTANCE.getContentAssocPredicate_ContentAssocPredicateId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC_PREDICATE__DESCRIPTION = eINSTANCE.getContentAssocPredicate_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAssocTypeImpl <em>Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAssocTypeImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAssocType()
		 * @generated
		 */
		EClass CONTENT_ASSOC_TYPE = eINSTANCE.getContentAssocType();

		/**
		 * The meta object literal for the '<em><b>Content Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC_TYPE__CONTENT_ASSOC_TYPE_ID = eINSTANCE.getContentAssocType_ContentAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getContentAssocType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentAttributeImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentAttribute()
		 * @generated
		 */
		EClass CONTENT_ATTRIBUTE = eINSTANCE.getContentAttribute();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ATTRIBUTE__CONTENT = eINSTANCE.getContentAttribute_Content();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getContentAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getContentAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getContentAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentKeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentKeywordImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentKeyword()
		 * @generated
		 */
		EClass CONTENT_KEYWORD = eINSTANCE.getContentKeyword();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_KEYWORD__CONTENT = eINSTANCE.getContentKeyword_Content();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_KEYWORD__KEYWORD = eINSTANCE.getContentKeyword_Keyword();

		/**
		 * The meta object literal for the '<em><b>Relevancy Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_KEYWORD__RELEVANCY_WEIGHT = eINSTANCE.getContentKeyword_RelevancyWeight();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentMetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentMetaDataImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentMetaData()
		 * @generated
		 */
		EClass CONTENT_META_DATA = eINSTANCE.getContentMetaData();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_META_DATA__CONTENT = eINSTANCE.getContentMetaData_Content();

		/**
		 * The meta object literal for the '<em><b>Meta Data Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_META_DATA__META_DATA_PREDICATE = eINSTANCE.getContentMetaData_MetaDataPredicate();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_META_DATA__DATA_SOURCE = eINSTANCE.getContentMetaData_DataSource();

		/**
		 * The meta object literal for the '<em><b>Meta Data Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_META_DATA__META_DATA_VALUE = eINSTANCE.getContentMetaData_MetaDataValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentOperationImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentOperation()
		 * @generated
		 */
		EClass CONTENT_OPERATION = eINSTANCE.getContentOperation();

		/**
		 * The meta object literal for the '<em><b>Content Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_OPERATION__CONTENT_OPERATION_ID = eINSTANCE.getContentOperation_ContentOperationId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_OPERATION__DESCRIPTION = eINSTANCE.getContentOperation_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentPurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPurposeImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentPurpose()
		 * @generated
		 */
		EClass CONTENT_PURPOSE = eINSTANCE.getContentPurpose();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE__CONTENT = eINSTANCE.getContentPurpose_Content();

		/**
		 * The meta object literal for the '<em><b>Content Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE = eINSTANCE.getContentPurpose_ContentPurposeType();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_PURPOSE__SEQUENCE_NUM = eINSTANCE.getContentPurpose_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentPurposeOperationImpl <em>Purpose Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPurposeOperationImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentPurposeOperation()
		 * @generated
		 */
		EClass CONTENT_PURPOSE_OPERATION = eINSTANCE.getContentPurposeOperation();

		/**
		 * The meta object literal for the '<em><b>Content Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE = eINSTANCE.getContentPurposeOperation_ContentPurposeType();

		/**
		 * The meta object literal for the '<em><b>Content Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION = eINSTANCE.getContentPurposeOperation_ContentOperation();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE_OPERATION__ROLE_TYPE = eINSTANCE.getContentPurposeOperation_RoleType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE_OPERATION__STATUS = eINSTANCE.getContentPurposeOperation_Status();

		/**
		 * The meta object literal for the '<em><b>Privilege Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM = eINSTANCE.getContentPurposeOperation_PrivilegeEnum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentPurposeTypeImpl <em>Purpose Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPurposeTypeImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentPurposeType()
		 * @generated
		 */
		EClass CONTENT_PURPOSE_TYPE = eINSTANCE.getContentPurposeType();

		/**
		 * The meta object literal for the '<em><b>Content Purpose Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_PURPOSE_TYPE__CONTENT_PURPOSE_TYPE_ID = eINSTANCE.getContentPurposeType_ContentPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_PURPOSE_TYPE__DESCRIPTION = eINSTANCE.getContentPurposeType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentRevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentRevisionImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentRevision()
		 * @generated
		 */
		EClass CONTENT_REVISION = eINSTANCE.getContentRevision();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REVISION__CONTENT = eINSTANCE.getContentRevision_Content();

		/**
		 * The meta object literal for the '<em><b>Content Revision Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REVISION__CONTENT_REVISION_SEQ_ID = eINSTANCE.getContentRevision_ContentRevisionSeqId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REVISION__COMMENTS = eINSTANCE.getContentRevision_Comments();

		/**
		 * The meta object literal for the '<em><b>Committed By Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REVISION__COMMITTED_BY_PARTY = eINSTANCE.getContentRevision_CommittedByParty();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentRevisionItemImpl <em>Revision Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentRevisionItemImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentRevisionItem()
		 * @generated
		 */
		EClass CONTENT_REVISION_ITEM = eINSTANCE.getContentRevisionItem();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REVISION_ITEM__CONTENT_ID = eINSTANCE.getContentRevisionItem_ContentId();

		/**
		 * The meta object literal for the '<em><b>Content Revision Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID = eINSTANCE.getContentRevisionItem_ContentRevisionSeqId();

		/**
		 * The meta object literal for the '<em><b>Item Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REVISION_ITEM__ITEM_CONTENT_ID = eINSTANCE.getContentRevisionItem_ItemContentId();

		/**
		 * The meta object literal for the '<em><b>New Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE = eINSTANCE.getContentRevisionItem_NewDataResource();

		/**
		 * The meta object literal for the '<em><b>Old Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE = eINSTANCE.getContentRevisionItem_OldDataResource();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentRoleImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentRole()
		 * @generated
		 */
		EClass CONTENT_ROLE = eINSTANCE.getContentRole();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ROLE__CONTENT = eINSTANCE.getContentRole_Content();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ROLE__PARTY = eINSTANCE.getContentRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ROLE__ROLE_TYPE_ID = eINSTANCE.getContentRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ROLE__FROM_DATE = eINSTANCE.getContentRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ROLE__THRU_DATE = eINSTANCE.getContentRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchConstraintImpl <em>Search Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentSearchConstraintImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentSearchConstraint()
		 * @generated
		 */
		EClass CONTENT_SEARCH_CONSTRAINT = eINSTANCE.getContentSearchConstraint();

		/**
		 * The meta object literal for the '<em><b>Content Search Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT = eINSTANCE.getContentSearchConstraint_ContentSearchResult();

		/**
		 * The meta object literal for the '<em><b>Constraint Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID = eINSTANCE.getContentSearchConstraint_ConstraintSeqId();

		/**
		 * The meta object literal for the '<em><b>Any Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX = eINSTANCE.getContentSearchConstraint_AnyPrefix();

		/**
		 * The meta object literal for the '<em><b>Any Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX = eINSTANCE.getContentSearchConstraint_AnySuffix();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME = eINSTANCE.getContentSearchConstraint_ConstraintName();

		/**
		 * The meta object literal for the '<em><b>High Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE = eINSTANCE.getContentSearchConstraint_HighValue();

		/**
		 * The meta object literal for the '<em><b>Include Sub Categories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES = eINSTANCE.getContentSearchConstraint_IncludeSubCategories();

		/**
		 * The meta object literal for the '<em><b>Info String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__INFO_STRING = eINSTANCE.getContentSearchConstraint_InfoString();

		/**
		 * The meta object literal for the '<em><b>Is And</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__IS_AND = eINSTANCE.getContentSearchConstraint_IsAnd();

		/**
		 * The meta object literal for the '<em><b>Low Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__LOW_VALUE = eINSTANCE.getContentSearchConstraint_LowValue();

		/**
		 * The meta object literal for the '<em><b>Remove Stems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS = eINSTANCE.getContentSearchConstraint_RemoveStems();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl <em>Search Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentSearchResult()
		 * @generated
		 */
		EClass CONTENT_SEARCH_RESULT = eINSTANCE.getContentSearchResult();

		/**
		 * The meta object literal for the '<em><b>Content Search Result Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID = eINSTANCE.getContentSearchResult_ContentSearchResultId();

		/**
		 * The meta object literal for the '<em><b>Content Search Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS = eINSTANCE.getContentSearchResult_ContentSearchConstraints();

		/**
		 * The meta object literal for the '<em><b>Is Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__IS_ASCENDING = eINSTANCE.getContentSearchResult_IsAscending();

		/**
		 * The meta object literal for the '<em><b>Num Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__NUM_RESULTS = eINSTANCE.getContentSearchResult_NumResults();

		/**
		 * The meta object literal for the '<em><b>Order By Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__ORDER_BY_NAME = eINSTANCE.getContentSearchResult_OrderByName();

		/**
		 * The meta object literal for the '<em><b>Search Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__SEARCH_DATE = eINSTANCE.getContentSearchResult_SearchDate();

		/**
		 * The meta object literal for the '<em><b>Seconds Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__SECONDS_TOTAL = eINSTANCE.getContentSearchResult_SecondsTotal();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_SEARCH_RESULT__VISIT_ID = eINSTANCE.getContentSearchResult_VisitId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentTypeImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentType()
		 * @generated
		 */
		EClass CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em><b>Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__CONTENT_TYPE_ID = eINSTANCE.getContentType_ContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Content Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__CONTENT_TYPE_ATTRS = eINSTANCE.getContentType_ContentTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__DESCRIPTION = eINSTANCE.getContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__HAS_TABLE = eINSTANCE.getContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__PARENT_TYPE = eINSTANCE.getContentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.content.impl.ContentTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl#getContentTypeAttr()
		 * @generated
		 */
		EClass CONTENT_TYPE_ATTR = eINSTANCE.getContentTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE_ATTR__CONTENT_TYPE = eINSTANCE.getContentTypeAttr_ContentType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getContentTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getContentTypeAttr_Description();

	}

} //ContentPackage
