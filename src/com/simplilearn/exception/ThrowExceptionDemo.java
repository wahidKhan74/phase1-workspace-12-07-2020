package com.simplilearn.exception;

import java.io.IOException;

public class ThrowExceptionDemo {

	public static void thowException() {
		
		try {
			if(true) throw new Exception("Exception Message Here ..");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ageValidator(int age) {
		try {
			if(age>18) {
				System.out.println("Welcome to application ..");
			} else {
				throw new IOException("Not a valid Age ..");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThrowExceptionDemo.ageValidator(17);

	}

}
