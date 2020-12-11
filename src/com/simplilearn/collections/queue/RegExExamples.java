package com.simplilearn.collections.queue;

import java.util.regex.Pattern;

public class RegExExamples {

	public static void main(String[] args) {
		
		// pattern for accepting alpha numeric
		System.out.println(Pattern.matches("[a-zA-z0-9]+", "abcPQR12")); //true
		
		// Pattern for accepting alphanumeric character but only of length 10.
		System.out.println(Pattern.matches("[a-zA-z0-9]{10}", "abcPQR1209")); //true
		
		
		// Pattern for accepting alphanumeric character but  min 2 max 6.
		System.out.println(Pattern.matches("[a-zA-z0-9]{2,6}", "a")); //true
		
		// Write a validation patter for username -> aphanumeric value of min 3 and mx 15.
		String username = "JohnKim123";
		System.out.println(Pattern.matches("[a-zA-z0-9]{3,15}", username)); //true
		
		String email = "johnsmith12@gmail.com";
		String pattern ="[a-z0-9]+(.+)@(.+)" ;
		
		System.out.println(Pattern.matches(pattern, email)); //true
		

	}

}
