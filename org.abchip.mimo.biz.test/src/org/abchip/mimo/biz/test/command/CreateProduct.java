package org.abchip.mimo.biz.test.command;

import java.util.concurrent.Callable;

import org.abchip.mimo.biz.product.product.Product;
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

		ResourceWriter<Product> productWriter = resourceManager.getResourceWriter(context, Product.class);
		Product product = productWriter.make(true);
		product.setInternalName(product.getID());
		product.setDescription("Description product " + product.getID());
		productWriter.create(product, true);
	}
	
}
