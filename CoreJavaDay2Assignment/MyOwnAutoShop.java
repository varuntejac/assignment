package com.sonata;

public class MyOwnAutoShop {

	MyOwnAutoShop()
	{
	}
	MyOwnAutoShop(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color,length);
	}
	MyOwnAutoShop(int speed,double regularPrice,String color, int year, int manfacdisc)
	{
		super(speed,regularPrice,color,year,manfacdisc);
	}
	public static void main(String[] args) 
	{
		Car myCar = new Car (130, 700000.0, "Red");
		myCar.speed=130;
		myCar.regularPrice=7000000;
		myCar.color="white";
		Sedan mySedan = new Sedan(120, 4000000.0, "Black",19);
		Ford myFord1 = new Ford (160,5000000.0,"Blue",2008, 500);
		Ford myFord2 = new Ford (140,4000000.0,"Pink",2009, 1000);
		System.out.println("MySedan Price"+ mySedan.getSalePrice()+"\n");
		System.out.println("MyFord1 Price "+ myFord1.getSalePrice()+"\n");
		System.out.println("MyFord2 Price"+ myFord2.getSalePrice()+"\n");
		System.out.println("MyCar Price "+ myCar.getSalePrice()+"\n");
	}

}
