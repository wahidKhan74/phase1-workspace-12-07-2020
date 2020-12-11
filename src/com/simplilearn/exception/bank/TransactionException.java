package com.simplilearn.exception.bank;

public class TransactionException extends Exception {
	
	String message;
	
	TransactionException(String message){
		this.message =  message;
	}
	
	public String toString() {
		return " ::: Trasaction Exceptions Occured :" + message;
	}
}
