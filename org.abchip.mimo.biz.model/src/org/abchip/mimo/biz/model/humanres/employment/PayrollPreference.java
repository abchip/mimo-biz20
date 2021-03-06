/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.employment;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.payment.DeductionType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.common.period.PeriodType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payroll Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPayrollPreferenceSeqId <em>Payroll Preference Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getDeductionType <em>Deduction Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFlatAmount <em>Flat Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPeriodType <em>Period Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoutingNumber <em>Routing Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference()
 * @model
 * @generated
 */
public interface PayrollPreference extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #setAccountNumber(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_AccountNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Name</em>' attribute.
	 * @see #setBankName(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_BankName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getBankName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Name</em>' attribute.
	 * @see #getBankName()
	 * @generated
	 */
	void setBankName(String value);

	/**
	 * Returns the value of the '<em><b>Deduction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Type</em>' reference.
	 * @see #setDeductionType(DeductionType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_DeductionType()
	 * @model
	 * @generated
	 */
	DeductionType getDeductionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getDeductionType <em>Deduction Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Type</em>' reference.
	 * @see #getDeductionType()
	 * @generated
	 */
	void setDeductionType(DeductionType value);

	/**
	 * Returns the value of the '<em><b>Flat Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flat Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat Amount</em>' attribute.
	 * @see #setFlatAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_FlatAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getFlatAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFlatAmount <em>Flat Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flat Amount</em>' attribute.
	 * @see #getFlatAmount()
	 * @generated
	 */
	void setFlatAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type</em>' reference.
	 * @see #setPaymentMethodType(PaymentMethodType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_PaymentMethodType()
	 * @model
	 * @generated
	 */
	PaymentMethodType getPaymentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPaymentMethodType <em>Payment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type</em>' reference.
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	void setPaymentMethodType(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Payroll Preference Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payroll Preference Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payroll Preference Seq Id</em>' attribute.
	 * @see #setPayrollPreferenceSeqId(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_PayrollPreferenceSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPayrollPreferenceSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPayrollPreferenceSeqId <em>Payroll Preference Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payroll Preference Seq Id</em>' attribute.
	 * @see #getPayrollPreferenceSeqId()
	 * @generated
	 */
	void setPayrollPreferenceSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(double)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_Percentage()
	 * @model
	 * @generated
	 */
	double getPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Period Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type</em>' reference.
	 * @see #setPeriodType(PeriodType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_PeriodType()
	 * @model
	 * @generated
	 */
	PeriodType getPeriodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getPeriodType <em>Period Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type</em>' reference.
	 * @see #getPeriodType()
	 * @generated
	 */
	void setPeriodType(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_RoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Routing Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Number</em>' attribute.
	 * @see #setRoutingNumber(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_RoutingNumber()
	 * @model annotation="mimo-ent-slot help='See https://en.wikipedia.org/wiki/Bank_code'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getRoutingNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getRoutingNumber <em>Routing Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Number</em>' attribute.
	 * @see #getRoutingNumber()
	 * @generated
	 */
	void setRoutingNumber(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getPayrollPreference_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.PayrollPreference#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PayrollPreference
