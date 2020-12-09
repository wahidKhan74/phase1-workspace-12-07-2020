package com.simplilearn.mystring;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Tommorow is ParleG");
		
		System.out.println(sb);
		
		sb.append(" Happy Eating !");
		System.out.println(sb);
		
		System.out.println(sb.insert(0, "Welcome "));
		
		System.out.println(sb.reverse());
		
		///Conversion of String to StringBuffer and StringBuilder
		
		String str = "Hello";
		StringBuffer sbr = new StringBuffer(str);
		System.out.println(sbr.reverse());
		
		String str2 = "World";
		StringBuilder sbl = new StringBuilder(str2);
		System.out.println(sbl.reverse());
		

	}

}
