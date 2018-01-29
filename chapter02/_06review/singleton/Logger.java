package com.oracle.javacert.professional.chapter02._06review.singleton;

//Logger class must be instantiated only once in the application; it is to ensure that the
//whole of the application makes use of that same logger instance
public class Logger {

	// declare the constructor private to prevent clients
	// from instantiating an object of this class directly
	private Logger() {
		// private constructor to prevent direct instantiation
	}
	
	// by default, this field is initialized to null
	// the static method to be used by clients to get the instance of the Logger class
	private static Logger instance;
	//private static final Logger instance = new Logger(); 
	
	public static Logger getInstance() {
		if(instance == null) {
			// this is first time this method is called,
			// and that's why instance is null
			instance = new Logger();
		}
		// return the same object reference any time and
		// every time  getInstance is called.
		return instance;
	}
}
