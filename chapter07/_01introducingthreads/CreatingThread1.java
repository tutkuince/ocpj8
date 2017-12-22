package com.oracle.javacert.professional.chapter07._01introducingthreads;

public class CreatingThread1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Printing record: " + i);
		}
	}
	
	public static void main(String[] args) {
		(new Thread(new CreatingThread1())).start();	// creates a Thread using a Runnable instance
	}
}
