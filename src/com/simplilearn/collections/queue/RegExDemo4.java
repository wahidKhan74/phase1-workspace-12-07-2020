package com.simplilearn.collections.queue;

import java.util.regex.Pattern;

public class RegExDemo4 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".m", "am"));  // first char can be nay values but 2nd char should be 'm'.
		System.out.println(Pattern.matches(".m", "pm"));  // first char can be nay values but 2nd char should be 'm'.
		System.out.println(Pattern.matches("..m", "ppm"));  // first and 2nd char can be nay values but 3rdchar should be 'm'.
		System.out.println(Pattern.matches("m.", "nx"));  // first should be 'm' but 2nd can be any value.
		System.out.println(Pattern.matches("m..", "mxx"));  // first should be 'm' but 2nd and 3rd can be any value.
		System.out.println(Pattern.matches(".m.", "NnN"));  // first ,3rd can be any value but 2nd value should be m.
	}

}
