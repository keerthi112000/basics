package com.capgemini.helloworld;

import java.util.Scanner;
public class Mynestedif {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no 1: ");
	int a=sc.nextInt();
	
	if(a>=0 && a<10) {
		System.out.println("a is under 10");
	}
	else if(a>=10 && a<20)
	{
		System.out.println("a is under 20");
	}
	else if(a>=20 && a<30)
	{
		System.out.println("a is under 30");
	}
	else if(a>=30 && a<40)
	{
		System.out.println("a is under 40");
	}
	else
	{
		System.out.println(" a is above 40");
	}
	
	
}
}
