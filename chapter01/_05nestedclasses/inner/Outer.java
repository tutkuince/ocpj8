package com.oracle.javacert.professional.chapter01._05nestedclasses.inner;

public class Outer {
	private String greeting = "Hello";
	
	protected class Inner{
		public int repeat = 3;
		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println(greeting);	// can access members of outer class including private members
			}
		}
		
		/*
		 static {	// Cannot declare static fields
			
		}
		
		static void go() {	// Cannot declare static methods
			
		}
		
		*/
		
		
	}
	
	public class Inner2{	// can be public, private, protected or default access
		
	}
	
	public abstract class Inner3{ // can be abstract class
		
	}
	
	public final class Inner4{ // can be final
		
	}
	
	public class Inner5 extends Outer{ // can be extend
		
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
		System.out.println();
		Inner inner = outer.new Inner(); // create the inner class
		inner.go();
	}
}
