package com.simplilearn.datastructure.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {
		
		Integer arr[] = new Integer[] { 7,10,4,3,20,15 };
		int kthSmallest = 2;
		
		int res  = findKthSmallest(arr,kthSmallest);
		System.out.println("The kth smallest element is "+ res);
	}

	private static int findKthSmallest(Integer[] arr, int kthSmallest) {
		
		// Sort the given array
		Arrays.sort(arr);
		
		// return kth element;
		return arr[kthSmallest-1];
		
	}

	
	

}
