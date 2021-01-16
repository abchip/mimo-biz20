/**
 * Copyright (c) 2017, 2021 ABChip and others.
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
 * A representation of the model object '<em><b>Agreement Type Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAgreementType <em>Agreement Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementTypeAttr()
 * @model annotation="mimo-ent-frame title='Agreement Type Attribute' formula='description'"
 * @generated
 */
public interface AgreementTypeAttr extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Agreement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Type</em>' reference.
	 * @see #setAgreementType(AgreementType)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementTypeAttr_AgreementType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	AgreementType getAgreementType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAgreementType <em>Agreement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Type</em>' reference.
	 * @see #getAgreementType()
	 * @generated
	 */
	void setAgreementType(AgreementType value);

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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementTypeAttr_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementTypeAttr_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementTypeAttr#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

} // AgreementTypeAttr
