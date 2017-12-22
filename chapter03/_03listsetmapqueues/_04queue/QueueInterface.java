package com.oracle.javacert.professional.chapter03._03listsetmapqueues._04queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); // true	[10]
		System.out.println(queue.offer(4)); // true		[10, 4]
		
		
		
		Iterator<Integer> iterQueue = queue.iterator();
		while(iterQueue.hasNext()) {
			int i = iterQueue.next();
			System.out.print(i + " ");
		}
		
		System.out.println("\n---------------");
		System.out.println(queue.peek()); // 10
		System.out.println(queue.poll()); // 10
		System.out.println(queue.poll());
		System.out.println(queue.peek());

		System.out.println("----------ArrayDeque----------");

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);	//[10]
		stack.push(4);	//[4, 10]
		Iterator<Integer> iterArrayDeque = stack.iterator();
		while (iterArrayDeque.hasNext()) {
			int i = iterArrayDeque.next();
			System.out.print(i + " ");
		}
		
		System.out.println("\n---------------");
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		
	}
}
