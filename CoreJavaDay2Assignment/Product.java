package com.sonata;

public class Product {
	int proID;
	String proName;
	double proPrice;
	public double tax(double gst)
	{
		return this.proPrice=this.proPrice+gst;
	}
	public static void main(String args[])
	{
		Product p=new Product();//object
		p.proID=34;
		p.proName="varun";
		p.proPrice=34567.99;
		System.out.println(p.tax(456.9));
	}

}
