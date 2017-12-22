package com.oracle.javacert.professional.chapter03;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Notes {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<?> list1 = new ArrayList<A>();
		
		List<? extends A> list2 = new ArrayList<A>();
		
		List<? super A> list3 = new ArrayList<A>();
		
		// List<? extends B> list4 = new ArrayList<A>();
		
		List<? super B> list4 = new ArrayList<A>();
		
		// List<?> list6 = new ArrayList<? extends A>();
		
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(String.valueOf(i));
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		
		System.out.println("\n---------------------");
		
		List<String> listSort = Arrays.asList("1", "A", "a", "ba", "Ba", "2");
		Collections.sort(listSort);
		System.out.println(listSort);
		
		ArrayDeque<String> greetings = new ArrayDeque<>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		greetings.pop();
		greetings.peek();
		while(greetings.peek() != null) {
			System.out.println(greetings.pop());
		}
		
		HashSet<? super ClassCastException> hs = new HashSet<Exception>();
		List<String> l = new Vector<>();
		
		List<String> sort = Arrays.asList("one", "One", "ONE");
		Collections.sort(sort);
		System.out.println(sort);
		
		Map<String, Double> map = new HashMap<>();
		map.put("pi", 3.14);
		
		List<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1);
		System.out.println(q);
		
		
		
		
	} 
}

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}
