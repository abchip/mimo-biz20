/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perf Review Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeParty <em>Employee Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfRatingType <em>Perf Rating Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemType <em>Perf Review Item Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem()
 * @model annotation="mimo-ent-frame title='Performance Review Item'"
 * @generated
 */
public interface PerfReviewItem extends EntityTyped<PerfReviewItemType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Employee Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Party</em>' reference.
	 * @see #setEmployeeParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_EmployeeParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getEmployeeParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeParty <em>Employee Party</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Perf Rating Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Rating Type</em>' reference.
	 * @see #setPerfRatingType(PerfRatingType)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_PerfRatingType()
	 * @model
	 * @generated
	 */
	PerfRatingType getPerfRatingType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfRatingType <em>Perf Rating Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Rating Type</em>' reference.
	 * @see #getPerfRatingType()
	 * @generated
	 */
	void setPerfRatingType(PerfRatingType value);

	/**
	 * Returns the value of the '<em><b>Perf Review Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Review Item Type</em>' reference.
	 * @see #setPerfReviewItemType(PerfReviewItemType)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_PerfReviewItemType()
	 * @model
	 * @generated
	 */
	PerfReviewItemType getPerfReviewItemType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemType <em>Perf Review Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Item Type</em>' reference.
	 * @see #getPerfReviewItemType()
	 * @generated
	 */
	void setPerfReviewItemType(PerfReviewItemType value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_EmployeeRoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEmployeeRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Role Type Id</em>' attribute.
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 */
	void setEmployeeRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_PerfReviewId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPerfReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewId <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Id</em>' attribute.
	 * @see #getPerfReviewId()
	 * @generated
	 */
	void setPerfReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Perf Review Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Review Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Review Item Seq Id</em>' attribute.
	 * @see #setPerfReviewItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getPerfReviewItem_PerfReviewItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPerfReviewItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.PerfReviewItem#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Item Seq Id</em>' attribute.
	 * @see #getPerfReviewItemSeqId()
	 * @generated
	 */
	void setPerfReviewItemSeqId(String value);

} // PerfReviewItem
