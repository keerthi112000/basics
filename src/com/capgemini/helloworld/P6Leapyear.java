package com.capgemini.helloworld;

import java.util.Scanner;

public class P6Leapyear {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	
	if(a%4==0 && a%400==0)
	{
		System.out.println("Leap year:"+a);
	}
	else
	{
		System.out.println("Not leap year:"+a);
	}
}
}
