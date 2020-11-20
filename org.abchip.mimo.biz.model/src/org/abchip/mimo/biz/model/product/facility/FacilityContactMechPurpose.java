/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.util.Date;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Contact Mech Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityContactMechPurpose()
 * @model annotation="mimo-ent-frame title='Facility Contact Mechanism Purpose' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface FacilityContactMechPurpose extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Purpose Type</em>' reference.
	 * @see #setContactMechPurposeType(ContactMechPurposeType)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityContactMechPurpose_ContactMechPurposeType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMechPurposeType getContactMechPurposeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Purpose Type</em>' reference.
	 * @see #getContactMechPurposeType()
	 * @generated
	 */
	void setContactMechPurposeType(ContactMechPurposeType value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityContactMechPurpose_Facility()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityContactMechPurpose_ContactMech()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityContactMechPurpose_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityContactMechPurpose_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityContactMechPurpose#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // FacilityContactMechPurpose
