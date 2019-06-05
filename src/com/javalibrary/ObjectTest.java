package com.javalibrary;

public class ObjectTest {

	
	public static void main(String[] args) {
		
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		int a = obj1.hashCode();
		int b = obj2.hashCode();
		int c = obj3.hashCode();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
