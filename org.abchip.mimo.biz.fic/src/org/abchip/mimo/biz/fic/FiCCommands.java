/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.fic;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.eclipse.osgi.framework.console.CommandInterpreter;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FiCCommands extends BaseCommands {

	private static final String urlFiC = "https://api.fattureincloud.it:443/v1/";
	private static final String body = "{\"api_uid\": \"673532\", \"api_key\": \"38319cbc95dddf6ff7d744491bd823e7\", \"pagina\": ?}";

	@Inject
	public FiCCommands(Application application) {
		super(application);
	}

	public <E extends EntityIdentifiable> void _importFicAll(CommandInterpreter interpreter) throws Exception {
		importFicRegistry(interpreter);
		importFicProduct(interpreter);
	}

	public <E extends EntityIdentifiable> void _importFicRegistry(CommandInterpreter interpreter) throws Exception {
		importFicRegistry(interpreter);
	}

	public <E extends EntityIdentifiable> void _importFicProduct(CommandInterpreter interpreter) throws Exception {
		importFicProduct(interpreter);
	}

	private void importFicRegistry(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext(interpreter);
		AtomicInteger partyCounter = new AtomicInteger(9999);
		AtomicInteger contactMechCounter = new AtomicInteger(9999);

		importRegistry(interpreter, context, partyCounter, contactMechCounter, "FiC_Customer", "clienti", "lista_clienti", "CUSTOMER");
		importRegistry(interpreter, context, partyCounter, contactMechCounter, "FiC_Supplier", "fornitori", "lista_fornitori", "SUPPLIER");
	}

	@SuppressWarnings("unchecked")
	private void importRegistry(CommandInterpreter interpreter, Context context, AtomicInteger partyCounter, AtomicInteger contactMechCounter, String containerName, String typeSubject,
			String nameArray, String role) throws UnsupportedEncodingException, ResourceException {
		EntityContainer container = EntityFactory.eINSTANCE.createEntityContainer();
		container.setName(containerName);

		ArrayList<LinkedHashMap<String, Object>> arrayList = null;
		int current_page = 0;
		int number_page = 0;

		// ogni chiamata restituisce al massimo 500 elementi, si può paginare
		for (int i = 0; i < 5; i++) {

			// Semplice impostazione del json di body
			StringEntity params = new StringEntity(body.replace("?", Integer.toString(i + 1)));

			HttpPost postMethod = null;
			HashMap<?, ?> fiCResult = null;
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				URI uri = new URIBuilder().setPath(urlFiC + typeSubject + "/lista").build();
				postMethod = new HttpPost(uri);
				postMethod.setEntity(params);
				try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(postResponse);
					interpreter.println(responseString);
					if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
						// String responseString =
						// "{\"lista_clienti\":[{\"id\":\"33363131\",\"nome\":\"Giuliano
						// Giancristofaro\",\"referente\":\"\",\"indirizzo_via\":\"via rezzara
						// 1\",\"indirizzo_cap\":\"24036\",\"indirizzo_citta\":\"Ponte San
						// Pietro\",\"indirizzo_provincia\":\"BG\",\"indirizzo_extra\":\"\",\"paese\":\"Italia\",\"mail\":\"giuliano.giancristofaro@gmail.com\",\"pec\":\"giuliano.giancristofaro@legalmail.it\",\"tel\":\"001
						// 0123456\",\"fax\":\"123
						// 5684798\",\"piva\":\"02580920169\",\"cf\":\"GNCGLN73P01H501V\",\"termini_pagamento\":\"30\",\"pagamento_fine_mese\":false,\"val_iva_default\":\"22\",\"desc_iva_default\":\"\",\"extra\":\"\",\"PA\":true,\"PA_codice\":\"\"}],\"pagina_corrente\":1,\"numero_pagine\":1,\"success\":true}";
						fiCResult = new ObjectMapper().readValue(responseString, HashMap.class);
						boolean success = (boolean) fiCResult.get("success");
						if (success) {
							arrayList = (ArrayList<LinkedHashMap<String, Object>>) fiCResult.get(nameArray);
							current_page = (int) fiCResult.get("pagina_corrente");
							number_page = (int) fiCResult.get("numero_pagine");
							//
							for (LinkedHashMap<String, Object> record : arrayList) {
								// TODO non viene riportata la tipologia del cliente.
								// TODO Al momento tratto tutti come Party_Group
								String partyId = Integer.toString(partyCounter.incrementAndGet());
								String id = (String) record.get("id");
								String nome = (String) record.get("nome");
								String referente = (String) record.get("referente");

								FiCCommandUtils.createPartyGroup(container, context, partyId, id, nome, referente);
								FiCCommandUtils.createPartyRole(container, context, partyId, role);

								// Indirizzo
								String indirizzo_via = (String) record.get("indirizzo_via");
								String indirizzo_citta = (String) record.get("indirizzo_citta");
								String indirizzo_cap = (String) record.get("indirizzo_cap");
								String indirizzo_provincia = (String) record.get("indirizzo_provincia");
								String indirizzo_paese = (String) record.get("paese");
								if (!(indirizzo_via).isEmpty() || !(indirizzo_citta).isEmpty() || !(indirizzo_cap).isEmpty() || !(indirizzo_provincia).isEmpty()) {
									FiCCommandUtils.createPostaAddress(container, context, partyId, contactMechCounter, nome, indirizzo_via, indirizzo_citta, indirizzo_cap,
											indirizzo_provincia, indirizzo_paese);
								}
								// mail
								if (record.get("mail") != null && !((String) record.get("mail")).isEmpty()) {
									FiCCommandUtils.createContactMechMail(container, context, (String) record.get("mail"), partyId, contactMechCounter, "EMAIL_ADDRESS", "PRIMARY_EMAIL");
								}
								// pec
								if (record.get("pec") != null && !((String) record.get("pec")).isEmpty()) {
									FiCCommandUtils.createContactMechMail(container, context, (String) record.get("mail"), partyId, contactMechCounter, "EMAIL_ADDRESS", "BILLING_EMAIL");
								}

								// tel
								if (record.get("tel") != null && !((String) record.get("tel")).isEmpty()) {
									FiCCommandUtils.createContactMechTelecom(container, context, (String) record.get("tel"), partyId, contactMechCounter, "TELECOM_NUMBER", "PRIMARY_PHONE");
								}
								// fax
								if (record.get("fax") != null && !((String) record.get("fax")).isEmpty()) {
									FiCCommandUtils.createContactMechTelecom(container, context, (String) record.get("tel"), partyId, contactMechCounter, "TELECOM_NUMBER", "FAX_NUMBER");
								}
								// piva
								if (record.get("piva") != null && !((String) record.get("piva")).isEmpty()) {
									FiCCommandUtils.createTaxAuth(container, context, partyId, (String) record.get("piva"));
								}
								// cf
								if (record.get("cf") != null && !((String) record.get("cf")).isEmpty()) {
									FiCCommandUtils.createIdentificationCard(container, context, partyId, (String) record.get("cf"));
								}
								// termini_pagamento
								if (record.get("termini_pagamento") != null && !((String) record.get("termini_pagamento")).isEmpty()) {
								}
								// pagamento_fine_mese
								// if (!((String) record.get("pagamento_fine_mese")).isEmpty()) {}
								// val_iva_default
								if (record.get("val_iva_default") != null && !((String) record.get("val_iva_default")).isEmpty()) {
								}
								// desc_iva_default
								if (record.get("desc_iva_default") != null && !((String) record.get("desc_iva_default")).isEmpty()) {
								}
								// extra
								if (record.get("extra") != null && !((String) record.get("extra")).isEmpty()) {
								}
								// PA
								// if (!((String) record.get("PA")).isEmpty()) {}
								// PA_codice
								if (record.get("PA_codice") != null && !((String) record.get("PA_codice")).isEmpty()) {
								}
							}
						}
					} else {
						interpreter.println("Error");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Leave
			if (number_page == current_page)
				break;
		}
		// Save container
		ResourceWriter<EntityContainer> entityWriter = context.getResourceManager().getResourceWriter(EntityContainer.class);
		entityWriter.create(container, true);
	}

	@SuppressWarnings({ "unchecked" })
	private void importFicProduct(CommandInterpreter interpreter) throws Exception {
		/*
		 * 
		 * { "id": "14806135", "cod": "0001", "nome": "Prodotto 1", "prezzo_netto":
		 * "10.00000", "prezzo_ivato": false, "costo": "0.00000", "valore_iva": "-1",
		 * "desc_iva": "-1", "um": "NR", "categoria": "Prodotto finito", "desc":
		 * "Prodotto numero 1", "note": "", "magazzino": false }
		 */

		Context context = this.getContext(interpreter);

		EntityContainer container = EntityFactory.eINSTANCE.createEntityContainer();
		container.setName("FiC_Product");

		ArrayList<LinkedHashMap<String, Object>> arrayList = null;
		int current_page = 0;
		int number_page = 0;

		// ogni chiamata restituisce al massimo 500 elementi, si può paginare
		for (int i = 0; i < 5; i++) {

			// Semplice impostazione del json di body
			StringEntity params = new StringEntity(body.replace("?", Integer.toString(i + 1)));

			HttpPost postMethod = null;
			HashMap<?, ?> fiCResult = null;
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				URI uri = new URIBuilder().setPath(urlFiC + "prodotti/lista").build();
				postMethod = new HttpPost(uri);
				postMethod.setEntity(params);
				try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(postResponse);
					interpreter.println(responseString);
					if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
						// String responseString =
						// "{\"lista_clienti\":[{\"id\":\"33363131\",\"nome\":\"Giuliano
						// Giancristofaro\",\"referente\":\"\",\"indirizzo_via\":\"via rezzara
						// 1\",\"indirizzo_cap\":\"24036\",\"indirizzo_citta\":\"Ponte San
						// Pietro\",\"indirizzo_provincia\":\"BG\",\"indirizzo_extra\":\"\",\"paese\":\"Italia\",\"mail\":\"giuliano.giancristofaro@gmail.com\",\"pec\":\"giuliano.giancristofaro@legalmail.it\",\"tel\":\"001
						// 0123456\",\"fax\":\"123
						// 5684798\",\"piva\":\"02580920169\",\"cf\":\"GNCGLN73P01H501V\",\"termini_pagamento\":\"30\",\"pagamento_fine_mese\":false,\"val_iva_default\":\"22\",\"desc_iva_default\":\"\",\"extra\":\"\",\"PA\":true,\"PA_codice\":\"\"}],\"pagina_corrente\":1,\"numero_pagine\":1,\"success\":true}";
						fiCResult = new ObjectMapper().readValue(responseString, HashMap.class);
						boolean success = (boolean) fiCResult.get("success");
						if (success) {
							arrayList = (ArrayList<LinkedHashMap<String, Object>>) fiCResult.get("lista_prodotti");
							current_page = Integer.parseInt((String) fiCResult.get("pagina_corrente"));
							number_page = (int) fiCResult.get("numero_pagine");
							//
							for (LinkedHashMap<String, Object> record : arrayList) {

								String id = (String) record.get("id");
								String cod = (String) record.get("cod");
								String nome = (String) record.get("nome");
								String desc = (String) record.get("desc");
								String categoria = (String) record.get("categoria");
								String um = (String) record.get("um");
								FiCCommandUtils.createProduct(container, context, id, cod, nome, desc, categoria, um);

								BigDecimal price = null;
								if ((String) record.get("prezzo_netto") != null) {
									price = new BigDecimal((String) record.get("prezzo_netto"));
								} else if ((String) record.get("prezzo_lordo") != null) {
									price = new BigDecimal((String) record.get("prezzo_lordo"));
								} else {
									price = new BigDecimal(0);
								}

								BigDecimal cost = new BigDecimal((String) record.get("costo"));
								boolean iva = (boolean) record.get("prezzo_ivato");
								String ivaValue = (String) record.get("valore_iva");
								String ivaDescription = (String) record.get("desc_iva");
								FiCCommandUtils.createProductPrice(container, context, nome, price, cost, iva, ivaValue, ivaDescription);
							}
						}
					} else {
						interpreter.println("Error");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Leave
			if (number_page == current_page)
				break;
		}
		// Save container
		ResourceWriter<EntityContainer> entityWriter = context.getResourceManager().getResourceWriter(EntityContainer.class);
		entityWriter.create(container, true);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
