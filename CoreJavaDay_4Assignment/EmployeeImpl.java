package com.sonata;

import java.util.LinkedList;
import java.util.List;


public class EmployeeImpl implements EmployeeInter {
	List<Employee> l1=new LinkedList<>();
	@Override
	public void addEmployee(Employee e)
	{
		l1.add(e);
		System.out.println(e);
	}
	@Override
	public  void deleteEmployee(Employee e1)
	{
		System.out.println(e1);
		
	}
	@Override
	public void yearSalary(Employee e1)
	{
		System.out.println(e1.getSalary());
	}
	@Override
	public void addSalary(Employee e1)
	{
		if(e1.getSalary()<10000)
		{
			System.out.println(e1.getSalary()+5000);
		}
		else
		{
			System.out.println(e1.getSalary());
		}
		
	}
	
	
}
