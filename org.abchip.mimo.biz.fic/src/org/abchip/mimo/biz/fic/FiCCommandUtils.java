/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.fic;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.model.accounting.tax.TaxFactory;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactFactory;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMechPurpose;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyFactory;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.PartyIdentification;
import org.abchip.mimo.biz.model.party.party.PartyIdentificationType;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.price.PriceFactory;
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.model.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.model.product.price.ProductPriceType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.product.ProductFactory;
import org.abchip.mimo.biz.model.product.store.ProductStoreGroup;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;

public class FiCCommandUtils {

	public static void createContactMechTelecom(EntityContainer container, Context context, String telephone, String partyId, AtomicInteger contactMechCounter, String contactMechType,
			String contactMechPurposeType) {
		// TelecomNumber
		TelecomNumber telecomNumber = ContactFactory.eINSTANCE.createTelecomNumber();
		String contactMechId = Integer.toString(contactMechCounter.incrementAndGet());
		telecomNumber.setContactMechId(contactMechId);
		telecomNumber.setContactMechTypeId(context.getFrame(ContactMechType.class).createProxy(contactMechType, context.getTenant()));
		telecomNumber.setContactNumber(telephone);
		container.getContents().add(telecomNumber);

		// PartyContactMech
		PartyContactMech partyContactMech = ContactFactory.eINSTANCE.createPartyContactMech();
		partyContactMech.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyContactMech.setContactMechId(context.getFrame(ContactMech.class).createProxy(contactMechId, context.getTenant()));
		partyContactMech.setFromDate(new Date());
		container.getContents().add(partyContactMech);

		// PartyContactMechPurpose
		PartyContactMechPurpose partyContactMechPurpose = ContactFactory.eINSTANCE.createPartyContactMechPurpose();
		partyContactMechPurpose.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyContactMechPurpose.setContactMechId(context.getFrame(ContactMech.class).createProxy(contactMechId, context.getTenant()));
		partyContactMechPurpose.setContactMechPurposeTypeId(context.getFrame(ContactMechPurposeType.class).createProxy(contactMechPurposeType, context.getTenant()));
		partyContactMechPurpose.setFromDate(new Date());
		container.getContents().add(partyContactMechPurpose);
	}

	public static void createContactMechMail(EntityContainer container, Context context, String email, String partyId, AtomicInteger contactMechCounter, String contactMechType,
			String contactMechPurposeType) {

		// ContactMech
		ContactMech contactMech = ContactFactory.eINSTANCE.createContactMech();
		String contactMechId = Integer.toString(contactMechCounter.incrementAndGet());
		contactMech.setContactMechId(contactMechId);
		contactMech.setInfoString(email);
		contactMech.setContactMechTypeId(context.getFrame(ContactMechType.class).createProxy(contactMechType, context.getTenant()));
		container.getContents().add(contactMech);

		// PartyContactMech
		PartyContactMech partyContactMech = ContactFactory.eINSTANCE.createPartyContactMech();
		partyContactMech.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyContactMech.setContactMechId(context.getFrame(ContactMech.class).createProxy(contactMechId, context.getTenant()));
		partyContactMech.setFromDate(new Date());
		container.getContents().add(partyContactMech);

		// PartyContactMechPurpose
		PartyContactMechPurpose partyContactMechPurpose = ContactFactory.eINSTANCE.createPartyContactMechPurpose();
		partyContactMechPurpose.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyContactMechPurpose.setContactMechId(context.getFrame(ContactMech.class).createProxy(contactMechId, context.getTenant()));
		partyContactMechPurpose.setContactMechPurposeTypeId(context.getFrame(ContactMechPurposeType.class).createProxy(contactMechPurposeType, context.getTenant()));
		partyContactMechPurpose.setFromDate(new Date());
		container.getContents().add(partyContactMechPurpose);
	}

	public static void createTaxAuth(EntityContainer container, Context context, String partyId, String piva) {
		// PartyTaxAuthInfo
		PartyTaxAuthInfo partyTaxAuthInfo = TaxFactory.eINSTANCE.createPartyTaxAuthInfo();
		partyTaxAuthInfo.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyTaxAuthInfo.setFromDate(new Date());
		partyTaxAuthInfo.setTaxAuthGeoId("ITA");
		partyTaxAuthInfo.setTaxAuthPartyId("ITA_ADE");
		partyTaxAuthInfo.setPartyTaxId("IT-" + piva);
		container.getContents().add(partyTaxAuthInfo);
	}

	public static void createIdentificationCard(EntityContainer container, Context context, String partyId, String cf) {
		// PartyTaxAuthInfo
		PartyIdentification partyIdentification = PartyFactory.eINSTANCE.createPartyIdentification();
		partyIdentification.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyIdentification.setPartyIdentificationTypeId(context.getFrame(PartyIdentificationType.class).createProxy("VCARD_FN_ORIGIN", context.getTenant()));
		partyIdentification.setIdValue(cf);
		container.getContents().add(partyIdentification);
	}

