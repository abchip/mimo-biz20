/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.subscription.impl;

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
import org.abchip.mimo.biz.model.product.subscription.Subscription;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionAttribute;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionCommEvent;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionResource;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getAvailableTimeUom <em>Available Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getCanclAutmExtTimeUom <em>Cancl Autm Ext Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getExpirationCompletedDate <em>Expiration Completed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getExternalSubscriptionId <em>External Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getGracePeriodOnExpiryUom <em>Grace Period On Expiry Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getMaxLifeTimeUom <em>Max Life Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getNeedType <em>Need Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getOriginatedFromParty <em>Originated From Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getOriginatedFromRoleType <em>Originated From Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getSubscriptionAttributes <em>Subscription Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getSubscriptionCommEvents <em>Subscription Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getSubscriptionResource <em>Subscription Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getSubscriptionType <em>Subscription Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.SubscriptionImpl#getUseTimeUom <em>Use Time Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends EntityTypedImpl<SubscriptionType> implements Subscription {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAvailableTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTime(long newAvailableTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME, newAvailableTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getAvailableTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTimeUom(Uom newAvailableTimeUom) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME_UOM, newAvailableTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCanclAutmExtTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTime(long newCanclAutmExtTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME, newCanclAutmExtTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCanclAutmExtTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTimeUom(Uom newCanclAutmExtTimeUom) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM, newCanclAutmExtTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__COMMUNICATION_EVENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__COMMUNICATION_EVENT_ID, newCommunicationEventId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMech() {
		return (ContactMech)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMech(ContactMech newContactMech) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__CONTACT_MECH, newContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpirationCompletedDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationCompletedDate(Date newExpirationCompletedDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE, newExpirationCompletedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalSubscriptionId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalSubscriptionId(String newExternalSubscriptionId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID, newExternalSubscriptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getGracePeriodOnExpiry() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiry(long newGracePeriodOnExpiry) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY, newGracePeriodOnExpiry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getGracePeriodOnExpiryUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiryUom(Uom newGracePeriodOnExpiryUom) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM, newGracePeriodOnExpiryUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLifeTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTime(long newMaxLifeTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME, newMaxLifeTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMaxLifeTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTimeUom(Uom newMaxLifeTimeUom) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME_UOM, newMaxLifeTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeedType getNeedType() {
		return (NeedType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__NEED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedType(NeedType newNeedType) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__NEED_TYPE, newNeedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrder() {
		return (OrderHeader)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderHeader newOrder) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOriginatedFromParty() {
		return (Party)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromParty(Party newOriginatedFromParty) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_PARTY, newOriginatedFromParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getOriginatedFromRoleType() {
		return (RoleType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromRoleType(RoleType newOriginatedFromRoleType) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE, newOriginatedFromRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyNeedId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY_NEED_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyNeedId(String newPartyNeedId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY_NEED_ID, newPartyNeedId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategory() {
		return (ProductCategory)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT_CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategory(ProductCategory newProductCategory) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT_CATEGORY, newProductCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_FROM_DATE, newPurchaseFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_THRU_DATE, newPurchaseThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleType() {
		return (RoleType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleType(RoleType newRoleType) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ROLE_TYPE, newRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SubscriptionAttribute> getSubscriptionAttributes() {
		return (List<SubscriptionAttribute>)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SubscriptionCommEvent> getSubscriptionCommEvents() {
		return (List<SubscriptionCommEvent>)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionResource getSubscriptionResource() {
		return (SubscriptionResource)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResource(SubscriptionResource newSubscriptionResource) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_RESOURCE, newSubscriptionResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionType getSubscriptionType() {
		return (SubscriptionType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionType(SubscriptionType newSubscriptionType) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_TYPE, newSubscriptionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_COUNT_LIMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_COUNT_LIMIT, newUseCountLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(long newUseTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME, newUseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUseTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUom(Uom newUseTimeUom) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME_UOM, newUseTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case SubscriptionPackage.SUBSCRIPTION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SubscriptionPackage.SUBSCRIPTION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SubscriptionPackage.SUBSCRIPTION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SubscriptionPackage.SUBSCRIPTION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SubscriptionPackage.SUBSCRIPTION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SubscriptionPackage.SUBSCRIPTION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SubscriptionPackage.SUBSCRIPTION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SubscriptionPackage.SUBSCRIPTION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(String newSubscriptionId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_ID, newSubscriptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutomaticExtend() {
		return (Boolean)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__AUTOMATIC_EXTEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticExtend(Boolean newAutomaticExtend) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__AUTOMATIC_EXTEND, newAutomaticExtend);
	}

} //SubscriptionImpl
