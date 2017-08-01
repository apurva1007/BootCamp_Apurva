package com.cdk.employee.employee;

public class Employee {
	int id;
	String name;
	Month month;
	Year year;
	
	Employee (int id, String name, Month month, Year year) {
		this.id = id;
		this.name = name;
		this.month = month;
		this.year = year;
	}
}