package com.capgemini.helloworld;

import java.util.Scanner;

public class P9Compoundintrest {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principal amt: ");
	float p=sc.nextFloat();
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter no of years: ");
	float ny=sc1.nextFloat();
	
	Scanner sc2=new Scanner(System.in);
	System.out.println("Enter intrest rate: ");
	float r=sc2.nextFloat();
	
	Scanner sc3=new Scanner(System.in);
	System.out.println("Enter num: ");
	float n=sc3.nextFloat();
	
	double CI=p*Math.pow(1+(r/n),n*ny);
	System.out.println(CI);
}
}
