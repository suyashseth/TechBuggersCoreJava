package com.arrays;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int ar [];
		
		ar = new int [size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value at "+i+"th position");
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Array Initialized");
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Value at "+i+"th position"+ar[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
