/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.command;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.abchip.mimo.biz.base.service.ContactMechServices;
import org.abchip.mimo.biz.base.service.PaymentServices;
import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.geo.Geo;
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
import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.biz.model.party.agreement.AgreementItem;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.model.party.agreement.AgreementType;
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.product.ProductType;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.plugins.entity.EntityUtils;
import org.abchip.mimo.biz.plugins.paymentGateway.StripePaymentManager;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.ofbiz.accounting.invoice.InvoiceWorker;
import org.apache.ofbiz.base.util.UtilFormatOut;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;
import org.apache.ofbiz.service.ServiceUtil;
import org.eclipse.osgi.framework.console.CommandInterpreter;

import com.stripe.Stripe;
import com.stripe.model.PaymentIntent;


public class BizTestCommands extends BaseCommands {

	@Inject
	private ResourceManager resourceManager;

	private static final String USER_LOGIN_ID = "abchip";
	private static final String approveOrderStatusId = "ORDER_APPROVED";
	private static final String holdOrderStatusId = "ORDER_HOLD";
	private static final String cancelOrderStatusId = "ORDER_CANCELLED";
	private static final String PRODUCT_STORE_ID = "8000";
	private static final String SHIPMENT_METHOD_TYPE_ID = "NO_SHIPPING";
	private static final String CARRIER_ID = "_NA_";
	private static final String PRODUCT_CATALOG_ID = "ABChipCatalog";

	private static final String TAX_AUTH_PARTY_ID = "ITA_ADE";
	private static final String TAX_AUTH_GEO_ID = "ITA";

	public <E extends EntityIdentifiable> void _login2(CommandInterpreter interpreter) throws Exception {
		this.login(nextArgument(interpreter));
	}

	public void _getCreditCardParty(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext();
		String partyId = nextArgument(interpreter);
		CreditCard creditCard = PaymentServices.getCreditCardParty(context, partyId);
		interpreter.println("Credit card number " + creditCard.getCardNumber());
	}

	public void _createAgreement(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext();
		String partyId = nextArgument(interpreter);
		createAgreement(interpreter, context, partyId);
	}

	public void _renewalAgreement(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext();
		String agreementId = nextArgument(interpreter);
		renewalAgreement(interpreter, context, agreementId);
	}

	public void _expireAgreement(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String agreementId = nextArgument(interpreter);

		if (agreementId == null) {
			interpreter.println("Invalid agreement!!!");
			return;
		}

		// check
		ResourceReader<Agreement> agreementReader = resourceManager.getResourceReader(context, Agreement.class);
		Agreement agreementEntity = agreementReader.lookup(agreementId);
		if (agreementEntity == null) {
			interpreter.println("Invalid agreement!!!");
			return;
		}

		if (agreementEntity.getThruDate() != null) {
			interpreter.println("Expire agreement " + agreementId + " not possible!!!");
			return;
		}

		ResourceWriter<Agreement> agreementWriter = resourceManager.getResourceWriter(context, Agreement.class);
		agreementEntity.setThruDate(new Date());
		agreementWriter.create(agreementEntity, true);

		interpreter.println("Agreement " + agreementId + " expired");
	}

	public void _createProduct(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext();
		String productId = nextArgument(interpreter);
		ResourceWriter<Product> productWriter = resourceManager.getResourceWriter(context, Product.class);
		Product product = productWriter.make();
		product.setProductId(productId);
		product.setInternalName(productId);
		product.setProductTypeId(resourceManager.getFrame(context, ProductType.class).createProxy("DIGITAL_GOOD"));
		productWriter.create(product, true);
	}

	public void _createOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String partyId = nextArgument(interpreter);

