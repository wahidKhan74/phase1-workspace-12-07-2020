package com.simplilearn.exception.bank;

import java.util.ArrayList;
import java.util.List;

public class BankOperations {

	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<>();
		accounts.add( new Account(101,"John Smith",192783.34));
		accounts.add( new Account(102,"Will Smith",6757.34));
		accounts.add( new Account(103,"Marry Smith",342783.34));
		accounts.add( new Account(104,"Sam Smith",562783.34));
		
//		showBalance(105,accounts);
		depositAmount(102, accounts, 0);
	}
	
	// show balance
	public static void showBalance(int accountNo,List<Account> accounts) {
		try {
			int count = 0;
			for(Account acc : accounts) {
				if(acc.accNo== accountNo) {
					System.out.println("The Account '"+acc.accNo +"'  has Blance is "+acc.balance);
					count++;
				}
			}
			if(count==0) {
				throw new AccountException("Account does not exist as "+accountNo);
			}
			
		} catch (AccountException e) {
			System.out.println("Failed to load account balance for "+accountNo);
		}
		System.out.println("End of Trasaction !");
	}
	
	// deposit amount
	public static void depositAmount(int accountNo,List<Account> accounts,double depositAmt) {
		try {
			int count = 0;
			for(Account acc : accounts) {
				if(acc.accNo== accountNo) {
					System.out.println("Befor ::: The Account '"+acc.accNo +"'  has Blance is "+acc.balance);
					if(depositAmt <= 0 || depositAmt > 10000) {
						throw new TransactionException("Invalid deposit Amount min=1 and max is 10000");
					}
					acc.balance = acc.balance  + depositAmt;
					System.out.println("After ::: The Account '"+acc.accNo +"'  has Blance is "+acc.balance);
					count++;
				}
			}
			if(count==0) {
				throw new AccountException("Account does not exist as "+accountNo);
			}
			
		} catch (AccountException e) {
			System.out.println("Failed deposit Transaction for "+accountNo);
		} catch (TransactionException e) {
			System.out.println("Failed deposit Transaction for "+accountNo);
		}
		System.out.println("End of Trasaction !");
	}

}
