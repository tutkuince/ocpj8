package com.oracle.javacert.professional.chapter07._04concurentcollections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingDequeueTest {
	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
		
		blockingDeque.offer(91);
		blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
		blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
		blockingDeque.offer(3, 4, TimeUnit.SECONDS);
		
		System.out.println(blockingDeque.poll());
		System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
		System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
	}
}
