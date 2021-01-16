/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.util.concurrent.Callable;
import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Product Default</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getGetProductDefault()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.biz.service.product.GetProductDefaultResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.biz.service.product.GetProductDefaultResponse&gt;"
 * @generated
 */
public interface GetProductDefault extends ServiceRequest<GetProductDefaultResponse>, Callable<GetProductDefaultResponse> {
} // GetProductDefault
