package com.oracle.javacert.professional.chapter07._01introducingthreads.definition.extend;

class Test extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
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
		Test test1 = new Test();
		test1.start();
		
		Test test2 = new Test();
		test2.start();
	}
}
