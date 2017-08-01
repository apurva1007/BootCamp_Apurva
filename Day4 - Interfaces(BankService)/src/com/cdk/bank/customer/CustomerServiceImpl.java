package com.cdk.bank.customer;

import com.cdk.bank.accounts.*;

public class CustomerServiceImpl extends AccountServiceImpl implements CustomerService {

	public void details() {
		System.out.println("Details displayed");
	}
	
	public void updateAddress() {
		System.out.println("Address updated");
	}
	
	public void updateMobile() {
		System.out.println("Mobile number updated");
	}
}