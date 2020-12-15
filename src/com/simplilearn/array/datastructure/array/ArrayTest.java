package com.simplilearn.array.datastructure.array;

public class ArrayTest {
	
	// This method runs in O(n) time 
	public static void displayall(int[] items) {
		for(int i=0;i<items.length ;i++) {
			System.out.println("The index " + i+ " and value " + items[i]);
		}
		for(int item : items) {
			System.out.println("The value " + item);
		}
		
	}

	public static void main(String[] args) {
		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		displayall(items);

	}

}
