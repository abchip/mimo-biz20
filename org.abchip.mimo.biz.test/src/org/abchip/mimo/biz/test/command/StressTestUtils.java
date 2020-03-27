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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.contact.PartyContactMech;
import org.abchip.mimo.biz.party.contact.PartyContactMechPurpose;
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

	public static void createPartyContactMech(Context context, ResourceManager resourceManager, Party party, ContactMech contactMech, String purposeType) {
		// PartyContactMech
		ResourceWriter<PartyContactMech> partyContactMechWriter = resourceManager.getResourceWriter(context, PartyContactMech.class);
		PartyContactMech partyContactMech = partyContactMechWriter.make();
		partyContactMech.setPartyId(party);
		partyContactMech.setContactMechId(contactMech);
		partyContactMech.setFromDate(new Date());
		partyContactMechWriter.create(partyContactMech, true);

		if(!purposeType.isEmpty()) {
			// PartyContactMechPurpose
			ResourceWriter<PartyContactMechPurpose> partyContactMechPurposeWriter = resourceManager.getResourceWriter(context, PartyContactMechPurpose.class);
			PartyContactMechPurpose partyContactMechPurpose = partyContactMechPurposeWriter.make();
			partyContactMechPurpose.setPartyId(party);
			partyContactMechPurpose.setContactMechId(contactMech);
			partyContactMechPurpose.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy(purposeType));
			partyContactMechPurpose.setFromDate(new Date());
			partyContactMechPurposeWriter.create(partyContactMechPurpose, true);
		}
	}
	
	public static ProductStore getProductStore(Context context, ResourceManager resourceManager) {
		ResourceWriter<ProductStore> productStoreWriter = resourceManager.getResourceWriter(context, ProductStore.class);
		EntityIterator<ProductStore> list = productStoreWriter.find();
		if(list.hasNext())
			return list.next();

		
		ProductStore productStore = productStoreWriter.make(true);
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
		ResourceReader<ProductPrice> productPriceReader = resourceManager.getResourceWriter(context, ProductPrice.class);
		
		String filter = "productId = \"" + product.getID() + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		EntityIterator<ProductPrice> list = productPriceReader.find(filter, null, order);
		if(list.hasNext())
			return list.next();

		return null;
	}
	
	@SuppressWarnings("resource")
	public static List<Party> checkParty(Context context, ResourceManager resourceManager) {
		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		ArrayList<Party> parties = new ArrayList<Party>();
		
		for (Party party : partyReader.find()) {
			if(party.getID().equals("PersonCanary"))
				continue;
			if(!party.getStatusId().getID().equals("PARTY_ENABLED"))
				continue;
			int count = 0;
			if(party.getPartyRoles() == null )
				continue;
			for (PartyRole partyRole : party.getPartyRoles()) {
				if (!partyRole.getRoleTypeId().getID().equals("CUSTOMER"))
					continue;
				count++;
			}
			if(count == 0)
				continue;
			parties.add(party);
		}
		return parties;
	}

	@SuppressWarnings("resource")
	public static Map<Product, ProductPrice> checkProduct(Context context, ResourceManager resourceManager) {
		ResourceReader<Product> productReader = resourceManager.getResourceReader(context, Product.class);
		HashMap<Product, ProductPrice> map = new HashMap<Product, ProductPrice>();

		for (Product product : productReader.find()) {
			if(product.getID().equals("ProductCanary"))
				continue;
			if (!product.getProductTypeId().getID().equals("DIGITAL_GOOD"))
				continue;
			ProductPrice price = StressTestUtils.getProductPrice(context, resourceManager, product);
			if(price == null)
				continue;
			map.put(product, price);
		}

		return map;
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