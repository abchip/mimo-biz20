/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

import org.abchip.mimo.biz.model.content.content.ContentPurposeType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getDataResource <em>Data Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getContentPurposeType <em>Content Purpose Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourcePurpose()
 * @model annotation="mimo-ent-frame title='Data Object Purpose'"
 * @generated
 */
public interface DataResourcePurpose extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource</em>' reference.
	 * @see #setDataResource(DataResource)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourcePurpose_DataResource()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	DataResource getDataResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getDataResource <em>Data Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource</em>' reference.
	 * @see #getDataResource()
	 * @generated
	 */
	void setDataResource(DataResource value);

	/**
	 * Returns the value of the '<em><b>Content Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purpose Type</em>' reference.
	 * @see #setContentPurposeType(ContentPurposeType)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourcePurpose_ContentPurposeType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentPurposeType getContentPurposeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose#getContentPurposeType <em>Content Purpose Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Purpose Type</em>' reference.
	 * @see #getContentPurposeType()
	 * @generated
	 */
	void setContentPurposeType(ContentPurposeType value);

} // DataResourcePurpose
