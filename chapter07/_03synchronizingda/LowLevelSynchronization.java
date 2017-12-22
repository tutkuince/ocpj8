package com.oracle.javacert.professional.chapter07._03synchronizingda;

import java.util.LinkedList;

public class LowLevelSynchronization {

	private LinkedList<Integer> list = new LinkedList<>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException { // add
		int value = 0;

		while (true) {
			synchronized (lock) {
				
				while(list.size() == LIMIT) {
					lock.wait();
				}
				list.add(value++);
				notify();
			}
		}
	}

	public void consume() throws InterruptedException { // remove
		
		while (true) {

			synchronized (lock) {
				
				while(list.size() == 0)
					lock.wait();
				System.out.print("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("; value is: " + value);
				lock.notify();
			}
		}
		
	}
}
