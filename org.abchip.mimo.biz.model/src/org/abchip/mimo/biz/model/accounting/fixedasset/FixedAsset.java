/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getAcquireOrder <em>Acquire Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getAcquireOrderItemSeqId <em>Acquire Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getActualEndOfLife <em>Actual End Of Life</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getClassEnum <em>Class Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDateAcquired <em>Date Acquired</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDateLastServiced <em>Date Last Serviced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDateNextService <em>Date Next Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDepreciation <em>Depreciation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getExpectedEndOfLife <em>Expected End Of Life</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetAttributes <em>Fixed Asset Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetGeoPoints <em>Fixed Asset Geo Points</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetIdents <em>Fixed Asset Idents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetMaints <em>Fixed Asset Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetName <em>Fixed Asset Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetRegistrations <em>Fixed Asset Registrations</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetStdCosts <em>Fixed Asset Std Costs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetType <em>Fixed Asset Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getInstanceOfProduct <em>Instance Of Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getLocatedAtFacility <em>Located At Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getLocatedAtLocationSeqId <em>Located At Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getParentFixedAsset <em>Parent Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getProductionCapacity <em>Production Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getPurchaseCost <em>Purchase Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getPurchaseCostUomId <em>Purchase Cost Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getSalvageValue <em>Salvage Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset()
 * @model
 * @generated
 */
