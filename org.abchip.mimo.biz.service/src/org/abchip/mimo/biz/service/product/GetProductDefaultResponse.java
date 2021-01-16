/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Product Default Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.GetProductDefaultResponse#getFacilityPostalAddress <em>Facility Postal Address</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getGetProductDefaultResponse()
 * @model
 * @generated
 */
public interface GetProductDefaultResponse extends ServiceResponse {
	/**
	 * Returns the value of the '<em><b>Facility Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Postal Address</em>' reference.
	 * @see #setFacilityPostalAddress(PostalAddress)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getGetProductDefaultResponse_FacilityPostalAddress()
	 * @model required="true"
	 * @generated
	 */
	PostalAddress getFacilityPostalAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.GetProductDefaultResponse#getFacilityPostalAddress <em>Facility Postal Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Postal Address</em>' reference.
	 * @see #getFacilityPostalAddress()
	 * @generated
	 */
	void setFacilityPostalAddress(PostalAddress value);

} // GetProductDefaultResponse
