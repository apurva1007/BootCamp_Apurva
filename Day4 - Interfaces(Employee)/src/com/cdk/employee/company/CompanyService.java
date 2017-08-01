package com.cdk.employee.company;

public class CompanyService extends Company {
	
	public CompanyService(String name, int strength, City city) {
		super(name, strength, city);
	}
	
	public void getDetails() {
		System.out.println("name: " + this.name);
		System.out.println("strength: " + this.strength);
		System.out.println("city: " + this.city);
	}
}