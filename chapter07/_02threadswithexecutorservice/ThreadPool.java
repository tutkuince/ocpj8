package com.oracle.javacert.professional.chapter07._02threadswithexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool implements Runnable {
	private int id;

	public ThreadPool(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting: " + id);

		try {
			Thread.sleep(5000);	// Handling with requests like accessing file or something
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Completed: " + id);
	}

	public static void main(String[] args) {
		// ThreadPools are way of managing lots of threads at the same time
		// ThreadPool is like having a number of workers in a factory
		ExecutorService service = Executors.newFixedThreadPool(2); // 2 workers(threads)

		for (int i = 0; i < 5; i++) {
			service.submit(new ThreadPool(i));
		}
		
		service.shutdown();
		
		System.out.println("All tasks submitted.");
		
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All tasks completed.");
	}
}
