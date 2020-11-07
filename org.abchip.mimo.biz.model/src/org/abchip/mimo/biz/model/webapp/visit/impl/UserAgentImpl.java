/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.visit.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.webapp.visit.BrowserType;
import org.abchip.mimo.biz.model.webapp.visit.PlatformType;
import org.abchip.mimo.biz.model.webapp.visit.ProtocolType;
import org.abchip.mimo.biz.model.webapp.visit.UserAgent;
import org.abchip.mimo.biz.model.webapp.visit.UserAgentMethodType;
import org.abchip.mimo.biz.model.webapp.visit.UserAgentType;
import org.abchip.mimo.biz.model.webapp.visit.VisitPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getProtocolTypeId <em>Protocol Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.UserAgentImpl#getUserAgentTypeId <em>User Agent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAgentImpl extends EntityTypedImpl<UserAgentType> implements UserAgent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.USER_AGENT;
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
	public String getUserAgentId() {
		return (String)eGet(VisitPackage.Literals.USER_AGENT__USER_AGENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentId(String newUserAgentId) {
		eSet(VisitPackage.Literals.USER_AGENT__USER_AGENT_ID, newUserAgentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrowserType getBrowserTypeId() {
		return (BrowserType)eGet(VisitPackage.Literals.USER_AGENT__BROWSER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserTypeId(BrowserType newBrowserTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__BROWSER_TYPE_ID, newBrowserTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformType getPlatformTypeId() {
		return (PlatformType)eGet(VisitPackage.Literals.USER_AGENT__PLATFORM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformTypeId(PlatformType newPlatformTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__PLATFORM_TYPE_ID, newPlatformTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolType getProtocolTypeId() {
		return (ProtocolType)eGet(VisitPackage.Literals.USER_AGENT__PROTOCOL_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolTypeId(ProtocolType newProtocolTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__PROTOCOL_TYPE_ID, newProtocolTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgentMethodType getUserAgentMethodTypeId() {
		return (UserAgentMethodType)eGet(VisitPackage.Literals.USER_AGENT__USER_AGENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentMethodTypeId(UserAgentMethodType newUserAgentMethodTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__USER_AGENT_METHOD_TYPE_ID, newUserAgentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgentType getUserAgentTypeId() {
		return (UserAgentType)eGet(VisitPackage.Literals.USER_AGENT__USER_AGENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentTypeId(UserAgentType newUserAgentTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__USER_AGENT_TYPE_ID, newUserAgentTypeId);
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
				case VisitPackage.USER_AGENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case VisitPackage.USER_AGENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case VisitPackage.USER_AGENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case VisitPackage.USER_AGENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return VisitPackage.USER_AGENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return VisitPackage.USER_AGENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return VisitPackage.USER_AGENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return VisitPackage.USER_AGENT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UserAgentImpl
