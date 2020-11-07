/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.category;

import java.util.List;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureCatGrpAppl;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureCategoryAppl;
import org.abchip.mimo.biz.model.product.supplier.MarketInterest;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryImageUrl <em>Category Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCurrentProductCategoryRollups <em>Current Product Category Rollups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkOneImageUrl <em>Link One Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkTwoImageUrl <em>Link Two Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getMarketInterests <em>Market Interests</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryAttributes <em>Product Category Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryLinks <em>Product Category Links</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryMembers <em>Product Category Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductFeatureCatGrpAppls <em>Product Feature Cat Grp Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductFeatureCategoryAppls <em>Product Feature Category Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getShowInSelect <em>Show In Select</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductCategory extends EntityTyped<ProductCategoryType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Category Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Image Url</em>' attribute.
	 * @see #setCategoryImageUrl(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_CategoryImageUrl()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getCategoryImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryImageUrl <em>Category Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Image Url</em>' attribute.
	 * @see #getCategoryImageUrl()
	 * @generated
	 */
	void setCategoryImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_CategoryName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Current Product Category Rollups</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.category.ProductCategoryRollup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Product Category Rollups</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_CurrentProductCategoryRollups()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductCategoryRollup> getCurrentProductCategoryRollups();

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
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Detail Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Screen</em>' attribute.
	 * @see #setDetailScreen(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_DetailScreen()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDetailScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getDetailScreen <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Screen</em>' attribute.
	 * @see #getDetailScreen()
	 * @generated
	 */
	void setDetailScreen(String value);

	/**
	 * Returns the value of the '<em><b>Link One Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link One Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link One Image Url</em>' attribute.
	 * @see #setLinkOneImageUrl(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_LinkOneImageUrl()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getLinkOneImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkOneImageUrl <em>Link One Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link One Image Url</em>' attribute.
	 * @see #getLinkOneImageUrl()
	 * @generated
	 */
	void setLinkOneImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Link Two Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Two Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Two Image Url</em>' attribute.
	 * @see #setLinkTwoImageUrl(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_LinkTwoImageUrl()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getLinkTwoImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLinkTwoImageUrl <em>Link Two Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Two Image Url</em>' attribute.
	 * @see #getLinkTwoImageUrl()
	 * @generated
	 */
	void setLinkTwoImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Returns the value of the '<em><b>Market Interests</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.supplier.MarketInterest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Interests</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_MarketInterests()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<MarketInterest> getMarketInterests();

	/**
	 * Returns the value of the '<em><b>Product Category Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Type Id</em>' reference.
	 * @see #setProductCategoryTypeId(ProductCategoryType)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductCategoryTypeId()
	 * @model keys="productCategoryTypeId"
	 * @generated
	 */
	ProductCategoryType getProductCategoryTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryTypeId <em>Product Category Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Type Id</em>' reference.
	 * @see #getProductCategoryTypeId()
	 * @generated
	 */
	void setProductCategoryTypeId(ProductCategoryType value);

	/**
	 * Returns the value of the '<em><b>Product Feature Cat Grp Appls</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.feature.ProductFeatureCatGrpAppl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Cat Grp Appls</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductFeatureCatGrpAppls()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductFeatureCatGrpAppl> getProductFeatureCatGrpAppls();

	/**
	 * Returns the value of the '<em><b>Product Feature Category Appls</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.feature.ProductFeatureCategoryAppl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Category Appls</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductFeatureCategoryAppls()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductFeatureCategoryAppl> getProductFeatureCategoryAppls();

	/**
	 * Returns the value of the '<em><b>Show In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show In Select</em>' attribute.
	 * @see #setShowInSelect(Boolean)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ShowInSelect()
	 * @model
	 * @generated
	 */
	Boolean getShowInSelect();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getShowInSelect <em>Show In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show In Select</em>' attribute.
	 * @see #getShowInSelect()
	 * @generated
	 */
	void setShowInSelect(Boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Category Id</em>' reference.
	 * @see #setPrimaryParentCategoryId(ProductCategory)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_PrimaryParentCategoryId()
	 * @model keys="productCategoryId"
	 * @generated
	 */
	ProductCategory getPrimaryParentCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Category Id</em>' reference.
	 * @see #getPrimaryParentCategoryId()
	 * @generated
	 */
	void setPrimaryParentCategoryId(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Product Category Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductCategoryAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductCategoryAttribute> getProductCategoryAttributes();

	/**
	 * Returns the value of the '<em><b>Product Category Links</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.category.ProductCategoryLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Links</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductCategoryLinks()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductCategoryLink> getProductCategoryLinks();

	/**
	 * Returns the value of the '<em><b>Product Category Members</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.category.ProductCategoryMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Members</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductCategoryMembers()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ProductCategoryMember> getProductCategoryMembers();

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategory_ProductCategoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategory#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

} // ProductCategory
