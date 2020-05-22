/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

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
import org.abchip.mimo.biz.service.order.ChangeOrderStatus;
import org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse;
import org.abchip.mimo.biz.service.order.OrderFactory;
import org.abchip.mimo.biz.service.order.OrderPackage;

import org.abchip.mimo.biz.service.order.RecalcTaxTotal;
import org.abchip.mimo.biz.service.order.RecalcTaxTotalResponse;
import org.abchip.mimo.biz.service.order.ReserveStoreInventory;
import org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse;
import org.abchip.mimo.biz.service.order.ResetGrandTotal;
import org.abchip.mimo.biz.service.order.ResetGrandTotalResponse;
import org.abchip.mimo.biz.service.party.impl.PartyPackageImpl;
import org.abchip.mimo.biz.service.product.impl.ProductPackageImpl;
import org.abchip.mimo.biz.service.security.SecurityPackage;
import org.abchip.mimo.biz.service.security.impl.SecurityPackageImpl;
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
public class OrderPackageImpl extends EPackageImpl implements OrderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOrderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOrderStatusResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveStoreInventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveStoreInventoryResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetGrandTotalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetGrandTotalResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recalcTaxTotalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recalcTaxTotalResponseEClass = null;

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
	 * @see org.abchip.mimo.biz.service.order.OrderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrderPackageImpl() {
		super(eNS_URI, OrderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrderPackage init() {
		if (isInited) return (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOrderPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OrderPackageImpl theOrderPackage = registeredOrderPackage instanceof OrderPackageImpl ? (OrderPackageImpl)registeredOrderPackage : new OrderPackageImpl();

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
		org.abchip.mimo.biz.model.order.order.OrderPackage.eINSTANCE.eClass();
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.party.PartyPackage.eNS_URI);
		PartyPackageImpl thePartyPackage_1 = (PartyPackageImpl)(registeredPackage instanceof PartyPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.party.PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.service.product.ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage_1 = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : org.abchip.mimo.biz.service.product.ProductPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);

		// Create package meta-data objects
		theOrderPackage.createPackageContents();
		theAccountingPackage_1.createPackageContents();
		theCommonPackage_1.createPackageContents();
		theEntityPackage_1.createPackageContents();
		thePartyPackage_1.createPackageContents();
		theProductPackage_1.createPackageContents();
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theOrderPackage.initializePackageContents();
		theAccountingPackage_1.initializePackageContents();
		theCommonPackage_1.initializePackageContents();
		theEntityPackage_1.initializePackageContents();
		thePartyPackage_1.initializePackageContents();
		theProductPackage_1.initializePackageContents();
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrderPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrderPackage.eNS_URI, theOrderPackage);
		return theOrderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeOrderStatus() {
		return changeOrderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatus_ChangeReason() {
		return (EAttribute)changeOrderStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatus_OrderId() {
		return (EAttribute)changeOrderStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatus_SetItemStatus() {
		return (EAttribute)changeOrderStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatus_StatusId() {
		return (EAttribute)changeOrderStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeOrderStatusResponse() {
		return changeOrderStatusResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatusResponse_GrandTotal() {
		return (EAttribute)changeOrderStatusResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatusResponse_NeedsInventoryIssuance() {
		return (EAttribute)changeOrderStatusResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatusResponse_OldStatusId() {
		return (EAttribute)changeOrderStatusResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatusResponse_OrderStatusId() {
		return (EAttribute)changeOrderStatusResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeOrderStatusResponse_OrderTypeId() {
		return (EAttribute)changeOrderStatusResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReserveStoreInventory() {
		return reserveStoreInventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_FacilityId() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_OrderId() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_OrderItemSeqId() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_ProductId() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_ProductStoreId() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_Quantity() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventory_ShipGroupSeqId() {
		return (EAttribute)reserveStoreInventoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReserveStoreInventoryResponse() {
		return reserveStoreInventoryResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveStoreInventoryResponse_QuantityNotReserved() {
		return (EAttribute)reserveStoreInventoryResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResetGrandTotal() {
		return resetGrandTotalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResetGrandTotal_OrderId() {
		return (EAttribute)resetGrandTotalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResetGrandTotalResponse() {
		return resetGrandTotalResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecalcTaxTotal() {
		return recalcTaxTotalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecalcTaxTotal_OrderId() {
		return (EAttribute)recalcTaxTotalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecalcTaxTotal_OrderItemSeqId() {
		return (EAttribute)recalcTaxTotalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecalcTaxTotalResponse() {
		return recalcTaxTotalResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderFactory getOrderFactory() {
		return (OrderFactory)getEFactoryInstance();
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
		changeOrderStatusEClass = createEClass(CHANGE_ORDER_STATUS);
		createEAttribute(changeOrderStatusEClass, CHANGE_ORDER_STATUS__CHANGE_REASON);
		createEAttribute(changeOrderStatusEClass, CHANGE_ORDER_STATUS__ORDER_ID);
		createEAttribute(changeOrderStatusEClass, CHANGE_ORDER_STATUS__SET_ITEM_STATUS);
		createEAttribute(changeOrderStatusEClass, CHANGE_ORDER_STATUS__STATUS_ID);

		changeOrderStatusResponseEClass = createEClass(CHANGE_ORDER_STATUS_RESPONSE);
		createEAttribute(changeOrderStatusResponseEClass, CHANGE_ORDER_STATUS_RESPONSE__GRAND_TOTAL);
		createEAttribute(changeOrderStatusResponseEClass, CHANGE_ORDER_STATUS_RESPONSE__NEEDS_INVENTORY_ISSUANCE);
		createEAttribute(changeOrderStatusResponseEClass, CHANGE_ORDER_STATUS_RESPONSE__OLD_STATUS_ID);
		createEAttribute(changeOrderStatusResponseEClass, CHANGE_ORDER_STATUS_RESPONSE__ORDER_STATUS_ID);
		createEAttribute(changeOrderStatusResponseEClass, CHANGE_ORDER_STATUS_RESPONSE__ORDER_TYPE_ID);

		reserveStoreInventoryEClass = createEClass(RESERVE_STORE_INVENTORY);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__FACILITY_ID);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__ORDER_ID);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__ORDER_ITEM_SEQ_ID);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__PRODUCT_ID);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__PRODUCT_STORE_ID);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__QUANTITY);
		createEAttribute(reserveStoreInventoryEClass, RESERVE_STORE_INVENTORY__SHIP_GROUP_SEQ_ID);

		reserveStoreInventoryResponseEClass = createEClass(RESERVE_STORE_INVENTORY_RESPONSE);
		createEAttribute(reserveStoreInventoryResponseEClass, RESERVE_STORE_INVENTORY_RESPONSE__QUANTITY_NOT_RESERVED);

		resetGrandTotalEClass = createEClass(RESET_GRAND_TOTAL);
		createEAttribute(resetGrandTotalEClass, RESET_GRAND_TOTAL__ORDER_ID);

		resetGrandTotalResponseEClass = createEClass(RESET_GRAND_TOTAL_RESPONSE);

		recalcTaxTotalEClass = createEClass(RECALC_TAX_TOTAL);
		createEAttribute(recalcTaxTotalEClass, RECALC_TAX_TOTAL__ORDER_ID);
		createEAttribute(recalcTaxTotalEClass, RECALC_TAX_TOTAL__ORDER_ITEM_SEQ_ID);

		recalcTaxTotalResponseEClass = createEClass(RECALC_TAX_TOTAL_RESPONSE);
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
		EGenericType g2 = createEGenericType(this.getChangeOrderStatusResponse());
		g1.getETypeArguments().add(g2);
		changeOrderStatusEClass.getEGenericSuperTypes().add(g1);
		changeOrderStatusResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(this.getReserveStoreInventoryResponse());
		g1.getETypeArguments().add(g2);
		reserveStoreInventoryEClass.getEGenericSuperTypes().add(g1);
		reserveStoreInventoryResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(this.getResetGrandTotalResponse());
		g1.getETypeArguments().add(g2);
		resetGrandTotalEClass.getEGenericSuperTypes().add(g1);
		resetGrandTotalResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(this.getRecalcTaxTotalResponse());
		g1.getETypeArguments().add(g2);
		recalcTaxTotalEClass.getEGenericSuperTypes().add(g1);
		recalcTaxTotalResponseEClass.getESuperTypes().add(theServicePackage.getServiceResponse());

		// Initialize classes and features; add operations and parameters
		initEClass(changeOrderStatusEClass, ChangeOrderStatus.class, "ChangeOrderStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeOrderStatus_ChangeReason(), ecorePackage.getEString(), "changeReason", null, 0, 1, ChangeOrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatus_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, ChangeOrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatus_SetItemStatus(), ecorePackage.getEBoolean(), "setItemStatus", null, 0, 1, ChangeOrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 1, 1, ChangeOrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeOrderStatusResponseEClass, ChangeOrderStatusResponse.class, "ChangeOrderStatusResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeOrderStatusResponse_GrandTotal(), ecorePackage.getEBigDecimal(), "grandTotal", null, 0, 1, ChangeOrderStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatusResponse_NeedsInventoryIssuance(), ecorePackage.getEString(), "needsInventoryIssuance", null, 0, 1, ChangeOrderStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatusResponse_OldStatusId(), ecorePackage.getEString(), "oldStatusId", null, 1, 1, ChangeOrderStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatusResponse_OrderStatusId(), ecorePackage.getEString(), "orderStatusId", null, 0, 1, ChangeOrderStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOrderStatusResponse_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 0, 1, ChangeOrderStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reserveStoreInventoryEClass, ReserveStoreInventory.class, "ReserveStoreInventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReserveStoreInventory_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveStoreInventory_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveStoreInventory_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveStoreInventory_ProductId(), ecorePackage.getEString(), "productId", null, 1, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveStoreInventory_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 1, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveStoreInventory_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 1, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveStoreInventory_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, ReserveStoreInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reserveStoreInventoryResponseEClass, ReserveStoreInventoryResponse.class, "ReserveStoreInventoryResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReserveStoreInventoryResponse_QuantityNotReserved(), ecorePackage.getEBigDecimal(), "quantityNotReserved", null, 1, 1, ReserveStoreInventoryResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetGrandTotalEClass, ResetGrandTotal.class, "ResetGrandTotal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResetGrandTotal_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, ResetGrandTotal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetGrandTotalResponseEClass, ResetGrandTotalResponse.class, "ResetGrandTotalResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recalcTaxTotalEClass, RecalcTaxTotal.class, "RecalcTaxTotal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecalcTaxTotal_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, RecalcTaxTotal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecalcTaxTotal_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, RecalcTaxTotal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recalcTaxTotalResponseEClass, RecalcTaxTotalResponse.class, "RecalcTaxTotalResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OrderPackageImpl
