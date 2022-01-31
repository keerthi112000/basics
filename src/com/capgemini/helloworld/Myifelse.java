package com.capgemini.helloworld;

import java.util.Scanner;

public class Myifelse {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	
	if(a>=18)
	{
		System.out.println(" a is eligible to collage");
	}
	else
	{
		System.out.println(" a is eligible to school");
	}
}

}
