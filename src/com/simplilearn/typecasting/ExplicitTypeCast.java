package com.simplilearn.typecasting;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		//  Explicit type cast or Narrowing.
		// double -> float -> long -> int -> short -> byte.
		
		double price  = 100.69;
		
		long priceLong = (long) price;
		
		int priceInt = (int) priceLong;
		
		float priceFloat = (float) price;
		
		byte priceByte = (byte) priceInt;
		
		
		System.out.println("Double Price Value :: "+price);
		System.out.println("Long Price Value :: "+priceLong);
		System.out.println("Int Price Value :: "+priceInt);
		System.out.println("Byte Price Value :: "+priceByte);
		System.out.println("Float Price Value :: "+priceFloat);

	}

}
