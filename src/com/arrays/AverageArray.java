package com.arrays;

import java.util.Scanner;

public class AverageArray {

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
		
		//Logic to calculate Average
		
		double sum = 0;
		for(int i=0;i<size;i++)
		{
			sum = sum+ar[i];
		}
		
		double avg = sum/size;
		
		System.out.println("Average of given Array is = "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
