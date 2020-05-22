/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.party.PartyPackage
 * @generated
 */
public interface PartyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartyFactory eINSTANCE = org.abchip.mimo.biz.service.party.impl.PartyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Get Party Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Party Default</em>'.
	 * @generated
	 */
	GetPartyDefault createGetPartyDefault();

	/**
	 * Returns a new object of class '<em>Get Party Default Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Party Default Response</em>'.
	 * @generated
	 */
	GetPartyDefaultResponse createGetPartyDefaultResponse();

	/**
	 * Returns a new object of class '<em>Create Party Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Party Contact Mech</em>'.
	 * @generated
	 */
	CreatePartyContactMech createCreatePartyContactMech();

	/**
	 * Returns a new object of class '<em>Create Party Contact Mech Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Party Contact Mech Response</em>'.
	 * @generated
	 */
	CreatePartyContactMechResponse createCreatePartyContactMechResponse();

	/**
	 * Returns a new object of class '<em>Create Party Contact Mech Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Party Contact Mech Purpose</em>'.
	 * @generated
	 */
	CreatePartyContactMechPurpose createCreatePartyContactMechPurpose();

	/**
	 * Returns a new object of class '<em>Create Party Contact Mech Purpose Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Party Contact Mech Purpose Response</em>'.
	 * @generated
	 */
	CreatePartyContactMechPurposeResponse createCreatePartyContactMechPurposeResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PartyPackage getPartyPackage();

} //PartyFactory
