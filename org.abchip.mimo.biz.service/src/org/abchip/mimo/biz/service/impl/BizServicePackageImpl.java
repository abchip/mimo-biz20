/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.biz.BizPackage;

import org.abchip.mimo.biz.model.accounting.AccountingPackage;

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

import org.abchip.mimo.biz.model.party.PartyPackage;

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

import org.abchip.mimo.biz.service.BizServiceFactory;
import org.abchip.mimo.biz.service.BizServicePackage;
import org.abchip.mimo.biz.service.BizServiceRequest;
import org.abchip.mimo.biz.service.BizServiceResponse;
import org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl;
import org.abchip.mimo.biz.service.product.impl.ProductPackageImpl;

import org.abchip.mimo.service.ServicePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BizServicePackageImpl extends EPackageImpl implements BizServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bizServiceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bizServiceResponseEClass = null;

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
	 * @see org.abchip.mimo.biz.service.BizServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BizServicePackageImpl() {
		super(eNS_URI, BizServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BizServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BizServicePackage init() {
		if (isInited) return (BizServicePackage)EPackage.Registry.INSTANCE.getEPackage(BizServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBizServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BizServicePackageImpl theBizServicePackage = registeredBizServicePackage instanceof BizServicePackageImpl ? (BizServicePackageImpl)registeredBizServicePackage : new BizServicePackageImpl();

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
		PartyPackage.eINSTANCE.eClass();
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.entity.EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage_1 = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.entity.EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.product.ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage_1 = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.product.ProductPackage.eINSTANCE);

		// Create package meta-data objects
		theBizServicePackage.createPackageContents();
		theEntityPackage_1.createPackageContents();
		theProductPackage_1.createPackageContents();

		// Initialize created meta-data
		theBizServicePackage.initializePackageContents();
		theEntityPackage_1.initializePackageContents();
		theProductPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBizServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BizServicePackage.eNS_URI, theBizServicePackage);
		return theBizServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBizServiceRequest() {
		return bizServiceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBizServiceRequest_UserLogin() {
		return (EReference)bizServiceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBizServiceResponse() {
		return bizServiceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBizServiceResponse_UserLogin() {
		return (EReference)bizServiceResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizServiceFactory getBizServiceFactory() {
		return (BizServiceFactory)getEFactoryInstance();
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
		bizServiceRequestEClass = createEClass(BIZ_SERVICE_REQUEST);
		createEReference(bizServiceRequestEClass, BIZ_SERVICE_REQUEST__USER_LOGIN);

		bizServiceResponseEClass = createEClass(BIZ_SERVICE_RESPONSE);
		createEReference(bizServiceResponseEClass, BIZ_SERVICE_RESPONSE__USER_LOGIN);
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
		org.abchip.mimo.biz.service.entity.EntityPackage theEntityPackage_1 = (org.abchip.mimo.biz.service.entity.EntityPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.entity.EntityPackage.eNS_URI);
		org.abchip.mimo.biz.service.product.ProductPackage theProductPackage_1 = (org.abchip.mimo.biz.service.product.ProductPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.product.ProductPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEntityPackage_1);
		getESubpackages().add(theProductPackage_1);

		// Create type parameters
		ETypeParameter bizServiceRequestEClass_V = addETypeParameter(bizServiceRequestEClass, "V");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theServicePackage.getServiceResponse());
		bizServiceRequestEClass_V.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		EGenericType g2 = createEGenericType(bizServiceRequestEClass_V);
		g1.getETypeArguments().add(g2);
		bizServiceRequestEClass.getEGenericSuperTypes().add(g1);
		bizServiceResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());

		// Initialize classes and features; add operations and parameters
		initEClass(bizServiceRequestEClass, BizServiceRequest.class, "BizServiceRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBizServiceRequest_UserLogin(), theLoginPackage.getUserLogin(), null, "userLogin", null, 1, 1, BizServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bizServiceResponseEClass, BizServiceResponse.class, "BizServiceResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBizServiceResponse_UserLogin(), theLoginPackage.getUserLogin(), null, "userLogin", null, 1, 1, BizServiceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BizServicePackageImpl
