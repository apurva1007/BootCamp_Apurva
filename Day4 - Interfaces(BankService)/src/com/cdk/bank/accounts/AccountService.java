/*1) Write a java application for banking domain where banking 
   functionalities will be designed in the form of interfaces
   and implemented by classes.

   possible interfaces to create
	AccountService
		open()
		close()
		withdraw()
		deposit()
		balance()

	CustomerService
		details()
		updateAddress()
		updateMobile()						
	
   possible classes to create and implement interfaces
	AccountServiceImpl
	CustomerServiceImpl
  	Bank (main class)

Note: interfaces and classes should exist in differen packages with 
	meaningful package names.*/
	
package com.cdk.bank.accounts;

interface AccountService {
	void open();
	void close();
	void withdraw();
	void deposit();
	void balance();
}
