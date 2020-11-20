/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.supplier;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reorder Guideline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderGuidelineId <em>Reorder Guideline Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getGeo <em>Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderLevel <em>Reorder Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderQuantity <em>Reorder Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ReorderGuideline extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geo)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_Geo()
	 * @model
	 * @generated
	 */
	Geo getGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Reorder Guideline Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorder Guideline Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorder Guideline Id</em>' attribute.
	 * @see #setReorderGuidelineId(String)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_ReorderGuidelineId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReorderGuidelineId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderGuidelineId <em>Reorder Guideline Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorder Guideline Id</em>' attribute.
	 * @see #getReorderGuidelineId()
	 * @generated
	 */
	void setReorderGuidelineId(String value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_Facility()
	 * @model
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Reorder Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorder Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorder Level</em>' attribute.
	 * @see #setReorderLevel(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_ReorderLevel()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReorderLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderLevel <em>Reorder Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorder Level</em>' attribute.
	 * @see #getReorderLevel()
	 * @generated
	 */
	void setReorderLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reorder Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorder Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorder Quantity</em>' attribute.
	 * @see #setReorderQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_ReorderQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReorderQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getReorderQuantity <em>Reorder Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorder Quantity</em>' attribute.
	 * @see #getReorderQuantity()
	 * @generated
	 */
	void setReorderQuantity(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_RoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getReorderGuideline_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.ReorderGuideline#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ReorderGuideline
