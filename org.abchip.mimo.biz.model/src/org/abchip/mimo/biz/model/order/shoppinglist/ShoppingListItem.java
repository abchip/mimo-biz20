/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.shoppinglist;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingList <em>Shopping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getModifiedPrice <em>Modified Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantityPurchased <em>Quantity Purchased</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservStart <em>Reserv Start</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem()
 * @model
 * @generated
 */
public interface ShoppingListItem extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List</em>' reference.
	 * @see #setShoppingList(ShoppingList)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ShoppingList()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ShoppingList getShoppingList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingList <em>Shopping List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List</em>' reference.
	 * @see #getShoppingList()
	 * @generated
	 */
	void setShoppingList(ShoppingList value);

	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ConfigId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Modified Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Price</em>' attribute.
	 * @see #setModifiedPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ModifiedPrice()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getModifiedPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getModifiedPrice <em>Modified Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Price</em>' attribute.
	 * @see #getModifiedPrice()
	 * @generated
	 */
	void setModifiedPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Purchased</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Purchased</em>' attribute.
	 * @see #setQuantityPurchased(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_QuantityPurchased()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityPurchased();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantityPurchased <em>Quantity Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Purchased</em>' attribute.
	 * @see #getQuantityPurchased()
	 * @generated
	 */
	void setQuantityPurchased(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Length</em>' attribute.
	 * @see #setReservLength(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ReservLength()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservLength <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Length</em>' attribute.
	 * @see #getReservLength()
	 * @generated
	 */
	void setReservLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Persons</em>' attribute.
	 * @see #setReservPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ReservPersons()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservPersons <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Persons</em>' attribute.
	 * @see #getReservPersons()
	 * @generated
	 */
	void setReservPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Start</em>' attribute.
	 * @see #setReservStart(Date)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ReservStart()
	 * @model
	 * @generated
	 */
	Date getReservStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservStart <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Start</em>' attribute.
	 * @see #getReservStart()
	 * @generated
	 */
	void setReservStart(Date value);

	/**
	 * Returns the value of the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #setShoppingListItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItem_ShoppingListItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShoppingListItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 */
	void setShoppingListItemSeqId(String value);

} // ShoppingListItem
