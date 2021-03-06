/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort;

import java.util.Date;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getWorkEffortAssocType <em>Work Effort Assoc Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdFrom <em>Work Effort Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdTo <em>Work Effort Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc()
 * @model annotation="mimo-ent-frame title='Work Effort Association'"
 * @generated
 */
public interface WorkEffortAssoc extends EntityTyped<WorkEffortAssocType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Work Effort Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Assoc Type</em>' reference.
	 * @see #setWorkEffortAssocType(WorkEffortAssocType)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_WorkEffortAssocType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffortAssocType getWorkEffortAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getWorkEffortAssocType <em>Work Effort Assoc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Assoc Type</em>' reference.
	 * @see #getWorkEffortAssocType()
	 * @generated
	 */
	void setWorkEffortAssocType(WorkEffortAssocType value);

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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getFromDate <em>From Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getSequenceNum <em>Sequence Num</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id From</em>' reference.
	 * @see #setWorkEffortIdFrom(WorkEffort)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_WorkEffortIdFrom()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffortIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdFrom <em>Work Effort Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id From</em>' reference.
	 * @see #getWorkEffortIdFrom()
	 * @generated
	 */
	void setWorkEffortIdFrom(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id To</em>' reference.
	 * @see #setWorkEffortIdTo(WorkEffort)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssoc_WorkEffortIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffortIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssoc#getWorkEffortIdTo <em>Work Effort Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id To</em>' reference.
	 * @see #getWorkEffortIdTo()
	 * @generated
	 */
	void setWorkEffortIdTo(WorkEffort value);

} // WorkEffortAssoc
