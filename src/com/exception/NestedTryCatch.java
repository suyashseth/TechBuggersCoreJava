package com.exception;

import java.io.FileReader;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		FileReader fr;
		
		
		try
		{
		   System.out.println(10/2);
		}
		catch(Exception e)
		{
		   System.out.println("Exception Occured");
		}
		finally {
			System.out.println("Finally block Executed");
		}
		
		
		
		
		
	}
}
