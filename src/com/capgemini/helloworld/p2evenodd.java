package com.capgemini.helloworld;

import java.util.Scanner;

public class p2evenodd {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	
	if(a%2==0)
	{
		System.out.println("a is even"+a);
	}
	else
	{
		System.out.println("a is odd "+a);
	}
}
}
