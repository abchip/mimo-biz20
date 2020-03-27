/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 */
package org.abchip.mimo.biz.plugins.party;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.ofbiz.base.util.UtilDateTime;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.apache.ofbiz.entity.condition.EntityExpr;
import org.apache.ofbiz.entity.condition.EntityOperator;
import org.apache.ofbiz.entity.transaction.GenericTransactionException;
import org.apache.ofbiz.entity.transaction.TransactionUtil;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class PartyServices {

	static List<String> stringEscape = Arrays.asList("(CONTRATTO DI RETE CON SOGGETTIVITA' GIURIDICA)",
			"- CONTRATTO DI RETE DI CUI AL D.L. 10/02/2009 N. 5 CONVERTITO DALLA LEGGE 33/2009 E SUCC. MODD.",
			"E APPLICAZIONE DI TECNOLOGIE AVANZATE PER MATERIALI PER MOTORI, ABBREVIATO RETE RITAM",
			" - RETE DI    IMPRESE IN BREVE EDILNET NETWORK DELL'EDILIZIA ETICA E                          SOSTENIBILE",
			" E DI APPLICAZIONI TECNOLOGICHE INNOVATIVE PER L'AUTOMAZIONE DEI PROCESSI COLTURALI E LA GESTIONE               DELLE INFORMAZIONI PER L'AGRICOLTURA DI PRECISIONE                              IN BREVE RTK 2.0",
			" E DI MONITORAGGIO FITOPATOLOGICO A SUPPORTO DELLE IMPRESE                     AGRICOLE IN BREVE SMARTMETEO",
			" RETE D'IMPRESE                 IN SIGLA PRIMITIVO WI.N.E. RETE DIMPRESE");

	public static Map<String, Object> importPartyClassification(DispatchContext ctx, Map<String, ? extends Object> context) {

		@SuppressWarnings("unused")
		Locale locale = (Locale) context.get("locale");
		String pathFile = (String) context.get("pathFile");
		Delegator delegator = ctx.getDelegator();
		if (!removeClassification(delegator))
			return ServiceUtil.returnError("Errore in rimozione classificazione");
		if (!importClassification(pathFile, delegator))
			return ServiceUtil.returnError("Errore in importazione classificazione");

		return ServiceUtil.returnSuccess("Importazione Party Classification avvenuta con successo");
	}

	public static Map<String, Object> importPartyGroup(DispatchContext ctx, Map<String, ? extends Object> context) {
		LocalDispatcher dispatcher = ctx.getDispatcher();
		@SuppressWarnings("unused")
		Locale locale = (Locale) context.get("locale");
		String pathFile = (String) context.get("pathFile");
		Delegator delegator = ctx.getDelegator();
		if (!removePartyGroups(delegator, dispatcher))
			return ServiceUtil.returnError("Errore in rimozione party group");
		if (!importPartyGroup(pathFile, delegator, context))
			return ServiceUtil.returnError("Errore in importazione party group");

		return ServiceUtil.returnSuccess("Importazione Party Group avvenuta con successo");
	}

	public static Map<String, Object> importParty(DispatchContext ctx, Map<String, ? extends Object> context) {
		LocalDispatcher dispatcher = ctx.getDispatcher();
		@SuppressWarnings("unused")
		Locale locale = (Locale) context.get("locale");
		String roleTypeId = (String) context.get("roleTypeId");
		String pathFile = (String) context.get("pathFile");
		Delegator delegator = ctx.getDelegator();
		if (!removeParty(delegator, dispatcher))
			return ServiceUtil.returnError("Errore in rimozione party");
		if (!importParty(roleTypeId, pathFile, delegator, context))
			return ServiceUtil.returnError("Errore in importazione party");

		return ServiceUtil.returnSuccess("Importazione party avvenuta con successo");
	}

	public static Map<String, Object> deletePartyGroup(DispatchContext ctx, Map<String, ? extends Object> context) {
		String partyId = (String) context.get("partyId");
		try {
			TransactionUtil.begin();
			removePartyGroups(ctx.getDelegator(), partyId);
			TransactionUtil.commit();
		} catch (GenericEntityException e) {
			e.printStackTrace();
			try {
				TransactionUtil.rollback();
			} catch (GenericTransactionException e1) {
				e1.printStackTrace();
			}
			return ServiceUtil.returnError(e.getMessage());
		}
		return ServiceUtil.returnSuccess("Cancellazione party " + partyId + " avvenuta con successo");
	}

	public static Map<String, Object> deleteParty(DispatchContext ctx, Map<String, ? extends Object> context) {
		String partyId = (String) context.get("partyId");
		try {
			TransactionUtil.begin();
			removeParty(ctx.getDelegator(), partyId);
			TransactionUtil.commit();
		} catch (GenericEntityException e) {
			e.printStackTrace();
			try {
				TransactionUtil.rollback();
			} catch (GenericTransactionException e1) {
				e1.printStackTrace();
			}
			return ServiceUtil.returnError(e.getMessage());
		}
		return ServiceUtil.returnSuccess("Cancellazione party " + partyId + " avvenuta con successo");
	}

	private static boolean importPartyGroup(String pathFile, Delegator delegator, Map<String, ? extends Object> context) {
		File file = new File(pathFile);
		if (!file.exists())
			return false;

		String nameP = "";
		GenericValue userLogin = (GenericValue) context.get("userLogin");

		try (HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(new FileInputStream(file)))) {
			HSSFSheet sheet = wb.getSheetAt(2);

			int rows = sheet.getPhysicalNumberOfRows();

			for (int x = 0; x < rows; x++) {
				if (x == 0)
					continue;

				HSSFRow row = sheet.getRow(x);
				HSSFCell a = row.getCell((short) 1);
				HSSFCell b = row.getCell((short) 3);
				HSSFCell c = row.getCell((short) 5);
				String name = a.getStringCellValue();
				String piva = "";
				String city = c.getStringCellValue();

				try {
					piva = b.getStringCellValue();
				} catch (Exception e) {
					Double num = b.getNumericCellValue();
					piva = Integer.toString(num.intValue());
				}

				if (name.equals(nameP))
					continue;
				nameP = name;
				name = trimName(name);

				Timestamp now = UtilDateTime.nowTimestamp();
				String partyId = delegator.getNextSeqId("Party");
				String partyTypeId = "PARTY_GROUP";

				Map<String, Object> newPartyMap = UtilMisc.toMap("partyId", partyId, "partyTypeId", partyTypeId, "createdDate", now, "lastModifiedDate", now);
				if (userLogin != null) {
					newPartyMap.put("createdByUserLogin", userLogin.get("userLoginId"));
					newPartyMap.put("lastModifiedByUserLogin", userLogin.get("userLoginId"));
				}

				// Party
				// String statusId = (String) context.get("statusId");
				GenericValue party = delegator.makeValue("Party", newPartyMap);
				party.set("preferredCurrencyUomId", "EUR");
				party.setNonPKFields(context);
				party.set("statusId", "PARTY_ENABLED");
				party.create();

				// PartyGroup
				GenericValue partyGroup = delegator.makeValue("PartyGroup");
				partyGroup.set("partyId", partyId);
				partyGroup.set("groupName", name);
				partyGroup.create();

				// PartyTaxAuthInfo
				GenericValue partyTaxInfo = delegator.makeValue("PartyTaxAuthInfo");
				partyTaxInfo.set("partyId", partyId);
				partyTaxInfo.set("fromDate", now);
				partyTaxInfo.set("taxAuthGeoId", "ITA");
				partyTaxInfo.set("taxAuthPartyId", "ITA_ADE");
				partyTaxInfo.set("partyTaxId", "IT-" + piva);
				partyTaxInfo.set("isExempt", "Y");
				partyTaxInfo.set("isNexus", "Y");
				partyTaxInfo.create();

				// ContactMech
				String contactMechId = delegator.getNextSeqId("ContactMech");
				GenericValue contactMech = delegator.makeValue("ContactMech");
				contactMech.set("contactMechId", contactMechId);
				contactMech.set("contactMechTypeId", "POSTAL_ADDRESS");
				contactMech.create();

				// PartyContactMech
				GenericValue partyContactMech = delegator.makeValue("PartyContactMech");
				partyContactMech.set("partyId", partyId);
				partyContactMech.set("contactMechId", contactMechId);
				partyContactMech.set("fromDate", now);
				partyContactMech.create();

				// PostalAddress
				GenericValue postalAddress = delegator.makeValue("PostalAddress");
				postalAddress.set("contactMechId", contactMechId);
				postalAddress.set("address1", ".");
				postalAddress.set("postalCode", "0");
				postalAddress.set("countryGeoId", "ITA");
				postalAddress.set("stateProvinceGeoId", "IT-AG");
				postalAddress.set("city", city);
				postalAddress.create();
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			return false;
		}

		return true;
	}

	private static boolean importParty(String roleTypeId, String pathFile, Delegator delegator, Map<String, ? extends Object> context) {
		File file = new File(pathFile);
		if (!file.exists())
			return false;
		GenericValue userLogin = (GenericValue) context.get("userLogin");

		try (HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(new FileInputStream(file)))) {

			HSSFSheet sheet = wb.getSheetAt(2);
			int rows = sheet.getPhysicalNumberOfRows();

			for (int x = 0; x < rows; x++) {
				if (x == 0)
					continue;
				HSSFRow row = sheet.getRow(x);
				HSSFCell a = row.getCell((short) 14);
				HSSFCell b = row.getCell((short) 13);
				HSSFCell c = row.getCell((short) 15);
				String name = a.getStringCellValue();
				String piva = "";
				String city = c.getStringCellValue();

				try {
					piva = b.getStringCellValue();
				} catch (Exception e) {
					Double num = b.getNumericCellValue();
					piva = Integer.toString(num.intValue());
				}

				name = trimName(name);

				Timestamp now = UtilDateTime.nowTimestamp();
				String partyId = delegator.getNextSeqId("Party");
				String partyTypeId = "PERSON";

				Map<String, Object> newPartyMap = UtilMisc.toMap("partyId", partyId, "partyTypeId", partyTypeId, "createdDate", now, "lastModifiedDate", now);
				if (userLogin != null) {
					newPartyMap.put("createdByUserLogin", userLogin.get("userLoginId"));
					newPartyMap.put("lastModifiedByUserLogin", userLogin.get("userLoginId"));
				}

				// Party
				// String statusId = (String) context.get("statusId");
				GenericValue party = delegator.makeValue("Party", newPartyMap);
				party.set("preferredCurrencyUomId", "EUR");
				party.setNonPKFields(context);
				party.set("statusId", "PARTY_ENABLED");
				party.create();

				// Person
				GenericValue person = delegator.makeValue("Person");
				person.set("partyId", partyId);
				person.set("firstName", name);
				person.create();

				// PartyRole
				GenericValue partyRole = delegator.makeValue("PartyRole");
				partyRole.set("partyId", partyId);
				partyRole.set("roleTypeId", roleTypeId);
				partyRole.create();

				// PartyTaxAuthInfo
				GenericValue partyTaxInfo = delegator.makeValue("PartyTaxAuthInfo");
				partyTaxInfo.set("partyId", partyId);
				partyTaxInfo.set("fromDate", now);
				partyTaxInfo.set("taxAuthGeoId", "ITA");
				partyTaxInfo.set("taxAuthPartyId", "ITA_ADE");
				partyTaxInfo.set("partyTaxId", "IT-" + piva);
				partyTaxInfo.set("isExempt", "Y");
				partyTaxInfo.set("isNexus", "Y");
				partyTaxInfo.create();

				// ContactMech
				String contactMechId = delegator.getNextSeqId("ContactMech");
				GenericValue contactMech = delegator.makeValue("ContactMech");
				contactMech.set("contactMechId", contactMechId);
				contactMech.set("contactMechTypeId", "POSTAL_ADDRESS");
				contactMech.create();

				// PartyContactMech
				GenericValue partyContactMech = delegator.makeValue("PartyContactMech");
				partyContactMech.set("partyId", partyId);
				partyContactMech.set("contactMechId", contactMechId);
				partyContactMech.set("fromDate", now);
				partyContactMech.create();

				// PartyContactMechPurpose
				GenericValue partyContactMechPurpose = delegator.makeValue("PartyContactMechPurpose");
				partyContactMechPurpose.set("partyId", partyId);
				partyContactMechPurpose.set("contactMechId", contactMechId);
				partyContactMechPurpose.set("contactMechPurposeTypeId", "SHIPPING_LOCATION");
				partyContactMechPurpose.set("fromDate", now);
				partyContactMechPurpose.create();

				// PostalAddress
				GenericValue postalAddress = delegator.makeValue("PostalAddress");
				postalAddress.set("contactMechId", contactMechId);
				postalAddress.set("address1", ".");
				postalAddress.set("postalCode", "0");
				postalAddress.set("countryGeoId", "ITA");
				postalAddress.set("stateProvinceGeoId", "IT-AG");
				postalAddress.set("city", city);
				postalAddress.create();
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			return false;
		}
		return true;
	}

	private static boolean importClassification(String pathFile, Delegator delegator) {

		File file = new File(pathFile);
		if (!file.exists())
			return false;

		try (HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(new FileInputStream(file)))) {
			HSSFSheet sheet = wb.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();

			for (int x = 0; x < rows; x++) {
				if (x == 0)
					continue;
				HSSFRow row = sheet.getRow(x);
				HSSFCell a = row.getCell((short) 1);
				HSSFCell b = row.getCell((short) 2);
				String description = a.getStringCellValue();
				String id = "";

				try {
					id = b.getStringCellValue();
				} catch (Exception e) {
					Double num = b.getNumericCellValue();
					id = Integer.toString(num.intValue());
				}

				if (description.isEmpty())
					continue;

				GenericValue classification = delegator.makeValue("PartyClassificationGroup");
				classification.set("partyClassificationGroupId", id);
				classification.set("partyClassificationTypeId", "ORGANIZATION_CLASSIF");
				classification.set("parentGroupId", null);
				classification.set("description", description);

				// classification.getDelegator().create(classification);
				classification.create();
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			return false;
		}

		return true;
	}

	private static boolean removePartyGroups(Delegator delegator, LocalDispatcher dispatcher) {
		try {
			List<EntityExpr> exprs = UtilMisc.toList(EntityCondition.makeCondition("partyTypeId", EntityOperator.EQUALS, "PARTY_GROUP"),
					EntityCondition.makeCondition("partyId", EntityOperator.GREATER_THAN_EQUAL_TO, "10000"),
					EntityCondition.makeCondition("partyId", EntityOperator.LESS_THAN_EQUAL_TO, "99999"));
			EntityCondition andCondition = EntityCondition.makeCondition(exprs, EntityOperator.AND);
			List<GenericValue> list = delegator.findList("Party", andCondition, null, null, null, false);
			Iterator<GenericValue> valueList = list.iterator();
			int i = 0;
			int ii = 0;
			int nn = list.size();
			while (valueList.hasNext()) {
				GenericValue value = valueList.next();
				Map<String, Object> input = UtilMisc.toMap("partyId", value.get("partyId"));
				Map<String, Object> result = dispatcher.runSync("deletePartyGroup", input);
				if (ServiceUtil.isError(result)) {
					// return ServiceUtil.returnError(ServiceUtil.getErrorMessage(result));
					return false;
				}
				i++;
				ii++;
				if (i == 100) {
					TransactionUtil.commit();
					System.out.println("Deleted " + ii + " party group from " + nn);
					i = 0;
				}
			}
			System.out.println("Deleted " + ii + " party group from " + nn);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private static boolean removeParty(Delegator delegator, LocalDispatcher dispatcher) {
		try {
			List<EntityExpr> exprs = UtilMisc.toList(EntityCondition.makeCondition("partyTypeId", EntityOperator.EQUALS, "PERSON"),
					EntityCondition.makeCondition("partyId", EntityOperator.GREATER_THAN_EQUAL_TO, "10000"),
					EntityCondition.makeCondition("partyId", EntityOperator.LESS_THAN_EQUAL_TO, "99999"));
			EntityCondition andCondition = EntityCondition.makeCondition(exprs, EntityOperator.AND);
			List<GenericValue> list = delegator.findList("Party", andCondition, null, null, null, false);
			Iterator<GenericValue> valueList = list.iterator();
			int i = 0;
			int ii = 0;
			int nn = list.size();
			while (valueList.hasNext()) {
				GenericValue value = valueList.next();
				Map<String, Object> input = UtilMisc.toMap("partyId", value.get("partyId"));
				Map<String, Object> result = dispatcher.runSync("deleteParty", input);
				if (ServiceUtil.isError(result)) {
					// return ServiceUtil.returnError(ServiceUtil.getErrorMessage(result));
					return false;
				}

				i++;
				ii++;
				if (i == 100) {
					TransactionUtil.commit();
					System.out.println("Deleted " + ii + " party from " + nn);
					i = 0;
				}
			}
			System.out.println("Deleted " + ii + " party from " + nn);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static boolean removeClassification(Delegator delegator) {
		List<GenericValue> list = null;
		try {
			list = EntityQuery.use(delegator).from("PartyClassificationGroup").queryList();
			Iterator<GenericValue> valueList = list.iterator();
			while (valueList.hasNext()) {
				GenericValue value = valueList.next();
				delegator.removeValue(value);
			}
		} catch (GenericEntityException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static String trimName(String name) {
		String newString = "";

		for (int i = 0; i < stringEscape.size(); i++) {
			String id = stringEscape.get(i);
			if (name.contains(id)) {
				newString = name.replace(id, "");
				break;
			}
		}
		if (newString.isEmpty())
			newString = name;

		return newString.trim();
	}

	private static void removePartyGroups(Delegator delegator, String partyId) throws GenericEntityException {
		GenericValue party = EntityQuery.use(delegator).from("Party").where("partyId", partyId).queryOne();
		// PartyGroup
		removeValues(delegator, EntityQuery.use(delegator).from("PartyGroup").where("partyId", partyId).queryList());
		// parti comuni
		removePartyCommon(delegator, partyId);
		// Party
		delegator.removeValue(party);
	}

	private static void removeParty(Delegator delegator, String partyId) throws GenericEntityException {
		GenericValue party = EntityQuery.use(delegator).from("Party").where("partyId", partyId).queryOne();
		// Person
		removeValues(delegator, EntityQuery.use(delegator).from("Person").where("partyId", partyId).queryList());
		// parti comuni
		removePartyCommon(delegator, partyId);
		// Party
		delegator.removeValue(party);
	}

	private static void removePartyCommon(Delegator delegator, Object object) throws GenericEntityException {
		// CommunicationEventRole
		removeValues(delegator, EntityQuery.use(delegator).from("CommunicationEventRole").where("partyId", object).queryList());
		// CommunicationEvent
		List<GenericValue> communicationEventlist = EntityQuery.use(delegator).from("CommunicationEvent").where("partyIdTo", object).queryList();
		Iterator<GenericValue> valueList = communicationEventlist.iterator();
		while (valueList.hasNext()) {
			GenericValue value = valueList.next();
			removeValues(delegator, EntityQuery.use(delegator).from("CommunicationEventRole").where("communicationEventId", value.get("communicationEventId")).queryList());
			removeValues(delegator, EntityQuery.use(delegator).from("CommunicationEvent").where("communicationEventId", value.get("communicationEventId")).queryList());
		}
		// PartyContactMechPurpose
		removeValues(delegator, EntityQuery.use(delegator).from("PartyContactMechPurpose").where("partyId", object).queryList());
		// PartyContactMech
		List<GenericValue> partyContactMechlist = EntityQuery.use(delegator).from("PartyContactMech").where("partyId", object).queryList();
		removeValues(delegator, EntityQuery.use(delegator).from("PartyContactMech").where("partyId", object).queryList());
		valueList = partyContactMechlist.iterator();
		while (valueList.hasNext()) {
			GenericValue value = valueList.next();
			removeValues(delegator, EntityQuery.use(delegator).from("PostalAddress").where("contactMechId", value.get("contactMechId")).queryList());
			removeValues(delegator, EntityQuery.use(delegator).from("ContactMech").where("contactMechId", value.get("contactMechId")).queryList());
		}
		// PartyDataSource
		removeValues(delegator, EntityQuery.use(delegator).from("PartyDataSource").where("partyId", object).queryList());

		// Visitor
		List<GenericValue> visitorList = EntityQuery.use(delegator).from("Visitor").where("partyId", object).queryList();
		valueList = visitorList.iterator();
		while (valueList.hasNext()) {
			GenericValue value = valueList.next();
			removeValues(delegator, EntityQuery.use(delegator).from("Visit").where("visitorId", value.get("visitorId")).queryList());
		}
		removeValues(delegator, EntityQuery.use(delegator).from("Visitor").where("partyId", object).queryList());

		// UserLogin
		List<GenericValue> userLoginList = EntityQuery.use(delegator).from("UserLogin").where("partyId", object).queryList();
		valueList = userLoginList.iterator();
		while (valueList.hasNext()) {
			GenericValue value = valueList.next();
			removeValues(delegator, EntityQuery.use(delegator).from("JobSandbox").where("authUserLoginId", value.get("userLoginId")).queryList());
			removeValues(delegator, EntityQuery.use(delegator).from("UserLoginHistory").where("userLoginId", value.get("userLoginId")).queryList());
			removeValues(delegator, EntityQuery.use(delegator).from("UserLoginHistory").where("originUserLoginId", value.get("userLoginId")).queryList());
			removeValues(delegator, EntityQuery.use(delegator).from("UserLogin").where("userLoginId", value.get("userLoginId")).queryList());
		}
		removeValues(delegator, EntityQuery.use(delegator).from("UserLogin").where("partyId", object).queryList());
		// ProductStoreRole
		removeValues(delegator, EntityQuery.use(delegator).from("ProductStoreRole").where("partyId", object).queryList());
		// PartyAttribute
		removeValues(delegator, EntityQuery.use(delegator).from("PartyAttribute").where("partyId", object).queryList());
		// PartyRole
		removeValues(delegator, EntityQuery.use(delegator).from("PartyRole").where("partyId", object).queryList());
		// PartyStatus
		removeValues(delegator, EntityQuery.use(delegator).from("PartyStatus").where("partyId", object).queryList());
		// PartyTaxAuthInfo
		removeValues(delegator, EntityQuery.use(delegator).from("PartyTaxAuthInfo").where("partyId", object).queryList());
		// PartyNote
		removeValues(delegator, EntityQuery.use(delegator).from("PartyNote").where("partyId", object).queryList());
	}

	private static void removeValues(Delegator delegator, List<GenericValue> recordList) throws GenericEntityException {
		Iterator<GenericValue> valueList = recordList.iterator();
		while (valueList.hasNext()) {
			GenericValue value = valueList.next();
			delegator.removeValue(value);
		}
	}
}