/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.document;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getDocument <em>Document</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.document.DocumentPackage#getDocumentAttribute()
 * @model
 * @generated
 */
public interface DocumentAttribute extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see org.abchip.mimo.biz.model.content.document.DocumentPackage#getDocumentAttribute_Document()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Description</em>' attribute.
	 * @see #setAttrDescription(String)
	 * @see org.abchip.mimo.biz.model.content.document.DocumentPackage#getDocumentAttribute_AttrDescription()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getAttrDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getAttrDescription <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Description</em>' attribute.
	 * @see #getAttrDescription()
	 * @generated
	 */
	void setAttrDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.model.content.document.DocumentPackage#getDocumentAttribute_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Value</em>' attribute.
	 * @see #setAttrValue(String)
	 * @see org.abchip.mimo.biz.model.content.document.DocumentPackage#getDocumentAttribute_AttrValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAttrValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.document.DocumentAttribute#getAttrValue <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Value</em>' attribute.
	 * @see #getAttrValue()
	 * @generated
	 */
	void setAttrValue(String value);

} // DocumentAttribute
