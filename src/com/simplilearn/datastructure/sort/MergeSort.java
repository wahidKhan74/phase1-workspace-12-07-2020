package com.simplilearn.datastructure.sort;

public class MergeSort {

	public static void main(String[] args) {
		int [] intArray = { 20, 35, -15, 7, 55, 1, -22};
		System.out.println("Before :");
		printArray(intArray);
		mergeSort(intArray, 0, intArray.length);
		System.out.println("\n After :");
		printArray(intArray);
	}
	
	
	// mergeSort
	public static  void mergeSort(int[] input, int start , int end) {
		
		// break logic 
		if(end-start < 2) {
			return ;
		}
		
		// divide
		int mid = (start + end ) / 2;
		
		//call mergeSort  for first half
		mergeSort(input,start,mid);
		//call mergeSort for second half
		mergeSort(input, mid,end);		
		// call merge 
		merge(input,start,mid,end);
	}

	// merge
	private static void merge(int[] input, int start, int mid, int end) {
		
		if(input[mid-1] <= input[mid]) {
			return ;
		}		
		int i = start ;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		
		while (i<mid && j<end) {
			temp[tempIndex++] = ( input[i] <= input[j]) ? input[i++] : input[j++];
		}		
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	
	// print method
		public static void printArray(int inputs[]) {
			for (int i = 0; i < inputs.length; i++) {
				System.out.print(inputs[i] + " ");
			}
		}
	

}
