/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.supplier;

import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Product Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getSupplierProductFeature()
 * @model annotation="mimo-ent-frame title='Supplier-specific product feature information' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface SupplierProductFeature extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getSupplierProductFeature_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature</em>' reference.
	 * @see #setProductFeature(ProductFeature)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getSupplierProductFeature_ProductFeature()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductFeature getProductFeature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getProductFeature <em>Product Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature</em>' reference.
	 * @see #getProductFeature()
	 * @generated
	 */
	void setProductFeature(ProductFeature value);

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
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getSupplierProductFeature_Description()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Code</em>' attribute.
	 * @see #setIdCode(String)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getSupplierProductFeature_IdCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getIdCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getIdCode <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Code</em>' attribute.
	 * @see #getIdCode()
	 * @generated
	 */
	void setIdCode(String value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' reference.
	 * @see #setUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.supplier.SupplierPackage#getSupplierProductFeature_Uom()
	 * @model
	 * @generated
	 */
	Uom getUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature#getUom <em>Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' reference.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(Uom value);

} // SupplierProductFeature
