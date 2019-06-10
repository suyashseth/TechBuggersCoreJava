package com.exception;

import java.io.File;
import java.io.FileReader;

public class CheckedTest {

	public static void main(String[] args) {

//Checked Exception

		File f = new File("");
		try
		{
		
		FileReader file = new FileReader(f);
		Thread.sleep(1000*5*7);
		}catch(Exception e)
		{
		     System.out.println("Exception Occured");	
		}
		
		
	}
}
