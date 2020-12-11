package com.simplilearn.collections.queue;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("1. Logic outside try");
		try {
			// code that may raise exception.
			int data = 100/0;
			System.out.println("2. Logic inside try");
		} catch (Exception e) {
			System.out.println("3.Exception Occ..");
		} finally {
			// clean up activity. -> 
			System.out.println("3.Always Exicuting block");
		}
		System.out.println("4. Logic End");
	}

}
