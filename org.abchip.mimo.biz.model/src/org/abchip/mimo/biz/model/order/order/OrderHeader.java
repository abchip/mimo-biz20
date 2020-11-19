/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.promo.ProductPromoUse;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.webapp.website.WebSite;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getAutoOrderShoppingList <em>Auto Order Shopping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCommunicationEventOrders <em>Communication Event Orders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getFirstAttemptOrderId <em>First Attempt Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getInternalCode <em>Internal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isInvoicePerShipment <em>Invoice Per Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isIsRushOrder <em>Is Rush Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isIsViewed <em>Is Viewed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderAttributes <em>Order Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDeliverySchedules <em>Order Delivery Schedules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderHeaderNotes <em>Order Header Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderHeaderWorkEfforts <em>Order Header Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItemGroups <em>Order Item Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItemShipGroups <em>Order Item Ship Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderName <em>Order Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderProductPromoCodes <em>Order Product Promo Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOriginFacility <em>Origin Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getPickSheetPrintedDate <em>Pick Sheet Printed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getProductPromoUses <em>Product Promo Uses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getRemainingSubTotal <em>Remaining Sub Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getSalesChannelEnum <em>Sales Channel Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getSyncStatus <em>Sync Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTerminalId <em>Terminal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTrackingCodeOrders <em>Tracking Code Orders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getWebSite <em>Web Site</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader()
 * @model
 * @generated
 */
