package com.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args)  {
		
		String path = "C:/Users/QSP/Desktop/FIleHandling/Demo.txt";
		File file = new File(path);
		
		byte[]ar = {1,2,3,4};
	    FileOutputStream fout = null;
	    try
	    {
	    	fout = new FileOutputStream(file);
	    	fout.write(ar);
	    	fout.close();
	    	System.out.println("File Written");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		
		
		
		
	}
}
