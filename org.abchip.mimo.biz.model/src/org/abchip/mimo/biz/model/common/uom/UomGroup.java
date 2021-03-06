/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.uom;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uom Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.uom.UomGroup#getUom <em>Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.uom.UomPackage#getUomGroup()
 * @model annotation="mimo-ent-frame title='Unit Of Measure Group' dictionary='CommonEntityLabels'"
 * @generated
 */
public interface UomGroup extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' reference.
	 * @see #setUom(Uom)
	 * @see org.abchip.mimo.biz.model.common.uom.UomPackage#getUomGroup_Uom()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.uom.UomGroup#getUom <em>Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' reference.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Uom Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Group Id</em>' attribute.
	 * @see #setUomGroupId(String)
	 * @see org.abchip.mimo.biz.model.common.uom.UomPackage#getUomGroup_UomGroupId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getUomGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Group Id</em>' attribute.
	 * @see #getUomGroupId()
	 * @generated
	 */
	void setUomGroupId(String value);

} // UomGroup
