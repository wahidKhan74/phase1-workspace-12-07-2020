package com.simplilearn.typecasting;

/**
 * Type Example class for Type Casting Demonstration.
 */
public class TypeExample {

	/**
	 * Main Method.
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Widening or Automatic type conversion
		// byte -> short -> int -> long -> float -> double.
		
		byte countByte = 100;
		
		// implicit conversion from byte -> int
		int count  = countByte;
		
		// implicit conversion from int -> long
		long bigCount = count;
		
		// implicit conversion from long -> float
		float floatingCount = bigCount;
		
		// implicit conversion from long -> double
		double decimalCount = bigCount;
		
		
		System.out.println("Byte Count :: "+countByte);  // sysout  -> press button (ctrl + space)
		System.out.println("Integer Count :: "+count);
		System.out.println("Long Count :: "+bigCount);
		System.out.println("Float Count :: "+floatingCount);
		System.out.println("Decimal Count :: "+decimalCount);

	}

}
