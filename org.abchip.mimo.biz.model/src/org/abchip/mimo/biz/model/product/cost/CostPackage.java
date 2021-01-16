/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.cost;

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
 * @see org.abchip.mimo.biz.model.product.cost.CostFactory
 * @model kind="package"
 * @generated
 */
public interface CostPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cost";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/product/cost";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-cost";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CostPackage eINSTANCE = org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponent()
	 * @generated
	 */
	int COST_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost Component Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Component Calc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_CALC = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cost Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_COMPONENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cost Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__COST_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__FIXED_ASSET = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__PRODUCT_FEATURE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT__WORK_EFFORT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentAttributeImpl <em>Component Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentAttributeImpl
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentAttribute()
	 * @generated
	 */
	int COST_COMPONENT_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__COST_COMPONENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Component Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl <em>Component Calc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentCalc()
	 * @generated
	 */
	int COST_COMPONENT_CALC = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Component Calc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__COST_CUSTOM_METHOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__CURRENCY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__FIXED_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Offsetting Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Per Milli Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__PER_MILLI_SECOND = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC__VARIABLE_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Component Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_CALC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeImpl
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentType()
	 * @generated
	 */
	int COST_COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Component Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost Component Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeAttrImpl <em>Component Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentTypeAttr()
	 * @generated
	 */
	int COST_COMPONENT_TYPE_ATTR = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__COST_COMPONENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_COMPONENT_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.product.cost.impl.ProductCostComponentCalcImpl <em>Product Cost Component Calc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.product.cost.impl.ProductCostComponentCalcImpl
	 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getProductCostComponentCalc()
	 * @generated
	 */
	int PRODUCT_COST_COMPONENT_CALC = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Component Calc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Product Cost Component Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COST_COMPONENT_CALC_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.cost.CostComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent
	 * @generated
	 */
	EClass getCostComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentId <em>Cost Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Component Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentId()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_CostComponentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getCost()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_Cost();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentAttributes <em>Cost Component Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Component Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentAttributes()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostComponentAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentCalc <em>Cost Component Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Calc</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentCalc()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostComponentCalc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentType <em>Cost Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentType()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostComponentType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostUom <em>Cost Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getCostUom()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_CostUom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getFixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getFixedAsset()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_FixedAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getFromDate()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getGeo()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_Geo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getParty()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getProduct()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getProductFeature()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_ProductFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getThruDate()
	 * @see #getCostComponent()
	 * @generated
	 */
	EAttribute getCostComponent_ThruDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponent#getWorkEffort()
	 * @see #getCostComponent()
	 * @generated
	 */
	EReference getCostComponent_WorkEffort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.cost.CostComponentAttribute <em>Component Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentAttribute
	 * @generated
	 */
	EClass getCostComponentAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getCostComponent <em>Cost Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getCostComponent()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EReference getCostComponentAttribute_CostComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getAttrName()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EAttribute getCostComponentAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getAttrDescription()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EAttribute getCostComponentAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentAttribute#getAttrValue()
	 * @see #getCostComponentAttribute()
	 * @generated
	 */
	EAttribute getCostComponentAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc <em>Component Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Calc</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc
	 * @generated
	 */
	EClass getCostComponentCalc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Component Calc Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostComponentCalcId()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_CostComponentCalcId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostCustomMethod <em>Cost Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Custom Method</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostCustomMethod()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_CostCustomMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostGlAccountType <em>Cost Gl Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Gl Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostGlAccountType()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_CostGlAccountType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCurrencyUom()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getDescription()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getFixedCost <em>Fixed Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Cost</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getFixedCost()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_FixedCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getOffsettingGlAccountType <em>Offsetting Gl Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offsetting Gl Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getOffsettingGlAccountType()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EReference getCostComponentCalc_OffsettingGlAccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getPerMilliSecond <em>Per Milli Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Milli Second</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getPerMilliSecond()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_PerMilliSecond();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getVariableCost <em>Variable Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Cost</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getVariableCost()
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	EAttribute getCostComponentCalc_VariableCost();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.cost.CostComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentType
	 * @generated
	 */
	EClass getCostComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentType#getCostComponentTypeId <em>Cost Component Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Component Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentType#getCostComponentTypeId()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EAttribute getCostComponentType_CostComponentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.product.cost.CostComponentType#getCostComponentTypeAttrs <em>Cost Component Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Component Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentType#getCostComponentTypeAttrs()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EReference getCostComponentType_CostComponentTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentType#getDescription()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EAttribute getCostComponentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentType#getHasTable()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EAttribute getCostComponentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentType#getParentType()
	 * @see #getCostComponentType()
	 * @generated
	 */
	EReference getCostComponentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr <em>Component Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr
	 * @generated
	 */
	EClass getCostComponentTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr#getCostComponentType <em>Cost Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr#getCostComponentType()
	 * @see #getCostComponentTypeAttr()
	 * @generated
	 */
	EReference getCostComponentTypeAttr_CostComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr#getAttrName()
	 * @see #getCostComponentTypeAttr()
	 * @generated
	 */
	EAttribute getCostComponentTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.CostComponentTypeAttr#getDescription()
	 * @see #getCostComponentTypeAttr()
	 * @generated
	 */
	EAttribute getCostComponentTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc <em>Product Cost Component Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Cost Component Calc</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc
	 * @generated
	 */
	EClass getProductCostComponentCalc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getProduct()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EReference getProductCostComponentCalc_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getCostComponentType <em>Cost Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Type</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getCostComponentType()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EReference getProductCostComponentCalc_CostComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getFromDate()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EAttribute getProductCostComponentCalc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getCostComponentCalc <em>Cost Component Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Component Calc</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getCostComponentCalc()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EReference getProductCostComponentCalc_CostComponentCalc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getSequenceNum()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EAttribute getProductCostComponentCalc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.product.cost.ProductCostComponentCalc#getThruDate()
	 * @see #getProductCostComponentCalc()
	 * @generated
	 */
	EAttribute getProductCostComponentCalc_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CostFactory getCostFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponent()
		 * @generated
		 */
		EClass COST_COMPONENT = eINSTANCE.getCostComponent();

		/**
		 * The meta object literal for the '<em><b>Cost Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__COST_COMPONENT_ID = eINSTANCE.getCostComponent_CostComponentId();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__COST = eINSTANCE.getCostComponent_Cost();

		/**
		 * The meta object literal for the '<em><b>Cost Component Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_COMPONENT_ATTRIBUTES = eINSTANCE.getCostComponent_CostComponentAttributes();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_COMPONENT_CALC = eINSTANCE.getCostComponent_CostComponentCalc();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_COMPONENT_TYPE = eINSTANCE.getCostComponent_CostComponentType();

		/**
		 * The meta object literal for the '<em><b>Cost Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__COST_UOM = eINSTANCE.getCostComponent_CostUom();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__FIXED_ASSET = eINSTANCE.getCostComponent_FixedAsset();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__FROM_DATE = eINSTANCE.getCostComponent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__GEO = eINSTANCE.getCostComponent_Geo();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__PARTY = eINSTANCE.getCostComponent_Party();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__PRODUCT = eINSTANCE.getCostComponent_Product();

		/**
		 * The meta object literal for the '<em><b>Product Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__PRODUCT_FEATURE = eINSTANCE.getCostComponent_ProductFeature();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT__THRU_DATE = eINSTANCE.getCostComponent_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT__WORK_EFFORT = eINSTANCE.getCostComponent_WorkEffort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentAttributeImpl <em>Component Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentAttributeImpl
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentAttribute()
		 * @generated
		 */
		EClass COST_COMPONENT_ATTRIBUTE = eINSTANCE.getCostComponentAttribute();

		/**
		 * The meta object literal for the '<em><b>Cost Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_ATTRIBUTE__COST_COMPONENT = eINSTANCE.getCostComponentAttribute_CostComponent();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getCostComponentAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getCostComponentAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getCostComponentAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl <em>Component Calc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentCalc()
		 * @generated
		 */
		EClass COST_COMPONENT_CALC = eINSTANCE.getCostComponentCalc();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID = eINSTANCE.getCostComponentCalc_CostComponentCalcId();

		/**
		 * The meta object literal for the '<em><b>Cost Custom Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__COST_CUSTOM_METHOD = eINSTANCE.getCostComponentCalc_CostCustomMethod();

		/**
		 * The meta object literal for the '<em><b>Cost Gl Account Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE = eINSTANCE.getCostComponentCalc_CostGlAccountType();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__CURRENCY_UOM = eINSTANCE.getCostComponentCalc_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__DESCRIPTION = eINSTANCE.getCostComponentCalc_Description();

		/**
		 * The meta object literal for the '<em><b>Fixed Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__FIXED_COST = eINSTANCE.getCostComponentCalc_FixedCost();

		/**
		 * The meta object literal for the '<em><b>Offsetting Gl Account Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE = eINSTANCE.getCostComponentCalc_OffsettingGlAccountType();

		/**
		 * The meta object literal for the '<em><b>Per Milli Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__PER_MILLI_SECOND = eINSTANCE.getCostComponentCalc_PerMilliSecond();

		/**
		 * The meta object literal for the '<em><b>Variable Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_CALC__VARIABLE_COST = eINSTANCE.getCostComponentCalc_VariableCost();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeImpl
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentType()
		 * @generated
		 */
		EClass COST_COMPONENT_TYPE = eINSTANCE.getCostComponentType();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ID = eINSTANCE.getCostComponentType_CostComponentTypeId();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_TYPE__COST_COMPONENT_TYPE_ATTRS = eINSTANCE.getCostComponentType_CostComponentTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE__DESCRIPTION = eINSTANCE.getCostComponentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE__HAS_TABLE = eINSTANCE.getCostComponentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_TYPE__PARENT_TYPE = eINSTANCE.getCostComponentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeAttrImpl <em>Component Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostComponentTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getCostComponentTypeAttr()
		 * @generated
		 */
		EClass COST_COMPONENT_TYPE_ATTR = eINSTANCE.getCostComponentTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_COMPONENT_TYPE_ATTR__COST_COMPONENT_TYPE = eINSTANCE.getCostComponentTypeAttr_CostComponentType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getCostComponentTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_COMPONENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getCostComponentTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.product.cost.impl.ProductCostComponentCalcImpl <em>Product Cost Component Calc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.product.cost.impl.ProductCostComponentCalcImpl
		 * @see org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl#getProductCostComponentCalc()
		 * @generated
		 */
		EClass PRODUCT_COST_COMPONENT_CALC = eINSTANCE.getProductCostComponentCalc();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COST_COMPONENT_CALC__PRODUCT = eINSTANCE.getProductCostComponentCalc_Product();

		/**
		 * The meta object literal for the '<em><b>Cost Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_TYPE = eINSTANCE.getProductCostComponentCalc_CostComponentType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COST_COMPONENT_CALC__FROM_DATE = eINSTANCE.getProductCostComponentCalc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COST_COMPONENT_CALC__COST_COMPONENT_CALC = eINSTANCE.getProductCostComponentCalc_CostComponentCalc();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COST_COMPONENT_CALC__SEQUENCE_NUM = eINSTANCE.getProductCostComponentCalc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COST_COMPONENT_CALC__THRU_DATE = eINSTANCE.getProductCostComponentCalc_ThruDate();

	}

} //CostPackage
