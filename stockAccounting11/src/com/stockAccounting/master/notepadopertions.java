package com.stockAccounting.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class notepadopertions
{
public static void main(String[] args) throws IOException
	{
		stockmaster1 sm=new stockmaster1();
		String x="";
		String path="D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\testdata\\UOM.txt";
		String Rpath="D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\results\\uom.txt";
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		FileWriter fw=new FileWriter(Rpath);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Uid&Desc&Result");
		bw.newLine();
		sm.stockAcc_Launch(sm.url);
		sm.stockAcc_Login(sm.uname, sm.pwd);
		while ((x=br.readLine())!=null)
		{
			System.out.println(x);
			String[] split=x.split("&");
			String U=split[0];
			String D=split[1];
			System.out.println(U+"--"+D);
			String res=sm.stockAcc_UnitofMcreation(U, D);
			bw.write(x+"&"+res);
			bw.newLine();
		}
		bw.close();
		br.close();
		sm.stockAcc_Logout();
		sm.stockAcc_Close();
	}

}


