package com.oracle.javacert.professional.chapter07._02threadswithexecutorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for (int i = 0; i < 500; i++)
					CheckResults.counter++;
			});

			result.get(10, TimeUnit.SECONDS);	// It also waits at most 10 seconds, throwing a TimeoutException 
			System.out.println("Reached!");			// if the task is not done.
		} catch (TimeoutException e) {
			System.out.println("No reached in time!");
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
