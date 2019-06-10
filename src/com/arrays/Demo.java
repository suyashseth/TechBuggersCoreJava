package com.arrays;

public class Demo {
	public static void main(String[] args) {
		//Declaration of Array
		int [] ar;

		//Creation of Array
		ar = new int[5];

		//Initialization of Array
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;

		//Utilization of Array
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{
				System.out.println(ar[i]);
			}
		}














	}
}
