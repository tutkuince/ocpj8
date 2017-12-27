package com.oracle.javacert.professional.chapter08._03workingstreams.bufferedinputstreamandbufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBufferFileSample {
	public static void main(String[] args) throws IOException {
		File source = new File("src\\com\\oracle\\javacert\\professional\\chapter08\\_03workingstreams\\fileinputstreamandfileoutputstream\\readwrite.txt");
		File destination = new File("src\\com\\oracle\\javacert\\professional\\chapter08\\_03workingstreams\\fileinputstreamandfileoutputstream\\readwrite.txt");
		
		copy(source, destination);
		System.out.println("GJ!");
	}
	
	public static void copy(File source, File destination) throws IOException{
		try(InputStream in = new BufferedInputStream(new FileInputStream(source)); OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))){
			
			byte[] buffer = new byte[1024];
			int lengthRead;
			
			while((lengthRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}
		}
	}
}
