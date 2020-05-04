/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentType;
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
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatus;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatus;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatusResponse;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.order.ChangeOrderStatus;
import org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse;
import org.abchip.mimo.biz.service.order.ReserveStoreInventory;
import org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse;
import org.abchip.mimo.biz.service.order.ResetGrandTotal;
import org.abchip.mimo.biz.service.order.ResetGrandTotalResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplay;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.test.accounting.StripePaymentManager;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.tester.base.BaseTestCommands;
import org.abchip.mimo.util.Numbers;
import org.eclipse.osgi.framework.console.CommandInterpreter;

import com.stripe.Stripe;
import com.stripe.model.PaymentIntent;

public class BizTestCommands extends BaseTestCommands {

	private static final String USER_LOGIN_ID = "abchip";
	private static final String ORDER_STATUS_APPROVED = "ORDER_APPROVED";
	private static final String ORDER_STATUS_HOLD = "ORDER_HOLD";
	private static final String ORDER_STATUS_CANCELLED = "ORDER_CANCELLED";
	private static final String PRODUCT_STORE_ID = "8000";
	private static final String SHIPMENT_METHOD_TYPE_ID = "NO_SHIPPING";
	private static final String CARRIER_ID = "_NA_";
	private static final String PRODUCT_CATALOG_ID = "ABChipCatalog";

	private static final String TAX_AUTH_PARTY_ID = "ITA_ADE";
	private static final String TAX_AUTH_GEO_ID = "ITA";

	@Inject
	public BizTestCommands(Application application) {
		super(application);
	}

	public void _getCreditCardParty(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext(interpreter);
		String partyId = nextArgument(interpreter);
		Party party = context.createProxy(Party.class, partyId);
		CreditCard creditCard = party.getCreditCard();
		interpreter.println("Credit card number " + creditCard.getCardNumber());
	}

	public void _renewalAgreement(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		GetCommonDefaultResponse commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		GetPartyDefaultResponse partyDefault = serviceManager.execute(getPartyDefault);

		String agreementId = nextArgument(interpreter);

		renewalAgreement(interpreter, context, commonDefault, partyDefault, agreementId);
	}

	public void _expireAgreement(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);

		String agreementId = nextArgument(interpreter);

		if (agreementId == null) {
			interpreter.println("Invalid agreement!!!");
			return;
		}

		// check
		ResourceReader<Agreement> agreementReader = context.getResourceManager().getResourceReader(Agreement.class);
		Agreement agreementEntity = agreementReader.lookup(agreementId);
		if (agreementEntity == null) {
			interpreter.println("Invalid agreement!!!");
			return;
		}

		if (agreementEntity.getThruDate() != null) {
			interpreter.println("Expire agreement " + agreementId + " not possible!!!");
			return;
		}

		ResourceWriter<Agreement> agreementWriter = context.getResourceManager().getResourceWriter(Agreement.class);
		agreementEntity.setThruDate(new Date());
		agreementWriter.create(agreementEntity, true);

