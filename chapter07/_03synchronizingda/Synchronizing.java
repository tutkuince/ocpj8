package com.oracle.javacert.professional.chapter07._03synchronizingda;

public class Synchronizing {
	private int count = 0;

	/**
	 * Without synchronized keyword it cannot be thread-safe. <b>synchronized</b>
	 * must be us for thread-safe
	 */
	public synchronized void increment() {
		count++;
	}
	
	/*
	public void increment() {	// NOT THREAD SAFE
		count++;
	}
	*/
	public static void main(String[] args) {
		Synchronizing s = new Synchronizing();
		s.doWork();
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10_000; i++)
					increment();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10_000; i++)
					increment();
			}
		});

		t1.start();
		t2.start();

		// We should add join() method for waiting until finish thread's work
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Count is " + count);
	}
}
