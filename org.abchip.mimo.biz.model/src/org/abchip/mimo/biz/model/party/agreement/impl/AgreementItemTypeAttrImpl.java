/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.agreement.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemTypeAttr;
import org.abchip.mimo.biz.model.party.agreement.AgreementPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Item Type Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl#getAgreementItemTypeId <em>Agreement Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.agreement.impl.AgreementItemTypeAttrImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementItemTypeAttrImpl extends BizEntityImpl implements AgreementItemTypeAttr {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementItemTypeAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return (String)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR__ATTR_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR__ATTR_NAME, newAttrName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemType getAgreementItemTypeId() {
		return (AgreementItemType)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR__AGREEMENT_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemTypeId(AgreementItemType newAgreementItemTypeId) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE_ATTR__AGREEMENT_ITEM_TYPE_ID, newAgreementItemTypeId);
	}

} //AgreementItemTypeAttrImpl