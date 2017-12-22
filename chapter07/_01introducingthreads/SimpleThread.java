package com.oracle.javacert.professional.chapter07._01introducingthreads;

import javax.swing.JOptionPane;

public class SimpleThread extends Thread {
	private int countDown;
	private static int threadCount = 0;
	private int threadNumber = ++threadCount;

	public SimpleThread(int countDown) {
		System.out.println("Making " + threadNumber);
		this.countDown = countDown;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Thread " + threadNumber + "(" + countDown + ")");
			if (--countDown == 0)
				return;
		}
	}
	
	public static void main(String[] args) {
		String count = JOptionPane.showInputDialog("Enter a big number : ");
		int countDownInt = Integer.parseInt(count);
		for (int i = 0; i < 5; i++) {
			SimpleThread thread = new SimpleThread(countDownInt);
			thread.start();
		}
		System.out.println("All Threads started!");
	}
}
