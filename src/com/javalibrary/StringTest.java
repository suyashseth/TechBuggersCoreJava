package com.javalibrary;

public class StringTest {
	public static void main(String[] args) {

		String a = "Dinga";
		String c = "A";
		String b ="Dinga";

		String s2 = a.toString();
		System.out.println(s2);

		boolean res = 	a.equals(b);
		boolean res1 = a.equals(c);
		
		System.out.println(res1);
		System.out.println(res);

		int a1 = a.hashCode();
		int c1 = c.hashCode();

		System.out.println(a1);
		System.out.println(c1);



	}
}
