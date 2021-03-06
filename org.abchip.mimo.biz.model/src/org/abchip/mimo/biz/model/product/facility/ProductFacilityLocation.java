/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Facility Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getMinimumStock <em>Minimum Stock</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getMoveQuantity <em>Move Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityLocation()
 * @model annotation="mimo-ent-frame title='Product Facility' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductFacilityLocation extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityLocation_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityLocation_Facility()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityLocation_LocationSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getLocationSeqId <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id</em>' attribute.
	 * @see #getLocationSeqId()
	 * @generated
	 */
	void setLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Stock</em>' attribute.
	 * @see #setMinimumStock(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityLocation_MinimumStock()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMinimumStock();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getMinimumStock <em>Minimum Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Stock</em>' attribute.
	 * @see #getMinimumStock()
	 * @generated
	 */
	void setMinimumStock(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Move Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Quantity</em>' attribute.
	 * @see #setMoveQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityLocation_MoveQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMoveQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityLocation#getMoveQuantity <em>Move Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move Quantity</em>' attribute.
	 * @see #getMoveQuantity()
	 * @generated
	 */
	void setMoveQuantity(BigDecimal value);

} // ProductFacilityLocation
