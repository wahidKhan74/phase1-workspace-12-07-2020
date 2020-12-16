package com.simplilearn.datastructure.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] inputs = {20,50,35,-15,7,1,55,-22};
		int value = 55;
		
		int searchPos = linearSearch(inputs, value);
		System.out.println(" The Element "+value +" is found at position :"+searchPos);
	}
	
	public static int linearSearch(int[] input , int value) {
		// search through an array
		for(int index = 0; index < input.length; index++) {
			if(input[index]==value) {
				return index;
			}
		}
		
		return -1;
	}

}
