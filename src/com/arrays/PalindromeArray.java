package com.arrays;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();

		int ar [];
		ar = new int [size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter value at "+i+" position");
			ar[i] = sc.nextInt();
		}
		System.out.println("Array Initialized");
	
		//Logic to check Array Palindrome
		
		int count = 0;
		int last = size-1;
		for(int i=0;i<size/2;i++)
		{
			if(ar[i]==ar[last])
			{
				count++;
				last--;
			}
		}
		
		if(count ==size/2)
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
