/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party.impl;

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
import org.abchip.mimo.biz.model.party.contact.ContactPackage;
import org.abchip.mimo.biz.model.party.contact.impl.ContactPackageImpl;
import org.abchip.mimo.biz.model.party.need.NeedPackage;
import org.abchip.mimo.biz.model.party.need.impl.NeedPackageImpl;
import org.abchip.mimo.biz.model.party.party.AddressMatchMap;
import org.abchip.mimo.biz.model.party.party.Affiliate;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyAttribute;
import org.abchip.mimo.biz.model.party.party.PartyCarrierAccount;
import org.abchip.mimo.biz.model.party.party.PartyClassification;
import org.abchip.mimo.biz.model.party.party.PartyClassificationGroup;
import org.abchip.mimo.biz.model.party.party.PartyClassificationType;
import org.abchip.mimo.biz.model.party.party.PartyContent;
import org.abchip.mimo.biz.model.party.party.PartyContentType;
import org.abchip.mimo.biz.model.party.party.PartyDataSource;
import org.abchip.mimo.biz.model.party.party.PartyFactory;
import org.abchip.mimo.biz.model.party.party.PartyGeoPoint;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.PartyIcsAvsOverride;
import org.abchip.mimo.biz.model.party.party.PartyIdentification;
import org.abchip.mimo.biz.model.party.party.PartyIdentificationType;
import org.abchip.mimo.biz.model.party.party.PartyInvitation;
import org.abchip.mimo.biz.model.party.party.PartyInvitationGroupAssoc;
import org.abchip.mimo.biz.model.party.party.PartyInvitationRoleAssoc;
import org.abchip.mimo.biz.model.party.party.PartyNameHistory;
import org.abchip.mimo.biz.model.party.party.PartyNote;
import org.abchip.mimo.biz.model.party.party.PartyPackage;
import org.abchip.mimo.biz.model.party.party.PartyProfileDefault;
import org.abchip.mimo.biz.model.party.party.PartyRelationship;
import org.abchip.mimo.biz.model.party.party.PartyRelationshipType;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.PartyStatus;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.PartyTypeAttr;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.biz.model.party.party.PriorityType;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.party.party.RoleTypeAttr;
import org.abchip.mimo.biz.model.party.party.Vendor;
import org.abchip.mimo.biz.model.party.party.WebSiteRole;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyPackageImpl extends EPackageImpl implements PartyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressMatchMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affiliateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyCarrierAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyClassificationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyClassificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyGeoPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIcsAvsOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInvitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInvitationGroupAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInvitationRoleAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyNameHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyProfileDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSiteRoleEClass = null;

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartyPackageImpl() {
		super(eNS_URI, PartyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PartyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartyPackage init() {
		if (isInited) return (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPartyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PartyPackageImpl thePartyPackage = registeredPartyPackage instanceof PartyPackageImpl ? (PartyPackageImpl)registeredPartyPackage : new PartyPackageImpl();

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
		org.abchip.mimo.biz.model.party.impl.PartyPackageImpl thePartyPackage_1 = (org.abchip.mimo.biz.model.party.impl.PartyPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.model.party.impl.PartyPackageImpl ? registeredPackage : org.abchip.mimo.biz.model.party.PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		AgreementPackageImpl theAgreementPackage = (AgreementPackageImpl)(registeredPackage instanceof AgreementPackageImpl ? registeredPackage : AgreementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);
		ContactPackageImpl theContactPackage_1 = (ContactPackageImpl)(registeredPackage instanceof ContactPackageImpl ? registeredPackage : ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NeedPackage.eNS_URI);
		NeedPackageImpl theNeedPackage = (NeedPackageImpl)(registeredPackage instanceof NeedPackageImpl ? registeredPackage : NeedPackage.eINSTANCE);
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
		thePartyPackage.createPackageContents();
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
		thePartyPackage_1.createPackageContents();
		theAgreementPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theContactPackage_1.createPackageContents();
		theNeedPackage.createPackageContents();
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
		thePartyPackage.initializePackageContents();
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
		thePartyPackage_1.initializePackageContents();
		theAgreementPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theContactPackage_1.initializePackageContents();
		theNeedPackage.initializePackageContents();
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
		thePartyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartyPackage.eNS_URI, thePartyPackage);
		return thePartyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressMatchMap() {
		return addressMatchMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressMatchMap_MapKey() {
		return (EAttribute)addressMatchMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressMatchMap_MapValue() {
		return (EAttribute)addressMatchMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressMatchMap_SequenceNum() {
		return (EAttribute)addressMatchMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffiliate() {
		return affiliateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_PartyId() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_AffiliateDescription() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_AffiliateName() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_DateTimeApproved() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_DateTimeCreated() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_SitePageViews() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_SiteType() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_SiteVisitors() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_YearEstablished() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyId() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_CreatedByUserLogin() {
		return (EReference)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_CreatedDate() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_DataSource() {
		return (EReference)partyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Description() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_EmplLeaves() {
		return (EReference)partyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_ExternalId() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_IsUnread() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_LastModifiedByUserLogin() {
		return (EReference)partyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_LastModifiedDate() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyAttributes() {
		return (EReference)partyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyCarrierAccounts() {
		return (EReference)partyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyClassifications() {
		return (EReference)partyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyContactMechs() {
		return (EReference)partyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyDataSources() {
		return (EReference)partyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyGeoPoints() {
		return (EReference)partyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyIdentifications() {
		return (EReference)partyEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyNameHistories() {
		return (EReference)partyEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyNotes() {
		return (EReference)partyEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyProfileDefaults() {
		return (EReference)partyEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyQuals() {
		return (EReference)partyEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyRates() {
		return (EReference)partyEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyRoles() {
		return (EReference)partyEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartySkills() {
		return (EReference)partyEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyType() {
		return (EReference)partyEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PerformanceNotes() {
		return (EReference)partyEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PersonTrainings() {
		return (EReference)partyEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PreferredCurrencyUom() {
		return (EReference)partyEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Status() {
		return (EReference)partyEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_SupplierProductFeatures() {
		return (EReference)partyEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyAttribute() {
		return partyAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyAttribute_Party() {
		return (EReference)partyAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_AttrName() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_AttrDescription() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_AttrValue() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyCarrierAccount() {
		return partyCarrierAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyCarrierAccount_Party() {
		return (EReference)partyCarrierAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyCarrierAccount_CarrierParty() {
		return (EReference)partyCarrierAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_FromDate() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_AccountNumber() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_ThruDate() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyClassification() {
		return partyClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassification_Party() {
		return (EReference)partyClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassification_PartyClassificationGroup() {
		return (EReference)partyClassificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassification_FromDate() {
		return (EAttribute)partyClassificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassification_ThruDate() {
		return (EAttribute)partyClassificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyClassificationGroup() {
		return partyClassificationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationGroup_PartyClassificationGroupId() {
		return (EAttribute)partyClassificationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationGroup_Description() {
		return (EAttribute)partyClassificationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassificationGroup_ParentGroup() {
		return (EReference)partyClassificationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassificationGroup_PartyClassificationType() {
		return (EReference)partyClassificationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyClassificationType() {
		return partyClassificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationType_PartyClassificationTypeId() {
		return (EAttribute)partyClassificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationType_Description() {
		return (EAttribute)partyClassificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationType_HasTable() {
		return (EAttribute)partyClassificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassificationType_ParentType() {
		return (EReference)partyClassificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyContent() {
		return partyContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContent_Party() {
		return (EReference)partyContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContent_Content() {
		return (EReference)partyContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContent_PartyContentType() {
		return (EReference)partyContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContent_FromDate() {
		return (EAttribute)partyContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContent_ThruDate() {
		return (EAttribute)partyContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyContentType() {
		return partyContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContentType_PartyContentTypeId() {
		return (EAttribute)partyContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContentType_Description() {
		return (EAttribute)partyContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContentType_ParentType() {
		return (EReference)partyContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyDataSource() {
		return partyDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyDataSource_Party() {
		return (EReference)partyDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyDataSource_DataSource() {
		return (EReference)partyDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_FromDate() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_Comments() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_IsCreate() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_VisitId() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyGeoPoint() {
		return partyGeoPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGeoPoint_Party() {
		return (EReference)partyGeoPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGeoPoint_GeoPoint() {
		return (EReference)partyGeoPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGeoPoint_FromDate() {
		return (EAttribute)partyGeoPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGeoPoint_ThruDate() {
		return (EAttribute)partyGeoPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyGroup() {
		return partyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_AnnualRevenue() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_Comments() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_GroupName() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_GroupNameLocal() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_LogoImageUrl() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_NumEmployees() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_OfficeSiteName() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_TickerSymbol() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyIcsAvsOverride() {
		return partyIcsAvsOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIcsAvsOverride_PartyId() {
		return (EAttribute)partyIcsAvsOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIcsAvsOverride_AvsDeclineString() {
		return (EAttribute)partyIcsAvsOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyIdentification() {
		return partyIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyIdentification_PartyIdentificationType() {
		return (EReference)partyIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyIdentification_Party() {
		return (EReference)partyIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentification_IdValue() {
		return (EAttribute)partyIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyIdentificationType() {
		return partyIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentificationType_PartyIdentificationTypeId() {
		return (EAttribute)partyIdentificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentificationType_Description() {
		return (EAttribute)partyIdentificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentificationType_HasTable() {
		return (EAttribute)partyIdentificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyIdentificationType_ParentType() {
		return (EReference)partyIdentificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyInvitation() {
		return partyInvitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_PartyInvitationId() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_EmailAddress() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_LastInviteDate() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_PartyId() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitation_PartyIdFrom() {
		return (EReference)partyInvitationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitation_PartyInvitationGroupAssocs() {
		return (EReference)partyInvitationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitation_PartyInvitationRoleAssocs() {
		return (EReference)partyInvitationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitation_Status() {
		return (EReference)partyInvitationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_ToName() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyInvitationGroupAssoc() {
		return partyInvitationGroupAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitationGroupAssoc_PartyIdTo() {
		return (EReference)partyInvitationGroupAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitationGroupAssoc_PartyInvitation() {
		return (EReference)partyInvitationGroupAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyInvitationRoleAssoc() {
		return partyInvitationRoleAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitationRoleAssoc_RoleType() {
		return (EReference)partyInvitationRoleAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitationRoleAssoc_PartyInvitation() {
		return (EReference)partyInvitationRoleAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyNameHistory() {
		return partyNameHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyNameHistory_Party() {
		return (EReference)partyNameHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_ChangeDate() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_FirstName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_GroupName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_LastName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_MiddleName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_PersonalTitle() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_Suffix() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyNote() {
		return partyNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyNote_Party() {
		return (EReference)partyNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyProfileDefault() {
		return partyProfileDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyProfileDefault_Party() {
		return (EReference)partyProfileDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyProfileDefault_ProductStore() {
		return (EReference)partyProfileDefaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultBillAddr() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultPayMeth() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultShipAddr() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultShipMeth() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyRelationship() {
		return partyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PartyIdFrom() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PartyIdTo() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_RoleTypeIdFrom() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_RoleTypeIdTo() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_FromDate() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_Comments() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PartyRelationshipType() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_PermissionsEnumId() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_PositionTitle() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PriorityType() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_RelationshipName() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_SecurityGroup() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_Status() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_ThruDate() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyRelationshipType() {
		return partyRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_PartyRelationshipTypeId() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_Description() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_HasTable() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationshipType_ParentType() {
		return (EReference)partyRelationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_PartyRelationshipName() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationshipType_RoleTypeIdValidFrom() {
		return (EReference)partyRelationshipTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationshipType_RoleTypeIdValidTo() {
		return (EReference)partyRelationshipTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyRole() {
		return partyRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRole_Party() {
		return (EReference)partyRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRole_RoleType() {
		return (EReference)partyRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyStatus() {
		return partyStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyStatus_Status() {
		return (EReference)partyStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyStatus_Party() {
		return (EReference)partyStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyStatus_StatusDate() {
		return (EAttribute)partyStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyStatus_ChangeByUserLogin() {
		return (EReference)partyStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyType() {
		return partyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_PartyTypeId() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_Description() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_HasTable() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyType_ParentType() {
		return (EReference)partyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyType_PartyTypeAttrs() {
		return (EReference)partyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyTypeAttr() {
		return partyTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyTypeAttr_PartyType() {
		return (EReference)partyTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyTypeAttr_AttrName() {
		return (EAttribute)partyTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyTypeAttr_Description() {
		return (EAttribute)partyTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_BirthDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_CardId() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Comments() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_DeceasedDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_EmploymentStatusEnum() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_ExistingCustomer() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_FirstNameLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Height() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_LastNameLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MaritalStatus() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MemberId() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MiddleName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MiddleNameLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MonthsWithEmployer() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MothersMaidenName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Nickname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Occupation() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_OtherLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PassportExpireDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PassportNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PersonalTitle() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_ResidenceStatusEnum() {
		return (EReference)personEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Salutation() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_SocialSecurityNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Suffix() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_TotalYearsWorkExperience() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Weight() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_YearsWithEmployer() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPriorityType() {
		return priorityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPriorityType_PriorityTypeId() {
		return (EAttribute)priorityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPriorityType_Description() {
		return (EAttribute)priorityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_RoleTypeId() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_Description() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_HasTable() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleType_ParentType() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleType_RoleTypeAttrs() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleType_ValidContactMechRoles() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleTypeAttr() {
		return roleTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleTypeAttr_RoleType() {
		return (EReference)roleTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleTypeAttr_AttrName() {
		return (EAttribute)roleTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleTypeAttr_Description() {
		return (EAttribute)roleTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendor() {
		return vendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_PartyId() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestCompanyName() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestCompanyTitle() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestLogoUrl() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestPolicies() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebSiteRole() {
		return webSiteRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebSiteRole_Party() {
		return (EReference)webSiteRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebSiteRole_RoleType() {
		return (EReference)webSiteRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebSiteRole_WebSite() {
		return (EReference)webSiteRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_FromDate() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_SequenceNum() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_ThruDate() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyFactory getPartyFactory() {
		return (PartyFactory)getEFactoryInstance();
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
		addressMatchMapEClass = createEClass(ADDRESS_MATCH_MAP);
		createEAttribute(addressMatchMapEClass, ADDRESS_MATCH_MAP__MAP_KEY);
		createEAttribute(addressMatchMapEClass, ADDRESS_MATCH_MAP__MAP_VALUE);
		createEAttribute(addressMatchMapEClass, ADDRESS_MATCH_MAP__SEQUENCE_NUM);

		affiliateEClass = createEClass(AFFILIATE);
		createEAttribute(affiliateEClass, AFFILIATE__PARTY_ID);
		createEAttribute(affiliateEClass, AFFILIATE__AFFILIATE_DESCRIPTION);
		createEAttribute(affiliateEClass, AFFILIATE__AFFILIATE_NAME);
		createEAttribute(affiliateEClass, AFFILIATE__DATE_TIME_APPROVED);
		createEAttribute(affiliateEClass, AFFILIATE__DATE_TIME_CREATED);
		createEAttribute(affiliateEClass, AFFILIATE__SITE_PAGE_VIEWS);
		createEAttribute(affiliateEClass, AFFILIATE__SITE_TYPE);
		createEAttribute(affiliateEClass, AFFILIATE__SITE_VISITORS);
		createEAttribute(affiliateEClass, AFFILIATE__YEAR_ESTABLISHED);

		partyEClass = createEClass(PARTY);
		createEAttribute(partyEClass, PARTY__PARTY_ID);
		createEReference(partyEClass, PARTY__CREATED_BY_USER_LOGIN);
		createEAttribute(partyEClass, PARTY__CREATED_DATE);
		createEReference(partyEClass, PARTY__DATA_SOURCE);
		createEAttribute(partyEClass, PARTY__DESCRIPTION);
		createEReference(partyEClass, PARTY__EMPL_LEAVES);
		createEAttribute(partyEClass, PARTY__EXTERNAL_ID);
		createEAttribute(partyEClass, PARTY__IS_UNREAD);
		createEReference(partyEClass, PARTY__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(partyEClass, PARTY__LAST_MODIFIED_DATE);
		createEReference(partyEClass, PARTY__PARTY_ATTRIBUTES);
		createEReference(partyEClass, PARTY__PARTY_CARRIER_ACCOUNTS);
		createEReference(partyEClass, PARTY__PARTY_CLASSIFICATIONS);
		createEReference(partyEClass, PARTY__PARTY_CONTACT_MECHS);
		createEReference(partyEClass, PARTY__PARTY_DATA_SOURCES);
		createEReference(partyEClass, PARTY__PARTY_GEO_POINTS);
		createEReference(partyEClass, PARTY__PARTY_IDENTIFICATIONS);
		createEReference(partyEClass, PARTY__PARTY_NAME_HISTORIES);
		createEReference(partyEClass, PARTY__PARTY_NOTES);
		createEReference(partyEClass, PARTY__PARTY_PROFILE_DEFAULTS);
		createEReference(partyEClass, PARTY__PARTY_QUALS);
		createEReference(partyEClass, PARTY__PARTY_RATES);
		createEReference(partyEClass, PARTY__PARTY_ROLES);
		createEReference(partyEClass, PARTY__PARTY_SKILLS);
		createEReference(partyEClass, PARTY__PARTY_TYPE);
		createEReference(partyEClass, PARTY__PERFORMANCE_NOTES);
		createEReference(partyEClass, PARTY__PERSON_TRAININGS);
		createEReference(partyEClass, PARTY__PREFERRED_CURRENCY_UOM);
		createEReference(partyEClass, PARTY__STATUS);
		createEReference(partyEClass, PARTY__SUPPLIER_PRODUCT_FEATURES);

		partyAttributeEClass = createEClass(PARTY_ATTRIBUTE);
		createEReference(partyAttributeEClass, PARTY_ATTRIBUTE__PARTY);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__ATTR_NAME);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__ATTR_VALUE);

		partyCarrierAccountEClass = createEClass(PARTY_CARRIER_ACCOUNT);
		createEReference(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__PARTY);
		createEReference(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__CARRIER_PARTY);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__FROM_DATE);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__ACCOUNT_NUMBER);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__THRU_DATE);

		partyClassificationEClass = createEClass(PARTY_CLASSIFICATION);
		createEReference(partyClassificationEClass, PARTY_CLASSIFICATION__PARTY);
		createEReference(partyClassificationEClass, PARTY_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP);
		createEAttribute(partyClassificationEClass, PARTY_CLASSIFICATION__FROM_DATE);
		createEAttribute(partyClassificationEClass, PARTY_CLASSIFICATION__THRU_DATE);

		partyClassificationGroupEClass = createEClass(PARTY_CLASSIFICATION_GROUP);
		createEAttribute(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID);
		createEAttribute(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__DESCRIPTION);
		createEReference(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__PARENT_GROUP);
		createEReference(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE);

		partyClassificationTypeEClass = createEClass(PARTY_CLASSIFICATION_TYPE);
		createEAttribute(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__PARTY_CLASSIFICATION_TYPE_ID);
		createEAttribute(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__DESCRIPTION);
		createEAttribute(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__HAS_TABLE);
		createEReference(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__PARENT_TYPE);

		partyContentEClass = createEClass(PARTY_CONTENT);
		createEReference(partyContentEClass, PARTY_CONTENT__PARTY);
		createEReference(partyContentEClass, PARTY_CONTENT__CONTENT);
		createEReference(partyContentEClass, PARTY_CONTENT__PARTY_CONTENT_TYPE);
		createEAttribute(partyContentEClass, PARTY_CONTENT__FROM_DATE);
		createEAttribute(partyContentEClass, PARTY_CONTENT__THRU_DATE);

		partyContentTypeEClass = createEClass(PARTY_CONTENT_TYPE);
		createEAttribute(partyContentTypeEClass, PARTY_CONTENT_TYPE__PARTY_CONTENT_TYPE_ID);
		createEAttribute(partyContentTypeEClass, PARTY_CONTENT_TYPE__DESCRIPTION);
		createEReference(partyContentTypeEClass, PARTY_CONTENT_TYPE__PARENT_TYPE);

		partyDataSourceEClass = createEClass(PARTY_DATA_SOURCE);
		createEReference(partyDataSourceEClass, PARTY_DATA_SOURCE__PARTY);
		createEReference(partyDataSourceEClass, PARTY_DATA_SOURCE__DATA_SOURCE);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__FROM_DATE);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__COMMENTS);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__IS_CREATE);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__VISIT_ID);

		partyGeoPointEClass = createEClass(PARTY_GEO_POINT);
		createEReference(partyGeoPointEClass, PARTY_GEO_POINT__PARTY);
		createEReference(partyGeoPointEClass, PARTY_GEO_POINT__GEO_POINT);
		createEAttribute(partyGeoPointEClass, PARTY_GEO_POINT__FROM_DATE);
		createEAttribute(partyGeoPointEClass, PARTY_GEO_POINT__THRU_DATE);

		partyGroupEClass = createEClass(PARTY_GROUP);
		createEAttribute(partyGroupEClass, PARTY_GROUP__ANNUAL_REVENUE);
		createEAttribute(partyGroupEClass, PARTY_GROUP__COMMENTS);
		createEAttribute(partyGroupEClass, PARTY_GROUP__GROUP_NAME);
		createEAttribute(partyGroupEClass, PARTY_GROUP__GROUP_NAME_LOCAL);
		createEAttribute(partyGroupEClass, PARTY_GROUP__LOGO_IMAGE_URL);
		createEAttribute(partyGroupEClass, PARTY_GROUP__NUM_EMPLOYEES);
		createEAttribute(partyGroupEClass, PARTY_GROUP__OFFICE_SITE_NAME);
		createEAttribute(partyGroupEClass, PARTY_GROUP__TICKER_SYMBOL);

		partyIcsAvsOverrideEClass = createEClass(PARTY_ICS_AVS_OVERRIDE);
		createEAttribute(partyIcsAvsOverrideEClass, PARTY_ICS_AVS_OVERRIDE__PARTY_ID);
		createEAttribute(partyIcsAvsOverrideEClass, PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING);

		partyIdentificationEClass = createEClass(PARTY_IDENTIFICATION);
		createEReference(partyIdentificationEClass, PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE);
		createEReference(partyIdentificationEClass, PARTY_IDENTIFICATION__PARTY);
		createEAttribute(partyIdentificationEClass, PARTY_IDENTIFICATION__ID_VALUE);

		partyIdentificationTypeEClass = createEClass(PARTY_IDENTIFICATION_TYPE);
		createEAttribute(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__PARTY_IDENTIFICATION_TYPE_ID);
		createEAttribute(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__DESCRIPTION);
		createEAttribute(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__HAS_TABLE);
		createEReference(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__PARENT_TYPE);

		partyInvitationEClass = createEClass(PARTY_INVITATION);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__PARTY_INVITATION_ID);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__EMAIL_ADDRESS);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__LAST_INVITE_DATE);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__PARTY_ID);
		createEReference(partyInvitationEClass, PARTY_INVITATION__PARTY_ID_FROM);
		createEReference(partyInvitationEClass, PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS);
		createEReference(partyInvitationEClass, PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS);
		createEReference(partyInvitationEClass, PARTY_INVITATION__STATUS);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__TO_NAME);

		partyInvitationGroupAssocEClass = createEClass(PARTY_INVITATION_GROUP_ASSOC);
		createEReference(partyInvitationGroupAssocEClass, PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO);
		createEReference(partyInvitationGroupAssocEClass, PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION);

		partyInvitationRoleAssocEClass = createEClass(PARTY_INVITATION_ROLE_ASSOC);
		createEReference(partyInvitationRoleAssocEClass, PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE);
		createEReference(partyInvitationRoleAssocEClass, PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION);

		partyNameHistoryEClass = createEClass(PARTY_NAME_HISTORY);
		createEReference(partyNameHistoryEClass, PARTY_NAME_HISTORY__PARTY);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__CHANGE_DATE);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__FIRST_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__GROUP_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__LAST_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__MIDDLE_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__PERSONAL_TITLE);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__SUFFIX);

		partyNoteEClass = createEClass(PARTY_NOTE);
		createEReference(partyNoteEClass, PARTY_NOTE__PARTY);

		partyProfileDefaultEClass = createEClass(PARTY_PROFILE_DEFAULT);
		createEReference(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__PARTY);
		createEReference(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__PRODUCT_STORE);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH);

		partyRelationshipEClass = createEClass(PARTY_RELATIONSHIP);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PARTY_ID_FROM);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PARTY_ID_TO);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__FROM_DATE);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__COMMENTS);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__POSITION_TITLE);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PRIORITY_TYPE);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__RELATIONSHIP_NAME);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__SECURITY_GROUP);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__STATUS);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__THRU_DATE);

		partyRelationshipTypeEClass = createEClass(PARTY_RELATIONSHIP_TYPE);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__DESCRIPTION);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__HAS_TABLE);
		createEReference(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__PARENT_TYPE);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME);
		createEReference(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM);
		createEReference(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO);

		partyRoleEClass = createEClass(PARTY_ROLE);
		createEReference(partyRoleEClass, PARTY_ROLE__PARTY);
		createEReference(partyRoleEClass, PARTY_ROLE__ROLE_TYPE);

		partyStatusEClass = createEClass(PARTY_STATUS);
		createEReference(partyStatusEClass, PARTY_STATUS__STATUS);
		createEReference(partyStatusEClass, PARTY_STATUS__PARTY);
		createEAttribute(partyStatusEClass, PARTY_STATUS__STATUS_DATE);
		createEReference(partyStatusEClass, PARTY_STATUS__CHANGE_BY_USER_LOGIN);

		partyTypeEClass = createEClass(PARTY_TYPE);
		createEAttribute(partyTypeEClass, PARTY_TYPE__PARTY_TYPE_ID);
		createEAttribute(partyTypeEClass, PARTY_TYPE__DESCRIPTION);
		createEAttribute(partyTypeEClass, PARTY_TYPE__HAS_TABLE);
		createEReference(partyTypeEClass, PARTY_TYPE__PARENT_TYPE);
		createEReference(partyTypeEClass, PARTY_TYPE__PARTY_TYPE_ATTRS);

		partyTypeAttrEClass = createEClass(PARTY_TYPE_ATTR);
		createEReference(partyTypeAttrEClass, PARTY_TYPE_ATTR__PARTY_TYPE);
		createEAttribute(partyTypeAttrEClass, PARTY_TYPE_ATTR__ATTR_NAME);
		createEAttribute(partyTypeAttrEClass, PARTY_TYPE_ATTR__DESCRIPTION);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__BIRTH_DATE);
		createEAttribute(personEClass, PERSON__CARD_ID);
		createEAttribute(personEClass, PERSON__COMMENTS);
		createEAttribute(personEClass, PERSON__DECEASED_DATE);
		createEReference(personEClass, PERSON__EMPLOYMENT_STATUS_ENUM);
		createEAttribute(personEClass, PERSON__EXISTING_CUSTOMER);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__FIRST_NAME_LOCAL);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__HEIGHT);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME_LOCAL);
		createEAttribute(personEClass, PERSON__MARITAL_STATUS);
		createEAttribute(personEClass, PERSON__MEMBER_ID);
		createEAttribute(personEClass, PERSON__MIDDLE_NAME);
		createEAttribute(personEClass, PERSON__MIDDLE_NAME_LOCAL);
		createEAttribute(personEClass, PERSON__MONTHS_WITH_EMPLOYER);
		createEAttribute(personEClass, PERSON__MOTHERS_MAIDEN_NAME);
		createEAttribute(personEClass, PERSON__NICKNAME);
		createEAttribute(personEClass, PERSON__OCCUPATION);
		createEAttribute(personEClass, PERSON__OTHER_LOCAL);
		createEAttribute(personEClass, PERSON__PASSPORT_EXPIRE_DATE);
		createEAttribute(personEClass, PERSON__PASSPORT_NUMBER);
		createEAttribute(personEClass, PERSON__PERSONAL_TITLE);
		createEReference(personEClass, PERSON__RESIDENCE_STATUS_ENUM);
		createEAttribute(personEClass, PERSON__SALUTATION);
		createEAttribute(personEClass, PERSON__SOCIAL_SECURITY_NUMBER);
		createEAttribute(personEClass, PERSON__SUFFIX);
		createEAttribute(personEClass, PERSON__TOTAL_YEARS_WORK_EXPERIENCE);
		createEAttribute(personEClass, PERSON__WEIGHT);
		createEAttribute(personEClass, PERSON__YEARS_WITH_EMPLOYER);

		priorityTypeEClass = createEClass(PRIORITY_TYPE);
		createEAttribute(priorityTypeEClass, PRIORITY_TYPE__PRIORITY_TYPE_ID);
		createEAttribute(priorityTypeEClass, PRIORITY_TYPE__DESCRIPTION);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__ROLE_TYPE_ID);
		createEAttribute(roleTypeEClass, ROLE_TYPE__DESCRIPTION);
		createEAttribute(roleTypeEClass, ROLE_TYPE__HAS_TABLE);
		createEReference(roleTypeEClass, ROLE_TYPE__PARENT_TYPE);
		createEReference(roleTypeEClass, ROLE_TYPE__ROLE_TYPE_ATTRS);
		createEReference(roleTypeEClass, ROLE_TYPE__VALID_CONTACT_MECH_ROLES);

		roleTypeAttrEClass = createEClass(ROLE_TYPE_ATTR);
		createEReference(roleTypeAttrEClass, ROLE_TYPE_ATTR__ROLE_TYPE);
		createEAttribute(roleTypeAttrEClass, ROLE_TYPE_ATTR__ATTR_NAME);
		createEAttribute(roleTypeAttrEClass, ROLE_TYPE_ATTR__DESCRIPTION);

		vendorEClass = createEClass(VENDOR);
		createEAttribute(vendorEClass, VENDOR__PARTY_ID);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_COMPANY_NAME);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_COMPANY_TITLE);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_LOGO_URL);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_POLICIES);

		webSiteRoleEClass = createEClass(WEB_SITE_ROLE);
		createEReference(webSiteRoleEClass, WEB_SITE_ROLE__PARTY);
		createEReference(webSiteRoleEClass, WEB_SITE_ROLE__ROLE_TYPE);
		createEReference(webSiteRoleEClass, WEB_SITE_ROLE__WEB_SITE);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__FROM_DATE);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__SEQUENCE_NUM);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__THRU_DATE);
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
		DatasourcePackage theDatasourcePackage = (DatasourcePackage)EPackage.Registry.INSTANCE.getEPackage(DatasourcePackage.eNS_URI);
		EmploymentPackage theEmploymentPackage = (EmploymentPackage)EPackage.Registry.INSTANCE.getEPackage(EmploymentPackage.eNS_URI);
		ContactPackage theContactPackage_1 = (ContactPackage)EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);
		AbilityPackage theAbilityPackage = (AbilityPackage)EPackage.Registry.INSTANCE.getEPackage(AbilityPackage.eNS_URI);
		RatePackage theRatePackage = (RatePackage)EPackage.Registry.INSTANCE.getEPackage(RatePackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		SupplierPackage theSupplierPackage = (SupplierPackage)EPackage.Registry.INSTANCE.getEPackage(SupplierPackage.eNS_URI);
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		BizPackage theBizPackage = (BizPackage)EPackage.Registry.INSTANCE.getEPackage(BizPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		SecuritygroupPackage theSecuritygroupPackage = (SecuritygroupPackage)EPackage.Registry.INSTANCE.getEPackage(SecuritygroupPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		org.abchip.mimo.biz.model.party.PartyPackage thePartyPackage_1 = (org.abchip.mimo.biz.model.party.PartyPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.party.PartyPackage.eNS_URI);
		org.abchip.mimo.biz.model.webapp.website.WebsitePackage theWebsitePackage_1 = (org.abchip.mimo.biz.model.webapp.website.WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.webapp.website.WebsitePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addressMatchMapEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		addressMatchMapEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		affiliateEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		affiliateEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getPartyType());
		g1.getETypeArguments().add(g2);
		partyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyEClass.getEGenericSuperTypes().add(g1);
		partyAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyCarrierAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyCarrierAccountEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getPartyClassificationType());
		g1.getETypeArguments().add(g2);
		partyClassificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyClassificationEClass.getEGenericSuperTypes().add(g1);
		partyClassificationGroupEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyClassificationGroupEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getPartyClassification());
		g1.getETypeArguments().add(g2);
		partyClassificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyClassificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getPartyContentType());
		g1.getETypeArguments().add(g2);
		partyContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getPartyContent());
		g1.getETypeArguments().add(g2);
		partyContentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyContentTypeEClass.getEGenericSuperTypes().add(g1);
		partyDataSourceEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyDataSourceEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyGeoPointEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyGeoPointEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyGroupEClass.getESuperTypes().add(this.getParty());
		partyIcsAvsOverrideEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyIcsAvsOverrideEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getPartyIdentificationType());
		g1.getETypeArguments().add(g2);
		partyIdentificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyIdentificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getPartyIdentification());
		g1.getETypeArguments().add(g2);
		partyIdentificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyIdentificationTypeEClass.getEGenericSuperTypes().add(g1);
		partyInvitationEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyInvitationEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyInvitationGroupAssocEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyInvitationGroupAssocEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyInvitationRoleAssocEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyInvitationRoleAssocEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyNameHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyNameHistoryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		partyProfileDefaultEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyProfileDefaultEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getPartyRelationshipType());
		g1.getETypeArguments().add(g2);
		partyRelationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyRelationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getPartyRelationship());
		g1.getETypeArguments().add(g2);
		partyRelationshipTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyRelationshipTypeEClass.getEGenericSuperTypes().add(g1);
		partyRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		partyStatusEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyStatusEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getParty());
		g1.getETypeArguments().add(g2);
		partyTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		partyTypeEClass.getEGenericSuperTypes().add(g1);
		partyTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		partyTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		personEClass.getESuperTypes().add(this.getParty());
		priorityTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		priorityTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		roleTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		roleTypeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		roleTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		roleTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		vendorEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		vendorEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		webSiteRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		webSiteRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(addressMatchMapEClass, AddressMatchMap.class, "AddressMatchMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressMatchMap_MapKey(), ecorePackage.getEString(), "mapKey", null, 1, 1, AddressMatchMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressMatchMap_MapValue(), ecorePackage.getEString(), "mapValue", null, 1, 1, AddressMatchMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressMatchMap_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, AddressMatchMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affiliateEClass, Affiliate.class, "Affiliate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffiliate_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_AffiliateDescription(), ecorePackage.getEString(), "affiliateDescription", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_AffiliateName(), ecorePackage.getEString(), "affiliateName", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_DateTimeApproved(), ecorePackage.getEDate(), "dateTimeApproved", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_DateTimeCreated(), ecorePackage.getEDate(), "dateTimeCreated", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_SitePageViews(), ecorePackage.getEString(), "sitePageViews", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_SiteType(), ecorePackage.getEString(), "siteType", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_SiteVisitors(), ecorePackage.getEString(), "siteVisitors", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_YearEstablished(), ecorePackage.getEString(), "yearEstablished", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParty_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getParty_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_DataSource(), theDatasourcePackage.getDataSource(), null, "dataSource", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_DataSource().getEKeys().add(theDatasourcePackage.getDataSource_DataSourceId());
		initEAttribute(getParty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_EmplLeaves(), theEmploymentPackage.getEmplLeave(), null, "emplLeaves", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_IsUnread(), ecorePackage.getEBooleanObject(), "isUnread", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_LastModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "lastModifiedByUserLogin", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_LastModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getParty_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyAttributes(), this.getPartyAttribute(), null, "partyAttributes", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyCarrierAccounts(), this.getPartyCarrierAccount(), null, "partyCarrierAccounts", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyClassifications(), this.getPartyClassification(), null, "partyClassifications", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyContactMechs(), theContactPackage_1.getPartyContactMech(), null, "partyContactMechs", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyDataSources(), this.getPartyDataSource(), null, "partyDataSources", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyGeoPoints(), this.getPartyGeoPoint(), null, "partyGeoPoints", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyIdentifications(), this.getPartyIdentification(), null, "partyIdentifications", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyNameHistories(), this.getPartyNameHistory(), null, "partyNameHistories", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyNotes(), this.getPartyNote(), null, "partyNotes", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyProfileDefaults(), this.getPartyProfileDefault(), null, "partyProfileDefaults", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyQuals(), theAbilityPackage.getPartyQual(), null, "partyQuals", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyRates(), theRatePackage.getPartyRate(), null, "partyRates", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyRoles(), this.getPartyRole(), null, "partyRoles", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartySkills(), theAbilityPackage.getPartySkill(), null, "partySkills", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyType(), this.getPartyType(), null, "partyType", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_PartyType().getEKeys().add(this.getPartyType_PartyTypeId());
		initEReference(getParty_PerformanceNotes(), theAbilityPackage.getPerformanceNote(), null, "performanceNotes", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PersonTrainings(), theAbilityPackage.getPersonTraining(), null, "personTrainings", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PreferredCurrencyUom(), theUomPackage.getUom(), null, "preferredCurrencyUom", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_PreferredCurrencyUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getParty_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getParty_SupplierProductFeatures(), theSupplierPackage.getSupplierProductFeature(), null, "supplierProductFeatures", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(partyEClass, thePaymentPackage.getCreditCard(), "getCreditCard", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, theContactPackage_1.getContactMech(), "getEmail", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(partyEClass, thePaymentPackage.getPaymentMethod(), "getPaymentMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "methodType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, theContactPackage_1.getPostalAddress(), "getPostalAddress", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, theContactPackage_1.getTelecomNumber(), "getTelecomNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyAttributeEClass, PartyAttribute.class, "PartyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyAttribute_Party(), this.getParty(), null, "party", null, 1, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyAttribute_Party().getEKeys().add(this.getParty_PartyId());
		initEAttribute(getPartyAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyCarrierAccountEClass, PartyCarrierAccount.class, "PartyCarrierAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyCarrierAccount_Party(), this.getParty(), null, "party", null, 1, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyCarrierAccount_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyCarrierAccount_CarrierParty(), this.getParty(), null, "carrierParty", null, 1, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyCarrierAccount_CarrierParty().getEKeys().add(this.getParty_PartyId());
		initEAttribute(getPartyCarrierAccount_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyCarrierAccount_AccountNumber(), ecorePackage.getEString(), "accountNumber", null, 0, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyCarrierAccount_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyClassificationEClass, PartyClassification.class, "PartyClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyClassification_Party(), this.getParty(), null, "party", null, 1, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassification_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyClassification_PartyClassificationGroup(), this.getPartyClassificationGroup(), null, "partyClassificationGroup", null, 1, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassification_PartyClassificationGroup().getEKeys().add(this.getPartyClassificationGroup_PartyClassificationGroupId());
		initEAttribute(getPartyClassification_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassification_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyClassificationGroupEClass, PartyClassificationGroup.class, "PartyClassificationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyClassificationGroup_PartyClassificationGroupId(), ecorePackage.getEString(), "partyClassificationGroupId", null, 1, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassificationGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyClassificationGroup_ParentGroup(), this.getPartyClassificationGroup(), null, "parentGroup", null, 0, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassificationGroup_ParentGroup().getEKeys().add(this.getPartyClassificationGroup_PartyClassificationGroupId());
		initEReference(getPartyClassificationGroup_PartyClassificationType(), this.getPartyClassificationType(), null, "partyClassificationType", null, 0, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassificationGroup_PartyClassificationType().getEKeys().add(this.getPartyClassificationType_PartyClassificationTypeId());

		initEClass(partyClassificationTypeEClass, PartyClassificationType.class, "PartyClassificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyClassificationType_PartyClassificationTypeId(), ecorePackage.getEString(), "partyClassificationTypeId", null, 1, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassificationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassificationType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyClassificationType_ParentType(), this.getPartyClassificationType(), null, "parentType", null, 0, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassificationType_ParentType().getEKeys().add(this.getPartyClassificationType_PartyClassificationTypeId());

		initEClass(partyContentEClass, PartyContent.class, "PartyContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyContent_Party(), this.getParty(), null, "party", null, 1, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContent_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyContent_Content(), theContentPackage.getContent(), null, "content", null, 1, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContent_Content().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getPartyContent_PartyContentType(), this.getPartyContentType(), null, "partyContentType", null, 1, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContent_PartyContentType().getEKeys().add(this.getPartyContentType_PartyContentTypeId());
		initEAttribute(getPartyContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyContentTypeEClass, PartyContentType.class, "PartyContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyContentType_PartyContentTypeId(), ecorePackage.getEString(), "partyContentTypeId", null, 1, 1, PartyContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyContentType_ParentType(), this.getPartyContentType(), null, "parentType", null, 0, 1, PartyContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContentType_ParentType().getEKeys().add(this.getPartyContentType_PartyContentTypeId());

		initEClass(partyDataSourceEClass, PartyDataSource.class, "PartyDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyDataSource_Party(), this.getParty(), null, "party", null, 1, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyDataSource_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyDataSource_DataSource(), theDatasourcePackage.getDataSource(), null, "dataSource", null, 1, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyDataSource_DataSource().getEKeys().add(theDatasourcePackage.getDataSource_DataSourceId());
		initEAttribute(getPartyDataSource_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_IsCreate(), ecorePackage.getEBooleanObject(), "isCreate", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyGeoPointEClass, PartyGeoPoint.class, "PartyGeoPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyGeoPoint_Party(), this.getParty(), null, "party", null, 1, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyGeoPoint_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyGeoPoint_GeoPoint(), theGeoPackage.getGeoPoint(), null, "geoPoint", null, 1, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyGeoPoint_GeoPoint().getEKeys().add(theGeoPackage.getGeoPoint_GeoPointId());
		initEAttribute(getPartyGeoPoint_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGeoPoint_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyGroupEClass, PartyGroup.class, "PartyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyGroup_AnnualRevenue(), ecorePackage.getEBigDecimal(), "annualRevenue", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_GroupNameLocal(), ecorePackage.getEString(), "groupNameLocal", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_LogoImageUrl(), ecorePackage.getEString(), "logoImageUrl", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_NumEmployees(), ecorePackage.getELong(), "numEmployees", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_OfficeSiteName(), ecorePackage.getEString(), "officeSiteName", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_TickerSymbol(), ecorePackage.getEString(), "tickerSymbol", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyIcsAvsOverrideEClass, PartyIcsAvsOverride.class, "PartyIcsAvsOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyIcsAvsOverride_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyIcsAvsOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIcsAvsOverride_AvsDeclineString(), ecorePackage.getEString(), "avsDeclineString", null, 0, 1, PartyIcsAvsOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyIdentificationEClass, PartyIdentification.class, "PartyIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyIdentification_PartyIdentificationType(), this.getPartyIdentificationType(), null, "partyIdentificationType", null, 1, 1, PartyIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyIdentification_PartyIdentificationType().getEKeys().add(this.getPartyIdentificationType_PartyIdentificationTypeId());
		initEReference(getPartyIdentification_Party(), this.getParty(), null, "party", null, 1, 1, PartyIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyIdentification_Party().getEKeys().add(this.getParty_PartyId());
		initEAttribute(getPartyIdentification_IdValue(), ecorePackage.getEString(), "idValue", null, 0, 1, PartyIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyIdentificationTypeEClass, PartyIdentificationType.class, "PartyIdentificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyIdentificationType_PartyIdentificationTypeId(), ecorePackage.getEString(), "partyIdentificationTypeId", null, 1, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIdentificationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIdentificationType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyIdentificationType_ParentType(), this.getPartyIdentificationType(), null, "parentType", null, 0, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyIdentificationType_ParentType().getEKeys().add(this.getPartyIdentificationType_PartyIdentificationTypeId());

		initEClass(partyInvitationEClass, PartyInvitation.class, "PartyInvitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyInvitation_PartyInvitationId(), ecorePackage.getEString(), "partyInvitationId", null, 1, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_EmailAddress(), ecorePackage.getEString(), "emailAddress", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_LastInviteDate(), ecorePackage.getEDate(), "lastInviteDate", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInvitation_PartyIdFrom(), this.getParty(), null, "partyIdFrom", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitation_PartyIdFrom().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyInvitation_PartyInvitationGroupAssocs(), this.getPartyInvitationGroupAssoc(), null, "partyInvitationGroupAssocs", null, 0, -1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInvitation_PartyInvitationRoleAssocs(), this.getPartyInvitationRoleAssoc(), null, "partyInvitationRoleAssocs", null, 0, -1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInvitation_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitation_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getPartyInvitation_ToName(), ecorePackage.getEString(), "toName", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyInvitationGroupAssocEClass, PartyInvitationGroupAssoc.class, "PartyInvitationGroupAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyInvitationGroupAssoc_PartyIdTo(), this.getPartyGroup(), null, "partyIdTo", null, 1, 1, PartyInvitationGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitationGroupAssoc_PartyIdTo().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyInvitationGroupAssoc_PartyInvitation(), this.getPartyInvitation(), null, "partyInvitation", null, 1, 1, PartyInvitationGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitationGroupAssoc_PartyInvitation().getEKeys().add(this.getPartyInvitation_PartyInvitationId());

		initEClass(partyInvitationRoleAssocEClass, PartyInvitationRoleAssoc.class, "PartyInvitationRoleAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyInvitationRoleAssoc_RoleType(), this.getRoleType(), null, "roleType", null, 1, 1, PartyInvitationRoleAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitationRoleAssoc_RoleType().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getPartyInvitationRoleAssoc_PartyInvitation(), this.getPartyInvitation(), null, "partyInvitation", null, 1, 1, PartyInvitationRoleAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitationRoleAssoc_PartyInvitation().getEKeys().add(this.getPartyInvitation_PartyInvitationId());

		initEClass(partyNameHistoryEClass, PartyNameHistory.class, "PartyNameHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyNameHistory_Party(), this.getParty(), null, "party", null, 1, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyNameHistory_Party().getEKeys().add(this.getParty_PartyId());
		initEAttribute(getPartyNameHistory_ChangeDate(), ecorePackage.getEDate(), "changeDate", null, 1, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_MiddleName(), ecorePackage.getEString(), "middleName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_PersonalTitle(), ecorePackage.getEString(), "personalTitle", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyNoteEClass, PartyNote.class, "PartyNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyNote_Party(), this.getParty(), null, "party", null, 1, 1, PartyNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyNote_Party().getEKeys().add(this.getParty_PartyId());

		initEClass(partyProfileDefaultEClass, PartyProfileDefault.class, "PartyProfileDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyProfileDefault_Party(), this.getParty(), null, "party", null, 1, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyProfileDefault_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyProfileDefault_ProductStore(), theStorePackage.getProductStore(), null, "productStore", null, 1, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyProfileDefault_ProductStore().getEKeys().add(theStorePackage.getProductStore_ProductStoreId());
		initEAttribute(getPartyProfileDefault_DefaultBillAddr(), ecorePackage.getEString(), "defaultBillAddr", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultPayMeth(), ecorePackage.getEString(), "defaultPayMeth", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultShipAddr(), ecorePackage.getEString(), "defaultShipAddr", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultShipMeth(), ecorePackage.getEString(), "defaultShipMeth", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyRelationshipEClass, PartyRelationship.class, "PartyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyRelationship_PartyIdFrom(), this.getParty(), null, "partyIdFrom", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PartyIdFrom().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyRelationship_PartyIdTo(), this.getParty(), null, "partyIdTo", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PartyIdTo().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyRelationship_RoleTypeIdFrom(), this.getRoleType(), null, "roleTypeIdFrom", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_RoleTypeIdFrom().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getPartyRelationship_RoleTypeIdTo(), this.getRoleType(), null, "roleTypeIdTo", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_RoleTypeIdTo().getEKeys().add(this.getRoleType_RoleTypeId());
		initEAttribute(getPartyRelationship_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationship_PartyRelationshipType(), this.getPartyRelationshipType(), null, "partyRelationshipType", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PartyRelationshipType().getEKeys().add(this.getPartyRelationshipType_PartyRelationshipTypeId());
		initEAttribute(getPartyRelationship_PermissionsEnumId(), ecorePackage.getEString(), "permissionsEnumId", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_PositionTitle(), ecorePackage.getEString(), "positionTitle", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationship_PriorityType(), this.getPriorityType(), null, "priorityType", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PriorityType().getEKeys().add(this.getPriorityType_PriorityTypeId());
		initEAttribute(getPartyRelationship_RelationshipName(), ecorePackage.getEString(), "relationshipName", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationship_SecurityGroup(), theSecuritygroupPackage.getSecurityGroup(), null, "securityGroup", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_SecurityGroup().getEKeys().add(theSecuritygroupPackage.getSecurityGroup_GroupId());
		initEReference(getPartyRelationship_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getPartyRelationship_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyRelationshipTypeEClass, PartyRelationshipType.class, "PartyRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyRelationshipType_PartyRelationshipTypeId(), ecorePackage.getEString(), "partyRelationshipTypeId", null, 1, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationshipType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationshipType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationshipType_ParentType(), this.getPartyRelationshipType(), null, "parentType", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationshipType_ParentType().getEKeys().add(this.getPartyRelationshipType_PartyRelationshipTypeId());
		initEAttribute(getPartyRelationshipType_PartyRelationshipName(), ecorePackage.getEString(), "partyRelationshipName", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationshipType_RoleTypeIdValidFrom(), this.getRoleType(), null, "roleTypeIdValidFrom", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationshipType_RoleTypeIdValidFrom().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getPartyRelationshipType_RoleTypeIdValidTo(), this.getRoleType(), null, "roleTypeIdValidTo", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationshipType_RoleTypeIdValidTo().getEKeys().add(this.getRoleType_RoleTypeId());

		initEClass(partyRoleEClass, PartyRole.class, "PartyRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyRole_Party(), this.getParty(), null, "party", null, 1, 1, PartyRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRole_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyRole_RoleType(), this.getRoleType(), null, "roleType", null, 1, 1, PartyRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRole_RoleType().getEKeys().add(this.getRoleType_RoleTypeId());

		initEClass(partyStatusEClass, PartyStatus.class, "PartyStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyStatus_Status(), theStatusPackage.getStatusItem(), null, "status", null, 1, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyStatus_Status().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getPartyStatus_Party(), this.getParty(), null, "party", null, 1, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyStatus_Party().getEKeys().add(this.getParty_PartyId());
		initEAttribute(getPartyStatus_StatusDate(), ecorePackage.getEDate(), "statusDate", null, 1, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyStatus_ChangeByUserLogin(), theLoginPackage.getUserLogin(), null, "changeByUserLogin", null, 0, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyStatus_ChangeByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(partyTypeEClass, PartyType.class, "PartyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyType_PartyTypeId(), ecorePackage.getEString(), "partyTypeId", null, 1, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyType_ParentType(), this.getPartyType(), null, "parentType", null, 0, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyType_ParentType().getEKeys().add(this.getPartyType_PartyTypeId());
		initEReference(getPartyType_PartyTypeAttrs(), this.getPartyTypeAttr(), null, "partyTypeAttrs", null, 0, -1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(partyTypeAttrEClass, PartyTypeAttr.class, "PartyTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyTypeAttr_PartyType(), this.getPartyType(), null, "partyType", null, 1, 1, PartyTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyTypeAttr_PartyType().getEKeys().add(this.getPartyType_PartyTypeId());
		initEAttribute(getPartyTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, PartyTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_BirthDate(), ecorePackage.getEDate(), "birthDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_CardId(), ecorePackage.getEString(), "cardId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DeceasedDate(), ecorePackage.getEDate(), "deceasedDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_EmploymentStatusEnum(), theEnumPackage.getEnumeration(), null, "employmentStatusEnum", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPerson_EmploymentStatusEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getPerson_ExistingCustomer(), ecorePackage.getEBooleanObject(), "existingCustomer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstNameLocal(), ecorePackage.getEString(), "firstNameLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), theCommonPackage.getGender(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastNameLocal(), ecorePackage.getEString(), "lastNameLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MaritalStatus(), thePartyPackage_1.getMaritalStatus(), "maritalStatus", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MemberId(), ecorePackage.getEString(), "memberId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MiddleName(), ecorePackage.getEString(), "middleName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MiddleNameLocal(), ecorePackage.getEString(), "middleNameLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MonthsWithEmployer(), ecorePackage.getELong(), "monthsWithEmployer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MothersMaidenName(), ecorePackage.getEString(), "mothersMaidenName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Occupation(), ecorePackage.getEString(), "occupation", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_OtherLocal(), ecorePackage.getEString(), "otherLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PassportExpireDate(), ecorePackage.getEDate(), "passportExpireDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PassportNumber(), ecorePackage.getEString(), "passportNumber", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonalTitle(), ecorePackage.getEString(), "personalTitle", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_ResidenceStatusEnum(), theEnumPackage.getEnumeration(), null, "residenceStatusEnum", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPerson_ResidenceStatusEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getPerson_Salutation(), ecorePackage.getEString(), "salutation", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_SocialSecurityNumber(), ecorePackage.getEString(), "socialSecurityNumber", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_TotalYearsWorkExperience(), ecorePackage.getEDouble(), "totalYearsWorkExperience", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_YearsWithEmployer(), ecorePackage.getELong(), "yearsWithEmployer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityTypeEClass, PriorityType.class, "PriorityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriorityType_PriorityTypeId(), ecorePackage.getEString(), "priorityTypeId", null, 1, 1, PriorityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriorityType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PriorityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 1, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleType_ParentType(), this.getRoleType(), null, "parentType", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoleType_ParentType().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getRoleType_RoleTypeAttrs(), this.getRoleTypeAttr(), null, "roleTypeAttrs", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRoleType_ValidContactMechRoles(), theContactPackage_1.getValidContactMechRole(), null, "validContactMechRoles", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeAttrEClass, RoleTypeAttr.class, "RoleTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleTypeAttr_RoleType(), this.getRoleType(), null, "roleType", null, 1, 1, RoleTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoleTypeAttr_RoleType().getEKeys().add(this.getRoleType_RoleTypeId());
		initEAttribute(getRoleTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, RoleTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, RoleTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorEClass, Vendor.class, "Vendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendor_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestCompanyName(), ecorePackage.getEString(), "manifestCompanyName", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestCompanyTitle(), ecorePackage.getEString(), "manifestCompanyTitle", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestLogoUrl(), ecorePackage.getEString(), "manifestLogoUrl", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestPolicies(), ecorePackage.getEString(), "manifestPolicies", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSiteRoleEClass, WebSiteRole.class, "WebSiteRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebSiteRole_Party(), this.getParty(), null, "party", null, 1, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWebSiteRole_Party().getEKeys().add(this.getParty_PartyId());
		initEReference(getWebSiteRole_RoleType(), this.getRoleType(), null, "roleType", null, 1, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWebSiteRole_RoleType().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getWebSiteRole_WebSite(), theWebsitePackage_1.getWebSite(), null, "webSite", null, 1, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWebSiteRole_WebSite().getEKeys().add(theWebsitePackage_1.getWebSite_WebSiteId());
		initEAttribute(getWebSiteRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSiteRole_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSiteRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getAddressMatchMap_MapKey(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAddressMatchMap_MapValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getAddressMatchMap_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getAffiliate_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getAffiliate_AffiliateDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getAffiliate_AffiliateName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getAffiliate_SitePageViews(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getAffiliate_SiteType(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getAffiliate_SiteVisitors(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getAffiliate_YearEstablished(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getParty_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getParty_ExternalId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPartyAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPartyCarrierAccount_AccountNumber(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyClassificationGroup_PartyClassificationGroupId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyClassificationGroup_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyClassificationType_PartyClassificationTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyClassificationType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyContentType_PartyContentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyContentType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyDataSource_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getPartyDataSource_VisitId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyGroup_AnnualRevenue(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getPartyGroup_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getPartyGroup_GroupName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyGroup_GroupNameLocal(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyGroup_LogoImageUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getPartyGroup_NumEmployees(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPartyGroup_OfficeSiteName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyGroup_TickerSymbol(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getPartyIcsAvsOverride_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyIcsAvsOverride_AvsDeclineString(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPartyIdentification_IdValue(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPartyIdentificationType_PartyIdentificationTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyIdentificationType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyInvitation_PartyInvitationId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyInvitation_EmailAddress(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPartyInvitation_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyInvitation_ToName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyNameHistory_FirstName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyNameHistory_GroupName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyNameHistory_LastName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyNameHistory_MiddleName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyNameHistory_PersonalTitle(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyNameHistory_Suffix(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyProfileDefault_DefaultBillAddr(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyProfileDefault_DefaultPayMeth(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyProfileDefault_DefaultShipAddr(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyProfileDefault_DefaultShipMeth(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyRelationship_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getPartyRelationship_PermissionsEnumId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyRelationship_PositionTitle(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyRelationship_RelationshipName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyRelationshipType_PartyRelationshipTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyRelationshipType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyRelationshipType_PartyRelationshipName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPartyType_PartyTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPartyType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPartyTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPartyTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getPerson_CardId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPerson_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getPerson_FirstName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_FirstNameLocal(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_LastName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_LastNameLocal(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_MemberId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPerson_MiddleName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_MiddleNameLocal(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_MonthsWithEmployer(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPerson_MothersMaidenName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPerson_Nickname(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_Occupation(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_OtherLocal(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_PassportNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPerson_PersonalTitle(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_Salutation(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_SocialSecurityNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPerson_Suffix(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getPerson_YearsWithEmployer(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPriorityType_PriorityTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPriorityType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getRoleType_RoleTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getRoleType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getRoleTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getRoleTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getVendor_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getVendor_ManifestCompanyName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getVendor_ManifestCompanyTitle(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getVendor_ManifestLogoUrl(),
		   source,
		   new String[] {
			   "type", "url"
		   });
		addAnnotation
		  (getWebSiteRole_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
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
		  (getAddressMatchMap_MapKey(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAddressMatchMap_MapValue(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getParty_EmplLeaves(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyCarrierAccounts(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyClassifications(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyContactMechs(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyDataSources(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyGeoPoints(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyQuals(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PartyRates(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PerformanceNotes(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getParty_PersonTrainings(),
		   source,
		   new String[] {
			   "type", "fromDate"
		   });
		addAnnotation
		  (getPartyAttribute_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyCarrierAccount_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyCarrierAccount_CarrierParty(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyCarrierAccount_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyClassification_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyClassification_PartyClassificationGroup(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyClassification_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContent_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContent_Content(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContent_PartyContentType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyDataSource_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyDataSource_DataSource(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyDataSource_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGeoPoint_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGeoPoint_GeoPoint(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGeoPoint_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyIdentification_PartyIdentificationType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyIdentification_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitationGroupAssoc_PartyIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitationGroupAssoc_PartyInvitation(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitationRoleAssoc_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitationRoleAssoc_PartyInvitation(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyNameHistory_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyNameHistory_ChangeDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyNameHistory_GroupName(),
		   source,
		   new String[] {
			   "help", "For Party Groups only"
		   });
		addAnnotation
		  (getPartyNote_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyProfileDefault_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyProfileDefault_ProductStore(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_PartyIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_PartyIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_RoleTypeIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_RoleTypeIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_PositionTitle(),
		   source,
		   new String[] {
			   "help", "The exact word used within the company"
		   });
		addAnnotation
		  (getPartyRelationship_RelationshipName(),
		   source,
		   new String[] {
			   "help", "Official name of relationship, such as title in a company"
		   });
		addAnnotation
		  (getPartyRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyStatus_Status(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyStatus_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyStatus_StatusDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyTypeAttr_PartyType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPerson_MothersMaidenName(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getPerson_PassportNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getPerson_SocialSecurityNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getRoleTypeAttr_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getRoleTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWebSiteRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWebSiteRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWebSiteRole_WebSite(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWebSiteRole_FromDate(),
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
		  (addressMatchMapEClass,
		   source,
		   new String[] {
			   "title", "Address Matching Map"
		   });
		addAnnotation
		  (affiliateEClass,
		   source,
		   new String[] {
			   "title", "Affiliate Party"
		   });
		addAnnotation
		  (partyEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyClassificationGroupEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyClassificationTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (partyContentEClass,
		   source,
		   new String[] {
			   "title", "Party Data Object"
		   });
		addAnnotation
		  (partyContentTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (partyGeoPointEClass,
		   source,
		   new String[] {
			   "title", "Party Geo Location with history"
		   });
		addAnnotation
		  (partyGroupEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyIdentificationTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (partyProfileDefaultEClass,
		   source,
		   new String[] {
			   "title", "Party Profile Defaults"
		   });
		addAnnotation
		  (partyRelationshipTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (partyStatusEClass,
		   source,
		   new String[] {
			   "title", "Tracks a history of the status of a Party"
		   });
		addAnnotation
		  (partyTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (partyTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Party Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (priorityTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (roleTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "PartyEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (roleTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Role Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (webSiteRoleEClass,
		   source,
		   new String[] {
			   "title", "WebSite Role Association"
		   });
	}

} //PartyPackageImpl
