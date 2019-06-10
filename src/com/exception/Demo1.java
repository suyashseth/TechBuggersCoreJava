package com.exception;

import java.util.Scanner;

public class Demo1 {

	public void division(double a,double b)
	{
		try
		{
			double c = a/b;
			System.out.println("Result = "+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Occured");
		}

	}

	public static void main(String[] args) {

		System.out.println("Program Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		double a = sc.nextDouble();

		System.out.println("Enter Second value");
		double b = sc.nextDouble();

		Demo1 d = new Demo1();
		d.division(a, b);
		System.out.println("Program ended");

	}
}
