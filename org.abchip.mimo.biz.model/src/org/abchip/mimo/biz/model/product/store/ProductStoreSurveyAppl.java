/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import java.util.Date;
import org.abchip.mimo.biz.model.content.survey.Survey;
import org.abchip.mimo.biz.model.content.survey.SurveyApplType;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Survey Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProductStoreSurveyId <em>Product Store Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getResultTemplate <em>Result Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSurveyApplType <em>Survey Appl Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSurveyTemplate <em>Survey Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl()
 * @model annotation="mimo-ent-frame title='Product Store Survey Application' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStoreSurveyAppl extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_GroupName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_Product()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_ProductCategory()
	 * @model keys="productCategoryId"
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_ProductStore()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Product Store Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Survey Id</em>' attribute.
	 * @see #setProductStoreSurveyId(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_ProductStoreSurveyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getProductStoreSurveyId <em>Product Store Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Survey Id</em>' attribute.
	 * @see #getProductStoreSurveyId()
	 * @generated
	 */
	void setProductStoreSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Result Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Template</em>' attribute.
	 * @see #setResultTemplate(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_ResultTemplate()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getResultTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getResultTemplate <em>Result Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Template</em>' attribute.
	 * @see #getResultTemplate()
	 * @generated
	 */
	void setResultTemplate(String value);

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
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey</em>' reference.
	 * @see #setSurvey(Survey)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_Survey()
	 * @model keys="surveyId"
	 * @generated
	 */
	Survey getSurvey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSurvey <em>Survey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey</em>' reference.
	 * @see #getSurvey()
	 * @generated
	 */
	void setSurvey(Survey value);

	/**
	 * Returns the value of the '<em><b>Survey Appl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Appl Type</em>' reference.
	 * @see #setSurveyApplType(SurveyApplType)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_SurveyApplType()
	 * @model keys="surveyApplTypeId"
	 * @generated
	 */
	SurveyApplType getSurveyApplType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSurveyApplType <em>Survey Appl Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Appl Type</em>' reference.
	 * @see #getSurveyApplType()
	 * @generated
	 */
	void setSurveyApplType(SurveyApplType value);

	/**
	 * Returns the value of the '<em><b>Survey Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Template</em>' attribute.
	 * @see #setSurveyTemplate(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_SurveyTemplate()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSurveyTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getSurveyTemplate <em>Survey Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Template</em>' attribute.
	 * @see #getSurveyTemplate()
	 * @generated
	 */
	void setSurveyTemplate(String value);

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
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreSurveyAppl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreSurveyAppl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProductStoreSurveyAppl
