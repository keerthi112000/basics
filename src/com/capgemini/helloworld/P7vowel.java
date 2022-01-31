package com.capgemini.helloworld;

import java.util.Scanner;

public class P7vowel {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter character: ");
	char letter=sc.next().charAt(0);
	
	switch(letter)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		System.out.println(letter+ "is vowel");
	default:
		System.out.println(letter+ "is constant");
	}
}
}
