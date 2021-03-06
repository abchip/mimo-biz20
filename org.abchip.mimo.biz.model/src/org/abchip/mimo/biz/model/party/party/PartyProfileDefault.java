/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party;

import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Profile Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultBillAddr <em>Default Bill Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultPayMeth <em>Default Pay Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipAddr <em>Default Ship Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipMeth <em>Default Ship Meth</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault()
 * @model annotation="mimo-ent-frame title='Party Profile Defaults'"
 * @generated
 */
public interface PartyProfileDefault extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault_ProductStore()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Default Bill Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Bill Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Bill Addr</em>' attribute.
	 * @see #setDefaultBillAddr(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault_DefaultBillAddr()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDefaultBillAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultBillAddr <em>Default Bill Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Bill Addr</em>' attribute.
	 * @see #getDefaultBillAddr()
	 * @generated
	 */
	void setDefaultBillAddr(String value);

	/**
	 * Returns the value of the '<em><b>Default Pay Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Pay Meth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Pay Meth</em>' attribute.
	 * @see #setDefaultPayMeth(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault_DefaultPayMeth()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDefaultPayMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultPayMeth <em>Default Pay Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pay Meth</em>' attribute.
	 * @see #getDefaultPayMeth()
	 * @generated
	 */
	void setDefaultPayMeth(String value);

	/**
	 * Returns the value of the '<em><b>Default Ship Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Ship Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Ship Addr</em>' attribute.
	 * @see #setDefaultShipAddr(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault_DefaultShipAddr()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDefaultShipAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipAddr <em>Default Ship Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ship Addr</em>' attribute.
	 * @see #getDefaultShipAddr()
	 * @generated
	 */
	void setDefaultShipAddr(String value);

	/**
	 * Returns the value of the '<em><b>Default Ship Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Ship Meth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Ship Meth</em>' attribute.
	 * @see #setDefaultShipMeth(String)
	 * @see org.abchip.mimo.biz.model.party.party.PartyPackage#getPartyProfileDefault_DefaultShipMeth()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDefaultShipMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.party.PartyProfileDefault#getDefaultShipMeth <em>Default Ship Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ship Meth</em>' attribute.
	 * @see #getDefaultShipMeth()
	 * @generated
	 */
	void setDefaultShipMeth(String value);

} // PartyProfileDefault
