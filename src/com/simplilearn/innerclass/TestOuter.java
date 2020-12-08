package com.simplilearn.innerclass;

// outer class
public class TestOuter {
	
	private int data = 100;
	public String msg = " Today is good day !";
	
	//  inner class -> non static 
	class TestInner {
		
		// inner class method
		public void showData() {
			System.out.println(" Data  :: "+ data);
			System.out.println(" Msg :: " + msg);
		}
	}
	
	public static void main(String args[]) {
		
		// Outer class object
		TestOuter outer  = new TestOuter();
		
		// Inner class 
		TestOuter.TestInner inner = outer.new TestInner();
		
		inner.showData();
		
	}

}
