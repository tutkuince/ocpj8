package com.oracle.javacert.professional.chapter07._01introducingthreads;

public class CreatingThreadTest {
	public static void main(String[] args) {
		System.out.println("begin");
		(new CreatingThread2()).start();
		(new Thread(new CreatingThread1())).start();
		(new CreatingThread2()).start();
		System.out.println("end");
	}
}
