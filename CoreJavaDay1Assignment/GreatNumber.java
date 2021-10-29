package com.sonata1;

public class GreatNumber {
	public static void main(String args [])
	{
		// initializing the inputs
		int num1=12;
		int num2 =25;
		int num3=89;
		//checking num1 is greater or not
		if((num1>num2)&&(num1>num3))
		{
			System.out.println("the greatest number is:"+num1);
		}
		//checking num2 is greater or not
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("the greatest number is:"+num2);
		}
		//above conditional statements false then it returns else condition
		else
		{
			System.out.println("the greatest number is:"+num3);
		}
	}

}
