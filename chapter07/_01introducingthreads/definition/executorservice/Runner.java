package com.oracle.javacert.professional.chapter07._01introducingthreads.definition.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello " + i);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
