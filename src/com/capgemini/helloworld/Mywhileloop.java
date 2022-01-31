package com.capgemini.helloworld;

import java.util.Scanner;

public class Mywhileloop {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	
	int i=0;
	while(i<=a)
	{
		System.out.println(i);
		i++;
	}
}
}
