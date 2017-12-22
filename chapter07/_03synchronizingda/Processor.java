package com.oracle.javacert.professional.chapter07._03synchronizingda;

import java.util.Scanner;

class Test extends Thread {
	// private boolean running = true;
	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("Hello");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		running = false;
		System.out.println("Shutdown ...");
	}
}

public class Processor {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.start();

		System.out.println("Press return to stop ...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

		t1.shutDown();
		
		scanner.close();
	}
}
