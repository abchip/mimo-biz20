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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.test.command.runner.CreateAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateInpsAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateSalesInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateSalesOrder;
import org.abchip.mimo.biz.test.command.runner.CreateParty;
import org.abchip.mimo.biz.test.command.runner.CreateProduct;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseCommandProviderImpl {

	@Inject
	private Application application;

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		stressTestBase();
		stressTestSalesOrder();
		stressTestInvoice();
		stressTestAgreement();
	}

	public void _stressTestBase(CommandInterpreter interpreter) throws Exception {
		stressTestBase();
	}

	public void _stressTestSalesOrder(CommandInterpreter interpreter) throws Exception {
		stressTestSalesOrder();
	}

	public void _stressTestInvoice(CommandInterpreter interpreter) throws Exception {
		stressTestInvoice();
	}

	public void _stressTestAgreement(CommandInterpreter interpreter) throws Exception {
		stressTestAgreement();
	}

	public void _stressTestInps(CommandInterpreter interpreter) throws Exception {
		String reqNumber = interpreter.nextArgument();
		String poolNumber = interpreter.nextArgument();
        long l1 = 100;
        int l2 = 100;
		if(reqNumber != null) {
			try {
		        l1 = Long.parseLong(reqNumber);
		    } catch (NumberFormatException e) {
		    }
		}
		if(poolNumber != null) {
			try {
		        l2 = Integer.parseInt(poolNumber);
		    } catch (NumberFormatException e) {
		    }
		}
		System.out.println("Execution Stress Inps test with number request: " + l1 + " and " + " threadPool: " + l2);
		stressTestInps(l1, l2);
	}

	private void stressTestBase() throws Exception {
		try (ContextProvider context = login()) {
			if (context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			
			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;

			CreateProduct productCallable = new CreateProduct(context.get());
			result = executor.submit(productCallable);
			resultList.add(result);

			CreateParty partyCallable = new CreateParty(context.get());
			result = executor.submit(partyCallable);
			resultList.add(result);

	        executeThread(executor, resultList);

	        long time2 = System.currentTimeMillis();
			System.out.println("Total time execution StressTestBase: " + (time2-time1));
		}
	}

	private void stressTestSalesOrder() throws Exception {
		try (ContextProvider context = login()) {
			if (context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			// Set of party
			List<Party> parties = StressTestUtils.getEnabledCustomers(context.get());
			if(parties.size() == 0) {
				System.err.println("Customer Party not found. Operation canceled.");
				return;
			}
			// Set of product
			Map<Product, ProductPrice> productMap = StressTestUtils.getDigitalProducts(context.get());
			if(productMap.isEmpty()) {
				System.err.println("Digital product and price not found. Operation canceled.");
				return;
			}

			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;
			Iterator<Party> partyIt = parties.iterator();
			while(partyIt.hasNext()) {
				CreateSalesOrder orderCallable = new CreateSalesOrder(context.get(), partyIt.next(), productMap);
				result = executor.submit(orderCallable);
				resultList.add(result);
			}

	        executeThread(executor, resultList);

	        long time2 = System.currentTimeMillis();
			System.out.println("Total time execution StressTestOrder: " + (time2-time1));
		}
	}

	private void stressTestInvoice() throws Exception {
		try (ContextProvider context = login()) {
			if (context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			// Set of party
			List<Party> parties = StressTestUtils.getEnabledCustomers(context.get());
			if(parties.size() == 0) {
				System.err.println("Customer Party not found. Operation canceled.");
				return;
			}
			// Set of product
			Map<Product, ProductPrice> productMap = StressTestUtils.getDigitalProducts(context.get());
			if(productMap.isEmpty()) {
				System.err.println("Digital product and price not found. Operation canceled.");
				return;
			}

			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;
			Iterator<Party> partyIt = parties.iterator();
			while(partyIt.hasNext()) {
				CreateSalesInvoice callable = new CreateSalesInvoice(context.get(), partyIt.next(), productMap);
				result = executor.submit(callable);
				resultList.add(result);
			}

	        executeThread(executor, resultList);

	        long time2 = System.currentTimeMillis();
			System.out.println("Total time execution StressTestInvoice: " + (time2-time1));
		}
	}

	private void stressTestAgreement() throws Exception {
		try (ContextProvider context = login()) {
			if (context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			// Set of party
			List<Party> parties = StressTestUtils.getEnabledCustomers(context.get());
			if(parties.size() == 0) {
				System.err.println("Customer Party not found. Operation canceled.");
				return;
			}
			// Set of product
			Map<Product, ProductPrice> productMap = StressTestUtils.getDigitalProducts(context.get());
			if(productMap.isEmpty()) {
				System.err.println("Digital product and price not found. Operation canceled.");
				return;
			}

			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;
			Iterator<Party> partyIt = parties.iterator();
			while(partyIt.hasNext()) {
				CreateAgreement agreementCallable = new CreateAgreement(context.get(), partyIt.next(), productMap);
				result = executor.submit(agreementCallable);
				resultList.add(result);
			}

			executeThread(executor, resultList);

	        long time2 = System.currentTimeMillis();
			System.out.println("Total time execution StressTestAgreement: " + (time2-time1));
		}
	}

	private void stressTestInps(long l1, int l2) throws Exception {
		try (ContextProvider context = login()) {
			if (context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			long time1 = System.currentTimeMillis();
			ExecutorService executor = Executors.newFixedThreadPool(l2);
			List<Future<Long>> list = new ArrayList<Future<Long>>();
			Callable<Long> callable = new CreateInpsAgreement(context.get());
	        for(int i=0; i< l1; i++){
	            Future<Long> future = executor.submit(callable);
	            list.add(future);
	        }

	        executeThread(executor, list);

	        long time2 = System.currentTimeMillis();
			System.out.println("Total time execution StressTestInps: " + (time2-time1));
		}
	}

	private void executeThread(ExecutorService executor, List<Future<Long>> list) throws InterruptedException {
		executor.awaitTermination(1, TimeUnit.SECONDS);
        for(Future<Long> fut : list){
            try {
            	// se non faccio cosi non vengono eseguiti tutti i job
            	fut.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
		executor.shutdown();
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