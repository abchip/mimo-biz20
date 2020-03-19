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

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class StressTestCommands extends BaseCommandProviderImpl {

	@Inject
	private Application application;

	public <E extends EntityIdentifiable> void _loginStress(CommandInterpreter interpreter) throws Exception {
		this.login(interpreter.nextArgument());
	}

	public void _stressTest(CommandInterpreter interpreter) throws Exception {
		
		
		AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");

		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);

		try (Context context = authenticationManager.login(null, authentication)) {
			ExecutorService executor = Executors.newFixedThreadPool(2);
			List<Future<Boolean>> resultList = new ArrayList<>();

			for (int i = 1; i <= 10; i++) {
				RunnableTest calculator = new RunnableTest(i);
				Future<Boolean> result = executor.submit(calculator);
				resultList.add(result);
			}

			for (int i = 0; i < resultList.size(); i++) {
				Future<Boolean> result = resultList.get(i);
				boolean state = true;
				try {
					state = result.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				System.out.printf("Main: Task %d: %d\n", i, state);
			}

			executor.shutdown();
		}
	}

	@Override
	public String getHelp() {
		return null;
	}
}