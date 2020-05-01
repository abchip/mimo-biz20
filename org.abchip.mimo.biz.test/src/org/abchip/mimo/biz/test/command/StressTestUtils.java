/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.product.supplier.SupplierProduct;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;

public class StressTestUtils {

	public static ProductStore getProductStore(Context context) throws ResourceException {
		ResourceWriter<ProductStore> productStoreWriter = context.getResourceManager().getResourceWriter(ProductStore.class);
		return productStoreWriter.first();
	}

	public static ProductPrice getProductPrice(Context context, Product product) throws ResourceException {
		ResourceReader<ProductPrice> productPriceReader = context.getResourceManager().getResourceReader(ProductPrice.class);

		String filter = "productId = \"" + product.getID() + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		try (EntityIterator<ProductPrice> list = productPriceReader.find(filter, null, order)) {
			return list.next();
		}
	}

	public static List<Party> getEnabledCustomers(Context context) throws ResourceException {
		ResourceReader<Party> partyReader = context.getResourceManager().getResourceReader(Party.class);
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

		ResourceReader<Party> partyReader = context.getResourceManager().getResourceReader(Party.class);
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

	public static List<Product> getDigitalProducts(Context context) throws ResourceException {

		ResourceReader<Product> productReader = context.getResourceManager().getResourceReader(Product.class);
		List<Product> productList = new ArrayList<Product>();

		try (EntityIterator<Product> products = productReader.find()) {
			for (Product product : products) {
				if (!product.getProductTypeId().getID().equals("DIGITAL_GOOD"))
					continue;
				productList.add(product);
			}
		}

		return productList;
	}

	public static List<SupplierProduct> getSupplierProduct(Context context, Party party) throws ResourceException {

		ResourceReader<SupplierProduct> supplierProductReader = context.getResourceManager().getResourceReader(SupplierProduct.class);
		List<SupplierProduct> supplierProduct = new ArrayList<SupplierProduct>();
		String filter = "partyId = \"" + party.getID() + "\"";

		try (EntityIterator<SupplierProduct> supplierProducts = supplierProductReader.find(filter)) {
			for (SupplierProduct product : supplierProducts) {

				if (product.getLastPrice().equals(BigDecimal.ZERO))
					continue;
				supplierProduct.add(product);
			}
		}
		return supplierProduct;
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