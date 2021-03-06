/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.catalog;

import java.util.Date;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Catalog Inv Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getProdCatalog <em>Prod Catalog</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogInvFacility()
 * @model annotation="mimo-ent-frame title='Product Catalog Inventory Facility Applicability' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProdCatalogInvFacility extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Prod Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog</em>' reference.
	 * @see #setProdCatalog(ProdCatalog)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogInvFacility_ProdCatalog()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProdCatalog getProdCatalog();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getProdCatalog <em>Prod Catalog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog</em>' reference.
	 * @see #getProdCatalog()
	 * @generated
	 */
	void setProdCatalog(ProdCatalog value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogInvFacility_Facility()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

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
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogInvFacility_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogInvFacility_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getSequenceNum <em>Sequence Num</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.product.catalog.CatalogPackage#getProdCatalogInvFacility_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProdCatalogInvFacility
