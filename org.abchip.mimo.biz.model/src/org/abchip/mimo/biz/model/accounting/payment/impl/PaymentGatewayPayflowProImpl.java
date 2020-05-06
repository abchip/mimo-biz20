/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayPayflowPro;
import org.abchip.mimo.biz.model.accounting.payment.PaymentPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Payflow Pro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getCancelReturnUrl <em>Cancel Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getCertsPath <em>Certs Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#isCheckAvs <em>Check Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#isCheckCvv2 <em>Check Cvv2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getEnableTransmit <em>Enable Transmit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getLogFileName <em>Log File Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getMaxLogFileSize <em>Max Log File Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#isPreAuth <em>Pre Auth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyAddress <em>Proxy Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyLogon <em>Proxy Logon</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyPassword <em>Proxy Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyPort <em>Proxy Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#isStackTraceOn <em>Stack Trace On</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.impl.PaymentGatewayPayflowProImpl#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayPayflowProImpl extends EntityIdentifiableImpl implements PaymentGatewayPayflowPro {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayPayflowProImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO;
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
	public String getCancelReturnUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelReturnUrl(String newCancelReturnUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL, newCancelReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertsPath() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertsPath(String newCertsPath) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH, newCertsPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckAvs() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckAvs(boolean newCheckAvs) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS, newCheckAvs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckCvv2() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckCvv2(boolean newCheckCvv2) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2, newCheckCvv2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableTransmit() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableTransmit(String newEnableTransmit) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT, newEnableTransmit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostAddress() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostAddress(String newHostAddress) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS, newHostAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getHostPort() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostPort(long newHostPort) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT, newHostPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFileName() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFileName(String newLogFileName) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME, newLogFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLoggingLevel() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggingLevel(long newLoggingLevel) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL, newLoggingLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLogFileSize() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLogFileSize(long newMaxLogFileSize) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE, newMaxLogFileSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartner() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartner(String newPartner) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER, newPartner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreAuth() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreAuth(boolean newPreAuth) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH, newPreAuth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyAddress() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyAddress(String newProxyAddress) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS, newProxyAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyLogon() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyLogon(String newProxyLogon) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON, newProxyLogon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyPassword() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyPassword(String newProxyPassword) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD, newProxyPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProxyPort() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyPort(long newProxyPort) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT, newProxyPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPwd() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PWD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwd(String newPwd) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__PWD, newPwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedirectUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectUrl(String newRedirectUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL, newRedirectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnUrl(String newReturnUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL, newReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStackTraceOn() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackTraceOn(boolean newStackTraceOn) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON, newStackTraceOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeout() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(long newTimeout) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT, newTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID, newUserId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR, newVendor);
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
				case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PaymentGatewayPayflowProImpl
