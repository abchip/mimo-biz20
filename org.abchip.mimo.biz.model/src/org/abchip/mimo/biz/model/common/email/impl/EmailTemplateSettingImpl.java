/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.email.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.email.EmailPackage;
import org.abchip.mimo.biz.model.common.email.EmailTemplateSetting;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Template Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getEmailTemplateSettingId <em>Email Template Setting Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getBccAddress <em>Bcc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getBodyScreenLocation <em>Body Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getCcAddress <em>Cc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getEmailType <em>Email Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getFromAddress <em>From Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.email.impl.EmailTemplateSettingImpl#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailTemplateSettingImpl extends EntityIdentifiableImpl implements EmailTemplateSetting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailTemplateSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailPackage.Literals.EMAIL_TEMPLATE_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBccAddress() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBccAddress(String newBccAddress) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS, newBccAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyScreenLocation() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyScreenLocation(String newBodyScreenLocation) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION, newBodyScreenLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcAddress() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__CC_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcAddress(String newCcAddress) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__CC_ADDRESS, newCcAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE, newContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailTemplateSettingId() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailTemplateSettingId(String newEmailTemplateSettingId) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID, newEmailTemplateSettingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getEmailType() {
		return (Enumeration)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailType(Enumeration newEmailType) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE, newEmailType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromAddress() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromAddress(String newFromAddress) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS, newFromAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXslfoAttachScreenLocation() {
		return (String)eGet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXslfoAttachScreenLocation(String newXslfoAttachScreenLocation) {
		eSet(EmailPackage.Literals.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION, newXslfoAttachScreenLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case EmailPackage.EMAIL_TEMPLATE_SETTING__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case EmailPackage.EMAIL_TEMPLATE_SETTING__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case EmailPackage.EMAIL_TEMPLATE_SETTING__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case EmailPackage.EMAIL_TEMPLATE_SETTING__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return EmailPackage.EMAIL_TEMPLATE_SETTING__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return EmailPackage.EMAIL_TEMPLATE_SETTING__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return EmailPackage.EMAIL_TEMPLATE_SETTING__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return EmailPackage.EMAIL_TEMPLATE_SETTING__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EmailTemplateSettingImpl
