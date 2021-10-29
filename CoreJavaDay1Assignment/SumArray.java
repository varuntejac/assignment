package com.sonata1;

public class SumArray {
	public static void main(String args [])
	{
		//initializing the inputs
		int a []= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("the sum of the array values is :"+sum);
	}


}
