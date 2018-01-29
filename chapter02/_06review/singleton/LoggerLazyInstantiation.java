package com.oracle.javacert.professional.chapter02._06review.singleton;

public class LoggerLazyInstantiation {
	
	private LoggerLazyInstantiation() {
		
	}
	
	private static LoggerLazyInstantiation instance;
	
	public static LoggerLazyInstantiation getInstance() {
		if(instance == null) {
			synchronized (LoggerLazyInstantiation.class) {
				if(instance == null)
					instance = new LoggerLazyInstantiation();
			}
		}
		return instance;
	}
	
	/*
	 public static LoggerLazyInstantiation getInstance() {
		if(instance == null) {
			instance = new LoggerLazyInstantiation();	// NOT THREAD-SAFE
		}
		return instance;
	}
	  */
}
