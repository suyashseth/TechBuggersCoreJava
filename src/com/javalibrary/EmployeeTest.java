package com.javalibrary;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101,"Dingi",45000);
		int id = emp.hashCode();
		System.out.println(id);
		/*
		 * String s1 = emp.toString(); System.out.println(s1);
		 */
		
		System.out.println(emp);
		
	}
}
