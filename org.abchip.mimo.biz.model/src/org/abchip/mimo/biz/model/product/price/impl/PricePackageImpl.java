/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.price.impl;

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
import org.abchip.mimo.biz.model.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.model.product.inventory.impl.InventoryPackageImpl;
import org.abchip.mimo.biz.model.product.price.PriceFactory;
import org.abchip.mimo.biz.model.product.price.PricePackage;
import org.abchip.mimo.biz.model.product.price.ProductFeaturePrice;
import org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType;
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.model.product.price.ProductPriceAction;
import org.abchip.mimo.biz.model.product.price.ProductPriceActionType;
import org.abchip.mimo.biz.model.product.price.ProductPriceAutoNotice;
import org.abchip.mimo.biz.model.product.price.ProductPriceChange;
import org.abchip.mimo.biz.model.product.price.ProductPriceCond;
import org.abchip.mimo.biz.model.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.model.product.price.ProductPriceRule;
import org.abchip.mimo.biz.model.product.price.ProductPriceType;
import org.abchip.mimo.biz.model.product.price.QuantityBreak;
import org.abchip.mimo.biz.model.product.price.QuantityBreakType;
import org.abchip.mimo.biz.model.product.price.SaleType;
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
public class PricePackageImpl extends EPackageImpl implements PricePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFeaturePriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPaymentMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceActionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceAutoNoticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPricePurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPriceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityBreakTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saleTypeEClass = null;

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
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PricePackageImpl() {
		super(eNS_URI, PriceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PricePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PricePackage init() {
		if (isInited) return (PricePackage)EPackage.Registry.INSTANCE.getEPackage(PricePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPricePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PricePackageImpl thePricePackage = registeredPricePackage instanceof PricePackageImpl ? (PricePackageImpl)registeredPricePackage : new PricePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(registeredPackage instanceof InventoryPackageImpl ? registeredPackage : InventoryPackage.eINSTANCE);
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
		thePricePackage.createPackageContents();
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
		theInventoryPackage.createPackageContents();
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
		thePricePackage.initializePackageContents();
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
		theInventoryPackage.initializePackageContents();
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
		thePricePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PricePackage.eNS_URI, thePricePackage);
		return thePricePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductFeaturePrice() {
		return productFeaturePriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductFeaturePrice_ProductPriceType() {
		return (EReference)productFeaturePriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductFeaturePrice_CurrencyUom() {
		return (EReference)productFeaturePriceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductFeaturePrice_ProductFeatureId() {
		return (EAttribute)productFeaturePriceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductFeaturePrice_FromDate() {
		return (EAttribute)productFeaturePriceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductFeaturePrice_CreatedByUserLogin() {
		return (EReference)productFeaturePriceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductFeaturePrice_CreatedDate() {
		return (EAttribute)productFeaturePriceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductFeaturePrice_LastModifiedByUserLogin() {
		return (EReference)productFeaturePriceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductFeaturePrice_LastModifiedDate() {
		return (EAttribute)productFeaturePriceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductFeaturePrice_Price() {
		return (EAttribute)productFeaturePriceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductFeaturePrice_ThruDate() {
		return (EAttribute)productFeaturePriceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPaymentMethodType() {
		return productPaymentMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPaymentMethodType_Product() {
		return (EReference)productPaymentMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPaymentMethodType_PaymentMethodType() {
		return (EReference)productPaymentMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPaymentMethodType_ProductPricePurpose() {
		return (EReference)productPaymentMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPaymentMethodType_FromDate() {
		return (EAttribute)productPaymentMethodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPaymentMethodType_SequenceNum() {
		return (EAttribute)productPaymentMethodTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPaymentMethodType_ThruDate() {
		return (EAttribute)productPaymentMethodTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPrice() {
		return productPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_Product() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_ProductPriceType() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_ProductPricePurpose() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_CurrencyUom() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_ProductStoreGroup() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_FromDate() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_CreatedByUserLogin() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_CreatedDate() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_CustomPriceCalcService() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_LastModifiedByUserLogin() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_LastModifiedDate() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_Price() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_PriceWithTax() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_PriceWithoutTax() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_TaxAmount() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_TaxAuthGeo() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_TaxAuthParty() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_TaxInPrice() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_TaxPercentage() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPrice_TermUom() {
		return (EReference)productPriceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPrice_ThruDate() {
		return (EAttribute)productPriceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceAction() {
		return productPriceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceAction_ProductPriceRule() {
		return (EReference)productPriceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAction_ProductPriceActionSeqId() {
		return (EAttribute)productPriceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAction_Amount() {
		return (EAttribute)productPriceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceAction_ProductPriceActionType() {
		return (EReference)productPriceActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAction_RateCode() {
		return (EAttribute)productPriceActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceActionType() {
		return productPriceActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceActionType_ProductPriceActionTypeId() {
		return (EAttribute)productPriceActionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceActionType_Description() {
		return (EAttribute)productPriceActionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceAutoNotice() {
		return productPriceAutoNoticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAutoNotice_ProductPriceNoticeId() {
		return (EAttribute)productPriceAutoNoticeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAutoNotice_FacilityId() {
		return (EAttribute)productPriceAutoNoticeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAutoNotice_FromDate() {
		return (EAttribute)productPriceAutoNoticeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAutoNotice_RunDate() {
		return (EAttribute)productPriceAutoNoticeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceAutoNotice_ThruDate() {
		return (EAttribute)productPriceAutoNoticeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceChange() {
		return productPriceChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ProductPriceChangeId() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceChange_ChangedByUserLogin() {
		return (EReference)productPriceChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ChangedDate() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_CurrencyUomId() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_FromDate() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_OldPrice() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_Price() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ProductId() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ProductPricePurposeId() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ProductPriceTypeId() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ProductStoreGroupId() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceChange_ThruDate() {
		return (EAttribute)productPriceChangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceCond() {
		return productPriceCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceCond_ProductPriceRule() {
		return (EReference)productPriceCondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceCond_ProductPriceCondSeqId() {
		return (EAttribute)productPriceCondEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceCond_CondValue() {
		return (EAttribute)productPriceCondEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceCond_InputParamEnum() {
		return (EReference)productPriceCondEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceCond_OperatorEnum() {
		return (EReference)productPriceCondEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPricePurpose() {
		return productPricePurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPricePurpose_ProductPricePurposeId() {
		return (EAttribute)productPricePurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPricePurpose_Description() {
		return (EAttribute)productPricePurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceRule() {
		return productPriceRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceRule_ProductPriceRuleId() {
		return (EAttribute)productPriceRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceRule_Description() {
		return (EAttribute)productPriceRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceRule_FromDate() {
		return (EAttribute)productPriceRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceRule_IsSale() {
		return (EAttribute)productPriceRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceRule_ProductPriceActions() {
		return (EReference)productPriceRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPriceRule_ProductPriceConds() {
		return (EReference)productPriceRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceRule_RuleName() {
		return (EAttribute)productPriceRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceRule_ThruDate() {
		return (EAttribute)productPriceRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPriceType() {
		return productPriceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceType_ProductPriceTypeId() {
		return (EAttribute)productPriceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductPriceType_Description() {
		return (EAttribute)productPriceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityBreak() {
		return quantityBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityBreak_QuantityBreakId() {
		return (EAttribute)quantityBreakEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityBreak_FromQuantity() {
		return (EAttribute)quantityBreakEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantityBreak_QuantityBreakType() {
		return (EReference)quantityBreakEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityBreak_ThruQuantity() {
		return (EAttribute)quantityBreakEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityBreakType() {
		return quantityBreakTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityBreakType_QuantityBreakTypeId() {
		return (EAttribute)quantityBreakTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityBreakType_Description() {
		return (EAttribute)quantityBreakTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSaleType() {
		return saleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaleType_SaleTypeId() {
		return (EAttribute)saleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaleType_Description() {
		return (EAttribute)saleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriceFactory getPriceFactory() {
		return (PriceFactory)getEFactoryInstance();
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
		productFeaturePriceEClass = createEClass(PRODUCT_FEATURE_PRICE);
		createEReference(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE);
		createEReference(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__CURRENCY_UOM);
		createEAttribute(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__FROM_DATE);
		createEAttribute(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID);
		createEReference(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN);
		createEAttribute(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__CREATED_DATE);
		createEReference(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE);
		createEAttribute(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__PRICE);
		createEAttribute(productFeaturePriceEClass, PRODUCT_FEATURE_PRICE__THRU_DATE);

		productPaymentMethodTypeEClass = createEClass(PRODUCT_PAYMENT_METHOD_TYPE);
		createEReference(productPaymentMethodTypeEClass, PRODUCT_PAYMENT_METHOD_TYPE__PRODUCT);
		createEReference(productPaymentMethodTypeEClass, PRODUCT_PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE);
		createEReference(productPaymentMethodTypeEClass, PRODUCT_PAYMENT_METHOD_TYPE__PRODUCT_PRICE_PURPOSE);
		createEAttribute(productPaymentMethodTypeEClass, PRODUCT_PAYMENT_METHOD_TYPE__FROM_DATE);
		createEAttribute(productPaymentMethodTypeEClass, PRODUCT_PAYMENT_METHOD_TYPE__SEQUENCE_NUM);
		createEAttribute(productPaymentMethodTypeEClass, PRODUCT_PAYMENT_METHOD_TYPE__THRU_DATE);

		productPriceEClass = createEClass(PRODUCT_PRICE);
		createEReference(productPriceEClass, PRODUCT_PRICE__PRODUCT);
		createEReference(productPriceEClass, PRODUCT_PRICE__PRODUCT_PRICE_TYPE);
		createEReference(productPriceEClass, PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE);
		createEReference(productPriceEClass, PRODUCT_PRICE__CURRENCY_UOM);
		createEReference(productPriceEClass, PRODUCT_PRICE__PRODUCT_STORE_GROUP);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__FROM_DATE);
		createEReference(productPriceEClass, PRODUCT_PRICE__CREATED_BY_USER_LOGIN);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__CREATED_DATE);
		createEReference(productPriceEClass, PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE);
		createEReference(productPriceEClass, PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__LAST_MODIFIED_DATE);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__PRICE);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__PRICE_WITH_TAX);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__PRICE_WITHOUT_TAX);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__TAX_AMOUNT);
		createEReference(productPriceEClass, PRODUCT_PRICE__TAX_AUTH_GEO);
		createEReference(productPriceEClass, PRODUCT_PRICE__TAX_AUTH_PARTY);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__TAX_IN_PRICE);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__TAX_PERCENTAGE);
		createEReference(productPriceEClass, PRODUCT_PRICE__TERM_UOM);
		createEAttribute(productPriceEClass, PRODUCT_PRICE__THRU_DATE);

		productPriceActionEClass = createEClass(PRODUCT_PRICE_ACTION);
		createEReference(productPriceActionEClass, PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE);
		createEAttribute(productPriceActionEClass, PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID);
		createEAttribute(productPriceActionEClass, PRODUCT_PRICE_ACTION__AMOUNT);
		createEReference(productPriceActionEClass, PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE);
		createEAttribute(productPriceActionEClass, PRODUCT_PRICE_ACTION__RATE_CODE);

		productPriceActionTypeEClass = createEClass(PRODUCT_PRICE_ACTION_TYPE);
		createEAttribute(productPriceActionTypeEClass, PRODUCT_PRICE_ACTION_TYPE__PRODUCT_PRICE_ACTION_TYPE_ID);
		createEAttribute(productPriceActionTypeEClass, PRODUCT_PRICE_ACTION_TYPE__DESCRIPTION);

		productPriceAutoNoticeEClass = createEClass(PRODUCT_PRICE_AUTO_NOTICE);
		createEAttribute(productPriceAutoNoticeEClass, PRODUCT_PRICE_AUTO_NOTICE__PRODUCT_PRICE_NOTICE_ID);
		createEAttribute(productPriceAutoNoticeEClass, PRODUCT_PRICE_AUTO_NOTICE__FACILITY_ID);
		createEAttribute(productPriceAutoNoticeEClass, PRODUCT_PRICE_AUTO_NOTICE__FROM_DATE);
		createEAttribute(productPriceAutoNoticeEClass, PRODUCT_PRICE_AUTO_NOTICE__RUN_DATE);
		createEAttribute(productPriceAutoNoticeEClass, PRODUCT_PRICE_AUTO_NOTICE__THRU_DATE);

		productPriceChangeEClass = createEClass(PRODUCT_PRICE_CHANGE);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID);
		createEReference(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__CHANGED_DATE);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__FROM_DATE);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__OLD_PRICE);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__PRICE);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__PRODUCT_ID);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID);
		createEAttribute(productPriceChangeEClass, PRODUCT_PRICE_CHANGE__THRU_DATE);

		productPriceCondEClass = createEClass(PRODUCT_PRICE_COND);
		createEReference(productPriceCondEClass, PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE);
		createEAttribute(productPriceCondEClass, PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID);
		createEAttribute(productPriceCondEClass, PRODUCT_PRICE_COND__COND_VALUE);
		createEReference(productPriceCondEClass, PRODUCT_PRICE_COND__INPUT_PARAM_ENUM);
		createEReference(productPriceCondEClass, PRODUCT_PRICE_COND__OPERATOR_ENUM);

		productPricePurposeEClass = createEClass(PRODUCT_PRICE_PURPOSE);
		createEAttribute(productPricePurposeEClass, PRODUCT_PRICE_PURPOSE__PRODUCT_PRICE_PURPOSE_ID);
		createEAttribute(productPricePurposeEClass, PRODUCT_PRICE_PURPOSE__DESCRIPTION);

		productPriceRuleEClass = createEClass(PRODUCT_PRICE_RULE);
		createEAttribute(productPriceRuleEClass, PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID);
		createEAttribute(productPriceRuleEClass, PRODUCT_PRICE_RULE__DESCRIPTION);
		createEAttribute(productPriceRuleEClass, PRODUCT_PRICE_RULE__FROM_DATE);
		createEAttribute(productPriceRuleEClass, PRODUCT_PRICE_RULE__IS_SALE);
		createEReference(productPriceRuleEClass, PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS);
		createEReference(productPriceRuleEClass, PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS);
		createEAttribute(productPriceRuleEClass, PRODUCT_PRICE_RULE__RULE_NAME);
		createEAttribute(productPriceRuleEClass, PRODUCT_PRICE_RULE__THRU_DATE);

		productPriceTypeEClass = createEClass(PRODUCT_PRICE_TYPE);
		createEAttribute(productPriceTypeEClass, PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID);
		createEAttribute(productPriceTypeEClass, PRODUCT_PRICE_TYPE__DESCRIPTION);

		quantityBreakEClass = createEClass(QUANTITY_BREAK);
		createEAttribute(quantityBreakEClass, QUANTITY_BREAK__QUANTITY_BREAK_ID);
		createEAttribute(quantityBreakEClass, QUANTITY_BREAK__FROM_QUANTITY);
		createEReference(quantityBreakEClass, QUANTITY_BREAK__QUANTITY_BREAK_TYPE);
		createEAttribute(quantityBreakEClass, QUANTITY_BREAK__THRU_QUANTITY);

		quantityBreakTypeEClass = createEClass(QUANTITY_BREAK_TYPE);
		createEAttribute(quantityBreakTypeEClass, QUANTITY_BREAK_TYPE__QUANTITY_BREAK_TYPE_ID);
		createEAttribute(quantityBreakTypeEClass, QUANTITY_BREAK_TYPE__DESCRIPTION);

		saleTypeEClass = createEClass(SALE_TYPE);
		createEAttribute(saleTypeEClass, SALE_TYPE__SALE_TYPE_ID);
		createEAttribute(saleTypeEClass, SALE_TYPE__DESCRIPTION);
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
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productFeaturePriceEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productFeaturePriceEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productPaymentMethodTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productPaymentMethodTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getProductPriceType());
		g1.getETypeArguments().add(g2);
		productPriceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productPriceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductPriceActionType());
		g1.getETypeArguments().add(g2);
		productPriceActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productPriceActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductPriceAction());
		g1.getETypeArguments().add(g2);
		productPriceActionTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productPriceActionTypeEClass.getEGenericSuperTypes().add(g1);
		productPriceAutoNoticeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productPriceAutoNoticeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productPriceChangeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productPriceChangeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productPriceCondEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productPriceCondEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productPricePurposeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productPricePurposeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productPriceRuleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productPriceRuleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductPrice());
		g1.getETypeArguments().add(g2);
		productPriceTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productPriceTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getQuantityBreakType());
		g1.getETypeArguments().add(g2);
		quantityBreakEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		quantityBreakEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getQuantityBreak());
		g1.getETypeArguments().add(g2);
		quantityBreakTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		quantityBreakTypeEClass.getEGenericSuperTypes().add(g1);
		saleTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		saleTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(productFeaturePriceEClass, ProductFeaturePrice.class, "ProductFeaturePrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductFeaturePrice_ProductPriceType(), this.getProductPriceType(), null, "productPriceType", null, 1, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFeaturePrice_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 1, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturePrice_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturePrice_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 1, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFeaturePrice_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturePrice_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFeaturePrice_LastModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "lastModifiedByUserLogin", null, 0, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturePrice_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturePrice_Price(), ecorePackage.getEBigDecimal(), "price", null, 0, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturePrice_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductFeaturePrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPaymentMethodTypeEClass, ProductPaymentMethodType.class, "ProductPaymentMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductPaymentMethodType_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, ProductPaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPaymentMethodType_PaymentMethodType(), thePaymentPackage.getPaymentMethodType(), null, "paymentMethodType", null, 1, 1, ProductPaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPaymentMethodType_ProductPricePurpose(), this.getProductPricePurpose(), null, "productPricePurpose", null, 1, 1, ProductPaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPaymentMethodType_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductPaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPaymentMethodType_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductPaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPaymentMethodType_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductPaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceEClass, ProductPrice.class, "ProductPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductPrice_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_ProductPriceType(), this.getProductPriceType(), null, "productPriceType", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_ProductPricePurpose(), this.getProductPricePurpose(), null, "productPricePurpose", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_ProductStoreGroup(), theStorePackage.getProductStoreGroup(), null, "productStoreGroup", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_CustomPriceCalcService(), theMethodPackage.getCustomMethod(), null, "customPriceCalcService", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_LastModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "lastModifiedByUserLogin", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_Price(), ecorePackage.getEBigDecimal(), "price", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_PriceWithTax(), ecorePackage.getEBigDecimal(), "priceWithTax", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_PriceWithoutTax(), ecorePackage.getEBigDecimal(), "priceWithoutTax", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_TaxAmount(), ecorePackage.getEBigDecimal(), "taxAmount", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_TaxAuthGeo(), theGeoPackage.getGeo(), null, "taxAuthGeo", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_TaxAuthParty(), thePartyPackage_1.getParty(), null, "taxAuthParty", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_TaxInPrice(), ecorePackage.getEBoolean(), "taxInPrice", null, 1, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_TaxPercentage(), ecorePackage.getEBigDecimal(), "taxPercentage", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPrice_TermUom(), theUomPackage.getUom(), null, "termUom", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPrice_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceActionEClass, ProductPriceAction.class, "ProductPriceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductPriceAction_ProductPriceRule(), this.getProductPriceRule(), null, "productPriceRule", null, 1, 1, ProductPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAction_ProductPriceActionSeqId(), ecorePackage.getEString(), "productPriceActionSeqId", null, 1, 1, ProductPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAction_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, ProductPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPriceAction_ProductPriceActionType(), this.getProductPriceActionType(), null, "productPriceActionType", null, 0, 1, ProductPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAction_RateCode(), ecorePackage.getEString(), "rateCode", null, 0, 1, ProductPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceActionTypeEClass, ProductPriceActionType.class, "ProductPriceActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPriceActionType_ProductPriceActionTypeId(), ecorePackage.getEString(), "productPriceActionTypeId", null, 1, 1, ProductPriceActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceActionType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductPriceActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceAutoNoticeEClass, ProductPriceAutoNotice.class, "ProductPriceAutoNotice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPriceAutoNotice_ProductPriceNoticeId(), ecorePackage.getEString(), "productPriceNoticeId", null, 1, 1, ProductPriceAutoNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAutoNotice_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, ProductPriceAutoNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAutoNotice_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductPriceAutoNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAutoNotice_RunDate(), ecorePackage.getEDate(), "runDate", null, 0, 1, ProductPriceAutoNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceAutoNotice_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductPriceAutoNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceChangeEClass, ProductPriceChange.class, "ProductPriceChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPriceChange_ProductPriceChangeId(), ecorePackage.getEString(), "productPriceChangeId", null, 1, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPriceChange_ChangedByUserLogin(), theLoginPackage.getUserLogin(), null, "changedByUserLogin", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_ChangedDate(), ecorePackage.getEDate(), "changedDate", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_OldPrice(), ecorePackage.getEBigDecimal(), "oldPrice", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_Price(), ecorePackage.getEBigDecimal(), "price", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_ProductPricePurposeId(), ecorePackage.getEString(), "productPricePurposeId", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_ProductPriceTypeId(), ecorePackage.getEString(), "productPriceTypeId", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_ProductStoreGroupId(), ecorePackage.getEString(), "productStoreGroupId", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceChange_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductPriceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceCondEClass, ProductPriceCond.class, "ProductPriceCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductPriceCond_ProductPriceRule(), this.getProductPriceRule(), null, "productPriceRule", null, 1, 1, ProductPriceCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceCond_ProductPriceCondSeqId(), ecorePackage.getEString(), "productPriceCondSeqId", null, 1, 1, ProductPriceCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceCond_CondValue(), ecorePackage.getEString(), "condValue", null, 0, 1, ProductPriceCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPriceCond_InputParamEnum(), theEnumPackage.getEnumeration(), null, "inputParamEnum", null, 0, 1, ProductPriceCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPriceCond_OperatorEnum(), theEnumPackage.getEnumeration(), null, "operatorEnum", null, 0, 1, ProductPriceCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPricePurposeEClass, ProductPricePurpose.class, "ProductPricePurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPricePurpose_ProductPricePurposeId(), ecorePackage.getEString(), "productPricePurposeId", null, 1, 1, ProductPricePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPricePurpose_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductPricePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceRuleEClass, ProductPriceRule.class, "ProductPriceRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPriceRule_ProductPriceRuleId(), ecorePackage.getEString(), "productPriceRuleId", null, 1, 1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceRule_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceRule_IsSale(), ecorePackage.getEBoolean(), "isSale", null, 1, 1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductPriceRule_ProductPriceActions(), this.getProductPriceAction(), null, "productPriceActions", null, 0, -1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductPriceRule_ProductPriceConds(), this.getProductPriceCond(), null, "productPriceConds", null, 0, -1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceRule_RuleName(), ecorePackage.getEString(), "ruleName", null, 0, 1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceRule_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductPriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPriceTypeEClass, ProductPriceType.class, "ProductPriceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPriceType_ProductPriceTypeId(), ecorePackage.getEString(), "productPriceTypeId", null, 1, 1, ProductPriceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPriceType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductPriceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityBreakEClass, QuantityBreak.class, "QuantityBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantityBreak_QuantityBreakId(), ecorePackage.getEString(), "quantityBreakId", null, 1, 1, QuantityBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantityBreak_FromQuantity(), ecorePackage.getEBigDecimal(), "fromQuantity", null, 0, 1, QuantityBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantityBreak_QuantityBreakType(), this.getQuantityBreakType(), null, "quantityBreakType", null, 0, 1, QuantityBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantityBreak_ThruQuantity(), ecorePackage.getEBigDecimal(), "thruQuantity", null, 0, 1, QuantityBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityBreakTypeEClass, QuantityBreakType.class, "QuantityBreakType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantityBreakType_QuantityBreakTypeId(), ecorePackage.getEString(), "quantityBreakTypeId", null, 1, 1, QuantityBreakType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantityBreakType_Description(), ecorePackage.getEString(), "description", null, 0, 1, QuantityBreakType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saleTypeEClass, SaleType.class, "SaleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaleType_SaleTypeId(), ecorePackage.getEString(), "saleTypeId", null, 1, 1, SaleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSaleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, SaleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
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
		  (getProductFeaturePrice_ProductFeatureId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductFeaturePrice_Price(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getProductPaymentMethodType_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductPrice_Price(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getProductPrice_PriceWithTax(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getProductPrice_PriceWithoutTax(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getProductPrice_TaxAmount(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getProductPrice_TaxPercentage(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductPriceAction_ProductPriceActionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceAction_Amount(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductPriceAction_RateCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getProductPriceActionType_ProductPriceActionTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceActionType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductPriceAutoNotice_ProductPriceNoticeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceAutoNotice_FacilityId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceChange_ProductPriceChangeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceChange_CurrencyUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceChange_OldPrice(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getProductPriceChange_Price(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getProductPriceChange_ProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceChange_ProductPricePurposeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceChange_ProductPriceTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceChange_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceCond_ProductPriceCondSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceCond_CondValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductPricePurpose_ProductPricePurposeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPricePurpose_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductPriceRule_ProductPriceRuleId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceRule_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductPriceRule_RuleName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getProductPriceType_ProductPriceTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductPriceType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getQuantityBreak_QuantityBreakId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getQuantityBreak_FromQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getQuantityBreak_ThruQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getQuantityBreakType_QuantityBreakTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getQuantityBreakType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getSaleType_SaleTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSaleType_Description(),
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
		  (getProductFeaturePrice_ProductPriceType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductFeaturePrice_CurrencyUom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductFeaturePrice_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductFeaturePrice_ProductFeatureId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPaymentMethodType_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPaymentMethodType_PaymentMethodType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPaymentMethodType_ProductPricePurpose(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPaymentMethodType_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_ProductPriceType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_ProductPricePurpose(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_CurrencyUom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_ProductStoreGroup(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPrice_CustomPriceCalcService(),
		   source,
		   new String[] {
			   "help", "Points to a CustomMethod used to specify a service for the calculation of the unit price of the product (NOTE: a better name for this field might be priceCalcCustomMethodId)"
		   });
		addAnnotation
		  (getProductPrice_PriceWithTax(),
		   source,
		   new String[] {
			   "help", "Always with tax if populated, regardless of if price does or does not include tax."
		   });
		addAnnotation
		  (getProductPrice_PriceWithoutTax(),
		   source,
		   new String[] {
			   "help", "Always without tax if populated, regardless of if price does or does not include tax."
		   });
		addAnnotation
		  (getProductPrice_TaxInPrice(),
		   source,
		   new String[] {
			   "help", "If Y the price field has tax included for the given taxAuthPartyId/taxAuthGeoId at the taxPercentage."
		   });
		addAnnotation
		  (getProductPrice_TermUom(),
		   source,
		   new String[] {
			   "help", "Mainly used for recurring and usage prices to specify a time/freq measure, or a usage unit measure (bits, minutes, etc)"
		   });
		addAnnotation
		  (getProductPriceAction_ProductPriceRule(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPriceAction_ProductPriceActionSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPriceCond_ProductPriceRule(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductPriceCond_ProductPriceCondSeqId(),
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
		  (productFeaturePriceEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPaymentMethodTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPriceEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPriceActionEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPriceActionTypeEClass,
		   source,
		   new String[] {
			   "title", "Product Price Type",
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productPriceAutoNoticeEClass,
		   source,
		   new String[] {
			   "title", "Product Price Automatic Notice History",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPriceChangeEClass,
		   source,
		   new String[] {
			   "title", "Product Price Change History",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPriceCondEClass,
		   source,
		   new String[] {
			   "title", "Product Price Condition",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productPricePurposeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productPriceRuleEClass,
		   source,
		   new String[] {
			   "title", "Product Pice Rule",
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productPriceTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (quantityBreakEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (quantityBreakTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (saleTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
	}

} //PricePackageImpl
