/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfig;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Shipment Meth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isAllowCompanyAddr <em>Allow Company Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isAllowUspsAddr <em>Allow Usps Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getAllowancePercent <em>Allowance Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getCompanyParty <em>Company Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getConfigProps <em>Config Props</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getExcludeFeatureGroup <em>Exclude Feature Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getExcludeGeo <em>Exclude Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getIncludeFeatureGroup <em>Include Feature Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getIncludeGeo <em>Include Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isIncludeNoChargeItems <em>Include No Charge Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMaxTotal <em>Max Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMaxWeight <em>Max Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinTotal <em>Min Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinWeight <em>Min Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinimumPrice <em>Minimum Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isRequireCompanyAddr <em>Require Company Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isRequireUspsAddr <em>Require Usps Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getShipmentCustomMethod <em>Shipment Custom Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getShipmentGatewayConfig <em>Shipment Gateway Config</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getShipmentMethodType <em>Shipment Method Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth()
 * @model annotation="mimo-ent-frame title='Product Store Carrier Shipment Method' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStoreShipmentMeth extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Allowance Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowance Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowance Percent</em>' attribute.
	 * @see #setAllowancePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_AllowancePercent()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAllowancePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getAllowancePercent <em>Allowance Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowance Percent</em>' attribute.
	 * @see #getAllowancePercent()
	 * @generated
	 */
	void setAllowancePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Company Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Party</em>' reference.
	 * @see #setCompanyParty(Party)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_CompanyParty()
	 * @model
	 * @generated
	 */
	Party getCompanyParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getCompanyParty <em>Company Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Party</em>' reference.
	 * @see #getCompanyParty()
	 * @generated
	 */
	void setCompanyParty(Party value);

	/**
	 * Returns the value of the '<em><b>Config Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Props</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Props</em>' attribute.
	 * @see #setConfigProps(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ConfigProps()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConfigProps();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getConfigProps <em>Config Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Props</em>' attribute.
	 * @see #getConfigProps()
	 * @generated
	 */
	void setConfigProps(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Feature Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Feature Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Feature Group</em>' attribute.
	 * @see #setExcludeFeatureGroup(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ExcludeFeatureGroup()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExcludeFeatureGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getExcludeFeatureGroup <em>Exclude Feature Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Feature Group</em>' attribute.
	 * @see #getExcludeFeatureGroup()
	 * @generated
	 */
	void setExcludeFeatureGroup(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Geo</em>' reference.
	 * @see #setExcludeGeo(Geo)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ExcludeGeo()
	 * @model
	 * @generated
	 */
	Geo getExcludeGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getExcludeGeo <em>Exclude Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Geo</em>' reference.
	 * @see #getExcludeGeo()
	 * @generated
	 */
	void setExcludeGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Include Feature Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Feature Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Feature Group</em>' attribute.
	 * @see #setIncludeFeatureGroup(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_IncludeFeatureGroup()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getIncludeFeatureGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getIncludeFeatureGroup <em>Include Feature Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Feature Group</em>' attribute.
	 * @see #getIncludeFeatureGroup()
	 * @generated
	 */
	void setIncludeFeatureGroup(String value);

	/**
	 * Returns the value of the '<em><b>Include Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Geo</em>' reference.
	 * @see #setIncludeGeo(Geo)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_IncludeGeo()
	 * @model
	 * @generated
	 */
	Geo getIncludeGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getIncludeGeo <em>Include Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Geo</em>' reference.
	 * @see #getIncludeGeo()
	 * @generated
	 */
	void setIncludeGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Include No Charge Items</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include No Charge Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include No Charge Items</em>' attribute.
	 * @see #setIncludeNoChargeItems(boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_IncludeNoChargeItems()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIncludeNoChargeItems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isIncludeNoChargeItems <em>Include No Charge Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include No Charge Items</em>' attribute.
	 * @see #isIncludeNoChargeItems()
	 * @generated
	 */
	void setIncludeNoChargeItems(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MaxSize()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMaxSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Max Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Total</em>' attribute.
	 * @see #setMaxTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MaxTotal()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMaxTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMaxTotal <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Total</em>' attribute.
	 * @see #getMaxTotal()
	 * @generated
	 */
	void setMaxTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Weight</em>' attribute.
	 * @see #setMaxWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MaxWeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMaxWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMaxWeight <em>Max Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Weight</em>' attribute.
	 * @see #getMaxWeight()
	 * @generated
	 */
	void setMaxWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #setMinSize(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MinSize()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMinSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Size</em>' attribute.
	 * @see #getMinSize()
	 * @generated
	 */
	void setMinSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Total</em>' attribute.
	 * @see #setMinTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MinTotal()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMinTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinTotal <em>Min Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Total</em>' attribute.
	 * @see #getMinTotal()
	 * @generated
	 */
	void setMinTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Weight</em>' attribute.
	 * @see #setMinWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MinWeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMinWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinWeight <em>Min Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Weight</em>' attribute.
	 * @see #getMinWeight()
	 * @generated
	 */
	void setMinWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minimum Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Price</em>' attribute.
	 * @see #setMinimumPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_MinimumPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMinimumPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getMinimumPrice <em>Minimum Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Price</em>' attribute.
	 * @see #getMinimumPrice()
	 * @generated
	 */
	void setMinimumPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_PartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ProductStoreId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Require Company Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Company Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Company Addr</em>' attribute.
	 * @see #setRequireCompanyAddr(boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_RequireCompanyAddr()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequireCompanyAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isRequireCompanyAddr <em>Require Company Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Company Addr</em>' attribute.
	 * @see #isRequireCompanyAddr()
	 * @generated
	 */
	void setRequireCompanyAddr(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Usps Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Usps Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Usps Addr</em>' attribute.
	 * @see #setRequireUspsAddr(boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_RequireUspsAddr()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequireUspsAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isRequireUspsAddr <em>Require Usps Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Usps Addr</em>' attribute.
	 * @see #isRequireUspsAddr()
	 * @generated
	 */
	void setRequireUspsAddr(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store Ship Meth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Ship Meth Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Ship Meth Id</em>' attribute.
	 * @see #setProductStoreShipMethId(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ProductStoreShipMethId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreShipMethId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Ship Meth Id</em>' attribute.
	 * @see #getProductStoreShipMethId()
	 * @generated
	 */
	void setProductStoreShipMethId(String value);

	/**
	 * Returns the value of the '<em><b>Allow Company Addr</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Company Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Company Addr</em>' attribute.
	 * @see #setAllowCompanyAddr(boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_AllowCompanyAddr()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAllowCompanyAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isAllowCompanyAddr <em>Allow Company Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Company Addr</em>' attribute.
	 * @see #isAllowCompanyAddr()
	 * @generated
	 */
	void setAllowCompanyAddr(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Usps Addr</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Usps Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Usps Addr</em>' attribute.
	 * @see #setAllowUspsAddr(boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_AllowUspsAddr()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAllowUspsAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#isAllowUspsAddr <em>Allow Usps Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Usps Addr</em>' attribute.
	 * @see #isAllowUspsAddr()
	 * @generated
	 */
	void setAllowUspsAddr(boolean value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_RoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_SequenceNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(long value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ServiceName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Custom Method</em>' reference.
	 * @see #setShipmentCustomMethod(CustomMethod)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ShipmentCustomMethod()
	 * @model
	 * @generated
	 */
	CustomMethod getShipmentCustomMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getShipmentCustomMethod <em>Shipment Custom Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Custom Method</em>' reference.
	 * @see #getShipmentCustomMethod()
	 * @generated
	 */
	void setShipmentCustomMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Shipment Gateway Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Gateway Config</em>' reference.
	 * @see #setShipmentGatewayConfig(ShipmentGatewayConfig)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ShipmentGatewayConfig()
	 * @model
	 * @generated
	 */
	ShipmentGatewayConfig getShipmentGatewayConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getShipmentGatewayConfig <em>Shipment Gateway Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Gateway Config</em>' reference.
	 * @see #getShipmentGatewayConfig()
	 * @generated
	 */
	void setShipmentGatewayConfig(ShipmentGatewayConfig value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type</em>' reference.
	 * @see #setShipmentMethodType(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreShipmentMeth_ShipmentMethodType()
	 * @model
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth#getShipmentMethodType <em>Shipment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type</em>' reference.
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	void setShipmentMethodType(ShipmentMethodType value);

} // ProductStoreShipmentMeth
