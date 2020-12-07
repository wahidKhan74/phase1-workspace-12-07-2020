package com.simplilearn.typecasting;

import java.util.Scanner;

public class UserNumberTypeConvertor {

	public static void main(String[] args) {
		
		// Take User Input from console
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("Enter the Integer Value, Type Convertor will convert into:: byte ,short,float and double. ::");
		System.out.println("--------------------");
		
		int userInput = input.nextInt();
		
		byte byteData = (byte) userInput;
		short shortData  =(short) userInput;
		float floatData = userInput;
		double doubleData = userInput;
		
		System.out.println("The User Enter Value is :: "+userInput);
		System.out.println("The Converted Byte Value is :: "+byteData);
		System.out.println("The Converted Short Value is :: "+shortData);
		System.out.println("The Converted float Value is :: "+floatData);
		System.out.println("The Converted double Value is :: "+doubleData);
		

	}

}
