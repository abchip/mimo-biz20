/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact.impl;

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
import org.abchip.mimo.biz.model.party.contact.ContactFactory;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechAttribute;
import org.abchip.mimo.biz.model.party.contact.ContactMechLink;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.contact.ContactMechTypeAttr;
import org.abchip.mimo.biz.model.party.contact.ContactMechTypePurpose;
import org.abchip.mimo.biz.model.party.contact.ContactPackage;
import org.abchip.mimo.biz.model.party.contact.EmailAddress;
import org.abchip.mimo.biz.model.party.contact.EmailAddressVerification;
import org.abchip.mimo.biz.model.party.contact.FtpAddress;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMechPurpose;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.contact.ValidContactMechRole;
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
public class ContactPackageImpl extends EPackageImpl implements ContactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechPurposeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMechTypePurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailAddressVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftpAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyContactMechPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telecomNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validContactMechRoleEClass = null;

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
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContactPackageImpl() {
		super(eNS_URI, ContactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContactPackage init() {
		if (isInited) return (ContactPackage)EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContactPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContactPackageImpl theContactPackage = registeredContactPackage instanceof ContactPackageImpl ? (ContactPackageImpl)registeredContactPackage : new ContactPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.marketing.contact.ContactPackage.eNS_URI);
		org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl theContactPackage_1 = (org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl ? registeredPackage : org.abchip.mimo.biz.model.marketing.contact.ContactPackage.eINSTANCE);
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
		theContactPackage.createPackageContents();
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
		theContactPackage_1.createPackageContents();
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
		theContactPackage.initializePackageContents();
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
		theContactPackage_1.initializePackageContents();
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
		theContactPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContactPackage.eNS_URI, theContactPackage);
		return theContactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMech() {
		return contactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMech_ContactMechId() {
		return (EAttribute)contactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMech_ContactMechAttributes() {
		return (EReference)contactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMech_ContactMechType() {
		return (EReference)contactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMech_FromContactMechLinks() {
		return (EReference)contactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMech_InfoString() {
		return (EAttribute)contactMechEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMechAttribute() {
		return contactMechAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechAttribute_ContactMech() {
		return (EReference)contactMechAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechAttribute_AttrName() {
		return (EAttribute)contactMechAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechAttribute_AttrDescription() {
		return (EAttribute)contactMechAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechAttribute_AttrValue() {
		return (EAttribute)contactMechAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMechLink() {
		return contactMechLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechLink_ContactMechIdFrom() {
		return (EReference)contactMechLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechLink_ContactMechIdTo() {
		return (EReference)contactMechLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMechPurposeType() {
		return contactMechPurposeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechPurposeType_ContactMechPurposeTypeId() {
		return (EAttribute)contactMechPurposeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechPurposeType_Description() {
		return (EAttribute)contactMechPurposeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMechType() {
		return contactMechTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechType_ContactMechTypeId() {
		return (EAttribute)contactMechTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechType_ContactMechTypeAttrs() {
		return (EReference)contactMechTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechType_ContactMechTypePurposes() {
		return (EReference)contactMechTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechType_Description() {
		return (EAttribute)contactMechTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechType_HasTable() {
		return (EAttribute)contactMechTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechType_ParentType() {
		return (EReference)contactMechTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMechTypeAttr() {
		return contactMechTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechTypeAttr_ContactMechType() {
		return (EReference)contactMechTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechTypeAttr_AttrName() {
		return (EAttribute)contactMechTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMechTypeAttr_Description() {
		return (EAttribute)contactMechTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMechTypePurpose() {
		return contactMechTypePurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechTypePurpose_ContactMechType() {
		return (EReference)contactMechTypePurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactMechTypePurpose_ContactMechPurposeType() {
		return (EReference)contactMechTypePurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmailAddress() {
		return emailAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailAddress_EmailAddress() {
		return (EAttribute)emailAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmailAddressVerification() {
		return emailAddressVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailAddressVerification_EmailAddress() {
		return (EAttribute)emailAddressVerificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailAddressVerification_ExpireDate() {
		return (EAttribute)emailAddressVerificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailAddressVerification_VerifyHash() {
		return (EAttribute)emailAddressVerificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFtpAddress() {
		return ftpAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_BinaryTransfer() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_DefaultTimeout() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_FilePath() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_FtpPassword() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_Hostname() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_PassiveMode() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_Port() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_Username() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFtpAddress_ZipFile() {
		return (EAttribute)ftpAddressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyContactMech() {
		return partyContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContactMech_Party() {
		return (EReference)partyContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContactMech_ContactMech() {
		return (EReference)partyContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_FromDate() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_AllowSolicitation() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_Comments() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_Extension() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_MonthsWithContactMech() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContactMech_RoleType() {
		return (EReference)partyContactMechEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_ThruDate() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_Verified() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMech_YearsWithContactMech() {
		return (EAttribute)partyContactMechEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyContactMechPurpose() {
		return partyContactMechPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContactMechPurpose_ContactMechPurposeType() {
		return (EReference)partyContactMechPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContactMechPurpose_Party() {
		return (EReference)partyContactMechPurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContactMechPurpose_ContactMech() {
		return (EReference)partyContactMechPurposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMechPurpose_FromDate() {
		return (EAttribute)partyContactMechPurposeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContactMechPurpose_ThruDate() {
		return (EAttribute)partyContactMechPurposeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalAddress() {
		return postalAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_Address1() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_Address2() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_AttnName() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_City() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_CityGeo() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_CountryGeo() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_CountyGeo() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_Directions() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_GeoPoint() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_HouseNumber() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_HouseNumberExt() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_MunicipalityGeo() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_PostalAddressBoundaries() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_PostalCode() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_PostalCodeExt() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_PostalCodeGeo() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddress_StateProvinceGeo() {
		return (EReference)postalAddressEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_ToName() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalAddressBoundary() {
		return postalAddressBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddressBoundary_ContactMech() {
		return (EReference)postalAddressBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostalAddressBoundary_Geo() {
		return (EReference)postalAddressBoundaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelecomNumber() {
		return telecomNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelecomNumber_AreaCode() {
		return (EAttribute)telecomNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelecomNumber_AskForName() {
		return (EAttribute)telecomNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelecomNumber_ContactNumber() {
		return (EAttribute)telecomNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelecomNumber_CountryCode() {
		return (EAttribute)telecomNumberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidContactMechRole() {
		return validContactMechRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidContactMechRole_RoleType() {
		return (EReference)validContactMechRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidContactMechRole_ContactMechType() {
		return (EReference)validContactMechRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactFactory getContactFactory() {
		return (ContactFactory)getEFactoryInstance();
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
		contactMechEClass = createEClass(CONTACT_MECH);
		createEAttribute(contactMechEClass, CONTACT_MECH__CONTACT_MECH_ID);
		createEReference(contactMechEClass, CONTACT_MECH__CONTACT_MECH_ATTRIBUTES);
		createEReference(contactMechEClass, CONTACT_MECH__CONTACT_MECH_TYPE);
		createEReference(contactMechEClass, CONTACT_MECH__FROM_CONTACT_MECH_LINKS);
		createEAttribute(contactMechEClass, CONTACT_MECH__INFO_STRING);

		contactMechAttributeEClass = createEClass(CONTACT_MECH_ATTRIBUTE);
		createEReference(contactMechAttributeEClass, CONTACT_MECH_ATTRIBUTE__CONTACT_MECH);
		createEAttribute(contactMechAttributeEClass, CONTACT_MECH_ATTRIBUTE__ATTR_NAME);
		createEAttribute(contactMechAttributeEClass, CONTACT_MECH_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(contactMechAttributeEClass, CONTACT_MECH_ATTRIBUTE__ATTR_VALUE);

		contactMechLinkEClass = createEClass(CONTACT_MECH_LINK);
		createEReference(contactMechLinkEClass, CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM);
		createEReference(contactMechLinkEClass, CONTACT_MECH_LINK__CONTACT_MECH_ID_TO);

		contactMechPurposeTypeEClass = createEClass(CONTACT_MECH_PURPOSE_TYPE);
		createEAttribute(contactMechPurposeTypeEClass, CONTACT_MECH_PURPOSE_TYPE__CONTACT_MECH_PURPOSE_TYPE_ID);
		createEAttribute(contactMechPurposeTypeEClass, CONTACT_MECH_PURPOSE_TYPE__DESCRIPTION);

		contactMechTypeEClass = createEClass(CONTACT_MECH_TYPE);
		createEAttribute(contactMechTypeEClass, CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID);
		createEReference(contactMechTypeEClass, CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS);
		createEReference(contactMechTypeEClass, CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES);
		createEAttribute(contactMechTypeEClass, CONTACT_MECH_TYPE__DESCRIPTION);
		createEAttribute(contactMechTypeEClass, CONTACT_MECH_TYPE__HAS_TABLE);
		createEReference(contactMechTypeEClass, CONTACT_MECH_TYPE__PARENT_TYPE);

		contactMechTypeAttrEClass = createEClass(CONTACT_MECH_TYPE_ATTR);
		createEReference(contactMechTypeAttrEClass, CONTACT_MECH_TYPE_ATTR__CONTACT_MECH_TYPE);
		createEAttribute(contactMechTypeAttrEClass, CONTACT_MECH_TYPE_ATTR__ATTR_NAME);
		createEAttribute(contactMechTypeAttrEClass, CONTACT_MECH_TYPE_ATTR__DESCRIPTION);

		contactMechTypePurposeEClass = createEClass(CONTACT_MECH_TYPE_PURPOSE);
		createEReference(contactMechTypePurposeEClass, CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE);
		createEReference(contactMechTypePurposeEClass, CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE);

		emailAddressEClass = createEClass(EMAIL_ADDRESS);
		createEAttribute(emailAddressEClass, EMAIL_ADDRESS__EMAIL_ADDRESS);

		emailAddressVerificationEClass = createEClass(EMAIL_ADDRESS_VERIFICATION);
		createEAttribute(emailAddressVerificationEClass, EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS);
		createEAttribute(emailAddressVerificationEClass, EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE);
		createEAttribute(emailAddressVerificationEClass, EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH);

		ftpAddressEClass = createEClass(FTP_ADDRESS);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__BINARY_TRANSFER);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__DEFAULT_TIMEOUT);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__FILE_PATH);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__FTP_PASSWORD);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__HOSTNAME);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__PASSIVE_MODE);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__PORT);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__USERNAME);
		createEAttribute(ftpAddressEClass, FTP_ADDRESS__ZIP_FILE);

		partyContactMechEClass = createEClass(PARTY_CONTACT_MECH);
		createEReference(partyContactMechEClass, PARTY_CONTACT_MECH__PARTY);
		createEReference(partyContactMechEClass, PARTY_CONTACT_MECH__CONTACT_MECH);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__FROM_DATE);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__ALLOW_SOLICITATION);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__COMMENTS);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__EXTENSION);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH);
		createEReference(partyContactMechEClass, PARTY_CONTACT_MECH__ROLE_TYPE);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__THRU_DATE);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__VERIFIED);
		createEAttribute(partyContactMechEClass, PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH);

		partyContactMechPurposeEClass = createEClass(PARTY_CONTACT_MECH_PURPOSE);
		createEReference(partyContactMechPurposeEClass, PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE);
		createEReference(partyContactMechPurposeEClass, PARTY_CONTACT_MECH_PURPOSE__PARTY);
		createEReference(partyContactMechPurposeEClass, PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH);
		createEAttribute(partyContactMechPurposeEClass, PARTY_CONTACT_MECH_PURPOSE__FROM_DATE);
		createEAttribute(partyContactMechPurposeEClass, PARTY_CONTACT_MECH_PURPOSE__THRU_DATE);

		postalAddressEClass = createEClass(POSTAL_ADDRESS);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__ADDRESS1);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__ADDRESS2);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__ATTN_NAME);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__CITY);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__CITY_GEO);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__COUNTRY_GEO);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__COUNTY_GEO);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__DIRECTIONS);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__GEO_POINT);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__HOUSE_NUMBER);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__HOUSE_NUMBER_EXT);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__MUNICIPALITY_GEO);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__POSTAL_CODE);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__POSTAL_CODE_EXT);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__POSTAL_CODE_GEO);
		createEReference(postalAddressEClass, POSTAL_ADDRESS__STATE_PROVINCE_GEO);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__TO_NAME);

		postalAddressBoundaryEClass = createEClass(POSTAL_ADDRESS_BOUNDARY);
		createEReference(postalAddressBoundaryEClass, POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH);
		createEReference(postalAddressBoundaryEClass, POSTAL_ADDRESS_BOUNDARY__GEO);

		telecomNumberEClass = createEClass(TELECOM_NUMBER);
		createEAttribute(telecomNumberEClass, TELECOM_NUMBER__AREA_CODE);
		createEAttribute(telecomNumberEClass, TELECOM_NUMBER__ASK_FOR_NAME);
		createEAttribute(telecomNumberEClass, TELECOM_NUMBER__CONTACT_NUMBER);
		createEAttribute(telecomNumberEClass, TELECOM_NUMBER__COUNTRY_CODE);

		validContactMechRoleEClass = createEClass(VALID_CONTACT_MECH_ROLE);
		createEReference(validContactMechRoleEClass, VALID_CONTACT_MECH_ROLE__ROLE_TYPE);
		createEReference(validContactMechRoleEClass, VALID_CONTACT_MECH_ROLE__CONTACT_MECH_TYPE);
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
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getContactMechType());
		g1.getETypeArguments().add(g2);
		contactMechEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		contactMechEClass.getEGenericSuperTypes().add(g1);
		contactMechAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		contactMechAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		contactMechLinkEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		contactMechLinkEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getPartyContactMechPurpose());
		g1.getETypeArguments().add(g2);
		contactMechPurposeTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		contactMechPurposeTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getContactMech());
		g1.getETypeArguments().add(g2);
		contactMechTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		contactMechTypeEClass.getEGenericSuperTypes().add(g1);
		contactMechTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		contactMechTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		contactMechTypePurposeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		contactMechTypePurposeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		emailAddressEClass.getESuperTypes().add(this.getContactMech());
		emailAddressVerificationEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		emailAddressVerificationEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		ftpAddressEClass.getESuperTypes().add(this.getContactMech());
		partyContactMechEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyContactMechEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getContactMechPurposeType());
		g1.getETypeArguments().add(g2);
		partyContactMechPurposeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyContactMechPurposeEClass.getEGenericSuperTypes().add(g1);
		postalAddressEClass.getESuperTypes().add(this.getContactMech());
		postalAddressBoundaryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		postalAddressBoundaryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		telecomNumberEClass.getESuperTypes().add(this.getContactMech());
		validContactMechRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		validContactMechRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(contactMechEClass, ContactMech.class, "ContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactMech_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 1, 1, ContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactMech_ContactMechAttributes(), this.getContactMechAttribute(), null, "contactMechAttributes", null, 0, -1, ContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContactMech_ContactMechType(), this.getContactMechType(), null, "contactMechType", null, 0, 1, ContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMech_ContactMechType().getEKeys().add(this.getContactMechType_ContactMechTypeId());
		initEReference(getContactMech_FromContactMechLinks(), this.getContactMechLink(), null, "fromContactMechLinks", null, 0, -1, ContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMech_InfoString(), ecorePackage.getEString(), "infoString", null, 0, 1, ContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactMechAttributeEClass, ContactMechAttribute.class, "ContactMechAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactMechAttribute_ContactMech(), this.getContactMech(), null, "contactMech", null, 1, 1, ContactMechAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechAttribute_ContactMech().getEKeys().add(this.getContactMech_ContactMechId());
		initEAttribute(getContactMechAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, ContactMechAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMechAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, ContactMechAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMechAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, ContactMechAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactMechLinkEClass, ContactMechLink.class, "ContactMechLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactMechLink_ContactMechIdFrom(), this.getContactMech(), null, "contactMechIdFrom", null, 1, 1, ContactMechLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechLink_ContactMechIdFrom().getEKeys().add(this.getContactMech_ContactMechId());
		initEReference(getContactMechLink_ContactMechIdTo(), this.getContactMech(), null, "contactMechIdTo", null, 1, 1, ContactMechLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechLink_ContactMechIdTo().getEKeys().add(this.getContactMech_ContactMechId());

		initEClass(contactMechPurposeTypeEClass, ContactMechPurposeType.class, "ContactMechPurposeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactMechPurposeType_ContactMechPurposeTypeId(), ecorePackage.getEString(), "contactMechPurposeTypeId", null, 1, 1, ContactMechPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMechPurposeType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContactMechPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactMechTypeEClass, ContactMechType.class, "ContactMechType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactMechType_ContactMechTypeId(), ecorePackage.getEString(), "contactMechTypeId", null, 1, 1, ContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactMechType_ContactMechTypeAttrs(), this.getContactMechTypeAttr(), null, "contactMechTypeAttrs", null, 0, -1, ContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContactMechType_ContactMechTypePurposes(), this.getContactMechTypePurpose(), null, "contactMechTypePurposes", null, 0, -1, ContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMechType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMechType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, ContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactMechType_ParentType(), this.getContactMechType(), null, "parentType", null, 0, 1, ContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechType_ParentType().getEKeys().add(this.getContactMechType_ContactMechTypeId());

		initEClass(contactMechTypeAttrEClass, ContactMechTypeAttr.class, "ContactMechTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactMechTypeAttr_ContactMechType(), this.getContactMechType(), null, "contactMechType", null, 1, 1, ContactMechTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechTypeAttr_ContactMechType().getEKeys().add(this.getContactMechType_ContactMechTypeId());
		initEAttribute(getContactMechTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, ContactMechTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMechTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContactMechTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactMechTypePurposeEClass, ContactMechTypePurpose.class, "ContactMechTypePurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactMechTypePurpose_ContactMechType(), this.getContactMechType(), null, "contactMechType", null, 1, 1, ContactMechTypePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechTypePurpose_ContactMechType().getEKeys().add(this.getContactMechType_ContactMechTypeId());
		initEReference(getContactMechTypePurpose_ContactMechPurposeType(), this.getContactMechPurposeType(), null, "contactMechPurposeType", null, 1, 1, ContactMechTypePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContactMechTypePurpose_ContactMechPurposeType().getEKeys().add(this.getContactMechPurposeType_ContactMechPurposeTypeId());

		initEClass(emailAddressEClass, EmailAddress.class, "EmailAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddress_EmailAddress(), ecorePackage.getEString(), "emailAddress", null, 0, 1, EmailAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailAddressVerificationEClass, EmailAddressVerification.class, "EmailAddressVerification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddressVerification_EmailAddress(), ecorePackage.getEString(), "emailAddress", null, 1, 1, EmailAddressVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressVerification_ExpireDate(), ecorePackage.getEDate(), "expireDate", null, 0, 1, EmailAddressVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressVerification_VerifyHash(), ecorePackage.getEString(), "verifyHash", null, 0, 1, EmailAddressVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftpAddressEClass, FtpAddress.class, "FtpAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFtpAddress_BinaryTransfer(), ecorePackage.getEBooleanObject(), "binaryTransfer", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_DefaultTimeout(), ecorePackage.getELong(), "defaultTimeout", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_FtpPassword(), ecorePackage.getEString(), "ftpPassword", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_PassiveMode(), ecorePackage.getEBooleanObject(), "passiveMode", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_Port(), ecorePackage.getELong(), "port", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_Username(), ecorePackage.getEString(), "username", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFtpAddress_ZipFile(), ecorePackage.getEBooleanObject(), "zipFile", null, 0, 1, FtpAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyContactMechEClass, PartyContactMech.class, "PartyContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyContactMech_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContactMech_Party().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPartyContactMech_ContactMech(), this.getContactMech(), null, "contactMech", null, 1, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContactMech_ContactMech().getEKeys().add(this.getContactMech_ContactMechId());
		initEAttribute(getPartyContactMech_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMech_AllowSolicitation(), ecorePackage.getEBooleanObject(), "allowSolicitation", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMech_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMech_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMech_MonthsWithContactMech(), ecorePackage.getELong(), "monthsWithContactMech", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyContactMech_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContactMech_RoleType().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEAttribute(getPartyContactMech_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMech_Verified(), ecorePackage.getEBooleanObject(), "verified", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMech_YearsWithContactMech(), ecorePackage.getELong(), "yearsWithContactMech", null, 0, 1, PartyContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyContactMechPurposeEClass, PartyContactMechPurpose.class, "PartyContactMechPurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyContactMechPurpose_ContactMechPurposeType(), this.getContactMechPurposeType(), null, "contactMechPurposeType", null, 1, 1, PartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContactMechPurpose_ContactMechPurposeType().getEKeys().add(this.getContactMechPurposeType_ContactMechPurposeTypeId());
		initEReference(getPartyContactMechPurpose_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, PartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContactMechPurpose_Party().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPartyContactMechPurpose_ContactMech(), this.getContactMech(), null, "contactMech", null, 1, 1, PartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContactMechPurpose_ContactMech().getEKeys().add(this.getContactMech_ContactMechId());
		initEAttribute(getPartyContactMechPurpose_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContactMechPurpose_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyContactMechPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressEClass, PostalAddress.class, "PostalAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalAddress_Address1(), ecorePackage.getEString(), "address1", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_Address2(), ecorePackage.getEString(), "address2", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_AttnName(), ecorePackage.getEString(), "attnName", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostalAddress_CityGeo(), theGeoPackage.getGeo(), null, "cityGeo", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_CityGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getPostalAddress_CountryGeo(), theGeoPackage.getGeo(), null, "countryGeo", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_CountryGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getPostalAddress_CountyGeo(), theGeoPackage.getGeo(), null, "countyGeo", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_CountyGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getPostalAddress_Directions(), ecorePackage.getEString(), "directions", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostalAddress_GeoPoint(), theGeoPackage.getGeoPoint(), null, "geoPoint", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_GeoPoint().getEKeys().add(theGeoPackage.getGeoPoint_GeoPointId());
		initEAttribute(getPostalAddress_HouseNumber(), ecorePackage.getELong(), "houseNumber", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_HouseNumberExt(), ecorePackage.getEString(), "houseNumberExt", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostalAddress_MunicipalityGeo(), theGeoPackage.getGeo(), null, "municipalityGeo", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_MunicipalityGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getPostalAddress_PostalAddressBoundaries(), this.getPostalAddressBoundary(), null, "postalAddressBoundaries", null, 0, -1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_PostalCodeExt(), ecorePackage.getEString(), "postalCodeExt", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostalAddress_PostalCodeGeo(), theGeoPackage.getGeo(), null, "postalCodeGeo", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_PostalCodeGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getPostalAddress_StateProvinceGeo(), theGeoPackage.getGeo(), null, "stateProvinceGeo", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddress_StateProvinceGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getPostalAddress_ToName(), ecorePackage.getEString(), "toName", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressBoundaryEClass, PostalAddressBoundary.class, "PostalAddressBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostalAddressBoundary_ContactMech(), this.getPostalAddress(), null, "contactMech", null, 1, 1, PostalAddressBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddressBoundary_ContactMech().getEKeys().add(this.getContactMech_ContactMechId());
		initEReference(getPostalAddressBoundary_Geo(), theGeoPackage.getGeo(), null, "geo", null, 1, 1, PostalAddressBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPostalAddressBoundary_Geo().getEKeys().add(theGeoPackage.getGeo_GeoId());

		initEClass(telecomNumberEClass, TelecomNumber.class, "TelecomNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelecomNumber_AreaCode(), ecorePackage.getEString(), "areaCode", null, 0, 1, TelecomNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNumber_AskForName(), ecorePackage.getEString(), "askForName", null, 0, 1, TelecomNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNumber_ContactNumber(), ecorePackage.getEString(), "contactNumber", null, 0, 1, TelecomNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNumber_CountryCode(), ecorePackage.getEString(), "countryCode", null, 0, 1, TelecomNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validContactMechRoleEClass, ValidContactMechRole.class, "ValidContactMechRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidContactMechRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, ValidContactMechRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getValidContactMechRole_RoleType().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEReference(getValidContactMechRole_ContactMechType(), this.getContactMechType(), null, "contactMechType", null, 1, 1, ValidContactMechRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getValidContactMechRole_ContactMechType().getEKeys().add(this.getContactMechType_ContactMechTypeId());

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
		  (getContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getContactMech_InfoString(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getContactMechAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getContactMechAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getContactMechAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getContactMechPurposeType_ContactMechPurposeTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getContactMechPurposeType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getContactMechType_ContactMechTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getContactMechType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getContactMechTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getContactMechTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getEmailAddress_EmailAddress(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getEmailAddressVerification_EmailAddress(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getEmailAddressVerification_VerifyHash(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFtpAddress_DefaultTimeout(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getFtpAddress_FilePath(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFtpAddress_FtpPassword(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFtpAddress_Hostname(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFtpAddress_Port(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getFtpAddress_Username(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPartyContactMech_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getPartyContactMech_Extension(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPartyContactMech_MonthsWithContactMech(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyContactMech_YearsWithContactMech(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPostalAddress_Address1(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPostalAddress_Address2(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPostalAddress_AttnName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPostalAddress_City(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPostalAddress_Directions(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPostalAddress_HouseNumber(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPostalAddress_HouseNumberExt(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPostalAddress_PostalCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPostalAddress_PostalCodeExt(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPostalAddress_ToName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getTelecomNumber_AreaCode(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getTelecomNumber_AskForName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getTelecomNumber_ContactNumber(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getTelecomNumber_CountryCode(),
		   source,
		   new String[] {
			   "length", "10"
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
		  (getContactMechAttribute_ContactMech(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechLink_ContactMechIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechLink_ContactMechIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechTypeAttr_ContactMechType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechTypePurpose_ContactMechType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getContactMechTypePurpose_ContactMechPurposeType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFtpAddress_FtpPassword(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getPartyContactMech_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContactMech_ContactMech(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContactMech_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContactMechPurpose_ContactMechPurposeType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContactMechPurpose_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContactMechPurpose_ContactMech(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContactMechPurpose_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPostalAddressBoundary_ContactMech(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPostalAddressBoundary_Geo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getValidContactMechRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getValidContactMechRole_ContactMechType(),
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
		  (contactMechEClass,
		   source,
		   new String[] {
			   "title", "Contact Mechanism"
		   });
		addAnnotation
		  (contactMechAttributeEClass,
		   source,
		   new String[] {
			   "title", "Contact Mechanism Attribute"
		   });
		addAnnotation
		  (contactMechLinkEClass,
		   source,
		   new String[] {
			   "title", "Contact Mechanism Link"
		   });
		addAnnotation
		  (contactMechPurposeTypeEClass,
		   source,
		   new String[] {
			   "title", "Contact Mechanism Purpose Type",
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (contactMechTypeEClass,
		   source,
		   new String[] {
			   "title", "Contact Mechanism Type",
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (contactMechTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Contact Mechanism Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (contactMechTypePurposeEClass,
		   source,
		   new String[] {
			   "help", "Defines which ContactMechPurposeType entites apply to which ContactMechType",
			   "title", "Contact Mechanism Type Purpose"
		   });
		addAnnotation
		  (emailAddressVerificationEClass,
		   source,
		   new String[] {
			   "help", "Holds hashes for email address verification"
		   });
		addAnnotation
		  (ftpAddressEClass,
		   source,
		   new String[] {
			   "title", "Ftp server"
		   });
		addAnnotation
		  (partyContactMechEClass,
		   source,
		   new String[] {
			   "title", "Party Contact Mechanism"
		   });
		addAnnotation
		  (partyContactMechPurposeEClass,
		   source,
		   new String[] {
			   "title", "Party Contact Mechanism Purpose"
		   });
		addAnnotation
		  (telecomNumberEClass,
		   source,
		   new String[] {
			   "title", "Telecommunications Number"
		   });
		addAnnotation
		  (validContactMechRoleEClass,
		   source,
		   new String[] {
			   "title", "Valid Contact Mechanism Role"
		   });
	}

} //ContactPackageImpl
