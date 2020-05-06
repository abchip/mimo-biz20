/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Get
 * Party Default</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getGetPartyDefault()
 * @model superTypes="org.abchip.mimo.biz.service.BizServiceRequest&lt;org.abchip.mimo.biz.service.product.GetPartyDefaultResponse&gt;
 *        org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.biz.service.product.GetPartyDefaultResponse&gt;"
 * @generated
 */
public interface GetPartyDefault extends ServiceRequest<GetPartyDefaultResponse>, Callable<GetPartyDefaultResponse> {
} // GetPartyDefault
