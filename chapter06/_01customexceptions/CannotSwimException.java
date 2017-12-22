package com.oracle.javacert.professional.chapter06._01customexceptions;

@SuppressWarnings("serial")
public class CannotSwimException extends Exception{	// checked exception
	public CannotSwimException() {
		super();
	}
	
	public CannotSwimException(Exception e) {
		super(e);
	}
	
	public CannotSwimException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class DangerInTheWater extends RuntimeException{	// unchecked exception
	
}

@SuppressWarnings("serial")
class SharkInTheWaterException extends DangerInTheWater{	// unchecked exception
	
}

class Dolphin{
	public void swim() throws CannotSwimException{	// throws checked exception
		
	}
}