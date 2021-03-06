/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.budget.impl;

import org.abchip.mimo.biz.model.accounting.budget.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BudgetFactoryImpl extends EFactoryImpl implements BudgetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BudgetFactory init() {
		try {
			BudgetFactory theBudgetFactory = (BudgetFactory)EPackage.Registry.INSTANCE.getEFactory(BudgetPackage.eNS_URI);
			if (theBudgetFactory != null) {
				return theBudgetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BudgetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BudgetPackage.BUDGET: return (EObject)createBudget();
			case BudgetPackage.BUDGET_ATTRIBUTE: return (EObject)createBudgetAttribute();
			case BudgetPackage.BUDGET_ITEM: return (EObject)createBudgetItem();
			case BudgetPackage.BUDGET_ITEM_ATTRIBUTE: return (EObject)createBudgetItemAttribute();
			case BudgetPackage.BUDGET_ITEM_TYPE: return (EObject)createBudgetItemType();
			case BudgetPackage.BUDGET_ITEM_TYPE_ATTR: return (EObject)createBudgetItemTypeAttr();
			case BudgetPackage.BUDGET_REVIEW: return (EObject)createBudgetReview();
			case BudgetPackage.BUDGET_REVIEW_RESULT_TYPE: return (EObject)createBudgetReviewResultType();
			case BudgetPackage.BUDGET_REVISION: return (EObject)createBudgetRevision();
			case BudgetPackage.BUDGET_REVISION_IMPACT: return (EObject)createBudgetRevisionImpact();
			case BudgetPackage.BUDGET_ROLE: return (EObject)createBudgetRole();
			case BudgetPackage.BUDGET_SCENARIO: return (EObject)createBudgetScenario();
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION: return (EObject)createBudgetScenarioApplication();
			case BudgetPackage.BUDGET_SCENARIO_RULE: return (EObject)createBudgetScenarioRule();
			case BudgetPackage.BUDGET_STATUS: return (EObject)createBudgetStatus();
			case BudgetPackage.BUDGET_TYPE: return (EObject)createBudgetType();
			case BudgetPackage.BUDGET_TYPE_ATTR: return (EObject)createBudgetTypeAttr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Budget createBudget() {
		BudgetImpl budget = new BudgetImpl();
		return budget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetAttribute createBudgetAttribute() {
		BudgetAttributeImpl budgetAttribute = new BudgetAttributeImpl();
		return budgetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItem createBudgetItem() {
		BudgetItemImpl budgetItem = new BudgetItemImpl();
		return budgetItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemAttribute createBudgetItemAttribute() {
		BudgetItemAttributeImpl budgetItemAttribute = new BudgetItemAttributeImpl();
		return budgetItemAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemType createBudgetItemType() {
		BudgetItemTypeImpl budgetItemType = new BudgetItemTypeImpl();
		return budgetItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemTypeAttr createBudgetItemTypeAttr() {
		BudgetItemTypeAttrImpl budgetItemTypeAttr = new BudgetItemTypeAttrImpl();
		return budgetItemTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetReview createBudgetReview() {
		BudgetReviewImpl budgetReview = new BudgetReviewImpl();
		return budgetReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetReviewResultType createBudgetReviewResultType() {
		BudgetReviewResultTypeImpl budgetReviewResultType = new BudgetReviewResultTypeImpl();
		return budgetReviewResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetRevision createBudgetRevision() {
		BudgetRevisionImpl budgetRevision = new BudgetRevisionImpl();
		return budgetRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetRevisionImpact createBudgetRevisionImpact() {
		BudgetRevisionImpactImpl budgetRevisionImpact = new BudgetRevisionImpactImpl();
		return budgetRevisionImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetRole createBudgetRole() {
		BudgetRoleImpl budgetRole = new BudgetRoleImpl();
		return budgetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetScenario createBudgetScenario() {
		BudgetScenarioImpl budgetScenario = new BudgetScenarioImpl();
		return budgetScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetScenarioApplication createBudgetScenarioApplication() {
		BudgetScenarioApplicationImpl budgetScenarioApplication = new BudgetScenarioApplicationImpl();
		return budgetScenarioApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetScenarioRule createBudgetScenarioRule() {
		BudgetScenarioRuleImpl budgetScenarioRule = new BudgetScenarioRuleImpl();
		return budgetScenarioRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetStatus createBudgetStatus() {
		BudgetStatusImpl budgetStatus = new BudgetStatusImpl();
		return budgetStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetType createBudgetType() {
		BudgetTypeImpl budgetType = new BudgetTypeImpl();
		return budgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetTypeAttr createBudgetTypeAttr() {
		BudgetTypeAttrImpl budgetTypeAttr = new BudgetTypeAttrImpl();
		return budgetTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetPackage getBudgetPackage() {
		return (BudgetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BudgetPackage getPackage() {
		return BudgetPackage.eINSTANCE;
	}

} //BudgetFactoryImpl
