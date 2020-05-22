/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.biz.BizPackage;

import org.abchip.mimo.biz.model.accounting.AccountingPackage;

import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.model.catalina.session.SessionPackage;

import org.abchip.mimo.biz.model.common.CommonPackage;

import org.abchip.mimo.biz.model.content.content.ContentPackage;

import org.abchip.mimo.biz.model.content.data.DataPackage;

import org.abchip.mimo.biz.model.content.document.DocumentPackage;

import org.abchip.mimo.biz.model.content.preference.PreferencePackage;

import org.abchip.mimo.biz.model.content.survey.SurveyPackage;

import org.abchip.mimo.biz.model.content.website.WebsitePackage;

import org.abchip.mimo.biz.model.entity.EntityPackage;

import org.abchip.mimo.biz.model.humanres.ability.AbilityPackage;

import org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage;

import org.abchip.mimo.biz.model.humanres.position.PositionPackage;

import org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage;

import org.abchip.mimo.biz.model.humanres.trainings.TrainingsPackage;

import org.abchip.mimo.biz.model.manufacturing.bom.BomPackage;

import org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage;

import org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage;

import org.abchip.mimo.biz.model.marketing.campaign.CampaignPackage;

import org.abchip.mimo.biz.model.marketing.contact.ContactPackage;

import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage;

import org.abchip.mimo.biz.model.marketing.segment.SegmentPackage;

import org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage;

import org.abchip.mimo.biz.model.order.order.OrderPackage;

import org.abchip.mimo.biz.model.order.quote.QuotePackage;

import org.abchip.mimo.biz.model.order.request.RequestPackage;

import org.abchip.mimo.biz.model.order.requirement.RequirementPackage;

import org.abchip.mimo.biz.model.order.reservations.ReservationsPackage;

import org.abchip.mimo.biz.model.order.return_.ReturnPackage;

import org.abchip.mimo.biz.model.order.shoppingcart.ShoppingcartPackage;

import org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage;

import org.abchip.mimo.biz.model.passport.PassportPackage;

import org.abchip.mimo.biz.model.product.catalog.CatalogPackage;

import org.abchip.mimo.biz.model.product.category.CategoryPackage;

import org.abchip.mimo.biz.model.product.config.ConfigPackage;

import org.abchip.mimo.biz.model.product.cost.CostPackage;

import org.abchip.mimo.biz.model.product.facility.FacilityPackage;

import org.abchip.mimo.biz.model.product.feature.FeaturePackage;

import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;

import org.abchip.mimo.biz.model.product.price.PricePackage;

import org.abchip.mimo.biz.model.product.product.ProductPackage;

import org.abchip.mimo.biz.model.product.promo.PromoPackage;

import org.abchip.mimo.biz.model.product.store.StorePackage;

import org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage;

import org.abchip.mimo.biz.model.product.supplier.SupplierPackage;

import org.abchip.mimo.biz.model.security.cert.CertPackage;

import org.abchip.mimo.biz.model.security.login.LoginPackage;

import org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage;

import org.abchip.mimo.biz.model.service.schedule.SchedulePackage;

import org.abchip.mimo.biz.model.service.semaphore.SemaphorePackage;

import org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage;

import org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage;

import org.abchip.mimo.biz.model.shipment.receipt.ReceiptPackage;

import org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package;

import org.abchip.mimo.biz.model.webapp.visit.VisitPackage;

import org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage;

import org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage;
import org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl;

import org.abchip.mimo.biz.service.common.impl.CommonPackageImpl;

import org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl;
import org.abchip.mimo.biz.service.order.impl.OrderPackageImpl;

import org.abchip.mimo.biz.service.party.CreatePartyContactMech;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechPurposeResponse;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.party.PartyFactory;
import org.abchip.mimo.biz.service.party.PartyPackage;

import org.abchip.mimo.biz.service.product.impl.ProductPackageImpl;
import org.abchip.mimo.java.JavaPackage;

