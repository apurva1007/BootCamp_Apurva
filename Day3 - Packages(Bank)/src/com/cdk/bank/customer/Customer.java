package com.cdk.bank.customer;

import com.cdk.bank.accounts.*;

public class Customer extends AccountService {
	String name;
	int custID;
	int balance;
	
	public Customer() {}
	
	public Customer(String accountType, long accountNumber, String name, int custID, int balance) {
		super(accountType, accountNumber);
		this.name = name;
		this.custID = custID;
		this.balance = balance;
	}
	
	public void details() {
		openAccount();
		closeAccount();
	}

}
