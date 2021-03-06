/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.geo;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getElevation <em>Elevation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getElevationUom <em>Elevation Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getGeoPointTypeEnum <em>Geo Point Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getInformation <em>Information</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint()
 * @model annotation="mimo-ent-frame title='Geographic Location' dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface GeoPoint extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(BigDecimal)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_Elevation()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getElevation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Elevation Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Uom</em>' reference.
	 * @see #setElevationUom(Uom)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_ElevationUom()
	 * @model annotation="mimo-ent-slot help='UOM for elevation (feet, meters, etc.)'"
	 * @generated
	 */
	Uom getElevationUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getElevationUom <em>Elevation Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Uom</em>' reference.
	 * @see #getElevationUom()
	 * @generated
	 */
	void setElevationUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Geo Point Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Type Enum</em>' reference.
	 * @see #setGeoPointTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_GeoPointTypeEnum()
	 * @model
	 * @generated
	 */
	Enumeration getGeoPointTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getGeoPointTypeEnum <em>Geo Point Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Type Enum</em>' reference.
	 * @see #getGeoPointTypeEnum()
	 * @generated
	 */
	void setGeoPointTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Geo Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Point Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Id</em>' attribute.
	 * @see #setGeoPointId(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_GeoPointId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGeoPointId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getGeoPointId <em>Geo Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Id</em>' attribute.
	 * @see #getGeoPointId()
	 * @generated
	 */
	void setGeoPointId(String value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(DataSource)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_Information()
	 * @model annotation="mimo-ent-slot help='To enter any related information'"
	 *        annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_Latitude()
	 * @model required="true"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLatitude();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoPoint_Longitude()
	 * @model required="true"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLongitude();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoPoint#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(String value);

} // GeoPoint
