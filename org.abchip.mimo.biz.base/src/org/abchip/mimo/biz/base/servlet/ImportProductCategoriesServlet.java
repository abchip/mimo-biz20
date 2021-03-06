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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.abchip.mimo.biz.model.product.category.CategoryFactory;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.category.ProductCategoryType;
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

public class ImportProductCategoriesServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {

			ResourceWriter<ProductCategory> productCategoryWriter = context.getResourceManager().getResourceWriter(ProductCategory.class);

			for (Part filePart : parseRequest(request).values()) {
				if (!filePart.getName().equals("upload"))
					continue;

				try (POIFSFileSystem fs = new POIFSFileSystem(filePart.getInputStream())) {
					try (HSSFWorkbook wb = new HSSFWorkbook(fs)) {
						HSSFSheet sheet = wb.getSheetAt(0);
						HSSFRow row;
						int rows = sheet.getPhysicalNumberOfRows();

						for (int x = 0; x < rows; x++) {
							if (x == 0)
								continue;
							row = sheet.getRow(x);
							HSSFCell a = row.getCell((short) 0);
							HSSFCell b = row.getCell((short) 1);
							String codeId = a.getStringCellValue();
							String description = b.getStringCellValue();

							ProductCategory productCategory = CategoryFactory.eINSTANCE.createProductCategory();
							productCategory.setProductCategoryId(codeId);
							productCategory.setProductCategoryType(context.createProxy(ProductCategoryType.class, "MATERIALS_CATEGORY"));
							productCategory.setCategoryName(Strings.escapeJava(description));
							productCategoryWriter.create(productCategory, true);
						}
					} catch (ResourceException e) {
						response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
						return;
					}
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