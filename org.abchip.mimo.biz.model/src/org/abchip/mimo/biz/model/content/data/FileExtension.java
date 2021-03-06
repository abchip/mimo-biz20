/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.FileExtension#getFileExtensionId <em>File Extension Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.FileExtension#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getFileExtension()
 * @model
 * @generated
 */
public interface FileExtension extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>File Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension Id</em>' attribute.
	 * @see #setFileExtensionId(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getFileExtension_FileExtensionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getFileExtensionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.FileExtension#getFileExtensionId <em>File Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension Id</em>' attribute.
	 * @see #getFileExtensionId()
	 * @generated
	 */
	void setFileExtensionId(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' reference.
	 * @see #setMimeType(MimeType)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getFileExtension_MimeType()
	 * @model
	 * @generated
	 */
	MimeType getMimeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.FileExtension#getMimeType <em>Mime Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' reference.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeType value);

} // FileExtension
