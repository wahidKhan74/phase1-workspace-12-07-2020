package com.simplilearn.datastructure.queue;


public class TestArrayQueue {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", 100023.23);
		Employee marrySmith = new Employee(102, "Marry Smith", 1000456.23);
		Employee willClark = new Employee(101, "Will Clakk", 1000.23);
		Employee tonyStark = new Employee(102, "Tony Stark", 1000.23);
		Employee ironMan = new Employee(102, "Iron Man", 1000.23);
		
		ArrayQueue queue = new ArrayQueue(2);
		
		System.out.println("Queue Size : "+queue.size());
		queue.add(johnSmith);
		System.out.println("Queue Size : "+queue.size());
		queue.add(marrySmith);
		queue.add(willClark);
		queue.printQueue();
		
		System.out.println("Queue front element before :- "+queue.peek());
		
		queue.remove();
		System.out.println("Queue front element after :- "+queue.peek());
		
	}

}
