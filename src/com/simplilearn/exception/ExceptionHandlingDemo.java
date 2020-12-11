package com.simplilearn.exception;

public class ExceptionHandlingDemo {

	public static void transaction(int amount , String name) {
		try {
			int balance = 2000;
			int res  = balance / amount;  // arithmatic exception
		
			
			name.length();    /// null pointer exception
			
			int resp = Integer.parseInt(name);
			
			int arr[] = new int[10];
			arr[11] = 230; //
			
			System.out.println("No Exception");
		} catch (ArithmeticException e) {
			System.out.println(" Handled : "+ e.getMessage()); // gives exception message.
			
		} catch (NullPointerException e) {
			System.out.println("Handled : " + e.getMessage()); // give null pointer Exception
		} catch (NumberFormatException e) {
			System.out.println("Handled : " + e.getMessage()); // give null pointer Exception
		} catch (Exception e) {
			System.out.println("Handled : " + e.getMessage() + e.getClass()); 
		}
		System.out.println("Satement after try-catch");
	}
	public static void main(String[] args) {
		ExceptionHandlingDemo.transaction(10,"100");
		
	}

}
