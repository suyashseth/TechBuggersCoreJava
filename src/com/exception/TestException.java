package com.exception;

public class TestException {

	
	public static int run(int a)
	{
		System.out.println("Called run method");
		int b = 10;
		int c= b/a;
		return c;
	}
	public static void main(String[] args) {
	
		System.out.println("Program Started");
		run(0);
		System.out.println("Program end");
		
	}
}
