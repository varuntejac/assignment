package com.sonata1;

public class DuplicateValue {
	public static void main(String args [])
	{
		//initializing the inputs
		int arr []= {1,3,5,6,3,6,7,8,9};
		//Searches for duplicate element
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					System.out.println(arr[j]);
				}
				
			}
		}
	}

}
