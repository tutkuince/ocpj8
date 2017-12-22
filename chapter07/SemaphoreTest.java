package com.oracle.javacert.professional.chapter07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {
	public static void main(String[] args) throws Exception {
		// Semaphore sem = new Semaphore(1); // 1 is availablePermits

		// sem.release(1); // availablePermits is 2 => increasing
		// sem.acquire(1); // availablePermits is 1 => decreasing. If availablePermits
		// is 0 it will wait until availablePermits greater than 0

		// sem.acquire(); YOU CAN USE IT LIKE A LOCK
		// sem.release();

		ExecutorService service = Executors.newCachedThreadPool();

		for (int i = 0; i < 200; i++) {
			service.submit(new Runnable() {
				@Override
				public void run() {
					Connection.getInstance().doConnect();
				}
			});
		}

		service.shutdown();

		service.awaitTermination(1, TimeUnit.DAYS);
	}
}

class Connection {
	// singleton pattern
	private static Connection instance = new Connection();

	private int connections = 0;

	private Semaphore sem = new Semaphore(10);

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try {
			doConnect();
		} finally {
			sem.release();
		}
	}

	public void doConnect() {

		synchronized (this) {
			connections++;
			System.out.println("Current connection(s): " + connections);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}
	}
}
