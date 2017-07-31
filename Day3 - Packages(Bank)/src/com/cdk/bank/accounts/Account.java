package com.cdk.bank.accounts;

public class Account {
	String accountType = "DFG";
	long accountNumber = 74979L;
	
	public Account() {
		
	}
	
	public Account(String accountType, long accountNumber) {
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}
	
} 