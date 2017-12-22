package com.oracle.javacert.professional.chapter07._04concurentcollections;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueClass {
	private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);	//FIFO

	public static void main(String[] args) {
		BlockingQueueClass bqc = new BlockingQueueClass();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					bqc.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					bqc.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void producer() throws InterruptedException {	// Producer pattern
		Random random = new Random();

		while (true) {
			Integer value = random.nextInt();
			queue.put(value);
		}
	}

	  private void consumer() throws InterruptedException {	// Consumer pattern
		Random random = new Random();
		while (true) {
			Thread.sleep(100);

			if (random.nextInt(10) == 0) {
				Integer value = queue.take();

				System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());
			}
		}
	}
}
