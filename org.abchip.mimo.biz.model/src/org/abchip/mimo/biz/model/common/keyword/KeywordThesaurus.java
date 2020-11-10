/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.keyword;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword Thesaurus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.keyword.KeywordThesaurus#getAlternateKeyword <em>Alternate Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.keyword.KeywordThesaurus#getEnteredKeyword <em>Entered Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.keyword.KeywordThesaurus#getRelationshipEnum <em>Relationship Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.keyword.KeywordPackage#getKeywordThesaurus()
 * @model
 * @generated
 */
public interface KeywordThesaurus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Alternate Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Keyword</em>' attribute.
	 * @see #setAlternateKeyword(String)
	 * @see org.abchip.mimo.biz.model.common.keyword.KeywordPackage#getKeywordThesaurus_AlternateKeyword()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAlternateKeyword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.keyword.KeywordThesaurus#getAlternateKeyword <em>Alternate Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Keyword</em>' attribute.
	 * @see #getAlternateKeyword()
	 * @generated
	 */
	void setAlternateKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Entered Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entered Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entered Keyword</em>' attribute.
	 * @see #setEnteredKeyword(String)
	 * @see org.abchip.mimo.biz.model.common.keyword.KeywordPackage#getKeywordThesaurus_EnteredKeyword()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEnteredKeyword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.keyword.KeywordThesaurus#getEnteredKeyword <em>Entered Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered Keyword</em>' attribute.
	 * @see #getEnteredKeyword()
	 * @generated
	 */
	void setEnteredKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Enum</em>' reference.
	 * @see #setRelationshipEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.common.keyword.KeywordPackage#getKeywordThesaurus_RelationshipEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getRelationshipEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.keyword.KeywordThesaurus#getRelationshipEnum <em>Relationship Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Enum</em>' reference.
	 * @see #getRelationshipEnum()
	 * @generated
	 */
	void setRelationshipEnum(Enumeration value);

} // KeywordThesaurus
