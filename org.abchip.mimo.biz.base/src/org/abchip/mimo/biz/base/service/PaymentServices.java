/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.service;

import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class PaymentServices {

	public static PaymentMethod getPaymentMethodParty(Context context, String partyId, String methodType) throws ResourceException {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL and paymentMethodTypeId = \"" + methodType + "\"";
		String order = "-fromDate";
		ResourceReader<PaymentMethod> paymentMethodReader = resourceManager.getResourceReader(context, PaymentMethod.class);
		try (EntityIterator<PaymentMethod> paymentMethods = paymentMethodReader.find(filter, null, order)) {
			for (PaymentMethod paymentMethod : paymentMethods) {
				return paymentMethod;
			}
		}
		return null;
	}

	public static CreditCard getCreditCardParty(Context context, String partyId) throws ResourceException {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PaymentMethod> paymentMethodReader = resourceManager.getResourceReader(context, PaymentMethod.class);
		ResourceReader<CreditCard> creditCardReader = resourceManager.getResourceReader(context, CreditCard.class);
		CreditCard creditCard = null;
		try (EntityIterator<PaymentMethod> paymentMethods = paymentMethodReader.find(filter, null, order)) {
			for (PaymentMethod paymentMethod : paymentMethods) {
				if (!paymentMethod.getPaymentMethodTypeId().getID().equals("CREDIT_CARD"))
					continue;
				creditCard = creditCardReader.lookup(paymentMethod.getPaymentMethodId());
				break;
			}
		}
		return creditCard;
	}
}