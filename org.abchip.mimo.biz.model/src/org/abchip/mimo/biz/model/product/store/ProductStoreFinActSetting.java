/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.content.survey.Survey;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Fin Act Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getFinAccountType <em>Fin Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAccountCodeLength <em>Account Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAccountValidDays <em>Account Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAllowAuthToNegative <em>Allow Auth To Negative</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAuthValidDays <em>Auth Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getMinBalance <em>Min Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPinCodeLength <em>Pin Code Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPurchSurveySendTo <em>Purch Survey Send To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPurchaseSurvey <em>Purchase Survey</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getReplenishMethodEnum <em>Replenish Method Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getReplenishThreshold <em>Replenish Threshold</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getRequirePinCode <em>Require Pin Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getValidateGCFinAcct <em>Validate GC Fin Acct</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting()
 * @model annotation="mimo-ent-frame title='Allows financial account, such as gift certificate or calling cards, to be configured at store level' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStoreFinActSetting extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_ProductStore()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Fin Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type</em>' reference.
	 * @see #setFinAccountType(FinAccountType)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_FinAccountType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FinAccountType getFinAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getFinAccountType <em>Fin Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Type</em>' reference.
	 * @see #getFinAccountType()
	 * @generated
	 */
	void setFinAccountType(FinAccountType value);

	/**
	 * Returns the value of the '<em><b>Account Code Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Code Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Code Length</em>' attribute.
	 * @see #setAccountCodeLength(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_AccountCodeLength()
	 * @model annotation="mimo-ent-slot help='length of auto-generated account code'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAccountCodeLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAccountCodeLength <em>Account Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Code Length</em>' attribute.
	 * @see #getAccountCodeLength()
	 * @generated
	 */
	void setAccountCodeLength(long value);

	/**
	 * Returns the value of the '<em><b>Account Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Valid Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Valid Days</em>' attribute.
	 * @see #setAccountValidDays(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_AccountValidDays()
	 * @model annotation="mimo-ent-slot help='number of days an account of this type would be valid for'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAccountValidDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAccountValidDays <em>Account Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Valid Days</em>' attribute.
	 * @see #getAccountValidDays()
	 * @generated
	 */
	void setAccountValidDays(long value);

	/**
	 * Returns the value of the '<em><b>Allow Auth To Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Auth To Negative</em>' attribute.
	 * @see #setAllowAuthToNegative(Boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_AllowAuthToNegative()
	 * @model
	 * @generated
	 */
	Boolean getAllowAuthToNegative();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAllowAuthToNegative <em>Allow Auth To Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Auth To Negative</em>' attribute.
	 * @see #getAllowAuthToNegative()
	 * @generated
	 */
	void setAllowAuthToNegative(Boolean value);

	/**
	 * Returns the value of the '<em><b>Auth Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Valid Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Valid Days</em>' attribute.
	 * @see #setAuthValidDays(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_AuthValidDays()
	 * @model annotation="mimo-ent-slot help='number of days an authorization of this type would be valid for'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAuthValidDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getAuthValidDays <em>Auth Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Valid Days</em>' attribute.
	 * @see #getAuthValidDays()
	 * @generated
	 */
	void setAuthValidDays(long value);

	/**
	 * Returns the value of the '<em><b>Min Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Balance</em>' attribute.
	 * @see #setMinBalance(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_MinBalance()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMinBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getMinBalance <em>Min Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Balance</em>' attribute.
	 * @see #getMinBalance()
	 * @generated
	 */
	void setMinBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pin Code Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Code Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Code Length</em>' attribute.
	 * @see #setPinCodeLength(long)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_PinCodeLength()
	 * @model annotation="mimo-ent-slot help='length of auto-generated pin code, if it is required'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPinCodeLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPinCodeLength <em>Pin Code Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Code Length</em>' attribute.
	 * @see #getPinCodeLength()
	 * @generated
	 */
	void setPinCodeLength(long value);

	/**
	 * Returns the value of the '<em><b>Purch Survey Copy Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purch Survey Copy Me</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purch Survey Copy Me</em>' attribute.
	 * @see #setPurchSurveyCopyMe(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_PurchSurveyCopyMe()
	 * @model annotation="mimo-ent-slot help='Whether the BCC on ProductStoreEmailSetting should be copied for email notifications'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPurchSurveyCopyMe();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purch Survey Copy Me</em>' attribute.
	 * @see #getPurchSurveyCopyMe()
	 * @generated
	 */
	void setPurchSurveyCopyMe(String value);

	/**
	 * Returns the value of the '<em><b>Purch Survey Send To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purch Survey Send To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purch Survey Send To</em>' attribute.
	 * @see #setPurchSurveySendTo(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_PurchSurveySendTo()
	 * @model annotation="mimo-ent-slot help='Field name on the purchase survey with the send to email address'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPurchSurveySendTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPurchSurveySendTo <em>Purch Survey Send To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purch Survey Send To</em>' attribute.
	 * @see #getPurchSurveySendTo()
	 * @generated
	 */
	void setPurchSurveySendTo(String value);

	/**
	 * Returns the value of the '<em><b>Purchase Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Survey</em>' reference.
	 * @see #setPurchaseSurvey(Survey)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_PurchaseSurvey()
	 * @model annotation="mimo-ent-slot help='This survey is typically used to collect information such as name of buyer, recipient, email, message, etc. and is quite flexible'"
	 * @generated
	 */
	Survey getPurchaseSurvey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getPurchaseSurvey <em>Purchase Survey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Survey</em>' reference.
	 * @see #getPurchaseSurvey()
	 * @generated
	 */
	void setPurchaseSurvey(Survey value);

	/**
	 * Returns the value of the '<em><b>Replenish Method Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Method Enum</em>' reference.
	 * @see #setReplenishMethodEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_ReplenishMethodEnum()
	 * @model annotation="mimo-ent-slot help='Replenish Method for Replenish Account. Can be FARP_TOP_OFF or FARP_REPLENISH_LEVEL. Default FARP_TOP_OFF.'"
	 * @generated
	 */
	Enumeration getReplenishMethodEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getReplenishMethodEnum <em>Replenish Method Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Method Enum</em>' reference.
	 * @see #getReplenishMethodEnum()
	 * @generated
	 */
	void setReplenishMethodEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Replenish Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Threshold</em>' attribute.
	 * @see #setReplenishThreshold(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_ReplenishThreshold()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReplenishThreshold();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getReplenishThreshold <em>Replenish Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Threshold</em>' attribute.
	 * @see #getReplenishThreshold()
	 * @generated
	 */
	void setReplenishThreshold(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Require Pin Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Pin Code</em>' attribute.
	 * @see #setRequirePinCode(Boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_RequirePinCode()
	 * @model
	 * @generated
	 */
	Boolean getRequirePinCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getRequirePinCode <em>Require Pin Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Pin Code</em>' attribute.
	 * @see #getRequirePinCode()
	 * @generated
	 */
	void setRequirePinCode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Validate GC Fin Acct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate GC Fin Acct</em>' attribute.
	 * @see #setValidateGCFinAcct(Boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreFinActSetting_ValidateGCFinAcct()
	 * @model annotation="mimo-ent-slot help='determines whether the store should validate gift card numbers against the gift certificate codes stored in FinAccount.\n              Set to N if using external gift card provider.'"
	 * @generated
	 */
	Boolean getValidateGCFinAcct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreFinActSetting#getValidateGCFinAcct <em>Validate GC Fin Acct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate GC Fin Acct</em>' attribute.
	 * @see #getValidateGCFinAcct()
	 * @generated
	 */
	void setValidateGCFinAcct(Boolean value);

} // ProductStoreFinActSetting
