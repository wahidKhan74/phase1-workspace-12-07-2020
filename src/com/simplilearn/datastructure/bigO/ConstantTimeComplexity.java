package com.simplilearn.datastructure.bigO;

public class ConstantTimeComplexity {

	// This method runs in O(1) time  -> Constant Time Complexity
	public static void displayOne(int[] items) {
		System.out.println(items[2]);
	}

	// This method runs in O(1 + 1) time  -> O(2)  -> O(1) -> Constant Time Complexity
	public static void displayTwo(int[] items) {
		System.out.println(items[0]); // 1
		System.out.println(items[2]);  // 1 
	}

	public static void main(String[] args) {
		int[] items = {1,2,3,4,5,6,7,8,9,10};
		displayOne(items);

	}

}
