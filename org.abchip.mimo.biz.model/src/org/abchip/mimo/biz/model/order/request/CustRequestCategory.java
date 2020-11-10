/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestCategory#getCustRequestCategoryId <em>Cust Request Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestCategory#getCustRequestType <em>Cust Request Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestCategory#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCategory()
 * @model annotation="mimo-ent-frame title='Customer Category Type' formula='description'"
 * @generated
 */
public interface CustRequestCategory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cust Request Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Category Id</em>' attribute.
	 * @see #setCustRequestCategoryId(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCategory_CustRequestCategoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustRequestCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestCategory#getCustRequestCategoryId <em>Cust Request Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Category Id</em>' attribute.
	 * @see #getCustRequestCategoryId()
	 * @generated
	 */
	void setCustRequestCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type</em>' reference.
	 * @see #setCustRequestType(CustRequestType)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCategory_CustRequestType()
	 * @model keys="custRequestTypeId"
	 * @generated
	 */
	CustRequestType getCustRequestType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestCategory#getCustRequestType <em>Cust Request Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Type</em>' reference.
	 * @see #getCustRequestType()
	 * @generated
	 */
	void setCustRequestType(CustRequestType value);

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
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCategory_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CustRequestCategory
