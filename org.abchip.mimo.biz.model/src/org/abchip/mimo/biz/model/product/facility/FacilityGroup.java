/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getFacilityGroupId <em>Facility Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getCurrentFacilityGroupRollups <em>Current Facility Group Rollups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getFacilityGroupName <em>Facility Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getFacilityGroupType <em>Facility Group Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getPrimaryParentGroup <em>Primary Parent Group</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface FacilityGroup extends EntityTyped<FacilityGroupType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Facility Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Name</em>' attribute.
	 * @see #setFacilityGroupName(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getFacilityGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getFacilityGroupName <em>Facility Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Name</em>' attribute.
	 * @see #getFacilityGroupName()
	 * @generated
	 */
	void setFacilityGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Facility Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Type</em>' reference.
	 * @see #setFacilityGroupType(FacilityGroupType)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupType()
	 * @model
	 * @generated
	 */
	FacilityGroupType getFacilityGroupType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getFacilityGroupType <em>Facility Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Type</em>' reference.
	 * @see #getFacilityGroupType()
	 * @generated
	 */
	void setFacilityGroupType(FacilityGroupType value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Group</em>' reference.
	 * @see #setPrimaryParentGroup(FacilityGroup)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup_PrimaryParentGroup()
	 * @model
	 * @generated
	 */
	FacilityGroup getPrimaryParentGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getPrimaryParentGroup <em>Primary Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Group</em>' reference.
	 * @see #getPrimaryParentGroup()
	 * @generated
	 */
	void setPrimaryParentGroup(FacilityGroup value);

	/**
	 * Returns the value of the '<em><b>Facility Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Id</em>' attribute.
	 * @see #setFacilityGroupId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFacilityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityGroup#getFacilityGroupId <em>Facility Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Id</em>' attribute.
	 * @see #getFacilityGroupId()
	 * @generated
	 */
	void setFacilityGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Current Facility Group Rollups</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.FacilityGroupRollup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Facility Group Rollups</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityGroup_CurrentFacilityGroupRollups()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<FacilityGroupRollup> getCurrentFacilityGroupRollups();

} // FacilityGroup
