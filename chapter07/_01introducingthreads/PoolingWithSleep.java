package com.oracle.javacert.professional.chapter07._01introducingthreads;

public class PoolingWithSleep {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException{
		new Thread(() -> {
			for (int i = 0; i < 500; i++)
				PoolingWithSleep.counter++;
		}).start();
		
		while(PoolingWithSleep.counter < 100) {
			System.out.println("Not reached yet");
			Thread.sleep(1000);	// 1 SECOND
		}
		
		System.out.println("Reached!");
	}
}
