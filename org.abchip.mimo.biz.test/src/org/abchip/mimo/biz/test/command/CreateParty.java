package org.abchip.mimo.biz.test.command;

import java.util.concurrent.Callable;

import org.abchip.mimo.context.Context;

public class CreateParty implements Callable<Boolean> {

	Context context;
	
	public CreateParty(Context context) {
        this.context = context;
    }
	
	@Override
	public Boolean call() throws Exception {
		StressTestUtils.createParty(context);
		return true;
	}
	
}
