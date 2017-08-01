package com.cdk.employee.employee;

public class EmployeeService extends Employee{
	
	public EmployeeService (int id, String name, Month month, Year year) {
		super(id, name, month, year);
	}
	
	public void getDetails () {
		System.out.println("id: " + this.id);
		System.out.println("name: " + this.name);
		System.out.println("joining month: " + this.month);
		System.out.println("joining year: " + this.year);
	}
}
