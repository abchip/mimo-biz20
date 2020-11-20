/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getCommittedByParty <em>Committed By Party</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentRevision()
 * @model
 * @generated
 */
public interface ContentRevision extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentRevision_Content()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentRevision_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Committed By Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committed By Party</em>' reference.
	 * @see #setCommittedByParty(Party)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentRevision_CommittedByParty()
	 * @model
	 * @generated
	 */
	Party getCommittedByParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getCommittedByParty <em>Committed By Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed By Party</em>' reference.
	 * @see #getCommittedByParty()
	 * @generated
	 */
	void setCommittedByParty(Party value);

	/**
	 * Returns the value of the '<em><b>Content Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Revision Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Revision Seq Id</em>' attribute.
	 * @see #setContentRevisionSeqId(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentRevision_ContentRevisionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentRevisionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentRevision#getContentRevisionSeqId <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Revision Seq Id</em>' attribute.
	 * @see #getContentRevisionSeqId()
	 * @generated
	 */
	void setContentRevisionSeqId(String value);

} // ContentRevision