		interpreter.println("Agreement " + agreementId + " expired");
	}

	public void _createOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		GetCommonDefaultResponse commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		GetPartyDefaultResponse partyDefault = serviceManager.execute(getPartyDefault);

		String partyId = nextArgument(interpreter);

		createOrder(interpreter, context, commonDefault, partyDefault, partyId);
	}

	public void _getInvoiceTot(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);

		String invoiceId = nextArgument(interpreter);

		Invoice invoice = context.getResourceManager().getResourceReader(Invoice.class).lookup(invoiceId);
		interpreter.println("From: " + invoice.getPartyIdFrom().getID());
		interpreter.println("To: " + invoice.getPartyId().getID());
		interpreter.println("Total: " + invoice.getTotal());
	}

	public void _approveOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		String orderId = nextArgument(interpreter);

		if (orderId == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = context.getResourceManager().getResourceReader(OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.isApprovable()) {
			interpreter.println("Approve order " + orderId + " not possible!!!");
			return;
		}

		ChangeOrderStatus changeOrderStatus = serviceManager.prepare(ChangeOrderStatus.class);
		changeOrderStatus.setOrderId(orderId);
		changeOrderStatus.setStatusId(ORDER_STATUS_APPROVED);
		changeOrderStatus.setSetItemStatus(true);
		ChangeOrderStatusResponse response = serviceManager.execute(changeOrderStatus);

		if (response.isError()) {
			interpreter.println("Error in set status");
			return;
		}

		interpreter.println("Order " + orderId + " approved");
	}

	public void _holdOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		String orderId = nextArgument(interpreter);

		if (orderId == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = context.getResourceManager().getResourceReader(OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.getStatusId().getStatusId().equals("ORDER_APPROVED")) {
			interpreter.println("Hold order " + orderId + " not possible!!!");
			return;
		}

		ChangeOrderStatus changeOrderStatus = serviceManager.prepare(ChangeOrderStatus.class);
		changeOrderStatus.setOrderId(orderId);
		changeOrderStatus.setStatusId(ORDER_STATUS_HOLD);
		changeOrderStatus.setSetItemStatus(true);
		ChangeOrderStatusResponse response = serviceManager.execute(changeOrderStatus);

		if (response.isError()) {
			interpreter.println("Error in set status");
			return;
		}

		interpreter.println("Order " + orderId + " holded");
	}

	public void _cancelOrder(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		String orderId = nextArgument(interpreter);

		if (orderId == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = context.getResourceManager().getResourceReader(OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			interpreter.println("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.getStatusId().getStatusId().equals("ORDER_CANCELLED") && !orderHeaderEntity.getStatusId().getStatusId().equals("ORDER_COMPLETED")) {
			interpreter.println("Delete order " + orderId + " not possible!!!");
			return;
		}

		ChangeOrderStatus changeOrderStatus = serviceManager.prepare(ChangeOrderStatus.class);
		changeOrderStatus.setOrderId(orderId);
		changeOrderStatus.setStatusId(ORDER_STATUS_CANCELLED);
		changeOrderStatus.setSetItemStatus(true);
		ChangeOrderStatusResponse response = serviceManager.execute(changeOrderStatus);

		if (response.isError()) {
			interpreter.println("Error in set status");
			return;
		}

		interpreter.println("Order " + orderId + " deleted");
	}

	private void createOrder(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, GetPartyDefaultResponse partyDefault, String partyId)
			throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		Party party = context.createProxy(Party.class, partyId);

		ResourceReader<ProductStore> productStoreReader = context.getResourceManager().getResourceReader(ProductStore.class);
		ProductStore productStore = productStoreReader.lookup(PRODUCT_STORE_ID);

		ResourceReader<UserLogin> userLoginReader = context.getResourceManager().getResourceReader(UserLogin.class);
		UserLogin userLogin = userLoginReader.lookup(USER_LOGIN_ID);

		// Order Header
		ResourceWriter<OrderHeader> orderHeaderWriter = context.getResourceManager().getResourceWriter(OrderHeader.class);
		OrderHeader orderHeader = orderHeaderWriter.make(true);

		if (productStore.getOrderNumberPrefix() != null)
			orderHeader.setOrderId(productStore.getOrderNumberPrefix() + orderHeader.getOrderId());

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
		orderHeaderWriter.create(orderHeader, true);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = context.getResourceManager().getResourceWriter(OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setStatusId(context.createProxy(StatusItem.class, "ORDER_CREATED"));
		orderStatus.setStatusUserLogin(userLogin);
		orderStatusWriter.create(orderStatus, true);

		// OrderContactMech
		ResourceWriter<OrderContactMech> orderContactMechWriter = context.getResourceManager().getResourceWriter(OrderContactMech.class);
		OrderContactMech orderContactMech = orderContactMechWriter.make();
		orderContactMech.setOrderId(orderHeader);
		orderContactMech.setContactMechPurposeTypeId(context.createProxy(ContactMechPurposeType.class, "ORDER_EMAIL"));
		orderContactMech.setContactMechId(context.createProxy(ContactMech.class, partyId));
		orderContactMechWriter.create(orderContactMech, true);

		// OrderItemShipGroup
		ResourceWriter<OrderItemShipGroup> orderItemShipGroupWriter = context.getResourceManager().getResourceWriter(OrderItemShipGroup.class);
		String shipGroupSeqId = "00001";
		OrderItemShipGroup orderItemShipGroup = orderItemShipGroupWriter.make();
		orderItemShipGroup.setOrderId(orderHeader);
		orderItemShipGroup.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroup.setShipmentMethodTypeId(context.createProxy(ShipmentMethodType.class, SHIPMENT_METHOD_TYPE_ID));
		orderItemShipGroup.setCarrierPartyId(context.createProxy(Party.class, CARRIER_ID));
		orderItemShipGroup.setCarrierRoleTypeId("CARRIER");
		orderItemShipGroupWriter.create(orderItemShipGroup, true);

		// OrderItem
		String itemSeqiD = Numbers.formatPaddedNumber(1, 5);

		createOrderItem(interpreter, context, commonDefault, partyDefault, orderHeader, itemSeqiD, "Accounting", 1, shipGroupSeqId);
		// seqItemId++;
		// itemSeqiD = UtilFormatOut.formatPaddedNumber(seqItemId, 5);
		// createOrderItem(orderId, itemSeqiD, "TESTFLOW-ITEM-2",
		// 20, shipGroupSeqId);

		// OrderRole
		ResourceWriter<OrderRole> orderRoleWriter = context.getResourceManager().getResourceWriter(OrderRole.class);
		OrderRole orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(partyDefault.getOrganization());
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_FROM_VENDOR"));
		orderRoleWriter.create(orderRole, true);

		// Party Role to partyId
		ResourceWriter<PartyRole> partyRoleWriter = context.getResourceManager().getResourceWriter(PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_TO_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(context.createProxy(RoleType.class, "SHIP_TO_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "SHIP_TO_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(context.createProxy(RoleType.class, "END_USER_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "END_USER_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(context.createProxy(RoleType.class, "PLACING_CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		orderRole = orderRoleWriter.make();
		orderRole.setOrderId(orderHeader);
		orderRole.setPartyId(party);
		orderRole.setRoleTypeId(context.createProxy(RoleType.class, "PLACING_CUSTOMER"));
		orderRoleWriter.create(orderRole, true);

		// OrderPaymentPreference
		ResourceWriter<OrderPaymentPreference> orderPaymentPreferenceWriter = context.getResourceManager().getResourceWriter(OrderPaymentPreference.class);
		OrderPaymentPreference orderPaymentPreference = orderPaymentPreferenceWriter.make(true);
		orderPaymentPreference.setOrderId(orderHeader);
		orderPaymentPreference.setStatusId(context.createProxy(StatusItem.class, "PAYMENT_NOT_RECEIVED"));
		orderPaymentPreference.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "EXT_COD"));
		orderPaymentPreferenceWriter.create(orderPaymentPreference, true);

		// Inventory
		ResourceReader<OrderItemShipGroupAssoc> orderItemShipGroupAssocReader = context.getResourceManager().getResourceReader(OrderItemShipGroupAssoc.class);
		ResourceReader<OrderItem> orderItemReader = context.getResourceManager().getResourceReader(OrderItem.class);

		String filter = "orderId = \"" + orderHeader.getOrderId() + "\"";

		//
		// TODO qui richiamare il servizio calcTax per aggiungere l'iva all'ordine
		// (OrderAdjustment) che poi sarà trasferita nella fattura
		//

		try (EntityIterator<OrderItemShipGroupAssoc> orderItemShipGroupAssocs = orderItemShipGroupAssocReader.find(filter)) {
			for (OrderItemShipGroupAssoc orderItemShipGroupAssoc : orderItemShipGroupAssocs) {

				OrderItem orderItem = orderItemReader.lookup(orderHeader.getOrderId() + "/" + orderItemShipGroupAssoc.getOrderItemSeqId());

				// reserve the product
				ReserveStoreInventory reserveStoreInventory = serviceManager.prepare(ReserveStoreInventory.class);
				reserveStoreInventory.setProductStoreId(PRODUCT_STORE_ID);
				reserveStoreInventory.setProductId(orderItem.getProductId().getProductId());
				reserveStoreInventory.setOrderId(orderItem.getOrderId().getOrderId());
				reserveStoreInventory.setOrderItemSeqId(orderItem.getOrderItemSeqId());
				reserveStoreInventory.setShipGroupSeqId(orderItemShipGroupAssoc.getShipGroupSeqId());
				// verificare da dove prenderlo
				reserveStoreInventory.setFacilityId(null);
				// use the quantity from the orderItemShipGroupAssoc, NOT the orderItem, these
				// are reserved by item-group assoc
				reserveStoreInventory.setQuantity(orderItemShipGroupAssoc.getQuantity());

				ReserveStoreInventoryResponse response = serviceManager.execute(reserveStoreInventory);

				if (response.isError()) {
					String invErrMsg = "The product ";
					invErrMsg += orderItem.getProductId();
					invErrMsg += " with ID " + orderItem.getProductId() + " is no longer in stock. Please try reducing the quantity or removing the product from this order.";
					interpreter.println(invErrMsg);
				}

			}
		}

		// Update Total OrderHeader (OrderServices)
		ResetGrandTotal resetGrandTotal = serviceManager.prepare(ResetGrandTotal.class);
		resetGrandTotal.setOrderId(orderHeader.getOrderId());
		ResetGrandTotalResponse response = serviceManager.execute(resetGrandTotal);
		if (response.isError()) {
			interpreter.println("Errore in aggiornamento testata documento");
			return;
		}

		interpreter.println("New order created: " + orderHeader.getOrderId());
	}

	private void createOrderItem(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, GetPartyDefaultResponse partyDefault, OrderHeader orderHeader,
			String itemSeqiD, String item, int quantity, String shipGroupSeqId) throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		ResourceWriter<OrderItem> orderItemWriter = context.getResourceManager().getResourceWriter(OrderItem.class);

		OrderItem orderItem = orderItemWriter.make();
		orderItem.setOrderId(orderHeader);
		orderItem.setOrderItemSeqId(itemSeqiD);
		orderItem.setOrderItemTypeId(context.createProxy(OrderItemType.class, "PRODUCT_ORDER_ITEM"));
		orderItem.setProdCatalogId(PRODUCT_CATALOG_ID);

		ResourceReader<Product> productReader = context.getResourceManager().getResourceReader(Product.class);
		Product product = productReader.lookup(item);
		orderItem.setProductId(product);
		orderItem.setItemDescription(product.getProductName());
		orderItem.setStatusId(context.createProxy(StatusItem.class, "ITEM_CREATED"));
		orderItem.setQuantity(new BigDecimal(quantity));
		orderItem.setUnitPrice(new BigDecimal(10));

		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse response = serviceManager.execute(calculateProductPrice);
		if (response.isError())
			interpreter.println("Errore in recupero prezzo articolo " + item);

		if (response.isValidPriceFound()) {
			orderItem.setUnitListPrice(response.getListPrice());
			orderItem.setUnitPrice(response.getBasePrice());
		} else
			interpreter.println("Prezzo non valido per articolo " + item);

		orderItemWriter.create(orderItem);

		// OrderStatus
		ResourceWriter<OrderStatus> orderStatusWriter = context.getResourceManager().getResourceWriter(OrderStatus.class);
		OrderStatus orderStatus = orderStatusWriter.make(true);
		orderStatus.setOrderId(orderHeader);
		orderStatus.setOrderItemSeqId(itemSeqiD);
		orderStatus.setStatusId(context.createProxy(StatusItem.class, "ITEM_CREATED"));
		orderStatus.setStatusUserLogin(context.createProxy(UserLogin.class, USER_LOGIN_ID));
		orderStatusWriter.create(orderStatus);

		// OrderItemShipGroupAssoc
		ResourceWriter<OrderItemShipGroupAssoc> orderItemShipGroupAssocWriter = context.getResourceManager().getResourceWriter(OrderItemShipGroupAssoc.class);
		OrderItemShipGroupAssoc orderItemShipGroupAssoc = orderItemShipGroupAssocWriter.make();
		orderItemShipGroupAssoc.setOrderId(orderHeader);
		orderItemShipGroupAssoc.setOrderItemSeqId(itemSeqiD);
		orderItemShipGroupAssoc.setShipGroupSeqId(shipGroupSeqId);
		orderItemShipGroupAssoc.setQuantity(new BigDecimal(quantity));
		orderItemShipGroupAssocWriter.create(orderItemShipGroupAssoc);
	}

	private Invoice createInvoice(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, GetPartyDefaultResponse partyDefault, String partyId,
			String description) throws ResourceException {
		Party party = context.createProxy(Party.class, partyId);
		Party partyFrom = partyDefault.getOrganization();

		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = context.getResourceManager().getResourceWriter(Invoice.class);
		Invoice invoice = invoiceWriter.make(true);
		invoice.setInvoiceTypeId(context.createProxy(InvoiceType.class, "SALES_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(commonDefault.getCurrencyUom());
		invoice.setPartyId(party);
		invoice.setPartyIdFrom(partyFrom);
		if (!description.isEmpty())
			invoice.setDescription(description);
		invoiceWriter.create(invoice);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = context.getResourceManager().getResourceWriter(InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = context.getResourceManager().getResourceWriter(InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(context.createProxy(ContactMechPurposeType.class, "PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(party.getPostalAddress());
		invoiceContactMechWriter.create(invoiceContactMech, true);

		return invoice;
	}

	private void createInvoiceItem(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, Invoice invoice, String item, int quantity, String itemType)
			throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		ResourceWriter<InvoiceItem> invoiceItemWriter = context.getResourceManager().getResourceWriter(InvoiceItem.class);

		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);

		// GenericValue invoiceItemValue = EntityUtils.toBizEntity(delegator,
		// invoiceItem);
		// String invoiceItemSeqId = getNextSubSeqId(delegator, invoiceItemValue,
		// "invoiceItemSeqId");
		// String saveInvoiceItemSeqId = invoiceItemSeqId;
		// invoiceItem.setInvoiceItemSeqId(invoiceItemSeqId);
		invoiceItem.setInvoiceItemTypeId(context.createProxy(InvoiceItemType.class, itemType));

		ResourceReader<Product> productReader = context.getResourceManager().getResourceReader(Product.class);
		Product product = productReader.lookup(item);
		invoiceItem.setProductId(product);
		invoiceItem.setDescription(product.getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));

		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse productPrice = serviceManager.execute(calculateProductPrice);
		if (productPrice.isError())
			interpreter.println("Errore in recupero prezzo articolo " + item);

		if (productPrice.isValidPriceFound()) {
			invoiceItem.setAmount(productPrice.getBasePrice());
		} else
			interpreter.println("Prezzo non valido per articolo " + item);

		invoiceItemWriter.create(invoiceItem);

		//
		String saveInvoiceItemSeqId = invoiceItem.getParentInvoiceItemSeqId();

		// check taxable
		ResourceReader<ProductStore> productStoreReader = context.getResourceManager().getResourceReader(ProductStore.class);
		ProductStore productStore = productStoreReader.lookup(PRODUCT_STORE_ID);

		String filterTaxAuth = "taxAuthPartyId = '" + productStore.getVatTaxAuthPartyId() + "' AND taxAuthGeoId = '" + productStore.getVatTaxAuthGeoId() + "'";

		ResourceReader<TaxAuthorityRateProduct> taxAuthorityRateProductReader = context.getResourceManager().getResourceReader(TaxAuthorityRateProduct.class);
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

		CalcTaxForDisplay calcTaxForDisplay = serviceManager.prepare(CalcTaxForDisplay.class);
		calcTaxForDisplay.setBasePrice(productPrice.getBasePrice());
		calcTaxForDisplay.setProductId(item);
		calcTaxForDisplay.setProductStoreId(PRODUCT_STORE_ID);
		CalcTaxForDisplayResponse taxForDisplay = serviceManager.execute(calcTaxForDisplay);
		if (taxForDisplay.isError()) {
			interpreter.println("Errore in recupero tasse per articolo " + item);
			return;
		}

		Party taxAutPartyId = context.createProxy(Party.class, taxAuthPartyId);
		Geo taxAutGeo = context.createProxy(Geo.class, taxAuthGeoId);
		// result.put("taxTotal", taxTotal);
		// result.put("taxPercentage", taxPercentage);
		// result.put("priceWithTax", priceWithTax);

		invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);

		// invoiceItemValue = EntityUtils.toBizEntity(delegator, invoiceItem);
		// invoiceItemSeqId = getNextSubSeqId(delegator, invoiceItemValue,
		// "invoiceItemSeqId");
		// invoiceItem.setInvoiceItemSeqId(invoiceItemSeqId);
		invoiceItem.setInvoiceItemTypeId(context.createProxy(InvoiceItemType.class, "ITM_SALES_TAX"));

		invoiceItem.setProductId(product);

		invoiceItem.setParentInvoiceId(invoice.getID());
		invoiceItem.setParentInvoiceItemSeqId(saveInvoiceItemSeqId);

		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setAmount((taxForDisplay.getTaxTotal()));

		// TODO verify
		invoiceItem.setTaxAuthPartyId(taxAutPartyId);
		invoiceItem.setTaxAuthGeoId(taxAutGeo);
		if (!taxAuthorityRateSeqId.isEmpty()) {
			TaxAuthorityRateProduct taxAuthorityRateProduct = context.createProxy(TaxAuthorityRateProduct.class, taxAuthorityRateSeqId);
			invoiceItem.setTaxAuthorityRateSeqId(taxAuthorityRateProduct);
		}

		invoiceItemWriter.create(invoiceItem);
	}

	private String createRow(Context context, Agreement agreement, String text) throws ResourceException {

		AgreementItemType agreementType = context.createProxy(AgreementItemType.class, "AGREEMENT_PRICING_PR");
		TermType termType = context.createProxy(TermType.class, "FIN_PAYMENT_FIXDAY");
		InvoiceItemType invoiceItemType = context.createProxy(InvoiceItemType.class, "INV_DPROD_ITEM");

		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = context.getResourceManager().getResourceWriter(AgreementItem.class);

		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreementId(agreement);

		// GenericValue agreementItemValue = EntityUtils.toBizEntity(delegator,
		// agreementItem);
		// String agreementItemSeqId = getNextSubSeqId(delegator, agreementItemValue,
		// "agreementItemSeqId");
		// agreementItem.setAgreementItemSeqId("00001");
		// agreementItem.setAgreementItemSeqId(agreementItemSeqId);
		agreementItem.setAgreementItemTypeId(agreementType);
		agreementItem.setCurrencyUomId("EUR");
		agreementItem.setAgreementText(text);
		agreementItemWriter.create(agreementItem, true);
		String agreementItemSeqId = agreementItem.getAgreementItemSeqId();
		// AgreementTerm
		ResourceWriter<AgreementTerm> agreementTermWriter = context.getResourceManager().getResourceWriter(AgreementTerm.class);
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

	// private String getNextSubSeqId(Delegator delegator, GenericValue
	// genericValue, String fieldName) {
	// delegator.setNextSubSeqId(genericValue, fieldName, 5, 1);
	// return genericValue.getString(fieldName);
	// }

	private void createRowProduct(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, Agreement agreement, String item, String itemSeqId)
			throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		Product productItem = context.createProxy(Product.class, item);

		// AgreementProductAppl
		ResourceWriter<AgreementProductAppl> agreementProductApplWriter = context.getResourceManager().getResourceWriter(AgreementProductAppl.class);
		AgreementProductAppl agreementProductAppl = agreementProductApplWriter.make();
		agreementProductAppl.setAgreementId(agreement);
		agreementProductAppl.setAgreementItemSeqId(itemSeqId);
		agreementProductAppl.setProductId(productItem);

		ResourceReader<Product> productReader = context.getResourceManager().getResourceReader(Product.class);
		Product product = productReader.lookup(item);

		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse response = serviceManager.execute(calculateProductPrice);
		if (response.isError())
			interpreter.println("Errore in recupero prezzo articolo " + item);

		if (response.isValidPriceFound()) {
			agreementProductAppl.setPrice(response.getBasePrice());
		} else
			interpreter.println("Prezzo non valido per articolo " + item);

		agreementProductApplWriter.create(agreementProductAppl, true);
	}

	private void renewalAgreement(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, GetPartyDefaultResponse partyDefault, String agreementId)
			throws ResourceException, ServiceException {

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

		ResourceReader<Agreement> agreementReader = context.getResourceManager().getResourceReader(Agreement.class);
		// ResourceReader<AgreementItem> agreementItemReader =
		// context.getResourceManager().getResourceReader(AgreementItem.class);
		ResourceReader<AgreementTerm> agreementTermReader = context.getResourceManager().getResourceReader(AgreementTerm.class);
		ResourceReader<AgreementProductAppl> agreementProductApplReader = context.getResourceManager().getResourceReader(AgreementProductAppl.class);

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
							createRowProduct(interpreter, context, commonDefault, agreement, agreementProduct.getProductId().getProductId(), agreementItemSeqId);
						}
					}

					// Creo la fattura dalla nuova riga
					Invoice invoice = createInvoice(interpreter, context, commonDefault, partyDefault, agreement.getPartyIdTo().getPartyId(),
							"Agreement renewal - reference " + agreement.getID() + "/" + agreementItemSeqId);

					// leggo la riga appena creata
					productFilter = "agreementId = '" + agreement.getAgreementId() + "' AND agreementItemSeqId = '" + agreementItemSeqId + "'";
					try (EntityIterator<AgreementProductAppl> agreementProducts = agreementProductApplReader.find(productFilter)) {
						for (AgreementProductAppl agreementProduct : agreementProducts) {
							createInvoiceItem(interpreter, context, commonDefault, invoice, agreementProduct.getProductId().getProductId(), 1,
									agreementTermLast.getInvoiceItemTypeId().getID());
						}
					}

					interpreter.println("Creata fattura numero " + invoice.getInvoiceId());
					// Creazione pagamento
					String paymentId = createPaymentFromInvoice(interpreter, context, commonDefault, invoice);
					interpreter.println("Creato pagamento " + paymentId);

					// Effettuo pagamento Tramite Stripe
					CreditCard creditCard = invoice.getPartyId().getCreditCard();
					if (creditCard != null) {
						Stripe.apiKey = StripePaymentManager.API_KEY;

						String description = "Payment invoice nr. " + invoice.getID() + " - customer " + invoice.getPartyId().getID();
						PaymentIntent intent = StripePaymentManager.createPaymentIntent("card", invoice.getTotal(), invoice.getCurrencyUomId().getID(), description);
						String[] values = creditCard.getExpireDate().split("/");
						com.stripe.model.PaymentMethod paymentMethod = StripePaymentManager.createPaymentCardMethod(creditCard.getCardNumber(), Integer.parseInt(values[0]),
								Integer.parseInt(values[1]), creditCard.getDescription());
						PaymentIntent confirm = StripePaymentManager.confirm(intent.getId(), paymentMethod.getId());
						interpreter.println("Transaction " + confirm.getId() + " " + confirm.getStatus());
						if (confirm.getStatus().contentEquals("succeeded")) {
							// Receive payment (PMNT_RECEIVED)
							if (setPaymentStatus(interpreter, context, paymentId, "PMNT_RECEIVED")) {
								setPaymentStatus(interpreter, context, paymentId, "PMNT_CONFIRMED");
							}
							// TODO Update payment with transaction id

							// Approve Invoice
							setInvoiceStatus(interpreter, context, invoice.getID(), "INVOICE_APPROVED");
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

	private boolean setPaymentStatus(CommandInterpreter interpreter, Context context, String paymentId, String statusPaymentId) throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		SetPaymentStatus setPaymentStatus = serviceManager.prepare(SetPaymentStatus.class);
		setPaymentStatus.setPaymentId(paymentId);
		setPaymentStatus.setStatusId(statusPaymentId);
		SetPaymentStatusResponse response = serviceManager.execute(setPaymentStatus);
		if (response.isError()) {
			interpreter.println("Error in receive payment");
			return false;
		}

		return true;
	}

	private boolean setInvoiceStatus(CommandInterpreter interpreter, Context context, String invoiceId, String status) throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		SetInvoiceStatus setInvoiceStatus = serviceManager.prepare(SetInvoiceStatus.class);
		setInvoiceStatus.setInvoiceId(invoiceId);
		setInvoiceStatus.setStatusId(status);
		setInvoiceStatus.setPaidDate(new Date());
		setInvoiceStatus.setStatusDate(new Date());

		SetInvoiceStatusResponse response = serviceManager.execute(setInvoiceStatus);
		if (response.isError()) {
			interpreter.println("Error in approve invoice");
			return false;
		}

		return true;
	}

	private String createPaymentFromInvoice(CommandInterpreter interpreter, Context context, GetCommonDefaultResponse commonDefault, Invoice invoice)
			throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		PaymentMethod paymentMethod = invoice.getPartyId().getPaymentMethod("CREDIT_CARD");
		if (paymentMethod == null) {
			interpreter.println("Payment method not found for party " + invoice.getPartyId().getID());
		}

		ResourceWriter<Payment> paymentWriter = context.getResourceManager().getResourceWriter(Payment.class);
		Payment payment = paymentWriter.make(true);
		payment.setAmount(invoice.getTotal());
		payment.setPartyIdTo(invoice.getPartyIdFrom());
		payment.setPartyIdFrom(invoice.getPartyId());
		payment.setPaymentTypeId(context.createProxy(PaymentType.class, "CUSTOMER_PAYMENT"));
		payment.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "CREDIT_CARD"));
		payment.setCurrencyUomId(commonDefault.getCurrencyUom());
		payment.setPaymentRefNum("Invoice number " + invoice.getID());

		paymentWriter.create(payment);

		// applicazione pagamento
		UpdatePaymentApplicationDef updatePaymentApplicationDef = serviceManager.prepare(UpdatePaymentApplicationDef.class);
		updatePaymentApplicationDef.setInvoiceId(invoice.getID());
		updatePaymentApplicationDef.setPaymentId(payment.getID());
		UpdatePaymentApplicationDefResponse response = serviceManager.execute(updatePaymentApplicationDef);
		if (response.isError()) {
			interpreter.println("Error in payment application: " + payment.getID());
			return payment.getID();
		}
		interpreter.println("Pagamento applicato");

		return payment.getID();
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}