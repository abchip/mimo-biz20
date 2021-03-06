/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.inventory.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.model.accounting.AccountingPackage;
import org.abchip.mimo.biz.model.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.model.accounting.budget.impl.BudgetPackageImpl;
import org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedassetPackageImpl;
import org.abchip.mimo.biz.model.accounting.impl.AccountingPackageImpl;
import org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.model.accounting.ledger.impl.LedgerPackageImpl;
import org.abchip.mimo.biz.model.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.model.accounting.payment.impl.PaymentPackageImpl;
import org.abchip.mimo.biz.model.accounting.rate.RatePackage;
import org.abchip.mimo.biz.model.accounting.rate.impl.RatePackageImpl;
import org.abchip.mimo.biz.model.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.model.accounting.tax.impl.TaxPackageImpl;
import org.abchip.mimo.biz.model.catalina.session.SessionPackage;
import org.abchip.mimo.biz.model.catalina.session.impl.SessionPackageImpl;
import org.abchip.mimo.biz.model.common.CommonPackage;
import org.abchip.mimo.biz.model.common.datasource.DatasourcePackage;
import org.abchip.mimo.biz.model.common.datasource.impl.DatasourcePackageImpl;
import org.abchip.mimo.biz.model.common.email.EmailPackage;
import org.abchip.mimo.biz.model.common.email.impl.EmailPackageImpl;
import org.abchip.mimo.biz.model.common.enum_.EnumPackage;
import org.abchip.mimo.biz.model.common.enum_.impl.EnumPackageImpl;
import org.abchip.mimo.biz.model.common.geo.GeoPackage;
import org.abchip.mimo.biz.model.common.geo.impl.GeoPackageImpl;
import org.abchip.mimo.biz.model.common.impl.CommonPackageImpl;
import org.abchip.mimo.biz.model.common.keyword.KeywordPackage;
import org.abchip.mimo.biz.model.common.keyword.impl.KeywordPackageImpl;
import org.abchip.mimo.biz.model.common.language.LanguagePackage;
import org.abchip.mimo.biz.model.common.language.impl.LanguagePackageImpl;
import org.abchip.mimo.biz.model.common.method.MethodPackage;
import org.abchip.mimo.biz.model.common.method.impl.MethodPackageImpl;
import org.abchip.mimo.biz.model.common.note.NotePackage;
import org.abchip.mimo.biz.model.common.note.impl.NotePackageImpl;
import org.abchip.mimo.biz.model.common.period.PeriodPackage;
import org.abchip.mimo.biz.model.common.period.impl.PeriodPackageImpl;
import org.abchip.mimo.biz.model.common.portal.PortalPackage;
import org.abchip.mimo.biz.model.common.portal.impl.PortalPackageImpl;
import org.abchip.mimo.biz.model.common.property.PropertyPackage;
import org.abchip.mimo.biz.model.common.property.impl.PropertyPackageImpl;
import org.abchip.mimo.biz.model.common.screen.ScreenPackage;
import org.abchip.mimo.biz.model.common.screen.impl.ScreenPackageImpl;
import org.abchip.mimo.biz.model.common.status.StatusPackage;
import org.abchip.mimo.biz.model.common.status.impl.StatusPackageImpl;
import org.abchip.mimo.biz.model.common.theme.ThemePackage;
import org.abchip.mimo.biz.model.common.theme.impl.ThemePackageImpl;
import org.abchip.mimo.biz.model.common.uom.UomPackage;
import org.abchip.mimo.biz.model.common.uom.impl.UomPackageImpl;
import org.abchip.mimo.biz.model.common.user.UserPackage;
import org.abchip.mimo.biz.model.common.user.impl.UserPackageImpl;
import org.abchip.mimo.biz.model.content.content.ContentPackage;
import org.abchip.mimo.biz.model.content.content.impl.ContentPackageImpl;
import org.abchip.mimo.biz.model.content.data.DataPackage;
import org.abchip.mimo.biz.model.content.data.impl.DataPackageImpl;
import org.abchip.mimo.biz.model.content.document.DocumentPackage;
import org.abchip.mimo.biz.model.content.document.impl.DocumentPackageImpl;
import org.abchip.mimo.biz.model.content.preference.PreferencePackage;
import org.abchip.mimo.biz.model.content.preference.impl.PreferencePackageImpl;
import org.abchip.mimo.biz.model.content.survey.SurveyPackage;
import org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl;
import org.abchip.mimo.biz.model.content.website.WebsitePackage;
import org.abchip.mimo.biz.model.content.website.impl.WebsitePackageImpl;
import org.abchip.mimo.biz.model.entity.EntityPackage;
import org.abchip.mimo.biz.model.entity.audit.AuditPackage;
import org.abchip.mimo.biz.model.entity.audit.impl.AuditPackageImpl;
import org.abchip.mimo.biz.model.entity.crypto.CryptoPackage;
import org.abchip.mimo.biz.model.entity.crypto.impl.CryptoPackageImpl;
import org.abchip.mimo.biz.model.entity.group.GroupPackage;
import org.abchip.mimo.biz.model.entity.group.impl.GroupPackageImpl;
import org.abchip.mimo.biz.model.entity.impl.EntityPackageImpl;
import org.abchip.mimo.biz.model.entity.sequence.SequencePackage;
import org.abchip.mimo.biz.model.entity.sequence.impl.SequencePackageImpl;
import org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.model.entity.synchronization.impl.SynchronizationPackageImpl;
import org.abchip.mimo.biz.model.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.model.entity.tenant.impl.TenantPackageImpl;
import org.abchip.mimo.biz.model.entity.test.TestPackage;
import org.abchip.mimo.biz.model.entity.test.impl.TestPackageImpl;
import org.abchip.mimo.biz.model.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.model.humanres.ability.impl.AbilityPackageImpl;
import org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentPackageImpl;
import org.abchip.mimo.biz.model.humanres.position.PositionPackage;
import org.abchip.mimo.biz.model.humanres.position.impl.PositionPackageImpl;
import org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl;
import org.abchip.mimo.biz.model.humanres.trainings.TrainingsPackage;
import org.abchip.mimo.biz.model.humanres.trainings.impl.TrainingsPackageImpl;
import org.abchip.mimo.biz.model.manufacturing.bom.BomPackage;
import org.abchip.mimo.biz.model.manufacturing.bom.impl.BomPackageImpl;
import org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage;
import org.abchip.mimo.biz.model.manufacturing.mrp.impl.MrpPackageImpl;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage;
import org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechdataPackageImpl;
import org.abchip.mimo.biz.model.marketing.campaign.CampaignPackage;
import org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl;
import org.abchip.mimo.biz.model.marketing.contact.ContactPackage;
import org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl;
import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl;
import org.abchip.mimo.biz.model.marketing.segment.SegmentPackage;
import org.abchip.mimo.biz.model.marketing.segment.impl.SegmentPackageImpl;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage;
import org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingPackageImpl;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.order.order.impl.OrderPackageImpl;
import org.abchip.mimo.biz.model.order.quote.QuotePackage;
import org.abchip.mimo.biz.model.order.quote.impl.QuotePackageImpl;
import org.abchip.mimo.biz.model.order.request.RequestPackage;
import org.abchip.mimo.biz.model.order.request.impl.RequestPackageImpl;
import org.abchip.mimo.biz.model.order.requirement.RequirementPackage;
import org.abchip.mimo.biz.model.order.requirement.impl.RequirementPackageImpl;
import org.abchip.mimo.biz.model.order.reservations.ReservationsPackage;
import org.abchip.mimo.biz.model.order.reservations.impl.ReservationsPackageImpl;
import org.abchip.mimo.biz.model.order.return_.ReturnPackage;
import org.abchip.mimo.biz.model.order.return_.impl.ReturnPackageImpl;
import org.abchip.mimo.biz.model.order.shoppingcart.ShoppingcartPackage;
import org.abchip.mimo.biz.model.order.shoppingcart.impl.ShoppingcartPackageImpl;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage;
import org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl;
import org.abchip.mimo.biz.model.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.model.party.agreement.impl.AgreementPackageImpl;
import org.abchip.mimo.biz.model.party.communication.CommunicationPackage;
import org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl;
import org.abchip.mimo.biz.model.party.need.NeedPackage;
import org.abchip.mimo.biz.model.party.need.impl.NeedPackageImpl;
import org.abchip.mimo.biz.model.party.party.PartyPackage;
import org.abchip.mimo.biz.model.party.party.impl.PartyPackageImpl;
import org.abchip.mimo.biz.model.passport.PassportPackage;
import org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl;
import org.abchip.mimo.biz.model.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.model.product.catalog.impl.CatalogPackageImpl;
import org.abchip.mimo.biz.model.product.category.CategoryPackage;
import org.abchip.mimo.biz.model.product.category.impl.CategoryPackageImpl;
import org.abchip.mimo.biz.model.product.config.ConfigPackage;
import org.abchip.mimo.biz.model.product.config.impl.ConfigPackageImpl;
import org.abchip.mimo.biz.model.product.cost.CostPackage;
import org.abchip.mimo.biz.model.product.cost.impl.CostPackageImpl;
import org.abchip.mimo.biz.model.product.facility.FacilityPackage;
import org.abchip.mimo.biz.model.product.facility.impl.FacilityPackageImpl;
import org.abchip.mimo.biz.model.product.feature.FeaturePackage;
import org.abchip.mimo.biz.model.product.feature.impl.FeaturePackageImpl;
import org.abchip.mimo.biz.model.product.inventory.InventoryFactory;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemAttribute;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemDetail;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemLabel;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelAppl;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemLabelType;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemStatus;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemTempRes;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemTypeAttr;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemVariance;
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.inventory.InventoryTransfer;
import org.abchip.mimo.biz.model.product.inventory.Lot;
import org.abchip.mimo.biz.model.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.model.product.inventory.VarianceReason;
import org.abchip.mimo.biz.model.product.price.PricePackage;
import org.abchip.mimo.biz.model.product.price.impl.PricePackageImpl;
import org.abchip.mimo.biz.model.product.product.ProductPackage;
import org.abchip.mimo.biz.model.product.product.impl.ProductPackageImpl;
import org.abchip.mimo.biz.model.product.promo.PromoPackage;
import org.abchip.mimo.biz.model.product.promo.impl.PromoPackageImpl;
import org.abchip.mimo.biz.model.product.store.StorePackage;
import org.abchip.mimo.biz.model.product.store.impl.StorePackageImpl;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionPackageImpl;
import org.abchip.mimo.biz.model.product.supplier.SupplierPackage;
import org.abchip.mimo.biz.model.product.supplier.impl.SupplierPackageImpl;
import org.abchip.mimo.biz.model.security.cert.CertPackage;
import org.abchip.mimo.biz.model.security.cert.impl.CertPackageImpl;
import org.abchip.mimo.biz.model.security.login.LoginPackage;
import org.abchip.mimo.biz.model.security.login.impl.LoginPackageImpl;
import org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage;
import org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl;
import org.abchip.mimo.biz.model.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.model.service.schedule.impl.SchedulePackageImpl;
import org.abchip.mimo.biz.model.service.semaphore.SemaphorePackage;
import org.abchip.mimo.biz.model.service.semaphore.impl.SemaphorePackageImpl;
import org.abchip.mimo.biz.model.shipment.issuance.IssuancePackage;
import org.abchip.mimo.biz.model.shipment.issuance.impl.IssuancePackageImpl;
import org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage;
import org.abchip.mimo.biz.model.shipment.picklist.impl.PicklistPackageImpl;
import org.abchip.mimo.biz.model.shipment.receipt.ReceiptPackage;
import org.abchip.mimo.biz.model.shipment.receipt.impl.ReceiptPackageImpl;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package;
import org.abchip.mimo.biz.model.shipment.shipment.impl.Shipment_PackageImpl;
import org.abchip.mimo.biz.model.webapp.visit.VisitPackage;
import org.abchip.mimo.biz.model.webapp.visit.impl.VisitPackageImpl;
import org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage;
import org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage;
import org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkeffortPackageImpl;
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
public class InventoryPackageImpl extends EPackageImpl implements InventoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemLabelApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemLabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemTempResEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemVarianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryTransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalInventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varianceReasonEClass = null;

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
	 * @see org.abchip.mimo.biz.model.product.inventory.InventoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InventoryPackageImpl() {
		super(eNS_URI, InventoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InventoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InventoryPackage init() {
		if (isInited) return (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInventoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InventoryPackageImpl theInventoryPackage = registeredInventoryPackage instanceof InventoryPackageImpl ? (InventoryPackageImpl)registeredInventoryPackage : new InventoryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BizPackage.eINSTANCE.eClass();
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);
		AccountingPackageImpl theAccountingPackage = (AccountingPackageImpl)(registeredPackage instanceof AccountingPackageImpl ? registeredPackage : AccountingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BudgetPackage.eNS_URI);
		BudgetPackageImpl theBudgetPackage = (BudgetPackageImpl)(registeredPackage instanceof BudgetPackageImpl ? registeredPackage : BudgetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);
		FinaccountPackageImpl theFinaccountPackage = (FinaccountPackageImpl)(registeredPackage instanceof FinaccountPackageImpl ? registeredPackage : FinaccountPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);
		FixedassetPackageImpl theFixedassetPackage = (FixedassetPackageImpl)(registeredPackage instanceof FixedassetPackageImpl ? registeredPackage : FixedassetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		InvoicePackageImpl theInvoicePackage = (InvoicePackageImpl)(registeredPackage instanceof InvoicePackageImpl ? registeredPackage : InvoicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		LedgerPackageImpl theLedgerPackage = (LedgerPackageImpl)(registeredPackage instanceof LedgerPackageImpl ? registeredPackage : LedgerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(registeredPackage instanceof PaymentPackageImpl ? registeredPackage : PaymentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RatePackage.eNS_URI);
		RatePackageImpl theRatePackage = (RatePackageImpl)(registeredPackage instanceof RatePackageImpl ? registeredPackage : RatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TaxPackage.eNS_URI);
		TaxPackageImpl theTaxPackage = (TaxPackageImpl)(registeredPackage instanceof TaxPackageImpl ? registeredPackage : TaxPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SessionPackage.eNS_URI);
		SessionPackageImpl theSessionPackage = (SessionPackageImpl)(registeredPackage instanceof SessionPackageImpl ? registeredPackage : SessionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatasourcePackage.eNS_URI);
		DatasourcePackageImpl theDatasourcePackage = (DatasourcePackageImpl)(registeredPackage instanceof DatasourcePackageImpl ? registeredPackage : DatasourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EmailPackage.eNS_URI);
		EmailPackageImpl theEmailPackage = (EmailPackageImpl)(registeredPackage instanceof EmailPackageImpl ? registeredPackage : EmailPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(registeredPackage instanceof EnumPackageImpl ? registeredPackage : EnumPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		GeoPackageImpl theGeoPackage = (GeoPackageImpl)(registeredPackage instanceof GeoPackageImpl ? registeredPackage : GeoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KeywordPackage.eNS_URI);
		KeywordPackageImpl theKeywordPackage = (KeywordPackageImpl)(registeredPackage instanceof KeywordPackageImpl ? registeredPackage : KeywordPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(registeredPackage instanceof LanguagePackageImpl ? registeredPackage : LanguagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		MethodPackageImpl theMethodPackage = (MethodPackageImpl)(registeredPackage instanceof MethodPackageImpl ? registeredPackage : MethodPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NotePackage.eNS_URI);
		NotePackageImpl theNotePackage = (NotePackageImpl)(registeredPackage instanceof NotePackageImpl ? registeredPackage : NotePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PeriodPackage.eNS_URI);
		PeriodPackageImpl thePeriodPackage = (PeriodPackageImpl)(registeredPackage instanceof PeriodPackageImpl ? registeredPackage : PeriodPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PortalPackage.eNS_URI);
		PortalPackageImpl thePortalPackage = (PortalPackageImpl)(registeredPackage instanceof PortalPackageImpl ? registeredPackage : PortalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);
		PropertyPackageImpl thePropertyPackage = (PropertyPackageImpl)(registeredPackage instanceof PropertyPackageImpl ? registeredPackage : PropertyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScreenPackage.eNS_URI);
		ScreenPackageImpl theScreenPackage = (ScreenPackageImpl)(registeredPackage instanceof ScreenPackageImpl ? registeredPackage : ScreenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		StatusPackageImpl theStatusPackage = (StatusPackageImpl)(registeredPackage instanceof StatusPackageImpl ? registeredPackage : StatusPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ThemePackage.eNS_URI);
		ThemePackageImpl theThemePackage = (ThemePackageImpl)(registeredPackage instanceof ThemePackageImpl ? registeredPackage : ThemePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		UomPackageImpl theUomPackage = (UomPackageImpl)(registeredPackage instanceof UomPackageImpl ? registeredPackage : UomPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		UserPackageImpl theUserPackage = (UserPackageImpl)(registeredPackage instanceof UserPackageImpl ? registeredPackage : UserPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(registeredPackage instanceof DocumentPackageImpl ? registeredPackage : DocumentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PreferencePackage.eNS_URI);
		PreferencePackageImpl thePreferencePackage = (PreferencePackageImpl)(registeredPackage instanceof PreferencePackageImpl ? registeredPackage : PreferencePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);
		SurveyPackageImpl theSurveyPackage = (SurveyPackageImpl)(registeredPackage instanceof SurveyPackageImpl ? registeredPackage : SurveyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WebsitePackage.eNS_URI);
		WebsitePackageImpl theWebsitePackage = (WebsitePackageImpl)(registeredPackage instanceof WebsitePackageImpl ? registeredPackage : WebsitePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AuditPackage.eNS_URI);
		AuditPackageImpl theAuditPackage = (AuditPackageImpl)(registeredPackage instanceof AuditPackageImpl ? registeredPackage : AuditPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CryptoPackage.eNS_URI);
		CryptoPackageImpl theCryptoPackage = (CryptoPackageImpl)(registeredPackage instanceof CryptoPackageImpl ? registeredPackage : CryptoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI);
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(registeredPackage instanceof GroupPackageImpl ? registeredPackage : GroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(registeredPackage instanceof SequencePackageImpl ? registeredPackage : SequencePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SynchronizationPackage.eNS_URI);
		SynchronizationPackageImpl theSynchronizationPackage = (SynchronizationPackageImpl)(registeredPackage instanceof SynchronizationPackageImpl ? registeredPackage : SynchronizationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TenantPackage.eNS_URI);
		TenantPackageImpl theTenantPackage = (TenantPackageImpl)(registeredPackage instanceof TenantPackageImpl ? registeredPackage : TenantPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AbilityPackage.eNS_URI);
		AbilityPackageImpl theAbilityPackage = (AbilityPackageImpl)(registeredPackage instanceof AbilityPackageImpl ? registeredPackage : AbilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EmploymentPackage.eNS_URI);
		EmploymentPackageImpl theEmploymentPackage = (EmploymentPackageImpl)(registeredPackage instanceof EmploymentPackageImpl ? registeredPackage : EmploymentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PositionPackage.eNS_URI);
		PositionPackageImpl thePositionPackage = (PositionPackageImpl)(registeredPackage instanceof PositionPackageImpl ? registeredPackage : PositionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RecruitmentPackage.eNS_URI);
		RecruitmentPackageImpl theRecruitmentPackage = (RecruitmentPackageImpl)(registeredPackage instanceof RecruitmentPackageImpl ? registeredPackage : RecruitmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TrainingsPackage.eNS_URI);
		TrainingsPackageImpl theTrainingsPackage = (TrainingsPackageImpl)(registeredPackage instanceof TrainingsPackageImpl ? registeredPackage : TrainingsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BomPackage.eNS_URI);
		BomPackageImpl theBomPackage = (BomPackageImpl)(registeredPackage instanceof BomPackageImpl ? registeredPackage : BomPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MrpPackage.eNS_URI);
		MrpPackageImpl theMrpPackage = (MrpPackageImpl)(registeredPackage instanceof MrpPackageImpl ? registeredPackage : MrpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechdataPackage.eNS_URI);
		TechdataPackageImpl theTechdataPackage = (TechdataPackageImpl)(registeredPackage instanceof TechdataPackageImpl ? registeredPackage : TechdataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CampaignPackage.eNS_URI);
		CampaignPackageImpl theCampaignPackage = (CampaignPackageImpl)(registeredPackage instanceof CampaignPackageImpl ? registeredPackage : CampaignPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);
		ContactPackageImpl theContactPackage = (ContactPackageImpl)(registeredPackage instanceof ContactPackageImpl ? registeredPackage : ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);
		OpportunityPackageImpl theOpportunityPackage = (OpportunityPackageImpl)(registeredPackage instanceof OpportunityPackageImpl ? registeredPackage : OpportunityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SegmentPackage.eNS_URI);
		SegmentPackageImpl theSegmentPackage = (SegmentPackageImpl)(registeredPackage instanceof SegmentPackageImpl ? registeredPackage : SegmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TrackingPackage.eNS_URI);
		TrackingPackageImpl theTrackingPackage = (TrackingPackageImpl)(registeredPackage instanceof TrackingPackageImpl ? registeredPackage : TrackingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QuotePackage.eNS_URI);
		QuotePackageImpl theQuotePackage = (QuotePackageImpl)(registeredPackage instanceof QuotePackageImpl ? registeredPackage : QuotePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(registeredPackage instanceof RequestPackageImpl ? registeredPackage : RequestPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(registeredPackage instanceof RequirementPackageImpl ? registeredPackage : RequirementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReservationsPackage.eNS_URI);
		ReservationsPackageImpl theReservationsPackage = (ReservationsPackageImpl)(registeredPackage instanceof ReservationsPackageImpl ? registeredPackage : ReservationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReturnPackage.eNS_URI);
		ReturnPackageImpl theReturnPackage = (ReturnPackageImpl)(registeredPackage instanceof ReturnPackageImpl ? registeredPackage : ReturnPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ShoppingcartPackage.eNS_URI);
		ShoppingcartPackageImpl theShoppingcartPackage = (ShoppingcartPackageImpl)(registeredPackage instanceof ShoppingcartPackageImpl ? registeredPackage : ShoppingcartPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ShoppinglistPackage.eNS_URI);
		ShoppinglistPackageImpl theShoppinglistPackage = (ShoppinglistPackageImpl)(registeredPackage instanceof ShoppinglistPackageImpl ? registeredPackage : ShoppinglistPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.party.PartyPackage.eNS_URI);
		org.abchip.mimo.biz.model.party.impl.PartyPackageImpl thePartyPackage = (org.abchip.mimo.biz.model.party.impl.PartyPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.model.party.impl.PartyPackageImpl ? registeredPackage : org.abchip.mimo.biz.model.party.PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		AgreementPackageImpl theAgreementPackage = (AgreementPackageImpl)(registeredPackage instanceof AgreementPackageImpl ? registeredPackage : AgreementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.party.contact.ContactPackage.eNS_URI);
		org.abchip.mimo.biz.model.party.contact.impl.ContactPackageImpl theContactPackage_1 = (org.abchip.mimo.biz.model.party.contact.impl.ContactPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.model.party.contact.impl.ContactPackageImpl ? registeredPackage : org.abchip.mimo.biz.model.party.contact.ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NeedPackage.eNS_URI);
		NeedPackageImpl theNeedPackage = (NeedPackageImpl)(registeredPackage instanceof NeedPackageImpl ? registeredPackage : NeedPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		PartyPackageImpl thePartyPackage_1 = (PartyPackageImpl)(registeredPackage instanceof PartyPackageImpl ? registeredPackage : PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PassportPackage.eNS_URI);
		PassportPackageImpl thePassportPackage = (PassportPackageImpl)(registeredPackage instanceof PassportPackageImpl ? registeredPackage : PassportPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(registeredPackage instanceof CatalogPackageImpl ? registeredPackage : CatalogPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI);
		CategoryPackageImpl theCategoryPackage = (CategoryPackageImpl)(registeredPackage instanceof CategoryPackageImpl ? registeredPackage : CategoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(registeredPackage instanceof ConfigPackageImpl ? registeredPackage : ConfigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CostPackage.eNS_URI);
		CostPackageImpl theCostPackage = (CostPackageImpl)(registeredPackage instanceof CostPackageImpl ? registeredPackage : CostPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		FacilityPackageImpl theFacilityPackage = (FacilityPackageImpl)(registeredPackage instanceof FacilityPackageImpl ? registeredPackage : FacilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeaturePackage.eNS_URI);
		FeaturePackageImpl theFeaturePackage = (FeaturePackageImpl)(registeredPackage instanceof FeaturePackageImpl ? registeredPackage : FeaturePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PricePackage.eNS_URI);
		PricePackageImpl thePricePackage = (PricePackageImpl)(registeredPackage instanceof PricePackageImpl ? registeredPackage : PricePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : ProductPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PromoPackage.eNS_URI);
		PromoPackageImpl thePromoPackage = (PromoPackageImpl)(registeredPackage instanceof PromoPackageImpl ? registeredPackage : PromoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		StorePackageImpl theStorePackage = (StorePackageImpl)(registeredPackage instanceof StorePackageImpl ? registeredPackage : StorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubscriptionPackage.eNS_URI);
		SubscriptionPackageImpl theSubscriptionPackage = (SubscriptionPackageImpl)(registeredPackage instanceof SubscriptionPackageImpl ? registeredPackage : SubscriptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SupplierPackage.eNS_URI);
		SupplierPackageImpl theSupplierPackage = (SupplierPackageImpl)(registeredPackage instanceof SupplierPackageImpl ? registeredPackage : SupplierPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CertPackage.eNS_URI);
		CertPackageImpl theCertPackage = (CertPackageImpl)(registeredPackage instanceof CertPackageImpl ? registeredPackage : CertPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		LoginPackageImpl theLoginPackage = (LoginPackageImpl)(registeredPackage instanceof LoginPackageImpl ? registeredPackage : LoginPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecuritygroupPackage.eNS_URI);
		SecuritygroupPackageImpl theSecuritygroupPackage = (SecuritygroupPackageImpl)(registeredPackage instanceof SecuritygroupPackageImpl ? registeredPackage : SecuritygroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(registeredPackage instanceof SchedulePackageImpl ? registeredPackage : SchedulePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SemaphorePackage.eNS_URI);
		SemaphorePackageImpl theSemaphorePackage = (SemaphorePackageImpl)(registeredPackage instanceof SemaphorePackageImpl ? registeredPackage : SemaphorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IssuancePackage.eNS_URI);
		IssuancePackageImpl theIssuancePackage = (IssuancePackageImpl)(registeredPackage instanceof IssuancePackageImpl ? registeredPackage : IssuancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PicklistPackage.eNS_URI);
		PicklistPackageImpl thePicklistPackage = (PicklistPackageImpl)(registeredPackage instanceof PicklistPackageImpl ? registeredPackage : PicklistPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		ReceiptPackageImpl theReceiptPackage = (ReceiptPackageImpl)(registeredPackage instanceof ReceiptPackageImpl ? registeredPackage : ReceiptPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		Shipment_PackageImpl theShipment_Package = (Shipment_PackageImpl)(registeredPackage instanceof Shipment_PackageImpl ? registeredPackage : Shipment_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VisitPackage.eNS_URI);
		VisitPackageImpl theVisitPackage = (VisitPackageImpl)(registeredPackage instanceof VisitPackageImpl ? registeredPackage : VisitPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.webapp.website.WebsitePackage.eNS_URI);
		org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl theWebsitePackage_1 = (org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl ? registeredPackage : org.abchip.mimo.biz.model.webapp.website.WebsitePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimesheetPackage.eNS_URI);
		TimesheetPackageImpl theTimesheetPackage = (TimesheetPackageImpl)(registeredPackage instanceof TimesheetPackageImpl ? registeredPackage : TimesheetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		WorkeffortPackageImpl theWorkeffortPackage = (WorkeffortPackageImpl)(registeredPackage instanceof WorkeffortPackageImpl ? registeredPackage : WorkeffortPackage.eINSTANCE);

		// Create package meta-data objects
		theInventoryPackage.createPackageContents();
		theAccountingPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
		theFixedassetPackage.createPackageContents();
		theInvoicePackage.createPackageContents();
		theLedgerPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theRatePackage.createPackageContents();
		theTaxPackage.createPackageContents();
		theSessionPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theDatasourcePackage.createPackageContents();
		theEmailPackage.createPackageContents();
		theEnumPackage.createPackageContents();
		theGeoPackage.createPackageContents();
		theKeywordPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theMethodPackage.createPackageContents();
		theNotePackage.createPackageContents();
		thePeriodPackage.createPackageContents();
		thePortalPackage.createPackageContents();
		thePropertyPackage.createPackageContents();
		theScreenPackage.createPackageContents();
		theStatusPackage.createPackageContents();
		theThemePackage.createPackageContents();
		theUomPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		thePreferencePackage.createPackageContents();
		theSurveyPackage.createPackageContents();
		theWebsitePackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theAuditPackage.createPackageContents();
		theCryptoPackage.createPackageContents();
		theGroupPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theSynchronizationPackage.createPackageContents();
		theTenantPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theAbilityPackage.createPackageContents();
		theEmploymentPackage.createPackageContents();
		thePositionPackage.createPackageContents();
		theRecruitmentPackage.createPackageContents();
		theTrainingsPackage.createPackageContents();
		theBomPackage.createPackageContents();
		theMrpPackage.createPackageContents();
		theTechdataPackage.createPackageContents();
		theCampaignPackage.createPackageContents();
		theContactPackage.createPackageContents();
		theOpportunityPackage.createPackageContents();
		theSegmentPackage.createPackageContents();
		theTrackingPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theQuotePackage.createPackageContents();
		theRequestPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theReservationsPackage.createPackageContents();
		theReturnPackage.createPackageContents();
		theShoppingcartPackage.createPackageContents();
		theShoppinglistPackage.createPackageContents();
		thePartyPackage.createPackageContents();
		theAgreementPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theContactPackage_1.createPackageContents();
		theNeedPackage.createPackageContents();
		thePartyPackage_1.createPackageContents();
		thePassportPackage.createPackageContents();
		theCatalogPackage.createPackageContents();
		theCategoryPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theCostPackage.createPackageContents();
		theFacilityPackage.createPackageContents();
		theFeaturePackage.createPackageContents();
		thePricePackage.createPackageContents();
		theProductPackage.createPackageContents();
		thePromoPackage.createPackageContents();
		theStorePackage.createPackageContents();
		theSubscriptionPackage.createPackageContents();
		theSupplierPackage.createPackageContents();
		theCertPackage.createPackageContents();
		theLoginPackage.createPackageContents();
		theSecuritygroupPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theSemaphorePackage.createPackageContents();
		theIssuancePackage.createPackageContents();
		thePicklistPackage.createPackageContents();
		theReceiptPackage.createPackageContents();
		theShipment_Package.createPackageContents();
		theVisitPackage.createPackageContents();
		theWebsitePackage_1.createPackageContents();
		theTimesheetPackage.createPackageContents();
		theWorkeffortPackage.createPackageContents();

		// Initialize created meta-data
		theInventoryPackage.initializePackageContents();
		theAccountingPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
		theFixedassetPackage.initializePackageContents();
		theInvoicePackage.initializePackageContents();
		theLedgerPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theRatePackage.initializePackageContents();
		theTaxPackage.initializePackageContents();
		theSessionPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theDatasourcePackage.initializePackageContents();
		theEmailPackage.initializePackageContents();
		theEnumPackage.initializePackageContents();
		theGeoPackage.initializePackageContents();
		theKeywordPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theMethodPackage.initializePackageContents();
		theNotePackage.initializePackageContents();
		thePeriodPackage.initializePackageContents();
		thePortalPackage.initializePackageContents();
		thePropertyPackage.initializePackageContents();
		theScreenPackage.initializePackageContents();
		theStatusPackage.initializePackageContents();
		theThemePackage.initializePackageContents();
		theUomPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		thePreferencePackage.initializePackageContents();
		theSurveyPackage.initializePackageContents();
		theWebsitePackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theAuditPackage.initializePackageContents();
		theCryptoPackage.initializePackageContents();
		theGroupPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theSynchronizationPackage.initializePackageContents();
		theTenantPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theAbilityPackage.initializePackageContents();
		theEmploymentPackage.initializePackageContents();
		thePositionPackage.initializePackageContents();
		theRecruitmentPackage.initializePackageContents();
		theTrainingsPackage.initializePackageContents();
		theBomPackage.initializePackageContents();
		theMrpPackage.initializePackageContents();
		theTechdataPackage.initializePackageContents();
		theCampaignPackage.initializePackageContents();
		theContactPackage.initializePackageContents();
		theOpportunityPackage.initializePackageContents();
		theSegmentPackage.initializePackageContents();
		theTrackingPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theQuotePackage.initializePackageContents();
		theRequestPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theReservationsPackage.initializePackageContents();
		theReturnPackage.initializePackageContents();
		theShoppingcartPackage.initializePackageContents();
		theShoppinglistPackage.initializePackageContents();
		thePartyPackage.initializePackageContents();
		theAgreementPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theContactPackage_1.initializePackageContents();
		theNeedPackage.initializePackageContents();
		thePartyPackage_1.initializePackageContents();
		thePassportPackage.initializePackageContents();
		theCatalogPackage.initializePackageContents();
		theCategoryPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theCostPackage.initializePackageContents();
		theFacilityPackage.initializePackageContents();
		theFeaturePackage.initializePackageContents();
		thePricePackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		thePromoPackage.initializePackageContents();
		theStorePackage.initializePackageContents();
		theSubscriptionPackage.initializePackageContents();
		theSupplierPackage.initializePackageContents();
		theCertPackage.initializePackageContents();
		theLoginPackage.initializePackageContents();
		theSecuritygroupPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theSemaphorePackage.initializePackageContents();
		theIssuancePackage.initializePackageContents();
		thePicklistPackage.initializePackageContents();
		theReceiptPackage.initializePackageContents();
		theShipment_Package.initializePackageContents();
		theVisitPackage.initializePackageContents();
		theWebsitePackage_1.initializePackageContents();
		theTimesheetPackage.initializePackageContents();
		theWorkeffortPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInventoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InventoryPackage.eNS_URI, theInventoryPackage);
		return theInventoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItem() {
		return inventoryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_InventoryItemId() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_AccountingQuantityTotal() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_ActivationNumber() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_ActivationValidThru() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_AvailableToPromiseTotal() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_BinNumber() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_Comments() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Container() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_CurrencyUom() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_DatetimeManufactured() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_DatetimeReceived() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_ExpireDate() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Facility() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_FixedAsset() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_InventoryItemAttributes() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_InventoryItemDetails() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_InventoryItemLabelAppls() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_InventoryItemStatuses() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_InventoryItemType() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_InventoryItemVariances() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_LocationSeqId() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Lot() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_OldAvailableToPromise() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_OldQuantityOnHand() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_OwnerParty() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Party() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Product() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_QuantityOnHandTotal() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_SerialNumber() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_SoftIdentifier() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Status() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_UnitCost() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Uom() {
		return (EReference)inventoryItemEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemAttribute() {
		return inventoryItemAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemAttribute_InventoryItem() {
		return (EReference)inventoryItemAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemAttribute_AttrName() {
		return (EAttribute)inventoryItemAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemAttribute_AttrDescription() {
		return (EAttribute)inventoryItemAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemAttribute_AttrValue() {
		return (EAttribute)inventoryItemAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemDetail() {
		return inventoryItemDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemDetail_InventoryItem() {
		return (EReference)inventoryItemDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_InventoryItemDetailSeqId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_AccountingQuantityDiff() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_AvailableToPromiseDiff() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_Description() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_EffectiveDate() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_FixedAssetId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemDetail_ItemIssuance() {
		return (EReference)inventoryItemDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_MaintHistSeqId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_OrderId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_OrderItemSeqId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemDetail_PhysicalInventory() {
		return (EReference)inventoryItemDetailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_QuantityOnHandDiff() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemDetail_ReasonEnum() {
		return (EReference)inventoryItemDetailEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemDetail_Receipt() {
		return (EReference)inventoryItemDetailEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_ReturnId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_ReturnItemSeqId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_ShipGroupSeqId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_ShipmentId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_ShipmentItemSeqId() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemDetail_UnitCost() {
		return (EAttribute)inventoryItemDetailEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemDetail_WorkEffort() {
		return (EReference)inventoryItemDetailEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemLabel() {
		return inventoryItemLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemLabel_InventoryItemLabelId() {
		return (EAttribute)inventoryItemLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemLabel_Description() {
		return (EAttribute)inventoryItemLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemLabel_InventoryItemLabelType() {
		return (EReference)inventoryItemLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemLabelAppl() {
		return inventoryItemLabelApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemLabelAppl_InventoryItem() {
		return (EReference)inventoryItemLabelApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemLabelAppl_InventoryItemLabelType() {
		return (EReference)inventoryItemLabelApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemLabelAppl_InventoryItemLabel() {
		return (EReference)inventoryItemLabelApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemLabelAppl_SequenceNum() {
		return (EAttribute)inventoryItemLabelApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemLabelType() {
		return inventoryItemLabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemLabelType_InventoryItemLabelTypeId() {
		return (EAttribute)inventoryItemLabelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemLabelType_Description() {
		return (EAttribute)inventoryItemLabelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemLabelType_HasTable() {
		return (EAttribute)inventoryItemLabelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemLabelType_ParentType() {
		return (EReference)inventoryItemLabelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemStatus() {
		return inventoryItemStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemStatus_InventoryItem() {
		return (EReference)inventoryItemStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemStatus_Status() {
		return (EReference)inventoryItemStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemStatus_StatusDatetime() {
		return (EAttribute)inventoryItemStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemStatus_ChangeByUserLogin() {
		return (EReference)inventoryItemStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemStatus_OwnerPartyId() {
		return (EAttribute)inventoryItemStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemStatus_ProductId() {
		return (EAttribute)inventoryItemStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemStatus_StatusEndDatetime() {
		return (EAttribute)inventoryItemStatusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemTempRes() {
		return inventoryItemTempResEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemTempRes_Product() {
		return (EReference)inventoryItemTempResEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemTempRes_ProductStore() {
		return (EReference)inventoryItemTempResEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemTempRes_VisitId() {
		return (EAttribute)inventoryItemTempResEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemTempRes_Quantity() {
		return (EAttribute)inventoryItemTempResEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemTempRes_ReservedDate() {
		return (EAttribute)inventoryItemTempResEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemType() {
		return inventoryItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemType_InventoryItemTypeId() {
		return (EAttribute)inventoryItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemType_Description() {
		return (EAttribute)inventoryItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemType_HasTable() {
		return (EAttribute)inventoryItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemType_InventoryItemTypeAttrs() {
		return (EReference)inventoryItemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemType_ParentType() {
		return (EReference)inventoryItemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemTypeAttr() {
		return inventoryItemTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemTypeAttr_InventoryItemType() {
		return (EReference)inventoryItemTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemTypeAttr_AttrName() {
		return (EAttribute)inventoryItemTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemTypeAttr_Description() {
		return (EAttribute)inventoryItemTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItemVariance() {
		return inventoryItemVarianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemVariance_PhysicalInventory() {
		return (EReference)inventoryItemVarianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemVariance_InventoryItem() {
		return (EReference)inventoryItemVarianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemVariance_AvailableToPromiseVar() {
		return (EAttribute)inventoryItemVarianceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemVariance_Comments() {
		return (EAttribute)inventoryItemVarianceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItemVariance_QuantityOnHandVar() {
		return (EAttribute)inventoryItemVarianceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItemVariance_VarianceReason() {
		return (EReference)inventoryItemVarianceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryTransfer() {
		return inventoryTransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryTransfer_InventoryTransferId() {
		return (EAttribute)inventoryTransferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryTransfer_Comments() {
		return (EAttribute)inventoryTransferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_Container() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_ContainerIdTo() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_Facility() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_FacilityIdTo() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_InventoryItem() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_ItemIssuance() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryTransfer_LocationSeqId() {
		return (EAttribute)inventoryTransferEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryTransfer_LocationSeqIdTo() {
		return (EAttribute)inventoryTransferEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryTransfer_ReceiveDate() {
		return (EAttribute)inventoryTransferEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryTransfer_SendDate() {
		return (EAttribute)inventoryTransferEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryTransfer_Status() {
		return (EReference)inventoryTransferEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLot() {
		return lotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLot_LotId() {
		return (EAttribute)lotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLot_CreationDate() {
		return (EAttribute)lotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLot_ExpirationDate() {
		return (EAttribute)lotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLot_Quantity() {
		return (EAttribute)lotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalInventory() {
		return physicalInventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalInventory_PhysicalInventoryId() {
		return (EAttribute)physicalInventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalInventory_GeneralComments() {
		return (EAttribute)physicalInventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalInventory_PartyId() {
		return (EAttribute)physicalInventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalInventory_PhysicalInventoryDate() {
		return (EAttribute)physicalInventoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarianceReason() {
		return varianceReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarianceReason_VarianceReasonId() {
		return (EAttribute)varianceReasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarianceReason_Description() {
		return (EAttribute)varianceReasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarianceReason_VarianceReasonGlAccounts() {
		return (EReference)varianceReasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryFactory getInventoryFactory() {
		return (InventoryFactory)getEFactoryInstance();
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
		inventoryItemEClass = createEClass(INVENTORY_ITEM);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_ID);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__ACTIVATION_NUMBER);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__ACTIVATION_VALID_THRU);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__BIN_NUMBER);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__COMMENTS);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__CONTAINER);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__CURRENCY_UOM);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__DATETIME_MANUFACTURED);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__DATETIME_RECEIVED);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__EXPIRE_DATE);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__FACILITY);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__FIXED_ASSET);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_DETAILS);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_STATUSES);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_TYPE);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__LOCATION_SEQ_ID);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__LOT);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__OLD_QUANTITY_ON_HAND);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__OWNER_PARTY);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__PARTY);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__PRODUCT);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__SERIAL_NUMBER);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__SOFT_IDENTIFIER);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__STATUS);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__UNIT_COST);
		createEReference(inventoryItemEClass, INVENTORY_ITEM__UOM);

		inventoryItemAttributeEClass = createEClass(INVENTORY_ITEM_ATTRIBUTE);
		createEReference(inventoryItemAttributeEClass, INVENTORY_ITEM_ATTRIBUTE__INVENTORY_ITEM);
		createEAttribute(inventoryItemAttributeEClass, INVENTORY_ITEM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(inventoryItemAttributeEClass, INVENTORY_ITEM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(inventoryItemAttributeEClass, INVENTORY_ITEM_ATTRIBUTE__ATTR_VALUE);

		inventoryItemDetailEClass = createEClass(INVENTORY_ITEM_DETAIL);
		createEReference(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__INVENTORY_ITEM);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__INVENTORY_ITEM_DETAIL_SEQ_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__ACCOUNTING_QUANTITY_DIFF);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__AVAILABLE_TO_PROMISE_DIFF);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__DESCRIPTION);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__EFFECTIVE_DATE);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__FIXED_ASSET_ID);
		createEReference(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__ITEM_ISSUANCE);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__MAINT_HIST_SEQ_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__ORDER_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__ORDER_ITEM_SEQ_ID);
		createEReference(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__PHYSICAL_INVENTORY);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__QUANTITY_ON_HAND_DIFF);
		createEReference(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__REASON_ENUM);
		createEReference(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__RECEIPT);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__RETURN_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__RETURN_ITEM_SEQ_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__SHIP_GROUP_SEQ_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__SHIPMENT_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__UNIT_COST);
		createEReference(inventoryItemDetailEClass, INVENTORY_ITEM_DETAIL__WORK_EFFORT);

		inventoryItemLabelEClass = createEClass(INVENTORY_ITEM_LABEL);
		createEAttribute(inventoryItemLabelEClass, INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_ID);
		createEAttribute(inventoryItemLabelEClass, INVENTORY_ITEM_LABEL__DESCRIPTION);
		createEReference(inventoryItemLabelEClass, INVENTORY_ITEM_LABEL__INVENTORY_ITEM_LABEL_TYPE);

		inventoryItemLabelApplEClass = createEClass(INVENTORY_ITEM_LABEL_APPL);
		createEReference(inventoryItemLabelApplEClass, INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM);
		createEReference(inventoryItemLabelApplEClass, INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE);
		createEReference(inventoryItemLabelApplEClass, INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL);
		createEAttribute(inventoryItemLabelApplEClass, INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM);

		inventoryItemLabelTypeEClass = createEClass(INVENTORY_ITEM_LABEL_TYPE);
		createEAttribute(inventoryItemLabelTypeEClass, INVENTORY_ITEM_LABEL_TYPE__INVENTORY_ITEM_LABEL_TYPE_ID);
		createEAttribute(inventoryItemLabelTypeEClass, INVENTORY_ITEM_LABEL_TYPE__DESCRIPTION);
		createEAttribute(inventoryItemLabelTypeEClass, INVENTORY_ITEM_LABEL_TYPE__HAS_TABLE);
		createEReference(inventoryItemLabelTypeEClass, INVENTORY_ITEM_LABEL_TYPE__PARENT_TYPE);

		inventoryItemStatusEClass = createEClass(INVENTORY_ITEM_STATUS);
		createEReference(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__INVENTORY_ITEM);
		createEReference(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__STATUS);
		createEAttribute(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__STATUS_DATETIME);
		createEReference(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN);
		createEAttribute(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__OWNER_PARTY_ID);
		createEAttribute(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__PRODUCT_ID);
		createEAttribute(inventoryItemStatusEClass, INVENTORY_ITEM_STATUS__STATUS_END_DATETIME);

		inventoryItemTempResEClass = createEClass(INVENTORY_ITEM_TEMP_RES);
		createEReference(inventoryItemTempResEClass, INVENTORY_ITEM_TEMP_RES__PRODUCT);
		createEReference(inventoryItemTempResEClass, INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE);
		createEAttribute(inventoryItemTempResEClass, INVENTORY_ITEM_TEMP_RES__VISIT_ID);
		createEAttribute(inventoryItemTempResEClass, INVENTORY_ITEM_TEMP_RES__QUANTITY);
		createEAttribute(inventoryItemTempResEClass, INVENTORY_ITEM_TEMP_RES__RESERVED_DATE);

		inventoryItemTypeEClass = createEClass(INVENTORY_ITEM_TYPE);
		createEAttribute(inventoryItemTypeEClass, INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ID);
		createEAttribute(inventoryItemTypeEClass, INVENTORY_ITEM_TYPE__DESCRIPTION);
		createEAttribute(inventoryItemTypeEClass, INVENTORY_ITEM_TYPE__HAS_TABLE);
		createEReference(inventoryItemTypeEClass, INVENTORY_ITEM_TYPE__INVENTORY_ITEM_TYPE_ATTRS);
		createEReference(inventoryItemTypeEClass, INVENTORY_ITEM_TYPE__PARENT_TYPE);

		inventoryItemTypeAttrEClass = createEClass(INVENTORY_ITEM_TYPE_ATTR);
		createEReference(inventoryItemTypeAttrEClass, INVENTORY_ITEM_TYPE_ATTR__INVENTORY_ITEM_TYPE);
		createEAttribute(inventoryItemTypeAttrEClass, INVENTORY_ITEM_TYPE_ATTR__ATTR_NAME);
		createEAttribute(inventoryItemTypeAttrEClass, INVENTORY_ITEM_TYPE_ATTR__DESCRIPTION);

		inventoryItemVarianceEClass = createEClass(INVENTORY_ITEM_VARIANCE);
		createEReference(inventoryItemVarianceEClass, INVENTORY_ITEM_VARIANCE__PHYSICAL_INVENTORY);
		createEReference(inventoryItemVarianceEClass, INVENTORY_ITEM_VARIANCE__INVENTORY_ITEM);
		createEAttribute(inventoryItemVarianceEClass, INVENTORY_ITEM_VARIANCE__AVAILABLE_TO_PROMISE_VAR);
		createEAttribute(inventoryItemVarianceEClass, INVENTORY_ITEM_VARIANCE__COMMENTS);
		createEAttribute(inventoryItemVarianceEClass, INVENTORY_ITEM_VARIANCE__QUANTITY_ON_HAND_VAR);
		createEReference(inventoryItemVarianceEClass, INVENTORY_ITEM_VARIANCE__VARIANCE_REASON);

		inventoryTransferEClass = createEClass(INVENTORY_TRANSFER);
		createEAttribute(inventoryTransferEClass, INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID);
		createEAttribute(inventoryTransferEClass, INVENTORY_TRANSFER__COMMENTS);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__CONTAINER);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__CONTAINER_ID_TO);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__FACILITY);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__FACILITY_ID_TO);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__INVENTORY_ITEM);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__ITEM_ISSUANCE);
		createEAttribute(inventoryTransferEClass, INVENTORY_TRANSFER__LOCATION_SEQ_ID);
		createEAttribute(inventoryTransferEClass, INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO);
		createEAttribute(inventoryTransferEClass, INVENTORY_TRANSFER__RECEIVE_DATE);
		createEAttribute(inventoryTransferEClass, INVENTORY_TRANSFER__SEND_DATE);
		createEReference(inventoryTransferEClass, INVENTORY_TRANSFER__STATUS);

		lotEClass = createEClass(LOT);
		createEAttribute(lotEClass, LOT__LOT_ID);
		createEAttribute(lotEClass, LOT__CREATION_DATE);
		createEAttribute(lotEClass, LOT__EXPIRATION_DATE);
		createEAttribute(lotEClass, LOT__QUANTITY);

		physicalInventoryEClass = createEClass(PHYSICAL_INVENTORY);
		createEAttribute(physicalInventoryEClass, PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID);
		createEAttribute(physicalInventoryEClass, PHYSICAL_INVENTORY__GENERAL_COMMENTS);
		createEAttribute(physicalInventoryEClass, PHYSICAL_INVENTORY__PARTY_ID);
		createEAttribute(physicalInventoryEClass, PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE);

		varianceReasonEClass = createEClass(VARIANCE_REASON);
		createEAttribute(varianceReasonEClass, VARIANCE_REASON__VARIANCE_REASON_ID);
		createEAttribute(varianceReasonEClass, VARIANCE_REASON__DESCRIPTION);
		createEReference(varianceReasonEClass, VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS);
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
		org.abchip.mimo.entity.EntityPackage theEntityPackage_1 = (org.abchip.mimo.entity.EntityPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.entity.EntityPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		FixedassetPackage theFixedassetPackage = (FixedassetPackage)EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		IssuancePackage theIssuancePackage = (IssuancePackage)EPackage.Registry.INSTANCE.getEPackage(IssuancePackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		ReceiptPackage theReceiptPackage = (ReceiptPackage)EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getInventoryItemType());
		g1.getETypeArguments().add(g2);
		inventoryItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		inventoryItemEClass.getEGenericSuperTypes().add(g1);
		inventoryItemAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		inventoryItemDetailEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemDetailEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getInventoryItemLabelType());
		g1.getETypeArguments().add(g2);
		inventoryItemLabelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		inventoryItemLabelEClass.getEGenericSuperTypes().add(g1);
		inventoryItemLabelApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemLabelApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getInventoryItemLabel());
		g1.getETypeArguments().add(g2);
		inventoryItemLabelTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		inventoryItemLabelTypeEClass.getEGenericSuperTypes().add(g1);
		inventoryItemStatusEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemStatusEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		inventoryItemTempResEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemTempResEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getInventoryItem());
		g1.getETypeArguments().add(g2);
		inventoryItemTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		inventoryItemTypeEClass.getEGenericSuperTypes().add(g1);
		inventoryItemTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		inventoryItemVarianceEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryItemVarianceEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		inventoryTransferEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		inventoryTransferEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		lotEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		lotEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		physicalInventoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		physicalInventoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		varianceReasonEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		varianceReasonEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(inventoryItemEClass, InventoryItem.class, "InventoryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventoryItem_InventoryItemId(), ecorePackage.getEString(), "inventoryItemId", null, 1, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_AccountingQuantityTotal(), ecorePackage.getEBigDecimal(), "accountingQuantityTotal", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_ActivationNumber(), ecorePackage.getEString(), "activationNumber", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_ActivationValidThru(), ecorePackage.getEDate(), "activationValidThru", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_AvailableToPromiseTotal(), ecorePackage.getEBigDecimal(), "availableToPromiseTotal", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_BinNumber(), ecorePackage.getEString(), "binNumber", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Container(), theFacilityPackage.getContainer(), null, "container", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_DatetimeManufactured(), ecorePackage.getEDate(), "datetimeManufactured", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_DatetimeReceived(), ecorePackage.getEDate(), "datetimeReceived", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_ExpireDate(), ecorePackage.getEDate(), "expireDate", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_FixedAsset(), theFixedassetPackage.getFixedAsset(), null, "fixedAsset", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_InventoryItemAttributes(), this.getInventoryItemAttribute(), null, "inventoryItemAttributes", null, 0, -1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_InventoryItemDetails(), this.getInventoryItemDetail(), null, "inventoryItemDetails", null, 0, -1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_InventoryItemLabelAppls(), this.getInventoryItemLabelAppl(), null, "inventoryItemLabelAppls", null, 0, -1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_InventoryItemStatuses(), this.getInventoryItemStatus(), null, "inventoryItemStatuses", null, 0, -1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_InventoryItemType(), this.getInventoryItemType(), null, "inventoryItemType", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_InventoryItemVariances(), this.getInventoryItemVariance(), null, "inventoryItemVariances", null, 0, -1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_LocationSeqId(), ecorePackage.getEString(), "locationSeqId", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Lot(), this.getLot(), null, "lot", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_OldAvailableToPromise(), ecorePackage.getEBigDecimal(), "oldAvailableToPromise", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_OldQuantityOnHand(), ecorePackage.getEBigDecimal(), "oldQuantityOnHand", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_OwnerParty(), thePartyPackage_1.getParty(), null, "ownerParty", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Party(), thePartyPackage_1.getParty(), null, "party", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Product(), theProductPackage.getProduct(), null, "product", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_QuantityOnHandTotal(), ecorePackage.getEBigDecimal(), "quantityOnHandTotal", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_SerialNumber(), ecorePackage.getEString(), "serialNumber", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_SoftIdentifier(), ecorePackage.getEString(), "softIdentifier", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItem_UnitCost(), ecorePackage.getEBigDecimal(), "unitCost", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItem_Uom(), theUomPackage.getUom(), null, "uom", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemAttributeEClass, InventoryItemAttribute.class, "InventoryItemAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemAttribute_InventoryItem(), this.getInventoryItem(), null, "inventoryItem", null, 1, 1, InventoryItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, InventoryItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, InventoryItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, InventoryItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemDetailEClass, InventoryItemDetail.class, "InventoryItemDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemDetail_InventoryItem(), this.getInventoryItem(), null, "inventoryItem", null, 1, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_InventoryItemDetailSeqId(), ecorePackage.getEString(), "inventoryItemDetailSeqId", null, 1, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_AccountingQuantityDiff(), ecorePackage.getEBigDecimal(), "accountingQuantityDiff", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_AvailableToPromiseDiff(), ecorePackage.getEBigDecimal(), "availableToPromiseDiff", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_Description(), ecorePackage.getEString(), "description", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_EffectiveDate(), ecorePackage.getEDate(), "effectiveDate", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemDetail_ItemIssuance(), theIssuancePackage.getItemIssuance(), null, "itemIssuance", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemDetail_PhysicalInventory(), this.getPhysicalInventory(), null, "physicalInventory", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_QuantityOnHandDiff(), ecorePackage.getEBigDecimal(), "quantityOnHandDiff", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemDetail_ReasonEnum(), theEnumPackage.getEnumeration(), null, "reasonEnum", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemDetail_Receipt(), theReceiptPackage.getShipmentReceipt(), null, "receipt", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_ReturnId(), ecorePackage.getEString(), "returnId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_ReturnItemSeqId(), ecorePackage.getEString(), "returnItemSeqId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemDetail_UnitCost(), ecorePackage.getEBigDecimal(), "unitCost", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemDetail_WorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "workEffort", null, 0, 1, InventoryItemDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemLabelEClass, InventoryItemLabel.class, "InventoryItemLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventoryItemLabel_InventoryItemLabelId(), ecorePackage.getEString(), "inventoryItemLabelId", null, 1, 1, InventoryItemLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemLabel_Description(), ecorePackage.getEString(), "description", null, 0, 1, InventoryItemLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemLabel_InventoryItemLabelType(), this.getInventoryItemLabelType(), null, "inventoryItemLabelType", null, 0, 1, InventoryItemLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemLabelApplEClass, InventoryItemLabelAppl.class, "InventoryItemLabelAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemLabelAppl_InventoryItem(), this.getInventoryItem(), null, "inventoryItem", null, 1, 1, InventoryItemLabelAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemLabelAppl_InventoryItemLabelType(), this.getInventoryItemLabelType(), null, "inventoryItemLabelType", null, 1, 1, InventoryItemLabelAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemLabelAppl_InventoryItemLabel(), this.getInventoryItemLabel(), null, "inventoryItemLabel", null, 0, 1, InventoryItemLabelAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemLabelAppl_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, InventoryItemLabelAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemLabelTypeEClass, InventoryItemLabelType.class, "InventoryItemLabelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventoryItemLabelType_InventoryItemLabelTypeId(), ecorePackage.getEString(), "inventoryItemLabelTypeId", null, 1, 1, InventoryItemLabelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemLabelType_Description(), ecorePackage.getEString(), "description", null, 0, 1, InventoryItemLabelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemLabelType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 1, 1, InventoryItemLabelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemLabelType_ParentType(), this.getInventoryItemLabelType(), null, "parentType", null, 0, 1, InventoryItemLabelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemStatusEClass, InventoryItemStatus.class, "InventoryItemStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemStatus_InventoryItem(), this.getInventoryItem(), null, "inventoryItem", null, 1, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemStatus_Status(), theStatusPackage.getStatusItem(), null, "status", null, 1, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 1, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemStatus_ChangeByUserLogin(), theLoginPackage.getUserLogin(), null, "changeByUserLogin", null, 0, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemStatus_OwnerPartyId(), ecorePackage.getEString(), "ownerPartyId", null, 0, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemStatus_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemStatus_StatusEndDatetime(), ecorePackage.getEDate(), "statusEndDatetime", null, 0, 1, InventoryItemStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemTempResEClass, InventoryItemTempRes.class, "InventoryItemTempRes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemTempRes_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, InventoryItemTempRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemTempRes_ProductStore(), theStorePackage.getProductStore(), null, "productStore", null, 1, 1, InventoryItemTempRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemTempRes_VisitId(), ecorePackage.getEString(), "visitId", null, 1, 1, InventoryItemTempRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemTempRes_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, InventoryItemTempRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemTempRes_ReservedDate(), ecorePackage.getEDate(), "reservedDate", null, 0, 1, InventoryItemTempRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemTypeEClass, InventoryItemType.class, "InventoryItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventoryItemType_InventoryItemTypeId(), ecorePackage.getEString(), "inventoryItemTypeId", null, 1, 1, InventoryItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, InventoryItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, InventoryItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemType_InventoryItemTypeAttrs(), this.getInventoryItemTypeAttr(), null, "inventoryItemTypeAttrs", null, 0, -1, InventoryItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemType_ParentType(), this.getInventoryItemType(), null, "parentType", null, 0, 1, InventoryItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemTypeAttrEClass, InventoryItemTypeAttr.class, "InventoryItemTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemTypeAttr_InventoryItemType(), this.getInventoryItemType(), null, "inventoryItemType", null, 1, 1, InventoryItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, InventoryItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, InventoryItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryItemVarianceEClass, InventoryItemVariance.class, "InventoryItemVariance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventoryItemVariance_PhysicalInventory(), this.getPhysicalInventory(), null, "physicalInventory", null, 1, 1, InventoryItemVariance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemVariance_InventoryItem(), this.getInventoryItem(), null, "inventoryItem", null, 1, 1, InventoryItemVariance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemVariance_AvailableToPromiseVar(), ecorePackage.getEBigDecimal(), "availableToPromiseVar", null, 0, 1, InventoryItemVariance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemVariance_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, InventoryItemVariance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryItemVariance_QuantityOnHandVar(), ecorePackage.getEBigDecimal(), "quantityOnHandVar", null, 0, 1, InventoryItemVariance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryItemVariance_VarianceReason(), this.getVarianceReason(), null, "varianceReason", null, 0, 1, InventoryItemVariance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryTransferEClass, InventoryTransfer.class, "InventoryTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventoryTransfer_InventoryTransferId(), ecorePackage.getEString(), "inventoryTransferId", null, 1, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryTransfer_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_Container(), theFacilityPackage.getContainer(), null, "container", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_ContainerIdTo(), theFacilityPackage.getContainer(), null, "containerIdTo", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_FacilityIdTo(), theFacilityPackage.getFacility(), null, "facilityIdTo", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_InventoryItem(), this.getInventoryItem(), null, "inventoryItem", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_ItemIssuance(), theIssuancePackage.getItemIssuance(), null, "itemIssuance", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryTransfer_LocationSeqId(), ecorePackage.getEString(), "locationSeqId", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryTransfer_LocationSeqIdTo(), ecorePackage.getEString(), "locationSeqIdTo", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryTransfer_ReceiveDate(), ecorePackage.getEDate(), "receiveDate", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventoryTransfer_SendDate(), ecorePackage.getEDate(), "sendDate", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventoryTransfer_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, InventoryTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lotEClass, Lot.class, "Lot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLot_LotId(), ecorePackage.getEString(), "lotId", null, 1, 1, Lot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLot_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Lot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLot_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 0, 1, Lot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLot_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, Lot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalInventoryEClass, PhysicalInventory.class, "PhysicalInventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalInventory_PhysicalInventoryId(), ecorePackage.getEString(), "physicalInventoryId", null, 1, 1, PhysicalInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalInventory_GeneralComments(), ecorePackage.getEString(), "generalComments", null, 0, 1, PhysicalInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalInventory_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PhysicalInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalInventory_PhysicalInventoryDate(), ecorePackage.getEDate(), "physicalInventoryDate", null, 0, 1, PhysicalInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varianceReasonEClass, VarianceReason.class, "VarianceReason", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarianceReason_VarianceReasonId(), ecorePackage.getEString(), "varianceReasonId", null, 1, 1, VarianceReason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarianceReason_Description(), ecorePackage.getEString(), "description", null, 0, 1, VarianceReason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarianceReason_VarianceReasonGlAccounts(), theLedgerPackage.getVarianceReasonGlAccount(), null, "varianceReasonGlAccounts", null, 0, -1, VarianceReason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-slot-constraints
		createMimoentslotconstraintsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-format</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentformatAnnotations() {
		String source = "mimo-ent-format";
		addAnnotation
		  (getInventoryItem_InventoryItemId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItem_AccountingQuantityTotal(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItem_ActivationNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getInventoryItem_AvailableToPromiseTotal(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItem_BinNumber(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItem_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getInventoryItem_LocationSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItem_OldAvailableToPromise(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItem_OldQuantityOnHand(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItem_QuantityOnHandTotal(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItem_SerialNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getInventoryItem_SoftIdentifier(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getInventoryItem_UnitCost(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getInventoryItemAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getInventoryItemAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getInventoryItemDetail_InventoryItemDetailSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_AccountingQuantityDiff(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemDetail_AvailableToPromiseDiff(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemDetail_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getInventoryItemDetail_FixedAssetId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_MaintHistSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_OrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_QuantityOnHandDiff(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemDetail_ReturnId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_ShipmentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemDetail_UnitCost(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemLabel_InventoryItemLabelId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemLabel_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getInventoryItemLabelAppl_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getInventoryItemLabelType_InventoryItemLabelTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemLabelType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getInventoryItemStatus_OwnerPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemStatus_ProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemTempRes_VisitId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemTempRes_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemType_InventoryItemTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryItemType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getInventoryItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getInventoryItemTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getInventoryItemVariance_AvailableToPromiseVar(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryItemVariance_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getInventoryItemVariance_QuantityOnHandVar(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getInventoryTransfer_InventoryTransferId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryTransfer_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getInventoryTransfer_LocationSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getInventoryTransfer_LocationSeqIdTo(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getLot_LotId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getLot_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getPhysicalInventory_PhysicalInventoryId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPhysicalInventory_GeneralComments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getPhysicalInventory_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getVarianceReason_VarianceReasonId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getVarianceReason_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-slot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentslotAnnotations() {
		String source = "mimo-ent-slot";
		addAnnotation
		  (getInventoryItem_CurrencyUom(),
		   source,
		   new String[] {
			   "help", "The currency Uom of the unit cost."
		   });
		addAnnotation
		  (getInventoryItem_OwnerParty(),
		   source,
		   new String[] {
			   "help", "The owner of the inventory item."
		   });
		addAnnotation
		  (getInventoryItem_UnitCost(),
		   source,
		   new String[] {
			   "help", "Higher precision in case it is a calculated number"
		   });
		addAnnotation
		  (getInventoryItemAttribute_InventoryItem(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemDetail_InventoryItem(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemDetail_InventoryItemDetailSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemLabelAppl_InventoryItem(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemLabelAppl_InventoryItemLabelType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemStatus_InventoryItem(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemStatus_Status(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemStatus_StatusDatetime(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemStatus_OwnerPartyId(),
		   source,
		   new String[] {
			   "help", "Used to track a changed (new) ownerPartyId as a status changes."
		   });
		addAnnotation
		  (getInventoryItemStatus_ProductId(),
		   source,
		   new String[] {
			   "help", "Used to track a changed (new) productId as a status changes. In other words over time the item may be represented by a different Product (like new versus refurbished)."
		   });
		addAnnotation
		  (getInventoryItemTempRes_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemTempRes_ProductStore(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemTempRes_VisitId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemTypeAttr_InventoryItemType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemVariance_PhysicalInventory(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getInventoryItemVariance_InventoryItem(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-slot-constraints</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentslotconstraintsAnnotations() {
		String source = "mimo-ent-slot-constraints";
		addAnnotation
		  (getInventoryItem_InventoryItemStatuses(),
		   source,
		   new String[] {
			   "statusDatetime", "*NOW"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-frame</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentframeAnnotations() {
		String source = "mimo-ent-frame";
		addAnnotation
		  (inventoryItemEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (inventoryItemAttributeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (inventoryItemDetailEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (inventoryItemLabelEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (inventoryItemLabelApplEClass,
		   source,
		   new String[] {
			   "title", "Inventory Item Label Applicability",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (inventoryItemLabelTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (inventoryItemStatusEClass,
		   source,
		   new String[] {
			   "title", "Inventory Item Status History",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (inventoryItemTempResEClass,
		   source,
		   new String[] {
			   "title", "Inventory Item Temporary Reservation",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (inventoryItemTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (inventoryItemTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Inventory Item Type Attribute",
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (inventoryItemVarianceEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (inventoryTransferEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (lotEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (physicalInventoryEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (varianceReasonEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
	}

} //InventoryPackageImpl
