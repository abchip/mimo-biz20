/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.agreement;

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
 * @see org.abchip.mimo.biz.model.party.agreement.AgreementFactory
 * @model kind="package"
 * @generated
 */
public interface AgreementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agreement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/party/agreement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-agreement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreementPackage eINSTANCE = org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AddendumImpl <em>Addendum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AddendumImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAddendum()
	 * @generated
	 */
	int ADDENDUM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Addendum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__ADDENDUM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Addendum Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__ADDENDUM_CREATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Addendum Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__ADDENDUM_EFFECTIVE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Addendum Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__ADDENDUM_TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Addendum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDENDUM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementImpl <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AGREEMENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AGREEMENT_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AGREEMENT_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Agreement Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AGREEMENT_ITEMS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Agreement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AGREEMENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__PARTY_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__PARTY_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Text Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__TEXT_DATA = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementAttributeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementAttribute()
	 * @generated
	 */
	int AGREEMENT_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementContent()
	 * @generated
	 */
	int AGREEMENT_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__AGREEMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__AGREEMENT_CONTENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentTypeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementContentType()
	 * @generated
	 */
	int AGREEMENT_CONTENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__AGREEMENT_CONTENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_CONTENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementEmploymentApplImpl <em>Employment Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementEmploymentApplImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementEmploymentAppl()
	 * @generated
	 */
	int AGREEMENT_EMPLOYMENT_APPL = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__PARTY_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__PARTY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Agreement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Employment Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_EMPLOYMENT_APPL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementFacilityApplImpl <em>Facility Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementFacilityApplImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementFacilityAppl()
	 * @generated
	 */
	int AGREEMENT_FACILITY_APPL = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__FACILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Facility Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FACILITY_APPL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementGeographicalApplicImpl <em>Geographical Applic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementGeographicalApplicImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementGeographicalApplic()
	 * @generated
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__GEO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Geographical Applic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_GEOGRAPHICAL_APPLIC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItem()
	 * @generated
	 */
	int AGREEMENT_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__AGREEMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__AGREEMENT_IMAGE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Agreement Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Agreement Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__AGREEMENT_TEXT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM__CURRENCY_UOM_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemAttributeImpl <em>Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemAttributeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItemAttribute()
	 * @generated
	 */
	int AGREEMENT_ITEM_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__AGREEMENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItemType()
	 * @generated
	 */
	int AGREEMENT_ITEM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Item Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl <em>Item Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItemTypeAttr()
	 * @generated
	 */
	int AGREEMENT_ITEM_TYPE_ATTR = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__AGREEMENT_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ITEM_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementPartyApplicImpl <em>Party Applic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPartyApplicImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementPartyApplic()
	 * @generated
	 */
	int AGREEMENT_PARTY_APPLIC = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Party Applic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PARTY_APPLIC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementProductApplImpl <em>Product Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementProductApplImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementProductAppl()
	 * @generated
	 */
	int AGREEMENT_PRODUCT_APPL = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL__PRICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PRODUCT_APPL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementPromoApplImpl <em>Promo Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPromoApplImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementPromoAppl()
	 * @generated
	 */
	int AGREEMENT_PROMO_APPL = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Promo Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_PROMO_APPL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementRoleImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementRole()
	 * @generated
	 */
	int AGREEMENT_ROLE = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementTerm()
	 * @generated
	 */
	int AGREEMENT_TERM = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__AGREEMENT_TERM_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__AGREEMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Agreement Term Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoice Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__INVOICE_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__MAX_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__MIN_QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__TERM_DAYS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__TERM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__TERM_VALUE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__TEXT_VALUE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermAttributeImpl <em>Term Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermAttributeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementTermAttribute()
	 * @generated
	 */
	int AGREEMENT_TERM_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__AGREEMENT_TERM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Term Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementType()
	 * @generated
	 */
	int AGREEMENT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__AGREEMENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementTypeAttr()
	 * @generated
	 */
	int AGREEMENT_TYPE_ATTR = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__AGREEMENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementWorkEffortApplicImpl <em>Work Effort Applic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementWorkEffortApplicImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementWorkEffortApplic()
	 * @generated
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__AGREEMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC__AGREEMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Work Effort Applic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_WORK_EFFORT_APPLIC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.TermTypeImpl <em>Term Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.TermTypeImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getTermType()
	 * @generated
	 */
	int TERM_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__TERM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Term Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__TERM_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Term Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.TermTypeAttrImpl <em>Term Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.TermTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getTermTypeAttr()
	 * @generated
	 */
	int TERM_TYPE_ATTR = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__TERM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Term Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.Addendum <em>Addendum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addendum</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum
	 * @generated
	 */
	EClass getAddendum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumId <em>Addendum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addendum Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumId()
	 * @see #getAddendum()
	 * @generated
	 */
	EAttribute getAddendum_AddendumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumCreationDate <em>Addendum Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addendum Creation Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumCreationDate()
	 * @see #getAddendum()
	 * @generated
	 */
	EAttribute getAddendum_AddendumCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumEffectiveDate <em>Addendum Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addendum Effective Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumEffectiveDate()
	 * @see #getAddendum()
	 * @generated
	 */
	EAttribute getAddendum_AddendumEffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumText <em>Addendum Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addendum Text</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum#getAddendumText()
	 * @see #getAddendum()
	 * @generated
	 */
	EAttribute getAddendum_AddendumText();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Addendum#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum#getAgreement()
	 * @see #getAddendum()
	 * @generated
	 */
	EReference getAddendum_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Addendum#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Addendum#getAgreementItemSeqId()
	 * @see #getAddendum()
	 * @generated
	 */
	EAttribute getAddendum_AgreementItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementId()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_AgreementId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementAttributes <em>Agreement Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agreement Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementAttributes()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_AgreementAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementDate <em>Agreement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementDate()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_AgreementDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementItems <em>Agreement Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agreement Items</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementItems()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_AgreementItems();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementType <em>Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getAgreementType()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_AgreementType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getDescription()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getFromDate()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getPartyIdFrom()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getPartyIdTo()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getProduct()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getRoleTypeIdFrom()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getRoleTypeIdTo()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_RoleTypeIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getTextData <em>Text Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Data</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getTextData()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_TextData();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.Agreement#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.Agreement#getThruDate()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementAttribute
	 * @generated
	 */
	EClass getAgreementAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAgreement()
	 * @see #getAgreementAttribute()
	 * @generated
	 */
	EReference getAgreementAttribute_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAttrName()
	 * @see #getAgreementAttribute()
	 * @generated
	 */
	EAttribute getAgreementAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAttrDescription()
	 * @see #getAgreementAttribute()
	 * @generated
	 */
	EAttribute getAgreementAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementAttribute#getAttrValue()
	 * @see #getAgreementAttribute()
	 * @generated
	 */
	EAttribute getAgreementAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent
	 * @generated
	 */
	EClass getAgreementContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreement()
	 * @see #getAgreementContent()
	 * @generated
	 */
	EReference getAgreementContent_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent#getContent()
	 * @see #getAgreementContent()
	 * @generated
	 */
	EReference getAgreementContent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementContentType <em>Agreement Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementContentType()
	 * @see #getAgreementContent()
	 * @generated
	 */
	EReference getAgreementContent_AgreementContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementItemSeqId()
	 * @see #getAgreementContent()
	 * @generated
	 */
	EAttribute getAgreementContent_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent#getFromDate()
	 * @see #getAgreementContent()
	 * @generated
	 */
	EAttribute getAgreementContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContent#getThruDate()
	 * @see #getAgreementContent()
	 * @generated
	 */
	EAttribute getAgreementContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContentType
	 * @generated
	 */
	EClass getAgreementContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getAgreementContentTypeId <em>Agreement Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getAgreementContentTypeId()
	 * @see #getAgreementContentType()
	 * @generated
	 */
	EAttribute getAgreementContentType_AgreementContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getDescription()
	 * @see #getAgreementContentType()
	 * @generated
	 */
	EAttribute getAgreementContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getHasTable()
	 * @see #getAgreementContentType()
	 * @generated
	 */
	EAttribute getAgreementContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementContentType#getParentType()
	 * @see #getAgreementContentType()
	 * @generated
	 */
	EReference getAgreementContentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl <em>Employment Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employment Appl</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl
	 * @generated
	 */
	EClass getAgreementEmploymentAppl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getAgreementId()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_AgreementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getAgreementItemSeqId()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getPartyIdTo()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getPartyIdFrom()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_PartyIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getRoleTypeIdTo()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_RoleTypeIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getRoleTypeIdFrom()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getFromDate()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getAgreementDate <em>Agreement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getAgreementDate()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_AgreementDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl#getThruDate()
	 * @see #getAgreementEmploymentAppl()
	 * @generated
	 */
	EAttribute getAgreementEmploymentAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl <em>Facility Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility Appl</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl
	 * @generated
	 */
	EClass getAgreementFacilityAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl#getAgreement()
	 * @see #getAgreementFacilityAppl()
	 * @generated
	 */
	EReference getAgreementFacilityAppl_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl#getFacility()
	 * @see #getAgreementFacilityAppl()
	 * @generated
	 */
	EReference getAgreementFacilityAppl_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl#getAgreementItemSeqId()
	 * @see #getAgreementFacilityAppl()
	 * @generated
	 */
	EAttribute getAgreementFacilityAppl_AgreementItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic <em>Geographical Applic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Applic</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic
	 * @generated
	 */
	EClass getAgreementGeographicalApplic();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic#getAgreement()
	 * @see #getAgreementGeographicalApplic()
	 * @generated
	 */
	EReference getAgreementGeographicalApplic_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic#getGeo()
	 * @see #getAgreementGeographicalApplic()
	 * @generated
	 */
	EReference getAgreementGeographicalApplic_Geo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic#getAgreementItemSeqId()
	 * @see #getAgreementGeographicalApplic()
	 * @generated
	 */
	EAttribute getAgreementGeographicalApplic_AgreementItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem
	 * @generated
	 */
	EClass getAgreementItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreement()
	 * @see #getAgreementItem()
	 * @generated
	 */
	EReference getAgreementItem_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementItemSeqId()
	 * @see #getAgreementItem()
	 * @generated
	 */
	EAttribute getAgreementItem_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementImage <em>Agreement Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Image</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementImage()
	 * @see #getAgreementItem()
	 * @generated
	 */
	EAttribute getAgreementItem_AgreementImage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementItemType <em>Agreement Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementItemType()
	 * @see #getAgreementItem()
	 * @generated
	 */
	EReference getAgreementItem_AgreementItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementText <em>Agreement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Text</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem#getAgreementText()
	 * @see #getAgreementItem()
	 * @generated
	 */
	EAttribute getAgreementItem_AgreementText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItem#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItem#getCurrencyUomId()
	 * @see #getAgreementItem()
	 * @generated
	 */
	EAttribute getAgreementItem_CurrencyUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute <em>Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute
	 * @generated
	 */
	EClass getAgreementItemAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAgreementId()
	 * @see #getAgreementItemAttribute()
	 * @generated
	 */
	EAttribute getAgreementItemAttribute_AgreementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAgreementItemSeqId()
	 * @see #getAgreementItemAttribute()
	 * @generated
	 */
	EAttribute getAgreementItemAttribute_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAttrName()
	 * @see #getAgreementItemAttribute()
	 * @generated
	 */
	EAttribute getAgreementItemAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAttrDescription()
	 * @see #getAgreementItemAttribute()
	 * @generated
	 */
	EAttribute getAgreementItemAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute#getAttrValue()
	 * @see #getAgreementItemAttribute()
	 * @generated
	 */
	EAttribute getAgreementItemAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemType
	 * @generated
	 */
	EClass getAgreementItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getAgreementItemTypeId <em>Agreement Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getAgreementItemTypeId()
	 * @see #getAgreementItemType()
	 * @generated
	 */
	EAttribute getAgreementItemType_AgreementItemTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getAgreementItemTypeAttrs <em>Agreement Item Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agreement Item Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getAgreementItemTypeAttrs()
	 * @see #getAgreementItemType()
	 * @generated
	 */
	EReference getAgreementItemType_AgreementItemTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getDescription()
	 * @see #getAgreementItemType()
	 * @generated
	 */
	EAttribute getAgreementItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getHasTable()
	 * @see #getAgreementItemType()
	 * @generated
	 */
	EAttribute getAgreementItemType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemType#getParentType()
	 * @see #getAgreementItemType()
	 * @generated
	 */
	EReference getAgreementItemType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr <em>Item Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr
	 * @generated
	 */
	EClass getAgreementItemTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr#getAgreementItemType <em>Agreement Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr#getAgreementItemType()
	 * @see #getAgreementItemTypeAttr()
	 * @generated
	 */
	EReference getAgreementItemTypeAttr_AgreementItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr#getAttrName()
	 * @see #getAgreementItemTypeAttr()
	 * @generated
	 */
	EAttribute getAgreementItemTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr#getDescription()
	 * @see #getAgreementItemTypeAttr()
	 * @generated
	 */
	EAttribute getAgreementItemTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic <em>Party Applic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Applic</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic
	 * @generated
	 */
	EClass getAgreementPartyApplic();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic#getAgreement()
	 * @see #getAgreementPartyApplic()
	 * @generated
	 */
	EReference getAgreementPartyApplic_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic#getParty()
	 * @see #getAgreementPartyApplic()
	 * @generated
	 */
	EReference getAgreementPartyApplic_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic#getAgreementItemSeqId()
	 * @see #getAgreementPartyApplic()
	 * @generated
	 */
	EAttribute getAgreementPartyApplic_AgreementItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl <em>Product Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Appl</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl
	 * @generated
	 */
	EClass getAgreementProductAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getAgreement()
	 * @see #getAgreementProductAppl()
	 * @generated
	 */
	EReference getAgreementProductAppl_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getProduct()
	 * @see #getAgreementProductAppl()
	 * @generated
	 */
	EReference getAgreementProductAppl_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getAgreementItemSeqId()
	 * @see #getAgreementProductAppl()
	 * @generated
	 */
	EAttribute getAgreementProductAppl_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl#getPrice()
	 * @see #getAgreementProductAppl()
	 * @generated
	 */
	EAttribute getAgreementProductAppl_Price();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl <em>Promo Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promo Appl</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl
	 * @generated
	 */
	EClass getAgreementPromoAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getProductPromo()
	 * @see #getAgreementPromoAppl()
	 * @generated
	 */
	EReference getAgreementPromoAppl_ProductPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getAgreement()
	 * @see #getAgreementPromoAppl()
	 * @generated
	 */
	EReference getAgreementPromoAppl_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getAgreementItemSeqId()
	 * @see #getAgreementPromoAppl()
	 * @generated
	 */
	EAttribute getAgreementPromoAppl_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getFromDate()
	 * @see #getAgreementPromoAppl()
	 * @generated
	 */
	EAttribute getAgreementPromoAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getSequenceNum()
	 * @see #getAgreementPromoAppl()
	 * @generated
	 */
	EAttribute getAgreementPromoAppl_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl#getThruDate()
	 * @see #getAgreementPromoAppl()
	 * @generated
	 */
	EAttribute getAgreementPromoAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementRole
	 * @generated
	 */
	EClass getAgreementRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementRole#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementRole#getAgreement()
	 * @see #getAgreementRole()
	 * @generated
	 */
	EReference getAgreementRole_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementRole#getParty()
	 * @see #getAgreementRole()
	 * @generated
	 */
	EReference getAgreementRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementRole#getRoleType()
	 * @see #getAgreementRole()
	 * @generated
	 */
	EReference getAgreementRole_RoleType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm
	 * @generated
	 */
	EClass getAgreementTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreementTermId <em>Agreement Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Term Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreementTermId()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_AgreementTermId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreement()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreementItemSeqId()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_AgreementItemSeqId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreementTermAttributes <em>Agreement Term Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agreement Term Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getAgreementTermAttributes()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_AgreementTermAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getDescription()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getFromDate()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getInvoiceItemType <em>Invoice Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getInvoiceItemType()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_InvoiceItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getMaxQuantity <em>Max Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getMaxQuantity()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_MaxQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getMinQuantity <em>Min Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getMinQuantity()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_MinQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTermDays()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_TermDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTermType()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_TermType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTermValue()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getTextValue()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_TextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTerm#getThruDate()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EAttribute getAgreementTerm_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute <em>Term Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute
	 * @generated
	 */
	EClass getAgreementTermAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAgreementTerm <em>Agreement Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Term</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAgreementTerm()
	 * @see #getAgreementTermAttribute()
	 * @generated
	 */
	EReference getAgreementTermAttribute_AgreementTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAttrName()
	 * @see #getAgreementTermAttribute()
	 * @generated
	 */
	EAttribute getAgreementTermAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAttrDescription()
	 * @see #getAgreementTermAttribute()
	 * @generated
	 */
	EAttribute getAgreementTermAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute#getAttrValue()
	 * @see #getAgreementTermAttribute()
	 * @generated
	 */
	EAttribute getAgreementTermAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementType
	 * @generated
	 */
	EClass getAgreementType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementType#getAgreementTypeId <em>Agreement Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementType#getAgreementTypeId()
	 * @see #getAgreementType()
	 * @generated
	 */
	EAttribute getAgreementType_AgreementTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.agreement.AgreementType#getAgreementTypeAttrs <em>Agreement Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agreement Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementType#getAgreementTypeAttrs()
	 * @see #getAgreementType()
	 * @generated
	 */
	EReference getAgreementType_AgreementTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementType#getDescription()
	 * @see #getAgreementType()
	 * @generated
	 */
	EAttribute getAgreementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementType#getHasTable()
	 * @see #getAgreementType()
	 * @generated
	 */
	EAttribute getAgreementType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementType#getParentType()
	 * @see #getAgreementType()
	 * @generated
	 */
	EReference getAgreementType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr
	 * @generated
	 */
	EClass getAgreementTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAgreementType <em>Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAgreementType()
	 * @see #getAgreementTypeAttr()
	 * @generated
	 */
	EReference getAgreementTypeAttr_AgreementType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAttrName()
	 * @see #getAgreementTypeAttr()
	 * @generated
	 */
	EAttribute getAgreementTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getDescription()
	 * @see #getAgreementTypeAttr()
	 * @generated
	 */
	EAttribute getAgreementTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic <em>Work Effort Applic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort Applic</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic
	 * @generated
	 */
	EClass getAgreementWorkEffortApplic();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic#getAgreement()
	 * @see #getAgreementWorkEffortApplic()
	 * @generated
	 */
	EReference getAgreementWorkEffortApplic_Agreement();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic#getWorkEffort()
	 * @see #getAgreementWorkEffortApplic()
	 * @generated
	 */
	EReference getAgreementWorkEffortApplic_WorkEffort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic#getAgreementItemSeqId()
	 * @see #getAgreementWorkEffortApplic()
	 * @generated
	 */
	EAttribute getAgreementWorkEffortApplic_AgreementItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermType
	 * @generated
	 */
	EClass getTermType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeId()
	 * @see #getTermType()
	 * @generated
	 */
	EAttribute getTermType_TermTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermType#getDescription()
	 * @see #getTermType()
	 * @generated
	 */
	EAttribute getTermType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermType#getHasTable()
	 * @see #getTermType()
	 * @generated
	 */
	EAttribute getTermType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermType#getParentType()
	 * @see #getTermType()
	 * @generated
	 */
	EReference getTermType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeAttrs <em>Term Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeAttrs()
	 * @see #getTermType()
	 * @generated
	 */
	EReference getTermType_TermTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr <em>Term Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermTypeAttr
	 * @generated
	 */
	EClass getTermTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getTermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getTermType()
	 * @see #getTermTypeAttr()
	 * @generated
	 */
	EReference getTermTypeAttr_TermType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getAttrName()
	 * @see #getTermTypeAttr()
	 * @generated
	 */
	EAttribute getTermTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getDescription()
	 * @see #getTermTypeAttr()
	 * @generated
	 */
	EAttribute getTermTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgreementFactory getAgreementFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AddendumImpl <em>Addendum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AddendumImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAddendum()
		 * @generated
		 */
		EClass ADDENDUM = eINSTANCE.getAddendum();

		/**
		 * The meta object literal for the '<em><b>Addendum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDENDUM__ADDENDUM_ID = eINSTANCE.getAddendum_AddendumId();

		/**
		 * The meta object literal for the '<em><b>Addendum Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDENDUM__ADDENDUM_CREATION_DATE = eINSTANCE.getAddendum_AddendumCreationDate();

		/**
		 * The meta object literal for the '<em><b>Addendum Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDENDUM__ADDENDUM_EFFECTIVE_DATE = eINSTANCE.getAddendum_AddendumEffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Addendum Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDENDUM__ADDENDUM_TEXT = eINSTANCE.getAddendum_AddendumText();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDENDUM__AGREEMENT = eINSTANCE.getAddendum_Agreement();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDENDUM__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAddendum_AgreementItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementImpl <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreement()
		 * @generated
		 */
		EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__AGREEMENT_ID = eINSTANCE.getAgreement_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Agreement Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__AGREEMENT_ATTRIBUTES = eINSTANCE.getAgreement_AgreementAttributes();

		/**
		 * The meta object literal for the '<em><b>Agreement Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__AGREEMENT_DATE = eINSTANCE.getAgreement_AgreementDate();

		/**
		 * The meta object literal for the '<em><b>Agreement Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__AGREEMENT_ITEMS = eINSTANCE.getAgreement_AgreementItems();

		/**
		 * The meta object literal for the '<em><b>Agreement Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__AGREEMENT_TYPE = eINSTANCE.getAgreement_AgreementType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__DESCRIPTION = eINSTANCE.getAgreement_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__FROM_DATE = eINSTANCE.getAgreement_FromDate();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__PARTY_ID_FROM = eINSTANCE.getAgreement_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__PARTY_ID_TO = eINSTANCE.getAgreement_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__PRODUCT = eINSTANCE.getAgreement_Product();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__ROLE_TYPE_ID_FROM = eINSTANCE.getAgreement_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__ROLE_TYPE_ID_TO = eINSTANCE.getAgreement_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Text Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__TEXT_DATA = eINSTANCE.getAgreement_TextData();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__THRU_DATE = eINSTANCE.getAgreement_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementAttributeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementAttribute()
		 * @generated
		 */
		EClass AGREEMENT_ATTRIBUTE = eINSTANCE.getAgreementAttribute();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ATTRIBUTE__AGREEMENT = eINSTANCE.getAgreementAttribute_Agreement();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getAgreementAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getAgreementAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getAgreementAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementContent()
		 * @generated
		 */
		EClass AGREEMENT_CONTENT = eINSTANCE.getAgreementContent();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_CONTENT__AGREEMENT = eINSTANCE.getAgreementContent_Agreement();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_CONTENT__CONTENT = eINSTANCE.getAgreementContent_Content();

		/**
		 * The meta object literal for the '<em><b>Agreement Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_CONTENT__AGREEMENT_CONTENT_TYPE = eINSTANCE.getAgreementContent_AgreementContentType();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_CONTENT__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementContent_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_CONTENT__FROM_DATE = eINSTANCE.getAgreementContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_CONTENT__THRU_DATE = eINSTANCE.getAgreementContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementContentTypeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementContentType()
		 * @generated
		 */
		EClass AGREEMENT_CONTENT_TYPE = eINSTANCE.getAgreementContentType();

		/**
		 * The meta object literal for the '<em><b>Agreement Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_CONTENT_TYPE__AGREEMENT_CONTENT_TYPE_ID = eINSTANCE.getAgreementContentType_AgreementContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getAgreementContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getAgreementContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_CONTENT_TYPE__PARENT_TYPE = eINSTANCE.getAgreementContentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementEmploymentApplImpl <em>Employment Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementEmploymentApplImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementEmploymentAppl()
		 * @generated
		 */
		EClass AGREEMENT_EMPLOYMENT_APPL = eINSTANCE.getAgreementEmploymentAppl();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_ID = eINSTANCE.getAgreementEmploymentAppl_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementEmploymentAppl_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__PARTY_ID_TO = eINSTANCE.getAgreementEmploymentAppl_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__PARTY_ID_FROM = eINSTANCE.getAgreementEmploymentAppl_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__ROLE_TYPE_ID_TO = eINSTANCE.getAgreementEmploymentAppl_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__ROLE_TYPE_ID_FROM = eINSTANCE.getAgreementEmploymentAppl_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__FROM_DATE = eINSTANCE.getAgreementEmploymentAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Agreement Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_DATE = eINSTANCE.getAgreementEmploymentAppl_AgreementDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_EMPLOYMENT_APPL__THRU_DATE = eINSTANCE.getAgreementEmploymentAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementFacilityApplImpl <em>Facility Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementFacilityApplImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementFacilityAppl()
		 * @generated
		 */
		EClass AGREEMENT_FACILITY_APPL = eINSTANCE.getAgreementFacilityAppl();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_FACILITY_APPL__AGREEMENT = eINSTANCE.getAgreementFacilityAppl_Agreement();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_FACILITY_APPL__FACILITY = eINSTANCE.getAgreementFacilityAppl_Facility();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementFacilityAppl_AgreementItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementGeographicalApplicImpl <em>Geographical Applic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementGeographicalApplicImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementGeographicalApplic()
		 * @generated
		 */
		EClass AGREEMENT_GEOGRAPHICAL_APPLIC = eINSTANCE.getAgreementGeographicalApplic();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_GEOGRAPHICAL_APPLIC__AGREEMENT = eINSTANCE.getAgreementGeographicalApplic_Agreement();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_GEOGRAPHICAL_APPLIC__GEO = eINSTANCE.getAgreementGeographicalApplic_Geo();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_GEOGRAPHICAL_APPLIC__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementGeographicalApplic_AgreementItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItem()
		 * @generated
		 */
		EClass AGREEMENT_ITEM = eINSTANCE.getAgreementItem();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ITEM__AGREEMENT = eINSTANCE.getAgreementItem_Agreement();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementItem_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Agreement Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM__AGREEMENT_IMAGE = eINSTANCE.getAgreementItem_AgreementImage();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE = eINSTANCE.getAgreementItem_AgreementItemType();

		/**
		 * The meta object literal for the '<em><b>Agreement Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM__AGREEMENT_TEXT = eINSTANCE.getAgreementItem_AgreementText();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM__CURRENCY_UOM_ID = eINSTANCE.getAgreementItem_CurrencyUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemAttributeImpl <em>Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemAttributeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItemAttribute()
		 * @generated
		 */
		EClass AGREEMENT_ITEM_ATTRIBUTE = eINSTANCE.getAgreementItemAttribute();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_ATTRIBUTE__AGREEMENT_ID = eINSTANCE.getAgreementItemAttribute_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_ATTRIBUTE__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementItemAttribute_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getAgreementItemAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getAgreementItemAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getAgreementItemAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItemType()
		 * @generated
		 */
		EClass AGREEMENT_ITEM_TYPE = eINSTANCE.getAgreementItemType();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID = eINSTANCE.getAgreementItemType_AgreementItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS = eINSTANCE.getAgreementItemType_AgreementItemTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_TYPE__DESCRIPTION = eINSTANCE.getAgreementItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_TYPE__HAS_TABLE = eINSTANCE.getAgreementItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ITEM_TYPE__PARENT_TYPE = eINSTANCE.getAgreementItemType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl <em>Item Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementItemTypeAttr()
		 * @generated
		 */
		EClass AGREEMENT_ITEM_TYPE_ATTR = eINSTANCE.getAgreementItemTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ITEM_TYPE_ATTR__AGREEMENT_ITEM_TYPE = eINSTANCE.getAgreementItemTypeAttr_AgreementItemType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getAgreementItemTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_ITEM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getAgreementItemTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementPartyApplicImpl <em>Party Applic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPartyApplicImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementPartyApplic()
		 * @generated
		 */
		EClass AGREEMENT_PARTY_APPLIC = eINSTANCE.getAgreementPartyApplic();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_PARTY_APPLIC__AGREEMENT = eINSTANCE.getAgreementPartyApplic_Agreement();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_PARTY_APPLIC__PARTY = eINSTANCE.getAgreementPartyApplic_Party();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PARTY_APPLIC__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementPartyApplic_AgreementItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementProductApplImpl <em>Product Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementProductApplImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementProductAppl()
		 * @generated
		 */
		EClass AGREEMENT_PRODUCT_APPL = eINSTANCE.getAgreementProductAppl();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_PRODUCT_APPL__AGREEMENT = eINSTANCE.getAgreementProductAppl_Agreement();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_PRODUCT_APPL__PRODUCT = eINSTANCE.getAgreementProductAppl_Product();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PRODUCT_APPL__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementProductAppl_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PRODUCT_APPL__PRICE = eINSTANCE.getAgreementProductAppl_Price();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementPromoApplImpl <em>Promo Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPromoApplImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementPromoAppl()
		 * @generated
		 */
		EClass AGREEMENT_PROMO_APPL = eINSTANCE.getAgreementPromoAppl();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_PROMO_APPL__PRODUCT_PROMO = eINSTANCE.getAgreementPromoAppl_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_PROMO_APPL__AGREEMENT = eINSTANCE.getAgreementPromoAppl_Agreement();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PROMO_APPL__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementPromoAppl_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PROMO_APPL__FROM_DATE = eINSTANCE.getAgreementPromoAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PROMO_APPL__SEQUENCE_NUM = eINSTANCE.getAgreementPromoAppl_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_PROMO_APPL__THRU_DATE = eINSTANCE.getAgreementPromoAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementRoleImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementRole()
		 * @generated
		 */
		EClass AGREEMENT_ROLE = eINSTANCE.getAgreementRole();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ROLE__AGREEMENT = eINSTANCE.getAgreementRole_Agreement();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ROLE__PARTY = eINSTANCE.getAgreementRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_ROLE__ROLE_TYPE = eINSTANCE.getAgreementRole_RoleType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementTerm()
		 * @generated
		 */
		EClass AGREEMENT_TERM = eINSTANCE.getAgreementTerm();

		/**
		 * The meta object literal for the '<em><b>Agreement Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__AGREEMENT_TERM_ID = eINSTANCE.getAgreementTerm_AgreementTermId();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__AGREEMENT = eINSTANCE.getAgreementTerm_Agreement();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementTerm_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Agreement Term Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES = eINSTANCE.getAgreementTerm_AgreementTermAttributes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__DESCRIPTION = eINSTANCE.getAgreementTerm_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__FROM_DATE = eINSTANCE.getAgreementTerm_FromDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__INVOICE_ITEM_TYPE = eINSTANCE.getAgreementTerm_InvoiceItemType();

		/**
		 * The meta object literal for the '<em><b>Max Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__MAX_QUANTITY = eINSTANCE.getAgreementTerm_MaxQuantity();

		/**
		 * The meta object literal for the '<em><b>Min Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__MIN_QUANTITY = eINSTANCE.getAgreementTerm_MinQuantity();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__TERM_DAYS = eINSTANCE.getAgreementTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__TERM_TYPE = eINSTANCE.getAgreementTerm_TermType();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__TERM_VALUE = eINSTANCE.getAgreementTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__TEXT_VALUE = eINSTANCE.getAgreementTerm_TextValue();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__THRU_DATE = eINSTANCE.getAgreementTerm_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermAttributeImpl <em>Term Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTermAttributeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementTermAttribute()
		 * @generated
		 */
		EClass AGREEMENT_TERM_ATTRIBUTE = eINSTANCE.getAgreementTermAttribute();

		/**
		 * The meta object literal for the '<em><b>Agreement Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM_ATTRIBUTE__AGREEMENT_TERM = eINSTANCE.getAgreementTermAttribute_AgreementTerm();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getAgreementTermAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getAgreementTermAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getAgreementTermAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementType()
		 * @generated
		 */
		EClass AGREEMENT_TYPE = eINSTANCE.getAgreementType();

		/**
		 * The meta object literal for the '<em><b>Agreement Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE__AGREEMENT_TYPE_ID = eINSTANCE.getAgreementType_AgreementTypeId();

		/**
		 * The meta object literal for the '<em><b>Agreement Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS = eINSTANCE.getAgreementType_AgreementTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE__DESCRIPTION = eINSTANCE.getAgreementType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE__HAS_TABLE = eINSTANCE.getAgreementType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TYPE__PARENT_TYPE = eINSTANCE.getAgreementType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementTypeAttr()
		 * @generated
		 */
		EClass AGREEMENT_TYPE_ATTR = eINSTANCE.getAgreementTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Agreement Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TYPE_ATTR__AGREEMENT_TYPE = eINSTANCE.getAgreementTypeAttr_AgreementType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getAgreementTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getAgreementTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementWorkEffortApplicImpl <em>Work Effort Applic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementWorkEffortApplicImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getAgreementWorkEffortApplic()
		 * @generated
		 */
		EClass AGREEMENT_WORK_EFFORT_APPLIC = eINSTANCE.getAgreementWorkEffortApplic();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_WORK_EFFORT_APPLIC__AGREEMENT = eINSTANCE.getAgreementWorkEffortApplic_Agreement();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_WORK_EFFORT_APPLIC__WORK_EFFORT = eINSTANCE.getAgreementWorkEffortApplic_WorkEffort();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_WORK_EFFORT_APPLIC__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getAgreementWorkEffortApplic_AgreementItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.TermTypeImpl <em>Term Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.TermTypeImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getTermType()
		 * @generated
		 */
		EClass TERM_TYPE = eINSTANCE.getTermType();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_TYPE__TERM_TYPE_ID = eINSTANCE.getTermType_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_TYPE__DESCRIPTION = eINSTANCE.getTermType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_TYPE__HAS_TABLE = eINSTANCE.getTermType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE__PARENT_TYPE = eINSTANCE.getTermType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Term Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE__TERM_TYPE_ATTRS = eINSTANCE.getTermType_TermTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.agreement.impl.TermTypeAttrImpl <em>Term Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.TermTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl#getTermTypeAttr()
		 * @generated
		 */
		EClass TERM_TYPE_ATTR = eINSTANCE.getTermTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Term Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE_ATTR__TERM_TYPE = eINSTANCE.getTermTypeAttr_TermType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getTermTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getTermTypeAttr_Description();

	}

} //AgreementPackage
