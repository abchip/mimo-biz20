/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.tracking;

import org.abchip.mimo.biz.model.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracking Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeType()
 * @model annotation="mimo-ent-frame dictionary='MarketingEntityLabels' formula='description'"
 * @generated
 */
public interface TrackingCodeType extends BizEntity {
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
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Type Id</em>' attribute.
	 * @see #setTrackingCodeTypeId(String)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeType_TrackingCodeTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTrackingCodeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code Type Id</em>' attribute.
	 * @see #getTrackingCodeTypeId()
	 * @generated
	 */
	void setTrackingCodeTypeId(String value);

} // TrackingCodeType
