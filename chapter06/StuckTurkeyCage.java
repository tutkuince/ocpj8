package com.oracle.javacert.professional.chapter06;

public class StuckTurkeyCage implements AutoCloseable{
	@Override
	public void close() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args) throws Exception{
		try(StuckTurkeyCage t = new StuckTurkeyCage()){
			System.out.println("put turkeys in");
		}
		
		
	}
}
