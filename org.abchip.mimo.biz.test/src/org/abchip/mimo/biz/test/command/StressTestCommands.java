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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.test.command.runner.CreateAgreement;
import org.abchip.mimo.biz.test.command.runner.CreateInvoice;
import org.abchip.mimo.biz.test.command.runner.CreateOrder;
import org.abchip.mimo.biz.test.command.runner.CreateParty;
import org.abchip.mimo.biz.test.command.runner.CreateProduct;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseCommandProviderImpl {

	@Inject
	private Application application;

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		stressTestBase();
		stressTestOrder();
		stressTestInvoice();
		stressTestAgreement();
	}

	public void _stressTestBase(CommandInterpreter interpreter) throws Exception {
		stressTestBase();
	}

	public void _stressTestOrder(CommandInterpreter interpreter) throws Exception {
		stressTestOrder();
	}

	public void _stressTestInvoice(CommandInterpreter interpreter) throws Exception {
		stressTestInvoice();
	}

	public void _stressTestAgreement(CommandInterpreter interpreter) throws Exception {
		stressTestAgreement();
	}
	
	private void stressTestBase()  throws Exception {
		try (Context context = login()) {
			if(context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;

			CreateProduct productCallable = new CreateProduct(context);
			result = executor.submit(productCallable);
			resultList.add(result);

			CreateParty partyCallable = new CreateParty(context);
			result = executor.submit(partyCallable);
			resultList.add(result);
			
			executor.awaitTermination(5, TimeUnit.SECONDS);

			for (int i = 0; i < resultList.size(); i++) {
				result = resultList.get(i);
				long time = 0;
				try {
					time = result.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				System.out.println("Main: Task " + i  + " time " + time);
			}
			executor.shutdown();
		}
	}

	private void stressTestOrder()  throws Exception {
		try (Context context = login()) {
			if(context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;

			CreateOrder orderCallable = new CreateOrder(context);
			result = executor.submit(orderCallable);
			resultList.add(result);
			
			executor.awaitTermination(5, TimeUnit.SECONDS);

			for (int i = 0; i < resultList.size(); i++) {
				result = resultList.get(i);
				long time = 0;
				try {
					time = result.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				System.out.println("Main: Task " + i  + " time " + time);
			}
			executor.shutdown();
		}
	}
	
	private void stressTestInvoice()  throws Exception {
		try (Context context = login()) {
			if(context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;

			CreateInvoice invoiceCallable = new CreateInvoice(context);
			result = executor.submit(invoiceCallable);
			resultList.add(result);
			
			executor.awaitTermination(5, TimeUnit.SECONDS);

			for (int i = 0; i < resultList.size(); i++) {
				result = resultList.get(i);
				long time = 0;
				try {
					time = result.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				System.out.println("Main: Task " + i  + " time " + time);
			}
			executor.shutdown();
		}
	}

	private void stressTestAgreement()  throws Exception {
		try (Context context = login()) {
			if(context == null) {
				System.err.println("Tenant 'test' not found");
				return;
			}
			
			ExecutorService executor = Executors.newFixedThreadPool(1);
			List<Future<Long>> resultList = new ArrayList<>();

			Future<Long> result = null;

			CreateAgreement agreementCallable = new CreateAgreement(context);
			result = executor.submit(agreementCallable);
			resultList.add(result);
			
			executor.awaitTermination(5, TimeUnit.SECONDS);

			for (int i = 0; i < resultList.size(); i++) {
				result = resultList.get(i);
				long time = 0;
				try {
					time = result.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				System.out.println("Main: Task " + i  + " time " + time);
			}
			executor.shutdown();
		}
	}

	private Context login() {
		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("abchip-test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");
//		authentication.setUser("abchip");
//		authentication.setPassword("ofbiz");
		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);

		return authenticationManager.login(null, authentication);
	}
	
	@Override
	public String getHelp() {
		return null;
	}
}