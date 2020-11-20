/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.communication;

import java.util.Date;
import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Event Content Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommunicationEvent <em>Communication Event</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommContentAssocType <em>Comm Content Assoc Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc()
 * @model annotation="mimo-ent-frame title='CommunicationEvent Content Association'"
 * @generated
 */
public interface CommEventContentAssoc extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc_Content()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event</em>' reference.
	 * @see #setCommunicationEvent(CommunicationEvent)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc_CommunicationEvent()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CommunicationEvent getCommunicationEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommunicationEvent <em>Communication Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event</em>' reference.
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	void setCommunicationEvent(CommunicationEvent value);

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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Comm Content Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Content Assoc Type</em>' reference.
	 * @see #setCommContentAssocType(CommContentAssocType)
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc_CommContentAssocType()
	 * @model
	 * @generated
	 */
	CommContentAssocType getCommContentAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getCommContentAssocType <em>Comm Content Assoc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Content Assoc Type</em>' reference.
	 * @see #getCommContentAssocType()
	 * @generated
	 */
	void setCommContentAssocType(CommContentAssocType value);

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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.model.party.communication.CommunicationPackage#getCommEventContentAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // CommEventContentAssoc