public interface FixedAsset extends EntityTyped<FixedAssetType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Acquire Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Order Item Seq Id</em>' attribute.
	 * @see #setAcquireOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_AcquireOrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAcquireOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getAcquireOrderItemSeqId <em>Acquire Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquire Order Item Seq Id</em>' attribute.
	 * @see #getAcquireOrderItemSeqId()
	 * @generated
	 */
	void setAcquireOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Actual End Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual End Of Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual End Of Life</em>' attribute.
	 * @see #setActualEndOfLife(Date)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_ActualEndOfLife()
	 * @model
	 * @generated
	 */
	Date getActualEndOfLife();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getActualEndOfLife <em>Actual End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual End Of Life</em>' attribute.
	 * @see #getActualEndOfLife()
	 * @generated
	 */
	void setActualEndOfLife(Date value);

	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' reference.
	 * @see #setCalendar(TechDataCalendar)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_Calendar()
	 * @model keys="calendarId"
	 * @generated
	 */
	TechDataCalendar getCalendar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getCalendar <em>Calendar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' reference.
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(TechDataCalendar value);

	/**
	 * Returns the value of the '<em><b>Class Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Enum</em>' reference.
	 * @see #setClassEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_ClassEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getClassEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getClassEnum <em>Class Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Enum</em>' reference.
	 * @see #getClassEnum()
	 * @generated
	 */
	void setClassEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Date Acquired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Acquired</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Acquired</em>' attribute.
	 * @see #setDateAcquired(Date)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_DateAcquired()
	 * @model
	 * @generated
	 */
	Date getDateAcquired();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDateAcquired <em>Date Acquired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Acquired</em>' attribute.
	 * @see #getDateAcquired()
	 * @generated
	 */
	void setDateAcquired(Date value);

	/**
	 * Returns the value of the '<em><b>Date Last Serviced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Serviced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Serviced</em>' attribute.
	 * @see #setDateLastServiced(Date)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_DateLastServiced()
	 * @model
	 * @generated
	 */
	Date getDateLastServiced();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDateLastServiced <em>Date Last Serviced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Serviced</em>' attribute.
	 * @see #getDateLastServiced()
	 * @generated
	 */
	void setDateLastServiced(Date value);

	/**
	 * Returns the value of the '<em><b>Date Next Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Next Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Next Service</em>' attribute.
	 * @see #setDateNextService(Date)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_DateNextService()
	 * @model
	 * @generated
	 */
	Date getDateNextService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDateNextService <em>Date Next Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Next Service</em>' attribute.
	 * @see #getDateNextService()
	 * @generated
	 */
	void setDateNextService(Date value);

	/**
	 * Returns the value of the '<em><b>Depreciation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depreciation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depreciation</em>' attribute.
	 * @see #setDepreciation(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_Depreciation()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getDepreciation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getDepreciation <em>Depreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depreciation</em>' attribute.
	 * @see #getDepreciation()
	 * @generated
	 */
	void setDepreciation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Expected End Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected End Of Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected End Of Life</em>' attribute.
	 * @see #setExpectedEndOfLife(Date)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_ExpectedEndOfLife()
	 * @model
	 * @generated
	 */
	Date getExpectedEndOfLife();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getExpectedEndOfLife <em>Expected End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected End Of Life</em>' attribute.
	 * @see #getExpectedEndOfLife()
	 * @generated
	 */
	void setExpectedEndOfLife(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetAttribute> getFixedAssetAttributes();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Geo Points</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetGeoPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Geo Points</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetGeoPoints()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<FixedAssetGeoPoint> getFixedAssetGeoPoints();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Idents</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetIdent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Idents</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetIdents()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetIdent> getFixedAssetIdents();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Maints</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Maints</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetMaints()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetMaint> getFixedAssetMaints();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Name</em>' attribute.
	 * @see #setFixedAssetName(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getFixedAssetName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetName <em>Fixed Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Name</em>' attribute.
	 * @see #getFixedAssetName()
	 * @generated
	 */
	void setFixedAssetName(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Registrations</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetRegistration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Registrations</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetRegistrations()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetRegistration> getFixedAssetRegistrations();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Std Costs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetStdCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Std Costs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetStdCosts()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<FixedAssetStdCost> getFixedAssetStdCosts();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type</em>' reference.
	 * @see #setFixedAssetType(FixedAssetType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetType()
	 * @model keys="fixedAssetTypeId"
	 * @generated
	 */
	FixedAssetType getFixedAssetType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetType <em>Fixed Asset Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type</em>' reference.
	 * @see #getFixedAssetType()
	 * @generated
	 */
	void setFixedAssetType(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Instance Of Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Product</em>' reference.
	 * @see #setInstanceOfProduct(Product)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_InstanceOfProduct()
	 * @model keys="productId"
	 * @generated
	 */
	Product getInstanceOfProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getInstanceOfProduct <em>Instance Of Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Product</em>' reference.
	 * @see #getInstanceOfProduct()
	 * @generated
	 */
	void setInstanceOfProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Located At Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At Facility</em>' reference.
	 * @see #setLocatedAtFacility(Facility)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_LocatedAtFacility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getLocatedAtFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getLocatedAtFacility <em>Located At Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At Facility</em>' reference.
	 * @see #getLocatedAtFacility()
	 * @generated
	 */
	void setLocatedAtFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Located At Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At Location Seq Id</em>' attribute.
	 * @see #setLocatedAtLocationSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_LocatedAtLocationSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLocatedAtLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getLocatedAtLocationSeqId <em>Located At Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At Location Seq Id</em>' attribute.
	 * @see #getLocatedAtLocationSeqId()
	 * @generated
	 */
	void setLocatedAtLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Fixed Asset</em>' reference.
	 * @see #setParentFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_ParentFixedAsset()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getParentFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getParentFixedAsset <em>Parent Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Fixed Asset</em>' reference.
	 * @see #getParentFixedAsset()
	 * @generated
	 */
	void setParentFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Production Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Capacity</em>' attribute.
	 * @see #setProductionCapacity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_ProductionCapacity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductionCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getProductionCapacity <em>Production Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Capacity</em>' attribute.
	 * @see #getProductionCapacity()
	 * @generated
	 */
	void setProductionCapacity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Cost</em>' attribute.
	 * @see #setPurchaseCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_PurchaseCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getPurchaseCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getPurchaseCost <em>Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Cost</em>' attribute.
	 * @see #getPurchaseCost()
	 * @generated
	 */
	void setPurchaseCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Purchase Cost Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Cost Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Cost Uom Id</em>' attribute.
	 * @see #setPurchaseCostUomId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_PurchaseCostUomId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPurchaseCostUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getPurchaseCostUomId <em>Purchase Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Cost Uom Id</em>' attribute.
	 * @see #getPurchaseCostUomId()
	 * @generated
	 */
	void setPurchaseCostUomId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_RoleType()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Salvage Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salvage Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salvage Value</em>' attribute.
	 * @see #setSalvageValue(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_SalvageValue()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getSalvageValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getSalvageValue <em>Salvage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salvage Value</em>' attribute.
	 * @see #getSalvageValue()
	 * @generated
	 */
	void setSalvageValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_SerialNumber()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' reference.
	 * @see #setUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_Uom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getUom <em>Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' reference.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Acquire Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Order</em>' reference.
	 * @see #setAcquireOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAsset_AcquireOrder()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getAcquireOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset#getAcquireOrder <em>Acquire Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquire Order</em>' reference.
	 * @see #getAcquireOrder()
	 * @generated
	 */
	void setAcquireOrder(OrderHeader value);

} // FixedAsset
