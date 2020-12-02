/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.ImageDataResource#getImageData <em>Image Data</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getImageDataResource()
 * @model annotation="mimo-ent-frame title='Image Data Object'"
 *        annotation="mimo-ent-frame-type dataResourceType='IMAGE_OBJECT'"
 * @generated
 */
public interface ImageDataResource extends DataResource {
	/**
	 * Returns the value of the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Data</em>' attribute.
	 * @see #setImageData(byte[])
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getImageDataResource_ImageData()
	 * @model
	 * @generated
	 */
	byte[] getImageData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.ImageDataResource#getImageData <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Data</em>' attribute.
	 * @see #getImageData()
	 * @generated
	 */
	void setImageData(byte[] value);

} // ImageDataResource
