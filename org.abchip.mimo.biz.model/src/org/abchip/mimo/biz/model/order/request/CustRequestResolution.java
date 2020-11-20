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
 * A representation of the model object '<em><b>Cust Request Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestResolution#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestResolution#getCustRequestType <em>Cust Request Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestResolution#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestResolution()
 * @model annotation="mimo-ent-frame title='Customer Request Resolution' dictionary='OrderEntityLabels' formula='description'"
 * @generated
 */
public interface CustRequestResolution extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cust Request Resolution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Resolution Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Resolution Id</em>' attribute.
	 * @see #setCustRequestResolutionId(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestResolution_CustRequestResolutionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustRequestResolutionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestResolution#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Resolution Id</em>' attribute.
	 * @see #getCustRequestResolutionId()
	 * @generated
	 */
	void setCustRequestResolutionId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type</em>' reference.
	 * @see #setCustRequestType(CustRequestType)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestResolution_CustRequestType()
	 * @model
	 * @generated
	 */
	CustRequestType getCustRequestType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestResolution#getCustRequestType <em>Cust Request Type</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestResolution_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestResolution#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CustRequestResolution
