package com.java.io;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {

		String path = "C:/Users/QSP/Desktop/FIleHandling/Demo.txt";
		File file = new File(path);

		FileReader reader = null;

		try
		{
			reader = new FileReader(file);
			int i = reader.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i = reader.read();
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}









	}
}
