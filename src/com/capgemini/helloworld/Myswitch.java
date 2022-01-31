package com.capgemini.helloworld;

import java.util.Scanner;

public class Myswitch {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	
	switch(a%2)
	{
	case 0:
		System.out.println("Even number "+a);
		break;
	case 1:
		System.out.println("Odd number "+a);
		break;
	default:
		System.out.println("Neither even nor odd");
	}
}

}
