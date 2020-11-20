/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductReviewId <em>Product Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getPostedAnonymous <em>Posted Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getPostedDateTime <em>Posted Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductReview <em>Product Review</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductReview#getUserLogin <em>User Login</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductReview extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date Time</em>' attribute.
	 * @see #setPostedDateTime(Date)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_PostedDateTime()
	 * @model
	 * @generated
	 */
	Date getPostedDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getPostedDateTime <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date Time</em>' attribute.
	 * @see #getPostedDateTime()
	 * @generated
	 */
	void setPostedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Rating</em>' attribute.
	 * @see #setProductRating(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_ProductRating()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductRating();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductRating <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Rating</em>' attribute.
	 * @see #getProductRating()
	 * @generated
	 */
	void setProductRating(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Review</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Review</em>' attribute.
	 * @see #setProductReview(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_ProductReview()
	 * @model
	 * @generated
	 */
	String getProductReview();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductReview <em>Product Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Review</em>' attribute.
	 * @see #getProductReview()
	 * @generated
	 */
	void setProductReview(String value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_ProductStore()
	 * @model
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login</em>' reference.
	 * @see #setUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_UserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getUserLogin <em>User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login</em>' reference.
	 * @see #getUserLogin()
	 * @generated
	 */
	void setUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Product Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Review Id</em>' attribute.
	 * @see #setProductReviewId(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_ProductReviewId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getProductReviewId <em>Product Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Review Id</em>' attribute.
	 * @see #getProductReviewId()
	 * @generated
	 */
	void setProductReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Posted Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Anonymous</em>' attribute.
	 * @see #setPostedAnonymous(Boolean)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductReview_PostedAnonymous()
	 * @model
	 * @generated
	 */
	Boolean getPostedAnonymous();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductReview#getPostedAnonymous <em>Posted Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Anonymous</em>' attribute.
	 * @see #getPostedAnonymous()
	 * @generated
	 */
	void setPostedAnonymous(Boolean value);

} // ProductReview
