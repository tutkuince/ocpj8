package com.oracle.javacert.professional.chapter07._01introducingthreads.definition.implement;

class Test implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Runner {
	 public static void main(String[] args) {
		Thread thread1 = new Thread(new Test());
		thread1.start();
		
		Thread thread2 = new Thread(new Test());
		thread2.start();
	}
}
