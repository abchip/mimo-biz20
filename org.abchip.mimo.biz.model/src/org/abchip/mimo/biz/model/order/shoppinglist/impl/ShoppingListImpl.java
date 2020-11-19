/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.shoppinglist.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort;
import org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.promo.ProductPromoCode;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getLastAdminModified <em>Last Admin Modified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getLastOrderedDate <em>Last Ordered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getListName <em>List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getParentShoppingList <em>Parent Shopping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getProductPromoCode <em>Product Promo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getRecurrenceInfo <em>Recurrence Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getShoppingListItems <em>Shopping List Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getShoppingListType <em>Shopping List Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getShoppingListWorkEfforts <em>Shopping List Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl#getVisitorId <em>Visitor Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingListImpl extends EntityTypedImpl<ShoppingListType> implements ShoppingList {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppinglistPackage.Literals.SHOPPING_LIST;
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
	public String getCarrierPartyId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__CARRIER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__CARRIER_PARTY_ID, newCarrierPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID, newCarrierRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMech() {
		return (ContactMech)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMech(ContactMech newContactMech) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__CONTACT_MECH, newContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUom() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(String newCurrencyUom) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsActive() {
		return (Boolean)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__IS_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(Boolean newIsActive) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__IS_ACTIVE, newIsActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsPublic() {
		return (Boolean)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__IS_PUBLIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(Boolean newIsPublic) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__IS_PUBLIC, newIsPublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastAdminModified() {
		return (Date)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__LAST_ADMIN_MODIFIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAdminModified(Date newLastAdminModified) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__LAST_ADMIN_MODIFIED, newLastAdminModified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastOrderedDate() {
		return (Date)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__LAST_ORDERED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOrderedDate(Date newLastOrderedDate) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__LAST_ORDERED_DATE, newLastOrderedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListName() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__LIST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListName(String newListName) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__LIST_NAME, newListName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingList getParentShoppingList() {
		return (ShoppingList)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__PARENT_SHOPPING_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentShoppingList(ShoppingList newParentShoppingList) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__PARENT_SHOPPING_LIST, newParentShoppingList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethod() {
		return (PaymentMethod)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__PAYMENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__PAYMENT_METHOD, newPaymentMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCode getProductPromoCode() {
		return (ProductPromoCode)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__PRODUCT_PROMO_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCode(ProductPromoCode newProductPromoCode) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__PRODUCT_PROMO_CODE, newProductPromoCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStore() {
		return (ProductStore)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__PRODUCT_STORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStore(ProductStore newProductStore) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__PRODUCT_STORE, newProductStore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfo() {
		return (RecurrenceInfo)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__RECURRENCE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfo(RecurrenceInfo newRecurrenceInfo) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__RECURRENCE_INFO, newRecurrenceInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShoppingListItem> getShoppingListItems() {
		return (List<ShoppingListItem>)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHOPPING_LIST_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingListType getShoppingListType() {
		return (ShoppingListType)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHOPPING_LIST_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListType(ShoppingListType newShoppingListType) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHOPPING_LIST_TYPE, newShoppingListType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShoppingListWorkEffort> getShoppingListWorkEfforts() {
		return (List<ShoppingListWorkEffort>)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHOPPING_LIST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(String newShoppingListId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__SHOPPING_LIST_ID, newShoppingListId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitorId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST__VISITOR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitorId(String newVisitorId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST__VISITOR_ID, newVisitorId);
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
				case ShoppinglistPackage.SHOPPING_LIST__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case ShoppinglistPackage.SHOPPING_LIST__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case ShoppinglistPackage.SHOPPING_LIST__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case ShoppinglistPackage.SHOPPING_LIST__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return ShoppinglistPackage.SHOPPING_LIST__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return ShoppinglistPackage.SHOPPING_LIST__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return ShoppinglistPackage.SHOPPING_LIST__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return ShoppinglistPackage.SHOPPING_LIST__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ShoppingListImpl
