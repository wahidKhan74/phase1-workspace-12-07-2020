package com.simplilearn.datastructure.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };
		int value = 7;
		
		int searchPos = exponentialSearch(inputs,value);
		System.out.println(" The Element " + value + " is found at position :" + searchPos);
	
		
	}
	
	public static int exponentialSearch(int[] inputs, int value) {
		//	start with 0 index
		if(inputs[0]==value) {
			return 0;
		}
		
		//1. double method
		int i = 1;
		while(i<inputs.length && inputs[i]<=value) {
			i=i*2;
		}
		// 2. 
		return Arrays.binarySearch(inputs, i/2, Math.min(i, inputs.length), value);
	}
}
