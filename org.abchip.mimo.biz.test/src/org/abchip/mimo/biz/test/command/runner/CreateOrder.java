package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItem;
import org.abchip.mimo.biz.order.order.OrderItemType;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.order.order.OrderRole;
import org.abchip.mimo.biz.order.order.OrderStatus;
import org.abchip.mimo.biz.order.order.OrderType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyRole;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateOrder implements Callable<Long> {

	Context context;

	public CreateOrder(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createOrder();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	@SuppressWarnings("unused")
	private void createOrder() {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);

		String filter = "partyId >= '10000'";
		Party partyEntity = null;
		for (Party party : partyReader.find(filter)) {
			for (PartyRole partyRole : party.getPartyRoles()) {
				if (!partyRole.getRoleTypeId().getID().equals("CUSTOMER"))
					continue;
				partyEntity = party;
			}
			if (partyEntity != null)
				break;
		}

		if (partyEntity == null) {
			System.err.println("Nessun Party di tipo customer trovato operazione annullata");
			return;
		}

		if (true)
			return;

		filter = "productId >= '10000'";
		Product productEntity = null;
		for (Product product : productReader.find(filter)) {
			if (!product.getProductTypeId().getID().equals("DIGITAL_GOOD"))
				continue;
			productEntity = product;
			break;
		}

		if (productEntity == null) {
			System.err.println("Nessun Product di tipo customer trovato operazione annullata");
			return;
		}

		ResourceReader<ProductStore> productStoreReader = resourceManager.getResourceReader(context, ProductStore.class);
		ProductStore productStore = productStoreReader.lookup("9000");
		if (productStore == null) {
			System.err.println("Nessun ProductStore trovato operazione annullata");
			return;
		}

		// test PRODUCT_CATALOG_ID TestCatalog

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		UserLogin userLogin = userLoginReader.lookup("test");

		// Order Header
		ResourceWriter<OrderHeader> orderHeaderWriter = resourceManager.getResourceWriter(context, OrderHeader.class);
		OrderHeader orderHeader = orderHeaderWriter.make(true);

		if (productStore.getOrderNumberPrefix() != null)
			orderHeader.setOrderId(productStore.getOrderNumberPrefix() + orderHeader.getOrderId());

		orderHeader.setOrderTypeId(resourceManager.getFrame(context, OrderType.class).createProxy("SALES_ORDER"));
		orderHeader.setProductStoreId(productStore);
		orderHeader.setSalesChannelEnumId(resourceManager.getFrame(context, Enumeration.class).createProxy("UNKNWN_SALES_CHANNEL"));
		orderHeader.setOrderDate(new Date());
		orderHeader.setEntryDate(new Date());
		orderHeader.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ORDER_CREATED"));
		orderHeader.setCurrencyUom(resourceManager.getFrame(context, Uom.class).createProxy("EUR"));
		orderHeader.setInvoicePerShipment(Boolean.TRUE);
		orderHeader.setCreatedBy(userLogin);
		// orderHeader.setRemainingSubTotal(new BigDecimal(10));
		// orderHeader.setGrandTotal(new BigDecimal(10));
		orderHeaderWriter.create(orderHeader, true);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ORDER_CREATED"));
		orderStatus.setStatusUserLogin(userLogin);
		orderStatusWriter.create(orderStatus, true);

		// OrderContactMech

		// OrderItemShipGroup

		// OrderItem
		createOrderItem(context, orderHeader, "00001", productEntity, 1);

		// OrderRole
		ResourceWriter<OrderRole> orderRoleWriter = resourceManager.getResourceWriter(context, OrderRole.class);
		OrderRole orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(resourceManager.getFrame(context, Party.class).createProxy("Company"));
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_FROM_VENDOR"));
		orderRoleWriter.create(orderRole, true);

		// Party Role to partyId
		ResourceWriter<PartyRole> partyRoleWriter = resourceManager.getResourceWriter(context, PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(partyEntity);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(partyEntity);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(partyEntity);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(partyEntity);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(partyEntity);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("END_USER_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(partyEntity);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("END_USER_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(partyEntity);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("PLACING_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(partyEntity);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("PLACING_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		// OrderPaymentPreference
		ResourceWriter<OrderPaymentPreference> orderPaymentPreferenceWriter = resourceManager.getResourceWriter(context, OrderPaymentPreference.class);
		OrderPaymentPreference orderPaymentPreference = orderPaymentPreferenceWriter.make(true);
		orderPaymentPreference.setOrderId(orderHeader);
		orderPaymentPreference.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PAYMENT_NOT_RECEIVED"));
		orderPaymentPreference.setPaymentMethodTypeId(resourceManager.getFrame(context, PaymentMethodType.class).createProxy("EXT_COD"));
		orderPaymentPreferenceWriter.create(orderPaymentPreference, true);

		// Inventory
		//
		// TODO qui richiamare il servizio calcTax per aggiungere l'iva all'ordine
		// (OrderAdjustment) che poi sarà trasferita nella fattura
		//

		System.out.println("New order created: " + orderHeader.getOrderId());
	}

	private void createOrderItem(Context context, OrderHeader orderHeader, String itemSeqiD, Product item, int quantity) {

		ResourceManager resourceManager = context.get(ResourceManager.class);
		ResourceWriter<OrderItem> orderItemWriter = resourceManager.getResourceWriter(context, OrderItem.class);

		OrderItem orderItem = orderItemWriter.make();
		orderItem.setOrderId(orderHeader);
		orderItem.setOrderItemSeqId(itemSeqiD);
		orderItem.setOrderItemTypeId(resourceManager.getFrame(context, OrderItemType.class).createProxy("PRODUCT_ORDER_ITEM"));
		orderItem.setProdCatalogId("TestCatalog");

		orderItem.setProductId(item);
		orderItem.setItemDescription(item.getProductName());

		orderItem.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ITEM_CREATED"));
		orderItem.setQuantity(new BigDecimal(quantity));

		// TODO chiamare servizio calculateProductPrice
		orderItem.setUnitListPrice(new BigDecimal(1));
		orderItemWriter.create(orderItem, true);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setOrderItemSeqId(itemSeqiD);
		orderStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ITEM_CREATED"));
		orderStatus.setStatusUserLogin(resourceManager.getFrame(context, UserLogin.class).createProxy("test"));
		orderStatusWriter.create(orderStatus, true);

		// OrderItemShipGroupAssoc
		/*
		 * ResourceWriter<OrderItemShipGroupAssoc> orderItemShipGroupAssocWriter =
		 * resourceManager.getResourceWriter(context, OrderItemShipGroupAssoc.class);
		 * OrderItemShipGroupAssoc orderItemShipGroupAssoc =
		 * orderItemShipGroupAssocWriter.make();
		 * orderItemShipGroupAssoc.setOrderId(orderHeader);
		 * orderItemShipGroupAssoc.setOrderItemSeqId(itemSeqiD);
		 * orderItemShipGroupAssoc.setShipGroupSeqId(shipGroupSeqId);
		 * orderItemShipGroupAssoc.setQuantity(new BigDecimal(quantity));
		 * orderItemShipGroupAssocWriter.create(orderItemShipGroupAssoc, true);
		 */
	}

}
