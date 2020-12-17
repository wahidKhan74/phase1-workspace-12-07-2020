package com.simplilearn.datastructure.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] intArray = { 20, 35, -15, 7, 55, 1, -22};
		System.out.println("Before :");
		printArray(intArray);
		bubbleSort(intArray);
		System.out.println("After :");
		printArray(intArray);
	}

	// bubble sort
	public static void bubbleSort(int[] inputs) {
		for(int lastUnsortedIndex = inputs.length-1; lastUnsortedIndex >0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if(inputs[i]> inputs[i+1]) {
					swap(inputs, i, i+1);
				}
			}
		}
	}
	
	// swap method
	public static void swap(int[] inputs, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = inputs[i];
		inputs[i] = inputs[j];
		inputs[j] = temp;
	}

	// print method
	public static void printArray(int inputs[]) {
		for (int i = 0; i < inputs.length; i++) {
			System.out.print(inputs[i] + " ");
		}
	}

}
