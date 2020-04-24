/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.product.ProductType;
import org.abchip.mimo.biz.test.command.runner.CreateAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateInpsAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateParty;
import org.abchip.mimo.biz.test.command.runner.CreateProduct;
import org.abchip.mimo.biz.test.command.runner.CreatePurchaseInvoice;
import org.abchip.mimo.biz.test.command.runner.CreatePurchaseOrder;
import org.abchip.mimo.biz.test.command.runner.CreateSalesInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateSalesOrder;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.tester.base.BaseTestCommands;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseTestCommands {

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestSalesOrder(interpreter, context.get());
			stressTestSalesInvoice(interpreter, context.get());
			stressTestPurchaseOrder(interpreter, context.get());
			stressTestPurchaseInvoice(interpreter, context.get());
			stressTestAgreement(interpreter, context.get());
		}
	}
	
	public void _writeTest(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// il campo MondayStartTime in Biz è definito come Time
		ResourceWriter<TechDataCalendarWeek> calendarWeekWriter = resourceManager.getResourceWriter(context, TechDataCalendarWeek.class);
		TechDataCalendarWeek calendarWeek = calendarWeekWriter.make();
		calendarWeek.setCalendarWeekId("TESTTIME");
		calendarWeek.setMondayCapacity(2.0);
		calendarWeek.setMondayStartTime(new Date());
		
		// E' sempre lo stesso ID per cui forzo anche l'aggiornamento
//		calendarWeekWriter.create(calendarWeek, true);

		// il campo ExpectedEndOfLife in Biz è definito come Date
		ResourceWriter<FixedAsset> fixedAssetWriter = resourceManager.getResourceWriter(context, FixedAsset.class);
		FixedAsset fixedAsset = fixedAssetWriter.make();
		fixedAsset.setFixedAssetId("TESTDATE");
		fixedAsset.setExpectedEndOfLife(new Date());

		// E' sempre lo stesso ID per cui forzo anche l'aggiornamento
//		fixedAssetWriter.create(fixedAsset);

		ResourceWriter<Product> productWriter = resourceManager.getResourceWriter(context, Product.class);
		Product product = productWriter.make();
		product.setProductId("TEST_BOOLEAN");
		product.setProductName("Test boolean");
		product.setDescription("Test boolean");
		product.setProductTypeId(context.createProxy(ProductType.class, "DIGITAL_GOOD"));
		// Sono interessati i flag Taxable e Returnable che in grafica Biz hanno *BLANK come default
		// In scritura vengono forzati a false
//		product.setTaxable(true);
//		product.setReturnable(true);

		// E' sempre lo stesso ID per cui forzo anche l'aggiornamento
		productWriter.create(product, true);
	}


	public void _createTestBaseData(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			String reqNumber = nextArgument(interpreter);
			long loops = 1;
			if (reqNumber != null) {
				try {
					loops = Long.parseLong(reqNumber);
				} catch (NumberFormatException e) {
				}
			}
			createTestBaseData(interpreter, context.get(), loops);
		}
	}

	public void _stressTestSalesOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestSalesOrder(interpreter, context.get());
		}
	}

	public void _stressTestSalesInvoice(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestSalesInvoice(interpreter, context.get());
		}
	}

	public void _stressTestPurchaseOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestPurchaseOrder(interpreter, context.get());
		}
	}

	public void _stressTestPurchaseInvoice(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestPurchaseInvoice(interpreter, context.get());
		}
	}

	public void _stressTestAgreement(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestAgreement(interpreter, context.get());
		}
	}

	public void _st_Inps(CommandInterpreter interpreter) throws Exception {

		String reqNumber = nextArgument(interpreter);
		String poolNumber = nextArgument(interpreter);
		long loops = 100;
		int poolSize = 2;
		if (reqNumber != null) {
			try {
				loops = Long.parseLong(reqNumber);
			} catch (NumberFormatException e) {
			}
		}
		if (poolNumber != null) {
			try {
				poolSize = Integer.parseInt(poolNumber);
			} catch (NumberFormatException e) {
			}
		}
		interpreter.println("Execution Stress Test Inps loops: " + loops + " and " + " poolSize: " + poolSize);
		stressTestInps(interpreter, loops, poolSize);
	}

	private void createTestBaseData(CommandInterpreter interpreter, Context context, long loops) throws Exception {
		long time1 = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(1);

		// jobs
		for (int i = 0; i < loops; i++) {
			executor.submit(new CreateParty(context));
			executor.submit(new CreateProduct(context));
		}

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestBase: " + (time2 - time1));
	}

	private void stressTestSalesOrder(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if (parties.isEmpty()) {
			interpreter.println("Customer not present, launch command 'createTestBaseData'");
			return;
		}
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateSalesOrder(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestSalesOrder: " + (time2 - time1));
	}

	private void stressTestSalesInvoice(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if (parties.isEmpty()) {
			interpreter.println("Customer not present, launch command 'createTestBaseData'");
			return;
		}
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateSalesInvoice(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestSalesInvoice: " + (time2 - time1));
	}

	private void stressTestPurchaseOrder(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledSupplier(context);
		if (parties.isEmpty()) {
			interpreter.println("Supplier not present, launch command 'createTestBaseData'");
			return;
		}
		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreatePurchaseOrder(context, party, StressTestUtils.getSupplierProduct(context, party)));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestPurchaseOrder: " + (time2 - time1));
	}

	private void stressTestPurchaseInvoice(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledSupplier(context);
		if (parties.isEmpty()) {
			interpreter.println("Supplier not present, launch command 'createTestBaseData'");
			return;
		}
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreatePurchaseInvoice(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestPurchaseInvoice: " + (time2 - time1));
	}

	private void stressTestAgreement(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if (parties.isEmpty()) {
			interpreter.println("Customer not present, launch command 'createTestBaseData'");
			return;
		}
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateAgreement(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestAgreement: " + (time2 - time1));
	}

	@SuppressWarnings("resource")
	private void stressTestInps(CommandInterpreter interpreter, long loops, int poolSize) throws Exception {

		List<ContextProvider> contexts = new ArrayList<ContextProvider>();

		try {
			// open contexts
			interpreter.print("Create " + poolSize + " connections.. ");
			for (int i = 0; i < poolSize; i++)
				contexts.add(login());
			interpreter.println("done");

			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(poolSize);

			// jobs
			int x = 0;
			for (int i = 0; i < loops; i++) {
				executor.submit(new CreateInpsAgreement(contexts.get(x).get()));
				x++;
				if (x == poolSize)
					x = 0;
			}

			executor.shutdown();

			executor.awaitTermination(1, TimeUnit.HOURS);
			interpreter.println("Total time execution StressTestInps: " + (System.currentTimeMillis() - time1));
		} finally {
			// close contexts
			interpreter.print("Close " + poolSize + " connections.. ");
			for (int i = 0; i < poolSize; i++)
				contexts.get(i).close();
			interpreter.println("done");
		}

	}

	@Override
	public String getHelp() {
		return null;
	}
}