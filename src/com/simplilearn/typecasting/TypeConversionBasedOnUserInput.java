package com.simplilearn.typecasting;

import java.util.Scanner;


public class TypeConversionBasedOnUserInput {

	public static void main(String[] args) {
		
		// Take User Input from console
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 100.");
	    
		int userNumber = input.nextInt();
		
		double userDoubleValue = userNumber;
		
		long userLongValue = userNumber;
		
		float userFloatValue = userNumber;
		
		
		System.out.println("Integer Count :: "+userNumber);
		System.out.println("Long Count :: "+userLongValue);
		System.out.println("Float Count :: "+userFloatValue);
		
		
	}

}
