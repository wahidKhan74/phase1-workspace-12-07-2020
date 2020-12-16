package com.simplilearn.datastructure.stack.linkedstack;

import java.util.LinkedList;

public class LinkedStack {
	
	private LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	//push 
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	// pop
	public Employee pop() {
		return stack.pop();
	}
	
	//peek
	public Employee peek() {
		return stack.peek();
	}
	
	//size
	public int size() {
		return stack.size();
	}
	
	//isEmpty
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	// print stack
	public void printStack() {
		System.out.println(" top ->");
		for(Employee emp : stack) {
			System.out.println(emp);
		}
	}
	
}
