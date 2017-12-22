package com.oracle.javacert.professional.chapter07._04concurentcollections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
		blockingQueue.offer(39);
		blockingQueue.offer(3, 4, TimeUnit.SECONDS);
		
		System.out.println(blockingQueue.poll());
		System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
	}
}
