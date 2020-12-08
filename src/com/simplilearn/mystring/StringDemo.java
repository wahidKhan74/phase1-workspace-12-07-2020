package com.simplilearn.mystring;

public class StringDemo {

	public static void main(String[] args) {
		// String literal
		String str1 = "Hello";
		
		String str2 = "Hello";  // it does not create a new instance 
		
		System.out.println("Str1 :"+ str1.hashCode());
		System.out.println("Str2 :"+ str2.hashCode());
		
		if(str1 == str2 ) {
			System.out.println("Same String");
		}
		
		str1 = "Hi";
		
		System.out.println("Str1 :"+ str1);
		System.out.println("Str2 :"+ str2);
		
		
		String name1 = new String("John Smith");		
		String name2 = new String("John Smith");

		if(name1 == name2) {
			System.out.println("Same Name");
		} else {
			System.out.println("Different Name");
		}

	}

}
