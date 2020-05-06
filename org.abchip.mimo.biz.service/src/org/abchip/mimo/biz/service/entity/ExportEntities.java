/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * A representation of the model object '<em><b>Export Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.ExportEntities#getPathTo <em>Path To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getExportEntities()
 * @model
 * @generated
 */
public interface ExportEntities extends ServiceRequest<ServiceResponse> {

	/**
	 * Returns the value of the '<em><b>Path To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To</em>' attribute.
	 * @see #setPathTo(String)
	 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getExportEntities_PathTo()
	 * @model required="true"
	 * @generated
	 */
	String getPathTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.entity.ExportEntities#getPathTo <em>Path To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To</em>' attribute.
	 * @see #getPathTo()
	 * @generated
	 */
	void setPathTo(String value);
} // ExportEntities
