package com.oracle.javacert.professional.chapter07._01introducingthreads;

public class MainThread {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Current thread is " + thread);	// [name, priority, thread group] 
		System.out.println(thread.getName());	// thread name
	}
}
