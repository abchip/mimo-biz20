/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.accounting;

import java.math.BigDecimal;
import java.util.Map;

import org.apache.ofbiz.accounting.invoice.InvoiceWorker;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;

public class InvoiceServices {

	public static Map<String, Object> getTotal(DispatchContext ctx, Map<String, ? extends Object> context) {

		GenericValue entity = (GenericValue) context.get("entity");
		BigDecimal result = InvoiceWorker.getInvoiceTotal(entity);

		Map<String, Object> results = ServiceUtil.returnSuccess();
		results.put("result", result);
		return results;
	}
}