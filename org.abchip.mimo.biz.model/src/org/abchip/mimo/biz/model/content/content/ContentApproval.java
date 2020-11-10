/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Approval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContentApprovalId <em>Content Approval Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval()
 * @model
 * @generated
 */
public interface ContentApproval extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Date</em>' attribute.
	 * @see #setApprovalDate(Date)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_ApprovalDate()
	 * @model
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalDate <em>Approval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' attribute.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Status</em>' reference.
	 * @see #setApprovalStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_ApprovalStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getApprovalStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getApprovalStatus <em>Approval Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' reference.
	 * @see #getApprovalStatus()
	 * @generated
	 */
	void setApprovalStatus(StatusItem value);

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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_Content()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Content Approval Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Approval Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Approval Id</em>' attribute.
	 * @see #setContentApprovalId(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_ContentApprovalId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentApprovalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContentApprovalId <em>Content Approval Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Approval Id</em>' attribute.
	 * @see #getContentApprovalId()
	 * @generated
	 */
	void setContentApprovalId(String value);

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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_ContentRevisionSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentRevisionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getContentRevisionSeqId <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Revision Seq Id</em>' attribute.
	 * @see #getContentRevisionSeqId()
	 * @generated
	 */
	void setContentRevisionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_RoleType()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentApproval_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentApproval#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

} // ContentApproval
