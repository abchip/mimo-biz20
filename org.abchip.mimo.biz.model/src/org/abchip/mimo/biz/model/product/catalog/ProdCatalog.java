/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.catalog;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getContentPathPrefix <em>Content Path Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getHeaderLogo <em>Header Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogInvFacilities <em>Prod Catalog Inv Facilities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isPurchaseAllowPermReqd <em>Purchase Allow Perm Reqd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getStyleSheet <em>Style Sheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getTemplatePathPrefix <em>Template Path Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isUseQuickAdd <em>Use Quick Add</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isViewAllowPermReqd <em>View Allow Perm Reqd</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog()
 * @model annotation="mimo-ent-frame title='Catalog' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProdCatalog extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Name</em>' attribute.
	 * @see #setCatalogName(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_CatalogName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Content Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Path Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Path Prefix</em>' attribute.
	 * @see #setContentPathPrefix(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_ContentPathPrefix()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getContentPathPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getContentPathPrefix <em>Content Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Path Prefix</em>' attribute.
	 * @see #getContentPathPrefix()
	 * @generated
	 */
	void setContentPathPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Header Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Logo</em>' attribute.
	 * @see #setHeaderLogo(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_HeaderLogo()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getHeaderLogo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getHeaderLogo <em>Header Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Logo</em>' attribute.
	 * @see #getHeaderLogo()
	 * @generated
	 */
	void setHeaderLogo(String value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Inv Facilities</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Inv Facilities</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_ProdCatalogInvFacilities()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraint fromDate='*NOW'"
	 * @generated
	 */
	List<ProdCatalogInvFacility> getProdCatalogInvFacilities();

	/**
	 * Returns the value of the '<em><b>Purchase Allow Perm Reqd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Allow Perm Reqd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Allow Perm Reqd</em>' attribute.
	 * @see #setPurchaseAllowPermReqd(boolean)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_PurchaseAllowPermReqd()
	 * @model required="true"
	 * @generated
	 */
	boolean isPurchaseAllowPermReqd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isPurchaseAllowPermReqd <em>Purchase Allow Perm Reqd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Allow Perm Reqd</em>' attribute.
	 * @see #isPurchaseAllowPermReqd()
	 * @generated
	 */
	void setPurchaseAllowPermReqd(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Sheet</em>' attribute.
	 * @see #setStyleSheet(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_StyleSheet()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getStyleSheet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getStyleSheet <em>Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Sheet</em>' attribute.
	 * @see #getStyleSheet()
	 * @generated
	 */
	void setStyleSheet(String value);

	/**
	 * Returns the value of the '<em><b>Template Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Path Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Path Prefix</em>' attribute.
	 * @see #setTemplatePathPrefix(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_TemplatePathPrefix()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTemplatePathPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getTemplatePathPrefix <em>Template Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Path Prefix</em>' attribute.
	 * @see #getTemplatePathPrefix()
	 * @generated
	 */
	void setTemplatePathPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Use Quick Add</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Quick Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Quick Add</em>' attribute.
	 * @see #setUseQuickAdd(boolean)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_UseQuickAdd()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUseQuickAdd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isUseQuickAdd <em>Use Quick Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Quick Add</em>' attribute.
	 * @see #isUseQuickAdd()
	 * @generated
	 */
	void setUseQuickAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>View Allow Perm Reqd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Allow Perm Reqd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Allow Perm Reqd</em>' attribute.
	 * @see #setViewAllowPermReqd(boolean)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_ViewAllowPermReqd()
	 * @model required="true"
	 * @generated
	 */
	boolean isViewAllowPermReqd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#isViewAllowPermReqd <em>View Allow Perm Reqd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Allow Perm Reqd</em>' attribute.
	 * @see #isViewAllowPermReqd()
	 * @generated
	 */
	void setViewAllowPermReqd(boolean value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Id</em>' attribute.
	 * @see #setProdCatalogId(String)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalog_ProdCatalogId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProdCatalogId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalog#getProdCatalogId <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Id</em>' attribute.
	 * @see #getProdCatalogId()
	 * @generated
	 */
	void setProdCatalogId(String value);

} // ProdCatalog
