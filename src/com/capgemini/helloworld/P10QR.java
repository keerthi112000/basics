package com.capgemini.helloworld;

import java.util.Scanner;

public class P10QR {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1: ");
	int num=sc.nextInt();
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter number 2: ");
	int numb=sc1.nextInt();
	
	
	int r=num%numb;
	int q=num/numb;
	System.out.println("Quotient ="+q);
	System.out.println("Remainder="+r);
}
}
