package com.oracle.javacert.professional.chapter07._03synchronizingda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
	
	// private int sheepCount = 0;	// NOT THREAD SAFE
	private AtomicInteger sheepCount = new AtomicInteger(0);
	
	private void incrementAndReport() {
		// System.out.print((++sheepCount) + " ");	// NOT THREAD SAFE
		System.out.print(sheepCount.incrementAndGet() + " ");
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(20);
			
			SheepManager manager = new SheepManager();
			
			for(int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if(service != null)
				service.shutdown();
		}
	}
}
