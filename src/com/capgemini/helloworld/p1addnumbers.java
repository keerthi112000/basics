package com.capgemini.helloworld;

import java.util.Scanner;

public class p1addnumbers {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no: ");
	int a=sc.nextInt();
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter no: ");
	int b=sc1.nextInt();
	int c=a+b;
	System.out.println("sum is : "+c);
}
}
