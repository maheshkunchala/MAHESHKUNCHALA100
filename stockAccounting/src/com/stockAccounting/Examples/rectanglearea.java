package com.stockAccounting.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rectanglearea {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int l,w;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of Rectangle");
		l=Integer.parseInt(br.readLine());
		System.out.println("Enter the width of Rectangle");
		w=Integer.parseInt(br.readLine());
		int area=2*l*w;
		System.out.println("Area of the Rectangle is" +area);
		


	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  