package com.oracle.javacert.professional.chapter03._03listsetmapqueues._02list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SD");	// [SD]
		System.out.println(list);
		list.add(0, "NY");	// [NY, SD]
		System.out.println(list);
		list.set(1, "FL");	// [NY, FL]
		System.out.println(list);
		list.remove("NY");	// [FL]
		System.out.println(list);
		list.remove(0);		// []
		System.out.println(list);
		
		list.add("OH");
		list.add("CO");
		list.add("NJ");
		
		String state = list.get(0);
		int index = list.indexOf("NJ");
		System.out.println("state : " + state);
		System.out.println("index : " + index);
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
	}
}
