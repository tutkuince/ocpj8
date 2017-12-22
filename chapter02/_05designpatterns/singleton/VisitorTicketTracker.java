package com.oracle.javacert.professional.chapter02._05designpatterns.singleton;

// Lazy instantiation
public class VisitorTicketTracker {
	private volatile static VisitorTicketTracker instance;
	private VisitorTicketTracker() {
		
	}
	
//	public static VisitorTicketTracker getInstance() {
//		if(instance == null) {
//			instance = new VisitorTicketTracker();		// NOT THREAD-SAFE!
//		}
//		return instance;
//	}
	
//	public static synchronized VisitorTicketTracker getInstance() {	// NOW THREAD-SAFE!
//		if(instance == null) {
//			instance = new VisitorTicketTracker();	
//		}
//		return instance;
//	}
	
	public static VisitorTicketTracker getInstance() { // NOW THREAD-SAFE, But better performance
		if (instance == null) {
			synchronized (VisitorTicketTracker.class) {
				instance = new VisitorTicketTracker();
			}
		}
		return instance;
	}
}
