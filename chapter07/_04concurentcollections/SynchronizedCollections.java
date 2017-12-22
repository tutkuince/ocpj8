package com.oracle.javacert.professional.chapter07._04concurentcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {
	
	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
		
		synchronized (list) {
			for (int data : list) {
				System.out.print(data + " ");
			}
		}
	}
}