		createOrder(interpreter, context, partyId);
	}

	public void _createInvoice(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String partyId = nextArgument(interpreter);

		Invoice invoice = createInvoice(interpreter, context, partyId, "");

		// InvoiceItem
		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Accounting", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Edi", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Humanres", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Manufacturing", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Marketing", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Modeling", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Order", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Party", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Product", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Shipment", 1, "INV_DPROD_ITEM");
		createInvoiceItem(interpreter, context, delegator, dispatcher, invoice, "Workeffort", 1, "INV_DPROD_ITEM");

		interpreter.println("Creata fattura numero " + invoice.getInvoiceId());
		// Creazione pagamento
		String paymentId = createPaymentFromInvoice(interpreter, context, delegator, invoice);
		interpreter.println("Creato pagamento " + paymentId);

		// Receive payment (PMNT_RECEIVED)

		// if(setStatusPayment(context, paymentId, "PMNT_RECEIVED")) {
		// setStatusPayment(context, paymentId, "PMNT_CONFIRMED");
		// }
	}

	public void _approveOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String orderId = nextArgument(interpreter);

		if (orderId == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = resourceManager.getResourceReader(context, OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.isApprovable()) {
			interpreter.println("Approve order " + orderId + " not possible!!!");
			return;
		}

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);
		UserLogin userLoginEntity = userLoginReader.lookup(USER_LOGIN_ID);
		Map<String, Object> orderStatusContext = new HashMap<>();
		GenericValue userLogin = EntityUtils.toBizEntity(delegator, userLoginEntity);
		orderStatusContext.put("userLogin", userLogin);
		orderStatusContext.put("orderId", orderId);
		orderStatusContext.put("statusId", approveOrderStatusId);
		orderStatusContext.put("setItemStatus", "Y");
		Map<String, Object> orderStatusResult = new HashMap<>();

		try {
			orderStatusResult = dispatcher.runSync("changeOrderStatus", orderStatusContext);
			if (ServiceUtil.isError(orderStatusResult)) {
				interpreter.println("Error in set status");
				return;
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		interpreter.println("Order " + orderId + " approved");
	}

	public void _holdOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String orderId = nextArgument(interpreter);

		if (orderId == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = resourceManager.getResourceReader(context, OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.getStatusId().getStatusId().equals("ORDER_APPROVED")) {
			interpreter.println("Hold order " + orderId + " not possible!!!");
			return;
		}

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);
		UserLogin userLoginEntity = userLoginReader.lookup(USER_LOGIN_ID);
		Map<String, Object> orderStatusContext = new HashMap<>();
		GenericValue userLogin = EntityUtils.toBizEntity(delegator, userLoginEntity);
		orderStatusContext.put("userLogin", userLogin);
		orderStatusContext.put("orderId", orderId);
		orderStatusContext.put("statusId", holdOrderStatusId);
		orderStatusContext.put("setItemStatus", "Y");
		Map<String, Object> orderStatusResult = new HashMap<>();

		try {
			orderStatusResult = dispatcher.runSync("changeOrderStatus", orderStatusContext);
			if (ServiceUtil.isError(orderStatusResult)) {
				interpreter.println("Error in set status");
				return;
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		interpreter.println("Order " + orderId + " holded");
	}

	public void _cancelOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String orderId = nextArgument(interpreter);

		if (orderId == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = resourceManager.getResourceReader(context, OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.getStatusId().getStatusId().equals("ORDER_CANCELLED") && !orderHeaderEntity.getStatusId().getStatusId().equals("ORDER_COMPLETED")) {
			interpreter.println("Delete order " + orderId + " not possible!!!");
			return;
		}

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);
		UserLogin userLoginEntity = userLoginReader.lookup(USER_LOGIN_ID);
		Map<String, Object> orderStatusContext = new HashMap<>();
		GenericValue userLogin = EntityUtils.toBizEntity(delegator, userLoginEntity);
		orderStatusContext.put("userLogin", userLogin);
		orderStatusContext.put("orderId", orderId);
		orderStatusContext.put("statusId", cancelOrderStatusId);
		orderStatusContext.put("setItemStatus", "Y");
		Map<String, Object> orderStatusResult = new HashMap<>();

		try {
			orderStatusResult = dispatcher.runSync("changeOrderStatus", orderStatusContext);
			if (ServiceUtil.isError(orderStatusResult)) {
				interpreter.println("Error in set status");
				return;
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		interpreter.println("Order " + orderId + " deleted");
	}

	private void createOrder(CommandInterpreter interpreter, Context context, String partyId) throws ResourceException {

		Party party = resourceManager.getFrame(context, Party.class).createProxy(partyId);

		ResourceReader<ProductStore> productStoreReader = resourceManager.getResourceReader(context, ProductStore.class);
		ProductStore productStore = productStoreReader.lookup(PRODUCT_STORE_ID);

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		UserLogin userLogin = userLoginReader.lookup(USER_LOGIN_ID);

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
		orderHeader.setCurrencyUom(SystemDefault.getUom(context));
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
		ResourceWriter<OrderContactMech> orderContactMechWriter = resourceManager.getResourceWriter(context, OrderContactMech.class);
		OrderContactMech orderContactMech = orderContactMechWriter.make();
		orderContactMech.setOrderId(orderHeader);
		orderContactMech.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy("ORDER_EMAIL"));
		orderContactMech.setContactMechId(resourceManager.getFrame(context, ContactMech.class).createProxy(partyId));
		orderContactMechWriter.create(orderContactMech, true);

		// OrderItemShipGroup
		ResourceWriter<OrderItemShipGroup> orderItemShipGroupWriter = resourceManager.getResourceWriter(context, OrderItemShipGroup.class);
		String shipGroupSeqId = "00001";
		OrderItemShipGroup orderItemShipGroup = orderItemShipGroupWriter.make();
		orderItemShipGroup.setOrderId(orderHeader);
		orderItemShipGroup.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroup.setShipmentMethodTypeId(resourceManager.getFrame(context, ShipmentMethodType.class).createProxy(SHIPMENT_METHOD_TYPE_ID));
		orderItemShipGroup.setCarrierPartyId(resourceManager.getFrame(context, Party.class).createProxy(CARRIER_ID));
		orderItemShipGroup.setCarrierRoleTypeId("CARRIER");
		orderItemShipGroupWriter.create(orderItemShipGroup, true);

		// OrderItem
		String itemSeqiD = UtilFormatOut.formatPaddedNumber(1, 5);

		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);

		createOrderItem(interpreter, context, delegator, dispatcher, orderHeader, itemSeqiD, "Accounting", 1, shipGroupSeqId);
		// seqItemId++;
		// itemSeqiD = UtilFormatOut.formatPaddedNumber(seqItemId, 5);
		// createOrderItem(delegator, dispatcher, orderId, itemSeqiD, "TESTFLOW-ITEM-2",
		// 20, shipGroupSeqId);

		// OrderRole
		ResourceWriter<OrderRole> orderRoleWriter = resourceManager.getResourceWriter(context, OrderRole.class);
		OrderRole orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(SystemDefault.getCompany(context));
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_FROM_VENDOR"));
		orderRoleWriter.create(orderRole, true);

		// Party Role to partyId
		ResourceWriter<PartyRole> partyRoleWriter = resourceManager.getResourceWriter(context, PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("END_USER_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("END_USER_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("PLACING_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
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
		ResourceReader<OrderItemShipGroupAssoc> orderItemShipGroupAssocReader = resourceManager.getResourceReader(context, OrderItemShipGroupAssoc.class);
		ResourceReader<OrderItem> orderItemReader = resourceManager.getResourceReader(context, OrderItem.class);

		String filter = "orderId = \"" + orderHeader.getOrderId() + "\"";

		//
		// TODO qui richiamare il servizio calcTax per aggiungere l'iva all'ordine
		// (OrderAdjustment) che poi sarà trasferita nella fattura
		//

		try (EntityIterator<OrderItemShipGroupAssoc> orderItemShipGroupAssocs = orderItemShipGroupAssocReader.find(filter)) {
			for (OrderItemShipGroupAssoc orderItemShipGroupAssoc : orderItemShipGroupAssocs) {

				OrderItem orderItem = orderItemReader.lookup(orderHeader.getOrderId() + "/" + orderItemShipGroupAssoc.getOrderItemSeqId());

				// reserve the product
				Map<String, Object> reserveInput = new HashMap<>();
				reserveInput.put("productStoreId", PRODUCT_STORE_ID);
				reserveInput.put("productId", orderItem.getProductId().getProductId());
				reserveInput.put("orderId", orderItem.getOrderId().getOrderId());
				reserveInput.put("orderItemSeqId", orderItem.getOrderItemSeqId());
				reserveInput.put("shipGroupSeqId", orderItemShipGroupAssoc.getShipGroupSeqId());
				// verificare da dove prenderlo
				reserveInput.put("facilityId", null);
				// use the quantity from the orderItemShipGroupAssoc, NOT the orderItem, these
				// are reserved by item-group assoc
				reserveInput.put("quantity", orderItemShipGroupAssoc.getQuantity());

				GenericValue bizUserLogin = EntityUtils.toBizEntity(delegator, userLogin);
				reserveInput.put("userLogin", bizUserLogin);

				try {
					Map<String, Object> reserveResult = dispatcher.runSync("reserveStoreInventory", reserveInput);
					if (ServiceUtil.isError(reserveResult)) {
						String invErrMsg = "The product ";
						invErrMsg += orderItem.getProductId();
						invErrMsg += " with ID " + orderItem.getProductId() + " is no longer in stock. Please try reducing the quantity or removing the product from this order.";
						interpreter.println(invErrMsg);
					}
				} catch (GenericServiceException e) {
					e.printStackTrace();
				}
			}
		}
		// Update Total OrderHeader (OrderServices)
		Map<String, Object> updateOrder = new HashMap<>();
		updateOrder.put("orderId", orderHeader.getOrderId());
		Map<String, Object> updateOrderResult = new HashMap<>();
		try {
			updateOrderResult = dispatcher.runSync("resetGrandTotal", updateOrder);
			if (ServiceUtil.isError(updateOrderResult)) {
				interpreter.println("Errore in aggiornamento testata documento");
			}

		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		interpreter.println("New order created: " + orderHeader.getOrderId());
	}

	private void createOrderItem(CommandInterpreter interpreter, Context context, Delegator delegator, LocalDispatcher dispatcher, OrderHeader orderHeader, String itemSeqiD, String item, int quantity,
			String shipGroupSeqId) throws ResourceException {

		ResourceWriter<OrderItem> orderItemWriter = resourceManager.getResourceWriter(context, OrderItem.class);

		OrderItem orderItem = orderItemWriter.make();
		orderItem.setOrderId(orderHeader);
		orderItem.setOrderItemSeqId(itemSeqiD);
		orderItem.setOrderItemTypeId(resourceManager.getFrame(context, OrderItemType.class).createProxy("PRODUCT_ORDER_ITEM"));
		orderItem.setProdCatalogId(PRODUCT_CATALOG_ID);

		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);
		Product productEntity = productReader.lookup(item);
		orderItem.setProductId(productEntity);
		orderItem.setItemDescription(productEntity.getProductName());

		orderItem.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ITEM_CREATED"));
		orderItem.setQuantity(new BigDecimal(quantity));

		// get price
		// orderItem.setUnitPrice(new BigDecimal(10));

		Map<String, Object> priceContext = new HashMap<>();
		GenericValue product = EntityUtils.toBizEntity(delegator, productEntity);
		priceContext.put("product", product);
		priceContext.put("currencyUomId", SystemDefault.getUom(context).getID());
		Map<String, Object> priceResult = new HashMap<>();
		try {
			priceResult = dispatcher.runSync("calculateProductPrice", priceContext);
			if (ServiceUtil.isError(priceResult)) {
				interpreter.println("Errore in recupero prezzo articolo " + item);
			}
			Boolean validPriceFound = (Boolean) priceResult.get("validPriceFound");
			if (Boolean.FALSE.equals(validPriceFound)) {
				interpreter.println("Prezzo non valido per articolo " + item);
			}

			// (ShoppingCartItem)
			orderItem.setUnitPrice(new BigDecimal(10));
			if (priceResult.get("listPrice") != null) {
				orderItem.setUnitListPrice(((BigDecimal) priceResult.get("listPrice")));
			}

			if (priceResult.get("basePrice") != null) {
				orderItem.setUnitPrice(((BigDecimal) priceResult.get("basePrice")));
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		orderItemWriter.create(orderItem, true);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = resourceManager.getResourceWriter(context, OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setOrderItemSeqId(itemSeqiD);
		orderStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("ITEM_CREATED"));
		orderStatus.setStatusUserLogin(resourceManager.getFrame(context, UserLogin.class).createProxy(USER_LOGIN_ID));
		orderStatusWriter.create(orderStatus, true);

		// OrderItemShipGroupAssoc
		ResourceWriter<OrderItemShipGroupAssoc> orderItemShipGroupAssocWriter = resourceManager.getResourceWriter(context, OrderItemShipGroupAssoc.class);
		OrderItemShipGroupAssoc orderItemShipGroupAssoc = orderItemShipGroupAssocWriter.make();
		orderItemShipGroupAssoc.setOrderId(orderHeader);
		orderItemShipGroupAssoc.setOrderItemSeqId(itemSeqiD);
		orderItemShipGroupAssoc.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroupAssoc.setQuantity(new BigDecimal(quantity));
		orderItemShipGroupAssocWriter.create(orderItemShipGroupAssoc, true);
	}

	private Invoice createInvoice(CommandInterpreter interpreter, Context context, String partyId, String description) throws ResourceException {
		Party party = resourceManager.getFrame(context, Party.class).createProxy(partyId);
		Party partyFrom = SystemDefault.getCompany(context);

		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = resourceManager.getResourceWriter(context, Invoice.class);
		Invoice invoice = invoiceWriter.make(true);
		invoice.setInvoiceTypeId(resourceManager.getFrame(context, InvoiceType.class).createProxy("SALES_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(SystemDefault.getUom(context));
		invoice.setPartyId(party);
		invoice.setPartyIdFrom(partyFrom);
		if (!description.isEmpty())
			invoice.setDescription(description);
		invoiceWriter.create(invoice, true);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = resourceManager.getResourceWriter(context, InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("INVOICE_IN_PROCESS"));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus, true);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = resourceManager.getResourceWriter(context, InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy("PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(ContactMechServices.getLatestPostaAddress(context, partyId));
		invoiceContactMechWriter.create(invoiceContactMech, true);

		/*
		 * // InvoiceRole ResourceWriter<InvoiceRole> invoiceRoleWriter =
		 * resourceManager.getResourceWriter(context, InvoiceRole.class); InvoiceRole
		 * invoiceRole = InvoiceFactory.eINSTANCE.createInvoiceRole();
		 * invoiceRole.setInvoiceId(invoice);
		 * invoiceRole.setPartyId(resourceManager.getFrame(context,
		 * Party.class).createProxy(COMPANY_ID));
		 * invoiceRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("BILL_FROM_VENDOR"));
		 * invoiceRoleWriter.create(invoiceRole, true);
		 * 
		 * // Party Role to partyId ResourceWriter<PartyRole> partyRoleWriter =
		 * resourceManager.getResourceWriter(context, PartyRole.class); PartyRole
		 * partyRole = PartyFactory.eINSTANCE.createPartyRole();
		 * partyRole.setPartyId(party);
		 * partyRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		 * partyRoleWriter.create(partyRole, true);
		 * 
		 * invoiceRole = InvoiceFactory.eINSTANCE.createInvoiceRole();
		 * invoiceRole.setInvoiceId(invoice); invoiceRole.setPartyId(party);
		 * invoiceRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("BILL_TO_CUSTOMER"));
		 * invoiceRoleWriter.create(invoiceRole, true);
		 * 
		 * partyRole = PartyFactory.eINSTANCE.createPartyRole();
		 * partyRole.setPartyId(party);
		 * partyRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		 * partyRoleWriter.create(partyRole, true);
		 * 
		 * invoiceRole = InvoiceFactory.eINSTANCE.createInvoiceRole();
		 * invoiceRole.setInvoiceId(invoice); invoiceRole.setPartyId(party);
		 * invoiceRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
		 * invoiceRoleWriter.create(invoiceRole, true);
		 * 
		 * partyRole = PartyFactory.eINSTANCE.createPartyRole();
		 * partyRole.setPartyId(party);
		 * partyRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("END_USER_CUSTOMER"));
		 * partyRoleWriter.create(partyRole, true);
		 * 
		 * invoiceRole = InvoiceFactory.eINSTANCE.createInvoiceRole();
		 * invoiceRole.setInvoiceId(invoice); invoiceRole.setPartyId(party);
		 * invoiceRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("END_USER_CUSTOMER"));
		 * invoiceRoleWriter.create(invoiceRole, true);
		 * 
		 * partyRole = PartyFactory.eINSTANCE.createPartyRole();
		 * partyRole.setPartyId(party);
		 * partyRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("PLACING_CUSTOMER"));
		 * partyRoleWriter.create(partyRole, true);
		 * 
		 * invoiceRole = InvoiceFactory.eINSTANCE.createInvoiceRole();
		 * invoiceRole.setInvoiceId(invoice); invoiceRole.setPartyId(party);
		 * invoiceRole.setRoleTypeId(resourceManager.getFrame(context,
		 * RoleType.class).createProxy("PLACING_CUSTOMER"));
		 * invoiceRoleWriter.create(invoiceRole, true);
		 */

		return invoice;
	}

	private void createInvoiceItem(CommandInterpreter interpreter, Context context, Delegator delegator, LocalDispatcher dispatcher, Invoice invoice, String item, int quantity, String itemType) throws ResourceException {
		ResourceWriter<InvoiceItem> invoiceItemWriter = resourceManager.getResourceWriter(context, InvoiceItem.class);

		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);

		GenericValue invoiceItemValue = EntityUtils.toBizEntity(delegator, invoiceItem);
		String invoiceItemSeqId = getNextSubSeqId(delegator, invoiceItemValue, "invoiceItemSeqId");
		String saveInvoiceItemSeqId = invoiceItemSeqId;

		invoiceItem.setInvoiceItemSeqId(invoiceItemSeqId);
		invoiceItem.setInvoiceItemTypeId(resourceManager.getFrame(context, InvoiceItemType.class).createProxy(itemType));

		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);
		Product productEntity = productReader.lookup(item);
		invoiceItem.setProductId(productEntity);
		invoiceItem.setDescription(productEntity.getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));

		Map<String, Object> priceContext = new HashMap<>();
		GenericValue product = EntityUtils.toBizEntity(delegator, productEntity);
		priceContext.put("product", product);
		priceContext.put("currencyUomId", SystemDefault.getUom(context).getID());
		Map<String, Object> priceResult = new HashMap<>();

		BigDecimal price = new BigDecimal(0);
		try {
			priceResult = dispatcher.runSync("calculateProductPrice", priceContext);
			if (ServiceUtil.isError(priceResult)) {
				interpreter.println("Errore in recupero prezzo articolo " + item);
			}
			Boolean validPriceFound = (Boolean) priceResult.get("validPriceFound");
			if (Boolean.FALSE.equals(validPriceFound)) {
				interpreter.println("Prezzo non valido per articolo " + item);
			}

			if (priceResult.get("listPrice") != null) {
				price = ((BigDecimal) priceResult.get("listPrice"));
			}

			if (priceResult.get("basePrice") != null) {
				price = ((BigDecimal) priceResult.get("basePrice"));
			}

			invoiceItem.setTaxableFlag(productEntity.isTaxable());
			invoiceItem.setAmount(price);
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		invoiceItemWriter.create(invoiceItem, true);

		// check taxable
		ResourceReader<ProductStore> productStoreReader = resourceManager.getResourceReader(context, ProductStore.class);
		ProductStore productStore = productStoreReader.lookup(PRODUCT_STORE_ID);

		String filterTaxAuth = "taxAuthPartyId = '" + productStore.getVatTaxAuthPartyId() + "' AND taxAuthGeoId = '" + productStore.getVatTaxAuthGeoId() + "'";

		ResourceReader<TaxAuthorityRateProduct> taxAuthorityRateProductReader = resourceManager.getResourceReader(context, TaxAuthorityRateProduct.class);
		String taxAuthPartyId = "";
		String taxAuthGeoId = "";
		String taxAuthorityRateSeqId = "";

		try (EntityIterator<TaxAuthorityRateProduct> taxAuthorityRateProducts = taxAuthorityRateProductReader.find(filterTaxAuth, null, null, 1)) {
			for (TaxAuthorityRateProduct taxAuthorityRateProduct : taxAuthorityRateProducts) {
				taxAuthPartyId = taxAuthorityRateProduct.getTaxAuthPartyId();
				taxAuthGeoId = taxAuthorityRateProduct.getTaxAuthGeoId();
				taxAuthorityRateSeqId = taxAuthorityRateProduct.getTaxAuthorityRateSeqId();
			}
		}

		if (taxAuthPartyId == null || taxAuthPartyId.isEmpty())
			taxAuthPartyId = TAX_AUTH_PARTY_ID;

		if (taxAuthGeoId == null || taxAuthGeoId.isEmpty())
			taxAuthGeoId = TAX_AUTH_GEO_ID;

		Map<String, Object> taxContext = new HashMap<>();
		Map<String, Object> taxResult = new HashMap<>();

		taxContext.put("basePrice", price);
		taxContext.put("productId", item);
		taxContext.put("productStoreId", PRODUCT_STORE_ID);
		try {
			taxResult = dispatcher.runSync("calcTaxForDisplay", taxContext);
			if (ServiceUtil.isError(taxResult)) {
				interpreter.println("Errore in recupero tasse per articolo " + item);
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		BigDecimal taxTotal = null;

		if (taxResult.get("taxTotal") != null) {
			taxTotal = (BigDecimal) taxResult.get("taxTotal");
		}

		if (taxTotal.signum() > 0) {

			if (taxResult.get("taxTotal") != null) {
				Party taxAutPartyId = resourceManager.getFrame(context, Party.class).createProxy(taxAuthPartyId);
				Geo taxAutGeo = resourceManager.getFrame(context, Geo.class).createProxy(taxAuthGeoId);
				// result.put("taxTotal", taxTotal);
				// result.put("taxPercentage", taxPercentage);
				// result.put("priceWithTax", priceWithTax);

				invoiceItem = invoiceItemWriter.make();
				invoiceItem.setInvoiceId(invoice);

				invoiceItemValue = EntityUtils.toBizEntity(delegator, invoiceItem);
				invoiceItemSeqId = getNextSubSeqId(delegator, invoiceItemValue, "invoiceItemSeqId");

				invoiceItem.setInvoiceItemSeqId(invoiceItemSeqId);
				invoiceItem.setInvoiceItemTypeId(resourceManager.getFrame(context, InvoiceItemType.class).createProxy("ITM_SALES_TAX"));

				invoiceItem.setProductId(productEntity);

				invoiceItem.setParentInvoiceId(invoice.getID());
				invoiceItem.setParentInvoiceItemSeqId(saveInvoiceItemSeqId);

				invoiceItem.setQuantity(new BigDecimal(quantity));
				invoiceItem.setAmount((taxTotal));

				// TODO verify
				invoiceItem.setTaxAuthPartyId(taxAutPartyId);
				invoiceItem.setTaxAuthGeoId(taxAutGeo);
				if (!taxAuthorityRateSeqId.isEmpty()) {
					TaxAuthorityRateProduct taxAuthorityRateProduct = resourceManager.getFrame(context, TaxAuthorityRateProduct.class).createProxy(taxAuthorityRateSeqId);
					invoiceItem.setTaxAuthorityRateSeqId(taxAuthorityRateProduct);
				}

				invoiceItemWriter.create(invoiceItem, true);
			}
		}
	}

	private void createAgreement(CommandInterpreter interpreter, Context context, String partyId) throws ResourceException {

		Party partyFrom = SystemDefault.getCompany(context);
		Party partyTo = resourceManager.getFrame(context, Party.class).createProxy(partyId);

		RoleType roleTypeFrom = resourceManager.getFrame(context, RoleType.class).createProxy("INTERNAL_ORGANIZATIO");
		RoleType roleTypeTo = resourceManager.getFrame(context, RoleType.class).createProxy("CUSTOMER");
		AgreementType agreementType = resourceManager.getFrame(context, AgreementType.class).createProxy("SALES_AGREEMENT");

		// Agreement
		ResourceWriter<Agreement> agreementWriter = resourceManager.getResourceWriter(context, Agreement.class);

		Agreement agreement = agreementWriter.make(true);

		agreement.setPartyIdFrom(partyFrom);
		agreement.setPartyIdTo(partyTo);

		agreement.setRoleTypeIdFrom(roleTypeFrom);
		agreement.setRoleTypeIdTo(roleTypeTo);
		agreement.setAgreementTypeId(agreementType);
		agreement.setAgreementDate(new Date());
		agreement.setFromDate(new Date());
		agreement.setDescription("Open new agreement for customer " + partyId);

		agreementWriter.create(agreement, true);

		String agreementItemSeqId = createRow(context, agreement, "Agrement opened in trial mode");

		createRowProduct(interpreter, context, agreement, "Accounting", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Edi", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Humanres", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Manufacturing", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Marketing", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Modeling", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Order", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Party", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Product", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Shipment", agreementItemSeqId);
		createRowProduct(interpreter, context, agreement, "Workeffort", agreementItemSeqId);

	}

	private String createRow(Context context, Agreement agreement, String text) throws ResourceException {

		AgreementItemType agreementType = resourceManager.getFrame(context, AgreementItemType.class).createProxy("AGREEMENT_PRICING_PR");
		TermType termType = resourceManager.getFrame(context, TermType.class).createProxy("FIN_PAYMENT_FIXDAY");
		InvoiceItemType invoiceItemType = resourceManager.getFrame(context, InvoiceItemType.class).createProxy("INV_DPROD_ITEM");

		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = resourceManager.getResourceWriter(context, AgreementItem.class);

		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreementId(agreement);

		//
		Delegator delegator = DelegatorFactory.getDelegator(null);
		GenericValue agreementItemValue = EntityUtils.toBizEntity(delegator, agreementItem);
		String agreementItemSeqId = getNextSubSeqId(delegator, agreementItemValue, "agreementItemSeqId");

		// agreementItem.setAgreementItemSeqId("00001");
		agreementItem.setAgreementItemSeqId(agreementItemSeqId);
		agreementItem.setAgreementItemTypeId(agreementType);
		agreementItem.setCurrencyUomId("EUR");
		agreementItem.setAgreementText(text);
		agreementItemWriter.create(agreementItem, true);

		// AgreementTerm
		ResourceWriter<AgreementTerm> agreementTermWriter = resourceManager.getResourceWriter(context, AgreementTerm.class);
		AgreementTerm agreementTerm = agreementTermWriter.make(true);

		agreementTerm.setTermTypeId(termType);
		agreementTerm.setAgreementId(agreement);
		agreementTerm.setAgreementItemSeqId(agreementItemSeqId);
		agreementTerm.setInvoiceItemTypeId(invoiceItemType);
		Date date1 = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		cal.add(Calendar.MONTH, 1);
		Date date2 = cal.getTime();
		agreementTerm.setFromDate(date1);
		agreementTerm.setThruDate(date2);
		// agreementTerm.setDescription();
		agreementTermWriter.create(agreementTerm, true);

		return agreementItemSeqId;
	}

	private String getNextSubSeqId(Delegator delegator, GenericValue genericValue, String fieldName) {
		delegator.setNextSubSeqId(genericValue, fieldName, 5, 1);
		return genericValue.getString(fieldName);
	}

	private void createRowProduct(CommandInterpreter interpreter,Context context, Agreement agreement, String item, String itemSeqId) throws ResourceException {

		Product productItem = resourceManager.getFrame(context, Product.class).createProxy(item);
		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);

		// AgreementProductAppl
		ResourceWriter<AgreementProductAppl> agreementProductApplWriter = resourceManager.getResourceWriter(context, AgreementProductAppl.class);
		AgreementProductAppl agreementProductAppl = agreementProductApplWriter.make();
		agreementProductAppl.setAgreementId(agreement);
		agreementProductAppl.setAgreementItemSeqId(itemSeqId);
		agreementProductAppl.setProductId(productItem);

		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);
		Product productEntity = productReader.lookup(item);

		// price

		Map<String, Object> priceContext = new HashMap<>();
		GenericValue product = EntityUtils.toBizEntity(delegator, productEntity);
		priceContext.put("product", product);
		priceContext.put("currencyUomId", SystemDefault.getUom(context).getID());
		Map<String, Object> priceResult = new HashMap<>();
		try {
			priceResult = dispatcher.runSync("calculateProductPrice", priceContext);
			if (ServiceUtil.isError(priceResult)) {
				interpreter.println("Errore in recupero prezzo articolo " + item);
			}
			Boolean validPriceFound = (Boolean) priceResult.get("validPriceFound");
			if (Boolean.FALSE.equals(validPriceFound)) {
				interpreter.println("Prezzo non valido per articolo " + item);
			}

			if (priceResult.get("listPrice") != null) {
				agreementProductAppl.setPrice(((BigDecimal) priceResult.get("listPrice")));
			}

			if (priceResult.get("basePrice") != null) {
				agreementProductAppl.setPrice(((BigDecimal) priceResult.get("basePrice")));
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}

		agreementProductApplWriter.create(agreementProductAppl, true);
	}

	private void renewalAgreement(CommandInterpreter interpreter, Context context, String agreementId) throws ResourceException {

		/*
		 * il rinnovo del contratto avviene quando questo è ancora aperto (Agreement) ed
		 * i termini della varie righe sono scaduti. verrà presa l'ultima riga e copiata
		 * in una nuova con nuove date di termine.
		 */
		Timestamp timeStamp = new java.sql.Timestamp(System.currentTimeMillis());

		// TODO gestione della where con date validità da rivedere
		// TODO In EntityUtils dalla specifica 123 alla 141 ci sono i metodi che
		// utilizza Biz per le where con le date

		String filter = "(thruDate IS NULL OR thruDate > '" + timeStamp + "') AND (fromDate IS NULL OR fromDate <= '" + timeStamp + "')";
		if (agreementId != null)
			filter = filter + "AND agreementId = '" + agreementId + "'";

		ResourceReader<Agreement> agreementReader = resourceManager.getResourceReader(context, Agreement.class);
		// ResourceReader<AgreementItem> agreementItemReader =
		// resourceManager.getResourceReader(context, AgreementItem.class);
		ResourceReader<AgreementTerm> agreementTermReader = resourceManager.getResourceReader(context, AgreementTerm.class);
		ResourceReader<AgreementProductAppl> agreementProductApplReader = resourceManager.getResourceReader(context, AgreementProductAppl.class);

		try (EntityIterator<Agreement> agreements = agreementReader.find(filter)) {
			for (Agreement agreement : agreements) {
				interpreter.println("Verify agreement " + agreement.getAgreementId());

				String termFilter = "agreementId = '" + agreement.getAgreementId() + "'";

				// TODO leggo i termini di contratto della riga per capire se crearne una nuova.
				// Potrebbe diventare un metodo;
				int open = 0;
				int close = 0;

				AgreementTerm agreementTermLast = null;
				try (EntityIterator<AgreementTerm> agreementTerms = agreementTermReader.find(termFilter)) {
					for (AgreementTerm agreementTerm : agreementTerms) {
						Date date = new Date();
						if (agreementTerm.getThruDate().compareTo(date) < 0) {
							close++;
							// interpreter.println(agreementTerm.getAgreementItemSeqId() + " " +
							// agreementTerm.getFromDate() + " " + agreementTerm.getThruDate() + " " +
							// agreementTerm.getDescription());
						} else {
							open++;
						}
						agreementTermLast = agreementTerm;
					}
				}

				// Eseguo rinnovo dall'ultima riga;
				if (open == 0 && close > 0) {
					String agreementItemSeqId = createRow(context, agreement, "Renewal agreement");

					// Leggo i prodotti dalla riga precedente
					String productFilter = "agreementId = '" + agreement.getAgreementId() + "' AND agreementItemSeqId = '" + agreementTermLast.getAgreementItemSeqId() + "'";

					try (EntityIterator<AgreementProductAppl> agreementProducts = agreementProductApplReader.find(productFilter)) {
						for (AgreementProductAppl agreementProduct : agreementProducts) {
							createRowProduct(interpreter, context, agreement, agreementProduct.getProductId().getProductId(), agreementItemSeqId);
						}
					}

					// Creo la fattura dalla nuova riga
					Invoice invoiceEntity = createInvoice(interpreter, context, agreement.getPartyIdTo().getPartyId(), "Agreement renewal - reference " + agreement.getID() + "/" + agreementItemSeqId);

					Delegator delegator = DelegatorFactory.getDelegator(null);
					LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);

					// leggo la riga appena creata
					productFilter = "agreementId = '" + agreement.getAgreementId() + "' AND agreementItemSeqId = '" + agreementItemSeqId + "'";
					try (EntityIterator<AgreementProductAppl> agreementProducts = agreementProductApplReader.find(productFilter)) {
						for (AgreementProductAppl agreementProduct : agreementProducts) {
							createInvoiceItem(interpreter, context, delegator, dispatcher, invoiceEntity, agreementProduct.getProductId().getProductId(), 1,
									agreementTermLast.getInvoiceItemTypeId().getID());
						}
					}

					interpreter.println("Creata fattura numero " + invoiceEntity.getInvoiceId());
					// Creazione pagamento
					String paymentId = createPaymentFromInvoice(interpreter, context, delegator, invoiceEntity);
					interpreter.println("Creato pagamento " + paymentId);

					// Effettuo pagamento Tramite Stripe
					CreditCard creditCard = PaymentServices.getCreditCardParty(context, invoiceEntity.getPartyId().getID());
					if (creditCard != null) {
						Stripe.apiKey = StripePaymentManager.API_KEY;
						BigDecimal amount = InvoiceWorker.getInvoiceTotal(EntityUtils.toBizEntity(delegator, invoiceEntity));
						amount = amount.setScale(2, RoundingMode.HALF_UP);
						String amountString = amount.toString();
						amountString = amountString.replace(".", "");
						amountString = amountString.replace(",", "");

						String description = "Payment invoice nr. " + invoiceEntity.getID() + " - customer " + invoiceEntity.getPartyId().getID();
						PaymentIntent intent = StripePaymentManager.createPaymentIntent("card", Integer.parseInt(amountString), invoiceEntity.getCurrencyUomId().getID(), description);
						String[] values = creditCard.getExpireDate().split("/");
						com.stripe.model.PaymentMethod paymentMethod = StripePaymentManager.createPaymentCardMethod(creditCard.getCardNumber(), Integer.parseInt(values[0]), Integer.parseInt(values[1]),
								creditCard.getDescription());
						PaymentIntent confirm = StripePaymentManager.confirm(intent.getId(), paymentMethod.getId());
						interpreter.println("Transaction " + confirm.getId() + " " + confirm.getStatus());
						if (confirm.getStatus().contentEquals("succeeded")) {
							// Receive payment (PMNT_RECEIVED)
							if (setPaymentStatus(interpreter, context, paymentId, "PMNT_RECEIVED")) {
								setPaymentStatus(interpreter, context, paymentId, "PMNT_CONFIRMED");
							}
							// TODO Update payment with transaction id

							// Approve Invoice
							setInvoiceStatus(interpreter, context, invoiceEntity.getID(), "INVOICE_APPROVED");
						} else {
							interpreter.println("Error in credit card payment");
						}
					} else {
						interpreter.println("Invalid transaction - credit card not found");
					}
				}

				/*
				 * // lettura righe AgreementItem String itemFilter = "agreementId = '" +
				 * agreement.getAgreementId() + "'";
				 * 
				 * // lettura righe AgreementItem for (AgreementItem agreementItem :
				 * agreementItemReader.find(itemFilter)) { }
				 */
			}
		}
	}

	private boolean setPaymentStatus(CommandInterpreter interpreter, Context context, String paymentId, String statusPayment) throws ResourceException {

		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		UserLogin userLoginEntity = userLoginReader.lookup(USER_LOGIN_ID);
		GenericValue userLogin = EntityUtils.toBizEntity(delegator, userLoginEntity);
		Map<String, Object> paymentStatusContext = new HashMap<>();
		Map<String, Object> paymentStatusResult = new HashMap<>();

		try {
			paymentStatusContext.put("paymentId", paymentId);
			paymentStatusContext.put("statusId", statusPayment);
			paymentStatusContext.put("userLogin", userLogin);
			paymentStatusResult = dispatcher.runSync("setPaymentStatus", paymentStatusContext);
			if (ServiceUtil.isError(paymentStatusResult)) {
				interpreter.println("Error in receive payment");
				return false;
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}
		return true;
	}

	private boolean setInvoiceStatus(CommandInterpreter interpreter, Context context, String invoiceId, String status) throws ResourceException {

		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);

		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		UserLogin userLoginEntity = userLoginReader.lookup(USER_LOGIN_ID);
		GenericValue userLogin = EntityUtils.toBizEntity(delegator, userLoginEntity);
		Map<String, Object> invoiceStatusContext = new HashMap<>();
		Map<String, Object> invoiceStatusResult = new HashMap<>();

		try {
			invoiceStatusContext.put("invoiceId", invoiceId);
			invoiceStatusContext.put("statusId", status);
			invoiceStatusContext.put("paidDate", new Date());
			invoiceStatusContext.put("statusDate", new Date());
			invoiceStatusContext.put("userLogin", userLogin);
			invoiceStatusResult = dispatcher.runSync("setInvoiceStatus", invoiceStatusContext);
			if (ServiceUtil.isError(invoiceStatusResult)) {
				interpreter.println("Error in approve invoice");
				return false;
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}
		return true;
	}

	private String createPaymentFromInvoice(CommandInterpreter interpreter, Context context, Delegator delegator, Invoice invoiceEntity) throws ResourceException {
		ResourceReader<UserLogin> userLoginReader = resourceManager.getResourceReader(context, UserLogin.class);
		UserLogin userLoginEntity = userLoginReader.lookup(USER_LOGIN_ID);
		GenericValue userLogin = EntityUtils.toBizEntity(delegator, userLoginEntity);

		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);
		GenericValue invoice = EntityUtils.toBizEntity(delegator, invoiceEntity);
		Map<String, Object> paymentContext = new HashMap<>();
		Map<String, Object> paymentResult = new HashMap<>();
		Map<String, Object> paymentApplicationContext = new HashMap<>();
		Map<String, Object> paymentApplicationResult = new HashMap<>();

		try {

			PaymentMethod paymentMethod = PaymentServices.getPaymentMethodParty(context, invoiceEntity.getPartyId().getID(), "CREDIT_CARD");
			if (paymentMethod == null) {
				interpreter.println("Payment method not found for party " + invoiceEntity.getPartyId().getID());
			} else {
				// creazione pagamento
				paymentContext.put("amount", InvoiceWorker.getInvoiceTotal(invoice));
				paymentContext.put("partyIdTo", invoiceEntity.getPartyIdFrom().getID());
				paymentContext.put("partyIdFrom", invoiceEntity.getPartyId().getID());
				paymentContext.put("paymentTypeId", "CUSTOMER_PAYMENT");
				paymentContext.put("paymentMethodTypeId", "CREDIT_CARD");
				paymentContext.put("paymentMethodId", paymentMethod.getID());
				paymentContext.put("currencyUomId", SystemDefault.getUom(context).getID());
				paymentContext.put("paymentRefNum", "Invoice number " + invoiceEntity.getID());
				paymentContext.put("userLogin", userLogin);
				paymentResult = dispatcher.runSync("createPayment", paymentContext);
				if (ServiceUtil.isError(paymentResult)) {
					interpreter.println("Error in create payment");
					return null;
				}
				// applicazione pagamento
				paymentApplicationContext.put("invoiceId", invoiceEntity.getID());
				paymentApplicationContext.put("paymentId", paymentResult.get("paymentId"));
				paymentApplicationResult = dispatcher.runSync("updatePaymentApplicationDef", paymentApplicationContext);
				if (ServiceUtil.isError(paymentApplicationResult)) {
					interpreter.println("Error in payment application: " + paymentResult.get("paymentId"));
					return (String) paymentResult.get("paymentId");
				}
				interpreter.println("Pagamento applicato");
			}
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}
		return (String) paymentResult.get("paymentId");
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}