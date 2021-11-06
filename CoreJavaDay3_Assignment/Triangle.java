package com.sonata;

public class Triangle extends Shape {

	@Override
	public double  area()
	{
		return(width*height)/2;
	}
	Triangle(double w,double h)
	{
		this.width=w;
		this.height=h;
	}
	public static void main(String args[])
	{
		Triangle t=new Triangle(20,15);
		System.out.println("area of triangle: "+t.area());
	}


}
