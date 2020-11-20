/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.subscription;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.need.NeedType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getAvailableTimeUom <em>Available Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getCanclAutmExtTimeUom <em>Cancl Autm Ext Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getExpirationCompletedDate <em>Expiration Completed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getExternalSubscriptionId <em>External Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getGracePeriodOnExpiryUom <em>Grace Period On Expiry Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getMaxLifeTimeUom <em>Max Life Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getNeedType <em>Need Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOriginatedFromParty <em>Originated From Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOriginatedFromRoleType <em>Originated From Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionAttributes <em>Subscription Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionCommEvents <em>Subscription Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionResource <em>Subscription Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionType <em>Subscription Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getUseTimeUom <em>Use Time Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface Subscription extends EntityTyped<SubscriptionType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time</em>' attribute.
	 * @see #setAvailableTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_AvailableTime()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAvailableTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getAvailableTime <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Time</em>' attribute.
	 * @see #getAvailableTime()
	 * @generated
	 */
	void setAvailableTime(long value);

	/**
	 * Returns the value of the '<em><b>Available Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time Uom</em>' reference.
	 * @see #setAvailableTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_AvailableTimeUom()
	 * @model
	 * @generated
	 */
	Uom getAvailableTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getAvailableTimeUom <em>Available Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Time Uom</em>' reference.
	 * @see #getAvailableTimeUom()
	 * @generated
	 */
	void setAvailableTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Cancl Autm Ext Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancl Autm Ext Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancl Autm Ext Time</em>' attribute.
	 * @see #setCanclAutmExtTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_CanclAutmExtTime()
	 * @model annotation="mimo-ent-slot help='The time period (before the end of the thruDate) after which the automatic extension of the subscription will be executed.'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getCanclAutmExtTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time</em>' attribute.
	 * @see #getCanclAutmExtTime()
	 * @generated
	 */
	void setCanclAutmExtTime(long value);

	/**
	 * Returns the value of the '<em><b>Cancl Autm Ext Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancl Autm Ext Time Uom</em>' reference.
	 * @see #setCanclAutmExtTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_CanclAutmExtTimeUom()
	 * @model annotation="mimo-ent-slot help='Unit Of Measure used for the automatic extension of the subscription.'"
	 * @generated
	 */
	Uom getCanclAutmExtTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getCanclAutmExtTimeUom <em>Cancl Autm Ext Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time Uom</em>' reference.
	 * @see #getCanclAutmExtTimeUom()
	 * @generated
	 */
	void setCanclAutmExtTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_CommunicationEventId()
	 * @model annotation="mimo-ent-slot help='now replaced by entity: SubscriptionCommEvent'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_ContactMech()
	 * @model
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Completed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Completed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Completed Date</em>' attribute.
	 * @see #setExpirationCompletedDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_ExpirationCompletedDate()
	 * @model annotation="mimo-ent-slot help='The date when expiration completed.'"
	 * @generated
	 */
	Date getExpirationCompletedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getExpirationCompletedDate <em>Expiration Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Completed Date</em>' attribute.
	 * @see #getExpirationCompletedDate()
	 * @generated
	 */
	void setExpirationCompletedDate(Date value);

	/**
	 * Returns the value of the '<em><b>External Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Subscription Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Subscription Id</em>' attribute.
	 * @see #setExternalSubscriptionId(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_ExternalSubscriptionId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExternalSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getExternalSubscriptionId <em>External Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Subscription Id</em>' attribute.
	 * @see #getExternalSubscriptionId()
	 * @generated
	 */
	void setExternalSubscriptionId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Grace Period On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grace Period On Expiry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grace Period On Expiry</em>' attribute.
	 * @see #setGracePeriodOnExpiry(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_GracePeriodOnExpiry()
	 * @model annotation="mimo-ent-slot help='The time period (before the end of the thruDate) after which the automatic extension of the subscription will be executed.'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getGracePeriodOnExpiry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Period On Expiry</em>' attribute.
	 * @see #getGracePeriodOnExpiry()
	 * @generated
	 */
	void setGracePeriodOnExpiry(long value);

	/**
	 * Returns the value of the '<em><b>Grace Period On Expiry Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grace Period On Expiry Uom</em>' reference.
	 * @see #setGracePeriodOnExpiryUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_GracePeriodOnExpiryUom()
	 * @model annotation="mimo-ent-slot help='Unit Of Measure used for the automatic extension of the subscription.'"
	 * @generated
	 */
	Uom getGracePeriodOnExpiryUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getGracePeriodOnExpiryUom <em>Grace Period On Expiry Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Period On Expiry Uom</em>' reference.
	 * @see #getGracePeriodOnExpiryUom()
	 * @generated
	 */
	void setGracePeriodOnExpiryUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_InventoryItem()
	 * @model
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getInventoryItem <em>Inventory Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Max Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Life Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Life Time</em>' attribute.
	 * @see #setMaxLifeTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_MaxLifeTime()
	 * @model annotation="mimo-ent-slot help='The length in time of the (extended) subscription'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxLifeTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getMaxLifeTime <em>Max Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time</em>' attribute.
	 * @see #getMaxLifeTime()
	 * @generated
	 */
	void setMaxLifeTime(long value);

	/**
	 * Returns the value of the '<em><b>Max Life Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Life Time Uom</em>' reference.
	 * @see #setMaxLifeTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_MaxLifeTimeUom()
	 * @model
	 * @generated
	 */
	Uom getMaxLifeTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getMaxLifeTimeUom <em>Max Life Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time Uom</em>' reference.
	 * @see #getMaxLifeTimeUom()
	 * @generated
	 */
	void setMaxLifeTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Need Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Type</em>' reference.
	 * @see #setNeedType(NeedType)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_NeedType()
	 * @model
	 * @generated
	 */
	NeedType getNeedType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getNeedType <em>Need Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Type</em>' reference.
	 * @see #getNeedType()
	 * @generated
	 */
	void setNeedType(NeedType value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_Order()
	 * @model
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Originated From Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originated From Party</em>' reference.
	 * @see #setOriginatedFromParty(Party)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_OriginatedFromParty()
	 * @model
	 * @generated
	 */
	Party getOriginatedFromParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOriginatedFromParty <em>Originated From Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originated From Party</em>' reference.
	 * @see #getOriginatedFromParty()
	 * @generated
	 */
	void setOriginatedFromParty(Party value);

	/**
	 * Returns the value of the '<em><b>Originated From Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originated From Role Type</em>' reference.
	 * @see #setOriginatedFromRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_OriginatedFromRoleType()
	 * @model
	 * @generated
	 */
	RoleType getOriginatedFromRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getOriginatedFromRoleType <em>Originated From Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originated From Role Type</em>' reference.
	 * @see #getOriginatedFromRoleType()
	 * @generated
	 */
	void setOriginatedFromRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Party Need Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Need Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Need Id</em>' attribute.
	 * @see #setPartyNeedId(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_PartyNeedId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyNeedId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getPartyNeedId <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Need Id</em>' attribute.
	 * @see #getPartyNeedId()
	 * @generated
	 */
	void setPartyNeedId(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_ProductCategory()
	 * @model
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase From Date</em>' attribute.
	 * @see #setPurchaseFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase From Date</em>' attribute.
	 * @see #getPurchaseFromDate()
	 * @generated
	 */
	void setPurchaseFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #setPurchaseThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_RoleType()
	 * @model
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Subscription Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.subscription.SubscriptionAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_SubscriptionAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<SubscriptionAttribute> getSubscriptionAttributes();

	/**
	 * Returns the value of the '<em><b>Subscription Comm Events</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.subscription.SubscriptionCommEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Comm Events</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_SubscriptionCommEvents()
	 * @model derived="true"
	 * @generated
	 */
	List<SubscriptionCommEvent> getSubscriptionCommEvents();

	/**
	 * Returns the value of the '<em><b>Subscription Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Resource</em>' reference.
	 * @see #setSubscriptionResource(SubscriptionResource)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_SubscriptionResource()
	 * @model
	 * @generated
	 */
	SubscriptionResource getSubscriptionResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionResource <em>Subscription Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Resource</em>' reference.
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	void setSubscriptionResource(SubscriptionResource value);

	/**
	 * Returns the value of the '<em><b>Subscription Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Type</em>' reference.
	 * @see #setSubscriptionType(SubscriptionType)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_SubscriptionType()
	 * @model
	 * @generated
	 */
	SubscriptionType getSubscriptionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionType <em>Subscription Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Type</em>' reference.
	 * @see #getSubscriptionType()
	 * @generated
	 */
	void setSubscriptionType(SubscriptionType value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Count Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Count Limit</em>' attribute.
	 * @see #setUseCountLimit(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_UseCountLimit()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time</em>' attribute.
	 * @see #setUseTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_UseTime()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getUseTime <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time</em>' attribute.
	 * @see #getUseTime()
	 * @generated
	 */
	void setUseTime(long value);

	/**
	 * Returns the value of the '<em><b>Use Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time Uom</em>' reference.
	 * @see #setUseTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_UseTimeUom()
	 * @model
	 * @generated
	 */
	Uom getUseTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getUseTimeUom <em>Use Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Uom</em>' reference.
	 * @see #getUseTimeUom()
	 * @generated
	 */
	void setUseTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #setSubscriptionId(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_SubscriptionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Extend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Extend</em>' attribute.
	 * @see #setAutomaticExtend(Boolean)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscription_AutomaticExtend()
	 * @model annotation="mimo-ent-slot help='If this subscription is automatically extended with the same period as the initial period.'"
	 * @generated
	 */
	Boolean getAutomaticExtend();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.Subscription#getAutomaticExtend <em>Automatic Extend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Extend</em>' attribute.
	 * @see #getAutomaticExtend()
	 * @generated
	 */
	void setAutomaticExtend(Boolean value);

} // Subscription
