package com.capgemini.helloworld;

import java.util.Scanner;

public class P8Simpleintrest {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principal amt: ");
	int p=sc.nextInt();
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter no of years: ");
	int n=sc1.nextInt();
	
	Scanner sc2=new Scanner(System.in);
	System.out.println("Enter intrest rate: ");
	float r=sc2.nextFloat();
	
	float SI=(p*n*r)/100;
	System.out.println("SI is :"+SI);
}
}
