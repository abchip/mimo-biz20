package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.base.service.ContactMechServices;
import org.abchip.mimo.biz.base.service.PartyServices;
import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.order.order.OrderContactMech;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItem;
import org.abchip.mimo.biz.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.order.order.OrderItemShipGroupAssoc;
import org.abchip.mimo.biz.order.order.OrderItemType;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.order.order.OrderRole;
import org.abchip.mimo.biz.order.order.OrderStatus;
import org.abchip.mimo.biz.order.order.OrderType;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateSalesOrder implements Callable<Long> {

	Context context;
	Party party;
	List<ProductPrice> productPrices;

	public CreateSalesOrder(Context context, Party party, List<ProductPrice> productPrices) {
		this.context = context;
		this.party = party;
		this.productPrices = productPrices;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createOrder();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createOrder() throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		ProductStore productStore = StressTestUtils.getProductStore(context, resourceManager);
		PartyAcctgPreference partyAcctgPreference = PartyServices.getPartyAcctgPreference(context);
		UserLogin userLogin = resourceManager.getFrame(context, UserLogin.class).createProxy("abchip-test");

		// Order Header
		ResourceWriter<OrderHeader> orderHeaderWriter = resourceManager.getResourceWriter(context, OrderHeader.class);
		OrderHeader orderHeader = orderHeaderWriter.make(true);
		String orderId = orderHeader.getOrderId();
		if (partyAcctgPreference != null && partyAcctgPreference.getOrderIdPrefix() != null) {
			orderHeader.setOrderId(partyAcctgPreference.getOrderIdPrefix() + orderId);
		}
		if (productStore.getOrderNumberPrefix() != null)
			orderHeader.setOrderId(productStore.getOrderNumberPrefix() + orderId);

		orderHeader.setOrderTypeId(resourceManager.getFrame(context, OrderType.class).createProxy("SALES_ORDER"));
		orderHeader.setProductStoreId(productStore);
		orderHeader.setSalesChannelEnumId(resourceManager.getFrame(context, Enumeration.class).createProxy("UNKNWN_SALES_CHANNEL"));
		orderHeader.setOrderDate(new Date());
		orderHeader.setEntryDate(new Date());
		orderHeader.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ORDER_CREATED"));
		orderHeader.setCurrencyUom(SystemDefault.getUom(context));
		orderHeader.setInvoicePerShipment(Boolean.TRUE);
		orderHeader.setCreatedBy(userLogin);
		// orderHeader.setRemainingSubTotal(new BigDecimal(10));
		// orderHeader.setGrandTotal(new BigDecimal(10));
		orderHeaderWriter.create(orderHeader);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ORDER_CREATED"));
		orderStatus.setStatusUserLogin(userLogin);
		orderStatusWriter.create(orderStatus);

		// OrderContactMech
		ContactMech contactMech = ContactMechServices.getLatestEmail(context, party.getID());
		if (contactMech != null) {
			ResourceWriter<OrderContactMech> orderContactMechWriter = resourceManager.getResourceWriter(context, OrderContactMech.class);
			OrderContactMech orderContactMech = orderContactMechWriter.make();
			orderContactMech.setOrderId(orderHeader);
			orderContactMech.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy("ORDER_EMAIL"));
			orderContactMech.setContactMechId(contactMech);
			orderContactMechWriter.create(orderContactMech);
		}

		// OrderItemShipGroup
		ResourceWriter<OrderItemShipGroup> orderItemShipGroupWriter = resourceManager.getResourceWriter(context, OrderItemShipGroup.class);
		String shipGroupSeqId = StressTestUtils.formatPaddedNumber(1, 5);
		OrderItemShipGroup orderItemShipGroup = orderItemShipGroupWriter.make();
		orderItemShipGroup.setOrderId(orderHeader);
		orderItemShipGroup.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroup.setShipmentMethodTypeId(resourceManager.getFrame(context, ShipmentMethodType.class).createProxy("NO_SHIPPING"));
		orderItemShipGroup.setCarrierPartyId(resourceManager.getFrame(context, Party.class).createProxy("_NA_"));
		orderItemShipGroup.setCarrierRoleTypeId("CARRIER");
		orderItemShipGroupWriter.create(orderItemShipGroup);

		// OrderItem
		long i = 1;
		long total = 0;
		for (ProductPrice productPrice : this.productPrices) {
			createOrderItem(resourceManager, orderHeader, StressTestUtils.formatPaddedNumber(i++, 5), shipGroupSeqId, 1, productPrice);
			total++;
		}
		// OrderRole
		ResourceWriter<OrderRole> orderRoleWriter = resourceManager.getResourceWriter(context, OrderRole.class);
		OrderRole orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(SystemDefault.getCompany(context));
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_FROM_VENDOR"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("PLACING_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("END_USER_CUSTOMER"));
		orderRoleWriter.create(orderRole);

		// OrderPaymentPreference
		ResourceWriter<OrderPaymentPreference> orderPaymentPreferenceWriter = resourceManager.getResourceWriter(context, OrderPaymentPreference.class);
		OrderPaymentPreference orderPaymentPreference = orderPaymentPreferenceWriter.make(true);
		orderPaymentPreference.setOrderId(orderHeader);
		orderPaymentPreference.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PAYMENT_NOT_RECEIVED"));
		orderPaymentPreference.setPaymentMethodTypeId(resourceManager.getFrame(context, PaymentMethodType.class).createProxy("EXT_COD"));
		orderPaymentPreferenceWriter.create(orderPaymentPreference);

		// Inventory
		//
		// TODO qui richiamare il servizio calcTax per aggiungere l'iva all'ordine
		// (OrderAdjustment) che poi sarà trasferita nella fattura
		//

		// TODO chiamare il servizio per i totali
		orderHeader.setGrandTotal(new BigDecimal(total));
		orderHeaderWriter.update(orderHeader);

	}

	private void createOrderItem(ResourceManager resourceManager, OrderHeader orderHeader, String itemSeqiD, String shipGroupSeqId, int quantity, ProductPrice productPrice) throws ResourceException {
		ResourceWriter<OrderItem> orderItemWriter = resourceManager.getResourceWriter(context, OrderItem.class);

		OrderItem orderItem = orderItemWriter.make();
		orderItem.setOrderId(orderHeader);
		orderItem.setOrderItemSeqId(itemSeqiD);
		orderItem.setOrderItemTypeId(resourceManager.getFrame(context, OrderItemType.class).createProxy("PRODUCT_ORDER_ITEM"));
		orderItem.setProdCatalogId("ABChipTest");
		orderItem.setProductId(productPrice.getProductId());
		orderItem.setItemDescription(productPrice.getProductId().getProductName());
		orderItem.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ITEM_CREATED"));
		orderItem.setQuantity(new BigDecimal(quantity));
		orderItem.setUnitPrice(productPrice.getPrice());
		orderItemWriter.create(orderItem);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setOrderItemSeqId(itemSeqiD);
		orderStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ITEM_CREATED"));
		orderStatus.setStatusUserLogin(resourceManager.getFrame(context, UserLogin.class).createProxy("test"));
		orderStatusWriter.create(orderStatus);

		// OrderItemShipGroupAssoc
		ResourceWriter<OrderItemShipGroupAssoc> orderItemShipGroupAssocWriter = resourceManager.getResourceWriter(context, OrderItemShipGroupAssoc.class);
		OrderItemShipGroupAssoc orderItemShipGroupAssoc = orderItemShipGroupAssocWriter.make();
		orderItemShipGroupAssoc.setOrderId(orderHeader);
		orderItemShipGroupAssoc.setOrderItemSeqId(itemSeqiD);
		orderItemShipGroupAssoc.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroupAssoc.setQuantity(new BigDecimal(quantity));
		orderItemShipGroupAssocWriter.create(orderItemShipGroupAssoc, true);
	}
}