public interface OrderHeader extends EntityTyped<OrderType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_AgreementId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Auto Order Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Shopping List</em>' reference.
	 * @see #setAutoOrderShoppingList(ShoppingList)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_AutoOrderShoppingList()
	 * @model keys="shoppingListId"
	 * @generated
	 */
	ShoppingList getAutoOrderShoppingList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getAutoOrderShoppingList <em>Auto Order Shopping List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Order Shopping List</em>' reference.
	 * @see #getAutoOrderShoppingList()
	 * @generated
	 */
	void setAutoOrderShoppingList(ShoppingList value);

	/**
	 * Returns the value of the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account</em>' reference.
	 * @see #setBillingAccount(BillingAccount)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_BillingAccount()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getBillingAccount <em>Billing Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account</em>' reference.
	 * @see #getBillingAccount()
	 * @generated
	 */
	void setBillingAccount(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Communication Event Orders</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.CommunicationEventOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Orders</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_CommunicationEventOrders()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventOrder> getCommunicationEventOrders();

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(UserLogin)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_CreatedBy()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Date</em>' attribute.
	 * @see #setEntryDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getEntryDate <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Date</em>' attribute.
	 * @see #getEntryDate()
	 * @generated
	 */
	void setEntryDate(Date value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_ExternalId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>First Attempt Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Attempt Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Attempt Order Id</em>' attribute.
	 * @see #setFirstAttemptOrderId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_FirstAttemptOrderId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFirstAttemptOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getFirstAttemptOrderId <em>First Attempt Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Attempt Order Id</em>' attribute.
	 * @see #getFirstAttemptOrderId()
	 * @generated
	 */
	void setFirstAttemptOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grand Total</em>' attribute.
	 * @see #setGrandTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_GrandTotal()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getGrandTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grand Total</em>' attribute.
	 * @see #getGrandTotal()
	 * @generated
	 */
	void setGrandTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Internal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Code</em>' attribute.
	 * @see #setInternalCode(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_InternalCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getInternalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getInternalCode <em>Internal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Code</em>' attribute.
	 * @see #getInternalCode()
	 * @generated
	 */
	void setInternalCode(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Per Shipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Per Shipment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Per Shipment</em>' attribute.
	 * @see #setInvoicePerShipment(boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_InvoicePerShipment()
	 * @model required="true"
	 * @generated
	 */
	boolean isInvoicePerShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isInvoicePerShipment <em>Invoice Per Shipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Per Shipment</em>' attribute.
	 * @see #isInvoicePerShipment()
	 * @generated
	 */
	void setInvoicePerShipment(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Rush Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Rush Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Rush Order</em>' attribute.
	 * @see #setIsRushOrder(boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_IsRushOrder()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsRushOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isIsRushOrder <em>Is Rush Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Rush Order</em>' attribute.
	 * @see #isIsRushOrder()
	 * @generated
	 */
	void setIsRushOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Viewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Viewed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Viewed</em>' attribute.
	 * @see #setIsViewed(boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_IsViewed()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsViewed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isIsViewed <em>Is Viewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Viewed</em>' attribute.
	 * @see #isIsViewed()
	 * @generated
	 */
	void setIsViewed(boolean value);

	/**
	 * Returns the value of the '<em><b>Needs Inventory Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Inventory Issuance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inventory Issuance</em>' attribute.
	 * @see #setNeedsInventoryIssuance(boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_NeedsInventoryIssuance()
	 * @model required="true"
	 * @generated
	 */
	boolean isNeedsInventoryIssuance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#isNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inventory Issuance</em>' attribute.
	 * @see #isNeedsInventoryIssuance()
	 * @generated
	 */
	void setNeedsInventoryIssuance(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderAttribute> getOrderAttributes();

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderDate()
	 * @model
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Delivery Schedules</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderDeliverySchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Delivery Schedules</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderDeliverySchedules()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderDeliverySchedule> getOrderDeliverySchedules();

	/**
	 * Returns the value of the '<em><b>Order Header Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderHeaderNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Header Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderHeaderNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderHeaderNote> getOrderHeaderNotes();

	/**
	 * Returns the value of the '<em><b>Order Header Work Efforts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderHeaderWorkEffort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Header Work Efforts</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderHeaderWorkEfforts()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderHeaderWorkEffort> getOrderHeaderWorkEfforts();

	/**
	 * Returns the value of the '<em><b>Order Item Groups</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderItemGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Groups</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderItemGroups()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderItemGroup> getOrderItemGroups();

	/**
	 * Returns the value of the '<em><b>Order Item Ship Groups</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Ship Groups</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderItemShipGroups()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderItemShipGroup> getOrderItemShipGroups();

	/**
	 * Returns the value of the '<em><b>Order Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderItems()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderItem> getOrderItems();

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Name</em>' attribute.
	 * @see #setOrderName(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getOrderName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderName <em>Order Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Name</em>' attribute.
	 * @see #getOrderName()
	 * @generated
	 */
	void setOrderName(String value);

	/**
	 * Returns the value of the '<em><b>Order Product Promo Codes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.order.OrderProductPromoCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Product Promo Codes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderProductPromoCodes()
	 * @model derived="true"
	 * @generated
	 */
	List<OrderProductPromoCode> getOrderProductPromoCodes();

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' reference.
	 * @see #setOrderType(OrderType)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OrderType()
	 * @model keys="orderTypeId"
	 * @generated
	 */
	OrderType getOrderType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOrderType <em>Order Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' reference.
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Origin Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Facility</em>' reference.
	 * @see #setOriginFacility(Facility)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_OriginFacility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getOriginFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getOriginFacility <em>Origin Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Facility</em>' reference.
	 * @see #getOriginFacility()
	 * @generated
	 */
	void setOriginFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Pick Sheet Printed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Sheet Printed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Sheet Printed Date</em>' attribute.
	 * @see #setPickSheetPrintedDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_PickSheetPrintedDate()
	 * @model annotation="mimo-ent-slot help='This will be set to a date when pick sheet of the order is printed'"
	 * @generated
	 */
	Date getPickSheetPrintedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getPickSheetPrintedDate <em>Pick Sheet Printed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Sheet Printed Date</em>' attribute.
	 * @see #getPickSheetPrintedDate()
	 * @generated
	 */
	void setPickSheetPrintedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_Priority()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Sets priority for Inventory Reservation' generated='false'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Uses</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Uses</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_ProductPromoUses()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductPromoUse> getProductPromoUses();

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_ProductStore()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Remaining Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Sub Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Sub Total</em>' attribute.
	 * @see #setRemainingSubTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_RemainingSubTotal()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getRemainingSubTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getRemainingSubTotal <em>Remaining Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Sub Total</em>' attribute.
	 * @see #getRemainingSubTotal()
	 * @generated
	 */
	void setRemainingSubTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sales Channel Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum</em>' reference.
	 * @see #setSalesChannelEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_SalesChannelEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getSalesChannelEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getSalesChannelEnum <em>Sales Channel Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum</em>' reference.
	 * @see #getSalesChannelEnum()
	 * @generated
	 */
	void setSalesChannelEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Sync Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Status</em>' reference.
	 * @see #setSyncStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_SyncStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getSyncStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getSyncStatus <em>Sync Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Status</em>' reference.
	 * @see #getSyncStatus()
	 * @generated
	 */
	void setSyncStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Terminal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Id</em>' attribute.
	 * @see #setTerminalId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_TerminalId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTerminalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTerminalId <em>Terminal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Id</em>' attribute.
	 * @see #getTerminalId()
	 * @generated
	 */
	void setTerminalId(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Orders</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Orders</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_TrackingCodeOrders()
	 * @model derived="true"
	 * @generated
	 */
	List<TrackingCodeOrder> getTrackingCodeOrders();

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_TransactionId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_VisitId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' reference.
	 * @see #setWebSite(WebSite)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderHeader_WebSite()
	 * @model keys="webSiteId"
	 * @generated
	 */
	WebSite getWebSite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderHeader#getWebSite <em>Web Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' reference.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(WebSite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isApprovable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isCancellable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isHoldable();

} // OrderHeader
