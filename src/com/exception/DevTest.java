package com.exception;

public class DevTest {

	public static void main(String[] args) {

		System.out.println("program Started");
		Developer d = new Developer();
		d = null;
		try
		{
			d.code();
			System.out.println(10/0);
			   
		}
		catch(Exception a)
		{
			a.printStackTrace();
			System.out.println("Exception Occured");
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Occured");
		}
		catch(NullPointerException e)
		{
			System.out.println("ref is not Initialized");
		}*/
		System.out.println("Program Ended");

	}
}
