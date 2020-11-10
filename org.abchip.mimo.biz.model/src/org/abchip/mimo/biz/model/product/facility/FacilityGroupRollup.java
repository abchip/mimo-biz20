/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Group Rollup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getFacilityGroup <em>Facility Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getParentFacilityGroup <em>Parent Facility Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroupRollup()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface FacilityGroupRollup extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Facility Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group</em>' reference.
	 * @see #setFacilityGroup(FacilityGroup)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroupRollup_FacilityGroup()
	 * @model keys="facilityGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FacilityGroup getFacilityGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getFacilityGroup <em>Facility Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group</em>' reference.
	 * @see #getFacilityGroup()
	 * @generated
	 */
	void setFacilityGroup(FacilityGroup value);

	/**
	 * Returns the value of the '<em><b>Parent Facility Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Facility Group</em>' reference.
	 * @see #setParentFacilityGroup(FacilityGroup)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroupRollup_ParentFacilityGroup()
	 * @model keys="facilityGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FacilityGroup getParentFacilityGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getParentFacilityGroup <em>Parent Facility Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Facility Group</em>' reference.
	 * @see #getParentFacilityGroup()
	 * @generated
	 */
	void setParentFacilityGroup(FacilityGroup value);

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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroupRollup_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getFromDate <em>From Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroupRollup_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getSequenceNum <em>Sequence Num</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroupRollup_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // FacilityGroupRollup