	public static void createPartyGroup(EntityContainer container, Context context, String partyId, String id, String nome, String referente) {
		PartyGroup partyGroup = PartyFactory.eINSTANCE.createPartyGroup();
		partyGroup.setPartyId(partyId);
		partyGroup.setStatusId(context.getFrame(StatusItem.class).createProxy("PARTY_ENABLED", context.getTenant()));
		partyGroup.setPartyTypeId(context.getFrame(PartyType.class).createProxy("PARTY_GROUP", context.getTenant()));
		partyGroup.setPreferredCurrencyUomId(context.getFrame(Uom.class).createProxy("EUR", context.getTenant()));
		// id
		partyGroup.setExternalId(id);
		// nome
		partyGroup.setGroupName(nome);
		// referente
		// TODO al momento non so dove scrivere l'informazione "referente"
		if (!referente.isEmpty()) {

		}
		container.getContents().add(partyGroup);
	}

	public static void createPartyRole(EntityContainer container, Context context, String partyId, String string) {
		// PartyRole
		PartyRole partyRole = PartyFactory.eINSTANCE.createPartyRole();
		partyRole.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("CUSTOMER", context.getTenant()));
		container.getContents().add(partyRole);
	}

	public static void createPostaAddress(EntityContainer container, Context context, String partyId, AtomicInteger contactMechCounter, String nome, String indirizzo_via,
			String indirizzo_citta, String indirizzo_cap, String indirizzo_provincia, String indirizzo_paese) {
		// PostaAddress
		PostalAddress postalAddress = ContactFactory.eINSTANCE.createPostalAddress();
		String contactMechId = Integer.toString(contactMechCounter.incrementAndGet());
		postalAddress.setContactMechId(contactMechId);
		postalAddress.setToName(nome);
		// indirizzo_via
		postalAddress.setAddress1(indirizzo_via);
		// indirizzo_città
		postalAddress.setCity(indirizzo_citta);
		// indirizzo_cap
		postalAddress.setPostalCode(indirizzo_cap);
		postalAddress.setContactMechTypeId(context.getFrame(ContactMechType.class).createProxy("POSTAL_ADDRESS", context.getTenant()));
		// paese
		if (indirizzo_paese.equals("Italia"))
			postalAddress.setCountryGeoId(context.getFrame(Geo.class).createProxy("ITA", context.getTenant()));
		// indirizzo_provincia
		postalAddress.setStateProvinceGeoId(context.getFrame(Geo.class).createProxy(indirizzo_provincia, context.getTenant()));
		// indirizzo_extra
		// TODO non so
		container.getContents().add(postalAddress);

		// PartyContactMech
		PartyContactMech partyContactMech = ContactFactory.eINSTANCE.createPartyContactMech();
		partyContactMech.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyContactMech.setContactMechId(context.getFrame(ContactMech.class).createProxy(contactMechId, context.getTenant()));
		partyContactMech.setFromDate(new Date());
		container.getContents().add(partyContactMech);

		// PartyContactMechPurpose
		PartyContactMechPurpose partyContactMechPurpose = ContactFactory.eINSTANCE.createPartyContactMechPurpose();
		partyContactMechPurpose.setPartyId(context.getFrame(Party.class).createProxy(partyId, context.getTenant()));
		partyContactMechPurpose.setContactMechId(context.getFrame(ContactMech.class).createProxy(contactMechId, context.getTenant()));
		partyContactMechPurpose.setContactMechPurposeTypeId(context.getFrame(ContactMechPurposeType.class).createProxy("GENERAL_LOCATION", context.getTenant()));
		partyContactMechPurpose.setFromDate(new Date());
		container.getContents().add(partyContactMechPurpose);
	}

	public static void createProduct(EntityContainer container, Context context, String id, String cod, String nome, String desc, String categoria, String um) {
		// Product
		Product product = ProductFactory.eINSTANCE.createProduct();
		product.setProductId(nome);
		product.setProductName(desc);
		product.setInternalName(cod);
		product.setComments(id);
		if (!categoria.isEmpty()) {
			// TODO come la trattiamo? è un campo del tutto libero
		}
		if (!um.isEmpty()) {
			// TODO come la trattiamo? è un campo del tutto libero
		}
		container.getContents().add(product);
	}

	public static void createProductPrice(EntityContainer container, Context context, String nome, BigDecimal price, BigDecimal cost, boolean iva, String ivaValue, String ivaDescription) {
		// ProductPrice
		ProductPrice productPrice = PriceFactory.eINSTANCE.createProductPrice();
		productPrice.setProductId(context.getFrame(Product.class).createProxy(nome, context.getTenant()));
		productPrice.setFromDate(new Date());
		productPrice.setPrice(price);
		productPrice.setProductPriceTypeId(context.getFrame(ProductPriceType.class).createProxy("DEFAULT_PRICE", context.getTenant()));
		productPrice.setProductPricePurposeId(context.getFrame(ProductPricePurpose.class).createProxy("PURCHASE", context.getTenant()));
		productPrice.setCurrencyUomId(context.getFrame(Uom.class).createProxy("EUR", context.getTenant()));
		productPrice.setProductStoreGroupId(context.getFrame(ProductStoreGroup.class).createProxy("_NA_", context.getTenant()));
		productPrice.setTaxInPrice(iva);
		if (!ivaValue.equals("-1")) {
			productPrice.setTaxAmount(new BigDecimal(ivaValue));
		}
		container.getContents().add(productPrice);

		if (cost.compareTo(BigDecimal.ZERO) > 0) {
			// TODO scrivere un nuovo ProductPrice
		}
	}

}
