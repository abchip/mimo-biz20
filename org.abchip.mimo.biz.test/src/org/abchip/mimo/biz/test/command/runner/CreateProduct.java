/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.facility.ProductFacility;
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.model.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.model.product.price.ProductPriceType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.product.ProductType;
import org.abchip.mimo.biz.model.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder;
import org.abchip.mimo.biz.model.product.supplier.SupplierProduct;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceManager;

public class CreateProduct implements Callable<Long> {

	Context context;
	GetCommonDefaultResponse commonDefault;

	public CreateProduct(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		long time1 = System.currentTimeMillis();
		createProduct();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createProduct() throws ResourceException {
		createSalesProduct();
		createPurchaseProduct();
	}

	private void createSalesProduct() throws ResourceException {

		// Product
		ResourceWriter<Product> productWriter = context.getResourceManager().getResourceWriter(Product.class);
		Product product = productWriter.make();
		String name = StressTestUtils.generateRandomString(20, false);
		product.setInternalName(name);
		product.setProductName(name + " sales product");
		product.setDescription("Sales product");
		product.setProductType(context.createProxy(ProductType.class, "DIGITAL_GOOD"));
		product.setTaxable(true);
		product.setReturnable(true);
		productWriter.create(product);

		// ProductPrice
		ResourceWriter<ProductPrice> productPriceWriter = context.getResourceManager().getResourceWriter(ProductPrice.class);
		ProductPrice productPrice = productPriceWriter.make();
		productPrice.setProduct(product);
		productPrice.setPrice(new BigDecimal(1));
		productPrice.setTaxInPrice(true);
		productPrice.setFromDate(new Date());
		productPrice.setProductPriceType(context.createProxy(ProductPriceType.class, "DEFAULT_PRICE"));
		productPrice.setProductPricePurpose(context.createProxy(ProductPricePurpose.class, "PURCHASE"));
		productPrice.setCurrencyUom(commonDefault.getCurrencyUom());
		productPrice.setProductStoreGroup(context.createProxy(ProductStoreGroup.class, "_NA_"));
		productPriceWriter.create(productPrice);
	}

	private void createPurchaseProduct() throws ResourceException {

		// Product
		ResourceWriter<Product> productWriter = context.getResourceManager().getResourceWriter(Product.class);
		Product product = productWriter.make();
		String name = StressTestUtils.generateRandomString(20, false);
		product.setInternalName(name);
		product.setProductName(name + " purchase product");
		product.setDescription("Purchase product");
		product.setProductType(context.createProxy(ProductType.class, "FINISHED_GOOD"));
		product.setTaxable(true);
		product.setReturnable(true);
		productWriter.create(product);

		ResourceWriter<SupplierProduct> supplierProductWriter = context.getResourceManager().getResourceWriter(SupplierProduct.class);
		ResourceWriter<ProductFacility> productFacilityWriter = context.getResourceManager().getResourceWriter(ProductFacility.class);
		ResourceReader<Facility> facilityReader = context.getResourceManager().getResourceReader(Facility.class);

		// List of supplier
		List<Party> parties = StressTestUtils.getEnabledSupplier(context);
		for (Party party : parties) {
			// SupplierProduct
			SupplierProduct supplierProduct = supplierProductWriter.make();
			supplierProduct.setProduct(product);
			supplierProduct.setParty(party);
			supplierProduct.setAvailableFromDate(new Date());
			supplierProduct.setSupplierPrefOrder(context.createProxy(SupplierPrefOrder.class, "10_MAIN_SUPPL"));
			supplierProduct.setMinimumOrderQuantity(new BigDecimal(1));
			supplierProduct.setLastPrice(new BigDecimal(1));
			supplierProduct.setCurrencyUom(commonDefault.getCurrencyUom());
			supplierProduct.setCanDropShip(false);
			supplierProduct.setSupplierProductId(party.getID() + "-" + product.getID());
			supplierProductWriter.create(supplierProduct);
		}
		// ProductFacility
		try (EntityIterator<Facility> facilities = facilityReader.find()) {
			for (Facility facility : facilities) {
				ProductFacility productFacility = productFacilityWriter.make();
				productFacility.setProduct(product);
				productFacility.setFacility(facility);
				productFacility.setMinimumStock(new BigDecimal(1));
				productFacility.setReorderQuantity(new BigDecimal(1));
				productFacility.setDaysToShip(1);
				productFacilityWriter.create(productFacility);
			}
		}
	}
}