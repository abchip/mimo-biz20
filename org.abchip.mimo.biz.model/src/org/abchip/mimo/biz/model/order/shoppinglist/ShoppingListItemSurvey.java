/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.shoppinglist;

import org.abchip.mimo.biz.model.content.survey.SurveyResponse;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List Item Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingList <em>Shopping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponse <em>Survey Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey()
 * @model annotation="mimo-ent-frame title='Shopping List Item'"
 * @generated
 */
public interface ShoppingListItemSurvey extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List</em>' reference.
	 * @see #setShoppingList(ShoppingList)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey_ShoppingList()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ShoppingList getShoppingList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingList <em>Shopping List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List</em>' reference.
	 * @see #getShoppingList()
	 * @generated
	 */
	void setShoppingList(ShoppingList value);

	/**
	 * Returns the value of the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response</em>' reference.
	 * @see #setSurveyResponse(SurveyResponse)
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey_SurveyResponse()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SurveyResponse getSurveyResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponse <em>Survey Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response</em>' reference.
	 * @see #getSurveyResponse()
	 * @generated
	 */
	void setSurveyResponse(SurveyResponse value);

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
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey_ShoppingListItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShoppingListItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 */
	void setShoppingListItemSeqId(String value);

} // ShoppingListItemSurvey
