/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convert Seeds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.ConvertSeeds#getReaders <em>Readers</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getConvertSeeds()
 * @model
 * @generated
 */
public interface ConvertSeeds extends ServiceRequest<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Readers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readers</em>' attribute.
	 * @see #setReaders(String)
	 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getConvertSeeds_Readers()
	 * @model required="true"
	 * @generated
	 */
	String getReaders();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.entity.ConvertSeeds#getReaders <em>Readers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readers</em>' attribute.
	 * @see #getReaders()
	 * @generated
	 */
	void setReaders(String value);

} // ConvertSeeds
