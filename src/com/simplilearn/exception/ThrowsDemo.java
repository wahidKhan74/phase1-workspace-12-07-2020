package com.simplilearn.exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void m1(String s1) throws IOException {
		/// throws keyword is used to declare an exception.
		if(s1==null) {
			throw new IOException("String with 'null' is not allowed !");
		} else {
			System.out.print("The String Lenth is ::"+s1.length());
		}
	}
	
	public static void main(String[] args) {
		
		try {
			m1(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
