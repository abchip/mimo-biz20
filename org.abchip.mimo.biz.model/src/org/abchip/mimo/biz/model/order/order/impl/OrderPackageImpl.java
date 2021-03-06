/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order.impl;

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
import org.abchip.mimo.biz.model.order.order.CommunicationEventOrder;
import org.abchip.mimo.biz.model.order.order.OrderAdjustment;
import org.abchip.mimo.biz.model.order.order.OrderAdjustmentAttribute;
import org.abchip.mimo.biz.model.order.order.OrderAdjustmentBilling;
import org.abchip.mimo.biz.model.order.order.OrderAdjustmentType;
import org.abchip.mimo.biz.model.order.order.OrderAdjustmentTypeAttr;
import org.abchip.mimo.biz.model.order.order.OrderAttribute;
import org.abchip.mimo.biz.model.order.order.OrderBlacklist;
import org.abchip.mimo.biz.model.order.order.OrderBlacklistType;
import org.abchip.mimo.biz.model.order.order.OrderContactMech;
import org.abchip.mimo.biz.model.order.order.OrderContent;
import org.abchip.mimo.biz.model.order.order.OrderContentType;
import org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule;
import org.abchip.mimo.biz.model.order.order.OrderFactory;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderHeaderNote;
import org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort;
import org.abchip.mimo.biz.model.order.order.OrderItem;
import org.abchip.mimo.biz.model.order.order.OrderItemAssoc;
import org.abchip.mimo.biz.model.order.order.OrderItemAssocType;
import org.abchip.mimo.biz.model.order.order.OrderItemAttribute;
import org.abchip.mimo.biz.model.order.order.OrderItemBilling;
import org.abchip.mimo.biz.model.order.order.OrderItemChange;
import org.abchip.mimo.biz.model.order.order.OrderItemContactMech;
import org.abchip.mimo.biz.model.order.order.OrderItemGroup;
import org.abchip.mimo.biz.model.order.order.OrderItemGroupOrder;
import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.model.order.order.OrderItemRole;
import org.abchip.mimo.biz.model.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc;
import org.abchip.mimo.biz.model.order.order.OrderItemShipGrpInvRes;
import org.abchip.mimo.biz.model.order.order.OrderItemType;
import org.abchip.mimo.biz.model.order.order.OrderItemTypeAttr;
import org.abchip.mimo.biz.model.order.order.OrderNotification;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.model.order.order.OrderProductPromoCode;
import org.abchip.mimo.biz.model.order.order.OrderRole;
import org.abchip.mimo.biz.model.order.order.OrderShipment;
import org.abchip.mimo.biz.model.order.order.OrderStatus;
import org.abchip.mimo.biz.model.order.order.OrderSummaryEntry;
import org.abchip.mimo.biz.model.order.order.OrderTerm;
import org.abchip.mimo.biz.model.order.order.OrderTermAttribute;
import org.abchip.mimo.biz.model.order.order.OrderType;
import org.abchip.mimo.biz.model.order.order.OrderTypeAttr;
import org.abchip.mimo.biz.model.order.order.ProductOrderItem;
import org.abchip.mimo.biz.model.order.order.WorkOrderItemFulfillment;
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
public class OrderPackageImpl extends EPackageImpl implements OrderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEventOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderBlacklistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderBlacklistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderDeliveryScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderHeaderNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderHeaderWorkEffortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemAssocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemGroupOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemPriceInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemShipGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemShipGroupAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemShipGrpInvResEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderPaymentPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderProductPromoCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderSummaryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTermAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOrderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workOrderItemFulfillmentEClass = null;

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
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#eNS_URI
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
		theOrderPackage.createPackageContents();
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
		theOrderPackage.initializePackageContents();
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
	public EClass getCommunicationEventOrder() {
		return communicationEventOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationEventOrder_Order() {
		return (EReference)communicationEventOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationEventOrder_CommunicationEvent() {
		return (EReference)communicationEventOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustment() {
		return orderAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderAdjustmentId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Amount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_AmountAlreadyIncluded() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Comments() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CorrespondingProductId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_CreatedByUserLogin() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CreatedDate() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CustomerReferenceId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Description() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ExemptAmount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IncludeInShipping() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IncludeInTax() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IsManual() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_LastModifiedByUserLogin() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_LastModifiedDate() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OldAmountPerQuantity() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OldPercentage() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_Order() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OrderAdjustmentAttributes() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OrderAdjustmentType() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderItemSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OriginalAdjustment() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OverrideGlAccount() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_PrimaryGeo() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductFeatureId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_ProductPromo() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoActionSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoRuleId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_RecurringAmount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_SecondaryGeo() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ShipGroupSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SourcePercentage() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SourceReferenceId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthGeoId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthPartyId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_TaxAuthorityRateSeq() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentAttribute() {
		return orderAdjustmentAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentAttribute_OrderAdjustment() {
		return (EReference)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrName() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrDescription() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrValue() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentBilling() {
		return orderAdjustmentBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentBilling_OrderAdjustment() {
		return (EReference)orderAdjustmentBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentBilling_Invoice() {
		return (EReference)orderAdjustmentBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_InvoiceItemSeqId() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_Amount() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentType() {
		return orderAdjustmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_OrderAdjustmentTypeId() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_Description() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_HasTable() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentType_OrderAdjustmentTypeAttrs() {
		return (EReference)orderAdjustmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentType_ParentType() {
		return (EReference)orderAdjustmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentTypeAttr() {
		return orderAdjustmentTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentTypeAttr_OrderAdjustmentType() {
		return (EReference)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_AttrName() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_Description() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAttribute() {
		return orderAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAttribute_Order() {
		return (EReference)orderAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrName() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrDescription() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrValue() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderBlacklist() {
		return orderBlacklistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderBlacklist_OrderBlacklistType() {
		return (EReference)orderBlacklistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklist_BlacklistString() {
		return (EAttribute)orderBlacklistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderBlacklistType() {
		return orderBlacklistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklistType_OrderBlacklistTypeId() {
		return (EAttribute)orderBlacklistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklistType_Description() {
		return (EAttribute)orderBlacklistTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderContactMech() {
		return orderContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContactMech_Order() {
		return (EReference)orderContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContactMech_ContactMech() {
		return (EReference)orderContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContactMech_ContactMechPurposeType() {
		return (EReference)orderContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderContent() {
		return orderContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContent_Order() {
		return (EReference)orderContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContent_Content() {
		return (EReference)orderContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContent_OrderContentType() {
		return (EReference)orderContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_OrderItemSeqId() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_FromDate() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_ThruDate() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderContentType() {
		return orderContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_OrderContentTypeId() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_Description() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_HasTable() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContentType_ParentType() {
		return (EReference)orderContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderDeliverySchedule() {
		return orderDeliveryScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_Order() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_OrderItemSeqId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_Cartons() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_EstimatedReadyDate() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_SkidsPallets() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_Status() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalCubicSize() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_TotalCubicUom() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalWeight() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_TotalWeightUom() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_UnitsPieces() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderHeader() {
		return orderHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_AgreementId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_AutoOrderShoppingList() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_BillingAccount() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_CommunicationEventOrders() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_CreatedBy() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_CurrencyUom() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_EntryDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_ExternalId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_FirstAttemptOrderId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_GrandTotal() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_InternalCode() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_InvoicePerShipment() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_IsRushOrder() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_IsViewed() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_NeedsInventoryIssuance() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderAttributes() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderDeliverySchedules() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderHeaderNotes() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderHeaderWorkEfforts() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderItemGroups() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderItemShipGroups() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderItems() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderName() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderProductPromoCodes() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderType() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OriginFacility() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_PickSheetPrintedDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_Priority() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_ProductPromoUses() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_ProductStore() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_RemainingSubTotal() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_SalesChannelEnum() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_Status() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_SyncStatus() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TerminalId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_TrackingCodeOrders() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TransactionId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_VisitId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_WebSite() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderHeaderNote() {
		return orderHeaderNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeaderNote_Order() {
		return (EReference)orderHeaderNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeaderNote_InternalNote() {
		return (EAttribute)orderHeaderNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderHeaderWorkEffort() {
		return orderHeaderWorkEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeaderWorkEffort_Order() {
		return (EReference)orderHeaderWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeaderWorkEffort_WorkEffort() {
		return (EReference)orderHeaderWorkEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItem() {
		return orderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_Order() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_AutoCancelDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_BudgetId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_BudgetItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CancelBackOrderDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CancelQuantity() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_ChangeByUserLogin() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_Comments() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CorrespondingPoId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DeploymentId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DontCancelSetDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_DontCancelSetUserLogin() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_EstimatedDeliveryDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_EstimatedShipDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ExternalId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_FromInventoryItem() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsItemGroupPrimary() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsModifiedPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsPromo() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ItemDescription() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemGroupSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_OrderItemType() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_OverrideGlAccount() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProdCatalogId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_Product() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductCategoryId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductFeatureId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_Quantity() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_QuoteId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_QuoteItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_RecurringFreqUom() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ReserveAfterDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_SalesOpportunity() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SelectedAmount() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShipAfterDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShipBeforeDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShoppingListId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShoppingListItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_Status() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SubscriptionId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SupplierProductId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_SyncStatus() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitAverageCost() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitListPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitRecurringPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemAssoc() {
		return orderItemAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemAssoc_OrderItemAssocType() {
		return (EReference)orderItemAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemAssoc_Order() {
		return (EReference)orderItemAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemAssoc_ToOrder() {
		return (EReference)orderItemAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_OrderItemSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ShipGroupSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToOrderItemSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToShipGroupSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_Quantity() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemAssocType() {
		return orderItemAssocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_OrderItemAssocTypeId() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_Description() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_HasTable() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemAssocType_ParentType() {
		return (EReference)orderItemAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemAttribute() {
		return orderItemAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_OrderId() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_OrderItemSeqId() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_AttrName() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_AttrDescription() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_AttrValue() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemBilling() {
		return orderItemBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_Order() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_Invoice() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_OrderItemSeqId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_InvoiceItemSeqId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_Amount() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_ItemIssuance() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_Quantity() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_ShipmentReceipt() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemChange() {
		return orderItemChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_OrderItemChangeId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_CancelQuantity() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ChangeComments() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ChangeDatetime() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_ChangeTypeEnum() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_ChangeUserLogin() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ItemDescription() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_Order() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_OrderItemSeqId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_Quantity() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_ReasonEnum() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_UnitPrice() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemContactMech() {
		return orderItemContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemContactMech_Order() {
		return (EReference)orderItemContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemContactMech_ContactMechPurposeType() {
		return (EReference)orderItemContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemContactMech_OrderItemSeqId() {
		return (EAttribute)orderItemContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemContactMech_ContactMech() {
		return (EReference)orderItemContactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemGroup() {
		return orderItemGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemGroup_Order() {
		return (EReference)orderItemGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_OrderItemGroupSeqId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_GroupName() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_ParentGroupSeqId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemGroupOrder() {
		return orderItemGroupOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemGroupOrder_GroupOrder() {
		return (EReference)orderItemGroupOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroupOrder_OrderId() {
		return (EAttribute)orderItemGroupOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroupOrder_OrderItemSeqId() {
		return (EAttribute)orderItemGroupOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemPriceInfo() {
		return orderItemPriceInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_OrderItemPriceInfoId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_Description() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_ModifyAmount() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemPriceInfo_Order() {
		return (EReference)orderItemPriceInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_OrderItemSeqId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_ProductPriceActionSeqId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemPriceInfo_ProductPriceRule() {
		return (EReference)orderItemPriceInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_RateCode() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemRole() {
		return orderItemRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemRole_Order() {
		return (EReference)orderItemRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemRole_Party() {
		return (EReference)orderItemRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemRole_RoleType() {
		return (EReference)orderItemRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemRole_OrderItemSeqId() {
		return (EAttribute)orderItemRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemShipGroup() {
		return orderItemShipGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_Order() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_CarrierParty() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_CarrierRoleTypeId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_ContactMech() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_EstimatedDeliveryDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_EstimatedShipDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_Facility() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_GiftMessage() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_IsGift() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_MaySplit() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipAfterDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipByDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_ShipmentMethodType() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShippingInstructions() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_SupplierAgreement() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_SupplierParty() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_TelecomContactMech() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_TrackingNumber() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_VendorParty() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemShipGroupAssoc() {
		return orderItemShipGroupAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroupAssoc_Order() {
		return (EReference)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_OrderItemSeqId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_CancelQuantity() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_Quantity() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemShipGrpInvRes() {
		return orderItemShipGrpInvResEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGrpInvRes_Order() {
		return (EReference)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGrpInvRes_InventoryItem() {
		return (EReference)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OrderItemSeqId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_CreatedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_CurrentPromisedDate() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OldPickStartDate() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_Priority() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_PromisedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_Quantity() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_QuantityNotAvailable() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ReserveOrderEnumId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ReservedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_SequenceId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemType() {
		return orderItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_OrderItemTypeId() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_Description() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_HasTable() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemType_OrderItemTypeAttrs() {
		return (EReference)orderItemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemType_ParentType() {
		return (EReference)orderItemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemTypeAttr() {
		return orderItemTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemTypeAttr_OrderItemType() {
		return (EReference)orderItemTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_AttrName() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_Description() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderNotification() {
		return orderNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_OrderNotificationId() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_Comments() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderNotification_EmailType() {
		return (EReference)orderNotificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_NotificationDate() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderNotification_Order() {
		return (EReference)orderNotificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderPaymentPreference() {
		return orderPaymentPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OrderPaymentPreferenceId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_BillingPostalCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_CreatedByUserLogin() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_CreatedDate() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_FinAccount() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_LastModifiedByUserLogin() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_LastModifiedDate() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ManualAuthCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ManualRefNum() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_MaxAmount() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_NeedsNsfRetry() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_Order() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OrderItemSeqId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OverflowFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_PaymentMethod() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_PaymentMethodType() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_PresentFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ProcessAttempt() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_ProductPricePurpose() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_SecurityCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ShipGroupSeqId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_Status() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_SwipedFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_Track2() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderProductPromoCode() {
		return orderProductPromoCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderProductPromoCode_Order() {
		return (EReference)orderProductPromoCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderProductPromoCode_ProductPromoCode() {
		return (EReference)orderProductPromoCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderRole() {
		return orderRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderRole_Order() {
		return (EReference)orderRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderRole_Party() {
		return (EReference)orderRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderRole_RoleType() {
		return (EReference)orderRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderShipment() {
		return orderShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderShipment_Order() {
		return (EReference)orderShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderShipment_Shipment() {
		return (EReference)orderShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_OrderItemSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipGroupSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipmentItemSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_Quantity() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderStatus() {
		return orderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderStatusId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_ChangeReason() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_Order() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderItemSeqId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_OrderPaymentPreference() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_Status() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_StatusDatetime() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_StatusUserLogin() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderSummaryEntry() {
		return orderSummaryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderSummaryEntry_Product() {
		return (EReference)orderSummaryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderSummaryEntry_Facility() {
		return (EReference)orderSummaryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_EntryDate() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_GrossSales() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_ProductCost() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_TotalQuantity() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderTerm() {
		return orderTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderTerm_Order() {
		return (EReference)orderTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderTerm_TermType() {
		return (EReference)orderTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_OrderItemSeqId() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_Description() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermDays() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermValue() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TextValue() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderTerm_Uom() {
		return (EReference)orderTermEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderTermAttribute() {
		return orderTermAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_TermTypeId() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_OrderId() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_OrderItemSeqId() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_AttrName() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_AttrDescription() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_AttrValue() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderType() {
		return orderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_OrderTypeId() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_Description() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_HasTable() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderType_OrderTypeAttrs() {
		return (EReference)orderTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderType_ParentType() {
		return (EReference)orderTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderTypeAttr() {
		return orderTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderTypeAttr_OrderType() {
		return (EReference)orderTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_AttrName() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_Description() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductOrderItem() {
		return productOrderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrderItem_Order() {
		return (EReference)productOrderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrderItem_Engagement() {
		return (EReference)productOrderItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_OrderItemSeqId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrderItem_Product() {
		return (EReference)productOrderItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_EngagementItemSeqId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkOrderItemFulfillment() {
		return workOrderItemFulfillmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkOrderItemFulfillment_Order() {
		return (EReference)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkOrderItemFulfillment_WorkEffort() {
		return (EReference)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_OrderItemSeqId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_ShipGroupSeqId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(3);
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
		communicationEventOrderEClass = createEClass(COMMUNICATION_EVENT_ORDER);
		createEReference(communicationEventOrderEClass, COMMUNICATION_EVENT_ORDER__ORDER);
		createEReference(communicationEventOrderEClass, COMMUNICATION_EVENT_ORDER__COMMUNICATION_EVENT);

		orderAdjustmentEClass = createEClass(ORDER_ADJUSTMENT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__COMMENTS);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CREATED_DATE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__DESCRIPTION);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__EXEMPT_AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__INCLUDE_IN_TAX);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__IS_MANUAL);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__LAST_MODIFIED_DATE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__OLD_PERCENTAGE);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRIMARY_GEO);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__RECURRING_AMOUNT);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__SECONDARY_GEO);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SOURCE_PERCENTAGE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ);

		orderAdjustmentAttributeEClass = createEClass(ORDER_ADJUSTMENT_ATTRIBUTE);
		createEReference(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ORDER_ADJUSTMENT);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_VALUE);

		orderAdjustmentBillingEClass = createEClass(ORDER_ADJUSTMENT_BILLING);
		createEReference(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__ORDER_ADJUSTMENT);
		createEReference(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__INVOICE);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__AMOUNT);

		orderAdjustmentTypeEClass = createEClass(ORDER_ADJUSTMENT_TYPE);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ID);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__DESCRIPTION);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__HAS_TABLE);
		createEReference(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ATTRS);
		createEReference(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__PARENT_TYPE);

		orderAdjustmentTypeAttrEClass = createEClass(ORDER_ADJUSTMENT_TYPE_ATTR);
		createEReference(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__ORDER_ADJUSTMENT_TYPE);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__DESCRIPTION);

		orderAttributeEClass = createEClass(ORDER_ATTRIBUTE);
		createEReference(orderAttributeEClass, ORDER_ATTRIBUTE__ORDER);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_VALUE);

		orderBlacklistEClass = createEClass(ORDER_BLACKLIST);
		createEReference(orderBlacklistEClass, ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE);
		createEAttribute(orderBlacklistEClass, ORDER_BLACKLIST__BLACKLIST_STRING);

		orderBlacklistTypeEClass = createEClass(ORDER_BLACKLIST_TYPE);
		createEAttribute(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE__ORDER_BLACKLIST_TYPE_ID);
		createEAttribute(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE__DESCRIPTION);

		orderContactMechEClass = createEClass(ORDER_CONTACT_MECH);
		createEReference(orderContactMechEClass, ORDER_CONTACT_MECH__ORDER);
		createEReference(orderContactMechEClass, ORDER_CONTACT_MECH__CONTACT_MECH);
		createEReference(orderContactMechEClass, ORDER_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE);

		orderContentEClass = createEClass(ORDER_CONTENT);
		createEReference(orderContentEClass, ORDER_CONTENT__ORDER);
		createEReference(orderContentEClass, ORDER_CONTENT__CONTENT);
		createEReference(orderContentEClass, ORDER_CONTENT__ORDER_CONTENT_TYPE);
		createEAttribute(orderContentEClass, ORDER_CONTENT__FROM_DATE);
		createEAttribute(orderContentEClass, ORDER_CONTENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderContentEClass, ORDER_CONTENT__THRU_DATE);

		orderContentTypeEClass = createEClass(ORDER_CONTENT_TYPE);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__ORDER_CONTENT_TYPE_ID);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__HAS_TABLE);
		createEReference(orderContentTypeEClass, ORDER_CONTENT_TYPE__PARENT_TYPE);

		orderDeliveryScheduleEClass = createEClass(ORDER_DELIVERY_SCHEDULE);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ORDER);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__CARTONS);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__STATUS);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__UNITS_PIECES);

		orderHeaderEClass = createEClass(ORDER_HEADER);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__AGREEMENT_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST);
		createEReference(orderHeaderEClass, ORDER_HEADER__BILLING_ACCOUNT);
		createEReference(orderHeaderEClass, ORDER_HEADER__COMMUNICATION_EVENT_ORDERS);
		createEReference(orderHeaderEClass, ORDER_HEADER__CREATED_BY);
		createEReference(orderHeaderEClass, ORDER_HEADER__CURRENCY_UOM);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ENTRY_DATE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__EXTERNAL_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__GRAND_TOTAL);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__INTERNAL_CODE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__INVOICE_PER_SHIPMENT);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__IS_RUSH_ORDER);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__IS_VIEWED);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_ATTRIBUTES);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_DATE);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_DELIVERY_SCHEDULES);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_HEADER_NOTES);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_ITEM_GROUPS);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_ITEMS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_NAME);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_TYPE);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORIGIN_FACILITY);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PICK_SHEET_PRINTED_DATE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PRIORITY);
		createEReference(orderHeaderEClass, ORDER_HEADER__PRODUCT_PROMO_USES);
		createEReference(orderHeaderEClass, ORDER_HEADER__PRODUCT_STORE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__REMAINING_SUB_TOTAL);
		createEReference(orderHeaderEClass, ORDER_HEADER__SALES_CHANNEL_ENUM);
		createEReference(orderHeaderEClass, ORDER_HEADER__STATUS);
		createEReference(orderHeaderEClass, ORDER_HEADER__SYNC_STATUS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TERMINAL_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__TRACKING_CODE_ORDERS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TRANSACTION_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__VISIT_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__WEB_SITE);

		orderHeaderNoteEClass = createEClass(ORDER_HEADER_NOTE);
		createEReference(orderHeaderNoteEClass, ORDER_HEADER_NOTE__ORDER);
		createEAttribute(orderHeaderNoteEClass, ORDER_HEADER_NOTE__INTERNAL_NOTE);

		orderHeaderWorkEffortEClass = createEClass(ORDER_HEADER_WORK_EFFORT);
		createEReference(orderHeaderWorkEffortEClass, ORDER_HEADER_WORK_EFFORT__ORDER);
		createEReference(orderHeaderWorkEffortEClass, ORDER_HEADER_WORK_EFFORT__WORK_EFFORT);

		orderItemEClass = createEClass(ORDER_ITEM);
		createEReference(orderItemEClass, ORDER_ITEM__ORDER);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__AUTO_CANCEL_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__BUDGET_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__BUDGET_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__CANCEL_BACK_ORDER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__CANCEL_QUANTITY);
		createEReference(orderItemEClass, ORDER_ITEM__CHANGE_BY_USER_LOGIN);
		createEAttribute(orderItemEClass, ORDER_ITEM__COMMENTS);
		createEAttribute(orderItemEClass, ORDER_ITEM__CORRESPONDING_PO_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__DEPLOYMENT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__DONT_CANCEL_SET_DATE);
		createEReference(orderItemEClass, ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN);
		createEAttribute(orderItemEClass, ORDER_ITEM__ESTIMATED_DELIVERY_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__ESTIMATED_SHIP_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__EXTERNAL_ID);
		createEReference(orderItemEClass, ORDER_ITEM__FROM_INVENTORY_ITEM);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_ITEM_GROUP_PRIMARY);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_MODIFIED_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_PROMO);
		createEAttribute(orderItemEClass, ORDER_ITEM__ITEM_DESCRIPTION);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID);
		createEReference(orderItemEClass, ORDER_ITEM__ORDER_ITEM_TYPE);
		createEReference(orderItemEClass, ORDER_ITEM__OVERRIDE_GL_ACCOUNT);
		createEAttribute(orderItemEClass, ORDER_ITEM__PROD_CATALOG_ID);
		createEReference(orderItemEClass, ORDER_ITEM__PRODUCT);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_CATEGORY_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_FEATURE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUANTITY);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUOTE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUOTE_ITEM_SEQ_ID);
		createEReference(orderItemEClass, ORDER_ITEM__RECURRING_FREQ_UOM);
		createEAttribute(orderItemEClass, ORDER_ITEM__RESERVE_AFTER_DATE);
		createEReference(orderItemEClass, ORDER_ITEM__SALES_OPPORTUNITY);
		createEAttribute(orderItemEClass, ORDER_ITEM__SELECTED_AMOUNT);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHIP_AFTER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHIP_BEFORE_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHOPPING_LIST_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID);
		createEReference(orderItemEClass, ORDER_ITEM__STATUS);
		createEAttribute(orderItemEClass, ORDER_ITEM__SUBSCRIPTION_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SUPPLIER_PRODUCT_ID);
		createEReference(orderItemEClass, ORDER_ITEM__SYNC_STATUS);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_AVERAGE_COST);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_LIST_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_RECURRING_PRICE);

		orderItemAssocEClass = createEClass(ORDER_ITEM_ASSOC);
		createEReference(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE);
		createEReference(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER);
		createEReference(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_ORDER);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__QUANTITY);

		orderItemAssocTypeEClass = createEClass(ORDER_ITEM_ASSOC_TYPE);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__ORDER_ITEM_ASSOC_TYPE_ID);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__HAS_TABLE);
		createEReference(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__PARENT_TYPE);

		orderItemAttributeEClass = createEClass(ORDER_ITEM_ATTRIBUTE);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ORDER_ID);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_VALUE);

		orderItemBillingEClass = createEClass(ORDER_ITEM_BILLING);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__ORDER);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__INVOICE);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__AMOUNT);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__ITEM_ISSUANCE);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__QUANTITY);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__SHIPMENT_RECEIPT);

		orderItemChangeEClass = createEClass(ORDER_ITEM_CHANGE);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CANCEL_QUANTITY);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_COMMENTS);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_DATETIME);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ITEM_DESCRIPTION);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__QUANTITY);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__REASON_ENUM);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__UNIT_PRICE);

		orderItemContactMechEClass = createEClass(ORDER_ITEM_CONTACT_MECH);
		createEReference(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__ORDER);
		createEReference(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE);
		createEAttribute(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__ORDER_ITEM_SEQ_ID);
		createEReference(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__CONTACT_MECH);

		orderItemGroupEClass = createEClass(ORDER_ITEM_GROUP);
		createEReference(orderItemGroupEClass, ORDER_ITEM_GROUP__ORDER);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__GROUP_NAME);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID);

		orderItemGroupOrderEClass = createEClass(ORDER_ITEM_GROUP_ORDER);
		createEReference(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__GROUP_ORDER);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__ORDER_ID);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__ORDER_ITEM_SEQ_ID);

		orderItemPriceInfoEClass = createEClass(ORDER_ITEM_PRICE_INFO);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__DESCRIPTION);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT);
		createEReference(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID);
		createEReference(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__RATE_CODE);

		orderItemRoleEClass = createEClass(ORDER_ITEM_ROLE);
		createEReference(orderItemRoleEClass, ORDER_ITEM_ROLE__ORDER);
		createEReference(orderItemRoleEClass, ORDER_ITEM_ROLE__PARTY);
		createEReference(orderItemRoleEClass, ORDER_ITEM_ROLE__ROLE_TYPE);
		createEAttribute(orderItemRoleEClass, ORDER_ITEM_ROLE__ORDER_ITEM_SEQ_ID);

		orderItemShipGroupEClass = createEClass(ORDER_ITEM_SHIP_GROUP);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ORDER);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CONTACT_MECH);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__FACILITY);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__IS_GIFT);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__MAY_SPLIT);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY);

		orderItemShipGroupAssocEClass = createEClass(ORDER_ITEM_SHIP_GROUP_ASSOC);
		createEReference(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__CANCEL_QUANTITY);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__QUANTITY);

		orderItemShipGrpInvResEClass = createEClass(ORDER_ITEM_SHIP_GRP_INV_RES);
		createEReference(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__ORDER);
		createEReference(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID);

		orderItemTypeEClass = createEClass(ORDER_ITEM_TYPE);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__DESCRIPTION);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__HAS_TABLE);
		createEReference(orderItemTypeEClass, ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS);
		createEReference(orderItemTypeEClass, ORDER_ITEM_TYPE__PARENT_TYPE);

		orderItemTypeAttrEClass = createEClass(ORDER_ITEM_TYPE_ATTR);
		createEReference(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__ORDER_ITEM_TYPE);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__DESCRIPTION);

		orderNotificationEClass = createEClass(ORDER_NOTIFICATION);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__COMMENTS);
		createEReference(orderNotificationEClass, ORDER_NOTIFICATION__EMAIL_TYPE);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__NOTIFICATION_DATE);
		createEReference(orderNotificationEClass, ORDER_NOTIFICATION__ORDER);

		orderPaymentPreferenceEClass = createEClass(ORDER_PAYMENT_PREFERENCE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__CREATED_DATE);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SECURITY_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__STATUS);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__TRACK2);

		orderProductPromoCodeEClass = createEClass(ORDER_PRODUCT_PROMO_CODE);
		createEReference(orderProductPromoCodeEClass, ORDER_PRODUCT_PROMO_CODE__ORDER);
		createEReference(orderProductPromoCodeEClass, ORDER_PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE);

		orderRoleEClass = createEClass(ORDER_ROLE);
		createEReference(orderRoleEClass, ORDER_ROLE__ORDER);
		createEReference(orderRoleEClass, ORDER_ROLE__PARTY);
		createEReference(orderRoleEClass, ORDER_ROLE__ROLE_TYPE);

		orderShipmentEClass = createEClass(ORDER_SHIPMENT);
		createEReference(orderShipmentEClass, ORDER_SHIPMENT__ORDER);
		createEReference(orderShipmentEClass, ORDER_SHIPMENT__SHIPMENT);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__QUANTITY);

		orderStatusEClass = createEClass(ORDER_STATUS);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_STATUS_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__CHANGE_REASON);
		createEReference(orderStatusEClass, ORDER_STATUS__ORDER);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_ITEM_SEQ_ID);
		createEReference(orderStatusEClass, ORDER_STATUS__ORDER_PAYMENT_PREFERENCE);
		createEReference(orderStatusEClass, ORDER_STATUS__STATUS);
		createEAttribute(orderStatusEClass, ORDER_STATUS__STATUS_DATETIME);
		createEReference(orderStatusEClass, ORDER_STATUS__STATUS_USER_LOGIN);

		orderSummaryEntryEClass = createEClass(ORDER_SUMMARY_ENTRY);
		createEReference(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__PRODUCT);
		createEReference(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__FACILITY);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__ENTRY_DATE);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__GROSS_SALES);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__PRODUCT_COST);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY);

		orderTermEClass = createEClass(ORDER_TERM);
		createEReference(orderTermEClass, ORDER_TERM__ORDER);
		createEReference(orderTermEClass, ORDER_TERM__TERM_TYPE);
		createEAttribute(orderTermEClass, ORDER_TERM__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderTermEClass, ORDER_TERM__DESCRIPTION);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_DAYS);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_VALUE);
		createEAttribute(orderTermEClass, ORDER_TERM__TEXT_VALUE);
		createEReference(orderTermEClass, ORDER_TERM__UOM);

		orderTermAttributeEClass = createEClass(ORDER_TERM_ATTRIBUTE);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ORDER_ID);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__TERM_TYPE_ID);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ATTR_VALUE);

		orderTypeEClass = createEClass(ORDER_TYPE);
		createEAttribute(orderTypeEClass, ORDER_TYPE__ORDER_TYPE_ID);
		createEAttribute(orderTypeEClass, ORDER_TYPE__DESCRIPTION);
		createEAttribute(orderTypeEClass, ORDER_TYPE__HAS_TABLE);
		createEReference(orderTypeEClass, ORDER_TYPE__ORDER_TYPE_ATTRS);
		createEReference(orderTypeEClass, ORDER_TYPE__PARENT_TYPE);

		orderTypeAttrEClass = createEClass(ORDER_TYPE_ATTR);
		createEReference(orderTypeAttrEClass, ORDER_TYPE_ATTR__ORDER_TYPE);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__DESCRIPTION);

		productOrderItemEClass = createEClass(PRODUCT_ORDER_ITEM);
		createEReference(productOrderItemEClass, PRODUCT_ORDER_ITEM__ORDER);
		createEReference(productOrderItemEClass, PRODUCT_ORDER_ITEM__ENGAGEMENT);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID);
		createEReference(productOrderItemEClass, PRODUCT_ORDER_ITEM__PRODUCT);

		workOrderItemFulfillmentEClass = createEClass(WORK_ORDER_ITEM_FULFILLMENT);
		createEReference(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__ORDER);
		createEReference(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__WORK_EFFORT);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__SHIP_GROUP_SEQ_ID);
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
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		PromoPackage thePromoPackage = (PromoPackage)EPackage.Registry.INSTANCE.getEPackage(PromoPackage.eNS_URI);
		TaxPackage theTaxPackage = (TaxPackage)EPackage.Registry.INSTANCE.getEPackage(TaxPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		org.abchip.mimo.biz.model.party.contact.ContactPackage theContactPackage_1 = (org.abchip.mimo.biz.model.party.contact.ContactPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.party.contact.ContactPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		ShoppinglistPackage theShoppinglistPackage = (ShoppinglistPackage)EPackage.Registry.INSTANCE.getEPackage(ShoppinglistPackage.eNS_URI);
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		TrackingPackage theTrackingPackage = (TrackingPackage)EPackage.Registry.INSTANCE.getEPackage(TrackingPackage.eNS_URI);
		org.abchip.mimo.biz.model.webapp.website.WebsitePackage theWebsitePackage_1 = (org.abchip.mimo.biz.model.webapp.website.WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.model.webapp.website.WebsitePackage.eNS_URI);
		BizPackage theBizPackage = (BizPackage)EPackage.Registry.INSTANCE.getEPackage(BizPackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		OpportunityPackage theOpportunityPackage = (OpportunityPackage)EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);
		IssuancePackage theIssuancePackage = (IssuancePackage)EPackage.Registry.INSTANCE.getEPackage(IssuancePackage.eNS_URI);
		ReceiptPackage theReceiptPackage = (ReceiptPackage)EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		PricePackage thePricePackage = (PricePackage)EPackage.Registry.INSTANCE.getEPackage(PricePackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		AgreementPackage theAgreementPackage = (AgreementPackage)EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		FinaccountPackage theFinaccountPackage = (FinaccountPackage)EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationEventOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		communicationEventOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		EGenericType g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		EGenericType g2 = createEGenericType(this.getOrderAdjustmentType());
		g1.getETypeArguments().add(g2);
		orderAdjustmentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderAdjustmentEClass.getEGenericSuperTypes().add(g1);
		orderAdjustmentAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderAdjustmentAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderAdjustmentBillingEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderAdjustmentBillingEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getOrderAdjustment());
		g1.getETypeArguments().add(g2);
		orderAdjustmentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderAdjustmentTypeEClass.getEGenericSuperTypes().add(g1);
		orderAdjustmentTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderAdjustmentTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getOrderBlacklistType());
		g1.getETypeArguments().add(g2);
		orderBlacklistEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderBlacklistEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getOrderBlacklist());
		g1.getETypeArguments().add(g2);
		orderBlacklistTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderBlacklistTypeEClass.getEGenericSuperTypes().add(g1);
		orderContactMechEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderContactMechEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getOrderContentType());
		g1.getETypeArguments().add(g2);
		orderContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getOrderContent());
		g1.getETypeArguments().add(g2);
		orderContentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderContentTypeEClass.getEGenericSuperTypes().add(g1);
		orderDeliveryScheduleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderDeliveryScheduleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getOrderType());
		g1.getETypeArguments().add(g2);
		orderHeaderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderHeaderEClass.getEGenericSuperTypes().add(g1);
		orderHeaderNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		orderHeaderWorkEffortEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderHeaderWorkEffortEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getOrderItemType());
		g1.getETypeArguments().add(g2);
		orderItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityTyped());
		g2 = createEGenericType(this.getOrderItemAssocType());
		g1.getETypeArguments().add(g2);
		orderItemAssocEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderItemAssocEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getOrderItemAssoc());
		g1.getETypeArguments().add(g2);
		orderItemAssocTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderItemAssocTypeEClass.getEGenericSuperTypes().add(g1);
		orderItemAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemBillingEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemBillingEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemChangeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemChangeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemContactMechEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemContactMechEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemGroupEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemGroupEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemGroupOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemGroupOrderEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemPriceInfoEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemPriceInfoEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemShipGroupEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemShipGroupEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemShipGroupAssocEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemShipGroupAssocEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderItemShipGrpInvResEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemShipGrpInvResEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getOrderItem());
		g1.getETypeArguments().add(g2);
		orderItemTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderItemTypeEClass.getEGenericSuperTypes().add(g1);
		orderItemTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderItemTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderNotificationEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderNotificationEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderPaymentPreferenceEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderPaymentPreferenceEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderProductPromoCodeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderProductPromoCodeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderRoleEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderShipmentEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderShipmentEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderStatusEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderStatusEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderSummaryEntryEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderSummaryEntryEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderTermEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderTermEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		orderTermAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderTermAttributeEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		g1 = createEGenericType(theEntityPackage_1.getEntityType());
		g2 = createEGenericType(this.getOrderHeader());
		g1.getETypeArguments().add(g2);
		orderTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEntityPackage_1.getEntityInfo());
		orderTypeEClass.getEGenericSuperTypes().add(g1);
		orderTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		orderTypeAttrEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		productOrderItemEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		productOrderItemEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());
		workOrderItemFulfillmentEClass.getESuperTypes().add(theEntityPackage_1.getEntityIdentifiable());
		workOrderItemFulfillmentEClass.getESuperTypes().add(theEntityPackage_1.getEntityInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationEventOrderEClass, CommunicationEventOrder.class, "CommunicationEventOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationEventOrder_Order(), this.getOrderHeader(), null, "order", null, 1, 1, CommunicationEventOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationEventOrder_CommunicationEvent(), theCommunicationPackage.getCommunicationEvent(), null, "communicationEvent", null, 1, 1, CommunicationEventOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentEClass, OrderAdjustment.class, "OrderAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustment_OrderAdjustmentId(), ecorePackage.getEString(), "orderAdjustmentId", null, 1, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_AmountAlreadyIncluded(), ecorePackage.getEBigDecimal(), "amountAlreadyIncluded", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CorrespondingProductId(), ecorePackage.getEString(), "correspondingProductId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CustomerReferenceId(), ecorePackage.getEString(), "customerReferenceId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ExemptAmount(), ecorePackage.getEBigDecimal(), "exemptAmount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_IncludeInShipping(), ecorePackage.getEBooleanObject(), "includeInShipping", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_IncludeInTax(), ecorePackage.getEBooleanObject(), "includeInTax", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_IsManual(), ecorePackage.getEBooleanObject(), "isManual", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OldAmountPerQuantity(), ecorePackage.getEBigDecimal(), "oldAmountPerQuantity", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OldPercentage(), ecorePackage.getEDouble(), "oldPercentage", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_Order(), this.getOrderHeader(), null, "order", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_OrderAdjustmentAttributes(), this.getOrderAdjustmentAttribute(), null, "orderAdjustmentAttributes", null, 0, -1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_OrderAdjustmentType(), this.getOrderAdjustmentType(), null, "orderAdjustmentType", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_OriginalAdjustment(), this.getOrderAdjustment(), null, "originalAdjustment", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_OverrideGlAccount(), theLedgerPackage.getGlAccount(), null, "overrideGlAccount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_PrimaryGeo(), theGeoPackage.getGeo(), null, "primaryGeo", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_ProductPromo(), thePromoPackage.getProductPromo(), null, "productPromo", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoActionSeqId(), ecorePackage.getEString(), "productPromoActionSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoRuleId(), ecorePackage.getEString(), "productPromoRuleId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_RecurringAmount(), ecorePackage.getEBigDecimal(), "recurringAmount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_SecondaryGeo(), theGeoPackage.getGeo(), null, "secondaryGeo", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SourcePercentage(), ecorePackage.getEBigDecimal(), "sourcePercentage", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SourceReferenceId(), ecorePackage.getEString(), "sourceReferenceId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthGeoId(), ecorePackage.getEString(), "taxAuthGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthPartyId(), ecorePackage.getEString(), "taxAuthPartyId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_TaxAuthorityRateSeq(), theTaxPackage.getTaxAuthorityRateProduct(), null, "taxAuthorityRateSeq", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentAttributeEClass, OrderAdjustmentAttribute.class, "OrderAdjustmentAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderAdjustmentAttribute_OrderAdjustment(), this.getOrderAdjustment(), null, "orderAdjustment", null, 1, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentBillingEClass, OrderAdjustmentBilling.class, "OrderAdjustmentBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderAdjustmentBilling_OrderAdjustment(), this.getOrderAdjustment(), null, "orderAdjustment", null, 1, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentBilling_Invoice(), theInvoicePackage.getInvoice(), null, "invoice", null, 1, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentTypeEClass, OrderAdjustmentType.class, "OrderAdjustmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentType_OrderAdjustmentTypeId(), ecorePackage.getEString(), "orderAdjustmentTypeId", null, 1, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentType_OrderAdjustmentTypeAttrs(), this.getOrderAdjustmentTypeAttr(), null, "orderAdjustmentTypeAttrs", null, 0, -1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentType_ParentType(), this.getOrderAdjustmentType(), null, "parentType", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentTypeAttrEClass, OrderAdjustmentTypeAttr.class, "OrderAdjustmentTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderAdjustmentTypeAttr_OrderAdjustmentType(), this.getOrderAdjustmentType(), null, "orderAdjustmentType", null, 1, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAttributeEClass, OrderAttribute.class, "OrderAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderAttribute_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderBlacklistEClass, OrderBlacklist.class, "OrderBlacklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderBlacklist_OrderBlacklistType(), this.getOrderBlacklistType(), null, "orderBlacklistType", null, 1, 1, OrderBlacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderBlacklist_BlacklistString(), ecorePackage.getEString(), "blacklistString", null, 1, 1, OrderBlacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderBlacklistTypeEClass, OrderBlacklistType.class, "OrderBlacklistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBlacklistType_OrderBlacklistTypeId(), ecorePackage.getEString(), "orderBlacklistTypeId", null, 1, 1, OrderBlacklistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderBlacklistType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderBlacklistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderContactMechEClass, OrderContactMech.class, "OrderContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderContactMech_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContactMech_ContactMech(), theContactPackage_1.getContactMech(), null, "contactMech", null, 1, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContactMech_ContactMechPurposeType(), theContactPackage_1.getContactMechPurposeType(), null, "contactMechPurposeType", null, 1, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderContentEClass, OrderContent.class, "OrderContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderContent_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContent_Content(), theContentPackage.getContent(), null, "content", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContent_OrderContentType(), this.getOrderContentType(), null, "orderContentType", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderContentTypeEClass, OrderContentType.class, "OrderContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderContentType_OrderContentTypeId(), ecorePackage.getEString(), "orderContentTypeId", null, 1, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContentType_ParentType(), this.getOrderContentType(), null, "parentType", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderDeliveryScheduleEClass, OrderDeliverySchedule.class, "OrderDeliverySchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderDeliverySchedule_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_Cartons(), ecorePackage.getELong(), "cartons", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_EstimatedReadyDate(), ecorePackage.getEDate(), "estimatedReadyDate", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_SkidsPallets(), ecorePackage.getELong(), "skidsPallets", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderDeliverySchedule_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalCubicSize(), ecorePackage.getEBigDecimal(), "totalCubicSize", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderDeliverySchedule_TotalCubicUom(), theUomPackage.getUom(), null, "totalCubicUom", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalWeight(), ecorePackage.getEBigDecimal(), "totalWeight", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderDeliverySchedule_TotalWeightUom(), theUomPackage.getUom(), null, "totalWeightUom", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_UnitsPieces(), ecorePackage.getEBigDecimal(), "unitsPieces", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderHeaderEClass, OrderHeader.class, "OrderHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderHeader_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_AgreementId(), ecorePackage.getEString(), "agreementId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_AutoOrderShoppingList(), theShoppinglistPackage.getShoppingList(), null, "autoOrderShoppingList", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_BillingAccount(), thePaymentPackage.getBillingAccount(), null, "billingAccount", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_CommunicationEventOrders(), this.getCommunicationEventOrder(), null, "communicationEventOrders", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_CreatedBy(), theLoginPackage.getUserLogin(), null, "createdBy", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_EntryDate(), ecorePackage.getEDate(), "entryDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_FirstAttemptOrderId(), ecorePackage.getEString(), "firstAttemptOrderId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_GrandTotal(), ecorePackage.getEBigDecimal(), "grandTotal", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_InternalCode(), ecorePackage.getEString(), "internalCode", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_InvoicePerShipment(), ecorePackage.getEBoolean(), "invoicePerShipment", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_IsRushOrder(), ecorePackage.getEBoolean(), "isRushOrder", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_IsViewed(), ecorePackage.getEBoolean(), "isViewed", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_NeedsInventoryIssuance(), ecorePackage.getEBoolean(), "needsInventoryIssuance", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderAttributes(), this.getOrderAttribute(), null, "orderAttributes", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderDate(), ecorePackage.getEDate(), "orderDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderDeliverySchedules(), this.getOrderDeliverySchedule(), null, "orderDeliverySchedules", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderHeaderNotes(), this.getOrderHeaderNote(), null, "orderHeaderNotes", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderHeaderWorkEfforts(), this.getOrderHeaderWorkEffort(), null, "orderHeaderWorkEfforts", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderItemGroups(), this.getOrderItemGroup(), null, "orderItemGroups", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderItemShipGroups(), this.getOrderItemShipGroup(), null, "orderItemShipGroups", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderItems(), this.getOrderItem(), null, "orderItems", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderName(), ecorePackage.getEString(), "orderName", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderProductPromoCodes(), this.getOrderProductPromoCode(), null, "orderProductPromoCodes", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderType(), this.getOrderType(), null, "orderType", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OriginFacility(), theFacilityPackage.getFacility(), null, "originFacility", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_PickSheetPrintedDate(), ecorePackage.getEDate(), "pickSheetPrintedDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_Priority(), ecorePackage.getEString(), "priority", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_ProductPromoUses(), thePromoPackage.getProductPromoUse(), null, "productPromoUses", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_ProductStore(), theStorePackage.getProductStore(), null, "productStore", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_RemainingSubTotal(), ecorePackage.getEBigDecimal(), "remainingSubTotal", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_SalesChannelEnum(), theEnumPackage.getEnumeration(), null, "salesChannelEnum", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_SyncStatus(), theStatusPackage.getStatusItem(), null, "syncStatus", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TerminalId(), ecorePackage.getEString(), "terminalId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_TrackingCodeOrders(), theTrackingPackage.getTrackingCodeOrder(), null, "trackingCodeOrders", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TransactionId(), ecorePackage.getEString(), "transactionId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_WebSite(), theWebsitePackage_1.getWebSite(), null, "webSite", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEBoolean(), "isApprovable", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEBoolean(), "isCancellable", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEBoolean(), "isHoldable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderHeaderNoteEClass, OrderHeaderNote.class, "OrderHeaderNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderHeaderNote_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderHeaderNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeaderNote_InternalNote(), ecorePackage.getEBooleanObject(), "internalNote", null, 0, 1, OrderHeaderNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderHeaderWorkEffortEClass, OrderHeaderWorkEffort.class, "OrderHeaderWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderHeaderWorkEffort_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderHeaderWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeaderWorkEffort_WorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "workEffort", null, 1, 1, OrderHeaderWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemEClass, OrderItem.class, "OrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItem_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_AutoCancelDate(), ecorePackage.getEDate(), "autoCancelDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_BudgetId(), ecorePackage.getEString(), "budgetId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_BudgetItemSeqId(), ecorePackage.getEString(), "budgetItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CancelBackOrderDate(), ecorePackage.getEDate(), "cancelBackOrderDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_ChangeByUserLogin(), theLoginPackage.getUserLogin(), null, "changeByUserLogin", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CorrespondingPoId(), ecorePackage.getEString(), "correspondingPoId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DeploymentId(), ecorePackage.getEString(), "deploymentId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DontCancelSetDate(), ecorePackage.getEDate(), "dontCancelSetDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_DontCancelSetUserLogin(), theLoginPackage.getUserLogin(), null, "dontCancelSetUserLogin", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_EstimatedDeliveryDate(), ecorePackage.getEDate(), "estimatedDeliveryDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_FromInventoryItem(), theInventoryPackage.getInventoryItem(), null, "fromInventoryItem", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsItemGroupPrimary(), ecorePackage.getEBooleanObject(), "isItemGroupPrimary", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsModifiedPrice(), ecorePackage.getEBooleanObject(), "isModifiedPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsPromo(), ecorePackage.getEBooleanObject(), "isPromo", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OrderItemGroupSeqId(), ecorePackage.getEString(), "orderItemGroupSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_OrderItemType(), this.getOrderItemType(), null, "orderItemType", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_OverrideGlAccount(), theLedgerPackage.getGlAccount(), null, "overrideGlAccount", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProdCatalogId(), ecorePackage.getEString(), "prodCatalogId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_Product(), theProductPackage.getProduct(), null, "product", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductCategoryId(), ecorePackage.getEString(), "productCategoryId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_QuoteId(), ecorePackage.getEString(), "quoteId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_QuoteItemSeqId(), ecorePackage.getEString(), "quoteItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_RecurringFreqUom(), theUomPackage.getUom(), null, "recurringFreqUom", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ReserveAfterDate(), ecorePackage.getEDate(), "reserveAfterDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_SalesOpportunity(), theOpportunityPackage.getSalesOpportunity(), null, "salesOpportunity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SelectedAmount(), ecorePackage.getEBigDecimal(), "selectedAmount", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShipAfterDate(), ecorePackage.getEDate(), "shipAfterDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShipBeforeDate(), ecorePackage.getEDate(), "shipBeforeDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShoppingListId(), ecorePackage.getEString(), "shoppingListId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShoppingListItemSeqId(), ecorePackage.getEString(), "shoppingListItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SubscriptionId(), ecorePackage.getEString(), "subscriptionId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SupplierProductId(), ecorePackage.getEString(), "supplierProductId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_SyncStatus(), theStatusPackage.getStatusItem(), null, "syncStatus", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitAverageCost(), ecorePackage.getEBigDecimal(), "unitAverageCost", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitListPrice(), ecorePackage.getEBigDecimal(), "unitListPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitPrice(), ecorePackage.getEBigDecimal(), "unitPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitRecurringPrice(), ecorePackage.getEBigDecimal(), "unitRecurringPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemAssocEClass, OrderItemAssoc.class, "OrderItemAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemAssoc_OrderItemAssocType(), this.getOrderItemAssocType(), null, "orderItemAssocType", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemAssoc_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemAssoc_ToOrder(), this.getOrderHeader(), null, "toOrder", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToOrderItemSeqId(), ecorePackage.getEString(), "toOrderItemSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToShipGroupSeqId(), ecorePackage.getEString(), "toShipGroupSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemAssocTypeEClass, OrderItemAssocType.class, "OrderItemAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAssocType_OrderItemAssocTypeId(), ecorePackage.getEString(), "orderItemAssocTypeId", null, 1, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemAssocType_ParentType(), this.getOrderItemAssocType(), null, "parentType", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemAttributeEClass, OrderItemAttribute.class, "OrderItemAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemBillingEClass, OrderItemBilling.class, "OrderItemBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemBilling_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemBilling_Invoice(), theInvoicePackage.getInvoice(), null, "invoice", null, 1, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemBilling_ItemIssuance(), theIssuancePackage.getItemIssuance(), null, "itemIssuance", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemBilling_ShipmentReceipt(), theReceiptPackage.getShipmentReceipt(), null, "shipmentReceipt", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemChangeEClass, OrderItemChange.class, "OrderItemChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemChange_OrderItemChangeId(), ecorePackage.getEString(), "orderItemChangeId", null, 1, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeComments(), ecorePackage.getEString(), "changeComments", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeDatetime(), ecorePackage.getEDate(), "changeDatetime", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemChange_ChangeTypeEnum(), theEnumPackage.getEnumeration(), null, "changeTypeEnum", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemChange_ChangeUserLogin(), theLoginPackage.getUserLogin(), null, "changeUserLogin", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemChange_Order(), this.getOrderHeader(), null, "order", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemChange_ReasonEnum(), theEnumPackage.getEnumeration(), null, "reasonEnum", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_UnitPrice(), ecorePackage.getEBigDecimal(), "unitPrice", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemContactMechEClass, OrderItemContactMech.class, "OrderItemContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemContactMech_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemContactMech_ContactMechPurposeType(), theContactPackage_1.getContactMechPurposeType(), null, "contactMechPurposeType", null, 1, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemContactMech_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemContactMech_ContactMech(), theContactPackage_1.getContactMech(), null, "contactMech", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemGroupEClass, OrderItemGroup.class, "OrderItemGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemGroup_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_OrderItemGroupSeqId(), ecorePackage.getEString(), "orderItemGroupSeqId", null, 1, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_ParentGroupSeqId(), ecorePackage.getEString(), "parentGroupSeqId", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemGroupOrderEClass, OrderItemGroupOrder.class, "OrderItemGroupOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemGroupOrder_GroupOrder(), theProductPackage.getProductGroupOrder(), null, "groupOrder", null, 1, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroupOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroupOrder_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemPriceInfoEClass, OrderItemPriceInfo.class, "OrderItemPriceInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemPriceInfo_OrderItemPriceInfoId(), ecorePackage.getEString(), "orderItemPriceInfoId", null, 1, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ModifyAmount(), ecorePackage.getEBigDecimal(), "modifyAmount", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemPriceInfo_Order(), this.getOrderHeader(), null, "order", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ProductPriceActionSeqId(), ecorePackage.getEString(), "productPriceActionSeqId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemPriceInfo_ProductPriceRule(), thePricePackage.getProductPriceRule(), null, "productPriceRule", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_RateCode(), ecorePackage.getEString(), "rateCode", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemRoleEClass, OrderItemRole.class, "OrderItemRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemRole_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemRole_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemRole_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemShipGroupEClass, OrderItemShipGroup.class, "OrderItemShipGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemShipGroup_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_CarrierParty(), thePartyPackage_1.getParty(), null, "carrierParty", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_CarrierRoleTypeId(), ecorePackage.getEString(), "carrierRoleTypeId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_ContactMech(), theContactPackage_1.getContactMech(), null, "contactMech", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_EstimatedDeliveryDate(), ecorePackage.getEDate(), "estimatedDeliveryDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_GiftMessage(), ecorePackage.getEString(), "giftMessage", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_IsGift(), ecorePackage.getEBooleanObject(), "isGift", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_MaySplit(), ecorePackage.getEBooleanObject(), "maySplit", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipAfterDate(), ecorePackage.getEDate(), "shipAfterDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipByDate(), ecorePackage.getEDate(), "shipByDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_ShipmentMethodType(), theShipment_Package.getShipmentMethodType(), null, "shipmentMethodType", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShippingInstructions(), ecorePackage.getEString(), "shippingInstructions", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_SupplierAgreement(), theAgreementPackage.getAgreement(), null, "supplierAgreement", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_SupplierParty(), thePartyPackage_1.getParty(), null, "supplierParty", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_TelecomContactMech(), theContactPackage_1.getContactMech(), null, "telecomContactMech", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_TrackingNumber(), ecorePackage.getEString(), "trackingNumber", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_VendorParty(), thePartyPackage_1.getParty(), null, "vendorParty", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemShipGroupAssocEClass, OrderItemShipGroupAssoc.class, "OrderItemShipGroupAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemShipGroupAssoc_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemShipGrpInvResEClass, OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemShipGrpInvRes_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGrpInvRes_InventoryItem(), theInventoryPackage.getInventoryItem(), null, "inventoryItem", null, 1, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_CreatedDatetime(), ecorePackage.getEDate(), "createdDatetime", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_CurrentPromisedDate(), ecorePackage.getEDate(), "currentPromisedDate", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_OldPickStartDate(), ecorePackage.getEDate(), "oldPickStartDate", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_Priority(), ecorePackage.getEString(), "priority", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_PromisedDatetime(), ecorePackage.getEDate(), "promisedDatetime", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_QuantityNotAvailable(), ecorePackage.getEBigDecimal(), "quantityNotAvailable", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_ReserveOrderEnumId(), ecorePackage.getEString(), "reserveOrderEnumId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_ReservedDatetime(), ecorePackage.getEDate(), "reservedDatetime", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_SequenceId(), ecorePackage.getELong(), "sequenceId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemTypeEClass, OrderItemType.class, "OrderItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemType_OrderItemTypeId(), ecorePackage.getEString(), "orderItemTypeId", null, 1, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemType_OrderItemTypeAttrs(), this.getOrderItemTypeAttr(), null, "orderItemTypeAttrs", null, 0, -1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemType_ParentType(), this.getOrderItemType(), null, "parentType", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemTypeAttrEClass, OrderItemTypeAttr.class, "OrderItemTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderItemTypeAttr_OrderItemType(), this.getOrderItemType(), null, "orderItemType", null, 1, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderNotificationEClass, OrderNotification.class, "OrderNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderNotification_OrderNotificationId(), ecorePackage.getEString(), "orderNotificationId", null, 1, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderNotification_EmailType(), theEnumPackage.getEnumeration(), null, "emailType", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_NotificationDate(), ecorePackage.getEDate(), "notificationDate", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderNotification_Order(), this.getOrderHeader(), null, "order", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderPaymentPreferenceEClass, OrderPaymentPreference.class, "OrderPaymentPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderPaymentPreference_OrderPaymentPreferenceId(), ecorePackage.getEString(), "orderPaymentPreferenceId", null, 1, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_BillingPostalCode(), ecorePackage.getEString(), "billingPostalCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_FinAccount(), theFinaccountPackage.getFinAccount(), null, "finAccount", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ManualAuthCode(), ecorePackage.getEString(), "manualAuthCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ManualRefNum(), ecorePackage.getEString(), "manualRefNum", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_MaxAmount(), ecorePackage.getEBigDecimal(), "maxAmount", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_NeedsNsfRetry(), ecorePackage.getEBooleanObject(), "needsNsfRetry", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_Order(), this.getOrderHeader(), null, "order", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OverflowFlag(), ecorePackage.getEBooleanObject(), "overflowFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_PaymentMethod(), thePaymentPackage.getPaymentMethod(), null, "paymentMethod", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_PaymentMethodType(), thePaymentPackage.getPaymentMethodType(), null, "paymentMethodType", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_PresentFlag(), ecorePackage.getEBooleanObject(), "presentFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ProcessAttempt(), ecorePackage.getELong(), "processAttempt", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_ProductPricePurpose(), thePricePackage.getProductPricePurpose(), null, "productPricePurpose", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_SecurityCode(), ecorePackage.getEString(), "securityCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_SwipedFlag(), ecorePackage.getEBooleanObject(), "swipedFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_Track2(), ecorePackage.getEString(), "track2", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderProductPromoCodeEClass, OrderProductPromoCode.class, "OrderProductPromoCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderProductPromoCode_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderProductPromoCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderProductPromoCode_ProductPromoCode(), thePromoPackage.getProductPromoCode(), null, "productPromoCode", null, 1, 1, OrderProductPromoCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderRoleEClass, OrderRole.class, "OrderRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderRole_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderRole_Party(), thePartyPackage_1.getParty(), null, "party", null, 1, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderRole_RoleType(), thePartyPackage_1.getRoleType(), null, "roleType", null, 1, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderShipmentEClass, OrderShipment.class, "OrderShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderShipment_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderShipment_Shipment(), theShipment_Package.getShipment(), null, "shipment", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderStatusEClass, OrderStatus.class, "OrderStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderStatus_OrderStatusId(), ecorePackage.getEString(), "orderStatusId", null, 1, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_ChangeReason(), ecorePackage.getEString(), "changeReason", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderStatus_Order(), this.getOrderHeader(), null, "order", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderStatus_OrderPaymentPreference(), this.getOrderPaymentPreference(), null, "orderPaymentPreference", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderStatus_Status(), theStatusPackage.getStatusItem(), null, "status", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderStatus_StatusUserLogin(), theLoginPackage.getUserLogin(), null, "statusUserLogin", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderSummaryEntryEClass, OrderSummaryEntry.class, "OrderSummaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderSummaryEntry_Product(), theProductPackage.getProduct(), null, "product", null, 1, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderSummaryEntry_Facility(), theFacilityPackage.getFacility(), null, "facility", null, 1, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_EntryDate(), ecorePackage.getEDate(), "entryDate", null, 1, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_GrossSales(), ecorePackage.getEBigDecimal(), "grossSales", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_ProductCost(), ecorePackage.getEBigDecimal(), "productCost", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_TotalQuantity(), ecorePackage.getEBigDecimal(), "totalQuantity", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTermEClass, OrderTerm.class, "OrderTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderTerm_Order(), this.getOrderHeader(), null, "order", null, 1, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderTerm_TermType(), theAgreementPackage.getTermType(), null, "termType", null, 1, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TermDays(), ecorePackage.getELong(), "termDays", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TermValue(), ecorePackage.getEBigDecimal(), "termValue", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TextValue(), ecorePackage.getEString(), "textValue", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderTerm_Uom(), theUomPackage.getUom(), null, "uom", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTermAttributeEClass, OrderTermAttribute.class, "OrderTermAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTermAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_TermTypeId(), ecorePackage.getEString(), "termTypeId", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTypeEClass, OrderType.class, "OrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderType_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 1, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_HasTable(), ecorePackage.getEBooleanObject(), "hasTable", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderType_OrderTypeAttrs(), this.getOrderTypeAttr(), null, "orderTypeAttrs", null, 0, -1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderType_ParentType(), this.getOrderType(), null, "parentType", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTypeAttrEClass, OrderTypeAttr.class, "OrderTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderTypeAttr_OrderType(), this.getOrderType(), null, "orderType", null, 1, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productOrderItemEClass, ProductOrderItem.class, "ProductOrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductOrderItem_Order(), this.getOrderHeader(), null, "order", null, 1, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrderItem_Engagement(), this.getOrderHeader(), null, "engagement", null, 1, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_EngagementItemSeqId(), ecorePackage.getEString(), "engagementItemSeqId", null, 1, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrderItem_Product(), theProductPackage.getProduct(), null, "product", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workOrderItemFulfillmentEClass, WorkOrderItemFulfillment.class, "WorkOrderItemFulfillment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkOrderItemFulfillment_Order(), this.getOrderHeader(), null, "order", null, 1, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkOrderItemFulfillment_WorkEffort(), theWorkeffortPackage.getWorkEffort(), null, "workEffort", null, 1, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkOrderItemFulfillment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkOrderItemFulfillment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
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
		  (getCommunicationEventOrder_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCommunicationEventOrder_CommunicationEvent(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustment_AmountAlreadyIncluded(),
		   source,
		   new String[] {
			   "help", "The amount here is already represented in the price, such as VAT taxes."
		   });
		addAnnotation
		  (getOrderAdjustment_CustomerReferenceId(),
		   source,
		   new String[] {
			   "help", "for tax entries this is partyTaxId"
		   });
		addAnnotation
		  (getOrderAdjustment_ExemptAmount(),
		   source,
		   new String[] {
			   "help", "an amount that would normally apply, but not to this order; for tax exemption represents the what the tax would have been"
		   });
		addAnnotation
		  (getOrderAdjustment_OriginalAdjustment(),
		   source,
		   new String[] {
			   "help", "specifies relation to source OrderAdjustment - eg. for tax on shipping charges"
		   });
		addAnnotation
		  (getOrderAdjustment_OverrideGlAccount(),
		   source,
		   new String[] {
			   "help", "used to specify the override or actual glAccountId used for the adjustment, avoids problems if configuration changes after initial posting, etc"
		   });
		addAnnotation
		  (getOrderAdjustment_PrimaryGeo(),
		   source,
		   new String[] {
			   "help", "for tax entries this is the primary jurisdiction Geo (the smallest or most local Geo that this tax is for, usually a state/province, perhaps a county or a city)"
		   });
		addAnnotation
		  (getOrderAdjustment_SecondaryGeo(),
		   source,
		   new String[] {
			   "help", "for tax entries this is the secondary jurisdiction Geo (usually a country, or other Geo that the primary is within)"
		   });
		addAnnotation
		  (getOrderAdjustment_SourcePercentage(),
		   source,
		   new String[] {
			   "help", "for tax entries this is the tax percentage"
		   });
		addAnnotation
		  (getOrderAdjustment_TaxAuthGeoId(),
		   source,
		   new String[] {
			   "help", "these taxAuth fields deprecate the primaryGeoId and secondaryGeoId fields and will be used with the newer tax calc stuff"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_OrderAdjustment(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_OrderAdjustment(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_Invoice(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_OrderAdjustmentType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAttribute_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderBlacklist_OrderBlacklistType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderBlacklist_BlacklistString(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContactMech_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContactMech_ContactMech(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContactMech_ContactMechPurposeType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_Content(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_OrderContentType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeader_PickSheetPrintedDate(),
		   source,
		   new String[] {
			   "help", "This will be set to a date when pick sheet of the order is printed"
		   });
		addAnnotation
		  (getOrderHeader_Priority(),
		   source,
		   new String[] {
			   "help", "Sets priority for Inventory Reservation",
			   "generated", "false"
		   });
		addAnnotation
		  (getOrderHeaderNote_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeaderWorkEffort_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeaderWorkEffort_WorkEffort(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItem_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItem_CancelBackOrderDate(),
		   source,
		   new String[] {
			   "help", "Used to cancel all orders from suppliers when its in past"
		   });
		addAnnotation
		  (getOrderItem_ChangeByUserLogin(),
		   source,
		   new String[] {
			   "audit", "true"
		   });
		addAnnotation
		  (getOrderItem_OverrideGlAccount(),
		   source,
		   new String[] {
			   "help", "Used to specify the override or actual glAccountId used for the adjustment, avoids problems if configuration changes after initial posting, etc."
		   });
		addAnnotation
		  (getOrderItem_Quantity(),
		   source,
		   new String[] {
			   "audit", "true"
		   });
		addAnnotation
		  (getOrderItem_UnitPrice(),
		   source,
		   new String[] {
			   "audit", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderItemAssocType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToOrder(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToOrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAttribute_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAttribute_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_Invoice(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemContactMech_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemContactMech_ContactMechPurposeType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemContactMech_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroup_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroup_OrderItemGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_GroupOrder(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_CarrierParty(),
		   source,
		   new String[] {
			   "audit", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_ShipmentMethodType(),
		   source,
		   new String[] {
			   "audit", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_VendorParty(),
		   source,
		   new String[] {
			   "help", "For use with multi-vendor stores, order will be split so that each ship group is associated with only one vendor (only if applicable)"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_InventoryItem(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_Priority(),
		   source,
		   new String[] {
			   "help", "Sets priority for Inventory Reservation"
		   });
		addAnnotation
		  (getOrderItemTypeAttr_OrderItemType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderPaymentPreference_FinAccount(),
		   source,
		   new String[] {
			   "help", "For paying with a fin account instead of payment method on file"
		   });
		addAnnotation
		  (getOrderPaymentPreference_SecurityCode(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "NOTE: THIS SHOULD NEVER BE PERSISTED OUTSIDE THE SCOPE OF A SINGLE TRANSACTION,\n              TYPICALLY ONLY FOR AUTHORIZATION PURPOSES, SHOULD BE REMOVED IMMEDIATELY FOLLOWING USE;\n              this is the 3 digit on back (for Visa, MC, etc) or 4 digit on front (Amex, etc) card\n              verification code; also note that this field is longer than needed to accommodate encryption."
		   });
		addAnnotation
		  (getOrderPaymentPreference_Track2(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "NOTE: THIS SHOULD NEVER BE PERSISTED OUTSIDE THE SCOPE OF A SINGLE TRANSACTION,\n              TYPICALLY ONLY FOR AUTHORIZATION PURPOSES, SHOULD BE REMOVED IMMEDIATELY FOLLOWING USE;\n              this is raw track2 data, exactly as read by the magnetic swipe reader;\n              also note that this field is longer than needed to accommodate encryption."
		   });
		addAnnotation
		  (getOrderProductPromoCode_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderProductPromoCode_ProductPromoCode(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderRole_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderRole_Party(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderRole_RoleType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_Shipment(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderSummaryEntry_Product(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderSummaryEntry_Facility(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderSummaryEntry_EntryDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTerm_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTerm_TermType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTerm_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_TermTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTypeAttr_OrderType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_Engagement(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_EngagementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_Order(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_WorkEffort(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_OrderItemSeqId(),
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
		  (orderAdjustmentEClass,
		   source,
		   new String[] {
			   "help", "Note that both includeInTax and includeInShipping should default to true, except in the case where this adjustment is a tax or shipping adjustment then should be ignored.",
			   "formula", "description"
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (orderAdjustmentTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Order Adjustment Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (orderBlacklistTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (orderContactMechEClass,
		   source,
		   new String[] {
			   "title", "Order Contact Mechanism"
		   });
		addAnnotation
		  (orderContentEClass,
		   source,
		   new String[] {
			   "title", "Order Data Object"
		   });
		addAnnotation
		  (orderContentTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (orderDeliveryScheduleEClass,
		   source,
		   new String[] {
			   "title", "The Order Delivery Schedule"
		   });
		addAnnotation
		  (orderItemAssocTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemContactMechEClass,
		   source,
		   new String[] {
			   "title", "Order Item Contact Mechanism"
		   });
		addAnnotation
		  (orderItemPriceInfoEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemShipGroupAssocEClass,
		   source,
		   new String[] {
			   "title", "Order Item Package Association"
		   });
		addAnnotation
		  (orderItemShipGrpInvResEClass,
		   source,
		   new String[] {
			   "title", "Order Item Inventory Reservation"
		   });
		addAnnotation
		  (orderItemTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Order Item Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass,
		   source,
		   new String[] {
			   "title", "The Order Payment Preference"
		   });
		addAnnotation
		  (orderTermEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (orderTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Order Type Attribute",
			   "formula", "description"
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
		  (getOrderAdjustment_OrderAdjustmentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_Amount(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getOrderAdjustment_AmountAlreadyIncluded(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getOrderAdjustment_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getOrderAdjustment_CorrespondingProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_CustomerReferenceId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderAdjustment_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderAdjustment_ExemptAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderAdjustment_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderAdjustment_OldAmountPerQuantity(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderAdjustment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_ProductFeatureId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_ProductPromoActionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_ProductPromoRuleId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_RecurringAmount(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getOrderAdjustment_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_SourcePercentage(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderAdjustment_SourceReferenceId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderAdjustment_TaxAuthGeoId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustment_TaxAuthPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderAdjustmentType_OrderAdjustmentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderAdjustmentType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderBlacklist_BlacklistString(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderBlacklistType_OrderBlacklistTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderBlacklistType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderContent_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderContentType_OrderContentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderContentType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_Cartons(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_SkidsPallets(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_TotalCubicSize(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_TotalWeight(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_UnitsPieces(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderHeader_OrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderHeader_AgreementId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderHeader_ExternalId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderHeader_FirstAttemptOrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderHeader_GrandTotal(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderHeader_InternalCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderHeader_OrderName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getOrderHeader_RemainingSubTotal(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderHeader_TerminalId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderHeader_TransactionId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderHeader_VisitId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_BudgetId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_BudgetItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_CancelQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItem_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getOrderItem_CorrespondingPoId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_DeploymentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_ExternalId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_ItemDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderItem_OrderItemGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_ProdCatalogId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_ProductCategoryId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_ProductFeatureId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItem_QuoteId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_QuoteItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_SelectedAmount(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItem_ShoppingListId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_ShoppingListItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_SubscriptionId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItem_SupplierProductId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderItem_UnitAverageCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderItem_UnitListPrice(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getOrderItem_UnitPrice(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getOrderItem_UnitRecurringPrice(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAssoc_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToOrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAssoc_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemAssocType_OrderItemAssocTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAssocType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderItemAttribute_OrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAttribute_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderItemAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderItemBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemBilling_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemBilling_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderItemBilling_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemChange_OrderItemChangeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemChange_CancelQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemChange_ChangeComments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getOrderItemChange_ItemDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderItemChange_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemChange_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemChange_UnitPrice(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderItemContactMech_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemGroup_OrderItemGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemGroup_GroupName(),
		   source,
		   new String[] {
			   "type", "name"
		   });
		addAnnotation
		  (getOrderItemGroup_ParentGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_OrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_OrderItemPriceInfoId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_ModifyAmount(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_ProductPriceActionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_RateCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderItemRole_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGroup_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGroup_CarrierRoleTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGroup_GiftMessage(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderItemShipGroup_ShippingInstructions(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderItemShipGroup_TrackingNumber(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_CancelQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_QuantityNotAvailable(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_ReserveOrderEnumId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_SequenceId(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getOrderItemType_OrderItemTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderItemType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderItemTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderNotification_OrderNotificationId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderNotification_Comments(),
		   source,
		   new String[] {
			   "type", "comment"
		   });
		addAnnotation
		  (getOrderPaymentPreference_OrderPaymentPreferenceId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderPaymentPreference_BillingPostalCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderPaymentPreference_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderPaymentPreference_ManualAuthCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderPaymentPreference_ManualRefNum(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderPaymentPreference_MaxAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderPaymentPreference_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderPaymentPreference_ProcessAttempt(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getOrderPaymentPreference_SecurityCode(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderPaymentPreference_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderPaymentPreference_Track2(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderShipment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderShipment_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderShipment_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderShipment_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderStatus_OrderStatusId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderStatus_ChangeReason(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderStatus_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderSummaryEntry_GrossSales(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderSummaryEntry_ProductCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderSummaryEntry_TotalQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getOrderTerm_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderTerm_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderTerm_TermDays(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getOrderTerm_TermValue(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getOrderTerm_TextValue(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderTermAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderTermAttribute_OrderId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderTermAttribute_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderTermAttribute_TermTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderTermAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderTermAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getOrderType_OrderTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getOrderType_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getOrderTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getOrderTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description"
		   });
		addAnnotation
		  (getProductOrderItem_EngagementItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getProductOrderItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
	}

} //OrderPackageImpl
