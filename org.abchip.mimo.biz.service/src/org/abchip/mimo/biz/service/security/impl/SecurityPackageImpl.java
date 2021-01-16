/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security.impl;

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

import org.abchip.mimo.biz.service.accounting.impl.AccountingPackageImpl;

import org.abchip.mimo.biz.service.common.impl.CommonPackageImpl;

import org.abchip.mimo.biz.service.entity.impl.EntityPackageImpl;

import org.abchip.mimo.biz.service.order.impl.OrderPackageImpl;

import org.abchip.mimo.biz.service.party.impl.PartyPackageImpl;

import org.abchip.mimo.biz.service.product.impl.ProductPackageImpl;

import org.abchip.mimo.biz.service.security.CheckExternalLoginUser;
import org.abchip.mimo.biz.service.security.CheckExternalLoginUserResponse;
import org.abchip.mimo.biz.service.security.SecurityFactory;
import org.abchip.mimo.biz.service.security.SecurityPackage;

import org.abchip.mimo.biz.service.security.UserCredentialFromExternalId;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse;
import org.abchip.mimo.service.ServicePackage;

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
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkExternalLoginUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkExternalLoginUserResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userCredentialFromExternalIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userCredentialFromExternalIdResponseEClass = null;

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
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPackageImpl theSecurityPackage = registeredSecurityPackage instanceof SecurityPackageImpl ? (SecurityPackageImpl)registeredSecurityPackage : new SecurityPackageImpl();

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.accounting.AccountingPackage.eNS_URI);
		AccountingPackageImpl theAccountingPackage_1 = (AccountingPackageImpl)(registeredPackage instanceof AccountingPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.accounting.AccountingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.common.CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage_1 = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.common.CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.entity.EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage_1 = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.entity.EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.order.OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage_1 = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.order.OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.party.PartyPackage.eNS_URI);
		PartyPackageImpl thePartyPackage_1 = (PartyPackageImpl)(registeredPackage instanceof PartyPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.party.PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.product.ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage_1 = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.product.ProductPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();
		theAccountingPackage_1.createPackageContents();
		theCommonPackage_1.createPackageContents();
		theEntityPackage_1.createPackageContents();
		theOrderPackage_1.createPackageContents();
		thePartyPackage_1.createPackageContents();
		theProductPackage_1.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();
		theAccountingPackage_1.initializePackageContents();
		theCommonPackage_1.initializePackageContents();
		theEntityPackage_1.initializePackageContents();
		theOrderPackage_1.initializePackageContents();
		thePartyPackage_1.initializePackageContents();
		theProductPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckExternalLoginUser() {
		return checkExternalLoginUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckExternalLoginUser_AccessToken() {
		return (EAttribute)checkExternalLoginUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckExternalLoginUser_Email() {
		return (EAttribute)checkExternalLoginUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckExternalLoginUser_FirstName() {
		return (EAttribute)checkExternalLoginUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckExternalLoginUser_LastName() {
		return (EAttribute)checkExternalLoginUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckExternalLoginUser_Provider() {
		return (EAttribute)checkExternalLoginUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckExternalLoginUser_UserId() {
		return (EAttribute)checkExternalLoginUserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckExternalLoginUserResponse() {
		return checkExternalLoginUserResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserCredentialFromExternalId() {
		return userCredentialFromExternalIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserCredentialFromExternalId_UserId() {
		return (EAttribute)userCredentialFromExternalIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserCredentialFromExternalIdResponse() {
		return userCredentialFromExternalIdResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserCredentialFromExternalIdResponse_User() {
		return (EAttribute)userCredentialFromExternalIdResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserCredentialFromExternalIdResponse_Password() {
		return (EAttribute)userCredentialFromExternalIdResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
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
		checkExternalLoginUserEClass = createEClass(CHECK_EXTERNAL_LOGIN_USER);
		createEAttribute(checkExternalLoginUserEClass, CHECK_EXTERNAL_LOGIN_USER__ACCESS_TOKEN);
		createEAttribute(checkExternalLoginUserEClass, CHECK_EXTERNAL_LOGIN_USER__EMAIL);
		createEAttribute(checkExternalLoginUserEClass, CHECK_EXTERNAL_LOGIN_USER__FIRST_NAME);
		createEAttribute(checkExternalLoginUserEClass, CHECK_EXTERNAL_LOGIN_USER__LAST_NAME);
		createEAttribute(checkExternalLoginUserEClass, CHECK_EXTERNAL_LOGIN_USER__PROVIDER);
		createEAttribute(checkExternalLoginUserEClass, CHECK_EXTERNAL_LOGIN_USER__USER_ID);

		checkExternalLoginUserResponseEClass = createEClass(CHECK_EXTERNAL_LOGIN_USER_RESPONSE);

		userCredentialFromExternalIdEClass = createEClass(USER_CREDENTIAL_FROM_EXTERNAL_ID);
		createEAttribute(userCredentialFromExternalIdEClass, USER_CREDENTIAL_FROM_EXTERNAL_ID__USER_ID);

		userCredentialFromExternalIdResponseEClass = createEClass(USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE);
		createEAttribute(userCredentialFromExternalIdResponseEClass, USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__USER);
		createEAttribute(userCredentialFromExternalIdResponseEClass, USER_CREDENTIAL_FROM_EXTERNAL_ID_RESPONSE__PASSWORD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theServicePackage.getServiceRequest());
		EGenericType g2 = createEGenericType(this.getCheckExternalLoginUserResponse());
		g1.getETypeArguments().add(g2);
		checkExternalLoginUserEClass.getEGenericSuperTypes().add(g1);
		checkExternalLoginUserResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(this.getUserCredentialFromExternalIdResponse());
		g1.getETypeArguments().add(g2);
		userCredentialFromExternalIdEClass.getEGenericSuperTypes().add(g1);
		userCredentialFromExternalIdResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());

		// Initialize classes and features; add operations and parameters
		initEClass(checkExternalLoginUserEClass, CheckExternalLoginUser.class, "CheckExternalLoginUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckExternalLoginUser_AccessToken(), ecorePackage.getEString(), "accessToken", "", 1, 1, CheckExternalLoginUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckExternalLoginUser_Email(), ecorePackage.getEString(), "email", "", 1, 1, CheckExternalLoginUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckExternalLoginUser_FirstName(), ecorePackage.getEString(), "firstName", "", 1, 1, CheckExternalLoginUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckExternalLoginUser_LastName(), ecorePackage.getEString(), "lastName", "", 1, 1, CheckExternalLoginUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckExternalLoginUser_Provider(), ecorePackage.getEString(), "provider", "", 1, 1, CheckExternalLoginUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckExternalLoginUser_UserId(), ecorePackage.getEString(), "userId", "", 1, 1, CheckExternalLoginUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkExternalLoginUserResponseEClass, CheckExternalLoginUserResponse.class, "CheckExternalLoginUserResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userCredentialFromExternalIdEClass, UserCredentialFromExternalId.class, "UserCredentialFromExternalId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserCredentialFromExternalId_UserId(), ecorePackage.getEString(), "userId", "", 1, 1, UserCredentialFromExternalId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userCredentialFromExternalIdResponseEClass, UserCredentialFromExternalIdResponse.class, "UserCredentialFromExternalIdResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserCredentialFromExternalIdResponse_User(), ecorePackage.getEString(), "user", "@general/currency.uom.id.default", 1, 1, UserCredentialFromExternalIdResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserCredentialFromExternalIdResponse_Password(), ecorePackage.getEString(), "password", "@general/currency.uom.id.default", 1, 1, UserCredentialFromExternalIdResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SecurityPackageImpl
