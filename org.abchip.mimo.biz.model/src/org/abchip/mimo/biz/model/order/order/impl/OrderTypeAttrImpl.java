/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.order.order.OrderType;
import org.abchip.mimo.biz.model.order.order.OrderTypeAttr;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Type Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl#getOrderTypeId <em>Order Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderTypeAttrImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderTypeAttrImpl extends BizEntityImpl implements OrderTypeAttr {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderTypeAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_TYPE_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return (String)eGet(OrderPackage.Literals.ORDER_TYPE_ATTR__ATTR_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		eSet(OrderPackage.Literals.ORDER_TYPE_ATTR__ATTR_NAME, newAttrName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(OrderPackage.Literals.ORDER_TYPE_ATTR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(OrderPackage.Literals.ORDER_TYPE_ATTR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getOrderTypeId() {
		return (OrderType)eGet(OrderPackage.Literals.ORDER_TYPE_ATTR__ORDER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(OrderType newOrderTypeId) {
		eSet(OrderPackage.Literals.ORDER_TYPE_ATTR__ORDER_TYPE_ID, newOrderTypeId);
	}

} //OrderTypeAttrImpl