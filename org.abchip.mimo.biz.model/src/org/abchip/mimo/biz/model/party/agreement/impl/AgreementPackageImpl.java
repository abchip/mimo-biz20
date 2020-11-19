/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.agreement.impl;

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
import org.abchip.mimo.biz.model.party.agreement.Addendum;
import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.biz.model.party.agreement.AgreementAttribute;
import org.abchip.mimo.biz.model.party.agreement.AgreementContent;
import org.abchip.mimo.biz.model.party.agreement.AgreementContentType;
import org.abchip.mimo.biz.model.party.agreement.AgreementEmploymentAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementFacilityAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementFactory;
import org.abchip.mimo.biz.model.party.agreement.AgreementGeographicalApplic;
import org.abchip.mimo.biz.model.party.agreement.AgreementItem;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemAttribute;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr;
import org.abchip.mimo.biz.model.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.model.party.agreement.AgreementPartyApplic;
import org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementPromoAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementRole;
import org.abchip.mimo.biz.model.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.model.party.agreement.AgreementTermAttribute;
import org.abchip.mimo.biz.model.party.agreement.AgreementType;
import org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr;
import org.abchip.mimo.biz.model.party.agreement.AgreementWorkEffortApplic;
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.biz.model.party.agreement.TermTypeAttr;
import org.abchip.mimo.biz.model.party.communication.CommunicationPackage;
import org.abchip.mimo.biz.model.party.communication.impl.CommunicationPackageImpl;
import org.abchip.mimo.biz.model.party.contact.ContactPackage;
import org.abchip.mimo.biz.model.party.contact.impl.ContactPackageImpl;
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
public class AgreementPackageImpl extends EPackageImpl implements AgreementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addendumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEmploymentApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementFacilityApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementGeographicalApplicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementItemAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementItemTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementPartyApplicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementProductApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementPromoApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementTermAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementWorkEffortApplicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termTypeAttrEClass = null;

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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgreementPackageImpl() {
		super(eNS_URI, AgreementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgreementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgreementPackage init() {
		if (isInited) return (AgreementPackage)EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgreementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AgreementPackageImpl theAgreementPackage = registeredAgreementPackage instanceof AgreementPackageImpl ? (AgreementPackageImpl)registeredAgreementPackage : new AgreementPackageImpl();

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
		org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl theContactPackage = (org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.model.marketing.contact.impl.ContactPackageImpl ? registeredPackage : org.abchip.mimo.biz.model.marketing.contact.ContactPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);
		ContactPackageImpl theContactPackage_1 = (ContactPackageImpl)(registeredPackage instanceof ContactPackageImpl ? registeredPackage : ContactPackage.eINSTANCE);
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
		theAgreementPackage.createPackageContents();
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
		theAgreementPackage.initializePackageContents();
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
		theAgreementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgreementPackage.eNS_URI, theAgreementPackage);
		return theAgreementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddendum() {
		return addendumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddendum_AddendumId() {
		return (EAttribute)addendumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddendum_AddendumCreationDate() {
		return (EAttribute)addendumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddendum_AddendumEffectiveDate() {
		return (EAttribute)addendumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddendum_AddendumText() {
		return (EAttribute)addendumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddendum_Agreement() {
		return (EReference)addendumEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddendum_AgreementItemSeqId() {
		return (EAttribute)addendumEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreement() {
		return agreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreement_AgreementId() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_AgreementAttributes() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreement_AgreementDate() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_AgreementItems() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_AgreementType() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreement_Description() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreement_FromDate() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_PartyIdFrom() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_PartyIdTo() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_Product() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_RoleTypeIdFrom() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreement_RoleTypeIdTo() {
		return (EReference)agreementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreement_TextData() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreement_ThruDate() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementAttribute() {
		return agreementAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementAttribute_Agreement() {
		return (EReference)agreementAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementAttribute_AttrName() {
		return (EAttribute)agreementAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementAttribute_AttrDescription() {
		return (EAttribute)agreementAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementAttribute_AttrValue() {
		return (EAttribute)agreementAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementContent() {
		return agreementContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementContent_Agreement() {
		return (EReference)agreementContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementContent_Content() {
		return (EReference)agreementContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementContent_AgreementContentType() {
		return (EReference)agreementContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementContent_AgreementItemSeqId() {
		return (EAttribute)agreementContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementContent_FromDate() {
		return (EAttribute)agreementContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementContent_ThruDate() {
		return (EAttribute)agreementContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementContentType() {
		return agreementContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementContentType_AgreementContentTypeId() {
		return (EAttribute)agreementContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementContentType_Description() {
		return (EAttribute)agreementContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementContentType_HasTable() {
		return (EAttribute)agreementContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementContentType_ParentType() {
		return (EReference)agreementContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementEmploymentAppl() {
		return agreementEmploymentApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_AgreementId() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_AgreementItemSeqId() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_PartyIdTo() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_PartyIdFrom() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_RoleTypeIdTo() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_RoleTypeIdFrom() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_FromDate() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_AgreementDate() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementEmploymentAppl_ThruDate() {
		return (EAttribute)agreementEmploymentApplEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementFacilityAppl() {
		return agreementFacilityApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementFacilityAppl_Agreement() {
		return (EReference)agreementFacilityApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementFacilityAppl_Facility() {
		return (EReference)agreementFacilityApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementFacilityAppl_AgreementItemSeqId() {
		return (EAttribute)agreementFacilityApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementGeographicalApplic() {
		return agreementGeographicalApplicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementGeographicalApplic_Agreement() {
		return (EReference)agreementGeographicalApplicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementGeographicalApplic_Geo() {
		return (EReference)agreementGeographicalApplicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementGeographicalApplic_AgreementItemSeqId() {
		return (EAttribute)agreementGeographicalApplicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementItem() {
		return agreementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementItem_Agreement() {
		return (EReference)agreementItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItem_AgreementItemSeqId() {
		return (EAttribute)agreementItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItem_AgreementImage() {
		return (EAttribute)agreementItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementItem_AgreementItemType() {
		return (EReference)agreementItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItem_AgreementText() {
		return (EAttribute)agreementItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItem_CurrencyUomId() {
		return (EAttribute)agreementItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementItemAttribute() {
		return agreementItemAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemAttribute_AgreementId() {
		return (EAttribute)agreementItemAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemAttribute_AgreementItemSeqId() {
		return (EAttribute)agreementItemAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemAttribute_AttrName() {
		return (EAttribute)agreementItemAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemAttribute_AttrDescription() {
		return (EAttribute)agreementItemAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemAttribute_AttrValue() {
		return (EAttribute)agreementItemAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementItemType() {
		return agreementItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemType_AgreementItemTypeId() {
		return (EAttribute)agreementItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementItemType_AgreementItemTypeAttrs() {
		return (EReference)agreementItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemType_Description() {
		return (EAttribute)agreementItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemType_HasTable() {
		return (EAttribute)agreementItemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementItemType_ParentType() {
		return (EReference)agreementItemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementItemTypeAttr() {
		return agreementItemTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementItemTypeAttr_AgreementItemType() {
		return (EReference)agreementItemTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemTypeAttr_AttrName() {
		return (EAttribute)agreementItemTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementItemTypeAttr_Description() {
		return (EAttribute)agreementItemTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementPartyApplic() {
		return agreementPartyApplicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementPartyApplic_Agreement() {
		return (EReference)agreementPartyApplicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementPartyApplic_Party() {
		return (EReference)agreementPartyApplicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementPartyApplic_AgreementItemSeqId() {
		return (EAttribute)agreementPartyApplicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementProductAppl() {
		return agreementProductApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementProductAppl_Agreement() {
		return (EReference)agreementProductApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementProductAppl_Product() {
		return (EReference)agreementProductApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementProductAppl_AgreementItemSeqId() {
		return (EAttribute)agreementProductApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementProductAppl_Price() {
		return (EAttribute)agreementProductApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementPromoAppl() {
		return agreementPromoApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementPromoAppl_ProductPromo() {
		return (EReference)agreementPromoApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementPromoAppl_Agreement() {
		return (EReference)agreementPromoApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementPromoAppl_AgreementItemSeqId() {
		return (EAttribute)agreementPromoApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementPromoAppl_FromDate() {
		return (EAttribute)agreementPromoApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementPromoAppl_SequenceNum() {
		return (EAttribute)agreementPromoApplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementPromoAppl_ThruDate() {
		return (EAttribute)agreementPromoApplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementRole() {
		return agreementRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementRole_Agreement() {
		return (EReference)agreementRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementRole_Party() {
		return (EReference)agreementRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementRole_RoleType() {
		return (EReference)agreementRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementTerm() {
		return agreementTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_AgreementTermId() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementTerm_Agreement() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_AgreementItemSeqId() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementTerm_AgreementTermAttributes() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_Description() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_FromDate() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementTerm_InvoiceItemType() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_MaxQuantity() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_MinQuantity() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_TermDays() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementTerm_TermType() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_TermValue() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_TextValue() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTerm_ThruDate() {
		return (EAttribute)agreementTermEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementTermAttribute() {
		return agreementTermAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementTermAttribute_AgreementTerm() {
		return (EReference)agreementTermAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTermAttribute_AttrName() {
		return (EAttribute)agreementTermAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTermAttribute_AttrDescription() {
		return (EAttribute)agreementTermAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTermAttribute_AttrValue() {
		return (EAttribute)agreementTermAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementType() {
		return agreementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementType_AgreementTypeId() {
		return (EAttribute)agreementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementType_AgreementTypeAttrs() {
		return (EReference)agreementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementType_Description() {
		return (EAttribute)agreementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementType_HasTable() {
		return (EAttribute)agreementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementType_ParentType() {
		return (EReference)agreementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementTypeAttr() {
		return agreementTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementTypeAttr_AgreementType() {
		return (EReference)agreementTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTypeAttr_AttrName() {
		return (EAttribute)agreementTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementTypeAttr_Description() {
		return (EAttribute)agreementTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementWorkEffortApplic() {
		return agreementWorkEffortApplicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementWorkEffortApplic_Agreement() {
		return (EReference)agreementWorkEffortApplicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementWorkEffortApplic_WorkEffort() {
		return (EReference)agreementWorkEffortApplicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementWorkEffortApplic_AgreementItemSeqId() {
		return (EAttribute)agreementWorkEffortApplicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTermType() {
		return termTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermType_TermTypeId() {
		return (EAttribute)termTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermType_Description() {
		return (EAttribute)termTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermType_HasTable() {
		return (EAttribute)termTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTermType_ParentType() {
		return (EReference)termTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTermType_TermTypeAttrs() {
		return (EReference)termTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTermTypeAttr() {
		return termTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTermTypeAttr_TermType() {
		return (EReference)termTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermTypeAttr_AttrName() {
		return (EAttribute)termTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermTypeAttr_Description() {
		return (EAttribute)termTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementFactory getAgreementFactory() {
		return (AgreementFactory)getEFactoryInstance();
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
		addendumEClass = createEClass(ADDENDUM);
		createEAttribute(addendumEClass, ADDENDUM__ADDENDUM_ID);
		createEAttribute(addendumEClass, ADDENDUM__ADDENDUM_CREATION_DATE);
		createEAttribute(addendumEClass, ADDENDUM__ADDENDUM_EFFECTIVE_DATE);
		createEAttribute(addendumEClass, ADDENDUM__ADDENDUM_TEXT);
		createEReference(addendumEClass, ADDENDUM__AGREEMENT);
		createEAttribute(addendumEClass, ADDENDUM__AGREEMENT_ITEM_SEQ_ID);

		agreementEClass = createEClass(AGREEMENT);
		createEAttribute(agreementEClass, AGREEMENT__AGREEMENT_ID);
		createEReference(agreementEClass, AGREEMENT__AGREEMENT_ATTRIBUTES);
		createEAttribute(agreementEClass, AGREEMENT__AGREEMENT_DATE);
		createEReference(agreementEClass, AGREEMENT__AGREEMENT_ITEMS);
		createEReference(agreementEClass, AGREEMENT__AGREEMENT_TYPE);
		createEAttribute(agreementEClass, AGREEMENT__DESCRIPTION);
		createEAttribute(agreementEClass, AGREEMENT__FROM_DATE);
		createEReference(agreementEClass, AGREEMENT__PARTY_ID_FROM);
		createEReference(agreementEClass, AGREEMENT__PARTY_ID_TO);
		createEReference(agreementEClass, AGREEMENT__PRODUCT);
		createEReference(agreementEClass, AGREEMENT__ROLE_TYPE_ID_FROM);
		createEReference(agreementEClass, AGREEMENT__ROLE_TYPE_ID_TO);
		createEAttribute(agreementEClass, AGREEMENT__TEXT_DATA);
		createEAttribute(agreementEClass, AGREEMENT__THRU_DATE);

		agreementAttributeEClass = createEClass(AGREEMENT_ATTRIBUTE);
		createEReference(agreementAttributeEClass, AGREEMENT_ATTRIBUTE__AGREEMENT);
		createEAttribute(agreementAttributeEClass, AGREEMENT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(agreementAttributeEClass, AGREEMENT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(agreementAttributeEClass, AGREEMENT_ATTRIBUTE__ATTR_VALUE);

		agreementContentEClass = createEClass(AGREEMENT_CONTENT);
		createEReference(agreementContentEClass, AGREEMENT_CONTENT__AGREEMENT);
		createEReference(agreementContentEClass, AGREEMENT_CONTENT__CONTENT);
		createEReference(agreementContentEClass, AGREEMENT_CONTENT__AGREEMENT_CONTENT_TYPE);
		createEAttribute(agreementContentEClass, AGREEMENT_CONTENT__AGREEMENT_ITEM_SEQ_ID);
		createEAttribute(agreementContentEClass, AGREEMENT_CONTENT__FROM_DATE);
		createEAttribute(agreementContentEClass, AGREEMENT_CONTENT__THRU_DATE);

		agreementContentTypeEClass = createEClass(AGREEMENT_CONTENT_TYPE);
		createEAttribute(agreementContentTypeEClass, AGREEMENT_CONTENT_TYPE__AGREEMENT_CONTENT_TYPE_ID);
		createEAttribute(agreementContentTypeEClass, AGREEMENT_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(agreementContentTypeEClass, AGREEMENT_CONTENT_TYPE__HAS_TABLE);
		createEReference(agreementContentTypeEClass, AGREEMENT_CONTENT_TYPE__PARENT_TYPE);

		agreementEmploymentApplEClass = createEClass(AGREEMENT_EMPLOYMENT_APPL);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_ID);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_ITEM_SEQ_ID);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__FROM_DATE);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__PARTY_ID_FROM);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__PARTY_ID_TO);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__ROLE_TYPE_ID_FROM);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__ROLE_TYPE_ID_TO);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__AGREEMENT_DATE);
		createEAttribute(agreementEmploymentApplEClass, AGREEMENT_EMPLOYMENT_APPL__THRU_DATE);

		agreementFacilityApplEClass = createEClass(AGREEMENT_FACILITY_APPL);
		createEReference(agreementFacilityApplEClass, AGREEMENT_FACILITY_APPL__AGREEMENT);
		createEReference(agreementFacilityApplEClass, AGREEMENT_FACILITY_APPL__FACILITY);
		createEAttribute(agreementFacilityApplEClass, AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID);

		agreementGeographicalApplicEClass = createEClass(AGREEMENT_GEOGRAPHICAL_APPLIC);
		createEReference(agreementGeographicalApplicEClass, AGREEMENT_GEOGRAPHICAL_APPLIC__AGREEMENT);
		createEReference(agreementGeographicalApplicEClass, AGREEMENT_GEOGRAPHICAL_APPLIC__GEO);
		createEAttribute(agreementGeographicalApplicEClass, AGREEMENT_GEOGRAPHICAL_APPLIC__AGREEMENT_ITEM_SEQ_ID);

		agreementItemEClass = createEClass(AGREEMENT_ITEM);
		createEReference(agreementItemEClass, AGREEMENT_ITEM__AGREEMENT);
		createEAttribute(agreementItemEClass, AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID);
		createEAttribute(agreementItemEClass, AGREEMENT_ITEM__AGREEMENT_IMAGE);
		createEReference(agreementItemEClass, AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE);
		createEAttribute(agreementItemEClass, AGREEMENT_ITEM__AGREEMENT_TEXT);
		createEAttribute(agreementItemEClass, AGREEMENT_ITEM__CURRENCY_UOM_ID);

		agreementItemAttributeEClass = createEClass(AGREEMENT_ITEM_ATTRIBUTE);
		createEAttribute(agreementItemAttributeEClass, AGREEMENT_ITEM_ATTRIBUTE__AGREEMENT_ID);
		createEAttribute(agreementItemAttributeEClass, AGREEMENT_ITEM_ATTRIBUTE__AGREEMENT_ITEM_SEQ_ID);
		createEAttribute(agreementItemAttributeEClass, AGREEMENT_ITEM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(agreementItemAttributeEClass, AGREEMENT_ITEM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(agreementItemAttributeEClass, AGREEMENT_ITEM_ATTRIBUTE__ATTR_VALUE);

		agreementItemTypeEClass = createEClass(AGREEMENT_ITEM_TYPE);
		createEAttribute(agreementItemTypeEClass, AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID);
		createEReference(agreementItemTypeEClass, AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS);
		createEAttribute(agreementItemTypeEClass, AGREEMENT_ITEM_TYPE__DESCRIPTION);
		createEAttribute(agreementItemTypeEClass, AGREEMENT_ITEM_TYPE__HAS_TABLE);
		createEReference(agreementItemTypeEClass, AGREEMENT_ITEM_TYPE__PARENT_TYPE);

		agreementItemTypeAttrEClass = createEClass(AGREEMENT_ITEM_TYPE_ATTR);
		createEReference(agreementItemTypeAttrEClass, AGREEMENT_ITEM_TYPE_ATTR__AGREEMENT_ITEM_TYPE);
		createEAttribute(agreementItemTypeAttrEClass, AGREEMENT_ITEM_TYPE_ATTR__ATTR_NAME);
		createEAttribute(agreementItemTypeAttrEClass, AGREEMENT_ITEM_TYPE_ATTR__DESCRIPTION);

		agreementPartyApplicEClass = createEClass(AGREEMENT_PARTY_APPLIC);
		createEReference(agreementPartyApplicEClass, AGREEMENT_PARTY_APPLIC__AGREEMENT);
		createEReference(agreementPartyApplicEClass, AGREEMENT_PARTY_APPLIC__PARTY);
		createEAttribute(agreementPartyApplicEClass, AGREEMENT_PARTY_APPLIC__AGREEMENT_ITEM_SEQ_ID);

		agreementProductApplEClass = createEClass(AGREEMENT_PRODUCT_APPL);
		createEReference(agreementProductApplEClass, AGREEMENT_PRODUCT_APPL__AGREEMENT);
		createEReference(agreementProductApplEClass, AGREEMENT_PRODUCT_APPL__PRODUCT);
		createEAttribute(agreementProductApplEClass, AGREEMENT_PRODUCT_APPL__AGREEMENT_ITEM_SEQ_ID);
		createEAttribute(agreementProductApplEClass, AGREEMENT_PRODUCT_APPL__PRICE);

		agreementPromoApplEClass = createEClass(AGREEMENT_PROMO_APPL);
		createEReference(agreementPromoApplEClass, AGREEMENT_PROMO_APPL__PRODUCT_PROMO);
		createEReference(agreementPromoApplEClass, AGREEMENT_PROMO_APPL__AGREEMENT);
		createEAttribute(agreementPromoApplEClass, AGREEMENT_PROMO_APPL__AGREEMENT_ITEM_SEQ_ID);
		createEAttribute(agreementPromoApplEClass, AGREEMENT_PROMO_APPL__FROM_DATE);
		createEAttribute(agreementPromoApplEClass, AGREEMENT_PROMO_APPL__SEQUENCE_NUM);
		createEAttribute(agreementPromoApplEClass, AGREEMENT_PROMO_APPL__THRU_DATE);

		agreementRoleEClass = createEClass(AGREEMENT_ROLE);
		createEReference(agreementRoleEClass, AGREEMENT_ROLE__AGREEMENT);
		createEReference(agreementRoleEClass, AGREEMENT_ROLE__PARTY);
		createEReference(agreementRoleEClass, AGREEMENT_ROLE__ROLE_TYPE);

		agreementTermEClass = createEClass(AGREEMENT_TERM);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__AGREEMENT_TERM_ID);
		createEReference(agreementTermEClass, AGREEMENT_TERM__AGREEMENT);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID);
		createEReference(agreementTermEClass, AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__DESCRIPTION);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__FROM_DATE);
		createEReference(agreementTermEClass, AGREEMENT_TERM__INVOICE_ITEM_TYPE);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__MAX_QUANTITY);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__MIN_QUANTITY);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__TERM_DAYS);
		createEReference(agreementTermEClass, AGREEMENT_TERM__TERM_TYPE);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__TERM_VALUE);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__TEXT_VALUE);
		createEAttribute(agreementTermEClass, AGREEMENT_TERM__THRU_DATE);

		agreementTermAttributeEClass = createEClass(AGREEMENT_TERM_ATTRIBUTE);
		createEReference(agreementTermAttributeEClass, AGREEMENT_TERM_ATTRIBUTE__AGREEMENT_TERM);
		createEAttribute(agreementTermAttributeEClass, AGREEMENT_TERM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(agreementTermAttributeEClass, AGREEMENT_TERM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(agreementTermAttributeEClass, AGREEMENT_TERM_ATTRIBUTE__ATTR_VALUE);

		agreementTypeEClass = createEClass(AGREEMENT_TYPE);
		createEAttribute(agreementTypeEClass, AGREEMENT_TYPE__AGREEMENT_TYPE_ID);
		createEReference(agreementTypeEClass, AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS);
		createEAttribute(agreementTypeEClass, AGREEMENT_TYPE__DESCRIPTION);
		createEAttribute(agreementTypeEClass, AGREEMENT_TYPE__HAS_TABLE);
		createEReference(agreementTypeEClass, AGREEMENT_TYPE__PARENT_TYPE);

		agreementTypeAttrEClass = createEClass(AGREEMENT_TYPE_ATTR);
		createEReference(agreementTypeAttrEClass, AGREEMENT_TYPE_ATTR__AGREEMENT_TYPE);
		createEAttribute(agreementTypeAttrEClass, AGREEMENT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(agreementTypeAttrEClass, AGREEMENT_TYPE_ATTR__DESCRIPTION);

		agreementWorkEffortApplicEClass = createEClass(AGREEMENT_WORK_EFFORT_APPLIC);
		createEReference(agreementWorkEffortApplicEClass, AGREEMENT_WORK_EFFORT_APPLIC__AGREEMENT);
		createEReference(agreementWorkEffortApplicEClass, AGREEMENT_WORK_EFFORT_APPLIC__WORK_EFFORT);
		createEAttribute(agreementWorkEffortApplicEClass, AGREEMENT_WORK_EFFORT_APPLIC__AGREEMENT_ITEM_SEQ_ID);

		termTypeEClass = createEClass(TERM_TYPE);
		createEAttribute(termTypeEClass, TERM_TYPE__TERM_TYPE_ID);
		createEAttribute(termTypeEClass, TERM_TYPE__DESCRIPTION);
		createEAttribute(termTypeEClass, TERM_TYPE__HAS_TABLE);
		createEReference(termTypeEClass, TERM_TYPE__PARENT_TYPE);
		createEReference(termTypeEClass, TERM_TYPE__TERM_TYPE_ATTRS);

		termTypeAttrEClass = createEClass(TERM_TYPE_ATTR);
		createEReference(termTypeAttrEClass, TERM_TYPE_ATTR__TERM_TYPE);
		createEAttribute(termTypeAttrEClass, TERM_TYPE_ATTR__ATTR_NAME);
		createEAttribute(termTypeAttrEClass, TERM_TYPE_ATTR__DESCRIPTION);
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
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		PromoPackage thePromoPackage = (PromoPackage)EPackage.Registry.INSTANCE.getEPackage(PromoPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addendumEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		addendumEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getAgreementType());
		g1.getETypeArguments().add(g2);
		agreementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		agreementEClass.getEGenericSuperTypes().add(g1);
		agreementAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getAgreementContentType());
		g1.getETypeArguments().add(g2);
		agreementContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		agreementContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getAgreementContent());
		g1.getETypeArguments().add(g2);
		agreementContentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		agreementContentTypeEClass.getEGenericSuperTypes().add(g1);
		agreementEmploymentApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementEmploymentApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementFacilityApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementFacilityApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementGeographicalApplicEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementGeographicalApplicEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getAgreementItemType());
		g1.getETypeArguments().add(g2);
		agreementItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		agreementItemEClass.getEGenericSuperTypes().add(g1);
		agreementItemAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementItemAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getAgreementItem());
		g1.getETypeArguments().add(g2);
		agreementItemTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		agreementItemTypeEClass.getEGenericSuperTypes().add(g1);
		agreementItemTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementItemTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementPartyApplicEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementPartyApplicEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementProductApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementProductApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementPromoApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementPromoApplEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementTermEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementTermEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementTermAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementTermAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getAgreement());
		g1.getETypeArguments().add(g2);
		agreementTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		agreementTypeEClass.getEGenericSuperTypes().add(g1);
		agreementTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		agreementWorkEffortApplicEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		agreementWorkEffortApplicEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		termTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		termTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		termTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		termTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(addendumEClass, Addendum.class, "Addendum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddendum_AddendumId(), ecorePackage.getEString(), "addendumId", null, 1, 1, Addendum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddendum_AddendumCreationDate(), ecorePackage.getEDate(), "addendumCreationDate", null, 0, 1, Addendum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddendum_AddendumEffectiveDate(), ecorePackage.getEDate(), "addendumEffectiveDate", null, 0, 1, Addendum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddendum_AddendumText(), ecorePackage.getEString(), "addendumText", null, 0, 1, Addendum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddendum_Agreement(), this.getAgreement(), null, "agreement", null, 0, 1, Addendum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAddendum_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEAttribute(getAddendum_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 0, 1, Addendum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementEClass, Agreement.class, "Agreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreement_AgreementId(), ecorePackage.getEString(), "agreementId", null, 1, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreement_AgreementAttributes(), this.getAgreementAttribute(), null, "agreementAttributes", null, 0, -1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_AgreementDate(), ecorePackage.getEDate(), "agreementDate", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreement_AgreementItems(), this.getAgreementItem(), null, "agreementItems", null, 0, -1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAgreement_AgreementType(), this.getAgreementType(), null, "agreementType", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreement_AgreementType().getEKeys().add(this.getAgreementType_AgreementTypeId());
		initEAttribute(getAgreement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreement_PartyIdFrom(), thePartyPackage_1.getParty(), null, "partyIdFrom", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreement_PartyIdFrom().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getAgreement_PartyIdTo(), thePartyPackage_1.getParty(), null, "partyIdTo", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreement_PartyIdTo().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getAgreement_Product(), theProductPackage.getProduct(), null, "product", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreement_Product().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEReference(getAgreement_RoleTypeIdFrom(), thePartyPackage_1.getRoleType(), null, "roleTypeIdFrom", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreement_RoleTypeIdFrom().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEReference(getAgreement_RoleTypeIdTo(), thePartyPackage_1.getRoleType(), null, "roleTypeIdTo", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreement_RoleTypeIdTo().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEAttribute(getAgreement_TextData(), ecorePackage.getEString(), "textData", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementAttributeEClass, AgreementAttribute.class, "AgreementAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementAttribute_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementAttribute_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEAttribute(getAgreementAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AgreementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, AgreementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, AgreementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementContentEClass, AgreementContent.class, "AgreementContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementContent_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementContent_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementContent_Content(), theContentPackage.getContent(), null, "content", null, 1, 1, AgreementContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementContent_Content().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getAgreementContent_AgreementContentType(), this.getAgreementContentType(), null, "agreementContentType", null, 1, 1, AgreementContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementContent_AgreementContentType().getEKeys().add(this.getAgreementContentType_AgreementContentTypeId());
		initEAttribute(getAgreementContent_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, AgreementContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, AgreementContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementContentTypeEClass, AgreementContentType.class, "AgreementContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementContentType_AgreementContentTypeId(), ecorePackage.getEString(), "agreementContentTypeId", null, 1, 1, AgreementContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgreementContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementContentType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, AgreementContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementContentType_ParentType(), this.getAgreementContentType(), null, "parentType", null, 0, 1, AgreementContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementContentType_ParentType().getEKeys().add(this.getAgreementContentType_AgreementContentTypeId());

		initEClass(agreementEmploymentApplEClass, AgreementEmploymentAppl.class, "AgreementEmploymentAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementEmploymentAppl_AgreementId(), ecorePackage.getEString(), "agreementId", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_PartyIdFrom(), ecorePackage.getEString(), "partyIdFrom", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_PartyIdTo(), ecorePackage.getEString(), "partyIdTo", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_RoleTypeIdFrom(), ecorePackage.getEString(), "roleTypeIdFrom", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_RoleTypeIdTo(), ecorePackage.getEString(), "roleTypeIdTo", null, 1, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_AgreementDate(), ecorePackage.getEDate(), "agreementDate", null, 0, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementEmploymentAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, AgreementEmploymentAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementFacilityApplEClass, AgreementFacilityAppl.class, "AgreementFacilityAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementFacilityAppl_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementFacilityAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementFacilityAppl_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementFacilityAppl_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 1, 1, AgreementFacilityAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementFacilityAppl_Facility().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEAttribute(getAgreementFacilityAppl_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementFacilityAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementGeographicalApplicEClass, AgreementGeographicalApplic.class, "AgreementGeographicalApplic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementGeographicalApplic_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementGeographicalApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementGeographicalApplic_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementGeographicalApplic_Geo(), theGeoPackage.getGeo(), null, "geo", null, 1, 1, AgreementGeographicalApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementGeographicalApplic_Geo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getAgreementGeographicalApplic_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementGeographicalApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementItemEClass, AgreementItem.class, "AgreementItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementItem_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementItem_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEAttribute(getAgreementItem_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItem_AgreementImage(), ecorePackage.getEJavaObject(), "agreementImage", null, 0, 1, AgreementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementItem_AgreementItemType(), this.getAgreementItemType(), null, "agreementItemType", null, 0, 1, AgreementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementItem_AgreementItemType().getEKeys().add(this.getAgreementItemType_AgreementItemTypeId());
		initEAttribute(getAgreementItem_AgreementText(), ecorePackage.getEString(), "agreementText", null, 0, 1, AgreementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItem_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, AgreementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementItemAttributeEClass, AgreementItemAttribute.class, "AgreementItemAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementItemAttribute_AgreementId(), ecorePackage.getEString(), "agreementId", null, 1, 1, AgreementItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemAttribute_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AgreementItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, AgreementItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, AgreementItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementItemTypeEClass, AgreementItemType.class, "AgreementItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementItemType_AgreementItemTypeId(), ecorePackage.getEString(), "agreementItemTypeId", null, 1, 1, AgreementItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementItemType_AgreementItemTypeAttrs(), this.getAgreementItemTypeAttr(), null, "agreementItemTypeAttrs", null, 0, -1, AgreementItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgreementItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, AgreementItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementItemType_ParentType(), this.getAgreementItemType(), null, "parentType", null, 0, 1, AgreementItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementItemType_ParentType().getEKeys().add(this.getAgreementItemType_AgreementItemTypeId());

		initEClass(agreementItemTypeAttrEClass, AgreementItemTypeAttr.class, "AgreementItemTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementItemTypeAttr_AgreementItemType(), this.getAgreementItemType(), null, "agreementItemType", null, 1, 1, AgreementItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementItemTypeAttr_AgreementItemType().getEKeys().add(this.getAgreementItemType_AgreementItemTypeId());
		initEAttribute(getAgreementItemTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AgreementItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementItemTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgreementItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementPartyApplicEClass, AgreementPartyApplic.class, "AgreementPartyApplic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementPartyApplic_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementPartyApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementPartyApplic_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementPartyApplic_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, AgreementPartyApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementPartyApplic_Party().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEAttribute(getAgreementPartyApplic_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementPartyApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementProductApplEClass, AgreementProductAppl.class, "AgreementProductAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementProductAppl_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementProductAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementProductAppl_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementProductAppl_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, AgreementProductAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementProductAppl_Product().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEAttribute(getAgreementProductAppl_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementProductAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementProductAppl_Price(), ecorePackage.getEBigDecimal(), "price", null, 0, 1, AgreementProductAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementPromoApplEClass, AgreementPromoAppl.class, "AgreementPromoAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementPromoAppl_ProductPromo(), thePromoPackage.getProductPromo(), null, "productPromo", null, 1, 1, AgreementPromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementPromoAppl_ProductPromo().getEKeys().add(thePromoPackage.getProductPromo_ProductPromoId());
		initEReference(getAgreementPromoAppl_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementPromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementPromoAppl_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEAttribute(getAgreementPromoAppl_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementPromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementPromoAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, AgreementPromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementPromoAppl_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, AgreementPromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementPromoAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, AgreementPromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementRoleEClass, AgreementRole.class, "AgreementRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementRole_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementRole_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementRole_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, AgreementRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementRole_Party().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getAgreementRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, AgreementRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementRole_RoleType().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());

		initEClass(agreementTermEClass, AgreementTerm.class, "AgreementTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementTerm_AgreementTermId(), ecorePackage.getEString(), "agreementTermId", null, 1, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementTerm_Agreement(), this.getAgreement(), null, "agreement", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementTerm_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEAttribute(getAgreementTerm_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementTerm_AgreementTermAttributes(), this.getAgreementTermAttribute(), null, "agreementTermAttributes", null, 0, -1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTerm_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTerm_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementTerm_InvoiceItemType(), theInvoicePackage.getInvoiceItemType(), null, "invoiceItemType", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementTerm_InvoiceItemType().getEKeys().add(theInvoicePackage.getInvoiceItemType_InvoiceItemTypeId());
		initEAttribute(getAgreementTerm_MaxQuantity(), ecorePackage.getEDouble(), "maxQuantity", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTerm_MinQuantity(), ecorePackage.getEDouble(), "minQuantity", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTerm_TermDays(), ecorePackage.getELong(), "termDays", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementTerm_TermType(), this.getTermType(), null, "termType", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementTerm_TermType().getEKeys().add(this.getTermType_TermTypeId());
		initEAttribute(getAgreementTerm_TermValue(), ecorePackage.getEBigDecimal(), "termValue", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTerm_TextValue(), ecorePackage.getEString(), "textValue", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTerm_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementTermAttributeEClass, AgreementTermAttribute.class, "AgreementTermAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementTermAttribute_AgreementTerm(), this.getAgreementTerm(), null, "agreementTerm", null, 1, 1, AgreementTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementTermAttribute_AgreementTerm().getEKeys().add(this.getAgreementTerm_AgreementTermId());
		initEAttribute(getAgreementTermAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AgreementTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTermAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, AgreementTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTermAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, AgreementTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementTypeEClass, AgreementType.class, "AgreementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementType_AgreementTypeId(), ecorePackage.getEString(), "agreementTypeId", null, 1, 1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementType_AgreementTypeAttrs(), this.getAgreementTypeAttr(), null, "agreementTypeAttrs", null, 0, -1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementType_ParentType(), this.getAgreementType(), null, "parentType", null, 0, 1, AgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementType_ParentType().getEKeys().add(this.getAgreementType_AgreementTypeId());

		initEClass(agreementTypeAttrEClass, AgreementTypeAttr.class, "AgreementTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementTypeAttr_AgreementType(), this.getAgreementType(), null, "agreementType", null, 1, 1, AgreementTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementTypeAttr_AgreementType().getEKeys().add(this.getAgreementType_AgreementTypeId());
		initEAttribute(getAgreementTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AgreementTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgreementTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementWorkEffortApplicEClass, AgreementWorkEffortApplic.class, "AgreementWorkEffortApplic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementWorkEffortApplic_Agreement(), this.getAgreement(), null, "agreement", null, 1, 1, AgreementWorkEffortApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementWorkEffortApplic_Agreement().getEKeys().add(this.getAgreement_AgreementId());
		initEReference(getAgreementWorkEffortApplic_WorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "workEffort", null, 1, 1, AgreementWorkEffortApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAgreementWorkEffortApplic_WorkEffort().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());
		initEAttribute(getAgreementWorkEffortApplic_AgreementItemSeqId(), ecorePackage.getEString(), "agreementItemSeqId", null, 1, 1, AgreementWorkEffortApplic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termTypeEClass, TermType.class, "TermType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermType_TermTypeId(), ecorePackage.getEString(), "termTypeId", null, 1, 1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermType_Description(), ecorePackage.getEString(), "description", null, 0, 1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermType_ParentType(), this.getTermType(), null, "parentType", null, 0, 1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTermType_ParentType().getEKeys().add(this.getTermType_TermTypeId());
		initEReference(getTermType_TermTypeAttrs(), this.getTermTypeAttr(), null, "termTypeAttrs", null, 0, -1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(termTypeAttrEClass, TermTypeAttr.class, "TermTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermTypeAttr_TermType(), this.getTermType(), null, "termType", null, 1, 1, TermTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTermTypeAttr_TermType().getEKeys().add(this.getTermType_TermTypeId());
		initEAttribute(getTermTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, TermTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, TermTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent-format
		createMimoentformatAnnotations();
		// mimo-ent-frame
		createMimoentframeAnnotations();
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
		  (getAddendum_AddendumId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAddendum_AddendumText(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAddendum_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreement_AgreementId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreement_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAgreementAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAgreementContent_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementContentType_AgreementContentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementContentType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_AgreementId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_PartyIdFrom(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_PartyIdTo(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_RoleTypeIdFrom(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_RoleTypeIdTo(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementFacilityAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementGeographicalApplic_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementItem_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementItem_CurrencyUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AgreementId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAgreementItemType_AgreementItemTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementItemType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAgreementItemTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementPartyApplic_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementProductAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementProductAppl_Price(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getAgreementPromoAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementPromoAppl_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getAgreementTerm_AgreementTermId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementTerm_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementTerm_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementTerm_TermDays(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getAgreementTerm_TermValue(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getAgreementTerm_TextValue(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementTermAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAgreementTermAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementTermAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAgreementType_AgreementTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAgreementType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAgreementTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAgreementWorkEffortApplic_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getTermType_TermTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getTermType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getTermTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getTermTypeAttr_Description(),
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
		  (getAgreementAttribute_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementContent_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementContent_Content(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementContent_AgreementContentType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementContent_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_AgreementId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_PartyIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_PartyIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_RoleTypeIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementEmploymentAppl_RoleTypeIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementFacilityAppl_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementFacilityAppl_Facility(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementFacilityAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementGeographicalApplic_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementGeographicalApplic_Geo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementGeographicalApplic_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItem_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItem_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AgreementId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItemTypeAttr_AgreementItemType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPartyApplic_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPartyApplic_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPartyApplic_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementProductAppl_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementProductAppl_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementProductAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPromoAppl_ProductPromo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPromoAppl_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPromoAppl_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementPromoAppl_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementRole_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementTermAttribute_AgreementTerm(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementTermAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementTypeAttr_AgreementType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementWorkEffortApplic_Agreement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementWorkEffortApplic_WorkEffort(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAgreementWorkEffortApplic_AgreementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getTermTypeAttr_TermType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getTermTypeAttr_AttrName(),
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
		  (agreementEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (agreementContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (agreementEmploymentApplEClass,
		   source,
		   new String[] {
			   "title", "Agreement Employment Application"
		   });
		addAnnotation
		  (agreementFacilityApplEClass,
		   source,
		   new String[] {
			   "title", "Agreement Facility Application"
		   });
		addAnnotation
		  (agreementGeographicalApplicEClass,
		   source,
		   new String[] {
			   "title", "Agreement Geographical Applicability"
		   });
		addAnnotation
		  (agreementItemTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (agreementItemTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Agreement Item Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (agreementPartyApplicEClass,
		   source,
		   new String[] {
			   "title", "Agreement Party Application"
		   });
		addAnnotation
		  (agreementProductApplEClass,
		   source,
		   new String[] {
			   "title", "Agreement Product Application"
		   });
		addAnnotation
		  (agreementPromoApplEClass,
		   source,
		   new String[] {
			   "title", "Agreement Promo Applicability"
		   });
		addAnnotation
		  (agreementTermEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (agreementTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (agreementTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Agreement Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (agreementWorkEffortApplicEClass,
		   source,
		   new String[] {
			   "title", "Agreement WorkEffort Application"
		   });
		addAnnotation
		  (termTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (termTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Term Type Attribute",
			   "formula", "description"
		   });
	}

} //AgreementPackageImpl
