package com.oracle.javacert.professional.chapter07._02threadswithexecutorservice;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();

//		service.submit(new Runnable() {
//			@Override
//			public void run() {
//				Random random = new Random();
//				int duration = random.nextInt(4000);
//
//				System.out.println("Starting ...");
//
//				try {
//					Thread.sleep(duration);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				System.out.println("Finished ...");
//			}
//		});
		
		Future<Integer> future = service.submit(new Callable<Integer>() {	// Future can return null.

			@Override
			public Integer call() throws Exception {
				Random rnd = new Random();

				int duration = rnd.nextInt(4000);
				
				if (duration > 2000)
					throw new IOException("Sleepin for too long!");

				System.out.println("Starting ...");

				Thread.sleep(duration);

				System.out.println("Finished ...");

				return duration;
			}
		});

		service.shutdown();
		
		try {
			System.out.println("Result is: " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			Exception ex = (Exception) e.getCause();
			System.out.println(ex.getMessage());
		}
	}
}
