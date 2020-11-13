/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.communication;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event Prp Typ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPurposes <em>Communication Event Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventPrpTyp()
 * @model annotation="mimo-ent-frame title='Communication Event Purpose Type' dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface CommunicationEventPrpTyp extends EntityType<CommunicationEventPurpose>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(CommunicationEventPrpTyp)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_ParentType()
	 * @model keys="communicationEventPrpTypId"
	 * @generated
	 */
	CommunicationEventPrpTyp getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(CommunicationEventPrpTyp value);

	/**
	 * Returns the value of the '<em><b>Communication Event Prp Typ Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Prp Typ Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Prp Typ Id</em>' attribute.
	 * @see #setCommunicationEventPrpTypId(String)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_CommunicationEventPrpTypId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCommunicationEventPrpTypId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Prp Typ Id</em>' attribute.
	 * @see #getCommunicationEventPrpTypId()
	 * @generated
	 */
	void setCommunicationEventPrpTypId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.communication.CommunicationEventPurpose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Purposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Purposes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_CommunicationEventPurposes()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventPurpose> getCommunicationEventPurposes();

} // CommunicationEventPrpTyp
