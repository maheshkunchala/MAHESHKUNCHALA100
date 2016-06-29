package com.stockAccounting.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parimeterofcircle 
{
public static void main(String[]args) throws NumberFormatException, IOException
{
	int radius=0;
	System.out.println("Enter the radius of circle");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	radius=Integer.parseInt(br.readLine());
	double parimeter=2*Math.PI*radius;
	System.out.println("parimeter of circle is"+parimeter);
	
}
}
