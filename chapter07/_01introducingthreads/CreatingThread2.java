package com.oracle.javacert.professional.chapter07._01introducingthreads;

public class CreatingThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Printing zoo inventory");
	}
	
	public static void main(String[] args) {
		(new CreatingThread2()).start();
	}
}
