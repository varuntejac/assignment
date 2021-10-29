package com.sonata1;

public class SpecificValue {
	public static void main(String args [])
	{
		//initializing the inputs
		int arr [] = {12,34,54,66,78,55,78,43,23,66};
		int n=66;
		boolean test=false;
		//checking for the specific value 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				test=true;
				break;
			}
		}
		if(test)
		{
			System.out.println(n+"found");
		}
		else
		{
			System.out.println(n+"not found");
		}
		
	}

}
