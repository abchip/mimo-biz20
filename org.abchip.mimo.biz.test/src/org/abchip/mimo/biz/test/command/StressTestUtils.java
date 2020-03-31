/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyRole;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;

public class StressTestUtils {

	public static ProductStore getProductStore(Context context, ResourceManager resourceManager) {
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

	public static ProductPrice getProductPrice(Context context, ResourceManager resourceManager, Product product) {
		ResourceReader<ProductPrice> productPriceReader = resourceManager.getResourceReader(context, ProductPrice.class);

		String filter = "productId = \"" + product.getID() + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		try (EntityIterator<ProductPrice> list = productPriceReader.find(filter, null, order)) {
			return list.next();
		}
	}

	public static List<Party> getEnabledCustomers(Context context, ResourceManager resourceManager) {

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		ArrayList<Party> customers = new ArrayList<Party>();

		try (EntityIterator<Party> parties = partyReader.find()) {
			for (Party party : parties) {
				if (party.getID().equals("PersonCanary"))
					continue;
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

	public static Map<Product, ProductPrice> getDigitalProducts(Context context, ResourceManager resourceManager) {

		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);
		HashMap<Product, ProductPrice> digitals = new HashMap<Product, ProductPrice>();

		try (EntityIterator<Product> products = productReader.find()) {
			for (Product product : products) {
				if (product.getID().equals("ProductCanary"))
					continue;
				if (!product.getProductTypeId().getID().equals("DIGITAL_GOOD"))
					continue;
				ProductPrice price = StressTestUtils.getProductPrice(context, resourceManager, product);
				if (price == null)
					continue;
				digitals.put(product, price);
			}
		}

		return digitals;
	}

	public static Party getCompany(Context context, ResourceManager resourceManager) {
		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		return partyReader.lookup("Company");
	}

	public static Uom getUom(Context context, ResourceManager resourceManager) {
		ResourceReader<Uom> uomReader = resourceManager.getResourceReader(context, Uom.class);
		return uomReader.lookup("EUR");
	}

	public static String formatPaddedNumber(long number, int numericPadding) {
		StringBuilder outStrBfr = new StringBuilder(Long.toString(number));
		while (numericPadding > outStrBfr.length()) {
			outStrBfr.insert(0, '0');
		}
		return outStrBfr.toString();
	}

}