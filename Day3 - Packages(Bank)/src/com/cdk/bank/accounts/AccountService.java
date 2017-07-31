package com.cdk.bank.accounts;

public class AccountService extends Account {
	
	public AccountService() {}
	
	public AccountService(String accountType, long accountNumber) {
		super(accountType, accountNumber);
	}
	
	protected void openAccount() {
		System.out.println("Account Opened");
	}
	
	protected void closeAccount() {
		System.out.println("Account Closed");
	}
} 