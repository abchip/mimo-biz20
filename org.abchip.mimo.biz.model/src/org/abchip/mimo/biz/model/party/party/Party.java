/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.rate.PartyRate;
import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.humanres.ability.PartyQual;
import org.abchip.mimo.biz.model.humanres.ability.PartySkill;
import org.abchip.mimo.biz.model.humanres.ability.PerformanceNote;
import org.abchip.mimo.biz.model.humanres.ability.PersonTraining;
import org.abchip.mimo.biz.model.humanres.employment.EmplLeave;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getEmplLeaves <em>Empl Leaves</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getIsUnread <em>Is Unread</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyAttributes <em>Party Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyCarrierAccounts <em>Party Carrier Accounts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyClassifications <em>Party Classifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyContactMechs <em>Party Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyDataSources <em>Party Data Sources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyGeoPoints <em>Party Geo Points</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyIdentifications <em>Party Identifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyNameHistories <em>Party Name Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyNotes <em>Party Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyProfileDefaults <em>Party Profile Defaults</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyQuals <em>Party Quals</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyRates <em>Party Rates</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyRoles <em>Party Roles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartySkills <em>Party Skills</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPartyType <em>Party Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPerformanceNotes <em>Performance Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPersonTrainings <em>Person Trainings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getPreferredCurrencyUom <em>Preferred Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.Party#getSupplierProductFeatures <em>Supplier Product Features</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Party extends EntityTyped<PartyType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(DataSource)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_DataSource()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Empl Leaves</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Leaves</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_EmplLeaves()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<EmplLeave> getEmplLeaves();

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_ExternalId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unread</em>' attribute.
	 * @see #setIsUnread(Boolean)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_IsUnread()
	 * @model
	 * @generated
	 */
	Boolean getIsUnread();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getIsUnread <em>Is Unread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unread</em>' attribute.
	 * @see #getIsUnread()
	 * @generated
	 */
	void setIsUnread(Boolean value);

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyAttribute> getPartyAttributes();

	/**
	 * Returns the value of the '<em><b>Party Carrier Accounts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyCarrierAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Carrier Accounts</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyCarrierAccounts()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyCarrierAccount> getPartyCarrierAccounts();

	/**
	 * Returns the value of the '<em><b>Party Classifications</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classifications</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyClassifications()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyClassification> getPartyClassifications();

	/**
	 * Returns the value of the '<em><b>Party Contact Mechs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.contact.PartyContactMech}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Contact Mechs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyContactMechs()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyContactMech> getPartyContactMechs();

	/**
	 * Returns the value of the '<em><b>Party Data Sources</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyDataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Data Sources</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyDataSources()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyDataSource> getPartyDataSources();

	/**
	 * Returns the value of the '<em><b>Party Geo Points</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyGeoPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Geo Points</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyGeoPoints()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyGeoPoint> getPartyGeoPoints();

	/**
	 * Returns the value of the '<em><b>Party Identifications</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyIdentification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Identifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Identifications</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyIdentifications()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyIdentification> getPartyIdentifications();

	/**
	 * Returns the value of the '<em><b>Party Name Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyNameHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Name Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Name Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyNameHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyNameHistory> getPartyNameHistories();

	/**
	 * Returns the value of the '<em><b>Party Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyNote> getPartyNotes();

	/**
	 * Returns the value of the '<em><b>Party Profile Defaults</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Profile Defaults</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Profile Defaults</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyProfileDefaults()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyProfileDefault> getPartyProfileDefaults();

	/**
	 * Returns the value of the '<em><b>Party Quals</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.ability.PartyQual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Quals</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyQuals()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyQual> getPartyQuals();

	/**
	 * Returns the value of the '<em><b>Party Rates</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.rate.PartyRate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Rates</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyRates()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PartyRate> getPartyRates();

	/**
	 * Returns the value of the '<em><b>Party Roles</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.party.PartyRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Roles</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyRoles()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyRole> getPartyRoles();

	/**
	 * Returns the value of the '<em><b>Party Skills</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.ability.PartySkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Skills</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartySkills()
	 * @model derived="true"
	 * @generated
	 */
	List<PartySkill> getPartySkills();

	/**
	 * Returns the value of the '<em><b>Party Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Type</em>' reference.
	 * @see #setPartyType(PartyType)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyType()
	 * @model keys="partyTypeId"
	 * @generated
	 */
	PartyType getPartyType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyType <em>Party Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Type</em>' reference.
	 * @see #getPartyType()
	 * @generated
	 */
	void setPartyType(PartyType value);

	/**
	 * Returns the value of the '<em><b>Supplier Product Features</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Product Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Product Features</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_SupplierProductFeatures()
	 * @model derived="true"
	 * @generated
	 */
	List<SupplierProductFeature> getSupplierProductFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" methodTypeRequired="true"
	 * @generated
	 */
	PaymentMethod getPaymentMethod(String methodType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	CreditCard getCreditCard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	PostalAddress getPostalAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	TelecomNumber getTelecomNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ContactMech getEmail();

	/**
	 * Returns the value of the '<em><b>Performance Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.ability.PerformanceNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PerformanceNotes()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PerformanceNote> getPerformanceNotes();

	/**
	 * Returns the value of the '<em><b>Person Trainings</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.ability.PersonTraining}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Trainings</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PersonTrainings()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<PersonTraining> getPersonTrainings();

	/**
	 * Returns the value of the '<em><b>Preferred Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Currency Uom</em>' reference.
	 * @see #setPreferredCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PreferredCurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getPreferredCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getPreferredCurrencyUom <em>Preferred Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Currency Uom</em>' reference.
	 * @see #getPreferredCurrencyUom()
	 * @generated
	 */
	void setPreferredCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getParty_PartyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.Party#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // Party
