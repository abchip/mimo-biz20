/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.model.accounting.tax.TaxFactory;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.PartyFactory;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.util.Strings;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ImportPeopleServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {

			ResourceWriter<Person> personWriter = context.getResourceManager().getResourceWriter(Person.class);
			ResourceWriter<PartyRole> partyRoleWriter = context.getResourceManager().getResourceWriter(PartyRole.class);
			ResourceWriter<PartyTaxAuthInfo> partyTaxAuthInfoWriter = context.getResourceManager().getResourceWriter(PartyTaxAuthInfo.class);

			for (Part filePart : parseRequest(request).values()) {
				if (!filePart.getName().equals("upload"))
					continue;

				try (HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(filePart.getInputStream()))) {
					HSSFSheet sheet = wb.getSheetAt(0);
					int rows = sheet.getPhysicalNumberOfRows();
					for (int x = 0; x < rows; x++) {
						if (x == 0)
							continue;

						HSSFRow row = sheet.getRow(x);
						HSSFCell a = row.getCell((short) 0);
						HSSFCell b = row.getCell((short) 1);
						// HSSFCell c = row.getCell((short)2);
						HSSFCell d = row.getCell((short) 3);

						String id = a.getStringCellValue();
						String name = b.getStringCellValue();
						// String city = c.getStringCellValue();
						String piva = d.getStringCellValue();

						// String piva = "";
						// String city = c.getStringCellValue();

						Person person = PartyFactory.eINSTANCE.createPerson();
						// Party
						person.setPreferredCurrencyUom(context.createProxy(Uom.class, "EUR"));
						person.setStatus(context.createProxy(StatusItem.class, "PARTY_ENABLED"));
						person.setPartyType(context.createProxy(PartyType.class, "PERSON"));
						// Person
						person.setPartyId(id);
						person.setFirstName(Strings.escapeJava(name));

						personWriter.create(person);

						// Party Role
						PartyRole partyRole = PartyFactory.eINSTANCE.createPartyRole();
						partyRole.setParty(person);
						partyRole.setRoleType(context.createProxy(RoleType.class, "CUSTOMER"));
						partyRoleWriter.create(partyRole, true);

						// PartyTaxAuthInfo
						PartyTaxAuthInfo partyTaxAuthInfo = TaxFactory.eINSTANCE.createPartyTaxAuthInfo();
						partyTaxAuthInfo.setParty(person);
						partyTaxAuthInfo.setFromDate(new Date());
						partyTaxAuthInfo.setTaxAuthGeoId("ITA");
						partyTaxAuthInfo.setTaxAuthPartyId("ITA_ADE");
						partyTaxAuthInfo.setPartyTaxId("IT-" + piva);
						partyTaxAuthInfo.setIsExempt(true);
						partyTaxAuthInfo.setIsNexus(true);
						partyTaxAuthInfoWriter.create(partyTaxAuthInfo, true);
					}
				} catch (ResourceException e) {
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
					return;
				}
			}
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().print("{ \"status\": \"server\", \"info\":\"" + "" + "\", \"warning\":\"" + "" + "\" }");

		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().print("{ \"status\": \"error\", \"info\":\"" + "" + "\", \"warning\":\"" + "" + "\", \"error\":\"" + e.getMessage() + "\" }");
		}
	}
}