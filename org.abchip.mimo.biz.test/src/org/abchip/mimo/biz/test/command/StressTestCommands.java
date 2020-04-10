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
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.test.command.runner.CreateAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateInpsAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateParty;
import org.abchip.mimo.biz.test.command.runner.CreateProduct;
import org.abchip.mimo.biz.test.command.runner.CreatePurchaseInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateSalesInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateSalesOrder;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseCommands {

	@Inject
	private Application application;

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestSalesOrder(interpreter, context.get());
			stressTestSalesInvoice(interpreter, context.get());
			stressTestPurchaseInvoice(interpreter, context.get());
			stressTestAgreement(interpreter, context.get());
		}
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

	public void _stressTestInps(CommandInterpreter interpreter) throws Exception {

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
			executor.submit(new CreateProduct(context));
			executor.submit(new CreateParty(context));
		}

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		interpreter.println("Total time execution StressTestBase: " + (time2 - time1));
	}

	private void stressTestSalesOrder(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if(parties.isEmpty()) {
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
		interpreter.println("Total time execution StressTestOrder: " + (time2 - time1));
	}

	private void stressTestSalesInvoice(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		if(parties.isEmpty()) {
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

	private void stressTestPurchaseInvoice(CommandInterpreter interpreter, Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledSupplier(context);
		if(parties.isEmpty()) {
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
		if(parties.isEmpty()) {
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

		// close contexts
		interpreter.print("Close " + poolSize + " connections.. ");
		for (int i = 0; i < poolSize; i++)
			contexts.get(i).close();
		interpreter.println("done");
		
	}

	private ContextProvider login() {

		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("abchip-test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");
		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);

		ContextProvider contextProvider = authenticationManager.login(null, authentication);
		if (contextProvider == null)
			throw new RuntimeException("Login failed");

		return contextProvider;
	}

	@Override
	public String getHelp() {
		return null;
	}
}