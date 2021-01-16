/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.contact;

import java.util.List;
import org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListName <em>Contact List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListParties <em>Contact List Parties</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListType <em>Contact List Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactMechType <em>Contact Mech Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getMarketingCampaign <em>Marketing Campaign</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getOptOutScreen <em>Opt Out Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getOwnerParty <em>Owner Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getSingleUse <em>Single Use</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailFrom <em>Verify Email From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailScreen <em>Verify Email Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailSubject <em>Verify Email Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ContactList extends EntityTyped<ContactListType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Id</em>' attribute.
	 * @see #setContactListId(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_ContactListId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContactListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListId <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Id</em>' attribute.
	 * @see #getContactListId()
	 * @generated
	 */
	void setContactListId(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Name</em>' attribute.
	 * @see #setContactListName(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_ContactListName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getContactListName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListName <em>Contact List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Name</em>' attribute.
	 * @see #getContactListName()
	 * @generated
	 */
	void setContactListName(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Parties</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Parties</em>' reference list.
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_ContactListParties()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<ContactListParty> getContactListParties();

	/**
	 * Returns the value of the '<em><b>Contact List Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Type</em>' reference.
	 * @see #setContactListType(ContactListType)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_ContactListType()
	 * @model
	 * @generated
	 */
	ContactListType getContactListType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactListType <em>Contact List Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Type</em>' reference.
	 * @see #getContactListType()
	 * @generated
	 */
	void setContactListType(ContactListType value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type</em>' reference.
	 * @see #setContactMechType(ContactMechType)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_ContactMechType()
	 * @model
	 * @generated
	 */
	ContactMechType getContactMechType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getContactMechType <em>Contact Mech Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type</em>' reference.
	 * @see #getContactMechType()
	 * @generated
	 */
	void setContactMechType(ContactMechType value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_CreatedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(Boolean)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_IsPublic()
	 * @model
	 * @generated
	 */
	Boolean getIsPublic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #getIsPublic()
	 * @generated
	 */
	void setIsPublic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign</em>' reference.
	 * @see #setMarketingCampaign(MarketingCampaign)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_MarketingCampaign()
	 * @model
	 * @generated
	 */
	MarketingCampaign getMarketingCampaign();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getMarketingCampaign <em>Marketing Campaign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign</em>' reference.
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	void setMarketingCampaign(MarketingCampaign value);

	/**
	 * Returns the value of the '<em><b>Opt Out Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Out Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Out Screen</em>' attribute.
	 * @see #setOptOutScreen(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_OptOutScreen()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getOptOutScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getOptOutScreen <em>Opt Out Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Out Screen</em>' attribute.
	 * @see #getOptOutScreen()
	 * @generated
	 */
	void setOptOutScreen(String value);

	/**
	 * Returns the value of the '<em><b>Owner Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party</em>' reference.
	 * @see #setOwnerParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_OwnerParty()
	 * @model
	 * @generated
	 */
	Party getOwnerParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getOwnerParty <em>Owner Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party</em>' reference.
	 * @see #getOwnerParty()
	 * @generated
	 */
	void setOwnerParty(Party value);

	/**
	 * Returns the value of the '<em><b>Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Use</em>' attribute.
	 * @see #setSingleUse(Boolean)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_SingleUse()
	 * @model annotation="mimo-ent-slot help='Whether members of the list should be contacted only once.'"
	 * @generated
	 */
	Boolean getSingleUse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getSingleUse <em>Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Use</em>' attribute.
	 * @see #getSingleUse()
	 * @generated
	 */
	void setSingleUse(Boolean value);

	/**
	 * Returns the value of the '<em><b>Verify Email From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email From</em>' attribute.
	 * @see #setVerifyEmailFrom(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_VerifyEmailFrom()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyEmailFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailFrom <em>Verify Email From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email From</em>' attribute.
	 * @see #getVerifyEmailFrom()
	 * @generated
	 */
	void setVerifyEmailFrom(String value);

	/**
	 * Returns the value of the '<em><b>Verify Email Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email Screen</em>' attribute.
	 * @see #setVerifyEmailScreen(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_VerifyEmailScreen()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyEmailScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailScreen <em>Verify Email Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email Screen</em>' attribute.
	 * @see #getVerifyEmailScreen()
	 * @generated
	 */
	void setVerifyEmailScreen(String value);

	/**
	 * Returns the value of the '<em><b>Verify Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email Subject</em>' attribute.
	 * @see #setVerifyEmailSubject(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_VerifyEmailSubject()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyEmailSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailSubject <em>Verify Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email Subject</em>' attribute.
	 * @see #getVerifyEmailSubject()
	 * @generated
	 */
	void setVerifyEmailSubject(String value);

	/**
	 * Returns the value of the '<em><b>Verify Email Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email Web Site Id</em>' attribute.
	 * @see #setVerifyEmailWebSiteId(String)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactList_VerifyEmailWebSiteId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVerifyEmailWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactList#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email Web Site Id</em>' attribute.
	 * @see #getVerifyEmailWebSiteId()
	 * @generated
	 */
	void setVerifyEmailWebSiteId(String value);

} // ContactList
