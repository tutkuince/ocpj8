package com.oracle.javacert.professional.chapter03._03listsetmapqueues._03set;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println("set.add(66) : " + set.add(66));
		System.out.println("set.add(13) : " + set.add(13));
		System.out.println("set.add(66) : " + set.add(66));
		System.out.println("set.add(8) : " + set.add(8));
		
		for (Integer integer : set) {
			System.out.print(integer + " ,");
		}
	}
}
