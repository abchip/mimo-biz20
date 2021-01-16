/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

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
 * @see org.abchip.mimo.biz.model.content.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/content/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.AudioDataResourceImpl <em>Audio Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.AudioDataResourceImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getAudioDataResource()
	 * @generated
	 */
	int AUDIO_DATA_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Audio Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE__AUDIO_DATA = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Audio Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_DATA_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.CharacterSetImpl <em>Character Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.CharacterSetImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getCharacterSet()
	 * @generated
	 */
	int CHARACTER_SET = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Character Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET__CHARACTER_SET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Character Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_SET_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataCategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataCategoryImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataCategory()
	 * @generated
	 */
	int DATA_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__DATA_CATEGORY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__CATEGORY_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY__PARENT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResource()
	 * @generated
	 */
	int DATA_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RESOURCE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__CHARACTER_SET = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__CREATED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_CATEGORY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Data Resource Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Data Resource Meta Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RESOURCE_META_DATAS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Data Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RESOURCE_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Data Resource Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RESOURCE_PURPOSES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Data Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RESOURCE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_SOURCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Data Template Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_TEMPLATE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__IS_PUBLIC = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__LAST_MODIFIED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__LOCALE_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__MIME_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Object Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__OBJECT_INFO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Product Feature Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Related Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__RELATED_DETAIL_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__SURVEY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__SURVEY_RESPONSE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceAttributeImpl <em>Resource Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceAttributeImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceAttribute()
	 * @generated
	 */
	int DATA_RESOURCE_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__DATA_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Resource Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceMetaDataImpl <em>Resource Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceMetaDataImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceMetaData()
	 * @generated
	 */
	int DATA_RESOURCE_META_DATA = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__DATA_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Meta Data Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__META_DATA_PREDICATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__DATA_SOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Meta Data Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA__META_DATA_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Resource Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_META_DATA_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourcePurposeImpl <em>Resource Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourcePurposeImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourcePurpose()
	 * @generated
	 */
	int DATA_RESOURCE_PURPOSE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE__DATA_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Resource Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_PURPOSE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceRoleImpl <em>Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceRoleImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceRole()
	 * @generated
	 */
	int DATA_RESOURCE_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__DATA_RESOURCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceType()
	 * @generated
	 */
	int DATA_RESOURCE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Resource Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeAttrImpl <em>Resource Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceTypeAttr()
	 * @generated
	 */
	int DATA_RESOURCE_TYPE_ATTR = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__DATA_RESOURCE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataTemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataTemplateTypeImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataTemplateType()
	 * @generated
	 */
	int DATA_TEMPLATE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Template Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__DATA_TEMPLATE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE__EXTENSION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TEMPLATE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.ElectronicTextImpl <em>Electronic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.ElectronicTextImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getElectronicText()
	 * @generated
	 */
	int ELECTRONIC_TEXT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__CREATED_STAMP = DATA_RESOURCE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__CREATED_TX_STAMP = DATA_RESOURCE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__LAST_UPDATED_STAMP = DATA_RESOURCE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__LAST_UPDATED_TX_STAMP = DATA_RESOURCE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_RESOURCE_ID = DATA_RESOURCE__DATA_RESOURCE_ID;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__CHARACTER_SET = DATA_RESOURCE__CHARACTER_SET;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__CREATED_BY_USER_LOGIN = DATA_RESOURCE__CREATED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__CREATED_DATE = DATA_RESOURCE__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Data Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_CATEGORY = DATA_RESOURCE__DATA_CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Resource Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_RESOURCE_ATTRIBUTES = DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Data Resource Meta Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_RESOURCE_META_DATAS = DATA_RESOURCE__DATA_RESOURCE_META_DATAS;

	/**
	 * The feature id for the '<em><b>Data Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_RESOURCE_NAME = DATA_RESOURCE__DATA_RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Data Resource Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_RESOURCE_PURPOSES = DATA_RESOURCE__DATA_RESOURCE_PURPOSES;

	/**
	 * The feature id for the '<em><b>Data Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_RESOURCE_TYPE = DATA_RESOURCE__DATA_RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_SOURCE = DATA_RESOURCE__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Data Template Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__DATA_TEMPLATE_TYPE = DATA_RESOURCE__DATA_TEMPLATE_TYPE;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__IS_PUBLIC = DATA_RESOURCE__IS_PUBLIC;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__LAST_MODIFIED_BY_USER_LOGIN = DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__LAST_MODIFIED_DATE = DATA_RESOURCE__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__LOCALE_STRING = DATA_RESOURCE__LOCALE_STRING;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__MIME_TYPE = DATA_RESOURCE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Object Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__OBJECT_INFO = DATA_RESOURCE__OBJECT_INFO;

	/**
	 * The feature id for the '<em><b>Product Feature Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__PRODUCT_FEATURE_DATA_RESOURCES = DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES;

	/**
	 * The feature id for the '<em><b>Related Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__RELATED_DETAIL_ID = DATA_RESOURCE__RELATED_DETAIL_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__STATUS = DATA_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__SURVEY = DATA_RESOURCE__SURVEY;

	/**
	 * The feature id for the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__SURVEY_RESPONSE = DATA_RESOURCE__SURVEY_RESPONSE;

	/**
	 * The feature id for the '<em><b>Text Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT__TEXT_DATA = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electronic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_TEXT_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.FileExtensionImpl <em>File Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.FileExtensionImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getFileExtension()
	 * @generated
	 */
	int FILE_EXTENSION = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION__FILE_EXTENSION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION__MIME_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>File Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTENSION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.ImageDataResourceImpl <em>Image Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.ImageDataResourceImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getImageDataResource()
	 * @generated
	 */
	int IMAGE_DATA_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__CREATED_STAMP = DATA_RESOURCE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__CREATED_TX_STAMP = DATA_RESOURCE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__LAST_UPDATED_STAMP = DATA_RESOURCE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__LAST_UPDATED_TX_STAMP = DATA_RESOURCE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_RESOURCE_ID = DATA_RESOURCE__DATA_RESOURCE_ID;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__CHARACTER_SET = DATA_RESOURCE__CHARACTER_SET;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__CREATED_BY_USER_LOGIN = DATA_RESOURCE__CREATED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__CREATED_DATE = DATA_RESOURCE__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Data Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_CATEGORY = DATA_RESOURCE__DATA_CATEGORY;

	/**
	 * The feature id for the '<em><b>Data Resource Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES = DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Data Resource Meta Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_RESOURCE_META_DATAS = DATA_RESOURCE__DATA_RESOURCE_META_DATAS;

	/**
	 * The feature id for the '<em><b>Data Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_RESOURCE_NAME = DATA_RESOURCE__DATA_RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Data Resource Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_RESOURCE_PURPOSES = DATA_RESOURCE__DATA_RESOURCE_PURPOSES;

	/**
	 * The feature id for the '<em><b>Data Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_RESOURCE_TYPE = DATA_RESOURCE__DATA_RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_SOURCE = DATA_RESOURCE__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Data Template Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__DATA_TEMPLATE_TYPE = DATA_RESOURCE__DATA_TEMPLATE_TYPE;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__IS_PUBLIC = DATA_RESOURCE__IS_PUBLIC;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN = DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__LAST_MODIFIED_DATE = DATA_RESOURCE__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__LOCALE_STRING = DATA_RESOURCE__LOCALE_STRING;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__MIME_TYPE = DATA_RESOURCE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Object Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__OBJECT_INFO = DATA_RESOURCE__OBJECT_INFO;

	/**
	 * The feature id for the '<em><b>Product Feature Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES = DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES;

	/**
	 * The feature id for the '<em><b>Related Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__RELATED_DETAIL_ID = DATA_RESOURCE__RELATED_DETAIL_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__STATUS = DATA_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__SURVEY = DATA_RESOURCE__SURVEY;

	/**
	 * The feature id for the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__SURVEY_RESPONSE = DATA_RESOURCE__SURVEY_RESPONSE;

	/**
	 * The feature id for the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE__IMAGE_DATA = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_RESOURCE_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.MetaDataPredicateImpl <em>Meta Data Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.MetaDataPredicateImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getMetaDataPredicate()
	 * @generated
	 */
	int META_DATA_PREDICATE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meta Data Predicate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE__META_DATA_PREDICATE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Meta Data Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_PREDICATE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.MimeTypeImpl <em>Mime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.MimeTypeImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mime Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__MIME_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.MimeTypeHtmlTemplateImpl <em>Mime Type Html Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.MimeTypeHtmlTemplateImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getMimeTypeHtmlTemplate()
	 * @generated
	 */
	int MIME_TYPE_HTML_TEMPLATE = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mime Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Template Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mime Type Html Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_HTML_TEMPLATE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.OtherDataResourceImpl <em>Other Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.OtherDataResourceImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getOtherDataResource()
	 * @generated
	 */
	int OTHER_DATA_RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE__DATA_RESOURCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Resource Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE__DATA_RESOURCE_CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Other Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_DATA_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.data.impl.VideoDataResourceImpl <em>Video Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.data.impl.VideoDataResourceImpl
	 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getVideoDataResource()
	 * @generated
	 */
	int VIDEO_DATA_RESOURCE = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Video Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE__VIDEO_DATA = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Video Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_DATA_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.AudioDataResource <em>Audio Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.AudioDataResource
	 * @generated
	 */
	EClass getAudioDataResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.AudioDataResource#getDataResourceId <em>Data Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.AudioDataResource#getDataResourceId()
	 * @see #getAudioDataResource()
	 * @generated
	 */
	EAttribute getAudioDataResource_DataResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.AudioDataResource#getAudioData <em>Audio Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Data</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.AudioDataResource#getAudioData()
	 * @see #getAudioDataResource()
	 * @generated
	 */
	EAttribute getAudioDataResource_AudioData();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.CharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Set</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.CharacterSet
	 * @generated
	 */
	EClass getCharacterSet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.CharacterSet#getCharacterSetId <em>Character Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Set Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.CharacterSet#getCharacterSetId()
	 * @see #getCharacterSet()
	 * @generated
	 */
	EAttribute getCharacterSet_CharacterSetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.CharacterSet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.CharacterSet#getDescription()
	 * @see #getCharacterSet()
	 * @generated
	 */
	EAttribute getCharacterSet_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataCategory
	 * @generated
	 */
	EClass getDataCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataCategory#getDataCategoryId <em>Data Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Category Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataCategory#getDataCategoryId()
	 * @see #getDataCategory()
	 * @generated
	 */
	EAttribute getDataCategory_DataCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataCategory#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataCategory#getCategoryName()
	 * @see #getDataCategory()
	 * @generated
	 */
	EAttribute getDataCategory_CategoryName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataCategory#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Category</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataCategory#getParentCategory()
	 * @see #getDataCategory()
	 * @generated
	 */
	EReference getDataCategory_ParentCategory();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource
	 * @generated
	 */
	EClass getDataResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceId <em>Data Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceId()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_DataResourceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getCharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Character Set</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getCharacterSet()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_CharacterSet();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getCreatedByUserLogin()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getCreatedDate()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataCategory <em>Data Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Category</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataCategory()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceAttributes <em>Data Resource Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Resource Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceAttributes()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataResourceAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceMetaDatas <em>Data Resource Meta Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Resource Meta Datas</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceMetaDatas()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataResourceMetaDatas();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceName <em>Data Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceName()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_DataResourceName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourcePurposes <em>Data Resource Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Resource Purposes</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataResourcePurposes()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataResourcePurposes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceType <em>Data Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceType()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataResourceType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataSource()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataSource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataTemplateType <em>Data Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Template Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getDataTemplateType()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_DataTemplateType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#isIsPublic()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_IsPublic();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedByUserLogin()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedDate()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getLocaleString <em>Locale String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale String</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getLocaleString()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_LocaleString();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mime Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getMimeType()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getObjectInfo <em>Object Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Info</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getObjectInfo()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_ObjectInfo();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.data.DataResource#getProductFeatureDataResources <em>Product Feature Data Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Feature Data Resources</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getProductFeatureDataResources()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_ProductFeatureDataResources();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResource#getRelatedDetailId <em>Related Detail Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Related Detail Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getRelatedDetailId()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_RelatedDetailId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getStatus()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getSurvey()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_Survey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResource#getSurveyResponse <em>Survey Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResource#getSurveyResponse()
	 * @see #getDataResource()
	 * @generated
	 */
	EReference getDataResource_SurveyResponse();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResourceAttribute <em>Resource Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceAttribute
	 * @generated
	 */
	EClass getDataResourceAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getDataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getDataResource()
	 * @see #getDataResourceAttribute()
	 * @generated
	 */
	EReference getDataResourceAttribute_DataResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getAttrName()
	 * @see #getDataResourceAttribute()
	 * @generated
	 */
	EAttribute getDataResourceAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getAttrDescription()
	 * @see #getDataResourceAttribute()
	 * @generated
	 */
	EAttribute getDataResourceAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceAttribute#getAttrValue()
	 * @see #getDataResourceAttribute()
	 * @generated
	 */
	EAttribute getDataResourceAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData <em>Resource Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Meta Data</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceMetaData
	 * @generated
	 */
	EClass getDataResourceMetaData();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataResource()
	 * @see #getDataResourceMetaData()
	 * @generated
	 */
	EReference getDataResourceMetaData_DataResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataPredicate <em>Meta Data Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Data Predicate</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataPredicate()
	 * @see #getDataResourceMetaData()
	 * @generated
	 */
	EReference getDataResourceMetaData_MetaDataPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataSource()
	 * @see #getDataResourceMetaData()
	 * @generated
	 */
	EReference getDataResourceMetaData_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataValue <em>Meta Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data Value</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataValue()
	 * @see #getDataResourceMetaData()
	 * @generated
	 */
	EAttribute getDataResourceMetaData_MetaDataValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose <em>Resource Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Purpose</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourcePurpose
	 * @generated
	 */
	EClass getDataResourcePurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getDataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getDataResource()
	 * @see #getDataResourcePurpose()
	 * @generated
	 */
	EReference getDataResourcePurpose_DataResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getContentPurposeType <em>Content Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getContentPurposeType()
	 * @see #getDataResourcePurpose()
	 * @generated
	 */
	EReference getDataResourcePurpose_ContentPurposeType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Role</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceRole
	 * @generated
	 */
	EClass getDataResourceRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceRole#getDataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceRole#getDataResource()
	 * @see #getDataResourceRole()
	 * @generated
	 */
	EReference getDataResourceRole_DataResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceRole#getParty()
	 * @see #getDataResourceRole()
	 * @generated
	 */
	EReference getDataResourceRole_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceRole#getRoleTypeId()
	 * @see #getDataResourceRole()
	 * @generated
	 */
	EAttribute getDataResourceRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceRole#getFromDate()
	 * @see #getDataResourceRole()
	 * @generated
	 */
	EAttribute getDataResourceRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceRole#getThruDate()
	 * @see #getDataResourceRole()
	 * @generated
	 */
	EAttribute getDataResourceRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceType
	 * @generated
	 */
	EClass getDataResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceType#getDataResourceTypeId <em>Data Resource Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceType#getDataResourceTypeId()
	 * @see #getDataResourceType()
	 * @generated
	 */
	EAttribute getDataResourceType_DataResourceTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.data.DataResourceType#getDataResourceTypeAttrs <em>Data Resource Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Resource Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceType#getDataResourceTypeAttrs()
	 * @see #getDataResourceType()
	 * @generated
	 */
	EReference getDataResourceType_DataResourceTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceType#getDescription()
	 * @see #getDataResourceType()
	 * @generated
	 */
	EAttribute getDataResourceType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceType#isHasTable()
	 * @see #getDataResourceType()
	 * @generated
	 */
	EAttribute getDataResourceType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceType#getParentType()
	 * @see #getDataResourceType()
	 * @generated
	 */
	EReference getDataResourceType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr <em>Resource Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr
	 * @generated
	 */
	EClass getDataResourceTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr#getDataResourceType <em>Data Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr#getDataResourceType()
	 * @see #getDataResourceTypeAttr()
	 * @generated
	 */
	EReference getDataResourceTypeAttr_DataResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr#getAttrName()
	 * @see #getDataResourceTypeAttr()
	 * @generated
	 */
	EAttribute getDataResourceTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataResourceTypeAttr#getDescription()
	 * @see #getDataResourceTypeAttr()
	 * @generated
	 */
	EAttribute getDataResourceTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.DataTemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataTemplateType
	 * @generated
	 */
	EClass getDataTemplateType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataTemplateType#getDataTemplateTypeId <em>Data Template Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Template Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataTemplateType#getDataTemplateTypeId()
	 * @see #getDataTemplateType()
	 * @generated
	 */
	EAttribute getDataTemplateType_DataTemplateTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataTemplateType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataTemplateType#getDescription()
	 * @see #getDataTemplateType()
	 * @generated
	 */
	EAttribute getDataTemplateType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.DataTemplateType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.DataTemplateType#getExtension()
	 * @see #getDataTemplateType()
	 * @generated
	 */
	EAttribute getDataTemplateType_Extension();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.ElectronicText <em>Electronic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Text</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.ElectronicText
	 * @generated
	 */
	EClass getElectronicText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.ElectronicText#getTextData <em>Text Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Data</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.ElectronicText#getTextData()
	 * @see #getElectronicText()
	 * @generated
	 */
	EAttribute getElectronicText_TextData();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.FileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Extension</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.FileExtension
	 * @generated
	 */
	EClass getFileExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.FileExtension#getFileExtensionId <em>File Extension Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.FileExtension#getFileExtensionId()
	 * @see #getFileExtension()
	 * @generated
	 */
	EAttribute getFileExtension_FileExtensionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.data.FileExtension#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mime Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.FileExtension#getMimeType()
	 * @see #getFileExtension()
	 * @generated
	 */
	EReference getFileExtension_MimeType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.ImageDataResource <em>Image Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.ImageDataResource
	 * @generated
	 */
	EClass getImageDataResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.ImageDataResource#getImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Data</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.ImageDataResource#getImageData()
	 * @see #getImageDataResource()
	 * @generated
	 */
	EAttribute getImageDataResource_ImageData();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.MetaDataPredicate <em>Meta Data Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data Predicate</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MetaDataPredicate
	 * @generated
	 */
	EClass getMetaDataPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.MetaDataPredicate#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data Predicate Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MetaDataPredicate#getMetaDataPredicateId()
	 * @see #getMetaDataPredicate()
	 * @generated
	 */
	EAttribute getMetaDataPredicate_MetaDataPredicateId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.MetaDataPredicate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MetaDataPredicate#getDescription()
	 * @see #getMetaDataPredicate()
	 * @generated
	 */
	EAttribute getMetaDataPredicate_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MimeType
	 * @generated
	 */
	EClass getMimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.MimeType#getMimeTypeId <em>Mime Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MimeType#getMimeTypeId()
	 * @see #getMimeType()
	 * @generated
	 */
	EAttribute getMimeType_MimeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.MimeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MimeType#getDescription()
	 * @see #getMimeType()
	 * @generated
	 */
	EAttribute getMimeType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.MimeTypeHtmlTemplate <em>Mime Type Html Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Html Template</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MimeTypeHtmlTemplate
	 * @generated
	 */
	EClass getMimeTypeHtmlTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.MimeTypeHtmlTemplate#getMimeTypeId <em>Mime Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MimeTypeHtmlTemplate#getMimeTypeId()
	 * @see #getMimeTypeHtmlTemplate()
	 * @generated
	 */
	EAttribute getMimeTypeHtmlTemplate_MimeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.MimeTypeHtmlTemplate#getTemplateLocation <em>Template Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Location</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.MimeTypeHtmlTemplate#getTemplateLocation()
	 * @see #getMimeTypeHtmlTemplate()
	 * @generated
	 */
	EAttribute getMimeTypeHtmlTemplate_TemplateLocation();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.OtherDataResource <em>Other Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.OtherDataResource
	 * @generated
	 */
	EClass getOtherDataResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.OtherDataResource#getDataResourceId <em>Data Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.OtherDataResource#getDataResourceId()
	 * @see #getOtherDataResource()
	 * @generated
	 */
	EAttribute getOtherDataResource_DataResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.OtherDataResource#getDataResourceContent <em>Data Resource Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.OtherDataResource#getDataResourceContent()
	 * @see #getOtherDataResource()
	 * @generated
	 */
	EAttribute getOtherDataResource_DataResourceContent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.data.VideoDataResource <em>Video Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Data Resource</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.VideoDataResource
	 * @generated
	 */
	EClass getVideoDataResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.VideoDataResource#getDataResourceId <em>Data Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Resource Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.VideoDataResource#getDataResourceId()
	 * @see #getVideoDataResource()
	 * @generated
	 */
	EAttribute getVideoDataResource_DataResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.data.VideoDataResource#getVideoData <em>Video Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Data</em>'.
	 * @see org.abchip.mimo.biz.model.content.data.VideoDataResource#getVideoData()
	 * @see #getVideoDataResource()
	 * @generated
	 */
	EAttribute getVideoDataResource_VideoData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.AudioDataResourceImpl <em>Audio Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.AudioDataResourceImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getAudioDataResource()
		 * @generated
		 */
		EClass AUDIO_DATA_RESOURCE = eINSTANCE.getAudioDataResource();

		/**
		 * The meta object literal for the '<em><b>Data Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID = eINSTANCE.getAudioDataResource_DataResourceId();

		/**
		 * The meta object literal for the '<em><b>Audio Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_DATA_RESOURCE__AUDIO_DATA = eINSTANCE.getAudioDataResource_AudioData();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.CharacterSetImpl <em>Character Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.CharacterSetImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getCharacterSet()
		 * @generated
		 */
		EClass CHARACTER_SET = eINSTANCE.getCharacterSet();

		/**
		 * The meta object literal for the '<em><b>Character Set Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_SET__CHARACTER_SET_ID = eINSTANCE.getCharacterSet_CharacterSetId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_SET__DESCRIPTION = eINSTANCE.getCharacterSet_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataCategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataCategoryImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataCategory()
		 * @generated
		 */
		EClass DATA_CATEGORY = eINSTANCE.getDataCategory();

		/**
		 * The meta object literal for the '<em><b>Data Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CATEGORY__DATA_CATEGORY_ID = eINSTANCE.getDataCategory_DataCategoryId();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CATEGORY__CATEGORY_NAME = eINSTANCE.getDataCategory_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Parent Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CATEGORY__PARENT_CATEGORY = eINSTANCE.getDataCategory_ParentCategory();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResource()
		 * @generated
		 */
		EClass DATA_RESOURCE = eINSTANCE.getDataResource();

		/**
		 * The meta object literal for the '<em><b>Data Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__DATA_RESOURCE_ID = eINSTANCE.getDataResource_DataResourceId();

		/**
		 * The meta object literal for the '<em><b>Character Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__CHARACTER_SET = eINSTANCE.getDataResource_CharacterSet();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__CREATED_BY_USER_LOGIN = eINSTANCE.getDataResource_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__CREATED_DATE = eINSTANCE.getDataResource_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Data Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_CATEGORY = eINSTANCE.getDataResource_DataCategory();

		/**
		 * The meta object literal for the '<em><b>Data Resource Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES = eINSTANCE.getDataResource_DataResourceAttributes();

		/**
		 * The meta object literal for the '<em><b>Data Resource Meta Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_RESOURCE_META_DATAS = eINSTANCE.getDataResource_DataResourceMetaDatas();

		/**
		 * The meta object literal for the '<em><b>Data Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__DATA_RESOURCE_NAME = eINSTANCE.getDataResource_DataResourceName();

		/**
		 * The meta object literal for the '<em><b>Data Resource Purposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_RESOURCE_PURPOSES = eINSTANCE.getDataResource_DataResourcePurposes();

		/**
		 * The meta object literal for the '<em><b>Data Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_RESOURCE_TYPE = eINSTANCE.getDataResource_DataResourceType();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_SOURCE = eINSTANCE.getDataResource_DataSource();

		/**
		 * The meta object literal for the '<em><b>Data Template Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__DATA_TEMPLATE_TYPE = eINSTANCE.getDataResource_DataTemplateType();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__IS_PUBLIC = eINSTANCE.getDataResource_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getDataResource_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__LAST_MODIFIED_DATE = eINSTANCE.getDataResource_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Locale String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__LOCALE_STRING = eINSTANCE.getDataResource_LocaleString();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__MIME_TYPE = eINSTANCE.getDataResource_MimeType();

		/**
		 * The meta object literal for the '<em><b>Object Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__OBJECT_INFO = eINSTANCE.getDataResource_ObjectInfo();

		/**
		 * The meta object literal for the '<em><b>Product Feature Data Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES = eINSTANCE.getDataResource_ProductFeatureDataResources();

		/**
		 * The meta object literal for the '<em><b>Related Detail Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__RELATED_DETAIL_ID = eINSTANCE.getDataResource_RelatedDetailId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__STATUS = eINSTANCE.getDataResource_Status();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__SURVEY = eINSTANCE.getDataResource_Survey();

		/**
		 * The meta object literal for the '<em><b>Survey Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE__SURVEY_RESPONSE = eINSTANCE.getDataResource_SurveyResponse();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceAttributeImpl <em>Resource Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceAttributeImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceAttribute()
		 * @generated
		 */
		EClass DATA_RESOURCE_ATTRIBUTE = eINSTANCE.getDataResourceAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_ATTRIBUTE__DATA_RESOURCE = eINSTANCE.getDataResourceAttribute_DataResource();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_ATTRIBUTE__ATTR_NAME = eINSTANCE.getDataResourceAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getDataResourceAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getDataResourceAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceMetaDataImpl <em>Resource Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceMetaDataImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceMetaData()
		 * @generated
		 */
		EClass DATA_RESOURCE_META_DATA = eINSTANCE.getDataResourceMetaData();

		/**
		 * The meta object literal for the '<em><b>Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_META_DATA__DATA_RESOURCE = eINSTANCE.getDataResourceMetaData_DataResource();

		/**
		 * The meta object literal for the '<em><b>Meta Data Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_META_DATA__META_DATA_PREDICATE = eINSTANCE.getDataResourceMetaData_MetaDataPredicate();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_META_DATA__DATA_SOURCE = eINSTANCE.getDataResourceMetaData_DataSource();

		/**
		 * The meta object literal for the '<em><b>Meta Data Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_META_DATA__META_DATA_VALUE = eINSTANCE.getDataResourceMetaData_MetaDataValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourcePurposeImpl <em>Resource Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourcePurposeImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourcePurpose()
		 * @generated
		 */
		EClass DATA_RESOURCE_PURPOSE = eINSTANCE.getDataResourcePurpose();

		/**
		 * The meta object literal for the '<em><b>Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_PURPOSE__DATA_RESOURCE = eINSTANCE.getDataResourcePurpose_DataResource();

		/**
		 * The meta object literal for the '<em><b>Content Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE = eINSTANCE.getDataResourcePurpose_ContentPurposeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceRoleImpl <em>Resource Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceRoleImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceRole()
		 * @generated
		 */
		EClass DATA_RESOURCE_ROLE = eINSTANCE.getDataResourceRole();

		/**
		 * The meta object literal for the '<em><b>Data Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_ROLE__DATA_RESOURCE = eINSTANCE.getDataResourceRole_DataResource();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_ROLE__PARTY = eINSTANCE.getDataResourceRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_ROLE__ROLE_TYPE_ID = eINSTANCE.getDataResourceRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_ROLE__FROM_DATE = eINSTANCE.getDataResourceRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_ROLE__THRU_DATE = eINSTANCE.getDataResourceRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceType()
		 * @generated
		 */
		EClass DATA_RESOURCE_TYPE = eINSTANCE.getDataResourceType();

		/**
		 * The meta object literal for the '<em><b>Data Resource Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID = eINSTANCE.getDataResourceType_DataResourceTypeId();

		/**
		 * The meta object literal for the '<em><b>Data Resource Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS = eINSTANCE.getDataResourceType_DataResourceTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_TYPE__DESCRIPTION = eINSTANCE.getDataResourceType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_TYPE__HAS_TABLE = eINSTANCE.getDataResourceType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_TYPE__PARENT_TYPE = eINSTANCE.getDataResourceType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeAttrImpl <em>Resource Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataResourceTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataResourceTypeAttr()
		 * @generated
		 */
		EClass DATA_RESOURCE_TYPE_ATTR = eINSTANCE.getDataResourceTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Data Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_TYPE_ATTR__DATA_RESOURCE_TYPE = eINSTANCE.getDataResourceTypeAttr_DataResourceType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getDataResourceTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getDataResourceTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.DataTemplateTypeImpl <em>Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataTemplateTypeImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getDataTemplateType()
		 * @generated
		 */
		EClass DATA_TEMPLATE_TYPE = eINSTANCE.getDataTemplateType();

		/**
		 * The meta object literal for the '<em><b>Data Template Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TEMPLATE_TYPE__DATA_TEMPLATE_TYPE_ID = eINSTANCE.getDataTemplateType_DataTemplateTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TEMPLATE_TYPE__DESCRIPTION = eINSTANCE.getDataTemplateType_Description();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TEMPLATE_TYPE__EXTENSION = eINSTANCE.getDataTemplateType_Extension();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.ElectronicTextImpl <em>Electronic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.ElectronicTextImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getElectronicText()
		 * @generated
		 */
		EClass ELECTRONIC_TEXT = eINSTANCE.getElectronicText();

		/**
		 * The meta object literal for the '<em><b>Text Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_TEXT__TEXT_DATA = eINSTANCE.getElectronicText_TextData();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.FileExtensionImpl <em>File Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.FileExtensionImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getFileExtension()
		 * @generated
		 */
		EClass FILE_EXTENSION = eINSTANCE.getFileExtension();

		/**
		 * The meta object literal for the '<em><b>File Extension Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_EXTENSION__FILE_EXTENSION_ID = eINSTANCE.getFileExtension_FileExtensionId();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_EXTENSION__MIME_TYPE = eINSTANCE.getFileExtension_MimeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.ImageDataResourceImpl <em>Image Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.ImageDataResourceImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getImageDataResource()
		 * @generated
		 */
		EClass IMAGE_DATA_RESOURCE = eINSTANCE.getImageDataResource();

		/**
		 * The meta object literal for the '<em><b>Image Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_DATA_RESOURCE__IMAGE_DATA = eINSTANCE.getImageDataResource_ImageData();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.MetaDataPredicateImpl <em>Meta Data Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.MetaDataPredicateImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getMetaDataPredicate()
		 * @generated
		 */
		EClass META_DATA_PREDICATE = eINSTANCE.getMetaDataPredicate();

		/**
		 * The meta object literal for the '<em><b>Meta Data Predicate Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA_PREDICATE__META_DATA_PREDICATE_ID = eINSTANCE.getMetaDataPredicate_MetaDataPredicateId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA_PREDICATE__DESCRIPTION = eINSTANCE.getMetaDataPredicate_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.MimeTypeImpl <em>Mime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.MimeTypeImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getMimeType()
		 * @generated
		 */
		EClass MIME_TYPE = eINSTANCE.getMimeType();

		/**
		 * The meta object literal for the '<em><b>Mime Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE__MIME_TYPE_ID = eINSTANCE.getMimeType_MimeTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE__DESCRIPTION = eINSTANCE.getMimeType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.MimeTypeHtmlTemplateImpl <em>Mime Type Html Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.MimeTypeHtmlTemplateImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getMimeTypeHtmlTemplate()
		 * @generated
		 */
		EClass MIME_TYPE_HTML_TEMPLATE = eINSTANCE.getMimeTypeHtmlTemplate();

		/**
		 * The meta object literal for the '<em><b>Mime Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID = eINSTANCE.getMimeTypeHtmlTemplate_MimeTypeId();

		/**
		 * The meta object literal for the '<em><b>Template Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION = eINSTANCE.getMimeTypeHtmlTemplate_TemplateLocation();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.OtherDataResourceImpl <em>Other Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.OtherDataResourceImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getOtherDataResource()
		 * @generated
		 */
		EClass OTHER_DATA_RESOURCE = eINSTANCE.getOtherDataResource();

		/**
		 * The meta object literal for the '<em><b>Data Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_DATA_RESOURCE__DATA_RESOURCE_ID = eINSTANCE.getOtherDataResource_DataResourceId();

		/**
		 * The meta object literal for the '<em><b>Data Resource Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_DATA_RESOURCE__DATA_RESOURCE_CONTENT = eINSTANCE.getOtherDataResource_DataResourceContent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.data.impl.VideoDataResourceImpl <em>Video Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.data.impl.VideoDataResourceImpl
		 * @see org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl#getVideoDataResource()
		 * @generated
		 */
		EClass VIDEO_DATA_RESOURCE = eINSTANCE.getVideoDataResource();

		/**
		 * The meta object literal for the '<em><b>Data Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID = eINSTANCE.getVideoDataResource_DataResourceId();

		/**
		 * The meta object literal for the '<em><b>Video Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_DATA_RESOURCE__VIDEO_DATA = eINSTANCE.getVideoDataResource_VideoData();

	}

} //DataPackage
