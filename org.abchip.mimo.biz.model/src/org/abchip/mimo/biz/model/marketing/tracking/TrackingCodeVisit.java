/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.tracking;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracking Code Visit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getTrackingCode <em>Tracking Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getSourceEnum <em>Source Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeVisit()
 * @model
 * @generated
 */
public interface TrackingCodeVisit extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Tracking Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code</em>' reference.
	 * @see #setTrackingCode(TrackingCode)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeVisit_TrackingCode()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TrackingCode getTrackingCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getTrackingCode <em>Tracking Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code</em>' reference.
	 * @see #getTrackingCode()
	 * @generated
	 */
	void setTrackingCode(TrackingCode value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeVisit_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeVisit_VisitId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Source Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Enum</em>' reference.
	 * @see #setSourceEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeVisit_SourceEnum()
	 * @model
	 * @generated
	 */
	Enumeration getSourceEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeVisit#getSourceEnum <em>Source Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Enum</em>' reference.
	 * @see #getSourceEnum()
	 * @generated
	 */
	void setSourceEnum(Enumeration value);

} // TrackingCodeVisit
