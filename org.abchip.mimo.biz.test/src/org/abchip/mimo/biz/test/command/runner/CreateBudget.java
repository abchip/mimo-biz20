/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.accounting.budget.Budget;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateBudget implements Callable<Long> {

	Context context;

	public CreateBudget(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createBudget();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createBudget() throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		ResourceWriter<Budget> budgetWriter = resourceManager.getResourceWriter(context, Budget.class);
		Budget budget = budgetWriter.make();
		budget.getID();
	}
}
