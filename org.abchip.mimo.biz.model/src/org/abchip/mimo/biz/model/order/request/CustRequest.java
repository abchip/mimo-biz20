/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getClosedDateTime <em>Closed Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestAttributes <em>Cust Request Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestCategory <em>Cust Request Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestCommEvents <em>Cust Request Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestContents <em>Cust Request Contents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestDate <em>Cust Request Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestItems <em>Cust Request Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestName <em>Cust Request Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestNotes <em>Cust Request Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestType <em>Cust Request Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestWorkEfforts <em>Cust Request Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getFromParty <em>From Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getFulfillContactMech <em>Fulfill Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getMaximumAmountUom <em>Maximum Amount Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getOpenDateTime <em>Open Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getResponseRequiredDate <em>Response Required Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getSalesChannelEnum <em>Sales Channel Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequest#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest()
 * @model annotation="mimo-ent-frame title='Customer Request' formula='description'"
 * @generated
 */
public interface CustRequest extends EntityTyped<CustRequestType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Closed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Date Time</em>' attribute.
	 * @see #setClosedDateTime(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_ClosedDateTime()
	 * @model annotation="mimo-ent-slot help='Used when the customer service person, or anyone assigned to handle the incoming request, closes it as resolution.\n          In some customer response systems, the openDateTime and closedDateTime can happen more than once as the customer is not satified with the resolution.'"
	 * @generated
	 */
	Date getClosedDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getClosedDateTime <em>Closed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Date Time</em>' attribute.
	 * @see #getClosedDateTime()
	 * @generated
	 */
	void setClosedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CreatedDate()
	 * @model annotation="mimo-ent-slot help='When it is actually stored in the system.'"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Cust Request Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.request.CustRequestAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestAttribute> getCustRequestAttributes();

	/**
	 * Returns the value of the '<em><b>Cust Request Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Category</em>' reference.
	 * @see #setCustRequestCategory(CustRequestCategory)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestCategory()
	 * @model
	 * @generated
	 */
	CustRequestCategory getCustRequestCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestCategory <em>Cust Request Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Category</em>' reference.
	 * @see #getCustRequestCategory()
	 * @generated
	 */
	void setCustRequestCategory(CustRequestCategory value);

	/**
	 * Returns the value of the '<em><b>Cust Request Comm Events</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.request.CustRequestCommEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Comm Events</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestCommEvents()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestCommEvent> getCustRequestCommEvents();

	/**
	 * Returns the value of the '<em><b>Cust Request Contents</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.request.CustRequestContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Contents</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestContents()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<CustRequestContent> getCustRequestContents();

	/**
	 * Returns the value of the '<em><b>Cust Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Date</em>' attribute.
	 * @see #setCustRequestDate(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestDate()
	 * @model annotation="mimo-ent-slot help='When the customer (or whoever) submitted the request, maybe out of OFBiz : comming by mail, email, etc.'"
	 * @generated
	 */
	Date getCustRequestDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestDate <em>Cust Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Date</em>' attribute.
	 * @see #getCustRequestDate()
	 * @generated
	 */
	void setCustRequestDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cust Request Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.request.CustRequestItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestItems()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestItem> getCustRequestItems();

	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' attribute.
	 * @see #setCustRequestId(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestId <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' attribute.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Name</em>' attribute.
	 * @see #setCustRequestName(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getCustRequestName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestName <em>Cust Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Name</em>' attribute.
	 * @see #getCustRequestName()
	 * @generated
	 */
	void setCustRequestName(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.request.CustRequestNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestNote> getCustRequestNotes();

	/**
	 * Returns the value of the '<em><b>Cust Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type</em>' reference.
	 * @see #setCustRequestType(CustRequestType)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestType()
	 * @model
	 * @generated
	 */
	CustRequestType getCustRequestType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getCustRequestType <em>Cust Request Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Type</em>' reference.
	 * @see #getCustRequestType()
	 * @generated
	 */
	void setCustRequestType(CustRequestType value);

	/**
	 * Returns the value of the '<em><b>Cust Request Work Efforts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.request.CustRequestWorkEffort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Work Efforts</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_CustRequestWorkEfforts()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestWorkEffort> getCustRequestWorkEfforts();

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
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Party</em>' reference.
	 * @see #setFromParty(Party)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_FromParty()
	 * @model
	 * @generated
	 */
	Party getFromParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getFromParty <em>From Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Party</em>' reference.
	 * @see #getFromParty()
	 * @generated
	 */
	void setFromParty(Party value);

	/**
	 * Returns the value of the '<em><b>Fulfill Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfill Contact Mech</em>' reference.
	 * @see #setFulfillContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_FulfillContactMech()
	 * @model annotation="mimo-ent-slot help='Field to support a location of a cust request--ie, product literature sent to an address, service call at a localtion, etc.'"
	 * @generated
	 */
	ContactMech getFulfillContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getFulfillContactMech <em>Fulfill Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfill Contact Mech</em>' reference.
	 * @see #getFulfillContactMech()
	 * @generated
	 */
	void setFulfillContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Internal Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Comment</em>' attribute.
	 * @see #setInternalComment(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_InternalComment()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getInternalComment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getInternalComment <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Comment</em>' attribute.
	 * @see #getInternalComment()
	 * @generated
	 */
	void setInternalComment(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_LastModifiedDate()
	 * @model annotation="mimo-ent-slot help='Last modified date can be till the closedDateTime which is when the customer service people, or anyone assigned to handle the incoming request, says it is resolved.\n          This gives when the last action was done to see if the steps to resolve the request are happening in a timely manner.'"
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Maximum Amount Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Amount Uom</em>' reference.
	 * @see #setMaximumAmountUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_MaximumAmountUom()
	 * @model
	 * @generated
	 */
	Uom getMaximumAmountUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getMaximumAmountUom <em>Maximum Amount Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Amount Uom</em>' reference.
	 * @see #getMaximumAmountUom()
	 * @generated
	 */
	void setMaximumAmountUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Open Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Date Time</em>' attribute.
	 * @see #setOpenDateTime(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_OpenDateTime()
	 * @model annotation="mimo-ent-slot help='Used when the customer service person, or anyone assigned to handle the incoming request, opens it for action.\n          You  cantake the customer requestdate and openDateTime to see the efficiency of the customer service people.'"
	 * @generated
	 */
	Date getOpenDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getOpenDateTime <em>Open Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Date Time</em>' attribute.
	 * @see #getOpenDateTime()
	 * @generated
	 */
	void setOpenDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(long)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_Priority()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_ProductStore()
	 * @model
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_Reason()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Response Required Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Required Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Required Date</em>' attribute.
	 * @see #setResponseRequiredDate(Date)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_ResponseRequiredDate()
	 * @model annotation="mimo-ent-slot help='responseRequiredDate is the time the customer needs a response.'"
	 * @generated
	 */
	Date getResponseRequiredDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getResponseRequiredDate <em>Response Required Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Required Date</em>' attribute.
	 * @see #getResponseRequiredDate()
	 * @generated
	 */
	void setResponseRequiredDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sales Channel Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum</em>' reference.
	 * @see #setSalesChannelEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_SalesChannelEnum()
	 * @model
	 * @generated
	 */
	Enumeration getSalesChannelEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getSalesChannelEnum <em>Sales Channel Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum</em>' reference.
	 * @see #getSalesChannelEnum()
	 * @generated
	 */
	void setSalesChannelEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequest_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequest#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

} // CustRequest
