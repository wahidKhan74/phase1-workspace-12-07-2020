package com.simplilearn.exception.bank;

public class AccountException extends Exception {
	
	String message;
	
	AccountException(String message){
		this.message =  message;
	}
	
	public String toString() {
		return " ::: Account Exceptions Occured :" + message;
	}
}
