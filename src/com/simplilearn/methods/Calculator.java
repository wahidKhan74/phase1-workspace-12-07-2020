package com.simplilearn.methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();	
		
		Scanner input = new Scanner(System.in);
		System.out.println(":: Welcome to calculator ::");
		System.out.println(" Enter number 1 :: ");
		int num1 = input.nextInt();
		System.out.println(" Enter number 2 :: ");		
		int num2 = input.nextInt();
		
		cal.add(num1, num2);
		cal.sub(num1, num2);
		
	}
	
//	addition  operation
	public void add(int num1 , int num2) {
		int result = num1 + num2;
		System.out.println("Addition :"+ result);
	}
	
//	substration operation
	public void sub(int num1 , int num2) {
		int result = num1 - num2;
		System.out.println("Substration :"+ result);
	}
	
//	multiplication operation
	
//	division operation
	

}
