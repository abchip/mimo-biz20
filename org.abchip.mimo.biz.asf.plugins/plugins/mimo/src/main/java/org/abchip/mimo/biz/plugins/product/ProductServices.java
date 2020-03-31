/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 */
package org.abchip.mimo.biz.plugins.product;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.ofbiz.base.util.UtilDateTime;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
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

public class ProductServices {


	public static Map<String, Object> createSimpleProduct(DispatchContext ctx, Map<String, ? extends Object> context) {
		String productId = (String) context.get("productId");
		Delegator delegator = ctx.getDelegator();
		
		try {
			GenericValue product = delegator.makeValue("Product");
			product.set("productId", productId);
//			product.set("internalName", productId);
			product.create();
		} catch (GenericEntityException e) {
			return ServiceUtil.returnError(e.getMessage());
		}

		return ServiceUtil.returnSuccess("Product " + productId + " created succesfully" );
	}
	
	public static Map<String, Object> importProduct(DispatchContext ctx, Map<String, ? extends Object> context) {
		LocalDispatcher dispatcher = ctx.getDispatcher();
		@SuppressWarnings("unused")
		Locale locale = (Locale) context.get("locale");
		String pathFileItem = (String) context.get("pathFileItem");
		String pathFilePrice = (String) context.get("pathFilePrice");
		Delegator delegator = ctx.getDelegator();
		if (!importProduct(pathFileItem, delegator, context, dispatcher))
			return ServiceUtil.returnError("Errore in importazione Product");
		if (!importProductPrice(pathFilePrice, delegator, context, dispatcher))
			return ServiceUtil.returnError("Errore in importazione Product price");

		return ServiceUtil.returnSuccess("Importazione Product avvenuta con successo");
	}

	public static Map<String, Object> deleteProduct(DispatchContext ctx, Map<String, ? extends Object> context) {
		String productId = (String) context.get("productId");
		try {
			removeProduct(ctx.getDelegator(), productId);
		} catch (GenericEntityException e) {
			e.printStackTrace();
			try {
				TransactionUtil.rollback();
			} catch (GenericTransactionException e1) {
				e1.printStackTrace();
			}
			return ServiceUtil.returnError(e.getMessage());
		}
		return ServiceUtil.returnSuccess("Cancellazione product " + productId + " avvenuta con successo");
	}

