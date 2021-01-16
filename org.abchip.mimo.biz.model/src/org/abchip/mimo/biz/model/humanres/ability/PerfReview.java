/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.humanres.position.EmplPosition;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perf Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeParty <em>Employee Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmplPosition <em>Empl Position</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerParty <em>Manager Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerRoleTypeId <em>Manager Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview()
 * @model annotation="mimo-ent-frame title='Employee Performance Review'"
 * @generated
 */
public interface PerfReview extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Employee Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Party</em>' reference.
	 * @see #setEmployeeParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_EmployeeParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getEmployeeParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeParty <em>Employee Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Party</em>' reference.
	 * @see #getEmployeeParty()
	 * @generated
	 */
	void setEmployeeParty(Party value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position</em>' reference.
	 * @see #setEmplPosition(EmplPosition)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_EmplPosition()
	 * @model
	 * @generated
	 */
	EmplPosition getEmplPosition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmplPosition <em>Empl Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position</em>' reference.
	 * @see #getEmplPosition()
	 * @generated
	 */
	void setEmplPosition(EmplPosition value);

	/**
	 * Returns the value of the '<em><b>Employee Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Role Type Id</em>' attribute.
	 * @see #setEmployeeRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_EmployeeRoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEmployeeRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Role Type Id</em>' attribute.
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 */
	void setEmployeeRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Manager Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Party</em>' reference.
	 * @see #setManagerParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_ManagerParty()
	 * @model
	 * @generated
	 */
	Party getManagerParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerParty <em>Manager Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Party</em>' reference.
	 * @see #getManagerParty()
	 * @generated
	 */
	void setManagerParty(Party value);

	/**
	 * Returns the value of the '<em><b>Manager Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Role Type Id</em>' attribute.
	 * @see #setManagerRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_ManagerRoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getManagerRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getManagerRoleTypeId <em>Manager Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Role Type Id</em>' attribute.
	 * @see #getManagerRoleTypeId()
	 * @generated
	 */
	void setManagerRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_Payment()
	 * @model
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Perf Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Review Id</em>' attribute.
	 * @see #setPerfReviewId(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_PerfReviewId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPerfReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getPerfReviewId <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Id</em>' attribute.
	 * @see #getPerfReviewId()
	 * @generated
	 */
	void setPerfReviewId(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReview_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReview#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PerfReview