import org.abchip.mimo.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyPackageImpl extends EPackageImpl implements PartyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPartyDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPartyDefaultResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPartyContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPartyContactMechResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPartyContactMechPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPartyContactMechPurposeResponseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.biz.service.party.PartyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartyPackageImpl() {
		super(eNS_URI, PartyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PartyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartyPackage init() {
		if (isInited) return (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPartyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PartyPackageImpl thePartyPackage = registeredPartyPackage instanceof PartyPackageImpl ? (PartyPackageImpl)registeredPartyPackage : new PartyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BizPackage.eINSTANCE.eClass();
		AccountingPackage.eINSTANCE.eClass();
		SessionPackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		ContentPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		DocumentPackage.eINSTANCE.eClass();
		PreferencePackage.eINSTANCE.eClass();
		SurveyPackage.eINSTANCE.eClass();
		WebsitePackage.eINSTANCE.eClass();
		EntityPackage.eINSTANCE.eClass();
		AbilityPackage.eINSTANCE.eClass();
		EmploymentPackage.eINSTANCE.eClass();
		PositionPackage.eINSTANCE.eClass();
		RecruitmentPackage.eINSTANCE.eClass();
		TrainingsPackage.eINSTANCE.eClass();
		BomPackage.eINSTANCE.eClass();
		MrpPackage.eINSTANCE.eClass();
		TechdataPackage.eINSTANCE.eClass();
		CampaignPackage.eINSTANCE.eClass();
		ContactPackage.eINSTANCE.eClass();
		OpportunityPackage.eINSTANCE.eClass();
		SegmentPackage.eINSTANCE.eClass();
		TrackingPackage.eINSTANCE.eClass();
		OrderPackage.eINSTANCE.eClass();
		QuotePackage.eINSTANCE.eClass();
		RequestPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		ReservationsPackage.eINSTANCE.eClass();
		ReturnPackage.eINSTANCE.eClass();
		ShoppingcartPackage.eINSTANCE.eClass();
		ShoppinglistPackage.eINSTANCE.eClass();
		org.abchip.mimo.biz.model.party.PartyPackage.eINSTANCE.eClass();
		PassportPackage.eINSTANCE.eClass();
		CatalogPackage.eINSTANCE.eClass();
		CategoryPackage.eINSTANCE.eClass();
		ConfigPackage.eINSTANCE.eClass();
		CostPackage.eINSTANCE.eClass();
		FacilityPackage.eINSTANCE.eClass();
		FeaturePackage.eINSTANCE.eClass();
		InventoryPackage.eINSTANCE.eClass();
		PricePackage.eINSTANCE.eClass();
		ProductPackage.eINSTANCE.eClass();
		PromoPackage.eINSTANCE.eClass();
		StorePackage.eINSTANCE.eClass();
		SubscriptionPackage.eINSTANCE.eClass();
		SupplierPackage.eINSTANCE.eClass();
		CertPackage.eINSTANCE.eClass();
		LoginPackage.eINSTANCE.eClass();
		SecuritygroupPackage.eINSTANCE.eClass();
		SchedulePackage.eINSTANCE.eClass();
		SemaphorePackage.eINSTANCE.eClass();
		IssuancePackage.eINSTANCE.eClass();
		PicklistPackage.eINSTANCE.eClass();
		ReceiptPackage.eINSTANCE.eClass();
		Shipment_Package.eINSTANCE.eClass();
		VisitPackage.eINSTANCE.eClass();
		org.abchip.mimo.biz.model.webapp.website.WebsitePackage.eINSTANCE.eClass();
		TimesheetPackage.eINSTANCE.eClass();
		WorkeffortPackage.eINSTANCE.eClass();
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.accounting.AccountingPackage.eNS_URI);
		AccountingPackageImpl theAccountingPackage_1 = (AccountingPackageImpl)(registeredPackage instanceof AccountingPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.accounting.AccountingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.common.CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage_1 = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.common.CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.entity.EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage_1 = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.entity.EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.order.OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage_1 = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.order.OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.product.ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage_1 = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.product.ProductPackage.eINSTANCE);

		// Create package meta-data objects
		thePartyPackage.createPackageContents();
		theAccountingPackage_1.createPackageContents();
		theCommonPackage_1.createPackageContents();
		theEntityPackage_1.createPackageContents();
		theOrderPackage_1.createPackageContents();
		theProductPackage_1.createPackageContents();

		// Initialize created meta-data
		thePartyPackage.initializePackageContents();
		theAccountingPackage_1.initializePackageContents();
		theCommonPackage_1.initializePackageContents();
		theEntityPackage_1.initializePackageContents();
		theOrderPackage_1.initializePackageContents();
		theProductPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePartyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartyPackage.eNS_URI, thePartyPackage);
		return thePartyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPartyDefault() {
		return getPartyDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPartyDefaultResponse() {
		return getPartyDefaultResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPartyDefaultResponse_Organization() {
		return (EReference)getPartyDefaultResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPartyDefaultResponse_AccountingPreference() {
		return (EReference)getPartyDefaultResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreatePartyContactMech() {
		return createPartyContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_AllowSolicitation() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_Comments() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_ContactMechId() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_ContactMechPurposeTypeId() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_ContactMechTypeId() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_Extension() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_FromDate() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_InfoString() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_MonthsWithContactMech() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_PartyId() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_RoleTypeId() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_ThruDate() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_Verified() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMech_YearsWithContactMech() {
		return (EAttribute)createPartyContactMechEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreatePartyContactMechResponse() {
		return createPartyContactMechResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMechResponse_ContactMechId() {
		return (EAttribute)createPartyContactMechResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreatePartyContactMechPurpose() {
		return createPartyContactMechPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMechPurpose_ContactMechId() {
		return (EAttribute)createPartyContactMechPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMechPurpose_ContactMechPurposeTypeId() {
		return (EAttribute)createPartyContactMechPurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMechPurpose_FromDate() {
		return (EAttribute)createPartyContactMechPurposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMechPurpose_PartyId() {
		return (EAttribute)createPartyContactMechPurposeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreatePartyContactMechPurposeResponse() {
		return createPartyContactMechPurposeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreatePartyContactMechPurposeResponse_FromDate() {
		return (EAttribute)createPartyContactMechPurposeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyFactory getPartyFactory() {
		return (PartyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		createPartyContactMechEClass = createEClass(CREATE_PARTY_CONTACT_MECH);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__ALLOW_SOLICITATION);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__COMMENTS);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_ID);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__CONTACT_MECH_TYPE_ID);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__EXTENSION);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__FROM_DATE);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__INFO_STRING);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__PARTY_ID);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__ROLE_TYPE_ID);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__THRU_DATE);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__VERIFIED);
		createEAttribute(createPartyContactMechEClass, CREATE_PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH);

		createPartyContactMechResponseEClass = createEClass(CREATE_PARTY_CONTACT_MECH_RESPONSE);
		createEAttribute(createPartyContactMechResponseEClass, CREATE_PARTY_CONTACT_MECH_RESPONSE__CONTACT_MECH_ID);

		createPartyContactMechPurposeEClass = createEClass(CREATE_PARTY_CONTACT_MECH_PURPOSE);
		createEAttribute(createPartyContactMechPurposeEClass, CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID);
		createEAttribute(createPartyContactMechPurposeEClass, CREATE_PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID);
		createEAttribute(createPartyContactMechPurposeEClass, CREATE_PARTY_CONTACT_MECH_PURPOSE__FROM_DATE);
		createEAttribute(createPartyContactMechPurposeEClass, CREATE_PARTY_CONTACT_MECH_PURPOSE__PARTY_ID);

		createPartyContactMechPurposeResponseEClass = createEClass(CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE);
		createEAttribute(createPartyContactMechPurposeResponseEClass, CREATE_PARTY_CONTACT_MECH_PURPOSE_RESPONSE__FROM_DATE);

		getPartyDefaultEClass = createEClass(GET_PARTY_DEFAULT);

		getPartyDefaultResponseEClass = createEClass(GET_PARTY_DEFAULT_RESPONSE);
		createEReference(getPartyDefaultResponseEClass, GET_PARTY_DEFAULT_RESPONSE__ORGANIZATION);
		createEReference(getPartyDefaultResponseEClass, GET_PARTY_DEFAULT_RESPONSE__ACCOUNTING_PREFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		org.abchip.mimo.biz.model.party.party.PartyPackage thePartyPackage_2 = (org.abchip.mimo.biz.model.party.party.PartyPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.party.party.PartyPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theServicePackage.getServiceRequest());
		EGenericType g2 = createEGenericType(this.getCreatePartyContactMechResponse());
		g1.getETypeArguments().add(g2);
		createPartyContactMechEClass.getEGenericSuperTypes().add(g1);
		createPartyContactMechResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(this.getCreatePartyContactMechPurposeResponse());
		g1.getETypeArguments().add(g2);
		createPartyContactMechPurposeEClass.getEGenericSuperTypes().add(g1);
		createPartyContactMechPurposeResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(this.getGetPartyDefaultResponse());
		g1.getETypeArguments().add(g2);
		getPartyDefaultEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theJavaPackage.getJavaCallable());
		g2 = createEGenericType(this.getGetPartyDefaultResponse());
		g1.getETypeArguments().add(g2);
		getPartyDefaultEClass.getEGenericSuperTypes().add(g1);
		getPartyDefaultResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());

		// Initialize classes and features; add operations and parameters
		initEClass(createPartyContactMechEClass, CreatePartyContactMech.class, "CreatePartyContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreatePartyContactMech_AllowSolicitation(), ecorePackage.getEString(), "allowSolicitation", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_ContactMechPurposeTypeId(), ecorePackage.getEString(), "contactMechPurposeTypeId", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_ContactMechTypeId(), ecorePackage.getEString(), "contactMechTypeId", null, 1, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_InfoString(), ecorePackage.getEString(), "infoString", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_MonthsWithContactMech(), ecorePackage.getELong(), "monthsWithContactMech", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_Verified(), ecorePackage.getEString(), "verified", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMech_YearsWithContactMech(), ecorePackage.getELong(), "yearsWithContactMech", null, 0, 1, CreatePartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createPartyContactMechResponseEClass, CreatePartyContactMechResponse.class, "CreatePartyContactMechResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreatePartyContactMechResponse_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, CreatePartyContactMechResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createPartyContactMechPurposeEClass, CreatePartyContactMechPurpose.class, "CreatePartyContactMechPurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreatePartyContactMechPurpose_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 1, 1, CreatePartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMechPurpose_ContactMechPurposeTypeId(), ecorePackage.getEString(), "contactMechPurposeTypeId", null, 1, 1, CreatePartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMechPurpose_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, CreatePartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePartyContactMechPurpose_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, CreatePartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createPartyContactMechPurposeResponseEClass, CreatePartyContactMechPurposeResponse.class, "CreatePartyContactMechPurposeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreatePartyContactMechPurposeResponse_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, CreatePartyContactMechPurposeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPartyDefaultEClass, GetPartyDefault.class, "GetPartyDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getPartyDefaultResponseEClass, GetPartyDefaultResponse.class, "GetPartyDefaultResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPartyDefaultResponse_Organization(), thePartyPackage_2.getParty(), null, "organization", null, 1, 1, GetPartyDefaultResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetPartyDefaultResponse_AccountingPreference(), theLedgerPackage.getPartyAcctgPreference(), null, "accountingPreference", null, 1, 1, GetPartyDefaultResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PartyPackageImpl
