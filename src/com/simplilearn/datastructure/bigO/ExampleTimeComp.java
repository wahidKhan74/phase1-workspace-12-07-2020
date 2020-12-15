package com.simplilearn.datastructure.bigO;

public class ExampleTimeComp {

	// This method runs in O(n) time -> Linear Time Complexity
	public static void display(int[] items) {
		System.out.println(items[0]);
		for (int item : items)
			System.out.println(item);
		System.out.println(items[4]);
	} // O( 1 + n + 1) O(2+n) -> O(n)

	// This method runs in O(n) time -> Linear Time Complexity
	public static void displayTwice(int[] items) {
		System.out.println(items[0]);
		for (int item : items) {
			System.out.println(item);
		}
		int index = 0;
		while (index < items.length) {
			System.out.println(items[index]);
		}

	} // O( 1 + n + n) O(1+2n) -> O(n)

	// This method runs in O(n) time -> Linear Time Complexity
	public static void displayParticiant(int[] items) {
		System.out.println(items[0]);
		for (int item : items) {
			System.out.println(item);
		}
		int index = 0;
		int middle = items.length / 2;
		while (index < middle) {
			System.out.println(items[index]);
		}

	} // O( 1 + n + n/2) O(1+3n/2) -> O(n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
