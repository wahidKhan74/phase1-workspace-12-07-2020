package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestAllQueue {

	public static void main(String[] args) {
		
		// Queue is a datastructure which works in first in first out order.
		// 
		
		Queue<String> bankQueue = new PriorityQueue<>();
		
		bankQueue.add("Bob");
		bankQueue.add("Raj");
		bankQueue.add("Vijay");
		bankQueue.add("John");
		
		// peak and element only prints Head does not remove element from qeue
		System.out.println("Head :"+ bankQueue.peek());
		System.out.println("Head :"+ bankQueue.element());
		
		//Print top top element remove  element
//		System.out.println("Head :"+ bankQueue.remove());
		System.out.println("Head :-> "+ bankQueue.peek());
		
		Iterator itr = bankQueue.iterator();
		while (itr.hasNext()) {
				System.out.println(itr.next());
		}
		System.out.println("----------------------");
		Queue<String> queueOfFiles  = new ArrayDeque<>();
		queueOfFiles.add("File1");
		queueOfFiles.add("File2");
		queueOfFiles.add("File3");
		queueOfFiles.add("File4");
		
		System.out.println("Head :-> "+ queueOfFiles.peek());
		for(String file : queueOfFiles) {
			System.out.println(file);
		}
	}

}
