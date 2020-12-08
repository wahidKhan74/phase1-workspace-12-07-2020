package com.simplilearn.innerclass;

// outer class
public class TestOuter2 {
	
	private static int data = 100;
	public static String msg = " Today is good day !";
	
	//  inner class -> static 
	static class TestInner {
		
		// inner class method
		public static void showData() {
			System.out.println(" Data  :: "+ data);
			System.out.println(" Msg :: " + msg);
		}
	}
	
	public static void main(String args[]) {		
		
		// Inner class 
		TestOuter2.TestInner inner = new TestOuter2.TestInner();
		
		inner.showData();
		
	}

}
