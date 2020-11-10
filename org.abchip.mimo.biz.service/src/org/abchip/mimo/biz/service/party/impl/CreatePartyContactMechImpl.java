/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.service.party.CreatePartyContactMech;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse;
import org.abchip.mimo.biz.service.party.PartyPackage;

import org.abchip.mimo.service.impl.ServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Party Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getAllowSolicitation <em>Allow Solicitation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getMonthsWithContactMech <em>Months With Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.CreatePartyContactMechImpl#getYearsWithContactMech <em>Years With Contact Mech</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreatePartyContactMechImpl extends ServiceRequestImpl<CreatePartyContactMechResponse> implements CreatePartyContactMech {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatePartyContactMechImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowSolicitation() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__ALLOW_SOLICITATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowSolicitation(String newAllowSolicitation) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__ALLOW_SOLICITATION, newAllowSolicitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechPurposeTypeId() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechPurposeTypeId(String newContactMechPurposeTypeId) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID, newContactMechPurposeTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechTypeId() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(String newContactMechTypeId) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_TYPE_ID, newContactMechTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtension() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(String newExtension) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__INFO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__INFO_STRING, newInfoString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMonthsWithContactMech() {
		return (Long)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonthsWithContactMech(long newMonthsWithContactMech) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH, newMonthsWithContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerified() {
		return (String)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__VERIFIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerified(String newVerified) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__VERIFIED, newVerified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsWithContactMech() {
		return (Long)eGet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsWithContactMech(long newYearsWithContactMech) {
		eSet(PartyPackage.Literals.CREATE_PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH, newYearsWithContactMech);
	}

} //CreatePartyContactMechImpl
