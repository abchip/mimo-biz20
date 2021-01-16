/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.service.schedule;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Expression Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc#getFromTempExpr <em>From Temp Expr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc#getToTempExpr <em>To Temp Expr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc#getExprAssocType <em>Expr Assoc Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getTemporalExpressionAssoc()
 * @model annotation="mimo-ent-frame title='Temporal Expression Association'"
 * @generated
 */
public interface TemporalExpressionAssoc extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>From Temp Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Temp Expr</em>' reference.
	 * @see #setFromTempExpr(TemporalExpression)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getTemporalExpressionAssoc_FromTempExpr()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='The \"parent\" expression'"
	 * @generated
	 */
	TemporalExpression getFromTempExpr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc#getFromTempExpr <em>From Temp Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Temp Expr</em>' reference.
	 * @see #getFromTempExpr()
	 * @generated
	 */
	void setFromTempExpr(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>To Temp Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Temp Expr</em>' reference.
	 * @see #setToTempExpr(TemporalExpression)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getTemporalExpressionAssoc_ToTempExpr()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='The \"child\" expression'"
	 * @generated
	 */
	TemporalExpression getToTempExpr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc#getToTempExpr <em>To Temp Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Temp Expr</em>' reference.
	 * @see #getToTempExpr()
	 * @generated
	 */
	void setToTempExpr(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Expr Assoc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr Assoc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr Assoc Type</em>' attribute.
	 * @see #setExprAssocType(String)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getTemporalExpressionAssoc_ExprAssocType()
	 * @model annotation="mimo-ent-slot help='Expression association type.\n         When applied to DIFFERENCE expression types, valid values are INCLUDE or EXCLUDE.\n         When applied to SUBSTITUTION expression types, valid values are INCLUDE, EXCLUDE, or SUBSTITUTE.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExprAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc#getExprAssocType <em>Expr Assoc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr Assoc Type</em>' attribute.
	 * @see #getExprAssocType()
	 * @generated
	 */
	void setExprAssocType(String value);

} // TemporalExpressionAssoc
