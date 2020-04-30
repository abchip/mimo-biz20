/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
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
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class CreateSalesOrder implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(CreateSalesOrder.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;

	Party party;
	List<Product> products;

	public CreateSalesOrder(Context context, Party party, List<Product> products) {
		this.context = context;
		this.party = party;
		this.products = products;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(context, GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(context, GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();
		createOrder(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createOrder(ServiceManager serviceManager) throws ResourceException, ServiceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		ProductStore productStore = StressTestUtils.getProductStore(context, resourceManager);
		PartyAcctgPreference partyAcctgPreference = partyDefault.getAccountingPreference();
		UserLogin userLogin = context.createProxy(UserLogin.class, context.getContextDescription().getUser());

		// Order Header
		ResourceWriter<OrderHeader> orderHeaderWriter = resourceManager.getResourceWriter(context, OrderHeader.class);
		OrderHeader orderHeader = orderHeaderWriter.make(true);
		String orderId = orderHeader.getOrderId();
		if (partyAcctgPreference != null && partyAcctgPreference.getOrderIdPrefix() != null) {
			orderHeader.setOrderId(partyAcctgPreference.getOrderIdPrefix() + orderId);
		}
		if (productStore.getOrderNumberPrefix() != null)
			orderHeader.setOrderId(productStore.getOrderNumberPrefix() + orderId);

		orderHeader.setOrderTypeId(context.createProxy(OrderType.class, "SALES_ORDER"));
		orderHeader.setProductStoreId(productStore);
		orderHeader.setSalesChannelEnumId(context.createProxy(Enumeration.class, "UNKNWN_SALES_CHANNEL"));
		orderHeader.setOrderDate(new Date());
		orderHeader.setEntryDate(new Date());
		orderHeader.setStatusId(context.createProxy(StatusItem.class, "ORDER_CREATED"));
		orderHeader.setCurrencyUom(commonDefault.getCurrencyUom());
		orderHeader.setInvoicePerShipment(Boolean.TRUE);
		orderHeader.setCreatedBy(userLogin);
		// orderHeader.setRemainingSubTotal(new BigDecimal(10));
		// orderHeader.setGrandTotal(new BigDecimal(10));
		orderHeaderWriter.create(orderHeader);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setStatusId(context.createProxy(StatusItem.class, "ORDER_CREATED"));
		orderStatus.setStatusUserLogin(userLogin);
		orderStatusWriter.create(orderStatus);

		// OrderContactMech
		createContactMech(resourceManager, party.getEmail(), orderHeader, "ORDER_EMAIL");
		createContactMech(resourceManager, party.getPostalAddress(), orderHeader, "SHIPPING_LOCATION");

		// OrderItemShipGroup
		ResourceWriter<OrderItemShipGroup> orderItemShipGroupWriter = resourceManager.getResourceWriter(context, OrderItemShipGroup.class);
		String shipGroupSeqId = StressTestUtils.formatPaddedNumber(1, 5);
		OrderItemShipGroup orderItemShipGroup = orderItemShipGroupWriter.make();
		orderItemShipGroup.setOrderId(orderHeader);
		orderItemShipGroup.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroup.setShipmentMethodTypeId(context.createProxy(ShipmentMethodType.class, "NO_SHIPPING"));
		orderItemShipGroup.setCarrierPartyId(context.createProxy(Party.class, "_NA_"));
		orderItemShipGroup.setCarrierRoleTypeId("CARRIER");
		orderItemShipGroupWriter.create(orderItemShipGroup);

		// OrderItem
		long i = 1;
		long total = 0;
		for (Product product : this.products) {
			createOrderItem(resourceManager, serviceManager, orderHeader, StressTestUtils.formatPaddedNumber(i++, 5), shipGroupSeqId, 1, product);
			total++;
		}
		// OrderRole
		ResourceWriter<OrderRole> orderRoleWriter = resourceManager.getResourceWriter(context, OrderRole.class);
		OrderRole orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(partyDefault.getOrganization());
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_FROM_VENDOR"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "SHIP_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "PLACING_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "END_USER_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		// OrderPaymentPreference
		ResourceWriter<OrderPaymentPreference> orderPaymentPreferenceWriter = resourceManager.getResourceWriter(context, OrderPaymentPreference.class);
		OrderPaymentPreference orderPaymentPreference = orderPaymentPreferenceWriter.make(true);
		orderPaymentPreference.setOrderId(orderHeader);
		orderPaymentPreference.setStatusId(context.createProxy(StatusItem.class, "PAYMENT_NOT_RECEIVED"));
		orderPaymentPreference.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "EXT_COD"));
		orderPaymentPreferenceWriter.create(orderPaymentPreference);

		// Inventory
		//
		// TODO qui richiamare il servizio calcTax per aggiungere l'iva all'ordine
		// (OrderAdjustment) che poi sarà trasferita nella fattura
		//

		// TODO richiamare il servizio reserveStoreInventory per finalizzare l'ordine

		// TODO chiamare il servizio resetGrandTotal
		orderHeader.setGrandTotal(new BigDecimal(total));
		orderHeaderWriter.update(orderHeader);

	}

	private void createOrderItem(ResourceManager resourceManager, ServiceManager serviceManager, OrderHeader orderHeader, String itemSeqiD, String shipGroupSeqId, int quantity, Product product)
			throws ResourceException, ServiceException {
		ResourceWriter<OrderItem> orderItemWriter = resourceManager.getResourceWriter(context, OrderItem.class);

		OrderItem orderItem = orderItemWriter.make();
		orderItem.setOrderId(orderHeader);
		orderItem.setOrderItemSeqId(itemSeqiD);
		orderItem.setOrderItemTypeId(context.createProxy(OrderItemType.class, "PRODUCT_ORDER_ITEM"));
		orderItem.setProdCatalogId("ABChipTest");
		orderItem.setProductId(product);
		orderItem.setItemDescription(product.getProductName());
		orderItem.setStatusId(context.createProxy(StatusItem.class, "ITEM_CREATED"));
		orderItem.setQuantity(new BigDecimal(quantity));
		
		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(context, CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse response = serviceManager.execute(calculateProductPrice);
		if (response.isError())
			LOGGER.error("Errore in recupero prezzo articolo " + product.getID());

		if (response.isValidPriceFound()) {
			orderItem.setUnitListPrice(response.getListPrice());
			orderItem.setUnitPrice(response.getBasePrice());
		} else
			LOGGER.error("Prezzo non valido per articolo " + product.getID());

		orderItemWriter.create(orderItem);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setOrderItemSeqId(itemSeqiD);
		orderStatus.setStatusId(context.createProxy(StatusItem.class, "ITEM_CREATED"));
		orderStatus.setStatusUserLogin(context.createProxy(UserLogin.class, context.getContextDescription().getUser()));
		orderStatusWriter.create(orderStatus);

		// OrderItemShipGroupAssoc
		ResourceWriter<OrderItemShipGroupAssoc> orderItemShipGroupAssocWriter = resourceManager.getResourceWriter(context, OrderItemShipGroupAssoc.class);
		OrderItemShipGroupAssoc orderItemShipGroupAssoc = orderItemShipGroupAssocWriter.make();
		orderItemShipGroupAssoc.setOrderId(orderHeader);
		orderItemShipGroupAssoc.setOrderItemSeqId(itemSeqiD);
		orderItemShipGroupAssoc.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroupAssoc.setQuantity(new BigDecimal(quantity));
		orderItemShipGroupAssocWriter.create(orderItemShipGroupAssoc);
	}

	private void createContactMech(ResourceManager resourceManager, ContactMech contactMech, OrderHeader orderHeader, String purposeType) throws ResourceException {
		if (contactMech != null) {
			ResourceWriter<OrderContactMech> orderContactMechWriter = resourceManager.getResourceWriter(context, OrderContactMech.class);
			OrderContactMech orderContactMech = orderContactMechWriter.make();
			orderContactMech.setOrderId(orderHeader);
			orderContactMech.setContactMechPurposeTypeId(context.createProxy(ContactMechPurposeType.class, purposeType));
			orderContactMech.setContactMechId(contactMech);
			orderContactMechWriter.create(orderContactMech);
		}
	}
}
