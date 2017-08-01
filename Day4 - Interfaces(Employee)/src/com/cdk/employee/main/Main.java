package com.cdk.employee.main;

import com.cdk.employee.company.*;
import com.cdk.employee.employee.*;

class Main {
	public static void main(String[] args) {
		
		EmployeeService employee = new EmployeeService(76, "ABC", Month.JAN, Year._2016);
		employee.getDetails();
		
		CompanyService company = new CompanyService("BVG", 89, City.Pune);
		company.getDetails();
	}
}