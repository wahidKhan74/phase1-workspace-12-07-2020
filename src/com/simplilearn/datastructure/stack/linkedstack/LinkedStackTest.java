package com.simplilearn.datastructure.stack.linkedstack;


public class LinkedStackTest {
	
	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", 100023.23);
		Employee marrySmith = new Employee(102, "Marry Smith", 1000456.23);
		Employee willClark = new Employee(101, "Will Clakk", 1000.23);
		Employee tonyStark = new Employee(102, "Tony Stark", 1000.23);
		Employee ironMan = new Employee(102, "Iron Man", 1000.23);
		
		LinkedStack stack = new LinkedStack();
		
		System.out.println("Stack Size : "+stack.size());
		System.out.println("Stack is empty : "+stack.isEmpty());
		
		stack.push(johnSmith);
		stack.push(marrySmith);
		
		System.out.println("Stack Size : "+stack.size());
		System.out.println("Stack is empty : "+stack.isEmpty());
		
		stack.push(willClark);
		stack.printStack();
		
		System.out.println("Stack top element before: "+stack.peek());
		stack.pop();
		System.out.println("Stack top element after: "+stack.peek());
		
	}
}
