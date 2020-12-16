package com.simplilearn.datastructure.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };
		int value = 7;

//		int searchPos = iterativeBs(inputs, value);
//		System.out.println(" The Element " + value + " is found at position :" + searchPos);
		
		int searchPos = recursiveBs(inputs,0,inputs.length-1,value);
		System.out.println(" The Element " + value + " is found at position :" + searchPos);
	}
	
	public static int recursiveBs(int[] inputs, int start, int end, int value) {
		
		// breaking condition -> if value not found
		if (start >= end) {
			return -1;
		}
		
		int midpoint = (start + end) / 2;

		// Mid value is the search value
		if (inputs[midpoint] == value) {
			return midpoint;
		}
		
		// search in right half
		else if (inputs[midpoint] < value) {
			return recursiveBs(inputs, midpoint+1, end, value);
		}
		// search in left half
		else {
			return recursiveBs(inputs, start, midpoint-1, value);
		}

	}

	public static int iterativeBs(int[] inputs, int value) {

		int start = 0;
		int end = inputs.length - 1;

		while (start < end) {
			int midpoint = (start + end) / 2;

			// Mid value is the search value
			if (inputs[midpoint] == value) {
				return midpoint;
			}
			// search in right half
			else if (inputs[midpoint] < value) {
				start = midpoint + 1;
			}
			// search in left half
			else {
				end = midpoint - 1;
			}
		}
		// if not found
		return -1;

	}
}
