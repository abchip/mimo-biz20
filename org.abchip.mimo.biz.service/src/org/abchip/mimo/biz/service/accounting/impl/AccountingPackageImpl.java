/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.biz.BizPackage;

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

import org.abchip.mimo.biz.service.BizServicePackage;

import org.abchip.mimo.biz.service.accounting.AccountingFactory;
import org.abchip.mimo.biz.service.accounting.AccountingPackage;
import org.abchip.mimo.biz.service.accounting.CreatePayment;
import org.abchip.mimo.biz.service.accounting.CreatePaymentResponse;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatus;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatus;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatusResponse;

import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse;
import org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl;

import org.abchip.mimo.biz.service.impl.BizServicePackageImpl;

import org.abchip.mimo.biz.service.order.impl.OrderPackageImpl;

import org.abchip.mimo.biz.service.product.impl.ProductPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingPackageImpl extends EPackageImpl implements AccountingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPaymentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPaymentStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPaymentStatusResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatePaymentApplicationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatePaymentApplicationDefResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setInvoiceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setInvoiceStatusResponseEClass = null;

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
	 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccountingPackageImpl() {
		super(eNS_URI, AccountingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccountingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccountingPackage init() {
		if (isInited) return (AccountingPackage)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccountingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccountingPackageImpl theAccountingPackage = registeredAccountingPackage instanceof AccountingPackageImpl ? (AccountingPackageImpl)registeredAccountingPackage : new AccountingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BizPackage.eINSTANCE.eClass();
		org.abchip.mimo.biz.model.accounting.AccountingPackage.eINSTANCE.eClass();
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BizServicePackage.eNS_URI);
		BizServicePackageImpl theBizServicePackage = (BizServicePackageImpl)(registeredPackage instanceof BizServicePackageImpl ? registeredPackage : BizServicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.entity.EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage_1 = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.entity.EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.order.OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage_1 = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.order.OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.product.ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage_1 = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.product.ProductPackage.eINSTANCE);

		// Create package meta-data objects
		theAccountingPackage.createPackageContents();
		theBizServicePackage.createPackageContents();
		theEntityPackage_1.createPackageContents();
		theOrderPackage_1.createPackageContents();
		theProductPackage_1.createPackageContents();

		// Initialize created meta-data
		theAccountingPackage.initializePackageContents();
		theBizServicePackage.initializePackageContents();
		theEntityPackage_1.initializePackageContents();
		theOrderPackage_1.initializePackageContents();
		theProductPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccountingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccountingPackage.eNS_URI, theAccountingPackage);
		return theAccountingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreatePayment() {
		return createPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreatePaymentResponse() {
		return createPaymentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetPaymentStatus() {
		return setPaymentStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetPaymentStatus_PaymentId() {
		return (EAttribute)setPaymentStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetPaymentStatus_StatusId() {
		return (EAttribute)setPaymentStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetPaymentStatusResponse() {
		return setPaymentStatusResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdatePaymentApplicationDef() {
		return updatePaymentApplicationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdatePaymentApplicationDef_InvoiceId() {
		return (EAttribute)updatePaymentApplicationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdatePaymentApplicationDef_PaymentId() {
		return (EAttribute)updatePaymentApplicationDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdatePaymentApplicationDefResponse() {
		return updatePaymentApplicationDefResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetInvoiceStatus() {
		return setInvoiceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInvoiceStatus_InvoiceId() {
		return (EAttribute)setInvoiceStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInvoiceStatus_PaidDate() {
		return (EAttribute)setInvoiceStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInvoiceStatus_StatusDate() {
		return (EAttribute)setInvoiceStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInvoiceStatus_StatusId() {
		return (EAttribute)setInvoiceStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetInvoiceStatusResponse() {
		return setInvoiceStatusResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInvoiceStatusResponse_InvoiceTypeId() {
		return (EAttribute)setInvoiceStatusResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInvoiceStatusResponse_OldStatusId() {
		return (EAttribute)setInvoiceStatusResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountingFactory getAccountingFactory() {
		return (AccountingFactory)getEFactoryInstance();
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
		createPaymentEClass = createEClass(CREATE_PAYMENT);

		createPaymentResponseEClass = createEClass(CREATE_PAYMENT_RESPONSE);

		setInvoiceStatusEClass = createEClass(SET_INVOICE_STATUS);
		createEAttribute(setInvoiceStatusEClass, SET_INVOICE_STATUS__INVOICE_ID);
		createEAttribute(setInvoiceStatusEClass, SET_INVOICE_STATUS__PAID_DATE);
		createEAttribute(setInvoiceStatusEClass, SET_INVOICE_STATUS__STATUS_DATE);
		createEAttribute(setInvoiceStatusEClass, SET_INVOICE_STATUS__STATUS_ID);

		setInvoiceStatusResponseEClass = createEClass(SET_INVOICE_STATUS_RESPONSE);
		createEAttribute(setInvoiceStatusResponseEClass, SET_INVOICE_STATUS_RESPONSE__INVOICE_TYPE_ID);
		createEAttribute(setInvoiceStatusResponseEClass, SET_INVOICE_STATUS_RESPONSE__OLD_STATUS_ID);

		setPaymentStatusEClass = createEClass(SET_PAYMENT_STATUS);
		createEAttribute(setPaymentStatusEClass, SET_PAYMENT_STATUS__PAYMENT_ID);
		createEAttribute(setPaymentStatusEClass, SET_PAYMENT_STATUS__STATUS_ID);

		setPaymentStatusResponseEClass = createEClass(SET_PAYMENT_STATUS_RESPONSE);

		updatePaymentApplicationDefEClass = createEClass(UPDATE_PAYMENT_APPLICATION_DEF);
		createEAttribute(updatePaymentApplicationDefEClass, UPDATE_PAYMENT_APPLICATION_DEF__INVOICE_ID);
		createEAttribute(updatePaymentApplicationDefEClass, UPDATE_PAYMENT_APPLICATION_DEF__PAYMENT_ID);

		updatePaymentApplicationDefResponseEClass = createEClass(UPDATE_PAYMENT_APPLICATION_DEF_RESPONSE);
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
		BizServicePackage theBizServicePackage = (BizServicePackage)EPackage.Registry.INSTANCE.getEPackage(BizServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theBizServicePackage.getBizServiceRequest());
		EGenericType g2 = createEGenericType(this.getCreatePaymentResponse());
		g1.getETypeArguments().add(g2);
		createPaymentEClass.getEGenericSuperTypes().add(g1);
		createPaymentResponseEClass.getESuperTypes().add(theBizServicePackage.getBizServiceResponse());
		g1 = createEGenericType(theBizServicePackage.getBizServiceRequest());
		g2 = createEGenericType(this.getSetInvoiceStatusResponse());
		g1.getETypeArguments().add(g2);
		setInvoiceStatusEClass.getEGenericSuperTypes().add(g1);
		setInvoiceStatusResponseEClass.getESuperTypes().add(theBizServicePackage.getBizServiceResponse());
		g1 = createEGenericType(theBizServicePackage.getBizServiceRequest());
		g2 = createEGenericType(this.getSetPaymentStatusResponse());
		g1.getETypeArguments().add(g2);
		setPaymentStatusEClass.getEGenericSuperTypes().add(g1);
		setPaymentStatusResponseEClass.getESuperTypes().add(theBizServicePackage.getBizServiceResponse());
		g1 = createEGenericType(theBizServicePackage.getBizServiceRequest());
		g2 = createEGenericType(this.getUpdatePaymentApplicationDefResponse());
		g1.getETypeArguments().add(g2);
		updatePaymentApplicationDefEClass.getEGenericSuperTypes().add(g1);
		updatePaymentApplicationDefResponseEClass.getESuperTypes().add(theBizServicePackage.getBizServiceResponse());

		// Initialize classes and features; add operations and parameters
		initEClass(createPaymentEClass, CreatePayment.class, "CreatePayment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createPaymentResponseEClass, CreatePaymentResponse.class, "CreatePaymentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setInvoiceStatusEClass, SetInvoiceStatus.class, "SetInvoiceStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetInvoiceStatus_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 1, 1, SetInvoiceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetInvoiceStatus_PaidDate(), ecorePackage.getEDate(), "paidDate", null, 0, 1, SetInvoiceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetInvoiceStatus_StatusDate(), ecorePackage.getEDate(), "statusDate", null, 0, 1, SetInvoiceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetInvoiceStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 1, 1, SetInvoiceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setInvoiceStatusResponseEClass, SetInvoiceStatusResponse.class, "SetInvoiceStatusResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetInvoiceStatusResponse_InvoiceTypeId(), ecorePackage.getEString(), "invoiceTypeId", null, 0, 1, SetInvoiceStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetInvoiceStatusResponse_OldStatusId(), ecorePackage.getEString(), "oldStatusId", null, 0, 1, SetInvoiceStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setPaymentStatusEClass, SetPaymentStatus.class, "SetPaymentStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetPaymentStatus_PaymentId(), ecorePackage.getEString(), "paymentId", null, 1, 1, SetPaymentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetPaymentStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 1, 1, SetPaymentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setPaymentStatusResponseEClass, SetPaymentStatusResponse.class, "SetPaymentStatusResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updatePaymentApplicationDefEClass, UpdatePaymentApplicationDef.class, "UpdatePaymentApplicationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdatePaymentApplicationDef_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 0, 1, UpdatePaymentApplicationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatePaymentApplicationDef_PaymentId(), ecorePackage.getEString(), "paymentId", null, 1, 1, UpdatePaymentApplicationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updatePaymentApplicationDefResponseEClass, UpdatePaymentApplicationDefResponse.class, "UpdatePaymentApplicationDefResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AccountingPackageImpl
