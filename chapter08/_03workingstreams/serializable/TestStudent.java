package com.oracle.javacert.professional.chapter08._03workingstreams.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Student student = new Student(123, "Tutku", "Ince");

		File file = new File("src/com/oracle/javacert/professional/chapter08/_03workingstreams/serializable/data.txt");
		
		// write(file, student);
		
		read(file);
	}

	public static void write(File file, Object obj) throws IOException {
		FileOutputStream fOut = new FileOutputStream(file);

		ObjectOutputStream out = new ObjectOutputStream(fOut);

		try {
			out.writeObject(obj);	// serialize the object to the stream
			System.out.println("Mission completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

	public static void read(File file) throws IOException, ClassNotFoundException {

		Student student = null;

		FileInputStream fIn = new FileInputStream(file);

		ObjectInputStream in = new ObjectInputStream(fIn);

		student = (Student) in.readObject();	// deserialization
		
		System.out.println("Process started!");
		System.out.println(student.toString());
		System.out.println("Process finished!");
		
		in.close();
	}
}
