/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.util.Date;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Facility Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFacilityAssocTypeId <em>Facility Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getTransitTime <em>Transit Time</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc()
 * @model annotation="mimo-ent-frame title='Define associations between Product facilities' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductFacilityAssoc extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_FacilityId()
	 * @model keys="facilityId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Facility Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id To</em>' reference.
	 * @see #setFacilityIdTo(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_FacilityIdTo()
	 * @model keys="facilityId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacilityIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFacilityIdTo <em>Facility Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id To</em>' reference.
	 * @see #getFacilityIdTo()
	 * @generated
	 */
	void setFacilityIdTo(Facility value);

	/**
	 * Returns the value of the '<em><b>Facility Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Assoc Type Id</em>' reference.
	 * @see #setFacilityAssocTypeId(FacilityAssocType)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_FacilityAssocTypeId()
	 * @model keys="facilityAssocTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FacilityAssocType getFacilityAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFacilityAssocTypeId <em>Facility Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Assoc Type Id</em>' reference.
	 * @see #getFacilityAssocTypeId()
	 * @generated
	 */
	void setFacilityAssocTypeId(FacilityAssocType value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getFromDate <em>From Date</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getSequenceNum <em>Sequence Num</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Transit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transit Time</em>' attribute.
	 * @see #setTransitTime(long)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getProductFacilityAssoc_TransitTime()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTransitTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.ProductFacilityAssoc#getTransitTime <em>Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Time</em>' attribute.
	 * @see #getTransitTime()
	 * @generated
	 */
	void setTransitTime(long value);

} // ProductFacilityAssoc
