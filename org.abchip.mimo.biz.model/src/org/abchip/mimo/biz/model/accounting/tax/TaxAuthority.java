/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.tax;

import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Authority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#getTaxAuthGeo <em>Tax Auth Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#getTaxAuthParty <em>Tax Auth Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#isIncludeTaxInPrice <em>Include Tax In Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#isRequireTaxIdForExemption <em>Require Tax Id For Exemption</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#getTaxIdFormatPattern <em>Tax Id Format Pattern</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthority()
 * @model
 * @generated
 */
public interface TaxAuthority extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Tax Auth Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo</em>' reference.
	 * @see #setTaxAuthGeo(Geo)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthority_TaxAuthGeo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Geo getTaxAuthGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#getTaxAuthGeo <em>Tax Auth Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo</em>' reference.
	 * @see #getTaxAuthGeo()
	 * @generated
	 */
	void setTaxAuthGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party</em>' reference.
	 * @see #setTaxAuthParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthority_TaxAuthParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getTaxAuthParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#getTaxAuthParty <em>Tax Auth Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party</em>' reference.
	 * @see #getTaxAuthParty()
	 * @generated
	 */
	void setTaxAuthParty(Party value);

	/**
	 * Returns the value of the '<em><b>Include Tax In Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Tax In Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Tax In Price</em>' attribute.
	 * @see #setIncludeTaxInPrice(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthority_IncludeTaxInPrice()
	 * @model required="true"
	 * @generated
	 */
	boolean isIncludeTaxInPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#isIncludeTaxInPrice <em>Include Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Tax In Price</em>' attribute.
	 * @see #isIncludeTaxInPrice()
	 * @generated
	 */
	void setIncludeTaxInPrice(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Tax Id For Exemption</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Tax Id For Exemption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Tax Id For Exemption</em>' attribute.
	 * @see #setRequireTaxIdForExemption(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthority_RequireTaxIdForExemption()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRequireTaxIdForExemption();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#isRequireTaxIdForExemption <em>Require Tax Id For Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Tax Id For Exemption</em>' attribute.
	 * @see #isRequireTaxIdForExemption()
	 * @generated
	 */
	void setRequireTaxIdForExemption(boolean value);

	/**
	 * Returns the value of the '<em><b>Tax Id Format Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Id Format Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Id Format Pattern</em>' attribute.
	 * @see #setTaxIdFormatPattern(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthority_TaxIdFormatPattern()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTaxIdFormatPattern();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthority#getTaxIdFormatPattern <em>Tax Id Format Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Id Format Pattern</em>' attribute.
	 * @see #getTaxIdFormatPattern()
	 * @generated
	 */
	void setTaxIdFormatPattern(String value);

} // TaxAuthority
