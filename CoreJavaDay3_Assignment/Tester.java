package com.sonata;

public class Tester extends Employee {
	Tester(int id,String name,double sal)
	{
		super(id,name,sal);
	}
	public double SalCal()
	{
		return super.SalCal();
	}
	public static void main(String args[])
	{
		Tester t1=new Tester(1,"Veera",150000);//object
		t1.SalCal();
		t1.display();
	}


}
