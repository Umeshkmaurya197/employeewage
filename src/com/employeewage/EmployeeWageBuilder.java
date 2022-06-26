package com.employeewage;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		
		System.out.println(" ---- Welcome to Employee Wage Computation Program on Master Branch ---- ");
		
		int is_present=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck == is_present )
			System.out.println(" Employee is Present ");
		else
			System.out.println(" Employee is Absent ");
		
		
	}
	
}
