package com.encapsulation;

public class BankTest {

	public static void main(String[] args) {

		Bank b  = new Bank();
		b.setBalance(50000);
		double bal = b.getBalance(124);
		if(bal>0)
		{
			System.out.println(bal);
		}
		else
		{
			System.out.println("Pin is Incorrect");
		}


	}
}
