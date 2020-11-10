/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getAndGroupId <em>And Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoApplEnum <em>Product Promo Appl Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory()
 * @model annotation="mimo-ent-frame title='Product Promotion Category' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPromoCategory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo</em>' reference.
	 * @see #setProductPromo(ProductPromo)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_ProductPromo()
	 * @model keys="productPromoId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPromo getProductPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromo <em>Product Promo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo</em>' reference.
	 * @see #getProductPromo()
	 * @generated
	 */
	void setProductPromo(ProductPromo value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_ProductCategory()
	 * @model keys="productCategoryId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>And Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Group Id</em>' attribute.
	 * @see #setAndGroupId(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_AndGroupId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAndGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getAndGroupId <em>And Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Group Id</em>' attribute.
	 * @see #getAndGroupId()
	 * @generated
	 */
	void setAndGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #setProductPromoActionSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_ProductPromoActionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 */
	void setProductPromoActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Cond Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Cond Seq Id</em>' attribute.
	 * @see #setProductPromoCondSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_ProductPromoCondSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoCondSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Cond Seq Id</em>' attribute.
	 * @see #getProductPromoCondSeqId()
	 * @generated
	 */
	void setProductPromoCondSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #setProductPromoRuleId(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_ProductPromoRuleId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #getProductPromoRuleId()
	 * @generated
	 */
	void setProductPromoRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #setIncludeSubCategories(Boolean)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_IncludeSubCategories()
	 * @model
	 * @generated
	 */
	Boolean getIncludeSubCategories();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getIncludeSubCategories <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #getIncludeSubCategories()
	 * @generated
	 */
	void setIncludeSubCategories(Boolean value);

	/**
	 * Returns the value of the '<em><b>Product Promo Appl Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Appl Enum</em>' reference.
	 * @see #setProductPromoApplEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCategory_ProductPromoApplEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getProductPromoApplEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCategory#getProductPromoApplEnum <em>Product Promo Appl Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Appl Enum</em>' reference.
	 * @see #getProductPromoApplEnum()
	 * @generated
	 */
	void setProductPromoApplEnum(Enumeration value);

} // ProductPromoCategory
