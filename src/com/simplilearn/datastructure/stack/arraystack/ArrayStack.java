package com.simplilearn.datastructure.stack.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private int top;
	private Employee[] stack;
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	// push 
	public void push(Employee employee) {		
		// stack is full -> if full increase capacity
		if(top == stack.length) {
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack= newArr;
		}
		// add value in stack array
		stack[top++]= employee;
	}
	
	//pop -> pop remove top element from stack return same element
	public Employee pop() {
		// verify stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		} 
		// remove element from top
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}
	
	// peek 
	public Employee peek() {
		//verify stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	
	
	public int size() {
		return top;
	}
	
	public int capacity() {
		return stack.length;
	}
	
	public boolean isEmpty() {
		return top ==0;
	}
	
	public void printStack() {
		System.out.println(" top ->");
		for (int i = top-1; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	
}
