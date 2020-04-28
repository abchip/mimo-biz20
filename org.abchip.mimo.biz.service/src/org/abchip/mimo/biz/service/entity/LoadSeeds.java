/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import java.util.concurrent.Callable;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Seeds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.LoadSeeds#getSeedPattern <em>Seed Pattern</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.LoadSeeds#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getLoadSeeds()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.service.ServiceResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.service.ServiceResponse&gt;"
 * @generated
 */
public interface LoadSeeds extends ServiceRequest<ServiceResponse>, Callable<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Seed Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Pattern</em>' attribute.
	 * @see #setSeedPattern(String)
	 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getLoadSeeds_SeedPattern()
	 * @model required="true"
	 * @generated
	 */
	String getSeedPattern();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.entity.LoadSeeds#getSeedPattern <em>Seed Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Pattern</em>' attribute.
	 * @see #getSeedPattern()
	 * @generated
	 */
	void setSeedPattern(String value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #setUpdate(boolean)
	 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getLoadSeeds_Update()
	 * @model
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.entity.LoadSeeds#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

} // LoadSeeds
