/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.reservations;

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
 * @see org.abchip.mimo.biz.model.order.reservations.ReservationsFactory
 * @model kind="package"
 * @generated
 */
public interface ReservationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reservations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/order/reservations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-reservations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReservationsPackage eINSTANCE = org.abchip.mimo.biz.model.order.reservations.impl.ReservationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.reservations.impl.AccommodationSpotImpl <em>Accommodation Spot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.reservations.impl.AccommodationSpotImpl
	 * @see org.abchip.mimo.biz.model.order.reservations.impl.ReservationsPackageImpl#getAccommodationSpot()
	 * @generated
	 */
	int ACCOMMODATION_SPOT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accommodation Spot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accommodation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__ACCOMMODATION_CLASS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__FIXED_ASSET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Of Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__NUMBER_OF_SPACES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Accommodation Spot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.reservations.AccommodationSpot <em>Accommodation Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accommodation Spot</em>'.
	 * @see org.abchip.mimo.biz.model.order.reservations.AccommodationSpot
	 * @generated
	 */
	EClass getAccommodationSpot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getAccommodationSpotId <em>Accommodation Spot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accommodation Spot Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getAccommodationSpotId()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EAttribute getAccommodationSpot_AccommodationSpotId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getAccommodationClass <em>Accommodation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accommodation Class</em>'.
	 * @see org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getAccommodationClass()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EReference getAccommodationSpot_AccommodationClass();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getDescription()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EAttribute getAccommodationSpot_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getFixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset</em>'.
	 * @see org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getFixedAsset()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EReference getAccommodationSpot_FixedAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getNumberOfSpaces <em>Number Of Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Spaces</em>'.
	 * @see org.abchip.mimo.biz.model.order.reservations.AccommodationSpot#getNumberOfSpaces()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EAttribute getAccommodationSpot_NumberOfSpaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReservationsFactory getReservationsFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.reservations.impl.AccommodationSpotImpl <em>Accommodation Spot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.reservations.impl.AccommodationSpotImpl
		 * @see org.abchip.mimo.biz.model.order.reservations.impl.ReservationsPackageImpl#getAccommodationSpot()
		 * @generated
		 */
		EClass ACCOMMODATION_SPOT = eINSTANCE.getAccommodationSpot();

		/**
		 * The meta object literal for the '<em><b>Accommodation Spot Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID = eINSTANCE.getAccommodationSpot_AccommodationSpotId();

		/**
		 * The meta object literal for the '<em><b>Accommodation Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_SPOT__ACCOMMODATION_CLASS = eINSTANCE.getAccommodationSpot_AccommodationClass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_SPOT__DESCRIPTION = eINSTANCE.getAccommodationSpot_Description();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_SPOT__FIXED_ASSET = eINSTANCE.getAccommodationSpot_FixedAsset();

		/**
		 * The meta object literal for the '<em><b>Number Of Spaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_SPOT__NUMBER_OF_SPACES = eINSTANCE.getAccommodationSpot_NumberOfSpaces();

	}

} //ReservationsPackage
