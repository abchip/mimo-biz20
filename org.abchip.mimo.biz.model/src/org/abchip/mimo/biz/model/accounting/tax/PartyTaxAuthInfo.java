/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.tax;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Tax Auth Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#isIsExempt <em>Is Exempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#isIsNexus <em>Is Nexus</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getPartyTaxId <em>Party Tax Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo()
 * @model annotation="mimo-ent-frame title='Party Tax Information'"
 * @generated
 */
public interface PartyTaxAuthInfo extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

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
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Exempt</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exempt</em>' attribute.
	 * @see #setIsExempt(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_IsExempt()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsExempt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#isIsExempt <em>Is Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exempt</em>' attribute.
	 * @see #isIsExempt()
	 * @generated
	 */
	void setIsExempt(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Nexus</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nexus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nexus</em>' attribute.
	 * @see #setIsNexus(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_IsNexus()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsNexus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#isIsNexus <em>Is Nexus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nexus</em>' attribute.
	 * @see #isIsNexus()
	 * @generated
	 */
	void setIsNexus(boolean value);

	/**
	 * Returns the value of the '<em><b>Party Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Tax Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Tax Id</em>' attribute.
	 * @see #setPartyTaxId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_PartyTaxId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPartyTaxId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getPartyTaxId <em>Party Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Tax Id</em>' attribute.
	 * @see #getPartyTaxId()
	 * @generated
	 */
	void setPartyTaxId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_TaxAuthGeoId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_TaxAuthPartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

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
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getPartyTaxAuthInfo_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PartyTaxAuthInfo
