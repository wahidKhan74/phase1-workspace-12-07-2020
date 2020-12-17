package com.simplilearn.datastructure.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Before :");
		printArray(intArray);
		quickSort(intArray, 0, intArray.length);
		System.out.println("\n After :");
		printArray(intArray);
	}

	// quick sort
	public static void quickSort(int[] input, int start, int end) {

		if (end - start < 2) {
			return;
		}
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}

	// partition method
	private static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		while (i < j) {

			// empty body for loop
			while (i < j && input[--j] >= pivot)
				;
			if (i < j) {
				input[i] = input[j];
			}

			// empty body for loop
			while (i < j && input[++i] <= pivot)
				;
			if (i < j) {
				input[j] = input[i];
			}

		}
		input[j] = pivot;
		return j;
	}

	// print method
	public static void printArray(int inputs[]) {
		for (int i = 0; i < inputs.length; i++) {
			System.out.print(inputs[i] + " ");
		}
	}
}
