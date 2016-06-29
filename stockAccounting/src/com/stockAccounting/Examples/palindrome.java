package com.stockAccounting.Examples;

import java.util.Scanner;

public class palindrome 
{
@SuppressWarnings("resource")
public static void main(String[]args)
{
	String p="";
	Scanner sr=new Scanner(System.in);
	System.out.println("Enter the Value");
	String s=sr.next();
	System.out.println(s);
	int count=s.length();
	System.out.println(count);
	s.charAt(2);
	for(int i=count-1;i>=0;i--)
	{
		char reverse=s.charAt(i);
		p=p+reverse;
		
		
	}
	System.out.println(p);
	if(s.equals(p))
		
	{
		System.out.println("given number is a palindrome");
	}
	else
	{
		System.out.println("given number is not a palindrome");
	}
}
}
