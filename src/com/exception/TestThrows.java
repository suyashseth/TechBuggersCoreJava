package com.exception;

public class TestThrows {

	public static void run(int a,int b) throws Exception
	{
		play(a,b);
	}
	public static void play(int a,int b) throws Exception
	{
		division(a,b);
	}
	public static void division(int a,int b)throws Exception
	{
		int c = a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		System.out.println("Program Started");
		try
		{
			run(10,0);
		}catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
		System.out.println("Program Ended");


	}
}
