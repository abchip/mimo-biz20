/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.model.order.order.OrderFactory;
import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.service.product.MyService;
import org.abchip.mimo.biz.service.product.ProductFactory;
import org.abchip.mimo.biz.service.product.ProductPackage;
import org.abchip.mimo.service.ServiceException;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MyServiceImpl extends CalculateProductPriceImpl implements MyService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyServiceImpl() {
		super();
	}

	@Override
	public CalculateProductPriceResponse call() throws ServiceException {

		CalculateProductPriceResponse response = ProductFactory.eINSTANCE.createCalculateProductPriceResponse();
		
		response.setValidPriceFound(true);
		response.setBasePrice(new BigDecimal(1.25));
		
		OrderItemPriceInfo orderItemPriceInfo = OrderFactory.eINSTANCE.createOrderItemPriceInfo();
		orderItemPriceInfo.setOrderItemPriceInfoId("pippo");
		response.getOrderItemPriceInfos().add(orderItemPriceInfo);
		
		response.setResponseMessage("brutta raga!!");
		response.setSuccessMessage("bella raga!!");
		
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.MY_SERVICE;
	}

} //MyServiceImpl
