package com.simplilearn.exception.bank;

public class Account {
	
	public int accNo;
	public String name;
	public double balance;
	
	Account(){}

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
}
