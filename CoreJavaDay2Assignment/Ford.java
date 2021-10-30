package com.sonata;

public class Ford extends Car{
	int year;
	int manufactureDiscount;
	Ford(int speed,double regularPrice,String color,int year,int manfacdisc)
	{
		super(speed,regularPrice,color);
		this.year=year;
		this.manufactureDiscount=manfacdisc;
	}
		public double getSalePrice()
		{
			return super.getSalePrice()-manufactureDiscount;
		}
	public static void main(String args[])
	{
		Ford f=new Ford(250,1400000,"blue",2019,5000);
		System.out.println(f.getSalePrice());
	}

}
