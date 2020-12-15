package com.simplilearn.datastructure.bigO;

public class LinearTimeComplexity {

	// This method runs in O(n) time -> Linear Time Complexity
	public static void displayAll(int[] items) {
		for (int item : items)
			System.out.println(item);

	}

	public static void main(String[] args) {
		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		displayAll(items);

	}

}
