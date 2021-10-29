package com.sonata1;

public class StringReplace {
	public static void main(String args [])
	{
		//initializing the inputs
		String s= "this is core java training";
		//changing string into character array
		char ch []=s.toCharArray();
		//searches for Ovals
		for (int i =0;i<ch.length; i++)
		{
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]='$';
			}
		}
		//printing array character after replace with $
		for (int i = 0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
