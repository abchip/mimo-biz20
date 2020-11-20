/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.shoppinglist;

import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getShoppingList <em>Shopping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListWorkEffort()
 * @model
 * @generated
 */
public interface ShoppingListWorkEffort extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List</em>' reference.
	 * @see #setShoppingList(ShoppingList)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListWorkEffort_ShoppingList()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ShoppingList getShoppingList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getShoppingList <em>Shopping List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List</em>' reference.
	 * @see #getShoppingList()
	 * @generated
	 */
	void setShoppingList(ShoppingList value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListWorkEffort_WorkEffort()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

} // ShoppingListWorkEffort
