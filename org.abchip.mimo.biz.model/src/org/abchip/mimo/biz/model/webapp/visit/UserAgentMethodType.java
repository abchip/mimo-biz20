/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.visit;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Agent Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgentMethodType#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgentMethodType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgentMethodType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface UserAgentMethodType extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>User Agent Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Method Type Id</em>' attribute.
	 * @see #setUserAgentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgentMethodType_UserAgentMethodTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getUserAgentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgentMethodType#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Method Type Id</em>' attribute.
	 * @see #getUserAgentMethodTypeId()
	 * @generated
	 */
	void setUserAgentMethodTypeId(String value);

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
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgentMethodType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgentMethodType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // UserAgentMethodType
