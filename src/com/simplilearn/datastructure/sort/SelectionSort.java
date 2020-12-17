package com.simplilearn.datastructure.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] intArray = { 20, 35, -15, 7, 55, 1, -22};
		selectionSort(intArray);
		printArray(intArray);
	}
	
	
	
	// selection sort
	public static void selectionSort(int inputs[]) {
			
		for (int lastUnsortIndex = inputs.length-1 ; lastUnsortIndex >0; lastUnsortIndex--) {			
			int largest = 0;
			for (int i = 1; i <= lastUnsortIndex; i++) {
				if(inputs[i] > inputs[largest]) {
					largest = i;
				}
			}
			swap(inputs, largest, lastUnsortIndex);
		}
	}
	
	// swap method
	public static void swap(int[] inputs, int i , int j) {
		if(i==j) {
			return ;
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
