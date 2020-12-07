package com.simplilearn.typecasting;

import java.util.Scanner;

public class StringToNumericConversion {

	public static void main(String[] args) {
		
		// String to Numeric => The String should be convertible
		Scanner input = new Scanner(System.in);

		System.out.println("--------------------");
		System.out.println("Enter a convertable string");
		System.out.println("--------------------");

		String price = input.nextLine();

		// String to Int
		int priceInt = Integer.parseInt(price);
		byte priceByte = Byte.parseByte(price);
		double priceDouble = Double.parseDouble(price);

		System.out.println("Integer Price :: " + priceInt);
		System.out.println("Byte Price :: " + priceByte);
		System.out.println("Double Price :: " + priceDouble);
	}

}
