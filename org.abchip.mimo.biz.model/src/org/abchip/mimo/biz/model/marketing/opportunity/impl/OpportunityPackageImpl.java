/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity.impl;

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
import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityFactory;
import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort;
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
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl;
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
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpportunityPackageImpl extends EPackageImpl implements OpportunityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesForecastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesForecastDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesForecastHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityCompetitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityQuoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityTrckCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityWorkEffortEClass = null;

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
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpportunityPackageImpl() {
		super(eNS_URI, OpportunityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpportunityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpportunityPackage init() {
		if (isInited) return (OpportunityPackage)EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpportunityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpportunityPackageImpl theOpportunityPackage = registeredOpportunityPackage instanceof OpportunityPackageImpl ? (OpportunityPackageImpl)registeredOpportunityPackage : new OpportunityPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(registeredPackage instanceof InventoryPackageImpl ? registeredPackage : InventoryPackage.eINSTANCE);
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
		theOpportunityPackage.createPackageContents();
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
		theInventoryPackage.createPackageContents();
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
		theOpportunityPackage.initializePackageContents();
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
		theInventoryPackage.initializePackageContents();
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
		theOpportunityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpportunityPackage.eNS_URI, theOpportunityPackage);
		return theOpportunityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesForecast() {
		return salesForecastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_SalesForecastId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_BestCaseAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_ClosedAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_CreatedByUserLogin() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_CurrencyUom() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_CustomTimePeriod() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_ForecastAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_InternalParty() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_ModifiedByUserLogin() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_OrganizationParty() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_ParentSalesForecast() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_PercentOfQuotaClosed() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_PercentOfQuotaForecast() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_PipelineAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_QuotaAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecast_SalesForecastDetails() {
		return (EReference)salesForecastEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesForecastDetail() {
		return salesForecastDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastDetail_SalesForecast() {
		return (EReference)salesForecastDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_SalesForecastDetailId() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_Amount() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastDetail_Product() {
		return (EReference)salesForecastDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastDetail_ProductCategory() {
		return (EReference)salesForecastDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_Quantity() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastDetail_QuantityUom() {
		return (EReference)salesForecastDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesForecastHistory() {
		return salesForecastHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_SalesForecastHistoryId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_BestCaseAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ChangeNote() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ClosedAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastHistory_CurrencyUom() {
		return (EReference)salesForecastHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastHistory_CustomTimePeriod() {
		return (EReference)salesForecastHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ForecastAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastHistory_InternalParty() {
		return (EReference)salesForecastHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastHistory_ModifiedByUserLogin() {
		return (EReference)salesForecastHistoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ModifiedTimestamp() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastHistory_OrganizationParty() {
		return (EReference)salesForecastHistoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ParentSalesForecastId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_PercentOfQuotaClosed() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_PercentOfQuotaForecast() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_QuotaAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesForecastHistory_SalesForecast() {
		return (EReference)salesForecastHistoryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunity() {
		return salesOpportunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_SalesOpportunityId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_CreatedByUserLogin() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_CurrencyUom() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_DataSourceId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_Description() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_EstimatedAmount() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_EstimatedCloseDate() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_EstimatedProbability() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_MarketingCampaign() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_NextStep() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_NextStepDate() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_OpportunityName() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_OpportunityStage() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_SalesOpportunityCompetitors() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_SalesOpportunityQuotes() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_SalesOpportunityTrckCodes() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_SalesOpportunityWorkEfforts() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunity_TypeEnum() {
		return (EReference)salesOpportunityEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityCompetitor() {
		return salesOpportunityCompetitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityCompetitor_SalesOpportunity() {
		return (EReference)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_CompetitorPartyId() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_PositionEnumId() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_Strengths() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_Weaknesses() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityHistory() {
		return salesOpportunityHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_SalesOpportunityHistoryId() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_ChangeNote() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityHistory_CurrencyUom() {
		return (EReference)salesOpportunityHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_Description() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_EstimatedAmount() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_EstimatedCloseDate() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_EstimatedProbability() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityHistory_ModifiedByUserLogin() {
		return (EReference)salesOpportunityHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_ModifiedTimestamp() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_NextStep() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityHistory_OpportunityStage() {
		return (EReference)salesOpportunityHistoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityHistory_SalesOpportunity() {
		return (EReference)salesOpportunityHistoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityQuote() {
		return salesOpportunityQuoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityQuote_SalesOpportunity() {
		return (EReference)salesOpportunityQuoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityQuote_Quote() {
		return (EReference)salesOpportunityQuoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityRole() {
		return salesOpportunityRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityRole_SalesOpportunity() {
		return (EReference)salesOpportunityRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityRole_Party() {
		return (EReference)salesOpportunityRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityRole_RoleType() {
		return (EReference)salesOpportunityRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityStage() {
		return salesOpportunityStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_OpportunityStageId() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_DefaultProbability() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_Description() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_SequenceNum() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityTrckCode() {
		return salesOpportunityTrckCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityTrckCode_SalesOpportunity() {
		return (EReference)salesOpportunityTrckCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityTrckCode_TrackingCodeId() {
		return (EAttribute)salesOpportunityTrckCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityTrckCode_ReceivedDate() {
		return (EAttribute)salesOpportunityTrckCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityWorkEffort() {
		return salesOpportunityWorkEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityWorkEffort_SalesOpportunity() {
		return (EReference)salesOpportunityWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSalesOpportunityWorkEffort_WorkEffort() {
		return (EReference)salesOpportunityWorkEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpportunityFactory getOpportunityFactory() {
		return (OpportunityFactory)getEFactoryInstance();
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
		salesForecastEClass = createEClass(SALES_FORECAST);
		createEAttribute(salesForecastEClass, SALES_FORECAST__SALES_FORECAST_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__BEST_CASE_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__CLOSED_AMOUNT);
		createEReference(salesForecastEClass, SALES_FORECAST__CREATED_BY_USER_LOGIN);
		createEReference(salesForecastEClass, SALES_FORECAST__CURRENCY_UOM);
		createEReference(salesForecastEClass, SALES_FORECAST__CUSTOM_TIME_PERIOD);
		createEAttribute(salesForecastEClass, SALES_FORECAST__FORECAST_AMOUNT);
		createEReference(salesForecastEClass, SALES_FORECAST__INTERNAL_PARTY);
		createEReference(salesForecastEClass, SALES_FORECAST__MODIFIED_BY_USER_LOGIN);
		createEReference(salesForecastEClass, SALES_FORECAST__ORGANIZATION_PARTY);
		createEReference(salesForecastEClass, SALES_FORECAST__PARENT_SALES_FORECAST);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PIPELINE_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__QUOTA_AMOUNT);
		createEReference(salesForecastEClass, SALES_FORECAST__SALES_FORECAST_DETAILS);

		salesForecastDetailEClass = createEClass(SALES_FORECAST_DETAIL);
		createEReference(salesForecastDetailEClass, SALES_FORECAST_DETAIL__SALES_FORECAST);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__AMOUNT);
		createEReference(salesForecastDetailEClass, SALES_FORECAST_DETAIL__PRODUCT);
		createEReference(salesForecastDetailEClass, SALES_FORECAST_DETAIL__PRODUCT_CATEGORY);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__QUANTITY);
		createEReference(salesForecastDetailEClass, SALES_FORECAST_DETAIL__QUANTITY_UOM);

		salesForecastHistoryEClass = createEClass(SALES_FORECAST_HISTORY);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CHANGE_NOTE);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CLOSED_AMOUNT);
		createEReference(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CURRENCY_UOM);
		createEReference(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__FORECAST_AMOUNT);
		createEReference(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__INTERNAL_PARTY);
		createEReference(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP);
		createEReference(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__ORGANIZATION_PARTY);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__QUOTA_AMOUNT);
		createEReference(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__SALES_FORECAST);

		salesOpportunityEClass = createEClass(SALES_OPPORTUNITY);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__CURRENCY_UOM);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__DATA_SOURCE_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__DESCRIPTION);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__ESTIMATED_AMOUNT);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__ESTIMATED_PROBABILITY);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__MARKETING_CAMPAIGN);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__NEXT_STEP);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__NEXT_STEP_DATE);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__OPPORTUNITY_NAME);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__OPPORTUNITY_STAGE);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS);
		createEReference(salesOpportunityEClass, SALES_OPPORTUNITY__TYPE_ENUM);

		salesOpportunityCompetitorEClass = createEClass(SALES_OPPORTUNITY_COMPETITOR);
		createEReference(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__STRENGTHS);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES);

		salesOpportunityHistoryEClass = createEClass(SALES_OPPORTUNITY_HISTORY);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE);
		createEReference(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__DESCRIPTION);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY);
		createEReference(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__NEXT_STEP);
		createEReference(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE);
		createEReference(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY);

		salesOpportunityQuoteEClass = createEClass(SALES_OPPORTUNITY_QUOTE);
		createEReference(salesOpportunityQuoteEClass, SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY);
		createEReference(salesOpportunityQuoteEClass, SALES_OPPORTUNITY_QUOTE__QUOTE);

		salesOpportunityRoleEClass = createEClass(SALES_OPPORTUNITY_ROLE);
		createEReference(salesOpportunityRoleEClass, SALES_OPPORTUNITY_ROLE__SALES_OPPORTUNITY);
		createEReference(salesOpportunityRoleEClass, SALES_OPPORTUNITY_ROLE__PARTY);
		createEReference(salesOpportunityRoleEClass, SALES_OPPORTUNITY_ROLE__ROLE_TYPE);

		salesOpportunityStageEClass = createEClass(SALES_OPPORTUNITY_STAGE);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__OPPORTUNITY_STAGE_ID);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__DEFAULT_PROBABILITY);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__DESCRIPTION);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__SEQUENCE_NUM);

		salesOpportunityTrckCodeEClass = createEClass(SALES_OPPORTUNITY_TRCK_CODE);
		createEReference(salesOpportunityTrckCodeEClass, SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY);
		createEAttribute(salesOpportunityTrckCodeEClass, SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID);
		createEAttribute(salesOpportunityTrckCodeEClass, SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE);

		salesOpportunityWorkEffortEClass = createEClass(SALES_OPPORTUNITY_WORK_EFFORT);
		createEReference(salesOpportunityWorkEffortEClass, SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY);
		createEReference(salesOpportunityWorkEffortEClass, SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT);
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
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		PeriodPackage thePeriodPackage = (PeriodPackage)EPackage.Registry.INSTANCE.getEPackage(PeriodPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		CategoryPackage theCategoryPackage = (CategoryPackage)EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI);
		CampaignPackage theCampaignPackage = (CampaignPackage)EPackage.Registry.INSTANCE.getEPackage(CampaignPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		QuotePackage theQuotePackage = (QuotePackage)EPackage.Registry.INSTANCE.getEPackage(QuotePackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		salesForecastEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesForecastEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesForecastDetailEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesForecastDetailEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesForecastHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesForecastHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityCompetitorEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityCompetitorEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityQuoteEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityQuoteEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityStageEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityStageEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityTrckCodeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityTrckCodeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		salesOpportunityWorkEffortEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		salesOpportunityWorkEffortEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(salesForecastEClass, SalesForecast.class, "SalesForecast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesForecast_SalesForecastId(), ecorePackage.getEString(), "salesForecastId", null, 1, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_BestCaseAmount(), ecorePackage.getEBigDecimal(), "bestCaseAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_ClosedAmount(), ecorePackage.getEBigDecimal(), "closedAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecast_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getSalesForecast_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_CurrencyUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getSalesForecast_CustomTimePeriod(), thePeriodPackage.getCustomTimePeriod(), null, "customTimePeriod", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_CustomTimePeriod().getEKeys().add(thePeriodPackage.getCustomTimePeriod_CustomTimePeriodId());
		initEAttribute(getSalesForecast_ForecastAmount(), ecorePackage.getEBigDecimal(), "forecastAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecast_InternalParty(), thePartyPackage_1.getParty(), null, "internalParty", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_InternalParty().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getSalesForecast_ModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "modifiedByUserLogin", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_ModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getSalesForecast_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_OrganizationParty().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getSalesForecast_ParentSalesForecast(), this.getSalesForecast(), null, "parentSalesForecast", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecast_ParentSalesForecast().getEKeys().add(this.getSalesForecast_SalesForecastId());
		initEAttribute(getSalesForecast_PercentOfQuotaClosed(), ecorePackage.getEBigDecimal(), "percentOfQuotaClosed", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_PercentOfQuotaForecast(), ecorePackage.getEBigDecimal(), "percentOfQuotaForecast", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_PipelineAmount(), ecorePackage.getEBigDecimal(), "pipelineAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_QuotaAmount(), ecorePackage.getEBigDecimal(), "quotaAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecast_SalesForecastDetails(), this.getSalesForecastDetail(), null, "salesForecastDetails", null, 0, -1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(salesForecastDetailEClass, SalesForecastDetail.class, "SalesForecastDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesForecastDetail_SalesForecast(), this.getSalesForecast(), null, "salesForecast", null, 1, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastDetail_SalesForecast().getEKeys().add(this.getSalesForecast_SalesForecastId());
		initEAttribute(getSalesForecastDetail_SalesForecastDetailId(), ecorePackage.getEString(), "salesForecastDetailId", null, 1, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecastDetail_Product(), theProductPackage.getProduct(), null, "product", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastDetail_Product().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEReference(getSalesForecastDetail_ProductCategory(), theCategoryPackage.getProductCategory(), null, "productCategory", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastDetail_ProductCategory().getEKeys().add(theCategoryPackage.getProductCategory_ProductCategoryId());
		initEAttribute(getSalesForecastDetail_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecastDetail_QuantityUom(), theUomPackage.getUom(), null, "quantityUom", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastDetail_QuantityUom().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(salesForecastHistoryEClass, SalesForecastHistory.class, "SalesForecastHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesForecastHistory_SalesForecastHistoryId(), ecorePackage.getEString(), "salesForecastHistoryId", null, 1, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_BestCaseAmount(), ecorePackage.getEBigDecimal(), "bestCaseAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ChangeNote(), ecorePackage.getEString(), "changeNote", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ClosedAmount(), ecorePackage.getEBigDecimal(), "closedAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecastHistory_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastHistory_CurrencyUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getSalesForecastHistory_CustomTimePeriod(), thePeriodPackage.getCustomTimePeriod(), null, "customTimePeriod", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastHistory_CustomTimePeriod().getEKeys().add(thePeriodPackage.getCustomTimePeriod_CustomTimePeriodId());
		initEAttribute(getSalesForecastHistory_ForecastAmount(), ecorePackage.getEBigDecimal(), "forecastAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecastHistory_InternalParty(), thePartyPackage_1.getParty(), null, "internalParty", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastHistory_InternalParty().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getSalesForecastHistory_ModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "modifiedByUserLogin", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastHistory_ModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getSalesForecastHistory_ModifiedTimestamp(), ecorePackage.getEDate(), "modifiedTimestamp", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecastHistory_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastHistory_OrganizationParty().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEAttribute(getSalesForecastHistory_ParentSalesForecastId(), ecorePackage.getEString(), "parentSalesForecastId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_PercentOfQuotaClosed(), ecorePackage.getEBigDecimal(), "percentOfQuotaClosed", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_PercentOfQuotaForecast(), ecorePackage.getEBigDecimal(), "percentOfQuotaForecast", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_QuotaAmount(), ecorePackage.getEBigDecimal(), "quotaAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesForecastHistory_SalesForecast(), this.getSalesForecast(), null, "salesForecast", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesForecastHistory_SalesForecast().getEKeys().add(this.getSalesForecast_SalesForecastId());

		initEClass(salesOpportunityEClass, SalesOpportunity.class, "SalesOpportunity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunity_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 1, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunity_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getSalesOpportunity_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunity_CurrencyUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getSalesOpportunity_DataSourceId(), ecorePackage.getEString(), "dataSourceId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_Description(), ecorePackage.getEString(), "description", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_EstimatedAmount(), ecorePackage.getEBigDecimal(), "estimatedAmount", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_EstimatedCloseDate(), ecorePackage.getEDate(), "estimatedCloseDate", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_EstimatedProbability(), ecorePackage.getEBigDecimal(), "estimatedProbability", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_MarketingCampaign(), theCampaignPackage.getMarketingCampaign(), null, "marketingCampaign", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunity_MarketingCampaign().getEKeys().add(theCampaignPackage.getMarketingCampaign_MarketingCampaignId());
		initEAttribute(getSalesOpportunity_NextStep(), ecorePackage.getEString(), "nextStep", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_NextStepDate(), ecorePackage.getEDate(), "nextStepDate", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_OpportunityName(), ecorePackage.getEString(), "opportunityName", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_OpportunityStage(), this.getSalesOpportunityStage(), null, "opportunityStage", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunity_OpportunityStage().getEKeys().add(this.getSalesOpportunityStage_OpportunityStageId());
		initEReference(getSalesOpportunity_SalesOpportunityCompetitors(), this.getSalesOpportunityCompetitor(), null, "salesOpportunityCompetitors", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_SalesOpportunityQuotes(), this.getSalesOpportunityQuote(), null, "salesOpportunityQuotes", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_SalesOpportunityTrckCodes(), this.getSalesOpportunityTrckCode(), null, "salesOpportunityTrckCodes", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_SalesOpportunityWorkEfforts(), this.getSalesOpportunityWorkEffort(), null, "salesOpportunityWorkEfforts", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunity_TypeEnum(), theEnumPackage.getEnumeration(), null, "typeEnum", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunity_TypeEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());

		initEClass(salesOpportunityCompetitorEClass, SalesOpportunityCompetitor.class, "SalesOpportunityCompetitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesOpportunityCompetitor_SalesOpportunity(), this.getSalesOpportunity(), null, "salesOpportunity", null, 1, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityCompetitor_SalesOpportunity().getEKeys().add(this.getSalesOpportunity_SalesOpportunityId());
		initEAttribute(getSalesOpportunityCompetitor_CompetitorPartyId(), ecorePackage.getEString(), "competitorPartyId", null, 1, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_PositionEnumId(), ecorePackage.getEString(), "positionEnumId", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_Strengths(), ecorePackage.getEString(), "strengths", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_Weaknesses(), ecorePackage.getEString(), "weaknesses", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityHistoryEClass, SalesOpportunityHistory.class, "SalesOpportunityHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityHistory_SalesOpportunityHistoryId(), ecorePackage.getEString(), "salesOpportunityHistoryId", null, 1, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_ChangeNote(), ecorePackage.getEString(), "changeNote", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunityHistory_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityHistory_CurrencyUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getSalesOpportunityHistory_Description(), ecorePackage.getEString(), "description", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_EstimatedAmount(), ecorePackage.getEBigDecimal(), "estimatedAmount", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_EstimatedCloseDate(), ecorePackage.getEDate(), "estimatedCloseDate", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_EstimatedProbability(), ecorePackage.getEBigDecimal(), "estimatedProbability", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunityHistory_ModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "modifiedByUserLogin", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityHistory_ModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getSalesOpportunityHistory_ModifiedTimestamp(), ecorePackage.getEDate(), "modifiedTimestamp", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_NextStep(), ecorePackage.getEString(), "nextStep", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesOpportunityHistory_OpportunityStage(), this.getSalesOpportunityStage(), null, "opportunityStage", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityHistory_OpportunityStage().getEKeys().add(this.getSalesOpportunityStage_OpportunityStageId());
		initEReference(getSalesOpportunityHistory_SalesOpportunity(), this.getSalesOpportunity(), null, "salesOpportunity", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityHistory_SalesOpportunity().getEKeys().add(this.getSalesOpportunity_SalesOpportunityId());

		initEClass(salesOpportunityQuoteEClass, SalesOpportunityQuote.class, "SalesOpportunityQuote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesOpportunityQuote_SalesOpportunity(), this.getSalesOpportunity(), null, "salesOpportunity", null, 1, 1, SalesOpportunityQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityQuote_SalesOpportunity().getEKeys().add(this.getSalesOpportunity_SalesOpportunityId());
		initEReference(getSalesOpportunityQuote_Quote(), theQuotePackage.getQuote(), null, "quote", null, 1, 1, SalesOpportunityQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityQuote_Quote().getEKeys().add(theQuotePackage.getQuote_QuoteId());

		initEClass(salesOpportunityRoleEClass, SalesOpportunityRole.class, "SalesOpportunityRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesOpportunityRole_SalesOpportunity(), this.getSalesOpportunity(), null, "salesOpportunity", null, 1, 1, SalesOpportunityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityRole_SalesOpportunity().getEKeys().add(this.getSalesOpportunity_SalesOpportunityId());
		initEReference(getSalesOpportunityRole_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, SalesOpportunityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityRole_Party().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getSalesOpportunityRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, SalesOpportunityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityRole_RoleType().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());

		initEClass(salesOpportunityStageEClass, SalesOpportunityStage.class, "SalesOpportunityStage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityStage_OpportunityStageId(), ecorePackage.getEString(), "opportunityStageId", null, 1, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityStage_DefaultProbability(), ecorePackage.getEBigDecimal(), "defaultProbability", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityStage_Description(), ecorePackage.getEString(), "description", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityStage_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityTrckCodeEClass, SalesOpportunityTrckCode.class, "SalesOpportunityTrckCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesOpportunityTrckCode_SalesOpportunity(), this.getSalesOpportunity(), null, "salesOpportunity", null, 1, 1, SalesOpportunityTrckCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityTrckCode_SalesOpportunity().getEKeys().add(this.getSalesOpportunity_SalesOpportunityId());
		initEAttribute(getSalesOpportunityTrckCode_TrackingCodeId(), ecorePackage.getEString(), "trackingCodeId", null, 1, 1, SalesOpportunityTrckCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityTrckCode_ReceivedDate(), ecorePackage.getEDate(), "receivedDate", null, 0, 1, SalesOpportunityTrckCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityWorkEffortEClass, SalesOpportunityWorkEffort.class, "SalesOpportunityWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalesOpportunityWorkEffort_SalesOpportunity(), this.getSalesOpportunity(), null, "salesOpportunity", null, 1, 1, SalesOpportunityWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityWorkEffort_SalesOpportunity().getEKeys().add(this.getSalesOpportunity_SalesOpportunityId());
		initEReference(getSalesOpportunityWorkEffort_WorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "workEffort", null, 1, 1, SalesOpportunityWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSalesOpportunityWorkEffort_WorkEffort().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
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
		  (getSalesForecast_SalesForecastId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesForecast_BestCaseAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecast_ClosedAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecast_ForecastAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecast_PercentOfQuotaClosed(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesForecast_PercentOfQuotaForecast(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesForecast_PipelineAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecast_QuotaAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecastDetail_SalesForecastDetailId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesForecastDetail_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecastDetail_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesForecastHistory_SalesForecastHistoryId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesForecastHistory_BestCaseAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecastHistory_ClosedAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecastHistory_ForecastAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesForecastHistory_ParentSalesForecastId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesForecastHistory_PercentOfQuotaClosed(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesForecastHistory_PercentOfQuotaForecast(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesForecastHistory_QuotaAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesOpportunity_DataSourceId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesOpportunity_EstimatedAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesOpportunity_EstimatedProbability(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesOpportunity_OpportunityName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_CompetitorPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_PositionEnumId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesOpportunityHistory_SalesOpportunityHistoryId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesOpportunityHistory_EstimatedAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSalesOpportunityHistory_EstimatedProbability(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesOpportunityStage_OpportunityStageId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSalesOpportunityStage_DefaultProbability(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getSalesOpportunityStage_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getSalesOpportunityStage_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSalesOpportunityTrckCode_TrackingCodeId(),
		   source,
		   new String[] {
			   "length", "20"
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
		  (getSalesForecastDetail_SalesForecast(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesForecastDetail_SalesForecastDetailId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesForecastHistory_ChangeNote(),
		   source,
		   new String[] {
			   "help", "Used to track a reason for this change"
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_SalesOpportunity(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_CompetitorPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityHistory_ChangeNote(),
		   source,
		   new String[] {
			   "help", "Used to track a reason for this change"
		   });
		addAnnotation
		  (getSalesOpportunityQuote_SalesOpportunity(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityQuote_Quote(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityRole_SalesOpportunity(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityTrckCode_SalesOpportunity(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityTrckCode_TrackingCodeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityWorkEffort_SalesOpportunity(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityWorkEffort_WorkEffort(),
		   source,
		   new String[] {
			   "key", "true"
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
		  (salesForecastEClass,
		   source,
		   new String[] {
			   "title", "Stores sales forecast data for sales opportunities."
		   });
		addAnnotation
		  (salesForecastDetailEClass,
		   source,
		   new String[] {
			   "title", "Stores Details of Resourses of Sales Forecast for simulation of MRP"
		   });
		addAnnotation
		  (salesForecastHistoryEClass,
		   source,
		   new String[] {
			   "title", "Keeps a record of changes to a sales forecast."
		   });
		addAnnotation
		  (salesOpportunityEClass,
		   source,
		   new String[] {
			   "title", "Main entity of information about sales opportunities",
			   "formula", "description"
		   });
		addAnnotation
		  (salesOpportunityCompetitorEClass,
		   source,
		   new String[] {
			   "title", "Sales opportunity competitors record"
		   });
		addAnnotation
		  (salesOpportunityHistoryEClass,
		   source,
		   new String[] {
			   "title", "Tracks a history of sales opportunity information",
			   "formula", "description"
		   });
		addAnnotation
		  (salesOpportunityQuoteEClass,
		   source,
		   new String[] {
			   "title", "Relates sales opportunities to their quotes."
		   });
		addAnnotation
		  (salesOpportunityRoleEClass,
		   source,
		   new String[] {
			   "title", "Describes roles of different parties involved in a sales opportunity"
		   });
		addAnnotation
		  (salesOpportunityStageEClass,
		   source,
		   new String[] {
			   "title", "Describes stages of a sales opportunity with associated probability factors.",
			   "formula", "description"
		   });
		addAnnotation
		  (salesOpportunityTrckCodeEClass,
		   source,
		   new String[] {
			   "title", "Sales opportunity traking code"
		   });
		addAnnotation
		  (salesOpportunityWorkEffortEClass,
		   source,
		   new String[] {
			   "title", "Relates sales opportunities to their work efforts."
		   });
	}

} //OpportunityPackageImpl
