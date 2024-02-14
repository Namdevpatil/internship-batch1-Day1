package com.javaBasics;

public class Example13
{

	public static void main(String[] args) 
	{	
	
		double studentMarks[] = {30.29, 20.69, 23.92, 33.23, 45.49};//always has the fixed size	
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			System.out.println(studentMarks[i]);
		}
		
		System.out.println("-------------marks > 30.00--------------------");
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			if(studentMarks[i] > 30.00)
			{
				System.out.println(studentMarks[i]);
			}
		}
		
	}

}
