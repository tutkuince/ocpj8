package com.oracle.javacert.professional.chapter06._01customexceptions;

public class AutoCloseableTest {
	public static void main(String[] args) {
//		try(Turkey turkey = new Turkey()){	// need to implement AutoCloseable interface
//			
//		}
		
		try(Turkey2 turkey2 = new Turkey2()){
			System.out.println("in try-with-resources block");
			throw new Exception();
		}catch(Exception e) {
			System.out.println("Error!");
		}
		
		System.out.println("---------------------");
		
		try(JammedTurkeyCage t = new JammedTurkeyCage()){
			System.out.println("put turkeys in");
			throw new IllegalStateException("turkeys run off");
		}catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}
}

class Turkey{
	
}

class Turkey2 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Turkey2 closed!");
	}
	
}

class JammedTurkeyCage implements AutoCloseable{
	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
}
