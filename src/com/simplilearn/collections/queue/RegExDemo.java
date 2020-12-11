package com.simplilearn.collections.queue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
//		1st way  working with regx
		String data  = "cdx";
		
//		step1 : Defined a pattern
		Pattern p = Pattern.compile("..x");
		
//		step2 : Add Matcher
		Matcher mat = p.matcher(data);
		
//		step3 : Compare values
		boolean res = mat.matches();
		
		System.out.println("String matches 1 " + res);
	}

}
