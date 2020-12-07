package com.simplilearn.accessmodifier;

public class PublicAccTest {

	public static void main(String[] args) {
		
		Mother father = new Mother();
		
		System.out.println(father.bankMoney);  // Compile time Error.
		father.showMoney();
		father.showBalance();
	}

}

class Mother {
	
	public double bankMoney = 34534;
	
	public double showMoney() {
		return bankMoney;
	}
	
	public double showBalance() {
		System.out.println("Money ::: "+ bankMoney);
		return bankMoney;
	}
	
	public Mother() {}

}

// Note : Private Constructor based class can not be instatnciated . 
