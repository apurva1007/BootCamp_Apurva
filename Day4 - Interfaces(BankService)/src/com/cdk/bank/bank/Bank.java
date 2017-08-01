package com.cdk.bank.bank;

import com.cdk.bank.accounts.*;
import com.cdk.bank.customer.*;

class Bank {
	
	public static void main(String[] args) {
	
		CustomerServiceImpl cust = new CustomerServiceImpl();
		
		cust.open();
		cust.close();
		cust.withdraw();
		cust.deposit();
		cust.balance();
		
		cust.details();
		cust.updateAddress();
		cust.updateMobile();
	}
}
	