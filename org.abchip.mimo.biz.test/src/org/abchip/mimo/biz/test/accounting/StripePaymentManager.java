package org.abchip.mimo.biz.test.accounting;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentMethod;

public class StripePaymentManager {
	
	public static final String API_KEY = "sk_test_9HACrndqWGPN3Ox1hYNfuJQO00z4GR7fOI";
	
	public static PaymentIntent createPaymentIntent(String paymentType, BigDecimal amount, String currency, String description) throws StripeException {
		List<Object> paymentMethodTypes = new ArrayList<>();
		paymentMethodTypes.add(paymentType);
		Map<String, Object> paymentParams = new HashMap<>();

		// per l'amount bisogna passare un integer
		amount = amount.setScale(2, RoundingMode.HALF_UP);
		String amountString = amount.toString();
		amountString = amountString.replace(".", "");
		amountString = amountString.replace(",", "");
		
		paymentParams.put("amount", Integer.parseInt(amountString));
		paymentParams.put("currency", currency);
		paymentParams.put("payment_method_types", paymentMethodTypes);
		paymentParams.put("description", description);
		PaymentIntent paymentIntent = PaymentIntent.create(paymentParams);
		
		return paymentIntent;
	}

	public static PaymentIntent retrievePaymentIntent(String id) {
		try {
			return PaymentIntent.retrieve(id);
		} catch (StripeException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static PaymentIntent cancelPaymentIntent(String id) {
		try {
			return retrievePaymentIntent(id).cancel();
		} catch (StripeException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static PaymentMethod createPaymentSepaMethod(String iban) {
		try {
			Map<String, Object> sepaDebit = new HashMap<>();
			sepaDebit.put("iban", iban);

			Map<String, Object> billing = new HashMap<>();
			billing.put("name", "Nome e cognome");
			billing.put("email", "nome.cognome@postaelettronica.com");

			Map<String, Object> params = new HashMap<>();
			params.put("type", "sepa_debit");
			params.put("billing_details", billing);
			params.put("sepa_debit", sepaDebit);

			return PaymentMethod.create(params);
		} catch (StripeException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static PaymentMethod createPaymentCardMethod(String cardNumber, Integer exp_month, Integer exp_year, String cvc) {
		try {
			Map<String, Object> card = new HashMap<>();
			card.put("number", cardNumber);
			card.put("exp_month", exp_month);
			card.put("exp_year", exp_year);
			card.put("cvc", cvc);
			Map<String, Object> params = new HashMap<>();
			params.put("type", "card");
			params.put("card", card);

			return PaymentMethod.create(params);
		} catch (StripeException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static PaymentIntent confirm(String id, String paymentMethodString) {
		PaymentIntent intent = null;
		try {
			intent = retrievePaymentIntent(id);
			Map<String, Object> params = new HashMap<>();
			params.put("payment_method", paymentMethodString);
			return intent.confirm(params);
		} catch (StripeException e) {
			e.printStackTrace();
			return intent;
		}
	}
}
