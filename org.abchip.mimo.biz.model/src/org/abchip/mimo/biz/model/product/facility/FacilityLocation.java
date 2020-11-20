/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.geo.GeoPoint;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getAisleId <em>Aisle Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getAreaId <em>Area Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getGeoPoint <em>Geo Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getLevelId <em>Level Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getLocationTypeEnum <em>Location Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getPositionId <em>Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getSectionId <em>Section Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface FacilityLocation extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_Facility()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Aisle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aisle Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisle Id</em>' attribute.
	 * @see #setAisleId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_AisleId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAisleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getAisleId <em>Aisle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aisle Id</em>' attribute.
	 * @see #getAisleId()
	 * @generated
	 */
	void setAisleId(String value);

	/**
	 * Returns the value of the '<em><b>Area Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Id</em>' attribute.
	 * @see #setAreaId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_AreaId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAreaId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getAreaId <em>Area Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Id</em>' attribute.
	 * @see #getAreaId()
	 * @generated
	 */
	void setAreaId(String value);

	/**
	 * Returns the value of the '<em><b>Geo Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point</em>' reference.
	 * @see #setGeoPoint(GeoPoint)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_GeoPoint()
	 * @model
	 * @generated
	 */
	GeoPoint getGeoPoint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getGeoPoint <em>Geo Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point</em>' reference.
	 * @see #getGeoPoint()
	 * @generated
	 */
	void setGeoPoint(GeoPoint value);

	/**
	 * Returns the value of the '<em><b>Level Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Id</em>' attribute.
	 * @see #setLevelId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_LevelId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLevelId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getLevelId <em>Level Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Id</em>' attribute.
	 * @see #getLevelId()
	 * @generated
	 */
	void setLevelId(String value);

	/**
	 * Returns the value of the '<em><b>Location Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type Enum</em>' reference.
	 * @see #setLocationTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_LocationTypeEnum()
	 * @model
	 * @generated
	 */
	Enumeration getLocationTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getLocationTypeEnum <em>Location Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type Enum</em>' reference.
	 * @see #getLocationTypeEnum()
	 * @generated
	 */
	void setLocationTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Seq Id</em>' attribute.
	 * @see #setLocationSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_LocationSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getLocationSeqId <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id</em>' attribute.
	 * @see #getLocationSeqId()
	 * @generated
	 */
	void setLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Position Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Id</em>' attribute.
	 * @see #setPositionId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_PositionId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPositionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getPositionId <em>Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Id</em>' attribute.
	 * @see #getPositionId()
	 * @generated
	 */
	void setPositionId(String value);

	/**
	 * Returns the value of the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Id</em>' attribute.
	 * @see #setSectionId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityLocation_SectionId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSectionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityLocation#getSectionId <em>Section Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Id</em>' attribute.
	 * @see #getSectionId()
	 * @generated
	 */
	void setSectionId(String value);

} // FacilityLocation
