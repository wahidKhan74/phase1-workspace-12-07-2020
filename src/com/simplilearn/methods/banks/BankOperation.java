package com.simplilearn.methods.banks;

public class BankOperation {

	public static void main(String[] args) {
		
		Accounts ac = new Accounts();
		ac.Welcome();
		double res1 = ac.showBalance();
		double res2 = ac.withdraw(100);
		
		System.out.println("Res1 "+res1);
		System.out.println("Res2 "+res2);

	}

}
