package com.sonata;

public class Employee {
	int eid;
	String ename;
	double esal;
	Employee(int id,String name,double sal)
	{
		this.eid=id;
		this.ename=name;
		this.esal=sal;
	}
	public void display()
	{
		System.out.println("empid:"+eid);
		System.out.println("empname:"+ename);
		System.out.println("empsal:"+esal);
	}
	public double SalCal()
	{
		return esal;
	}
	public static void main(String args[])
	{
		Employee e1=new Employee(12,"Varun",25000);
		e1.SalCal();
		e1.display();
	}
	

}
