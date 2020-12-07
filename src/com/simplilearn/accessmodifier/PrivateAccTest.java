package com.simplilearn.accessmodifier;

public class PrivateAccTest {

	public static void main(String[] args) {
		
		Father father = new Father();
		
//		father.bankMoney;   // Compile time Error.
//		father.showMoney();
		father.showBalance();
	}

}

class Father {
	
	private double bankMoney = 34534;
	
	private double showMoney() {
		return bankMoney;
	}
	
	public double showBalance() {
		System.out.println("Money ::: "+ bankMoney);
		return bankMoney;
	}
	
//	private Father(){}	
	public Father() {}

}

// Note : Private Constructor based class can not be instatnciated . 
