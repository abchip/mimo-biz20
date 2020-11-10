/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.agreement;

import java.util.Date;
import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreement <em>Agreement</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementContentType <em>Agreement Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent()
 * @model
 * @generated
 */
public interface AgreementContent extends EntityTyped<AgreementContentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement</em>' reference.
	 * @see #setAgreement(Agreement)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent_Agreement()
	 * @model keys="agreementId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Agreement getAgreement();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreement <em>Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement</em>' reference.
	 * @see #getAgreement()
	 * @generated
	 */
	void setAgreement(Agreement value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent_Content()
	 * @model keys="contentId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Agreement Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Content Type</em>' reference.
	 * @see #setAgreementContentType(AgreementContentType)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent_AgreementContentType()
	 * @model keys="agreementContentTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	AgreementContentType getAgreementContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementContentType <em>Agreement Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Content Type</em>' reference.
	 * @see #getAgreementContentType()
	 * @generated
	 */
	void setAgreementContentType(AgreementContentType value);

	/**
	 * Returns the value of the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #setAgreementItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent_AgreementItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAgreementItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #getAgreementItemSeqId()
	 * @generated
	 */
	void setAgreementItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.party.agreement.AgreementPackage#getAgreementContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.agreement.AgreementContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // AgreementContent
