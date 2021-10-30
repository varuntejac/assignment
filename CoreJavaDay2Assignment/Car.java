package com.sonata;

public class Car {
	int speed;
	double regularPrice;
	String color;
	Car(int speed,double regularPrice,String color){
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	public double getSalePrice()
	{
		return regularPrice;
	}
	public static void main(String args[])
	{
		Car c=new Car(250,1400000,"white");
		System.out.println(c.getSalePrice());
	}

}
