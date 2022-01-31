package com.capgemini.helloworld;

import java.util.Scanner;

public class Largestofthreenum {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter no: ");
	int b=sc1.nextInt();
	Scanner sc2=new Scanner(System.in);
	System.out.println("Enter no: ");
	int c=sc2.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println("a is greatest");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is greatest");
	}
	else
	{
		System.out.println("c is greatest");
	}
}
}
