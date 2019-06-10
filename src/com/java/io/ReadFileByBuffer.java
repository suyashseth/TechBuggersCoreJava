package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileByBuffer {

	public static void main(String[] args) {

		String path = "C:/Users/QSP/Desktop/FIleHandling/Demo.txt";

		File file = new File(path);
		FileReader reader = null;
		BufferedReader buffer = null;
		try
		{
			reader = new FileReader(file);
			buffer = new BufferedReader(reader);
			/*
			 * int i = buffer.read(); while(i!=-1) { System.out.print((char)i); i =
			 * buffer.read(); }
			 */
			String s = 	buffer.readLine();
			System.out.println(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}



	}
}
