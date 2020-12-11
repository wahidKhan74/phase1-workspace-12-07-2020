package com.simplilearn.collections.queue;

import java.util.regex.Pattern;

public class RegExDemo3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[xyz]", "x"));  // true // it is not  x or y or z as single value.
		System.out.println(Pattern.matches("[xyz]", "xyx"));  // false // it is not  x or y or z as single value.		
		System.out.println(Pattern.matches("[xyz]", "xxyzzz"));  // false // it is not  x or y or z as single value.
		
		System.out.println(Pattern.matches("[xyz]?", "z"));  // true // (one match)
		System.out.println(Pattern.matches("[xyz]?", "yz"));  // false // more than one char
		System.out.println(Pattern.matches("[xyz]?", "p"));  // false // more than one char
		
		System.out.println(Pattern.matches("[xyz]+", "z"));  // true // (one or more than match)
		System.out.println(Pattern.matches("[xyz]+", "zz"));  // true // (one match)
		System.out.println(Pattern.matches("[xyz]*", "p"));  // true // (one match) (x y z may comes zero or more than one
		
		System.out.println(Pattern.matches("[a-z]+", "mkn")); //true
		System.out.println(Pattern.matches("[A-Z]+", "PQR")); //true
		System.out.println(Pattern.matches("[a-zA-Z]+", "mknPQR")); //true
		
		System.out.println(Pattern.matches("[0-9]+", "99")); //true
		System.out.println(Pattern.matches("[0-9]", "9")); //true
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "WahidKhan74")); //true
		System.out.println(Pattern.matches("\\d", "7")); //true
		System.out.println(Pattern.matches("\\D", "p")); //true
		System.out.println(Pattern.matches("\\D", "p7")); //false
	}

}
