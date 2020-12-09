package com.simplilearn.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// array is a order collection of similar type data value
		int numbers[] = {10,20,30,40,50,60};
		
		System.out.println(numbers[1]);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element of array at index "+i+" value :"+numbers[i]);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==40) {
				numbers[i]=41;
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
