package com.stockAccounting.Master;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotpage 
{
	public static WebDriver driver;
	public static String srcpath="D:\\Mahesh\\stockAccounting\\src\\com\\stockAccounting\\Screenshots";
public static void main(String[]args) throws IOException
{
	driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	
	ScreenShotpage sp=new ScreenShotpage();
	sp.takingScreenshot("google.bmp");
	
}
public static void function1()
{
	System.out.println("This is function1 code");
}
public void takingScreenshot(String name) throws IOException
{
	File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SrcFile, new File(srcpath+"\\"+name));
}
}
