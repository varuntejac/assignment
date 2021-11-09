package com.sonata;

public class UserEmployee {
		public static void main(String args[])
		{
			Employee e=new Employee();
			e.setEmpId(123);
			e.setEmpName("varun");
			e.setSalary(11098);
			
			Employee e1=new Employee();
			e1.setEmpId(124);
			e1.setEmpName("veera");
			e1.setSalary(7497);
		
			
			EmployeeImpl l1=new EmployeeImpl();
			l1.addEmployee(e);
			l1.deleteEmployee(e1);
			l1.yearSalary(e1);
			l1.addSalary(e1);
			
			
			
			
		}

	}

