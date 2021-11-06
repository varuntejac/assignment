package com.sonata;

public class Rectangle extends Shape{
	@Override
	public double  area()
	{
		return length*width;
	}
	Rectangle(double l,double h)
	{
		this.length=l;
		this.height=h;
	}
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(20,15);
		System.out.println("area of Rectangle: "+r.area());
	}

}
