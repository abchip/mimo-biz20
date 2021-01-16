/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger.impl;

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
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransAttribute;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntry;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransEntryType;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType;
import org.abchip.mimo.biz.model.accounting.ledger.AcctgTransTypeAttr;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountCategory;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountCategoryMember;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountCategoryType;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroup;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupType;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountHistory;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountOrganization;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountRole;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountTypeDefault;
import org.abchip.mimo.biz.model.accounting.ledger.GlBudgetXref;
import org.abchip.mimo.biz.model.accounting.ledger.GlFiscalType;
import org.abchip.mimo.biz.model.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry;
import org.abchip.mimo.biz.model.accounting.ledger.GlResourceType;
import org.abchip.mimo.biz.model.accounting.ledger.GlXbrlClass;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerFactory;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount;
import org.abchip.mimo.biz.model.accounting.ledger.PartyPrefDocTypeTpl;
import org.abchip.mimo.biz.model.accounting.ledger.ProductAverageCost;
import org.abchip.mimo.biz.model.accounting.ledger.ProductAverageCostType;
import org.abchip.mimo.biz.model.accounting.ledger.SettlementTerm;
import org.abchip.mimo.biz.model.accounting.ledger.VarianceReasonGlAccount;
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
public class LedgerPackageImpl extends EPackageImpl implements LedgerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountCategoryMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountCategoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountGroupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountTypeDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glBudgetXrefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glFiscalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glJournalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glReconciliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glReconciliationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glXbrlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyAcctgPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyPrefDocTypeTplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAverageCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAverageCostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settlementTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varianceReasonGlAccountEClass = null;

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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LedgerPackageImpl() {
		super(eNS_URI, LedgerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LedgerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LedgerPackage init() {
		if (isInited) return (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLedgerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LedgerPackageImpl theLedgerPackage = registeredLedgerPackage instanceof LedgerPackageImpl ? (LedgerPackageImpl)registeredLedgerPackage : new LedgerPackageImpl();

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
		theLedgerPackage.createPackageContents();
		theAccountingPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
		theFixedassetPackage.createPackageContents();
		theInvoicePackage.createPackageContents();
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
		theLedgerPackage.initializePackageContents();
		theAccountingPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
		theFixedassetPackage.initializePackageContents();
		theInvoicePackage.initializePackageContents();
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
		theLedgerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LedgerPackage.eNS_URI, theLedgerPackage);
		return theLedgerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTrans() {
		return acctgTransEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_AcctgTransId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_AcctgTransAttributes() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_AcctgTransEntries() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_AcctgTransType() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_CreatedByUserLogin() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_CreatedDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_Description() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_FinAccountTrans() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_FixedAsset() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_GlFiscalType() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_GlJournal() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_GroupStatus() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_InventoryItem() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_Invoice() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_IsPosted() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_LastModifiedByUserLogin() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_LastModifiedDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_Party() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_Payment() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_PhysicalInventory() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_PostedDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_Receipt() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_RoleType() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_ScheduledPostingDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_Shipment() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_TheirAcctgTransId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_TransactionDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_VoucherDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_VoucherRef() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTrans_WorkEffort() {
		return (EReference)acctgTransEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransAttribute() {
		return acctgTransAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransAttribute_AcctgTrans() {
		return (EReference)acctgTransAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AttrName() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AttrDescription() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AttrValue() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransEntry() {
		return acctgTransEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_AcctgTrans() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_AcctgTransEntrySeqId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_AcctgTransEntryType() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_Amount() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_CurrencyUom() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_DebitCreditFlag() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_Description() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_DueDate() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_GlAccount() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_GlAccountType() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_GroupId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_InventoryItem() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_IsSummary() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_OrganizationPartyId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_OrigAmount() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_OrigCurrencyUom() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_Party() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_ProductId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_ReconcileStatus() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_RoleType() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntry_SettlementTerm() {
		return (EReference)acctgTransEntryEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_TaxId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_TheirPartyId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_TheirProductId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_VoucherRef() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransEntryType() {
		return acctgTransEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_AcctgTransEntryTypeId() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_Description() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_HasTable() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransEntryType_ParentType() {
		return (EReference)acctgTransEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransType() {
		return acctgTransTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_AcctgTransTypeId() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransType_AcctgTransTypeAttrs() {
		return (EReference)acctgTransTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_Description() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_HasTable() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransType_ParentType() {
		return (EReference)acctgTransTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransTypeAttr() {
		return acctgTransTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcctgTransTypeAttr_AcctgTransType() {
		return (EReference)acctgTransTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransTypeAttr_AttrName() {
		return (EAttribute)acctgTransTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransTypeAttr_Description() {
		return (EAttribute)acctgTransTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccount() {
		return glAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlAccountId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_AccountCode() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_AccountName() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_Description() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_ExternalId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlAccountCategoryMembers() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlAccountClass() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlAccountGroupMembers() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlAccountOrganizations() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlAccountType() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlBudgetXrefs() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlResourceType() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_GlXbrlClass() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccount_ParentGlAccount() {
		return (EReference)glAccountEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_ProductId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountCategory() {
		return glAccountCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategory_GlAccountCategoryId() {
		return (EAttribute)glAccountCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategory_Description() {
		return (EAttribute)glAccountCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountCategory_GlAccountCategoryType() {
		return (EReference)glAccountCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountCategoryMember() {
		return glAccountCategoryMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountCategoryMember_GlAccount() {
		return (EReference)glAccountCategoryMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountCategoryMember_GlAccountCategory() {
		return (EReference)glAccountCategoryMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_FromDate() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_AmountPercentage() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_ThruDate() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountCategoryType() {
		return glAccountCategoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryType_GlAccountCategoryTypeId() {
		return (EAttribute)glAccountCategoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryType_Description() {
		return (EAttribute)glAccountCategoryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountClass() {
		return glAccountClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_GlAccountClassId() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_Description() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_IsAssetClass() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountClass_ParentClass() {
		return (EReference)glAccountClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_SequenceNum() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountGroup() {
		return glAccountGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroup_GlAccountGroupId() {
		return (EAttribute)glAccountGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroup_Description() {
		return (EAttribute)glAccountGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountGroup_GlAccountGroupType() {
		return (EReference)glAccountGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountGroupMember() {
		return glAccountGroupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountGroupMember_GlAccount() {
		return (EReference)glAccountGroupMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountGroupMember_GlAccountGroupType() {
		return (EReference)glAccountGroupMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountGroupMember_GlAccountGroup() {
		return (EReference)glAccountGroupMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountGroupType() {
		return glAccountGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupType_GlAccountGroupTypeId() {
		return (EAttribute)glAccountGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupType_Description() {
		return (EAttribute)glAccountGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountHistory() {
		return glAccountHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountHistory_GlAccount() {
		return (EReference)glAccountHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountHistory_OrganizationParty() {
		return (EReference)glAccountHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountHistory_CustomTimePeriod() {
		return (EReference)glAccountHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_EndingBalance() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_OpeningBalance() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_PostedCredits() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_PostedDebits() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountOrganization() {
		return glAccountOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountOrganization_GlAccount() {
		return (EReference)glAccountOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountOrganization_OrganizationParty() {
		return (EReference)glAccountOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_FromDate() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountOrganization_RoleType() {
		return (EReference)glAccountOrganizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_ThruDate() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountRole() {
		return glAccountRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountRole_GlAccount() {
		return (EReference)glAccountRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountRole_Party() {
		return (EReference)glAccountRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountRole_RoleType() {
		return (EReference)glAccountRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_FromDate() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_ThruDate() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountType() {
		return glAccountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_GlAccountTypeId() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_Description() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountType_GlAccountTypeDefaults() {
		return (EReference)glAccountTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_HasTable() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountType_ParentType() {
		return (EReference)glAccountTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountTypeDefault() {
		return glAccountTypeDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountTypeDefault_GlAccountType() {
		return (EReference)glAccountTypeDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountTypeDefault_OrganizationParty() {
		return (EReference)glAccountTypeDefaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlAccountTypeDefault_GlAccount() {
		return (EReference)glAccountTypeDefaultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlBudgetXref() {
		return glBudgetXrefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlBudgetXref_GlAccount() {
		return (EReference)glBudgetXrefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlBudgetXref_BudgetItemType() {
		return (EReference)glBudgetXrefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_FromDate() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_AllocationPercentage() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_ThruDate() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlFiscalType() {
		return glFiscalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlFiscalType_GlFiscalTypeId() {
		return (EAttribute)glFiscalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlFiscalType_Description() {
		return (EAttribute)glFiscalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlJournal() {
		return glJournalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_GlJournalId() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_GlJournalName() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_IsPosted() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlJournal_OrganizationParty() {
		return (EReference)glJournalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_PostedDate() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlReconciliation() {
		return glReconciliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_GlReconciliationId() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_CreatedByUserLogin() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_CreatedDate() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_Description() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlReconciliation_GlAccount() {
		return (EReference)glReconciliationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_GlReconciliationName() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_LastModifiedByUserLogin() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_LastModifiedDate() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_OpeningBalance() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlReconciliation_OrganizationParty() {
		return (EReference)glReconciliationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_ReconciledBalance() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_ReconciledDate() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlReconciliation_Status() {
		return (EReference)glReconciliationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlReconciliationEntry() {
		return glReconciliationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlReconciliationEntry_GlReconciliation() {
		return (EReference)glReconciliationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlReconciliationEntry_AcctgTrans() {
		return (EReference)glReconciliationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliationEntry_AcctgTransEntrySeqId() {
		return (EAttribute)glReconciliationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliationEntry_ReconciledAmount() {
		return (EAttribute)glReconciliationEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlResourceType() {
		return glResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlResourceType_GlResourceTypeId() {
		return (EAttribute)glResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlResourceType_Description() {
		return (EAttribute)glResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlXbrlClass() {
		return glXbrlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlXbrlClass_GlXbrlClassId() {
		return (EAttribute)glXbrlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlXbrlClass_Description() {
		return (EAttribute)glXbrlClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyAcctgPreference() {
		return partyAcctgPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_PartyId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_BaseCurrencyUom() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_CogsMethod() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_EnableAccounting() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_ErrorGlJournal() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_FiscalYearStartDay() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_FiscalYearStartMonth() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_InvoiceIdPrefix() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_InvoiceSeqCustMeth() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastInvoiceNumber() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastInvoiceRestartDate() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastOrderNumber() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastQuoteNumber() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_OldInvoiceSequenceEnum() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_OldOrderSequenceEnum() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_OldQuoteSequenceEnum() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_OrderIdPrefix() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_OrderSeqCustMeth() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_QuoteIdPrefix() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_QuoteSeqCustMeth() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_RefundPaymentMethod() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAcctgPreference_TaxForm() {
		return (EReference)partyAcctgPreferenceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_UseInvoiceIdForReturns() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyGlAccount() {
		return partyGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGlAccount_OrganizationParty() {
		return (EReference)partyGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGlAccount_Party() {
		return (EReference)partyGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGlAccount_RoleType() {
		return (EReference)partyGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGlAccount_GlAccountType() {
		return (EReference)partyGlAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGlAccount_GlAccount() {
		return (EReference)partyGlAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyPrefDocTypeTpl() {
		return partyPrefDocTypeTplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_CustomScreenId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_FromDate() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyPrefDocTypeTpl_InvoiceType() {
		return (EReference)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyPrefDocTypeTpl_OrderType() {
		return (EReference)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyPrefDocTypeTpl_Party() {
		return (EReference)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyPrefDocTypeTpl_QuoteType() {
		return (EReference)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_ThruDate() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAverageCost() {
		return productAverageCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAverageCost_ProductAverageCostType() {
		return (EReference)productAverageCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAverageCost_OrganizationParty() {
		return (EReference)productAverageCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAverageCost_Product() {
		return (EReference)productAverageCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAverageCost_Facility() {
		return (EReference)productAverageCostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_FromDate() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_AverageCost() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_ThruDate() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAverageCostType() {
		return productAverageCostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_ProductAverageCostTypeId() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_Description() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_HasTable() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAverageCostType_ParentType() {
		return (EReference)productAverageCostTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSettlementTerm() {
		return settlementTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_SettlementTermId() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_TermName() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_TermValue() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_UomId() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarianceReasonGlAccount() {
		return varianceReasonGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarianceReasonGlAccount_VarianceReason() {
		return (EReference)varianceReasonGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarianceReasonGlAccount_OrganizationParty() {
		return (EReference)varianceReasonGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarianceReasonGlAccount_GlAccount() {
		return (EReference)varianceReasonGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedgerFactory getLedgerFactory() {
		return (LedgerFactory)getEFactoryInstance();
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
		acctgTransEClass = createEClass(ACCTG_TRANS);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_ID);
		createEReference(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES);
		createEReference(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_ENTRIES);
		createEReference(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_TYPE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__CREATED_BY_USER_LOGIN);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__CREATED_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__DESCRIPTION);
		createEReference(acctgTransEClass, ACCTG_TRANS__FIN_ACCOUNT_TRANS);
		createEReference(acctgTransEClass, ACCTG_TRANS__FIXED_ASSET);
		createEReference(acctgTransEClass, ACCTG_TRANS__GL_FISCAL_TYPE);
		createEReference(acctgTransEClass, ACCTG_TRANS__GL_JOURNAL);
		createEReference(acctgTransEClass, ACCTG_TRANS__GROUP_STATUS);
		createEReference(acctgTransEClass, ACCTG_TRANS__INVENTORY_ITEM);
		createEReference(acctgTransEClass, ACCTG_TRANS__INVOICE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__IS_POSTED);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__LAST_MODIFIED_DATE);
		createEReference(acctgTransEClass, ACCTG_TRANS__PARTY);
		createEReference(acctgTransEClass, ACCTG_TRANS__PAYMENT);
		createEReference(acctgTransEClass, ACCTG_TRANS__PHYSICAL_INVENTORY);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__POSTED_DATE);
		createEReference(acctgTransEClass, ACCTG_TRANS__RECEIPT);
		createEReference(acctgTransEClass, ACCTG_TRANS__ROLE_TYPE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__SCHEDULED_POSTING_DATE);
		createEReference(acctgTransEClass, ACCTG_TRANS__SHIPMENT);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__THEIR_ACCTG_TRANS_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__TRANSACTION_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__VOUCHER_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__VOUCHER_REF);
		createEReference(acctgTransEClass, ACCTG_TRANS__WORK_EFFORT);

		acctgTransAttributeEClass = createEClass(ACCTG_TRANS_ATTRIBUTE);
		createEReference(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ACCTG_TRANS);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ATTR_NAME);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ATTR_VALUE);

		acctgTransEntryEClass = createEClass(ACCTG_TRANS_ENTRY);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ACCTG_TRANS);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__AMOUNT);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__CURRENCY_UOM);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__DESCRIPTION);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__DUE_DATE);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__GL_ACCOUNT);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__GROUP_ID);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__INVENTORY_ITEM);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__IS_SUMMARY);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ORIG_AMOUNT);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__PARTY);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__PRODUCT_ID);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__RECONCILE_STATUS);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ROLE_TYPE);
		createEReference(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__SETTLEMENT_TERM);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__TAX_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__THEIR_PARTY_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__VOUCHER_REF);

		acctgTransEntryTypeEClass = createEClass(ACCTG_TRANS_ENTRY_TYPE);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__ACCTG_TRANS_ENTRY_TYPE_ID);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__DESCRIPTION);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__HAS_TABLE);
		createEReference(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__PARENT_TYPE);

		acctgTransTypeEClass = createEClass(ACCTG_TRANS_TYPE);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID);
		createEReference(acctgTransTypeEClass, ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__DESCRIPTION);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__HAS_TABLE);
		createEReference(acctgTransTypeEClass, ACCTG_TRANS_TYPE__PARENT_TYPE);

		acctgTransTypeAttrEClass = createEClass(ACCTG_TRANS_TYPE_ATTR);
		createEReference(acctgTransTypeAttrEClass, ACCTG_TRANS_TYPE_ATTR__ACCTG_TRANS_TYPE);
		createEAttribute(acctgTransTypeAttrEClass, ACCTG_TRANS_TYPE_ATTR__ATTR_NAME);
		createEAttribute(acctgTransTypeAttrEClass, ACCTG_TRANS_TYPE_ATTR__DESCRIPTION);

		glAccountEClass = createEClass(GL_ACCOUNT);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__ACCOUNT_CODE);
		createEAttribute(glAccountEClass, GL_ACCOUNT__ACCOUNT_NAME);
		createEAttribute(glAccountEClass, GL_ACCOUNT__DESCRIPTION);
		createEAttribute(glAccountEClass, GL_ACCOUNT__EXTERNAL_ID);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_CATEGORY_MEMBERS);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_CLASS);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_TYPE);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_BUDGET_XREFS);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_RESOURCE_TYPE);
		createEReference(glAccountEClass, GL_ACCOUNT__GL_XBRL_CLASS);
		createEReference(glAccountEClass, GL_ACCOUNT__PARENT_GL_ACCOUNT);
		createEAttribute(glAccountEClass, GL_ACCOUNT__PRODUCT_ID);

		glAccountCategoryEClass = createEClass(GL_ACCOUNT_CATEGORY);
		createEAttribute(glAccountCategoryEClass, GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID);
		createEAttribute(glAccountCategoryEClass, GL_ACCOUNT_CATEGORY__DESCRIPTION);
		createEReference(glAccountCategoryEClass, GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE);

		glAccountCategoryMemberEClass = createEClass(GL_ACCOUNT_CATEGORY_MEMBER);
		createEReference(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT);
		createEReference(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE);

		glAccountCategoryTypeEClass = createEClass(GL_ACCOUNT_CATEGORY_TYPE);
		createEAttribute(glAccountCategoryTypeEClass, GL_ACCOUNT_CATEGORY_TYPE__GL_ACCOUNT_CATEGORY_TYPE_ID);
		createEAttribute(glAccountCategoryTypeEClass, GL_ACCOUNT_CATEGORY_TYPE__DESCRIPTION);

		glAccountClassEClass = createEClass(GL_ACCOUNT_CLASS);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__DESCRIPTION);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__IS_ASSET_CLASS);
		createEReference(glAccountClassEClass, GL_ACCOUNT_CLASS__PARENT_CLASS);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__SEQUENCE_NUM);

		glAccountGroupEClass = createEClass(GL_ACCOUNT_GROUP);
		createEAttribute(glAccountGroupEClass, GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID);
		createEAttribute(glAccountGroupEClass, GL_ACCOUNT_GROUP__DESCRIPTION);
		createEReference(glAccountGroupEClass, GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE);

		glAccountGroupMemberEClass = createEClass(GL_ACCOUNT_GROUP_MEMBER);
		createEReference(glAccountGroupMemberEClass, GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT);
		createEReference(glAccountGroupMemberEClass, GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE);
		createEReference(glAccountGroupMemberEClass, GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP);

		glAccountGroupTypeEClass = createEClass(GL_ACCOUNT_GROUP_TYPE);
		createEAttribute(glAccountGroupTypeEClass, GL_ACCOUNT_GROUP_TYPE__GL_ACCOUNT_GROUP_TYPE_ID);
		createEAttribute(glAccountGroupTypeEClass, GL_ACCOUNT_GROUP_TYPE__DESCRIPTION);

		glAccountHistoryEClass = createEClass(GL_ACCOUNT_HISTORY);
		createEReference(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__GL_ACCOUNT);
		createEReference(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY);
		createEReference(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__ENDING_BALANCE);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__OPENING_BALANCE);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__POSTED_CREDITS);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__POSTED_DEBITS);

		glAccountOrganizationEClass = createEClass(GL_ACCOUNT_ORGANIZATION);
		createEReference(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__GL_ACCOUNT);
		createEReference(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__ORGANIZATION_PARTY);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__FROM_DATE);
		createEReference(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__ROLE_TYPE);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__THRU_DATE);

		glAccountRoleEClass = createEClass(GL_ACCOUNT_ROLE);
		createEReference(glAccountRoleEClass, GL_ACCOUNT_ROLE__GL_ACCOUNT);
		createEReference(glAccountRoleEClass, GL_ACCOUNT_ROLE__PARTY);
		createEReference(glAccountRoleEClass, GL_ACCOUNT_ROLE__ROLE_TYPE);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__FROM_DATE);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__THRU_DATE);

		glAccountTypeEClass = createEClass(GL_ACCOUNT_TYPE);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_ID);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__DESCRIPTION);
		createEReference(glAccountTypeEClass, GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_DEFAULTS);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__HAS_TABLE);
		createEReference(glAccountTypeEClass, GL_ACCOUNT_TYPE__PARENT_TYPE);

		glAccountTypeDefaultEClass = createEClass(GL_ACCOUNT_TYPE_DEFAULT);
		createEReference(glAccountTypeDefaultEClass, GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_TYPE);
		createEReference(glAccountTypeDefaultEClass, GL_ACCOUNT_TYPE_DEFAULT__ORGANIZATION_PARTY);
		createEReference(glAccountTypeDefaultEClass, GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT);

		glBudgetXrefEClass = createEClass(GL_BUDGET_XREF);
		createEReference(glBudgetXrefEClass, GL_BUDGET_XREF__GL_ACCOUNT);
		createEReference(glBudgetXrefEClass, GL_BUDGET_XREF__BUDGET_ITEM_TYPE);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__FROM_DATE);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__ALLOCATION_PERCENTAGE);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__THRU_DATE);

		glFiscalTypeEClass = createEClass(GL_FISCAL_TYPE);
		createEAttribute(glFiscalTypeEClass, GL_FISCAL_TYPE__GL_FISCAL_TYPE_ID);
		createEAttribute(glFiscalTypeEClass, GL_FISCAL_TYPE__DESCRIPTION);

		glJournalEClass = createEClass(GL_JOURNAL);
		createEAttribute(glJournalEClass, GL_JOURNAL__GL_JOURNAL_ID);
		createEAttribute(glJournalEClass, GL_JOURNAL__GL_JOURNAL_NAME);
		createEAttribute(glJournalEClass, GL_JOURNAL__IS_POSTED);
		createEReference(glJournalEClass, GL_JOURNAL__ORGANIZATION_PARTY);
		createEAttribute(glJournalEClass, GL_JOURNAL__POSTED_DATE);

		glReconciliationEClass = createEClass(GL_RECONCILIATION);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__GL_RECONCILIATION_ID);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__CREATED_BY_USER_LOGIN);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__CREATED_DATE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__DESCRIPTION);
		createEReference(glReconciliationEClass, GL_RECONCILIATION__GL_ACCOUNT);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__GL_RECONCILIATION_NAME);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__LAST_MODIFIED_DATE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__OPENING_BALANCE);
		createEReference(glReconciliationEClass, GL_RECONCILIATION__ORGANIZATION_PARTY);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__RECONCILED_BALANCE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__RECONCILED_DATE);
		createEReference(glReconciliationEClass, GL_RECONCILIATION__STATUS);

		glReconciliationEntryEClass = createEClass(GL_RECONCILIATION_ENTRY);
		createEReference(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__GL_RECONCILIATION);
		createEReference(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__ACCTG_TRANS);
		createEAttribute(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID);
		createEAttribute(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT);

		glResourceTypeEClass = createEClass(GL_RESOURCE_TYPE);
		createEAttribute(glResourceTypeEClass, GL_RESOURCE_TYPE__GL_RESOURCE_TYPE_ID);
		createEAttribute(glResourceTypeEClass, GL_RESOURCE_TYPE__DESCRIPTION);

		glXbrlClassEClass = createEClass(GL_XBRL_CLASS);
		createEAttribute(glXbrlClassEClass, GL_XBRL_CLASS__GL_XBRL_CLASS_ID);
		createEAttribute(glXbrlClassEClass, GL_XBRL_CLASS__DESCRIPTION);

		partyAcctgPreferenceEClass = createEClass(PARTY_ACCTG_PREFERENCE);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__PARTY_ID);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__COGS_METHOD);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD);
		createEReference(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__TAX_FORM);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS);

		partyGlAccountEClass = createEClass(PARTY_GL_ACCOUNT);
		createEReference(partyGlAccountEClass, PARTY_GL_ACCOUNT__ORGANIZATION_PARTY);
		createEReference(partyGlAccountEClass, PARTY_GL_ACCOUNT__PARTY);
		createEReference(partyGlAccountEClass, PARTY_GL_ACCOUNT__ROLE_TYPE);
		createEReference(partyGlAccountEClass, PARTY_GL_ACCOUNT__GL_ACCOUNT_TYPE);
		createEReference(partyGlAccountEClass, PARTY_GL_ACCOUNT__GL_ACCOUNT);

		partyPrefDocTypeTplEClass = createEClass(PARTY_PREF_DOC_TYPE_TPL);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__FROM_DATE);
		createEReference(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE);
		createEReference(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE);
		createEReference(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__PARTY);
		createEReference(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__THRU_DATE);

		productAverageCostEClass = createEClass(PRODUCT_AVERAGE_COST);
		createEReference(productAverageCostEClass, PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE);
		createEReference(productAverageCostEClass, PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY);
		createEReference(productAverageCostEClass, PRODUCT_AVERAGE_COST__PRODUCT);
		createEReference(productAverageCostEClass, PRODUCT_AVERAGE_COST__FACILITY);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__FROM_DATE);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__AVERAGE_COST);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__THRU_DATE);

		productAverageCostTypeEClass = createEClass(PRODUCT_AVERAGE_COST_TYPE);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__PRODUCT_AVERAGE_COST_TYPE_ID);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__DESCRIPTION);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__HAS_TABLE);
		createEReference(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__PARENT_TYPE);

		settlementTermEClass = createEClass(SETTLEMENT_TERM);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__SETTLEMENT_TERM_ID);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__TERM_NAME);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__TERM_VALUE);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__UOM_ID);

		varianceReasonGlAccountEClass = createEClass(VARIANCE_REASON_GL_ACCOUNT);
		createEReference(varianceReasonGlAccountEClass, VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON);
		createEReference(varianceReasonGlAccountEClass, VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY);
		createEReference(varianceReasonGlAccountEClass, VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT);
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
		FinaccountPackage theFinaccountPackage = (FinaccountPackage)EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);
		FixedassetPackage theFixedassetPackage = (FixedassetPackage)EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		ReceiptPackage theReceiptPackage = (ReceiptPackage)EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		AccountingPackage theAccountingPackage = (AccountingPackage)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);
		PeriodPackage thePeriodPackage = (PeriodPackage)EPackage.Registry.INSTANCE.getEPackage(PeriodPackage.eNS_URI);
		BudgetPackage theBudgetPackage = (BudgetPackage)EPackage.Registry.INSTANCE.getEPackage(BudgetPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		QuotePackage theQuotePackage = (QuotePackage)EPackage.Registry.INSTANCE.getEPackage(QuotePackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getAcctgTransType());
		g1.getETypeArguments().add(g2);
		acctgTransEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		acctgTransEClass.getEGenericSuperTypes().add(g1);
		acctgTransAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		acctgTransAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getAcctgTransEntryType());
		g1.getETypeArguments().add(g2);
		acctgTransEntryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		acctgTransEntryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getAcctgTransEntry());
		g1.getETypeArguments().add(g2);
		acctgTransEntryTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		acctgTransEntryTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getAcctgTrans());
		g1.getETypeArguments().add(g2);
		acctgTransTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		acctgTransTypeEClass.getEGenericSuperTypes().add(g1);
		acctgTransTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		acctgTransTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getGlAccountType());
		g1.getETypeArguments().add(g2);
		glAccountEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		glAccountEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getGlAccountCategoryType());
		g1.getETypeArguments().add(g2);
		glAccountCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		glAccountCategoryEClass.getEGenericSuperTypes().add(g1);
		glAccountCategoryMemberEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountCategoryMemberEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getGlAccountCategory());
		g1.getETypeArguments().add(g2);
		glAccountCategoryTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		glAccountCategoryTypeEClass.getEGenericSuperTypes().add(g1);
		glAccountClassEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountClassEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getGlAccountGroupType());
		g1.getETypeArguments().add(g2);
		glAccountGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		glAccountGroupEClass.getEGenericSuperTypes().add(g1);
		glAccountGroupMemberEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountGroupMemberEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getGlAccountGroup());
		g1.getETypeArguments().add(g2);
		glAccountGroupTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		glAccountGroupTypeEClass.getEGenericSuperTypes().add(g1);
		glAccountHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glAccountOrganizationEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountOrganizationEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glAccountRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getGlAccount());
		g1.getETypeArguments().add(g2);
		glAccountTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		glAccountTypeEClass.getEGenericSuperTypes().add(g1);
		glAccountTypeDefaultEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glAccountTypeDefaultEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glBudgetXrefEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glBudgetXrefEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glFiscalTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glFiscalTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glJournalEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glJournalEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glReconciliationEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glReconciliationEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glReconciliationEntryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glReconciliationEntryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glResourceTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glResourceTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		glXbrlClassEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		glXbrlClassEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyAcctgPreferenceEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyAcctgPreferenceEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyPrefDocTypeTplEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyPrefDocTypeTplEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getProductAverageCostType());
		g1.getETypeArguments().add(g2);
		productAverageCostEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productAverageCostEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getProductAverageCost());
		g1.getETypeArguments().add(g2);
		productAverageCostTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		productAverageCostTypeEClass.getEGenericSuperTypes().add(g1);
		settlementTermEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		settlementTermEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		varianceReasonGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		varianceReasonGlAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(acctgTransEClass, AcctgTrans.class, "AcctgTrans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTrans_AcctgTransId(), ecorePackage.getEString(), "acctgTransId", null, 1, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_AcctgTransAttributes(), this.getAcctgTransAttribute(), null, "acctgTransAttributes", null, 0, -1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_AcctgTransEntries(), this.getAcctgTransEntry(), null, "acctgTransEntries", null, 0, -1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_AcctgTransType(), this.getAcctgTransType(), null, "acctgTransType", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_FinAccountTrans(), theFinaccountPackage.getFinAccountTrans(), null, "finAccountTrans", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_FixedAsset(), theFixedassetPackage.getFixedAsset(), null, "fixedAsset", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_GlFiscalType(), this.getGlFiscalType(), null, "glFiscalType", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_GlJournal(), this.getGlJournal(), null, "glJournal", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_GroupStatus(), theStatusPackage.getStatusItem(), null, "groupStatus", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_InventoryItem(), theInventoryPackage.getInventoryItem(), null, "inventoryItem", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_Invoice(), theInvoicePackage.getInvoice(), null, "invoice", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_IsPosted(), ecorePackage.getEBoolean(), "isPosted", null, 1, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_Party(), thePartyPackage_1.getParty(), null, "party", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_Payment(), thePaymentPackage.getPayment(), null, "payment", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_PhysicalInventory(), theInventoryPackage.getPhysicalInventory(), null, "physicalInventory", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_PostedDate(), ecorePackage.getEDate(), "postedDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_Receipt(), theReceiptPackage.getShipmentReceipt(), null, "receipt", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_ScheduledPostingDate(), ecorePackage.getEDate(), "scheduledPostingDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_Shipment(), theShipment_Package.getShipment(), null, "shipment", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_TheirAcctgTransId(), ecorePackage.getEString(), "theirAcctgTransId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_TransactionDate(), ecorePackage.getEDate(), "transactionDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_VoucherDate(), ecorePackage.getEDate(), "voucherDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_VoucherRef(), ecorePackage.getEString(), "voucherRef", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTrans_WorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "workEffort", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransAttributeEClass, AcctgTransAttribute.class, "AcctgTransAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcctgTransAttribute_AcctgTrans(), this.getAcctgTrans(), null, "acctgTrans", null, 1, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransEntryEClass, AcctgTransEntry.class, "AcctgTransEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcctgTransEntry_AcctgTrans(), this.getAcctgTrans(), null, "acctgTrans", null, 1, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_AcctgTransEntrySeqId(), ecorePackage.getEString(), "acctgTransEntrySeqId", null, 1, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_AcctgTransEntryType(), this.getAcctgTransEntryType(), null, "acctgTransEntryType", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_DebitCreditFlag(), theAccountingPackage.getDebitCreditFlag(), "debitCreditFlag", null, 1, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_GlAccount(), this.getGlAccount(), null, "glAccount", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_GlAccountType(), this.getGlAccountType(), null, "glAccountType", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_InventoryItem(), theInventoryPackage.getInventoryItem(), null, "inventoryItem", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_IsSummary(), ecorePackage.getEBooleanObject(), "isSummary", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_OrigAmount(), ecorePackage.getEBigDecimal(), "origAmount", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_OrigCurrencyUom(), theUomPackage.getUom(), null, "origCurrencyUom", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_Party(), thePartyPackage_1.getParty(), null, "party", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_ReconcileStatus(), theStatusPackage.getStatusItem(), null, "reconcileStatus", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntry_SettlementTerm(), this.getSettlementTerm(), null, "settlementTerm", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_TaxId(), ecorePackage.getEString(), "taxId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_TheirPartyId(), ecorePackage.getEString(), "theirPartyId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_TheirProductId(), ecorePackage.getEString(), "theirProductId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_VoucherRef(), ecorePackage.getEString(), "voucherRef", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransEntryTypeEClass, AcctgTransEntryType.class, "AcctgTransEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransEntryType_AcctgTransEntryTypeId(), ecorePackage.getEString(), "acctgTransEntryTypeId", null, 1, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntryType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntryType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransEntryType_ParentType(), this.getAcctgTransEntryType(), null, "parentType", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransTypeEClass, AcctgTransType.class, "AcctgTransType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransType_AcctgTransTypeId(), ecorePackage.getEString(), "acctgTransTypeId", null, 1, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransType_AcctgTransTypeAttrs(), this.getAcctgTransTypeAttr(), null, "acctgTransTypeAttrs", null, 0, -1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcctgTransType_ParentType(), this.getAcctgTransType(), null, "parentType", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransTypeAttrEClass, AcctgTransTypeAttr.class, "AcctgTransTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcctgTransTypeAttr_AcctgTransType(), this.getAcctgTransType(), null, "acctgTransType", null, 1, 1, AcctgTransTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, AcctgTransTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountEClass, GlAccount.class, "GlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccount_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 1, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_AccountCode(), ecorePackage.getEString(), "accountCode", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_AccountName(), ecorePackage.getEString(), "accountName", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlAccountCategoryMembers(), this.getGlAccountCategoryMember(), null, "glAccountCategoryMembers", null, 0, -1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlAccountClass(), this.getGlAccountClass(), null, "glAccountClass", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlAccountGroupMembers(), this.getGlAccountGroupMember(), null, "glAccountGroupMembers", null, 0, -1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlAccountOrganizations(), this.getGlAccountOrganization(), null, "glAccountOrganizations", null, 0, -1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlAccountType(), this.getGlAccountType(), null, "glAccountType", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlBudgetXrefs(), this.getGlBudgetXref(), null, "glBudgetXrefs", null, 0, -1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlResourceType(), this.getGlResourceType(), null, "glResourceType", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_GlXbrlClass(), this.getGlXbrlClass(), null, "glXbrlClass", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccount_ParentGlAccount(), this.getGlAccount(), null, "parentGlAccount", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountCategoryEClass, GlAccountCategory.class, "GlAccountCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountCategory_GlAccountCategoryId(), ecorePackage.getEString(), "glAccountCategoryId", null, 1, 1, GlAccountCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountCategory_GlAccountCategoryType(), this.getGlAccountCategoryType(), null, "glAccountCategoryType", null, 0, 1, GlAccountCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountCategoryMemberEClass, GlAccountCategoryMember.class, "GlAccountCategoryMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlAccountCategoryMember_GlAccount(), this.getGlAccount(), null, "glAccount", null, 1, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountCategoryMember_GlAccountCategory(), this.getGlAccountCategory(), null, "glAccountCategory", null, 1, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_AmountPercentage(), ecorePackage.getEBigDecimal(), "amountPercentage", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountCategoryTypeEClass, GlAccountCategoryType.class, "GlAccountCategoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountCategoryType_GlAccountCategoryTypeId(), ecorePackage.getEString(), "glAccountCategoryTypeId", null, 1, 1, GlAccountCategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountCategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountClassEClass, GlAccountClass.class, "GlAccountClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountClass_GlAccountClassId(), ecorePackage.getEString(), "glAccountClassId", null, 1, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_IsAssetClass(), ecorePackage.getEBooleanObject(), "isAssetClass", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountClass_ParentClass(), this.getGlAccountClass(), null, "parentClass", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountGroupEClass, GlAccountGroup.class, "GlAccountGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountGroup_GlAccountGroupId(), ecorePackage.getEString(), "glAccountGroupId", null, 1, 1, GlAccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountGroup_GlAccountGroupType(), this.getGlAccountGroupType(), null, "glAccountGroupType", null, 0, 1, GlAccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountGroupMemberEClass, GlAccountGroupMember.class, "GlAccountGroupMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlAccountGroupMember_GlAccount(), this.getGlAccount(), null, "glAccount", null, 1, 1, GlAccountGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountGroupMember_GlAccountGroupType(), this.getGlAccountGroupType(), null, "glAccountGroupType", null, 1, 1, GlAccountGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountGroupMember_GlAccountGroup(), this.getGlAccountGroup(), null, "glAccountGroup", null, 0, 1, GlAccountGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountGroupTypeEClass, GlAccountGroupType.class, "GlAccountGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountGroupType_GlAccountGroupTypeId(), ecorePackage.getEString(), "glAccountGroupTypeId", null, 1, 1, GlAccountGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroupType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountHistoryEClass, GlAccountHistory.class, "GlAccountHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlAccountHistory_GlAccount(), this.getGlAccount(), null, "glAccount", null, 1, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountHistory_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountHistory_CustomTimePeriod(), thePeriodPackage.getCustomTimePeriod(), null, "customTimePeriod", null, 1, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_EndingBalance(), ecorePackage.getEBigDecimal(), "endingBalance", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_OpeningBalance(), ecorePackage.getEBigDecimal(), "openingBalance", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_PostedCredits(), ecorePackage.getEBigDecimal(), "postedCredits", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_PostedDebits(), ecorePackage.getEBigDecimal(), "postedDebits", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountOrganizationEClass, GlAccountOrganization.class, "GlAccountOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlAccountOrganization_GlAccount(), this.getGlAccount(), null, "glAccount", null, 1, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountOrganization_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountOrganization_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountOrganization_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountOrganization_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountRoleEClass, GlAccountRole.class, "GlAccountRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlAccountRole_GlAccount(), this.getGlAccount(), null, "glAccount", null, 1, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountRole_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountTypeEClass, GlAccountType.class, "GlAccountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountType_GlAccountTypeId(), ecorePackage.getEString(), "glAccountTypeId", null, 1, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountType_GlAccountTypeDefaults(), this.getGlAccountTypeDefault(), null, "glAccountTypeDefaults", null, 0, -1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountType_ParentType(), this.getGlAccountType(), null, "parentType", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountTypeDefaultEClass, GlAccountTypeDefault.class, "GlAccountTypeDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlAccountTypeDefault_GlAccountType(), this.getGlAccountType(), null, "glAccountType", null, 1, 1, GlAccountTypeDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountTypeDefault_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, GlAccountTypeDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlAccountTypeDefault_GlAccount(), this.getGlAccount(), null, "glAccount", null, 0, 1, GlAccountTypeDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glBudgetXrefEClass, GlBudgetXref.class, "GlBudgetXref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlBudgetXref_GlAccount(), this.getGlAccount(), null, "glAccount", null, 1, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlBudgetXref_BudgetItemType(), theBudgetPackage.getBudgetItemType(), null, "budgetItemType", null, 1, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_AllocationPercentage(), ecorePackage.getEBigDecimal(), "allocationPercentage", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glFiscalTypeEClass, GlFiscalType.class, "GlFiscalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlFiscalType_GlFiscalTypeId(), ecorePackage.getEString(), "glFiscalTypeId", null, 1, 1, GlFiscalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlFiscalType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlFiscalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glJournalEClass, GlJournal.class, "GlJournal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlJournal_GlJournalId(), ecorePackage.getEString(), "glJournalId", null, 1, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_GlJournalName(), ecorePackage.getEString(), "glJournalName", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_IsPosted(), ecorePackage.getEBooleanObject(), "isPosted", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlJournal_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_PostedDate(), ecorePackage.getEDate(), "postedDate", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glReconciliationEClass, GlReconciliation.class, "GlReconciliation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlReconciliation_GlReconciliationId(), ecorePackage.getEString(), "glReconciliationId", null, 1, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlReconciliation_GlAccount(), this.getGlAccount(), null, "glAccount", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_GlReconciliationName(), ecorePackage.getEString(), "glReconciliationName", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_OpeningBalance(), ecorePackage.getEBigDecimal(), "openingBalance", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlReconciliation_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_ReconciledBalance(), ecorePackage.getEBigDecimal(), "reconciledBalance", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_ReconciledDate(), ecorePackage.getEDate(), "reconciledDate", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlReconciliation_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glReconciliationEntryEClass, GlReconciliationEntry.class, "GlReconciliationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlReconciliationEntry_GlReconciliation(), this.getGlReconciliation(), null, "glReconciliation", null, 1, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlReconciliationEntry_AcctgTrans(), this.getAcctgTrans(), null, "acctgTrans", null, 1, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliationEntry_AcctgTransEntrySeqId(), ecorePackage.getEString(), "acctgTransEntrySeqId", null, 1, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliationEntry_ReconciledAmount(), ecorePackage.getEBigDecimal(), "reconciledAmount", null, 0, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glResourceTypeEClass, GlResourceType.class, "GlResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlResourceType_GlResourceTypeId(), ecorePackage.getEString(), "glResourceTypeId", null, 1, 1, GlResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlResourceType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glXbrlClassEClass, GlXbrlClass.class, "GlXbrlClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlXbrlClass_GlXbrlClassId(), ecorePackage.getEString(), "glXbrlClassId", null, 1, 1, GlXbrlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlXbrlClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlXbrlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyAcctgPreferenceEClass, PartyAcctgPreference.class, "PartyAcctgPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyAcctgPreference_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_BaseCurrencyUom(), theUomPackage.getUom(), null, "baseCurrencyUom", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_CogsMethod(), theEnumPackage.getEnumeration(), null, "cogsMethod", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_EnableAccounting(), ecorePackage.getEBooleanObject(), "enableAccounting", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_ErrorGlJournal(), this.getGlJournal(), null, "errorGlJournal", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_FiscalYearStartDay(), ecorePackage.getELong(), "fiscalYearStartDay", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_FiscalYearStartMonth(), ecorePackage.getELong(), "fiscalYearStartMonth", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_InvoiceIdPrefix(), ecorePackage.getEString(), "invoiceIdPrefix", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_InvoiceSeqCustMeth(), theMethodPackage.getCustomMethod(), null, "invoiceSeqCustMeth", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastInvoiceNumber(), ecorePackage.getELong(), "lastInvoiceNumber", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastInvoiceRestartDate(), ecorePackage.getEDate(), "lastInvoiceRestartDate", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastOrderNumber(), ecorePackage.getELong(), "lastOrderNumber", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastQuoteNumber(), ecorePackage.getELong(), "lastQuoteNumber", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_OldInvoiceSequenceEnum(), theEnumPackage.getEnumeration(), null, "oldInvoiceSequenceEnum", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_OldOrderSequenceEnum(), theEnumPackage.getEnumeration(), null, "oldOrderSequenceEnum", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_OldQuoteSequenceEnum(), theEnumPackage.getEnumeration(), null, "oldQuoteSequenceEnum", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_OrderIdPrefix(), ecorePackage.getEString(), "orderIdPrefix", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_OrderSeqCustMeth(), theMethodPackage.getCustomMethod(), null, "orderSeqCustMeth", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_QuoteIdPrefix(), ecorePackage.getEString(), "quoteIdPrefix", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_QuoteSeqCustMeth(), theMethodPackage.getCustomMethod(), null, "quoteSeqCustMeth", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_RefundPaymentMethod(), thePaymentPackage.getPaymentMethod(), null, "refundPaymentMethod", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyAcctgPreference_TaxForm(), theEnumPackage.getEnumeration(), null, "taxForm", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_UseInvoiceIdForReturns(), ecorePackage.getEBooleanObject(), "useInvoiceIdForReturns", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyGlAccountEClass, PartyGlAccount.class, "PartyGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyGlAccount_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyGlAccount_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyGlAccount_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyGlAccount_GlAccountType(), this.getGlAccountType(), null, "glAccountType", null, 1, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyGlAccount_GlAccount(), this.getGlAccount(), null, "glAccount", null, 0, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyPrefDocTypeTplEClass, PartyPrefDocTypeTpl.class, "PartyPrefDocTypeTpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId(), ecorePackage.getEString(), "partyPrefDocTypeTplId", null, 1, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_CustomScreenId(), ecorePackage.getEString(), "customScreenId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyPrefDocTypeTpl_InvoiceType(), theInvoicePackage.getInvoiceType(), null, "invoiceType", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyPrefDocTypeTpl_OrderType(), theOrderPackage.getOrderType(), null, "orderType", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyPrefDocTypeTpl_Party(), thePartyPackage_1.getParty(), null, "party", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyPrefDocTypeTpl_QuoteType(), theQuotePackage.getQuoteType(), null, "quoteType", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productAverageCostEClass, ProductAverageCost.class, "ProductAverageCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductAverageCost_ProductAverageCostType(), this.getProductAverageCostType(), null, "productAverageCostType", null, 1, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAverageCost_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAverageCost_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAverageCost_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 1, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_AverageCost(), ecorePackage.getEBigDecimal(), "averageCost", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productAverageCostTypeEClass, ProductAverageCostType.class, "ProductAverageCostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAverageCostType_ProductAverageCostTypeId(), ecorePackage.getEString(), "productAverageCostTypeId", null, 1, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCostType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCostType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAverageCostType_ParentType(), this.getProductAverageCostType(), null, "parentType", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settlementTermEClass, SettlementTerm.class, "SettlementTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSettlementTerm_SettlementTermId(), ecorePackage.getEString(), "settlementTermId", null, 1, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementTerm_TermName(), ecorePackage.getEString(), "termName", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementTerm_TermValue(), ecorePackage.getELong(), "termValue", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementTerm_UomId(), ecorePackage.getEString(), "uomId", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varianceReasonGlAccountEClass, VarianceReasonGlAccount.class, "VarianceReasonGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarianceReasonGlAccount_VarianceReason(), theInventoryPackage.getVarianceReason(), null, "varianceReason", null, 1, 1, VarianceReasonGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarianceReasonGlAccount_OrganizationParty(), thePartyPackage_1.getParty(), null, "organizationParty", null, 1, 1, VarianceReasonGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarianceReasonGlAccount_GlAccount(), this.getGlAccount(), null, "glAccount", null, 0, 1, VarianceReasonGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	 * Initializes the annotations for <b>mimo-ent-frame</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentframeAnnotations() {
		String source = "mimo-ent-frame";
		addAnnotation
		  (acctgTransEClass,
		   source,
		   new String[] {
			   "title", "Accounting Transaction",
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransAttributeEClass,
		   source,
		   new String[] {
			   "title", "Accounting Transaction Attribute"
		   });
		addAnnotation
		  (acctgTransEntryEClass,
		   source,
		   new String[] {
			   "title", "Transaction Entry",
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransEntryTypeEClass,
		   source,
		   new String[] {
			   "title", "Accounting Transaction Entry Type",
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransTypeEClass,
		   source,
		   new String[] {
			   "title", "Accounting Transaction Type",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Accounting Transaction Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountCategoryEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Category",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountCategoryMemberEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Category Member"
		   });
		addAnnotation
		  (glAccountCategoryTypeEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Category Type",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountClassEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Class",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountGroupEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Group",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountGroupMemberEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Group Member"
		   });
		addAnnotation
		  (glAccountGroupTypeEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Group Type",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountTypeEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Account Type",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountTypeDefaultEClass,
		   source,
		   new String[] {
			   "title", "GL Account Organization"
		   });
		addAnnotation
		  (glBudgetXrefEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Budget Cross Reference"
		   });
		addAnnotation
		  (glFiscalTypeEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Fiscal",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (glJournalEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Journal"
		   });
		addAnnotation
		  (glReconciliationEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Reconciliation",
			   "formula", "description"
		   });
		addAnnotation
		  (glReconciliationEntryEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Reconciliation Entry"
		   });
		addAnnotation
		  (glResourceTypeEClass,
		   source,
		   new String[] {
			   "title", "General Ledger Resource",
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (glXbrlClassEClass,
		   source,
		   new String[] {
			   "title", "General Ledger XBRL Class",
			   "formula", "description"
		   });
		addAnnotation
		  (partyAcctgPreferenceEClass,
		   source,
		   new String[] {
			   "title", "Party (organization) accounting preferences"
		   });
		addAnnotation
		  (partyPrefDocTypeTplEClass,
		   source,
		   new String[] {
			   "title", "Party (organization) preferences for document type template"
		   });
		addAnnotation
		  (productAverageCostEClass,
		   source,
		   new String[] {
			   "help", "Running tally of a product\'s average cost in a particular company and facility",
			   "title", "Running tally of average cost"
		   });
		addAnnotation
		  (productAverageCostTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (varianceReasonGlAccountEClass,
		   source,
		   new String[] {
			   "title", "Defines GL Accounts for Inventory Variance Reasons"
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
		  (getAcctgTrans_AcctgTransId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTrans_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAcctgTrans_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAcctgTrans_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAcctgTrans_TheirAcctgTransId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAcctgTrans_VoucherRef(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAcctgTransAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAcctgTransAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAcctgTransAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTransEntrySeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getAcctgTransEntry_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAcctgTransEntry_GroupId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_OrganizationPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_OrigAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getAcctgTransEntry_ProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_TaxId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_TheirPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_TheirProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntry_VoucherRef(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAcctgTransEntryType_AcctgTransEntryTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransEntryType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAcctgTransType_AcctgTransTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAcctgTransType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccount_GlAccountId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccount_AccountCode(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getGlAccount_AccountName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getGlAccount_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccount_ExternalId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccount_ProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountCategory_GlAccountCategoryId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountCategory_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_AmountPercentage(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getGlAccountCategoryType_GlAccountCategoryTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountCategoryType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccountClass_GlAccountClassId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountClass_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccountClass_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getGlAccountGroup_GlAccountGroupId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountGroup_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccountGroupType_GlAccountGroupTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountGroupType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlAccountHistory_EndingBalance(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlAccountHistory_OpeningBalance(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlAccountHistory_PostedCredits(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlAccountHistory_PostedDebits(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlAccountType_GlAccountTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlAccountType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlBudgetXref_AllocationPercentage(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getGlFiscalType_GlFiscalTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlFiscalType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlJournal_GlJournalId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlJournal_GlJournalName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getGlReconciliation_GlReconciliationId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlReconciliation_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGlReconciliation_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlReconciliation_GlReconciliationName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getGlReconciliation_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGlReconciliation_OpeningBalance(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlReconciliation_ReconciledBalance(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlReconciliationEntry_AcctgTransEntrySeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlReconciliationEntry_ReconciledAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGlResourceType_GlResourceTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlResourceType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getGlXbrlClass_GlXbrlClassId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGlXbrlClass_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyAcctgPreference_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyAcctgPreference_FiscalYearStartDay(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyAcctgPreference_FiscalYearStartMonth(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyAcctgPreference_InvoiceIdPrefix(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getPartyAcctgPreference_LastInvoiceNumber(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyAcctgPreference_LastOrderNumber(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyAcctgPreference_LastQuoteNumber(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyAcctgPreference_OrderIdPrefix(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getPartyAcctgPreference_QuoteIdPrefix(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_CustomScreenId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductAverageCost_AverageCost(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getProductAverageCostType_ProductAverageCostTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductAverageCostType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getSettlementTerm_SettlementTermId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSettlementTerm_TermName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getSettlementTerm_TermValue(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSettlementTerm_UomId(),
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
		  (getAcctgTransAttribute_AcctgTrans(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTrans(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTransEntrySeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_AcctgTransType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccount_ExternalId(),
		   source,
		   new String[] {
			   "help", "id of the account in an external system where the accounts are imported/exported"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_GlAccount(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_GlAccountCategory(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccount(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccountGroupType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountHistory_GlAccount(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountHistory_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountHistory_CustomTimePeriod(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountOrganization_GlAccount(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountOrganization_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_GlAccount(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountTypeDefault_GlAccountType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountTypeDefault_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlBudgetXref_GlAccount(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlBudgetXref_BudgetItemType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlBudgetXref_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlReconciliationEntry_GlReconciliation(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlReconciliationEntry_AcctgTrans(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlReconciliationEntry_AcctgTransEntrySeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyAcctgPreference_ErrorGlJournal(),
		   source,
		   new String[] {
			   "help", "Journal to which all the failed automatic transaction are assigned.\n                If the error journal is set, if the GL posting fails for some reason the triggering operation (finalizing an invoice or payment or whatever) would NOT roll back, instead the partial GL post would be placed into the error journal."
		   });
		addAnnotation
		  (getPartyGlAccount_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_GlAccountType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_ProductAverageCostType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_OrganizationParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_Facility(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_VarianceReason(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_OrganizationParty(),
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
		  (getGlAccount_GlAccountCategoryMembers(),
		   source,
		   new String[] {
			   "fromDate", "*NOW"
		   });
		addAnnotation
		  (getGlAccount_GlBudgetXrefs(),
		   source,
		   new String[] {
			   "fromDate", "*NOW"
		   });
	}

} //LedgerPackageImpl
