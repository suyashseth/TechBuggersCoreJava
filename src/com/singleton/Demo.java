package com.singleton;

public class Demo {

	static Demo d;
	private Demo()
	{
		System.out.println("Object Created");
	}
	
	public static Demo getObject()
	{
		if(d==null)
		{
		     d = new Demo();
		     return d;
		}
		return d;

	}
	
	
	
	
	
	
	
	
}