	private static boolean importProduct(String pathFile, Delegator delegator, Map<String, ? extends Object> context, LocalDispatcher dispatcher) {
		File file = new File(pathFile);
		if (!file.exists())
			return false;
		GenericValue userLogin = (GenericValue) context.get("userLogin");

		try (HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(new FileInputStream(file)))) {
			HSSFSheet sheet = wb.getSheetAt(0);

			int rows = sheet.getPhysicalNumberOfRows();

			for (int x = 0; x < rows; x++) {
				if (x == 0)
					continue;
				HSSFRow row = sheet.getRow(x);
				HSSFCell a = row.getCell((short) 0);
				HSSFCell b = row.getCell((short) 1);
				HSSFCell c = row.getCell((short) 5);
				HSSFCell d = row.getCell((short) 6);
				HSSFCell e = row.getCell((short) 15);
				HSSFCell f = row.getCell((short) 17);
				HSSFCell g = row.getCell((short) 18);

				HSSFCell h = row.getCell((short) 9);
				HSSFCell i = row.getCell((short) 10);
				HSSFCell l = row.getCell((short) 11);

				String productId = a.getStringCellValue();

				String description = b.getStringCellValue();

				@SuppressWarnings("unused")
				String um = c.getStringCellValue();
				String barcode = g.getStringCellValue();

				String material = "MAT-" + h.getStringCellValue();
				String program = "PRO-" + i.getStringCellValue();
				String gestion = "GES-" + l.getStringCellValue();

				String weight = "";
				String qtaxc = "";
				@SuppressWarnings("unused")
				String volume = "";

				try {
					weight = d.getStringCellValue();
				} catch (Exception e1) {
					Double num = d.getNumericCellValue();
					weight = Double.toString(num);
				}
				try {
					qtaxc = e.getStringCellValue();
				} catch (Exception e1) {
					Double num = e.getNumericCellValue();
					qtaxc = Integer.toString(num.intValue());
				}
				try {
					volume = f.getStringCellValue();
				} catch (Exception e1) {
					Double num = f.getNumericCellValue();
					volume = Double.toString(num);
				}
				// System.err.println(productId + " " + qtaxc);
				Timestamp now = UtilDateTime.nowTimestamp();
				Map<String, Object> newProductMap = UtilMisc.toMap("createdDate", now, "lastModifiedDate", now);
				if (userLogin != null) {
					newProductMap.put("createdByUserLogin", userLogin.get("userLoginId"));
					newProductMap.put("lastModifiedByUserLogin", userLogin.get("userLoginId"));
				}

				// Delete product
				Map<String, Object> input = UtilMisc.toMap("productId", productId);
				dispatcher.runSync("deleteProduct", input);

				TransactionUtil.begin();
				// Product
				GenericValue product = delegator.makeValue("Product", newProductMap);
				product.set("productId", productId);
				product.set("productTypeId", "FINISHED_GOOD");
				product.set("internalName", productId);
				product.set("productName", description);
				product.set("inventoryItemTypeId", "NON_SERIAL_INV_ITEM");

				if (!material.isEmpty())
					product.set("primaryProductCategoryId", material);

				if (!qtaxc.isEmpty() && !qtaxc.equals("0")) {
					product.set("quantityUomId", "OTH_ea");
					product.set("quantityIncluded", new BigDecimal(qtaxc));
				}
				if (!weight.isEmpty() && !weight.equals("0.0")) {
					product.set("weightUomId", "WT_kg");
					product.set("productWeight", new BigDecimal(weight));
				}
				product.set("isVirtual", "N");
				product.set("isVariant", "N");
				product.create();

				// GoodIdentification
				if (!barcode.isEmpty()) {
					GenericValue goodIdentification = delegator.makeValue("GoodIdentification");
					goodIdentification.set("goodIdentificationTypeId", "EAN");
					goodIdentification.set("productId", productId);
					goodIdentification.set("idValue", barcode);
					goodIdentification.create();
				}

				// Category
				if (!material.isEmpty()) {
					GenericValue productCategoryMember = delegator.makeValue("ProductCategoryMember");
					productCategoryMember.set("productCategoryId", material);
					productCategoryMember.set("productId", productId);
					productCategoryMember.set("fromDate", now);
					productCategoryMember.create();
				}
				if (!gestion.isEmpty()) {
					GenericValue productCategoryMember = delegator.makeValue("ProductCategoryMember");
					productCategoryMember.set("productCategoryId", gestion);
					productCategoryMember.set("productId", productId);
					productCategoryMember.set("fromDate", now);
					productCategoryMember.create();
				}
				if (!program.isEmpty()) {
					GenericValue productCategoryMember = delegator.makeValue("ProductCategoryMember");
					productCategoryMember.set("productCategoryId", program);
					productCategoryMember.set("productId", productId);
					productCategoryMember.set("fromDate", now);
					productCategoryMember.create();
				}
				TransactionUtil.commit();
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			try {
				TransactionUtil.rollback();
			} catch (GenericTransactionException e1) {
				e1.printStackTrace();
			}
			return false;
		}

		return true;
	}

