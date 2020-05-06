/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.property;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.abchip.mimo.biz.model.common.property.PropertyFactory
 * @model kind="package"
 * @generated
 */
public interface PropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "property";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/common/property";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-property";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertyPackage eINSTANCE = org.abchip.mimo.biz.model.common.property.impl.PropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.common.property.impl.SystemPropertyImpl <em>System Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.common.property.impl.SystemPropertyImpl
	 * @see org.abchip.mimo.biz.model.common.property.impl.PropertyPackageImpl#getSystemProperty()
	 * @generated
	 */
	int SYSTEM_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Property Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>System Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>System Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.common.property.SystemProperty <em>System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Property</em>'.
	 * @see org.abchip.mimo.biz.model.common.property.SystemProperty
	 * @generated
	 */
	EClass getSystemProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.property.SystemProperty#getSystemResourceId <em>System Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Resource Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.property.SystemProperty#getSystemResourceId()
	 * @see #getSystemProperty()
	 * @generated
	 */
	EAttribute getSystemProperty_SystemResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.property.SystemProperty#getSystemPropertyId <em>System Property Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Property Id</em>'.
	 * @see org.abchip.mimo.biz.model.common.property.SystemProperty#getSystemPropertyId()
	 * @see #getSystemProperty()
	 * @generated
	 */
	EAttribute getSystemProperty_SystemPropertyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.property.SystemProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.common.property.SystemProperty#getDescription()
	 * @see #getSystemProperty()
	 * @generated
	 */
	EAttribute getSystemProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.common.property.SystemProperty#getSystemPropertyValue <em>System Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Property Value</em>'.
	 * @see org.abchip.mimo.biz.model.common.property.SystemProperty#getSystemPropertyValue()
	 * @see #getSystemProperty()
	 * @generated
	 */
	EAttribute getSystemProperty_SystemPropertyValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertyFactory getPropertyFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.common.property.impl.SystemPropertyImpl <em>System Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.common.property.impl.SystemPropertyImpl
		 * @see org.abchip.mimo.biz.model.common.property.impl.PropertyPackageImpl#getSystemProperty()
		 * @generated
		 */
		EClass SYSTEM_PROPERTY = eINSTANCE.getSystemProperty();

		/**
		 * The meta object literal for the '<em><b>System Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID = eINSTANCE.getSystemProperty_SystemResourceId();

		/**
		 * The meta object literal for the '<em><b>System Property Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID = eINSTANCE.getSystemProperty_SystemPropertyId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PROPERTY__DESCRIPTION = eINSTANCE.getSystemProperty_Description();

		/**
		 * The meta object literal for the '<em><b>System Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE = eINSTANCE.getSystemProperty_SystemPropertyValue();

	}

} //PropertyPackage
