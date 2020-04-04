/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

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
import org.abchip.mimo.biz.test.command.runner.CreateSalesInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateSalesOrder;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseCommandProviderImpl {

	@Inject
	private Application application;

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestBase(context.get());
			stressTestSalesOrder(context.get());
			stressTestSalesInvoice(context.get());
			stressTestAgreement(context.get());
		}
	}

	public void _stressTestBase(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestBase(context.get());
		}
	}

	public void _stressTestSalesOrder(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestSalesOrder(context.get());
		}
	}

	public void _stressTestSalesInvoice(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestSalesInvoice(context.get());
		}
	}

	public void _stressTestAgreement(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
			stressTestAgreement(context.get());
		}
	}

	public void _stressTestInps(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {
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
			System.out.println("Execution Stress Test Inps loops: " + loops + " and " + " poolSize: " + poolSize);
			stressTestInps(context.get(), loops, poolSize);
		}
	}

	private void stressTestBase(Context context) throws Exception {

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);

		executor.submit(new CreateProduct(context));
		executor.submit(new CreateParty(context));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		System.out.println("Total time execution StressTestBase: " + (time2 - time1));
	}

	private void stressTestSalesOrder(Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateSalesOrder(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		System.out.println("Total time execution StressTestOrder: " + (time2 - time1));
	}

	private void stressTestSalesInvoice(Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateSalesInvoice(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		System.out.println("Total time execution StressTestInvoice: " + (time2 - time1));
	}

	private void stressTestAgreement(Context context) throws Exception {

		List<Party> parties = StressTestUtils.getEnabledCustomers(context);
		List<ProductPrice> productPrices = StressTestUtils.getDigitalProductPrices(context);

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		for (Party party : parties)
			executor.submit(new CreateAgreement(context, party, productPrices));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);

		long time2 = System.currentTimeMillis();
		System.out.println("Total time execution StressTestAgreement: " + (time2 - time1));
	}

	private void stressTestInps(Context context, long loops, int poolSize) throws Exception {

		long time1 = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(poolSize);
		for (int i = 0; i < loops; i++)
			executor.submit(new CreateInpsAgreement(context));

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.HOURS);

		long time2 = System.currentTimeMillis();
		System.out.println("Total time execution StressTestInps: " + (time2 - time1));
	}

	private ContextProvider login() {
		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("abchip-test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");
		// authentication.setUser("abchip");
		// authentication.setPassword("ofbiz");
		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);

		return authenticationManager.login(null, authentication);
	}

	@Override
	public String getHelp() {
		return null;
	}
}