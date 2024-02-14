package com.javaBasics;

public class Student 
{
	
	//Student details	
	
	//class variables
	private int rollNo = 2390;
	private String name = "XYZ";
	private float marks = 56.34f;
	private char section = 'D';
	
	
	public void getStudent1()
	{
		//local variable
		String address = "Hyderabad";
		
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(section);
		
		System.out.println(address);
		
	}
	
	public void getStudent2()
	{
		
		System.out.println(section);
		
	}

}
