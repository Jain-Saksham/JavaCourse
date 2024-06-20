package com.sakshamjain24.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> submit = executorService.submit(new CallableTask("Saksham"));

		executorService.shutdown();
	}

}
