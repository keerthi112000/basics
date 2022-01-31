package com.capgemini.helloworld;

import java.util.Scanner;

public class P11avrage {
public static void main(String args[])
{
	Scanner sc0=new Scanner(System.in);
	System.out.println("Enter number of inputs: ");
	int inputs=sc0.nextInt();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1: ");
	int num1=sc.nextInt();
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter number 2: ");
	int num2=sc1.nextInt();
	Scanner sc2=new Scanner(System.in);
	System.out.println("Enter number 3: ");
	int num3=sc2.nextInt();
	
	int total=num1+num2+num3;
	float avg=total/inputs;
	System.out.println("Total is "+total);
	System.out.println("Avg is "+avg);
	
}
}