	private static boolean importProductPrice(String pathFile, Delegator delegator, Map<String, ? extends Object> context, LocalDispatcher dispatcher) {
		File file = new File(pathFile);
		if (!file.exists())
			return false;

		String productIdP = "";

		try (POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(file))) {
			try (HSSFWorkbook wb = new HSSFWorkbook(fs)) {
				HSSFSheet sheet = wb.getSheetAt(0);

				int rows = sheet.getPhysicalNumberOfRows();

				for (int x = 0; x < rows; x++) {
					if (x == 0)
						continue;
					HSSFRow row = sheet.getRow(x);
					HSSFCell a = row.getCell((short) 6);
					HSSFCell b = row.getCell((short) 13);
					String productId = a.getStringCellValue();
					String price = "";

					if (productId.equals(productIdP))
						continue;
					productIdP = productId;

					try {
						price = b.getStringCellValue();
					} catch (Exception e1) {
						Double num = b.getNumericCellValue();
						price = Double.toString(num);
					}
					TransactionUtil.begin();
					// ProductPrice Default price
					Map<String, Object> input = UtilMisc.toMap("productId", productId);
					input.put("productPriceTypeId", "DEFAULT_PRICE");
					input.put("productPricePurposeId", "PURCHASE");
					input.put("currencyUomId", "EUR");
					input.put("productStoreGroupId", "_NA_");
					// input.put("fromDate", now);
					input.put("price", new BigDecimal(price));
					input.put("taxPercentage", new BigDecimal("22"));
					input.put("taxInPrice", "Y");
					input.put("userLogin", context.get("userLogin"));

					dispatcher.runSync("createProductPrice", input);

					// ProductPrice List price
					input = UtilMisc.toMap("productId", productId);
					input.put("productPriceTypeId", "LIST_PRICE");
					input.put("productPricePurposeId", "PURCHASE");
					input.put("currencyUomId", "EUR");
					input.put("productStoreGroupId", "_NA_");
					// input.put("fromDate", now);
					input.put("price", new BigDecimal(price));
					input.put("taxPercentage", new BigDecimal("22"));
					input.put("taxInPrice", "Y");
					input.put("userLogin", context.get("userLogin"));

					dispatcher.runSync("createProductPrice", input);
					TransactionUtil.commit();

				}
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			try {
				TransactionUtil.rollback();
			} catch (GenericTransactionException e1) {
				e1.printStackTrace();
			}
			return false;
		}
		return true;
	}

	private static void removeProduct(Delegator delegator, String productId) throws GenericEntityException {
		GenericValue product = EntityQuery.use(delegator).from("Product").where("productId", productId).queryOne();
		if (product == null)
			return;
		// ProductKeyword
		removeValues(delegator, EntityQuery.use(delegator).from("ProductKeyword").where("productId", productId).queryList());
		// ProductPrice
		removeValues(delegator, EntityQuery.use(delegator).from("ProductPrice").where("productId", productId).queryList());
		removeValues(delegator, EntityQuery.use(delegator).from("ProductPriceChange").where("productId", productId).queryList());
		// GoodIdentification
		removeValues(delegator, EntityQuery.use(delegator).from("GoodIdentification").where("productId", productId).queryList());
		// InventoryItemStatus
		removeValues(delegator, EntityQuery.use(delegator).from("InventoryItemStatus").where("productId", productId).queryList());
		// InventoryItem
		removeValues(delegator, EntityQuery.use(delegator).from("InventoryItem").where("productId", productId).queryList());
		// ProductFacility
		removeValues(delegator, EntityQuery.use(delegator).from("ProductFacility").where("productId", productId).queryList());
		// PrimaryProductCategory
		// removeValues(delegator,
		// EntityQuery.use(delegator).from("PrimaryProductCategory").where("productId",
		// productId).queryList());
		// ProductCategoryMember
		removeValues(delegator, EntityQuery.use(delegator).from("ProductCategoryMember").where("productId", productId).queryList());
		// ProductCalculatedInfo
		removeValues(delegator, EntityQuery.use(delegator).from("ProductCalculatedInfo").where("productId", productId).queryList());

		delegator.removeValue(product);
	}

	private static void removeValues(Delegator delegator, List<GenericValue> recordList) throws GenericEntityException {
		Iterator<GenericValue> valueList = recordList.iterator();
		while (valueList.hasNext()) {
			GenericValue value = valueList.next();
			delegator.removeValue(value);
		}
	}
}