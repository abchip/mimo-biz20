/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.uom;

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
 * @see org.abchip.mimo.biz.model.common.uom.UomFactory
 * @model kind="package"
 * @generated
 */
public interface UomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/common/uom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-uom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UomPackage eINSTANCE = org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomImpl <em>Uom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomImpl
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUom()
	 * @generated
	 */
	int UOM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__UOM_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__ABBREVIATION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dated Main Uom Conversion Dateds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__DATED_MAIN_UOM_CONVERSION_DATEDS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Main Uom Conversions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__MAIN_UOM_CONVERSIONS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Numeric Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__NUMERIC_CODE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Uom Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__UOM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Uom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomConversionImpl
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomConversion()
	 * @generated
	 */
	int UOM_CONVERSION = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__UOM_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CONVERSION_FACTOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CUSTOM_METHOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__DECIMAL_SCALE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__ROUNDING_MODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomConversionDatedImpl <em>Conversion Dated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomConversionDatedImpl
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomConversionDated()
	 * @generated
	 */
	int UOM_CONVERSION_DATED = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__UOM_ID_TO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CONVERSION_FACTOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CUSTOM_METHOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__DECIMAL_SCALE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Purpose Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__PURPOSE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__ROUNDING_MODE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Conversion Dated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomGroupImpl
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomGroup()
	 * @generated
	 */
	int UOM_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uom Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__UOM_GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomTypeImpl
	 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomType()
	 * @generated
	 */
	int UOM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__UOM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.uom.Uom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom
	 * @generated
	 */
	EClass getUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.Uom#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getUomId()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_UomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getAbbreviation()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_Abbreviation();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.common.uom.Uom#getDatedMainUomConversionDateds <em>Dated Main Uom Conversion Dateds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dated Main Uom Conversion Dateds</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getDatedMainUomConversionDateds()
	 * @see #getUom()
	 * @generated
	 */
	EReference getUom_DatedMainUomConversionDateds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.Uom#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getDescription()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.common.uom.Uom#getMainUomConversions <em>Main Uom Conversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Uom Conversions</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getMainUomConversions()
	 * @see #getUom()
	 * @generated
	 */
	EReference getUom_MainUomConversions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.Uom#getNumericCode <em>Numeric Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Code</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getNumericCode()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_NumericCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.Uom#getUomType <em>Uom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Type</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.Uom#getUomType()
	 * @see #getUom()
	 * @generated
	 */
	EReference getUom_UomType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.uom.UomConversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion
	 * @generated
	 */
	EClass getUomConversion();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversion#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion#getUom()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_Uom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversion#getUomIdTo <em>Uom Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id To</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion#getUomIdTo()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_UomIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversion#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion#getConversionFactor()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversion#getCustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion#getCustomMethod()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_CustomMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversion#getDecimalScale <em>Decimal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Scale</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion#getDecimalScale()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_DecimalScale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversion#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversion#getRoundingMode()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_RoundingMode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated <em>Conversion Dated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Dated</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated
	 * @generated
	 */
	EClass getUomConversionDated();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getUom()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_Uom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getUomIdTo <em>Uom Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id To</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getUomIdTo()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_UomIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getFromDate()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getConversionFactor()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getCustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getCustomMethod()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_CustomMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getDecimalScale <em>Decimal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Scale</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getDecimalScale()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_DecimalScale();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getPurposeEnum <em>Purpose Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purpose Enum</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getPurposeEnum()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_PurposeEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getRoundingMode()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_RoundingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomConversionDated#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomConversionDated#getThruDate()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.uom.UomGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomGroup
	 * @generated
	 */
	EClass getUomGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomGroup#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomGroup#getUom()
	 * @see #getUomGroup()
	 * @generated
	 */
	EReference getUomGroup_Uom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomGroup#getUomGroupId()
	 * @see #getUomGroup()
	 * @generated
	 */
	EAttribute getUomGroup_UomGroupId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.uom.UomType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomType
	 * @generated
	 */
	EClass getUomType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomType#getUomTypeId <em>Uom Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomType#getUomTypeId()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_UomTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomType#getDescription()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.uom.UomType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomType#getHasTable()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.common.uom.UomType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.common.uom.UomType#getParentType()
	 * @see #getUomType()
	 * @generated
	 */
	EReference getUomType_ParentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UomFactory getUomFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomImpl <em>Uom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomImpl
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUom()
		 * @generated
		 */
		EClass UOM = eINSTANCE.getUom();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__UOM_ID = eINSTANCE.getUom_UomId();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__ABBREVIATION = eINSTANCE.getUom_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Dated Main Uom Conversion Dateds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM__DATED_MAIN_UOM_CONVERSION_DATEDS = eINSTANCE.getUom_DatedMainUomConversionDateds();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__DESCRIPTION = eINSTANCE.getUom_Description();

		/**
		 * The meta object literal for the '<em><b>Main Uom Conversions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM__MAIN_UOM_CONVERSIONS = eINSTANCE.getUom_MainUomConversions();

		/**
		 * The meta object literal for the '<em><b>Numeric Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__NUMERIC_CODE = eINSTANCE.getUom_NumericCode();

		/**
		 * The meta object literal for the '<em><b>Uom Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM__UOM_TYPE = eINSTANCE.getUom_UomType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomConversionImpl
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomConversion()
		 * @generated
		 */
		EClass UOM_CONVERSION = eINSTANCE.getUomConversion();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__UOM = eINSTANCE.getUomConversion_Uom();

		/**
		 * The meta object literal for the '<em><b>Uom Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__UOM_ID_TO = eINSTANCE.getUomConversion_UomIdTo();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__CONVERSION_FACTOR = eINSTANCE.getUomConversion_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Custom Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__CUSTOM_METHOD = eINSTANCE.getUomConversion_CustomMethod();

		/**
		 * The meta object literal for the '<em><b>Decimal Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__DECIMAL_SCALE = eINSTANCE.getUomConversion_DecimalScale();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__ROUNDING_MODE = eINSTANCE.getUomConversion_RoundingMode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomConversionDatedImpl <em>Conversion Dated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomConversionDatedImpl
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomConversionDated()
		 * @generated
		 */
		EClass UOM_CONVERSION_DATED = eINSTANCE.getUomConversionDated();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__UOM = eINSTANCE.getUomConversionDated_Uom();

		/**
		 * The meta object literal for the '<em><b>Uom Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__UOM_ID_TO = eINSTANCE.getUomConversionDated_UomIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__FROM_DATE = eINSTANCE.getUomConversionDated_FromDate();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__CONVERSION_FACTOR = eINSTANCE.getUomConversionDated_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Custom Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__CUSTOM_METHOD = eINSTANCE.getUomConversionDated_CustomMethod();

		/**
		 * The meta object literal for the '<em><b>Decimal Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__DECIMAL_SCALE = eINSTANCE.getUomConversionDated_DecimalScale();

		/**
		 * The meta object literal for the '<em><b>Purpose Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__PURPOSE_ENUM = eINSTANCE.getUomConversionDated_PurposeEnum();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__ROUNDING_MODE = eINSTANCE.getUomConversionDated_RoundingMode();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__THRU_DATE = eINSTANCE.getUomConversionDated_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomGroupImpl
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomGroup()
		 * @generated
		 */
		EClass UOM_GROUP = eINSTANCE.getUomGroup();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_GROUP__UOM = eINSTANCE.getUomGroup_Uom();

		/**
		 * The meta object literal for the '<em><b>Uom Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_GROUP__UOM_GROUP_ID = eINSTANCE.getUomGroup_UomGroupId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.uom.impl.UomTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomTypeImpl
		 * @see org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl#getUomType()
		 * @generated
		 */
		EClass UOM_TYPE = eINSTANCE.getUomType();

		/**
		 * The meta object literal for the '<em><b>Uom Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__UOM_TYPE_ID = eINSTANCE.getUomType_UomTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__DESCRIPTION = eINSTANCE.getUomType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__HAS_TABLE = eINSTANCE.getUomType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_TYPE__PARENT_TYPE = eINSTANCE.getUomType_ParentType();

	}

} //UomPackage
