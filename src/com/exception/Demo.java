package com.exception;

public class Demo {
	public static void main(String[] args) {


		System.out.println("Program Started");
		try
		{
			System.out.println("inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went Wrong");
		}
		System.out.println("Program ended");



	}
}
