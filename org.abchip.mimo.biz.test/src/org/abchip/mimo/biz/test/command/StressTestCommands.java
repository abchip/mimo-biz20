/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.content.data.ImageDataResource;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.test.command.runner.ApproveOrder;
import org.abchip.mimo.biz.test.command.runner.CancelOrder;
import org.abchip.mimo.biz.test.command.runner.CreateAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateCustomerReturnInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateInpsAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateParty;
import org.abchip.mimo.biz.test.command.runner.CreateProduct;
import org.abchip.mimo.biz.test.command.runner.CreatePurchaseInvoice;
import org.abchip.mimo.biz.test.command.runner.CreatePurchaseOrder;
import org.abchip.mimo.biz.test.command.runner.CreateSalesInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateSalesOrder;
import org.abchip.mimo.biz.test.command.runner.ExpireAgreement;
import org.abchip.mimo.biz.test.command.runner.HoldOrder;
import org.abchip.mimo.biz.test.command.runner.RenewalAgreement;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.tester.base.BaseTestCommands;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseTestCommands {

	@Inject
	public StressTestCommands(Application application) {
		super(application);
	}

	public void _mm_image(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {

			try (EntityIterator<ImageDataResource> imageDataResourceIterator = getContext(interpreter).getResourceManager().getResourceReader(ImageDataResource.class).find()) {
				for (ImageDataResource imageDataResource : imageDataResourceIterator) {
					String fileName = "/mimo/temp/" + imageDataResource.getDataResourceId();
					if (Files.exists(Paths.get(fileName)))
						continue;
					if (imageDataResource.getImageData() == null)
						continue;
					try (FileOutputStream fos = new FileOutputStream(fileName)) {
						fos.write(imageDataResource.getImageData());
					}
				}
			}
		}
	}

	public void _createTestBaseData(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			long loops = nextArgument(interpreter, 1).longValue();
			createTestBaseData(interpreter, contextHandler.getContext(), loops);
		}
	}

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {

			stressTestSalesOrder(interpreter, contextHandler.getContext());
			stressTestSalesInvoice(interpreter, contextHandler.getContext());
			stressTestPurchaseOrder(interpreter, contextHandler.getContext());
			stressTestPurchaseInvoice(interpreter, contextHandler.getContext());
			stressTestCustomerReturnInvoice(interpreter, contextHandler.getContext());
			stressTestAgreement(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestSalesOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestSalesOrder(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestSalesInvoice(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestSalesInvoice(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestPurchaseOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestPurchaseOrder(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestPurchaseInvoice(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestPurchaseInvoice(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestCustomerReturnInvoice(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestCustomerReturnInvoice(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestAgreement(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestAgreement(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestRenewalAgreement(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			stressTestRenewalAgreement(interpreter, contextHandler.getContext());
		}
	}

	public void _stressTestExpireAgreement(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			executor.submit(new ExpireAgreement(contextHandler.getContext(), nextArgument(interpreter)));
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.MINUTES);
			long time2 = System.currentTimeMillis();
			interpreter.println("Total time execution StressTestExpireAgreement: " + (time2 - time1));
		}
	}

	public void _stressTestApproveOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			executor.submit(new ApproveOrder(contextHandler.getContext(), nextArgument(interpreter)));
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.MINUTES);
			long time2 = System.currentTimeMillis();
			interpreter.println("Total time execution StressTestApproveOrder: " + (time2 - time1));
		}
	}

	public void _stressTestCancelOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			executor.submit(new CancelOrder(contextHandler.getContext(), nextArgument(interpreter)));
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.MINUTES);
			long time2 = System.currentTimeMillis();
			interpreter.println("Total time execution StressTestCancelOrder: " + (time2 - time1));
		}
	}

	public void _stressTestHoldOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			executor.submit(new HoldOrder(contextHandler.getContext(), nextArgument(interpreter)));
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.MINUTES);
			long time2 = System.currentTimeMillis();
			interpreter.println("Total time execution StressTestHoldOrder: " + (time2 - time1));
		}
	}

	public void _getInvoiceTot(CommandInterpreter interpreter) throws Exception {
		try (ContextHandler contextHandler = login(interpreter)) {
			String invoiceId = nextArgument(interpreter);
			Invoice invoice = contextHandler.getContext().getResourceManager().getResourceReader(Invoice.class).lookup(invoiceId);
			interpreter.println("From: " + invoice.getPartyIdFrom().getID());
			interpreter.println("To: " + invoice.getParty().getID());
			interpreter.println("Total: " + invoice.getTotal());
		}
	}

	public void _st_Inps(CommandInterpreter interpreter) throws Exception {

		long loops = nextArgument(interpreter, 100).longValue();
		int poolSize = nextArgument(interpreter, 2).intValue();

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
		List<Product> products = StressTestUtils.getDigitalProducts(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateSalesOrder(context, party, products));

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
		List<Product> products = StressTestUtils.getDigitalProducts(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateSalesInvoice(context, party, products));

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
		List<Product> products = StressTestUtils.getDigitalProducts(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreatePurchaseInvoice(context, party, products));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestPurchaseInvoice: " + (time2 - time1));
	}

	private void stressTestCustomerReturnInvoice(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if (parties.isEmpty()) {
			interpreter.println("Customer not present, launch command 'createTestBaseData'");
			return;
		}
		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateCustomerReturnInvoice(context, party));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestCustomerReturnInvoice: " + (time2 - time1));
	}

	private void stressTestAgreement(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if (parties.isEmpty()) {
			interpreter.println("Customer not present, launch command 'createTestBaseData'");
			return;
		}
		List<Product> products = StressTestUtils.getDigitalProducts(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateAgreement(context, party, products));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestAgreement: " + (time2 - time1));
	}

	private void stressTestRenewalAgreement(CommandInterpreter interpreter, Context context) throws Exception {

		long time1 = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.submit(new RenewalAgreement(context, nextArgument(interpreter)));
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestRenewalAgreement: " + (time2 - time1));
	}

	@SuppressWarnings("resource")
	private void stressTestInps(CommandInterpreter interpreter, long loops, int poolSize) throws Exception {

		List<ContextHandler> contexts = new ArrayList<ContextHandler>();

		try {
			// open contexts
			interpreter.print("Create " + poolSize + " connections.. ");
			for (int i = 0; i < poolSize; i++)
				contexts.add(login(interpreter));
			interpreter.println("done");

			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(poolSize);

			// jobs
			int x = 0;
			for (int i = 0; i < loops; i++) {
				executor.submit(new CreateInpsAgreement(contexts.get(x).getContext()));
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