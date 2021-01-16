/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.order.order.OrderContactMech;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderItem;
import org.abchip.mimo.biz.model.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.model.order.order.OrderItemShipGroupAssoc;
import org.abchip.mimo.biz.model.order.order.OrderItemType;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.model.order.order.OrderRole;
import org.abchip.mimo.biz.model.order.order.OrderStatus;
import org.abchip.mimo.biz.model.order.order.OrderType;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.product.ProductCalculatedInfo;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.product.supplier.SupplierProduct;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.order.RecalcTaxTotal;
import org.abchip.mimo.biz.service.order.RecalcTaxTotalResponse;
import org.abchip.mimo.biz.service.order.ResetGrandTotal;
import org.abchip.mimo.biz.service.order.ResetGrandTotalResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalculatePurchasePrice;
import org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse;
import org.abchip.mimo.biz.service.product.GetProductDefault;
import org.abchip.mimo.biz.service.product.GetProductDefaultResponse;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class CreatePurchaseOrder implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(CreatePurchaseOrder.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;
	GetProductDefaultResponse productDefault;

	Party party;
	List<SupplierProduct> supplierProducts;

	public CreatePurchaseOrder(Context context, Party party, List<SupplierProduct> supplierProducts) {
		this.context = context;
		this.party = party;
		this.supplierProducts = supplierProducts;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		GetProductDefault getProductDefault = serviceManager.prepare(GetProductDefault.class);
		productDefault = serviceManager.execute(getProductDefault);

		long time1 = System.currentTimeMillis();
		createOrder(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createOrder(ServiceManager serviceManager) throws ResourceException, ServiceException {
		ProductStore productStore = StressTestUtils.getProductStore(context);
		UserLogin userLogin = context.createProxy(UserLogin.class, context.getContextDescription().getUser());

		// Order Header
		ResourceWriter<OrderHeader> orderHeaderWriter = context.getResourceManager().getResourceWriter(OrderHeader.class);
		OrderHeader orderHeader = orderHeaderWriter.make();
		orderHeader.setOrderType(context.createProxy(OrderType.class, "PURCHASE_ORDER"));
		orderHeader.setProductStore(productStore);
		orderHeader.setSalesChannelEnum(context.createProxy(Enumeration.class, "UNKNWN_SALES_CHANNEL"));
		orderHeader.setOrderDate(new Date());
		orderHeader.setEntryDate(new Date());
		orderHeader.setStatus(context.createProxy(StatusItem.class, "ORDER_CREATED"));
		orderHeader.setCurrencyUom(commonDefault.getCurrencyUom());
		orderHeader.setInvoicePerShipment(Boolean.TRUE);
		orderHeader.setPriority("2");
		orderHeader.setCreatedBy(userLogin);
		// orderHeader.setRemainingSubTotal(new BigDecimal(10));
		// orderHeader.setGrandTotal(new BigDecimal(10));
		orderHeaderWriter.create(orderHeader);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = context.getResourceManager().getResourceWriter(OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrder(orderHeader);
		orderStatus.setStatus(context.createProxy(StatusItem.class, "ORDER_CREATED"));
		orderStatus.setStatusUserLogin(userLogin);
		orderStatusWriter.create(orderStatus);

		// OrderContactMech
		createContactMech(party.getEmail(), orderHeader, "ORDER_EMAIL");
		createContactMech(productDefault.getFacilityPostalAddress(), orderHeader, "SHIPPING_LOCATION");

		// OrderItemShipGroup
		ResourceWriter<OrderItemShipGroup> orderItemShipGroupWriter = context.getResourceManager().getResourceWriter(OrderItemShipGroup.class);
		OrderItemShipGroup orderItemShipGroup = orderItemShipGroupWriter.make();
		orderItemShipGroup.setOrder(orderHeader);
		orderItemShipGroup.setShipmentMethodType(context.createProxy(ShipmentMethodType.class, "STANDARD"));
		orderItemShipGroup.setCarrierParty(context.createProxy(Party.class, "_NA_"));
		orderItemShipGroup.setCarrierRoleTypeId("CARRIER");
		orderItemShipGroup.setFacility(context.createProxy(Facility.class, "WebStoreWarehouse"));
		orderItemShipGroup.setContactMech(partyDefault.getOrganization().getPostalAddress());

		orderItemShipGroupWriter.create(orderItemShipGroup);

		// OrderItem
		long i = 1;
		for (SupplierProduct supplierProduct : this.supplierProducts) {
			createOrderItem(serviceManager, orderHeader, StressTestUtils.formatPaddedNumber(i++, 5), orderItemShipGroup.getShipGroupSeqId(), 1, supplierProduct);
		}
		// OrderRole
		ResourceWriter<OrderRole> orderRoleWriter = context.getResourceManager().getResourceWriter(OrderRole.class);
		OrderRole orderRole = orderRoleWriter.make();
		orderRole.setOrder(orderHeader);
		orderRole.setParty(partyDefault.getOrganization());
		orderRole.setRoleType(context.createProxy(RoleType.class, "BILL_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrder(orderHeader);
		orderRole.setParty(party);
		orderRole.setRoleType(context.createProxy(RoleType.class, "SHIP_FROM_VENDOR"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrder(orderHeader);
		orderRole.setParty(party);
		orderRole.setRoleType(context.createProxy(RoleType.class, "BILL_FROM_VENDOR"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrder(orderHeader);
		orderRole.setParty(party);
		orderRole.setRoleType(context.createProxy(RoleType.class, "SUPPLIER_AGENT"));
		orderRoleWriter.create(orderRole);

		// OrderPaymentPreference
		ResourceWriter<OrderPaymentPreference> orderPaymentPreferenceWriter = context.getResourceManager().getResourceWriter(OrderPaymentPreference.class);
		OrderPaymentPreference orderPaymentPreference = orderPaymentPreferenceWriter.make();
		orderPaymentPreference.setOrder(orderHeader);
		orderPaymentPreference.setStatus(context.createProxy(StatusItem.class, "PAYMENT_NOT_RECEIVED"));
		orderPaymentPreference.setPaymentMethodType(context.createProxy(PaymentMethodType.class, "EXT_COD"));
		orderPaymentPreferenceWriter.create(orderPaymentPreference);

		// Ricalcolo tasse servizio recalcTaxTotal
		RecalcTaxTotal recalcTaxTotal = serviceManager.prepare(RecalcTaxTotal.class);
		recalcTaxTotal.setOrderId(orderHeader.getOrderId());
		RecalcTaxTotalResponse recalcTaxTotalresponse = serviceManager.execute(recalcTaxTotal);
		if (recalcTaxTotalresponse.onError()) {
			LOGGER.error(recalcTaxTotalresponse.getErrorMessage());
		}

		// Update Total OrderHeader
		ResetGrandTotal resetGrandTotal = serviceManager.prepare(ResetGrandTotal.class);
		resetGrandTotal.setOrderId(orderHeader.getOrderId());
		ResetGrandTotalResponse grandTotalresponse = serviceManager.execute(resetGrandTotal);
		if (grandTotalresponse.onError()) {
			LOGGER.error(grandTotalresponse.getErrorMessage());
		}
	}

	private void createOrderItem(ServiceManager serviceManager, OrderHeader orderHeader, String itemSeqiD, String shipGroupSeqId, int quantity, SupplierProduct supplierProduct) throws ResourceException, ServiceException {
		ResourceWriter<OrderItem> orderItemWriter = context.getResourceManager().getResourceWriter(OrderItem.class);

		// TODO utilizzare Servizio calculatePurchasePrice per calcolo prezzo

		OrderItem orderItem = orderItemWriter.make();
		orderItem.setOrder(orderHeader);
		orderItem.setOrderItemSeqId(itemSeqiD);
		orderItem.setOrderItemType(context.createProxy(OrderItemType.class, "PRODUCT_ORDER_ITEM"));
		orderItem.setProdCatalogId("ABChipTest");
		orderItem.setProduct(supplierProduct.getProduct());
		orderItem.setSupplierProductId(supplierProduct.getSupplierProductId());
		orderItem.setIsPromo(false);
		orderItem.setIsModifiedPrice(false);
		orderItem.setItemDescription(supplierProduct.getProduct().getProductName());
		orderItem.setStatus(context.createProxy(StatusItem.class, "ITEM_CREATED"));
		orderItem.setQuantity(new BigDecimal(quantity));
		
		// price calculation
		CalculatePurchasePrice calculatePurchasePrice = serviceManager.prepare(CalculatePurchasePrice.class);
		calculatePurchasePrice.setProduct(orderItem.getProduct());
		calculatePurchasePrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());
		calculatePurchasePrice.setPartyId(party.getID());
		calculatePurchasePrice.setQuantity(orderItem.getQuantity());
		calculatePurchasePrice.setAgreementId(orderHeader.getAgreementId());

		CalculatePurchasePriceResponse response = serviceManager.execute(calculatePurchasePrice);
		if (response.onError())
			LOGGER.error(response.getErrorMessage());

		if (response.isValidPriceFound()) {
			orderItem.setUnitPrice(response.getPrice());
		} else
			LOGGER.error("Prezzo non valido per articolo " + orderItem.getProduct());
		
		orderItemWriter.create(orderItem);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = context.getResourceManager().getResourceWriter(OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrder(orderHeader);
		orderStatus.setOrderItemSeqId(itemSeqiD);
		orderStatus.setStatus(context.createProxy(StatusItem.class, "ITEM_CREATED"));
		orderStatus.setStatusUserLogin(context.createProxy(UserLogin.class, context.getContextDescription().getUser()));
		orderStatusWriter.create(orderStatus);

		// OrderItemShipGroupAssoc
		ResourceWriter<OrderItemShipGroupAssoc> orderItemShipGroupAssocWriter = context.getResourceManager().getResourceWriter(OrderItemShipGroupAssoc.class);
		OrderItemShipGroupAssoc orderItemShipGroupAssoc = orderItemShipGroupAssocWriter.make();
		orderItemShipGroupAssoc.setOrder(orderHeader);
		orderItemShipGroupAssoc.setOrderItemSeqId(itemSeqiD);
		orderItemShipGroupAssoc.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroupAssoc.setQuantity(new BigDecimal(quantity));
		orderItemShipGroupAssocWriter.create(orderItemShipGroupAssoc);

		// TODO OrderItemPriceInfo (necessario???)

		// ProductCalculatedInfo
		ResourceWriter<ProductCalculatedInfo> productCalculatedInfoWriter = context.getResourceManager().getResourceWriter(ProductCalculatedInfo.class);

		if (productCalculatedInfoWriter.lookup(supplierProduct.getProduct().getID()) == null) {
			ProductCalculatedInfo productCalculatedInfo = productCalculatedInfoWriter.make();
			productCalculatedInfo.setProductId(supplierProduct.getProduct().getID());
			productCalculatedInfo.setTotalQuantityOrdered(new BigDecimal(quantity));
			productCalculatedInfoWriter.create(productCalculatedInfo);
		}
	}

	private void createContactMech(ContactMech contactMech, OrderHeader orderHeader, String purposeType) throws ResourceException {
		if (contactMech != null) {
			ResourceWriter<OrderContactMech> orderContactMechWriter = context.getResourceManager().getResourceWriter(OrderContactMech.class);
			OrderContactMech orderContactMech = orderContactMechWriter.make();
			orderContactMech.setOrder(orderHeader);
			orderContactMech.setContactMechPurposeType(context.createProxy(ContactMechPurposeType.class, purposeType));
			orderContactMech.setContactMech(contactMech);
			orderContactMechWriter.create(orderContactMech);
		}
	}
}
