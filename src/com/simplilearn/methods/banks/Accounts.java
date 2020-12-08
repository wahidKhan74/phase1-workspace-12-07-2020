package com.simplilearn.methods.banks;

public class Accounts {
	
	private double balance = 2983.83;
	private String name  = "Joe Smith";
	private String bankName ="Apana Bank";
	
	
	// Show Balance
	public double showBalance() {
		System.out.println("User is :"+ name +" and balance amount is : "+balance);
		return balance;
	}
	
	public void Welcome() {
		System.out.println("----------------------");
		System.out.println(" Welcome to "+bankName);
		System.out.println("----------------------");
	}
	// Withdraw
	public double withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
		}		
		System.out.println("User is :"+ name +" and balance amount is : "+balance);
		return balance;
	}
	
	// Deposit
	
}
