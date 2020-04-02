package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.product.price.ProductPriceType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductType;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
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

	private void createProduct() {
		ResourceManager resourceManager = context.get(ResourceManager.class);
		// Product
		ResourceWriter<Product> productWriter = resourceManager.getResourceWriter(context, Product.class);
		Product product = productWriter.make(true);
		product.setInternalName(product.getID());
		product.setProductName(product.getID() + " description");
		product.setDescription("Description product " + product.getID());
		product.setProductTypeId(resourceManager.getFrame(context, ProductType.class).createProxy("DIGITAL_GOOD"));
		productWriter.create(product, true);

		// ProductPrice
		ResourceWriter<ProductPrice> productPriceWriter = resourceManager.getResourceWriter(context, ProductPrice.class);
		ProductPrice productPrice = productPriceWriter.make();
		productPrice.setProductId(product);
		productPrice.setPrice(new BigDecimal(1));
		productPrice.setTaxInPrice(true);
		productPrice.setFromDate(new Date());
		productPrice.setProductPriceTypeId(resourceManager.getFrame(context, ProductPriceType.class).createProxy("DEFAULT_PRICE"));
		productPrice.setProductPricePurposeId(resourceManager.getFrame(context, ProductPricePurpose.class).createProxy("PURCHASE"));
		productPrice.setCurrencyUomId(SystemDefault.getUom(context));
		productPrice.setProductStoreGroupId(resourceManager.getFrame(context, ProductStoreGroup.class).createProxy("_NA_"));
		productPriceWriter.create(productPrice, true);
	}
}
