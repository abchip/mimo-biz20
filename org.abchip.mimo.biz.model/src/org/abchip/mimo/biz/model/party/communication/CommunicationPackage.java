/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.communication;

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
 * @see org.abchip.mimo.biz.model.party.communication.CommunicationFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/party/communication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-communication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPackage eINSTANCE = org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommContentAssocTypeImpl <em>Comm Content Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommContentAssocTypeImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommContentAssocType()
	 * @generated
	 */
	int COMM_CONTENT_ASSOC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comm Content Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Comm Content Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommEventContentAssocImpl <em>Comm Event Content Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommEventContentAssocImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommEventContentAssoc()
	 * @generated
	 */
	int COMM_EVENT_CONTENT_ASSOC = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comm Content Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Comm Event Content Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEvent()
	 * @generated
	 */
	int COMMUNICATION_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bcc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__BCC_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CC_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Communication Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contact List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_LIST = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Contact Mech Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Contact Mech Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_MECH_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Contact Mech Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_MECH_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Content Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTENT_MIME_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Datetime Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__DATETIME_ENDED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Datetime Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__DATETIME_STARTED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ENTRY_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>From String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__FROM_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Header String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__HEADER_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__MESSAGE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__NOTE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Orig Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Parent Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__PARTY_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__PARTY_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__REASON_ENUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__SUBJECT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__TO_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventProductImpl <em>Event Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventProductImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventProduct()
	 * @generated
	 */
	int COMMUNICATION_EVENT_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__COMMUNICATION_EVENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Event Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPrpTypImpl <em>Event Prp Typ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPrpTypImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPrpTyp()
	 * @generated
	 */
	int COMMUNICATION_EVENT_PRP_TYP = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communication Event Prp Typ Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Event Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Event Prp Typ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPurposeImpl <em>Event Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPurposeImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPurpose()
	 * @generated
	 */
	int COMMUNICATION_EVENT_PURPOSE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Event Prp Typ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Event Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventRoleImpl <em>Event Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventRoleImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventRole()
	 * @generated
	 */
	int COMMUNICATION_EVENT_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__COMMUNICATION_EVENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Event Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventTypeImpl
	 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventType()
	 * @generated
	 */
	int COMMUNICATION_EVENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communication Event Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommContentAssocType <em>Comm Content Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Content Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommContentAssocType
	 * @generated
	 */
	EClass getCommContentAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommContentAssocType#getCommContentAssocTypeId <em>Comm Content Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Content Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommContentAssocType#getCommContentAssocTypeId()
	 * @see #getCommContentAssocType()
	 * @generated
	 */
	EAttribute getCommContentAssocType_CommContentAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommContentAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommContentAssocType#getDescription()
	 * @see #getCommContentAssocType()
	 * @generated
	 */
	EAttribute getCommContentAssocType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc <em>Comm Event Content Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Event Content Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc
	 * @generated
	 */
	EClass getCommEventContentAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getContent()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EReference getCommEventContentAssoc_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommunicationEvent()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EReference getCommEventContentAssoc_CommunicationEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getFromDate()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EAttribute getCommEventContentAssoc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommContentAssocType <em>Comm Content Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Content Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommContentAssocType()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EReference getCommEventContentAssoc_CommContentAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getSequenceNum()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EAttribute getCommEventContentAssoc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getThruDate()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EAttribute getCommEventContentAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent
	 * @generated
	 */
	EClass getCommunicationEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_CommunicationEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getBccString <em>Bcc String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bcc String</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getBccString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_BccString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCcString <em>Cc String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc String</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCcString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_CcString();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventType <em>Communication Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getCommunicationEventType()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_CommunicationEventType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactList <em>Contact List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact List</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactList()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactList();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdFrom <em>Contact Mech Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdFrom()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactMechIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdTo <em>Contact Mech Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechIdTo()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactMechIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechType <em>Contact Mech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContactMechType()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactMechType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContent()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContentMimeType <em>Content Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Mime Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getContentMimeType()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContentMimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeEnded <em>Datetime Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Ended</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeEnded()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_DatetimeEnded();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeStarted <em>Datetime Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Started</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getDatetimeStarted()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_DatetimeStarted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getEntryDate()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_EntryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getFromString <em>From String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From String</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getFromString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_FromString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getHeaderString <em>Header String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header String</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getHeaderString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_HeaderString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getMessageId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getNote()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getOrigCommEventId <em>Orig Comm Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orig Comm Event Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getOrigCommEventId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_OrigCommEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getParentCommEventId <em>Parent Comm Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Comm Event Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getParentCommEventId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_ParentCommEventId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdFrom()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getPartyIdTo()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getReasonEnum <em>Reason Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getReasonEnum()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ReasonEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdFrom()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getRoleTypeIdTo()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_RoleTypeIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getStatus()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getSubject()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getToString <em>To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To String</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEvent#getToString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_ToString();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventProduct <em>Event Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Product</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventProduct
	 * @generated
	 */
	EClass getCommunicationEventProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventProduct#getProduct()
	 * @see #getCommunicationEventProduct()
	 * @generated
	 */
	EReference getCommunicationEventProduct_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventProduct#getCommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventProduct#getCommunicationEvent()
	 * @see #getCommunicationEventProduct()
	 * @generated
	 */
	EReference getCommunicationEventProduct_CommunicationEvent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp <em>Event Prp Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Prp Typ</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp
	 * @generated
	 */
	EClass getCommunicationEventPrpTyp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Prp Typ Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EAttribute getCommunicationEventPrpTyp_CommunicationEventPrpTypId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPurposes <em>Communication Event Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Purposes</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPurposes()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EReference getCommunicationEventPrpTyp_CommunicationEventPurposes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getDescription()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EAttribute getCommunicationEventPrpTyp_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getHasTable()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EAttribute getCommunicationEventPrpTyp_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getParentType()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EReference getCommunicationEventPrpTyp_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose <em>Event Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Purpose</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose
	 * @generated
	 */
	EClass getCommunicationEventPurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose#getCommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose#getCommunicationEvent()
	 * @see #getCommunicationEventPurpose()
	 * @generated
	 */
	EReference getCommunicationEventPurpose_CommunicationEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose#getCommunicationEventPrpTyp <em>Communication Event Prp Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Prp Typ</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose#getCommunicationEventPrpTyp()
	 * @see #getCommunicationEventPurpose()
	 * @generated
	 */
	EReference getCommunicationEventPurpose_CommunicationEventPrpTyp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose#getDescription()
	 * @see #getCommunicationEventPurpose()
	 * @generated
	 */
	EAttribute getCommunicationEventPurpose_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventRole <em>Event Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Role</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventRole
	 * @generated
	 */
	EClass getCommunicationEventRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getCommunicationEvent <em>Communication Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getCommunicationEvent()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_CommunicationEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getParty()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getRoleType()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getContactMech()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_ContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventRole#getStatus()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventType
	 * @generated
	 */
	EClass getCommunicationEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getCommunicationEventTypeId <em>Communication Event Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getCommunicationEventTypeId()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EAttribute getCommunicationEventType_CommunicationEventTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getContactMechType <em>Contact Mech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getContactMechType()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EReference getCommunicationEventType_ContactMechType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getDescription()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EAttribute getCommunicationEventType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getHasTable()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EAttribute getCommunicationEventType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationEventType#getParentType()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EReference getCommunicationEventType_ParentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationFactory getCommunicationFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommContentAssocTypeImpl <em>Comm Content Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommContentAssocTypeImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommContentAssocType()
		 * @generated
		 */
		EClass COMM_CONTENT_ASSOC_TYPE = eINSTANCE.getCommContentAssocType();

		/**
		 * The meta object literal for the '<em><b>Comm Content Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID = eINSTANCE.getCommContentAssocType_CommContentAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_CONTENT_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getCommContentAssocType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommEventContentAssocImpl <em>Comm Event Content Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommEventContentAssocImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommEventContentAssoc()
		 * @generated
		 */
		EClass COMM_EVENT_CONTENT_ASSOC = eINSTANCE.getCommEventContentAssoc();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_EVENT_CONTENT_ASSOC__CONTENT = eINSTANCE.getCommEventContentAssoc_Content();

		/**
		 * The meta object literal for the '<em><b>Communication Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT = eINSTANCE.getCommEventContentAssoc_CommunicationEvent();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_EVENT_CONTENT_ASSOC__FROM_DATE = eINSTANCE.getCommEventContentAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comm Content Assoc Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE = eINSTANCE.getCommEventContentAssoc_CommContentAssocType();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM = eINSTANCE.getCommEventContentAssoc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_EVENT_CONTENT_ASSOC__THRU_DATE = eINSTANCE.getCommEventContentAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEvent()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT = eINSTANCE.getCommunicationEvent();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEvent_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Bcc String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__BCC_STRING = eINSTANCE.getCommunicationEvent_BccString();

		/**
		 * The meta object literal for the '<em><b>Cc String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__CC_STRING = eINSTANCE.getCommunicationEvent_CcString();

		/**
		 * The meta object literal for the '<em><b>Communication Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE = eINSTANCE.getCommunicationEvent_CommunicationEventType();

		/**
		 * The meta object literal for the '<em><b>Contact List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_LIST = eINSTANCE.getCommunicationEvent_ContactList();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM = eINSTANCE.getCommunicationEvent_ContactMechIdFrom();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_MECH_ID_TO = eINSTANCE.getCommunicationEvent_ContactMechIdTo();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_MECH_TYPE = eINSTANCE.getCommunicationEvent_ContactMechType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__CONTENT = eINSTANCE.getCommunicationEvent_Content();

		/**
		 * The meta object literal for the '<em><b>Content Mime Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTENT_MIME_TYPE = eINSTANCE.getCommunicationEvent_ContentMimeType();

		/**
		 * The meta object literal for the '<em><b>Datetime Ended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__DATETIME_ENDED = eINSTANCE.getCommunicationEvent_DatetimeEnded();

		/**
		 * The meta object literal for the '<em><b>Datetime Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__DATETIME_STARTED = eINSTANCE.getCommunicationEvent_DatetimeStarted();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__ENTRY_DATE = eINSTANCE.getCommunicationEvent_EntryDate();

		/**
		 * The meta object literal for the '<em><b>From String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__FROM_STRING = eINSTANCE.getCommunicationEvent_FromString();

		/**
		 * The meta object literal for the '<em><b>Header String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__HEADER_STRING = eINSTANCE.getCommunicationEvent_HeaderString();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__MESSAGE_ID = eINSTANCE.getCommunicationEvent_MessageId();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__NOTE = eINSTANCE.getCommunicationEvent_Note();

		/**
		 * The meta object literal for the '<em><b>Orig Comm Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID = eINSTANCE.getCommunicationEvent_OrigCommEventId();

		/**
		 * The meta object literal for the '<em><b>Parent Comm Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID = eINSTANCE.getCommunicationEvent_ParentCommEventId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__PARTY_ID_FROM = eINSTANCE.getCommunicationEvent_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__PARTY_ID_TO = eINSTANCE.getCommunicationEvent_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Reason Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__REASON_ENUM = eINSTANCE.getCommunicationEvent_ReasonEnum();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM = eINSTANCE.getCommunicationEvent_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__ROLE_TYPE_ID_TO = eINSTANCE.getCommunicationEvent_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__STATUS = eINSTANCE.getCommunicationEvent_Status();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__SUBJECT = eINSTANCE.getCommunicationEvent_Subject();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__TO_STRING = eINSTANCE.getCommunicationEvent_ToString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventProductImpl <em>Event Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventProductImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventProduct()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_PRODUCT = eINSTANCE.getCommunicationEventProduct();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRODUCT__PRODUCT = eINSTANCE.getCommunicationEventProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Communication Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRODUCT__COMMUNICATION_EVENT = eINSTANCE.getCommunicationEventProduct_CommunicationEvent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPrpTypImpl <em>Event Prp Typ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPrpTypImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPrpTyp()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_PRP_TYP = eINSTANCE.getCommunicationEventPrpTyp();

		/**
		 * The meta object literal for the '<em><b>Communication Event Prp Typ Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID = eINSTANCE.getCommunicationEventPrpTyp_CommunicationEventPrpTypId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Purposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES = eINSTANCE.getCommunicationEventPrpTyp_CommunicationEventPurposes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION = eINSTANCE.getCommunicationEventPrpTyp_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE = eINSTANCE.getCommunicationEventPrpTyp_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE = eINSTANCE.getCommunicationEventPrpTyp_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPurposeImpl <em>Event Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventPurposeImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPurpose()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_PURPOSE = eINSTANCE.getCommunicationEventPurpose();

		/**
		 * The meta object literal for the '<em><b>Communication Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT = eINSTANCE.getCommunicationEventPurpose_CommunicationEvent();

		/**
		 * The meta object literal for the '<em><b>Communication Event Prp Typ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP = eINSTANCE.getCommunicationEventPurpose_CommunicationEventPrpTyp();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PURPOSE__DESCRIPTION = eINSTANCE.getCommunicationEventPurpose_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventRoleImpl <em>Event Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventRoleImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventRole()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_ROLE = eINSTANCE.getCommunicationEventRole();

		/**
		 * The meta object literal for the '<em><b>Communication Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__COMMUNICATION_EVENT = eINSTANCE.getCommunicationEventRole_CommunicationEvent();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__PARTY = eINSTANCE.getCommunicationEventRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__ROLE_TYPE = eINSTANCE.getCommunicationEventRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__CONTACT_MECH = eINSTANCE.getCommunicationEventRole_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__STATUS = eINSTANCE.getCommunicationEventRole_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationEventTypeImpl
		 * @see org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl#getCommunicationEventType()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_TYPE = eINSTANCE.getCommunicationEventType();

		/**
		 * The meta object literal for the '<em><b>Communication Event Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID = eINSTANCE.getCommunicationEventType_CommunicationEventTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE = eINSTANCE.getCommunicationEventType_ContactMechType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_TYPE__DESCRIPTION = eINSTANCE.getCommunicationEventType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_TYPE__HAS_TABLE = eINSTANCE.getCommunicationEventType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_TYPE__PARENT_TYPE = eINSTANCE.getCommunicationEventType_ParentType();

	}

} //CommunicationPackage
