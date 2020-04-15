/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyRole;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;

public class StressTestUtils {

	public static ProductStore getProductStore(Context context, ResourceManager resourceManager) throws ResourceException {
		ResourceWriter<ProductStore> productStoreWriter = resourceManager.getResourceWriter(context, ProductStore.class);

		ProductStore productStore = productStoreWriter.first();
		if (productStore != null)
			return productStore;

		productStore = productStoreWriter.make(true);
		productStore.setAllowPassword(false);
		productStore.setAutoApproveInvoice(false);
		productStore.setAutoOrderCcTryExp(false);
		productStore.setAutoOrderCcTryLaterNsf(false);
		productStore.setAutoOrderCcTryOtherCards(false);
		productStore.setCheckInventory(false);
		productStore.setInventoryFacilityId(resourceManager.getFrame(context, Facility.class).createProxy("WebStoreWarehouse"));
		productStore.setIsDemoStore(false);
		productStore.setOneInventoryFacility(false);
		productStore.setPayToPartyId(resourceManager.getFrame(context, Party.class).createProxy("Company"));
		productStore.setProdSearchExcludeVariants(false);
		productStore.setProrateShipping(false);
		productStore.setProrateTaxes(false);
		productStore.setReqShipAddrForDigItems(false);
		productStore.setReserveInventory(false);
		productStore.setRetryFailedAuths(false);
		productStore.setShipIfCaptureFails(false);
		productStore.setShowCheckoutGiftOptions(false);
		productStore.setShowPricesWithVatTax(true);
		productStore.setStoreName("ABChip test store");
		productStore.setTitle("Open For Commerce");
		productStore.setVatTaxAuthGeoId("ITA");
		productStore.setVatTaxAuthPartyId("ITA_ADE");
		productStore.setVisualThemeId("EC_DEFAULT");
		productStoreWriter.create(productStore, true);

		return productStore;
	}

	public static ProductPrice getProductPrice(Context context, ResourceManager resourceManager, Product product) throws ResourceException {
		ResourceReader<ProductPrice> productPriceReader = resourceManager.getResourceReader(context, ProductPrice.class);

		String filter = "productId = \"" + product.getID() + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		try (EntityIterator<ProductPrice> list = productPriceReader.find(filter, null, order)) {
			return list.next();
		}
	}

	public static List<Party> getEnabledCustomers(Context context) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);
		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		ArrayList<Party> customers = new ArrayList<Party>();

		try (EntityIterator<Party> parties = partyReader.find()) {
			for (Party party : parties) {
				if (!party.getStatusId().getID().equals("PARTY_ENABLED"))
					continue;
				int count = 0;
				if (party.getPartyRoles() == null)
					continue;
				for (PartyRole partyRole : party.getPartyRoles()) {
					if (!partyRole.getRoleTypeId().getID().equals("CUSTOMER"))
						continue;
					count++;
				}
				if (count == 0)
					continue;
				customers.add(party);
			}
		}
		return customers;
	}

	public static List<Party> getEnabledSupplier(Context context) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);
		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		ArrayList<Party> customers = new ArrayList<Party>();

		try (EntityIterator<Party> parties = partyReader.find()) {
			for (Party party : parties) {
				if (!party.getStatusId().getID().equals("PARTY_ENABLED"))
					continue;
				int count = 0;
				if (party.getPartyRoles() == null)
					continue;
				for (PartyRole partyRole : party.getPartyRoles()) {
					if (!partyRole.getRoleTypeId().getID().equals("SUPPLIER"))
						continue;
					count++;
				}
				if (count == 0)
					continue;
				customers.add(party);
			}
		}
		return customers;
	}

	public static List<ProductPrice> getDigitalProductPrices(Context context) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);
		List<ProductPrice> productPrices = new ArrayList<ProductPrice>();

		try (EntityIterator<Product> products = productReader.find()) {
			for (Product product : products) {
				if (!product.getProductTypeId().getID().equals("DIGITAL_GOOD"))
					continue;
				ProductPrice price = StressTestUtils.getProductPrice(context, resourceManager, product);
				if (price == null)
					continue;
				productPrices.add(price);
			}
		}

		return productPrices;
	}

	public static String generateRandomString(int length, boolean onlyNumbers) {
		// You can customize the characters that you want to add into
		// the random strings
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
		String CHAR_UPPER = CHAR_LOWER.toUpperCase();
		String NUMBER = "0123456789";

		String DATA_FOR_RANDOM_STRING = "";

		if (onlyNumbers) {
			DATA_FOR_RANDOM_STRING = NUMBER + NUMBER;
		} else {
			DATA_FOR_RANDOM_STRING = CHAR_UPPER + NUMBER;
		}
		SecureRandom random = new SecureRandom();

		if (length < 1)
			throw new IllegalArgumentException();

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			// 0-62 (exclusive), random returns 0-61
			int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
			char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

			sb.append(rndChar);
		}

		return sb.toString();
	}

	public static String formatPaddedNumber(long number, int numericPadding) {
		StringBuilder outStrBfr = new StringBuilder(Long.toString(number));
		while (numericPadding > outStrBfr.length()) {
			outStrBfr.insert(0, '0');
		}
		return outStrBfr.toString();
	}
}