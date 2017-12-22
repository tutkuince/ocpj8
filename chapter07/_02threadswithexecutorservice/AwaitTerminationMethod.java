package com.oracle.javacert.professional.chapter07._02threadswithexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationMethod {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		
		service = Executors.newSingleThreadExecutor();
		
		// Add tasks to the thread executor
		
		if(service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);
			// checked whether all tasks are finished
			
			if(service.isTerminated())
				System.out.println("All tasks finished");
			else
				System.out.println("At least one task is still running");
		}
		
	}
}
