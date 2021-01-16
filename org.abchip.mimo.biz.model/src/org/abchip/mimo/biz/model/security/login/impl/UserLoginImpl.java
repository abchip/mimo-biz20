/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.login.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.user.UserPreference;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.LoginPackage;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.model.security.login.UserLoginHistory;
import org.abchip.mimo.biz.model.security.login.UserLoginPasswordHistory;
import org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup;
import org.abchip.mimo.context.impl.UserProfileImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getCurrentPassword <em>Current Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getDisabledBy <em>Disabled By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getDisabledDateTime <em>Disabled Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getExternalAuthId <em>External Auth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getHasLoggedOut <em>Has Logged Out</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getIsSystem <em>Is System</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getLastCurrencyUom <em>Last Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getLastLocale <em>Last Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getLastTimeZone <em>Last Time Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getPasswordHint <em>Password Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#isRequirePasswordChange <em>Require Password Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getSuccessiveFailedLogins <em>Successive Failed Logins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getUserLdapDn <em>User Ldap Dn</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getUserLoginHistories <em>User Login Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getUserLoginPasswordHistories <em>User Login Password Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getUserLoginSecurityGroups <em>User Login Security Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.login.impl.UserLoginImpl#getUserPreferences <em>User Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserLoginImpl extends UserProfileImpl implements UserLogin {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLoginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoginPackage.Literals.USER_LOGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentPassword() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__CURRENT_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPassword(String newCurrentPassword) {
		eSet(LoginPackage.Literals.USER_LOGIN__CURRENT_PASSWORD, newCurrentPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisabledBy() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__DISABLED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabledBy(String newDisabledBy) {
		eSet(LoginPackage.Literals.USER_LOGIN__DISABLED_BY, newDisabledBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDisabledDateTime() {
		return (Date)eGet(LoginPackage.Literals.USER_LOGIN__DISABLED_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabledDateTime(Date newDisabledDateTime) {
		eSet(LoginPackage.Literals.USER_LOGIN__DISABLED_DATE_TIME, newDisabledDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__ENABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(Boolean newEnabled) {
		eSet(LoginPackage.Literals.USER_LOGIN__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalAuthId() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__EXTERNAL_AUTH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalAuthId(String newExternalAuthId) {
		eSet(LoginPackage.Literals.USER_LOGIN__EXTERNAL_AUTH_ID, newExternalAuthId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasLoggedOut() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__HAS_LOGGED_OUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasLoggedOut(Boolean newHasLoggedOut) {
		eSet(LoginPackage.Literals.USER_LOGIN__HAS_LOGGED_OUT, newHasLoggedOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSystem() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__IS_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSystem(Boolean newIsSystem) {
		eSet(LoginPackage.Literals.USER_LOGIN__IS_SYSTEM, newIsSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastCurrencyUom() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__LAST_CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCurrencyUom(String newLastCurrencyUom) {
		eSet(LoginPackage.Literals.USER_LOGIN__LAST_CURRENCY_UOM, newLastCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLocale() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__LAST_LOCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLocale(String newLastLocale) {
		eSet(LoginPackage.Literals.USER_LOGIN__LAST_LOCALE, newLastLocale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastTimeZone() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__LAST_TIME_ZONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastTimeZone(String newLastTimeZone) {
		eSet(LoginPackage.Literals.USER_LOGIN__LAST_TIME_ZONE, newLastTimeZone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(LoginPackage.Literals.USER_LOGIN__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(LoginPackage.Literals.USER_LOGIN__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordHint() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__PASSWORD_HINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordHint(String newPasswordHint) {
		eSet(LoginPackage.Literals.USER_LOGIN__PASSWORD_HINT, newPasswordHint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePasswordChange() {
		return (Boolean)eGet(LoginPackage.Literals.USER_LOGIN__REQUIRE_PASSWORD_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePasswordChange(boolean newRequirePasswordChange) {
		eSet(LoginPackage.Literals.USER_LOGIN__REQUIRE_PASSWORD_CHANGE, newRequirePasswordChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSuccessiveFailedLogins() {
		return (Long)eGet(LoginPackage.Literals.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessiveFailedLogins(long newSuccessiveFailedLogins) {
		eSet(LoginPackage.Literals.USER_LOGIN__SUCCESSIVE_FAILED_LOGINS, newSuccessiveFailedLogins);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLdapDn() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__USER_LDAP_DN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLdapDn(String newUserLdapDn) {
		eSet(LoginPackage.Literals.USER_LOGIN__USER_LDAP_DN, newUserLdapDn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLoginHistory> getUserLoginHistories() {
		return (List<UserLoginHistory>)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLoginPasswordHistory> getUserLoginPasswordHistories() {
		return (List<UserLoginPasswordHistory>)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLoginSecurityGroup> getUserLoginSecurityGroups() {
		return (List<UserLoginSecurityGroup>)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_SECURITY_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserPreference> getUserPreferences() {
		return (List<UserPreference>)eGet(LoginPackage.Literals.USER_LOGIN__USER_PREFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return (String)eGet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(LoginPackage.Literals.USER_LOGIN__USER_LOGIN_ID, newUserLoginId);
	}

} //UserLoginImpl
