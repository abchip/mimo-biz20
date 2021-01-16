/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.accounting;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.service.ServiceMethodRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Get Total</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.biz.service.accounting.AccountingPackage#getGetTotalInvoice()
 * @model superTypes="org.abchip.mimo.service.ServiceMethodRequest&lt;org.abchip.mimo.biz.model.accounting.invoice.Invoice, org.eclipse.emf.ecore.EBigDecimal&gt;"
 * @generated
 */
public interface GetTotalInvoice extends ServiceMethodRequest<Invoice, BigDecimal> {

} // GetTotalInvoice
