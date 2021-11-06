package com.sonata;

public class Square extends Shape {
	@Override
	public double  area()
	{
		return length*length;
	}
	Square(double l)
	{
		this.length=l;
	}
	public static void main(String args[])
	{
		Square s=new Square(20);
		System.out.println("area of Square: "+s.area());
	}

}
