/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product.impl;

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
import org.abchip.mimo.biz.model.product.price.PricePackage;
import org.abchip.mimo.biz.model.product.price.impl.PricePackageImpl;
import org.abchip.mimo.biz.model.product.product.GoodIdentification;
import org.abchip.mimo.biz.model.product.product.GoodIdentificationType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.product.ProductAssoc;
import org.abchip.mimo.biz.model.product.product.ProductAssocType;
import org.abchip.mimo.biz.model.product.product.ProductAttribute;
import org.abchip.mimo.biz.model.product.product.ProductCalculatedInfo;
import org.abchip.mimo.biz.model.product.product.ProductContent;
import org.abchip.mimo.biz.model.product.product.ProductContentType;
import org.abchip.mimo.biz.model.product.product.ProductFactory;
import org.abchip.mimo.biz.model.product.product.ProductGeo;
import org.abchip.mimo.biz.model.product.product.ProductGlAccount;
import org.abchip.mimo.biz.model.product.product.ProductGroupOrder;
import org.abchip.mimo.biz.model.product.product.ProductKeyword;
import org.abchip.mimo.biz.model.product.product.ProductMaint;
import org.abchip.mimo.biz.model.product.product.ProductMaintType;
import org.abchip.mimo.biz.model.product.product.ProductMeter;
import org.abchip.mimo.biz.model.product.product.ProductMeterType;
import org.abchip.mimo.biz.model.product.product.ProductPackage;
import org.abchip.mimo.biz.model.product.product.ProductReview;
import org.abchip.mimo.biz.model.product.product.ProductRole;
import org.abchip.mimo.biz.model.product.product.ProductSearchConstraint;
import org.abchip.mimo.biz.model.product.product.ProductSearchResult;
import org.abchip.mimo.biz.model.product.product.ProductType;
import org.abchip.mimo.biz.model.product.product.ProductTypeAttr;
import org.abchip.mimo.biz.model.product.product.VendorProduct;
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
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goodIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goodIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAssocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productCalculatedInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGeoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGroupOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMaintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMeterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productReviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSearchConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSearchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorProductEClass = null;

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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#eNS_URI
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PricePackage.eNS_URI);
		PricePackageImpl thePricePackage = (PricePackageImpl)(registeredPackage instanceof PricePackageImpl ? registeredPackage : PricePackage.eINSTANCE);
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
		theProductPackage.createPackageContents();
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
		thePricePackage.createPackageContents();
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
		theProductPackage.initializePackageContents();
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
		thePricePackage.initializePackageContents();
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
	public EClass getGoodIdentification() {
		return goodIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentification_GoodIdentificationType() {
		return (EReference)goodIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentification_Product() {
		return (EReference)goodIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentification_IdValue() {
		return (EAttribute)goodIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoodIdentificationType() {
		return goodIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_GoodIdentificationTypeId() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_Description() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentificationType_GoodIdentifications() {
		return (EReference)goodIdentificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_HasTable() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentificationType_ParentType() {
		return (EReference)goodIdentificationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductId() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_AmountUomType() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_AutoCreateKeywords() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_BillOfMaterialLevel() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_BrandName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ChargeShipping() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Comments() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_CommunicationEventProducts() {
		return (EReference)productEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ConfigId() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_CreatedByUserLogin() {
		return (EReference)productEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_CreatedDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_DefaultShipmentBoxType() {
		return (EReference)productEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_DepthUom() {
		return (EReference)productEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Description() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_DetailImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_DetailScreen() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_DiameterUom() {
		return (EReference)productEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Facility() {
		return (EReference)productEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_FixedAmount() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_HeightUom() {
		return (EReference)productEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_InShippingBox() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IncludeInPromotions() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_InternalName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IntroductionDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_InventoryItemType() {
		return (EReference)productEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_InventoryMessage() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IsVariant() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IsVirtual() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LargeImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_LastModifiedByUserLogin() {
		return (EReference)productEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LastModifiedDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LongDescription() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LotIdFilledIn() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_MediumImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_OrderDecimalQuantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_OriginGeo() {
		return (EReference)productEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_OriginalImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_PiecesIncluded() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_PriceDetailText() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_PrimaryProductCategory() {
		return (EReference)productEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductAttributes() {
		return (EReference)productEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductCostComponentCalcs() {
		return (EReference)productEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductDepth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductDiameter() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductFacilities() {
		return (EReference)productEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductFeatureAppls() {
		return (EReference)productEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductGeos() {
		return (EReference)productEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductHeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductMaints() {
		return (EReference)productEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductMeters() {
		return (EReference)productEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductRating() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductSubscriptionResources() {
		return (EReference)productEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductType() {
		return (EReference)productEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductWeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductWidth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_QuantityIncluded() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_QuantityUom() {
		return (EReference)productEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_RatingTypeEnum() {
		return (EReference)productEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReleaseDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_RequireAmount() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_RequireInventory() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_RequirementMethodEnum() {
		return (EReference)productEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Reserv2ndPPPerc() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReservMaxPersons() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReservNthPPPerc() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Returnable() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SalesDiscWhenNotAvail() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SalesDiscontinuationDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingDepth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingHeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingWeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingWidth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SmallImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SupportDiscontinuationDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Taxable() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_VirtualVariantMethodEnum() {
		return (EReference)productEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_WeightUom() {
		return (EReference)productEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_WidthUom() {
		return (EReference)productEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAssoc() {
		return productAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_ProductAssocType() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_Product() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_ProductIdTo() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_FromDate() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_EstimateCalcMethod() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_Instruction() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_Quantity() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_Reason() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_RecurrenceInfo() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_RoutingWorkEffort() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_ScrapFactor() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_SequenceNum() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_ThruDate() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAssocType() {
		return productAssocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssocType_ProductAssocTypeId() {
		return (EAttribute)productAssocTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssocType_Description() {
		return (EAttribute)productAssocTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssocType_HasTable() {
		return (EAttribute)productAssocTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssocType_ParentType() {
		return (EReference)productAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAttribute() {
		return productAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAttribute_Product() {
		return (EReference)productAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrName() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrDescription() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrType() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrValue() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductCalculatedInfo() {
		return productCalculatedInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_ProductId() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_AverageCustomerRating() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_TotalQuantityOrdered() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_TotalTimesViewed() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductContent() {
		return productContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_Product() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_Content() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_ProductContentType() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_FromDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_PurchaseFromDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_PurchaseThruDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_SequenceNum() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_ThruDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_UseCountLimit() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_UseRoleType() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_UseTime() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_UseTimeUom() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductContentType() {
		return productContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContentType_ProductContentTypeId() {
		return (EAttribute)productContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContentType_Description() {
		return (EAttribute)productContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContentType_HasTable() {
		return (EAttribute)productContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContentType_ParentType() {
		return (EReference)productContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductGeo() {
		return productGeoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGeo_Product() {
		return (EReference)productGeoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGeo_Geo() {
		return (EReference)productGeoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGeo_Description() {
		return (EAttribute)productGeoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGeo_ProductGeoEnum() {
		return (EReference)productGeoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductGlAccount() {
		return productGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_Product() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_OrganizationParty() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_GlAccountType() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_GlAccount() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductGroupOrder() {
		return productGroupOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_GroupOrderId() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_FromDate() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGroupOrder_Job() {
		return (EReference)productGroupOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGroupOrder_Product() {
		return (EReference)productGroupOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_ReqOrderQty() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_SoldOrderQty() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGroupOrder_Status() {
		return (EReference)productGroupOrderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_ThruDate() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductKeyword() {
		return productKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductKeyword_Product() {
		return (EReference)productKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductKeyword_KeywordType() {
		return (EReference)productKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductKeyword_Keyword() {
		return (EAttribute)productKeywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductKeyword_RelevancyWeight() {
		return (EAttribute)productKeywordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductKeyword_Status() {
		return (EReference)productKeywordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMaint() {
		return productMaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_Product() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_ProductMaintSeqId() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_IntervalMeterType() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_IntervalQuantity() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_IntervalUom() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_MaintName() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_MaintTemplateWorkEffort() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_ProductMaintType() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_RepeatCount() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMaintType() {
		return productMaintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaintType_ProductMaintTypeId() {
		return (EAttribute)productMaintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaintType_Description() {
		return (EAttribute)productMaintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaintType_ParentType() {
		return (EReference)productMaintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMeter() {
		return productMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeter_Product() {
		return (EReference)productMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeter_ProductMeterType() {
		return (EReference)productMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMeter_MeterName() {
		return (EAttribute)productMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeter_MeterUom() {
		return (EReference)productMeterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMeterType() {
		return productMeterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMeterType_ProductMeterTypeId() {
		return (EAttribute)productMeterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeterType_DefaultUom() {
		return (EReference)productMeterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMeterType_Description() {
		return (EAttribute)productMeterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductReview() {
		return productReviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_ProductReviewId() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_PostedAnonymous() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_PostedDateTime() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_Product() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_ProductRating() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_ProductReview() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_ProductStore() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_Status() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_UserLogin() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductRole() {
		return productRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductRole_Party() {
		return (EReference)productRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductRole_RoleType() {
		return (EReference)productRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductRole_Product() {
		return (EReference)productRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_FromDate() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_Comments() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_SequenceNum() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_ThruDate() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductSearchConstraint() {
		return productSearchConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductSearchConstraint_ProductSearchResult() {
		return (EReference)productSearchConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_ConstraintSeqId() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_AnyPrefix() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_AnySuffix() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_ConstraintName() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_HighValue() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_IncludeSubCategories() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_InfoString() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_IsAnd() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_LowValue() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_RemoveStems() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductSearchResult() {
		return productSearchResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_ProductSearchResultId() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_IsAscending() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_NumResults() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_OrderByName() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductSearchResult_ProductSearchConstraints() {
		return (EReference)productSearchResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_SearchDate() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_SecondsTotal() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_VisitId() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_ProductTypeId() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_Description() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_HasTable() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_IsDigital() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_IsPhysical() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductType_ParentType() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductType_ProductTypeAttrs() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductTypeAttr() {
		return productTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductTypeAttr_ProductType() {
		return (EReference)productTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductTypeAttr_AttrName() {
		return (EAttribute)productTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductTypeAttr_Description() {
		return (EAttribute)productTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendorProduct() {
		return vendorProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorProduct_Product() {
		return (EReference)vendorProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorProduct_VendorParty() {
		return (EReference)vendorProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorProduct_ProductStoreGroup() {
		return (EReference)vendorProductEClass.getEStructuralFeatures().get(2);
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
		goodIdentificationEClass = createEClass(GOOD_IDENTIFICATION);
		createEReference(goodIdentificationEClass, GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE);
		createEReference(goodIdentificationEClass, GOOD_IDENTIFICATION__PRODUCT);
		createEAttribute(goodIdentificationEClass, GOOD_IDENTIFICATION__ID_VALUE);

		goodIdentificationTypeEClass = createEClass(GOOD_IDENTIFICATION_TYPE);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__DESCRIPTION);
		createEReference(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__HAS_TABLE);
		createEReference(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__PARENT_TYPE);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_ID);
		createEReference(productEClass, PRODUCT__AMOUNT_UOM_TYPE);
		createEAttribute(productEClass, PRODUCT__AUTO_CREATE_KEYWORDS);
		createEAttribute(productEClass, PRODUCT__BILL_OF_MATERIAL_LEVEL);
		createEAttribute(productEClass, PRODUCT__BRAND_NAME);
		createEAttribute(productEClass, PRODUCT__CHARGE_SHIPPING);
		createEAttribute(productEClass, PRODUCT__COMMENTS);
		createEReference(productEClass, PRODUCT__COMMUNICATION_EVENT_PRODUCTS);
		createEAttribute(productEClass, PRODUCT__CONFIG_ID);
		createEReference(productEClass, PRODUCT__CREATED_BY_USER_LOGIN);
		createEAttribute(productEClass, PRODUCT__CREATED_DATE);
		createEReference(productEClass, PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE);
		createEReference(productEClass, PRODUCT__DEPTH_UOM);
		createEAttribute(productEClass, PRODUCT__DESCRIPTION);
		createEAttribute(productEClass, PRODUCT__DETAIL_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__DETAIL_SCREEN);
		createEReference(productEClass, PRODUCT__DIAMETER_UOM);
		createEReference(productEClass, PRODUCT__FACILITY);
		createEAttribute(productEClass, PRODUCT__FIXED_AMOUNT);
		createEReference(productEClass, PRODUCT__HEIGHT_UOM);
		createEAttribute(productEClass, PRODUCT__IN_SHIPPING_BOX);
		createEAttribute(productEClass, PRODUCT__INCLUDE_IN_PROMOTIONS);
		createEAttribute(productEClass, PRODUCT__INTERNAL_NAME);
		createEAttribute(productEClass, PRODUCT__INTRODUCTION_DATE);
		createEReference(productEClass, PRODUCT__INVENTORY_ITEM_TYPE);
		createEAttribute(productEClass, PRODUCT__INVENTORY_MESSAGE);
		createEAttribute(productEClass, PRODUCT__IS_VARIANT);
		createEAttribute(productEClass, PRODUCT__IS_VIRTUAL);
		createEAttribute(productEClass, PRODUCT__LARGE_IMAGE_URL);
		createEReference(productEClass, PRODUCT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(productEClass, PRODUCT__LAST_MODIFIED_DATE);
		createEAttribute(productEClass, PRODUCT__LONG_DESCRIPTION);
		createEAttribute(productEClass, PRODUCT__LOT_ID_FILLED_IN);
		createEAttribute(productEClass, PRODUCT__MEDIUM_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__ORDER_DECIMAL_QUANTITY);
		createEReference(productEClass, PRODUCT__ORIGIN_GEO);
		createEAttribute(productEClass, PRODUCT__ORIGINAL_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__PIECES_INCLUDED);
		createEAttribute(productEClass, PRODUCT__PRICE_DETAIL_TEXT);
		createEReference(productEClass, PRODUCT__PRIMARY_PRODUCT_CATEGORY);
		createEReference(productEClass, PRODUCT__PRODUCT_ATTRIBUTES);
		createEReference(productEClass, PRODUCT__PRODUCT_COST_COMPONENT_CALCS);
		createEAttribute(productEClass, PRODUCT__PRODUCT_DEPTH);
		createEAttribute(productEClass, PRODUCT__PRODUCT_DIAMETER);
		createEReference(productEClass, PRODUCT__PRODUCT_FACILITIES);
		createEReference(productEClass, PRODUCT__PRODUCT_FEATURE_APPLS);
		createEReference(productEClass, PRODUCT__PRODUCT_GEOS);
		createEAttribute(productEClass, PRODUCT__PRODUCT_HEIGHT);
		createEReference(productEClass, PRODUCT__PRODUCT_MAINTS);
		createEReference(productEClass, PRODUCT__PRODUCT_METERS);
		createEAttribute(productEClass, PRODUCT__PRODUCT_NAME);
		createEAttribute(productEClass, PRODUCT__PRODUCT_RATING);
		createEReference(productEClass, PRODUCT__PRODUCT_SUBSCRIPTION_RESOURCES);
		createEReference(productEClass, PRODUCT__PRODUCT_TYPE);
		createEAttribute(productEClass, PRODUCT__PRODUCT_WEIGHT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_WIDTH);
		createEAttribute(productEClass, PRODUCT__QUANTITY_INCLUDED);
		createEReference(productEClass, PRODUCT__QUANTITY_UOM);
		createEReference(productEClass, PRODUCT__RATING_TYPE_ENUM);
		createEAttribute(productEClass, PRODUCT__RELEASE_DATE);
		createEAttribute(productEClass, PRODUCT__REQUIRE_AMOUNT);
		createEAttribute(productEClass, PRODUCT__REQUIRE_INVENTORY);
		createEReference(productEClass, PRODUCT__REQUIREMENT_METHOD_ENUM);
		createEAttribute(productEClass, PRODUCT__RESERV2ND_PP_PERC);
		createEAttribute(productEClass, PRODUCT__RESERV_MAX_PERSONS);
		createEAttribute(productEClass, PRODUCT__RESERV_NTH_PP_PERC);
		createEAttribute(productEClass, PRODUCT__RETURNABLE);
		createEAttribute(productEClass, PRODUCT__SALES_DISC_WHEN_NOT_AVAIL);
		createEAttribute(productEClass, PRODUCT__SALES_DISCONTINUATION_DATE);
		createEAttribute(productEClass, PRODUCT__SHIPPING_DEPTH);
		createEAttribute(productEClass, PRODUCT__SHIPPING_HEIGHT);
		createEAttribute(productEClass, PRODUCT__SHIPPING_WEIGHT);
		createEAttribute(productEClass, PRODUCT__SHIPPING_WIDTH);
		createEAttribute(productEClass, PRODUCT__SMALL_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__SUPPORT_DISCONTINUATION_DATE);
		createEAttribute(productEClass, PRODUCT__TAXABLE);
		createEReference(productEClass, PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM);
		createEReference(productEClass, PRODUCT__WEIGHT_UOM);
		createEReference(productEClass, PRODUCT__WIDTH_UOM);

		productAssocEClass = createEClass(PRODUCT_ASSOC);
		createEReference(productAssocEClass, PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE);
		createEReference(productAssocEClass, PRODUCT_ASSOC__PRODUCT);
		createEReference(productAssocEClass, PRODUCT_ASSOC__PRODUCT_ID_TO);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__FROM_DATE);
		createEReference(productAssocEClass, PRODUCT_ASSOC__ESTIMATE_CALC_METHOD);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__INSTRUCTION);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__QUANTITY);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__REASON);
		createEReference(productAssocEClass, PRODUCT_ASSOC__RECURRENCE_INFO);
		createEReference(productAssocEClass, PRODUCT_ASSOC__ROUTING_WORK_EFFORT);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__SCRAP_FACTOR);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__SEQUENCE_NUM);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__THRU_DATE);

		productAssocTypeEClass = createEClass(PRODUCT_ASSOC_TYPE);
		createEAttribute(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__PRODUCT_ASSOC_TYPE_ID);
		createEAttribute(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__HAS_TABLE);
		createEReference(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__PARENT_TYPE);

		productAttributeEClass = createEClass(PRODUCT_ATTRIBUTE);
		createEReference(productAttributeEClass, PRODUCT_ATTRIBUTE__PRODUCT);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_TYPE);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_VALUE);

		productCalculatedInfoEClass = createEClass(PRODUCT_CALCULATED_INFO);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__PRODUCT_ID);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED);

		productContentEClass = createEClass(PRODUCT_CONTENT);
		createEReference(productContentEClass, PRODUCT_CONTENT__PRODUCT);
		createEReference(productContentEClass, PRODUCT_CONTENT__CONTENT);
		createEReference(productContentEClass, PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__FROM_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__PURCHASE_FROM_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__PURCHASE_THRU_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__SEQUENCE_NUM);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__THRU_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__USE_COUNT_LIMIT);
		createEReference(productContentEClass, PRODUCT_CONTENT__USE_ROLE_TYPE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__USE_TIME);
		createEReference(productContentEClass, PRODUCT_CONTENT__USE_TIME_UOM);

		productContentTypeEClass = createEClass(PRODUCT_CONTENT_TYPE);
		createEAttribute(productContentTypeEClass, PRODUCT_CONTENT_TYPE__PRODUCT_CONTENT_TYPE_ID);
		createEAttribute(productContentTypeEClass, PRODUCT_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(productContentTypeEClass, PRODUCT_CONTENT_TYPE__HAS_TABLE);
		createEReference(productContentTypeEClass, PRODUCT_CONTENT_TYPE__PARENT_TYPE);

		productGeoEClass = createEClass(PRODUCT_GEO);
		createEReference(productGeoEClass, PRODUCT_GEO__PRODUCT);
		createEReference(productGeoEClass, PRODUCT_GEO__GEO);
		createEAttribute(productGeoEClass, PRODUCT_GEO__DESCRIPTION);
		createEReference(productGeoEClass, PRODUCT_GEO__PRODUCT_GEO_ENUM);

		productGlAccountEClass = createEClass(PRODUCT_GL_ACCOUNT);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__PRODUCT);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__ORGANIZATION_PARTY);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__GL_ACCOUNT_TYPE);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__GL_ACCOUNT);

		productGroupOrderEClass = createEClass(PRODUCT_GROUP_ORDER);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__GROUP_ORDER_ID);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__FROM_DATE);
		createEReference(productGroupOrderEClass, PRODUCT_GROUP_ORDER__JOB);
		createEReference(productGroupOrderEClass, PRODUCT_GROUP_ORDER__PRODUCT);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__REQ_ORDER_QTY);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY);
		createEReference(productGroupOrderEClass, PRODUCT_GROUP_ORDER__STATUS);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__THRU_DATE);

		productKeywordEClass = createEClass(PRODUCT_KEYWORD);
		createEReference(productKeywordEClass, PRODUCT_KEYWORD__PRODUCT);
		createEReference(productKeywordEClass, PRODUCT_KEYWORD__KEYWORD_TYPE);
		createEAttribute(productKeywordEClass, PRODUCT_KEYWORD__KEYWORD);
		createEAttribute(productKeywordEClass, PRODUCT_KEYWORD__RELEVANCY_WEIGHT);
		createEReference(productKeywordEClass, PRODUCT_KEYWORD__STATUS);

		productMaintEClass = createEClass(PRODUCT_MAINT);
		createEReference(productMaintEClass, PRODUCT_MAINT__PRODUCT);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID);
		createEReference(productMaintEClass, PRODUCT_MAINT__INTERVAL_METER_TYPE);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__INTERVAL_QUANTITY);
		createEReference(productMaintEClass, PRODUCT_MAINT__INTERVAL_UOM);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__MAINT_NAME);
		createEReference(productMaintEClass, PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT);
		createEReference(productMaintEClass, PRODUCT_MAINT__PRODUCT_MAINT_TYPE);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__REPEAT_COUNT);

		productMaintTypeEClass = createEClass(PRODUCT_MAINT_TYPE);
		createEAttribute(productMaintTypeEClass, PRODUCT_MAINT_TYPE__PRODUCT_MAINT_TYPE_ID);
		createEAttribute(productMaintTypeEClass, PRODUCT_MAINT_TYPE__DESCRIPTION);
		createEReference(productMaintTypeEClass, PRODUCT_MAINT_TYPE__PARENT_TYPE);

		productMeterEClass = createEClass(PRODUCT_METER);
		createEReference(productMeterEClass, PRODUCT_METER__PRODUCT);
		createEReference(productMeterEClass, PRODUCT_METER__PRODUCT_METER_TYPE);
		createEAttribute(productMeterEClass, PRODUCT_METER__METER_NAME);
		createEReference(productMeterEClass, PRODUCT_METER__METER_UOM);

		productMeterTypeEClass = createEClass(PRODUCT_METER_TYPE);
		createEAttribute(productMeterTypeEClass, PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID);
		createEReference(productMeterTypeEClass, PRODUCT_METER_TYPE__DEFAULT_UOM);
		createEAttribute(productMeterTypeEClass, PRODUCT_METER_TYPE__DESCRIPTION);

		productReviewEClass = createEClass(PRODUCT_REVIEW);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__PRODUCT_REVIEW_ID);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__POSTED_ANONYMOUS);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__POSTED_DATE_TIME);
		createEReference(productReviewEClass, PRODUCT_REVIEW__PRODUCT);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__PRODUCT_RATING);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__PRODUCT_REVIEW);
		createEReference(productReviewEClass, PRODUCT_REVIEW__PRODUCT_STORE);
		createEReference(productReviewEClass, PRODUCT_REVIEW__STATUS);
		createEReference(productReviewEClass, PRODUCT_REVIEW__USER_LOGIN);

		productRoleEClass = createEClass(PRODUCT_ROLE);
		createEReference(productRoleEClass, PRODUCT_ROLE__PARTY);
		createEReference(productRoleEClass, PRODUCT_ROLE__ROLE_TYPE);
		createEReference(productRoleEClass, PRODUCT_ROLE__PRODUCT);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__FROM_DATE);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__COMMENTS);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__SEQUENCE_NUM);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__THRU_DATE);

		productSearchConstraintEClass = createEClass(PRODUCT_SEARCH_CONSTRAINT);
		createEReference(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__PRODUCT_SEARCH_RESULT);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__ANY_PREFIX);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__ANY_SUFFIX);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_NAME);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__HIGH_VALUE);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__INFO_STRING);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__IS_AND);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__LOW_VALUE);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__REMOVE_STEMS);

		productSearchResultEClass = createEClass(PRODUCT_SEARCH_RESULT);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_RESULT_ID);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__IS_ASCENDING);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__NUM_RESULTS);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__ORDER_BY_NAME);
		createEReference(productSearchResultEClass, PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_CONSTRAINTS);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__SEARCH_DATE);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__SECONDS_TOTAL);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__VISIT_ID);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_TYPE_ID);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__DESCRIPTION);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__HAS_TABLE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__IS_DIGITAL);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__IS_PHYSICAL);
		createEReference(productTypeEClass, PRODUCT_TYPE__PARENT_TYPE);
		createEReference(productTypeEClass, PRODUCT_TYPE__PRODUCT_TYPE_ATTRS);

		productTypeAttrEClass = createEClass(PRODUCT_TYPE_ATTR);
		createEReference(productTypeAttrEClass, PRODUCT_TYPE_ATTR__PRODUCT_TYPE);
		createEAttribute(productTypeAttrEClass, PRODUCT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(productTypeAttrEClass, PRODUCT_TYPE_ATTR__DESCRIPTION);

		vendorProductEClass = createEClass(VENDOR_PRODUCT);
		createEReference(vendorProductEClass, VENDOR_PRODUCT__PRODUCT);
		createEReference(vendorProductEClass, VENDOR_PRODUCT__VENDOR_PARTY);
		createEReference(vendorProductEClass, VENDOR_PRODUCT__PRODUCT_STORE_GROUP);
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
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		CategoryPackage theCategoryPackage = (CategoryPackage)EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI);
		CostPackage theCostPackage = (CostPackage)EPackage.Registry.INSTANCE.getEPackage(CostPackage.eNS_URI);
		FeaturePackage theFeaturePackage = (FeaturePackage)EPackage.Registry.INSTANCE.getEPackage(FeaturePackage.eNS_URI);
		SubscriptionPackage theSubscriptionPackage = (SubscriptionPackage)EPackage.Registry.INSTANCE.getEPackage(SubscriptionPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		SchedulePackage theSchedulePackage = (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getGoodIdentificationType());
		g1.getETypeArguments().add(g2);
		goodIdentificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		goodIdentificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getGoodIdentification());
		g1.getETypeArguments().add(g2);
		goodIdentificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		goodIdentificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductType());
		g1.getETypeArguments().add(g2);
		productEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductAssocType());
		g1.getETypeArguments().add(g2);
		productAssocEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productAssocEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductAssoc());
		g1.getETypeArguments().add(g2);
		productAssocTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productAssocTypeEClass.getEGenericSuperTypes().add(g1);
		productAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productCalculatedInfoEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productCalculatedInfoEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductContentType());
		g1.getETypeArguments().add(g2);
		productContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductContent());
		g1.getETypeArguments().add(g2);
		productContentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productContentTypeEClass.getEGenericSuperTypes().add(g1);
		productGeoEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productGeoEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productGroupOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productGroupOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productKeywordEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productKeywordEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductMaintType());
		g1.getETypeArguments().add(g2);
		productMaintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productMaintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductMaint());
		g1.getETypeArguments().add(g2);
		productMaintTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productMaintTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductMeterType());
		g1.getETypeArguments().add(g2);
		productMeterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productMeterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductMeter());
		g1.getETypeArguments().add(g2);
		productMeterTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productMeterTypeEClass.getEGenericSuperTypes().add(g1);
		productReviewEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productReviewEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productSearchConstraintEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productSearchConstraintEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productSearchResultEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productSearchResultEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProduct());
		g1.getETypeArguments().add(g2);
		productTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productTypeEClass.getEGenericSuperTypes().add(g1);
		productTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		vendorProductEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		vendorProductEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(goodIdentificationEClass, GoodIdentification.class, "GoodIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoodIdentification_GoodIdentificationType(), this.getGoodIdentificationType(), null, "goodIdentificationType", null, 1, 1, GoodIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoodIdentification_GoodIdentificationType().getEKeys().add(this.getGoodIdentificationType_GoodIdentificationTypeId());
		initEReference(getGoodIdentification_Product(), this.getProduct(), null, "product", null, 1, 1, GoodIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoodIdentification_Product().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getGoodIdentification_IdValue(), ecorePackage.getEString(), "idValue", null, 0, 1, GoodIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goodIdentificationTypeEClass, GoodIdentificationType.class, "GoodIdentificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoodIdentificationType_GoodIdentificationTypeId(), ecorePackage.getEString(), "goodIdentificationTypeId", null, 1, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoodIdentificationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoodIdentificationType_GoodIdentifications(), this.getGoodIdentification(), null, "goodIdentifications", null, 0, -1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoodIdentificationType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoodIdentificationType_ParentType(), this.getGoodIdentificationType(), null, "parentType", null, 0, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoodIdentificationType_ParentType().getEKeys().add(this.getGoodIdentificationType_GoodIdentificationTypeId());

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_ProductId(), ecorePackage.getEString(), "productId", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_AmountUomType(), theUomPackage.getUomType(), null, "amountUomType", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_AmountUomType().getEKeys().add(theUomPackage.getUomType_UomTypeId());
		initEAttribute(getProduct_AutoCreateKeywords(), ecorePackage.getEBooleanObject(), "autoCreateKeywords", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_BillOfMaterialLevel(), ecorePackage.getELong(), "billOfMaterialLevel", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_BrandName(), ecorePackage.getEString(), "brandName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ChargeShipping(), ecorePackage.getEBooleanObject(), "chargeShipping", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_CommunicationEventProducts(), theCommunicationPackage.getCommunicationEventProduct(), null, "communicationEventProducts", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ConfigId(), ecorePackage.getEString(), "configId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getProduct_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_DefaultShipmentBoxType(), theShipment_Package.getShipmentBoxType(), null, "defaultShipmentBoxType", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_DefaultShipmentBoxType().getEKeys().add(theShipment_Package.getShipmentBoxType_ShipmentBoxTypeId());
		initEReference(getProduct_DepthUom(), theUomPackage.getUom(), null, "depthUom", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_DepthUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_DetailImageUrl(), ecorePackage.getEString(), "detailImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_DetailScreen(), ecorePackage.getEString(), "detailScreen", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_DiameterUom(), theUomPackage.getUom(), null, "diameterUom", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_DiameterUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_Facility().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEAttribute(getProduct_FixedAmount(), ecorePackage.getEBigDecimal(), "fixedAmount", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_HeightUom(), theUomPackage.getUom(), null, "heightUom", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_HeightUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getProduct_InShippingBox(), ecorePackage.getEBoolean(), "inShippingBox", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IncludeInPromotions(), ecorePackage.getEBooleanObject(), "includeInPromotions", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_InternalName(), ecorePackage.getEString(), "internalName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IntroductionDate(), ecorePackage.getEDate(), "introductionDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_InventoryItemType(), theInventoryPackage.getInventoryItemType(), null, "inventoryItemType", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_InventoryItemType().getEKeys().add(theInventoryPackage.getInventoryItemType_InventoryItemTypeId());
		initEAttribute(getProduct_InventoryMessage(), ecorePackage.getEString(), "inventoryMessage", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IsVariant(), ecorePackage.getEBoolean(), "isVariant", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IsVirtual(), ecorePackage.getEBoolean(), "isVirtual", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LargeImageUrl(), ecorePackage.getEString(), "largeImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_LastModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "lastModifiedByUserLogin", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_LastModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getProduct_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LongDescription(), ecorePackage.getEString(), "longDescription", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LotIdFilledIn(), ecorePackage.getEString(), "lotIdFilledIn", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_MediumImageUrl(), ecorePackage.getEString(), "mediumImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_OrderDecimalQuantity(), ecorePackage.getEBooleanObject(), "orderDecimalQuantity", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_OriginGeo(), theGeoPackage.getGeo(), null, "originGeo", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_OriginGeo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getProduct_OriginalImageUrl(), ecorePackage.getEString(), "originalImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_PiecesIncluded(), ecorePackage.getELong(), "piecesIncluded", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_PriceDetailText(), ecorePackage.getEString(), "priceDetailText", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_PrimaryProductCategory(), theCategoryPackage.getProductCategory(), null, "primaryProductCategory", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_PrimaryProductCategory().getEKeys().add(theCategoryPackage.getProductCategory_ProductCategoryId());
		initEReference(getProduct_ProductAttributes(), this.getProductAttribute(), null, "productAttributes", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductCostComponentCalcs(), theCostPackage.getProductCostComponentCalc(), null, "productCostComponentCalcs", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductDepth(), ecorePackage.getEBigDecimal(), "productDepth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductDiameter(), ecorePackage.getEBigDecimal(), "productDiameter", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductFacilities(), theFacilityPackage.getProductFacility(), null, "productFacilities", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductFeatureAppls(), theFeaturePackage.getProductFeatureAppl(), null, "productFeatureAppls", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductGeos(), this.getProductGeo(), null, "productGeos", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductHeight(), ecorePackage.getEBigDecimal(), "productHeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductMaints(), this.getProductMaint(), null, "productMaints", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductMeters(), this.getProductMeter(), null, "productMeters", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductRating(), ecorePackage.getEBigDecimal(), "productRating", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductSubscriptionResources(), theSubscriptionPackage.getProductSubscriptionResource(), null, "productSubscriptionResources", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductType(), this.getProductType(), null, "productType", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_ProductType().getEKeys().add(this.getProductType_ProductTypeId());
		initEAttribute(getProduct_ProductWeight(), ecorePackage.getEBigDecimal(), "productWeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductWidth(), ecorePackage.getEBigDecimal(), "productWidth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_QuantityIncluded(), ecorePackage.getEBigDecimal(), "quantityIncluded", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_QuantityUom(), theUomPackage.getUom(), null, "quantityUom", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_QuantityUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_RatingTypeEnum(), theEnumPackage.getEnumeration(), null, "ratingTypeEnum", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_RatingTypeEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getProduct_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_RequireAmount(), ecorePackage.getEBooleanObject(), "requireAmount", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_RequireInventory(), ecorePackage.getEBooleanObject(), "requireInventory", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_RequirementMethodEnum(), theEnumPackage.getEnumeration(), null, "requirementMethodEnum", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_RequirementMethodEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getProduct_Reserv2ndPPPerc(), ecorePackage.getEBigDecimal(), "reserv2ndPPPerc", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ReservMaxPersons(), ecorePackage.getEBigDecimal(), "reservMaxPersons", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ReservNthPPPerc(), ecorePackage.getEBigDecimal(), "reservNthPPPerc", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Returnable(), ecorePackage.getEBooleanObject(), "returnable", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SalesDiscWhenNotAvail(), ecorePackage.getEBooleanObject(), "salesDiscWhenNotAvail", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SalesDiscontinuationDate(), ecorePackage.getEDate(), "salesDiscontinuationDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingDepth(), ecorePackage.getEBigDecimal(), "shippingDepth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingHeight(), ecorePackage.getEBigDecimal(), "shippingHeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingWeight(), ecorePackage.getEBigDecimal(), "shippingWeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingWidth(), ecorePackage.getEBigDecimal(), "shippingWidth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SmallImageUrl(), ecorePackage.getEString(), "smallImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SupportDiscontinuationDate(), ecorePackage.getEDate(), "supportDiscontinuationDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Taxable(), ecorePackage.getEBooleanObject(), "taxable", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_VirtualVariantMethodEnum(), theEnumPackage.getEnumeration(), null, "virtualVariantMethodEnum", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_VirtualVariantMethodEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getProduct_WeightUom(), theUomPackage.getUom(), null, "weightUom", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_WeightUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_WidthUom(), theUomPackage.getUom(), null, "widthUom", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_WidthUom().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(productAssocEClass, ProductAssoc.class, "ProductAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductAssoc_ProductAssocType(), this.getProductAssocType(), null, "productAssocType", null, 1, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_ProductAssocType().getEKeys().add(this.getProductAssocType_ProductAssocTypeId());
		initEReference(getProductAssoc_Product(), this.getProduct(), null, "product", null, 1, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductAssoc_ProductIdTo(), this.getProduct(), null, "productIdTo", null, 1, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_ProductIdTo().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getProductAssoc_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAssoc_EstimateCalcMethod(), theMethodPackage.getCustomMethod(), null, "estimateCalcMethod", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_EstimateCalcMethod().getEKeys().add(theMethodPackage.getCustomMethod_CustomMethodId());
		initEAttribute(getProductAssoc_Instruction(), ecorePackage.getEString(), "instruction", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAssoc_RecurrenceInfo(), theSchedulePackage.getRecurrenceInfo(), null, "recurrenceInfo", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_RecurrenceInfo().getEKeys().add(theSchedulePackage.getRecurrenceInfo_RecurrenceInfoId());
		initEReference(getProductAssoc_RoutingWorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "routingWorkEffort", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_RoutingWorkEffort().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());
		initEAttribute(getProductAssoc_ScrapFactor(), ecorePackage.getEBigDecimal(), "scrapFactor", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productAssocTypeEClass, ProductAssocType.class, "ProductAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAssocType_ProductAssocTypeId(), ecorePackage.getEString(), "productAssocTypeId", null, 1, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssocType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAssocType_ParentType(), this.getProductAssocType(), null, "parentType", null, 0, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssocType_ParentType().getEKeys().add(this.getProductAssocType_ProductAssocTypeId());

		initEClass(productAttributeEClass, ProductAttribute.class, "ProductAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductAttribute_Product(), this.getProduct(), null, "product", null, 1, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAttribute_Product().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getProductAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAttribute_AttrType(), ecorePackage.getEString(), "attrType", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productCalculatedInfoEClass, ProductCalculatedInfo.class, "ProductCalculatedInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductCalculatedInfo_ProductId(), ecorePackage.getEString(), "productId", null, 1, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductCalculatedInfo_AverageCustomerRating(), ecorePackage.getEBigDecimal(), "averageCustomerRating", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductCalculatedInfo_TotalQuantityOrdered(), ecorePackage.getEBigDecimal(), "totalQuantityOrdered", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductCalculatedInfo_TotalTimesViewed(), ecorePackage.getELong(), "totalTimesViewed", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productContentEClass, ProductContent.class, "ProductContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductContent_Product(), this.getProduct(), null, "product", null, 1, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductContent_Content(), theContentPackage.getContent(), null, "content", null, 1, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_Content().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getProductContent_ProductContentType(), this.getProductContentType(), null, "productContentType", null, 1, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_ProductContentType().getEKeys().add(this.getProductContentType_ProductContentTypeId());
		initEAttribute(getProductContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_PurchaseFromDate(), ecorePackage.getEDate(), "purchaseFromDate", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_PurchaseThruDate(), ecorePackage.getEDate(), "purchaseThruDate", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_UseCountLimit(), ecorePackage.getELong(), "useCountLimit", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContent_UseRoleType(), thePartyPackage_1.getRoleType(), null, "useRoleType", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_UseRoleType().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEAttribute(getProductContent_UseTime(), ecorePackage.getELong(), "useTime", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContent_UseTimeUom(), theUomPackage.getUom(), null, "useTimeUom", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_UseTimeUom().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(productContentTypeEClass, ProductContentType.class, "ProductContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductContentType_ProductContentTypeId(), ecorePackage.getEString(), "productContentTypeId", null, 1, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContentType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContentType_ParentType(), this.getProductContentType(), null, "parentType", null, 0, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContentType_ParentType().getEKeys().add(this.getProductContentType_ProductContentTypeId());

		initEClass(productGeoEClass, ProductGeo.class, "ProductGeo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductGeo_Product(), this.getProduct(), null, "product", null, 1, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGeo_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductGeo_Geo(), theGeoPackage.getGeo(), null, "geo", null, 1, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGeo_Geo().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getProductGeo_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductGeo_ProductGeoEnum(), theEnumPackage.getEnumeration(), null, "productGeoEnum", null, 0, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGeo_ProductGeoEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());

		initEClass(productGlAccountEClass, ProductGlAccount.class, "ProductGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductGlAccount_Product(), this.getProduct(), null, "product", null, 1, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductGlAccount_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_OrganizationParty().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getProductGlAccount_GlAccountType(), theLedgerPackage.getGlAccountType(), null, "glAccountType", null, 1, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_GlAccountType().getEKeys().add(theLedgerPackage.getGlAccountType_GlAccountTypeId());
		initEReference(getProductGlAccount_GlAccount(), theLedgerPackage.getGlAccount(), null, "glAccount", null, 0, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_GlAccount().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());

		initEClass(productGroupOrderEClass, ProductGroupOrder.class, "ProductGroupOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductGroupOrder_GroupOrderId(), ecorePackage.getEString(), "groupOrderId", null, 1, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductGroupOrder_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductGroupOrder_Job(), theSchedulePackage.getJobSandbox(), null, "job", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGroupOrder_Job().getEKeys().add(theSchedulePackage.getJobSandbox_JobId());
		initEReference(getProductGroupOrder_Product(), this.getProduct(), null, "product", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGroupOrder_Product().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getProductGroupOrder_ReqOrderQty(), ecorePackage.getEBigDecimal(), "reqOrderQty", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductGroupOrder_SoldOrderQty(), ecorePackage.getEBigDecimal(), "soldOrderQty", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductGroupOrder_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGroupOrder_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getProductGroupOrder_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productKeywordEClass, ProductKeyword.class, "ProductKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductKeyword_Product(), this.getProduct(), null, "product", null, 1, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductKeyword_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductKeyword_KeywordType(), theEnumPackage.getEnumeration(), null, "keywordType", null, 1, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductKeyword_KeywordType().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getProductKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 1, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductKeyword_RelevancyWeight(), ecorePackage.getELong(), "relevancyWeight", null, 0, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductKeyword_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductKeyword_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(productMaintEClass, ProductMaint.class, "ProductMaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductMaint_Product(), this.getProduct(), null, "product", null, 1, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_Product().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getProductMaint_ProductMaintSeqId(), ecorePackage.getEString(), "productMaintSeqId", null, 1, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMaint_IntervalMeterType(), this.getProductMeterType(), null, "intervalMeterType", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_IntervalMeterType().getEKeys().add(this.getProductMeterType_ProductMeterTypeId());
		initEAttribute(getProductMaint_IntervalQuantity(), ecorePackage.getEBigDecimal(), "intervalQuantity", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMaint_IntervalUom(), theUomPackage.getUom(), null, "intervalUom", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_IntervalUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getProductMaint_MaintName(), ecorePackage.getEString(), "maintName", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMaint_MaintTemplateWorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "maintTemplateWorkEffort", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_MaintTemplateWorkEffort().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());
		initEReference(getProductMaint_ProductMaintType(), this.getProductMaintType(), null, "productMaintType", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_ProductMaintType().getEKeys().add(this.getProductMaintType_ProductMaintTypeId());
		initEAttribute(getProductMaint_RepeatCount(), ecorePackage.getELong(), "repeatCount", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productMaintTypeEClass, ProductMaintType.class, "ProductMaintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductMaintType_ProductMaintTypeId(), ecorePackage.getEString(), "productMaintTypeId", null, 1, 1, ProductMaintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductMaintType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductMaintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMaintType_ParentType(), this.getProductMaintType(), null, "parentType", null, 0, 1, ProductMaintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaintType_ParentType().getEKeys().add(this.getProductMaintType_ProductMaintTypeId());

		initEClass(productMeterEClass, ProductMeter.class, "ProductMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductMeter_Product(), this.getProduct(), null, "product", null, 1, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeter_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductMeter_ProductMeterType(), this.getProductMeterType(), null, "productMeterType", null, 1, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeter_ProductMeterType().getEKeys().add(this.getProductMeterType_ProductMeterTypeId());
		initEAttribute(getProductMeter_MeterName(), ecorePackage.getEString(), "meterName", null, 0, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMeter_MeterUom(), theUomPackage.getUom(), null, "meterUom", null, 0, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeter_MeterUom().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(productMeterTypeEClass, ProductMeterType.class, "ProductMeterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductMeterType_ProductMeterTypeId(), ecorePackage.getEString(), "productMeterTypeId", null, 1, 1, ProductMeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMeterType_DefaultUom(), theUomPackage.getUom(), null, "defaultUom", null, 0, 1, ProductMeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeterType_DefaultUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getProductMeterType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductMeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productReviewEClass, ProductReview.class, "ProductReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductReview_ProductReviewId(), ecorePackage.getEString(), "productReviewId", null, 1, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_PostedAnonymous(), ecorePackage.getEBooleanObject(), "postedAnonymous", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_PostedDateTime(), ecorePackage.getEDate(), "postedDateTime", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductReview_Product(), this.getProduct(), null, "product", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_Product().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getProductReview_ProductRating(), ecorePackage.getEBigDecimal(), "productRating", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_ProductReview(), ecorePackage.getEString(), "productReview", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductReview_ProductStore(), theStorePackage.getProductStore(), null, "productStore", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_ProductStore().getEKeys().add(theStorePackage.getProductStore_ProductStoreId());
		initEReference(getProductReview_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getProductReview_UserLogin(), theLoginPackage.getUserLogin(), null, "userLogin", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_UserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(productRoleEClass, ProductRole.class, "ProductRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductRole_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductRole_Party().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getProductRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductRole_RoleType().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEReference(getProductRole_Product(), this.getProduct(), null, "product", null, 1, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductRole_Product().getEKeys().add(this.getProduct_ProductId());
		initEAttribute(getProductRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRole_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRole_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSearchConstraintEClass, ProductSearchConstraint.class, "ProductSearchConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSearchConstraint_ProductSearchResult(), this.getProductSearchResult(), null, "productSearchResult", null, 1, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductSearchConstraint_ProductSearchResult().getEKeys().add(this.getProductSearchResult_ProductSearchResultId());
		initEAttribute(getProductSearchConstraint_ConstraintSeqId(), ecorePackage.getEString(), "constraintSeqId", null, 1, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_AnyPrefix(), ecorePackage.getEString(), "anyPrefix", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_AnySuffix(), ecorePackage.getEString(), "anySuffix", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_ConstraintName(), ecorePackage.getEString(), "constraintName", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_HighValue(), ecorePackage.getEString(), "highValue", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_IncludeSubCategories(), ecorePackage.getEBooleanObject(), "includeSubCategories", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_InfoString(), ecorePackage.getEString(), "infoString", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_IsAnd(), ecorePackage.getEBooleanObject(), "isAnd", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_LowValue(), ecorePackage.getEString(), "lowValue", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_RemoveStems(), ecorePackage.getEBooleanObject(), "removeStems", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSearchResultEClass, ProductSearchResult.class, "ProductSearchResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductSearchResult_ProductSearchResultId(), ecorePackage.getEString(), "productSearchResultId", null, 1, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_IsAscending(), ecorePackage.getEBooleanObject(), "isAscending", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_NumResults(), ecorePackage.getELong(), "numResults", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_OrderByName(), ecorePackage.getEString(), "orderByName", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSearchResult_ProductSearchConstraints(), this.getProductSearchConstraint(), null, "productSearchConstraints", null, 0, -1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_SearchDate(), ecorePackage.getEDate(), "searchDate", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_SecondsTotal(), ecorePackage.getEDouble(), "secondsTotal", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductType_ProductTypeId(), ecorePackage.getEString(), "productTypeId", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_IsDigital(), ecorePackage.getEBooleanObject(), "isDigital", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_IsPhysical(), ecorePackage.getEBooleanObject(), "isPhysical", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductType_ParentType(), this.getProductType(), null, "parentType", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductType_ParentType().getEKeys().add(this.getProductType_ProductTypeId());
		initEReference(getProductType_ProductTypeAttrs(), this.getProductTypeAttr(), null, "productTypeAttrs", null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(productTypeAttrEClass, ProductTypeAttr.class, "ProductTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductTypeAttr_ProductType(), this.getProductType(), null, "productType", null, 1, 1, ProductTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductTypeAttr_ProductType().getEKeys().add(this.getProductType_ProductTypeId());
		initEAttribute(getProductTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, ProductTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorProductEClass, VendorProduct.class, "VendorProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVendorProduct_Product(), this.getProduct(), null, "product", null, 1, 1, VendorProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getVendorProduct_Product().getEKeys().add(this.getProduct_ProductId());
		initEReference(getVendorProduct_VendorParty(), thePartyPackage_1.getParty(), null, "vendorParty", null, 1, 1, VendorProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getVendorProduct_VendorParty().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getVendorProduct_ProductStoreGroup(), theStorePackage.getProductStoreGroup(), null, "productStoreGroup", null, 1, 1, VendorProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getVendorProduct_ProductStoreGroup().getEKeys().add(theStorePackage.getProductStoreGroup_ProductStoreGroupId());

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
		  (getGoodIdentification_IdValue(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getGoodIdentificationType_GoodIdentificationTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGoodIdentificationType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProduct_ProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProduct_BillOfMaterialLevel(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProduct_BrandName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getProduct_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getProduct_ConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProduct_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProduct_DetailImageUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getProduct_DetailScreen(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProduct_FixedAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getProduct_InternalName(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProduct_InventoryMessage(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProduct_LargeImageUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getProduct_LotIdFilledIn(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProduct_MediumImageUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getProduct_OriginalImageUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getProduct_PiecesIncluded(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProduct_PriceDetailText(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProduct_ProductDepth(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ProductDiameter(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ProductHeight(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ProductName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getProduct_ProductRating(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ProductWeight(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ProductWidth(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_QuantityIncluded(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_Reserv2ndPPPerc(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ReservMaxPersons(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ReservNthPPPerc(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ShippingDepth(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ShippingHeight(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ShippingWeight(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_ShippingWidth(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProduct_SmallImageUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getProductAssoc_Instruction(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductAssoc_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductAssoc_Reason(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductAssoc_ScrapFactor(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductAssoc_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductAssocType_ProductAssocTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductAssocType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getProductAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductAttribute_AttrType(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductCalculatedInfo_ProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductCalculatedInfo_AverageCustomerRating(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductCalculatedInfo_TotalQuantityOrdered(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductCalculatedInfo_TotalTimesViewed(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductContent_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductContent_UseCountLimit(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductContent_UseTime(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductContentType_ProductContentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductContentType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductGeo_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductGroupOrder_GroupOrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductGroupOrder_ReqOrderQty(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductGroupOrder_SoldOrderQty(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductKeyword_Keyword(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getProductKeyword_RelevancyWeight(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductMaint_ProductMaintSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductMaint_IntervalQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductMaint_MaintName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getProductMaint_RepeatCount(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductMaintType_ProductMaintTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductMaintType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductMeter_MeterName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getProductMeterType_ProductMeterTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductMeterType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductReview_ProductReviewId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductReview_ProductRating(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductRole_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getProductRole_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductSearchConstraint_ConstraintSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductSearchConstraint_ConstraintName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductSearchConstraint_HighValue(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getProductSearchConstraint_InfoString(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductSearchConstraint_LowValue(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getProductSearchResult_ProductSearchResultId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductSearchResult_NumResults(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getProductSearchResult_OrderByName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getProductSearchResult_VisitId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductType_ProductTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getProductTypeAttr_Description(),
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
		  (getGoodIdentification_GoodIdentificationType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGoodIdentification_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProduct_ConfigId(),
		   source,
		   new String[] {
			   "help", "Used to safe the persisted configuration Id for AGGREGATED products."
		   });
		addAnnotation
		  (getProduct_FixedAmount(),
		   source,
		   new String[] {
			   "help", "Use this for products which are sold in fixed denominations, such as gift certificates or calling cards."
		   });
		addAnnotation
		  (getProduct_LotIdFilledIn(),
		   source,
		   new String[] {
			   "help", "Indicate if the lotId must be informed"
		   });
		addAnnotation
		  (getProduct_OrderDecimalQuantity(),
		   source,
		   new String[] {
			   "help", "use to indicate if decimal quantity can be ordered for this product. Default value is Y"
		   });
		addAnnotation
		  (getProduct_PrimaryProductCategory(),
		   source,
		   new String[] {
			   "help", "The primary category ; it should be one of the productCategoryId already setup in ProductCategoryMember"
		   });
		addAnnotation
		  (getProduct_ProductCostComponentCalcs(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getProduct_ProductFeatureAppls(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getProduct_ProductSubscriptionResources(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getProduct_QuantityIncluded(),
		   source,
		   new String[] {
			   "help", "If you have a six-pack of 12oz soda cans you would have quantityIncluded=12, quantityUomId=oz, piecesIncluded=6."
		   });
		addAnnotation
		  (getProduct_Reserv2ndPPPerc(),
		   source,
		   new String[] {
			   "help", "percentage of the end price for the 2nd person renting this asset connected to this product"
		   });
		addAnnotation
		  (getProduct_ReservMaxPersons(),
		   source,
		   new String[] {
			   "help", "maximum number of persons who can rent this asset at the same time"
		   });
		addAnnotation
		  (getProduct_ReservNthPPPerc(),
		   source,
		   new String[] {
			   "help", "percentage of the end price for the Nth person renting this asset connected to this product"
		   });
		addAnnotation
		  (getProduct_ShippingWeight(),
		   source,
		   new String[] {
			   "help", "The shipping weight of the product."
		   });
		addAnnotation
		  (getProduct_VirtualVariantMethodEnum(),
		   source,
		   new String[] {
			   "help", "This field defines the method of selecting a variant from the selectable features on the virtual product. Either as a variant explosion which will work to about 200 variants or as feature explosion which almost has no limits"
		   });
		addAnnotation
		  (getProductAssoc_ProductAssocType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAssoc_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAssoc_ProductIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAssoc_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAttribute_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductContent_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductContent_Content(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductContent_ProductContentType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductGeo_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductGeo_Geo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductGlAccount_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductGlAccount_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductGlAccount_GlAccountType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductKeyword_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductKeyword_KeywordType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductKeyword_Keyword(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMaint_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMaint_ProductMaintSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMaint_IntervalMeterType(),
		   source,
		   new String[] {
			   "help", "Meter Type for intervalQuantity; if used intervalUomId is generally not used (ie one or the other)"
		   });
		addAnnotation
		  (getProductMaint_IntervalUom(),
		   source,
		   new String[] {
			   "help", "UOM for intervalQuantity; if used intervalMeterTypeId is generally not used (ie one or the other)"
		   });
		addAnnotation
		  (getProductMaint_MaintTemplateWorkEffort(),
		   source,
		   new String[] {
			   "help", "Template of Maintenance Plan. WorkEffort may have WorkEffortAssocs for tasks/breakdown detailes"
		   });
		addAnnotation
		  (getProductMaint_RepeatCount(),
		   source,
		   new String[] {
			   "help", "If 0 or null means no limit to repeat count; can be used with multiple ProductMaint records for a single ProductMaintType in cases where maintenance intervals are not evenly distributed, or only need to be done once like a break-in period"
		   });
		addAnnotation
		  (getProductMeter_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMeter_ProductMeterType(),
		   source,
		   new String[] {
			   "key", "true",
			   "help", "Part of the primary key as different meters on a machine should have distinct types"
		   });
		addAnnotation
		  (getProductMeter_MeterUom(),
		   source,
		   new String[] {
			   "help", "Is on this entity instead of the ProductMeterType entity for more flexibility; for example being able to find all speedometers regardless of their primary unit"
		   });
		addAnnotation
		  (getProductMeterType_DefaultUom(),
		   source,
		   new String[] {
			   "help", "This is optional and if applicable can describe the meter better"
		   });
		addAnnotation
		  (getProductRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductRole_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductRole_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductRole_SequenceNum(),
		   source,
		   new String[] {
			   "help", "a product may have several parties associated to it with the same role; this field can be used to define the order of parties associated to the product in that role"
		   });
		addAnnotation
		  (getProductSearchConstraint_ProductSearchResult(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductSearchConstraint_ConstraintSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductTypeAttr_ProductType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVendorProduct_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVendorProduct_VendorParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVendorProduct_ProductStoreGroup(),
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
		  (goodIdentificationEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (goodIdentificationTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productAssocEClass,
		   source,
		   new String[] {
			   "title", "Product Association",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productAssocTypeEClass,
		   source,
		   new String[] {
			   "title", "Product Association Type",
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productAttributeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productCalculatedInfoEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productContentEClass,
		   source,
		   new String[] {
			   "title", "Product Data Object",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productContentTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productGeoEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productGlAccountEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productGroupOrderEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productKeywordEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productMaintEClass,
		   source,
		   new String[] {
			   "help", "This is used to specify the details for scheduled maintenance.",
			   "title", "Product Maintenance",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productMaintTypeEClass,
		   source,
		   new String[] {
			   "help", "This is for both scheduled and unscheduled maintenance; use ProductMaint to track details for scheduled maintenance",
			   "title", "Product Maintenance Type",
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productMeterEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productMeterTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productReviewEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productRoleEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productSearchConstraintEClass,
		   source,
		   new String[] {
			   "title", "Product Search Result Constraint",
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productSearchResultEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels"
		   });
		addAnnotation
		  (productTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (productTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Product Type Attribute",
			   "dictionary", "ProductEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (vendorProductEClass,
		   source,
		   new String[] {
			   "help", "For information related to a specific vendor and product, especially for multi-vendor stores. The ProductStoreGroup is to be used much like in ProductPrice.",
			   "dictionary", "ProductEntityLabels"
		   });
	}

} //ProductPackageImpl
