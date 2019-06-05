package com.encapsulation;

public class Bank {

	private int acc_num;
	private double balance;
	private final int PIN = 1234;
	
	public double getBalance(int pin)
	{
		if(pin==this.PIN)
		{
			return balance;
		}
		return 0;
	}
	public void setBalance(double bal)
	{
		this.balance = bal;
	}
	
	
}
