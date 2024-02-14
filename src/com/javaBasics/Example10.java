package com.javaBasics;

public class Example10 {

	public static void main(String[] args) {
		
		int a = 20, b = 30, c = 5;
		
		int expression = a-- - c++ + ++b - ++a;
					   //20 - 5 + 31 - 20 = 26
		
		System.out.println(expression);

	}

}
