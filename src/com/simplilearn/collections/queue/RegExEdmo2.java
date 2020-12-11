package com.simplilearn.collections.queue;

import java.util.regex.Pattern;

public class RegExEdmo2 {

	public static void main(String[] args) {
		
		//2nd way with regxExp.
		boolean res = Pattern.compile("..x").matcher("cdx").matches();

		System.out.println("String matches :" + res);
		
		// 3rd way regxEx
		Pattern.matches("..x", "cdx");
		
		System.out.println("String matches :" + res);
		
	}

}
