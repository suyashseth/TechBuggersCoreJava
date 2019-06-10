package com.exception;

public class Bank {

	private int pin = 1234;
	private double balance;
	
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance(int pin) throws PINException
	{
		if(this.pin==pin)
		{
			return balance;
		}
		else
		{
			PINException p = new PINException();
			throw p;
		}
	}
	
	
	
	
}
