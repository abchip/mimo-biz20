/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.store.ProductStoreGroup;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.VendorProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.VendorProduct#getVendorParty <em>Vendor Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.VendorProduct#getProductStoreGroup <em>Product Store Group</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getVendorProduct()
 * @model annotation="mimo-ent-frame help='For information related to a specific vendor and product, especially for multi-vendor stores. The ProductStoreGroup is to be used much like in ProductPrice.' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface VendorProduct extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getVendorProduct_Product()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.VendorProduct#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Vendor Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party</em>' reference.
	 * @see #setVendorParty(Party)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getVendorProduct_VendorParty()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getVendorParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.VendorProduct#getVendorParty <em>Vendor Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party</em>' reference.
	 * @see #getVendorParty()
	 * @generated
	 */
	void setVendorParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product Store Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group</em>' reference.
	 * @see #setProductStoreGroup(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getVendorProduct_ProductStoreGroup()
	 * @model keys="productStoreGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStoreGroup getProductStoreGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.VendorProduct#getProductStoreGroup <em>Product Store Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group</em>' reference.
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	void setProductStoreGroup(ProductStoreGroup value);

} // VendorProduct
