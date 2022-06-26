package com.employeewage;

public class EmployeeWageBuilder {
	
	public static void main(String[] args) {
		
		System.out.println(" ---- Welcome to Employee Wage Computation Program on Master Branch ---- ");
	
		int is_present=2;
		int is_presentPartTime=1;
		int wagePerHour=20;
		int workingHours=8;
		int partTimeHours=workingHours/2;
		double empCheck=Math.floor(Math.random()*10)%3;
		
		
		if(empCheck==is_present || empCheck==is_presentPartTime)
		{ 
			if(empCheck==is_present)
			{
				int empWage=wagePerHour*workingHours;
				System.out.println("Employee is Present as full time");
				System.out.println("Employee Wage is : "+empWage);
			}
			else
			{
				int empWage=wagePerHour*partTimeHours;
				System.out.println("Employee is Present as Part time  ");
				System.out.println("Employee Wage is : "+empWage);
			}
		}
		else
		{
			int empWage=0;
			System.out.println("Enployee is Absent");
			System.out.println("Employee Wage is :"+empWage);
		}
			

	}
	
}
