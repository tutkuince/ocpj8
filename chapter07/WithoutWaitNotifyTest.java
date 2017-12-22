package com.oracle.javacert.professional.chapter07;

public class WithoutWaitNotifyTest {
	public static void main(String[] args) throws InterruptedException {
		Calculate calculateThread = new Calculate();
		calculateThread.start();
		
		
//		synchronized (calculateThread) {	Without calculateThread.wait() method, result is unpredictable!!! 
//			calculateThread.wait();
//		}	
		
		System.out.println("After calculate ...");
		System.out.println("Total is: " + calculateThread.total);
		System.out.println("Count is: " + calculateThread.count);
	}
}

class Calculate extends Thread {
	int total;
	int count;
	
	@Override
	public void run() {
		for (int i = 0; i < 100_000; i++) {
			total += i;
			count = i;
		}
	}
}
