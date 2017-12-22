package com.oracle.javacert.professional.chapter07._06managingconcurrentprocesses;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
	private CountDownLatch latch;

	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Started.");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		latch.countDown();
	}
}

public class CountdownLatches {

	public static void main(String[] args) {
		// CountDownLatch is thread-safe. You can safely access multiple threads without
		// synchronization. ( It is a solution for thread synchronization )
		CountDownLatch latch = new CountDownLatch(3);

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {
			service.submit(new Processor(latch));
		}

		try {
			latch.await(); // It is wait until CountDownLatche count down to 0 ( 3 to 0 )
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Completed.");
	}
}
