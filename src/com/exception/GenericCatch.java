package com.exception;

public class GenericCatch {

	public static void main(String[] args) {

		int ar[] = {1,2,3};
		int a = 10;
		int b = 0;
		int c;

		try
		{
			c = a/b;
			System.out.println(ar[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception Occured");
		}







	}
}
