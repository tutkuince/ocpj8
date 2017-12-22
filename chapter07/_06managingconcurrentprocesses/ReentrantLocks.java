package com.oracle.javacert.professional.chapter07._06managingconcurrentprocesses;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {
	public static void main(String[] args) throws InterruptedException {
		final Runner runner = new Runner();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		runner.finish();
	}
}

class Runner {

	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10_000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		// lock.lock();
		// increment(); // It is bad design cause if program throws an exception other
		// thread will run
		// lock.unlock();

		lock.lock();
		
		System.out.println("Waiting . . .");
		cond.await();	// Waiting for signal
		
		System.out.println("Woken up!");
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	@SuppressWarnings("resource")
	public void secondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();
		
		System.out.println("Press the return key!");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key!");
		
		cond.signal();	// submit signal for await() method.
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void finish() {
		System.out.println("Count is: " + count);
	}
}
