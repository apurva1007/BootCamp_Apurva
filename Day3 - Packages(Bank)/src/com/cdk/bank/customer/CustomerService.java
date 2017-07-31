package com.cdk.bank.customer;

import com.cdk.bank.accounts.*;

public class CustomerService extends Customer {
	
	public CustomerService() {}
	
	protected float getBalance() {
		return this.balance;
	}
	
	private void withdrawMoney() {
		System.out.println("Money withdrawn");
	}
	
	public void depositMoney() {
		System.out.println("Money Deposited");
	}
	
	public void serve() {
		getBalance();
		withdrawMoney();
	}
			
}