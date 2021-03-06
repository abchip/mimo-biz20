/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.status;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusItem#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusItem#getMainStatusValidChanges <em>Main Status Valid Changes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusItem#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusItem#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusItem#getStatusType <em>Status Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem()
 * @model annotation="mimo-ent-frame title='Status' dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface StatusItem extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Main Status Valid Changes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.common.status.StatusValidChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Status Valid Changes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem_MainStatusValidChanges()
	 * @model derived="true"
	 * @generated
	 */
	List<StatusValidChange> getMainStatusValidChanges();

	/**
	 * Returns the value of the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Id</em>' attribute.
	 * @see #setSequenceId(String)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem_SequenceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusItem#getSequenceId <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Id</em>' attribute.
	 * @see #getSequenceId()
	 * @generated
	 */
	void setSequenceId(String value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' attribute.
	 * @see #setStatusCode(String)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem_StatusCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getStatusCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusItem#getStatusCode <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' attribute.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(String value);

	/**
	 * Returns the value of the '<em><b>Status Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Type</em>' reference.
	 * @see #setStatusType(StatusType)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem_StatusType()
	 * @model
	 * @generated
	 */
	StatusType getStatusType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusItem#getStatusType <em>Status Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Type</em>' reference.
	 * @see #getStatusType()
	 * @generated
	 */
	void setStatusType(StatusType value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusItem_StatusId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusItem#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // StatusItem
