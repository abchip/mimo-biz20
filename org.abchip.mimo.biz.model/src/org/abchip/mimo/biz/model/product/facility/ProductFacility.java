/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getDaysToShip <em>Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getLastInventoryCount <em>Last Inventory Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getMinimumStock <em>Minimum Stock</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getReorderQuantity <em>Reorder Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getReplenishMethodEnum <em>Replenish Method Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getRequirementMethodEnum <em>Requirement Method Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductFacility extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getProduct <em>Product</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_Facility()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Days To Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days To Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days To Ship</em>' attribute.
	 * @see #setDaysToShip(long)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_DaysToShip()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDaysToShip();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getDaysToShip <em>Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days To Ship</em>' attribute.
	 * @see #getDaysToShip()
	 * @generated
	 */
	void setDaysToShip(long value);

	/**
	 * Returns the value of the '<em><b>Last Inventory Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Inventory Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Inventory Count</em>' attribute.
	 * @see #setLastInventoryCount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_LastInventoryCount()
	 * @model annotation="mimo-ent-slot help='This field represents availableToPromiseTotal of a product at a certain point of time and is\n                being updated regularly by a schedule service every hour'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getLastInventoryCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getLastInventoryCount <em>Last Inventory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Inventory Count</em>' attribute.
	 * @see #getLastInventoryCount()
	 * @generated
	 */
	void setLastInventoryCount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_MinimumStock()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMinimumStock();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getMinimumStock <em>Minimum Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Stock</em>' attribute.
	 * @see #getMinimumStock()
	 * @generated
	 */
	void setMinimumStock(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_ReorderQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReorderQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getReorderQuantity <em>Reorder Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorder Quantity</em>' attribute.
	 * @see #getReorderQuantity()
	 * @generated
	 */
	void setReorderQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Replenish Method Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Method Enum</em>' reference.
	 * @see #setReplenishMethodEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_ReplenishMethodEnum()
	 * @model
	 * @generated
	 */
	Enumeration getReplenishMethodEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getReplenishMethodEnum <em>Replenish Method Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Method Enum</em>' reference.
	 * @see #getReplenishMethodEnum()
	 * @generated
	 */
	void setReplenishMethodEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Requirement Method Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Method Enum</em>' reference.
	 * @see #setRequirementMethodEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacility_RequirementMethodEnum()
	 * @model
	 * @generated
	 */
	Enumeration getRequirementMethodEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacility#getRequirementMethodEnum <em>Requirement Method Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Method Enum</em>' reference.
	 * @see #getRequirementMethodEnum()
	 * @generated
	 */
	void setRequirementMethodEnum(Enumeration value);

} // ProductFacility
