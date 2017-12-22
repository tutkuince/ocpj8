package com.oracle.javacert.professional.chapter07;

import java.util.Scanner;

public class WaitAndNotify {
	
	public static void main(String[] args) throws InterruptedException {
		final WaitAndNotify wn = new WaitAndNotify();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					wn.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					wn.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thred running ...");
			wait();
			System.out.println("Resumed.");
		}
	}
	
	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		
		synchronized (this) {
			System.out.println("Waiting for return key.");
			scanner.nextLine();
			System.out.println("Return key pressed.");
			notify();
		}
		scanner.close();
	}
}
