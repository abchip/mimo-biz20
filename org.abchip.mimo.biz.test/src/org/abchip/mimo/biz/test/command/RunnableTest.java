package org.abchip.mimo.biz.test.command;

import java.util.concurrent.Callable;

public class RunnableTest implements Callable<Boolean> {

	private final Integer number;

	public RunnableTest(Integer number) {
        this.number = number;
    }
	@Override
	public Boolean call() throws Exception {
		Thread.sleep(number * 1000);
		System.out.println("Ho atteso " + number + " secondi");
		// TODO Auto-generated method stub
		return true;
	}
}
