package com.simplilearn.datastructure.stack;

import java.util.Stack;

public class StakDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(10);
		stack.push(20);
		stack.push(13);
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());

	}

}
