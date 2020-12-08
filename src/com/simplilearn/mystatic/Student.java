package com.simplilearn.mystatic;

public class Student {
	
	int rollno= 1010; //  instance variable / non static 
	static String college = "ABC college"; // static varaible.
	
	
	// Note : static members are only accessible in static methods
	public static void showCollege(){
		System.out.println(" College Name :: "+ college);
	}
	
	public void display() {
		System.out.println("Roll No. : "+ rollno);
	}
}
