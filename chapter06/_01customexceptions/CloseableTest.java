package com.oracle.javacert.professional.chapter06._01customexceptions;

import java.io.Closeable;
import java.io.IOException;

public class CloseableTest {
	public static void main(String[] args) /*throws IOException*/{
		try(Turkey3 t = new Turkey3()){
			
		}catch(IOException e) {
			System.out.println("IOException");
		}
	}
}

class Turkey3 implements Closeable{

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void close() throws Exception {	// Closeable interface cannot throw Exception
//		
//	}
	
}
