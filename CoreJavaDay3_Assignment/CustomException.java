package com.sonata;

@SuppressWarnings("serial")
public class CustomException extends Exception{
	double empSal;
	CustomException(String s)
	{
		super(s);
	}
	CustomException()
	{
	}
	public void show() throws CustomException
	{
		if(empSal<100000)
		{
			throw new CustomException ("employee salary is less than 100000");
		}
		else
		{
			System.out.println("employee salary is above 100000");
		}
	}
	
	public static void main(String args[]) throws CustomException
	{
		CustomException ec=new CustomException();
		ec.empSal=1909944;
		ec.show();
		
	}

}
