package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.base.service.UomServices;
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
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateProduct implements Callable<Long> {

	Context context;

	public CreateProduct(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {
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
		ResourceManager resourceManager = context.get(ResourceManager.class);
		// Product
		ResourceWriter<Product> productWriter = resourceManager.getResourceWriter(context, Product.class);
		Product product = productWriter.make(true);
		product.setInternalName(product.getID());
		product.setProductName(product.getID() + " sales product");
		product.setDescription("Sales product " + product.getID());
		product.setProductTypeId(context.createProxy(ProductType.class, "DIGITAL_GOOD"));
		product.setTaxable(true);
		productWriter.create(product);

		// ProductPrice
		ResourceWriter<ProductPrice> productPriceWriter = resourceManager.getResourceWriter(context, ProductPrice.class);
		ProductPrice productPrice = productPriceWriter.make();
		productPrice.setProductId(product);
		productPrice.setPrice(new BigDecimal(1));
		productPrice.setTaxInPrice(true);
		productPrice.setFromDate(new Date());
		productPrice.setProductPriceTypeId(context.createProxy(ProductPriceType.class, "DEFAULT_PRICE"));
		productPrice.setProductPricePurposeId(context.createProxy(ProductPricePurpose.class, "PURCHASE"));
		productPrice.setCurrencyUomId(UomServices.getUom(context));
		productPrice.setProductStoreGroupId(context.createProxy(ProductStoreGroup.class, "_NA_"));
		productPriceWriter.create(productPrice);
	}

	private void createPurchaseProduct() throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);
		// Product
		ResourceWriter<Product> productWriter = resourceManager.getResourceWriter(context, Product.class);
		Product product = productWriter.make(true);
		product.setInternalName(product.getID());
		product.setProductName(product.getID() + " purchase product");
		product.setDescription("Purchase product " + product.getID());
		product.setProductTypeId(context.createProxy(ProductType.class, "FINISHED_GOOD"));
		product.setTaxable(true);
		productWriter.create(product);

		ResourceWriter<SupplierProduct> supplierProductWriter = resourceManager.getResourceWriter(context, SupplierProduct.class);
		ResourceWriter<ProductFacility> productFacilityWriter = resourceManager.getResourceWriter(context, ProductFacility.class);
		ResourceReader<Facility> facilityReader = resourceManager.getResourceReader(context, Facility.class);

		// List of supplier
		List<Party> parties = StressTestUtils.getEnabledSupplier(context);
		for (Party party : parties) {
			// SupplierProduct
			SupplierProduct supplierProduct = supplierProductWriter.make();
			supplierProduct.setProductId(product);
			supplierProduct.setPartyId(party);
			supplierProduct.setAvailableFromDate(new Date());
			supplierProduct.setSupplierPrefOrderId(context.createProxy(SupplierPrefOrder.class, "10_MAIN_SUPPL"));
			supplierProduct.setMinimumOrderQuantity(new BigDecimal(1));
			supplierProduct.setLastPrice(new BigDecimal(1));
			supplierProduct.setCurrencyUomId(UomServices.getUom(context));
			supplierProduct.setCanDropShip(false);
			supplierProduct.setSupplierProductId(party.getID() + "-" + product.getID());
			supplierProductWriter.create(supplierProduct);
		}
		// ProductFacility
		try (EntityIterator<Facility> facilities = facilityReader.find()) {
			for (Facility facility : facilities) {
				ProductFacility productFacility = productFacilityWriter.make();
				productFacility.setProductId(product);
				productFacility.setFacilityId(facility);
				productFacility.setMinimumStock(new BigDecimal(1));
				productFacility.setReorderQuantity(new BigDecimal(1));
				productFacility.setDaysToShip(1);
				productFacilityWriter.create(productFacility);
			}
		}
	}
}