package org.abchip.mimo.biz.test.command;

import java.util.concurrent.Callable;

import org.abchip.mimo.context.Context;

public class CreateParty implements Callable<Long> {

	Context context;
	
	public CreateParty(Context context) {
        this.context = context;
    }
	
	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		StressTestUtils.createParty(context);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}
	
}
