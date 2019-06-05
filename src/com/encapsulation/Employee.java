package com.encapsulation;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	//Seter Method
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	//Geters method
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public double getSalary()
	{
		return salary;
	}
	
	public void printDetails()
	{
		System.out.println("id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
