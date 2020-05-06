/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.agreement;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Type Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getTermTypeId <em>Term Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermTypeAttr()
 * @model annotation="mimo-ent-frame title='Term Type Attribute' formula='description'"
 * @generated
 */
public interface TermTypeAttr extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermTypeAttr_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermTypeAttr_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Term Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Type Id</em>' reference.
	 * @see #setTermTypeId(TermType)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getTermTypeAttr_TermTypeId()
	 * @model keys="termTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TermType getTermTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.TermTypeAttr#getTermTypeId <em>Term Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Type Id</em>' reference.
	 * @see #getTermTypeId()
	 * @generated
	 */
	void setTermTypeId(TermType value);

} // TermTypeAttr
