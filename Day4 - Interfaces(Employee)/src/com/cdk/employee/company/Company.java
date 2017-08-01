package com.cdk.employee.company;

public class Company {
	String name;
	int strength;
	City city;
	
	Company(String name, int strength, City city) {
		this.name = name;
		this.strength = strength;
		this.city = city;
	}
}