package com.sonata1;

public class ReverseArray {
	public static void main(String arga [])
	{
		//initializing the inputs
		int arr []= {12,34,45,67,88,65,33};
		//revere array through loop
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
