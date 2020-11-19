/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import org.abchip.mimo.biz.BizPackage;
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
 * @see org.abchip.mimo.biz.model.party.party.PartyFactory
 * @model kind="package"
 * @generated
 */
public interface PartyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "party";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/party/party";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-party";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartyPackage eINSTANCE = org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.AddressMatchMapImpl <em>Address Match Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.AddressMatchMapImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getAddressMatchMap()
	 * @generated
	 */
	int ADDRESS_MATCH_MAP = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__MAP_KEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Map Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__MAP_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Address Match Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.AffiliateImpl <em>Affiliate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.AffiliateImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getAffiliate()
	 * @generated
	 */
	int AFFILIATE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Affiliate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__AFFILIATE_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Affiliate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__AFFILIATE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date Time Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__DATE_TIME_APPROVED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date Time Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__DATE_TIME_CREATED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Site Page Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__SITE_PAGE_VIEWS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Site Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__SITE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Site Visitors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__SITE_VISITORS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Year Established</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__YEAR_ESTABLISHED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Affiliate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DATA_SOURCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Empl Leaves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EMPL_LEAVES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EXTERNAL_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__IS_UNREAD = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Party Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Party Carrier Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_CARRIER_ACCOUNTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Party Classifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_CLASSIFICATIONS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Party Contact Mechs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_CONTACT_MECHS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Party Data Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_DATA_SOURCES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Party Geo Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_GEO_POINTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Party Identifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_IDENTIFICATIONS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Party Name Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_NAME_HISTORIES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Party Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_NOTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Party Profile Defaults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_PROFILE_DEFAULTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Party Quals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_QUALS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Party Rates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_RATES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Party Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ROLES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Party Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_SKILLS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Performance Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PERFORMANCE_NOTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Preferred Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PREFERRED_CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Supplier Product Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SUPPLIER_PRODUCT_FEATURES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyAttributeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyAttribute()
	 * @generated
	 */
	int PARTY_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyCarrierAccountImpl <em>Carrier Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyCarrierAccountImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyCarrierAccount()
	 * @generated
	 */
	int PARTY_CARRIER_ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Carrier Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__CARRIER_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__ACCOUNT_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Carrier Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyClassificationImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyClassification()
	 * @generated
	 */
	int PARTY_CLASSIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Classification Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyClassificationGroupImpl <em>Classification Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyClassificationGroupImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyClassificationGroup()
	 * @generated
	 */
	int PARTY_CLASSIFICATION_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Classification Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__PARENT_GROUP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Classification Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Classification Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyClassificationTypeImpl <em>Classification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyClassificationTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyClassificationType()
	 * @generated
	 */
	int PARTY_CLASSIFICATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Classification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__PARTY_CLASSIFICATION_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Classification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyContentImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyContent()
	 * @generated
	 */
	int PARTY_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__PARTY_CONTENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyContentTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyContentType()
	 * @generated
	 */
	int PARTY_CONTENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__PARTY_CONTENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyDataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyDataSourceImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyDataSource()
	 * @generated
	 */
	int PARTY_DATA_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__DATA_SOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__IS_CREATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__VISIT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyGeoPointImpl <em>Geo Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyGeoPointImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyGeoPoint()
	 * @generated
	 */
	int PARTY_GEO_POINT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geo Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__GEO_POINT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyGroupImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyGroup()
	 * @generated
	 */
	int PARTY_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_STAMP = PARTY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_TX_STAMP = PARTY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_UPDATED_STAMP = PARTY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_UPDATED_TX_STAMP = PARTY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_ID = PARTY__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_BY_USER_LOGIN = PARTY__CREATED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_DATE = PARTY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__DATA_SOURCE = PARTY__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Empl Leaves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__EMPL_LEAVES = PARTY__EMPL_LEAVES;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__EXTERNAL_ID = PARTY__EXTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__IS_UNREAD = PARTY__IS_UNREAD;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_MODIFIED_BY_USER_LOGIN = PARTY__LAST_MODIFIED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_MODIFIED_DATE = PARTY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Party Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_ATTRIBUTES = PARTY__PARTY_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Party Carrier Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_CARRIER_ACCOUNTS = PARTY__PARTY_CARRIER_ACCOUNTS;

	/**
	 * The feature id for the '<em><b>Party Classifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_CLASSIFICATIONS = PARTY__PARTY_CLASSIFICATIONS;

	/**
	 * The feature id for the '<em><b>Party Contact Mechs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_CONTACT_MECHS = PARTY__PARTY_CONTACT_MECHS;

	/**
	 * The feature id for the '<em><b>Party Data Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_DATA_SOURCES = PARTY__PARTY_DATA_SOURCES;

	/**
	 * The feature id for the '<em><b>Party Geo Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_GEO_POINTS = PARTY__PARTY_GEO_POINTS;

	/**
	 * The feature id for the '<em><b>Party Identifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_IDENTIFICATIONS = PARTY__PARTY_IDENTIFICATIONS;

	/**
	 * The feature id for the '<em><b>Party Name Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_NAME_HISTORIES = PARTY__PARTY_NAME_HISTORIES;

	/**
	 * The feature id for the '<em><b>Party Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_NOTES = PARTY__PARTY_NOTES;

	/**
	 * The feature id for the '<em><b>Party Profile Defaults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_PROFILE_DEFAULTS = PARTY__PARTY_PROFILE_DEFAULTS;

	/**
	 * The feature id for the '<em><b>Party Quals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_QUALS = PARTY__PARTY_QUALS;

	/**
	 * The feature id for the '<em><b>Party Rates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_RATES = PARTY__PARTY_RATES;

	/**
	 * The feature id for the '<em><b>Party Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_ROLES = PARTY__PARTY_ROLES;

	/**
	 * The feature id for the '<em><b>Party Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_SKILLS = PARTY__PARTY_SKILLS;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_TYPE = PARTY__PARTY_TYPE;

	/**
	 * The feature id for the '<em><b>Performance Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PERFORMANCE_NOTES = PARTY__PERFORMANCE_NOTES;

	/**
	 * The feature id for the '<em><b>Preferred Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PREFERRED_CURRENCY_UOM = PARTY__PREFERRED_CURRENCY_UOM;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__STATUS = PARTY__STATUS;

	/**
	 * The feature id for the '<em><b>Supplier Product Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__SUPPLIER_PRODUCT_FEATURES = PARTY__SUPPLIER_PRODUCT_FEATURES;

	/**
	 * The feature id for the '<em><b>Annual Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__ANNUAL_REVENUE = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__COMMENTS = PARTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__GROUP_NAME = PARTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__GROUP_NAME_LOCAL = PARTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logo Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LOGO_IMAGE_URL = PARTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__NUM_EMPLOYEES = PARTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Office Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__OFFICE_SITE_NAME = PARTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ticker Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__TICKER_SYMBOL = PARTY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP_FEATURE_COUNT = PARTY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyIcsAvsOverrideImpl <em>Ics Avs Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyIcsAvsOverrideImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyIcsAvsOverride()
	 * @generated
	 */
	int PARTY_ICS_AVS_OVERRIDE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Avs Decline String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ics Avs Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationImpl <em>Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyIdentification()
	 * @generated
	 */
	int PARTY_IDENTIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Identification Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__ID_VALUE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationTypeImpl <em>Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyIdentificationType()
	 * @generated
	 */
	int PARTY_IDENTIFICATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Identification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__PARTY_IDENTIFICATION_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyInvitationImpl <em>Invitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyInvitationImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyInvitation()
	 * @generated
	 */
	int PARTY_INVITATION = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Invitation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_INVITATION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__EMAIL_ADDRESS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Invite Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__LAST_INVITE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_ID_FROM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Party Invitation Group Assocs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Invitation Role Assocs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__TO_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Invitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyInvitationGroupAssocImpl <em>Invitation Group Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyInvitationGroupAssocImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyInvitationGroupAssoc()
	 * @generated
	 */
	int PARTY_INVITATION_GROUP_ASSOC = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Invitation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Invitation Group Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyInvitationRoleAssocImpl <em>Invitation Role Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyInvitationRoleAssocImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyInvitationRoleAssoc()
	 * @generated
	 */
	int PARTY_INVITATION_ROLE_ASSOC = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Invitation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Invitation Role Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyNameHistoryImpl <em>Name History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyNameHistoryImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyNameHistory()
	 * @generated
	 */
	int PARTY_NAME_HISTORY = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__CHANGE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__FIRST_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__GROUP_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__LAST_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__MIDDLE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Personal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__PERSONAL_TITLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__SUFFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Name History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyNoteImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyNote()
	 * @generated
	 */
	int PARTY_NOTE = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__PARTY = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyProfileDefaultImpl <em>Profile Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyProfileDefaultImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyProfileDefault()
	 * @generated
	 */
	int PARTY_PROFILE_DEFAULT = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Bill Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Pay Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Ship Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Ship Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Profile Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyRelationship()
	 * @generated
	 */
	int PARTY_RELATIONSHIP = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PARTY_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PARTY_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Relationship Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Permissions Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Position Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__POSITION_TITLE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Priority Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PRIORITY_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__RELATIONSHIP_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__SECURITY_GROUP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyRelationshipType()
	 * @generated
	 */
	int PARTY_RELATIONSHIP_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Relationship Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role Type Id Valid From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role Type Id Valid To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyRoleImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyRole()
	 * @generated
	 */
	int PARTY_ROLE = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyStatusImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyStatus()
	 * @generated
	 */
	int PARTY_STATUS = 25;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__STATUS_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyType()
	 * @generated
	 */
	int PARTY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__PARTY_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__PARTY_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyTypeAttr()
	 * @generated
	 */
	int PARTY_TYPE_ATTR = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__PARTY_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PersonImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 28;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_STAMP = PARTY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_TX_STAMP = PARTY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_UPDATED_STAMP = PARTY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_UPDATED_TX_STAMP = PARTY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_ID = PARTY__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_BY_USER_LOGIN = PARTY__CREATED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_DATE = PARTY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATA_SOURCE = PARTY__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Empl Leaves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPL_LEAVES = PARTY__EMPL_LEAVES;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXTERNAL_ID = PARTY__EXTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_UNREAD = PARTY__IS_UNREAD;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_MODIFIED_BY_USER_LOGIN = PARTY__LAST_MODIFIED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_MODIFIED_DATE = PARTY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Party Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_ATTRIBUTES = PARTY__PARTY_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Party Carrier Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_CARRIER_ACCOUNTS = PARTY__PARTY_CARRIER_ACCOUNTS;

	/**
	 * The feature id for the '<em><b>Party Classifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_CLASSIFICATIONS = PARTY__PARTY_CLASSIFICATIONS;

	/**
	 * The feature id for the '<em><b>Party Contact Mechs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_CONTACT_MECHS = PARTY__PARTY_CONTACT_MECHS;

	/**
	 * The feature id for the '<em><b>Party Data Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_DATA_SOURCES = PARTY__PARTY_DATA_SOURCES;

	/**
	 * The feature id for the '<em><b>Party Geo Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_GEO_POINTS = PARTY__PARTY_GEO_POINTS;

	/**
	 * The feature id for the '<em><b>Party Identifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_IDENTIFICATIONS = PARTY__PARTY_IDENTIFICATIONS;

	/**
	 * The feature id for the '<em><b>Party Name Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_NAME_HISTORIES = PARTY__PARTY_NAME_HISTORIES;

	/**
	 * The feature id for the '<em><b>Party Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_NOTES = PARTY__PARTY_NOTES;

	/**
	 * The feature id for the '<em><b>Party Profile Defaults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_PROFILE_DEFAULTS = PARTY__PARTY_PROFILE_DEFAULTS;

	/**
	 * The feature id for the '<em><b>Party Quals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_QUALS = PARTY__PARTY_QUALS;

	/**
	 * The feature id for the '<em><b>Party Rates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_RATES = PARTY__PARTY_RATES;

	/**
	 * The feature id for the '<em><b>Party Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_ROLES = PARTY__PARTY_ROLES;

	/**
	 * The feature id for the '<em><b>Party Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_SKILLS = PARTY__PARTY_SKILLS;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_TYPE = PARTY__PARTY_TYPE;

	/**
	 * The feature id for the '<em><b>Performance Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERFORMANCE_NOTES = PARTY__PERFORMANCE_NOTES;

	/**
	 * The feature id for the '<em><b>Preferred Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PREFERRED_CURRENCY_UOM = PARTY__PREFERRED_CURRENCY_UOM;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STATUS = PARTY__STATUS;

	/**
	 * The feature id for the '<em><b>Supplier Product Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUPPLIER_PRODUCT_FEATURES = PARTY__SUPPLIER_PRODUCT_FEATURES;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DATE = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CARD_ID = PARTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COMMENTS = PARTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deceased Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DECEASED_DATE = PARTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Employment Status Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYMENT_STATUS_ENUM = PARTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Existing Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXISTING_CUSTOMER = PARTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = PARTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>First Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME_LOCAL = PARTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = PARTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HEIGHT = PARTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = PARTY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Last Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME_LOCAL = PARTY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Marital Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARITAL_STATUS = PARTY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Member Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEMBER_ID = PARTY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MIDDLE_NAME = PARTY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Middle Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MIDDLE_NAME_LOCAL = PARTY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Months With Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MONTHS_WITH_EMPLOYER = PARTY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Mothers Maiden Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MOTHERS_MAIDEN_NAME = PARTY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NICKNAME = PARTY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OCCUPATION = PARTY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Other Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OTHER_LOCAL = PARTY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Passport Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSPORT_EXPIRE_DATE = PARTY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Passport Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSPORT_NUMBER = PARTY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Person Trainings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_TRAININGS = PARTY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Personal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONAL_TITLE = PARTY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Residence Status Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RESIDENCE_STATUS_ENUM = PARTY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SALUTATION = PARTY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SOCIAL_SECURITY_NUMBER = PARTY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUFFIX = PARTY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Total Years Work Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TOTAL_YEARS_WORK_EXPERIENCE = PARTY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WEIGHT = PARTY_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Years With Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__YEARS_WITH_EMPLOYER = PARTY_FEATURE_COUNT + 31;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PARTY_FEATURE_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.PriorityTypeImpl <em>Priority Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.PriorityTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__PRIORITY_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Priority Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.RoleTypeImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__HAS_TABLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__PARENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ROLE_TYPE_ATTRS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Valid Contact Mech Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__VALID_CONTACT_MECH_ROLES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.RoleTypeAttrImpl <em>Role Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.RoleTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getRoleTypeAttr()
	 * @generated
	 */
	int ROLE_TYPE_ATTR = 31;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.VendorImpl <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.VendorImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getVendor()
	 * @generated
	 */
	int VENDOR = 32;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manifest Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_COMPANY_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Manifest Company Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_COMPANY_TITLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Manifest Logo Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_LOGO_URL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Manifest Policies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_POLICIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.party.party.impl.WebSiteRoleImpl <em>Web Site Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.party.party.impl.WebSiteRoleImpl
	 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getWebSiteRole()
	 * @generated
	 */
	int WEB_SITE_ROLE = 33;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__WEB_SITE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Web Site Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.AddressMatchMap <em>Address Match Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Match Map</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.AddressMatchMap
	 * @generated
	 */
	EClass getAddressMatchMap();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.AddressMatchMap#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.AddressMatchMap#getMapKey()
	 * @see #getAddressMatchMap()
	 * @generated
	 */
	EAttribute getAddressMatchMap_MapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.AddressMatchMap#getMapValue <em>Map Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.AddressMatchMap#getMapValue()
	 * @see #getAddressMatchMap()
	 * @generated
	 */
	EAttribute getAddressMatchMap_MapValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.AddressMatchMap#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.AddressMatchMap#getSequenceNum()
	 * @see #getAddressMatchMap()
	 * @generated
	 */
	EAttribute getAddressMatchMap_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.Affiliate <em>Affiliate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affiliate</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate
	 * @generated
	 */
	EClass getAffiliate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getPartyId()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getAffiliateDescription <em>Affiliate Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliate Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getAffiliateDescription()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_AffiliateDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getAffiliateName <em>Affiliate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliate Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getAffiliateName()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_AffiliateName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getDateTimeApproved <em>Date Time Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Approved</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getDateTimeApproved()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_DateTimeApproved();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getDateTimeCreated <em>Date Time Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Created</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getDateTimeCreated()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_DateTimeCreated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getSitePageViews <em>Site Page Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Page Views</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getSitePageViews()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_SitePageViews();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getSiteType <em>Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getSiteType()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_SiteType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getSiteVisitors <em>Site Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Visitors</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getSiteVisitors()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_SiteVisitors();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Affiliate#getYearEstablished <em>Year Established</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Established</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Affiliate#getYearEstablished()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_YearEstablished();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyId()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Party#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getCreatedByUserLogin()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Party#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getCreatedDate()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Party#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getDataSource()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Party#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getDescription()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getEmplLeaves <em>Empl Leaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empl Leaves</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getEmplLeaves()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_EmplLeaves();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Party#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getExternalId()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_ExternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Party#getIsUnread <em>Is Unread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unread</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getIsUnread()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_IsUnread();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Party#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getLastModifiedByUserLogin()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Party#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getLastModifiedDate()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_LastModifiedDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyAttributes <em>Party Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyAttributes()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyCarrierAccounts <em>Party Carrier Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Carrier Accounts</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyCarrierAccounts()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyCarrierAccounts();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyClassifications <em>Party Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Classifications</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyClassifications()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyClassifications();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyContactMechs <em>Party Contact Mechs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Contact Mechs</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyContactMechs()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyContactMechs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyDataSources <em>Party Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Data Sources</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyDataSources()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyDataSources();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyGeoPoints <em>Party Geo Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Geo Points</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyGeoPoints()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyGeoPoints();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyIdentifications <em>Party Identifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Identifications</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyIdentifications()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyIdentifications();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyNameHistories <em>Party Name Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Name Histories</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyNameHistories()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyNameHistories();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyNotes <em>Party Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Notes</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyNotes()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyNotes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyProfileDefaults <em>Party Profile Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Profile Defaults</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyProfileDefaults()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyProfileDefaults();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyQuals <em>Party Quals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Quals</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyQuals()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyQuals();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyRates <em>Party Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Rates</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyRates()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyRates();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyRoles <em>Party Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Roles</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyRoles()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyRoles();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPartySkills <em>Party Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Skills</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartySkills()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartySkills();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyType <em>Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPartyType()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getPerformanceNotes <em>Performance Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performance Notes</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPerformanceNotes()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PerformanceNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Party#getPreferredCurrencyUom <em>Preferred Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preferred Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getPreferredCurrencyUom()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PreferredCurrencyUom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Party#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getStatus()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Party#getSupplierProductFeatures <em>Supplier Product Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplier Product Features</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Party#getSupplierProductFeatures()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_SupplierProductFeatures();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyAttribute
	 * @generated
	 */
	EClass getPartyAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyAttribute#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyAttribute#getParty()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EReference getPartyAttribute_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyAttribute#getAttrName()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EAttribute getPartyAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyAttribute#getAttrDescription()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EAttribute getPartyAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyAttribute#getAttrValue()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EAttribute getPartyAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount <em>Carrier Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Account</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyCarrierAccount
	 * @generated
	 */
	EClass getPartyCarrierAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getParty()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EReference getPartyCarrierAccount_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getCarrierParty <em>Carrier Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getCarrierParty()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EReference getPartyCarrierAccount_CarrierParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getFromDate()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EAttribute getPartyCarrierAccount_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getAccountNumber()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EAttribute getPartyCarrierAccount_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyCarrierAccount#getThruDate()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EAttribute getPartyCarrierAccount_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassification
	 * @generated
	 */
	EClass getPartyClassification();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyClassification#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassification#getParty()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EReference getPartyClassification_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyClassification#getPartyClassificationGroup <em>Party Classification Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Group</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassification#getPartyClassificationGroup()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EReference getPartyClassification_PartyClassificationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassification#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassification#getFromDate()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EAttribute getPartyClassification_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassification#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassification#getThruDate()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EAttribute getPartyClassification_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup <em>Classification Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Group</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationGroup
	 * @generated
	 */
	EClass getPartyClassificationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationGroupId <em>Party Classification Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Classification Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationGroupId()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EAttribute getPartyClassificationGroup_PartyClassificationGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getDescription()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EAttribute getPartyClassificationGroup_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Group</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getParentGroup()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EReference getPartyClassificationGroup_ParentGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationType <em>Party Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationGroup#getPartyClassificationType()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EReference getPartyClassificationGroup_PartyClassificationType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType <em>Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationType
	 * @generated
	 */
	EClass getPartyClassificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getPartyClassificationTypeId <em>Party Classification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Classification Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationType#getPartyClassificationTypeId()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EAttribute getPartyClassificationType_PartyClassificationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationType#getDescription()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EAttribute getPartyClassificationType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationType#getHasTable()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EAttribute getPartyClassificationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyClassificationType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyClassificationType#getParentType()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EReference getPartyClassificationType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContent
	 * @generated
	 */
	EClass getPartyContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyContent#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContent#getParty()
	 * @see #getPartyContent()
	 * @generated
	 */
	EReference getPartyContent_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContent#getContent()
	 * @see #getPartyContent()
	 * @generated
	 */
	EReference getPartyContent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyContent#getPartyContentType <em>Party Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContent#getPartyContentType()
	 * @see #getPartyContent()
	 * @generated
	 */
	EReference getPartyContent_PartyContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContent#getFromDate()
	 * @see #getPartyContent()
	 * @generated
	 */
	EAttribute getPartyContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContent#getThruDate()
	 * @see #getPartyContent()
	 * @generated
	 */
	EAttribute getPartyContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContentType
	 * @generated
	 */
	EClass getPartyContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyContentType#getPartyContentTypeId <em>Party Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContentType#getPartyContentTypeId()
	 * @see #getPartyContentType()
	 * @generated
	 */
	EAttribute getPartyContentType_PartyContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContentType#getDescription()
	 * @see #getPartyContentType()
	 * @generated
	 */
	EAttribute getPartyContentType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyContentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyContentType#getParentType()
	 * @see #getPartyContentType()
	 * @generated
	 */
	EReference getPartyContentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource
	 * @generated
	 */
	EClass getPartyDataSource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource#getParty()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EReference getPartyDataSource_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource#getDataSource()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EReference getPartyDataSource_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource#getFromDate()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource#getComments()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource#getIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource#getIsCreate()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_IsCreate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyDataSource#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyDataSource#getVisitId()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_VisitId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyGeoPoint <em>Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Point</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGeoPoint
	 * @generated
	 */
	EClass getPartyGeoPoint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getParty()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EReference getPartyGeoPoint_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getGeoPoint <em>Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getGeoPoint()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EReference getPartyGeoPoint_GeoPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getFromDate()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EAttribute getPartyGeoPoint_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGeoPoint#getThruDate()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EAttribute getPartyGeoPoint_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup
	 * @generated
	 */
	EClass getPartyGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getAnnualRevenue <em>Annual Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annual Revenue</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getAnnualRevenue()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_AnnualRevenue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getComments()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getGroupName()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getGroupNameLocal <em>Group Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name Local</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getGroupNameLocal()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_GroupNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getLogoImageUrl <em>Logo Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Image Url</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getLogoImageUrl()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_LogoImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getNumEmployees <em>Num Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Employees</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getNumEmployees()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_NumEmployees();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getOfficeSiteName <em>Office Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office Site Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getOfficeSiteName()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_OfficeSiteName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyGroup#getTickerSymbol <em>Ticker Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticker Symbol</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyGroup#getTickerSymbol()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_TickerSymbol();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride <em>Ics Avs Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ics Avs Override</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride
	 * @generated
	 */
	EClass getPartyIcsAvsOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride#getPartyId()
	 * @see #getPartyIcsAvsOverride()
	 * @generated
	 */
	EAttribute getPartyIcsAvsOverride_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride#getAvsDeclineString <em>Avs Decline String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avs Decline String</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride#getAvsDeclineString()
	 * @see #getPartyIcsAvsOverride()
	 * @generated
	 */
	EAttribute getPartyIcsAvsOverride_AvsDeclineString();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentification
	 * @generated
	 */
	EClass getPartyIdentification();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getPartyIdentificationType <em>Party Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Identification Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentification#getPartyIdentificationType()
	 * @see #getPartyIdentification()
	 * @generated
	 */
	EReference getPartyIdentification_PartyIdentificationType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentification#getParty()
	 * @see #getPartyIdentification()
	 * @generated
	 */
	EReference getPartyIdentification_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyIdentification#getIdValue <em>Id Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Value</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentification#getIdValue()
	 * @see #getPartyIdentification()
	 * @generated
	 */
	EAttribute getPartyIdentification_IdValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyIdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentificationType
	 * @generated
	 */
	EClass getPartyIdentificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getPartyIdentificationTypeId <em>Party Identification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Identification Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getPartyIdentificationTypeId()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EAttribute getPartyIdentificationType_PartyIdentificationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getDescription()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EAttribute getPartyIdentificationType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getHasTable()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EAttribute getPartyIdentificationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyIdentificationType#getParentType()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EReference getPartyIdentificationType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation <em>Invitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation
	 * @generated
	 */
	EClass getPartyInvitation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyInvitationId <em>Party Invitation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Invitation Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyInvitationId()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_PartyInvitationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getEmailAddress()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getLastInviteDate <em>Last Invite Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Invite Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getLastInviteDate()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_LastInviteDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyId()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyIdFrom()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EReference getPartyInvitation_PartyIdFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyInvitationGroupAssocs <em>Party Invitation Group Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Invitation Group Assocs</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyInvitationGroupAssocs()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EReference getPartyInvitation_PartyInvitationGroupAssocs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyInvitationRoleAssocs <em>Party Invitation Role Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Invitation Role Assocs</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getPartyInvitationRoleAssocs()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EReference getPartyInvitation_PartyInvitationRoleAssocs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getStatus()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EReference getPartyInvitation_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyInvitation#getToName <em>To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitation#getToName()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_ToName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc <em>Invitation Group Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation Group Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc
	 * @generated
	 */
	EClass getPartyInvitationGroupAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyIdTo()
	 * @see #getPartyInvitationGroupAssoc()
	 * @generated
	 */
	EReference getPartyInvitationGroupAssoc_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyInvitation <em>Party Invitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Invitation</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc#getPartyInvitation()
	 * @see #getPartyInvitationGroupAssoc()
	 * @generated
	 */
	EReference getPartyInvitationGroupAssoc_PartyInvitation();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc <em>Invitation Role Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation Role Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc
	 * @generated
	 */
	EClass getPartyInvitationRoleAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc#getRoleType()
	 * @see #getPartyInvitationRoleAssoc()
	 * @generated
	 */
	EReference getPartyInvitationRoleAssoc_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc#getPartyInvitation <em>Party Invitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Invitation</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc#getPartyInvitation()
	 * @see #getPartyInvitationRoleAssoc()
	 * @generated
	 */
	EReference getPartyInvitationRoleAssoc_PartyInvitation();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory <em>Name History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name History</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory
	 * @generated
	 */
	EClass getPartyNameHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getParty()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EReference getPartyNameHistory_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getChangeDate()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getFirstName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getGroupName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getLastName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getMiddleName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getPersonalTitle <em>Personal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Title</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getPersonalTitle()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_PersonalTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyNameHistory#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNameHistory#getSuffix()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_Suffix();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNote
	 * @generated
	 */
	EClass getPartyNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyNote#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyNote#getParty()
	 * @see #getPartyNote()
	 * @generated
	 */
	EReference getPartyNote_Party();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault <em>Profile Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Default</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault
	 * @generated
	 */
	EClass getPartyProfileDefault();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getParty()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EReference getPartyProfileDefault_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getProductStore()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EReference getPartyProfileDefault_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultBillAddr <em>Default Bill Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Bill Addr</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultBillAddr()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultBillAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultPayMeth <em>Default Pay Meth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Pay Meth</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultPayMeth()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultPayMeth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipAddr <em>Default Ship Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Ship Addr</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipAddr()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultShipAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipMeth <em>Default Ship Meth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Ship Meth</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipMeth()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultShipMeth();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship
	 * @generated
	 */
	EClass getPartyRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdFrom()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyIdTo()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdFrom()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getRoleTypeIdTo()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_RoleTypeIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getFromDate()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getComments()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyRelationshipType <em>Party Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Relationship Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getPartyRelationshipType()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PartyRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPermissionsEnumId <em>Permissions Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Enum Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getPermissionsEnumId()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_PermissionsEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPositionTitle <em>Position Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Title</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getPositionTitle()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_PositionTitle();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getPriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getPriorityType()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PriorityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getRelationshipName <em>Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getRelationshipName()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_RelationshipName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Group</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getSecurityGroup()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_SecurityGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getStatus()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationship#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationship#getThruDate()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType
	 * @generated
	 */
	EClass getPartyRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Relationship Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipTypeId()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_PartyRelationshipTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getDescription()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getHasTable()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getParentType()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EReference getPartyRelationshipType_ParentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipName <em>Party Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Relationship Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getPartyRelationshipName()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_PartyRelationshipName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidFrom <em>Role Type Id Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id Valid From</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidFrom()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EReference getPartyRelationshipType_RoleTypeIdValidFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidTo <em>Role Type Id Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id Valid To</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRelationshipType#getRoleTypeIdValidTo()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EReference getPartyRelationshipType_RoleTypeIdValidTo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRole
	 * @generated
	 */
	EClass getPartyRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRole#getParty()
	 * @see #getPartyRole()
	 * @generated
	 */
	EReference getPartyRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyRole#getRoleType()
	 * @see #getPartyRole()
	 * @generated
	 */
	EReference getPartyRole_RoleType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyStatus
	 * @generated
	 */
	EClass getPartyStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyStatus#getStatus()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EReference getPartyStatus_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyStatus#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyStatus#getParty()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EReference getPartyStatus_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyStatus#getStatusDate()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EAttribute getPartyStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyStatus#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyStatus#getChangeByUserLogin()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EReference getPartyStatus_ChangeByUserLogin();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyType
	 * @generated
	 */
	EClass getPartyType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyType#getPartyTypeId <em>Party Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyType#getPartyTypeId()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_PartyTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyType#getDescription()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyType#getHasTable()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyType#getParentType()
	 * @see #getPartyType()
	 * @generated
	 */
	EReference getPartyType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.PartyType#getPartyTypeAttrs <em>Party Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Party Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyType#getPartyTypeAttrs()
	 * @see #getPartyType()
	 * @generated
	 */
	EReference getPartyType_PartyTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PartyTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyTypeAttr
	 * @generated
	 */
	EClass getPartyTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.PartyTypeAttr#getPartyType <em>Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyTypeAttr#getPartyType()
	 * @see #getPartyTypeAttr()
	 * @generated
	 */
	EReference getPartyTypeAttr_PartyType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyTypeAttr#getAttrName()
	 * @see #getPartyTypeAttr()
	 * @generated
	 */
	EAttribute getPartyTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PartyTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PartyTypeAttr#getDescription()
	 * @see #getPartyTypeAttr()
	 * @generated
	 */
	EAttribute getPartyTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getCardId <em>Card Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getCardId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_CardId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getComments()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getDeceasedDate <em>Deceased Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deceased Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getDeceasedDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeceasedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Person#getEmploymentStatusEnum <em>Employment Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employment Status Enum</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getEmploymentStatusEnum()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_EmploymentStatusEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getExistingCustomer <em>Existing Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Customer</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getExistingCustomer()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ExistingCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getFirstNameLocal <em>First Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name Local</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getFirstNameLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getHeight()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getLastNameLocal <em>Last Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name Local</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getLastNameLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getMaritalStatus <em>Marital Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marital Status</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getMaritalStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MaritalStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getMemberId <em>Member Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getMemberId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MemberId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getMiddleName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getMiddleNameLocal <em>Middle Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name Local</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getMiddleNameLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MiddleNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getMonthsWithEmployer <em>Months With Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months With Employer</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getMonthsWithEmployer()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MonthsWithEmployer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getMothersMaidenName <em>Mothers Maiden Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mothers Maiden Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getMothersMaidenName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MothersMaidenName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getNickname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getOccupation <em>Occupation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupation</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getOccupation()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Occupation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getOtherLocal <em>Other Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Local</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getOtherLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_OtherLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getPassportExpireDate <em>Passport Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passport Expire Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getPassportExpireDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PassportExpireDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getPassportNumber <em>Passport Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passport Number</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getPassportNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PassportNumber();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.Person#getPersonTrainings <em>Person Trainings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person Trainings</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getPersonTrainings()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_PersonTrainings();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getPersonalTitle <em>Personal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Title</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getPersonalTitle()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonalTitle();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.Person#getResidenceStatusEnum <em>Residence Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Residence Status Enum</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getResidenceStatusEnum()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ResidenceStatusEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getSalutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salutation</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getSalutation()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Salutation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getSocialSecurityNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSecurityNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getSuffix()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getTotalYearsWorkExperience <em>Total Years Work Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Years Work Experience</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getTotalYearsWorkExperience()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TotalYearsWorkExperience();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getWeight()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Person#getYearsWithEmployer <em>Years With Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years With Employer</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Person#getYearsWithEmployer()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_YearsWithEmployer();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.PriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PriorityType
	 * @generated
	 */
	EClass getPriorityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PriorityType#getPriorityTypeId <em>Priority Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PriorityType#getPriorityTypeId()
	 * @see #getPriorityType()
	 * @generated
	 */
	EAttribute getPriorityType_PriorityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.PriorityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.PriorityType#getDescription()
	 * @see #getPriorityType()
	 * @generated
	 */
	EAttribute getPriorityType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.RoleType#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType#getRoleTypeId()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.RoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType#getDescription()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.RoleType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType#getHasTable()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.RoleType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType#getParentType()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_ParentType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.RoleType#getRoleTypeAttrs <em>Role Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType#getRoleTypeAttrs()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_RoleTypeAttrs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.party.party.RoleType#getValidContactMechRoles <em>Valid Contact Mech Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Contact Mech Roles</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleType#getValidContactMechRoles()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_ValidContactMechRoles();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.RoleTypeAttr <em>Role Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleTypeAttr
	 * @generated
	 */
	EClass getRoleTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.RoleTypeAttr#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleTypeAttr#getRoleType()
	 * @see #getRoleTypeAttr()
	 * @generated
	 */
	EReference getRoleTypeAttr_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.RoleTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleTypeAttr#getAttrName()
	 * @see #getRoleTypeAttr()
	 * @generated
	 */
	EAttribute getRoleTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.RoleTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.RoleTypeAttr#getDescription()
	 * @see #getRoleTypeAttr()
	 * @generated
	 */
	EAttribute getRoleTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Vendor
	 * @generated
	 */
	EClass getVendor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Vendor#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Vendor#getPartyId()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Vendor#getManifestCompanyName <em>Manifest Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Company Name</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Vendor#getManifestCompanyName()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestCompanyName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Vendor#getManifestCompanyTitle <em>Manifest Company Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Company Title</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Vendor#getManifestCompanyTitle()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestCompanyTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Vendor#getManifestLogoUrl <em>Manifest Logo Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Logo Url</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Vendor#getManifestLogoUrl()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestLogoUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.Vendor#getManifestPolicies <em>Manifest Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Policies</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.Vendor#getManifestPolicies()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestPolicies();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole <em>Web Site Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Role</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole
	 * @generated
	 */
	EClass getWebSiteRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole#getParty()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EReference getWebSiteRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole#getRoleType()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EReference getWebSiteRole_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole#getWebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole#getWebSite()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EReference getWebSiteRole_WebSite();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole#getFromDate()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EAttribute getWebSiteRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole#getSequenceNum()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EAttribute getWebSiteRole_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.party.party.WebSiteRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.party.party.WebSiteRole#getThruDate()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EAttribute getWebSiteRole_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartyFactory getPartyFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.AddressMatchMapImpl <em>Address Match Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.AddressMatchMapImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getAddressMatchMap()
		 * @generated
		 */
		EClass ADDRESS_MATCH_MAP = eINSTANCE.getAddressMatchMap();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MATCH_MAP__MAP_KEY = eINSTANCE.getAddressMatchMap_MapKey();

		/**
		 * The meta object literal for the '<em><b>Map Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MATCH_MAP__MAP_VALUE = eINSTANCE.getAddressMatchMap_MapValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MATCH_MAP__SEQUENCE_NUM = eINSTANCE.getAddressMatchMap_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.AffiliateImpl <em>Affiliate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.AffiliateImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getAffiliate()
		 * @generated
		 */
		EClass AFFILIATE = eINSTANCE.getAffiliate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__PARTY_ID = eINSTANCE.getAffiliate_PartyId();

		/**
		 * The meta object literal for the '<em><b>Affiliate Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__AFFILIATE_DESCRIPTION = eINSTANCE.getAffiliate_AffiliateDescription();

		/**
		 * The meta object literal for the '<em><b>Affiliate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__AFFILIATE_NAME = eINSTANCE.getAffiliate_AffiliateName();

		/**
		 * The meta object literal for the '<em><b>Date Time Approved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__DATE_TIME_APPROVED = eINSTANCE.getAffiliate_DateTimeApproved();

		/**
		 * The meta object literal for the '<em><b>Date Time Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__DATE_TIME_CREATED = eINSTANCE.getAffiliate_DateTimeCreated();

		/**
		 * The meta object literal for the '<em><b>Site Page Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__SITE_PAGE_VIEWS = eINSTANCE.getAffiliate_SitePageViews();

		/**
		 * The meta object literal for the '<em><b>Site Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__SITE_TYPE = eINSTANCE.getAffiliate_SiteType();

		/**
		 * The meta object literal for the '<em><b>Site Visitors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__SITE_VISITORS = eINSTANCE.getAffiliate_SiteVisitors();

		/**
		 * The meta object literal for the '<em><b>Year Established</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__YEAR_ESTABLISHED = eINSTANCE.getAffiliate_YearEstablished();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_ID = eINSTANCE.getParty_PartyId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__CREATED_BY_USER_LOGIN = eINSTANCE.getParty_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__CREATED_DATE = eINSTANCE.getParty_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__DATA_SOURCE = eINSTANCE.getParty_DataSource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__DESCRIPTION = eINSTANCE.getParty_Description();

		/**
		 * The meta object literal for the '<em><b>Empl Leaves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__EMPL_LEAVES = eINSTANCE.getParty_EmplLeaves();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__EXTERNAL_ID = eINSTANCE.getParty_ExternalId();

		/**
		 * The meta object literal for the '<em><b>Is Unread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__IS_UNREAD = eINSTANCE.getParty_IsUnread();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getParty_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__LAST_MODIFIED_DATE = eINSTANCE.getParty_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Party Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_ATTRIBUTES = eINSTANCE.getParty_PartyAttributes();

		/**
		 * The meta object literal for the '<em><b>Party Carrier Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_CARRIER_ACCOUNTS = eINSTANCE.getParty_PartyCarrierAccounts();

		/**
		 * The meta object literal for the '<em><b>Party Classifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_CLASSIFICATIONS = eINSTANCE.getParty_PartyClassifications();

		/**
		 * The meta object literal for the '<em><b>Party Contact Mechs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_CONTACT_MECHS = eINSTANCE.getParty_PartyContactMechs();

		/**
		 * The meta object literal for the '<em><b>Party Data Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_DATA_SOURCES = eINSTANCE.getParty_PartyDataSources();

		/**
		 * The meta object literal for the '<em><b>Party Geo Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_GEO_POINTS = eINSTANCE.getParty_PartyGeoPoints();

		/**
		 * The meta object literal for the '<em><b>Party Identifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_IDENTIFICATIONS = eINSTANCE.getParty_PartyIdentifications();

		/**
		 * The meta object literal for the '<em><b>Party Name Histories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_NAME_HISTORIES = eINSTANCE.getParty_PartyNameHistories();

		/**
		 * The meta object literal for the '<em><b>Party Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_NOTES = eINSTANCE.getParty_PartyNotes();

		/**
		 * The meta object literal for the '<em><b>Party Profile Defaults</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_PROFILE_DEFAULTS = eINSTANCE.getParty_PartyProfileDefaults();

		/**
		 * The meta object literal for the '<em><b>Party Quals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_QUALS = eINSTANCE.getParty_PartyQuals();

		/**
		 * The meta object literal for the '<em><b>Party Rates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_RATES = eINSTANCE.getParty_PartyRates();

		/**
		 * The meta object literal for the '<em><b>Party Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_ROLES = eINSTANCE.getParty_PartyRoles();

		/**
		 * The meta object literal for the '<em><b>Party Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_SKILLS = eINSTANCE.getParty_PartySkills();

		/**
		 * The meta object literal for the '<em><b>Party Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_TYPE = eINSTANCE.getParty_PartyType();

		/**
		 * The meta object literal for the '<em><b>Performance Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PERFORMANCE_NOTES = eINSTANCE.getParty_PerformanceNotes();

		/**
		 * The meta object literal for the '<em><b>Preferred Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PREFERRED_CURRENCY_UOM = eINSTANCE.getParty_PreferredCurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__STATUS = eINSTANCE.getParty_Status();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__SUPPLIER_PRODUCT_FEATURES = eINSTANCE.getParty_SupplierProductFeatures();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyAttributeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyAttribute()
		 * @generated
		 */
		EClass PARTY_ATTRIBUTE = eINSTANCE.getPartyAttribute();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ATTRIBUTE__PARTY = eINSTANCE.getPartyAttribute_Party();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ATTRIBUTE__ATTR_NAME = eINSTANCE.getPartyAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getPartyAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getPartyAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyCarrierAccountImpl <em>Carrier Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyCarrierAccountImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyCarrierAccount()
		 * @generated
		 */
		EClass PARTY_CARRIER_ACCOUNT = eINSTANCE.getPartyCarrierAccount();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CARRIER_ACCOUNT__PARTY = eINSTANCE.getPartyCarrierAccount_Party();

		/**
		 * The meta object literal for the '<em><b>Carrier Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CARRIER_ACCOUNT__CARRIER_PARTY = eINSTANCE.getPartyCarrierAccount_CarrierParty();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CARRIER_ACCOUNT__FROM_DATE = eINSTANCE.getPartyCarrierAccount_FromDate();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CARRIER_ACCOUNT__ACCOUNT_NUMBER = eINSTANCE.getPartyCarrierAccount_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CARRIER_ACCOUNT__THRU_DATE = eINSTANCE.getPartyCarrierAccount_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyClassificationImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyClassification()
		 * @generated
		 */
		EClass PARTY_CLASSIFICATION = eINSTANCE.getPartyClassification();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION__PARTY = eINSTANCE.getPartyClassification_Party();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP = eINSTANCE.getPartyClassification_PartyClassificationGroup();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION__FROM_DATE = eINSTANCE.getPartyClassification_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION__THRU_DATE = eINSTANCE.getPartyClassification_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyClassificationGroupImpl <em>Classification Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyClassificationGroupImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyClassificationGroup()
		 * @generated
		 */
		EClass PARTY_CLASSIFICATION_GROUP = eINSTANCE.getPartyClassificationGroup();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID = eINSTANCE.getPartyClassificationGroup_PartyClassificationGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_GROUP__DESCRIPTION = eINSTANCE.getPartyClassificationGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION_GROUP__PARENT_GROUP = eINSTANCE.getPartyClassificationGroup_ParentGroup();

		/**
		 * The meta object literal for the '<em><b>Party Classification Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE = eINSTANCE.getPartyClassificationGroup_PartyClassificationType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyClassificationTypeImpl <em>Classification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyClassificationTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyClassificationType()
		 * @generated
		 */
		EClass PARTY_CLASSIFICATION_TYPE = eINSTANCE.getPartyClassificationType();

		/**
		 * The meta object literal for the '<em><b>Party Classification Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_TYPE__PARTY_CLASSIFICATION_TYPE_ID = eINSTANCE.getPartyClassificationType_PartyClassificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_TYPE__DESCRIPTION = eINSTANCE.getPartyClassificationType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_TYPE__HAS_TABLE = eINSTANCE.getPartyClassificationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION_TYPE__PARENT_TYPE = eINSTANCE.getPartyClassificationType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyContentImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyContent()
		 * @generated
		 */
		EClass PARTY_CONTENT = eINSTANCE.getPartyContent();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT__PARTY = eINSTANCE.getPartyContent_Party();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT__CONTENT = eINSTANCE.getPartyContent_Content();

		/**
		 * The meta object literal for the '<em><b>Party Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT__PARTY_CONTENT_TYPE = eINSTANCE.getPartyContent_PartyContentType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT__FROM_DATE = eINSTANCE.getPartyContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT__THRU_DATE = eINSTANCE.getPartyContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyContentTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyContentType()
		 * @generated
		 */
		EClass PARTY_CONTENT_TYPE = eINSTANCE.getPartyContentType();

		/**
		 * The meta object literal for the '<em><b>Party Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT_TYPE__PARTY_CONTENT_TYPE_ID = eINSTANCE.getPartyContentType_PartyContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getPartyContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT_TYPE__PARENT_TYPE = eINSTANCE.getPartyContentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyDataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyDataSourceImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyDataSource()
		 * @generated
		 */
		EClass PARTY_DATA_SOURCE = eINSTANCE.getPartyDataSource();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_DATA_SOURCE__PARTY = eINSTANCE.getPartyDataSource_Party();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_DATA_SOURCE__DATA_SOURCE = eINSTANCE.getPartyDataSource_DataSource();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__FROM_DATE = eINSTANCE.getPartyDataSource_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__COMMENTS = eINSTANCE.getPartyDataSource_Comments();

		/**
		 * The meta object literal for the '<em><b>Is Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__IS_CREATE = eINSTANCE.getPartyDataSource_IsCreate();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__VISIT_ID = eINSTANCE.getPartyDataSource_VisitId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyGeoPointImpl <em>Geo Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyGeoPointImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyGeoPoint()
		 * @generated
		 */
		EClass PARTY_GEO_POINT = eINSTANCE.getPartyGeoPoint();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GEO_POINT__PARTY = eINSTANCE.getPartyGeoPoint_Party();

		/**
		 * The meta object literal for the '<em><b>Geo Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GEO_POINT__GEO_POINT = eINSTANCE.getPartyGeoPoint_GeoPoint();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GEO_POINT__FROM_DATE = eINSTANCE.getPartyGeoPoint_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GEO_POINT__THRU_DATE = eINSTANCE.getPartyGeoPoint_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyGroupImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyGroup()
		 * @generated
		 */
		EClass PARTY_GROUP = eINSTANCE.getPartyGroup();

		/**
		 * The meta object literal for the '<em><b>Annual Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__ANNUAL_REVENUE = eINSTANCE.getPartyGroup_AnnualRevenue();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__COMMENTS = eINSTANCE.getPartyGroup_Comments();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__GROUP_NAME = eINSTANCE.getPartyGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>Group Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__GROUP_NAME_LOCAL = eINSTANCE.getPartyGroup_GroupNameLocal();

		/**
		 * The meta object literal for the '<em><b>Logo Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__LOGO_IMAGE_URL = eINSTANCE.getPartyGroup_LogoImageUrl();

		/**
		 * The meta object literal for the '<em><b>Num Employees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__NUM_EMPLOYEES = eINSTANCE.getPartyGroup_NumEmployees();

		/**
		 * The meta object literal for the '<em><b>Office Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__OFFICE_SITE_NAME = eINSTANCE.getPartyGroup_OfficeSiteName();

		/**
		 * The meta object literal for the '<em><b>Ticker Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__TICKER_SYMBOL = eINSTANCE.getPartyGroup_TickerSymbol();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyIcsAvsOverrideImpl <em>Ics Avs Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyIcsAvsOverrideImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyIcsAvsOverride()
		 * @generated
		 */
		EClass PARTY_ICS_AVS_OVERRIDE = eINSTANCE.getPartyIcsAvsOverride();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ICS_AVS_OVERRIDE__PARTY_ID = eINSTANCE.getPartyIcsAvsOverride_PartyId();

		/**
		 * The meta object literal for the '<em><b>Avs Decline String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING = eINSTANCE.getPartyIcsAvsOverride_AvsDeclineString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationImpl <em>Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyIdentification()
		 * @generated
		 */
		EClass PARTY_IDENTIFICATION = eINSTANCE.getPartyIdentification();

		/**
		 * The meta object literal for the '<em><b>Party Identification Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE = eINSTANCE.getPartyIdentification_PartyIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_IDENTIFICATION__PARTY = eINSTANCE.getPartyIdentification_Party();

		/**
		 * The meta object literal for the '<em><b>Id Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION__ID_VALUE = eINSTANCE.getPartyIdentification_IdValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationTypeImpl <em>Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyIdentificationTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyIdentificationType()
		 * @generated
		 */
		EClass PARTY_IDENTIFICATION_TYPE = eINSTANCE.getPartyIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Party Identification Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION_TYPE__PARTY_IDENTIFICATION_TYPE_ID = eINSTANCE.getPartyIdentificationType_PartyIdentificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION_TYPE__DESCRIPTION = eINSTANCE.getPartyIdentificationType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION_TYPE__HAS_TABLE = eINSTANCE.getPartyIdentificationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_IDENTIFICATION_TYPE__PARENT_TYPE = eINSTANCE.getPartyIdentificationType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyInvitationImpl <em>Invitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyInvitationImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyInvitation()
		 * @generated
		 */
		EClass PARTY_INVITATION = eINSTANCE.getPartyInvitation();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__PARTY_INVITATION_ID = eINSTANCE.getPartyInvitation_PartyInvitationId();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__EMAIL_ADDRESS = eINSTANCE.getPartyInvitation_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Last Invite Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__LAST_INVITE_DATE = eINSTANCE.getPartyInvitation_LastInviteDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__PARTY_ID = eINSTANCE.getPartyInvitation_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION__PARTY_ID_FROM = eINSTANCE.getPartyInvitation_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Group Assocs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS = eINSTANCE.getPartyInvitation_PartyInvitationGroupAssocs();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Role Assocs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS = eINSTANCE.getPartyInvitation_PartyInvitationRoleAssocs();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION__STATUS = eINSTANCE.getPartyInvitation_Status();

		/**
		 * The meta object literal for the '<em><b>To Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__TO_NAME = eINSTANCE.getPartyInvitation_ToName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyInvitationGroupAssocImpl <em>Invitation Group Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyInvitationGroupAssocImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyInvitationGroupAssoc()
		 * @generated
		 */
		EClass PARTY_INVITATION_GROUP_ASSOC = eINSTANCE.getPartyInvitationGroupAssoc();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO = eINSTANCE.getPartyInvitationGroupAssoc_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Party Invitation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION = eINSTANCE.getPartyInvitationGroupAssoc_PartyInvitation();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyInvitationRoleAssocImpl <em>Invitation Role Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyInvitationRoleAssocImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyInvitationRoleAssoc()
		 * @generated
		 */
		EClass PARTY_INVITATION_ROLE_ASSOC = eINSTANCE.getPartyInvitationRoleAssoc();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE = eINSTANCE.getPartyInvitationRoleAssoc_RoleType();

		/**
		 * The meta object literal for the '<em><b>Party Invitation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION = eINSTANCE.getPartyInvitationRoleAssoc_PartyInvitation();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyNameHistoryImpl <em>Name History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyNameHistoryImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyNameHistory()
		 * @generated
		 */
		EClass PARTY_NAME_HISTORY = eINSTANCE.getPartyNameHistory();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NAME_HISTORY__PARTY = eINSTANCE.getPartyNameHistory_Party();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__CHANGE_DATE = eINSTANCE.getPartyNameHistory_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__FIRST_NAME = eINSTANCE.getPartyNameHistory_FirstName();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__GROUP_NAME = eINSTANCE.getPartyNameHistory_GroupName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__LAST_NAME = eINSTANCE.getPartyNameHistory_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__MIDDLE_NAME = eINSTANCE.getPartyNameHistory_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Personal Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__PERSONAL_TITLE = eINSTANCE.getPartyNameHistory_PersonalTitle();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__SUFFIX = eINSTANCE.getPartyNameHistory_Suffix();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyNoteImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyNote()
		 * @generated
		 */
		EClass PARTY_NOTE = eINSTANCE.getPartyNote();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NOTE__PARTY = eINSTANCE.getPartyNote_Party();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyProfileDefaultImpl <em>Profile Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyProfileDefaultImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyProfileDefault()
		 * @generated
		 */
		EClass PARTY_PROFILE_DEFAULT = eINSTANCE.getPartyProfileDefault();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PROFILE_DEFAULT__PARTY = eINSTANCE.getPartyProfileDefault_Party();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PROFILE_DEFAULT__PRODUCT_STORE = eINSTANCE.getPartyProfileDefault_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Default Bill Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR = eINSTANCE.getPartyProfileDefault_DefaultBillAddr();

		/**
		 * The meta object literal for the '<em><b>Default Pay Meth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH = eINSTANCE.getPartyProfileDefault_DefaultPayMeth();

		/**
		 * The meta object literal for the '<em><b>Default Ship Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR = eINSTANCE.getPartyProfileDefault_DefaultShipAddr();

		/**
		 * The meta object literal for the '<em><b>Default Ship Meth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH = eINSTANCE.getPartyProfileDefault_DefaultShipMeth();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyRelationship()
		 * @generated
		 */
		EClass PARTY_RELATIONSHIP = eINSTANCE.getPartyRelationship();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PARTY_ID_FROM = eINSTANCE.getPartyRelationship_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PARTY_ID_TO = eINSTANCE.getPartyRelationship_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM = eINSTANCE.getPartyRelationship_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO = eINSTANCE.getPartyRelationship_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__FROM_DATE = eINSTANCE.getPartyRelationship_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__COMMENTS = eINSTANCE.getPartyRelationship_Comments();

		/**
		 * The meta object literal for the '<em><b>Party Relationship Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE = eINSTANCE.getPartyRelationship_PartyRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Permissions Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID = eINSTANCE.getPartyRelationship_PermissionsEnumId();

		/**
		 * The meta object literal for the '<em><b>Position Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__POSITION_TITLE = eINSTANCE.getPartyRelationship_PositionTitle();

		/**
		 * The meta object literal for the '<em><b>Priority Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PRIORITY_TYPE = eINSTANCE.getPartyRelationship_PriorityType();

		/**
		 * The meta object literal for the '<em><b>Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__RELATIONSHIP_NAME = eINSTANCE.getPartyRelationship_RelationshipName();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__SECURITY_GROUP = eINSTANCE.getPartyRelationship_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__STATUS = eINSTANCE.getPartyRelationship_Status();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__THRU_DATE = eINSTANCE.getPartyRelationship_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyRelationshipTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyRelationshipType()
		 * @generated
		 */
		EClass PARTY_RELATIONSHIP_TYPE = eINSTANCE.getPartyRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Party Relationship Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID = eINSTANCE.getPartyRelationshipType_PartyRelationshipTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__DESCRIPTION = eINSTANCE.getPartyRelationshipType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__HAS_TABLE = eINSTANCE.getPartyRelationshipType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP_TYPE__PARENT_TYPE = eINSTANCE.getPartyRelationshipType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Party Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME = eINSTANCE.getPartyRelationshipType_PartyRelationshipName();

		/**
		 * The meta object literal for the '<em><b>Role Type Id Valid From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM = eINSTANCE.getPartyRelationshipType_RoleTypeIdValidFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id Valid To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO = eINSTANCE.getPartyRelationshipType_RoleTypeIdValidTo();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyRoleImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyRole()
		 * @generated
		 */
		EClass PARTY_ROLE = eINSTANCE.getPartyRole();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ROLE__PARTY = eINSTANCE.getPartyRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ROLE__ROLE_TYPE = eINSTANCE.getPartyRole_RoleType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyStatusImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyStatus()
		 * @generated
		 */
		EClass PARTY_STATUS = eINSTANCE.getPartyStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_STATUS__STATUS = eINSTANCE.getPartyStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_STATUS__PARTY = eINSTANCE.getPartyStatus_Party();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_STATUS__STATUS_DATE = eINSTANCE.getPartyStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_STATUS__CHANGE_BY_USER_LOGIN = eINSTANCE.getPartyStatus_ChangeByUserLogin();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyType()
		 * @generated
		 */
		EClass PARTY_TYPE = eINSTANCE.getPartyType();

		/**
		 * The meta object literal for the '<em><b>Party Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__PARTY_TYPE_ID = eINSTANCE.getPartyType_PartyTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__DESCRIPTION = eINSTANCE.getPartyType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__HAS_TABLE = eINSTANCE.getPartyType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_TYPE__PARENT_TYPE = eINSTANCE.getPartyType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Party Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_TYPE__PARTY_TYPE_ATTRS = eINSTANCE.getPartyType_PartyTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PartyTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPartyTypeAttr()
		 * @generated
		 */
		EClass PARTY_TYPE_ATTR = eINSTANCE.getPartyTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Party Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_TYPE_ATTR__PARTY_TYPE = eINSTANCE.getPartyTypeAttr_PartyType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE_ATTR__ATTR_NAME = eINSTANCE.getPartyTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE_ATTR__DESCRIPTION = eINSTANCE.getPartyTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PersonImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Card Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CARD_ID = eINSTANCE.getPerson_CardId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__COMMENTS = eINSTANCE.getPerson_Comments();

		/**
		 * The meta object literal for the '<em><b>Deceased Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DECEASED_DATE = eINSTANCE.getPerson_DeceasedDate();

		/**
		 * The meta object literal for the '<em><b>Employment Status Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EMPLOYMENT_STATUS_ENUM = eINSTANCE.getPerson_EmploymentStatusEnum();

		/**
		 * The meta object literal for the '<em><b>Existing Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EXISTING_CUSTOMER = eINSTANCE.getPerson_ExistingCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>First Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME_LOCAL = eINSTANCE.getPerson_FirstNameLocal();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__HEIGHT = eINSTANCE.getPerson_Height();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Last Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME_LOCAL = eINSTANCE.getPerson_LastNameLocal();

		/**
		 * The meta object literal for the '<em><b>Marital Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MARITAL_STATUS = eINSTANCE.getPerson_MaritalStatus();

		/**
		 * The meta object literal for the '<em><b>Member Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MEMBER_ID = eINSTANCE.getPerson_MemberId();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MIDDLE_NAME = eINSTANCE.getPerson_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Middle Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MIDDLE_NAME_LOCAL = eINSTANCE.getPerson_MiddleNameLocal();

		/**
		 * The meta object literal for the '<em><b>Months With Employer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MONTHS_WITH_EMPLOYER = eINSTANCE.getPerson_MonthsWithEmployer();

		/**
		 * The meta object literal for the '<em><b>Mothers Maiden Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MOTHERS_MAIDEN_NAME = eINSTANCE.getPerson_MothersMaidenName();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NICKNAME = eINSTANCE.getPerson_Nickname();

		/**
		 * The meta object literal for the '<em><b>Occupation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__OCCUPATION = eINSTANCE.getPerson_Occupation();

		/**
		 * The meta object literal for the '<em><b>Other Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__OTHER_LOCAL = eINSTANCE.getPerson_OtherLocal();

		/**
		 * The meta object literal for the '<em><b>Passport Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSPORT_EXPIRE_DATE = eINSTANCE.getPerson_PassportExpireDate();

		/**
		 * The meta object literal for the '<em><b>Passport Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSPORT_NUMBER = eINSTANCE.getPerson_PassportNumber();

		/**
		 * The meta object literal for the '<em><b>Person Trainings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PERSON_TRAININGS = eINSTANCE.getPerson_PersonTrainings();

		/**
		 * The meta object literal for the '<em><b>Personal Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSONAL_TITLE = eINSTANCE.getPerson_PersonalTitle();

		/**
		 * The meta object literal for the '<em><b>Residence Status Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__RESIDENCE_STATUS_ENUM = eINSTANCE.getPerson_ResidenceStatusEnum();

		/**
		 * The meta object literal for the '<em><b>Salutation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SALUTATION = eINSTANCE.getPerson_Salutation();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SOCIAL_SECURITY_NUMBER = eINSTANCE.getPerson_SocialSecurityNumber();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUFFIX = eINSTANCE.getPerson_Suffix();

		/**
		 * The meta object literal for the '<em><b>Total Years Work Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TOTAL_YEARS_WORK_EXPERIENCE = eINSTANCE.getPerson_TotalYearsWorkExperience();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__WEIGHT = eINSTANCE.getPerson_Weight();

		/**
		 * The meta object literal for the '<em><b>Years With Employer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__YEARS_WITH_EMPLOYER = eINSTANCE.getPerson_YearsWithEmployer();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.PriorityTypeImpl <em>Priority Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.PriorityTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getPriorityType()
		 * @generated
		 */
		EClass PRIORITY_TYPE = eINSTANCE.getPriorityType();

		/**
		 * The meta object literal for the '<em><b>Priority Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_TYPE__PRIORITY_TYPE_ID = eINSTANCE.getPriorityType_PriorityTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_TYPE__DESCRIPTION = eINSTANCE.getPriorityType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.RoleTypeImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__ROLE_TYPE_ID = eINSTANCE.getRoleType_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__DESCRIPTION = eINSTANCE.getRoleType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__HAS_TABLE = eINSTANCE.getRoleType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__PARENT_TYPE = eINSTANCE.getRoleType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Role Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__ROLE_TYPE_ATTRS = eINSTANCE.getRoleType_RoleTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Valid Contact Mech Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__VALID_CONTACT_MECH_ROLES = eINSTANCE.getRoleType_ValidContactMechRoles();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.RoleTypeAttrImpl <em>Role Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.RoleTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getRoleTypeAttr()
		 * @generated
		 */
		EClass ROLE_TYPE_ATTR = eINSTANCE.getRoleTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_ATTR__ROLE_TYPE = eINSTANCE.getRoleTypeAttr_RoleType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getRoleTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getRoleTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.VendorImpl <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.VendorImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getVendor()
		 * @generated
		 */
		EClass VENDOR = eINSTANCE.getVendor();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__PARTY_ID = eINSTANCE.getVendor_PartyId();

		/**
		 * The meta object literal for the '<em><b>Manifest Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_COMPANY_NAME = eINSTANCE.getVendor_ManifestCompanyName();

		/**
		 * The meta object literal for the '<em><b>Manifest Company Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_COMPANY_TITLE = eINSTANCE.getVendor_ManifestCompanyTitle();

		/**
		 * The meta object literal for the '<em><b>Manifest Logo Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_LOGO_URL = eINSTANCE.getVendor_ManifestLogoUrl();

		/**
		 * The meta object literal for the '<em><b>Manifest Policies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_POLICIES = eINSTANCE.getVendor_ManifestPolicies();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.party.party.impl.WebSiteRoleImpl <em>Web Site Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.party.party.impl.WebSiteRoleImpl
		 * @see org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl#getWebSiteRole()
		 * @generated
		 */
		EClass WEB_SITE_ROLE = eINSTANCE.getWebSiteRole();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_ROLE__PARTY = eINSTANCE.getWebSiteRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_ROLE__ROLE_TYPE = eINSTANCE.getWebSiteRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Web Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_ROLE__WEB_SITE = eINSTANCE.getWebSiteRole_WebSite();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_ROLE__FROM_DATE = eINSTANCE.getWebSiteRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_ROLE__SEQUENCE_NUM = eINSTANCE.getWebSiteRole_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_ROLE__THRU_DATE = eINSTANCE.getWebSiteRole_ThruDate();

	}

} //PartyPackage
