package com.javaBasics;

public class Example11 {

	public static void main(String[] args) {
		
		int a = 20, b = 30, c = 5;
		
		boolean expression = ((a == b || a > b) && (a>b && a < c));
					       //  (0 || 0) && (0 && 0)
						   // 0 && 0 = 0 => false
		
		System.out.println(expression);

	}

}
