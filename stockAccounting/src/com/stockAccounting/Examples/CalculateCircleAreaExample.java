package com.stockAccounting.Examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleAreaExample
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		  int radius = 0;
		  System.out.println("Please enter radius of a circle");
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  radius = Integer.parseInt(br.readLine());
		  double area = Math.PI * radius * radius;
		  System.out.println("Area of a circle is " + area);
		        }
}


