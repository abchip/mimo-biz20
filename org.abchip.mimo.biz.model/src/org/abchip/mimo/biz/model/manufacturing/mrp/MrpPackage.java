/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.manufacturing.mrp;

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
 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpFactory
 * @model kind="package"
 * @generated
 */
public interface MrpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mrp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/manufacturing/mrp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-mrp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MrpPackage eINSTANCE = org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventImpl
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpPackageImpl#getMrpEvent()
	 * @generated
	 */
	int MRP_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mrp Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__MRP_EVENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__EVENT_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mrp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__MRP_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__EVENT_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__FACILITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Facility Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__FACILITY_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Late</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__IS_LATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventTypeImpl
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpPackageImpl#getMrpEventType()
	 * @generated
	 */
	int MRP_EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mrp Event Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__MRP_EVENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent
	 * @generated
	 */
	EClass getMrpEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getProduct()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EReference getMrpEvent_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpEventType <em>Mrp Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mrp Event Type</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpEventType()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EReference getMrpEvent_MrpEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpId <em>Mrp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mrp Id</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpId()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_MrpId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventDate <em>Event Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Date</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventDate()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_EventDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventName()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_EventName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacility()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EReference getMrpEvent_Facility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacilityIdTo <em>Facility Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Id To</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacilityIdTo()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_FacilityIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getIsLate <em>Is Late</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Late</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getIsLate()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_IsLate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getQuantity()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEventType
	 * @generated
	 */
	EClass getMrpEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEventType#getMrpEventTypeId <em>Mrp Event Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mrp Event Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEventType#getMrpEventTypeId()
	 * @see #getMrpEventType()
	 * @generated
	 */
	EAttribute getMrpEventType_MrpEventTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEventType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpEventType#getDescription()
	 * @see #getMrpEventType()
	 * @generated
	 */
	EAttribute getMrpEventType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MrpFactory getMrpFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventImpl
		 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpPackageImpl#getMrpEvent()
		 * @generated
		 */
		EClass MRP_EVENT = eINSTANCE.getMrpEvent();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRP_EVENT__PRODUCT = eINSTANCE.getMrpEvent_Product();

		/**
		 * The meta object literal for the '<em><b>Mrp Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRP_EVENT__MRP_EVENT_TYPE = eINSTANCE.getMrpEvent_MrpEventType();

		/**
		 * The meta object literal for the '<em><b>Mrp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__MRP_ID = eINSTANCE.getMrpEvent_MrpId();

		/**
		 * The meta object literal for the '<em><b>Event Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__EVENT_DATE = eINSTANCE.getMrpEvent_EventDate();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__EVENT_NAME = eINSTANCE.getMrpEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRP_EVENT__FACILITY = eINSTANCE.getMrpEvent_Facility();

		/**
		 * The meta object literal for the '<em><b>Facility Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__FACILITY_ID_TO = eINSTANCE.getMrpEvent_FacilityIdTo();

		/**
		 * The meta object literal for the '<em><b>Is Late</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__IS_LATE = eINSTANCE.getMrpEvent_IsLate();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__QUANTITY = eINSTANCE.getMrpEvent_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpEventTypeImpl
		 * @see org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpPackageImpl#getMrpEventType()
		 * @generated
		 */
		EClass MRP_EVENT_TYPE = eINSTANCE.getMrpEventType();

		/**
		 * The meta object literal for the '<em><b>Mrp Event Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT_TYPE__MRP_EVENT_TYPE_ID = eINSTANCE.getMrpEventType_MrpEventTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT_TYPE__DESCRIPTION = eINSTANCE.getMrpEventType_Description();

	}

} //MrpPackage
