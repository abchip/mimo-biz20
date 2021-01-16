/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.shoppinglist;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.promo.ProductPromoCode;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastAdminModified <em>Last Admin Modified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastOrderedDate <em>Last Ordered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getListName <em>List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParentShoppingList <em>Parent Shopping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductPromoCode <em>Product Promo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getRecurrenceInfo <em>Recurrence Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListItems <em>Shopping List Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListType <em>Shopping List Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListWorkEfforts <em>Shopping List Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getVisitorId <em>Visitor Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShoppingList extends EntityTyped<ShoppingListType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #setCarrierPartyId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_CarrierPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierPartyId <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #setCarrierRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_CarrierRoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCarrierRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 */
	void setCarrierRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ContactMech()
	 * @model
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' attribute.
	 * @see #setCurrencyUom(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_CurrencyUom()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCurrencyUom <em>Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' attribute.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(String value);

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
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(Boolean)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_IsActive()
	 * @model
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(Boolean)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_IsPublic()
	 * @model
	 * @generated
	 */
	Boolean getIsPublic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #getIsPublic()
	 * @generated
	 */
	void setIsPublic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Last Admin Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Admin Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Admin Modified</em>' attribute.
	 * @see #setLastAdminModified(Date)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_LastAdminModified()
	 * @model
	 * @generated
	 */
	Date getLastAdminModified();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastAdminModified <em>Last Admin Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Admin Modified</em>' attribute.
	 * @see #getLastAdminModified()
	 * @generated
	 */
	void setLastAdminModified(Date value);

	/**
	 * Returns the value of the '<em><b>Last Ordered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Ordered Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Ordered Date</em>' attribute.
	 * @see #setLastOrderedDate(Date)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_LastOrderedDate()
	 * @model
	 * @generated
	 */
	Date getLastOrderedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastOrderedDate <em>Last Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Ordered Date</em>' attribute.
	 * @see #getLastOrderedDate()
	 * @generated
	 */
	void setLastOrderedDate(Date value);

	/**
	 * Returns the value of the '<em><b>List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Name</em>' attribute.
	 * @see #setListName(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ListName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getListName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getListName <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Name</em>' attribute.
	 * @see #getListName()
	 * @generated
	 */
	void setListName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Shopping List</em>' reference.
	 * @see #setParentShoppingList(ShoppingList)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ParentShoppingList()
	 * @model
	 * @generated
	 */
	ShoppingList getParentShoppingList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParentShoppingList <em>Parent Shopping List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Shopping List</em>' reference.
	 * @see #getParentShoppingList()
	 * @generated
	 */
	void setParentShoppingList(ShoppingList value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' reference.
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_PaymentMethod()
	 * @model
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getPaymentMethod <em>Payment Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' reference.
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code</em>' reference.
	 * @see #setProductPromoCode(ProductPromoCode)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ProductPromoCode()
	 * @model
	 * @generated
	 */
	ProductPromoCode getProductPromoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductPromoCode <em>Product Promo Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code</em>' reference.
	 * @see #getProductPromoCode()
	 * @generated
	 */
	void setProductPromoCode(ProductPromoCode value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ProductStore()
	 * @model
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info</em>' reference.
	 * @see #setRecurrenceInfo(RecurrenceInfo)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_RecurrenceInfo()
	 * @model
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getRecurrenceInfo <em>Recurrence Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info</em>' reference.
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	void setRecurrenceInfo(RecurrenceInfo value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #setShipmentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShipmentMethodTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Shopping List Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListItems()
	 * @model derived="true"
	 * @generated
	 */
	List<ShoppingListItem> getShoppingListItems();

	/**
	 * Returns the value of the '<em><b>Shopping List Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Type</em>' reference.
	 * @see #setShoppingListType(ShoppingListType)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListType()
	 * @model
	 * @generated
	 */
	ShoppingListType getShoppingListType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListType <em>Shopping List Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Type</em>' reference.
	 * @see #getShoppingListType()
	 * @generated
	 */
	void setShoppingListType(ShoppingListType value);

	/**
	 * Returns the value of the '<em><b>Shopping List Work Efforts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Work Efforts</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListWorkEfforts()
	 * @model derived="true"
	 * @generated
	 */
	List<ShoppingListWorkEffort> getShoppingListWorkEfforts();

	/**
	 * Returns the value of the '<em><b>Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Id</em>' attribute.
	 * @see #setShoppingListId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListId <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Id</em>' attribute.
	 * @see #getShoppingListId()
	 * @generated
	 */
	void setShoppingListId(String value);

	/**
	 * Returns the value of the '<em><b>Visitor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitor Id</em>' attribute.
	 * @see #setVisitorId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingList_VisitorId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitorId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getVisitorId <em>Visitor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visitor Id</em>' attribute.
	 * @see #getVisitorId()
	 * @generated
	 */
	void setVisitorId(String value);

} // ShoppingList
