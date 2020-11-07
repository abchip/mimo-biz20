/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test;

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
 * @see org.abchip.mimo.biz.model.entity.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/entity/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestEntity()
	 * @generated
	 */
	int TEST_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Field Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Field Blob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_BLOB = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Field Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_BYTE_ARRAY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Field Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_COMMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Field Credit Card Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_CREDIT_CARD_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Field Credit Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_CREDIT_CARD_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Field Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_CURRENCY_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Field Currency Precise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_CURRENCY_PRECISE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Field Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Field Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_DATE_TIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Field Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Field Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_EMAIL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Field Fixed Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_FIXED_POINT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Field Floating Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_FLOATING_POINT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Field Id Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_ID_LONG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Field Id Vlong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_ID_VLONG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Field Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_INDICATOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Field Long Varchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_LONG_VARCHAR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Field Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_NUMERIC = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Field Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_OBJECT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Field Short Varchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_SHORT_VARCHAR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Field Tel Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_TEL_NUMBER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Field Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_TIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Field Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_URL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Field Very Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_VERY_LONG = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Field Very Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY__FIELD_VERY_SHORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 31;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTITY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestFieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestFieldTypeImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestFieldType()
	 * @generated
	 */
	int TEST_FIELD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Field Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blob Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__BLOB_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Byte Array Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__BYTE_ARRAY_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clob Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__CLOB_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__DATE_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Date Time Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__DATE_TIME_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fixed Point Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__FIXED_POINT_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Floating Point Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__FLOATING_POINT_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Numeric Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__NUMERIC_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__OBJECT_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Time Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__TIME_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingImpl <em>Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTesting()
	 * @generated
	 */
	int TESTING = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Testing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Testing Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_ITEMS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Testing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Testing Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_SIZE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Testing Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingCryptoImpl <em>Testing Crypto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingCryptoImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingCrypto()
	 * @generated
	 */
	int TESTING_CRYPTO = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Crypto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__TESTING_CRYPTO_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Encrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__ENCRYPTED_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Salted Encrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Testing Crypto Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unencrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__UNENCRYPTED_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Testing Crypto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingItemImpl <em>Testing Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingItemImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingItem()
	 * @generated
	 */
	int TESTING_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__TESTING_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Testing Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__TESTING_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Testing History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__TESTING_HISTORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Testing Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingNodeImpl <em>Testing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingNodeImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingNode()
	 * @generated
	 */
	int TESTING_NODE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__TESTING_NODE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Primary Parent Node Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__PRIMARY_PARENT_NODE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Testing Node Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__TESTING_NODE_MEMBERS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Testing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingNodeMemberImpl <em>Testing Node Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingNodeMemberImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingNodeMember()
	 * @generated
	 */
	int TESTING_NODE_MEMBER = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__TESTING_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Testing Node Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__TESTING_NODE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extend From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__EXTEND_FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extend Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__EXTEND_THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Testing Node Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingRemoveAllImpl <em>Testing Remove All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingRemoveAllImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingRemoveAll()
	 * @generated
	 */
	int TESTING_REMOVE_ALL = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Remove All Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Testing Remove All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingStatusImpl <em>Testing Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingStatusImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingStatus()
	 * @generated
	 */
	int TESTING_STATUS = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__TESTING_STATUS_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__STATUS_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__STATUS_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__TESTING_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Testing Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingSubtypeImpl <em>Testing Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingSubtypeImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingSubtype()
	 * @generated
	 */
	int TESTING_SUBTYPE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__TESTING_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subtype Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__SUBTYPE_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Testing Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingTypeImpl <em>Testing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingTypeImpl
	 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingType()
	 * @generated
	 */
	int TESTING_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__TESTING_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Testing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity
	 * @generated
	 */
	EClass getTestEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldId <em>Field Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldId()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldBlob <em>Field Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Blob</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldBlob()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldBlob();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldByteArray <em>Field Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Byte Array</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldByteArray()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldByteArray();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldComment <em>Field Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Comment</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldComment()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldComment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardDate <em>Field Credit Card Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Credit Card Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardDate()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldCreditCardDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardNumber <em>Field Credit Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Credit Card Number</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardNumber()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldCreditCardNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyAmount <em>Field Currency Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Currency Amount</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyAmount()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldCurrencyAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyPrecise <em>Field Currency Precise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Currency Precise</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyPrecise()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldCurrencyPrecise();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDate <em>Field Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDate()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDateTime <em>Field Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Date Time</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDateTime()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDescription <em>Field Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Description</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDescription()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldEmail <em>Field Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Email</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldEmail()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFixedPoint <em>Field Fixed Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Fixed Point</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFixedPoint()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldFixedPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFloatingPoint <em>Field Floating Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Floating Point</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFloatingPoint()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldFloatingPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdLong <em>Field Id Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Id Long</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdLong()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldIdLong();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdVlong <em>Field Id Vlong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Id Vlong</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdVlong()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldIdVlong();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#isFieldIndicator <em>Field Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Indicator</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#isFieldIndicator()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldIndicator();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldLongVarchar <em>Field Long Varchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Long Varchar</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldLongVarchar()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldLongVarchar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldName()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldNumeric <em>Field Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Numeric</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldNumeric()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldObject <em>Field Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Object</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldObject()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldObject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldShortVarchar <em>Field Short Varchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Short Varchar</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldShortVarchar()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldShortVarchar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTelNumber <em>Field Tel Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Tel Number</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTelNumber()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldTelNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTime <em>Field Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Time</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTime()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldUrl <em>Field Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Url</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldUrl()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Value</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldValue()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryLong <em>Field Very Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Very Long</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryLong()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldVeryLong();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryShort <em>Field Very Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Very Short</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryShort()
	 * @see #getTestEntity()
	 * @generated
	 */
	EAttribute getTestEntity_FieldVeryShort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType
	 * @generated
	 */
	EClass getTestFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getTestFieldTypeId <em>Test Field Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Field Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getTestFieldTypeId()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_TestFieldTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getBlobField <em>Blob Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blob Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getBlobField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_BlobField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getByteArrayField <em>Byte Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Array Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getByteArrayField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_ByteArrayField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getClobField <em>Clob Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clob Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getClobField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_ClobField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getDateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getDateField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_DateField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getDateTimeField <em>Date Time Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getDateTimeField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_DateTimeField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getFixedPointField <em>Fixed Point Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Point Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getFixedPointField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_FixedPointField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getFloatingPointField <em>Floating Point Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Point Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getFloatingPointField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_FloatingPointField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getNumericField <em>Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getNumericField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_NumericField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getObjectField <em>Object Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getObjectField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_ObjectField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestFieldType#getTimeField <em>Time Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Field</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestFieldType#getTimeField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_TimeField();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing
	 * @generated
	 */
	EClass getTesting();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getTestingId()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.Testing#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getComments()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.Testing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getDescription()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingDate <em>Testing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getTestingDate()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingItems <em>Testing Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testing Items</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getTestingItems()
	 * @see #getTesting()
	 * @generated
	 */
	EReference getTesting_TestingItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingName <em>Testing Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Name</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getTestingName()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingSize <em>Testing Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Size</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getTestingSize()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingSize();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingTypeId <em>Testing Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.Testing#getTestingTypeId()
	 * @see #getTesting()
	 * @generated
	 */
	EReference getTesting_TestingTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingCrypto <em>Testing Crypto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Crypto</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingCrypto
	 * @generated
	 */
	EClass getTestingCrypto();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingCrypto#getTestingCryptoId <em>Testing Crypto Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Crypto Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingCrypto#getTestingCryptoId()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_TestingCryptoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingCrypto#getEncryptedValue <em>Encrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Value</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingCrypto#getEncryptedValue()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_EncryptedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingCrypto#getSaltedEncryptedValue <em>Salted Encrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salted Encrypted Value</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingCrypto#getSaltedEncryptedValue()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_SaltedEncryptedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingCrypto#getTestingCryptoTypeId <em>Testing Crypto Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Crypto Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingCrypto#getTestingCryptoTypeId()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_TestingCryptoTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingCrypto#getUnencryptedValue <em>Unencrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unencrypted Value</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingCrypto#getUnencryptedValue()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_UnencryptedValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingItem <em>Testing Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Item</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingItem
	 * @generated
	 */
	EClass getTestingItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingId()
	 * @see #getTestingItem()
	 * @generated
	 */
	EReference getTestingItem_TestingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingSeqId <em>Testing Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingSeqId()
	 * @see #getTestingItem()
	 * @generated
	 */
	EAttribute getTestingItem_TestingSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingHistory <em>Testing History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing History</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingHistory()
	 * @see #getTestingItem()
	 * @generated
	 */
	EAttribute getTestingItem_TestingHistory();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingNode <em>Testing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Node</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNode
	 * @generated
	 */
	EClass getTestingNode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeId <em>Testing Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Node Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeId()
	 * @see #getTestingNode()
	 * @generated
	 */
	EAttribute getTestingNode_TestingNodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNode#getDescription()
	 * @see #getTestingNode()
	 * @generated
	 */
	EAttribute getTestingNode_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getPrimaryParentNodeId <em>Primary Parent Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Parent Node Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNode#getPrimaryParentNodeId()
	 * @see #getTestingNode()
	 * @generated
	 */
	EReference getTestingNode_PrimaryParentNodeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeMembers <em>Testing Node Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testing Node Members</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeMembers()
	 * @see #getTestingNode()
	 * @generated
	 */
	EReference getTestingNode_TestingNodeMembers();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember <em>Testing Node Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Node Member</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember
	 * @generated
	 */
	EClass getTestingNodeMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTestingNodeId <em>Testing Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Node Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTestingNodeId()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EReference getTestingNodeMember_TestingNodeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTestingId()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EReference getTestingNodeMember_TestingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getFromDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendFromDate <em>Extend From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend From Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendFromDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_ExtendFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendThruDate <em>Extend Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendThruDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_ExtendThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getThruDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingRemoveAll <em>Testing Remove All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Remove All</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingRemoveAll
	 * @generated
	 */
	EClass getTestingRemoveAll();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingRemoveAll#getTestingRemoveAllId <em>Testing Remove All Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Remove All Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingRemoveAll#getTestingRemoveAllId()
	 * @see #getTestingRemoveAll()
	 * @generated
	 */
	EAttribute getTestingRemoveAll_TestingRemoveAllId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingRemoveAll#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingRemoveAll#getDescription()
	 * @see #getTestingRemoveAll()
	 * @generated
	 */
	EAttribute getTestingRemoveAll_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingStatus <em>Testing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Status</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingStatus
	 * @generated
	 */
	EClass getTestingStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingStatus#getTestingStatusId <em>Testing Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Status Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingStatus#getTestingStatusId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EAttribute getTestingStatus_TestingStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.TestingStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingStatus#getChangeByUserLoginId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EReference getTestingStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingStatus#getStatusDate()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EAttribute getTestingStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.entity.test.TestingStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingStatus#getStatusId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EReference getTestingStatus_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingStatus#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingStatus#getTestingId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EAttribute getTestingStatus_TestingId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingSubtype <em>Testing Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Subtype</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingSubtype
	 * @generated
	 */
	EClass getTestingSubtype();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingSubtype#getTestingTypeId <em>Testing Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingSubtype#getTestingTypeId()
	 * @see #getTestingSubtype()
	 * @generated
	 */
	EAttribute getTestingSubtype_TestingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingSubtype#getSubtypeDescription <em>Subtype Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype Description</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingSubtype#getSubtypeDescription()
	 * @see #getTestingSubtype()
	 * @generated
	 */
	EAttribute getTestingSubtype_SubtypeDescription();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.entity.test.TestingType <em>Testing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Type</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingType
	 * @generated
	 */
	EClass getTestingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingType#getTestingTypeId <em>Testing Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingType#getTestingTypeId()
	 * @see #getTestingType()
	 * @generated
	 */
	EAttribute getTestingType_TestingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.entity.test.TestingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.entity.test.TestingType#getDescription()
	 * @see #getTestingType()
	 * @generated
	 */
	EAttribute getTestingType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestEntity()
		 * @generated
		 */
		EClass TEST_ENTITY = eINSTANCE.getTestEntity();

		/**
		 * The meta object literal for the '<em><b>Field Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_ID = eINSTANCE.getTestEntity_FieldId();

		/**
		 * The meta object literal for the '<em><b>Field Blob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_BLOB = eINSTANCE.getTestEntity_FieldBlob();

		/**
		 * The meta object literal for the '<em><b>Field Byte Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_BYTE_ARRAY = eINSTANCE.getTestEntity_FieldByteArray();

		/**
		 * The meta object literal for the '<em><b>Field Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_COMMENT = eINSTANCE.getTestEntity_FieldComment();

		/**
		 * The meta object literal for the '<em><b>Field Credit Card Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_CREDIT_CARD_DATE = eINSTANCE.getTestEntity_FieldCreditCardDate();

		/**
		 * The meta object literal for the '<em><b>Field Credit Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_CREDIT_CARD_NUMBER = eINSTANCE.getTestEntity_FieldCreditCardNumber();

		/**
		 * The meta object literal for the '<em><b>Field Currency Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_CURRENCY_AMOUNT = eINSTANCE.getTestEntity_FieldCurrencyAmount();

		/**
		 * The meta object literal for the '<em><b>Field Currency Precise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_CURRENCY_PRECISE = eINSTANCE.getTestEntity_FieldCurrencyPrecise();

		/**
		 * The meta object literal for the '<em><b>Field Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_DATE = eINSTANCE.getTestEntity_FieldDate();

		/**
		 * The meta object literal for the '<em><b>Field Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_DATE_TIME = eINSTANCE.getTestEntity_FieldDateTime();

		/**
		 * The meta object literal for the '<em><b>Field Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_DESCRIPTION = eINSTANCE.getTestEntity_FieldDescription();

		/**
		 * The meta object literal for the '<em><b>Field Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_EMAIL = eINSTANCE.getTestEntity_FieldEmail();

		/**
		 * The meta object literal for the '<em><b>Field Fixed Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_FIXED_POINT = eINSTANCE.getTestEntity_FieldFixedPoint();

		/**
		 * The meta object literal for the '<em><b>Field Floating Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_FLOATING_POINT = eINSTANCE.getTestEntity_FieldFloatingPoint();

		/**
		 * The meta object literal for the '<em><b>Field Id Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_ID_LONG = eINSTANCE.getTestEntity_FieldIdLong();

		/**
		 * The meta object literal for the '<em><b>Field Id Vlong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_ID_VLONG = eINSTANCE.getTestEntity_FieldIdVlong();

		/**
		 * The meta object literal for the '<em><b>Field Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_INDICATOR = eINSTANCE.getTestEntity_FieldIndicator();

		/**
		 * The meta object literal for the '<em><b>Field Long Varchar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_LONG_VARCHAR = eINSTANCE.getTestEntity_FieldLongVarchar();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_NAME = eINSTANCE.getTestEntity_FieldName();

		/**
		 * The meta object literal for the '<em><b>Field Numeric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_NUMERIC = eINSTANCE.getTestEntity_FieldNumeric();

		/**
		 * The meta object literal for the '<em><b>Field Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_OBJECT = eINSTANCE.getTestEntity_FieldObject();

		/**
		 * The meta object literal for the '<em><b>Field Short Varchar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_SHORT_VARCHAR = eINSTANCE.getTestEntity_FieldShortVarchar();

		/**
		 * The meta object literal for the '<em><b>Field Tel Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_TEL_NUMBER = eINSTANCE.getTestEntity_FieldTelNumber();

		/**
		 * The meta object literal for the '<em><b>Field Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_TIME = eINSTANCE.getTestEntity_FieldTime();

		/**
		 * The meta object literal for the '<em><b>Field Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_URL = eINSTANCE.getTestEntity_FieldUrl();

		/**
		 * The meta object literal for the '<em><b>Field Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_VALUE = eINSTANCE.getTestEntity_FieldValue();

		/**
		 * The meta object literal for the '<em><b>Field Very Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_VERY_LONG = eINSTANCE.getTestEntity_FieldVeryLong();

		/**
		 * The meta object literal for the '<em><b>Field Very Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTITY__FIELD_VERY_SHORT = eINSTANCE.getTestEntity_FieldVeryShort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestFieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestFieldTypeImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestFieldType()
		 * @generated
		 */
		EClass TEST_FIELD_TYPE = eINSTANCE.getTestFieldType();

		/**
		 * The meta object literal for the '<em><b>Test Field Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID = eINSTANCE.getTestFieldType_TestFieldTypeId();

		/**
		 * The meta object literal for the '<em><b>Blob Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__BLOB_FIELD = eINSTANCE.getTestFieldType_BlobField();

		/**
		 * The meta object literal for the '<em><b>Byte Array Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__BYTE_ARRAY_FIELD = eINSTANCE.getTestFieldType_ByteArrayField();

		/**
		 * The meta object literal for the '<em><b>Clob Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__CLOB_FIELD = eINSTANCE.getTestFieldType_ClobField();

		/**
		 * The meta object literal for the '<em><b>Date Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__DATE_FIELD = eINSTANCE.getTestFieldType_DateField();

		/**
		 * The meta object literal for the '<em><b>Date Time Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__DATE_TIME_FIELD = eINSTANCE.getTestFieldType_DateTimeField();

		/**
		 * The meta object literal for the '<em><b>Fixed Point Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__FIXED_POINT_FIELD = eINSTANCE.getTestFieldType_FixedPointField();

		/**
		 * The meta object literal for the '<em><b>Floating Point Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__FLOATING_POINT_FIELD = eINSTANCE.getTestFieldType_FloatingPointField();

		/**
		 * The meta object literal for the '<em><b>Numeric Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__NUMERIC_FIELD = eINSTANCE.getTestFieldType_NumericField();

		/**
		 * The meta object literal for the '<em><b>Object Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__OBJECT_FIELD = eINSTANCE.getTestFieldType_ObjectField();

		/**
		 * The meta object literal for the '<em><b>Time Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__TIME_FIELD = eINSTANCE.getTestFieldType_TimeField();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingImpl <em>Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTesting()
		 * @generated
		 */
		EClass TESTING = eINSTANCE.getTesting();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_ID = eINSTANCE.getTesting_TestingId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__COMMENTS = eINSTANCE.getTesting_Comments();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__DESCRIPTION = eINSTANCE.getTesting_Description();

		/**
		 * The meta object literal for the '<em><b>Testing Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_DATE = eINSTANCE.getTesting_TestingDate();

		/**
		 * The meta object literal for the '<em><b>Testing Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING__TESTING_ITEMS = eINSTANCE.getTesting_TestingItems();

		/**
		 * The meta object literal for the '<em><b>Testing Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_NAME = eINSTANCE.getTesting_TestingName();

		/**
		 * The meta object literal for the '<em><b>Testing Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_SIZE = eINSTANCE.getTesting_TestingSize();

		/**
		 * The meta object literal for the '<em><b>Testing Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING__TESTING_TYPE_ID = eINSTANCE.getTesting_TestingTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingCryptoImpl <em>Testing Crypto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingCryptoImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingCrypto()
		 * @generated
		 */
		EClass TESTING_CRYPTO = eINSTANCE.getTestingCrypto();

		/**
		 * The meta object literal for the '<em><b>Testing Crypto Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__TESTING_CRYPTO_ID = eINSTANCE.getTestingCrypto_TestingCryptoId();

		/**
		 * The meta object literal for the '<em><b>Encrypted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__ENCRYPTED_VALUE = eINSTANCE.getTestingCrypto_EncryptedValue();

		/**
		 * The meta object literal for the '<em><b>Salted Encrypted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE = eINSTANCE.getTestingCrypto_SaltedEncryptedValue();

		/**
		 * The meta object literal for the '<em><b>Testing Crypto Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID = eINSTANCE.getTestingCrypto_TestingCryptoTypeId();

		/**
		 * The meta object literal for the '<em><b>Unencrypted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__UNENCRYPTED_VALUE = eINSTANCE.getTestingCrypto_UnencryptedValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingItemImpl <em>Testing Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingItemImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingItem()
		 * @generated
		 */
		EClass TESTING_ITEM = eINSTANCE.getTestingItem();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_ITEM__TESTING_ID = eINSTANCE.getTestingItem_TestingId();

		/**
		 * The meta object literal for the '<em><b>Testing Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_ITEM__TESTING_SEQ_ID = eINSTANCE.getTestingItem_TestingSeqId();

		/**
		 * The meta object literal for the '<em><b>Testing History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_ITEM__TESTING_HISTORY = eINSTANCE.getTestingItem_TestingHistory();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingNodeImpl <em>Testing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingNodeImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingNode()
		 * @generated
		 */
		EClass TESTING_NODE = eINSTANCE.getTestingNode();

		/**
		 * The meta object literal for the '<em><b>Testing Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE__TESTING_NODE_ID = eINSTANCE.getTestingNode_TestingNodeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE__DESCRIPTION = eINSTANCE.getTestingNode_Description();

		/**
		 * The meta object literal for the '<em><b>Primary Parent Node Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE__PRIMARY_PARENT_NODE_ID = eINSTANCE.getTestingNode_PrimaryParentNodeId();

		/**
		 * The meta object literal for the '<em><b>Testing Node Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE__TESTING_NODE_MEMBERS = eINSTANCE.getTestingNode_TestingNodeMembers();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingNodeMemberImpl <em>Testing Node Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingNodeMemberImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingNodeMember()
		 * @generated
		 */
		EClass TESTING_NODE_MEMBER = eINSTANCE.getTestingNodeMember();

		/**
		 * The meta object literal for the '<em><b>Testing Node Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE_MEMBER__TESTING_NODE_ID = eINSTANCE.getTestingNodeMember_TestingNodeId();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE_MEMBER__TESTING_ID = eINSTANCE.getTestingNodeMember_TestingId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__FROM_DATE = eINSTANCE.getTestingNodeMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Extend From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__EXTEND_FROM_DATE = eINSTANCE.getTestingNodeMember_ExtendFromDate();

		/**
		 * The meta object literal for the '<em><b>Extend Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__EXTEND_THRU_DATE = eINSTANCE.getTestingNodeMember_ExtendThruDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__THRU_DATE = eINSTANCE.getTestingNodeMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingRemoveAllImpl <em>Testing Remove All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingRemoveAllImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingRemoveAll()
		 * @generated
		 */
		EClass TESTING_REMOVE_ALL = eINSTANCE.getTestingRemoveAll();

		/**
		 * The meta object literal for the '<em><b>Testing Remove All Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID = eINSTANCE.getTestingRemoveAll_TestingRemoveAllId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_REMOVE_ALL__DESCRIPTION = eINSTANCE.getTestingRemoveAll_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingStatusImpl <em>Testing Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingStatusImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingStatus()
		 * @generated
		 */
		EClass TESTING_STATUS = eINSTANCE.getTestingStatus();

		/**
		 * The meta object literal for the '<em><b>Testing Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_STATUS__TESTING_STATUS_ID = eINSTANCE.getTestingStatus_TestingStatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getTestingStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_STATUS__STATUS_DATE = eINSTANCE.getTestingStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_STATUS__STATUS_ID = eINSTANCE.getTestingStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_STATUS__TESTING_ID = eINSTANCE.getTestingStatus_TestingId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingSubtypeImpl <em>Testing Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingSubtypeImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingSubtype()
		 * @generated
		 */
		EClass TESTING_SUBTYPE = eINSTANCE.getTestingSubtype();

		/**
		 * The meta object literal for the '<em><b>Testing Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SUBTYPE__TESTING_TYPE_ID = eINSTANCE.getTestingSubtype_TestingTypeId();

		/**
		 * The meta object literal for the '<em><b>Subtype Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SUBTYPE__SUBTYPE_DESCRIPTION = eINSTANCE.getTestingSubtype_SubtypeDescription();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.entity.test.impl.TestingTypeImpl <em>Testing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestingTypeImpl
		 * @see org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl#getTestingType()
		 * @generated
		 */
		EClass TESTING_TYPE = eINSTANCE.getTestingType();

		/**
		 * The meta object literal for the '<em><b>Testing Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_TYPE__TESTING_TYPE_ID = eINSTANCE.getTestingType_TestingTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_TYPE__DESCRIPTION = eINSTANCE.getTestingType_Description();

	}

} //TestPackage
