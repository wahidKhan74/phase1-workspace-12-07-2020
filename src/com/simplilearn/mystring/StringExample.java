package com.simplilearn.mystring;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = new String("Hello String");
		
		System.out.println(str1);
		System.out.println(str1.length());
		
		//substring
		System.out.println(str1.substring(2));
		
		//String Comparison
		String name = "Mike2";
		String dname = "Mike";
		System.out.println(name.equals(dname));
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		String str2 = "Heldo";
		String replace = str2.replace('d', 'l');
		System.out.println(replace);
		
		
		String str3 = "Mike";
		String updStr = str3.concat(" Smith");
		System.out.println(updStr);	
	

	}

}
