package com.singleton;

public class DemoTest {

	public static void main(String[] args) {
		
		
		Demo d = Demo.getObject();
		System.out.println(d);
		
		Demo d1 = Demo.getObject();
		System.out.println(d1);

		System.out.print(1);
		
		/*
		 * Object obj = new Object() o
		 */
		
		
		
	}
}
