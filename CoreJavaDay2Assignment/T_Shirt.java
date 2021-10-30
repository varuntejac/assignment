package com.sonata;

public class T_Shirt {
	String color;
	String material;
	String design;
	String brand;
	//constructor
	T_Shirt()
	{
	}
	//Parameterized constructor
	T_Shirt(String color,String material,String design)
	{
		this.color=color;
		this.material=material;
		this.design=design;
	}
	//Parameterized constructor
	T_Shirt(String color,String material,String design,String brand)
	{
		this.color=color;
		this.material=material;
		this.design=design;
		this.brand=brand;
	}
	//display method for displaying details
	public void display( String size)
	{
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
		System.out.println(size);
	}
	/*
	public String differentSize(String size)
	{
		return size;
	}*/
	public static void main(String args[])
	{
		T_Shirt s=new T_Shirt();//object
		s.color="black";
		s.material="cotton";
		s.design="trend";
		//calling display method
		s.display("small");
		//System.out.println(s.differentSize("small"));
		
		T_Shirt s1=new T_Shirt("blue","silk","oldfashion");//object
		//calling display method
		s1.display("large");
		//System.out.println(s1.differentSize("large"));
		T_Shirt s2=new T_Shirt("white","nilon","newfashion");//object
		//calling display method
		s2.display("X-large");
		//System.out.println(s2.differentSize("x-large"));
		
	}
	

}
