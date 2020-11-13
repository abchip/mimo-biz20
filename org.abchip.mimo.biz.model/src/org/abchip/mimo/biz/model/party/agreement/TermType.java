/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.agreement;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeId <em>Term Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeAttrs <em>Term Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermType()
 * @model annotation="mimo-ent-frame dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface TermType extends EntityType<AgreementTerm>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(TermType)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermType_ParentType()
	 * @model keys="termTypeId"
	 * @generated
	 */
	TermType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(TermType value);

	/**
	 * Returns the value of the '<em><b>Term Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Type Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermType_TermTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<TermTypeAttr> getTermTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Term Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Type Id</em>' attribute.
	 * @see #setTermTypeId(String)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermType_TermTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTermTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermType#getTermTypeId <em>Term Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Type Id</em>' attribute.
	 * @see #getTermTypeId()
	 * @generated
	 */
	void setTermTypeId(String value);

} // TermType
