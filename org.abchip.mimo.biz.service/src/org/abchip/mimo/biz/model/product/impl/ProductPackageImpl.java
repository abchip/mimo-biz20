/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.impl;

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
import org.abchip.mimo.biz.model.product.CalculateProductPrice;
import org.abchip.mimo.biz.model.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.model.product.ProductFactory;
import org.abchip.mimo.biz.model.product.ProductPackage;

import org.abchip.mimo.biz.model.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.model.product.category.CategoryPackage;
import org.abchip.mimo.biz.model.product.config.ConfigPackage;
import org.abchip.mimo.biz.model.product.cost.CostPackage;
import org.abchip.mimo.biz.model.product.facility.FacilityPackage;
import org.abchip.mimo.biz.model.product.feature.FeaturePackage;
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.price.PricePackage;
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
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateProductPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateProductPriceResponseEClass = null;

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
	 * @see org.abchip.mimo.biz.model.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProductPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProductPackageImpl theProductPackage = registeredProductPackage instanceof ProductPackageImpl ? (ProductPackageImpl)registeredProductPackage : new ProductPackageImpl();

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
		org.abchip.mimo.biz.model.product.product.ProductPackage.eINSTANCE.eClass();
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

		// Create package meta-data objects
		theProductPackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductPackage.eNS_URI, theProductPackage);
		return theProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculateProductPrice() {
		return calculateProductPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculateProductPrice_Product() {
		return (EReference)calculateProductPriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalculateProductPrice_CurrencyUomId() {
		return (EAttribute)calculateProductPriceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculateProductPriceResponse() {
		return calculateProductPriceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalculateProductPriceResponse_ValidPriceFound() {
		return (EAttribute)calculateProductPriceResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalculateProductPriceResponse_BasePrice() {
		return (EAttribute)calculateProductPriceResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalculateProductPriceResponse_ListPrice() {
		return (EAttribute)calculateProductPriceResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
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
		calculateProductPriceEClass = createEClass(CALCULATE_PRODUCT_PRICE);
		createEReference(calculateProductPriceEClass, CALCULATE_PRODUCT_PRICE__PRODUCT);
		createEAttribute(calculateProductPriceEClass, CALCULATE_PRODUCT_PRICE__CURRENCY_UOM_ID);

		calculateProductPriceResponseEClass = createEClass(CALCULATE_PRODUCT_PRICE_RESPONSE);
		createEAttribute(calculateProductPriceResponseEClass, CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND);
		createEAttribute(calculateProductPriceResponseEClass, CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE);
		createEAttribute(calculateProductPriceResponseEClass, CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE);
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
		org.abchip.mimo.biz.model.product.product.ProductPackage theProductPackage_1 = (org.abchip.mimo.biz.model.product.product.ProductPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.product.product.ProductPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theServicePackage.getServiceRequest());
		EGenericType g2 = createEGenericType(this.getCalculateProductPriceResponse());
		g1.getETypeArguments().add(g2);
		calculateProductPriceEClass.getEGenericSuperTypes().add(g1);
		calculateProductPriceResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());

		// Initialize classes and features; add operations and parameters
		initEClass(calculateProductPriceEClass, CalculateProductPrice.class, "CalculateProductPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculateProductPrice_Product(), theProductPackage_1.getProduct(), null, "product", null, 1, 1, CalculateProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculateProductPrice_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, CalculateProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculateProductPriceResponseEClass, CalculateProductPriceResponse.class, "CalculateProductPriceResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalculateProductPriceResponse_ValidPriceFound(), ecorePackage.getEBoolean(), "validPriceFound", null, 1, 1, CalculateProductPriceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculateProductPriceResponse_BasePrice(), ecorePackage.getEBigDecimal(), "basePrice", null, 1, 1, CalculateProductPriceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculateProductPriceResponse_ListPrice(), ecorePackage.getEBigDecimal(), "listPrice", null, 0, 1, CalculateProductPriceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProductPackageImpl
