/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.model.accounting.AccountingPackage;
import org.abchip.mimo.biz.model.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.model.accounting.budget.impl.BudgetPackageImpl;
import org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMapType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetAttribute;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetDepMethod;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetGeoPoint;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetIdent;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetIdentType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaintOrder;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMeter;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetProduct;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetProductType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetRegistration;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetStdCost;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetStdCostType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeAttr;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetFactory;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.model.accounting.fixedasset.PartyFixedAssetAssignment;
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
public class FixedassetPackageImpl extends EPackageImpl implements FixedassetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetDepMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetGeoPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetIdentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetIdentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetMaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetMaintOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetRegistrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetStdCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetStdCostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetTypeGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyFixedAssetAssignmentEClass = null;

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
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FixedassetPackageImpl() {
		super(eNS_URI, FixedassetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FixedassetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FixedassetPackage init() {
		if (isInited) return (FixedassetPackage)EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFixedassetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FixedassetPackageImpl theFixedassetPackage = registeredFixedassetPackage instanceof FixedassetPackageImpl ? (FixedassetPackageImpl)registeredFixedassetPackage : new FixedassetPackageImpl();

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
		theFixedassetPackage.createPackageContents();
		theAccountingPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
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
		theFixedassetPackage.initializePackageContents();
		theAccountingPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
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
		theFixedassetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FixedassetPackage.eNS_URI, theFixedassetPackage);
		return theFixedassetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodationClass() {
		return accommodationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationClass_AccommodationClassId() {
		return (EAttribute)accommodationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationClass_Description() {
		return (EAttribute)accommodationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccommodationClass_ParentClass() {
		return (EReference)accommodationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodationMap() {
		return accommodationMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_AccommodationMapId() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccommodationMap_AccommodationClass() {
		return (EReference)accommodationMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccommodationMap_AccommodationMapType() {
		return (EReference)accommodationMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccommodationMap_FixedAsset() {
		return (EReference)accommodationMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_NumberOfSpaces() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodationMapType() {
		return accommodationMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMapType_AccommodationMapTypeId() {
		return (EAttribute)accommodationMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMapType_Description() {
		return (EAttribute)accommodationMapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAsset() {
		return fixedAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_AcquireOrder() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_AcquireOrderItemSeqId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ActualEndOfLife() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_Calendar() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_ClassEnum() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_DateAcquired() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_DateLastServiced() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_DateNextService() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_Depreciation() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ExpectedEndOfLife() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetAttributes() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetGeoPoints() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetIdents() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetMaints() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetName() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetRegistrations() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetStdCosts() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_FixedAssetType() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_InstanceOfProduct() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_LocatedAtFacility() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_LocatedAtLocationSeqId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_ParentFixedAsset() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_Party() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ProductionCapacity() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_PurchaseCost() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_PurchaseCostUomId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_RoleType() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_SalvageValue() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_SerialNumber() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAsset_Uom() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetAttribute() {
		return fixedAssetAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetAttribute_FixedAsset() {
		return (EReference)fixedAssetAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_AttrName() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_AttrDescription() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_AttrValue() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetDepMethod() {
		return fixedAssetDepMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetDepMethod_DepreciationCustomMethod() {
		return (EReference)fixedAssetDepMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetDepMethod_FixedAsset() {
		return (EReference)fixedAssetDepMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetDepMethod_FromDate() {
		return (EAttribute)fixedAssetDepMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetDepMethod_ThruDate() {
		return (EAttribute)fixedAssetDepMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetGeoPoint() {
		return fixedAssetGeoPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetGeoPoint_FixedAsset() {
		return (EReference)fixedAssetGeoPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetGeoPoint_GeoPoint() {
		return (EReference)fixedAssetGeoPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetGeoPoint_FromDate() {
		return (EAttribute)fixedAssetGeoPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetGeoPoint_ThruDate() {
		return (EAttribute)fixedAssetGeoPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetIdent() {
		return fixedAssetIdentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetIdent_FixedAsset() {
		return (EReference)fixedAssetIdentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetIdent_FixedAssetIdentType() {
		return (EReference)fixedAssetIdentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdent_IdValue() {
		return (EAttribute)fixedAssetIdentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetIdentType() {
		return fixedAssetIdentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdentType_FixedAssetIdentTypeId() {
		return (EAttribute)fixedAssetIdentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdentType_Description() {
		return (EAttribute)fixedAssetIdentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetMaint() {
		return fixedAssetMaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_FixedAsset() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_MaintHistSeqId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_IntervalMeterType() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_IntervalQuantity() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_IntervalUom() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_ProductMaintSeqId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_ProductMaintType() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_PurchaseOrder() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_ScheduleWorkEffort() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaint_Status() {
		return (EReference)fixedAssetMaintEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetMaintOrder() {
		return fixedAssetMaintOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaintOrder_FixedAsset() {
		return (EReference)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMaintOrder_Order() {
		return (EReference)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaintOrder_MaintHistSeqId() {
		return (EAttribute)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaintOrder_OrderItemSeqId() {
		return (EAttribute)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetMeter() {
		return fixedAssetMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetMeter_ProductMeterType() {
		return (EReference)fixedAssetMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_FixedAssetId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_ReadingDate() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_MaintHistSeqId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_MeterValue() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_ReadingReasonEnumId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_WorkEffortId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetProduct() {
		return fixedAssetProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetProduct_Product() {
		return (EReference)fixedAssetProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetProduct_FixedAsset() {
		return (EReference)fixedAssetProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetProduct_FixedAssetProductType() {
		return (EReference)fixedAssetProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_FromDate() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_Comments() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_Quantity() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetProduct_QuantityUom() {
		return (EReference)fixedAssetProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_SequenceNum() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_ThruDate() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetProductType() {
		return fixedAssetProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProductType_FixedAssetProductTypeId() {
		return (EAttribute)fixedAssetProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProductType_Description() {
		return (EAttribute)fixedAssetProductTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetRegistration() {
		return fixedAssetRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetRegistration_FixedAsset() {
		return (EReference)fixedAssetRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_FromDate() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetRegistration_GovAgencyParty() {
		return (EReference)fixedAssetRegistrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_LicenseNumber() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_RegistrationDate() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_RegistrationNumber() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_ThruDate() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetStdCost() {
		return fixedAssetStdCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetStdCost_FixedAsset() {
		return (EReference)fixedAssetStdCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetStdCost_FixedAssetStdCostType() {
		return (EReference)fixedAssetStdCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_FromDate() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_Amount() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetStdCost_AmountUom() {
		return (EReference)fixedAssetStdCostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_ThruDate() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetStdCostType() {
		return fixedAssetStdCostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_FixedAssetStdCostTypeId() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_Description() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_HasTable() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetStdCostType_ParentType() {
		return (EReference)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetType() {
		return fixedAssetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_FixedAssetTypeId() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_Description() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetType_FixedAssetTypeAttrs() {
		return (EReference)fixedAssetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_HasTable() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetType_ParentType() {
		return (EReference)fixedAssetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetTypeAttr() {
		return fixedAssetTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeAttr_FixedAssetType() {
		return (EReference)fixedAssetTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeAttr_AttrName() {
		return (EAttribute)fixedAssetTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeAttr_Description() {
		return (EAttribute)fixedAssetTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetTypeGlAccount() {
		return fixedAssetTypeGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_FixedAssetType() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_FixedAsset() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_OrganizationParty() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_AccDepGlAccount() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_AssetGlAccount() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_DepGlAccount() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_LossGlAccount() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedAssetTypeGlAccount_ProfitGlAccount() {
		return (EReference)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyFixedAssetAssignment() {
		return partyFixedAssetAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyFixedAssetAssignment_Party() {
		return (EReference)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyFixedAssetAssignment_RoleType() {
		return (EReference)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyFixedAssetAssignment_FixedAsset() {
		return (EReference)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_FromDate() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_AllocatedDate() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_Comments() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyFixedAssetAssignment_Status() {
		return (EReference)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_ThruDate() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedassetFactory getFixedassetFactory() {
		return (FixedassetFactory)getEFactoryInstance();
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
		accommodationClassEClass = createEClass(ACCOMMODATION_CLASS);
		createEAttribute(accommodationClassEClass, ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID);
		createEAttribute(accommodationClassEClass, ACCOMMODATION_CLASS__DESCRIPTION);
		createEReference(accommodationClassEClass, ACCOMMODATION_CLASS__PARENT_CLASS);

		accommodationMapEClass = createEClass(ACCOMMODATION_MAP);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID);
		createEReference(accommodationMapEClass, ACCOMMODATION_MAP__ACCOMMODATION_CLASS);
		createEReference(accommodationMapEClass, ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE);
		createEReference(accommodationMapEClass, ACCOMMODATION_MAP__FIXED_ASSET);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__NUMBER_OF_SPACES);

		accommodationMapTypeEClass = createEClass(ACCOMMODATION_MAP_TYPE);
		createEAttribute(accommodationMapTypeEClass, ACCOMMODATION_MAP_TYPE__ACCOMMODATION_MAP_TYPE_ID);
		createEAttribute(accommodationMapTypeEClass, ACCOMMODATION_MAP_TYPE__DESCRIPTION);

		fixedAssetEClass = createEClass(FIXED_ASSET);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_ID);
		createEReference(fixedAssetEClass, FIXED_ASSET__ACQUIRE_ORDER);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__ACTUAL_END_OF_LIFE);
		createEReference(fixedAssetEClass, FIXED_ASSET__CALENDAR);
		createEReference(fixedAssetEClass, FIXED_ASSET__CLASS_ENUM);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DATE_ACQUIRED);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DATE_LAST_SERVICED);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DATE_NEXT_SERVICE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DEPRECIATION);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__EXPECTED_END_OF_LIFE);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_ATTRIBUTES);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_GEO_POINTS);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_IDENTS);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_MAINTS);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_NAME);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_REGISTRATIONS);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_STD_COSTS);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_TYPE);
		createEReference(fixedAssetEClass, FIXED_ASSET__INSTANCE_OF_PRODUCT);
		createEReference(fixedAssetEClass, FIXED_ASSET__LOCATED_AT_FACILITY);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID);
		createEReference(fixedAssetEClass, FIXED_ASSET__PARENT_FIXED_ASSET);
		createEReference(fixedAssetEClass, FIXED_ASSET__PARTY);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PRODUCTION_CAPACITY);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PURCHASE_COST);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PURCHASE_COST_UOM_ID);
		createEReference(fixedAssetEClass, FIXED_ASSET__ROLE_TYPE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__SALVAGE_VALUE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__SERIAL_NUMBER);
		createEReference(fixedAssetEClass, FIXED_ASSET__UOM);

		fixedAssetAttributeEClass = createEClass(FIXED_ASSET_ATTRIBUTE);
		createEReference(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__FIXED_ASSET);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__ATTR_NAME);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__ATTR_VALUE);

		fixedAssetDepMethodEClass = createEClass(FIXED_ASSET_DEP_METHOD);
		createEReference(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD);
		createEReference(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__FIXED_ASSET);
		createEAttribute(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__FROM_DATE);
		createEAttribute(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__THRU_DATE);

		fixedAssetGeoPointEClass = createEClass(FIXED_ASSET_GEO_POINT);
		createEReference(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__FIXED_ASSET);
		createEReference(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__GEO_POINT);
		createEAttribute(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__FROM_DATE);
		createEAttribute(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__THRU_DATE);

		fixedAssetIdentEClass = createEClass(FIXED_ASSET_IDENT);
		createEReference(fixedAssetIdentEClass, FIXED_ASSET_IDENT__FIXED_ASSET);
		createEReference(fixedAssetIdentEClass, FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE);
		createEAttribute(fixedAssetIdentEClass, FIXED_ASSET_IDENT__ID_VALUE);

		fixedAssetIdentTypeEClass = createEClass(FIXED_ASSET_IDENT_TYPE);
		createEAttribute(fixedAssetIdentTypeEClass, FIXED_ASSET_IDENT_TYPE__FIXED_ASSET_IDENT_TYPE_ID);
		createEAttribute(fixedAssetIdentTypeEClass, FIXED_ASSET_IDENT_TYPE__DESCRIPTION);

		fixedAssetMaintEClass = createEClass(FIXED_ASSET_MAINT);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__FIXED_ASSET);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__INTERVAL_METER_TYPE);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__INTERVAL_QUANTITY);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__INTERVAL_UOM);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__PURCHASE_ORDER);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT);
		createEReference(fixedAssetMaintEClass, FIXED_ASSET_MAINT__STATUS);

		fixedAssetMaintOrderEClass = createEClass(FIXED_ASSET_MAINT_ORDER);
		createEReference(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__FIXED_ASSET);
		createEReference(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__ORDER);
		createEAttribute(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__MAINT_HIST_SEQ_ID);
		createEAttribute(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__ORDER_ITEM_SEQ_ID);

		fixedAssetMeterEClass = createEClass(FIXED_ASSET_METER);
		createEReference(fixedAssetMeterEClass, FIXED_ASSET_METER__PRODUCT_METER_TYPE);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__FIXED_ASSET_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__READING_DATE);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__MAINT_HIST_SEQ_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__METER_VALUE);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__READING_REASON_ENUM_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__WORK_EFFORT_ID);

		fixedAssetProductEClass = createEClass(FIXED_ASSET_PRODUCT);
		createEReference(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__PRODUCT);
		createEReference(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__FIXED_ASSET);
		createEReference(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__FROM_DATE);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__COMMENTS);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__QUANTITY);
		createEReference(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__QUANTITY_UOM);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__SEQUENCE_NUM);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__THRU_DATE);

		fixedAssetProductTypeEClass = createEClass(FIXED_ASSET_PRODUCT_TYPE);
		createEAttribute(fixedAssetProductTypeEClass, FIXED_ASSET_PRODUCT_TYPE__FIXED_ASSET_PRODUCT_TYPE_ID);
		createEAttribute(fixedAssetProductTypeEClass, FIXED_ASSET_PRODUCT_TYPE__DESCRIPTION);

		fixedAssetRegistrationEClass = createEClass(FIXED_ASSET_REGISTRATION);
		createEReference(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__FIXED_ASSET);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__FROM_DATE);
		createEReference(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__GOV_AGENCY_PARTY);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__LICENSE_NUMBER);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__REGISTRATION_DATE);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__REGISTRATION_NUMBER);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__THRU_DATE);

		fixedAssetStdCostEClass = createEClass(FIXED_ASSET_STD_COST);
		createEReference(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__FIXED_ASSET);
		createEReference(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__FROM_DATE);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__AMOUNT);
		createEReference(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__AMOUNT_UOM);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__THRU_DATE);

		fixedAssetStdCostTypeEClass = createEClass(FIXED_ASSET_STD_COST_TYPE);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__FIXED_ASSET_STD_COST_TYPE_ID);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__DESCRIPTION);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__HAS_TABLE);
		createEReference(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__PARENT_TYPE);

		fixedAssetTypeEClass = createEClass(FIXED_ASSET_TYPE);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ID);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__DESCRIPTION);
		createEReference(fixedAssetTypeEClass, FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ATTRS);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__HAS_TABLE);
		createEReference(fixedAssetTypeEClass, FIXED_ASSET_TYPE__PARENT_TYPE);

		fixedAssetTypeAttrEClass = createEClass(FIXED_ASSET_TYPE_ATTR);
		createEReference(fixedAssetTypeAttrEClass, FIXED_ASSET_TYPE_ATTR__FIXED_ASSET_TYPE);
		createEAttribute(fixedAssetTypeAttrEClass, FIXED_ASSET_TYPE_ATTR__ATTR_NAME);
		createEAttribute(fixedAssetTypeAttrEClass, FIXED_ASSET_TYPE_ATTR__DESCRIPTION);

		fixedAssetTypeGlAccountEClass = createEClass(FIXED_ASSET_TYPE_GL_ACCOUNT);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT);
		createEReference(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT);

		partyFixedAssetAssignmentEClass = createEClass(PARTY_FIXED_ASSET_ASSIGNMENT);
		createEReference(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__PARTY);
		createEReference(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE);
		createEReference(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS);
		createEReference(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__STATUS);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE);
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
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		TechdataPackage theTechdataPackage = (TechdataPackage)EPackage.Registry.INSTANCE.getEPackage(TechdataPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accommodationClassEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		accommodationClassEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getAccommodationMapType());
		g1.getETypeArguments().add(g2);
		accommodationMapEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		accommodationMapEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getAccommodationMap());
		g1.getETypeArguments().add(g2);
		accommodationMapTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		accommodationMapTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getFixedAssetType());
		g1.getETypeArguments().add(g2);
		fixedAssetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetEClass.getEGenericSuperTypes().add(g1);
		fixedAssetAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		fixedAssetDepMethodEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetDepMethodEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		fixedAssetGeoPointEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetGeoPointEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getFixedAssetIdentType());
		g1.getETypeArguments().add(g2);
		fixedAssetIdentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetIdentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getFixedAssetIdent());
		g1.getETypeArguments().add(g2);
		fixedAssetIdentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetIdentTypeEClass.getEGenericSuperTypes().add(g1);
		fixedAssetMaintEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetMaintEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		fixedAssetMaintOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetMaintOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		fixedAssetMeterEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetMeterEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getFixedAssetProductType());
		g1.getETypeArguments().add(g2);
		fixedAssetProductEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetProductEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getFixedAssetProduct());
		g1.getETypeArguments().add(g2);
		fixedAssetProductTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetProductTypeEClass.getEGenericSuperTypes().add(g1);
		fixedAssetRegistrationEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetRegistrationEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getFixedAssetStdCostType());
		g1.getETypeArguments().add(g2);
		fixedAssetStdCostEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetStdCostEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getFixedAssetStdCost());
		g1.getETypeArguments().add(g2);
		fixedAssetStdCostTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetStdCostTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getFixedAsset());
		g1.getETypeArguments().add(g2);
		fixedAssetTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		fixedAssetTypeEClass.getEGenericSuperTypes().add(g1);
		fixedAssetTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		fixedAssetTypeGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		fixedAssetTypeGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyFixedAssetAssignmentEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyFixedAssetAssignmentEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(accommodationClassEClass, AccommodationClass.class, "AccommodationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccommodationClass_AccommodationClassId(), ecorePackage.getEString(), "accommodationClassId", null, 1, 1, AccommodationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, AccommodationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccommodationClass_ParentClass(), this.getAccommodationClass(), null, "parentClass", null, 0, 1, AccommodationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accommodationMapEClass, AccommodationMap.class, "AccommodationMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccommodationMap_AccommodationMapId(), ecorePackage.getEString(), "accommodationMapId", null, 1, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccommodationMap_AccommodationClass(), this.getAccommodationClass(), null, "accommodationClass", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccommodationMap_AccommodationMapType(), this.getAccommodationMapType(), null, "accommodationMapType", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccommodationMap_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMap_NumberOfSpaces(), ecorePackage.getELong(), "numberOfSpaces", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accommodationMapTypeEClass, AccommodationMapType.class, "AccommodationMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccommodationMapType_AccommodationMapTypeId(), ecorePackage.getEString(), "accommodationMapTypeId", null, 1, 1, AccommodationMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMapType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AccommodationMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetEClass, FixedAsset.class, "FixedAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAsset_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 1, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_AcquireOrder(), theOrderPackage.getOrderHeader(), null, "acquireOrder", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_AcquireOrderItemSeqId(), ecorePackage.getEString(), "acquireOrderItemSeqId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ActualEndOfLife(), ecorePackage.getEDate(), "actualEndOfLife", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_Calendar(), theTechdataPackage.getTechDataCalendar(), null, "calendar", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_ClassEnum(), theEnumPackage.getEnumeration(), null, "classEnum", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_DateAcquired(), ecorePackage.getEDate(), "dateAcquired", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_DateLastServiced(), ecorePackage.getEDate(), "dateLastServiced", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_DateNextService(), ecorePackage.getEDate(), "dateNextService", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_Depreciation(), ecorePackage.getEBigDecimal(), "depreciation", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ExpectedEndOfLife(), ecorePackage.getEDate(), "expectedEndOfLife", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetAttributes(), this.getFixedAssetAttribute(), null, "fixedAssetAttributes", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetGeoPoints(), this.getFixedAssetGeoPoint(), null, "fixedAssetGeoPoints", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetIdents(), this.getFixedAssetIdent(), null, "fixedAssetIdents", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetMaints(), this.getFixedAssetMaint(), null, "fixedAssetMaints", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetName(), ecorePackage.getEString(), "fixedAssetName", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetRegistrations(), this.getFixedAssetRegistration(), null, "fixedAssetRegistrations", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetStdCosts(), this.getFixedAssetStdCost(), null, "fixedAssetStdCosts", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_FixedAssetType(), this.getFixedAssetType(), null, "fixedAssetType", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_InstanceOfProduct(), theProductPackage.getProduct(), null, "instanceOfProduct", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_LocatedAtFacility(), theFacilityPackage.getFacility(), null, "locatedAtFacility", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_LocatedAtLocationSeqId(), ecorePackage.getEString(), "locatedAtLocationSeqId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_ParentFixedAsset(), this.getFixedAsset(), null, "parentFixedAsset", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_Party(), thePartyPackage_1.getParty(), null, "party", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ProductionCapacity(), ecorePackage.getEBigDecimal(), "productionCapacity", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_PurchaseCost(), ecorePackage.getEBigDecimal(), "purchaseCost", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_PurchaseCostUomId(), ecorePackage.getEString(), "purchaseCostUomId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_SalvageValue(), ecorePackage.getEBigDecimal(), "salvageValue", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_SerialNumber(), ecorePackage.getEString(), "serialNumber", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAsset_Uom(), theUomPackage.getUom(), null, "uom", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetAttributeEClass, FixedAssetAttribute.class, "FixedAssetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetAttribute_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetDepMethodEClass, FixedAssetDepMethod.class, "FixedAssetDepMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetDepMethod_DepreciationCustomMethod(), theMethodPackage.getCustomMethod(), null, "depreciationCustomMethod", null, 1, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetDepMethod_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetDepMethod_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetDepMethod_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetGeoPointEClass, FixedAssetGeoPoint.class, "FixedAssetGeoPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetGeoPoint_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetGeoPoint_GeoPoint(), theGeoPackage.getGeoPoint(), null, "geoPoint", null, 1, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetGeoPoint_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetGeoPoint_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetIdentEClass, FixedAssetIdent.class, "FixedAssetIdent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetIdent_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetIdent_FixedAssetIdentType(), this.getFixedAssetIdentType(), null, "fixedAssetIdentType", null, 1, 1, FixedAssetIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetIdent_IdValue(), ecorePackage.getEString(), "idValue", null, 0, 1, FixedAssetIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetIdentTypeEClass, FixedAssetIdentType.class, "FixedAssetIdentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetIdentType_FixedAssetIdentTypeId(), ecorePackage.getEString(), "fixedAssetIdentTypeId", null, 1, 1, FixedAssetIdentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetIdentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetIdentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetMaintEClass, FixedAssetMaint.class, "FixedAssetMaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetMaint_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 1, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaint_IntervalMeterType(), theProductPackage.getProductMeterType(), null, "intervalMeterType", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_IntervalQuantity(), ecorePackage.getEBigDecimal(), "intervalQuantity", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaint_IntervalUom(), theUomPackage.getUom(), null, "intervalUom", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_ProductMaintSeqId(), ecorePackage.getEString(), "productMaintSeqId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaint_ProductMaintType(), theProductPackage.getProductMaintType(), null, "productMaintType", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaint_PurchaseOrder(), theOrderPackage.getOrderHeader(), null, "purchaseOrder", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaint_ScheduleWorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "scheduleWorkEffort", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaint_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetMaintOrderEClass, FixedAssetMaintOrder.class, "FixedAssetMaintOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetMaintOrder_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetMaintOrder_Order(), theOrderPackage.getOrderHeader(), null, "order", null, 1, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaintOrder_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 1, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaintOrder_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetMeterEClass, FixedAssetMeter.class, "FixedAssetMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetMeter_ProductMeterType(), theProductPackage.getProductMeterType(), null, "productMeterType", null, 1, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 1, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_ReadingDate(), ecorePackage.getEDate(), "readingDate", null, 1, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_MeterValue(), ecorePackage.getEBigDecimal(), "meterValue", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_ReadingReasonEnumId(), ecorePackage.getEString(), "readingReasonEnumId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetProductEClass, FixedAssetProduct.class, "FixedAssetProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetProduct_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetProduct_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetProduct_FixedAssetProductType(), this.getFixedAssetProductType(), null, "fixedAssetProductType", null, 1, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetProduct_QuantityUom(), theUomPackage.getUom(), null, "quantityUom", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetProductTypeEClass, FixedAssetProductType.class, "FixedAssetProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetProductType_FixedAssetProductTypeId(), ecorePackage.getEString(), "fixedAssetProductTypeId", null, 1, 1, FixedAssetProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProductType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetRegistrationEClass, FixedAssetRegistration.class, "FixedAssetRegistration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetRegistration_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetRegistration_GovAgencyParty(), thePartyPackage_1.getParty(), null, "govAgencyParty", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_LicenseNumber(), ecorePackage.getEString(), "licenseNumber", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_RegistrationDate(), ecorePackage.getEDate(), "registrationDate", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_RegistrationNumber(), ecorePackage.getEString(), "registrationNumber", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetStdCostEClass, FixedAssetStdCost.class, "FixedAssetStdCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetStdCost_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetStdCost_FixedAssetStdCostType(), this.getFixedAssetStdCostType(), null, "fixedAssetStdCostType", null, 1, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetStdCost_AmountUom(), theUomPackage.getUom(), null, "amountUom", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetStdCostTypeEClass, FixedAssetStdCostType.class, "FixedAssetStdCostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetStdCostType_FixedAssetStdCostTypeId(), ecorePackage.getEString(), "fixedAssetStdCostTypeId", null, 1, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCostType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCostType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetStdCostType_ParentType(), this.getFixedAssetStdCostType(), null, "parentType", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetTypeEClass, FixedAssetType.class, "FixedAssetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetType_FixedAssetTypeId(), ecorePackage.getEString(), "fixedAssetTypeId", null, 1, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetType_FixedAssetTypeAttrs(), this.getFixedAssetTypeAttr(), null, "fixedAssetTypeAttrs", null, 0, -1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetType_ParentType(), this.getFixedAssetType(), null, "parentType", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetTypeAttrEClass, FixedAssetTypeAttr.class, "FixedAssetTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetTypeAttr_FixedAssetType(), this.getFixedAssetType(), null, "fixedAssetType", null, 1, 1, FixedAssetTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, FixedAssetTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetTypeGlAccountEClass, FixedAssetTypeGlAccount.class, "FixedAssetTypeGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAssetTypeGlAccount_FixedAssetType(), this.getFixedAssetType(), null, "fixedAssetType", null, 1, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_AccDepGlAccount(), theLedgerPackage.getGlAccount(), null, "accDepGlAccount", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_AssetGlAccount(), theLedgerPackage.getGlAccount(), null, "assetGlAccount", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_DepGlAccount(), theLedgerPackage.getGlAccount(), null, "depGlAccount", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_LossGlAccount(), theLedgerPackage.getGlAccount(), null, "lossGlAccount", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedAssetTypeGlAccount_ProfitGlAccount(), theLedgerPackage.getGlAccount(), null, "profitGlAccount", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyFixedAssetAssignmentEClass, PartyFixedAssetAssignment.class, "PartyFixedAssetAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyFixedAssetAssignment_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyFixedAssetAssignment_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyFixedAssetAssignment_FixedAsset(), this.getFixedAsset(), null, "fixedAsset", null, 1, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_AllocatedDate(), ecorePackage.getEDate(), "allocatedDate", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyFixedAssetAssignment_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
		// mimo-ent-slot-constraints
		createMimoentslotconstraintsAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
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
		  (accommodationClassEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (accommodationMapTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetDepMethodEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Depreciation Method"
		   });
		addAnnotation
		  (fixedAssetGeoPointEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Geo Location with history"
		   });
		addAnnotation
		  (fixedAssetIdentEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Identification"
		   });
		addAnnotation
		  (fixedAssetIdentTypeEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Identification Type",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetMaintEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Maintenance"
		   });
		addAnnotation
		  (fixedAssetMaintOrderEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Maintance And Order"
		   });
		addAnnotation
		  (fixedAssetProductEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Product Representation"
		   });
		addAnnotation
		  (fixedAssetProductTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetStdCostEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Standard Cost"
		   });
		addAnnotation
		  (fixedAssetStdCostTypeEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Standard Cost Type",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Fixed Asset Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetTypeGlAccountEClass,
		   source,
		   new String[] {
			   "title", "Gl Account Mapping For Fixed Asset Or Fixed Asset Types"
		   });
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
		  (getAccommodationClass_AccommodationClassId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAccommodationClass_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAccommodationMap_AccommodationMapId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAccommodationMap_NumberOfSpaces(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getAccommodationMapType_AccommodationMapTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAccommodationMapType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAsset_AcquireOrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAsset_Depreciation(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getFixedAsset_LocatedAtLocationSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAsset_ProductionCapacity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getFixedAsset_PurchaseCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getFixedAsset_PurchaseCostUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAsset_SalvageValue(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getFixedAsset_SerialNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFixedAssetAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getFixedAssetAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getFixedAssetAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFixedAssetIdent_IdValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFixedAssetIdentType_FixedAssetIdentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetIdentType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getFixedAssetMaint_MaintHistSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMaint_IntervalQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getFixedAssetMaint_ProductMaintSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_MaintHistSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMeter_FixedAssetId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMeter_MaintHistSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMeter_MeterValue(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getFixedAssetMeter_ReadingReasonEnumId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetMeter_WorkEffortId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetProduct_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getFixedAssetProduct_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getFixedAssetProduct_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getFixedAssetProductType_FixedAssetProductTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetProductType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getFixedAssetRegistration_LicenseNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFixedAssetRegistration_RegistrationNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getFixedAssetStdCost_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getFixedAssetStdCostType_FixedAssetStdCostTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetStdCostType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getFixedAssetType_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getFixedAssetType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
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
		  (getFixedAsset_FixedAssetGeoPoints(),
		   source,
		   new String[] {
			   "fromDate", "*NOW"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetStdCosts(),
		   source,
		   new String[] {
			   "fromDate", "*NOW"
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
		  (getFixedAssetAttribute_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetDepMethod_DepreciationCustomMethod(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetDepMethod_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_GeoPoint(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetIdent_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetIdent_FixedAssetIdentType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaint_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaint_MaintHistSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaint_IntervalMeterType(),
		   source,
		   new String[] {
			   "help", "Meter Type for intervalQuantity; if used intervalUomId is generally not used (ie one or the other)"
		   });
		addAnnotation
		  (getFixedAssetMaint_IntervalUom(),
		   source,
		   new String[] {
			   "help", "UOM for intervalQuantity; if used intervalMeterTypeId is generally not used (ie one or the other); if a meter reading is done as well that is not tied to the interval it should be tracked in a FixedAssetMeter record"
		   });
		addAnnotation
		  (getFixedAssetMaint_ProductMaintSeqId(),
		   source,
		   new String[] {
			   "help", "Optional, though should be filled in to determine upcoming maintenance for all scheduled maintenance"
		   });
		addAnnotation
		  (getFixedAssetMaint_ProductMaintType(),
		   source,
		   new String[] {
			   "help", "If productMaintSeqId is known can lookup using that and the FixedAsset.productId; for un-scheduled maintenance is filled in directly"
		   });
		addAnnotation
		  (getFixedAssetMaint_ScheduleWorkEffort(),
		   source,
		   new String[] {
			   "help", "Has field for estimated/actual start and finish dates, etc"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_MaintHistSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMeter_ProductMeterType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMeter_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMeter_ReadingDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_FixedAssetProductType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetRegistration_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetRegistration_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCost_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCost_FixedAssetStdCostType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCost_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_FixedAssetType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_FixedAssetType(),
		   source,
		   new String[] {
			   "key", "true",
			   "help", "The fixed asset type for the mappings. This field can be set to _NA_ in order to define a mapping for all types or for a specific asset (specified by the id in the fixedAssetId field)."
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true",
			   "help", "The fixed asset id for the mappings. This field can be set to _NA_ in order to define a mapping for all assets of a given type (specified by the id in the fixedAssetTypeId field)."
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_AccDepGlAccount(),
		   source,
		   new String[] {
			   "help", "The (credit) account for the accumulated depreciation"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_AssetGlAccount(),
		   source,
		   new String[] {
			   "help", "The (debit) account for the initial asset value (purchase cost)"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_DepGlAccount(),
		   source,
		   new String[] {
			   "help", "The (debit) account for the depreciation expense (matches the accDepGlAccountId)"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_LossGlAccount(),
		   source,
		   new String[] {
			   "help", "The (debit) account for the eventual loss derived from the sale of the asset"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_ProfitGlAccount(),
		   source,
		   new String[] {
			   "help", "The (credit) account for the eventual profit derived from the sale of the asset"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_FixedAsset(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

} //FixedassetPackageImpl
