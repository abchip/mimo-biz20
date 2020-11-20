/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import java.util.Date;
import org.abchip.mimo.biz.model.humanres.trainings.TrainingRequest;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingClassType <em>Training Class Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprover <em>Approver</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingRequest <em>Training Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining()
 * @model
 * @generated
 */
public interface PersonTraining extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Person)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Person getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Person value);

	/**
	 * Returns the value of the '<em><b>Training Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Class Type</em>' reference.
	 * @see #setTrainingClassType(TrainingClassType)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_TrainingClassType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TrainingClassType getTrainingClassType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingClassType <em>Training Class Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Class Type</em>' reference.
	 * @see #getTrainingClassType()
	 * @generated
	 */
	void setTrainingClassType(TrainingClassType value);

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Status</em>' attribute.
	 * @see #setApprovalStatus(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_ApprovalStatus()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApprovalStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprovalStatus <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' attribute.
	 * @see #getApprovalStatus()
	 * @generated
	 */
	void setApprovalStatus(String value);

	/**
	 * Returns the value of the '<em><b>Approver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver</em>' reference.
	 * @see #setApprover(Person)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_Approver()
	 * @model
	 * @generated
	 */
	Person getApprover();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getApprover <em>Approver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver</em>' reference.
	 * @see #getApprover()
	 * @generated
	 */
	void setApprover(Person value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_Reason()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Training Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Request</em>' reference.
	 * @see #setTrainingRequest(TrainingRequest)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_TrainingRequest()
	 * @model
	 * @generated
	 */
	TrainingRequest getTrainingRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getTrainingRequest <em>Training Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Request</em>' reference.
	 * @see #getTrainingRequest()
	 * @generated
	 */
	void setTrainingRequest(TrainingRequest value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPersonTraining_WorkEffort()
	 * @model
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

} // PersonTraining
