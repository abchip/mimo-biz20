/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.geo.GeoPoint;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getClosedDate <em>Closed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultDaysToShip <em>Default Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultDimensionUom <em>Default Dimension Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultInventoryItemType <em>Default Inventory Item Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultWeightUom <em>Default Weight Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityAttributes <em>Facility Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityContactMechs <em>Facility Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityContents <em>Facility Contents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityGroupMembers <em>Facility Group Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityLevel <em>Facility Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityLocations <em>Facility Locations</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilitySize <em>Facility Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilitySizeUom <em>Facility Size Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getGeoPoint <em>Geo Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getOldSquareFootage <em>Old Square Footage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getOpenedDate <em>Opened Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getOwnerParty <em>Owner Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getParentFacility <em>Parent Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getPrimaryFacilityGroup <em>Primary Facility Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Facility#getProductStore <em>Product Store</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface Facility extends EntityTyped<FacilityType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Closed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Date</em>' attribute.
	 * @see #setClosedDate(Date)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_ClosedDate()
	 * @model
	 * @generated
	 */
	Date getClosedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getClosedDate <em>Closed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Date</em>' attribute.
	 * @see #getClosedDate()
	 * @generated
	 */
	void setClosedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Days To Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Days To Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Days To Ship</em>' attribute.
	 * @see #setDefaultDaysToShip(long)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_DefaultDaysToShip()
	 * @model annotation="mimo-ent-slot help='In the absence of a product specific days to ship in ProductFacility, this will be used'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDefaultDaysToShip();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultDaysToShip <em>Default Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Days To Ship</em>' attribute.
	 * @see #getDefaultDaysToShip()
	 * @generated
	 */
	void setDefaultDaysToShip(long value);

	/**
	 * Returns the value of the '<em><b>Default Dimension Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Dimension Uom</em>' reference.
	 * @see #setDefaultDimensionUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_DefaultDimensionUom()
	 * @model annotation="mimo-ent-slot help='This field store the unit of measurement of dimension (length, width and height)'"
	 * @generated
	 */
	Uom getDefaultDimensionUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultDimensionUom <em>Default Dimension Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dimension Uom</em>' reference.
	 * @see #getDefaultDimensionUom()
	 * @generated
	 */
	void setDefaultDimensionUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Default Inventory Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Inventory Item Type</em>' reference.
	 * @see #setDefaultInventoryItemType(InventoryItemType)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_DefaultInventoryItemType()
	 * @model
	 * @generated
	 */
	InventoryItemType getDefaultInventoryItemType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultInventoryItemType <em>Default Inventory Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Inventory Item Type</em>' reference.
	 * @see #getDefaultInventoryItemType()
	 * @generated
	 */
	void setDefaultInventoryItemType(InventoryItemType value);

	/**
	 * Returns the value of the '<em><b>Default Weight Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Weight Uom</em>' reference.
	 * @see #setDefaultWeightUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_DefaultWeightUom()
	 * @model
	 * @generated
	 */
	Uom getDefaultWeightUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getDefaultWeightUom <em>Default Weight Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Weight Uom</em>' reference.
	 * @see #getDefaultWeightUom()
	 * @generated
	 */
	void setDefaultWeightUom(Uom value);

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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Facility Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.FacilityAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<FacilityAttribute> getFacilityAttributes();

	/**
	 * Returns the value of the '<em><b>Facility Contact Mechs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.FacilityContactMech}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Contact Mechs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityContactMechs()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<FacilityContactMech> getFacilityContactMechs();

	/**
	 * Returns the value of the '<em><b>Facility Contents</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.FacilityContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Contents</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityContents()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<FacilityContent> getFacilityContents();

	/**
	 * Returns the value of the '<em><b>Facility Group Members</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.FacilityGroupMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Members</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityGroupMembers()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<FacilityGroupMember> getFacilityGroupMembers();

	/**
	 * Returns the value of the '<em><b>Facility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Level</em>' attribute.
	 * @see #setFacilityLevel(long)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityLevel()
	 * @model annotation="mimo-ent-slot help='This field will define the level of facility.'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getFacilityLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityLevel <em>Facility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Level</em>' attribute.
	 * @see #getFacilityLevel()
	 * @generated
	 */
	void setFacilityLevel(long value);

	/**
	 * Returns the value of the '<em><b>Facility Locations</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.FacilityLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Locations</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityLocations()
	 * @model derived="true"
	 * @generated
	 */
	List<FacilityLocation> getFacilityLocations();

	/**
	 * Returns the value of the '<em><b>Facility Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Name</em>' attribute.
	 * @see #setFacilityName(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getFacilityName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityName <em>Facility Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Name</em>' attribute.
	 * @see #getFacilityName()
	 * @generated
	 */
	void setFacilityName(String value);

	/**
	 * Returns the value of the '<em><b>Facility Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Size</em>' attribute.
	 * @see #setFacilitySize(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilitySize()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getFacilitySize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilitySize <em>Facility Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Size</em>' attribute.
	 * @see #getFacilitySize()
	 * @generated
	 */
	void setFacilitySize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Facility Size Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Size Uom</em>' reference.
	 * @see #setFacilitySizeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilitySizeUom()
	 * @model
	 * @generated
	 */
	Uom getFacilitySizeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilitySizeUom <em>Facility Size Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Size Uom</em>' reference.
	 * @see #getFacilitySizeUom()
	 * @generated
	 */
	void setFacilitySizeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Facility Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type</em>' reference.
	 * @see #setFacilityType(FacilityType)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityType()
	 * @model
	 * @generated
	 */
	FacilityType getFacilityType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityType <em>Facility Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type</em>' reference.
	 * @see #getFacilityType()
	 * @generated
	 */
	void setFacilityType(FacilityType value);

	/**
	 * Returns the value of the '<em><b>Geo Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point</em>' reference.
	 * @see #setGeoPoint(GeoPoint)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_GeoPoint()
	 * @model
	 * @generated
	 */
	GeoPoint getGeoPoint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getGeoPoint <em>Geo Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point</em>' reference.
	 * @see #getGeoPoint()
	 * @generated
	 */
	void setGeoPoint(GeoPoint value);

	/**
	 * Returns the value of the '<em><b>Old Square Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Square Footage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Square Footage</em>' attribute.
	 * @see #setOldSquareFootage(long)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_OldSquareFootage()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getOldSquareFootage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getOldSquareFootage <em>Old Square Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Square Footage</em>' attribute.
	 * @see #getOldSquareFootage()
	 * @generated
	 */
	void setOldSquareFootage(long value);

	/**
	 * Returns the value of the '<em><b>Opened Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opened Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opened Date</em>' attribute.
	 * @see #setOpenedDate(Date)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_OpenedDate()
	 * @model
	 * @generated
	 */
	Date getOpenedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getOpenedDate <em>Opened Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opened Date</em>' attribute.
	 * @see #getOpenedDate()
	 * @generated
	 */
	void setOpenedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Owner Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party</em>' reference.
	 * @see #setOwnerParty(Party)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_OwnerParty()
	 * @model
	 * @generated
	 */
	Party getOwnerParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getOwnerParty <em>Owner Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party</em>' reference.
	 * @see #getOwnerParty()
	 * @generated
	 */
	void setOwnerParty(Party value);

	/**
	 * Returns the value of the '<em><b>Parent Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Facility</em>' reference.
	 * @see #setParentFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_ParentFacility()
	 * @model
	 * @generated
	 */
	Facility getParentFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getParentFacility <em>Parent Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Facility</em>' reference.
	 * @see #getParentFacility()
	 * @generated
	 */
	void setParentFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Primary Facility Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Facility Group</em>' reference.
	 * @see #setPrimaryFacilityGroup(FacilityGroup)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_PrimaryFacilityGroup()
	 * @model
	 * @generated
	 */
	FacilityGroup getPrimaryFacilityGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getPrimaryFacilityGroup <em>Primary Facility Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Facility Group</em>' reference.
	 * @see #getPrimaryFacilityGroup()
	 * @generated
	 */
	void setPrimaryFacilityGroup(FacilityGroup value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_ProductStore()
	 * @model
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' attribute.
	 * @see #setFacilityId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacility_FacilityId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Facility#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

} // Facility
