package com.capgemini.helloworld;

import java.util.Scanner;

public class P13odd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of inputs: ");
		int n=sc.nextInt();
		
		int i=0;
		while(i<n)
		{
			if(i%2!=0)
			{
				System.out.println("Odd num is "+i);
			}
			i++;

		}
	}
}
