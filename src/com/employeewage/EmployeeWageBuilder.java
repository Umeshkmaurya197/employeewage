package com.employeewage;

public class EmployeeWageBuilder {
	
	public static void main(String[] args) {
		
		System.out.println(" ---- Welcome to Employee Wage Computation Program on Master Branch ---- ");
	
		 int is_present=1;
		 int wagePerHour=20;
		 int workingHours=8;
		 double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck == is_present )
		{			
			int empWage=wagePerHour*workingHours;
			System.out.println(" Employee is Present ");
		    System.out.println(" Employee Wage is : "+empWage);
		}
		else
		{	
			int empWage=0;
			System.out.println(" Employee is Absent ");
			System.out.println(" Employee Wage is : "+empWage);
		}	
			

	}
	
}
