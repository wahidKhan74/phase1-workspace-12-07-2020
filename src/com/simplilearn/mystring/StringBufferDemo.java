package com.simplilearn.mystring;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Today is good day !");
		System.out.println(str);
		
		str.append(" Enjoy your Learning");
		
		System.out.println(str);
		
		str.replace(0, 1, "t");
		System.out.println(str);
		
		str.delete(0, 1);
		System.out.println(str);
	}

}
