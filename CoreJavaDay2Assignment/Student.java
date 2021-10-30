package com.sonata;

public class Student {
	int stdID;
	String stdName;
	int stdClass;
	//constructor
	Student()
	{
	}
	//parameterized constructor
	Student(int id,String name,int stdclass)
	{
		this.stdID=id;
		this.stdName=name;
		this.stdClass=stdclass;
	}
	//method display
	public void display()
	{
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	public static void main(String args[])
	{
		Student s=new Student();//object
		s.stdID=1;
		s.stdName="varun";
		s.stdClass=9;
		s.display();//method calling
		
		Student s1=new Student(2,"veera",10);
		s1.display();
	}

}
