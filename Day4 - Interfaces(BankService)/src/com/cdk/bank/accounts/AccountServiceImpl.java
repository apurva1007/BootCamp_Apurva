package com.cdk.bank.accounts;

public class AccountServiceImpl implements AccountService {
	
	public void open() {
		System.out.println("Account Openend");
	}
	
	public void close() {
		System.out.println("Account closed");
	}
	
	public void withdraw() {
		System.out.println("Money Withdrawn");
	}
	
	public void deposit() {
		System.out.println("Money Deposited");
	}
	
	public void balance(){
		System.out.println("Balance displayed");
	}
	
}