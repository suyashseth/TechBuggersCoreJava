package com.exception;

public class TestBank {

	public static void main(String[] args) {

		Bank b = new Bank();
		b.setBalance(10000);
		try
		{
			double bal = b.getBalance(23456);
			System.out.println(bal);
		}catch(PINException p)
		{
			System.out.println("PIN is Incorrect");
			p.printStackTrace();
		}
	}
}
