package com.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101,"Dinga",56000);
		String path = "C:/Users/QSP/Desktop/FIleHandling/emp.ser";
		
		File file = new File(path);
		
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		
		try
		{
			fout = new FileOutputStream(file);
			out = new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.close();
			fout.close();
			System.out.println("Object Written or serialized");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
