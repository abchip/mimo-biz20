/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party.impl;

import org.abchip.mimo.biz.service.party.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyFactoryImpl extends EFactoryImpl implements PartyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartyFactory init() {
		try {
			PartyFactory thePartyFactory = (PartyFactory)EPackage.Registry.INSTANCE.getEFactory(PartyPackage.eNS_URI);
			if (thePartyFactory != null) {
				return thePartyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PartyPackage.CREATE_PARTY_CONTACT_MECH: return (EObject)createCreatePartyContactMech();
			case PartyPackage.CREATE_PARTY_CONTACT_MECH_RESPONSE: return (EObject)createCreatePartyContactMechResponse();
			case PartyPackage.CREATE_PARTY_CONTACT_MECH_PURPOSE: return (EObject)createCreatePartyContactMechPurpose();
			case PartyPackage.CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE: return (EObject)createCreatePartyContactMechPurposeResponse();
			case PartyPackage.GET_PARTY_DEFAULT: return (EObject)createGetPartyDefault();
			case PartyPackage.GET_PARTY_DEFAULT_RESPONSE: return (EObject)createGetPartyDefaultResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPartyDefault createGetPartyDefault() {
		GetPartyDefaultImpl getPartyDefault = new GetPartyDefaultImpl();
		return getPartyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPartyDefaultResponse createGetPartyDefaultResponse() {
		GetPartyDefaultResponseImpl getPartyDefaultResponse = new GetPartyDefaultResponseImpl();
		return getPartyDefaultResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatePartyContactMech createCreatePartyContactMech() {
		CreatePartyContactMechImpl createPartyContactMech = new CreatePartyContactMechImpl();
		return createPartyContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatePartyContactMechResponse createCreatePartyContactMechResponse() {
		CreatePartyContactMechResponseImpl createPartyContactMechResponse = new CreatePartyContactMechResponseImpl();
		return createPartyContactMechResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatePartyContactMechPurpose createCreatePartyContactMechPurpose() {
		CreatePartyContactMechPurposeImpl createPartyContactMechPurpose = new CreatePartyContactMechPurposeImpl();
		return createPartyContactMechPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatePartyContactMechPurposeResponse createCreatePartyContactMechPurposeResponse() {
		CreatePartyContactMechPurposeResponseImpl createPartyContactMechPurposeResponse = new CreatePartyContactMechPurposeResponseImpl();
		return createPartyContactMechPurposeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyPackage getPartyPackage() {
		return (PartyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartyPackage getPackage() {
		return PartyPackage.eINSTANCE;
	}

} //PartyFactoryImpl
