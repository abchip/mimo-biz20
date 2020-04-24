/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.model.product.promo.ProductPromo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Promo Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getManualOnly <em>Manual Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl()
 * @model annotation="mimo-ent-frame title='Product Store Promotion Applicability' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStorePromoAppl extends BizEntity {
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
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Manual Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Only</em>' attribute.
	 * @see #setManualOnly(Boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl_ManualOnly()
	 * @model annotation="mimo-ent-slot help='If set to Y then the promotion is not automatically evaluated, but only if it\n              is manually added to the cart.'"
	 * @generated
	 */
	Boolean getManualOnly();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getManualOnly <em>Manual Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Only</em>' attribute.
	 * @see #getManualOnly()
	 * @generated
	 */
	void setManualOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl_ProductStoreId()
	 * @model keys="productStoreId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Id</em>' reference.
	 * @see #setProductPromoId(ProductPromo)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePromoAppl_ProductPromoId()
	 * @model keys="productPromoId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPromo getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePromoAppl#getProductPromoId <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' reference.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(ProductPromo value);

} // ProductStorePromoAppl
