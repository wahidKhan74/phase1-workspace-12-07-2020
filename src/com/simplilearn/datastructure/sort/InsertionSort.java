package com.simplilearn.datastructure.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		insertionSort(intArray);
		printArray(intArray);

	}
	// insertion sort
	public static void insertionSort(int[] intArray) {
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

			int element = intArray[firstUnsortedIndex];

			int i;
			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > element; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = element;
		}
	}

	// print method
	public static void printArray(int inputs[]) {
		for (int i = 0; i < inputs.length; i++) {
			System.out.print(inputs[i] + " ");
		}
	}

}
