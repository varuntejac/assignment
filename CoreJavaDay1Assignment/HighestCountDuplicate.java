package com.sonata1;

public class HighestCountDuplicate {
	public static void main(String args [])
	{
		//initializing the inputs
		int arr []= {1,3,5,6,3,6,1,7,8,1,9,1};
		int maxcounter=0;
		int element=0;
		//Searches for duplicate element
		for(int i=0;i<arr.length-1;i++)
		{
			 int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(maxcounter<count)
			{
				maxcounter=count;
				element=arr[i];
			}
		}
		System.out.println(element+" " +"is highest duplicate count  of"+" "+maxcounter);
}
}
